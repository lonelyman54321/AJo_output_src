/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.DirectedGraphConnections;
import com.google.common.graph.DirectedGraphConnections$NodeConnection;

public final class h
implements Function {
    public final /* synthetic */ Object a;

    public /* synthetic */ h(Object object) {
        this.a = object;
    }

    public final Object apply(Object object) {
        Object object2 = this.a;
        object = (DirectedGraphConnections$NodeConnection)object;
        return DirectedGraphConnections.b(object2, (DirectedGraphConnections$NodeConnection)object);
    }
}

