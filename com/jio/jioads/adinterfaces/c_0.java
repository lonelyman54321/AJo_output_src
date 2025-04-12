/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdView;

/*
 * Renamed from com.jio.jioads.adinterfaces.c
 */
public final class c_0
implements Runnable {
    public final /* synthetic */ JioAdView a;
    public final /* synthetic */ JioAdError b;

    public /* synthetic */ c_0(JioAdView jioAdView, JioAdError jioAdError) {
        this.a = jioAdView;
        this.b = jioAdError;
    }

    public final void run() {
        JioAdView jioAdView = this.a;
        JioAdError jioAdError = this.b;
        JioAdView.a(jioAdView, jioAdError);
    }
}

