/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.media3.exoplayer.hls.HlsMediaSource$Factory
 */
package com.jio.jioads.audioplayer;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.MediaItem;
import androidx.media3.common.f;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.p;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.o$b;
import androidx.media3.ui.PlayerView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.common.b;
import com.jio.jioads.util.s;
import com.jio.jioads.videomodule.player.callback.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class d
implements com.jio.jioads.instream.audio.audiointerfaces.a {
    public final b a;
    public final Context b;
    public a c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public int j;
    public p k;
    public PlayerView l;
    public final Handler m;
    public long n;
    public String o;
    public final df1_2 p;

    public d(b b2) {
        int n3;
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        this.a = b2;
        b2 = b2.Y();
        this.b = b2;
        this.d = -1;
        this.e = n3 = 1;
        this.f = 2;
        this.g = 3;
        this.h = 4;
        this.i = 5;
        this.j = 0;
        Intrinsics.checkNotNullParameter("initAudioView() of JioInstreamAudioExoPlayer", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        super(this);
        s.d((Function0)object);
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.m = object;
        super(this, n3);
        this.p = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a() {
        long l2;
        int n3;
        int n4;
        p p2 = this.k;
        if (p2 != null && (n4 = this.j) != (n3 = this.d) && n4 != 0 && n4 != (n3 = this.e)) {
            long l3 = this.n;
            long l4 = 0L;
            long l7 = l3 - l4;
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object > 0) {
                return (int)l3;
            }
            Intrinsics.checkNotNull(p2);
            this.n = l2 = p2.getDuration();
            return (int)l2;
        }
        this.n = l2 = (long)-1;
        return (int)l2;
    }

    public final void a(a a2) {
        this.c = a2;
    }

    public final void a(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        try {
            p p2 = this.k;
            if (p2 == null) return;
            Intrinsics.checkNotNull(p2);
            boolean bl2 = p2.isPlaying();
            if (bl2) {
                p2 = this.k;
                Intrinsics.checkNotNull(p2);
                p2.stop();
            }
            if ((p2 = this.k) == null) return;
            Object var3_4 = null;
            this.c = null;
            Intrinsics.checkNotNull(p2);
            p2.release();
            this.k = null;
            bl2 = false;
            p2 = null;
            this.j = 0;
            return;
        }
        catch (Exception exception) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("Error while releasing exo player", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
    }

    public final void b(String string2) {
        this.o = string2;
    }

    public final androidx.media3.exoplayer.source.d c() {
        boolean bl2 = false;
        Object object = null;
        Object object2 = new j[]{};
        androidx.media3.exoplayer.source.d d2 = new androidx.media3.exoplayer.source.d((j[])object2);
        object2 = this.b;
        if (object2 == null) {
            return d2;
        }
        Intrinsics.checkNotNull(object2);
        Intrinsics.checkNotNull(object2);
        Object object3 = object2.getPackageName();
        androidx.media3.datasource.b b2 = new androidx.media3.datasource.b((Context)object2, (String)object3);
        object2 = MediaItem.a(Uri.parse((String)this.o));
        Intrinsics.checkNotNullExpressionValue(object2, "fromUri(...)");
        object3 = this.o;
        String string2 = "tsa";
        String string3 = "m3u8";
        String string4 = "tsv";
        String string5 = "aac";
        String[] stringArray = Arrays.asList(string3, "ts", string2, string4, string5);
        ArrayList<String> arrayList = new ArrayList<String>((Collection<String>)stringArray);
        Intrinsics.checkNotNull(object3);
        stringArray = new String[]{"\\?"};
        int n3 = 6;
        object3 = StringsKt.a0((CharSequence)object3, stringArray, false, 0, n3);
        stringArray = new String[]{};
        object3 = object3.toArray(stringArray)[0];
        stringArray = new String[]{"/"};
        object3 = StringsKt.a0((CharSequence)object3, stringArray, false, 0, n3);
        stringArray = new String[]{};
        object3 = object3.toArray(stringArray);
        int n4 = ((String[])object3).length;
        int n7 = 1;
        object3 = object3[n4 -= n7];
        stringArray = new String[]{"\\."};
        object3 = StringsKt.a0((CharSequence)object3, stringArray, false, 0, n3);
        stringArray = new String[]{};
        object3 = object3.toArray(stringArray);
        n4 = ((Object)object3).length;
        if (n4 > n7) {
            object = object3[n7];
            bl2 = arrayList.contains(object);
        }
        object3 = "createMediaSource(...)";
        if (bl2) {
            object = new HlsMediaSource.Factory((DataSource$Factory)b2);
            object = object.createMediaSource((MediaItem)object2);
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            d2.B((j)object);
        } else {
            object = new o$b(b2);
            object = ((o$b)object).g((MediaItem)object2);
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            d2.B((j)object);
        }
        return d2;
    }

    public final void d() {
        Object object = this.c;
        df1_2 df1_22 = this.p;
        if (object != null) {
            int n3;
            long l2;
            object = this.k;
            long l3 = 0L;
            if (object == null) {
                l2 = l3;
            } else {
                Intrinsics.checkNotNull(object);
                l2 = ((p)object).getDuration();
            }
            object = this.k;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                l3 = ((p)object).getCurrentPosition();
            }
            object = this.c;
            if (object != null) {
                object.h(l2, l3);
            }
            object = this.m;
            Intrinsics.checkNotNull(object);
            object.removeCallbacks((Runnable)df1_22);
            object = this.k;
            int n4 = 1;
            if (object == null) {
                n3 = 1;
            } else {
                Intrinsics.checkNotNull(object);
                n3 = ((p)object).getPlaybackState();
            }
            if (n3 != n4 && n3 != (n4 = 4)) {
                object = this.m;
                Intrinsics.checkNotNull(object);
                l3 = 1000L;
                object.postDelayed((Runnable)df1_22, l3);
            }
        } else {
            object = this.m;
            Intrinsics.checkNotNull(object);
            object.removeCallbacks((Runnable)df1_22);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int getCurrentPosition() {
        long l2;
        p p2 = this.k;
        int n3 = 0;
        if (p2 == null) return n3;
        int n4 = this.j;
        int n7 = this.d;
        if (n4 == n7) return n3;
        if (n4 == 0) return n3;
        n7 = this.e;
        if (n4 == n7) return n3;
        try {
            Intrinsics.checkNotNull(p2);
            l2 = p2.getCurrentPosition();
        }
        catch (IllegalStateException illegalStateException) {
            return n3;
        }
        return (int)l2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isPlaying() {
        p p2 = this.k;
        if (p2 == null) return false;
        int n3 = this.j;
        int n4 = this.d;
        if (n3 == n4) return false;
        if (n3 == 0) return false;
        n4 = this.e;
        if (n3 == n4) return false;
        if (p2 == null) return false;
        Intrinsics.checkNotNull(p2);
        boolean bl2 = p2.isPlaying();
        if (!bl2) return false;
        return true;
    }

    public final void pause() {
        Object object = this.k;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            boolean n3 = ((androidx.media3.common.b)object).isPlaying();
            if (n3) {
                int n4;
                Intrinsics.checkNotNullParameter("exoplayer pause", "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = this.k;
                Intrinsics.checkNotNull(object);
                ((p)object).setPlayWhenReady(false);
                this.j = n4 = this.h;
            }
        }
    }

    public final void start() {
        Object object = "message";
        Intrinsics.checkNotNullParameter("Audio Exoplayer start", (String)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = this.l;
        if (object2 != null) {
            int n3;
            Intrinsics.checkNotNull(object2);
            object = this.k;
            ((PlayerView)((Object)object2)).setPlayer((f)object);
            object2 = this.k;
            Intrinsics.checkNotNull(object2);
            boolean bl2 = true;
            ((p)object2).setPlayWhenReady(bl2);
            this.j = n3 = this.g;
            this.d();
        }
    }
}

