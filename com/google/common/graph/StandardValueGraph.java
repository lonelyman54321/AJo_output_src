/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.graph.AbstractGraphBuilder;
import com.google.common.graph.AbstractValueGraph;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.GraphConnections;
import com.google.common.graph.Graphs;
import com.google.common.graph.MapIteratorCache;
import com.google.common.graph.MapRetrievalCache;
import com.google.common.graph.StandardValueGraph$1;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class StandardValueGraph
extends AbstractValueGraph {
    private final boolean allowsSelfLoops;
    long edgeCount;
    private final boolean isDirected;
    final MapIteratorCache nodeConnections;
    private final ElementOrder nodeOrder;

    public StandardValueGraph(AbstractGraphBuilder abstractGraphBuilder) {
        Object object = abstractGraphBuilder.nodeOrder;
        Optional optional = abstractGraphBuilder.expectedNodeCount;
        Integer n3 = 10;
        int n4 = (Integer)optional.or(n3);
        object = ((ElementOrder)object).createMap(n4);
        this(abstractGraphBuilder, (Map)object, 0L);
    }

    public StandardValueGraph(AbstractGraphBuilder object, Map map2, long l2) {
        long l3;
        boolean bl2;
        this.isDirected = bl2 = ((AbstractGraphBuilder)object).directed;
        this.allowsSelfLoops = bl2 = ((AbstractGraphBuilder)object).allowsSelfLoops;
        this.nodeOrder = object = ((AbstractGraphBuilder)object).nodeOrder.cast();
        boolean bl3 = map2 instanceof TreeMap;
        object = bl3 ? new MapRetrievalCache(map2) : new MapIteratorCache(map2);
        this.nodeConnections = object;
        this.edgeCount = l3 = Graphs.checkNonNegative(l2);
    }

    private final GraphConnections checkedConnections(Object object) {
        Object object2 = (GraphConnections)this.nodeConnections.get(object);
        if (object2 != null) {
            return object2;
        }
        Preconditions.checkNotNull(object);
        StringBuilder stringBuilder = new StringBuilder("Node ");
        stringBuilder.append(object);
        stringBuilder.append(" is not an element of this graph.");
        object = stringBuilder.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    private final Object edgeValueOrDefaultInternal(Object object, Object object2, Object object3) {
        MapIteratorCache mapIteratorCache = this.nodeConnections;
        if ((object = (object = (GraphConnections)mapIteratorCache.get(object)) == null ? null : object.value(object2)) == null) {
            return object3;
        }
        return object;
    }

    private final boolean hasEdgeConnectingInternal(Object object, Object object2) {
        boolean bl2;
        MapIteratorCache mapIteratorCache = this.nodeConnections;
        if ((object = (GraphConnections)mapIteratorCache.get(object)) != null && (bl2 = (object = object.successors()).contains(object2))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public Set adjacentNodes(Object object) {
        return this.checkedConnections(object).adjacentNodes();
    }

    public boolean allowsSelfLoops() {
        return this.allowsSelfLoops;
    }

    public final boolean containsNode(Object object) {
        return this.nodeConnections.containsKey(object);
    }

    public long edgeCount() {
        return this.edgeCount;
    }

    public Object edgeValueOrDefault(EndpointPair object, Object object2) {
        this.validateEndpoints((EndpointPair)object);
        Object object3 = ((EndpointPair)object).nodeU();
        object = ((EndpointPair)object).nodeV();
        return this.edgeValueOrDefaultInternal(object3, object, object2);
    }

    public Object edgeValueOrDefault(Object object, Object object2, Object object3) {
        object = Preconditions.checkNotNull(object);
        object2 = Preconditions.checkNotNull(object2);
        return this.edgeValueOrDefaultInternal(object, object2, object3);
    }

    public boolean hasEdgeConnecting(EndpointPair object) {
        Object object2;
        boolean bl2;
        Preconditions.checkNotNull(object);
        boolean bl3 = this.isOrderingCompatible((EndpointPair)object);
        if (bl3 && (bl2 = this.hasEdgeConnectingInternal(object2 = ((EndpointPair)object).nodeU(), object = ((EndpointPair)object).nodeV()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public boolean hasEdgeConnecting(Object object, Object object2) {
        object = Preconditions.checkNotNull(object);
        object2 = Preconditions.checkNotNull(object2);
        return this.hasEdgeConnectingInternal(object, object2);
    }

    public Set incidentEdges(Object object) {
        GraphConnections graphConnections = this.checkedConnections(object);
        StandardValueGraph$1 standardValueGraph$1 = new StandardValueGraph$1(this, this, object, graphConnections);
        return standardValueGraph$1;
    }

    public boolean isDirected() {
        return this.isDirected;
    }

    public ElementOrder nodeOrder() {
        return this.nodeOrder;
    }

    public Set nodes() {
        return this.nodeConnections.unmodifiableKeySet();
    }

    public Set predecessors(Object object) {
        return this.checkedConnections(object).predecessors();
    }

    public Set successors(Object object) {
        return this.checkedConnections(object).successors();
    }
}

