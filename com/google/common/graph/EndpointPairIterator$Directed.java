/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.BaseGraph;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.EndpointPairIterator;
import com.google.common.graph.EndpointPairIterator$1;
import java.util.Objects;

final class EndpointPairIterator$Directed
extends EndpointPairIterator {
    private EndpointPairIterator$Directed(BaseGraph baseGraph) {
        super(baseGraph, null);
    }

    public /* synthetic */ EndpointPairIterator$Directed(BaseGraph baseGraph, EndpointPairIterator$1 endpointPairIterator$1) {
        this(baseGraph);
    }

    public EndpointPair computeNext() {
        boolean bl2;
        do {
            Object object;
            if (!(bl2 = (object = this.successorIterator).hasNext())) continue;
            object = this.node;
            Objects.requireNonNull(object);
            Object e2 = this.successorIterator.next();
            return EndpointPair.ordered(object, e2);
        } while (bl2 = this.advance());
        return (EndpointPair)this.endOfData();
    }
}

