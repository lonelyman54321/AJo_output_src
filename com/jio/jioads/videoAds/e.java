/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.videoAds;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.videoAds.h;
import com.jio.jioads.videomodule.i_0;

public final class e
extends CountDownTimer {
    public final /* synthetic */ h a;

    public e(h h3, long l2) {
        this.a = h3;
        super(l2, 1000L);
    }

    public final void onFinish() {
        Object object = this.a;
        h.i((h)object);
        Object object2 = new StringBuilder();
        b b2 = ((h)object).c;
        String string2 = ": ExoPlayer buffering timer finish closing ad!";
        j_0.i(b2, object2, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object = ((h)object).b;
        if (object != null) {
            boolean bl2 = true;
            ((i_0)object).a(bl2);
        }
    }

    public final void onTick(long l2) {
        Object object = new StringBuilder();
        j_0.i(this.a.c, object, ": buffering exo player");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }
}

