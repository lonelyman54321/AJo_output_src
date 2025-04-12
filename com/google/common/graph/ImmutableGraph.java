/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.Maps;
import com.google.common.graph.BaseGraph;
import com.google.common.graph.DirectedGraphConnections;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.ForwardingGraph;
import com.google.common.graph.Graph;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.GraphConnections;
import com.google.common.graph.GraphConstants$Presence;
import com.google.common.graph.StandardValueGraph;
import com.google.common.graph.UndirectedGraphConnections;
import java.util.Iterator;

public class ImmutableGraph
extends ForwardingGraph {
    private final BaseGraph backingGraph;

    public ImmutableGraph(BaseGraph baseGraph) {
        this.backingGraph = baseGraph;
    }

    private static GraphConnections connectionsOf(Graph object, Object object2) {
        Function function = Functions.constant((Object)GraphConstants$Presence.EDGE_EXISTS);
        boolean bl2 = object.isDirected();
        if (bl2) {
            object = object.incidentEdges(object2);
            object = DirectedGraphConnections.ofImmutable(object2, (Iterable)object, function);
        } else {
            object = UndirectedGraphConnections.ofImmutable(Maps.asMap(object.adjacentNodes(object2), function));
        }
        return object;
    }

    public static ImmutableGraph copyOf(Graph graph) {
        boolean bl2 = graph instanceof ImmutableGraph;
        if (bl2) {
            graph = (ImmutableGraph)graph;
        } else {
            GraphBuilder graphBuilder = GraphBuilder.from(graph);
            ImmutableMap immutableMap = ImmutableGraph.getNodeConnections(graph);
            int n3 = graph.edges().size();
            long l2 = n3;
            StandardValueGraph standardValueGraph = new StandardValueGraph(graphBuilder, immutableMap, l2);
            ImmutableGraph immutableGraph = new ImmutableGraph(standardValueGraph);
            graph = immutableGraph;
        }
        return graph;
    }

    public static ImmutableGraph copyOf(ImmutableGraph immutableGraph) {
        return (ImmutableGraph)Preconditions.checkNotNull(immutableGraph);
    }

    private static ImmutableMap getNodeConnections(Graph graph) {
        boolean bl2;
        ImmutableMap$Builder immutableMap$Builder = ImmutableMap.builder();
        Iterator iterator = graph.nodes().iterator();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            GraphConnections graphConnections = ImmutableGraph.connectionsOf(graph, e2);
            immutableMap$Builder.put(e2, graphConnections);
        }
        return immutableMap$Builder.buildOrThrow();
    }

    public BaseGraph delegate() {
        return this.backingGraph;
    }

    public ElementOrder incidentEdgeOrder() {
        return ElementOrder.stable();
    }
}

