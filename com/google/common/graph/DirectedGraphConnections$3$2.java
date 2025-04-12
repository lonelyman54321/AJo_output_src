/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.graph.DirectedGraphConnections$3;
import com.google.common.graph.DirectedGraphConnections$NodeConnection;
import com.google.common.graph.DirectedGraphConnections$NodeConnection$Succ;
import java.util.Iterator;

class DirectedGraphConnections$3$2
extends AbstractIterator {
    final /* synthetic */ Iterator val$nodeConnections;

    public DirectedGraphConnections$3$2(DirectedGraphConnections$3 directedGraphConnections$3, Iterator iterator) {
        this.val$nodeConnections = iterator;
    }

    public Object computeNext() {
        Object object;
        boolean bl2;
        while (bl2 = (object = this.val$nodeConnections).hasNext()) {
            object = (DirectedGraphConnections$NodeConnection)this.val$nodeConnections.next();
            boolean bl3 = object instanceof DirectedGraphConnections$NodeConnection$Succ;
            if (!bl3) continue;
            return ((DirectedGraphConnections$NodeConnection)object).node;
        }
        return this.endOfData();
    }
}

