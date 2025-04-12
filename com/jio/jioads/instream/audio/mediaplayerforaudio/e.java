/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 */
package com.jio.jioads.instream.audio.mediaplayerforaudio;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instream.audio.mediaplayerforaudio.a;
import com.jio.jioads.instream.audio.mediaplayerforaudio.b;
import com.jio.jioads.instream.audio.mediaplayerforaudio.c;
import com.jio.jioads.instream.audio.mediaplayerforaudio.d;
import kotlin.jvm.internal.Intrinsics;

public final class e
extends MediaPlayer
implements com.jio.jioads.instream.audio.audiointerfaces.a {
    public final Context a;
    public Uri b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public int j;
    public int k;
    public MediaPlayer l;
    public com.jio.jioads.videomodule.player.callback.a m;
    public final Handler n;
    public String o;
    public boolean p;
    public final a q;
    public final b r;
    public final c s;
    public final d t;

    public e(Context object) {
        this.a = object;
        this.d = -1;
        this.e = 1;
        this.f = 2;
        this.g = 3;
        this.h = 4;
        this.i = 5;
        this.j = 0;
        this.k = 0;
        Intrinsics.checkNotNullParameter("initAudioView() of JioInstreamAudioMediaPlayer", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        this.j = 0;
        this.k = 0;
        jioAds$LogLevel = Looper.getMainLooper();
        super((Looper)jioAds$LogLevel);
        this.n = object;
        super(this);
        this.q = object;
        super(this);
        this.r = object;
        super(this);
        this.s = object;
        super(this);
        this.t = object;
    }

    public final int a() {
        int n3 = this.c();
        if (n3 != 0) {
            n3 = this.c;
            if (n3 > 0) {
                return n3;
            }
            MediaPlayer mediaPlayer = this.l;
            if (mediaPlayer != null) {
                n3 = mediaPlayer.getDuration();
                Integer n4 = n3;
                Intrinsics.checkNotNull(n4);
                this.c = n3;
            }
            return this.c;
        }
        this.c = n3 = -1;
        return n3;
    }

    public final void a(com.jio.jioads.videomodule.player.callback.a a2) {
        this.m = a2;
    }

    public final void a(String string2) {
        this.o = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        try {
            MediaPlayer mediaPlayer;
            boolean bl2;
            MediaPlayer mediaPlayer2 = this.l;
            if (mediaPlayer2 == null) return;
            boolean bl3 = mediaPlayer2.isPlaying();
            if (bl3 == (bl2 = true) && (mediaPlayer = this.l) != null) {
                mediaPlayer.stop();
            }
            this.d();
            return;
        }
        catch (Exception exception) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("Error while releasing media player", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
    }

    /*
     * Loose catch block
     */
    public final void b(String object) {
        block26: {
            Object object2;
            String string2;
            int n3;
            block27: {
                n3 = this.d;
                string2 = "message";
                object = Uri.parse((String)object);
                this.b = object;
                object = "prepareMedia error ";
                object2 = "prepareMedia of AudioMedia player";
                Intrinsics.checkNotNullParameter(object2, string2);
                object2 = JioAds.Companion;
                Object object3 = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object3 = this.l;
                if (object3 != null) break block26;
                object3 = new MediaPlayer();
                this.l = object3;
                int n4 = -1;
                this.c = n4;
                this.e();
                object3 = this.l;
                if (object3 == null) break block27;
                object2 = this.a;
                Intrinsics.checkNotNull(object2);
                Uri uri = this.b;
                Intrinsics.checkNotNull(uri);
                object3.setDataSource((Context)object2, uri);
                object3.prepareAsync();
                int n7 = this.e;
                try {
                    this.j = n7;
                }
                catch (Exception exception) {
                    object3 = new StringBuilder((String)object);
                    object = exception.getMessage();
                    ((StringBuilder)object3).append((String)object);
                    object = ((StringBuilder)object3).toString();
                    Intrinsics.checkNotNullParameter(object, string2);
                    object = JioAds.Companion;
                    object = ((JioAds$Companion)object).getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    this.j = n3;
                    this.k = n3;
                    object = this.m;
                    if (object == null) break block26;
                    object.d();
                }
                break block26;
            }
            object = "prepareMedia error mMediaPlayer is null";
            Intrinsics.checkNotNullParameter(object, string2);
            object = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            {
                catch (Exception exception) {
                    Intrinsics.checkNotNullParameter("Exception while preparing audio media player", string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    this.j = n3;
                    this.k = n3;
                }
            }
        }
    }

    public final boolean c() {
        int n3;
        int n4;
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null && (n4 = this.j) != (n3 = this.d) && n4 != 0 && n4 != (n3 = this.e)) {
            n4 = 1;
        } else {
            n4 = 0;
            mediaPlayer = null;
        }
        return n4 != 0;
    }

    public final void d() {
        Object object = this.l;
        if (object != null) {
            Intrinsics.checkNotNullParameter("releasing audio media player", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = null;
            this.m = null;
            MediaPlayer mediaPlayer = this.l;
            if (mediaPlayer != null) {
                mediaPlayer.setOnCompletionListener(null);
            }
            if ((mediaPlayer = this.l) != null) {
                mediaPlayer.setOnPreparedListener(null);
            }
            if ((mediaPlayer = this.l) != null) {
                mediaPlayer.setOnErrorListener(null);
            }
            if ((mediaPlayer = this.l) != null) {
                mediaPlayer.reset();
            }
            if ((mediaPlayer = this.l) != null) {
                mediaPlayer.release();
            }
            this.l = null;
            object = null;
            this.j = 0;
            this.k = 0;
        }
    }

    public final void e() {
        Object object = new StringBuilder("inside setListeners: ");
        Object object2 = this.l;
        object.append(object2);
        object = object.toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.l;
        if (object != null) {
            object2 = this.r;
            object.setOnPreparedListener((MediaPlayer.OnPreparedListener)object2);
        }
        if ((object = this.l) != null) {
            object2 = this.s;
            object.setOnCompletionListener((MediaPlayer.OnCompletionListener)object2);
        }
        if ((object = this.l) != null) {
            object2 = this.t;
            object.setOnErrorListener((MediaPlayer.OnErrorListener)object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void f() {
        int n3;
        long l2;
        int n4;
        Object object = this.m;
        a a2 = this.q;
        if (object == null) {
            object = this.n;
            Intrinsics.checkNotNull(object);
            object.removeCallbacks((Runnable)a2);
            return;
        }
        object = this.l;
        long l3 = 0L;
        if (object == null) {
            object = l3;
        } else {
            n4 = object.getDuration();
            l2 = n4;
            object = l2;
        }
        MediaPlayer mediaPlayer = this.l;
        if (mediaPlayer != null) {
            n3 = mediaPlayer.getCurrentPosition();
            l3 = n3;
        }
        Long l4 = l3;
        com.jio.jioads.videomodule.player.callback.a a3 = this.m;
        if (a3 != null) {
            l2 = (Long)object;
            long l7 = l4;
            a3.h(l2, l7);
        }
        object = this.n;
        Intrinsics.checkNotNull(object);
        object.removeCallbacks((Runnable)a2);
        object = this.l;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = this.j;
        }
        if (n4 == 0) return;
        n3 = this.i;
        if (n4 == n3) return;
        object = this.n;
        Intrinsics.checkNotNull(object);
        l3 = 1000L;
        object.postDelayed((Runnable)a2, l3);
    }

    public final int getCurrentPosition() {
        block6: {
            int n3 = this.c();
            if (n3 != 0) {
                Object object;
                try {
                    object = this.l;
                    if (object == null) break block6;
                }
                catch (IllegalStateException illegalStateException) {}
                n3 = object.getCurrentPosition();
                object = n3;
                Intrinsics.checkNotNull(object);
                return (Integer)object;
            }
        }
        return 0;
    }

    public final boolean isPlaying() {
        boolean bl2;
        MediaPlayer mediaPlayer;
        boolean bl3 = this.c();
        if (!bl3 || (mediaPlayer = this.l) == null || (bl3 = mediaPlayer.isPlaying()) != (bl2 = true)) {
            bl2 = false;
        }
        return bl2;
    }

    public final void pause() {
        boolean bl2;
        String string2 = "message";
        Intrinsics.checkNotNullParameter("Audio media player pause---", string2);
        JioAds$Companion jioAds$Companion = JioAds.Companion;
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        boolean bl3 = this.c();
        int n3 = this.h;
        if (bl3 && (object = this.l) != null && (bl3 = object.isPlaying()) == (bl2 = true)) {
            object = "Audio media player pause";
            v12.a((String)object, string2, jioAds$Companion);
            jioAds$Companion = this.l;
            if (jioAds$Companion != null) {
                jioAds$Companion.pause();
            }
            this.j = n3;
        }
        this.k = n3;
    }

    public final void start() {
        boolean bl2 = this.c();
        int n3 = this.g;
        if (bl2) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("Audio ad mediaplayer start", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            jioAds$LogLevel = this.l;
            if (jioAds$LogLevel != null) {
                jioAds$LogLevel.start();
            }
            if (!(bl2 = this.p)) {
                this.p = bl2 = true;
                this.f();
            }
            this.j = n3;
        }
        this.k = n3;
    }
}

