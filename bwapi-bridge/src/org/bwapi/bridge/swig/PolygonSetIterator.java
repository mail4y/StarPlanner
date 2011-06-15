/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class PolygonSetIterator implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public PolygonSetIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PolygonSetIterator obj) {
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
        bridgeJNI.delete_PolygonSetIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PolygonSetIterator(SWIGTYPE_p_std__setT_BWTA__Polygon_p_t original) {
    this(bridgeJNI.new_PolygonSetIterator(SWIGTYPE_p_std__setT_BWTA__Polygon_p_t.getCPtr(original)), true);
  }

  public boolean hasNext() {
    return bridgeJNI.PolygonSetIterator_hasNext(swigCPtr, this);
  }

  public SWIG_Polygon next() {
    long cPtr = bridgeJNI.PolygonSetIterator_next(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIG_Polygon(cPtr, false);
  }

}