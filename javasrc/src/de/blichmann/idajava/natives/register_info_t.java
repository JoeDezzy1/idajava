/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class register_info_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public register_info_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(register_info_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_register_info_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    IdaJavaJNI.register_info_t_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return IdaJavaJNI.register_info_t_name_get(swigCPtr, this);
  }

  public void setFlags(long value) {
    IdaJavaJNI.register_info_t_flags_set(swigCPtr, this, value);
  }

  public long getFlags() {
    return IdaJavaJNI.register_info_t_flags_get(swigCPtr, this);
  }

  public void setRegister_class(short value) {
    IdaJavaJNI.register_info_t_register_class_set(swigCPtr, this, value);
  }

  public short getRegister_class() {
    return IdaJavaJNI.register_info_t_register_class_get(swigCPtr, this);
  }

  public void setDtyp(char value) {
    IdaJavaJNI.register_info_t_dtyp_set(swigCPtr, this, value);
  }

  public char getDtyp() {
    return IdaJavaJNI.register_info_t_dtyp_get(swigCPtr, this);
  }

  public void setBit_strings(SWIGTYPE_p_p_char value) {
    IdaJavaJNI.register_info_t_bit_strings_set(swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(value));
  }

  public SWIGTYPE_p_p_char getBit_strings() {
    long cPtr = IdaJavaJNI.register_info_t_bit_strings_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_char(cPtr, false);
  }

  public void setBit_strings_default(int value) {
    IdaJavaJNI.register_info_t_bit_strings_default_set(swigCPtr, this, value);
  }

  public int getBit_strings_default() {
    return IdaJavaJNI.register_info_t_bit_strings_default_get(swigCPtr, this);
  }

  public register_info_t() {
    this(IdaJavaJNI.new_register_info_t(), true);
  }

}