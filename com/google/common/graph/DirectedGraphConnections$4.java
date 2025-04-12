/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.graph.DirectedGraphConnections;
import com.google.common.graph.EndpointPair;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

class DirectedGraphConnections$4
extends AbstractIterator {
    final /* synthetic */ AtomicBoolean val$alreadySeenSelfLoop;
    final /* synthetic */ Iterator val$resultWithDoubleSelfLoop;

    public DirectedGraphConnections$4(DirectedGraphConnections directedGraphConnections, Iterator iterator, AtomicBoolean atomicBoolean) {
        this.val$resultWithDoubleSelfLoop = iterator;
        this.val$alreadySeenSelfLoop = atomicBoolean;
    }

    public EndpointPair computeNext() {
        Object object;
        boolean bl2;
        while (bl2 = (object = this.val$resultWithDoubleSelfLoop).hasNext()) {
            boolean bl3;
            Object object2;
            object = (EndpointPair)this.val$resultWithDoubleSelfLoop.next();
            Object object3 = ((EndpointPair)object).nodeU();
            boolean bl4 = object3.equals(object2 = ((EndpointPair)object).nodeV());
            if (bl4 && (bl4 = ((AtomicBoolean)(object3 = this.val$alreadySeenSelfLoop)).getAndSet(bl3 = true))) continue;
            return object;
        }
        return (EndpointPair)this.endOfData();
    }
}

