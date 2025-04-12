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
import com.jio.jioads.controller.o;
import kotlin.jvm.internal.Intrinsics;

public final class E
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ JioAdView b;
    public final /* synthetic */ String c;

    public /* synthetic */ E(int n3, JioAdView jioAdView, String string2) {
        this.a = n3;
        this.b = jioAdView;
        this.c = string2;
    }

    public final void run() {
        JioAdView jioAdView = this.b;
        Intrinsics.checkNotNullParameter(jioAdView, "this$0");
        Object object = this.c;
        Object object2 = "$adId";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = 1;
        int n4 = this.a;
        if (n4 > n3 && (object2 = JioAdView.access$getMJioAdViewController$p(jioAdView)) != null) {
            ((o)object2).O((String)object);
        }
        object = new StringBuilder();
        j_0.h(jioAdView, (StringBuilder)object, ": Callback onAdChange");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = jioAdView.getMAdState();
        object2 = JioAdView$AdState.DESTROYED;
        if (object != object2 && (object = jioAdView.getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            ((JioAdListener)object).onAdChange(jioAdView, n4);
        }
    }
}

