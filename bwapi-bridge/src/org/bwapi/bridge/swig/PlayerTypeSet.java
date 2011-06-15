/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class PlayerTypeSet implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public PlayerTypeSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PlayerTypeSet obj) {
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
        bridgeJNI.delete_PlayerTypeSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PlayerTypeSet(SWIGTYPE_p_std__setT_BWAPI__PlayerType_t original) {
    this(bridgeJNI.new_PlayerTypeSet(SWIGTYPE_p_std__setT_BWAPI__PlayerType_t.getCPtr(original)), true);
  }

  public int size() {
    return bridgeJNI.PlayerTypeSet_size(swigCPtr, this);
  }

  public boolean contains(SWIG_PlayerType item) {
    return bridgeJNI.PlayerTypeSet_contains(swigCPtr, this, SWIG_PlayerType.getCPtr(item), item);
  }

  public boolean add(SWIG_PlayerType item) {
    return bridgeJNI.PlayerTypeSet_add(swigCPtr, this, SWIG_PlayerType.getCPtr(item), item);
  }

  public void clear() {
    bridgeJNI.PlayerTypeSet_clear(swigCPtr, this);
  }

  public boolean remove(SWIG_PlayerType item) {
    return bridgeJNI.PlayerTypeSet_remove(swigCPtr, this, SWIG_PlayerType.getCPtr(item), item);
  }

}