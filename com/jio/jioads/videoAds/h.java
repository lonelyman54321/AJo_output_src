/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.CountDownTimer
 *  android.os.Handler
 *  android.util.DisplayMetrics
 *  android.view.SurfaceView
 *  android.view.TextureView
 *  android.view.View
 */
package com.jio.jioads.videoAds;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.f;
import androidx.media3.common.f$c;
import androidx.media3.exoplayer.ExoPlayer$c;
import androidx.media3.exoplayer.p;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.w;
import androidx.media3.ui.PlayerView;
import com.google.common.base.Supplier;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$VideoPlayerViewType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.controller.m;
import com.jio.jioads.util.s;
import com.jio.jioads.videoAds.a;
import com.jio.jioads.videoAds.b;
import com.jio.jioads.videoAds.c;
import com.jio.jioads.videoAds.d;
import com.jio.jioads.videoAds.e;
import com.jio.jioads.videoAds.g;
import com.jio.jioads.videomodule.i_0;
import com.jio.jioads.videomodule.player.o;
import com.jio.jioads.videomodule.player.state.JioPlayerState;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class h
implements o {
    public final Context a;
    public final i_0 b;
    public final com.jio.jioads.common.b c;
    public final com.jio.jioads.common.c d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public long i;
    public boolean j;
    public p k;
    public PlayerView l;
    public View m;
    public ArrayList n;
    public JioPlayerState o;
    public androidx.media3.exoplayer.source.d p;
    public int q;
    public final Handler r;
    public int s;
    public int t;
    public boolean u;
    public final DisplayMetrics v;
    public al0_1 w;
    public e x;
    public CountDownTimer y;
    public boolean z;

    public h(Context object, i_0 object2, com.jio.jioads.common.b object3, com.jio.jioads.common.c object4) {
        int n3;
        int n4;
        int n7;
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object3, "iJioAdView");
        Object object5 = "iJioAdViewController";
        Intrinsics.checkNotNullParameter(object4, object5);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = object4;
        object2 = JioPlayerState.IDEAL;
        this.o = object2;
        object4 = object3.d0();
        if (object4 != null ? (object4 = object3.d0()) == (object5 = JioAdView$VideoPlayerViewType.TEXTURE_VIEW) : (object4 = object3.K()) == (object5 = JioAdView$AD_TYPE.INTERSTITIAL) || (n7 = Build.VERSION.SDK_INT) < (n4 = 24)) {
            a a2;
            String string2 = "onMeasure(II)V";
            int n8 = 2;
            Class<h> clazz = h.class;
            String string3 = "onMeasure";
            object5 = a2;
            super(n8, this, clazz, string3, string2, 0);
            super((Context)object, a2);
        } else {
            b b2;
            String string4 = "onMeasure(II)V";
            int n10 = 2;
            Class<h> clazz = h.class;
            String string5 = "onMeasure";
            object5 = b2;
            super(n10, this, clazz, string5, string4, 0);
            super((Context)object, b2);
        }
        this.m = object4;
        super();
        object3 = object3.P();
        ((StringBuilder)object4).append((String)object3);
        ((StringBuilder)object4).append(": media3 available");
        com.jio.jioads.util.j.a(((StringBuilder)object4).toString());
        object3 = Resources.getSystem().getDisplayMetrics();
        this.v = object3;
        if (object3 != null) {
            Intrinsics.checkNotNull(object3);
            this.s = n3 = ((DisplayMetrics)object3).heightPixels;
            object3 = this.v;
            Intrinsics.checkNotNull(object3);
            this.t = n3 = ((DisplayMetrics)object3).widthPixels;
        }
        object3 = new PlayerView((Context)object);
        this.l = object3;
        this.o = object2;
        Intrinsics.checkNotNull(object3);
        n7 = -16777216;
        super(n7);
        object3.setBackground((Drawable)object2);
        object2 = this.l;
        Intrinsics.checkNotNull(object2);
        ((PlayerView)((Object)object2)).setResizeMode(3);
        object2 = new Nm0((Context)object);
        n3 = 1;
        ((Nm0)object2).c = n3;
        super((Nm0)object2);
        object2 = new ve0_0((Context)object);
        object4 = new ExoPlayer$c((Context)object, (Supplier)object5, (Supplier)object2);
        boolean bl2 = ((ExoPlayer$c)object4).v ^ n3;
        ct3.f(bl2);
        ((ExoPlayer$c)object4).v = n3;
        this.k = object = new p((ExoPlayer$c)object4);
        object = this.l;
        Intrinsics.checkNotNull(object);
        object2 = this.k;
        ((PlayerView)((Object)object)).setPlayer((f)object2);
        object = this.l;
        Intrinsics.checkNotNull(object);
        ((PlayerView)((Object)object)).setUseController(false);
        object = new Handler();
        this.r = object;
        object = new d(this);
        object2 = this.k;
        if (object2 != null) {
            Intrinsics.checkNotNull(object);
            ((p)object2).addListener((f$c)object);
        }
        this.w = object = new al0_1(this, 2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void e(h object) {
        Object object2;
        Object object3 = ((h)object).p;
        int n3 = object3 != null ? ((androidx.media3.exoplayer.source.d)object3).I() : -1;
        if (n3 <= 0) return;
        object3 = ((h)object).p;
        if (object3 == null) return;
        synchronized (object3) {
            object2 = ((androidx.media3.exoplayer.source.d)object3).H(0);
            int n4 = 1;
            ((androidx.media3.exoplayer.source.d)object3).K(0, n4);
        }
        if (object2 == null) return;
        object3 = new StringBuilder();
        com.jio.jioads.common.b b2 = ((h)object).c;
        String string2 = ": removed media source from exo ";
        j_0.n(b2, (StringBuilder)object3, string2);
        object2 = ((w)object2).k.c().b;
        object2 = object2 != null ? ((MediaItem$e)object2).a : null;
        ((StringBuilder)object3).append(object2);
        object3 = ((StringBuilder)object3).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object = ((h)object).n;
        if (object == null) return;
        object = (String)((ArrayList)object).remove(0);
    }

    public static final void f(h h3, int n3, int n4) {
        Context context = h3.a;
        int n7 = j_0.q(context);
        if (n7 != 0) {
            int n8;
            n3 = View.getDefaultSize((int)h3.s, (int)n3);
            n4 = View.getDefaultSize((int)h3.t, (int)n4);
            n7 = h3.s;
            if (n7 > 0 && (n8 = h3.t) > 0) {
                int n10 = n7 * n4;
                int n14 = n3 * n8;
                if (n10 > n14) {
                    n4 = n14 / n7;
                } else if (n10 < n14) {
                    n3 = n10 / n8;
                }
            }
            com.jio.jioads.videoAds.h.j(h3, n3, n4);
        } else {
            int n15;
            Context context2 = h3.a;
            Intrinsics.checkNotNullParameter(context2, "<this>");
            context = context2.getResources();
            if (context != null && (context = context.getConfiguration()) != null && (n7 = context.orientation) == (n15 = 1) && (n7 = (int)(h3.u ? 1 : 0)) != 0) {
                n3 = View.getDefaultSize((int)h3.s, (int)n3);
                n4 = View.getDefaultSize((int)h3.t, (int)n4);
                n7 = h3.s;
                if (n7 > 0 && (n15 = h3.t) > 0) {
                    int n16 = n7 * n4;
                    int n17 = n3 * n15;
                    if (n16 > n17) {
                        n4 = n17 / n7;
                    } else if (n16 < n17) {
                        n3 = n16 / n15;
                    }
                }
                com.jio.jioads.videoAds.h.j(h3, n3, n4);
            } else {
                com.jio.jioads.videoAds.h.j(h3, n3, n4);
            }
        }
    }

    public static final void i(h h3) {
        e e2 = h3.x;
        if (e2 != null) {
            e2.cancel();
        }
        h3.x = null;
    }

    public static final void j(h h3, int n3, int n4) {
        h3 = h3.m;
        boolean bl2 = h3 instanceof com.jio.jioads.videomodule.player.view.b;
        Object object = null;
        if (bl2) {
            bl2 = h3 instanceof com.jio.jioads.videomodule.player.view.b;
            if (bl2) {
                object = h3;
                object = (com.jio.jioads.videomodule.player.view.b)((Object)h3);
            }
            if (object != null) {
                ((com.jio.jioads.videomodule.player.view.b)((Object)object)).a(n3, n4);
            }
        } else {
            bl2 = h3 instanceof com.jio.jioads.videomodule.player.view.a;
            if (bl2) {
                bl2 = h3 instanceof com.jio.jioads.videomodule.player.view.a;
                if (bl2) {
                    object = h3;
                    object = (com.jio.jioads.videomodule.player.view.a)((Object)h3);
                }
                if (object != null) {
                    ((com.jio.jioads.videomodule.player.view.a)((Object)object)).a(n3, n4);
                }
            }
        }
    }

    public final void a() {
        c c2 = new c(this);
        com.jio.jioads.util.s.d(c2);
    }

    public final void a(String object) {
        Intrinsics.checkNotNullParameter(object, "videoAdUri");
        ArrayList arrayList = this.n;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.n = object = xx_2.d(object);
        object = this.m;
        if (object != null) {
            object.invalidate();
            object.requestLayout();
        }
        this.k();
    }

    public final void a(boolean bl2) {
        this.u = bl2;
    }

    public final void b() {
        Object object;
        int n3 = this.z;
        int n4 = 1;
        if (n3 == 0 || (object = this.k) == null || (n3 = ((p)object).getRepeatMode()) != n4) {
            object = new StringBuilder();
            String string2 = ": setLooping of ExoPlayer is called";
            com.jio.jioads.common.b b2 = this.c;
            j_0.i(b2, (StringBuilder)object, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            this.z = n4;
            object = this.k;
            if (object != null) {
                ((p)object).setRepeatMode(n4);
            }
        }
    }

    public final void b(List list) {
        Intrinsics.checkNotNullParameter(list, "videoAdUri");
        ArrayList arrayList = this.n;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.n = arrayList = new ArrayList(list);
        list = this.m;
        if (list != null) {
            list.invalidate();
            list.requestLayout();
        }
        this.k();
    }

    public final JioPlayerState c() {
        return this.o;
    }

    public final void c(Integer n3) {
        p p2 = this.k;
        if (p2 != null) {
            int n4 = n3;
            float f5 = n4;
            p2.setVolume(f5);
        }
    }

    public final String d() {
        return "";
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void d(ArrayList var1_1, boolean var2_2) {
        block69: {
            var3_3 = 1;
            var4_4 /* !! */  = new StringBuilder();
            var5_5 = this.c;
            j_0.n((com.jio.jioads.common.b)var5_5, var4_4 /* !! */ , ": Inside update media. existing list size: ");
            var6_6 = this.n;
            if (var6_6 != null) {
                var7_7 = var6_6.size();
                var6_6 = var7_7;
            } else {
                var7_7 = 0;
                var6_6 = null;
            }
            var4_4 /* !! */ .append(var6_6);
            var6_6 = " updated list size: ";
            var4_4 /* !! */ .append((String)var6_6);
            if (var1_1 != null) {
                var7_7 = var1_1.size();
                var6_6 = var7_7;
            } else {
                var7_7 = 0;
                var6_6 = null;
            }
            var4_4 /* !! */ .append(var6_6);
            var4_4 /* !! */  = var4_4 /* !! */ .toString();
            var6_6 = "message";
            Intrinsics.checkNotNullParameter(var4_4 /* !! */ , (String)var6_6);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var4_4 /* !! */  = JioAds$LogLevel.NONE;
            if (var1_1 != null) {
                block77: {
                    block89: {
                        block88: {
                            block87: {
                                block86: {
                                    block85: {
                                        block84: {
                                            block83: {
                                                block82: {
                                                    block81: {
                                                        block80: {
                                                            block79: {
                                                                block78: {
                                                                    block76: {
                                                                        block75: {
                                                                            block74: {
                                                                                block73: {
                                                                                    block72: {
                                                                                        block71: {
                                                                                            block70: {
                                                                                                var4_4 /* !! */  = this.k;
                                                                                                if (var4_4 /* !! */  == null) break block69;
                                                                                                var4_4 /* !! */  = this.n;
                                                                                                if (var4_4 /* !! */  == null) break block70;
                                                                                                var8_8 = var4_4 /* !! */ .size();
                                                                                                var9_9 = var1_1.size();
                                                                                                if (var8_8 == var9_9) break block69;
                                                                                            }
                                                                                            var4_4 /* !! */  = this.p;
                                                                                            if (var4_4 /* !! */  == null) break block71;
                                                                                            var8_8 = var4_4 /* !! */ .I();
                                                                                            var4_4 /* !! */  = Integer.valueOf(var8_8);
                                                                                            break block72;
                                                                                        }
                                                                                        var8_8 = 0;
                                                                                        var4_4 /* !! */  = null;
                                                                                    }
                                                                                    var10_10 = this.n;
                                                                                    if (var10_10 == null) break block73;
                                                                                    var9_9 = var10_10.size();
                                                                                    var10_10 = var9_9;
                                                                                    break block74;
                                                                                }
                                                                                var9_9 = 0;
                                                                                var10_10 = null;
                                                                            }
                                                                            var8_8 = (int)Intrinsics.areEqual(var4_4 /* !! */ , var10_10);
                                                                            if (var8_8 == 0 || var2_2) break block69;
                                                                            var4_4 /* !! */  = this.n;
                                                                            if (var4_4 /* !! */  == null) break block75;
                                                                            var8_8 = var4_4 /* !! */ .size();
                                                                            break block76;
                                                                        }
                                                                        var8_8 = -1;
                                                                    }
                                                                    var9_9 = var1_1.size();
                                                                    var11_11 = 0;
                                                                    if (var8_8 <= var9_9) break block77;
                                                                    var4_4 /* !! */  = this.p;
                                                                    if (var4_4 /* !! */  == null) break block78;
                                                                    var8_8 = var4_4 /* !! */ .I();
                                                                    var4_4 /* !! */  = Integer.valueOf(var8_8);
                                                                    break block79;
                                                                }
                                                                var8_8 = 0;
                                                                var4_4 /* !! */  = null;
                                                            }
                                                            var10_10 = this.n;
                                                            if (var10_10 == null) break block80;
                                                            var9_9 = var10_10.size();
                                                            var10_10 = var9_9;
                                                            break block81;
                                                        }
                                                        var9_9 = 0;
                                                        var10_10 = null;
                                                    }
                                                    var8_8 = (int)Intrinsics.areEqual(var4_4 /* !! */ , var10_10);
                                                    if (var8_8 == 0) break block77;
                                                    var4_4 /* !! */  = this.p;
                                                    if (var4_4 /* !! */  == null) break block82;
                                                    var8_8 = var4_4 /* !! */ .I();
                                                    break block83;
                                                }
                                                var8_8 = 0;
                                                var4_4 /* !! */  = null;
                                            }
                                            var9_9 = var1_1.size();
                                            var8_8 -= var9_9;
                                            var10_10 = this.p;
                                            if (var10_10 == null) break block84;
                                            var9_9 = var10_10.I();
                                            break block85;
                                        }
                                        var9_9 = 0;
                                        var10_10 = null;
                                    }
                                    var12_12 = var9_9 + -1;
                                    var13_13 = this.p;
                                    if (var13_13 == null) break block86;
                                    var13_13.J(var8_8, var9_9);
                                }
                                var10_10 = new kotlin.ranges.c(var8_8, var12_12, var3_3);
                                var13_13 = this.n;
                                if (var13_13 == null) break block87;
                                var14_14 = var13_13.size();
                                var13_13 = var14_14;
                                break block88;
                            }
                            var14_14 = 0;
                            var13_13 = null;
                        }
                        if (var13_13 != null) {
                            var14_14 = var13_13.intValue();
                            var9_9 = (int)var10_10.e(var14_14);
                            if (var9_9 == 0 || var8_8 > var12_12) break block89;
                            var9_9 = var8_8;
                            while (true) {
                                block90: {
                                    var13_13 = this.n;
                                    if (var13_13 == null) break block90;
                                    var13_13 = var13_13.remove(var9_9);
                                    var13_13 = (String)var13_13;
                                }
                                if (var9_9 == var12_12) break;
                                var9_9 += var3_3;
                            }
                        }
                    }
                    var10_10 = new StringBuilder();
                    var5_5 = var5_5.P();
                    var10_10.append((String)var5_5);
                    var5_5 = ": exo player => removed media source from [";
                    var10_10.append((String)var5_5);
                    var10_10.append(var8_8);
                    var4_4 /* !! */  = "] index to [";
                    var10_10.append((String)var4_4 /* !! */ );
                    var10_10.append(var12_12);
                    var4_4 /* !! */  = "] index";
                    var10_10.append((String)var4_4 /* !! */ );
                    var4_4 /* !! */  = var10_10.toString();
                    Intrinsics.checkNotNullParameter(var4_4 /* !! */ , (String)var6_6);
                    var4_4 /* !! */  = JioAds.Companion;
                    var4_4 /* !! */  = var4_4 /* !! */ .getInstance();
                    var4_4 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var4_4 /* !! */  = JioAds$LogLevel.NONE;
                }
                var8_8 = var1_1.size();
                while (var11_11 < var8_8) {
                    block91: {
                        block92: {
                            var5_5 = var1_1.get(var11_11);
                            var6_6 = "get(...)";
                            Intrinsics.checkNotNullExpressionValue(var5_5, (String)var6_6);
                            var5_5 = (String)var5_5;
                            var5_5 = this.n;
                            if (var5_5 == null) break block91;
                            Intrinsics.checkNotNull(var5_5);
                            var15_15 = var5_5.size();
                            if (var11_11 >= var15_15) break block92;
                            var11_11 += var3_3;
                            continue;
                        }
                        var1_1 = this.p;
                        Intrinsics.checkNotNull(var1_1);
                        throw null;
                    }
                    var1_1 = new ArrayList();
                    this.n = var1_1;
                    var1_1 = this.p;
                    Intrinsics.checkNotNull(var1_1);
                    throw null;
                }
            }
        }
        if (var2_2) {
            this.h((ArrayList)var1_1);
        }
lbl246:
        // 4 sources

        while (true) {
            var1_1 = new g(this);
            com.jio.jioads.util.s.d((Function0)var1_1);
            return;
        }
        catch (Exception v0) {
            ** continue;
        }
    }

    public final void e() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        try {
            p p2 = this.k;
            if (p2 == null) return;
            Intrinsics.checkNotNull(p2);
            boolean bl2 = p2.isPlaying();
            if (bl2) {
                p p5 = this.k;
                Intrinsics.checkNotNull(p5);
                p5.stop();
            }
            this.l();
            this.a();
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            String string2 = ": Error while releasing exo player";
            com.jio.jioads.common.b b2 = this.c;
            j_0.i(b2, stringBuilder, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
    }

    public final View g() {
        return this.m;
    }

    public final int getCurrentPosition() {
        int n3;
        JioPlayerState jioPlayerState;
        JioPlayerState jioPlayerState2;
        p p2 = this.k;
        if (p2 != null && (jioPlayerState2 = this.o) != (jioPlayerState = JioPlayerState.ERROR) && jioPlayerState2 != (jioPlayerState = JioPlayerState.IDEAL) && jioPlayerState2 != (jioPlayerState = JioPlayerState.PREPARING) && p2 != null) {
            Intrinsics.checkNotNull(p2);
            long l2 = p2.getCurrentPosition();
            n3 = (int)l2;
        } else {
            n3 = 0;
            jioPlayerState2 = null;
        }
        return n3;
    }

    public final int getDuration() {
        int n3;
        p p2 = this.k;
        if (p2 != null) {
            long l2 = p2.getDuration();
            n3 = (int)l2;
        } else {
            n3 = -1;
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Integer getVolume() {
        int n3;
        Object object = this.k;
        if (object != null) {
            float f5 = ((p)object).getVolume();
            n3 = (int)f5;
            return n3;
        }
        n3 = 0;
        float f6 = 0.0f;
        object = null;
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(ArrayList object) {
        Object object2;
        Object object3 = "get(...)";
        String string2 = "message";
        com.jio.jioads.common.b b2 = this.c;
        Integer n3 = null;
        if (object != null && (object2 = this.k) != null && (object2 = this.n) != null) {
            ArrayList arrayList;
            com.jio.jioads.audioplayer.b.a(b2, ": Inside update media for Pgm Ads");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            int n4 = ((ArrayList)object).size();
            for (int n7 = 0; n7 < n4; arrayList = arrayList.get(n7), ++n7) {
                Object object4 = ((ArrayList)object).get(n7);
                Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                object4 = (String)object4;
                arrayList = this.n;
                Intrinsics.checkNotNull(arrayList);
                int n8 = arrayList.size();
                if (n8 <= n7) {
                    Intrinsics.checkNotNull(this.p);
                    throw null;
                }
                arrayList = this.n;
                Intrinsics.checkNotNull(arrayList);
                boolean bl2 = Intrinsics.areEqual(arrayList, object4);
                if (bl2) continue;
                object = this.p;
                Intrinsics.checkNotNull(object);
                synchronized (object) {
                    ((androidx.media3.exoplayer.source.d)object).H(n7);
                    int n10 = n7 + 1;
                    ((androidx.media3.exoplayer.source.d)object).K(n7, n10);
                }
                Intrinsics.checkNotNull(this.p);
                throw null;
            }
        } else {
            object2 = this.n;
            if (object2 == null && object != null) {
                com.jio.jioads.audioplayer.b.a(b2, ": update murl is null");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = new ArrayList();
                this.n = object2;
                int n14 = ((ArrayList)object).size();
                if (n14 > 0) {
                    object = ((ArrayList)object).get(0);
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    object = (String)object;
                    Intrinsics.checkNotNull(this.p);
                    throw null;
                }
            }
        }
        object = com.jio.jioads.controller.m.a(b2, ": final playlist after updation ");
        object3 = this.n;
        if (object3 != null) {
            int n15 = ((ArrayList)object3).size();
            n3 = n15;
        }
        ((StringBuilder)object).append(n3);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isPlaying() {
        p p2 = this.k;
        if (p2 == null) return false;
        JioPlayerState jioPlayerState = this.o;
        JioPlayerState jioPlayerState2 = JioPlayerState.ERROR;
        if (jioPlayerState == jioPlayerState2) return false;
        jioPlayerState2 = JioPlayerState.IDEAL;
        if (jioPlayerState == jioPlayerState2) return false;
        jioPlayerState2 = JioPlayerState.PREPARING;
        if (jioPlayerState == jioPlayerState2) return false;
        if (p2 == null) return false;
        Intrinsics.checkNotNull(p2);
        boolean bl2 = p2.isPlaying();
        if (bl2) return true;
        long l2 = System.currentTimeMillis();
        long l3 = this.i;
        long l4 = (l2 -= l3) - (l3 = (long)70);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k() {
        Object object = "message";
        com.jio.jioads.common.b b2 = this.c;
        try {
            Object object2 = new StringBuilder();
            String string2 = b2.P();
            ((StringBuilder)object2).append(string2);
            String string3 = ": prepareMedia";
            ((StringBuilder)object2).append(string3);
            object2 = ((StringBuilder)object2).toString();
            Intrinsics.checkNotNullParameter(object2, (String)object);
            object = JioAds.Companion;
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.k;
            if (object == null) return;
            Intrinsics.checkNotNull(object);
            object2 = null;
            ((p)object).setPlayWhenReady(false);
            j[] jArray = new j[]{};
            this.p = object = new androidx.media3.exoplayer.source.d(jArray);
            object = this.n;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                object = ((ArrayList)object).iterator();
                boolean bl2 = object.hasNext();
                if (bl2) {
                    object = object.next();
                    object2 = this.p;
                    Intrinsics.checkNotNull(object2);
                    Intrinsics.checkNotNull(object);
                    object = null;
                    throw null;
                }
            }
            if ((object = this.k) != null) {
                ((p)object).stop();
                androidx.media3.exoplayer.source.d d2 = this.p;
                String string4 = "null cannot be cast to non-null type androidx.media3.exoplayer.source.MediaSource";
                Intrinsics.checkNotNull(d2, string4);
                boolean bl3 = true;
                ((p)object).prepare(d2, bl3, false);
            }
            object = JioPlayerState.PREPARING;
            this.o = object;
            return;
        }
        catch (Exception exception) {
            com.jio.jioads.audioplayer.b.a(b2, ": prepareMedia Exception");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = JioPlayerState.ERROR;
            this.o = object;
        }
    }

    public final void l() {
        Handler handler;
        al0_1 al0_12 = this.w;
        if (al0_12 != null && (handler = this.r) != null) {
            Intrinsics.checkNotNull(al0_12);
            handler.removeCallbacks((Runnable)al0_12);
        }
    }

    public final void m() {
        Object object = this.w;
        if (object != null) {
            object = this.b;
            if (object != null) {
                int n3;
                long l2;
                Object object2 = this.k;
                long l3 = 0L;
                if (object2 == null) {
                    l2 = l3;
                } else {
                    Intrinsics.checkNotNull(object2);
                    l2 = ((p)object2).getDuration();
                }
                object2 = this.k;
                if (object2 != null) {
                    Intrinsics.checkNotNull(object2);
                    l3 = ((p)object2).getCurrentPosition();
                }
                ((i_0)object).h(l2, l3);
                object = this.w;
                if (object != null && (object2 = this.r) != null) {
                    Intrinsics.checkNotNull(object);
                    object2.removeCallbacks((Runnable)object);
                }
                this.l();
                object = this.k;
                int n4 = 1;
                if (object == null) {
                    n3 = 1;
                } else {
                    Intrinsics.checkNotNull(object);
                    n3 = ((p)object).getPlaybackState();
                }
                if (n3 != n4 && n3 != (n4 = 4) && (object = this.r) != null) {
                    object2 = this.w;
                    Intrinsics.checkNotNull(object2);
                    l3 = 1000L;
                    object.postDelayed((Runnable)object2, l3);
                }
            } else {
                this.l();
            }
        }
    }

    public final void pause() {
        Object object = this.k;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            boolean bl2 = ((androidx.media3.common.b)object).isPlaying();
            if (bl2) {
                long l2;
                object = new StringBuilder();
                Object object2 = ": exoplayer pause";
                com.jio.jioads.common.b b2 = this.c;
                j_0.i(b2, (StringBuilder)object, (String)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = this.r;
                if (object != null) {
                    object2 = this.w;
                    Intrinsics.checkNotNull(object2);
                    object.removeCallbacks((Runnable)object2);
                }
                object = this.k;
                Intrinsics.checkNotNull(object);
                object2 = null;
                ((p)object).setPlayWhenReady(false);
                object = JioPlayerState.PAUSED;
                this.o = object;
                this.i = l2 = 0L;
            }
        }
    }

    public final void start() {
        long l2;
        Object object;
        boolean bl2;
        Object object2;
        Object object3 = this.m;
        if (object3 != null) {
            object3.invalidate();
            object3.requestLayout();
        }
        if ((object3 = this.l) != null) {
            object2 = this.k;
            ((PlayerView)((Object)object3)).setPlayer((f)object2);
        }
        object3 = this.m;
        if (object3 != null) {
            bl2 = object3 instanceof com.jio.jioads.videomodule.player.view.b;
            if (bl2) {
                object2 = this.k;
                if (object2 != null) {
                    object = "null cannot be cast to non-null type com.jio.jioads.videomodule.player.view.JioTextureView";
                    Intrinsics.checkNotNull(object3, object);
                    object3 = (com.jio.jioads.videomodule.player.view.b)((Object)object3);
                    ((p)object2).setVideoTextureView((TextureView)object3);
                }
            } else {
                bl2 = object3 instanceof com.jio.jioads.videomodule.player.view.a;
                if (bl2 && (object2 = this.k) != null) {
                    object = "null cannot be cast to non-null type com.jio.jioads.videomodule.player.view.JioSurfaceView";
                    Intrinsics.checkNotNull(object3, object);
                    object3 = (com.jio.jioads.videomodule.player.view.a)((Object)object3);
                    ((p)object2).setVideoSurfaceView((SurfaceView)object3);
                }
            }
        }
        if ((object3 = this.k) != null) {
            bl2 = true;
            ((p)object3).setPlayWhenReady(bl2);
        }
        object3 = JioPlayerState.PLAYING;
        this.o = object3;
        object3 = new StringBuilder();
        object2 = this.c;
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object3, ": mVideoHeight: ");
        int n3 = this.t;
        String string2 = "message";
        w12_0.b(n3, string2, (StringBuilder)object3);
        object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object2 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object2, ": mVideoWidth: ");
        n3 = this.s;
        ((StringBuilder)object2).append(n3);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        this.m();
        this.i = l2 = System.currentTimeMillis();
    }
}

