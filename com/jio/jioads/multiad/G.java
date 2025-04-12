/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.multiad.H;
import kotlin.jvm.internal.Intrinsics;

public final class G
implements Runnable {
    public final /* synthetic */ H a;

    public /* synthetic */ G(H h3) {
        this.a = h3;
    }

    public final void run() {
        H h3 = this.a;
        Intrinsics.checkNotNullParameter(h3, "this$0");
        Object object = new StringBuilder();
        String string2 = h3.f;
        j_0.k(object, string2, ": Inside run of jsOperationHandler, sending response on timer end");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        h3.b(null, false);
    }
}

