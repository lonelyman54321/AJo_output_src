/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.Sets;
import com.google.common.graph.BaseGraph;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.EndpointPairIterator;
import com.google.common.graph.EndpointPairIterator$1;
import java.util.Objects;
import java.util.Set;

final class EndpointPairIterator$Undirected
extends EndpointPairIterator {
    private Set visitedNodes;

    private EndpointPairIterator$Undirected(BaseGraph object) {
        super((BaseGraph)object, null);
        this.visitedNodes = object = Sets.newHashSetWithExpectedSize(object.nodes().size() + 1);
    }

    public /* synthetic */ EndpointPairIterator$Undirected(BaseGraph baseGraph, EndpointPairIterator$1 endpointPairIterator$1) {
        this(baseGraph);
    }

    public EndpointPair computeNext() {
        boolean bl2;
        do {
            Object object;
            Object object2 = this.visitedNodes;
            Objects.requireNonNull(object2);
            while (bl2 = (object2 = this.successorIterator).hasNext()) {
                object = this.visitedNodes;
                object2 = this.successorIterator.next();
                boolean bl3 = object.contains(object2);
                if (bl3) continue;
                object = this.node;
                Objects.requireNonNull(object);
                return EndpointPair.unordered(object, object2);
            }
            object2 = this.visitedNodes;
            object = this.node;
            object2.add(object);
        } while (bl2 = this.advance());
        this.visitedNodes = null;
        return (EndpointPair)this.endOfData();
    }
}

