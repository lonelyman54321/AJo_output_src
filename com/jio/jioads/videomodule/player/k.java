/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.media.AudioManager
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnBufferingUpdateListener
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.media.MediaPlayer$OnVideoSizeChangedListener
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.view.SurfaceHolder$Callback
 *  android.view.TextureView$SurfaceTextureListener
 *  android.view.View
 *  android.widget.MediaController$MediaPlayerControl
 */
package com.jio.jioads.videomodule.player;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.jio.jioads.adinterfaces.JioAdView$VideoPlayerViewType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.s;
import com.jio.jioads.videomodule.player.c;
import com.jio.jioads.videomodule.player.callback.a;
import com.jio.jioads.videomodule.player.d;
import com.jio.jioads.videomodule.player.e;
import com.jio.jioads.videomodule.player.f;
import com.jio.jioads.videomodule.player.g;
import com.jio.jioads.videomodule.player.h;
import com.jio.jioads.videomodule.player.i;
import com.jio.jioads.videomodule.player.j;
import com.jio.jioads.videomodule.player.n;
import com.jio.jioads.videomodule.player.o;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import com.jio.jioads.videomodule.player.view.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class k
implements o,
MediaController.MediaPlayerControl {
    public int A;
    public boolean B;
    public final Handler C;
    public final h D;
    public i E;
    public j F;
    public final Context a;
    public final int b;
    public a c;
    public final com.jio.jioads.common.b d;
    public ExecutorService e;
    public MediaPlayer f;
    public final View g;
    public Uri h;
    public JioPlayerState i;
    public int j;
    public int k;
    public Handler l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final n v;
    public L7 w;
    public f x;
    public g y;
    public d z;

    public k(Context object, int n3, a object2, com.jio.jioads.common.b object3, com.jio.jioads.common.c object4) {
        int n4;
        JioPlayerState jioPlayerState;
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object3, "iJioAdView");
        Object object5 = "iJioAdViewController";
        Intrinsics.checkNotNullParameter(object4, object5);
        this.a = object;
        this.b = n3;
        this.c = object2;
        this.d = object3;
        this.i = jioPlayerState = JioPlayerState.IDEAL;
        this.j = n4 = -1;
        this.q = n4;
        object2 = object3.d0();
        if (object2 != null && (object2 = object3.d0()) != (object4 = JioAdView$VideoPlayerViewType.TEXTURE_VIEW)) {
            String string2 = "onMeasure(II)V";
            int n7 = 2;
            Class<k> clazz = k.class;
            String string3 = "onMeasure";
            object5 = object4;
            object4 = new FunctionReferenceImpl(n7, this, clazz, string3, string2, 0);
            super((Context)object, (Function2)object4);
            object4 = this.f;
            super((MediaPlayer)object4, (com.jio.jioads.common.b)object3, (com.jio.jioads.videomodule.player.view.a)((Object)object2));
            this.v = object;
            object3 = object2.getHolder();
            if (object3 != null) {
                object4 = "null cannot be cast to non-null type com.jio.jioads.videomodule.player.JioMediaPlayerView.MediaSurface";
                Intrinsics.checkNotNull(object, (String)object4);
                object3.addCallback((SurfaceHolder.Callback)object);
            }
        } else {
            String string4 = "onMeasure(II)V";
            int n8 = 2;
            Class<k> clazz = k.class;
            String string5 = "onMeasure";
            object5 = object4;
            object4 = new FunctionReferenceImpl(n8, this, clazz, string5, string4, 0);
            super((Context)object, (Function2)object4);
            object4 = this.f;
            super((MediaPlayer)object4, (com.jio.jioads.common.b)object3, (b)((Object)object2));
            this.v = object;
            object3 = "null cannot be cast to non-null type com.jio.jioads.videomodule.player.JioMediaPlayerView.MediaTexture";
            Intrinsics.checkNotNull(object, (String)object3);
            object2.setSurfaceTextureListener((TextureView.SurfaceTextureListener)object);
        }
        this.g = object2;
        this.m = 0;
        this.n = 0;
        this.i = jioPlayerState;
        super();
        this.l = object;
        super(this, 4);
        this.w = object;
        super(this);
        this.x = object;
        super(this);
        this.y = object;
        super(this);
        this.z = object;
        super();
        this.C = object;
        super(this);
        this.D = object;
        super(this);
        this.E = object;
        super(this);
        this.F = object;
    }

    public static final void e(k k2, int n3, int n4) {
        Context context = k2.a;
        int n7 = j_0.q(context);
        Object object = k2.g;
        if (n7 != 0) {
            int n8;
            n3 = View.getDefaultSize((int)k2.m, (int)n3);
            n4 = View.getDefaultSize((int)k2.n, (int)n4);
            n7 = k2.m;
            if (n7 > 0 && (n8 = k2.n) > 0) {
                int n10 = n7 * n4;
                int n14 = n3 * n8;
                if (n10 > n14) {
                    n4 = n14 / n7;
                } else if (n10 < n14) {
                    n3 = n10 / n8;
                }
            }
            if ((n8 = object instanceof b) != 0) {
                object = (b)((Object)object);
                ((b)((Object)object)).a(n3, n4);
            } else {
                n8 = object instanceof com.jio.jioads.videomodule.player.view.a;
                if (n8 != 0) {
                    object = (com.jio.jioads.videomodule.player.view.a)((Object)object);
                    ((com.jio.jioads.videomodule.player.view.a)((Object)object)).a(n3, n4);
                }
            }
        } else {
            int n15;
            context = k2.a;
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(context, string2);
            Resources resources = context.getResources();
            int n16 = 1;
            if (resources != null && (resources = resources.getConfiguration()) != null && (n15 = resources.orientation) == n16 && (n15 = (int)(k2.o ? 1 : 0)) == 0) {
                n7 = k2.m;
                int n17 = k2.n;
                if (n7 >= n17) {
                    n17 = object instanceof b;
                    if (n17 != 0) {
                        object = (b)((Object)object);
                        ((b)((Object)object)).a(n3, n4);
                    } else {
                        n17 = object instanceof com.jio.jioads.videomodule.player.view.a;
                        if (n17 != 0) {
                            object = (com.jio.jioads.videomodule.player.view.a)((Object)object);
                            ((com.jio.jioads.videomodule.player.view.a)((Object)object)).a(n3, n4);
                        }
                    }
                } else {
                    n3 = object instanceof b;
                    if (n3 != 0) {
                        object = (b)((Object)object);
                        ((b)((Object)object)).a(n7, n17);
                    } else {
                        n3 = object instanceof com.jio.jioads.videomodule.player.view.a;
                        if (n3 != 0) {
                            object = (com.jio.jioads.videomodule.player.view.a)((Object)object);
                            ((com.jio.jioads.videomodule.player.view.a)((Object)object)).a(n7, n17);
                        }
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(context, string2);
                context = context.getResources();
                if (context != null && (context = context.getConfiguration()) != null && (n7 = context.orientation) == n16) {
                    int n18;
                    n3 = View.getDefaultSize((int)k2.m, (int)n3);
                    n4 = View.getDefaultSize((int)k2.n, (int)n4);
                    n7 = k2.m;
                    if (n7 > 0 && (n18 = k2.n) > 0) {
                        int n19 = n7 * n4;
                        n15 = n3 * n18;
                        if (n19 > n15) {
                            n4 = n15 / n7;
                        } else if (n19 < n15) {
                            n3 = n19 / n18;
                        }
                    }
                    if ((n18 = object instanceof com.jio.jioads.videomodule.player.view.a) != 0) {
                        object = (com.jio.jioads.videomodule.player.view.a)((Object)object);
                        ((com.jio.jioads.videomodule.player.view.a)((Object)object)).a(n3, n4);
                    } else {
                        n18 = object instanceof b;
                        if (n18 != 0) {
                            object = (b)((Object)object);
                            ((b)((Object)object)).a(n3, n4);
                        }
                    }
                } else {
                    n7 = k2.m;
                    int n20 = k2.n;
                    if (n7 >= n20) {
                        int n21;
                        n3 = View.getDefaultSize((int)n7, (int)n3);
                        n4 = View.getDefaultSize((int)k2.n, (int)n4);
                        n7 = k2.m;
                        if (n7 > 0 && (n21 = k2.n) > 0) {
                            n20 = n7 * n4;
                            n15 = n3 * n21;
                            if (n20 > n15) {
                                n4 = n15 / n7;
                            } else if (n20 < n15) {
                                n3 = n20 / n21;
                            }
                        }
                        if ((n21 = object instanceof b) != 0) {
                            object = (b)((Object)object);
                            ((b)((Object)object)).a(n3, n4);
                        } else {
                            n21 = object instanceof com.jio.jioads.videomodule.player.view.a;
                            if (n21 != 0) {
                                object = (com.jio.jioads.videomodule.player.view.a)((Object)object);
                                ((com.jio.jioads.videomodule.player.view.a)((Object)object)).a(n3, n4);
                            }
                        }
                    } else {
                        boolean bl2 = object instanceof b;
                        if (bl2) {
                            object = (b)((Object)object);
                            ((b)((Object)object)).a(n7, n20);
                        } else {
                            bl2 = object instanceof com.jio.jioads.videomodule.player.view.a;
                            if (bl2) {
                                object = (com.jio.jioads.videomodule.player.view.a)((Object)object);
                                ((com.jio.jioads.videomodule.player.view.a)((Object)object)).a(n7, n20);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a() {
        c c2 = new c(this);
        com.jio.jioads.util.s.d(c2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String object) {
        int n3;
        Object object2;
        Object object3;
        com.jio.jioads.common.b b2;
        Object object4;
        int n4;
        block10: {
            Exception exception2;
            block12: {
                block11: {
                    Intrinsics.checkNotNullParameter(object, "videoAdUri");
                    object = Uri.parse((String)object);
                    this.h = object;
                    n4 = 0;
                    object = null;
                    this.k = 0;
                    object4 = this.g;
                    object4.invalidate();
                    object4.requestLayout();
                    object4 = "message";
                    b2 = this.d;
                    object3 = new StringBuilder();
                    object2 = b2.P();
                    ((StringBuilder)object3).append((String)object2);
                    object2 = ": prepareMedia: MediaPlayer object: ";
                    ((StringBuilder)object3).append((String)object2);
                    n3 = this.b;
                    ((StringBuilder)object3).append(n3);
                    object3 = ((StringBuilder)object3).toString();
                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                    object3 = JioAds.Companion;
                    object2 = ((JioAds$Companion)object3).getInstance();
                    ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    object2 = this.f;
                    if (object2 != null) break block10;
                    object2 = new MediaPlayer();
                    this.f = object2;
                    n n7 = this.v;
                    if (n7 != null) {
                        n7.a((MediaPlayer)object2);
                    }
                    this.q = n3 = -1;
                    this.p = 0;
                    this.i();
                    try {
                        object = this.f;
                        if (object == null) break block11;
                        object2 = this.a;
                        n7 = this.h;
                        Intrinsics.checkNotNull(n7);
                        object.setDataSource((Context)object2, (Uri)n7);
                        object.prepareAsync();
                    }
                    catch (Exception exception2) {
                        break block12;
                    }
                }
                object = JioPlayerState.PREPARING;
                this.i = object;
                object = new StringBuilder();
                object2 = b2.P();
                ((StringBuilder)object).append((String)object2);
                object2 = ": MediaPlayer starts preparing";
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                Intrinsics.checkNotNullParameter(object, (String)object4);
                object = ((JioAds$Companion)object3).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                return;
            }
            object3 = new StringBuilder();
            object2 = b2.P();
            ((StringBuilder)object3).append((String)object2);
            object2 = ": 8: ";
            ((StringBuilder)object3).append((String)object2);
            object2 = Utility.INSTANCE;
            Object object5 = ((Utility)object2).printStacktrace(exception2);
            ((StringBuilder)object3).append((String)object5);
            object5 = ((StringBuilder)object3).toString();
            Intrinsics.checkNotNullParameter(object5, (String)object4);
            object5 = JioAds.Companion;
            object5 = ((JioAds$Companion)object5).getInstance();
            ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
            object5 = this.c;
            if (object5 != null) {
                object5.d();
            }
            object5 = JioPlayerState.ERROR;
            this.i = object5;
            return;
        }
        try {
            object2.reset();
            n4 = 1;
            object = Executors.newFixedThreadPool(n4);
            this.e = object;
            n3 = 3;
            object3 = new B31(this, n3);
            object2 = JioPlayerState.PREPARING;
            this.i = object2;
            Intrinsics.checkNotNull(object);
            object.submit((Runnable)object3);
            return;
        }
        catch (Exception exception) {
            try {
                object3 = new StringBuilder();
                object2 = b2.P();
                ((StringBuilder)object3).append((String)object2);
                object2 = ": prepareMedia error ";
                ((StringBuilder)object3).append((String)object2);
                Object object6 = exception.getMessage();
                ((StringBuilder)object3).append((String)object6);
                object6 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object6, (String)object4);
                object6 = JioAds.Companion;
                object6 = ((JioAds$Companion)object6).getInstance();
                ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object6 = JioAds$LogLevel.NONE;
                object6 = JioPlayerState.ERROR;
                this.i = object6;
                object6 = this.c;
                if (object6 == null) return;
                object6.d();
                return;
            }
            catch (Exception exception3) {
                com.jio.jioads.audioplayer.b.a(b2, ": prepareMedia Exception");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = JioPlayerState.ERROR;
                this.i = object;
            }
        }
    }

    public final void a(boolean bl2) {
        this.o = bl2;
    }

    public final void b() {
        this.d.P();
        this.u = true;
        this.seekTo(0);
    }

    public final void b(List list) {
        Intrinsics.checkNotNullParameter(list, "videoAdUri");
    }

    public final JioPlayerState c() {
        return this.i;
    }

    public final void c(Integer n3) {
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            int n4 = n3;
            float f5 = n4;
            int n7 = n3;
            float f6 = n7;
            mediaPlayer.setVolume(f5, f6);
        }
    }

    public final boolean canPause() {
        return this.r;
    }

    public final boolean canSeekBackward() {
        return this.s;
    }

    public final boolean canSeekForward() {
        return this.t;
    }

    public final String d() {
        Object object = this.h;
        object = object != null ? object.getPath() : null;
        if (object == null) {
            object = "";
        }
        return object;
    }

    public final void d(ArrayList arrayList, boolean bl2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        Exception exception2;
        block4: {
            MediaPlayer mediaPlayer;
            block2: {
                int n3;
                block3: {
                    try {
                        int n4;
                        mediaPlayer = this.f;
                        if (mediaPlayer == null || (n3 = mediaPlayer.isPlaying()) != (n4 = 1)) break block2;
                        mediaPlayer = this.f;
                        if (mediaPlayer == null) break block3;
                        mediaPlayer.stop();
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                }
                this.j = n3 = -1;
            }
            if ((mediaPlayer = this.f) == null) return;
            mediaPlayer.reset();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.d.P();
        stringBuilder.append(string2);
        stringBuilder.append(": Error while releasing media player: ");
        string2 = "<this>";
        Intrinsics.checkNotNullParameter(exception2, string2);
        com.jio.jioads.jioreel.tracker.model.b.e(exception2, stringBuilder);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        Exception exception2;
        block3: {
            block2: {
                try {
                    MediaPlayer mediaPlayer = this.f;
                    if (mediaPlayer == null) return;
                    Intrinsics.checkNotNull(mediaPlayer);
                    boolean bl2 = mediaPlayer.isPlaying();
                    if (!bl2) break block2;
                    mediaPlayer = this.f;
                    Intrinsics.checkNotNull(mediaPlayer);
                    mediaPlayer.stop();
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            this.a();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.d.P();
        stringBuilder.append(string2);
        stringBuilder.append(": Error while releasing media player: ");
        string2 = "<this>";
        Intrinsics.checkNotNullParameter(exception2, string2);
        com.jio.jioads.jioreel.tracker.model.b.e(exception2, stringBuilder);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final View g() {
        return this.g;
    }

    public final int getAudioSessionId() {
        return 0;
    }

    public final int getBufferPercentage() {
        int n3;
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            n3 = this.p;
        } else {
            n3 = 0;
            mediaPlayer = null;
        }
        return n3;
    }

    public final int getCurrentPosition() {
        block4: {
            boolean bl2 = this.h();
            if (bl2) {
                MediaPlayer mediaPlayer;
                try {
                    mediaPlayer = this.f;
                    if (mediaPlayer == null) break block4;
                }
                catch (IllegalStateException illegalStateException) {}
                Intrinsics.checkNotNull(mediaPlayer);
                return mediaPlayer.getCurrentPosition();
            }
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int getDuration() {
        int n3;
        block4: {
            try {
                n3 = this.h();
                if (n3 != 0) {
                    n3 = this.q;
                    if (n3 > 0) {
                        return n3;
                    }
                    MediaPlayer mediaPlayer = this.f;
                    if (mediaPlayer == null) return this.q;
                    Intrinsics.checkNotNull(mediaPlayer);
                    this.q = n3 = mediaPlayer.getDuration();
                    return this.q;
                }
                break block4;
            }
            catch (Exception exception) {}
            StringBuilder stringBuilder = new StringBuilder();
            String string2 = this.d.P();
            stringBuilder.append(string2);
            stringBuilder.append(": ");
            string2 = "<this>";
            Intrinsics.checkNotNullParameter(exception, string2);
            com.jio.jioads.jioreel.tracker.model.b.e(exception, stringBuilder);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
        this.q = n3 = -1;
        return n3;
    }

    public final Integer getVolume() {
        String string2;
        Object object;
        try {
            object = this.a;
            string2 = "audio";
        }
        catch (Exception exception) {
            return 0;
        }
        object = object.getSystemService(string2);
        string2 = "null cannot be cast to non-null type android.media.AudioManager";
        Intrinsics.checkNotNull(object, string2);
        object = (AudioManager)object;
        int n3 = 3;
        int n4 = object.getStreamVolume(n3);
        return n4;
    }

    public final boolean h() {
        boolean bl2;
        JioPlayerState jioPlayerState;
        Object object = this.f;
        if (object != null && (object = this.i) != (jioPlayerState = JioPlayerState.ERROR) && object != (jioPlayerState = JioPlayerState.IDEAL) && object != (jioPlayerState = JioPlayerState.PREPARING)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final void i() {
        Object object;
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer != null) {
            object = this.x;
            mediaPlayer.setOnPreparedListener((MediaPlayer.OnPreparedListener)object);
        }
        if ((mediaPlayer = this.f) != null) {
            object = this.y;
            mediaPlayer.setOnCompletionListener((MediaPlayer.OnCompletionListener)object);
        }
        if ((mediaPlayer = this.f) != null) {
            object = this.z;
            mediaPlayer.setOnErrorListener((MediaPlayer.OnErrorListener)object);
        }
        if ((mediaPlayer = this.f) != null) {
            object = this.E;
            mediaPlayer.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener)object);
        }
        if ((mediaPlayer = this.f) != null) {
            object = this.F;
            mediaPlayer.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener)object);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isPlaying() {
        boolean bl2 = this.h();
        if (!bl2) return false;
        MediaPlayer mediaPlayer = this.f;
        if (mediaPlayer == null) return false;
        Intrinsics.checkNotNull(mediaPlayer);
        bl2 = mediaPlayer.isPlaying();
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        Exception exception2;
        Object object;
        block10: {
            Object object2;
            try {
                object2 = this.w;
                if (object2 == null) return;
                object = this.c;
                if (object != null && (object = this.f) != null) {
                    long l2;
                    int n3;
                    int n4 = object.isPlaying();
                    if (n4 != (n3 = 1)) return;
                    object2 = this.f;
                    long l3 = 0L;
                    if (object2 == null) {
                        l2 = l3;
                    } else {
                        int n7 = this.q;
                        l2 = n7;
                    }
                    if (object2 != null) {
                        Intrinsics.checkNotNull(object2);
                        n4 = object2.getCurrentPosition();
                        l3 = n4;
                    }
                    object2 = this.c;
                    if (object2 != null) {
                        object2.h(l2, l3);
                    }
                    if ((object2 = this.l) != null) {
                        object = this.w;
                        Intrinsics.checkNotNull(object);
                        object2.removeCallbacks((Runnable)object);
                    }
                    object2 = (object2 = this.f) == null ? JioPlayerState.IDEAL : this.i;
                    object = JioPlayerState.IDEAL;
                    if (object2 == object) return;
                    object = JioPlayerState.COMPLETED;
                    if (object2 == object) return;
                    object2 = this.l;
                    if (object2 == null) return;
                    object = this.w;
                    Intrinsics.checkNotNull(object);
                    long l4 = 1000L;
                    object2.postDelayed((Runnable)object, l4);
                    return;
                }
            }
            catch (Exception exception2) {
                break block10;
            }
            object = this.l;
            if (object == null) return;
            Intrinsics.checkNotNull(object2);
            object.removeCallbacks((Runnable)object2);
            return;
        }
        object = new StringBuilder();
        String string2 = this.d.P();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": ");
        string2 = "<this>";
        Intrinsics.checkNotNullParameter(exception2, string2);
        com.jio.jioads.jioreel.tracker.model.b.e(exception2, (StringBuilder)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pause() {
        Exception exception2;
        Object object;
        block4: {
            int n3;
            Object object2;
            block3: {
                object2 = "message";
                object = this.d;
                try {
                    boolean bl2 = this.h();
                    if (!bl2) return;
                    Object object3 = this.f;
                    if (object3 == null) return;
                    Intrinsics.checkNotNull(object3);
                    bl2 = object3.isPlaying();
                    if (!bl2) return;
                    object3 = new StringBuilder();
                    String string2 = object.P();
                    ((StringBuilder)object3).append(string2);
                    string2 = ": mediaplayer pause";
                    ((StringBuilder)object3).append(string2);
                    object3 = ((StringBuilder)object3).toString();
                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                    object2 = JioAds.Companion;
                    object2 = ((JioAds$Companion)object2).getInstance();
                    ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    object2 = this.f;
                    if (object2 == null) break block3;
                    object2.pause();
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            object2 = JioPlayerState.PAUSED;
            this.i = object2;
            object2 = this.f;
            if (object2 != null) {
                object2.getCurrentPosition();
            }
            this.j = n3 = -1;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        object = object.P();
        stringBuilder.append((String)object);
        stringBuilder.append(": ");
        object = "<this>";
        Intrinsics.checkNotNullParameter(exception2, (String)object);
        com.jio.jioads.jioreel.tracker.model.b.e(exception2, stringBuilder);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void seekTo(int n3) {
        int n4;
        int n7;
        JioPlayerState jioPlayerState = this.i;
        JioPlayerState jioPlayerState2 = JioPlayerState.PLAYING;
        if (jioPlayerState == jioPlayerState2 && (jioPlayerState = this.f) != null && (n7 = jioPlayerState.isPlaying()) == (n4 = 1)) {
            n7 = Build.VERSION.SDK_INT;
            n4 = 26;
            if (n7 >= n4) {
                jioPlayerState = this.f;
                if (jioPlayerState != null) {
                    long l2 = n3;
                    com.jio.jioads.videomodule.player.e.a((MediaPlayer)jioPlayerState, l2);
                }
            } else {
                jioPlayerState = this.f;
                if (jioPlayerState != null) {
                    jioPlayerState.seekTo(n3);
                }
            }
            n3 = 0;
        }
        this.k = n3;
    }

    public final void start() {
        int n3 = this.h();
        if (n3 != 0) {
            Object object;
            Object object2 = this.g;
            object2.invalidate();
            object2.requestLayout();
            n3 = this.j;
            if (n3 > 0 && (object = this.f) != null) {
                object.seekTo(n3);
            }
            object2 = new StringBuilder();
            object = ": default mediaplayer started";
            com.jio.jioads.common.b b2 = this.d;
            j_0.i(b2, (StringBuilder)object2, (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = this.f;
            if (object2 != null) {
                object2.start();
            }
            object2 = JioPlayerState.PLAYING;
            this.i = object2;
            this.j();
        }
    }
}

