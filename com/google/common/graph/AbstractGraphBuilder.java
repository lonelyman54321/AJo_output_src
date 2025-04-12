/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Optional;
import com.google.common.graph.ElementOrder;

abstract class AbstractGraphBuilder {
    boolean allowsSelfLoops = false;
    final boolean directed;
    Optional expectedNodeCount;
    ElementOrder incidentEdgeOrder;
    ElementOrder nodeOrder;

    public AbstractGraphBuilder(boolean bl2) {
        Object object = ElementOrder.insertion();
        this.nodeOrder = object;
        object = ElementOrder.unordered();
        this.incidentEdgeOrder = object;
        this.expectedNodeCount = object = Optional.absent();
        this.directed = bl2;
    }
}

