/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.bwapi.bridge.swig;
import org.bwapi.bridge.model.BwapiPointable;
public class RegionSpacelessSetIterator implements BwapiPointable {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public RegionSpacelessSetIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(RegionSpacelessSetIterator obj) {
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
        bridgeJNI.delete_RegionSpacelessSetIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RegionSpacelessSetIterator(SWIGTYPE_p_std__setT_Region_p_t original) {
    this(bridgeJNI.new_RegionSpacelessSetIterator(SWIGTYPE_p_std__setT_Region_p_t.getCPtr(original)), true);
  }

  public boolean hasNext() {
    return bridgeJNI.RegionSpacelessSetIterator_hasNext(swigCPtr, this);
  }

  public SWIGTYPE_p_Region next() {
    long cPtr = bridgeJNI.RegionSpacelessSetIterator_next(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Region(cPtr, false);
  }

}
