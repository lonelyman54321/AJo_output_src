/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.Maps;
import com.google.common.graph.DirectedGraphConnections;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.GraphConnections;
import com.google.common.graph.ImmutableGraph;
import com.google.common.graph.StandardValueGraph;
import com.google.common.graph.UndirectedGraphConnections;
import com.google.common.graph.ValueGraph;
import com.google.common.graph.ValueGraphBuilder;
import java.util.Iterator;
import java.util.Objects;

public final class ImmutableValueGraph
extends StandardValueGraph {
    private ImmutableValueGraph(ValueGraph valueGraph) {
        ValueGraphBuilder valueGraphBuilder = ValueGraphBuilder.from(valueGraph);
        ImmutableMap immutableMap = ImmutableValueGraph.getNodeConnections(valueGraph);
        long l2 = valueGraph.edges().size();
        super(valueGraphBuilder, immutableMap, l2);
    }

    public static /* synthetic */ Object b(ValueGraph valueGraph, Object object, Object object2) {
        return ImmutableValueGraph.lambda$connectionsOf$0(valueGraph, object, object2);
    }

    private static GraphConnections connectionsOf(ValueGraph object, Object object2) {
        cf1_1 cf1_12 = new cf1_1((ValueGraph)object, object2);
        boolean bl2 = object.isDirected();
        if (bl2) {
            object = object.incidentEdges(object2);
            object = DirectedGraphConnections.ofImmutable(object2, (Iterable)object, cf1_12);
        } else {
            object = UndirectedGraphConnections.ofImmutable(Maps.asMap(object.adjacentNodes(object2), (Function)cf1_12));
        }
        return object;
    }

    public static ImmutableValueGraph copyOf(ImmutableValueGraph immutableValueGraph) {
        return (ImmutableValueGraph)Preconditions.checkNotNull(immutableValueGraph);
    }

    public static ImmutableValueGraph copyOf(ValueGraph valueGraph) {
        boolean bl2 = valueGraph instanceof ImmutableValueGraph;
        if (bl2) {
            valueGraph = (ImmutableValueGraph)valueGraph;
        } else {
            ImmutableValueGraph immutableValueGraph = new ImmutableValueGraph(valueGraph);
            valueGraph = immutableValueGraph;
        }
        return valueGraph;
    }

    private static ImmutableMap getNodeConnections(ValueGraph valueGraph) {
        boolean bl2;
        ImmutableMap$Builder immutableMap$Builder = ImmutableMap.builder();
        Iterator iterator = valueGraph.nodes().iterator();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            GraphConnections graphConnections = ImmutableValueGraph.connectionsOf(valueGraph, e2);
            immutableMap$Builder.put(e2, graphConnections);
        }
        return immutableMap$Builder.buildOrThrow();
    }

    private static /* synthetic */ Object lambda$connectionsOf$0(ValueGraph object, Object object2, Object object3) {
        object = object.edgeValueOrDefault(object2, object3, null);
        Objects.requireNonNull(object);
        return object;
    }

    public ImmutableGraph asGraph() {
        ImmutableGraph immutableGraph = new ImmutableGraph(this);
        return immutableGraph;
    }

    public ElementOrder incidentEdgeOrder() {
        return ElementOrder.stable();
    }
}

