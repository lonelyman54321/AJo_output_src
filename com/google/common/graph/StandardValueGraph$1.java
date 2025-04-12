/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.BaseGraph;
import com.google.common.graph.GraphConnections;
import com.google.common.graph.IncidentEdgeSet;
import com.google.common.graph.StandardValueGraph;
import java.util.Iterator;

class StandardValueGraph$1
extends IncidentEdgeSet {
    final /* synthetic */ GraphConnections val$connections;

    public StandardValueGraph$1(StandardValueGraph standardValueGraph, BaseGraph baseGraph, Object object, GraphConnections graphConnections) {
        this.val$connections = graphConnections;
        super(baseGraph, object);
    }

    public Iterator iterator() {
        GraphConnections graphConnections = this.val$connections;
        Object object = this.node;
        return graphConnections.incidentEdgeIterator(object);
    }
}

