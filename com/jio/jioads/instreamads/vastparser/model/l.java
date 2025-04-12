/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l
extends Lambda
implements Function1 {
    public static final l c;

    static {
        l l2;
        c = l2 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "it");
        return Intrinsics.areEqual(object, "");
    }
}

