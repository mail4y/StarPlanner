/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class SWIG_Unit implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public SWIG_Unit(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SWIG_Unit obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public long getCPtr() {
    return swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        bridgeJNI.delete_SWIG_Unit(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIG_Player getPlayer() {
    long cPtr = bridgeJNI.SWIG_Unit_getPlayer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_Player(cPtr, false);
  }

  public SWIG_UnitType getType() {
    return new SWIG_UnitType(bridgeJNI.SWIG_Unit_getType(swigCPtr, this), true);
  }

  public SWIG_UnitType getInitialType() {
    return new SWIG_UnitType(bridgeJNI.SWIG_Unit_getInitialType(swigCPtr, this), true);
  }

  public int getHitPoints() {
    return bridgeJNI.SWIG_Unit_getHitPoints(swigCPtr, this);
  }

  public int getInitialHitPoints() {
    return bridgeJNI.SWIG_Unit_getInitialHitPoints(swigCPtr, this);
  }

  public int getShields() {
    return bridgeJNI.SWIG_Unit_getShields(swigCPtr, this);
  }

  public int getEnergy() {
    return bridgeJNI.SWIG_Unit_getEnergy(swigCPtr, this);
  }

  public int getResources() {
    return bridgeJNI.SWIG_Unit_getResources(swigCPtr, this);
  }

  public int getInitialResources() {
    return bridgeJNI.SWIG_Unit_getInitialResources(swigCPtr, this);
  }

  public int getKillCount() {
    return bridgeJNI.SWIG_Unit_getKillCount(swigCPtr, this);
  }

  public int getGroundWeaponCooldown() {
    return bridgeJNI.SWIG_Unit_getGroundWeaponCooldown(swigCPtr, this);
  }

  public int getAirWeaponCooldown() {
    return bridgeJNI.SWIG_Unit_getAirWeaponCooldown(swigCPtr, this);
  }

  public int getSpellCooldown() {
    return bridgeJNI.SWIG_Unit_getSpellCooldown(swigCPtr, this);
  }

  public int getDefenseMatrixPoints() {
    return bridgeJNI.SWIG_Unit_getDefenseMatrixPoints(swigCPtr, this);
  }

  public int getDefenseMatrixTimer() {
    return bridgeJNI.SWIG_Unit_getDefenseMatrixTimer(swigCPtr, this);
  }

  public int getEnsnareTimer() {
    return bridgeJNI.SWIG_Unit_getEnsnareTimer(swigCPtr, this);
  }

  public int getIrradiateTimer() {
    return bridgeJNI.SWIG_Unit_getIrradiateTimer(swigCPtr, this);
  }

  public int getLockdownTimer() {
    return bridgeJNI.SWIG_Unit_getLockdownTimer(swigCPtr, this);
  }

  public int getMaelstromTimer() {
    return bridgeJNI.SWIG_Unit_getMaelstromTimer(swigCPtr, this);
  }

  public int getPlagueTimer() {
    return bridgeJNI.SWIG_Unit_getPlagueTimer(swigCPtr, this);
  }

  public int getRemoveTimer() {
    return bridgeJNI.SWIG_Unit_getRemoveTimer(swigCPtr, this);
  }

  public int getStasisTimer() {
    return bridgeJNI.SWIG_Unit_getStasisTimer(swigCPtr, this);
  }

  public int getStimTimer() {
    return bridgeJNI.SWIG_Unit_getStimTimer(swigCPtr, this);
  }

  public SWIG_Position getPosition() {
    return new SWIG_Position(bridgeJNI.SWIG_Unit_getPosition(swigCPtr, this), true);
  }

  public SWIG_Position getInitialPosition() {
    return new SWIG_Position(bridgeJNI.SWIG_Unit_getInitialPosition(swigCPtr, this), true);
  }

  public SWIG_TilePosition getTilePosition() {
    return new SWIG_TilePosition(bridgeJNI.SWIG_Unit_getTilePosition(swigCPtr, this), true);
  }

  public SWIG_TilePosition getInitialTilePosition() {
    return new SWIG_TilePosition(bridgeJNI.SWIG_Unit_getInitialTilePosition(swigCPtr, this), true);
  }

  public double getDistance(SWIG_Unit target) {
    return bridgeJNI.SWIG_Unit_getDistance__SWIG_0(swigCPtr, this, SWIG_Unit.getCPtr(target), target);
  }

  public double getDistance(SWIG_Position target) {
    return bridgeJNI.SWIG_Unit_getDistance__SWIG_1(swigCPtr, this, SWIG_Position.getCPtr(target), target);
  }

  public double getAngle() {
    return bridgeJNI.SWIG_Unit_getAngle(swigCPtr, this);
  }

  public double getVelocityX() {
    return bridgeJNI.SWIG_Unit_getVelocityX(swigCPtr, this);
  }

  public double getVelocityY() {
    return bridgeJNI.SWIG_Unit_getVelocityY(swigCPtr, this);
  }

  public SWIG_Unit getTarget() {
    long cPtr = bridgeJNI.SWIG_Unit_getTarget(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_Unit(cPtr, false);
  }

  public SWIG_Position getTargetPosition() {
    return new SWIG_Position(bridgeJNI.SWIG_Unit_getTargetPosition(swigCPtr, this), true);
  }

  public SWIG_Order getOrder() {
    return new SWIG_Order(bridgeJNI.SWIG_Unit_getOrder(swigCPtr, this), true);
  }

  public SWIG_Unit getOrderTarget() {
    long cPtr = bridgeJNI.SWIG_Unit_getOrderTarget(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_Unit(cPtr, false);
  }

  public int getOrderTimer() {
    return bridgeJNI.SWIG_Unit_getOrderTimer(swigCPtr, this);
  }

  public SWIG_Order getSecondaryOrder() {
    return new SWIG_Order(bridgeJNI.SWIG_Unit_getSecondaryOrder(swigCPtr, this), true);
  }

  public SWIG_Unit getBuildUnit() {
    long cPtr = bridgeJNI.SWIG_Unit_getBuildUnit(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_Unit(cPtr, false);
  }

  public int getRemainingBuildTime() {
    return bridgeJNI.SWIG_Unit_getRemainingBuildTime(swigCPtr, this);
  }

  public int getRemainingTrainTime() {
    return bridgeJNI.SWIG_Unit_getRemainingTrainTime(swigCPtr, this);
  }

  public SWIG_Unit getChild() {
    long cPtr = bridgeJNI.SWIG_Unit_getChild(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_Unit(cPtr, false);
  }

  public SWIGTYPE_p_std__listT_BWAPI__UnitType_t getTrainingQueue() {
    return new SWIGTYPE_p_std__listT_BWAPI__UnitType_t(bridgeJNI.SWIG_Unit_getTrainingQueue(swigCPtr, this), true);
  }

  public SWIG_Unit getTransport() {
    long cPtr = bridgeJNI.SWIG_Unit_getTransport(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_Unit(cPtr, false);
  }

  public SWIGTYPE_p_std__listT_BWAPI__Unit_p_t getLoadedUnits() {
    return new SWIGTYPE_p_std__listT_BWAPI__Unit_p_t(bridgeJNI.SWIG_Unit_getLoadedUnits(swigCPtr, this), true);
  }

  public int getInterceptorCount() {
    return bridgeJNI.SWIG_Unit_getInterceptorCount(swigCPtr, this);
  }

  public int getScarabCount() {
    return bridgeJNI.SWIG_Unit_getScarabCount(swigCPtr, this);
  }

  public int getSpiderMineCount() {
    return bridgeJNI.SWIG_Unit_getSpiderMineCount(swigCPtr, this);
  }

  public SWIG_TechType getTech() {
    return new SWIG_TechType(bridgeJNI.SWIG_Unit_getTech(swigCPtr, this), true);
  }

  public SWIGTYPE_p_UpgradeType getUpgrade() {
    return new SWIGTYPE_p_UpgradeType(bridgeJNI.SWIG_Unit_getUpgrade(swigCPtr, this), true);
  }

  public int getRemainingResearchTime() {
    return bridgeJNI.SWIG_Unit_getRemainingResearchTime(swigCPtr, this);
  }

  public int getRemainingUpgradeTime() {
    return bridgeJNI.SWIG_Unit_getRemainingUpgradeTime(swigCPtr, this);
  }

  public SWIG_Position getRallyPosition() {
    return new SWIG_Position(bridgeJNI.SWIG_Unit_getRallyPosition(swigCPtr, this), true);
  }

  public SWIG_Unit getRallyUnit() {
    long cPtr = bridgeJNI.SWIG_Unit_getRallyUnit(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_Unit(cPtr, false);
  }

  public SWIG_Unit getAddon() {
    long cPtr = bridgeJNI.SWIG_Unit_getAddon(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_Unit(cPtr, false);
  }

  public int getUpgradeLevel(SWIGTYPE_p_UpgradeType upgrade) {
    return bridgeJNI.SWIG_Unit_getUpgradeLevel(swigCPtr, this, SWIGTYPE_p_UpgradeType.getCPtr(upgrade));
  }

  public boolean exists() {
    return bridgeJNI.SWIG_Unit_exists(swigCPtr, this);
  }

  public boolean isAccelerating() {
    return bridgeJNI.SWIG_Unit_isAccelerating(swigCPtr, this);
  }

  public boolean isBeingConstructed() {
    return bridgeJNI.SWIG_Unit_isBeingConstructed(swigCPtr, this);
  }

  public boolean isBeingHealed() {
    return bridgeJNI.SWIG_Unit_isBeingHealed(swigCPtr, this);
  }

  public boolean isBlind() {
    return bridgeJNI.SWIG_Unit_isBlind(swigCPtr, this);
  }

  public boolean isBraking() {
    return bridgeJNI.SWIG_Unit_isBraking(swigCPtr, this);
  }

  public boolean isBurrowed() {
    return bridgeJNI.SWIG_Unit_isBurrowed(swigCPtr, this);
  }

  public boolean isCarryingGas() {
    return bridgeJNI.SWIG_Unit_isCarryingGas(swigCPtr, this);
  }

  public boolean isCarryingMinerals() {
    return bridgeJNI.SWIG_Unit_isCarryingMinerals(swigCPtr, this);
  }

  public boolean isCloaked() {
    return bridgeJNI.SWIG_Unit_isCloaked(swigCPtr, this);
  }

  public boolean isCompleted() {
    return bridgeJNI.SWIG_Unit_isCompleted(swigCPtr, this);
  }

  public boolean isConstructing() {
    return bridgeJNI.SWIG_Unit_isConstructing(swigCPtr, this);
  }

  public boolean isDefenseMatrixed() {
    return bridgeJNI.SWIG_Unit_isDefenseMatrixed(swigCPtr, this);
  }

  public boolean isEnsnared() {
    return bridgeJNI.SWIG_Unit_isEnsnared(swigCPtr, this);
  }

  public boolean isFollowing() {
    return bridgeJNI.SWIG_Unit_isFollowing(swigCPtr, this);
  }

  public boolean isGatheringGas() {
    return bridgeJNI.SWIG_Unit_isGatheringGas(swigCPtr, this);
  }

  public boolean isGatheringMinerals() {
    return bridgeJNI.SWIG_Unit_isGatheringMinerals(swigCPtr, this);
  }

  public boolean isHallucination() {
    return bridgeJNI.SWIG_Unit_isHallucination(swigCPtr, this);
  }

  public boolean isIdle() {
    return bridgeJNI.SWIG_Unit_isIdle(swigCPtr, this);
  }

  public boolean isIrradiated() {
    return bridgeJNI.SWIG_Unit_isIrradiated(swigCPtr, this);
  }

  public boolean isLifted() {
    return bridgeJNI.SWIG_Unit_isLifted(swigCPtr, this);
  }

  public boolean isLoaded() {
    return bridgeJNI.SWIG_Unit_isLoaded(swigCPtr, this);
  }

  public boolean isLockedDown() {
    return bridgeJNI.SWIG_Unit_isLockedDown(swigCPtr, this);
  }

  public boolean isMaelstrommed() {
    return bridgeJNI.SWIG_Unit_isMaelstrommed(swigCPtr, this);
  }

  public boolean isMorphing() {
    return bridgeJNI.SWIG_Unit_isMorphing(swigCPtr, this);
  }

  public boolean isMoving() {
    return bridgeJNI.SWIG_Unit_isMoving(swigCPtr, this);
  }

  public boolean isParasited() {
    return bridgeJNI.SWIG_Unit_isParasited(swigCPtr, this);
  }

  public boolean isPatrolling() {
    return bridgeJNI.SWIG_Unit_isPatrolling(swigCPtr, this);
  }

  public boolean isPlagued() {
    return bridgeJNI.SWIG_Unit_isPlagued(swigCPtr, this);
  }

  public boolean isRepairing() {
    return bridgeJNI.SWIG_Unit_isRepairing(swigCPtr, this);
  }

  public boolean isResearching() {
    return bridgeJNI.SWIG_Unit_isResearching(swigCPtr, this);
  }

  public boolean isSelected() {
    return bridgeJNI.SWIG_Unit_isSelected(swigCPtr, this);
  }

  public boolean isSieged() {
    return bridgeJNI.SWIG_Unit_isSieged(swigCPtr, this);
  }

  public boolean isStartingAttack() {
    return bridgeJNI.SWIG_Unit_isStartingAttack(swigCPtr, this);
  }

  public boolean isStasised() {
    return bridgeJNI.SWIG_Unit_isStasised(swigCPtr, this);
  }

  public boolean isStimmed() {
    return bridgeJNI.SWIG_Unit_isStimmed(swigCPtr, this);
  }

  public boolean isTraining() {
    return bridgeJNI.SWIG_Unit_isTraining(swigCPtr, this);
  }

  public boolean isUnderStorm() {
    return bridgeJNI.SWIG_Unit_isUnderStorm(swigCPtr, this);
  }

  public boolean isUnpowered() {
    return bridgeJNI.SWIG_Unit_isUnpowered(swigCPtr, this);
  }

  public boolean isUpgrading() {
    return bridgeJNI.SWIG_Unit_isUpgrading(swigCPtr, this);
  }

  public boolean isVisible() {
    return bridgeJNI.SWIG_Unit_isVisible(swigCPtr, this);
  }

  public boolean isBeingGathered() {
    return bridgeJNI.SWIG_Unit_isBeingGathered(swigCPtr, this);
  }

  public boolean attackMove(SWIG_Position position) {
    return bridgeJNI.SWIG_Unit_attackMove(swigCPtr, this, SWIG_Position.getCPtr(position), position);
  }

  public boolean attackUnit(SWIG_Unit target) {
    return bridgeJNI.SWIG_Unit_attackUnit(swigCPtr, this, SWIG_Unit.getCPtr(target), target);
  }

  public boolean rightClick(SWIG_Position position) {
    return bridgeJNI.SWIG_Unit_rightClick__SWIG_0(swigCPtr, this, SWIG_Position.getCPtr(position), position);
  }

  public boolean rightClick(SWIG_Unit target) {
    return bridgeJNI.SWIG_Unit_rightClick__SWIG_1(swigCPtr, this, SWIG_Unit.getCPtr(target), target);
  }

  public boolean train(SWIG_UnitType type) {
    return bridgeJNI.SWIG_Unit_train(swigCPtr, this, SWIG_UnitType.getCPtr(type), type);
  }

  public boolean build(SWIG_TilePosition position, SWIG_UnitType type) {
    return bridgeJNI.SWIG_Unit_build(swigCPtr, this, SWIG_TilePosition.getCPtr(position), position, SWIG_UnitType.getCPtr(type), type);
  }

  public boolean buildAddon(SWIG_UnitType type) {
    return bridgeJNI.SWIG_Unit_buildAddon(swigCPtr, this, SWIG_UnitType.getCPtr(type), type);
  }

  public boolean research(SWIG_TechType tech) {
    return bridgeJNI.SWIG_Unit_research(swigCPtr, this, SWIG_TechType.getCPtr(tech), tech);
  }

  public boolean upgrade(SWIGTYPE_p_UpgradeType upgrade) {
    return bridgeJNI.SWIG_Unit_upgrade(swigCPtr, this, SWIGTYPE_p_UpgradeType.getCPtr(upgrade));
  }

  public boolean stop() {
    return bridgeJNI.SWIG_Unit_stop(swigCPtr, this);
  }

  public boolean holdPosition() {
    return bridgeJNI.SWIG_Unit_holdPosition(swigCPtr, this);
  }

  public boolean patrol(SWIG_Position position) {
    return bridgeJNI.SWIG_Unit_patrol(swigCPtr, this, SWIG_Position.getCPtr(position), position);
  }

  public boolean follow(SWIG_Unit target) {
    return bridgeJNI.SWIG_Unit_follow(swigCPtr, this, SWIG_Unit.getCPtr(target), target);
  }

  public boolean setRallyPosition(SWIG_Position target) {
    return bridgeJNI.SWIG_Unit_setRallyPosition(swigCPtr, this, SWIG_Position.getCPtr(target), target);
  }

  public boolean setRallyUnit(SWIG_Unit target) {
    return bridgeJNI.SWIG_Unit_setRallyUnit(swigCPtr, this, SWIG_Unit.getCPtr(target), target);
  }

  public boolean repair(SWIG_Unit target) {
    return bridgeJNI.SWIG_Unit_repair(swigCPtr, this, SWIG_Unit.getCPtr(target), target);
  }

  public boolean morph(SWIG_UnitType type) {
    return bridgeJNI.SWIG_Unit_morph(swigCPtr, this, SWIG_UnitType.getCPtr(type), type);
  }

  public boolean burrow() {
    return bridgeJNI.SWIG_Unit_burrow(swigCPtr, this);
  }

  public boolean unburrow() {
    return bridgeJNI.SWIG_Unit_unburrow(swigCPtr, this);
  }

  public boolean siege() {
    return bridgeJNI.SWIG_Unit_siege(swigCPtr, this);
  }

  public boolean unsiege() {
    return bridgeJNI.SWIG_Unit_unsiege(swigCPtr, this);
  }

  public boolean cloak() {
    return bridgeJNI.SWIG_Unit_cloak(swigCPtr, this);
  }

  public boolean decloak() {
    return bridgeJNI.SWIG_Unit_decloak(swigCPtr, this);
  }

  public boolean lift() {
    return bridgeJNI.SWIG_Unit_lift(swigCPtr, this);
  }

  public boolean land(SWIG_TilePosition position) {
    return bridgeJNI.SWIG_Unit_land(swigCPtr, this, SWIG_TilePosition.getCPtr(position), position);
  }

  public boolean load(SWIG_Unit target) {
    return bridgeJNI.SWIG_Unit_load(swigCPtr, this, SWIG_Unit.getCPtr(target), target);
  }

  public boolean unload(SWIG_Unit target) {
    return bridgeJNI.SWIG_Unit_unload(swigCPtr, this, SWIG_Unit.getCPtr(target), target);
  }

  public boolean unloadAll() {
    return bridgeJNI.SWIG_Unit_unloadAll__SWIG_0(swigCPtr, this);
  }

  public boolean unloadAll(SWIG_Position position) {
    return bridgeJNI.SWIG_Unit_unloadAll__SWIG_1(swigCPtr, this, SWIG_Position.getCPtr(position), position);
  }

  public boolean cancelConstruction() {
    return bridgeJNI.SWIG_Unit_cancelConstruction(swigCPtr, this);
  }

  public boolean haltConstruction() {
    return bridgeJNI.SWIG_Unit_haltConstruction(swigCPtr, this);
  }

  public boolean cancelMorph() {
    return bridgeJNI.SWIG_Unit_cancelMorph(swigCPtr, this);
  }

  public boolean cancelTrain() {
    return bridgeJNI.SWIG_Unit_cancelTrain__SWIG_0(swigCPtr, this);
  }

  public boolean cancelTrain(int slot) {
    return bridgeJNI.SWIG_Unit_cancelTrain__SWIG_1(swigCPtr, this, slot);
  }

  public boolean cancelAddon() {
    return bridgeJNI.SWIG_Unit_cancelAddon(swigCPtr, this);
  }

  public boolean cancelResearch() {
    return bridgeJNI.SWIG_Unit_cancelResearch(swigCPtr, this);
  }

  public boolean cancelUpgrade() {
    return bridgeJNI.SWIG_Unit_cancelUpgrade(swigCPtr, this);
  }

  public boolean useTech(SWIG_TechType tech) {
    return bridgeJNI.SWIG_Unit_useTech__SWIG_0(swigCPtr, this, SWIG_TechType.getCPtr(tech), tech);
  }

  public boolean useTech(SWIG_TechType tech, SWIG_Position position) {
    return bridgeJNI.SWIG_Unit_useTech__SWIG_1(swigCPtr, this, SWIG_TechType.getCPtr(tech), tech, SWIG_Position.getCPtr(position), position);
  }

  public boolean useTech(SWIG_TechType tech, SWIG_Unit target) {
    return bridgeJNI.SWIG_Unit_useTech__SWIG_2(swigCPtr, this, SWIG_TechType.getCPtr(tech), tech, SWIG_Unit.getCPtr(target), target);
  }

}
