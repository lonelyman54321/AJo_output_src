/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.native;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.interstitial.x;
import com.jio.jioads.native.NativeAdController;

public final class j
extends CountDownTimer {
    public final /* synthetic */ NativeAdController a;
    public final /* synthetic */ String b;

    public j(NativeAdController nativeAdController, String string2) {
        this.a = nativeAdController;
        this.b = string2;
        long l2 = 1000L;
        super(l2, l2);
    }

    public final void onFinish() {
        Object object;
        Object object2 = this.a;
        Object object3 = NativeAdController.access$getIJioAdView$p((NativeAdController)object2).k0();
        if (object3 != (object = JioAdView$AdState.DESTROYED)) {
            object3 = new StringBuilder();
            object = NativeAdController.access$getIJioAdView$p((NativeAdController)object2).P();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append(": ViewableImpression fired successfully: ");
            object = this.b;
            String string2 = "message";
            ir3_0.b((StringBuilder)object3, (String)object, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object2 = NativeAdController.access$getWebViewHandler$p((NativeAdController)object2);
            if (object2 != null) {
                ((x)object2).b((String)object);
            }
        }
    }

    public final void onTick(long l2) {
    }
}

