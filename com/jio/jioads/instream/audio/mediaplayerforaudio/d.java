/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnErrorListener
 */
package com.jio.jioads.instream.audio.mediaplayerforaudio;

import android.media.MediaPlayer;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instream.audio.mediaplayerforaudio.e;
import kotlin.jvm.internal.Intrinsics;

public final class d
implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ e a;

    public /* synthetic */ d(e e2) {
        this.a = e2;
    }

    public final boolean onError(MediaPlayer object, int n3, int n4) {
        int n7;
        e e2 = this.a;
        Intrinsics.checkNotNullParameter(e2, "this$0");
        String string2 = "Error in Audio media player. error: ";
        object = new StringBuilder(string2);
        ((StringBuilder)object).append(n3);
        n3 = 44;
        ((StringBuilder)object).append((char)n3);
        String string3 = "message";
        w12_0.b(n4, string3, (StringBuilder)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        e2.j = n7 = e2.d;
        e2.k = n7;
        object = e2.m;
        if (object != null) {
            object.d();
        }
        return true;
    }
}

