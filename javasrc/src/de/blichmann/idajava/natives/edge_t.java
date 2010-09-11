/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class edge_t {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public edge_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(edge_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_edge_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSrc(int value) {
    IdaJavaJNI.edge_t_src_set(swigCPtr, this, value);
  }

  public int getSrc() {
    return IdaJavaJNI.edge_t_src_get(swigCPtr, this);
  }

  public void setDst(int value) {
    IdaJavaJNI.edge_t_dst_set(swigCPtr, this, value);
  }

  public int getDst() {
    return IdaJavaJNI.edge_t_dst_get(swigCPtr, this);
  }

  public edge_t() {
    this(IdaJavaJNI.new_edge_t__SWIG_0(), true);
  }

  public edge_t(int x, int y) {
    this(IdaJavaJNI.new_edge_t__SWIG_1(x, y), true);
  }

  public boolean __lt__(edge_t y) {
    return IdaJavaJNI.edge_t___lt__(swigCPtr, this, edge_t.getCPtr(y), y);
  }

  public boolean __eq__(edge_t y) {
    return IdaJavaJNI.edge_t___eq__(swigCPtr, this, edge_t.getCPtr(y), y);
  }

  public boolean __ne__(edge_t y) {
    return IdaJavaJNI.edge_t___ne__(swigCPtr, this, edge_t.getCPtr(y), y);
  }

}