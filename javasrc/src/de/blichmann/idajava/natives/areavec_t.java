/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class areavec_t extends qvector_area_t {
  private long swigCPtr;

  public areavec_t(long cPtr, boolean cMemoryOwn) {
    super(IdaJavaJNI.areavec_t_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(areavec_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_areavec_t(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public areavec_t() {
    this(IdaJavaJNI.new_areavec_t(), true);
  }

}
