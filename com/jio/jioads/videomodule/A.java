/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule;

import com.jio.jioads.instreamads.vastparser.model.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class A
extends Lambda
implements Function1 {
    public static final A c;

    static {
        A a2;
        c = a2 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (k)object;
        Intrinsics.checkNotNullParameter(object, "it");
        return Intrinsics.areEqual(((k)object).p, "pgm_placeholder_campaign") ^ true;
    }
}

