/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.controller;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i
extends Lambda
implements Function1 {
    public static final i c;

    static {
        i i3;
        c = i3 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "it");
        return object;
    }
}

