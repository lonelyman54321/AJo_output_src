/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.UndirectedGraphConnections;

public final class j
implements Function {
    public final /* synthetic */ Object a;

    public /* synthetic */ j(Object object) {
        this.a = object;
    }

    public final Object apply(Object object) {
        return UndirectedGraphConnections.a(this.a, object);
    }
}

