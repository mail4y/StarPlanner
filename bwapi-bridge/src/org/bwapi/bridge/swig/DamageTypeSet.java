/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class DamageTypeSet implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public DamageTypeSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(DamageTypeSet obj) {
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
        bridgeJNI.delete_DamageTypeSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DamageTypeSet(SWIGTYPE_p_std__setT_BWAPI__DamageType_t original) {
    this(bridgeJNI.new_DamageTypeSet(SWIGTYPE_p_std__setT_BWAPI__DamageType_t.getCPtr(original)), true);
  }

  public int size() {
    return bridgeJNI.DamageTypeSet_size(swigCPtr, this);
  }

  public boolean contains(SWIG_DamageType item) {
    return bridgeJNI.DamageTypeSet_contains(swigCPtr, this, SWIG_DamageType.getCPtr(item), item);
  }

  public boolean add(SWIG_DamageType item) {
    return bridgeJNI.DamageTypeSet_add(swigCPtr, this, SWIG_DamageType.getCPtr(item), item);
  }

  public void clear() {
    bridgeJNI.DamageTypeSet_clear(swigCPtr, this);
  }

  public boolean remove(SWIG_DamageType item) {
    return bridgeJNI.DamageTypeSet_remove(swigCPtr, this, SWIG_DamageType.getCPtr(item), item);
  }

}