/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioVmapAdsLoader;

/*
 * Renamed from com.jio.jioads.adinterfaces.h
 */
public final class h_0
implements Runnable {
    public final /* synthetic */ JioVmapAdsLoader a;

    public /* synthetic */ h_0(JioVmapAdsLoader jioVmapAdsLoader) {
        this.a = jioVmapAdsLoader;
    }

    public final void run() {
        JioVmapAdsLoader.c(this.a);
    }
}

