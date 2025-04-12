/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.graph.BaseGraph;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graph;
import com.google.common.graph.Graphs$TransposedGraph;
import com.google.common.graph.IncidentEdgeSet;
import com.google.common.graph.i;
import java.util.Iterator;

class Graphs$TransposedGraph$1
extends IncidentEdgeSet {
    final /* synthetic */ Graphs$TransposedGraph this$0;

    public Graphs$TransposedGraph$1(Graphs$TransposedGraph graphs$TransposedGraph, BaseGraph baseGraph, Object object) {
        this.this$0 = graphs$TransposedGraph;
        super(baseGraph, object);
    }

    public static /* synthetic */ EndpointPair a(Graphs$TransposedGraph$1 graphs$TransposedGraph$1, EndpointPair endpointPair) {
        return graphs$TransposedGraph$1.lambda$iterator$0(endpointPair);
    }

    private /* synthetic */ EndpointPair lambda$iterator$0(EndpointPair object) {
        BaseGraph baseGraph = this.this$0.delegate();
        Object object2 = ((EndpointPair)object).nodeV();
        object = ((EndpointPair)object).nodeU();
        return EndpointPair.of((Graph)baseGraph, object2, object);
    }

    public Iterator iterator() {
        Object object = this.this$0.delegate();
        Object object2 = this.node;
        object = object.incidentEdges(object2).iterator();
        object2 = new i(this);
        return Iterators.transform((Iterator)object, (Function)object2);
    }
}

