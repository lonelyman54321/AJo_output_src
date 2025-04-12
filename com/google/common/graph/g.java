/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.DirectedGraphConnections;

public final class g
implements Function {
    public final /* synthetic */ Object a;

    public /* synthetic */ g(Object object) {
        this.a = object;
    }

    public final Object apply(Object object) {
        return DirectedGraphConnections.c(this.a, object);
    }
}

