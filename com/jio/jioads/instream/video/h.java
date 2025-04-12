/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 */
package com.jio.jioads.instream.video;

import android.os.CountDownTimer;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.common.b;
import com.jio.jioads.instream.video.InstreamVideo;
import com.jio.jioads.instream.video.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h
extends Lambda
implements Function0 {
    public final /* synthetic */ InstreamVideo c;

    public h(InstreamVideo instreamVideo) {
        this.c = instreamVideo;
        super(0);
    }

    public final Object invoke() {
        long l2;
        long l3;
        long l4;
        long l7;
        InstreamVideo instreamVideo = this.c;
        b b2 = InstreamVideo.access$getIJioAdView$p(instreamVideo);
        int n3 = b2.k();
        if (n3 > 0 && (l7 = (l4 = (l3 = InstreamVideo.access$getRequiredAdDuration(instreamVideo)) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0 && (n3 = (int)(InstreamVideo.access$isAdPrepared$p(instreamVideo) ? 1 : 0)) == 0 && (b2 = InstreamVideo.access$getPodSelectionTimer$p(instreamVideo)) == null && (n3 = (int)((b2 = InstreamVideo.access$getIJioAdView$p(instreamVideo)).f0() ? 1 : 0)) == 0) {
            n3 = InstreamVideo.access$getIJioAdView$p(instreamVideo).k();
            Object object = new StringBuilder();
            Object object2 = InstreamVideo.access$getIJioAdView$p(instreamVideo).P();
            object.append((String)object2);
            object.append(": PodTimeout considered: ");
            object.append(n3);
            Intrinsics.checkNotNullParameter(object.toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            l3 = n3;
            l2 = 1000L;
            object2 = new g(instreamVideo, l3 *= l2);
            b2 = object2.start();
            InstreamVideo.access$setPodSelectionTimer$p(instreamVideo, (CountDownTimer)b2);
        }
        return Unit.a;
    }
}

