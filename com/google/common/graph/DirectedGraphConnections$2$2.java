/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.graph.DirectedGraphConnections$2;
import com.google.common.graph.DirectedGraphConnections$NodeConnection;
import com.google.common.graph.DirectedGraphConnections$NodeConnection$Pred;
import java.util.Iterator;

class DirectedGraphConnections$2$2
extends AbstractIterator {
    final /* synthetic */ Iterator val$nodeConnections;

    public DirectedGraphConnections$2$2(DirectedGraphConnections$2 directedGraphConnections$2, Iterator iterator) {
        this.val$nodeConnections = iterator;
    }

    public Object computeNext() {
        Object object;
        boolean bl2;
        while (bl2 = (object = this.val$nodeConnections).hasNext()) {
            object = (DirectedGraphConnections$NodeConnection)this.val$nodeConnections.next();
            boolean bl3 = object instanceof DirectedGraphConnections$NodeConnection$Pred;
            if (!bl3) continue;
            return ((DirectedGraphConnections$NodeConnection)object).node;
        }
        return this.endOfData();
    }
}

