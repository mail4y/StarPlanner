/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class ErrorSet implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ErrorSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ErrorSet obj) {
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
        bridgeJNI.delete_ErrorSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ErrorSet(SWIGTYPE_p_std__setT_BWAPI__Error_t original) {
    this(bridgeJNI.new_ErrorSet(SWIGTYPE_p_std__setT_BWAPI__Error_t.getCPtr(original)), true);
  }

  public int size() {
    return bridgeJNI.ErrorSet_size(swigCPtr, this);
  }

  public boolean contains(SWIG_Error item) {
    return bridgeJNI.ErrorSet_contains(swigCPtr, this, SWIG_Error.getCPtr(item), item);
  }

  public boolean add(SWIG_Error item) {
    return bridgeJNI.ErrorSet_add(swigCPtr, this, SWIG_Error.getCPtr(item), item);
  }

  public void clear() {
    bridgeJNI.ErrorSet_clear(swigCPtr, this);
  }

  public boolean remove(SWIG_Error item) {
    return bridgeJNI.ErrorSet_remove(swigCPtr, this, SWIG_Error.getCPtr(item), item);
  }

}
