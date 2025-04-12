/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.graph.NetworkConnections;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

abstract class AbstractUndirectedNetworkConnections
implements NetworkConnections {
    final Map incidentEdgeMap;

    public AbstractUndirectedNetworkConnections(Map map2) {
        this.incidentEdgeMap = map2 = (Map)Preconditions.checkNotNull(map2);
    }

    public void addInEdge(Object object, Object object2, boolean bl2) {
        if (!bl2) {
            this.addOutEdge(object, object2);
        }
    }

    public void addOutEdge(Object object, Object object2) {
        boolean bl2;
        Map map2 = this.incidentEdgeMap;
        if ((object = map2.put(object, object2)) == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkState(bl2);
    }

    public Object adjacentNode(Object object) {
        object = this.incidentEdgeMap.get(object);
        Objects.requireNonNull(object);
        return object;
    }

    public Set inEdges() {
        return this.incidentEdges();
    }

    public Set incidentEdges() {
        return Collections.unmodifiableSet(this.incidentEdgeMap.keySet());
    }

    public Set outEdges() {
        return this.incidentEdges();
    }

    public Set predecessors() {
        return this.adjacentNodes();
    }

    public Object removeInEdge(Object object, boolean bl2) {
        if (!bl2) {
            return this.removeOutEdge(object);
        }
        return null;
    }

    public Object removeOutEdge(Object object) {
        object = this.incidentEdgeMap.remove(object);
        Objects.requireNonNull(object);
        return object;
    }

    public Set successors() {
        return this.adjacentNodes();
    }
}

