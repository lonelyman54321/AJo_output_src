/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import kotlin.jvm.internal.Intrinsics;

public final class F
implements Runnable {
    public final /* synthetic */ JioAdView a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ F(JioAdView jioAdView, long l2, long l3) {
        this.a = jioAdView;
        this.b = l2;
        this.c = l3;
    }

    public final void run() {
        JioAdView jioAdView = this.a;
        Intrinsics.checkNotNullParameter(jioAdView, "this$0");
        Object object = jioAdView.getMAdState();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState && (object = jioAdView.getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            long l2 = this.b;
            long l3 = this.c;
            ((JioAdListener)object).onAllAdMediaProgress(l2, l3);
        }
    }
}

