/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class SWIG_UnitType implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public SWIG_UnitType(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SWIG_UnitType obj) {
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
        bridgeJNI.delete_SWIG_UnitType(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIG_UnitType() {
    this(bridgeJNI.new_SWIG_UnitType__SWIG_0(), true);
  }

  public SWIG_UnitType(int id) {
    this(bridgeJNI.new_SWIG_UnitType__SWIG_1(id), true);
  }

  public SWIG_UnitType(SWIG_UnitType other) {
    this(bridgeJNI.new_SWIG_UnitType__SWIG_2(SWIG_UnitType.getCPtr(other), other), true);
  }

  public SWIG_UnitType opAssign(SWIG_UnitType other) {
    return new SWIG_UnitType(bridgeJNI.SWIG_UnitType_opAssign(swigCPtr, this, SWIG_UnitType.getCPtr(other), other), false);
  }

  public boolean opEquals(SWIG_UnitType other) {
    return bridgeJNI.SWIG_UnitType_opEquals(swigCPtr, this, SWIG_UnitType.getCPtr(other), other);
  }

  public boolean opNotEquals(SWIG_UnitType other) {
    return bridgeJNI.SWIG_UnitType_opNotEquals(swigCPtr, this, SWIG_UnitType.getCPtr(other), other);
  }

  public boolean opLessThan(SWIG_UnitType other) {
    return bridgeJNI.SWIG_UnitType_opLessThan(swigCPtr, this, SWIG_UnitType.getCPtr(other), other);
  }

  public int getID() {
    return bridgeJNI.SWIG_UnitType_getID(swigCPtr, this);
  }

  public String getName() {
    return bridgeJNI.SWIG_UnitType_getName(swigCPtr, this);
  }

  public String getSubLabel() {
    return bridgeJNI.SWIG_UnitType_getSubLabel(swigCPtr, this);
  }

  public SWIG_Race getRace() {
    return new SWIG_Race(bridgeJNI.SWIG_UnitType_getRace(swigCPtr, this), true);
  }

  public UnitTypeWhatBuildsPair whatBuilds() {
    return new UnitTypeWhatBuildsPair(bridgeJNI.SWIG_UnitType_whatBuilds(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__mapT_BWAPI__UnitType_const_p_int_t requiredUnits() {
    return new SWIGTYPE_p_std__mapT_BWAPI__UnitType_const_p_int_t(bridgeJNI.SWIG_UnitType_requiredUnits(swigCPtr, this), false);
  }

  public SWIG_TechType requiredTech() {
    long cPtr = bridgeJNI.SWIG_UnitType_requiredTech(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_TechType(cPtr, false);
  }

  public SWIGTYPE_p_std__setT_BWAPI__TechType_const_p_t abilities() {
    return new SWIGTYPE_p_std__setT_BWAPI__TechType_const_p_t(bridgeJNI.SWIG_UnitType_abilities(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__setT_BWAPI__UpgradeType_const_p_t upgrades() {
    return new SWIGTYPE_p_std__setT_BWAPI__UpgradeType_const_p_t(bridgeJNI.SWIG_UnitType_upgrades(swigCPtr, this), false);
  }

  public SWIG_UpgradeType armorUpgrade() {
    long cPtr = bridgeJNI.SWIG_UnitType_armorUpgrade(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_UpgradeType(cPtr, false);
  }

  public int maxHitPoints() {
    return bridgeJNI.SWIG_UnitType_maxHitPoints(swigCPtr, this);
  }

  public int maxShields() {
    return bridgeJNI.SWIG_UnitType_maxShields(swigCPtr, this);
  }

  public int maxEnergy() {
    return bridgeJNI.SWIG_UnitType_maxEnergy(swigCPtr, this);
  }

  public int armor() {
    return bridgeJNI.SWIG_UnitType_armor(swigCPtr, this);
  }

  public int mineralPrice() {
    return bridgeJNI.SWIG_UnitType_mineralPrice(swigCPtr, this);
  }

  public int gasPrice() {
    return bridgeJNI.SWIG_UnitType_gasPrice(swigCPtr, this);
  }

  public int buildTime() {
    return bridgeJNI.SWIG_UnitType_buildTime(swigCPtr, this);
  }

  public int supplyRequired() {
    return bridgeJNI.SWIG_UnitType_supplyRequired(swigCPtr, this);
  }

  public int supplyProvided() {
    return bridgeJNI.SWIG_UnitType_supplyProvided(swigCPtr, this);
  }

  public int spaceRequired() {
    return bridgeJNI.SWIG_UnitType_spaceRequired(swigCPtr, this);
  }

  public int spaceProvided() {
    return bridgeJNI.SWIG_UnitType_spaceProvided(swigCPtr, this);
  }

  public int buildScore() {
    return bridgeJNI.SWIG_UnitType_buildScore(swigCPtr, this);
  }

  public int destroyScore() {
    return bridgeJNI.SWIG_UnitType_destroyScore(swigCPtr, this);
  }

  public SWIG_UnitSizeType size() {
    return new SWIG_UnitSizeType(bridgeJNI.SWIG_UnitType_size(swigCPtr, this), true);
  }

  public int tileWidth() {
    return bridgeJNI.SWIG_UnitType_tileWidth(swigCPtr, this);
  }

  public int tileHeight() {
    return bridgeJNI.SWIG_UnitType_tileHeight(swigCPtr, this);
  }

  public int dimensionLeft() {
    return bridgeJNI.SWIG_UnitType_dimensionLeft(swigCPtr, this);
  }

  public int dimensionUp() {
    return bridgeJNI.SWIG_UnitType_dimensionUp(swigCPtr, this);
  }

  public int dimensionRight() {
    return bridgeJNI.SWIG_UnitType_dimensionRight(swigCPtr, this);
  }

  public int dimensionDown() {
    return bridgeJNI.SWIG_UnitType_dimensionDown(swigCPtr, this);
  }

  public int seekRange() {
    return bridgeJNI.SWIG_UnitType_seekRange(swigCPtr, this);
  }

  public int sightRange() {
    return bridgeJNI.SWIG_UnitType_sightRange(swigCPtr, this);
  }

  public SWIG_WeaponType groundWeapon() {
    long cPtr = bridgeJNI.SWIG_UnitType_groundWeapon(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_WeaponType(cPtr, false);
  }

  public int maxGroundHits() {
    return bridgeJNI.SWIG_UnitType_maxGroundHits(swigCPtr, this);
  }

  public SWIG_WeaponType airWeapon() {
    long cPtr = bridgeJNI.SWIG_UnitType_airWeapon(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_WeaponType(cPtr, false);
  }

  public int maxAirHits() {
    return bridgeJNI.SWIG_UnitType_maxAirHits(swigCPtr, this);
  }

  public double topSpeed() {
    return bridgeJNI.SWIG_UnitType_topSpeed(swigCPtr, this);
  }

  public int acceleration() {
    return bridgeJNI.SWIG_UnitType_acceleration(swigCPtr, this);
  }

  public int haltDistance() {
    return bridgeJNI.SWIG_UnitType_haltDistance(swigCPtr, this);
  }

  public int turnRadius() {
    return bridgeJNI.SWIG_UnitType_turnRadius(swigCPtr, this);
  }

  public boolean canProduce() {
    return bridgeJNI.SWIG_UnitType_canProduce(swigCPtr, this);
  }

  public boolean canAttack() {
    return bridgeJNI.SWIG_UnitType_canAttack(swigCPtr, this);
  }

  public boolean canMove() {
    return bridgeJNI.SWIG_UnitType_canMove(swigCPtr, this);
  }

  public boolean isFlyer() {
    return bridgeJNI.SWIG_UnitType_isFlyer(swigCPtr, this);
  }

  public boolean regeneratesHP() {
    return bridgeJNI.SWIG_UnitType_regeneratesHP(swigCPtr, this);
  }

  public boolean isSpellcaster() {
    return bridgeJNI.SWIG_UnitType_isSpellcaster(swigCPtr, this);
  }

  public boolean hasPermanentCloak() {
    return bridgeJNI.SWIG_UnitType_hasPermanentCloak(swigCPtr, this);
  }

  public boolean isInvincible() {
    return bridgeJNI.SWIG_UnitType_isInvincible(swigCPtr, this);
  }

  public boolean isOrganic() {
    return bridgeJNI.SWIG_UnitType_isOrganic(swigCPtr, this);
  }

  public boolean isMechanical() {
    return bridgeJNI.SWIG_UnitType_isMechanical(swigCPtr, this);
  }

  public boolean isRobotic() {
    return bridgeJNI.SWIG_UnitType_isRobotic(swigCPtr, this);
  }

  public boolean isDetector() {
    return bridgeJNI.SWIG_UnitType_isDetector(swigCPtr, this);
  }

  public boolean isResourceContainer() {
    return bridgeJNI.SWIG_UnitType_isResourceContainer(swigCPtr, this);
  }

  public boolean isResourceDepot() {
    return bridgeJNI.SWIG_UnitType_isResourceDepot(swigCPtr, this);
  }

  public boolean isRefinery() {
    return bridgeJNI.SWIG_UnitType_isRefinery(swigCPtr, this);
  }

  public boolean isWorker() {
    return bridgeJNI.SWIG_UnitType_isWorker(swigCPtr, this);
  }

  public boolean requiresPsi() {
    return bridgeJNI.SWIG_UnitType_requiresPsi(swigCPtr, this);
  }

  public boolean requiresCreep() {
    return bridgeJNI.SWIG_UnitType_requiresCreep(swigCPtr, this);
  }

  public boolean isTwoUnitsInOneEgg() {
    return bridgeJNI.SWIG_UnitType_isTwoUnitsInOneEgg(swigCPtr, this);
  }

  public boolean isBurrowable() {
    return bridgeJNI.SWIG_UnitType_isBurrowable(swigCPtr, this);
  }

  public boolean isCloakable() {
    return bridgeJNI.SWIG_UnitType_isCloakable(swigCPtr, this);
  }

  public boolean isBuilding() {
    return bridgeJNI.SWIG_UnitType_isBuilding(swigCPtr, this);
  }

  public boolean isAddon() {
    return bridgeJNI.SWIG_UnitType_isAddon(swigCPtr, this);
  }

  public boolean isFlyingBuilding() {
    return bridgeJNI.SWIG_UnitType_isFlyingBuilding(swigCPtr, this);
  }

  public boolean isNeutral() {
    return bridgeJNI.SWIG_UnitType_isNeutral(swigCPtr, this);
  }

}