/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.BaseGraph;
import com.google.common.graph.EndpointPair;
import java.util.AbstractSet;

abstract class IncidentEdgeSet
extends AbstractSet {
    final BaseGraph graph;
    final Object node;

    public IncidentEdgeSet(BaseGraph baseGraph, Object object) {
        this.graph = baseGraph;
        this.node = object;
    }

    public boolean contains(Object object) {
        boolean bl2;
        boolean bl3;
        Object object2;
        boolean bl4;
        boolean bl5;
        block7: {
            block10: {
                block9: {
                    boolean bl6;
                    Object object3;
                    block8: {
                        bl5 = object instanceof EndpointPair;
                        bl4 = false;
                        if (!bl5) {
                            return false;
                        }
                        object = (EndpointPair)object;
                        object2 = this.graph;
                        bl5 = object2.isDirected();
                        if (!bl5) break block7;
                        bl5 = ((EndpointPair)object).isOrdered();
                        if (!bl5) {
                            return false;
                        }
                        object2 = ((EndpointPair)object).source();
                        object = ((EndpointPair)object).target();
                        object3 = this.node;
                        boolean bl7 = object3.equals(object2);
                        if (!bl7) break block8;
                        object3 = this.graph;
                        Object object4 = this.node;
                        bl7 = (object3 = object3.successors(object4)).contains(object);
                        if (bl7) break block9;
                    }
                    if (!(bl6 = (object3 = this.node).equals(object))) break block10;
                    object = this.graph;
                    object3 = this.node;
                    bl6 = (object = object.predecessors(object3)).contains(object2);
                    if (!bl6) break block10;
                }
                bl4 = true;
            }
            return bl4;
        }
        bl5 = ((EndpointPair)object).isOrdered();
        if (bl5) {
            return false;
        }
        object2 = this.graph;
        Object object5 = this.node;
        object2 = object2.adjacentNodes(object5);
        object5 = ((EndpointPair)object).nodeU();
        Object object6 = this.node;
        boolean bl8 = object6.equals(object = ((EndpointPair)object).nodeV());
        if (bl8 && (bl8 = object2.contains(object5)) || (bl3 = (object6 = this.node).equals(object5)) && (bl2 = object2.contains(object))) {
            bl4 = true;
        }
        return bl4;
    }

    public boolean remove(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public int size() {
        BaseGraph baseGraph = this.graph;
        int n3 = baseGraph.isDirected();
        if (n3 != 0) {
            baseGraph = this.graph;
            Object object = this.node;
            n3 = baseGraph.inDegree(object);
            object = this.graph;
            Object object2 = this.node;
            int n4 = object.outDegree(object2);
            n3 += n4;
            object = this.graph;
            object2 = this.node;
            object = object.successors(object2);
            object2 = this.node;
            n4 = (int)(object.contains(object2) ? 1 : 0);
            return n3 - n4;
        }
        baseGraph = this.graph;
        Object object = this.node;
        return baseGraph.adjacentNodes(object).size();
    }
}

