/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

import com.jio.jioads.interstitial.InterstitialActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z
extends Lambda
implements Function0 {
    public final /* synthetic */ InterstitialActivity c;

    public z(InterstitialActivity interstitialActivity) {
        this.c = interstitialActivity;
        super(0);
    }

    public final Object invoke() {
        InterstitialActivity.access$setAdSkipCounterRunning$p(this.c, false);
        return Unit.a;
    }
}

