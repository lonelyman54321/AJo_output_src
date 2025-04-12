/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser;

import com.jio.jioads.instreamads.vastparser.model.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f
extends Lambda
implements Function1 {
    public static final f c;

    static {
        f f5;
        c = f5 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (object = (j)object) != null ? ((j)object).h : null;
        return Intrinsics.areEqual(object, "pid");
    }
}

