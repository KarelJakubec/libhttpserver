/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class ArgComparator {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ArgComparator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArgComparator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libjavawebserver_frameworkJNI.delete_ArgComparator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArgComparator() {
    this(libjavawebserver_frameworkJNI.new_ArgComparator(), true);
  }

}