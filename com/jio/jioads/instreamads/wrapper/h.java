/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.wrapper;

import com.jio.jioads.instreamads.wrapper.f;
import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class h
implements Comparator {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ h(f f5) {
        this.a = f5;
    }

    public final int compare(Object object, Object object2) {
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$tmp0");
        return ((Number)function2.invoke(object, object2)).intValue();
    }
}

