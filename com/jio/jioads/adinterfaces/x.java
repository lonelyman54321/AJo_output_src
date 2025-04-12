/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdEvent;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$JioVmapListener;
import kotlin.jvm.internal.Intrinsics;

public final class x
implements Runnable {
    public final /* synthetic */ JioVmapAdsLoader a;
    public final /* synthetic */ JioAdEvent b;

    public /* synthetic */ x(JioVmapAdsLoader jioVmapAdsLoader, JioAdEvent jioAdEvent) {
        this.a = jioVmapAdsLoader;
        this.b = jioAdEvent;
    }

    public final void run() {
        JioVmapAdsLoader jioVmapAdsLoader = this.a;
        Intrinsics.checkNotNullParameter(jioVmapAdsLoader, "this$0");
        JioAdEvent jioAdEvent = this.b;
        Intrinsics.checkNotNullParameter(jioAdEvent, "$event");
        JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener = JioVmapAdsLoader.access$getJioVmapListener$p(jioVmapAdsLoader);
        if (jioVmapAdsLoader$JioVmapListener != null) {
            jioVmapAdsLoader = null;
            jioVmapAdsLoader$JioVmapListener.onJioVmapEvent(jioAdEvent, null);
        }
    }
}

