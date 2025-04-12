/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.BaseGraph;

public final class e {
    public static /* bridge */ /* synthetic */ Iterable a(BaseGraph baseGraph, Object object) {
        return baseGraph.predecessors(object);
    }

    public static /* bridge */ /* synthetic */ Iterable b(BaseGraph baseGraph, Object object) {
        return baseGraph.successors(object);
    }
}

