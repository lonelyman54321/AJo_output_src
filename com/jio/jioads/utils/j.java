/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.utils;

import com.jio.jioads.utils.l;
import kotlin.jvm.internal.Intrinsics;

public final class j
implements Runnable {
    public final /* synthetic */ l a;

    public /* synthetic */ j(l l2) {
        this.a = l2;
    }

    public final void run() {
        l l2 = this.a;
        Intrinsics.checkNotNullParameter(l2, "this$0");
        l2.c();
    }
}

