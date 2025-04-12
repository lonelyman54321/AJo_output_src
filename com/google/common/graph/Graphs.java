/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graph;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.Graphs$NodeVisitState;
import com.google.common.graph.Graphs$TransposedGraph;
import com.google.common.graph.Graphs$TransposedNetwork;
import com.google.common.graph.Graphs$TransposedValueGraph;
import com.google.common.graph.MutableGraph;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.Network;
import com.google.common.graph.NetworkBuilder;
import com.google.common.graph.Traverser;
import com.google.common.graph.ValueGraph;
import com.google.common.graph.ValueGraphBuilder;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class Graphs {
    private Graphs() {
    }

    private static boolean canTraverseWithoutReusingEdge(Graph graph, Object object, Object object2) {
        boolean bl2 = graph.isDirected();
        return bl2 || !(bl2 = com.google.common.base.Objects.equal(object2, object));
        {
        }
    }

    public static int checkNonNegative(int n3) {
        boolean bl2 = n3 >= 0;
        Preconditions.checkArgument(bl2, "Not true that %s is non-negative.", n3);
        return n3;
    }

    public static long checkNonNegative(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        Preconditions.checkArgument(bl2, "Not true that %s is non-negative.", l2);
        return l2;
    }

    public static int checkPositive(int n3) {
        boolean bl2 = n3 > 0;
        Preconditions.checkArgument(bl2, "Not true that %s is positive.", n3);
        return n3;
    }

    public static long checkPositive(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        Preconditions.checkArgument(bl2, "Not true that %s is positive.", l2);
        return l2;
    }

    public static MutableGraph copyOf(Graph object) {
        Object object2;
        boolean bl2;
        Object object3 = GraphBuilder.from((Graph)object);
        int n3 = object.nodes().size();
        object3 = ((GraphBuilder)object3).expectedNodeCount(n3).build();
        Object object4 = object.nodes().iterator();
        while (bl2 = object4.hasNext()) {
            object2 = object4.next();
            object3.addNode(object2);
        }
        object = object.edges().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object4 = (EndpointPair)object.next();
            object2 = ((EndpointPair)object4).nodeU();
            object4 = ((EndpointPair)object4).nodeV();
            object3.putEdge(object2, object4);
        }
        return object3;
    }

    public static MutableNetwork copyOf(Network network) {
        Object e2;
        boolean bl2;
        Object object = NetworkBuilder.from(network);
        int n3 = network.nodes().size();
        object = ((NetworkBuilder)object).expectedNodeCount(n3);
        n3 = network.edges().size();
        object = ((NetworkBuilder)object).expectedEdgeCount(n3).build();
        Iterator iterator = network.nodes().iterator();
        while (bl2 = iterator.hasNext()) {
            e2 = iterator.next();
            object.addNode(e2);
        }
        iterator = network.edges().iterator();
        while (bl2 = iterator.hasNext()) {
            e2 = iterator.next();
            Object object2 = network.incidentNodes(e2);
            Object object3 = ((EndpointPair)object2).nodeU();
            object2 = ((EndpointPair)object2).nodeV();
            object.addEdge(object3, object2, e2);
        }
        return object;
    }

    public static MutableValueGraph copyOf(ValueGraph valueGraph) {
        Object object;
        boolean bl2;
        Object object2 = ValueGraphBuilder.from(valueGraph);
        int n3 = valueGraph.nodes().size();
        object2 = ((ValueGraphBuilder)object2).expectedNodeCount(n3).build();
        Iterator iterator = valueGraph.nodes().iterator();
        while (bl2 = iterator.hasNext()) {
            object = iterator.next();
            object2.addNode(object);
        }
        iterator = valueGraph.edges().iterator();
        while (bl2 = iterator.hasNext()) {
            object = (EndpointPair)iterator.next();
            Object object3 = ((EndpointPair)object).nodeU();
            Object object4 = ((EndpointPair)object).nodeV();
            Object object5 = ((EndpointPair)object).nodeU();
            object = ((EndpointPair)object).nodeV();
            object = valueGraph.edgeValueOrDefault(object5, object, null);
            Objects.requireNonNull(object);
            object2.putEdgeValue(object3, object4, object);
        }
        return object2;
    }

    public static boolean hasCycle(Graph graph) {
        boolean bl2;
        Object object;
        Object object2 = graph.edges();
        int n3 = object2.size();
        if (n3 == 0) {
            return false;
        }
        int n4 = graph.isDirected();
        boolean bl3 = true;
        if (n4 == 0 && n3 >= (n4 = (object = graph.nodes()).size())) {
            return bl3;
        }
        n3 = graph.nodes().size();
        object2 = Maps.newHashMapWithExpectedSize(n3);
        object = graph.nodes().iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            bl2 = Graphs.subgraphHasCycle(graph, (Map)object2, e2, null);
            if (!bl2) continue;
            return bl3;
        }
        return false;
    }

    public static boolean hasCycle(Network network) {
        Set set;
        int n3;
        Set set2;
        int n4 = network.isDirected();
        if (n4 == 0 && (n4 = network.allowsParallelEdges()) != 0 && (n4 = (set2 = network.edges()).size()) > (n3 = (set = network.asGraph().edges()).size())) {
            return true;
        }
        return Graphs.hasCycle(network.asGraph());
    }

    public static MutableGraph inducedSubgraph(Graph graph, Iterable iterator) {
        int n3;
        Iterable<Object> iterable;
        Object object;
        boolean bl2 = iterator instanceof Collection;
        if (bl2) {
            object = GraphBuilder.from(graph);
            iterable = iterator;
            iterable = (Collection)((Object)iterator);
            n3 = iterable.size();
            object = ((GraphBuilder)object).expectedNodeCount(n3).build();
        } else {
            object = GraphBuilder.from(graph).build();
        }
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            iterable = iterator.next();
            object.addNode(iterable);
        }
        iterator = object.nodes().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            boolean bl3;
            iterable = iterator.next();
            Iterator iterator2 = graph.successors(iterable).iterator();
            while (bl3 = iterator2.hasNext()) {
                Object e2 = iterator2.next();
                Set set = object.nodes();
                boolean bl4 = set.contains(e2);
                if (!bl4) continue;
                object.putEdge(iterable, e2);
            }
        }
        return object;
    }

    public static MutableNetwork inducedSubgraph(Network network, Iterable iterator) {
        int n3;
        Iterable<Object> iterable;
        Object object;
        boolean bl2 = iterator instanceof Collection;
        if (bl2) {
            object = NetworkBuilder.from(network);
            iterable = iterator;
            iterable = (Collection)((Object)iterator);
            n3 = iterable.size();
            object = ((NetworkBuilder)object).expectedNodeCount(n3).build();
        } else {
            object = NetworkBuilder.from(network).build();
        }
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            iterable = iterator.next();
            object.addNode(iterable);
        }
        iterator = object.nodes().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            boolean bl3;
            iterable = iterator.next();
            Iterator iterator2 = network.outEdges(iterable).iterator();
            while (bl3 = iterator2.hasNext()) {
                Object e2 = iterator2.next();
                Object object2 = network.incidentNodes(e2).adjacentNode(iterable);
                Set set = object.nodes();
                boolean bl4 = set.contains(object2);
                if (!bl4) continue;
                object.addEdge(iterable, object2, e2);
            }
        }
        return object;
    }

    public static MutableValueGraph inducedSubgraph(ValueGraph valueGraph, Iterable iterator) {
        int n3;
        Iterable<Object> iterable;
        Object object;
        boolean bl2 = iterator instanceof Collection;
        if (bl2) {
            object = ValueGraphBuilder.from(valueGraph);
            iterable = iterator;
            iterable = (Collection)((Object)iterator);
            n3 = iterable.size();
            object = ((ValueGraphBuilder)object).expectedNodeCount(n3).build();
        } else {
            object = ValueGraphBuilder.from(valueGraph).build();
        }
        iterator = iterator.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            iterable = iterator.next();
            object.addNode(iterable);
        }
        iterator = object.nodes().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            boolean bl3;
            iterable = iterator.next();
            Iterator iterator2 = valueGraph.successors(iterable).iterator();
            while (bl3 = iterator2.hasNext()) {
                Object e2 = iterator2.next();
                Object object2 = object.nodes();
                boolean bl4 = object2.contains(e2);
                if (!bl4) continue;
                bl4 = false;
                object2 = valueGraph.edgeValueOrDefault(iterable, e2, null);
                Objects.requireNonNull(object2);
                object.putEdgeValue(iterable, e2, object2);
            }
        }
        return object;
    }

    public static Set reachableNodes(Graph graph, Object object) {
        Preconditions.checkArgument(graph.nodes().contains(object), "Node %s is not an element of this graph.", object);
        return ImmutableSet.copyOf(Traverser.forGraph(graph).breadthFirst(object));
    }

    private static boolean subgraphHasCycle(Graph object, Map map2, Object object2, Object object3) {
        boolean bl2;
        Graphs$NodeVisitState graphs$NodeVisitState;
        Object object4 = (Graphs$NodeVisitState)((Object)map2.get(object2));
        if (object4 == (graphs$NodeVisitState = Graphs$NodeVisitState.COMPLETE)) {
            return false;
        }
        graphs$NodeVisitState = Graphs$NodeVisitState.PENDING;
        boolean bl3 = true;
        if (object4 == graphs$NodeVisitState) {
            return bl3;
        }
        map2.put(object2, graphs$NodeVisitState);
        object4 = object.successors(object2).iterator();
        while (bl2 = object4.hasNext()) {
            graphs$NodeVisitState = object4.next();
            boolean bl4 = Graphs.canTraverseWithoutReusingEdge(object, (Object)graphs$NodeVisitState, object3);
            if (!bl4 || !(bl2 = Graphs.subgraphHasCycle(object, map2, (Object)graphs$NodeVisitState, object2))) continue;
            return bl3;
        }
        object = Graphs$NodeVisitState.COMPLETE;
        map2.put(object2, object);
        return false;
    }

    public static Graph transitiveClosure(Graph graph) {
        Object object = GraphBuilder.from(graph);
        boolean bl2 = true;
        object = ((GraphBuilder)object).allowsSelfLoops(bl2).build();
        boolean bl3 = graph.isDirected();
        if (bl3) {
            Iterator iterator = graph.nodes().iterator();
            while (bl3 = iterator.hasNext()) {
                boolean bl4;
                Object e2 = iterator.next();
                Iterator iterator2 = Graphs.reachableNodes(graph, e2).iterator();
                while (bl4 = iterator2.hasNext()) {
                    Object e5 = iterator2.next();
                    object.putEdge(e2, e5);
                }
            }
        } else {
            boolean bl5;
            HashSet hashSet = new HashSet();
            Iterator iterator = graph.nodes().iterator();
            while (bl5 = iterator.hasNext()) {
                boolean bl6;
                Object object2 = iterator.next();
                boolean bl7 = hashSet.contains(object2);
                if (bl7) continue;
                object2 = Graphs.reachableNodes(graph, object2);
                hashSet.addAll(object2);
                Iterator iterator3 = object2.iterator();
                int n3 = 1;
                while (bl6 = iterator3.hasNext()) {
                    boolean bl8;
                    Object e7 = iterator3.next();
                    int n4 = n3 + 1;
                    Iterator iterator4 = Iterables.limit((Iterable)object2, n3).iterator();
                    while (bl8 = iterator4.hasNext()) {
                        Object t3 = iterator4.next();
                        object.putEdge(e7, t3);
                    }
                    n3 = n4;
                }
            }
        }
        return object;
    }

    public static EndpointPair transpose(EndpointPair object) {
        boolean bl2 = ((EndpointPair)object).isOrdered();
        if (bl2) {
            Object object2 = ((EndpointPair)object).target();
            object = ((EndpointPair)object).source();
            object = EndpointPair.ordered(object2, object);
        }
        return object;
    }

    public static Graph transpose(Graph graph) {
        boolean bl2 = graph.isDirected();
        if (!bl2) {
            return graph;
        }
        bl2 = graph instanceof Graphs$TransposedGraph;
        if (bl2) {
            return Graphs$TransposedGraph.access$000((Graphs$TransposedGraph)graph);
        }
        Graphs$TransposedGraph graphs$TransposedGraph = new Graphs$TransposedGraph(graph);
        return graphs$TransposedGraph;
    }

    public static Network transpose(Network network) {
        boolean bl2 = network.isDirected();
        if (!bl2) {
            return network;
        }
        bl2 = network instanceof Graphs$TransposedNetwork;
        if (bl2) {
            return Graphs$TransposedNetwork.access$200((Graphs$TransposedNetwork)network);
        }
        Graphs$TransposedNetwork graphs$TransposedNetwork = new Graphs$TransposedNetwork(network);
        return graphs$TransposedNetwork;
    }

    public static ValueGraph transpose(ValueGraph valueGraph) {
        boolean bl2 = valueGraph.isDirected();
        if (!bl2) {
            return valueGraph;
        }
        bl2 = valueGraph instanceof Graphs$TransposedValueGraph;
        if (bl2) {
            return Graphs$TransposedValueGraph.access$100((Graphs$TransposedValueGraph)valueGraph);
        }
        Graphs$TransposedValueGraph graphs$TransposedValueGraph = new Graphs$TransposedValueGraph(valueGraph);
        return graphs$TransposedValueGraph;
    }
}

