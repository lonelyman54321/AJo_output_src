/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graphs$TransposedGraph$1;

public final class i
implements Function {
    public final /* synthetic */ Graphs$TransposedGraph$1 a;

    public /* synthetic */ i(Graphs$TransposedGraph$1 graphs$TransposedGraph$1) {
        this.a = graphs$TransposedGraph$1;
    }

    public final Object apply(Object object) {
        Graphs$TransposedGraph$1 graphs$TransposedGraph$1 = this.a;
        object = (EndpointPair)object;
        return Graphs$TransposedGraph$1.a(graphs$TransposedGraph$1, (EndpointPair)object);
    }
}

