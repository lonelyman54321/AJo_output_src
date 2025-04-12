/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.AbstractGraphBuilder;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.ElementOrder$Type;
import com.google.common.graph.Graphs;
import com.google.common.graph.ImmutableValueGraph$Builder;
import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.StandardMutableValueGraph;
import com.google.common.graph.ValueGraph;

public final class ValueGraphBuilder
extends AbstractGraphBuilder {
    private ValueGraphBuilder(boolean bl2) {
        super(bl2);
    }

    private ValueGraphBuilder cast() {
        return this;
    }

    public static ValueGraphBuilder directed() {
        ValueGraphBuilder valueGraphBuilder = new ValueGraphBuilder(true);
        return valueGraphBuilder;
    }

    public static ValueGraphBuilder from(ValueGraph object) {
        boolean bl2 = object.isDirected();
        ValueGraphBuilder valueGraphBuilder = new ValueGraphBuilder(bl2);
        bl2 = object.allowsSelfLoops();
        valueGraphBuilder = valueGraphBuilder.allowsSelfLoops(bl2);
        ElementOrder elementOrder = object.nodeOrder();
        valueGraphBuilder = valueGraphBuilder.nodeOrder(elementOrder);
        object = object.incidentEdgeOrder();
        return valueGraphBuilder.incidentEdgeOrder((ElementOrder)object);
    }

    public static ValueGraphBuilder undirected() {
        ValueGraphBuilder valueGraphBuilder = new ValueGraphBuilder(false);
        return valueGraphBuilder;
    }

    public ValueGraphBuilder allowsSelfLoops(boolean bl2) {
        this.allowsSelfLoops = bl2;
        return this;
    }

    public MutableValueGraph build() {
        StandardMutableValueGraph standardMutableValueGraph = new StandardMutableValueGraph(this);
        return standardMutableValueGraph;
    }

    public ValueGraphBuilder copy() {
        boolean bl2 = this.directed;
        ValueGraphBuilder valueGraphBuilder = new ValueGraphBuilder(bl2);
        valueGraphBuilder.allowsSelfLoops = bl2 = this.allowsSelfLoops;
        Object object = this.nodeOrder;
        valueGraphBuilder.nodeOrder = object;
        valueGraphBuilder.expectedNodeCount = object = this.expectedNodeCount;
        valueGraphBuilder.incidentEdgeOrder = object = this.incidentEdgeOrder;
        return valueGraphBuilder;
    }

    public ValueGraphBuilder expectedNodeCount(int n3) {
        Optional optional;
        this.expectedNodeCount = optional = Optional.of(Graphs.checkNonNegative(n3));
        return this;
    }

    public ImmutableValueGraph$Builder immutable() {
        ValueGraphBuilder valueGraphBuilder = this.cast();
        ImmutableValueGraph$Builder immutableValueGraph$Builder = new ImmutableValueGraph$Builder(valueGraphBuilder);
        return immutableValueGraph$Builder;
    }

    public ValueGraphBuilder incidentEdgeOrder(ElementOrder elementOrder) {
        boolean bl2;
        ElementOrder$Type elementOrder$Type;
        Object object = elementOrder.type();
        if (object != (elementOrder$Type = ElementOrder$Type.UNORDERED) && (object = elementOrder.type()) != (elementOrder$Type = ElementOrder$Type.STABLE)) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", (Object)elementOrder);
        object = this.cast();
        ((AbstractGraphBuilder)object).incidentEdgeOrder = elementOrder = (ElementOrder)Preconditions.checkNotNull(elementOrder);
        return object;
    }

    public ValueGraphBuilder nodeOrder(ElementOrder elementOrder) {
        ValueGraphBuilder valueGraphBuilder = this.cast();
        valueGraphBuilder.nodeOrder = elementOrder = (ElementOrder)Preconditions.checkNotNull(elementOrder);
        return valueGraphBuilder;
    }
}

