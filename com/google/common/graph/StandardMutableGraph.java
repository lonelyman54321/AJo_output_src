/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.AbstractGraphBuilder;
import com.google.common.graph.BaseGraph;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.ForwardingGraph;
import com.google.common.graph.GraphConstants$Presence;
import com.google.common.graph.MutableGraph;
import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.StandardMutableValueGraph;

final class StandardMutableGraph
extends ForwardingGraph
implements MutableGraph {
    private final MutableValueGraph backingValueGraph;

    public StandardMutableGraph(AbstractGraphBuilder abstractGraphBuilder) {
        StandardMutableValueGraph standardMutableValueGraph = new StandardMutableValueGraph(abstractGraphBuilder);
        this.backingValueGraph = standardMutableValueGraph;
    }

    public boolean addNode(Object object) {
        return this.backingValueGraph.addNode(object);
    }

    public BaseGraph delegate() {
        return this.backingValueGraph;
    }

    public boolean putEdge(EndpointPair object) {
        this.validateEndpoints((EndpointPair)object);
        Object object2 = ((EndpointPair)object).nodeU();
        object = ((EndpointPair)object).nodeV();
        return this.putEdge(object2, object);
    }

    public boolean putEdge(Object object, Object object2) {
        boolean bl2;
        MutableValueGraph mutableValueGraph = this.backingValueGraph;
        GraphConstants$Presence graphConstants$Presence = GraphConstants$Presence.EDGE_EXISTS;
        if ((object = mutableValueGraph.putEdgeValue(object, object2, (Object)graphConstants$Presence)) == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean removeEdge(EndpointPair object) {
        this.validateEndpoints((EndpointPair)object);
        Object object2 = ((EndpointPair)object).nodeU();
        object = ((EndpointPair)object).nodeV();
        return this.removeEdge(object2, object);
    }

    public boolean removeEdge(Object object, Object object2) {
        boolean bl2;
        MutableValueGraph mutableValueGraph = this.backingValueGraph;
        if ((object = mutableValueGraph.removeEdge(object, object2)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean removeNode(Object object) {
        return this.backingValueGraph.removeNode(object);
    }
}

