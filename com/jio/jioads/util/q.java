/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.util;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class q
implements Runnable {
    public final /* synthetic */ Function0 a;

    public /* synthetic */ q(Function0 function0) {
        this.a = function0;
    }

    public final void run() {
        Function0 function0 = this.a;
        Intrinsics.checkNotNullParameter(function0, "$block");
        function0.invoke();
    }
}

