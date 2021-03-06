/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class interval_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public interval_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(interval_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_interval_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX0(int value) {
    IdaJavaJNI.interval_t_x0_set(swigCPtr, this, value);
  }

  public int getX0() {
    return IdaJavaJNI.interval_t_x0_get(swigCPtr, this);
  }

  public void setX1(int value) {
    IdaJavaJNI.interval_t_x1_set(swigCPtr, this, value);
  }

  public int getX1() {
    return IdaJavaJNI.interval_t_x1_get(swigCPtr, this);
  }

  public boolean empty() {
    return IdaJavaJNI.interval_t_empty(swigCPtr, this);
  }

  public void intersect(interval_t r) {
    IdaJavaJNI.interval_t_intersect(swigCPtr, this, interval_t.getCPtr(r), r);
  }

  public void make_union(interval_t r) {
    IdaJavaJNI.interval_t_make_union(swigCPtr, this, interval_t.getCPtr(r), r);
  }

  public void move_by(int shift) {
    IdaJavaJNI.interval_t_move_by(swigCPtr, this, shift);
  }

  public interval_t() {
    this(IdaJavaJNI.new_interval_t__SWIG_0(), true);
  }

  public interval_t(int y0, int y1) {
    this(IdaJavaJNI.new_interval_t__SWIG_1(y0, y1), true);
  }

  public interval_t(edge_segment_t s) {
    this(IdaJavaJNI.new_interval_t__SWIG_2(edge_segment_t.getCPtr(s), s), true);
  }

  public int length() {
    return IdaJavaJNI.interval_t_length(swigCPtr, this);
  }

  public boolean contains(int x) {
    return IdaJavaJNI.interval_t_contains(swigCPtr, this, x);
  }

  public boolean __eq__(interval_t r) {
    return IdaJavaJNI.interval_t___eq__(swigCPtr, this, interval_t.getCPtr(r), r);
  }

  public boolean __ne__(interval_t r) {
    return IdaJavaJNI.interval_t___ne__(swigCPtr, this, interval_t.getCPtr(r), r);
  }

}
