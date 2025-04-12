/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Map;

final class EdgesConnecting
extends AbstractSet {
    private final Map nodeToOutEdge;
    private final Object targetNode;

    public EdgesConnecting(Map object, Object object2) {
        object = (Map)Preconditions.checkNotNull(object);
        this.nodeToOutEdge = object;
        this.targetNode = object = Preconditions.checkNotNull(object2);
    }

    private Object getConnectingEdge() {
        Map map2 = this.nodeToOutEdge;
        Object object = this.targetNode;
        return map2.get(object);
    }

    public boolean contains(Object object) {
        boolean bl2;
        Object object2 = this.getConnectingEdge();
        if (object2 != null && (bl2 = object2.equals(object))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public UnmodifiableIterator iterator() {
        Object object = this.getConnectingEdge();
        object = object == null ? ImmutableSet.of().iterator() : Iterators.singletonIterator(object);
        return object;
    }

    public int size() {
        int n3;
        Object object = this.getConnectingEdge();
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = 1;
        }
        return n3;
    }
}

