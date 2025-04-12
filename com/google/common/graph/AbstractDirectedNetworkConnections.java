/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.common.graph.AbstractDirectedNetworkConnections$1;
import com.google.common.graph.Graphs;
import com.google.common.graph.NetworkConnections;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

abstract class AbstractDirectedNetworkConnections
implements NetworkConnections {
    final Map inEdgeMap;
    final Map outEdgeMap;
    private int selfLoopCount;

    public AbstractDirectedNetworkConnections(Map map2, Map map3, int n3) {
        int n4;
        Map map4;
        this.inEdgeMap = map4 = (Map)Preconditions.checkNotNull(map2);
        this.outEdgeMap = map4 = (Map)Preconditions.checkNotNull(map3);
        this.selfLoopCount = n4 = Graphs.checkNonNegative(n3);
        int n7 = map2.size();
        if (n3 <= n7 && n3 <= (n7 = map3.size())) {
            n7 = 1;
        } else {
            n7 = 0;
            map2 = null;
        }
        Preconditions.checkState(n7 != 0);
    }

    public static /* synthetic */ int access$000(AbstractDirectedNetworkConnections abstractDirectedNetworkConnections) {
        return abstractDirectedNetworkConnections.selfLoopCount;
    }

    public void addInEdge(Object object, Object object2, boolean bl2) {
        Map map2;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        int n3 = 1;
        if (bl2) {
            int n4;
            this.selfLoopCount = n4 = this.selfLoopCount + n3;
            Graphs.checkPositive(n4);
        }
        if ((object = (map2 = this.inEdgeMap).put(object, object2)) != null) {
            n3 = 0;
        }
        Preconditions.checkState(n3 != 0);
    }

    public void addOutEdge(Object object, Object object2) {
        boolean bl2;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        Map map2 = this.outEdgeMap;
        object = map2.put(object, object2);
        if (object == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkState(bl2);
    }

    public Object adjacentNode(Object object) {
        object = this.outEdgeMap.get(object);
        Objects.requireNonNull(object);
        return object;
    }

    public Set adjacentNodes() {
        Set set = this.predecessors();
        Set set2 = this.successors();
        return Sets.union(set, set2);
    }

    public Set inEdges() {
        return Collections.unmodifiableSet(this.inEdgeMap.keySet());
    }

    public Set incidentEdges() {
        AbstractDirectedNetworkConnections$1 abstractDirectedNetworkConnections$1 = new AbstractDirectedNetworkConnections$1(this);
        return abstractDirectedNetworkConnections$1;
    }

    public Set outEdges() {
        return Collections.unmodifiableSet(this.outEdgeMap.keySet());
    }

    public Object removeInEdge(Object object, boolean bl2) {
        if (bl2) {
            int n3;
            this.selfLoopCount = n3 = this.selfLoopCount + -1;
            Graphs.checkNonNegative(n3);
        }
        object = this.inEdgeMap.remove(object);
        Objects.requireNonNull(object);
        return object;
    }

    public Object removeOutEdge(Object object) {
        object = this.outEdgeMap.remove(object);
        Objects.requireNonNull(object);
        return object;
    }
}

