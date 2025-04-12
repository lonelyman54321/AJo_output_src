/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.graph.DirectedGraphConnections$1;
import com.google.common.graph.DirectedGraphConnections$NodeConnection;
import java.util.Iterator;
import java.util.Set;

class DirectedGraphConnections$1$1
extends AbstractIterator {
    final /* synthetic */ Iterator val$nodeConnections;
    final /* synthetic */ Set val$seenNodes;

    public DirectedGraphConnections$1$1(DirectedGraphConnections$1 directedGraphConnections$1, Iterator iterator, Set set) {
        this.val$nodeConnections = iterator;
        this.val$seenNodes = set;
    }

    public Object computeNext() {
        Object object;
        boolean bl2;
        while (bl2 = (object = this.val$nodeConnections).hasNext()) {
            object = (DirectedGraphConnections$NodeConnection)this.val$nodeConnections.next();
            Set set = this.val$seenNodes;
            Object object2 = ((DirectedGraphConnections$NodeConnection)object).node;
            boolean bl3 = set.add(object2);
            if (!bl3) continue;
            return ((DirectedGraphConnections$NodeConnection)object).node;
        }
        return this.endOfData();
    }
}

