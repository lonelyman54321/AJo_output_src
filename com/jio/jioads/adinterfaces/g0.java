/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.adinterfaces;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;

public final class g0
extends CountDownTimer {
    public final /* synthetic */ JioAdView a;

    public g0(JioAdView jioAdView, long l2) {
        this.a = jioAdView;
        super(l2, 1000L);
    }

    public final void onFinish() {
        JioAdView jioAdView = this.a;
        Object object = JioAdView.access$getCacheAdRequestTimer$p(jioAdView);
        if (object != null) {
            object.cancel();
        }
        boolean bl2 = false;
        JioAdView.access$setCacheAdRequestTimer$p(jioAdView, null);
        object = jioAdView.getMAdState();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object == jioAdView$AdState) {
            return;
        }
        bl2 = JioAdView.access$isAdCurrentlyRunning(jioAdView);
        if (!(bl2 || (object = jioAdView.getMAdState()) != (jioAdView$AdState = JioAdView$AdState.REQUESTED) && (object = jioAdView.getMAdState()) != (jioAdView$AdState = JioAdView$AdState.RECEIVED) && (object = jioAdView.getMAdState()) == (jioAdView$AdState = JioAdView$AdState.FAILED))) {
            JioAdView.access$handleCacheAdRequestTimeOut(jioAdView);
        }
    }

    public final void onTick(long l2) {
        boolean bl2;
        Object object;
        JioAdView jioAdView = this.a;
        Object object2 = jioAdView.getMAdState();
        if (object2 == (object = JioAdView$AdState.DESTROYED)) {
            object2 = JioAdView.access$getCacheAdRequestTimer$p(jioAdView);
            if (object2 != null) {
                object2.cancel();
            }
            JioAdView.access$setCacheAdRequestTimer$p(jioAdView, null);
            return;
        }
        object2 = jioAdView.getMAdState();
        if (object2 == (object = JioAdView$AdState.PREPARED) || (object2 = jioAdView.getMAdState()) == (object = JioAdView$AdState.FAILED) || (bl2 = JioAdView.access$isAdCurrentlyRunning(jioAdView))) {
            object2 = new StringBuilder();
            object = ": canceling cacheAd request timer!";
            j_0.h(jioAdView, (StringBuilder)object2, (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = JioAdView.access$getCacheAdRequestTimer$p(jioAdView);
            if (object2 != null) {
                object2.cancel();
            }
            JioAdView.access$setCacheAdRequestTimer$p(jioAdView, null);
        }
    }
}

