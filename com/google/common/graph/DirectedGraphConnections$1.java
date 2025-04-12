/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.DirectedGraphConnections;
import com.google.common.graph.DirectedGraphConnections$1$1;
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;

class DirectedGraphConnections$1
extends AbstractSet {
    final /* synthetic */ DirectedGraphConnections this$0;

    public DirectedGraphConnections$1(DirectedGraphConnections directedGraphConnections) {
        this.this$0 = directedGraphConnections;
    }

    public boolean contains(Object object) {
        return DirectedGraphConnections.access$100(this.this$0).containsKey(object);
    }

    public UnmodifiableIterator iterator() {
        Iterator iterator = DirectedGraphConnections.access$000(this.this$0).iterator();
        HashSet hashSet = new HashSet();
        DirectedGraphConnections$1$1 directedGraphConnections$1$1 = new DirectedGraphConnections$1$1(this, iterator, hashSet);
        return directedGraphConnections$1$1;
    }

    public int size() {
        return DirectedGraphConnections.access$100(this.this$0).size();
    }
}

