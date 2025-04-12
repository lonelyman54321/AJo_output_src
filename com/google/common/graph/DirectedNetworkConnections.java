/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.graph.AbstractDirectedNetworkConnections;
import com.google.common.graph.EdgesConnecting;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

final class DirectedNetworkConnections
extends AbstractDirectedNetworkConnections {
    public DirectedNetworkConnections(Map map2, Map map3, int n3) {
        super(map2, map3, n3);
    }

    public static DirectedNetworkConnections of() {
        int n3 = 2;
        HashBiMap hashBiMap = HashBiMap.create(n3);
        HashBiMap hashBiMap2 = HashBiMap.create(n3);
        DirectedNetworkConnections directedNetworkConnections = new DirectedNetworkConnections(hashBiMap, hashBiMap2, 0);
        return directedNetworkConnections;
    }

    public static DirectedNetworkConnections ofImmutable(Map map2, Map map3, int n3) {
        map2 = ImmutableBiMap.copyOf(map2);
        map3 = ImmutableBiMap.copyOf(map3);
        DirectedNetworkConnections directedNetworkConnections = new DirectedNetworkConnections(map2, map3, n3);
        return directedNetworkConnections;
    }

    public Set edgesConnecting(Object object) {
        BiMap biMap = ((BiMap)this.outEdgeMap).inverse();
        EdgesConnecting edgesConnecting = new EdgesConnecting(biMap, object);
        return edgesConnecting;
    }

    public Set predecessors() {
        return Collections.unmodifiableSet(((BiMap)this.inEdgeMap).values());
    }

    public Set successors() {
        return Collections.unmodifiableSet(((BiMap)this.outEdgeMap).values());
    }
}

