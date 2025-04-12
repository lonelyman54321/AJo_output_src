/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioVmapAdsLoader;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$JioVmapListener;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.adinterfaces.w
 */
public final class w_0
implements Runnable {
    public final /* synthetic */ JioVmapAdsLoader a;
    public final /* synthetic */ List b;

    public /* synthetic */ w_0(JioVmapAdsLoader jioVmapAdsLoader, List list) {
        this.a = jioVmapAdsLoader;
        this.b = list;
    }

    public final void run() {
        JioVmapAdsLoader jioVmapAdsLoader = this.a;
        Intrinsics.checkNotNullParameter(jioVmapAdsLoader, "this$0");
        List list = this.b;
        Intrinsics.checkNotNullParameter(list, "$cuePoints");
        JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener = JioVmapAdsLoader.access$getJioVmapListener$p(jioVmapAdsLoader);
        if (jioVmapAdsLoader$JioVmapListener != null) {
            jioVmapAdsLoader$JioVmapListener.onJioVmapAdsLoaded(list);
        }
    }
}

