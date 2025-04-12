/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioVmapAdsLoader;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$JioVmapListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from com.jio.jioads.adinterfaces.v
 */
public final class v_0
extends Lambda
implements Function0 {
    public final /* synthetic */ JioVmapAdsLoader c;

    public v_0(JioVmapAdsLoader jioVmapAdsLoader) {
        this.c = jioVmapAdsLoader;
        super(0);
    }

    public final Object invoke() {
        JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener = JioVmapAdsLoader.access$getJioVmapListener$p(this.c);
        if (jioVmapAdsLoader$JioVmapListener != null) {
            jioVmapAdsLoader$JioVmapListener.notifyPlayerTime();
        }
        return Unit.a;
    }
}

