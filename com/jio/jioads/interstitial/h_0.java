/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.interstitial;

import com.jio.jioads.interstitial.InterstitialAdController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from com.jio.jioads.interstitial.H
 */
public final class h_0
extends Lambda
implements Function0 {
    public final /* synthetic */ InterstitialAdController c;

    public h_0(InterstitialAdController interstitialAdController) {
        this.c = interstitialAdController;
        super(0);
    }

    public final Object invoke() {
        return this.c.getHeaders();
    }
}

