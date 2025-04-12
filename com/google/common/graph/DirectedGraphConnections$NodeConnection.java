/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Preconditions;

abstract class DirectedGraphConnections$NodeConnection {
    final Object node;

    public DirectedGraphConnections$NodeConnection(Object object) {
        this.node = object = Preconditions.checkNotNull(object);
    }
}

