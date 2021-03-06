/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.blichmann.idajava.natives;

public class mutable_graph_t extends abstract_graph_t {
  private long swigCPtr;

  public mutable_graph_t(long cPtr, boolean cMemoryOwn) {
    super(IdaJavaJNI.mutable_graph_t_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(mutable_graph_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        IdaJavaJNI.delete_mutable_graph_t(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setGid(long value) {
    IdaJavaJNI.mutable_graph_t_gid_set(swigCPtr, this, value);
  }

  public long getGid() {
    return IdaJavaJNI.mutable_graph_t_gid_get(swigCPtr, this);
  }

  public void setBelongs(SWIGTYPE_p_intseq_t value) {
    IdaJavaJNI.mutable_graph_t_belongs_set(swigCPtr, this, SWIGTYPE_p_intseq_t.getCPtr(value));
  }

  public SWIGTYPE_p_intseq_t getBelongs() {
    return new SWIGTYPE_p_intseq_t(IdaJavaJNI.mutable_graph_t_belongs_get(swigCPtr, this), true);
  }

  public void setIs_group(SWIGTYPE_p_qvectorT_bool_t value) {
    IdaJavaJNI.mutable_graph_t_is_group_set(swigCPtr, this, SWIGTYPE_p_qvectorT_bool_t.getCPtr(value));
  }

  public SWIGTYPE_p_qvectorT_bool_t getIs_group() {
    long cPtr = IdaJavaJNI.mutable_graph_t_is_group_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_qvectorT_bool_t(cPtr, false);
  }

  public void setOrg_succs(SWIGTYPE_p_array_of_intseq_t value) {
    IdaJavaJNI.mutable_graph_t_org_succs_set(swigCPtr, this, SWIGTYPE_p_array_of_intseq_t.getCPtr(value));
  }

  public SWIGTYPE_p_array_of_intseq_t getOrg_succs() {
    return new SWIGTYPE_p_array_of_intseq_t(IdaJavaJNI.mutable_graph_t_org_succs_get(swigCPtr, this), true);
  }

  public void setOrg_preds(SWIGTYPE_p_array_of_intseq_t value) {
    IdaJavaJNI.mutable_graph_t_org_preds_set(swigCPtr, this, SWIGTYPE_p_array_of_intseq_t.getCPtr(value));
  }

  public SWIGTYPE_p_array_of_intseq_t getOrg_preds() {
    return new SWIGTYPE_p_array_of_intseq_t(IdaJavaJNI.mutable_graph_t_org_preds_get(swigCPtr, this), true);
  }

  public void setSuccs(SWIGTYPE_p_array_of_intseq_t value) {
    IdaJavaJNI.mutable_graph_t_succs_set(swigCPtr, this, SWIGTYPE_p_array_of_intseq_t.getCPtr(value));
  }

  public SWIGTYPE_p_array_of_intseq_t getSuccs() {
    return new SWIGTYPE_p_array_of_intseq_t(IdaJavaJNI.mutable_graph_t_succs_get(swigCPtr, this), true);
  }

  public void setPreds(SWIGTYPE_p_array_of_intseq_t value) {
    IdaJavaJNI.mutable_graph_t_preds_set(swigCPtr, this, SWIGTYPE_p_array_of_intseq_t.getCPtr(value));
  }

  public SWIGTYPE_p_array_of_intseq_t getPreds() {
    return new SWIGTYPE_p_array_of_intseq_t(IdaJavaJNI.mutable_graph_t_preds_get(swigCPtr, this), true);
  }

  public void setNodes(SWIGTYPE_p_qvectorT_rect_t_t value) {
    IdaJavaJNI.mutable_graph_t_nodes_set(swigCPtr, this, SWIGTYPE_p_qvectorT_rect_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_qvectorT_rect_t_t getNodes() {
    long cPtr = IdaJavaJNI.mutable_graph_t_nodes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_qvectorT_rect_t_t(cPtr, false);
  }

  public void setEdges(SWIGTYPE_p_std__mapT_edge_t_edge_info_t_t value) {
    IdaJavaJNI.mutable_graph_t_edges_set(swigCPtr, this, SWIGTYPE_p_std__mapT_edge_t_edge_info_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__mapT_edge_t_edge_info_t_t getEdges() {
    long cPtr = IdaJavaJNI.mutable_graph_t_edges_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__mapT_edge_t_edge_info_t_t(cPtr, false);
  }

  public int size() {
    return IdaJavaJNI.mutable_graph_t_size(swigCPtr, this);
  }

  public int node_qty() {
    return IdaJavaJNI.mutable_graph_t_node_qty(swigCPtr, this);
  }

  public boolean empty() {
    return IdaJavaJNI.mutable_graph_t_empty(swigCPtr, this);
  }

  public boolean exists(int node) {
    return IdaJavaJNI.mutable_graph_t_exists(swigCPtr, this, node);
  }

  public int get_node_representative(int node) {
    return IdaJavaJNI.mutable_graph_t_get_node_representative(swigCPtr, this, node);
  }

  public int get_node_group(int node) {
    return IdaJavaJNI.mutable_graph_t_get_node_group(swigCPtr, this, node);
  }

  public void set_node_group(int node, int group) {
    IdaJavaJNI.mutable_graph_t_set_node_group(swigCPtr, this, node, group);
  }

  public boolean is_deleted_node(int node) {
    return IdaJavaJNI.mutable_graph_t_is_deleted_node(swigCPtr, this, node);
  }

  public void set_deleted_node(int node) {
    IdaJavaJNI.mutable_graph_t_set_deleted_node(swigCPtr, this, node);
  }

  public boolean is_subgraph_node(int node) {
    return IdaJavaJNI.mutable_graph_t_is_subgraph_node(swigCPtr, this, node);
  }

  public boolean is_group_node(int node) {
    return IdaJavaJNI.mutable_graph_t_is_group_node(swigCPtr, this, node);
  }

  public boolean is_simple_node(int node) {
    return IdaJavaJNI.mutable_graph_t_is_simple_node(swigCPtr, this, node);
  }

  public boolean is_collapsed_node(int node) {
    return IdaJavaJNI.mutable_graph_t_is_collapsed_node(swigCPtr, this, node);
  }

  public boolean is_uncollapsed_node(int node) {
    return IdaJavaJNI.mutable_graph_t_is_uncollapsed_node(swigCPtr, this, node);
  }

  public boolean is_visible_node(int node) {
    return IdaJavaJNI.mutable_graph_t_is_visible_node(swigCPtr, this, node);
  }

  public int get_first_subgraph_node(int group) {
    return IdaJavaJNI.mutable_graph_t_get_first_subgraph_node(swigCPtr, this, group);
  }

  public int get_next_subgraph_node(int group, int current) {
    return IdaJavaJNI.mutable_graph_t_get_next_subgraph_node(swigCPtr, this, group, current);
  }

  public int create_group(SWIGTYPE_p_intset_t nodes) {
    return IdaJavaJNI.mutable_graph_t_create_group(swigCPtr, this, SWIGTYPE_p_intset_t.getCPtr(nodes));
  }

  public boolean delete_group(int group) {
    return IdaJavaJNI.mutable_graph_t_delete_group(swigCPtr, this, group);
  }

  public boolean change_group_visibility(int group, boolean expand) {
    return IdaJavaJNI.mutable_graph_t_change_group_visibility(swigCPtr, this, group, expand);
  }

  public int nsucc(int b) {
    return IdaJavaJNI.mutable_graph_t_nsucc(swigCPtr, this, b);
  }

  public int npred(int b) {
    return IdaJavaJNI.mutable_graph_t_npred(swigCPtr, this, b);
  }

  public int succ(int b, int i) {
    return IdaJavaJNI.mutable_graph_t_succ(swigCPtr, this, b, i);
  }

  public int pred(int b, int i) {
    return IdaJavaJNI.mutable_graph_t_pred(swigCPtr, this, b, i);
  }

  public SWIGTYPE_p_intseq_t succset(int b) {
    return new SWIGTYPE_p_intseq_t(IdaJavaJNI.mutable_graph_t_succset(swigCPtr, this, b), false);
  }

  public SWIGTYPE_p_intseq_t predset(int b) {
    return new SWIGTYPE_p_intseq_t(IdaJavaJNI.mutable_graph_t_predset(swigCPtr, this, b), false);
  }

  public void reset() {
    IdaJavaJNI.mutable_graph_t_reset(swigCPtr, this);
  }

  public rect_t nrect(int n) {
    return new rect_t(IdaJavaJNI.mutable_graph_t_nrect__SWIG_0(swigCPtr, this, n), false);
  }

  public boolean set_edge(edge_t e, edge_info_t ei) {
    return IdaJavaJNI.mutable_graph_t_set_edge(swigCPtr, this, edge_t.getCPtr(e), e, edge_info_t.getCPtr(ei), ei);
  }

  public boolean create_digraph_layout() {
    return IdaJavaJNI.mutable_graph_t_create_digraph_layout(swigCPtr, this);
  }

  public void del_custom_layout() {
    IdaJavaJNI.mutable_graph_t_del_custom_layout(swigCPtr, this);
  }

  public boolean get_custom_layout() {
    return IdaJavaJNI.mutable_graph_t_get_custom_layout(swigCPtr, this);
  }

  public void set_custom_layout() {
    IdaJavaJNI.mutable_graph_t_set_custom_layout(swigCPtr, this);
  }

  public boolean get_graph_groups() {
    return IdaJavaJNI.mutable_graph_t_get_graph_groups(swigCPtr, this);
  }

  public void set_graph_groups() {
    IdaJavaJNI.mutable_graph_t_set_graph_groups(swigCPtr, this);
  }

  public long calc_group_ea(SWIGTYPE_p_intset_t arg0) {
    return IdaJavaJNI.mutable_graph_t_calc_group_ea(swigCPtr, this, SWIGTYPE_p_intset_t.getCPtr(arg0));
  }

  public boolean is_user_graph() {
    return IdaJavaJNI.mutable_graph_t_is_user_graph(swigCPtr, this);
  }

}
