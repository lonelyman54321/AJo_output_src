/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.interstitial;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.interstitial.InterstitialActivity;
import com.jio.jioads.interstitial.x;

public final class r
extends CountDownTimer {
    public final /* synthetic */ InterstitialActivity a;
    public final /* synthetic */ String b;

    public r(InterstitialActivity interstitialActivity, String string2) {
        this.a = interstitialActivity;
        this.b = string2;
        long l2 = 1000L;
        super(l2, l2);
    }

    public final void onFinish() {
        boolean bl2;
        InterstitialActivity interstitialActivity = this.a;
        Object object = InterstitialActivity.access$getIJioAdView$p(interstitialActivity);
        if (object != null) {
            object = object.k0();
        } else {
            bl2 = false;
            object = null;
        }
        Object object2 = JioAdView$AdState.DESTROYED;
        if (object != object2) {
            object = new StringBuilder();
            object2 = InterstitialActivity.access$getIJioAdView$p(interstitialActivity);
            object2 = object2 != null ? object2.P() : null;
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(": ViewableImpression fired successfully: ");
            object2 = this.b;
            String string2 = "message";
            ir3_0.b((StringBuilder)object, (String)object2, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            bl2 = true;
            InterstitialActivity.access$setViewableImpressionFired$p(interstitialActivity, bl2);
            object = InterstitialActivity.access$getWebViewHandler$p(interstitialActivity);
            if (object != null) {
                ((x)object).b((String)object2);
            }
            InterstitialActivity.access$setViewableImpressionTimer$p(interstitialActivity, null);
        }
    }

    public final void onTick(long l2) {
    }
}

