/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.DirectedGraphConnections$NodeConnection;

final class DirectedGraphConnections$NodeConnection$Succ
extends DirectedGraphConnections$NodeConnection {
    public DirectedGraphConnections$NodeConnection$Succ(Object object) {
        super(object);
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof DirectedGraphConnections$NodeConnection$Succ;
        if (bl2) {
            Object object2 = this.node;
            object = ((DirectedGraphConnections$NodeConnection$Succ)object).node;
            return object2.equals(object);
        }
        return false;
    }

    public int hashCode() {
        int n3 = DirectedGraphConnections$NodeConnection$Succ.class.hashCode();
        return this.node.hashCode() + n3;
    }
}

