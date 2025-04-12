/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.instream.audio;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.instream.audio.j;
import com.jio.jioads.util.Utility;
import kotlin.jvm.internal.Intrinsics;

public final class g
extends CountDownTimer {
    public final /* synthetic */ j a;

    public g(j j3, long l2) {
        this.a = j3;
        super(l2, 1000L);
    }

    public final void onFinish() {
        Object object;
        Object object2;
        Object object3;
        j j3 = this.a;
        boolean bl2 = j3.n;
        if (!bl2 && (object3 = (object2 = j3.b).k0()) != (object = JioAdView$AdState.DESTROYED)) {
            object = "message";
            Intrinsics.checkNotNullParameter("InStream Audio Ad Timed out", (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            try {
                j.d(j3);
            }
            catch (Exception exception) {
                object3 = new StringBuilder();
                object = ": startAudioAdPreprationTimer() Exception while cancel Audio Preparing: ";
                j_0.n((b)object2, (StringBuilder)object3, (String)object);
                object2 = Utility.INSTANCE;
                com.jio.jioads.jioreel.tracker.model.b.c((Utility)object2, exception, (StringBuilder)object3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            }
        }
    }

    public final void onTick(long l2) {
        Object object = new StringBuilder();
        j_0.i(this.a.b, object, " :Instream Audio Preparing...");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }
}

