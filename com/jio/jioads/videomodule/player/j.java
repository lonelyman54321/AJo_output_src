/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnVideoSizeChangedListener
 */
package com.jio.jioads.videomodule.player;

import android.media.MediaPlayer;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.videomodule.player.k;
import kotlin.jvm.internal.Intrinsics;

public final class j
implements MediaPlayer.OnVideoSizeChangedListener {
    public final /* synthetic */ k a;

    public /* synthetic */ j(k k2) {
        this.a = k2;
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int n3, int n4) {
        String string2 = "message";
        k k2 = this.a;
        CharSequence charSequence = "this$0";
        Intrinsics.checkNotNullParameter(k2, (String)charSequence);
        charSequence = new StringBuilder();
        Object object = k2.d;
        object = object.P();
        ((StringBuilder)charSequence).append((String)object);
        object = ": Media Player ";
        ((StringBuilder)charSequence).append((String)object);
        int n7 = k2.b;
        ((StringBuilder)charSequence).append(n7);
        object = " OnVideoSizeChangedListener() ";
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(n3);
        Object object2 = ", ";
        ((StringBuilder)charSequence).append((String)object2);
        ((StringBuilder)charSequence).append(n4);
        object2 = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = JioAds.Companion;
        object2 = ((JioAds$Companion)object2).getInstance();
        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        n3 = mediaPlayer.getVideoWidth();
        k2.m = n3;
        int n8 = mediaPlayer.getVideoHeight();
        try {
            k2.n = n8;
        }
        catch (Exception exception) {
            object2 = new StringBuilder();
            String string3 = k2.d.P();
            ((StringBuilder)object2).append(string3);
            ((StringBuilder)object2).append(": ");
            string3 = "<this>";
            Intrinsics.checkNotNullParameter(exception, string3);
            b.e(exception, (StringBuilder)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
    }
}

