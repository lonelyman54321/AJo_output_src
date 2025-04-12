/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.MutableContextWrapper
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.CountDownTimer
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.RelativeLayout
 *  com.iab.omid.library.ril.adsession.FriendlyObstructionPurpose
 *  org.json.JSONObject
 */
package com.jio.jioads.videomodule;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.iab.omid.library.ril.adsession.FriendlyObstructionPurpose;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdEvent;
import com.jio.jioads.adinterfaces.JioAdEvent$AdEventType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$JioVmapListener;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.common.c;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.n;
import com.jio.jioads.tracker.JioEventTracker;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.u;
import com.jio.jioads.utils.Constants$HeaderKeys;
import com.jio.jioads.utils.l;
import com.jio.jioads.videomodule.A;
import com.jio.jioads.videomodule.C;
import com.jio.jioads.videomodule.JioVideoViewState;
import com.jio.jioads.videomodule.T;
import com.jio.jioads.videomodule.V;
import com.jio.jioads.videomodule.VideoViewAudioState;
import com.jio.jioads.videomodule.W;
import com.jio.jioads.videomodule.a_0;
import com.jio.jioads.videomodule.b_0;
import com.jio.jioads.videomodule.c_0;
import com.jio.jioads.videomodule.config.b;
import com.jio.jioads.videomodule.d;
import com.jio.jioads.videomodule.d_0;
import com.jio.jioads.videomodule.e_0;
import com.jio.jioads.videomodule.g;
import com.jio.jioads.videomodule.h;
import com.jio.jioads.videomodule.h_0;
import com.jio.jioads.videomodule.i;
import com.jio.jioads.videomodule.i_0;
import com.jio.jioads.videomodule.j;
import com.jio.jioads.videomodule.j_0;
import com.jio.jioads.videomodule.k_0;
import com.jio.jioads.videomodule.n_0;
import com.jio.jioads.videomodule.o_0;
import com.jio.jioads.videomodule.player.callback.a;
import com.jio.jioads.videomodule.player.k;
import com.jio.jioads.videomodule.player.o;
import com.jio.jioads.videomodule.renderer.e;
import com.jio.jioads.videomodule.renderer.f;
import com.jio.jioads.videomodule.s_0;
import com.jio.jioads.videomodule.t_0;
import com.jio.jioads.videomodule.u_0;
import com.jio.jioads.videomodule.w_0;
import com.jio.jioads.videomodule.y;
import com.jioads.mediation.partners.videoutils.JioMediationVideoController;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class s {
    public JioVideoViewState A;
    public VideoViewAudioState B;
    public final hh3_2 C;
    public final hh3_2 D;
    public PopupWindow E;
    public boolean F;
    public boolean G;
    public CountDownTimer H;
    public boolean I;
    public final HashMap J;
    public Integer K;
    public d L;
    public boolean M;
    public AdMetaData$AdParams N;
    public ArrayList O;
    public int P;
    public CountDownTimer Q;
    public String R;
    public int S;
    public Integer T;
    public boolean U;
    public Long V;
    public boolean W;
    public o X;
    public String Y;
    public CountDownTimer Z;
    public final HashMap a;
    public boolean a0;
    public final m b;
    public String b0;
    public final boolean c;
    public boolean c0;
    public final com.jio.jioads.common.b d;
    public boolean d0;
    public final c e;
    public e e0;
    public JioVmapAdsLoader$JioVmapListener f;
    public final i_0 f0;
    public Context g;
    public final k_0 g0;
    public ViewGroup h;
    public ViewGroup h0;
    public ViewGroup i;
    public boolean i0;
    public final hh3_2 j;
    public boolean j0;
    public final Integer k;
    public boolean k0;
    public String l;
    public y l0;
    public String m;
    public String m0;
    public Long n;
    public boolean o;
    public com.jio.jioads.iab.b p;
    public Integer q;
    public Lambda r;
    public final hh3_2 s;
    public o t;
    public k u;
    public boolean v;
    public boolean w;
    public int x;
    public f y;
    public com.jio.jioads.videomodule.callback.a z;

    public s(HashMap object, m object2, int n3, boolean bl2, com.jio.jioads.common.b b2, c c2, JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener) {
        i_0 i_02;
        int n4;
        Intrinsics.checkNotNullParameter(object, "headers");
        Intrinsics.checkNotNullParameter(object2, "vastData");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Object object3 = "iJioAdViewController";
        Intrinsics.checkNotNullParameter(c2, (String)object3);
        this.a = object;
        this.b = object2;
        this.c = bl2;
        this.d = b2;
        this.e = c2;
        this.f = jioVmapAdsLoader$JioVmapListener;
        object = b2.k0();
        object2 = JioAdView$AdState.DESTROYED;
        object = object != object2 ? b2.Y() : null;
        this.g = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.j = object;
        object = "";
        this.l = object;
        this.m = object;
        object2 = yr1_2.b(a_0.c);
        this.s = object2;
        object2 = u_0.a;
        this.A = object2;
        object2 = j_0.a;
        this.B = object2;
        object2 = yr1_2.b(e_0.c);
        this.C = object2;
        object2 = yr1_2.b(c_0.c);
        this.D = object2;
        super();
        this.J = object2;
        object2 = this.d0();
        this.K = object2;
        object2 = com.jio.jioads.videomodule.d.a;
        this.L = object2;
        super();
        this.O = object2;
        this.S = n4 = -1;
        this.Y = object;
        this.f0 = i_02 = new i_0(this);
        super(this);
        this.g0 = object;
        super();
        object2 = this.R();
        ((StringBuilder)object).append((String)object2);
        object2 = ": init JioVideoView";
        ((StringBuilder)object).append((String)object2);
        com.jio.jioads.util.j.a(((StringBuilder)object).toString());
        this.k = object = Integer.valueOf(n3);
        Context context = this.g;
        if (context != null) {
            if (bl2) {
                Intrinsics.checkNotNull(context);
                object = new com.jio.jioads.videoAds.h(context, i_02, b2, c2);
            } else {
                Intrinsics.checkNotNull(context);
                int n7 = 1;
                object3 = object;
                object = new k(context, n7, i_02, b2, c2);
            }
            this.t = object;
        }
        this.l0 = object = new y(this);
    }

    public static /* synthetic */ void A(s s7, ViewGroup viewGroup, ViewGroup viewGroup2, boolean bl2, int n3) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            viewGroup2 = null;
        }
        if ((n3 &= 4) != 0) {
            bl2 = false;
        }
        s7.w(viewGroup, viewGroup2, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void I(s object) {
        int n3;
        Object object2 = ((s)object).d.z();
        if (object2 != null) {
            object2 = ((com.jio.jioads.controller.o)object2).Q;
        } else {
            n3 = 0;
            object2 = null;
        }
        Object object3 = object2;
        com.jio.jioads.util.i i3 = com.jio.jioads.util.i.a;
        n3 = com.jio.jioads.util.i.l((c)object2);
        if (n3 != 0) {
            Context context;
            n3 = com.jio.jioads.util.i.i;
            int n4 = 1;
            com.jio.jioads.util.i.i = n3 + n4;
            object2 = ((s)object).O;
            n3 = ((ArrayList)object2).size();
            if (n3 == n4 && (context = ((s)object).g) != null) {
                Intrinsics.checkNotNull(context);
                object = ((s)object).d;
                String string2 = object.P();
                Boolean bl2 = Boolean.FALSE;
                Boolean bl3 = Boolean.TRUE;
                int n7 = 480;
                com.jio.jioads.util.i.k(i3, context, (c)object3, string2, bl2, bl3, null, null, null, null, n7);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void Y(s var0) {
        block63: {
            block66: {
                block65: {
                    block61: {
                        block64: {
                            block62: {
                                var1_1 /* !! */  = var0;
                                var2_2 /* !! */  = var0.T();
                                var3_3 = var0.g0();
                                var4_4 = var3_3.j;
                                var5_5 = " mSkipAdDelay: ";
                                var6_6 = -1;
                                var7_7 /* !! */  = "message";
                                if (var4_4 != 0) break block62;
                                var0.S = var6_6;
                                var2_2 /* !! */  = new StringBuilder();
                                var3_3 = var0.R();
                                var2_2 /* !! */ .append((String)var3_3);
                                var2_2 /* !! */ .append(": shouldAllowSkippableAd ");
                                var3_3 = var0.g0();
                                var4_4 = var3_3.j;
                                var2_2 /* !! */ .append((boolean)var4_4);
                                var2_2 /* !! */ .append((String)var5_5);
                                var4_4 = var0.S;
                                w12_0.b(var4_4, var7_7 /* !! */ , (StringBuilder)var2_2 /* !! */ );
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var2_2 /* !! */  = JioAds$LogLevel.NONE;
                                var1_1 /* !! */  = var0.e0;
                                if (var1_1 /* !! */  != null) {
                                    var1_1 /* !! */  = var1_1 /* !! */ .d;
                                    var2_2 /* !! */  = var1_1 /* !! */ .w;
                                    var4_4 = 8;
                                    if (var2_2 /* !! */  != null) {
                                        var2_2 /* !! */ .setVisibility(var4_4);
                                    }
                                    var1_1 /* !! */  = var1_1 /* !! */ .A;
                                    if (var1_1 /* !! */  != null) {
                                        var1_1 /* !! */ .setVisibility(var4_4);
                                    }
                                }
                                break block63;
                            }
                            var4_4 = var0.b();
                            if (var4_4 == 0) break block64;
                            var2_2 /* !! */  = ": isCurrentAdMediation: true";
                            com.jio.jioads.instream.video.a.a(var0, var2_2 /* !! */ );
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var1_1 /* !! */  = JioAds$LogLevel.NONE;
                            break block63;
                        }
                        var3_3 = var0.a;
                        var8_8 = com.jio.jioads.utils.e.g((HashMap)var3_3);
                        var0.V = var8_8;
                        var8_8 = new Comparable<Long>();
                        ei1_0.a(var0, (StringBuilder)var8_8, ": rewardWinValue: ");
                        var9_9 = var0.V;
                        var8_8.append(var9_9);
                        var8_8.append((String)var5_5);
                        var10_10 = var0.S;
                        var8_8.append(var10_10);
                        com.jio.jioads.util.j.a(var8_8.toString());
                        var5_5 = var0.V;
                        var11_11 = 0L;
                        var13_12 = 0;
                        var14_13 = null;
                        if (var5_5 != null) {
                            Intrinsics.checkNotNull(var5_5);
                            var15_14 = var5_5.longValue();
                            var10_10 = (int)(var15_14 == var11_11 ? 0 : (var15_14 < var11_11 ? -1 : 1));
                            if (var10_10 <= 0) {
                                var5_5 = new StringBuilder();
                                ei1_0.a(var0, (StringBuilder)var5_5, ": rewardWinValue is ");
                                var17_15 = var0.V;
                                var5_5.append(var17_15);
                                var17_15 = " so ignoring...";
                                var5_5.append((String)var17_15);
                                var5_5 = var5_5.toString();
                                com.jio.jioads.util.j.a((String)var5_5);
                                var0.V = null;
                            }
                        }
                        var5_5 = var1_1 /* !! */ .O;
                        var10_10 = (int)var5_5.isEmpty();
                        var18_16 = 1;
                        if ((var10_10 ^= var18_16) != 0 && (var5_5 = (com.jio.jioads.instreamads.vastparser.model.k)l_0.j(var1_1 /* !! */ .O)) != null && (var5_5 = var5_5.m) != null) {
                            var10_10 = (int)var5_5.booleanValue();
                        } else {
                            var10_10 = 0;
                            var19_17 = 0.0f;
                            var5_5 = null;
                        }
                        var20_18 = var1_1 /* !! */ .b;
                        if (var10_10 != 0) {
                            var5_5 = new StringBuilder();
                            ei1_0.a(var1_1 /* !! */ , (StringBuilder)var5_5, ": ");
                            var21_19 = var1_1 /* !! */ .R;
                            var22_20 = " inside wrapper ad";
                            com.jio.jioads.adinterfaces.j_0.k((StringBuilder)var5_5, (String)var21_19, (String)var22_20);
                            var5_5 = JioAds.Companion;
                            var5_5.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var21_19 = JioAds$LogLevel.NONE;
                            var21_19 = var20_18.a;
                            if (var21_19 != null) {
                                var22_20 = var0.i0();
                                var21_19 = var21_19.p((String)var22_20);
                            } else {
                                var21_19 = null;
                            }
                            var1_1 /* !! */ .R = var21_19;
                            if (var21_19 == null) {
                                var21_19 = new StringBuilder();
                                var22_20 = ": mSkipOffset inside wrapper ad looking for 3 party skipoffset as parent skip offset is null";
                                l_0.e(var1_1 /* !! */ , (StringBuilder)var21_19, (String)var22_20);
                                var5_5.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var5_5 = var20_18.a;
                                if (var5_5 != null) {
                                    var5_5 = var5_5.p(var2_2 /* !! */ );
                                } else {
                                    var10_10 = 0;
                                    var5_5 = null;
                                    var19_17 = 0.0f;
                                }
                                var1_1 /* !! */ .R = var5_5;
                            }
                        } else {
                            com.jio.jioads.instream.video.a.a(var1_1 /* !! */ , ": mSkipOffset inside normal ad");
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var5_5 = JioAds$LogLevel.NONE;
                            var5_5 = var20_18.a;
                            if (var5_5 != null) {
                                var5_5 = var5_5.p(var2_2 /* !! */ );
                            } else {
                                var10_10 = 0;
                                var5_5 = null;
                                var19_17 = 0.0f;
                            }
                            var1_1 /* !! */ .R = var5_5;
                        }
                        var5_5 = var1_1 /* !! */ .R;
                        var21_19 = ": NON SKIPPABLE AD";
                        if (var5_5 != null && (var10_10 = (int)TextUtils.isEmpty((CharSequence)var5_5)) == 0) {
                            var5_5 = var1_1 /* !! */ .R;
                            if (var5_5 != null && (var10_10 = (int)StringsKt.F((CharSequence)var5_5, (CharSequence)(var22_20 = "%"), false)) == var18_16) {
                                var5_5 = var20_18.a;
                                if (var5_5 != null) {
                                    var5_5 = var5_5.j(var2_2 /* !! */ );
                                } else {
                                    var10_10 = 0;
                                    var5_5 = null;
                                    var19_17 = 0.0f;
                                }
                                var20_18 = new StringBuilder();
                                ei1_0.a(var1_1 /* !! */ , (StringBuilder)var20_18, ": videoDuration for trackNumber [");
                                var23_21 = var1_1 /* !! */ .P;
                                var20_18.append(var23_21);
                                var24_22 = "] is ";
                                var20_18.append(var24_22);
                                var20_18.append((String)var5_5);
                                Intrinsics.checkNotNullParameter(var20_18.toString(), var7_7 /* !! */ );
                                var20_18 = JioAds.Companion.getInstance();
                                var20_18.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var25_23 = (int)TextUtils.isEmpty((CharSequence)var5_5);
                                if (var25_23 == 0) {
                                    var10_10 = com.jio.jioads.adinterfaces.j_0.a((String)var5_5);
                                    var20_18 = var1_1 /* !! */ .R;
                                    if (var20_18 != null) {
                                        var20_18 = fT1.a((String)var22_20, (String)var20_18);
                                    } else {
                                        var25_23 = 0;
                                        var20_18 = null;
                                        var26_24 = 0.0f;
                                    }
                                    Intrinsics.checkNotNull(var20_18);
                                    var22_20 = new String[]{};
                                    var20_18 = var20_18.toArray(var22_20)[0];
                                    var19_17 = Integer.parseInt((String)var20_18) * var10_10;
                                    var25_23 = 1120403456;
                                    var26_24 = 100.0f;
                                    var27_25 = Math.ceil(var19_17 /= var26_24);
                                    var1_1 /* !! */ .S = var10_10 = (int)var27_25;
                                }
                            } else {
                                var5_5 = var1_1 /* !! */ .R;
                                var1_1 /* !! */ .S = var10_10 = com.jio.jioads.adinterfaces.j_0.a((String)var5_5);
                            }
                            if ((var5_5 = var1_1 /* !! */ .X) != null) {
                                Intrinsics.checkNotNull(var5_5);
                                var10_10 = var5_5.getDuration();
                                if (var10_10 != var6_6) {
                                    var10_10 = var1_1 /* !! */ .S;
                                    var20_18 = var1_1 /* !! */ .X;
                                    Intrinsics.checkNotNull(var20_18);
                                    var25_23 = var20_18.getDuration() / 1000;
                                    if (var10_10 >= var25_23) {
                                        var5_5 = new StringBuilder("mSkipOffset  is greater than or equal to video duration: ");
                                        var20_18 = var1_1 /* !! */ .R;
                                        ir3_0.b((StringBuilder)var5_5, (String)var20_18, var7_7 /* !! */ );
                                        var5_5 = JioAds.Companion;
                                        var5_5.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var7_7 /* !! */  = new StringBuilder();
                                        l_0.e(var1_1 /* !! */ , (StringBuilder)var7_7 /* !! */ , (String)var21_19);
                                        var5_5 = var5_5.getInstance();
                                        var5_5.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var1_1 /* !! */ .S = var6_6;
                                    }
                                }
                            }
                        } else {
                            var1_1 /* !! */ .S = var6_6;
                            com.jio.jioads.instream.video.a.a(var1_1 /* !! */ , (String)var21_19);
                            var5_5 = JioAds.Companion.getInstance();
                            var5_5.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        if ((var5_5 = var1_1 /* !! */ .y) != null && (var10_10 = (int)var5_5.c()) == var18_16) {
                            var10_10 = 1;
                            var19_17 = 1.4E-45f;
                        } else {
                            var10_10 = 0;
                            var19_17 = 0.0f;
                            var5_5 = null;
                        }
                        var7_7 /* !! */  = ", AdID: ";
                        var20_18 = "] is: ";
                        var21_19 = "isCustomRewardedVideo: true, mSkipAdDelay: ";
                        var22_20 = "isCustomRewardedVideo: true, mSkipAdDelay: -1(NonSkippable), videoDuration: ";
                        var24_22 = ", videoDuration: ";
                        var29_26 = 9;
                        if (var10_10 == 0 || (var5_5 = var1_1 /* !! */ .V) == null) ** GOTO lbl-1000
                        Intrinsics.checkNotNull(var5_5);
                        var30_27 = var5_5.longValue();
                        var11_11 = var1_1 /* !! */ .S;
                        var10_10 = (int)(var30_27 == var11_11 ? 0 : (var30_27 < var11_11 ? -1 : 1));
                        if (var10_10 < 0 && (var10_10 = com.jio.jioads.utils.e.a((HashMap)var3_3)) == var29_26) {
                            var4_4 = (int)var0.d();
                            if (var4_4 != 0) {
                                var3_3 = new StringBuilder((String)var21_19);
                                var5_5 = var1_1 /* !! */ .V;
                                if (var5_5 != null) {
                                    var11_11 = var5_5.longValue();
                                    var10_10 = (int)var11_11;
                                    var14_13 = var10_10;
                                }
                                var3_3.append(var14_13);
                                var3_3.append(var24_22);
                                var5_5 = var1_1 /* !! */ .T;
                                var3_3.append(var5_5);
                                com.jio.jioads.util.j.a(var3_3.toString());
                                var3_3 = var1_1 /* !! */ .V;
                                if (var3_3 != null) {
                                    var32_28 = var3_3.longValue();
                                    var10_10 = (int)var32_28;
                                } else {
                                    var10_10 = 0;
                                    var19_17 = 0.0f;
                                    var5_5 = null;
                                }
                            } else {
                                var3_3 = new StringBuilder((String)var22_20);
                                var5_5 = var1_1 /* !! */ .T;
                                var3_3.append(var5_5);
                                var3_3 = var3_3.toString();
                                com.jio.jioads.util.j.a((String)var3_3);
                                var10_10 = -1;
                                var19_17 = 0.0f / 0.0f;
                            }
                            var1_1 /* !! */ .S = var10_10;
                            var5_5 = var7_7 /* !! */ ;
                        } else lbl-1000:
                        // 2 sources

                        {
                            if ((var5_5 = var1_1 /* !! */ .y) != null && (var10_10 = (int)var5_5.c()) == var18_16 && (var5_5 = var1_1 /* !! */ .R) != null && (var5_5 = var1_1 /* !! */ .V) != null) {
                                Intrinsics.checkNotNull(var5_5);
                                var11_11 = var5_5.longValue();
                                var5_5 = var1_1 /* !! */ .R;
                                var10_10 = com.jio.jioads.adinterfaces.j_0.a((String)var5_5);
                                var34_30 = var7_7 /* !! */ ;
                                var35_31 = var10_10;
                                var10_10 = (int)(var11_11 == var35_31 ? 0 : (var11_11 < var35_31 ? -1 : 1));
                                if (var10_10 > 0 && (var10_10 = com.jio.jioads.utils.e.a((HashMap)var3_3)) == var29_26) {
                                    var4_4 = (int)var0.d();
                                    if (var4_4 != 0) {
                                        var3_3 = new StringBuilder("isCustomRewardedVideo2: true, mSkipAdDelay: ");
                                        var5_5 = var1_1 /* !! */ .V;
                                        if (var5_5 != null) {
                                            var37_32 = var5_5.longValue();
                                            var6_6 = (int)var37_32;
                                            var14_13 = var6_6;
                                        }
                                        var3_3.append(var14_13);
                                        var3_3.append(var24_22);
                                        var5_5 = var1_1 /* !! */ .T;
                                        var3_3.append(var5_5);
                                        com.jio.jioads.util.j.a(var3_3.toString());
                                        var3_3 = var1_1 /* !! */ .R;
                                        var4_4 = com.jio.jioads.adinterfaces.j_0.a((String)var3_3);
                                    } else {
                                        var3_3 = new StringBuilder((String)var22_20);
                                        var5_5 = var1_1 /* !! */ .T;
                                        var3_3.append(var5_5);
                                        var3_3 = var3_3.toString();
                                        com.jio.jioads.util.j.a((String)var3_3);
                                        var4_4 = -1;
                                    }
                                    var1_1 /* !! */ .S = var4_4;
lbl301:
                                    // 2 sources

                                    while (true) {
                                        var5_5 = var34_30;
                                        break block61;
                                        break;
                                    }
                                }
                            } else {
                                var34_30 = var7_7 /* !! */ ;
                            }
                            if ((var5_5 = var1_1 /* !! */ .y) != null && (var10_10 = (int)var5_5.c()) == var18_16 && (var5_5 = var1_1 /* !! */ .R) == null && (var5_5 = var1_1 /* !! */ .V) != null && (var4_4 = com.jio.jioads.utils.e.a((HashMap)var3_3)) == var29_26) {
                                var4_4 = (int)var0.d();
                                if (var4_4 != 0) {
                                    var3_3 = new StringBuilder((String)var21_19);
                                    var5_5 = var1_1 /* !! */ .V;
                                    if (var5_5 != null) {
                                        var37_33 = var5_5.longValue();
                                        var6_6 = (int)var37_33;
                                        var14_13 = var6_6;
                                    }
                                    var3_3.append(var14_13);
                                    var3_3.append(var24_22);
                                    var5_5 = var1_1 /* !! */ .T;
                                    var3_3.append(var5_5);
                                    com.jio.jioads.util.j.a(var3_3.toString());
                                    var3_3 = var1_1 /* !! */ .V;
                                    if (var3_3 != null) {
                                        var32_29 = var3_3.longValue();
                                        var10_10 = (int)var32_29;
                                    } else {
                                        var10_10 = 0;
                                        var19_17 = 0.0f;
                                        var5_5 = null;
                                    }
                                } else {
                                    var3_3 = new StringBuilder((String)var22_20);
                                    var5_5 = var1_1 /* !! */ .T;
                                    var3_3.append(var5_5);
                                    var3_3 = var3_3.toString();
                                    com.jio.jioads.util.j.a((String)var3_3);
                                    var10_10 = -1;
                                    var19_17 = 0.0f / 0.0f;
                                }
                                var1_1 /* !! */ .S = var10_10;
                                ** continue;
                            }
                            var3_3 = new StringBuilder();
                            ei1_0.a(var1_1 /* !! */ , (StringBuilder)var3_3, ": mSkipOffset for trackNumber [");
                            var10_10 = var1_1 /* !! */ .P;
                            var3_3.append(var10_10);
                            var3_3.append((String)var20_18);
                            var5_5 = var1_1 /* !! */ .R;
                            var3_3.append((String)var5_5);
                            var5_5 = var34_30;
                            var3_3.append(var34_30);
                            var3_3.append(var2_2 /* !! */ );
                            var3_3 = var3_3.toString();
                            com.jio.jioads.util.j.a((String)var3_3);
                            var1_1 /* !! */ .V = null;
                        }
                    }
                    var3_3 = new StringBuilder();
                    ei1_0.a(var1_1 /* !! */ , (StringBuilder)var3_3, ": isCustomInterstitial Rewarded Video Approach: ");
                    var39_34 = var1_1 /* !! */ .y;
                    if (var39_34 == null || (var6_6 = (int)var39_34.c()) != var18_16) break block65;
                    var39_34 = var1_1 /* !! */ .V;
                    if (var39_34 != null) {
                        var35_31 = var39_34.longValue();
lbl368:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var35_31 = -1;
                    ** while (true)
                    var11_11 = 0L;
                    var13_12 = var35_31 == var11_11 ? 0 : (var35_31 < var11_11 ? -1 : 1);
                    if (var13_12 > 0) break block66;
                }
                var18_16 = 0;
                var17_15 = null;
            }
            var3_3.append((boolean)var18_16);
            com.jio.jioads.util.j.a(var3_3.toString());
            var3_3 = var1_1 /* !! */ .T;
            if (var3_3 != null) {
                var6_6 = var1_1 /* !! */ .S;
                Intrinsics.checkNotNull(var3_3);
                var4_4 = var3_3.intValue() / 1000;
                if (var6_6 > var4_4) {
                    var1_1 /* !! */ .S = var4_4 = -1;
                }
            }
            var3_3 = new StringBuilder();
            var39_34 = ": final mSkipAdDelay for trackNumber [";
            ei1_0.a(var1_1 /* !! */ , (StringBuilder)var3_3, (String)var39_34);
            var6_6 = var1_1 /* !! */ .P;
            var3_3.append(var6_6);
            var3_3.append((String)var20_18);
            var40_35 = var1_1 /* !! */ .S;
            var3_3.append(var40_35);
            var3_3.append((String)var5_5);
            var3_3.append(var2_2 /* !! */ );
            var1_1 /* !! */  = var3_3.toString();
            com.jio.jioads.util.j.a((String)var1_1 /* !! */ );
        }
    }

    public static final void a0(s object) {
        object.getClass();
        Object object2 = com.jio.jioads.videomodule.d.a;
        ((s)object).L = object2;
        object2 = ((s)object).X;
        Object object3 = ((s)object).t;
        boolean bl2 = Intrinsics.areEqual(object2, object3);
        int n3 = 0;
        int n4 = 8;
        if (bl2) {
            ((s)object).N();
            ((s)object).i();
            boolean bl3 = ((s)object).w;
            if (bl3) {
                object2 = ((s)object).t;
                if (object2 != null) {
                    object2.e();
                }
                if ((object2 = ((s)object).u) != null) {
                    ((k)object2).start();
                }
                object = ((s)object).g0;
                ((k_0)object).i();
            } else {
                object = ((s)object).e0;
                if (object != null) {
                    object2 = ((e)object).g;
                    bl3 = ((b)object2).j;
                    object3 = ((e)object).d;
                    if (bl3) {
                        object = ((f)object3).g;
                        if (object != null) {
                            object.setVisibility(n4);
                        }
                    } else {
                        object2 = ((f)object3).g;
                        if (object2 != null) {
                            object = ((e)object).f;
                            boolean bl4 = ((com.jio.jioads.videomodule.config.a)object).a;
                            if (!bl4) {
                                n3 = 8;
                            }
                            object2.setVisibility(n3);
                        }
                    }
                }
            }
        } else {
            object3 = ((s)object).u;
            boolean bl5 = Intrinsics.areEqual(object2, object3);
            if (bl5) {
                ((s)object).N();
                ((s)object).i();
                bl5 = ((s)object).v;
                if (bl5) {
                    object2 = ((s)object).u;
                    if (object2 != null) {
                        ((k)object2).e();
                    }
                    if ((object2 = ((s)object).t) != null) {
                        object2.start();
                    }
                    object = ((s)object).f0;
                    ((i_0)object).i();
                } else {
                    object = ((s)object).e0;
                    if (object != null) {
                        object2 = ((e)object).g;
                        bl5 = ((b)object2).j;
                        object3 = ((e)object).d;
                        if (bl5) {
                            object = ((f)object3).g;
                            if (object != null) {
                                object.setVisibility(n4);
                            }
                        } else {
                            object2 = ((f)object3).g;
                            if (object2 != null) {
                                object = ((e)object).f;
                                boolean bl6 = ((com.jio.jioads.videomodule.config.a)object).a;
                                if (!bl6) {
                                    n3 = 8;
                                }
                                object2.setVisibility(n3);
                            }
                        }
                    }
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void z(s s7, int n3) {
        Object object;
        void var3_5;
        Object object2;
        Object object3 = s7;
        n n4 = s7.b.a;
        if (n4 != null) {
            object2 = s7.T();
            m m2 = s7.b;
            ArrayList arrayList = CollectionsKt.m0(n4.e(m2, (String)object2));
        } else {
            ArrayList arrayList = new ArrayList();
        }
        void var6_20 = var3_5;
        JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener = ((s)object3).f;
        if (jioVmapAdsLoader$JioVmapListener != null) {
            JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.CLICKED;
            object2 = new JioAdEvent(jioAdEvent$AdEventType);
            Object var5_17 = null;
            jioVmapAdsLoader$JioVmapListener.onJioVmapEvent((JioAdEvent)object2, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        object2 = s7.R();
        stringBuilder.append((String)object2);
        stringBuilder.append(": CLICKED fired for adId: ");
        object2 = s7.T();
        stringBuilder.append((String)object2);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        object2 = object = ((s)object3).C.getValue();
        object2 = (JioEventTracker)object;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents = JioEventTracker$TrackingEvents.EVENT_CLICK;
        Integer n7 = n3 + 1;
        String string2 = s7.T();
        Object object4 = s7.V();
        Object object5 = ((s)object3).e;
        c c2 = object5;
        c2 = (com.jio.jioads.controller.f)object5;
        object5 = ((com.jio.jioads.controller.f)c2).a;
        HashMap hashMap = ((s)object3).a;
        String string3 = com.jio.jioads.controller.o.o((com.jio.jioads.controller.o)object5, string2, (String)object4, hashMap);
        boolean bl2 = ((com.jio.jioads.controller.f)c2).a.a();
        int n8 = ((com.jio.jioads.controller.f)c2).a.k;
        String string4 = ((s)object3).l;
        String string5 = ((s)object3).m;
        object4 = ((s)object3).d;
        object5 = null;
        boolean bl3 = true;
        boolean bl4 = true;
        Object var3_12 = null;
        c c3 = c2;
        c2 = null;
        int n10 = 163840;
        JioEventTracker.fireEvents$default((JioEventTracker)object2, jioEventTracker$TrackingEvents, (com.jio.jioads.common.b)object4, (List)var6_20, n7, null, bl3, false, string3, bl4, null, null, null, bl2, n8, string4, null, string5, null, n10, null);
        object3 = s7.V();
        if (object3 == null) {
            object3 = "";
        }
        c3.getClass();
        Intrinsics.checkNotNullParameter(object3, "campaignid");
        String string6 = "c";
        Intrinsics.checkNotNullParameter(string6, "type");
        object5 = c3;
        ((com.jio.jioads.controller.f)c3).a.v((String)object3, string6);
    }

    public final void B(String object) {
        int n3;
        boolean bl2 = this.c;
        if (bl2) {
            com.jio.jioads.instream.video.a.a(this, ": returning from startPreparingNextAd() bcz exo player is enabled");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        Object object2 = this.O;
        int n4 = l_0.a((ArrayList)object2);
        if (n4 > (n3 = 1) && (object2 = this.y) != null) {
            Object object3;
            Object object4;
            object2 = this.X;
            Object object5 = this.t;
            n4 = (int)(Intrinsics.areEqual(object2, object5) ? 1 : 0);
            int n7 = 0;
            object5 = null;
            if (n4 != 0) {
                Context context;
                object2 = this.u;
                if (object2 == null && !bl2 && (context = this.g) != null) {
                    Intrinsics.checkNotNull(context);
                    k_0 k_02 = this.g0;
                    com.jio.jioads.common.b b2 = this.d;
                    int n8 = 2;
                    c c2 = this.e;
                    object3 = object4;
                    object4 = new k(context, n8, k_02, b2, c2);
                    object2 = this.g0();
                    n4 = (int)(((com.jio.jioads.videomodule.config.a)object2).u ? 1 : 0);
                    if (n4 != 0) {
                        ((k)object4).o = n3;
                    }
                    this.u = object4;
                }
                this.w = false;
                object4 = this.u;
                if (object4 != null) {
                    ((k)object4).e();
                }
                object4 = this.u;
            } else {
                this.v = false;
                object4 = this.t;
                if (object4 != null) {
                    object4.e();
                }
                object4 = this.t;
            }
            object2 = this.O;
            n4 = l_0.a((ArrayList)object2);
            if (n4 > n3) {
                int n10;
                object2 = new StringBuilder();
                ei1_0.a(this, (StringBuilder)object2, ": start preparing next with trackNumber: ");
                n7 = this.P + n3;
                ((StringBuilder)object2).append(n7);
                ((StringBuilder)object2).append(" and remaining-tracks: ");
                n7 = l_0.a(this.O) - n3;
                ((StringBuilder)object2).append(n7);
                Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
                object2 = JioAds.Companion;
                ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object5 = JioAds$LogLevel.NONE;
                if (object == null) {
                    object = this.g;
                    if (object != null) {
                        object5 = this.O;
                        object3 = this.b;
                        object = ((m)object3).b((Context)object, n3, (ArrayList)object5);
                    } else {
                        n10 = 0;
                        object = null;
                    }
                    if (object == null) {
                        return;
                    }
                }
                this.M = n3;
                if (object4 != null) {
                    object = ((Object)StringsKt.m0(object)).toString();
                    object4.a((String)object);
                }
                object = ((com.jio.jioads.controller.f)this.e).a;
                n10 = ((com.jio.jioads.controller.o)object).l;
                object4 = new StringBuilder();
                String string2 = this.R();
                ((StringBuilder)object4).append(string2);
                ((StringBuilder)object4).append(": Media Timeout value considered ");
                ((StringBuilder)object4).append(n10);
                string2 = " sec";
                ((StringBuilder)object4).append(string2);
                com.jio.jioads.jioreel.tracker.model.b.g(((StringBuilder)object4).toString(), (JioAds$Companion)object2);
                object4 = new V(this, n10);
                com.jio.jioads.util.s.d((Function0)object4);
            }
        }
    }

    public final void C() {
        JioAdView$AdPodVariant jioAdView$AdPodVariant;
        Object object;
        Object object2;
        boolean bl2 = this.b();
        if (bl2 && (object2 = (object = this.d).L()) == (jioAdView$AdPodVariant = JioAdView$AdPodVariant.NONE)) {
            object2 = (com.jio.jioads.instreamads.vastparser.model.k)l_0.j(this.O);
            object2 = object2 != null ? ((com.jio.jioads.instreamads.vastparser.model.k)object2).k : null;
            if (object2 != null && (jioAdView$AdPodVariant = this.h) != null) {
                com.jio.jioads.instream.video.a.a(this, ": current ad mediation so attaching ui container");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                ((JioMediationVideoController)object2).setVideoPlayer$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(this);
                object = this.h;
                Intrinsics.checkNotNull(object);
                ((JioMediationVideoController)object2).attachAdUiContainer((ViewGroup)object);
            } else {
                object2 = new StringBuilder();
                object = object.n();
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(" currentMediationController is getting null");
                object = ((StringBuilder)object2).toString();
                object2 = "message";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void D(int n3) {
        void var3_14;
        Object object;
        void var3_5;
        s s7 = this;
        m m2 = this.b;
        Object object2 = m2.a;
        if (object2 != null) {
            String string2 = this.T();
            ArrayList arrayList = CollectionsKt.m0(((n)object2).m(m2, string2));
        } else {
            ArrayList arrayList = new ArrayList();
        }
        void var6_20 = var3_5;
        StringBuilder stringBuilder = new StringBuilder();
        object2 = this.R();
        stringBuilder.append((String)object2);
        stringBuilder.append(": EVENT_VIEWABLE_IMPRESSION :: fired for adId: ");
        object2 = this.T();
        stringBuilder.append((String)object2);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        object2 = object = s7.C.getValue();
        object2 = (JioEventTracker)object;
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents = JioEventTracker$TrackingEvents.EVENT_VIEWABLE_IMPRESSION;
        int n4 = n3 + 1;
        Integer n7 = n4;
        String string3 = this.T();
        Object object3 = this.V();
        com.jio.jioads.controller.f f5 = (com.jio.jioads.controller.f)s7.e;
        com.jio.jioads.controller.o o3 = f5.a;
        HashMap hashMap = s7.a;
        String string4 = com.jio.jioads.controller.o.o(o3, string3, (String)object3, hashMap);
        ViewGroup viewGroup = s7.h;
        object3 = null;
        if (viewGroup != null) {
            n4 = viewGroup.getWidth();
            Integer n8 = n4;
        } else {
            n4 = 0;
            Object var3_13 = null;
        }
        String string5 = String.valueOf(var3_14);
        ViewGroup viewGroup2 = s7.h;
        if (viewGroup2 != null) {
            n4 = viewGroup2.getHeight();
            object3 = n4;
        }
        String string6 = String.valueOf(object3);
        boolean bl2 = f5.a.a();
        n4 = f5.a.k;
        String string7 = s7.l;
        String string8 = s7.m;
        object3 = s7.d;
        JioEventTracker.fireEvents$default((JioEventTracker)object2, jioEventTracker$TrackingEvents, (com.jio.jioads.common.b)object3, (List)var6_20, n7, null, true, false, string4, false, string5, string6, null, bl2, n4, string7, null, string8, null, 163840, null);
    }

    public final void E(String object, String string2) {
        block4: {
            b b2 = this.h0();
            try {
                object = this.r((String)object, string2);
                if (object == null) break block4;
            }
            catch (Exception exception) {}
            string2 = new JSONObject(object);
        }
        string2 = null;
        b2.h = string2;
        object = new StringBuilder();
        string2 = this.R();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": clickEnableFlag from initVceFlag: ");
        string2 = this.h0().h;
        ((StringBuilder)object).append((Object)string2);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void F(boolean bl2) {
        Comparable<StringBuilder> comparable = new StringBuilder();
        Object object = this.R();
        comparable.append((String)object);
        object = ": mute called isCalledByDev: ";
        comparable.append((String)object);
        comparable.append(bl2);
        Intrinsics.checkNotNullParameter(comparable.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = this.t;
        int n3 = 0;
        comparable = null;
        if (object2 != null) {
            object = 0;
            object2.c((Integer)object);
        }
        object2 = this.u;
        if (object2 != null) {
            comparable = 0;
            ((k)object2).c((Integer)comparable);
        }
        object2 = this.W();
        if (object2 != null) {
            object2.b();
        }
        object2 = JioEventTracker$TrackingEvents.EVENT_MUTE;
        n3 = this.P;
        object = this.T();
        this.y((JioEventTracker$TrackingEvents)((Object)object2), n3, (String)object);
    }

    public final void G() {
        CountDownTimer countDownTimer = this.Q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.Q = null;
    }

    public final void H(int n3) {
        Object object;
        boolean bl2;
        Object object2;
        this.U = false;
        com.jio.jioads.instream.video.a.a(this, ": notifyLayoutChange");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        object3 = this.h;
        Object object4 = null;
        if (object3 != null) {
            object2 = this.y;
            if (object2 != null) {
                object2 = ((f)object2).e;
            } else {
                bl2 = false;
                object2 = null;
            }
            object3.removeView((View)object2);
        }
        if ((object3 = this.y) != null) {
            object = n3;
            ((f)object3).a = object;
            object = ((f)object3).d;
            if (object != null) {
                object2 = "layout_inflater";
                object = object.getSystemService((String)object2);
            } else {
                n3 = 0;
                object = null;
            }
            bl2 = object instanceof LayoutInflater;
            if (bl2) {
                object4 = object;
                object4 = (LayoutInflater)object;
            }
            if (object4 != null) {
                ((f)object3).b((LayoutInflater)object4);
                ((f)object3).a();
            }
        }
        this.j();
        object = new F73(this, 1);
        com.jio.jioads.util.s.b(100, (Function0)object);
    }

    public final void J(boolean bl2) {
        com.jio.jioads.instream.video.a.a(this, ": inside notifyAdsListUpdated");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        object = new n_0(this, bl2);
        com.jio.jioads.util.s.d((Function0)object);
    }

    public final void K(boolean n3) {
        int n4 = 1;
        Object object = new StringBuilder();
        Object object2 = this.R();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": pause called isCalledByDev: ");
        ((StringBuilder)object).append(n3 != 0);
        object = ((StringBuilder)object).toString();
        object2 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        boolean bl2 = this.c();
        if (!bl2) {
            return;
        }
        object3 = this.A;
        JioVideoViewState jioVideoViewState = b_0.a;
        bl2 = Intrinsics.areEqual(object3, jioVideoViewState);
        if (!(bl2 || (bl2 = Intrinsics.areEqual(object3 = this.A, jioVideoViewState = d_0.a)) || (bl2 = this.i0))) {
            boolean bl3;
            this.j0 = bl3 = n3 ^ true;
            this.k0 = n3;
            Object object4 = this.A;
            object2 = w_0.a;
            n3 = Intrinsics.areEqual(object4, object2);
            if (n3 == 0 && (object4 = this.X) != null && (n3 = object4.isPlaying()) == n4) {
                object4 = this.W();
                if (object4 != null) {
                    object4.g();
                }
                this.i0 = n4;
                object4 = JioEventTracker$TrackingEvents.EVENT_PAUSE;
                n4 = this.P;
                object = this.T();
                this.y((JioEventTracker$TrackingEvents)((Object)object4), n4, (String)object);
            } else {
                object4 = new StringBuilder();
                String string2 = ": inside checkIfPauseNeeded: Ad is already paused";
                l_0.e(this, (StringBuilder)object4, string2);
                object4 = ((JioAds$Companion)object).getInstance();
                ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            }
        } else {
            Object object5 = new StringBuilder();
            ei1_0.a(this, (StringBuilder)object5, ": can not pause ad as state is ");
            JioVideoViewState jioVideoViewState2 = this.A;
            ((StringBuilder)object5).append(jioVideoViewState2);
            Intrinsics.checkNotNullParameter(((StringBuilder)object5).toString(), (String)object2);
            object5 = ((JioAds$Companion)object).getInstance();
            ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
    }

    public final void L() {
        boolean bl2;
        Object object = this.X;
        if (object != null && !(bl2 = object.isPlaying())) {
            object = this.W();
            if (object != null) {
                object.e();
            }
            bl2 = false;
            this.i0 = false;
            object = JioEventTracker$TrackingEvents.EVENT_RESUME;
            int n3 = this.P;
            String string2 = this.T();
            this.y((JioEventTracker$TrackingEvents)((Object)object), n3, string2);
        } else {
            com.jio.jioads.instream.video.a.a(this, ": inside checkIfResumeNeeded: Ad is already playing");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void M(boolean var1_1) {
        block89: {
            block86: {
                block88: {
                    block87: {
                        block85: {
                            block83: {
                                block84: {
                                    block82: {
                                        block79: {
                                            block81: {
                                                block80: {
                                                    block78: {
                                                        block77: {
                                                            block76: {
                                                                block75: {
                                                                    var2_2 = "message";
                                                                    var3_3 = new StringBuilder();
                                                                    var4_4 /* !! */  = this.R();
                                                                    var3_3.append((String)var4_4 /* !! */ );
                                                                    var4_4 /* !! */  = ": performSkipAd: ";
                                                                    var3_3.append((String)var4_4 /* !! */ );
                                                                    var3_3.append((boolean)var1_1);
                                                                    var3_3 = var3_3.toString();
                                                                    Intrinsics.checkNotNullParameter(var3_3, var2_2);
                                                                    var3_3 = JioAds.Companion;
                                                                    var4_4 /* !! */  = var3_3.getInstance();
                                                                    var4_4 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                    var4_4 /* !! */  = JioAds$LogLevel.NONE;
                                                                    var5_5 = this.W;
                                                                    if (var5_5 != 0 || var1_1 != 0) break block75;
                                                                    var5_5 = this.S;
                                                                    if (var5_5 == 0) break block75;
                                                                    return;
                                                                }
                                                                var4_4 /* !! */  = this.A;
                                                                var6_6 = b_0.a;
                                                                var5_5 = (int)Intrinsics.areEqual(var4_4 /* !! */ , var6_6);
                                                                var6_6 = d_0.a;
                                                                this.A = var6_6;
                                                                var6_6 = this.X;
                                                                var7_7 = 0;
                                                                if (var6_6 == null) break block76;
                                                                var8_8 = var6_6.getDuration();
                                                                break block77;
                                                            }
                                                            var8_8 = 0;
                                                            var6_6 = null;
                                                        }
                                                        var8_8 /= 1000;
                                                        var9_9 = this.W;
                                                        if (var9_9 == 0) break block78;
                                                        var9_9 = var8_8;
                                                        break block79;
                                                    }
                                                    var10_10 = this.X;
                                                    if (var10_10 == null) break block80;
                                                    var9_9 = var10_10.getCurrentPosition();
                                                    break block81;
                                                }
                                                var9_9 = 0;
                                                var10_10 = null;
                                            }
                                            var9_9 /= 1000;
                                        }
                                        var11_11 = this.f0();
                                        if (var1_1 != 0) break block82;
                                        var12_12 = com.jio.jioads.adinterfaces.j_0.a(var11_11);
                                        if (var9_9 >= var12_12) break block82;
                                        var12_12 = (int)this.W;
                                        if (var12_12 != 0) break block82;
                                        return;
                                    }
                                    var13_13 = this.V;
                                    if (var13_13 == null || var1_1 != 0) break block83;
                                    if (var11_11 == null) break block84;
                                    var12_12 = com.jio.jioads.adinterfaces.j_0.a(var11_11);
                                    if (var12_12 <= 0) break block84;
                                    var13_13 = this.V;
                                    Intrinsics.checkNotNull(var13_13);
                                    var14_14 = var13_13.longValue();
                                    var16_15 = com.jio.jioads.adinterfaces.j_0.a(var11_11);
                                    var17_16 = var16_15;
                                    var19_18 = var14_14 == var17_16 ? 0 : (var14_14 < var17_16 ? -1 : 1);
                                    if (var19_18 < 0) {
                                        var13_13 = this.V;
                                        Intrinsics.checkNotNull(var13_13);
                                        var14_14 = var13_13.longValue();
                                        var17_16 = var9_9;
                                        var19_18 = var14_14 == var17_16 ? 0 : (var14_14 < var17_16 ? -1 : 1);
                                        if (var19_18 > 0) {
                                            return;
                                        }
                                    }
                                    var13_13 = this.V;
                                    Intrinsics.checkNotNull(var13_13);
                                    var14_14 = var13_13.longValue();
                                    var16_15 = com.jio.jioads.adinterfaces.j_0.a(var11_11);
                                    var17_16 = var16_15;
                                    var19_18 = var14_14 == var17_16 ? 0 : (var14_14 < var17_16 ? -1 : 1);
                                    if (var19_18 <= 0) break block83;
                                    var12_12 = com.jio.jioads.adinterfaces.j_0.a(var11_11);
                                    if (var12_12 > var9_9) {
                                        return;
                                    }
                                    break block83;
                                }
                                var13_13 = this.V;
                                Intrinsics.checkNotNull(var13_13);
                                var14_14 = var13_13.longValue();
                                var17_17 = var9_9;
                                var19_19 = var14_14 == var17_17 ? 0 : (var14_14 < var17_17 ? -1 : 1);
                                if (var19_19 > 0) {
                                    var12_12 = (int)this.W;
                                    if (var12_12 != 0) break block83;
                                    return;
                                }
                            }
                            var13_13 = new StringBuilder();
                            var20_20 = this.R();
                            var13_13.append(var20_20);
                            var20_20 = ": performSkipAd isCalledByDev: ";
                            var13_13.append(var20_20);
                            var13_13.append((boolean)var1_1);
                            var1_1 = 32;
                            var13_13.append((char)var1_1);
                            var13_13.append(var9_9);
                            var13_13.append((char)var1_1);
                            var13_13.append(var8_8);
                            var21_21 = var13_13.toString();
                            Intrinsics.checkNotNullParameter(var21_21, var2_2);
                            var21_21 = var3_3.getInstance();
                            var21_21.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            if (var5_5 != 0) ** GOTO lbl187
                            var21_21 = this.g0();
                            var1_1 = var21_21.j;
                            if (var1_1 == 0 || var9_9 >= var8_8) ** GOTO lbl187
                            var21_21 = JioEventTracker$TrackingEvents.EVENT_SKIP;
                            var22_22 = this.P;
                            var13_13 = this.T();
                            this.y((JioEventTracker$TrackingEvents)var21_21, var22_22, (String)var13_13);
lbl187:
                            // 3 sources

                            this.f();
                            if (var11_11 == null) ** GOTO lbl209
                            var21_21 = this.V;
                            if (var21_21 == null) break block85;
                            var14_14 = var21_21.longValue();
                            var7_7 = (int)var14_14;
                        }
                        var1_1 = com.jio.jioads.adinterfaces.j_0.a(var11_11);
                        if (var7_7 <= var1_1) ** GOTO lbl209
                        var21_21 = this.z;
                        if (var21_21 == null) break block86;
                        var22_22 = com.jio.jioads.adinterfaces.j_0.a(var11_11);
                        var3_3 = var22_22;
                        var21_21.onAdSkipped(var9_9, var8_8, (Integer)var3_3);
                        break block86;
lbl209:
                        // 2 sources

                        if ((var21_21 = this.z) == null) break block86;
                        var3_3 = this.V;
                        if (var3_3 == null) break block87;
                        var23_23 = var3_3.longValue();
                        var22_22 = (int)var23_23;
                        var3_3 = var22_22;
                        break block88;
                    }
                    var22_22 = 0;
                    var3_3 = null;
                }
                var21_21.onAdSkipped(var9_9, var8_8, (Integer)var3_3);
            }
            if (var5_5 != 0) break block89;
            var21_21 = JioEventTracker$TrackingEvents.EVENT_CLOSE;
            var22_22 = this.P;
            var4_4 /* !! */  = this.T();
            try {
                this.y((JioEventTracker$TrackingEvents)var21_21, var22_22, (String)var4_4 /* !! */ );
            }
            catch (Exception v0) {
                var21_21 = new StringBuilder();
                ei1_0.a(this, (StringBuilder)var21_21, ": ");
                var3_3 = Unit.a;
                var21_21.append(var3_3);
                Intrinsics.checkNotNullParameter(var21_21.toString(), var2_2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var21_21 = JioAds$LogLevel.NONE;
            }
        }
    }

    public final void N() {
        Object object = this.b;
        CharSequence charSequence = this.T();
        ((m)object).j((String)charSequence);
        object = this.O;
        charSequence = null;
        try {
            l_0.c((ArrayList)object, 0);
        }
        catch (Exception exception) {
            charSequence = new StringBuilder();
            String string2 = this.R();
            ((StringBuilder)charSequence).append(string2);
            string2 = ": Exception while clearPrevPlayingAd ";
            ((StringBuilder)charSequence).append(string2);
            l_0.f(exception, (StringBuilder)charSequence);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        }
    }

    public final void O(boolean bl2) {
        boolean bl3;
        Object object;
        Object object2;
        block12: {
            Object object3;
            object2 = this.d;
            object = object2.k0();
            if (object != (object3 = JioAdView$AdState.DESTROYED) && (object2 = object2.k0()) != (object = JioAdView$AdState.CLOSED) && !(bl3 = Intrinsics.areEqual(object2 = this.A, object = d_0.a)) && !(bl3 = Intrinsics.areEqual(object2 = this.K, object = this.d0()))) {
                object2 = this.d0();
                this.K = object2;
                object2 = this.h;
                if (object2 == null) break block12;
                int n3 = 1;
                object = new n7_0(this, n3);
                try {
                    object2.post((Runnable)object);
                }
                catch (Exception exception) {
                    object = new StringBuilder();
                    object3 = this.R();
                    ((StringBuilder)object).append((String)object3);
                    object3 = ": exception while adjust aspect ratio in orientation change: ";
                    ((StringBuilder)object).append((String)object3);
                    com.jio.jioads.jioreel.tracker.model.b.e(exception, (StringBuilder)object);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                }
            }
        }
        if (bl3 = this.c()) {
            return;
        }
        object2 = this.A;
        object = b_0.a;
        bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3 && !(bl3 = Intrinsics.areEqual(object2 = this.A, object = d_0.a)) && (bl3 = this.i0)) {
            bl3 = this.j0;
            if (bl3 && bl2) {
                return;
            }
            bl3 = this.k0;
            if (bl3 && bl2) {
                com.jio.jioads.instream.video.a.a(this, ": resume called isCalledByDev: true");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.L();
            } else {
                com.jio.jioads.instream.video.a.a(this, ": resume called isCalledByDev: false");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.L();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void P() {
        Exception exception2;
        Object object;
        Object object2;
        block18: {
            int n3;
            Object object3;
            int n4;
            int n7 = this.F;
            boolean bl2 = false;
            Object object4 = null;
            if (n7 != 0) {
                Object object5 = this.E;
                if (object5 != null) {
                    object5.dismiss();
                } else {
                    object5 = this.z;
                    if (object5 != null) {
                        object5.onAdCollapsed();
                    }
                }
                this.F = false;
                object5 = this.X;
                if (object5 == null) return;
                object5.a(false);
                return;
            }
            object2 = this.E;
            int n8 = 1;
            if (object2 == null) {
                n4 = -1;
                object2 = new LinearLayout.LayoutParams(n4, n4);
                ((LinearLayout.LayoutParams)object2).gravity = 17;
                object3 = this.h;
                object2 = new PopupWindow((View)object3, n4, n4, n8 != 0);
                this.E = object2;
                n3 = -16777216;
                object = new ColorDrawable(n3);
                object2.setBackgroundDrawable((Drawable)object);
                object2 = this.E;
                if (object2 != null) {
                    object = new i(this);
                    object2.setOnDismissListener((PopupWindow.OnDismissListener)object);
                }
            }
            this.F = n8;
            object2 = this.X;
            if (object2 != null) {
                object2.a(n8 != 0);
            }
            if ((n7 = Build.VERSION.SDK_INT) >= (n4 = 22) && (object2 = this.E) != null) {
                Intrinsics.checkNotNull(object2);
                com.jio.jioads.videomodule.e.a((PopupWindow)object2);
            }
            if ((object2 = this.h) != null) {
                object2 = com.jio.jioads.util.s.a((View)object2);
            } else {
                n7 = 0;
                object2 = null;
            }
            this.h0 = object2;
            object2 = this.E;
            if (object2 != null) {
                object = this.h;
                object2.setContentView((View)object);
            }
            object2 = "message";
            try {
                object = this.g;
            }
            catch (Exception exception2) {
                break block18;
            }
            n3 = object instanceof MutableContextWrapper;
            if (n3 != 0) {
                object3 = "null cannot be cast to non-null type android.content.MutableContextWrapper";
                Intrinsics.checkNotNull(object, (String)object3);
                object = (MutableContextWrapper)object;
                object = object.getBaseContext();
            }
            String string2 = "null cannot be cast to non-null type android.app.Activity";
            Intrinsics.checkNotNull(object, string2);
            object = (Activity)object;
            object3 = new WeakReference(object);
            object = ((Reference)object3).get();
            object = (Activity)object;
            if (object != null && (n4 = (int)(object.isDestroyed() ? 1 : 0)) == n8) {
                bl2 = true;
            }
            Object object6 = new StringBuilder();
            object = this.R();
            ((StringBuilder)object6).append((String)object);
            object = ": WeakReference Activity isTargetActivityFinished: ";
            ((StringBuilder)object6).append((String)object);
            ((StringBuilder)object6).append(bl2);
            object6 = ((StringBuilder)object6).toString();
            Intrinsics.checkNotNullParameter(object6, (String)object2);
            object6 = JioAds.Companion;
            object = ((JioAds$Companion)object6).getInstance();
            object.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = ((Reference)object3).get();
            if (object != null) {
                object = ((Reference)object3).get();
                Intrinsics.checkNotNull(object);
                object = (Activity)object;
                n4 = (int)(object.isFinishing() ? 1 : 0);
                if (n4 == 0 && !bl2) {
                    object4 = new StringBuilder();
                    object = this.R();
                    ((StringBuilder)object4).append((String)object);
                    object = ": WeakReference Activity.";
                    ((StringBuilder)object4).append((String)object);
                    object4 = ((StringBuilder)object4).toString();
                    Intrinsics.checkNotNullParameter(object4, (String)object2);
                    object4 = ((JioAds$Companion)object6).getInstance();
                    ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = new Handler();
                    object6 = new com.jio.jioads.videomodule.f(this);
                    long l2 = 100;
                    object4.postDelayed((Runnable)object6, l2);
                    return;
                }
            }
            object4 = new StringBuilder();
            object = this.R();
            ((StringBuilder)object4).append((String)object);
            object = ": Cannot show icon PopUp on finish of Activity.";
            ((StringBuilder)object4).append((String)object);
            object4 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullParameter(object4, (String)object2);
            object4 = ((JioAds$Companion)object6).getInstance();
            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            return;
        }
        Object object7 = new StringBuilder();
        object = this.R();
        ((StringBuilder)object7).append((String)object);
        ((StringBuilder)object7).append(": WeakReference icon: ");
        l_0.f(exception2, (StringBuilder)object7);
        object7 = JioAds.Companion;
        ((JioAds$Companion)object7).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = "<this>";
        Intrinsics.checkNotNullParameter(exception2, (String)object);
        String string3 = yc0_2.b(exception2);
        Intrinsics.checkNotNullParameter(string3, (String)object2);
        object2 = ((JioAds$Companion)object7).getInstance();
        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final void Q(boolean bl2) {
        Object object = new StringBuilder();
        Object object2 = this.R();
        ((StringBuilder)object).append((String)object2);
        object2 = ": unMute called isCalledByDev: ";
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(bl2);
        Object object3 = ((StringBuilder)object).toString();
        object = "message";
        Intrinsics.checkNotNullParameter(object3, (String)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = this.t;
        int n3 = 1;
        if (object3 != null) {
            object2 = n3;
            object3.c((Integer)object2);
        }
        object3 = this.u;
        if (object3 != null) {
            object = n3;
            ((k)object3).c((Integer)object);
        }
        object3 = this.W();
        if (object3 != null) {
            object3.a();
        }
        object3 = JioEventTracker$TrackingEvents.EVENT_UNMUTE;
        n3 = this.P;
        object2 = this.T();
        this.y((JioEventTracker$TrackingEvents)((Object)object3), n3, (String)object2);
    }

    public final String R() {
        return (String)this.j.getValue();
    }

    /*
     * Unable to fully structure code
     */
    public final String S() {
        var1_1 = this.b;
        var2_2 = var1_1.a;
        if (var2_2 != null && (var2_2 = (String)var2_2.u.get(var3_3 = this.T())) != null) {
            var2_2 = StringsKt.m0((CharSequence)var2_2).toString();
        } else {
            var4_4 = false;
            var2_2 = null;
        }
        var3_3 = var1_1.a;
        if (var3_3 == null) ** GOTO lbl-1000
        var5_5 = this.T();
        var3_3 = var3_3.t;
        if (var3_3 != null) {
            Intrinsics.checkNotNull(var3_3);
            var3_3 = (String)var3_3.get(var5_5);
        } else {
            var3_3 = null;
        }
        if (var3_3 != null) {
            var3_3 = StringsKt.m0((CharSequence)var3_3).toString();
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = null;
        }
        var1_1 = var1_1.a;
        var1_1 = var1_1 != null && (var1_1 = var1_1.b(var5_5 = this.T())) != null ? StringsKt.m0((CharSequence)var1_1).toString() : null;
        var6_6 = TextUtils.isEmpty((CharSequence)var2_2);
        if (!var6_6) {
            return var2_2;
        }
        var4_4 = TextUtils.isEmpty((CharSequence)var3_3);
        if (!var4_4) {
            return var3_3;
        }
        var4_4 = TextUtils.isEmpty((CharSequence)var1_1);
        if (!var4_4) {
            return var1_1;
        }
        return null;
    }

    public final String T() {
        Object object;
        block5: {
            try {
                object = this.O;
            }
            catch (Exception exception) {}
            object = l_0.j((ArrayList)object);
            object = (com.jio.jioads.instreamads.vastparser.model.k)object;
            if (object == null) break block5;
            object = ((com.jio.jioads.instreamads.vastparser.model.k)object).c;
        }
        object = null;
        return object;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * WARNING - bad return control flow
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int U() {
        int n3 = this.P;
        Object object = this.O;
        A a2 = com.jio.jioads.videomodule.A.c;
        String string2 = "predicate";
        Intrinsics.checkNotNullParameter(a2, string2);
        int n4 = 0;
        string2 = null;
        if (object == null) return n3 += n4;
        try {
            void var6_9;
            boolean bl2;
            boolean bl3 = object.isEmpty();
            if (bl3) return n3 += n4;
            object = object.iterator();
            boolean bl4 = false;
            while (bl2 = object.hasNext()) {
                Object object2 = object.next();
                object2 = a2.invoke(object2);
                bl2 = (Boolean)(object2 = (Boolean)object2);
                if (!bl2 || ++var6_9 >= 0) continue;
                xx_2.m();
                boolean bl5 = false;
                object = null;
                throw null;
            }
            n4 = var6_9;
            return n3 += n4;
        }
        catch (Exception exception) {}
        catch (Exception exception) {
            n3 = this.P;
            ArrayList arrayList = this.O;
            int n7 = l_0.a(arrayList);
            n3 += n7;
        }
        return n3;
        return n3 += n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String V() {
        Object object;
        block16: {
            boolean bl2;
            block15: {
                block14: {
                    String string2 = null;
                    try {
                        object = this.e;
                    }
                    catch (Exception exception) {
                        return string2;
                    }
                    object = (com.jio.jioads.controller.f)object;
                    object = ((com.jio.jioads.controller.f)object).a;
                    bl2 = ((com.jio.jioads.controller.o)object).o;
                    if (!bl2) break block14;
                    object = this.O;
                    object = l_0.j((ArrayList)object);
                    object = (com.jio.jioads.instreamads.vastparser.model.k)object;
                    if (object == null) return string2;
                    return ((com.jio.jioads.instreamads.vastparser.model.k)object).n;
                }
                object = this.b;
                object = ((m)object).a;
                if (object == null) break block15;
                object = ((n)object).f;
                break block16;
            }
            bl2 = false;
            object = null;
        }
        return this.s((ArrayList)object);
    }

    public final a W() {
        Object object = this.X;
        o o3 = this.t;
        boolean bl2 = Intrinsics.areEqual(object, o3);
        if (bl2) {
            object = this.f0;
        } else {
            o3 = this.u;
            boolean bl3 = Intrinsics.areEqual(object, o3);
            if (bl3) {
                object = this.g0;
            } else {
                bl3 = false;
                object = null;
            }
        }
        return object;
    }

    public final int X() {
        int n3;
        block2: {
            Object object;
            block1: {
                block0: {
                    object = this.X;
                    if (object == null) break block0;
                    object.getVolume();
                    object = this.X;
                    if (object == null) break block1;
                    object = object.getVolume();
                    n3 = (Integer)object;
                    break block2;
                }
                object = new StringBuilder();
                String string2 = ": Current JioPlayer is Getting Null so retuning Zero";
                com.jio.jioads.common.b b2 = this.d;
                com.jio.jioads.adinterfaces.j_0.i(b2, (StringBuilder)object, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final Integer Z() {
        Object object = this.X;
        if (object != null) {
            int n3 = object.getCurrentPosition();
            object = n3;
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }

    public final boolean a() {
        Object object = this.O;
        int n3 = object.isEmpty();
        int n4 = 1;
        if ((n3 ^= n4) != 0) {
            Object object2;
            object = this.T();
            int n7 = 0;
            Object object3 = null;
            if (object != null) {
                Object object4 = this.b;
                Object object5 = ((m)object4).a;
                object5 = object5 != null && (object5 = ((n)object5).b((String)object)) != null ? ((Object)StringsKt.m0((CharSequence)object5)).toString() : null;
                object2 = ((m)object4).a;
                object2 = object2 != null && (object2 = (String)((n)object2).u.get(object)) != null ? ((Object)StringsKt.m0((CharSequence)object2)).toString() : null;
                object4 = ((m)object4).a;
                if (object4 != null) {
                    object4 = ((n)object4).t;
                    if (object4 != null) {
                        Intrinsics.checkNotNull(object4);
                        object = (String)((HashMap)object4).get(object);
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    if (object != null) {
                        object = StringsKt.m0((CharSequence)object);
                        object3 = object.toString();
                    }
                }
                object = object3;
                object3 = object5;
            } else {
                n3 = 0;
                object = null;
                object2 = null;
            }
            if (!(object3 != null && (n7 = ((String)object3).length()) != 0 || object2 != null && (n7 = ((String)object2).length()) != 0 || object != null && (n3 = ((String)object).length()) != 0)) {
                n4 = 0;
            }
            return n4 != 0;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        Object object;
        boolean bl2 = false;
        try {
            object = this.O;
        }
        catch (Exception exception) {
            return bl2;
        }
        boolean bl3 = object.isEmpty() ^ true;
        if (!bl3) return bl2;
        object = this.O;
        object = l_0.j((ArrayList)object);
        object = (com.jio.jioads.instreamads.vastparser.model.k)object;
        if (object == null) return bl2;
        object = ((com.jio.jioads.instreamads.vastparser.model.k)object).j;
        if (object == null) return bl2;
        return (Boolean)object;
    }

    public final Integer b0() {
        Object object = this.X;
        if (object != null) {
            int n3 = object.getDuration();
            object = n3;
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }

    public final boolean c() {
        boolean bl2;
        boolean bl3;
        o o3 = this.X;
        if (o3 == null || (bl3 = o3.isPlaying()) != (bl2 = true)) {
            bl2 = false;
        }
        return bl2;
    }

    public final RelativeLayout c0() {
        f f5 = this.y;
        f5 = f5 != null ? f5.e : null;
        return f5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean d() {
        int n3;
        int n4;
        Object object = this.V;
        if (object == null) return 0 != 0;
        Intrinsics.checkNotNull(object);
        long l2 = (Long)object;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) return 0 != 0;
        object = this.T;
        if (object == null) return 0 != 0;
        object = this.V;
        Intrinsics.checkNotNull(object);
        l2 = (Long)object;
        Number number = this.T;
        Integer n7 = null;
        if (number != null) {
            n4 = (Integer)number / 1000;
            number = n4;
        } else {
            n4 = 0;
            number = null;
        }
        Intrinsics.checkNotNull(number);
        long l7 = ((Integer)number).intValue();
        n4 = (int)(l2 == l7 ? 0 : (l2 < l7 ? -1 : 1));
        if (n4 <= 0) return 1 != 0;
        object = this.R;
        if (object == null) return 0 != 0;
        int n8 = com.jio.jioads.adinterfaces.j_0.a((String)object);
        l2 = n8;
        number = this.V;
        Intrinsics.checkNotNull(number);
        l7 = (Long)number;
        n4 = (int)(l2 == l7 ? 0 : (l2 < l7 ? -1 : 1));
        if (n4 >= 0) return 0 != 0;
        object = this.R;
        n8 = com.jio.jioads.adinterfaces.j_0.a((String)object);
        Integer n10 = this.T;
        if (n10 != null) {
            n3 = n10 / 1000;
            n7 = n3;
        }
        Intrinsics.checkNotNull(n7);
        n3 = n7;
        if (n8 > n3) return 0 != 0;
        return 1 != 0;
    }

    public final Integer d0() {
        Object object = this.g;
        if (object != null && (object = object.getResources()) != null && (object = object.getConfiguration()) != null) {
            int n3 = object.orientation;
            object = n3;
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        block20: {
            block19: {
                block18: {
                    var1_1 = this;
                    var2_2 = "message";
                    var3_3 = this.b;
                    try {
                        var4_6 = this.b();
                        if (var4_6 != 0) {
                            return;
                        }
                        var4_6 = this.a();
                        if (var4_6 == 0) return;
                        var5_7 = this.h0();
                        var4_6 = var5_7.f;
                        if (var4_6 != 0) {
                            return;
                        }
                        var5_7 = new StringBuilder();
                        var6_9 = this.R();
                        var5_7.append((String)var6_9);
                        var6_9 = ": inside performCTAClick";
                        var5_7.append((String)var6_9);
                        var5_7 = var5_7.toString();
                        Intrinsics.checkNotNullParameter(var5_7, (String)var2_2);
                        var5_7 = JioAds.Companion;
                        var5_7 = var5_7.getInstance();
                        var5_7.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var5_7 = JioAds$LogLevel.NONE;
                        var5_7 = var3_3.a;
                        var6_9 = null;
                        if (var5_7 == null) break block18;
                        var7_11 = this.T();
                        var5_7 = var5_7.u;
                        var5_7 = var5_7.get(var7_11);
                        var5_7 = (String)var5_7;
                        break block19;
                    }
                    catch (Exception var3_4) {
                        break block20;
                    }
                }
                var4_6 = 0;
                var5_7 = null;
            }
            if (var5_7 != null && (var4_6 = var5_7.length()) != 0 && (var5_7 = var3_3.a) != null) {
                var7_11 = this.T();
                var5_7 = var5_7.u;
                var5_7 = var5_7.get(var7_11);
                var8_13 = var5_7 = (String)var5_7;
            } else {
                var8_13 = null;
            }
            var5_7 = var3_3.a;
            if (var5_7 == null) ** GOTO lbl-1000
            var7_11 = this.T();
            var5_7 = var5_7.t;
            if (var5_7 != null) {
                Intrinsics.checkNotNull(var5_7);
                var5_7 = var5_7.get(var7_11);
                var5_7 = (String)var5_7;
            } else lbl-1000:
            // 2 sources

            {
                var4_6 = 0;
                var5_7 = null;
            }
            if (var5_7 == null || (var4_6 = var5_7.length()) == 0 || (var5_7 = var3_3.a) == null) ** GOTO lbl-1000
            var7_11 = this.T();
            var5_7 = var5_7.t;
            if (var5_7 != null) {
                Intrinsics.checkNotNull(var5_7);
                var5_7 = var5_7.get(var7_11);
                var9_15 = var5_7 = (String)var5_7;
            } else lbl-1000:
            // 2 sources

            {
                var9_15 = null;
            }
            var5_7 = var3_3.a;
            if (var5_7 != null) {
                var7_11 = this.T();
                var5_7 = var5_7.b((String)var7_11);
            } else {
                var4_6 = 0;
                var5_7 = null;
            }
            if (var5_7 != null && (var4_6 = var5_7.length()) != 0 && (var3_3 = var3_3.a) != null) {
                var5_7 = this.T();
                var10_17 = var3_3 = var3_3.b((String)var5_7);
            } else {
                var10_17 = null;
            }
            var11_19 = var1_1.d;
            var12_21 = var1_1.e;
            var5_7 = this.T();
            if (var5_7 == null) {
                var5_7 = "";
            }
            var13_23 = var5_7;
            var14_25 = this.V();
            var5_7 = var1_1.h;
            if (var5_7 != null) {
                var4_6 = var5_7.getWidth();
                var5_7 = var4_6;
            } else {
                var4_6 = 0;
                var5_7 = null;
            }
            var15_27 = String.valueOf(var5_7);
            var5_7 = var1_1.h;
            if (var5_7 != null) {
                var4_6 = var5_7.getHeight();
                var6_9 = var4_6;
            }
            var16_29 = String.valueOf(var6_9);
            var5_7 = new o_0(var1_1);
            var6_9 = var1_1.a;
            var17_30 = com.jio.jioads.utils.e.i((Map)var6_9);
            var18_31 = null;
            var7_11 = var3_3;
            var3_3 = new com.jio.jioads.common.f(var11_19, var12_21, (String)var8_13, (String)var9_15, (String)var10_17, null, (String)var13_23, var14_25, var15_27, var16_29, (com.jio.jioads.common.e)var5_7, var17_30);
            var3_3.a();
            return;
        }
        var5_8 = new StringBuilder();
        var6_10 = this.R();
        var5_8.append(var6_10);
        var5_8.append(": Exception while handling Vast click.ex= ");
        var5_8.append(var3_4);
        Intrinsics.checkNotNullParameter(var5_8.toString(), (String)var2_2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var2_2 = JioAds$LogLevel.NONE;
        var2_2 = JioAdError.Companion;
        var5_8 = JioAdError$JioAdErrorType.ERROR_IN_AD_CLICK;
        var2_2.getClass();
        var2_2 = com.jio.jioads.adinterfaces.t_0.a((JioAdError$JioAdErrorType)var5_8);
        var5_8 = Utility.INSTANCE;
        var6_10 = var1_1.g;
        var7_12 = this.R();
        var11_20 = com.jio.jioads.cdnlogging.d.a;
        var12_22 = var2_2.getErrorTitle();
        var8_14 /* !! */  = new StringBuilder("exception: ");
        var3_5 = yc0_2.b(var3_4);
        var8_14 /* !! */ .append((String)var3_5);
        var8_14 /* !! */  = var8_14 /* !! */ .toString();
        var9_16 = var3_5 = var1_1.e;
        var9_16 = ((com.jio.jioads.controller.f)var3_5).a.T();
        var19_33 = ((com.jio.jioads.controller.f)var3_5).a.a();
        var18_32 = var19_33;
        var3_5 = var1_1.d;
        var13_24 = var3_5.q0();
        var14_26 = var2_2.getErrorCode();
        var10_18 = "handleVastClickThrough";
        var15_28 = null;
        var5_8.logError((Context)var6_10, var7_12, var11_20, var12_22, (String)var8_14 /* !! */ , (com.jio.jioads.cdnlogging.a)var9_16, var10_18, var18_32, var13_24, var14_26, false);
    }

    public final int e0() {
        int n3;
        Object object = this.f0();
        Object object2 = new StringBuilder();
        Object object3 = this.d;
        String string2 = ": inside getSkipOffSetDuration: ";
        l_0.d(object3, (StringBuilder)object2, string2, (String)object);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = ": NON SKIPPABLE AD";
        int n4 = -1;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            Object object4 = "%";
            int n7 = 0;
            float f5 = 0.0f;
            o o3 = null;
            int n8 = StringsKt.F((CharSequence)object, (CharSequence)object4, false);
            if (n8 != 0) {
                String[] stringArray;
                Object object5 = this.b.a;
                if (object5 != null) {
                    stringArray = this.T();
                    object5 = ((n)object5).j((String)stringArray);
                } else {
                    n8 = 0;
                    object5 = null;
                }
                stringArray = new StringBuilder();
                ei1_0.a(this, (StringBuilder)stringArray, ": videoDuration for trackNumber [");
                int n10 = this.P;
                stringArray.append(n10);
                stringArray.append("] is ");
                stringArray.append((String)object5);
                stringArray = stringArray.toString();
                String string3 = "message";
                Intrinsics.checkNotNullParameter(stringArray, string3);
                stringArray = ((JioAds$Companion)object2).getInstance();
                stringArray.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                boolean bl2 = TextUtils.isEmpty((CharSequence)object5);
                if (!bl2) {
                    n8 = com.jio.jioads.adinterfaces.j_0.a((String)object5);
                    object4 = fT1.a((String)object4, (String)object);
                    stringArray = new String[]{};
                    object4 = object4.toArray(stringArray)[0];
                    float f6 = Integer.parseInt((String)object4) * n8;
                    n7 = 1120403456;
                    f5 = 100.0f;
                    double d2 = Math.ceil(f6 /= f5);
                    n3 = (int)d2;
                } else {
                    n3 = -1;
                    float f7 = 0.0f / 0.0f;
                }
            } else {
                n3 = com.jio.jioads.adinterfaces.j_0.a((String)object);
            }
            o3 = this.X;
            if (o3 != null) {
                Intrinsics.checkNotNull(o3);
                n7 = o3.getDuration();
                if (n7 != n4) {
                    o3 = this.X;
                    Intrinsics.checkNotNull(o3);
                    n7 = o3.getDuration() / 1000;
                    if (n3 >= n7) {
                        l_0.h("mSkipOffset  is greater than or equal to video duration: ", (String)object);
                        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = new StringBuilder();
                        l_0.e(this, (StringBuilder)object, (String)object3);
                        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = this.X;
                        Intrinsics.checkNotNull(object);
                        this.q = object = Integer.valueOf(object.getDuration() / 1000);
                        return n4;
                    }
                }
            }
        } else {
            object = new StringBuilder();
            l_0.e(this, (StringBuilder)object, (String)object3);
            object = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            n3 = -1;
            float f8 = 0.0f / 0.0f;
        }
        if (n3 == n4) {
            object = this.X;
            Intrinsics.checkNotNull(object);
            int n14 = object.getDuration() / 1000;
            this.q = object = Integer.valueOf(n14);
        }
        return n3;
    }

    public final void f() {
        Object object;
        Object object2;
        com.jio.jioads.instream.video.a.a(this, ": JioVideoView: performCompletionTask");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        object3 = this.e0;
        if (object3 != null) {
            object2 = ((e)object3).d;
            object = ((f)object2).D;
            if (object != null) {
                object.removeAllViews();
            }
            if ((object2 = ((f)object2).e) != null) {
                object2.removeAllViews();
            }
            object3 = ((e)object3).e;
            object3.removeAllViews();
        }
        if ((object3 = this.t) != null) {
            object3.f();
        }
        if ((object3 = this.u) != null) {
            ((k)object3).f();
        }
        this.x = 0;
        object3 = this.E;
        if (object3 != null) {
            object3.dismiss();
        }
        object3 = null;
        this.e0 = null;
        object2 = this.Z;
        if (object2 != null) {
            object2.cancel();
        }
        this.Z = null;
        object2 = this.f;
        if (object2 != null) {
            JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.AD_BREAK_ENDED;
            object = new JioAdEvent(jioAdEvent$AdEventType);
            object2.onJioVmapEvent((JioAdEvent)object, null);
        }
        this.l();
    }

    public final String f0() {
        Object object = this.O;
        boolean bl2 = ((ArrayList)object).isEmpty() ^ true;
        if (bl2 && (object = (com.jio.jioads.instreamads.vastparser.model.k)l_0.j(this.O)) != null && (object = ((com.jio.jioads.instreamads.vastparser.model.k)object).m) != null) {
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        String string2 = null;
        m m2 = this.b;
        if (bl2) {
            object = new StringBuilder();
            ei1_0.a(this, (StringBuilder)object, ": ");
            Object object2 = this.R;
            CharSequence charSequence = " inside wrapper ad";
            com.jio.jioads.adinterfaces.j_0.k((StringBuilder)object, (String)object2, (String)charSequence);
            object = JioAds.Companion;
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = m2.a;
            if (object2 != null) {
                charSequence = this.i0();
                object2 = ((n)object2).p((String)charSequence);
            } else {
                object2 = null;
            }
            if (object2 == null) {
                charSequence = new StringBuilder();
                String string3 = this.R();
                ((StringBuilder)charSequence).append(string3);
                string3 = ": getSkipOffset wrapper ad: ";
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append((String)object2);
                object2 = ((StringBuilder)charSequence).toString();
                charSequence = "message";
                Intrinsics.checkNotNullParameter(object2, (String)charSequence);
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = m2.a;
                if (object != null) {
                    string2 = this.T();
                    string2 = ((n)object).p(string2);
                }
                return string2;
            }
            return object2;
        }
        com.jio.jioads.instream.video.a.a(this, ": mSkipOffset inside normal ad");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = m2.a;
        if (object != null) {
            string2 = this.T();
            string2 = ((n)object).p(string2);
        }
        return string2;
    }

    public final void g() {
        String string2;
        int n3;
        com.jio.jioads.instream.video.a.a(this, ": playAgain: called");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object = JioAds$LogLevel.NONE;
        this.x = n3 = this.x + 1;
        object = this.X;
        if (object != null) {
            object.b();
        }
        if ((object = this.X) != null) {
            object.start();
        }
        if ((object = this.e0) != null) {
            ((e)object).s();
        }
        if ((object = this.z) != null) {
            string2 = this.T();
            if (string2 == null) {
                string2 = "";
            }
            int n4 = this.x;
            object.onPlayAgain(string2, n4);
        }
        if ((object = this.e0) != null && (string2 = ((e)object).d.h) != null) {
            object = ((e)object).g;
            n3 = ((b)object).j ^ 1;
            if (n3 != 0) {
                n3 = 0;
                object = null;
            } else {
                n3 = 8;
            }
            string2.setVisibility(n3);
        }
    }

    public final com.jio.jioads.videomodule.config.a g0() {
        return (com.jio.jioads.videomodule.config.a)this.s.getValue();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        com.jio.jioads.instream.video.a.a(this, ": prepare() called");
        Object object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = b_0.a;
        this.A = object2;
        synchronized (this) {
            object2 = new s_0(this);
            com.jio.jioads.util.s.d((Function0)object2);
        }
        object2 = (com.jio.jioads.instreamads.vastparser.model.k)l_0.j(this.O);
        if (object2 == null || (object2 = ((com.jio.jioads.instreamads.vastparser.model.k)object2).q) == null) {
            object2 = this.T();
        }
        Object object3 = this.V();
        this.E((String)object2, (String)object3);
        int n3 = 0;
        this.P = 0;
        this.n();
        object2 = this.b0;
        if (object2 != null) {
            object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null && (n3 = ((String)object2).length()) != 0) {
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            object2 = this.b0;
            hashMap.put("skipThumbnail", object2);
            object2 = new StringBuilder();
            ei1_0.a(this, (StringBuilder)object2, ": Skip Thumbnail Url: ");
            object3 = this.b0;
            d90_0.b((StringBuilder)object2, (String)object3, "message", (JioAds$Companion)object);
            Context context = this.g;
            if (context != null) {
                Intrinsics.checkNotNull(context);
                JioAds$MediaType jioAds$MediaType = JioAds$MediaType.IMAGE;
                object = ((com.jio.jioads.controller.f)this.e).a;
                int n4 = ((com.jio.jioads.controller.o)object).l;
                C c2 = new C(hashMap, this);
                Integer n7 = n4;
                String string2 = "";
                object3 = object2;
                object2 = new l(context, hashMap, string2, jioAds$MediaType, false, null, null, c2, n7);
                ((l)object2).a();
            }
        }
        if ((object = this.z) != null) {
            object2 = this.T();
            if (object2 == null) {
                object2 = "";
            }
            int n8 = this.P;
            object.onStartPrepare((String)object2, n8);
        }
    }

    public final b h0() {
        return (b)this.D.getValue();
    }

    public final void i() {
        int n3;
        Object object = Utility.INSTANCE;
        String string2 = this.R();
        this.l = string2 = ((Utility)object).getCcbValue(string2);
        string2 = this.g;
        if (string2 != null && (string2 = this.m0) != null && (n3 = string2.length()) != 0) {
            string2 = this.g;
            Intrinsics.checkNotNull(string2);
            String string3 = this.m0;
            Intrinsics.checkNotNull(string3);
            this.m = object = ((Utility)object).getCbValue((Context)string2, string3);
        }
        object = new StringBuilder();
        ei1_0.a(this, (StringBuilder)object, ": ccb value generated: ");
        string2 = this.l;
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", cb value: ");
        string2 = this.m;
        ir3_0.b((StringBuilder)object, string2, "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String i0() {
        Object object;
        StringBuilder stringBuilder;
        String string2;
        block24: {
            block23: {
                void var2_7;
                block22: {
                    block21: {
                        ArrayList arrayList;
                        string2 = null;
                        try {
                            arrayList = this.O;
                        }
                        catch (Exception exception) {
                            return string2;
                        }
                        Object object2 = l_0.j(arrayList);
                        com.jio.jioads.instreamads.vastparser.model.k k2 = (com.jio.jioads.instreamads.vastparser.model.k)object2;
                        if (k2 == null) break block21;
                        String string3 = k2.q;
                        break block22;
                    }
                    Object var2_6 = null;
                }
                if (var2_7 == null) return string2;
                stringBuilder = new StringBuilder();
                object = this.R();
                stringBuilder.append((String)object);
                object = ": wrapperId";
                stringBuilder.append((String)object);
                object = this.O;
                object = l_0.j((ArrayList)object);
                object = (com.jio.jioads.instreamads.vastparser.model.k)object;
                if (object == null) break block23;
                object = ((com.jio.jioads.instreamads.vastparser.model.k)object).q;
                break block24;
            }
            object = null;
        }
        stringBuilder.append((String)object);
        String string4 = stringBuilder.toString();
        object = "message";
        Intrinsics.checkNotNullParameter(string4, (String)object);
        JioAds$Companion jioAds$Companion = JioAds.Companion;
        JioAds jioAds = jioAds$Companion.getInstance();
        jioAds.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        ArrayList arrayList = this.O;
        Object object3 = l_0.j(arrayList);
        com.jio.jioads.instreamads.vastparser.model.k k3 = (com.jio.jioads.instreamads.vastparser.model.k)object3;
        if (k3 == null) return string2;
        return k3.q;
    }

    public final void j() {
        int n3;
        int n4;
        Object object;
        long l2;
        long l3;
        int n7;
        Object object2 = this.e0;
        if (object2 != null) {
            ((e)object2).q();
        }
        if ((object2 = this.e0) != null) {
            ((e)object2).s();
        }
        object2 = this.X;
        long l4 = 0L;
        if (object2 != null) {
            n7 = object2.getDuration();
            l3 = n7;
        } else {
            l3 = l4;
        }
        object2 = this.X;
        if (object2 != null) {
            n7 = object2.getCurrentPosition();
            l2 = n7;
        } else {
            l2 = l4;
        }
        object2 = this.e0;
        if (object2 != null) {
            ((e)object2).h(l3, l2);
        }
        this.j0();
        this.C();
        object2 = this.e0;
        if (object2 != null) {
            object = this.N;
            n4 = this.a();
            ((e)object2).i((AdMetaData$AdParams)object, n4 != 0);
        }
        if ((object2 = this.e0) != null) {
            n3 = this.P;
            n4 = this.U();
            ((e)object2).c(n3, n4);
        }
        if ((n7 = (int)(this.i0 ? 1 : 0)) != 0) {
            object2 = this.e0;
            if (object2 != null) {
                ((e)object2).g();
            }
        } else {
            object2 = this.e0;
            if (object2 != null) {
                ((e)object2).e();
            }
        }
        if ((n7 = (int)(Intrinsics.areEqual(object2 = this.B, object = h_0.a) ? 1 : 0)) != 0) {
            object2 = this.e0;
            if (object2 != null) {
                ((e)object2).b();
            }
        } else {
            object2 = this.e0;
            if (object2 != null) {
                ((e)object2).a();
            }
        }
        if ((n7 = (int)(this.W ? 1 : 0)) != 0) {
            object2 = this.e0;
            if (object2 != null) {
                n3 = (int)(this.d() ? 1 : 0);
                if (n3 == 0 || (object = this.y) == null || (n3 = (int)(((f)object).c() ? 1 : 0)) != (n4 = 1)) {
                    n4 = 0;
                }
                object = this.R;
                Integer n8 = this.T;
                if (n8 != null) {
                    int n10 = n8;
                    l4 = n10;
                }
                int n14 = 1000;
                l2 = n14;
                Long l7 = l4 /= l2;
                ((e)object2).j(n4 != 0, (String)object, l7);
            }
        } else {
            this.o();
        }
    }

    public final void j0() {
        Object object;
        int n3;
        Object object2;
        boolean bl2;
        Object object3;
        int n4;
        f f5 = this.y;
        if (f5 == null) {
            return;
        }
        Object object4 = f5.q;
        if (object4 != null) {
            n4 = 1;
            object3 = new o7_0(this, n4);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        if ((object4 = f5.r) != null) {
            n4 = 1;
            object3 = new s7_0(this, n4);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        if ((object4 = f5.F) != null) {
            n4 = 2;
            object3 = new t7_0(this, n4);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        if ((object4 = f5.M) != null) {
            n4 = 1;
            object3 = new bz1_0(this, n4);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        if ((object4 = f5.w) != null) {
            n4 = 2;
            object3 = new vo_1(this, n4);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        if ((object4 = f5.C) != null) {
            n4 = 1;
            object3 = new kO2(this, n4);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        if ((object4 = f5.A) != null) {
            n4 = 1;
            object3 = new yo_0(this, n4);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        if ((object4 = f5.t) != null) {
            n4 = 1;
            object3 = new fZ1(this, n4);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        if ((object4 = f5.L) != null) {
            object3 = new gZ1(this);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        if (!(bl2 = com.jio.jioads.adinterfaces.j_0.l((Context)(object4 = this.g))) && (object4 = this.d.K()) == (object3 = JioAdView$AD_TYPE.INTERSTITIAL) && (object4 = f5.D) != null) {
            n4 = 1;
            object3 = new qh1_0(this, n4);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        if ((object4 = f5.h) != null) {
            n4 = 1;
            object3 = new p7_0(this, n4);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        object4 = this.g0();
        bl2 = ((com.jio.jioads.videomodule.config.a)object4).g;
        if (bl2 && (object4 = f5.O) != null) {
            n4 = 1;
            object3 = new q7_0(this, n4);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        object4 = f5.L;
        boolean bl3 = true;
        if (object4 == null) {
            object4 = this.g0();
            ((com.jio.jioads.videomodule.config.a)object4).v = bl3;
        }
        if ((bl2 = this.a()) && (object4 = f5.D) != null && (bl2 = object4.isClickable()) == bl3 && (object4 = this.d.K()) == (object2 = JioAdView$AD_TYPE.INTERSTITIAL)) {
            object4 = this.g0();
            ((com.jio.jioads.videomodule.config.a)object4).v = bl3;
        }
        object4 = this.g0();
        bl2 = ((com.jio.jioads.videomodule.config.a)object4).v;
        if (bl2 && (object4 = this.d.K()) != (object2 = JioAdView$AD_TYPE.INTERSTITIAL) && (object4 = f5.e) != null) {
            n3 = 2;
            object2 = new r7_0(this, n3);
            object4.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object4 = this.y) != null && (object2 = this.g) != null && (n4 = (int)(com.jio.jioads.adinterfaces.j_0.l((Context)object2) ? 1 : 0)) != 0) {
            object2 = ((f)object4).w;
            if (object2 != null) {
                object2.setFocusable(bl3);
            }
            object2 = ((f)object4).w;
            if (object2 != null) {
                object = new j(this, (f)object4);
                object2.setOnFocusChangeListener(object);
            }
            object4 = ((f)object4).t;
            if (object4 != null) {
                object2 = new com.jio.jioads.videomodule.k(this);
                object4.setOnClickListener((View.OnClickListener)object2);
            }
        }
        if ((object4 = this.y) != null && (object2 = this.g) != null && (n4 = (int)(com.jio.jioads.adinterfaces.j_0.l((Context)object2) ? 1 : 0)) != 0) {
            object2 = ((f)object4).L;
            if (object2 != null) {
                object2.setFocusable(bl3);
            }
            object2 = ((f)object4).L;
            if (object2 != null) {
                object = new g(this, (f)object4);
                object2.setOnFocusChangeListener(object);
            }
            object2 = ((f)object4).D;
            if (object2 != null) {
                object2.requestFocus();
            }
            if ((object4 = ((f)object4).N) != null) {
                n3 = 1;
                object2 = new go_1(this, n3);
                object4.setOnClickListener((View.OnClickListener)object2);
            }
            if (!(bl2 = (object4 = this.d).S())) {
                object4 = this.g0();
                bl2 = ((com.jio.jioads.videomodule.config.a)object4).p;
                if (bl2 && (object4 = this.h) != null) {
                    object2 = new h(this);
                    object4.setOnKeyListener((View.OnKeyListener)object2);
                }
            }
        }
        if ((object4 = f5.e) != null && (object4 = this.p) != null && (object4 = ((com.jio.jioads.controller.f)this.e).a.c) != null && (bl2 = object4.isEmpty() ^ bl3) == bl3 && (object4 = this.p) != null && (object4 = ((com.jio.jioads.iab.b)object4).d()) != null) {
            object3 = f5.e;
            object4.registerAdView((View)object3);
        }
        object4 = f5.L;
        bl3 = false;
        object3 = null;
        if (object4 != null && (object4 = this.p) != null && (object4 = ((com.jio.jioads.iab.b)object4).d()) != null) {
            object2 = f5.L;
            object = FriendlyObstructionPurpose.OTHER;
            object4.addFriendlyObstruction((View)object2, (FriendlyObstructionPurpose)object, null);
        }
        if ((object4 = f5.w) != null && (object4 = this.p) != null && (object4 = ((com.jio.jioads.iab.b)object4).d()) != null) {
            object2 = f5.w;
            object = FriendlyObstructionPurpose.VIDEO_CONTROLS;
            object4.addFriendlyObstruction((View)object2, (FriendlyObstructionPurpose)object, null);
        }
        if ((object4 = f5.q) != null && (object4 = this.p) != null && (object4 = ((com.jio.jioads.iab.b)object4).d()) != null) {
            object2 = f5.q;
            object = FriendlyObstructionPurpose.VIDEO_CONTROLS;
            object4.addFriendlyObstruction((View)object2, (FriendlyObstructionPurpose)object, null);
        }
        if ((object4 = f5.r) != null && (object4 = this.p) != null && (object4 = ((com.jio.jioads.iab.b)object4).d()) != null) {
            f5 = f5.r;
            object2 = FriendlyObstructionPurpose.VIDEO_CONTROLS;
            object4.addFriendlyObstruction((View)f5, (FriendlyObstructionPurpose)object2, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k() {
        synchronized (this) {
            s_0 s_02 = new s_0(this);
            com.jio.jioads.util.s.d(s_02);
            return;
        }
    }

    public final void l() {
        Object object;
        Object object2;
        com.jio.jioads.instream.video.a.a(this, ": JioVideoView: release");
        Object object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        object4 = this.e0;
        if (object4 != null) {
            object2 = ((e)object4).d;
            object = ((f)object2).D;
            if (object != null) {
                object.removeAllViews();
            }
            if ((object2 = ((f)object2).e) != null) {
                object2.removeAllViews();
            }
            object4 = ((e)object4).e;
            object4.removeAllViews();
        }
        if ((object4 = this.t) != null) {
            object4.a();
        }
        if ((object4 = this.u) != null) {
            ((k)object4).a();
        }
        object4 = null;
        this.t = null;
        this.u = null;
        boolean bl2 = Utility.ifOmSdkIsAvailable();
        if (bl2 && (object2 = this.p) != null) {
            ((com.jio.jioads.iab.b)object2).e();
            this.p = null;
        }
        this.A = object2 = d_0.a;
        object2 = this.H;
        if (object2 != null) {
            object2.cancel();
            this.H = null;
            object2 = new StringBuilder();
            object = ": removing viewable timer";
            l_0.e(this, (StringBuilder)object2, (String)object);
            object3 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        if ((object3 = this.y) != null) {
            object2 = ((f)object3).q;
            if (object2 != null) {
                object2.setOnClickListener(null);
            }
            if ((object2 = ((f)object3).r) != null) {
                object2.setOnClickListener(null);
            }
            if ((object2 = ((f)object3).F) != null) {
                object2.setOnClickListener(null);
            }
            if ((object2 = ((f)object3).M) != null) {
                object2.setOnClickListener(null);
            }
            if ((object2 = ((f)object3).w) != null) {
                object2.setOnClickListener(null);
            }
            if ((object2 = ((f)object3).C) != null) {
                object2.setOnClickListener(null);
            }
            if ((object2 = ((f)object3).t) != null) {
                object2.setOnClickListener(null);
            }
            if ((object2 = ((f)object3).L) != null) {
                object2.setOnClickListener(null);
            }
            if ((object2 = ((f)object3).h) != null) {
                object2.setOnClickListener(null);
            }
            if ((object2 = ((f)object3).e) != null) {
                object2.setOnClickListener(null);
            }
            if ((object2 = ((f)object3).w) != null) {
                object2.setOnFocusChangeListener(null);
            }
            object2 = ((f)object3).t;
            if (object2 != null) {
                object2.setOnFocusChangeListener(null);
            }
            object2 = ((f)object3).L;
            if (object2 != null) {
                object2.setOnFocusChangeListener(null);
            }
            object3 = ((f)object3).N;
            if (object3 != null) {
                object3.setOnFocusChangeListener(null);
            }
        }
        this.e0 = null;
        object3 = this.h;
        if (object3 != null) {
            object3.removeAllViews();
        }
        this.h = null;
        this.i = null;
        this.a.clear();
        object3 = this.h0();
        object2 = ((b)object3).i;
        if (object2 != null) {
            object2.recycle();
        }
        ((b)object3).i = null;
        this.X = null;
        this.l0 = null;
        object3 = this.Q;
        if (object3 != null) {
            object3.cancel();
        }
        this.Q = null;
        object3 = this.b;
        object2 = ((m)object3).c;
        object2.clear();
        object3 = ((m)object3).a;
        if (object3 != null) {
            ((n)object3).b.clear();
            ((n)object3).c.clear();
            ((n)object3).d.clear();
            ((n)object3).e.clear();
            object2 = ((n)object3).f;
            if (object2 != null) {
                ((ArrayList)object2).clear();
            }
            ((n)object3).g.clear();
            ((n)object3).h.clear();
            ((n)object3).i.clear();
            ((n)object3).j.clear();
            ((n)object3).k.clear();
            ((n)object3).l.clear();
            ((n)object3).m.clear();
            ((n)object3).n.clear();
            ((n)object3).o.clear();
            ((n)object3).p.clear();
            ((n)object3).q.clear();
            ((n)object3).r.clear();
            ((n)object3).s.clear();
            ((n)object3).t.clear();
            ((n)object3).u.clear();
            ((n)object3).v.clear();
            ((n)object3).w.clear();
            object2 = ((n)object3).x;
            if (object2 != null) {
                ((HashMap)object2).clear();
            }
            if ((object3 = ((n)object3).y) != null) {
                ((HashMap)object3).clear();
            }
        }
        this.X = null;
        object3 = this.y;
        if (object3 != null) {
            ((f)object3).d = null;
            ((f)object3).e = null;
            ((f)object3).f = null;
            ((f)object3).g = null;
            ((f)object3).h = null;
            ((f)object3).i = null;
            ((f)object3).j = null;
            ((f)object3).k = null;
            ((f)object3).l = null;
            ((f)object3).m = null;
            ((f)object3).n = null;
            ((f)object3).o = null;
            ((f)object3).p = null;
            ((f)object3).q = null;
            ((f)object3).r = null;
            ((f)object3).s = null;
            ((f)object3).t = null;
            ((f)object3).u = null;
            ((f)object3).v = null;
            ((f)object3).w = null;
            ((f)object3).x = null;
            ((f)object3).D = null;
            ((f)object3).E = null;
            ((f)object3).F = null;
            ((f)object3).G = null;
            ((f)object3).H = null;
            ((f)object3).I = null;
            ((f)object3).J = null;
            ((f)object3).K = null;
            ((f)object3).L = null;
            ((f)object3).M = null;
            ((f)object3).N = null;
        }
        this.y = null;
        this.f = null;
        this.g = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void m() {
        boolean bl2;
        Object object = this.e0;
        if (object == null) return;
        int n3 = this.S;
        int n4 = 8;
        b b2 = ((e)object).g;
        f f5 = ((e)object).d;
        if (n3 == 0 && !(bl2 = com.jio.jioads.adinterfaces.j_0.q((Context)(object = ((e)object).a.Y())))) {
            object = f5.k;
            n3 = 0;
            CharSequence charSequence = null;
            if (object != null) {
                object = object.getText();
            } else {
                bl2 = false;
                object = null;
            }
            if (object != null) {
                object = f5.k;
                if (object != null) {
                    charSequence = object.getText();
                }
                if (bl2 = ((String)(object = String.valueOf(charSequence))).equalsIgnoreCase((String)(charSequence = "Video will play\nafter ad"))) {
                    object = f5.i;
                    if (object == null) return;
                    n3 = b2.j ^ 1;
                    if (n3 != 0) {
                        n4 = 0;
                    }
                    object.setVisibility(n4);
                    return;
                }
            }
            object = f5.w;
            return;
        }
        object = f5.i;
        if (object == null) return;
        n3 = b2.j ^ 1;
        if (n3 != 0) {
            n4 = 0;
        }
        object.setVisibility(n4);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n() {
        block19: {
            block18: {
                var1_1 = this;
                var2_2 = this.d;
                var3_3 = this.b;
                var4_6 = this.e;
                try {
                    var5_7 = this.g;
                    if (var5_7 == null) return;
                    var6_8 = this.O;
                    var7_9 = null;
                    if ((var5_7 = var3_3.b((Context)var5_7, 0, (ArrayList)var6_8)) == null) {
                        return;
                    }
                    var6_8 = this.O;
                    var8_10 = var6_8.isEmpty();
                    var9_11 = 1;
                    if ((var8_10 ^= var9_11) == 0) break block18;
                }
                catch (Exception var3_4) {
                    break block19;
                }
                var6_8 = this.O;
                var6_8 = l_0.j((ArrayList)var6_8);
                var6_8 = (com.jio.jioads.instreamads.vastparser.model.k)var6_8;
                var10_12 = null;
                if (var6_8 != null) {
                    var6_8 = var6_8.s;
                } else {
                    var8_10 = 0;
                    var6_8 = null;
                }
                if (var6_8 != null) {
                    var6_8 = var1_1.O;
                    var6_8 = l_0.j((ArrayList)var6_8);
                    if ((var6_8 = (com.jio.jioads.instreamads.vastparser.model.k)var6_8) != null) {
                        var10_12 = var6_8.s;
                    }
                    var6_8 = var4_6;
                    var6_8 = (com.jio.jioads.controller.f)var4_6;
                    var6_8 = var6_8.a;
                    var6_8.c = var10_12;
                }
            }
            var8_10 = Utility.ifOmSdkIsAvailable();
            var10_12 = "message";
            if (var8_10 == 0) ** GOTO lbl75
            var6_8 = var4_6;
            var6_8 = (com.jio.jioads.controller.f)var4_6;
            var6_8 = var6_8.a;
            var6_8 = var6_8.c;
            if (var6_8 == null) ** GOTO lbl75
            var6_8 = var4_6;
            var6_8 = (com.jio.jioads.controller.f)var4_6;
            var6_8 = var6_8.a;
            var6_8 = var6_8.c;
            Intrinsics.checkNotNull(var6_8);
            var8_10 = var6_8.isEmpty() ^ var9_11;
            {
                if (var8_10 != 0 && (var6_8 = var1_1.g) != null) {
                    Intrinsics.checkNotNull(var6_8);
                    var11_13 /* !! */  = new com.jio.jioads.iab.b((Context)var6_8, var4_6);
                    var1_1.p = var11_13 /* !! */ ;
                    var6_8 = new StringBuilder();
                    var11_13 /* !! */  = this.R();
                    var6_8.append((String)var11_13 /* !! */ );
                    var11_13 /* !! */  = ": Create OmAdSession for Instream Ad";
                    var6_8.append((String)var11_13 /* !! */ );
                    var6_8 = var6_8.toString();
                    Intrinsics.checkNotNullParameter(var6_8, (String)var10_12);
                    var6_8 = JioAds.Companion;
                    var6_8 = var6_8.getInstance();
                    var6_8.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var6_8 = JioAds$LogLevel.NONE;
                    var6_8 = var1_1.p;
                    if (var6_8 != null) {
                        var11_13 /* !! */  = var2_2.K();
                        Intrinsics.checkNotNull(var11_13 /* !! */ );
                        var6_8.b(var2_2, (JioAdView$AD_TYPE)var11_13 /* !! */ );
                    }
                }
lbl75:
                // 7 sources

                var1_1.v = false;
                var8_10 = var1_1.c;
                if (var8_10 == 0 || (var8_10 = l_0.a((ArrayList)(var6_8 = var1_1.O))) <= var9_11) ** GOTO lbl-1000
                var6_8 = this.g0();
                var8_10 = (int)var6_8.l;
                if (var8_10 != 0 && (var6_8 = var1_1.g) != null) {
                    Intrinsics.checkNotNull(var6_8);
                    var5_7 = var1_1.O;
                    var3_3 = var3_3.d((Context)var6_8, (ArrayList)var5_7);
                    var5_7 = new StringBuilder();
                    var6_8 = this.R();
                    var5_7.append((String)var6_8);
                    var6_8 = ": original playlist added ";
                    var5_7.append((String)var6_8);
                    var5_7.append(var3_3);
                    var5_7 = var5_7.toString();
                    Intrinsics.checkNotNullParameter(var5_7, (String)var10_12);
                    var5_7 = JioAds.Companion;
                    var5_7 = var5_7.getInstance();
                    var5_7.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var5_7 = JioAds$LogLevel.NONE;
                    var1_1.M = var9_11;
                    var5_7 = var1_1.t;
                    if (var5_7 != null) {
                        if (var3_3 == null) {
                            var3_3 = mz0_2.a;
                        }
                        var5_7.b((List)var3_3);
                    }
                } else if ((var12_15 = var5_7.length()) > 0 && (var3_3 = var1_1.t) != null) {
                    var5_7 = StringsKt.m0((CharSequence)var5_7);
                    var5_7 = var5_7.toString();
                    var3_3.a((String)var5_7);
                }
                var1_1.X = var3_3 = var1_1.t;
                var3_3 = var1_1.A;
                var5_7 = d_0.a;
                var12_15 = (int)Intrinsics.areEqual(var3_3, var5_7);
                if (var12_15 != 0) {
                    return;
                }
                var3_3 = var4_6;
                var3_3 = (com.jio.jioads.controller.f)var4_6;
                var3_3 = var3_3.a;
                var12_15 = var3_3.l;
                var5_7 = new StringBuilder();
                var6_8 = this.R();
                var5_7.append((String)var6_8);
                var6_8 = ": Media Timeout value considered ";
                var5_7.append((String)var6_8);
                var5_7.append(var12_15);
                var6_8 = " sec";
                var5_7.append((String)var6_8);
                var5_7 = var5_7.toString();
                Intrinsics.checkNotNullParameter(var5_7, (String)var10_12);
                var5_7 = JioAds.Companion;
                var5_7 = var5_7.getInstance();
                var5_7.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var5_7 = JioAds$LogLevel.NONE;
                var5_7 = new V(var1_1, var12_15);
                com.jio.jioads.util.s.d((Function0)var5_7);
                return;
            }
        }
        var5_7 = new StringBuilder();
        var6_8 = ": exception in preparePlayer() JioVideoView : ";
        ei1_0.a(var1_1, (StringBuilder)var5_7, (String)var6_8);
        var7_9 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c(var7_9, var3_4, (StringBuilder)var5_7);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var5_7 = JioAds$LogLevel.NONE;
        var5_7 = var1_1.g;
        if (var5_7 == null) {
            return;
        }
        var5_7 = JioAdError.Companion;
        var6_8 = JioAdError$JioAdErrorType.ERROR_PLAYER_PREPARATION_FAILED;
        var5_7.getClass();
        var5_7 = com.jio.jioads.adinterfaces.t_0.a((JioAdError$JioAdErrorType)var6_8);
        var13_17 = var1_1.g;
        Intrinsics.checkNotNull(var13_17);
        var10_12 = this.R();
        var11_14 = com.jio.jioads.cdnlogging.d.a;
        var14_18 = var5_7.getErrorTitle();
        var6_8 = new StringBuilder("Exception while startPreparingPlayer: ");
        var3_5 = yc0_2.b(var3_4);
        var6_8.append((String)var3_5);
        var15_19 = var6_8.toString();
        var4_6 = (com.jio.jioads.controller.f)var4_6;
        var16_20 = var4_6.a.T();
        var17_21 = var2_2.q0();
        var18_22 = var5_7.getErrorCode();
        var3_5 = var4_6.a;
        var12_16 = var3_5.a();
        var19_23 = var12_16;
        var20_24 = "startPreparingPlayer";
        var7_9.logError(var13_17, (String)var10_12, var11_14, var14_18, var15_19, var16_20, var20_24, var19_23, var17_21, var18_22, false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void o() {
        block40: {
            block39: {
                block41: {
                    var1_1 = this.T();
                    var2_3 = this.g0();
                    var3_4 = var2_3.j;
                    var4_5 = ": ";
                    var5_6 = "message";
                    var6_7 = 1;
                    var7_8 = 0;
                    var8_9 = 8;
                    var9_10 = null;
                    if (var3_4 == 0) break block41;
                    var3_4 = this.S;
                    var10_11 = this.T;
                    if (var10_11 != null) ** GOTO lbl-1000
                    var10_11 = this.X;
                    if (var10_11 != null) {
                        var11_12 = var10_11.getDuration();
                        var10_11 = var11_12;
                    } else {
                        var11_12 = 0;
                        var10_11 = null;
                    }
                    if (var10_11 != null) lbl-1000:
                    // 2 sources

                    {
                        var11_12 = var10_11.intValue();
                    } else {
                        var11_12 = 0;
                        var10_11 = null;
                    }
                    if (var3_4 < var11_12 && (var3_4 = this.S) != (var11_12 = -1)) {
                        var11_12 = 1000;
                        if (var3_4 == 0) {
                            var3_4 = (int)this.a0;
                            if (var3_4 == 0) {
                                var2_3 = new StringBuilder();
                                var12_13 = this.R();
                                var2_3.append((String)var12_13);
                                var2_3.append((String)var4_5);
                                var2_3.append((String)var1_1);
                                var2_3.append(": OnAdSkippable called for trackNumber: ");
                                var13_15 = this.P;
                                w12_0.b(var13_15, var5_6, (StringBuilder)var2_3);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var1_1 = JioAds$LogLevel.NONE;
                                this.a0 = var6_7;
                                var12_13 = this.z;
                                if (var12_13 != null) {
                                    var1_1 = this.T();
                                    if (var1_1 == null) {
                                        var1_1 = "";
                                    }
                                    var14_18 = var1_1;
                                    var13_15 = this.P;
                                    var15_20 = var13_15 + 1;
                                    var1_1 = this.X;
                                    var16_21 = var1_1 != null ? (var13_15 = var1_1.getCurrentPosition() / var11_12) : 0;
                                    var1_1 = this.X;
                                    var17_22 = var1_1 != null ? (var13_15 = var1_1.getDuration() / var11_12) : 0;
                                    var1_1 = this.V;
                                    if (var1_1 != null) {
                                        var18_23 = var1_1.longValue();
                                        var3_4 = (int)var18_23;
                                    } else {
                                        var3_4 = 0;
                                        var2_3 = null;
                                    }
                                    var20_25 = var3_4;
                                    var12_13.onAdSkippable((String)var14_18, var15_20, var16_21, var17_22, var20_25);
                                }
                            }
                            if ((var1_1 = this.V) != null) {
                                var1_1 = this.y;
                                if (var1_1 != null) {
                                    var9_10 = var1_1.w;
                                }
                                if (var9_10 != null) {
                                    var9_10.setVisibility(var8_9);
                                }
                            } else {
                                var1_1 = this.y;
                                if (var1_1 != null) {
                                    var9_10 = var1_1.C;
                                }
                                if (var9_10 != null) {
                                    var9_10.setVisibility(var8_9);
                                }
                            }
                            var1_1 = this.e0;
                            if (var1_1 == null) return;
                            var3_4 = (int)this.d();
                            if (var3_4 == 0 || (var2_3 = this.y) == null || (var3_4 = (int)var2_3.c()) != var6_7) {
                                var6_7 = 0;
                            }
                            var2_3 = this.R;
                            var4_5 = this.X;
                            if (var4_5 != null) {
                                var21_26 = var4_5.getDuration();
                                var22_28 = var21_26;
                            } else {
                                var22_28 = 0L;
                            }
                            var24_30 = var11_12;
                            var4_5 = var22_28 /= var24_30;
                            var1_1.m((boolean)var6_7, (String)var2_3, (Long)var4_5);
                            return;
                        }
                        var1_1 = this.Z;
                        if (var1_1 != null) {
                            var1_1.cancel();
                        }
                        this.Z = null;
                        var1_1 = new StringBuilder();
                        ei1_0.a(this, (StringBuilder)var1_1, ": startSkipAdTimer called ");
                        var3_4 = this.S;
                        var1_1.append(var3_4);
                        var3_4 = 32;
                        var1_1.append((char)var3_4);
                        var2_3 = this.R;
                        ir3_0.b((StringBuilder)var1_1, (String)var2_3, var5_6);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var1_1 = JioAds$LogLevel.NONE;
                        var13_16 = this.S * 1000;
                        var18_24 = var13_16;
                        var4_5 = new T(this, var18_24);
                        var1_1 = var4_5.start();
                        this.Z = var1_1;
                        var1_1 = this.V;
                        if (var1_1 != null && (var2_3 = this.T) != null) {
                            Intrinsics.checkNotNull(var1_1);
                            var18_24 = var1_1.longValue();
                            var4_5 = this.T;
                            Intrinsics.checkNotNull(var4_5);
                            var21_27 = var4_5.intValue();
                            var22_29 = var21_27;
                            var6_7 = (int)(var18_24 == var22_29 ? 0 : (var18_24 < var22_29 ? -1 : 1));
                            if (var6_7 < 0) {
                                var1_1 = this.y;
                                if (var1_1 != null) {
                                    var9_10 = var1_1.w;
                                }
                                if (var9_10 == null) {
                                    return;
                                }
                                var9_10.setVisibility(var8_9);
                                return;
                            }
                        }
                        if ((var1_1 = this.y) != null) {
                            var9_10 = var1_1.C;
                        }
                        if (var9_10 == null) {
                            return;
                        }
                        var9_10.setVisibility(var8_9);
                        return;
                    }
                }
                var2_3 = new StringBuilder();
                var10_11 = this.R();
                var2_3.append((String)var10_11);
                var2_3.append((String)var4_5);
                var2_3.append((String)var1_1);
                var2_3.append(" : Non-Skippable ad for trackNumber: ");
                var13_17 = this.P;
                w12_0.b(var13_17, var5_6, (StringBuilder)var2_3);
                var1_1 = JioAds.Companion;
                var1_1.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var2_3 = JioAds$LogLevel.NONE;
                var2_3 = this.e0;
                if (var2_3 == null) break block40;
                var4_5 = var2_3.g;
                var10_11 = var2_3.a;
                var12_14 /* !! */  = var10_11.k0();
                if (var12_14 /* !! */  == (var14_19 = JioAdView$AdState.DESTROYED)) break block40;
                var12_14 /* !! */  = var2_3.f;
                var26_31 = var12_14 /* !! */ .m;
                if (!var26_31) break block40;
                try {
                    var12_14 /* !! */  = var4_5.i;
                    var2_3 = var2_3.d;
                    if (var12_14 /* !! */  != null) {
                    }
                    ** GOTO lbl202
                }
                catch (Exception var1_2) {
                    break block39;
                }
                var1_1 = var2_3.t;
                if (var1_1 != null) {
                    var1_1.setOnFocusChangeListener(null);
                }
                var1_1 = var2_3.t;
                if (var1_1 != null) {
                    var1_1.setVisibility(var8_9);
                }
                var1_1 = var2_3.k;
                if (var1_1 != null) {
                    var5_6 = "Video will play\nafter ad";
                    var1_1.setText((CharSequence)var5_6);
                }
                var1_1 = var2_3.j;
                if (var1_1 == null) break block40;
                var12_14 /* !! */  = var10_11.Y();
                if (var12_14 /* !! */  != null) {
                    var9_10 = var12_14 /* !! */ .getResources();
                }
                var12_14 /* !! */  = var4_5.i;
                var5_6 = new BitmapDrawable((Resources)var9_10, (Bitmap)var12_14 /* !! */ );
                var1_1.setAdjustViewBounds((boolean)var6_7);
                var1_1.setImageDrawable((Drawable)var5_6);
                var1_1 = var10_11.Y();
                var13_17 = (int)com.jio.jioads.adinterfaces.j_0.q((Context)var1_1);
                if (var13_17 != 0 || (var1_1 = var2_3.i) == null) break block40;
                var3_4 = var4_5.j ^ var6_7;
                if (var3_4 != 0) ** GOTO lbl-1000
                var7_8 = 8;
lbl-1000:
                // 2 sources

                {
                    var1_1.setVisibility(var7_8);
                    break block40;
lbl202:
                    // 1 sources

                    var2_3 = var2_3.i;
                    if (var2_3 != null) {
                        var2_3.setVisibility(var8_9);
                    }
                    var2_3 = new StringBuilder();
                    var4_5 = var10_11.P();
                    var2_3.append((String)var4_5);
                    var4_5 = ": Invalid Skip Thumbnail URL";
                    var2_3.append((String)var4_5);
                    var2_3 = var2_3.toString();
                    Intrinsics.checkNotNullParameter(var2_3, var5_6);
                    var1_1 = var1_1.getInstance();
                    var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    break block40;
                }
            }
            var2_3 = new StringBuilder();
            var4_5 = ": Exception while initSkipThumbnail ";
            com.jio.jioads.adinterfaces.j_0.n((com.jio.jioads.common.b)var10_11, (StringBuilder)var2_3, (String)var4_5);
            l_0.f(var1_2, (StringBuilder)var2_3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var1_1 = JioAds$LogLevel.NONE;
        }
        if ((var1_1 = this.e0) == null) return;
        var1_1 = var1_1.d;
        var2_3 = var1_1.w;
        if (var2_3 != null) {
            var2_3.setVisibility(var8_9);
        }
        var1_1 = var1_1.A;
        if (var1_1 == null) {
            return;
        }
        var1_1.setVisibility(var8_9);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void p() {
        void var2_5;
        Object object;
        int n3 = this.G;
        if (n3 != 0) return;
        m m2 = this.b;
        Object object2 = m2.a;
        if (object2 != null) {
            object = this.T();
            ArrayList arrayList = ((n)object2).m(m2, (String)object);
        } else {
            n3 = 0;
            Object var2_4 = null;
        }
        if (var2_5 == null || (n3 = var2_5.isEmpty()) != 0) {
            try {
                HashMap hashMap = this.a;
                String string2 = com.jio.jioads.utils.e.h(hashMap);
                if (string2 == null) return;
            }
            catch (Exception exception) {
                return;
            }
        }
        com.jio.jioads.videomodule.config.a a2 = this.g0();
        n3 = a2.n;
        if (n3 != 0) {
            CountDownTimer countDownTimer;
            CountDownTimer countDownTimer2 = this.H;
            if (countDownTimer2 != null) return;
            StringBuilder stringBuilder = new StringBuilder();
            object2 = ": JioVideoView inside startViewableTimer";
            object = this.d;
            com.jio.jioads.adinterfaces.j_0.i((com.jio.jioads.common.b)object, stringBuilder, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            W w4 = new W(this);
            this.H = countDownTimer = w4.start();
            return;
        }
        n3 = this.P;
        this.D(n3);
        n3 = 1;
        this.G = n3;
    }

    public final int q(com.jio.jioads.instreamads.vastparser.model.k object) {
        int n3;
        block6: {
            block7: {
                Object object2;
                String string2;
                block5: {
                    string2 = null;
                    if (object == null || (object2 = ((com.jio.jioads.instreamads.vastparser.model.k)object).o) == null) break block5;
                    int n4 = ((Number)object2).intValue();
                    if (n4 <= 0) {
                        object2 = null;
                    }
                    if (object2 == null) break block5;
                    n3 = (Integer)object2;
                    break block6;
                }
                if (object == null || (object = ((com.jio.jioads.instreamads.vastparser.model.k)object).c) == null) break block7;
                object2 = this.b.a;
                if (object2 != null) {
                    string2 = ((n)object2).j((String)object);
                }
                if (string2 == null || (n3 = string2.length()) == 0) break block7;
                try {
                    n3 = com.jio.jioads.adinterfaces.j_0.a(string2);
                }
                catch (Exception exception) {}
                double d2 = n3;
                d2 = Math.ceil(d2);
                n3 = (int)d2;
                break block6;
            }
            n3 = 0;
            object = null;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String r(String object, String object2) {
        Exception exception22;
        Object object3;
        block25: {
            boolean bl2;
            String string2;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            block24: {
                object3 = "message";
                object7 = "ads";
                object6 = "cmps";
                object5 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                Object object8 = this.a;
                String string3 = "pod";
                object4 = this.e;
                string2 = null;
                Object object9 = object4;
                object9 = (com.jio.jioads.controller.f)object4;
                object9 = ((com.jio.jioads.controller.f)object9).a;
                boolean bl3 = ((com.jio.jioads.controller.o)object9).o;
                if (bl3) break block24;
                object9 = Constants$HeaderKeys.JIO_DATA;
                String string4 = ((Constants$HeaderKeys)((Object)object9)).getKey();
                Locale locale = Locale.ROOT;
                string4 = string4.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(string4, (String)object5);
                int n3 = ((HashMap)object8).containsKey(string4);
                if (n3 == 0 || object == null || (n3 = ((String)object).length()) == 0) break block24;
                object2 = ((Constants$HeaderKeys)((Object)object9)).getKey();
                object2 = ((String)object2).toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
                object2 = ((HashMap)object8).get(object2);
                object2 = (String)object2;
                if (object2 == null) return string2;
                int n4 = ((String)object2).length();
                if (n4 == 0) {
                    return string2;
                }
                n4 = ((String)object).length();
                if (n4 <= 0) return string2;
                try {
                    boolean bl4;
                    object5 = new JSONObject((String)object2);
                    object4 = (com.jio.jioads.controller.f)object4;
                    object2 = ((com.jio.jioads.controller.f)object4).a;
                    boolean bl5 = ((com.jio.jioads.controller.o)object2).o;
                    object8 = "vce";
                    if (!bl5) {
                        bl5 = object5.has(string3);
                        object4 = "fbk";
                        if (bl5 || (bl5 = object5.has((String)object4))) {
                            boolean bl6;
                            bl5 = object5.has(string3);
                            object2 = bl5 ? object5.getJSONObject(string3) : object5.getJSONObject((String)object4);
                            n4 = (int)(object2.has((String)object6) ? 1 : 0);
                            if (n4 == 0) return string2;
                            object2 = object2.getJSONObject((String)object6);
                            object6 = object2.keys();
                            Intrinsics.checkNotNull(object6);
                            do {
                                if ((n4 = (int)(object6.hasNext() ? 1 : 0)) == 0) return string2;
                                object5 = object6.next();
                                object5 = (String)object5;
                            } while (!(bl6 = (object5 = object2.getJSONObject((String)object5)).has((String)object7)) || !(bl6 = (object5 = object5.getJSONObject((String)object7)).has((String)object)) || !(bl6 = (object5 = object5.getJSONObject((String)object)).has((String)object8)));
                            return object5.getString((String)object8);
                        }
                    }
                    if (!(bl4 = object5.has((String)object8))) return string2;
                    return object5.getString((String)object8);
                }
                catch (Exception exception) {
                    try {
                        object = new StringBuilder();
                        object2 = this.R();
                        ((StringBuilder)object).append((String)object2);
                        object2 = ": Exception fetching vce from header";
                        ((StringBuilder)object).append((String)object2);
                        object = ((StringBuilder)object).toString();
                        Intrinsics.checkNotNullParameter(object, (String)object3);
                        object = JioAds.Companion;
                        object = ((JioAds$Companion)object).getInstance();
                        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        return string2;
                    }
                    catch (Exception exception22) {}
                }
                break block25;
            }
            object3 = object4;
            object3 = (com.jio.jioads.controller.f)object4;
            object3 = ((com.jio.jioads.controller.f)object3).a;
            int n7 = ((com.jio.jioads.controller.o)object3).o;
            if (n7 == 0) return string2;
            if (object == null) return string2;
            n7 = ((String)object).length();
            if (n7 == 0) {
                return string2;
            }
            if (object2 == null) return string2;
            n7 = ((String)object2).length();
            if (n7 == 0) {
                return string2;
            }
            object3 = object4;
            object3 = (com.jio.jioads.controller.f)object4;
            object3 = ((com.jio.jioads.controller.f)object3).i();
            object3 = ((com.jio.jioads.common.a)object3).c;
            if (object3 != null) {
                object3 = ((com.jio.jioads.multiad.model.e)object3).a;
            } else {
                n7 = 0;
                object3 = null;
            }
            object7 = "campaignId";
            object6 = "campaignTypeMap";
            if (object3 != null) {
                object3 = object4;
                object3 = (com.jio.jioads.controller.f)object4;
                object3 = ((com.jio.jioads.controller.f)object3).i();
                object3 = ((com.jio.jioads.common.a)object3).c;
                if (object3 != null) {
                    object3 = ((com.jio.jioads.multiad.model.e)object3).a;
                } else {
                    n7 = 0;
                    object3 = null;
                }
                Intrinsics.checkNotNull(object3);
                object5 = object4;
                object5 = (com.jio.jioads.controller.f)object4;
                object5.getClass();
                Intrinsics.checkNotNullParameter(object3, (String)object6);
                Intrinsics.checkNotNullParameter(object2, (String)object7);
                object5 = ((com.jio.jioads.controller.f)object5).a;
                object5.getClass();
                object3 = com.jio.jioads.controller.o.m((String)object2, (HashMap)object3);
            } else {
                n7 = 0;
                object3 = null;
            }
            if (object3 == null) {
                object5 = object4;
                object5 = (com.jio.jioads.controller.f)object4;
                object5 = ((com.jio.jioads.controller.f)object5).i();
                object5 = ((com.jio.jioads.common.a)object5).b;
                if (object5 != null) {
                    object5 = ((com.jio.jioads.multiad.model.e)object5).a;
                } else {
                    boolean bl7 = false;
                    object5 = null;
                }
                if (object5 != null) {
                    object3 = object4;
                    object3 = (com.jio.jioads.controller.f)object4;
                    object3 = ((com.jio.jioads.controller.f)object3).i();
                    object3 = ((com.jio.jioads.common.a)object3).b;
                    if (object3 != null) {
                        object3 = ((com.jio.jioads.multiad.model.e)object3).a;
                    } else {
                        n7 = 0;
                        object3 = null;
                    }
                    Intrinsics.checkNotNull(object3);
                    object4 = (com.jio.jioads.controller.f)object4;
                    object4.getClass();
                    Intrinsics.checkNotNullParameter(object3, (String)object6);
                    Intrinsics.checkNotNullParameter(object2, (String)object7);
                    object7 = ((com.jio.jioads.controller.f)object4).a;
                    object7.getClass();
                    object3 = com.jio.jioads.controller.o.m((String)object2, (HashMap)object3);
                }
            }
            if (object3 == null) return string2;
            object2 = ((com.jio.jioads.multiad.model.f)object3).d;
            if (object2 == null) return string2;
            boolean bl8 = object2.isEmpty();
            if (bl8) {
                return string2;
            }
            object2 = ((com.jio.jioads.multiad.model.f)object3).d;
            if (object2 == null) return string2;
            bl8 = ((HashMap)object2).containsKey(object);
            if (bl8 != (bl2 = true)) return string2;
            object2 = ((com.jio.jioads.multiad.model.f)object3).d;
            Intrinsics.checkNotNull(object2);
            object = ((HashMap)object2).get(object);
            object = (com.jio.jioads.multiad.model.a)object;
            if (object == null) return string2;
            object = ((com.jio.jioads.multiad.model.a)object).e;
            if (object == null) return string2;
            return ((com.jio.jioads.multiad.model.b)object).c;
        }
        object2 = new StringBuilder();
        object3 = this.R();
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(": error in getVceFlag ");
        l_0.f(exception22, (StringBuilder)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String s(ArrayList object) {
        boolean bl2;
        String string2 = "campaignid";
        Object object2 = "fcr";
        String string3 = "ads";
        String string4 = "cmps";
        String string5 = "pod";
        String string6 = null;
        Object object3 = this.e;
        if (object != null && !(bl2 = object.isEmpty())) {
            Object object4 = object3;
            object4 = ((com.jio.jioads.controller.f)object3).a;
            bl2 = ((com.jio.jioads.controller.o)object4).o;
            if (!bl2) {
                object3 = Constants$HeaderKeys.JIO_DATA;
                object4 = ((Constants$HeaderKeys)((Object)object3)).getKey();
                Locale locale = Locale.ROOT;
                object4 = ((String)object4).toLowerCase(locale);
                String string7 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                Intrinsics.checkNotNullExpressionValue(object4, string7);
                HashMap hashMap = this.a;
                bl2 = hashMap.containsKey(object4);
                if (!bl2) return string6;
                object3 = ((Constants$HeaderKeys)((Object)object3)).getKey().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(object3, string7);
                object3 = (String)hashMap.get(object3);
                if (object3 == null) {
                    object3 = "";
                }
                try {
                    boolean bl3;
                    object4 = new JSONObject((String)object3);
                    boolean bl4 = object4.has(string5);
                    if (!bl4) {
                        boolean bl5 = object4.has((String)object2);
                        if (!bl5) return string6;
                        object = new JSONObject((String)(object2 = object4.getString((String)object2)));
                        boolean bl6 = object.has(string2);
                        if (!bl6) return string6;
                        return object.getString(string2);
                    }
                    string2 = object4.getJSONObject(string5);
                    boolean bl7 = string2.has(string4);
                    if (!bl7) return string6;
                    string2 = string2.getJSONObject(string4);
                    object2 = string2.keys();
                    Intrinsics.checkNotNull(object2);
                    block2: while (bl3 = object2.hasNext()) {
                        string4 = object2.next();
                        string5 = string2.getJSONObject(string4);
                        bl4 = string5.has(string3);
                        if (!bl4) continue;
                        string5 = string5.getJSONObject(string3);
                        object3 = ((ArrayList)object).iterator();
                        do {
                            if (!(bl2 = object3.hasNext())) continue block2;
                            object4 = object3.next();
                        } while (!(bl2 = string5.has((String)(object4 = (String)object4))));
                        string6 = string4;
                    }
                    return string6;
                }
                catch (Exception exception) {
                    return string6;
                }
            }
        }
        object3 = (com.jio.jioads.controller.f)object3;
        object = ((com.jio.jioads.controller.f)object3).a;
        boolean bl8 = ((com.jio.jioads.controller.o)object).o;
        if (!bl8) return string6;
        object = (com.jio.jioads.instreamads.vastparser.model.k)l_0.j(this.O);
        if (object == null) return string6;
        return ((com.jio.jioads.instreamads.vastparser.model.k)object).n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Pair t() {
        Pair pair;
        Exception exception2;
        Object object;
        Object object2;
        block6: {
            block5: {
                try {
                    object2 = new StringBuilder();
                    object = this.R();
                    ((StringBuilder)object2).append((String)object);
                    object = ": inside adjustAspectRatio";
                    ((StringBuilder)object2).append((String)object);
                    object2 = ((StringBuilder)object2).toString();
                    object = "message";
                    Intrinsics.checkNotNullParameter(object2, (String)object);
                    object2 = JioAds.Companion;
                    object2 = ((JioAds$Companion)object2).getInstance();
                    ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    object2 = this.O;
                    boolean bl2 = object2.isEmpty() ^ true;
                    if (!bl2) break block5;
                }
                catch (Exception exception2) {
                    break block6;
                }
                object2 = this.e0;
                if (object2 != null && (object2 = this.X) != null) {
                    object2 = this.O;
                    float f5 = 0.0f;
                    object = null;
                    object2 = ((ArrayList)object2).get(0);
                    object2 = (com.jio.jioads.instreamads.vastparser.model.k)object2;
                    object2 = ((com.jio.jioads.instreamads.vastparser.model.k)object2).e;
                    object2 = String.valueOf(object2);
                    float f6 = Float.parseFloat((String)object2);
                    Object object3 = this.O;
                    object = ((ArrayList)object3).get(0);
                    object = (com.jio.jioads.instreamads.vastparser.model.k)object;
                    object = ((com.jio.jioads.instreamads.vastparser.model.k)object).f;
                    object = String.valueOf(object);
                    f5 = Float.parseFloat((String)object);
                    object3 = this.e0;
                    Intrinsics.checkNotNull(object3);
                    o o3 = this.X;
                    Intrinsics.checkNotNull(o3);
                    return ((e)object3).b(o3, f6, f5);
                }
            }
            object2 = Boolean.FALSE;
            object = "video url list is empty";
            pair = new Pair(object2, object);
            return pair;
        }
        object = Boolean.FALSE;
        object2 = exception2.getMessage();
        if (object2 == null) {
            object2 = "";
        }
        pair = new Pair(object, object2);
        return pair;
    }

    public final void u() {
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        Object object = new StringBuilder();
        Object object2 = this.R();
        object.append((String)object2);
        object.append(": JioVideoView: closeAd: true");
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.A;
        object2 = d_0.a;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        boolean bl3 = true;
        if (!bl2) {
            this.M(bl3);
        }
        if ((object = this.d.K()) == (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL)) {
            this.M(bl3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void v(long l2, long l3) {
        Object object;
        Exception exception2;
        Object object2;
        String string2;
        Object object3;
        s s7;
        block10: {
            String string3;
            int n3;
            Object object4;
            long l4;
            block6: {
                Object object5;
                int n4;
                float f5;
                float f6;
                int n7;
                float f7;
                long l7;
                block7: {
                    Object object6;
                    int n8;
                    block8: {
                        Object object7;
                        block9: {
                            s7 = this;
                            l4 = l2;
                            l7 = l3;
                            f7 = l2;
                            n7 = 0x40800000;
                            f6 = f7 / 4.0f;
                            n8 = 0x40000000;
                            f5 = f7 / 2.0f;
                            f7 /= 1.3333334f;
                            try {
                                object3 = this.L;
                                int n10 = ((Enum)object3).ordinal();
                                string2 = "message";
                                if (n10 == 0) break block6;
                                int n14 = 1;
                                object2 = " of ";
                                n4 = 1000;
                                if (n10 == n14) break block7;
                                n7 = 2;
                                f6 = 2.8E-45f;
                                if (n10 == n7) break block8;
                                n7 = 3;
                                f6 = 4.2E-45f;
                                if (n10 == n7) break block9;
                                return;
                            }
                            catch (Exception exception2) {}
                        }
                        f6 = l3;
                        float f8 = f6 - f7;
                        object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                        if (object < 0) return;
                        object = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                        if (object > 0) return;
                        this.L = object7 = com.jio.jioads.videomodule.d.e;
                        object7 = new StringBuilder();
                        String string4 = this.R();
                        ((StringBuilder)object7).append(string4);
                        string4 = ": QuartileEvent: Third Quartile Event at ";
                        ((StringBuilder)object7).append(string4);
                        long l8 = n4;
                        l7 = l3 / l8;
                        ((StringBuilder)object7).append(l7);
                        ((StringBuilder)object7).append((String)object2);
                        l4 = l2 / l8;
                        ((StringBuilder)object7).append(l4);
                        object7 = ((StringBuilder)object7).toString();
                        Intrinsics.checkNotNullParameter(object7, string2);
                        object7 = JioAds.Companion;
                        object7 = ((JioAds$Companion)object7).getInstance();
                        ((JioAds)object7).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object7 = JioAds$LogLevel.NONE;
                        object7 = JioEventTracker$TrackingEvents.EVENT_THIRD_QUARTILE;
                        int n15 = this.P;
                        String string5 = this.T();
                        this.y((JioEventTracker$TrackingEvents)((Object)object7), n15, string5);
                        return;
                    }
                    f6 = l3;
                    float f11 = f6 - f5;
                    n8 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
                    if (n8 < 0) return;
                    object = f6 == f7 ? 0 : (f6 < f7 ? -1 : 1);
                    if (object > 0) return;
                    this.L = object6 = com.jio.jioads.videomodule.d.d;
                    object6 = new StringBuilder();
                    String string6 = this.R();
                    ((StringBuilder)object6).append(string6);
                    string6 = ": QuartileEvent: Mid Quartile Event at ";
                    ((StringBuilder)object6).append(string6);
                    long l12 = n4;
                    l7 = l3 / l12;
                    ((StringBuilder)object6).append(l7);
                    ((StringBuilder)object6).append((String)object2);
                    l4 = l2 / l12;
                    ((StringBuilder)object6).append(l4);
                    object6 = ((StringBuilder)object6).toString();
                    Intrinsics.checkNotNullParameter(object6, string2);
                    object6 = JioAds.Companion;
                    object6 = ((JioAds$Companion)object6).getInstance();
                    ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object6 = JioAds$LogLevel.NONE;
                    object6 = JioEventTracker$TrackingEvents.EVENT_MID_QUARTILE;
                    int n16 = this.P;
                    String string7 = this.T();
                    this.y((JioEventTracker$TrackingEvents)((Object)object6), n16, string7);
                    return;
                }
                f7 = l3;
                float f12 = f7 - f6;
                n7 = (int)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
                if (n7 < 0) return;
                object = f7 == f5 ? 0 : (f7 < f5 ? -1 : 1);
                if (object > 0) return;
                this.L = object5 = com.jio.jioads.videomodule.d.c;
                object5 = new StringBuilder();
                String string8 = this.R();
                ((StringBuilder)object5).append(string8);
                string8 = ": QuartileEvent: First Quartile Event at ";
                ((StringBuilder)object5).append(string8);
                long l14 = n4;
                l7 = l3 / l14;
                ((StringBuilder)object5).append(l7);
                ((StringBuilder)object5).append((String)object2);
                l4 = l2 / l14;
                ((StringBuilder)object5).append(l4);
                object5 = ((StringBuilder)object5).toString();
                Intrinsics.checkNotNullParameter(object5, string2);
                object5 = JioAds.Companion;
                object5 = ((JioAds$Companion)object5).getInstance();
                ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object5 = JioAds$LogLevel.NONE;
                object5 = JioEventTracker$TrackingEvents.EVENT_FIRST_QUARTILE;
                int n17 = this.P;
                String string9 = this.T();
                this.y((JioEventTracker$TrackingEvents)((Object)object5), n17, string9);
                return;
                break block10;
            }
            this.G = false;
            this.p();
            l4 = 0L;
            long l15 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (l15 < 0) return;
            l15 = (long)this.c();
            if (l15 == false) return;
            l15 = this.x;
            if (l15 == false) {
                object4 = JioEventTracker$TrackingEvents.EVENT_CREATIVE;
                n3 = this.P;
                string3 = this.T();
                this.y((JioEventTracker$TrackingEvents)((Object)object4), n3, string3);
            }
            object4 = com.jio.jioads.videomodule.d.b;
            s7.L = object4;
            object4 = new StringBuilder();
            String string10 = this.R();
            ((StringBuilder)object4).append(string10);
            string10 = ": QuartileEvent: Ad Start Event";
            ((StringBuilder)object4).append(string10);
            object4 = ((StringBuilder)object4).toString();
            Intrinsics.checkNotNullParameter(object4, string2);
            object4 = JioAds.Companion;
            object4 = ((JioAds$Companion)object4).getInstance();
            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
            object4 = JioEventTracker$TrackingEvents.EVENT_START;
            n3 = s7.P;
            string3 = this.T();
            s7.y((JioEventTracker$TrackingEvents)((Object)object4), n3, string3);
            return;
        }
        Object object8 = new StringBuilder();
        ei1_0.a(s7, (StringBuilder)object8, ": Exception while fireEvents: ");
        object3 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object3, exception2, (StringBuilder)object8);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object8 = JioAds$LogLevel.NONE;
        object8 = JioAdError.Companion;
        Object object9 = JioAdError$JioAdErrorType.ERROR_IN_FIRING_TRACKERS;
        object8.getClass();
        object8 = com.jio.jioads.adinterfaces.t_0.a((JioAdError$JioAdErrorType)((Object)object9));
        s7.d0 = false;
        string2 = s7.g;
        String string11 = this.R();
        object2 = com.jio.jioads.cdnlogging.d.a;
        String string12 = ((JioAdError)object8).getErrorTitle();
        object9 = new StringBuilder();
        String string13 = ((JioAdError)object8).getErrorDescription();
        ((StringBuilder)object9).append(string13);
        string13 = ": ";
        ((StringBuilder)object9).append(string13);
        Object object10 = yc0_2.b(exception2);
        ((StringBuilder)object9).append((String)object10);
        String string14 = ((StringBuilder)object9).toString();
        object10 = (com.jio.jioads.controller.f)s7.e;
        object9 = ((com.jio.jioads.controller.f)object10).a;
        com.jio.jioads.cdnlogging.a a2 = ((com.jio.jioads.controller.o)object9).T();
        String string15 = ((JioAdError)object8).getErrorCode();
        object10 = ((com.jio.jioads.controller.f)object10).a;
        object = ((com.jio.jioads.controller.o)object10).a();
        object8 = s7.d;
        String string16 = object8.q0();
        Boolean bl2 = (boolean)object;
        String string17 = "fireQuartileEvents";
        ((Utility)object3).logError((Context)string2, string11, (com.jio.jioads.cdnlogging.d)((Object)object2), string12, string14, a2, string17, bl2, string16, string15, false);
    }

    /*
     * Exception decompiling
     */
    public final void w(ViewGroup var1_1, ViewGroup var2_2, boolean var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [7 : 231->236)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void x(com.jio.jioads.instreamads.vastparser.model.k k2, boolean bl2) {
        int n3;
        String string2;
        Object object;
        s s7 = this;
        Object object2 = k2;
        com.jio.jioads.common.b b2 = this.d;
        Object object3 = b2.k0();
        if (object3 != (object = JioAdView$AdState.DESTROYED) && k2 != null && (string2 = k2.d) != null && (n3 = string2.length()) != 0) {
            object3 = b2.k0();
            if (object3 == object) {
                return;
            }
            object3 = b2.Y();
            object = "context";
            Object object4 = this.a;
            Object object5 = null;
            Object object6 = "";
            Object object7 = this.e;
            String string3 = k2.n;
            object2 = k2.c;
            if (bl2) {
                Object object8 = this.g;
                if (object8 == null) {
                    return;
                }
                object7 = (com.jio.jioads.controller.f)object7;
                boolean bl3 = ((com.jio.jioads.controller.f)object7).a.a();
                Object object9 = bl3;
                object8 = new u((Boolean)object9);
                object9 = this.g;
                Intrinsics.checkNotNull(object9);
                String string4 = this.R();
                Object object10 = Utility.INSTANCE;
                Object object11 = this.g;
                Intrinsics.checkNotNull(object11);
                object11 = object10.getAdvidFromPreferences((Context)object11);
                if (object11 == null) {
                    object11 = object6;
                }
                object3 = object10.getUidFromPreferences((Context)object3);
                object6 = b2.R();
                if (object6 != null) {
                    object5 = s7.g;
                    Intrinsics.checkNotNull(object5);
                    object5 = ((JioAdsMetadata)object6).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)object5);
                }
                object10 = object5;
                Object object12 = b2.q0();
                object5 = ((com.jio.jioads.controller.f)object7).a;
                com.jio.jioads.controller.o.o((com.jio.jioads.controller.o)object5, (String)object2, string3, (Map)object4);
                object2 = b2.K();
                int n4 = b2.w();
                object4 = ((com.jio.jioads.controller.f)object7).a;
                com.jio.jioads.cdnlogging.a a2 = ((com.jio.jioads.controller.o)object4).T();
                Intrinsics.checkNotNullParameter(object9, (String)object);
                boolean bl4 = TextUtils.isEmpty((CharSequence)string2);
                if (!bl4) {
                    object6 = "402";
                    object4 = object8;
                    object5 = object9;
                    object7 = string4;
                    string3 = object11;
                    object8 = object3;
                    object9 = object10;
                    string4 = object12;
                    object10 = object2;
                    object12 = a2;
                    com.jio.jioads.util.u.c((u)object4, object5, string2, (String)object6, (String)object7, (String)object11, (String)object3, (HashMap)object9, string4, (JioAdView$AD_TYPE)((Object)object2), n4, a2);
                }
            } else {
                object3 = this.g;
                if (object3 == null) {
                    return;
                }
                object7 = (com.jio.jioads.controller.f)object7;
                boolean bl5 = ((com.jio.jioads.controller.f)object7).a.a();
                Object object13 = bl5;
                object3 = new u((Boolean)object13);
                object13 = this.g;
                Intrinsics.checkNotNull(object13);
                String string5 = this.R();
                Object object14 = Utility.INSTANCE;
                Object object15 = this.g;
                Intrinsics.checkNotNull(object15);
                object15 = ((Utility)object14).getAdvidFromPreferences((Context)object15);
                if (object15 == null) {
                    object15 = object6;
                }
                object6 = s7.g;
                Intrinsics.checkNotNull(object6);
                object14 = ((Utility)object14).getUidFromPreferences((Context)object6);
                object6 = b2.R();
                if (object6 != null) {
                    object5 = s7.g;
                    Intrinsics.checkNotNull(object5);
                    object5 = ((JioAdsMetadata)object6).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)object5);
                }
                Context context = object5;
                Object object16 = b2.q0();
                object5 = ((com.jio.jioads.controller.f)object7).a;
                com.jio.jioads.controller.o.o((com.jio.jioads.controller.o)object5, (String)object2, string3, (Map)object4);
                object2 = b2.K();
                int n7 = b2.w();
                object4 = ((com.jio.jioads.controller.f)object7).a;
                com.jio.jioads.cdnlogging.a a3 = ((com.jio.jioads.controller.o)object4).T();
                Intrinsics.checkNotNullParameter(object13, (String)object);
                boolean bl6 = TextUtils.isEmpty((CharSequence)string2);
                if (!bl6) {
                    object6 = "401";
                    object4 = object3;
                    object5 = object13;
                    object7 = string5;
                    string3 = object15;
                    object13 = object14;
                    string5 = context;
                    object14 = object16;
                    object15 = object2;
                    object16 = a3;
                    com.jio.jioads.util.u.c((u)object3, object5, string2, (String)object6, (String)object7, string3, (String)object13, (HashMap)context, (String)object14, (JioAdView$AD_TYPE)((Object)object2), n7, a3);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void y(JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents, int n3, String string2) {
        void var5_9;
        com.jio.jioads.iab.b b2;
        String string3;
        int n4;
        Object object;
        int n7;
        com.jio.jioads.common.b b3;
        Object object2;
        Object object3;
        int n8;
        ArrayList arrayList;
        Object object4;
        Object object5;
        Object object6;
        String string4;
        s s7;
        block51: {
            block50: {
                s7 = this;
                string4 = string2;
                boolean bl2 = this.b();
                if (bl2) {
                    com.jio.jioads.instream.video.a.a(this, ": Mediation ad, event will be fired through IMA SDK");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                    return;
                }
                object6 = this.b;
                object5 = ((m)object6).a;
                if (object5 != null) {
                    object4 = jioEventTracker$TrackingEvents.getType();
                    object5 = ((n)object5).f((m)object6, (String)object4, string2);
                } else {
                    object5 = new ArrayList();
                }
                arrayList = object5;
                object5 = ((m)object6).a;
                n8 = 0;
                object4 = null;
                if (object5 != null) {
                    object6 = ((n)object5).k((m)object6, string4);
                } else {
                    bl2 = false;
                    object6 = null;
                }
                object5 = JioEventTracker$TrackingEvents.EVENT_CREATIVE;
                object3 = jioEventTracker$TrackingEvents;
                if (jioEventTracker$TrackingEvents == object5 && object6 != null) {
                    arrayList.addAll(object6);
                    object6 = JioEventTracker$TrackingEvents.EVENT_IMPRESSION;
                } else {
                    object6 = object3;
                }
                boolean bl3 = Utility.ifOmSdkIsAvailable();
                object2 = "message";
                b3 = s7.d;
                n7 = 1;
                object = s7.e;
                if (!bl3) break block50;
                object5 = object;
                object5 = (com.jio.jioads.controller.f)object;
                HashMap hashMap = ((com.jio.jioads.controller.f)object5).a.c;
                if (hashMap == null) break block50;
                Intrinsics.checkNotNull(hashMap);
                n4 = hashMap.isEmpty() ^ n7;
                if (n4 == 0) break block50;
                object5 = ((com.jio.jioads.controller.f)object5).a.c;
                Intrinsics.checkNotNull(object5);
                String string5 = this.T();
                boolean bl4 = object5.containsKey(string5);
                if (!bl4) break block50;
                object5 = t_0.$EnumSwitchMapping$0;
                n4 = ((Enum)object6).ordinal();
                Object object7 = object5[n4];
                switch (object7) {
                    default: {
                        boolean bl5 = false;
                        object5 = null;
                        break;
                    }
                    case 14: {
                        object5 = com.jio.jioads.iab.a.h;
                        break;
                    }
                    case 13: {
                        object5 = com.jio.jioads.iab.a.o;
                        break;
                    }
                    case 12: {
                        object5 = com.jio.jioads.iab.a.i;
                        break;
                    }
                    case 11: {
                        object5 = com.jio.jioads.iab.a.j;
                        break;
                    }
                    case 10: {
                        object5 = com.jio.jioads.iab.a.n;
                        break;
                    }
                    case 9: {
                        object5 = com.jio.jioads.iab.a.m;
                        break;
                    }
                    case 8: {
                        object5 = com.jio.jioads.iab.a.g;
                        break;
                    }
                    case 7: {
                        object5 = com.jio.jioads.iab.a.f;
                        break;
                    }
                    case 6: {
                        object5 = com.jio.jioads.iab.a.h;
                        break;
                    }
                    case 5: {
                        object5 = com.jio.jioads.iab.a.e;
                        break;
                    }
                    case 4: {
                        object5 = com.jio.jioads.iab.a.a;
                        break;
                    }
                    case 3: {
                        object5 = com.jio.jioads.iab.a.d;
                        break;
                    }
                    case 2: {
                        object5 = com.jio.jioads.iab.a.c;
                        break;
                    }
                    case 1: {
                        object5 = com.jio.jioads.iab.a.b;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                string3 = b3.P();
                stringBuilder.append(string3);
                string3 = ": fireOmSdkAdEvents: ";
                stringBuilder.append(string3);
                stringBuilder.append(object5);
                Intrinsics.checkNotNullParameter(stringBuilder.toString(), (String)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                com.jio.jioads.iab.b b4 = s7.p;
                if (b4 != null && object5 != null) {
                    boolean bl6;
                    com.jio.jioads.iab.a a2;
                    Long l2 = s7.n;
                    if (l2 != null) {
                        long l3 = l2;
                        b2 = s7.p;
                        if (b2 != null) {
                            b2.c((com.jio.jioads.iab.a)((Object)object5), l3);
                        }
                    }
                    if (object5 == (a2 = com.jio.jioads.iab.a.e) && (bl6 = Utility.ifOmSdkIsAvailable()) && (object5 = s7.p) != null) {
                        ((com.jio.jioads.iab.b)object5).e();
                        s7.p = null;
                    }
                }
                break block51;
            }
            object5 = new StringBuilder();
            String string6 = this.R();
            ((StringBuilder)object5).append(string6);
            String string7 = ": fireOmSdkAdEvents: OmVerificationData is not found ";
            ((StringBuilder)object5).append(string7);
            ((StringBuilder)object5).append(object6);
            Intrinsics.checkNotNullParameter(((StringBuilder)object5).toString(), (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
        }
        object5 = new StringBuilder();
        String string8 = this.R();
        ((StringBuilder)object5).append(string8);
        ((StringBuilder)object5).append(": Firing : ");
        ((StringBuilder)object5).append(object6);
        String string9 = " for adId: ";
        ((StringBuilder)object5).append(string9);
        ir3_0.b((StringBuilder)object5, string4, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object5 = b3.b();
        if (object5 != null) {
            void var15_38;
            void var15_35;
            object2 = new StringBuilder();
            char c2 = '\u0000';
            Object var15_32 = null;
            try {
                Integer n10 = tp_2.D((int[])object5, 0);
            }
            catch (Exception exception) {
                c2 = '\u0000';
                Object var15_34 = null;
            }
            if (var15_35 != null) {
                String string10 = var15_35.toString();
            } else {
                c2 = '\u0000';
                Object var15_37 = null;
            }
            ((StringBuilder)object2).append((String)var15_38);
            c2 = 'x';
            ((StringBuilder)object2).append(c2);
            try {
                object5 = tp_2.D((int[])object5, n7);
            }
            catch (Exception exception) {
                boolean bl7 = false;
                object5 = null;
            }
            ((StringBuilder)object2).append(object5);
            object5 = ((StringBuilder)object2).toString();
        } else {
            boolean bl8 = false;
            object5 = null;
        }
        object2 = s7.f;
        if (object2 != null) {
            object2 = t_0.$EnumSwitchMapping$0;
            int n14 = jioEventTracker$TrackingEvents.ordinal();
            Object object8 = object2[n14];
            switch (object8) {
                default: {
                    break;
                }
                case 8: {
                    object3 = s7.f;
                    if (object3 == null) break;
                    JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.RESUMED;
                    object2 = new JioAdEvent(jioAdEvent$AdEventType);
                    object3.onJioVmapEvent((JioAdEvent)object2, null);
                    break;
                }
                case 7: {
                    object3 = s7.f;
                    if (object3 == null) break;
                    JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.PAUSED;
                    object2 = new JioAdEvent(jioAdEvent$AdEventType);
                    object3.onJioVmapEvent((JioAdEvent)object2, null);
                    break;
                }
                case 6: {
                    object3 = s7.f;
                    if (object3 == null) break;
                    JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.SKIPPED;
                    object2 = new JioAdEvent(jioAdEvent$AdEventType);
                    object3.onJioVmapEvent((JioAdEvent)object2, null);
                    break;
                }
                case 5: {
                    object3 = s7.f;
                    if (object3 == null) break;
                    JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.COMPLETED;
                    object2 = new JioAdEvent(jioAdEvent$AdEventType);
                    object3.onJioVmapEvent((JioAdEvent)object2, null);
                    break;
                }
                case 4: {
                    object3 = s7.f;
                    if (object3 == null) break;
                    JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.STARTED;
                    object2 = new JioAdEvent(jioAdEvent$AdEventType);
                    object3.onJioVmapEvent((JioAdEvent)object2, null);
                    break;
                }
                case 3: {
                    object3 = s7.f;
                    if (object3 == null) break;
                    JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.THIRD_QUARTILE;
                    object2 = new JioAdEvent(jioAdEvent$AdEventType);
                    object3.onJioVmapEvent((JioAdEvent)object2, null);
                    break;
                }
                case 2: {
                    object3 = s7.f;
                    if (object3 == null) break;
                    JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.MIDPOINT;
                    object2 = new JioAdEvent(jioAdEvent$AdEventType);
                    object3.onJioVmapEvent((JioAdEvent)object2, null);
                    break;
                }
                case 1: {
                    object3 = s7.f;
                    if (object3 == null) break;
                    JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.FIRST_QUARTILE;
                    object2 = new JioAdEvent(jioAdEvent$AdEventType);
                    object3.onJioVmapEvent((JioAdEvent)object2, null);
                }
            }
        }
        object3 = (JioEventTracker)s7.C.getValue();
        int n15 = n3 + 1;
        Integer n16 = n15;
        object2 = this.V();
        c c3 = object;
        com.jio.jioads.controller.f f5 = (com.jio.jioads.controller.f)object;
        Object object9 = f5.a;
        object = s7.a;
        string3 = com.jio.jioads.controller.o.o((com.jio.jioads.controller.o)object9, string4, (String)object2, (Map)object);
        ViewGroup viewGroup = s7.h;
        if (viewGroup != null) {
            int n17 = viewGroup.getWidth();
            Integer n18 = n17;
        } else {
            boolean bl9 = false;
            Object var5_8 = null;
        }
        String string11 = String.valueOf(var5_9);
        object2 = s7.h;
        if (object2 != null) {
            n8 = object2.getHeight();
            object4 = n8;
        }
        String string12 = String.valueOf(object4);
        String string13 = s7.Y;
        boolean bl10 = f5.a.a();
        Object object10 = object4 = s7.e;
        n8 = ((com.jio.jioads.controller.f)object4).a.k;
        String string14 = s7.l;
        String string15 = s7.m;
        b2 = null;
        object2 = s7.d;
        boolean bl11 = true;
        n4 = 0;
        Object var18_65 = null;
        int n19 = 131072;
        object4 = object3;
        object3 = object6;
        object9 = object5;
        object5 = f5;
        String string16 = string11;
        JioEventTracker.fireEvents$default((JioEventTracker)object4, (JioEventTracker$TrackingEvents)((Object)object6), (com.jio.jioads.common.b)object2, arrayList, n16, (String)object9, bl11, false, string3, false, string11, string12, string13, bl10, n8, string14, (c)object10, string15, null, n19, null);
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents2 = JioEventTracker$TrackingEvents.EVENT_IMPRESSION;
        object4 = "type";
        object3 = "campaignid";
        if (object6 == jioEventTracker$TrackingEvents2) {
            String string17 = this.V();
            if (string17 == null) return;
            object5.getClass();
            Intrinsics.checkNotNullParameter(string17, (String)object3);
            object6 = "i";
            Intrinsics.checkNotNullParameter(object6, (String)object4);
            object5 = ((com.jio.jioads.controller.f)object5).a;
            ((com.jio.jioads.controller.o)object5).v(string17, (String)object6);
            return;
        }
        JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents3 = JioEventTracker$TrackingEvents.EVENT_COMPLETE;
        if (object6 != jioEventTracker$TrackingEvents3) return;
        String string18 = this.V();
        if (string18 == null) return;
        object5.getClass();
        Intrinsics.checkNotNullParameter(string18, (String)object3);
        object6 = "cv";
        Intrinsics.checkNotNullParameter(object6, (String)object4);
        object5 = ((com.jio.jioads.controller.f)object5).a;
        ((com.jio.jioads.controller.o)object5).v(string18, (String)object6);
    }
}

