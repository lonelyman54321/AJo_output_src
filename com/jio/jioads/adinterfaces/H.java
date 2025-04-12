/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import kotlin.jvm.internal.Intrinsics;

public final class H
implements Runnable {
    public final /* synthetic */ JioAdView a;

    public /* synthetic */ H(JioAdView jioAdView) {
        this.a = jioAdView;
    }

    public final void run() {
        JioAdView jioAdView = this.a;
        Intrinsics.checkNotNullParameter(jioAdView, "this$0");
        JioAdView.access$endFiboTimer(jioAdView);
        Object object = jioAdView.getMAdState();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState) {
            object = jioAdView.getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (object != null) {
                ((JioAdListener)object).onAdPrepared(jioAdView);
            }
            object = null;
            jioAdView.setOnAdFailedCalled(false);
        }
    }
}

