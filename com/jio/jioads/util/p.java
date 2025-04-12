/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p
extends Lambda
implements Function1 {
    public static final p c;

    static {
        p p2;
        c = p2 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = ((StackTraceElement)object).toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }
}

