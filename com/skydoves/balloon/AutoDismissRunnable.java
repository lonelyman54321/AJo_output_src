/*
 * Decompiled with CFR 0.152.
 */
package com.skydoves.balloon;

import com.skydoves.balloon.Balloon;
import kotlin.jvm.internal.Intrinsics;

public final class AutoDismissRunnable
implements Runnable {
    public final Balloon a;

    public AutoDismissRunnable(Balloon balloon2) {
        Intrinsics.checkNotNullParameter(balloon2, "balloon");
        this.a = balloon2;
    }

    public final void run() {
        this.a.h();
    }
}

