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

public final class G
implements Runnable {
    public final /* synthetic */ JioAdView a;
    public final /* synthetic */ String b;

    public /* synthetic */ G(JioAdView jioAdView, String string2) {
        this.a = jioAdView;
        this.b = string2;
    }

    public final void run() {
        Object object;
        JioAdView jioAdView = this.a;
        Intrinsics.checkNotNullParameter(jioAdView, "this$0");
        Object object2 = JioAdView.access$getMJioAdViewController$p(jioAdView);
        if (object2 != null) {
            object = this.b;
            ((o)object2).O((String)object);
        }
        object2 = new StringBuilder();
        j_0.h(jioAdView, (StringBuilder)object2, ": Callback onAdRender");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = jioAdView.getMAdState();
        object = JioAdView$AdState.DESTROYED;
        if (object2 != object && (object2 = jioAdView.getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            ((JioAdListener)object2).onAdRender(jioAdView);
        }
    }
}

