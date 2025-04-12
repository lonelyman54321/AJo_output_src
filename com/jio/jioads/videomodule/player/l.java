/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 */
package com.jio.jioads.videomodule.player;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.videomodule.player.n;
import com.jio.jioads.videomodule.player.view.a;
import kotlin.jvm.internal.Intrinsics;

public final class l
implements n,
SurfaceHolder.Callback {
    public MediaPlayer a;
    public final b b;
    public a c;

    public l(MediaPlayer mediaPlayer, b b2, a a2) {
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        this.a = mediaPlayer;
        this.b = b2;
        this.c = a2;
    }

    public final void a(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    public final void release() {
        a a2 = this.c;
        if (a2 != null && (a2 = a2.getHolder()) != null) {
            a2.addCallback(null);
        }
        this.c = null;
        this.a = null;
    }

    public final void surfaceChanged(SurfaceHolder object, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(object, "holder");
        StringBuilder stringBuilder = new StringBuilder();
        j_0.n(this.b, stringBuilder, ": onSurfaceTextureSizeChanged && hashcode = ");
        int n8 = object.getSurface().hashCode();
        stringBuilder.append(n8);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        MediaPlayer mediaPlayer;
        block4: {
            Intrinsics.checkNotNullParameter(surfaceHolder, "holder");
            StringBuilder stringBuilder = new StringBuilder();
            String string2 = ": Inside onSurfaceTextureAvailable of MediaPlayer";
            b b2 = this.b;
            j_0.i(b2, stringBuilder, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            try {
                mediaPlayer = this.a;
                if (mediaPlayer != null) break block4;
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        mediaPlayer.setDisplay(surfaceHolder);
    }

    public final void surfaceDestroyed(SurfaceHolder object) {
        Intrinsics.checkNotNullParameter(object, "holder");
        object = new StringBuilder();
        String string2 = ": Inside onSurfaceTextureDestroyed";
        b b2 = this.b;
        j_0.i(b2, (StringBuilder)object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.a;
        if (object != null) {
            string2 = null;
            object.setDisplay(null);
        }
    }
}

