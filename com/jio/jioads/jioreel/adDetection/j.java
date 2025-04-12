/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.adDetection;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.jioreel.adDetection.k;
import kotlin.jvm.internal.Intrinsics;

public final class j
implements Runnable {
    public final /* synthetic */ k a;

    public /* synthetic */ j(k k2) {
        this.a = k2;
    }

    public final void run() {
        k k2 = this.a;
        Intrinsics.checkNotNullParameter(k2, "this$0");
        k2.b.onAdMediaEnd();
        Intrinsics.checkNotNullParameter("SDK onAdMediaEnd", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        k2.L = null;
    }
}

