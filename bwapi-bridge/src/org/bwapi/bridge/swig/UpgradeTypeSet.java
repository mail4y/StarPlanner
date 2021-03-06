/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class UpgradeTypeSet implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public UpgradeTypeSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(UpgradeTypeSet obj) {
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
        bridgeJNI.delete_UpgradeTypeSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UpgradeTypeSet(SWIGTYPE_p_std__setT_BWAPI__UpgradeType_t original) {
    this(bridgeJNI.new_UpgradeTypeSet(SWIGTYPE_p_std__setT_BWAPI__UpgradeType_t.getCPtr(original)), true);
  }

  public int size() {
    return bridgeJNI.UpgradeTypeSet_size(swigCPtr, this);
  }

  public boolean contains(SWIG_UpgradeType item) {
    return bridgeJNI.UpgradeTypeSet_contains(swigCPtr, this, SWIG_UpgradeType.getCPtr(item), item);
  }

  public boolean add(SWIG_UpgradeType item) {
    return bridgeJNI.UpgradeTypeSet_add(swigCPtr, this, SWIG_UpgradeType.getCPtr(item), item);
  }

  public void clear() {
    bridgeJNI.UpgradeTypeSet_clear(swigCPtr, this);
  }

  public boolean remove(SWIG_UpgradeType item) {
    return bridgeJNI.UpgradeTypeSet_remove(swigCPtr, this, SWIG_UpgradeType.getCPtr(item), item);
  }

}
