/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 */
package com.jio.jioads.instream.audio.mediaplayerforaudio;

import android.media.MediaPlayer;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instream.audio.mediaplayerforaudio.e;
import kotlin.jvm.internal.Intrinsics;

public final class c
implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ e a;

    public /* synthetic */ c(e e2) {
        this.a = e2;
    }

    public final void onCompletion(MediaPlayer object) {
        int n3;
        e e2 = this.a;
        Intrinsics.checkNotNullParameter(e2, "this$0");
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Audio media player completed", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        e2.j = n3 = e2.i;
        e2.k = n3;
        object = e2.m;
        if (object != null) {
            e2 = null;
            object.a(false);
        }
    }
}

