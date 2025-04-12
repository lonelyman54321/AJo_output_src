/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.DirectedGraphConnections;

public final class f
implements Function {
    public final /* synthetic */ Object a;

    public /* synthetic */ f(Object object) {
        this.a = object;
    }

    public final Object apply(Object object) {
        return DirectedGraphConnections.a(this.a, object);
    }
}

