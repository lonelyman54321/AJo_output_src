/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import kotlin.jvm.internal.Intrinsics;

public final class J
implements Runnable {
    public final /* synthetic */ JioAdView a;

    public /* synthetic */ J(JioAdView jioAdView) {
        this.a = jioAdView;
    }

    public final void run() {
        JioAdView jioAdView = this.a;
        Intrinsics.checkNotNullParameter(jioAdView, "this$0");
        Object object = new StringBuilder();
        j_0.h(jioAdView, (StringBuilder)object, ": Callback onAdSkippable");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = jioAdView.getMAdState();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState && (object = jioAdView.getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            ((JioAdListener)object).onAdSkippable(jioAdView);
        }
    }
}

