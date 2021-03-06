/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class SWIG_Order implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public SWIG_Order(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SWIG_Order obj) {
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
        bridgeJNI.delete_SWIG_Order(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIG_Order() {
    this(bridgeJNI.new_SWIG_Order__SWIG_0(), true);
  }

  public SWIG_Order(int id) {
    this(bridgeJNI.new_SWIG_Order__SWIG_1(id), true);
  }

  public SWIG_Order(SWIG_Order other) {
    this(bridgeJNI.new_SWIG_Order__SWIG_2(SWIG_Order.getCPtr(other), other), true);
  }

  public SWIG_Order opAssign(SWIG_Order other) {
    return new SWIG_Order(bridgeJNI.SWIG_Order_opAssign(swigCPtr, this, SWIG_Order.getCPtr(other), other), false);
  }

  public boolean opEquals(SWIG_Order other) {
    return bridgeJNI.SWIG_Order_opEquals(swigCPtr, this, SWIG_Order.getCPtr(other), other);
  }

  public boolean opNotEquals(SWIG_Order other) {
    return bridgeJNI.SWIG_Order_opNotEquals(swigCPtr, this, SWIG_Order.getCPtr(other), other);
  }

  public boolean opLessThan(SWIG_Order other) {
    return bridgeJNI.SWIG_Order_opLessThan(swigCPtr, this, SWIG_Order.getCPtr(other), other);
  }

  public int getID() {
    return bridgeJNI.SWIG_Order_getID(swigCPtr, this);
  }

  public String getName() {
    return bridgeJNI.SWIG_Order_getName(swigCPtr, this);
  }

}
