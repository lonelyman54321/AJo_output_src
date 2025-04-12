/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.graph.AbstractGraphBuilder;
import com.google.common.graph.DirectedGraphConnections;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.GraphConnections;
import com.google.common.graph.Graphs;
import com.google.common.graph.MapIteratorCache;
import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.StandardValueGraph;
import com.google.common.graph.UndirectedGraphConnections;
import java.util.Collection;
import java.util.Objects;

final class StandardMutableValueGraph
extends StandardValueGraph
implements MutableValueGraph {
    private final ElementOrder incidentEdgeOrder;

    public StandardMutableValueGraph(AbstractGraphBuilder object) {
        super((AbstractGraphBuilder)object);
        this.incidentEdgeOrder = object = ((AbstractGraphBuilder)object).incidentEdgeOrder.cast();
    }

    private GraphConnections addNodeInternal(Object object) {
        boolean bl2;
        MapIteratorCache mapIteratorCache = this.nodeConnections;
        GraphConnections graphConnections = this.newConnections();
        if ((object = mapIteratorCache.put(object, graphConnections)) == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkState(bl2);
        return graphConnections;
    }

    private GraphConnections newConnections() {
        boolean bl2 = this.isDirected();
        GraphConnections graphConnections = bl2 ? DirectedGraphConnections.of(this.incidentEdgeOrder) : UndirectedGraphConnections.of(this.incidentEdgeOrder);
        return graphConnections;
    }

    public boolean addNode(Object object) {
        String string2 = "node";
        Preconditions.checkNotNull(object, string2);
        boolean bl2 = this.containsNode(object);
        if (bl2) {
            return false;
        }
        this.addNodeInternal(object);
        return true;
    }

    public ElementOrder incidentEdgeOrder() {
        return this.incidentEdgeOrder;
    }

    public Object putEdgeValue(EndpointPair object, Object object2) {
        this.validateEndpoints((EndpointPair)object);
        Object object3 = ((EndpointPair)object).nodeU();
        object = ((EndpointPair)object).nodeV();
        return this.putEdgeValue(object3, object, object2);
    }

    public Object putEdgeValue(Object object, Object object2, Object object3) {
        Object object4;
        Preconditions.checkNotNull(object, "nodeU");
        Preconditions.checkNotNull(object2, "nodeV");
        Object object5 = "value";
        Preconditions.checkNotNull(object3, object5);
        boolean bl2 = this.allowsSelfLoops();
        if (!bl2) {
            bl2 = object.equals(object2) ^ true;
            object4 = "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.";
            Preconditions.checkArgument(bl2, (String)object4, object);
        }
        if ((object5 = (GraphConnections)this.nodeConnections.get(object)) == null) {
            object5 = this.addNodeInternal(object);
        }
        object5 = object5.addSuccessor(object2, object3);
        object4 = (GraphConnections)this.nodeConnections.get(object2);
        if (object4 == null) {
            object4 = this.addNodeInternal(object2);
        }
        object4.addPredecessor(object, object3);
        if (object5 == null) {
            long l2 = this.edgeCount;
            long l3 = 1L;
            this.edgeCount = l2 += l3;
            Graphs.checkPositive(l2);
        }
        return object5;
    }

    public Object removeEdge(EndpointPair object) {
        this.validateEndpoints((EndpointPair)object);
        Object object2 = ((EndpointPair)object).nodeU();
        object = ((EndpointPair)object).nodeV();
        return this.removeEdge(object2, object);
    }

    public Object removeEdge(Object object, Object object2) {
        Preconditions.checkNotNull(object, "nodeU");
        Preconditions.checkNotNull(object2, "nodeV");
        GraphConnections graphConnections = (GraphConnections)this.nodeConnections.get(object);
        GraphConnections graphConnections2 = (GraphConnections)this.nodeConnections.get(object2);
        if (graphConnections != null && graphConnections2 != null) {
            if ((object2 = graphConnections.removeSuccessor(object2)) != null) {
                graphConnections2.removePredecessor(object);
                long l2 = this.edgeCount;
                long l3 = 1L;
                this.edgeCount = l2 -= l3;
                Graphs.checkNonNegative(l2);
            }
            return object2;
        }
        return null;
    }

    public boolean removeNode(Object object) {
        GraphConnections graphConnections;
        boolean bl2;
        long l2;
        Object object2;
        Preconditions.checkNotNull(object, "node");
        GraphConnections graphConnections2 = (GraphConnections)this.nodeConnections.get(object);
        if (graphConnections2 == null) {
            return false;
        }
        boolean bl3 = this.allowsSelfLoops();
        long l3 = 1L;
        if (bl3 && (object2 = graphConnections2.removeSuccessor(object)) != null) {
            graphConnections2.removePredecessor(object);
            this.edgeCount = l2 = this.edgeCount - l3;
        }
        object2 = ImmutableList.copyOf((Collection)graphConnections2.successors()).iterator();
        while (bl2 = object2.hasNext()) {
            Object object3 = object2.next();
            graphConnections = (GraphConnections)this.nodeConnections.getWithoutCaching(object3);
            Objects.requireNonNull(graphConnections);
            graphConnections.removePredecessor(object);
            object3 = graphConnections2.removeSuccessor(object3);
            Objects.requireNonNull(object3);
            this.edgeCount = l2 = this.edgeCount - l3;
        }
        bl3 = this.isDirected();
        bl2 = true;
        if (bl3) {
            boolean bl4;
            object2 = ImmutableList.copyOf((Collection)graphConnections2.predecessors()).iterator();
            while (bl4 = object2.hasNext()) {
                long l4;
                boolean bl5;
                graphConnections = object2.next();
                Object object4 = (GraphConnections)this.nodeConnections.getWithoutCaching(graphConnections);
                Objects.requireNonNull(object4);
                object4 = object4.removeSuccessor(object);
                if (object4 != null) {
                    bl5 = true;
                } else {
                    bl5 = false;
                    object4 = null;
                }
                Preconditions.checkState(bl5);
                graphConnections2.removePredecessor(graphConnections);
                this.edgeCount = l4 = this.edgeCount - l3;
            }
        }
        this.nodeConnections.remove(object);
        Graphs.checkNonNegative(this.edgeCount);
        return bl2;
    }
}

