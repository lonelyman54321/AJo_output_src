/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.media.MediaPlayer
 *  android.view.Surface
 *  android.view.TextureView$SurfaceTextureListener
 */
package com.jio.jioads.videomodule.player;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.videomodule.player.n;
import com.jio.jioads.videomodule.player.view.b;
import kotlin.jvm.internal.Intrinsics;

public final class m
implements n,
TextureView.SurfaceTextureListener {
    public MediaPlayer a;
    public final com.jio.jioads.common.b b;
    public b c;
    public Surface d;

    public m(MediaPlayer mediaPlayer, com.jio.jioads.common.b b2, b b3) {
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        this.a = mediaPlayer;
        this.b = b2;
        this.c = b3;
        this.d = null;
    }

    public final void a(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSurfaceTextureAvailable(SurfaceTexture object, int n3, int n4) {
        Intrinsics.checkNotNullParameter(object, "surface");
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = ": Inside onSurfaceTextureAvailable of MediaPlayer";
        com.jio.jioads.common.b b2 = this.b;
        j_0.i(b2, stringBuilder, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        try {
            Surface surface;
            void var4_14;
            Surface surface2;
            MediaPlayer mediaPlayer = this.a;
            if (mediaPlayer == null) {
                return;
            }
            b b3 = this.c;
            if (b3 == null) {
                return;
            }
            b b4 = this.c;
            if (b4 != null) {
                SurfaceTexture surfaceTexture = b4.getSurfaceTexture();
            } else {
                Object var4_13 = null;
            }
            this.d = surface2 = new Surface((SurfaceTexture)var4_14);
            MediaPlayer mediaPlayer2 = this.a;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setSurface(surface2);
            }
            if ((surface = this.d) == null) return;
            surface.release();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture object) {
        Intrinsics.checkNotNullParameter(object, "surface");
        object = new StringBuilder();
        String string2 = ": Inside onSurfaceTextureDestroyed";
        com.jio.jioads.common.b b2 = this.b;
        j_0.i(b2, (StringBuilder)object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.d;
        if (object != null) {
            object.release();
        }
        if ((object = this.a) != null) {
            string2 = null;
            object.setSurface(null);
        }
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture object, int n3, int n4) {
        Intrinsics.checkNotNullParameter(object, "surface");
        Object object2 = this.d;
        if (object2 != null) {
            object2.release();
        }
        object2 = new Surface(object);
        this.d = object2;
        object2 = new StringBuilder();
        j_0.n(this.b, (StringBuilder)object2, ": onSurfaceTextureSizeChanged && hashcode = ");
        int n7 = object.hashCode();
        ((StringBuilder)object2).append(n7);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surface");
        Surface surface = this.d;
        if (surface != null) {
            surface.release();
        }
        this.d = surface = new Surface(surfaceTexture);
    }

    public final void release() {
        b b2 = this.c;
        if (b2 != null) {
            b2.setSurfaceTextureListener(null);
        }
        if ((b2 = this.d) != null) {
            b2.release();
        }
        this.d = null;
        this.c = null;
        this.a = null;
    }
}

