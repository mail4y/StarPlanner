/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class BaseLocationSet implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public BaseLocationSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(BaseLocationSet obj) {
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
        bridgeJNI.delete_BaseLocationSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BaseLocationSet(SWIGTYPE_p_std__setT_BWTA__BaseLocation_p_t original) {
    this(bridgeJNI.new_BaseLocationSet(SWIGTYPE_p_std__setT_BWTA__BaseLocation_p_t.getCPtr(original)), true);
  }

  public int size() {
    return bridgeJNI.BaseLocationSet_size(swigCPtr, this);
  }

  public boolean contains(SWIG_BaseLocation item) {
    return bridgeJNI.BaseLocationSet_contains(swigCPtr, this, SWIG_BaseLocation.getCPtr(item), item);
  }

  public boolean add(SWIG_BaseLocation item) {
    return bridgeJNI.BaseLocationSet_add(swigCPtr, this, SWIG_BaseLocation.getCPtr(item), item);
  }

  public void clear() {
    bridgeJNI.BaseLocationSet_clear(swigCPtr, this);
  }

  public boolean remove(SWIG_BaseLocation item) {
    return bridgeJNI.BaseLocationSet_remove(swigCPtr, this, SWIG_BaseLocation.getCPtr(item), item);
  }

}
