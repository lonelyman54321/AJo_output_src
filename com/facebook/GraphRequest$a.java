/*
 * Decompiled with CFR 0.152.
 */
package com.facebook;

import com.facebook.GraphRequest;
import kotlin.jvm.internal.Intrinsics;

public final class GraphRequest$a {
    public final GraphRequest a;
    public final Object b;

    public GraphRequest$a(GraphRequest graphRequest, Object object) {
        Intrinsics.checkNotNullParameter(graphRequest, "request");
        this.a = graphRequest;
        this.b = object;
    }
}

