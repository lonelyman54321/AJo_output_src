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

public final class Q
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ JioAdView b;

    public /* synthetic */ Q(JioAdView jioAdView, String string2) {
        this.a = string2;
        this.b = jioAdView;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$adspotId");
        JioAdView jioAdView = this.b;
        Intrinsics.checkNotNullParameter(jioAdView, "this$0");
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(" Callback onAdRefresh");
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = jioAdView.getMAdState();
        object = JioAdView$AdState.DESTROYED;
        if (object2 != object && (object2 = jioAdView.getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            ((JioAdListener)object2).onAdRefresh(jioAdView);
        }
    }
}

