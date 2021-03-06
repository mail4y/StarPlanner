package com.pekalicious.starplanner.actions.terran;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.bwapi.bridge.model.Game;
import org.bwapi.bridge.model.UnitType;

import com.pekalicious.agent.Agent;
import com.pekalicious.agent.WorldState;
import com.pekalicious.agent.WorldStateValue;
import com.pekalicious.starplanner.StarBlackboard;
import com.pekalicious.starplanner.StarPlanner;
import com.pekalicious.starplanner.WSKey;
import com.pekalicious.starplanner.actions.StarAction;
import com.pekalicious.starplanner.managers.BuildOrder;
import com.pekalicious.starplanner.managers.OrderStatus;
import com.pekalicious.starplanner.util.UnitUtils;

public class ActionBuildBarrackAggressive extends StarAction implements Serializable {
	private static final long serialVersionUID = -5642592102727574486L;

	private List<BuildOrder> orders;
	
	@Override
	public void setupConditions() {
		this.preconditions = new WorldState();
		
		this.effects = new WorldState();
		this.effects.setProperty(WSKey.T_BARRACKS, new WorldStateValue<Boolean>(true));

		this.cost = 0.5f;
		this.precedence = 1;
	}

	@Override
	public void activateAction(Agent aiManager, WorldState state) {
		int count = Game.getInstance().self().completedUnitCount(UnitType.TERRAN_BARRACKS);
		if (count < 3) {
			StarBlackboard bb = (StarBlackboard)((StarPlanner)aiManager).getBlackBoard();
			for ( int i = 0; i < 3 - count; i++){
				orders.add(bb.addToBuildQueue(UnitUtils.Type.TERRAN_BARRACKS));
			}
		}else{
			orders = new ArrayList<BuildOrder>();
			orders.add(new BuildOrder());
			orders.get(0).status = OrderStatus.Ended;
		}
	}

	int count;
	@Override
	public boolean isActionComplete(Agent aiManager) {
		for (BuildOrder order : orders)
			if (order.status != OrderStatus.Ended) 
				return false;
		
		return true;
	}
	
	@Override
	public boolean validateAction(Agent ai) {
		return true;
	}

	@Override
	public boolean validateContextPreconditions(Agent aiManager, WorldState currentState, WorldState goalState, boolean planning) {

		if (planning) {
			int count = Game.getInstance().self().completedUnitCount(UnitType.TERRAN_BARRACKS);
			if (count == 0) return false;
			if (count < 3) return true;
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		return "BuildBarrackAggressive";
	}

	@Override
	public boolean interrupt() {
		return true;
	}

	@Override
	public boolean canBeDisabled() {
		return true;
	}

}
