/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class UnitTypeList implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public UnitTypeList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(UnitTypeList obj) {
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
        bridgeJNI.delete_UnitTypeList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void set_list(SWIGTYPE_p_std__listT_BWAPI__UnitType_t value) {
    bridgeJNI.UnitTypeList__list_set(swigCPtr, this, SWIGTYPE_p_std__listT_BWAPI__UnitType_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__listT_BWAPI__UnitType_t get_list() {
    long cPtr = bridgeJNI.UnitTypeList__list_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__listT_BWAPI__UnitType_t(cPtr, false);
  }

  public UnitTypeList(SWIGTYPE_p_std__listT_BWAPI__UnitType_t original) {
    this(bridgeJNI.new_UnitTypeList(SWIGTYPE_p_std__listT_BWAPI__UnitType_t.getCPtr(original)), true);
  }

  public int size() {
    return bridgeJNI.UnitTypeList_size(swigCPtr, this);
  }

  public boolean contains(SWIG_UnitType item) {
    return bridgeJNI.UnitTypeList_contains(swigCPtr, this, SWIG_UnitType.getCPtr(item), item);
  }

  public boolean add(SWIG_UnitType item) {
    return bridgeJNI.UnitTypeList_add(swigCPtr, this, SWIG_UnitType.getCPtr(item), item);
  }

  public void clear() {
    bridgeJNI.UnitTypeList_clear(swigCPtr, this);
  }

  public boolean remove(SWIG_UnitType item) {
    return bridgeJNI.UnitTypeList_remove(swigCPtr, this, SWIG_UnitType.getCPtr(item), item);
  }

}
