/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.ElementOrder$Type;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.GraphConnections;
import com.google.common.graph.UndirectedGraphConnections$1;
import com.google.common.graph.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

final class UndirectedGraphConnections
implements GraphConnections {
    private final Map adjacentNodeValues;

    private UndirectedGraphConnections(Map map2) {
        this.adjacentNodeValues = map2 = (Map)Preconditions.checkNotNull(map2);
    }

    public static /* synthetic */ EndpointPair a(Object object, Object object2) {
        return UndirectedGraphConnections.lambda$incidentEdgeIterator$0(object, object2);
    }

    private static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$0(Object object, Object object2) {
        return EndpointPair.unordered(object, object2);
    }

    public static UndirectedGraphConnections of(ElementOrder object) {
        Object object2 = UndirectedGraphConnections$1.$SwitchMap$com$google$common$graph$ElementOrder$Type;
        ElementOrder$Type elementOrder$Type = ((ElementOrder)object).type();
        int n3 = elementOrder$Type.ordinal();
        int n4 = object2[n3];
        n3 = 1;
        float f5 = 1.0f;
        int n7 = 2;
        if (n4 != n3) {
            if (n4 == n7) {
                object2 = new LinkedHashMap;
                object2(n7, f5);
                object = new UndirectedGraphConnections((Map)object2);
                return object;
            }
            object2 = new AssertionError;
            object = ((ElementOrder)object).type();
            object2(object);
            throw object2;
        }
        object2 = new HashMap;
        object2(n7, f5);
        object = new UndirectedGraphConnections((Map)object2);
        return object;
    }

    public static UndirectedGraphConnections ofImmutable(Map map2) {
        map2 = ImmutableMap.copyOf(map2);
        UndirectedGraphConnections undirectedGraphConnections = new UndirectedGraphConnections(map2);
        return undirectedGraphConnections;
    }

    public void addPredecessor(Object object, Object object2) {
        this.addSuccessor(object, object2);
    }

    public Object addSuccessor(Object object, Object object2) {
        return this.adjacentNodeValues.put(object, object2);
    }

    public Set adjacentNodes() {
        return Collections.unmodifiableSet(this.adjacentNodeValues.keySet());
    }

    public Iterator incidentEdgeIterator(Object object) {
        Iterator iterator = this.adjacentNodeValues.keySet().iterator();
        j j3 = new j(object);
        return Iterators.transform(iterator, j3);
    }

    public Set predecessors() {
        return this.adjacentNodes();
    }

    public void removePredecessor(Object object) {
        this.removeSuccessor(object);
    }

    public Object removeSuccessor(Object object) {
        return this.adjacentNodeValues.remove(object);
    }

    public Set successors() {
        return this.adjacentNodes();
    }

    public Object value(Object object) {
        return this.adjacentNodeValues.get(object);
    }
}

