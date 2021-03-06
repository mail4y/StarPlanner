/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class UnitTypeConstantSetIterator implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public UnitTypeConstantSetIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(UnitTypeConstantSetIterator obj) {
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
        bridgeJNI.delete_UnitTypeConstantSetIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UnitTypeConstantSetIterator(SWIGTYPE_p_std__setT_BWAPI__UnitType_const_p_t original) {
    this(bridgeJNI.new_UnitTypeConstantSetIterator(SWIGTYPE_p_std__setT_BWAPI__UnitType_const_p_t.getCPtr(original)), true);
  }

  public boolean hasNext() {
    return bridgeJNI.UnitTypeConstantSetIterator_hasNext(swigCPtr, this);
  }

  public SWIG_UnitType next() {
    long cPtr = bridgeJNI.UnitTypeConstantSetIterator_next(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_UnitType(cPtr, false);
  }

}
