/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class memory_info_t extends area_t {
  private long swigCPtr;

  public memory_info_t(long cPtr, boolean cMemoryOwn) {
    super(IdaJavaJNI.memory_info_t_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(memory_info_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_memory_info_t(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public memory_info_t() {
    this(IdaJavaJNI.new_memory_info_t(), true);
  }

  public void setName(SWIGTYPE_p__qstringT_char_t value) {
    IdaJavaJNI.memory_info_t_name_set(swigCPtr, this, SWIGTYPE_p__qstringT_char_t.getCPtr(value));
  }

  public SWIGTYPE_p__qstringT_char_t getName() {
    long cPtr = IdaJavaJNI.memory_info_t_name_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__qstringT_char_t(cPtr, false);
  }

  public void setSclass(SWIGTYPE_p__qstringT_char_t value) {
    IdaJavaJNI.memory_info_t_sclass_set(swigCPtr, this, SWIGTYPE_p__qstringT_char_t.getCPtr(value));
  }

  public SWIGTYPE_p__qstringT_char_t getSclass() {
    long cPtr = IdaJavaJNI.memory_info_t_sclass_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p__qstringT_char_t(cPtr, false);
  }

  public void setSbase(long value) {
    IdaJavaJNI.memory_info_t_sbase_set(swigCPtr, this, value);
  }

  public long getSbase() {
    return IdaJavaJNI.memory_info_t_sbase_get(swigCPtr, this);
  }

  public void setBitness(short value) {
    IdaJavaJNI.memory_info_t_bitness_set(swigCPtr, this, value);
  }

  public short getBitness() {
    return IdaJavaJNI.memory_info_t_bitness_get(swigCPtr, this);
  }

  public void setPerm(short value) {
    IdaJavaJNI.memory_info_t_perm_set(swigCPtr, this, value);
  }

  public short getPerm() {
    return IdaJavaJNI.memory_info_t_perm_get(swigCPtr, this);
  }

  public boolean __eq__(memory_info_t r) {
    return IdaJavaJNI.memory_info_t___eq__(swigCPtr, this, memory_info_t.getCPtr(r), r);
  }

  public boolean __ne__(memory_info_t r) {
    return IdaJavaJNI.memory_info_t___ne__(swigCPtr, this, memory_info_t.getCPtr(r), r);
  }

}
