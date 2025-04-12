/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

import com.jio.jioads.interstitial.InterstitialActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from com.jio.jioads.interstitial.F
 */
public final class f_0
extends Lambda
implements Function0 {
    public final /* synthetic */ InterstitialActivity c;

    public f_0(InterstitialActivity interstitialActivity) {
        this.c = interstitialActivity;
        super(0);
    }

    public final Object invoke() {
        InterstitialActivity.access$loadAd(this.c);
        return Unit.a;
    }
}

