/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class UnitTypeMap implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public UnitTypeMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(UnitTypeMap obj) {
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
        bridgeJNI.delete_UnitTypeMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UnitTypeMap(SWIGTYPE_p_std__mapT_UnitType_const_p_int_t original) {
    this(bridgeJNI.new_UnitTypeMap(SWIGTYPE_p_std__mapT_UnitType_const_p_int_t.getCPtr(original)), true);
  }

  public int size() {
    return bridgeJNI.UnitTypeMap_size(swigCPtr, this);
  }

  public boolean add(SWIGTYPE_p_UnitType key, int value) {
    return bridgeJNI.UnitTypeMap_add(swigCPtr, this, SWIGTYPE_p_UnitType.getCPtr(key), value);
  }

  public void clear() {
    bridgeJNI.UnitTypeMap_clear(swigCPtr, this);
  }

  public boolean remove(SWIGTYPE_p_UnitType key) {
    return bridgeJNI.UnitTypeMap_remove(swigCPtr, this, SWIGTYPE_p_UnitType.getCPtr(key));
  }

}
