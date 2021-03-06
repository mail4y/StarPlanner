/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class ChokepointSpacelessSet implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ChokepointSpacelessSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ChokepointSpacelessSet obj) {
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
        bridgeJNI.delete_ChokepointSpacelessSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ChokepointSpacelessSet(SWIGTYPE_p_std__setT_Chokepoint_p_t original) {
    this(bridgeJNI.new_ChokepointSpacelessSet(SWIGTYPE_p_std__setT_Chokepoint_p_t.getCPtr(original)), true);
  }

  public int size() {
    return bridgeJNI.ChokepointSpacelessSet_size(swigCPtr, this);
  }

  public boolean contains(SWIGTYPE_p_Chokepoint item) {
    return bridgeJNI.ChokepointSpacelessSet_contains(swigCPtr, this, SWIGTYPE_p_Chokepoint.getCPtr(item));
  }

  public boolean add(SWIGTYPE_p_Chokepoint item) {
    return bridgeJNI.ChokepointSpacelessSet_add(swigCPtr, this, SWIGTYPE_p_Chokepoint.getCPtr(item));
  }

  public void clear() {
    bridgeJNI.ChokepointSpacelessSet_clear(swigCPtr, this);
  }

  public boolean remove(SWIGTYPE_p_Chokepoint item) {
    return bridgeJNI.ChokepointSpacelessSet_remove(swigCPtr, this, SWIGTYPE_p_Chokepoint.getCPtr(item));
  }

}
