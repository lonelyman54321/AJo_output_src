/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.Multiset;
import com.google.common.graph.DirectedMultiNetworkConnections;
import com.google.common.graph.MultiEdgesConnecting;
import java.util.Map;

class DirectedMultiNetworkConnections$1
extends MultiEdgesConnecting {
    final /* synthetic */ DirectedMultiNetworkConnections this$0;
    final /* synthetic */ Object val$node;

    public DirectedMultiNetworkConnections$1(DirectedMultiNetworkConnections directedMultiNetworkConnections, Map map2, Object object, Object object2) {
        this.this$0 = directedMultiNetworkConnections;
        this.val$node = object2;
        super(map2, object);
    }

    public int size() {
        Multiset multiset = DirectedMultiNetworkConnections.access$000(this.this$0);
        Object object = this.val$node;
        return multiset.count(object);
    }
}

