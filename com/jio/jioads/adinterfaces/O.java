/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import kotlin.jvm.internal.Intrinsics;

public final class O
implements Runnable {
    public final /* synthetic */ JioAdView a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ O(JioAdView jioAdView, boolean bl2, boolean bl3) {
        this.a = jioAdView;
        this.b = bl2;
        this.c = bl3;
    }

    public final void run() {
        JioAdView jioAdView = this.a;
        Intrinsics.checkNotNullParameter(jioAdView, "this$0");
        JioAdView.access$setPreparedCallBackGiven$p(jioAdView, false);
        Object object = new StringBuilder();
        String string2 = jioAdView.getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        ((StringBuilder)object).append(string2);
        string2 = ": Callback onAdClosed isVideoCompleted: ";
        ((StringBuilder)object).append(string2);
        boolean bl2 = this.b;
        ((StringBuilder)object).append(bl2);
        String string3 = " isEligibleForReward: ";
        ((StringBuilder)object).append(string3);
        boolean bl3 = this.c;
        ((StringBuilder)object).append(bl3);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = jioAdView.getMAdState();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState && (object = jioAdView.getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            ((JioAdListener)object).onAdClosed(jioAdView, bl2, bl3);
        }
    }
}

