/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAd;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import kotlin.jvm.internal.Intrinsics;

public final class D
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ JioAdView b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ JioAd d;

    public /* synthetic */ D(String string2, JioAdView jioAdView, boolean bl2, JioAd jioAd) {
        this.a = string2;
        this.b = jioAdView;
        this.c = bl2;
        this.d = jioAd;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$adspotId");
        JioAdView jioAdView = this.b;
        Intrinsics.checkNotNullParameter(jioAdView, "this$0");
        Object object2 = new StringBuilder();
        object2.append((String)object);
        object2.append(" Callback onAdDataPrepared");
        Intrinsics.checkNotNullParameter(object2.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = jioAdView.getMAdState();
        object = JioAdView$AdState.DESTROYED;
        if (object2 != object) {
            boolean bl2 = this.c;
            JioAdView.access$setLastAdDelivered$p(jioAdView, bl2);
            object = jioAdView.getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (object != null) {
                JioAd jioAd = this.d;
                ((JioAdListener)object).onAdDataPrepared(jioAd, bl2, jioAdView);
            }
        }
    }
}

