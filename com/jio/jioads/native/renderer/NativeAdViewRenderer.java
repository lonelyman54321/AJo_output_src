/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.Color
 *  android.graphics.drawable.GradientDrawable
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jio.jioads.native.renderer;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jio.jioads.R$color;
import com.jio.jioads.R$drawable;
import com.jio.jioads.R$layout;
import com.jio.jioads.R$string;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$ORIENTATION_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$VideoAdType;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.interstitial.InterstitialActivity;
import com.jio.jioads.native.g;
import com.jio.jioads.native.h;
import com.jio.jioads.native.renderer.B;
import com.jio.jioads.native.renderer.NativeAdViewRenderer$a;
import com.jio.jioads.native.renderer.a;
import com.jio.jioads.native.renderer.b_0;
import com.jio.jioads.native.renderer.c;
import com.jio.jioads.native.renderer.d;
import com.jio.jioads.native.renderer.e;
import com.jio.jioads.native.renderer.f;
import com.jio.jioads.native.renderer.i;
import com.jio.jioads.native.renderer.j;
import com.jio.jioads.native.renderer.k;
import com.jio.jioads.native.renderer.l;
import com.jio.jioads.native.renderer.m;
import com.jio.jioads.native.renderer.n;
import com.jio.jioads.native.renderer.o;
import com.jio.jioads.native.renderer.p;
import com.jio.jioads.native.renderer.q;
import com.jio.jioads.native.renderer.s;
import com.jio.jioads.native.renderer.t;
import com.jio.jioads.native.renderer.u;
import com.jio.jioads.native.renderer.w;
import com.jio.jioads.native.renderer.x;
import com.jio.jioads.native.renderer.y;
import com.jio.jioads.native.utils.b;
import com.jio.jioads.tracker.JioEventTracker;
import com.jio.jioads.tracker.JioEventTracker$TrackingEvents;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.Constants$DynamicDisplaySize;
import com.jio.jioads.utils.Constants$HeaderKeys;
import com.jio.jioads.videomodule.z;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class NativeAdViewRenderer {
    public com.jio.jioads.common.b A;
    public boolean A0;
    public int B;
    public final int B0;
    public boolean C;
    public Boolean C0;
    public boolean D;
    public com.jio.jioads.carousel.view.i D0;
    public HashMap E;
    public boolean E0;
    public HashMap F;
    public String F0;
    public ViewGroup G;
    public String G0;
    public FrameLayout H;
    public String H0;
    public boolean I;
    public final NativeAdViewRenderer$a I0;
    public TextView J;
    public JSONArray J0;
    public boolean K;
    public String K0;
    public List L;
    public String L0;
    public int M;
    public int N;
    public final LinkedHashMap O;
    public String P;
    public String Q;
    public Map R;
    public final rq1_2 S;
    public int T;
    public com.jio.jioads.videomodule.s U;
    public com.jio.jioads.videomodule.s V;
    public com.jio.jioads.instreamads.vastparser.n W;
    public Handler X;
    public Runnable Y;
    public int Z;
    public boolean a;
    public Long a0;
    public GestureDetector b;
    public int b0;
    public boolean c;
    public long c0;
    public JioAdView$ORIENTATION_TYPE d;
    public final int d0;
    public Map e;
    public final int e0;
    public String f;
    public boolean f0;
    public com.jio.jioads.native.parser.a g;
    public boolean g0;
    public final com.jio.jioads.common.c h;
    public boolean h0;
    public TextView i;
    public boolean i0;
    public final Context j;
    public boolean j0;
    public boolean k;
    public boolean k0;
    public boolean l;
    public boolean l0;
    public HashMap m;
    public boolean m0;
    public final HashMap n;
    public boolean n0;
    public int o;
    public boolean o0;
    public int p;
    public ViewGroup p0;
    public int q;
    public ViewGroup q0;
    public int r;
    public TextView r0;
    public ViewGroup s;
    public TextView s0;
    public String t;
    public com.jio.jioads.native.utils.a t0;
    public final com.jio.jioads.controller.a u;
    public boolean u0;
    public ViewGroup v;
    public boolean v0;
    public com.jio.jioads.native.callbaks.a w;
    public String w0;
    public String x;
    public boolean x0;
    public String y;
    public InterstitialActivity y0;
    public boolean z;
    public ViewGroup z0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public NativeAdViewRenderer(com.jio.jioads.controller.a a2, com.jio.jioads.native.parser.a object, com.jio.jioads.common.b b2, Map object2, com.jio.jioads.common.c c2, String object3, int n3) {
        int n4;
        int n7;
        int n8;
        block3: {
            Exception exception2;
            Object object4;
            block2: {
                int n10;
                Serializable serializable;
                int n14;
                HashMap hashMap;
                Intrinsics.checkNotNullParameter(a2, "jioAdCallback");
                Intrinsics.checkNotNullParameter(b2, "iJioAdView");
                Intrinsics.checkNotNullParameter(object2, "rHeaders");
                Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
                String string2 = "responseAdData";
                Intrinsics.checkNotNullParameter(object3, string2);
                this.k = n8 = 1;
                this.l = n8;
                this.m = hashMap = new HashMap();
                this.n = hashMap = new HashMap();
                this.o = n7 = -1;
                this.p = n7;
                this.q = n7;
                this.B = n7;
                this.I = n8;
                object4 = new ArrayList();
                this.L = object4;
                this.M = 320;
                this.N = n14 = 200;
                this.O = object4;
                this.P = object4 = "";
                this.Q = "0";
                this.R = serializable = new Serializable();
                serializable = yr1_2.b(com.jio.jioads.native.renderer.q.c);
                this.S = serializable;
                this.T = 3000;
                this.Z = n8;
                long l2 = -1;
                serializable = l2;
                this.a0 = serializable;
                this.e0 = n10 = 5;
                this.h0 = n8;
                this.k0 = n8;
                this.n0 = n8;
                this.w0 = object4;
                this.B0 = n7;
                this.clearAllData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.A = b2;
                this.e = object2;
                this.f = object3;
                this.s().clear();
                object2 = this.s();
                object3 = this.e;
                ((HashMap)object2).putAll(object3);
                super();
                this.E = object2;
                super();
                this.F = object2;
                object2 = b2.T();
                int n15 = object2 != null ? (Integer)object2 : -1;
                this.o = n15;
                try {
                    object2 = b2.c0();
                    n15 = object2 != null ? (Integer)object2 : ((object2 = b2.Y()) != null && (n15 = (int)(j_0.l((Context)object2) ? 1 : 0)) == n8 ? R$layout.jio_carousal_item_tv : R$layout.jio_carousal_item);
                }
                catch (Exception exception2) {
                    break block2;
                }
                n7 = n15;
                break block3;
            }
            object4 = "Exception occurred while fetching item layout ";
            object3 = new StringBuilder((String)object4);
            ((StringBuilder)object3).append(exception2);
            object2 = ((StringBuilder)object3).toString();
            com.jio.jioads.util.j.b((String)object2);
        }
        this.B0 = n7;
        this.g = object;
        this.h = c2;
        this.u = a2;
        object = b2.Y();
        this.j = object;
        this.d0 = n3;
        this.M = n4 = this.o()[0];
        this.N = n4 = this.o()[n8];
        object = new StringBuilder();
        object2 = b2.P();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": NativeAdViewRenderer inside init refreshRate value: ");
        ((StringBuilder)object).append(n3);
        com.jio.jioads.util.j.a(((StringBuilder)object).toString());
        this.I0 = object = new NativeAdViewRenderer$a(b2, this, a2, c2);
    }

    public static final void a(NativeAdViewRenderer object) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((NativeAdViewRenderer)object).y0;
        if (object != null) {
            ((InterstitialActivity)object).onBackPressed();
        }
    }

    public static final void a(NativeAdViewRenderer nativeAdViewRenderer, View object) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        Intrinsics.checkNotNullParameter(object, "view1");
        object = new StringBuilder();
        j_0.i(nativeAdViewRenderer.A, (StringBuilder)object, ": onClick on container");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        nativeAdViewRenderer.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final void a(NativeAdViewRenderer var0, boolean var1_1) {
        var2_2 = true;
        Intrinsics.checkNotNullParameter(var0, "this$0");
        var3_3 = new StringBuilder();
        j_0.i(var0.A, (StringBuilder)var3_3, ": inside fireFirstImpression: post");
        var3_3 = JioAds.Companion;
        var3_3.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var4_4 = JioAds$LogLevel.NONE;
        var4_4 = var0.v;
        if (var4_4 == null) ** GOTO lbl-1000
        var5_5 /* !! */  = Utility.INSTANCE;
        Intrinsics.checkNotNull(var4_4);
        var6_6 = 5;
        var7_7 = var5_5 /* !! */ .checkVisibility((ViewGroup)var4_4, var6_6);
        if (var7_7 == 0 || (var4_4 = var0.w) == null) ** GOTO lbl-1000
        var7_7 = var4_4.e();
        var5_5 /* !! */  = Boolean.valueOf((boolean)var7_7);
        Intrinsics.checkNotNull(var5_5 /* !! */ );
        if (var7_7 == 0 && (var7_7 = var0.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == 0) {
            var4_4 = new StringBuilder();
            var5_5 /* !! */  = var0.A;
            var8_8 = ": Firing Impression for image based ad";
            com.jio.jioads.common.l.a((com.jio.jioads.common.b)var5_5 /* !! */ , (StringBuilder)var4_4, var8_8, (JioAds$Companion)var3_3);
            var3_3 = var0.w;
            if (var3_3 != null) {
                var3_3.e(false);
            }
            var0.O();
            var3_3 = var0.w;
            if (var3_3 != null) {
                var3_3.i(var2_2);
            }
        } else if ((var7_7 = var0.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != 0 && (var4_4 = var0.A.K()) == (var5_5 /* !! */  = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) {
            var4_4 = var0.R();
            var5_5 /* !! */  = var0.d((String)var4_4);
            var4_4 = var0.c((String)var4_4);
            var9_10 = Integer.parseInt((String)var5_5 /* !! */ );
            if (var9_10 >= (var6_6 = 100) || (var7_7 = Integer.parseInt((String)var4_4)) >= var6_6) {
                var4_4 = new StringBuilder();
                var5_5 /* !! */  = var0.A;
                var8_9 = ": Firing Impression for image based ad dynamic display";
                com.jio.jioads.common.l.a((com.jio.jioads.common.b)var5_5 /* !! */ , (StringBuilder)var4_4, var8_9, (JioAds$Companion)var3_3);
                var3_3 = var0.w;
                if (var3_3 != null) {
                    var3_3.e(false);
                }
                var0.O();
                var3_3 = var0.w;
                if (var3_3 != null) {
                    var3_3.i(var2_2);
                }
            }
        }
        if ((var3_3 = var0.v) != null) {
            if (var1_1) {
                var10_11 = new Handler();
                var3_3 = new em_2(var0, (int)var2_2);
                var11_12 = 500L;
                var10_11.postDelayed((Runnable)var3_3, var11_12);
            } else {
                var0.m();
            }
        }
    }

    public static final boolean a(NativeAdViewRenderer nativeAdViewRenderer, Message object) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        Intrinsics.checkNotNullParameter(object, "it");
        object = new StringBuilder();
        com.jio.jioads.common.b b2 = nativeAdViewRenderer.A;
        String string2 = "  Calling cacheAd() API for Refresh Request for NativeVideo Ad";
        j_0.i(b2, (StringBuilder)object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        boolean bl2 = nativeAdViewRenderer.k0;
        if (bl2) {
            object = (com.jio.jioads.controller.f)nativeAdViewRenderer.h;
            ((com.jio.jioads.controller.f)object).o();
            nativeAdViewRenderer.u0 = bl2 = true;
        } else {
            NativeAdViewRenderer.f(nativeAdViewRenderer);
        }
        return false;
    }

    public static final boolean a(NativeAdViewRenderer nativeAdViewRenderer, View object, MotionEvent motionEvent) {
        boolean bl2;
        boolean bl3;
        object = "this$0";
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, (String)object);
        nativeAdViewRenderer = nativeAdViewRenderer.b;
        if (nativeAdViewRenderer == null || (bl3 = nativeAdViewRenderer.onTouchEvent(motionEvent)) != (bl2 = true)) {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static final void access$adClicked(NativeAdViewRenderer nativeAdViewRenderer) {
        Object object = nativeAdViewRenderer.u;
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.INTERACTED;
        ((V)object).e(jioAdView$AdState);
        object = new StringBuilder();
        j_0.i(nativeAdViewRenderer.A, (StringBuilder)object, ": Callback onAdClick()");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        ((V)nativeAdViewRenderer.u).a();
    }

    public static final /* synthetic */ void access$cacheAndPrepareAd(NativeAdViewRenderer nativeAdViewRenderer) {
        nativeAdViewRenderer.e();
    }

    public static final void access$cacheAndPrepareAdIfMediaCachingTrue(NativeAdViewRenderer object) {
        boolean bl2;
        Object object2;
        boolean bl3;
        String string2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8 = new StringBuilder();
        j_0.i(((NativeAdViewRenderer)object).A, (StringBuilder)object8, ": inside cacheAndPrepareAdIfMediaCachingTrue ");
        object8 = JioAds.Companion;
        ((JioAds$Companion)object8).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object9 = JioAds$LogLevel.NONE;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object9 = ((NativeAdViewRenderer)object).g;
        Object object10 = null;
        if (object9 != null) {
            object9 = ((com.jio.jioads.native.parser.a)object9).o;
        } else {
            boolean n3 = false;
            object9 = null;
        }
        boolean bl4 = TextUtils.isEmpty((CharSequence)object9);
        if (!bl4) {
            hashMap.put("iconByteArray", object9);
            object7 = new StringBuilder();
            object6 = ((NativeAdViewRenderer)object).A;
            object5 = ": Icon image Url: ";
            l_0.d(object6, (StringBuilder)object7, object5, (String)object9);
            object9 = ((JioAds$Companion)object8).getInstance();
            ((JioAds)object9).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        if ((object9 = ((NativeAdViewRenderer)object).g) != null) {
            object9 = ((com.jio.jioads.native.parser.a)object9).p;
        } else {
            boolean bl5 = false;
            object9 = null;
        }
        bl4 = TextUtils.isEmpty((CharSequence)object9);
        if (!bl4 && (object7 = ((NativeAdViewRenderer)object).A.K()) != (object6 = JioAdView$AD_TYPE.INFEED)) {
            hashMap.put("mainImageByteArray", object9);
            object7 = new StringBuilder();
            object6 = ((NativeAdViewRenderer)object).A;
            object5 = ": Main image Url: ";
            l_0.d(object6, (StringBuilder)object7, object5, (String)object9);
            object9 = ((JioAds$Companion)object8).getInstance();
            ((JioAds)object9).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        if ((object9 = ((NativeAdViewRenderer)object).g) != null) {
            object9 = ((com.jio.jioads.native.parser.a)object9).q;
        } else {
            boolean bl6 = false;
            object9 = null;
        }
        bl4 = TextUtils.isEmpty((CharSequence)object9);
        if (!bl4 && (object7 = ((NativeAdViewRenderer)object).A.K()) != (object6 = JioAdView$AD_TYPE.INFEED)) {
            object7 = "mediumImageByteArray";
            hashMap.put(object7, object9);
        }
        object9 = ((NativeAdViewRenderer)object).A.K();
        object7 = JioAdView$AD_TYPE.CUSTOM_NATIVE;
        int n3 = 1;
        object5 = null;
        if (object9 == object7) {
            object9 = ((NativeAdViewRenderer)object).A.b();
            if (object9 != null) {
                object7 = ((NativeAdViewRenderer)object).g;
                if (object7 != null) {
                    object7 = ((com.jio.jioads.native.parser.a)object7).D;
                } else {
                    bl4 = false;
                    object7 = null;
                }
                if (object7 != null) {
                    object4 = new StringBuilder();
                    object3 = ((NativeAdViewRenderer)object).A;
                    j_0.n(object3, (StringBuilder)object4, ": Requested Custom Native image sizes :");
                    Object object11 = object9[0];
                    ((StringBuilder)object4).append((int)object11);
                    object11 = 120;
                    ((StringBuilder)object4).append((char)object11);
                    JioAds$LogLevel jioAds$LogLevel = object9[n3];
                    ((StringBuilder)object4).append((int)jioAds$LogLevel);
                    object4 = ((StringBuilder)object4).toString();
                    string2 = "message";
                    Intrinsics.checkNotNullParameter(object4, string2);
                    ((JioAds$Companion)object8).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = new StringBuilder();
                    JioAds$LogLevel jioAds$LogLevel2 = object9[0];
                    ((StringBuilder)object4).append((int)jioAds$LogLevel2);
                    ((StringBuilder)object4).append((char)object11);
                    JioAds$LogLevel jioAds$LogLevel3 = object9[n3];
                    ((StringBuilder)object4).append((int)jioAds$LogLevel3);
                    object9 = ((StringBuilder)object4).toString();
                    bl3 = object7.has((String)object9);
                    if (bl3) {
                        object4 = new StringBuilder(" ");
                        object3 = ((NativeAdViewRenderer)object).A;
                        object2 = ": Requested ad size is available in response";
                        com.jio.jioads.common.l.a(object3, (StringBuilder)object4, (String)object2, (JioAds$Companion)object8);
                        try {
                            object10 = object7.getString((String)object9);
                        }
                        catch (JSONException jSONException) {
                            object9 = new StringBuilder();
                            object7 = ((NativeAdViewRenderer)object).A;
                            object4 = "  :";
                            j_0.n((com.jio.jioads.common.b)object7, (StringBuilder)object9, (String)object4);
                            object7 = Utility.INSTANCE;
                            object8 = ((Utility)object7).printStacktrace((Exception)((Object)jSONException));
                            ((StringBuilder)object9).append((String)object8);
                            Intrinsics.checkNotNullParameter(((StringBuilder)object9).toString(), string2);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object8 = JioAds$LogLevel.NONE;
                        }
                    }
                } else {
                    boolean bl7 = ((NativeAdViewRenderer)object).isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (!bl7) {
                        object9 = ((NativeAdViewRenderer)object).s;
                        if (object9 != null) {
                            object7 = "NativeCustomImageLayout";
                            object9 = (ViewGroup)object9.findViewWithTag(object7);
                        } else {
                            boolean bl8 = false;
                            object9 = null;
                        }
                        if (object9 != null) {
                            object8 = JioAdError$JioAdErrorType.ERROR_WRONG_AD_SIZE;
                            object9 = "Custom image is not available in response";
                            ((NativeAdViewRenderer)object).a((JioAdError$JioAdErrorType)((Object)object8), (String)object9);
                        } else {
                            object9 = new StringBuilder();
                            object7 = ((NativeAdViewRenderer)object).A;
                            object4 = ": Custom image is not available";
                            com.jio.jioads.common.l.a((com.jio.jioads.common.b)object7, (StringBuilder)object9, (String)object4, (JioAds$Companion)object8);
                        }
                    }
                }
            } else {
                object9 = new StringBuilder();
                object7 = ((NativeAdViewRenderer)object).A;
                object4 = ": CustomNative image size is NULL";
                com.jio.jioads.common.l.a((com.jio.jioads.common.b)object7, (StringBuilder)object9, (String)object4, (JioAds$Companion)object8);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)object10))) {
                object8 = "customImageByteArray";
                hashMap.put(object8, object10);
            }
        }
        if ((bl2 = hashMap.isEmpty()) && !(bl2 = ((NativeAdViewRenderer)object).A0) && !(bl2 = ((NativeAdViewRenderer)object).isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease())) {
            object8 = new StringBuilder();
            object9 = ((NativeAdViewRenderer)object).A;
            object10 = " cacheAndPrepareAdIfMediaCachingTrue : All the ad image urls are null test";
            j_0.i((com.jio.jioads.common.b)object9, (StringBuilder)object8, (String)object10);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object8 = JioAds$LogLevel.NONE;
            object8 = JioAdError$JioAdErrorType.ERROR_MEDIA_FILES_EMPTY;
            object9 = "All the ad image urls are null";
            ((NativeAdViewRenderer)object).a((JioAdError$JioAdErrorType)((Object)object8), (String)object9);
        } else {
            object8 = ((com.jio.jioads.controller.f)((NativeAdViewRenderer)object).h).a.G;
            object9 = JioAds$MediaType.IMAGE;
            if (object8 != object9 && object8 != (object10 = JioAds$MediaType.ALL) && object8 != (object10 = JioAds$MediaType.VIDEO)) {
                object8 = new StringBuilder();
                object9 = ((NativeAdViewRenderer)object).A;
                object10 = ": Wrong MediaType selected for Native Ad";
                j_0.i((com.jio.jioads.common.b)object9, (StringBuilder)object8, (String)object10);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object8 = JioAds$LogLevel.NONE;
                object8 = JioAdError$JioAdErrorType.ERROR_MISMATCH_AD_TYPE;
                object9 = "Wrong MediaType selected for Native Ad";
                ((NativeAdViewRenderer)object).a((JioAdError$JioAdErrorType)((Object)object8), (String)object9);
            } else {
                bl2 = ((NativeAdViewRenderer)object).A0;
                if (bl2 && (bl2 = hashMap.isEmpty())) {
                    object8 = new StringBuilder();
                    object9 = ((NativeAdViewRenderer)object).A;
                    object10 = " Only Carousel Ad available";
                    j_0.i((com.jio.jioads.common.b)object9, (StringBuilder)object8, (String)object10);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object8 = JioAds$LogLevel.NONE;
                    ((NativeAdViewRenderer)object).e();
                } else {
                    bl2 = ((NativeAdViewRenderer)object).isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (bl2 && (bl2 = hashMap.isEmpty())) {
                        object8 = new StringBuilder();
                        object9 = ((NativeAdViewRenderer)object).A;
                        object10 = " Only native video ad available";
                        j_0.i((com.jio.jioads.common.b)object9, (StringBuilder)object8, (String)object10);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object8 = JioAds$LogLevel.NONE;
                        ((NativeAdViewRenderer)object).e();
                    } else {
                        object8 = new StringBuilder();
                        object10 = ((NativeAdViewRenderer)object).A;
                        object7 = " NativeAd Start download";
                        j_0.i((com.jio.jioads.common.b)object10, (StringBuilder)object8, (String)object7);
                        object8 = JioAds.Companion;
                        ((JioAds$Companion)object8).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object10 = JioAds$LogLevel.NONE;
                        object10 = ((NativeAdViewRenderer)object).j;
                        if (object10 != null && (object10 = ((NativeAdViewRenderer)object).A.k0()) != (object7 = JioAdView$AdState.DESTROYED)) {
                            object7 = ((NativeAdViewRenderer)object).j;
                            Intrinsics.checkNotNull(object7);
                            object10 = ((com.jio.jioads.controller.f)((NativeAdViewRenderer)object).h).a;
                            object4 = ((com.jio.jioads.controller.o)object10).G;
                            if (object4 != object9 && object4 != (object3 = JioAds$MediaType.ALL)) {
                                bl3 = false;
                                object4 = null;
                            } else {
                                bl3 = true;
                            }
                            object2 = new o((NativeAdViewRenderer)object);
                            int n4 = ((com.jio.jioads.controller.o)object10).l;
                            Integer n7 = n4;
                            string2 = "";
                            object6 = "";
                            object3 = "";
                            object10 = object8;
                            object5 = object9;
                            object8 = new com.jio.jioads.utils.l((Context)object7, hashMap, (String)object6, (JioAds$MediaType)((Object)object9), bl3, (String)object3, string2, (com.jio.jioads.utils.f)object2, n7);
                            ((com.jio.jioads.utils.l)object8).a();
                        } else {
                            object9 = new StringBuilder();
                            object = ((NativeAdViewRenderer)object).A;
                            object10 = ": JioAdView state is destroyed so returning from downloadMediaFilesMediaCacheTrue()";
                            com.jio.jioads.common.l.a((com.jio.jioads.common.b)object, (StringBuilder)object9, (String)object10, (JioAds$Companion)object8);
                        }
                    }
                }
            }
        }
    }

    public static final void access$clearAllViews(NativeAdViewRenderer nativeAdViewRenderer) {
        Object object = new StringBuilder();
        com.jio.jioads.common.b b2 = nativeAdViewRenderer.A;
        String string2 = ": NativeAd inside clearAllViews";
        j_0.i(b2, object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = nativeAdViewRenderer.q0;
        if (object != null) {
            object.removeAllViews();
        }
        if ((object = nativeAdViewRenderer.p0) != null) {
            object.removeAllViews();
        }
        if ((object = nativeAdViewRenderer.G) != null) {
            object.removeAllViews();
        }
        if ((object = nativeAdViewRenderer.H) != null) {
            object.removeAllViews();
        }
        nativeAdViewRenderer.G = null;
        nativeAdViewRenderer.q0 = null;
        nativeAdViewRenderer.p0 = null;
        nativeAdViewRenderer.H = null;
        nativeAdViewRenderer.E0 = false;
    }

    public static final /* synthetic */ void access$clearCarousalView(NativeAdViewRenderer nativeAdViewRenderer) {
        nativeAdViewRenderer.g();
    }

    public static final /* synthetic */ void access$clearVideoData(NativeAdViewRenderer nativeAdViewRenderer) {
        nativeAdViewRenderer.h();
    }

    public static final /* synthetic */ void access$closeAfter(NativeAdViewRenderer nativeAdViewRenderer, Integer n3) {
        nativeAdViewRenderer.a(n3);
    }

    public static final /* synthetic */ void access$downloadAndDisplayAdIconForCustomNativeAd(NativeAdViewRenderer nativeAdViewRenderer) {
        nativeAdViewRenderer.k();
    }

    public static final /* synthetic */ void access$downloadFileCustomNative(NativeAdViewRenderer nativeAdViewRenderer) {
        nativeAdViewRenderer.l();
    }

    public static final /* synthetic */ String access$getContainerSize(NativeAdViewRenderer nativeAdViewRenderer, String string2) {
        return nativeAdViewRenderer.a(string2);
    }

    public static final /* synthetic */ String access$getContainerSizeForVastAd(NativeAdViewRenderer nativeAdViewRenderer, String string2) {
        return nativeAdViewRenderer.b(string2);
    }

    public static final /* synthetic */ int access$getCurrentPlayer$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.Z;
    }

    public static final /* synthetic */ HashMap access$getHeaders(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.s();
    }

    public static final /* synthetic */ com.jio.jioads.common.c access$getIJioAdViewController$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.h;
    }

    public static final /* synthetic */ int access$getImageCount$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.r;
    }

    public static final /* synthetic */ HashMap access$getImageDetailMap$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.m;
    }

    public static final /* synthetic */ com.jio.jioads.controller.a access$getJioAdCallback$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.u;
    }

    public static final /* synthetic */ com.jio.jioads.native.parser.a access$getJioAdParser$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.g;
    }

    public static final /* synthetic */ com.jio.jioads.native.callbaks.a access$getJioNativeViewListener$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.w;
    }

    public static final /* synthetic */ NativeAdViewRenderer$a access$getJioVideoViewListener$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.I0;
    }

    public static final /* synthetic */ int access$getMCarouselItemLayoutLayout$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.B0;
    }

    public static final /* synthetic */ Context access$getMContext$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.j;
    }

    public static final /* synthetic */ ViewGroup access$getNativeAdViewFromPublisher$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.v;
    }

    public static final /* synthetic */ boolean access$getNeedToloadVideoOnCompletePlayerOne$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.l0;
    }

    public static final /* synthetic */ boolean access$getNeedToloadVideoOnCompletePlayerTwo$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.m0;
    }

    public static final /* synthetic */ JioAdView$ORIENTATION_TYPE access$getNewOrienation$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.d;
    }

    public static final /* synthetic */ com.jio.jioads.native.utils.a access$getRefreshHandler$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.t0;
    }

    public static final /* synthetic */ int access$getRefreshRate$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.d0;
    }

    public static final /* synthetic */ long access$getTotalVideoPlayTime$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.c0;
    }

    public static final /* synthetic */ int access$getVIDEO_REFRESH_THRESHOLD$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.e0;
    }

    public static final /* synthetic */ Long access$getVideoDuration$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.a0;
    }

    public static final /* synthetic */ int access$getVideoRepeatCount$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.b0;
    }

    public static final /* synthetic */ void access$handleAdRenderCallback(NativeAdViewRenderer nativeAdViewRenderer) {
        nativeAdViewRenderer.w();
    }

    public static final /* synthetic */ void access$handleCarouselVisibility(NativeAdViewRenderer nativeAdViewRenderer) {
        nativeAdViewRenderer.x();
    }

    public static final void access$initConfiguration(NativeAdViewRenderer object, com.jio.jioads.videomodule.s s7) {
        boolean bl2;
        Object object2 = new StringBuilder();
        j_0.n(((NativeAdViewRenderer)object).A, object2, ": inside  initConfiguration");
        int n3 = ((NativeAdViewRenderer)object).n0;
        object2.append(n3 != 0);
        Intrinsics.checkNotNullParameter(object2.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = ((NativeAdViewRenderer)object).j;
        Object object3 = ((NativeAdViewRenderer)object).A.K();
        Object object4 = JioAdView$AD_TYPE.INTERSTITIAL;
        boolean bl3 = false;
        String string2 = "<this>";
        if (object3 != object4) {
            n3 = ((NativeAdViewRenderer)object).n0;
            Intrinsics.checkNotNullParameter(s7, string2);
            object4 = s7.g0();
            ((com.jio.jioads.videomodule.config.a)object4).t = n3;
        } else {
            object3 = ((NativeAdViewRenderer)object).A.K();
            if (object3 == object4) {
                Intrinsics.checkNotNullParameter(s7, string2);
                object3 = s7.g0();
                ((com.jio.jioads.videomodule.config.a)object3).t = false;
            }
        }
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().getClass();
        Intrinsics.checkNotNullParameter(s7, string2);
        object3 = s7.g0();
        int n4 = 1;
        ((com.jio.jioads.videomodule.config.a)object3).a = n4;
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().getClass();
        object3 = ((NativeAdViewRenderer)object).A.Y();
        if (object3 != null && (n3 = j_0.l((Context)object3)) == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            object3 = null;
        }
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().c = n3 ^= n4;
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().d = n4;
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().b = false;
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().getClass();
        n3 = j_0.l((Context)object2) ^ n4;
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().e = n3;
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().f = n4;
        n3 = j_0.r((Context)object2);
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().g = n3;
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().getClass();
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().j = false;
        object3 = ((NativeAdViewRenderer)object).A.E();
        Object object5 = JioAdView$VideoAdType.VOD;
        if (object3 == object5) {
            n3 = 1;
        } else {
            n3 = 0;
            object3 = null;
        }
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().m = n3;
        n3 = 4;
        object5 = n3;
        String string3 = "com.jio.media.stb.ondemand.patchwall";
        boolean bl4 = j_0.m((Context)object2, string3, (Integer)object5);
        String string4 = "com.yupptv.androidtv";
        if (!bl4 && !(bl4 = j_0.m((Context)object2, string4, (Integer)(object5 = Integer.valueOf(n3))))) {
            bl4 = true;
        } else {
            bl4 = false;
            object5 = null;
        }
        Intrinsics.checkNotNullParameter(s7, string2);
        com.jio.jioads.videomodule.config.a a2 = s7.g0();
        a2.k = bl4;
        object5 = n3;
        bl4 = j_0.m((Context)object2, string3, (Integer)object5);
        if (!bl4) {
            object5 = n3;
            j_0.m((Context)object2, string4, (Integer)object5);
        }
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().getClass();
        object5 = n3;
        bl4 = j_0.m((Context)object2, string3, (Integer)object5);
        if (!bl4 && !(bl2 = j_0.m((Context)object2, string4, (Integer)(object3 = Integer.valueOf(n3))))) {
            bl2 = false;
            object2 = null;
        } else {
            bl2 = true;
        }
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().i = bl2;
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().l = n4;
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().n = n4;
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().p = false;
        object2 = ((NativeAdViewRenderer)object).A.L();
        object3 = JioAdView$AdPodVariant.DEFAULT_ADPOD;
        if (object2 != object3 && (object2 = ((NativeAdViewRenderer)object).A.L()) != (object3 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP)) {
            bl2 = false;
            object2 = null;
        } else {
            bl2 = true;
        }
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().q = bl2;
        object2 = ((NativeAdViewRenderer)object).A.L();
        object3 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP;
        if (object2 == object3) {
            object = ((com.jio.jioads.controller.f)((NativeAdViewRenderer)object).h).a;
            boolean bl5 = ((com.jio.jioads.controller.o)object).o;
            if (bl5) {
                bl3 = true;
            }
        }
        Intrinsics.checkNotNullParameter(s7, string2);
        s7.g0().r = bl3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void access$initVCEValue(NativeAdViewRenderer object) {
        Object object2;
        Object object3;
        CharSequence charSequence;
        block19: {
            int n3;
            int n4;
            Object object4;
            String string2;
            Object object5;
            Integer n7;
            block17: {
                block16: {
                    Exception exception2;
                    block18: {
                        String string3;
                        Object object6;
                        block15: {
                            charSequence = "1";
                            object3 = ((NativeAdViewRenderer)object).A.K();
                            if (object3 == (object2 = JioAdView$AD_TYPE.INFEED)) return;
                            object3 = ((NativeAdViewRenderer)object).s();
                            object2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                            Intrinsics.checkNotNullParameter(object3, "<this>");
                            n7 = null;
                            try {
                                object5 = Constants$HeaderKeys.JIO_DATA;
                                string2 = ((Constants$HeaderKeys)((Object)object5)).getKey();
                                object4 = Locale.ROOT;
                                string2 = string2.toLowerCase((Locale)object4);
                                Intrinsics.checkNotNullExpressionValue(string2, (String)object2);
                                boolean bl2 = object3.containsKey(string2);
                                object6 = "{}";
                                string3 = "vce";
                                if (!bl2) break block15;
                                object5 = ((Constants$HeaderKeys)((Object)object5)).getKey();
                                object5 = ((String)object5).toLowerCase((Locale)object4);
                                Intrinsics.checkNotNullExpressionValue(object5, (String)object2);
                                object3 = object3.get(object5);
                                object3 = (String)object3;
                                if (object3 == null) {
                                    object3 = object6;
                                }
                                if ((n4 = (object2 = new JSONObject((String)object3)).has(string3)) == 0) return;
                                object3 = object2.getString(string3);
                                if (object3 == null) return;
                                n4 = ((String)object3).length();
                                if (n4 == 0) break block16;
                                if ((object2 = object2.getString(string3)) != null) {
                                    object6 = object2;
                                }
                                object3 = new JSONObject(object6);
                                break block17;
                            }
                            catch (Exception exception2) {
                                break block18;
                            }
                        }
                        n3 = object3.containsKey(string3);
                        if (n3 == 0) return;
                        object2 = object3.get(string3);
                        if ((object2 = (CharSequence)object2) == null) return;
                        n3 = object2.length();
                        if (n3 == 0) break block16;
                        object3 = object3.get(string3);
                        if ((object3 = (String)object3) != null) {
                            object6 = object3;
                        }
                        object3 = object2 = new JSONObject(object6);
                        break block17;
                    }
                    object2 = new StringBuilder("Exception while getting VCE flag ");
                    object5 = Utility.INSTANCE;
                    com.jio.jioads.jioreel.tracker.model.b.c((Utility)object5, exception2, (StringBuilder)object2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                }
                return;
            }
            if (object3 == null) {
                return;
            }
            object2 = object3.toString();
            object5 = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
            n3 = TextUtils.isEmpty((CharSequence)object2);
            boolean bl3 = true;
            string2 = "0";
            if (n3 == 0 && (n3 = (int)(((NativeAdViewRenderer)object).isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0)) != 0) {
                object2 = object3.optString("type");
                object4 = "optString(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                ((NativeAdViewRenderer)object).Q = object2;
                object3 = object3.optString("time");
                Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                ((NativeAdViewRenderer)object).P = object3;
                object3 = ((NativeAdViewRenderer)object).Q;
                object2 = "null";
                n4 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
                object3 = n4 != 0 ? string2 : ((NativeAdViewRenderer)object).Q;
                ((NativeAdViewRenderer)object).Q = object3;
                n4 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
                ((NativeAdViewRenderer)object).k = n4;
                try {
                    object3 = ((NativeAdViewRenderer)object).U;
                    if (object3 != null) {
                        n7 = ((com.jio.jioads.videomodule.s)object3).b0();
                    }
                    if (n7 == null) break block19;
                    object3 = ((NativeAdViewRenderer)object).Q;
                    n4 = (int)(Intrinsics.areEqual(object3, charSequence) ? 1 : 0);
                    if (n4 != 0 && (n4 = n7.intValue()) < (n3 = Integer.parseInt((String)(object2 = ((NativeAdViewRenderer)object).P)) * 1000)) {
                        charSequence = "3";
                        ((NativeAdViewRenderer)object).Q = charSequence;
                    } else {
                        object3 = ((NativeAdViewRenderer)object).Q;
                        int n8 = Intrinsics.areEqual(object3, charSequence);
                        if (n8 != 0 && (n8 = Integer.parseInt((String)(charSequence = ((NativeAdViewRenderer)object).P))) == 0) {
                            ((NativeAdViewRenderer)object).Q = string2;
                            ((NativeAdViewRenderer)object).k = bl3;
                        }
                    }
                }
                catch (Exception exception) {
                    ((NativeAdViewRenderer)object).Q = string2;
                    ((NativeAdViewRenderer)object).k = bl3;
                }
            } else {
                ((NativeAdViewRenderer)object).Q = string2;
                ((NativeAdViewRenderer)object).k = bl3;
            }
        }
        charSequence = new StringBuilder();
        object3 = ((NativeAdViewRenderer)object).A;
        object2 = ": Inside initVCEValue click type = ";
        j_0.n((com.jio.jioads.common.b)object3, (StringBuilder)charSequence, (String)object2);
        object3 = ((NativeAdViewRenderer)object).Q;
        ((StringBuilder)charSequence).append((String)object3);
        ((StringBuilder)charSequence).append(", time = ");
        object3 = ((NativeAdViewRenderer)object).P;
        ((StringBuilder)charSequence).append((String)object3);
        object3 = ", allowClick = ";
        ((StringBuilder)charSequence).append((String)object3);
        boolean bl4 = ((NativeAdViewRenderer)object).k;
        ((StringBuilder)charSequence).append(bl4);
        object = ((StringBuilder)charSequence).toString();
        charSequence = "message";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public static final void access$initiateVideoAdAutoRefresh(NativeAdViewRenderer nativeAdViewRenderer) {
        Object object = nativeAdViewRenderer.v;
        if (object != null) {
            Object object2 = Utility.INSTANCE;
            Intrinsics.checkNotNull(object);
            int n3 = 5;
            boolean bl2 = ((Utility)object2).checkVisibility((ViewGroup)object, n3);
            if (bl2 && (bl2 = nativeAdViewRenderer.d0)) {
                long l2;
                long l3;
                object = new StringBuilder();
                object2 = nativeAdViewRenderer.A;
                String string2 = ": inside restartRefreshNativeVideo()";
                j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object, string2);
                object = JioAds.Companion;
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = nativeAdViewRenderer.a0;
                if (object2 != null) {
                    int n4;
                    l3 = (Long)object2;
                    long l4 = l3 - (l2 = (long)(n4 = nativeAdViewRenderer.d0));
                    Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object3 < 0) {
                        l3 = nativeAdViewRenderer.c0;
                        object2 = l2 -= l3;
                    } else {
                        l2 = nativeAdViewRenderer.c0;
                        object2 = l3 -= l2;
                    }
                } else {
                    object2 = null;
                }
                if (object2 != null) {
                    l3 = (Long)object2;
                    n3 = (int)l3;
                } else {
                    n3 = nativeAdViewRenderer.d0;
                }
                object2 = new StringBuilder();
                String string3 = nativeAdViewRenderer.A.P();
                ((StringBuilder)object2).append(string3);
                ((StringBuilder)object2).append(": restartRefreshNativeVideo: refreshTime ");
                ((StringBuilder)object2).append(n3);
                object2 = ((StringBuilder)object2).toString();
                string3 = "message";
                Intrinsics.checkNotNullParameter(object2, string3);
                object = ((JioAds$Companion)object).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                bl2 = true;
                if (n3 <= 0) {
                    n3 = 1;
                }
                if ((object2 = nativeAdViewRenderer.t0) != null) {
                    ((com.jio.jioads.native.utils.a)object2).a();
                    ((com.jio.jioads.native.utils.a)object2).h = l2 = 0L;
                }
                if ((object2 = nativeAdViewRenderer.t0) != null) {
                    ((com.jio.jioads.native.utils.a)object2).b(n3, bl2);
                }
                if ((object2 = nativeAdViewRenderer.t0) != null) {
                    ((com.jio.jioads.native.utils.a)object2).c();
                }
                nativeAdViewRenderer.v0 = bl2;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean access$isCarouselAd(NativeAdViewRenderer object) {
        object = ((NativeAdViewRenderer)object).g;
        Collection collection = null;
        if (object == null) return false;
        com.jio.jioads.carousel.data.b b2 = ((com.jio.jioads.native.parser.a)object).V;
        if (b2 == null) return false;
        if (object != null && (object = ((com.jio.jioads.native.parser.a)object).V) != null) {
            collection = ((com.jio.jioads.carousel.data.b)object).c;
        }
        if (collection == null) return false;
        boolean bl2 = collection.isEmpty();
        if (!bl2) return true;
        return false;
    }

    public static final /* synthetic */ Boolean access$isCarouselPreparedAfterVideoAd$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.C0;
    }

    public static final /* synthetic */ boolean access$isExoPlayerEnabled(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.B();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean access$isLastIteration(NativeAdViewRenderer nativeAdViewRenderer, long l2) {
        long l3;
        long l4;
        long l7;
        long l8;
        long l12;
        int n3 = nativeAdViewRenderer.d0;
        long l14 = n3;
        long l15 = l2 - l14;
        Object object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object >= 0) return 0 != 0;
        int n4 = nativeAdViewRenderer.b0;
        if (n4 == 0) return 0 != 0;
        if (n4 <= 0) return 0 != 0;
        long l16 = l14 / l2;
        long l17 = 0L;
        long l18 = 1L;
        long l19 = (l14 %= l2) - l17;
        Object object2 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
        if (object2 > 0 && (l12 = (l8 = l2 - (l14 = (long)10)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) >= 0) {
            l16 += l18;
        }
        if ((l7 = (l4 = (l3 = (long)n4 + l18) - l16) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) return 0 != 0;
        return 1 != 0;
    }

    public static final /* synthetic */ boolean access$isLastIteration$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.f0;
    }

    public static final /* synthetic */ boolean access$isNativeVideoReadyToShowAfter5sec$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.k0;
    }

    public static final /* synthetic */ boolean access$isPreparedAd$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.g0;
    }

    public static final /* synthetic */ boolean access$isVideoLoadAdCalled$p(NativeAdViewRenderer nativeAdViewRenderer) {
        return nativeAdViewRenderer.h0;
    }

    public static final boolean access$isVootPackageWithNativeVideoAd(NativeAdViewRenderer object, Context context, JioAdView$AD_TYPE jioAdView$AD_TYPE) {
        boolean bl2;
        object.getClass();
        object = Utility.INSTANCE;
        String string2 = "com.tv.v18.viola";
        boolean bl3 = ((Utility)object).isPackage(context, string2, null);
        if (!bl3 && !(bl3 = ((Utility)object).isPackage(context, string2 = "com.viacom18.tv.voot", null)) && !(bl3 = ((Utility)object).isPackage(context, string2 = "com.jio.media.ondemand", null)) && !(bl2 = ((Utility)object).isPackage(context, string2 = "com.jio.media.stb.ondemand", null)) || jioAdView$AD_TYPE != (object = JioAdView$AD_TYPE.CUSTOM_NATIVE) && jioAdView$AD_TYPE != (object = JioAdView$AD_TYPE.CONTENT_STREAM)) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static final void access$loadView(NativeAdViewRenderer nativeAdViewRenderer) {
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        JioAdView$AD_TYPE jioAdView$AD_TYPE2 = nativeAdViewRenderer.A.K();
        if (jioAdView$AD_TYPE2 != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INFEED) && (jioAdView$AD_TYPE2 = nativeAdViewRenderer.A.K()) != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL) && (jioAdView$AD_TYPE2 = nativeAdViewRenderer.A.K()) != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.CONTENT_STREAM) && (jioAdView$AD_TYPE2 = nativeAdViewRenderer.A.K()) != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) {
            nativeAdViewRenderer.E();
        } else {
            nativeAdViewRenderer.D();
        }
    }

    public static final /* synthetic */ void access$preparedAllViewsForRender(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        nativeAdViewRenderer.c(bl2);
    }

    public static final /* synthetic */ void access$preparedAllViewsForRenderCustomNative(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        nativeAdViewRenderer.d(bl2);
    }

    public static final /* synthetic */ void access$prepredNativeVideoAd(NativeAdViewRenderer nativeAdViewRenderer) {
        nativeAdViewRenderer.M();
    }

    public static final void access$processClickNotification(NativeAdViewRenderer object) {
        block28: {
            block30: {
                Object object2;
                String string2;
                Object object3;
                String string3;
                int n3;
                block27: {
                    n3 = 1;
                    boolean bl2 = ((NativeAdViewRenderer)object).C;
                    string3 = "message";
                    if (bl2) break block30;
                    object3 = ((NativeAdViewRenderer)object).J0;
                    com.jio.jioads.native.callbaks.a a2 = ((NativeAdViewRenderer)object).w;
                    if (a2 == null) break block27;
                    string2 = ((NativeAdViewRenderer)object).K0;
                    if (string2 == null) {
                        string2 = "";
                    }
                    object2 = "c";
                    a2.b(string2, (String)object2);
                }
                if (object3 == null) break block28;
                int n4 = object3.length();
                if (n4 <= 0) break block28;
                n4 = object3.length();
                string2 = null;
                for (int i3 = 0; i3 < n4; i3 += n3) {
                    Object object4;
                    block29: {
                        object2 = object3.getString(i3);
                        object4 = ((NativeAdViewRenderer)object).E;
                        if (object4 == null) break block29;
                        Intrinsics.checkNotNull(object4);
                        boolean bl3 = ((HashMap)object4).containsKey(object2);
                        if (bl3) break block29;
                        object4 = ((NativeAdViewRenderer)object).E;
                        Intrinsics.checkNotNull(object4);
                        Intrinsics.checkNotNull(object2);
                        Boolean bl4 = Boolean.TRUE;
                        ((HashMap)object4).put(object2, bl4);
                        object4 = JioEventTracker$TrackingEvents.EVENT_CLICK;
                        ((NativeAdViewRenderer)object).a((String)object2, (JioEventTracker$TrackingEvents)((Object)object4));
                        ((NativeAdViewRenderer)object).C = n3;
                        continue;
                    }
                    object2 = new StringBuilder();
                    object4 = ((NativeAdViewRenderer)object).A;
                    object4 = object4.P();
                    ((StringBuilder)object2).append((String)object4);
                    object4 = ": click URL already registered";
                    ((StringBuilder)object2).append((String)object4);
                    object2 = ((StringBuilder)object2).toString();
                    Intrinsics.checkNotNullParameter(object2, string3);
                    object2 = JioAds.Companion;
                    object2 = ((JioAds$Companion)object2).getInstance();
                    ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                }
                Serializable serializable = ((NativeAdViewRenderer)object).E;
                if (serializable == null) break block28;
                try {
                    ((HashMap)serializable).clear();
                }
                catch (JSONException jSONException) {
                    object3 = " ";
                    serializable = new StringBuilder((String)object3);
                    object = ((NativeAdViewRenderer)object).A.P();
                    ((StringBuilder)serializable).append((String)object);
                    ((StringBuilder)serializable).append(": ");
                    object = Unit.a;
                    ((StringBuilder)serializable).append(object);
                    Intrinsics.checkNotNullParameter(((StringBuilder)serializable).toString(), string3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
                break block28;
            }
            StringBuilder stringBuilder = new StringBuilder();
            object = ((NativeAdViewRenderer)object).A;
            String string4 = ": Click tracker is already fired";
            j_0.i((com.jio.jioads.common.b)object, stringBuilder, string4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public static final void access$refreshNativeVideo(NativeAdViewRenderer nativeAdViewRenderer) {
        Object object = new StringBuilder();
        j_0.i(nativeAdViewRenderer.A, object, ": Calling refresh from refreshNativeVideo()");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        nativeAdViewRenderer.k0 = false;
        nativeAdViewRenderer.A.i(true);
        ((com.jio.jioads.controller.f)nativeAdViewRenderer.h).o();
    }

    public static final /* synthetic */ void access$registerClick(NativeAdViewRenderer nativeAdViewRenderer) {
        nativeAdViewRenderer.Q();
    }

    public static final /* synthetic */ void access$registerViewForInteraction(NativeAdViewRenderer nativeAdViewRenderer, ViewGroup viewGroup, List list) {
        nativeAdViewRenderer.a(viewGroup, list);
    }

    public static final /* synthetic */ void access$setAutoStartVideoAd$p(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        nativeAdViewRenderer.v0 = bl2;
    }

    public static final /* synthetic */ void access$setCarouselPreparedAfterVideoAd$p(NativeAdViewRenderer nativeAdViewRenderer, Boolean bl2) {
        nativeAdViewRenderer.C0 = bl2;
    }

    public static final void access$setCtaButtonVisibility(NativeAdViewRenderer object, boolean bl2) {
        com.jio.jioads.native.parser.a a2;
        boolean bl3 = ((NativeAdViewRenderer)object).x0;
        if (!bl3 && (a2 = ((NativeAdViewRenderer)object).g) != null) {
            JioAdView$AD_TYPE jioAdView$AD_TYPE;
            Object object2;
            bl3 = false;
            a2 = null;
            boolean bl4 = true;
            if (bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)(object2 = ((NativeAdViewRenderer)object).G0)))) {
                object2 = ((NativeAdViewRenderer)object).i;
                if (object2 != null) {
                    object2.setVisibility(0);
                }
                object2 = ((NativeAdViewRenderer)object).A.K();
                jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL;
                if (object2 != jioAdView$AD_TYPE) {
                    ((NativeAdViewRenderer)object).x0 = bl4;
                }
            }
            if ((object2 = ((NativeAdViewRenderer)object).A.K()) == (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL) && ((object2 = ((NativeAdViewRenderer)object).A.Y()) == null || (bl2 = j_0.l((Context)object2)) != bl4)) {
                object2 = ((NativeAdViewRenderer)object).s;
                jioAdView$AD_TYPE = null;
                ((NativeAdViewRenderer)object).a((ViewGroup)object2, null);
                object2 = ((NativeAdViewRenderer)object).G;
                if (object2 != null) {
                    boolean bl5 = (object2 = object2.getChildAt(0)) instanceof ViewGroup;
                    if (bl5) {
                        object2 = (ViewGroup)object2;
                    } else {
                        bl2 = false;
                        object2 = null;
                    }
                    if (object2 != null) {
                        bl5 = (object2 = object2.getChildAt(0)) instanceof ViewGroup;
                        if (bl5) {
                            object2 = (ViewGroup)object2;
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        if (object2 != null) {
                            object2 = object2.getChildAt(0);
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        if (object2 != null) {
                            object2.setClickable(bl4);
                        }
                    }
                }
                if ((object2 = ((NativeAdViewRenderer)object).G) != null) {
                    object2.setClickable(bl4);
                }
                object = ((NativeAdViewRenderer)object).U;
                if (object != null) {
                    jioAdView$AD_TYPE = ((com.jio.jioads.videomodule.s)object).c0();
                }
                if (jioAdView$AD_TYPE != null) {
                    jioAdView$AD_TYPE.setClickable(bl4);
                }
            }
            object2 = "message";
            Intrinsics.checkNotNullParameter("setCtaButtonVisibility() called", object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public static final /* synthetic */ void access$setFileDownloaderCallbackResponses$p(NativeAdViewRenderer nativeAdViewRenderer, Map map2) {
        nativeAdViewRenderer.R = map2;
    }

    public static final /* synthetic */ void access$setImageCount$p(NativeAdViewRenderer nativeAdViewRenderer, int n3) {
        nativeAdViewRenderer.r = n3;
    }

    public static final /* synthetic */ void access$setImpressionProcessed$p(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        nativeAdViewRenderer.z = bl2;
    }

    public static final /* synthetic */ void access$setLastIteration$p(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        nativeAdViewRenderer.f0 = bl2;
    }

    public static final /* synthetic */ void access$setNativeAdClickUrls(NativeAdViewRenderer nativeAdViewRenderer) {
        nativeAdViewRenderer.V();
    }

    public static final /* synthetic */ void access$setNativeError(NativeAdViewRenderer nativeAdViewRenderer, String string2, JioAdError$JioAdErrorType jioAdError$JioAdErrorType) {
        nativeAdViewRenderer.a(jioAdError$JioAdErrorType, string2);
    }

    public static final /* synthetic */ void access$setNeedToloadVideoOnCompletePlayerOne$p(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        nativeAdViewRenderer.l0 = bl2;
    }

    public static final /* synthetic */ void access$setNeedToloadVideoOnCompletePlayerTwo$p(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        nativeAdViewRenderer.m0 = bl2;
    }

    public static final /* synthetic */ void access$setPreparedAd$p(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        nativeAdViewRenderer.g0 = bl2;
    }

    public static final /* synthetic */ void access$setStartRefreshAsVideoFailedToPrepared$p(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        nativeAdViewRenderer.j0 = bl2;
    }

    public static final /* synthetic */ void access$setTotalVideoPlayTime$p(NativeAdViewRenderer nativeAdViewRenderer, long l2) {
        nativeAdViewRenderer.c0 = l2;
    }

    public static final /* synthetic */ void access$setVerticalDisplayAdSize$p(NativeAdViewRenderer nativeAdViewRenderer, String string2) {
        nativeAdViewRenderer.getClass();
    }

    public static final /* synthetic */ void access$setVideoDuration$p(NativeAdViewRenderer nativeAdViewRenderer, Long l2) {
        nativeAdViewRenderer.a0 = l2;
    }

    public static final /* synthetic */ void access$setVideoInLoop$p(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        nativeAdViewRenderer.n0 = bl2;
    }

    public static final /* synthetic */ void access$setVideoLoadAdCalled$p(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        nativeAdViewRenderer.h0 = bl2;
    }

    public static final /* synthetic */ void access$setVideoMute$p(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2) {
        nativeAdViewRenderer.o0 = bl2;
    }

    public static final /* synthetic */ void access$setVideoRepeatCount$p(NativeAdViewRenderer nativeAdViewRenderer, int n3) {
        nativeAdViewRenderer.b0 = n3;
    }

    public static final /* synthetic */ void access$setupCTAButtonForCustomNativeAd(NativeAdViewRenderer nativeAdViewRenderer) {
        nativeAdViewRenderer.Y();
    }

    public static final /* synthetic */ void access$showVideoAd(NativeAdViewRenderer nativeAdViewRenderer) {
        nativeAdViewRenderer.Z();
    }

    public static final void access$storeNativeViewableImpression(NativeAdViewRenderer nativeAdViewRenderer, com.jio.jioads.instreamads.vastparser.model.m m2, String string2) {
        Object object;
        Object object2;
        Object object3 = nativeAdViewRenderer;
        String string3 = string2;
        int n3 = 1;
        Object object4 = new StringBuilder();
        Object object5 = nativeAdViewRenderer.A;
        Object object6 = " : Inside storeNativeViewableImpression ";
        j_0.i((com.jio.jioads.common.b)object5, (StringBuilder)object4, (String)object6);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = JioAds$LogLevel.NONE;
        object4 = nativeAdViewRenderer.g;
        object5 = null;
        object4 = object4 != null ? ((com.jio.jioads.native.parser.a)object4).B : null;
        object6 = new ArrayList();
        Object object7 = nativeAdViewRenderer.o();
        int n4 = ((int[])object7).length;
        if (n4 == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object7 = null;
        }
        String string4 = "";
        if ((n4 ^= n3) != 0 && (n4 = ((int[])(object7 = nativeAdViewRenderer.o())).length) >= (object2 = 2)) {
            object7 = new StringBuilder;
            ((StringBuilder)object7)();
            object2 = nativeAdViewRenderer.o()[0];
            ((StringBuilder)object7).append((int)object2);
            ((StringBuilder)object7).append('x');
            object = nativeAdViewRenderer.o();
            object2 = (Object)object[n3];
            ((StringBuilder)object7).append((int)object2);
            object7 = ((StringBuilder)object7).toString();
        } else {
            object7 = string4;
        }
        object = ((NativeAdViewRenderer)object3).A.k0();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState) {
            int n7;
            object = ((NativeAdViewRenderer)object3).A.Y();
            if (object4 != null && (n7 = object4.length()) > 0) {
                n7 = object4.length();
                for (int i3 = 0; i3 < n7; i3 += n3) {
                    Object object8;
                    Object object9 = new Object();
                    ((com.jio.jioads.util.k)object9).p = object;
                    Object object10 = ((NativeAdViewRenderer)object3).A.P();
                    ((com.jio.jioads.util.k)object9).q = object10;
                    object10 = object4.getString(i3);
                    ((com.jio.jioads.util.k)object9).a = object10;
                    ((com.jio.jioads.util.k)object9).b = null;
                    ((com.jio.jioads.util.k)object9).v = object7;
                    if (object != null) {
                        Intrinsics.checkNotNullParameter(object, "context");
                        object10 = "common_prefs";
                        object8 = "advid";
                        try {
                            object10 = j_0.d((Context)object, (String)object10, 0, string4, (String)object8);
                            object8 = "null cannot be cast to non-null type kotlin.String";
                        }
                        catch (Exception exception) {}
                        Intrinsics.checkNotNull(object10, (String)object8);
                        object10 = (String)object10;
                    }
                    object10 = null;
                    ((com.jio.jioads.util.k)object9).r = object10;
                    object10 = Utility.INSTANCE;
                    object8 = ((Utility)object10).getUidFromPreferences((Context)object);
                    ((com.jio.jioads.util.k)object9).s = object8;
                    ((com.jio.jioads.util.k)object9).l = object8 = Integer.valueOf(n3);
                    ((com.jio.jioads.util.k)object9).d = object8 = com.jio.jioads.controller.o.o(((com.jio.jioads.controller.f)((NativeAdViewRenderer)object3).h).a, null, null, null);
                    ((com.jio.jioads.util.k)object9).e = object8 = Boolean.FALSE;
                    Object object11 = ((NativeAdViewRenderer)object3).A.q0();
                    ((com.jio.jioads.util.k)object9).w = object11;
                    ((com.jio.jioads.util.k)object9).m = object11 = Boolean.TRUE;
                    ((com.jio.jioads.util.k)object9).o = object8;
                    ((com.jio.jioads.util.k)object9).n = object8;
                    ((com.jio.jioads.util.k)object9).t = object8 = ((NativeAdViewRenderer)object3).A.R();
                    ((NativeAdViewRenderer)object3).A.L();
                    int n8 = ((NativeAdViewRenderer)object3).A.W();
                    ((com.jio.jioads.util.k)object9).F = object8 = Integer.valueOf(n8);
                    object8 = ((NativeAdViewRenderer)object3).A.K();
                    ((com.jio.jioads.util.k)object9).u = object8;
                    object8 = ((NativeAdViewRenderer)object3).v;
                    if (object8 != null) {
                        n8 = object8.getWidth();
                        object8 = n8;
                    } else {
                        n8 = 0;
                        object8 = null;
                    }
                    object8 = String.valueOf(object8);
                    ((com.jio.jioads.util.k)object9).j = object8;
                    object8 = ((NativeAdViewRenderer)object3).v;
                    if (object8 != null) {
                        n8 = object8.getHeight();
                        object8 = n8;
                    } else {
                        n8 = 0;
                        object8 = null;
                    }
                    object8 = String.valueOf(object8);
                    ((com.jio.jioads.util.k)object9).k = object8;
                    object9 = ((Utility)object10).replaceMacros((com.jio.jioads.util.k)object9);
                    ((ArrayList)object6).add(object9);
                }
            }
            Object object12 = new StringBuilder();
            j_0.n(((NativeAdViewRenderer)object3).A, (StringBuilder)object12, " : Inside ViewableImpression finalImpressionURLArray size : ");
            int n10 = ((ArrayList)object6).size();
            ((StringBuilder)object12).append(n10);
            object3 = ((StringBuilder)object12).toString();
            object12 = "message";
            Intrinsics.checkNotNullParameter(object3, (String)object12);
            object3 = JioAds.Companion;
            ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
            object4 = m2;
            object4 = m2.a;
            if (object4 != null) {
                Intrinsics.checkNotNullParameter(string3, "adId");
                object5 = new StringBuilder();
                object7 = ((com.jio.jioads.instreamads.vastparser.model.n)object4).a;
                ((StringBuilder)object5).append((String)object7);
                ((StringBuilder)object5).append(": Inside storeNativeImpression size of ViewableImpressionUrl size: ");
                n4 = ((ArrayList)object6).size();
                object7 = n4;
                ((StringBuilder)object5).append(object7);
                object5 = ((StringBuilder)object5).toString();
                Intrinsics.checkNotNullParameter(object5, (String)object12);
                ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = ((com.jio.jioads.instreamads.vastparser.model.n)object4).d;
                object12 = (List)((HashMap)object3).get(string3);
                if (object12 != null) {
                    object4 = new ArrayList(object12);
                    ((ArrayList)object4).addAll(object6);
                    object6 = object4;
                }
                ((HashMap)object3).put(string3, object6);
            }
        }
    }

    public static final void access$storeVideoImpressionUrls(NativeAdViewRenderer nativeAdViewRenderer, com.jio.jioads.instreamads.vastparser.model.m m2, String string2) {
        Object object;
        Object object2;
        Object object3 = nativeAdViewRenderer;
        String string3 = string2;
        int n3 = 1;
        Object object4 = new StringBuilder();
        Object object5 = nativeAdViewRenderer.A;
        Object object6 = " : Inside storeVideoImpressionUrls ";
        j_0.i((com.jio.jioads.common.b)object5, (StringBuilder)object4, (String)object6);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = JioAds$LogLevel.NONE;
        object4 = nativeAdViewRenderer.g;
        object5 = null;
        object4 = object4 != null ? ((com.jio.jioads.native.parser.a)object4).z : null;
        object6 = new ArrayList();
        Object object7 = nativeAdViewRenderer.o();
        int n4 = ((int[])object7).length;
        if (n4 == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object7 = null;
        }
        String string4 = "";
        if ((n4 ^= n3) != 0 && (n4 = ((int[])(object7 = nativeAdViewRenderer.o())).length) >= (object2 = 2)) {
            object7 = new StringBuilder;
            ((StringBuilder)object7)();
            object2 = nativeAdViewRenderer.o()[0];
            ((StringBuilder)object7).append((int)object2);
            ((StringBuilder)object7).append('x');
            object = nativeAdViewRenderer.o();
            object2 = (Object)object[n3];
            ((StringBuilder)object7).append((int)object2);
            object7 = ((StringBuilder)object7).toString();
        } else {
            object7 = string4;
        }
        object = ((NativeAdViewRenderer)object3).A.k0();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState) {
            int n7;
            object = ((NativeAdViewRenderer)object3).A.Y();
            if (object4 != null && (n7 = object4.length()) > 0) {
                n7 = object4.length();
                for (int i3 = 0; i3 < n7; i3 += n3) {
                    Object object8;
                    Object object9 = new Object();
                    ((com.jio.jioads.util.k)object9).p = object;
                    Object object10 = ((NativeAdViewRenderer)object3).A.P();
                    ((com.jio.jioads.util.k)object9).q = object10;
                    object10 = object4.getString(i3);
                    ((com.jio.jioads.util.k)object9).a = object10;
                    ((com.jio.jioads.util.k)object9).b = null;
                    ((com.jio.jioads.util.k)object9).v = object7;
                    if (object != null) {
                        Intrinsics.checkNotNullParameter(object, "context");
                        object10 = "common_prefs";
                        object8 = "advid";
                        try {
                            object10 = j_0.d((Context)object, (String)object10, 0, string4, (String)object8);
                            object8 = "null cannot be cast to non-null type kotlin.String";
                        }
                        catch (Exception exception) {}
                        Intrinsics.checkNotNull(object10, (String)object8);
                        object10 = (String)object10;
                    }
                    object10 = null;
                    ((com.jio.jioads.util.k)object9).r = object10;
                    object10 = Utility.INSTANCE;
                    object8 = ((Utility)object10).getUidFromPreferences((Context)object);
                    ((com.jio.jioads.util.k)object9).s = object8;
                    ((com.jio.jioads.util.k)object9).l = object8 = Integer.valueOf(n3);
                    ((com.jio.jioads.util.k)object9).d = object8 = com.jio.jioads.controller.o.o(((com.jio.jioads.controller.f)((NativeAdViewRenderer)object3).h).a, null, null, null);
                    ((com.jio.jioads.util.k)object9).e = object8 = Boolean.FALSE;
                    Object object11 = ((NativeAdViewRenderer)object3).A.q0();
                    ((com.jio.jioads.util.k)object9).w = object11;
                    ((com.jio.jioads.util.k)object9).m = object11 = Boolean.TRUE;
                    ((com.jio.jioads.util.k)object9).o = object8;
                    ((com.jio.jioads.util.k)object9).n = object8;
                    ((com.jio.jioads.util.k)object9).t = object8 = ((NativeAdViewRenderer)object3).A.R();
                    ((NativeAdViewRenderer)object3).A.L();
                    int n8 = ((NativeAdViewRenderer)object3).A.W();
                    ((com.jio.jioads.util.k)object9).F = object8 = Integer.valueOf(n8);
                    object8 = ((NativeAdViewRenderer)object3).A.K();
                    ((com.jio.jioads.util.k)object9).u = object8;
                    object8 = ((NativeAdViewRenderer)object3).v;
                    if (object8 != null) {
                        n8 = object8.getWidth();
                        object8 = n8;
                    } else {
                        n8 = 0;
                        object8 = null;
                    }
                    object8 = String.valueOf(object8);
                    ((com.jio.jioads.util.k)object9).j = object8;
                    object8 = ((NativeAdViewRenderer)object3).v;
                    if (object8 != null) {
                        n8 = object8.getHeight();
                        object8 = n8;
                    } else {
                        n8 = 0;
                        object8 = null;
                    }
                    object8 = String.valueOf(object8);
                    ((com.jio.jioads.util.k)object9).k = object8;
                    object9 = ((Utility)object10).replaceMacros((com.jio.jioads.util.k)object9);
                    ((ArrayList)object6).add(object9);
                }
            }
            Object object12 = new StringBuilder();
            j_0.n(((NativeAdViewRenderer)object3).A, (StringBuilder)object12, " : Inside Impression finalImpressionURLArray size : ");
            int n10 = ((ArrayList)object6).size();
            ((StringBuilder)object12).append(n10);
            object3 = ((StringBuilder)object12).toString();
            object12 = "message";
            Intrinsics.checkNotNullParameter(object3, (String)object12);
            object3 = JioAds.Companion;
            ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
            object4 = m2;
            object4 = m2.a;
            if (object4 != null) {
                Intrinsics.checkNotNullParameter(string3, "adId");
                object5 = new StringBuilder();
                object7 = ((com.jio.jioads.instreamads.vastparser.model.n)object4).a;
                ((StringBuilder)object5).append((String)object7);
                ((StringBuilder)object5).append(": Inside storeNativeImpression size of ImpressionUrl size: ");
                n4 = ((ArrayList)object6).size();
                object7 = n4;
                ((StringBuilder)object5).append(object7);
                object5 = ((StringBuilder)object5).toString();
                Intrinsics.checkNotNullParameter(object5, (String)object12);
                ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = ((com.jio.jioads.instreamads.vastparser.model.n)object4).c;
                object12 = (List)((HashMap)object3).get(string3);
                if (object12 != null) {
                    object4 = new ArrayList(object12);
                    ((ArrayList)object4).addAll(object6);
                    object6 = object4;
                }
                ((HashMap)object3).put(string3, object6);
            }
        }
    }

    public static final void b(NativeAdViewRenderer nativeAdViewRenderer) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        nativeAdViewRenderer.c(true);
    }

    public static final void b(NativeAdViewRenderer nativeAdViewRenderer, View object) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        Intrinsics.checkNotNullParameter(object, "view1");
        object = new StringBuilder();
        j_0.i(nativeAdViewRenderer.A, (StringBuilder)object, ": onClick on container");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        nativeAdViewRenderer.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public static final void c(NativeAdViewRenderer nativeAdViewRenderer) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        nativeAdViewRenderer.c(false);
    }

    public static final void c(NativeAdViewRenderer nativeAdViewRenderer, View view) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        nativeAdViewRenderer.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public static final void d(NativeAdViewRenderer nativeAdViewRenderer) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        nativeAdViewRenderer.m();
    }

    public static final void d(NativeAdViewRenderer nativeAdViewRenderer, View object) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        Intrinsics.checkNotNullParameter(object, "v");
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = nativeAdViewRenderer.A.P();
        stringBuilder.append(string2);
        stringBuilder.append(": onClick list of viewgroup1: ");
        stringBuilder.append(object);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        nativeAdViewRenderer.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public static final void e(NativeAdViewRenderer nativeAdViewRenderer) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        Object object = new StringBuilder();
        j_0.n(nativeAdViewRenderer.A, object, ": Showing video ads after load ad ");
        int n3 = nativeAdViewRenderer.T;
        object.append(n3);
        object.append(" seconds");
        Intrinsics.checkNotNullParameter(object.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        nativeAdViewRenderer.Z();
        nativeAdViewRenderer.Y = null;
        nativeAdViewRenderer.X = null;
    }

    public static final void e(NativeAdViewRenderer nativeAdViewRenderer, View view) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        Intrinsics.checkNotNullParameter(view, "v");
        nativeAdViewRenderer.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public static void f(NativeAdViewRenderer object) {
        Object object2 = new StringBuilder();
        j_0.i(((NativeAdViewRenderer)object).A, (StringBuilder)object2, ": ad refresh time end, closing video");
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        ((NativeAdViewRenderer)object).h();
        object3 = ((NativeAdViewRenderer)object).v();
        ((NativeAdViewRenderer)object).F0 = object3;
        object3 = ((NativeAdViewRenderer)object).u();
        ((NativeAdViewRenderer)object).G0 = object3;
        object3 = ((NativeAdViewRenderer)object).g;
        boolean bl2 = false;
        Object object4 = null;
        Object object5 = object3 != null ? ((com.jio.jioads.native.parser.a)object3).A : null;
        ((NativeAdViewRenderer)object).J0 = object5;
        object5 = object3 != null ? ((com.jio.jioads.native.parser.a)object3).d : null;
        ((NativeAdViewRenderer)object).K0 = object5;
        if (object3 != null) {
            object4 = ((com.jio.jioads.native.parser.a)object3).e;
        }
        ((NativeAdViewRenderer)object).L0 = object4;
        object3 = ((NativeAdViewRenderer)object).s;
        object4 = ((NativeAdViewRenderer)object).L;
        ((NativeAdViewRenderer)object).a((ViewGroup)object3, (List)object4);
        object3 = ((NativeAdViewRenderer)object).A;
        int n3 = object3.W();
        int n4 = 2;
        object5 = null;
        if (n3 != n4) {
            object3 = new StringBuilder();
            object4 = ((NativeAdViewRenderer)object).A;
            String string2 = ": Starting load new video";
            com.jio.jioads.common.l.a((com.jio.jioads.common.b)object4, (StringBuilder)object3, string2, (JioAds$Companion)object2);
            object2 = ((NativeAdViewRenderer)object).A.K();
            object3 = JioAdView$AD_TYPE.CONTENT_STREAM;
            if (object2 != object3 && (object2 = ((NativeAdViewRenderer)object).A.K()) != (object3 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) {
                object2 = ((NativeAdViewRenderer)object).A.K();
                if (object2 == (object3 = JioAdView$AD_TYPE.CUSTOM_NATIVE)) {
                    ((NativeAdViewRenderer)object).d(false);
                }
            } else {
                object2 = ((NativeAdViewRenderer)object).A;
                boolean bl3 = true;
                object2.i(bl3);
                ((NativeAdViewRenderer)object).c(false);
            }
            ((NativeAdViewRenderer)object).f0 = false;
        } else {
            boolean bl4;
            object3 = ((NativeAdViewRenderer)object).A;
            int n7 = object3.W();
            if (n7 == n4 && (bl4 = (object3 = ((NativeAdViewRenderer)object).A).l())) {
                object3 = new StringBuilder();
                object4 = ((NativeAdViewRenderer)object).A;
                String string3 = ": Next AdType is HTML";
                com.jio.jioads.common.l.a((com.jio.jioads.common.b)object4, (StringBuilder)object3, string3, (JioAds$Companion)object2);
                ((NativeAdViewRenderer)object).c = false;
                object = ((NativeAdViewRenderer)object).w;
                if (object != null) {
                    object.f();
                }
            } else {
                object3 = new StringBuilder();
                object4 = ((NativeAdViewRenderer)object).A;
                object5 = ": Next AdType is HTML ";
                j_0.n((com.jio.jioads.common.b)object4, (StringBuilder)object3, (String)object5);
                int n8 = ((NativeAdViewRenderer)object).A.W();
                ((StringBuilder)object3).append(n8);
                object = ((StringBuilder)object3).toString();
                object3 = "message";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            }
        }
    }

    public static final void f(NativeAdViewRenderer nativeAdViewRenderer, View object) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        Intrinsics.checkNotNullParameter(object, "v");
        Intrinsics.checkNotNullParameter("click on adlayout", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        nativeAdViewRenderer.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void g(NativeAdViewRenderer object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = new StringBuilder();
        Object object3 = ((NativeAdViewRenderer)object).A;
        Object object4 = ": inside loadViewToContainerCustomNative: post";
        j_0.i((com.jio.jioads.common.b)object3, (StringBuilder)object2, (String)object4);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = ((NativeAdViewRenderer)object).v;
        if (object3 != null && (object3 = ((NativeAdViewRenderer)object).g) != null && (!(bl2 = ((NativeAdViewRenderer)object).isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) || (bl2 = ((NativeAdViewRenderer)object).A0))) {
            object3 = Utility.INSTANCE;
            object4 = ((NativeAdViewRenderer)object).v;
            Intrinsics.checkNotNull(object4);
            int n3 = 5;
            bl2 = ((Utility)object3).checkVisibility((ViewGroup)object4, n3);
            if (bl2) {
                object3 = new StringBuilder();
                object4 = ((NativeAdViewRenderer)object).A;
                String string2 = ": after addView starting refresh handler ";
                com.jio.jioads.common.l.a((com.jio.jioads.common.b)object4, (StringBuilder)object3, string2, (JioAds$Companion)object2);
                object = ((NativeAdViewRenderer)object).w;
                if (object == null) return;
                object.d();
                return;
            }
        }
        if ((object2 = ((NativeAdViewRenderer)object).g) == null) return;
        boolean bl3 = ((NativeAdViewRenderer)object).isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (!bl3) return;
        ((NativeAdViewRenderer)object).z();
    }

    public static final void g(NativeAdViewRenderer nativeAdViewRenderer, View object) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        Intrinsics.checkNotNullParameter(object, "view1");
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = nativeAdViewRenderer.A.P();
        stringBuilder.append(string2);
        stringBuilder.append(": onClick list of viewgroup2= ");
        stringBuilder.append(object);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        nativeAdViewRenderer.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public static final void h(NativeAdViewRenderer nativeAdViewRenderer) {
        block3: {
            Object object = "this$0";
            Intrinsics.checkNotNullParameter(nativeAdViewRenderer, (String)object);
            object = nativeAdViewRenderer.w;
            if (object == null) break block3;
            try {
                object.b();
            }
            catch (Exception exception) {
                object = new StringBuilder("");
                Object object2 = Unit.a;
                ((StringBuilder)object).append(object2);
                Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = JioAdError$JioAdErrorType.ERROR_PARSING;
                object2 = "Render ad onAttachSuccess Failed";
                nativeAdViewRenderer.a((JioAdError$JioAdErrorType)((Object)object), (String)object2);
            }
        }
    }

    public static final void h(NativeAdViewRenderer nativeAdViewRenderer, View object) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        object = new StringBuilder();
        j_0.i(nativeAdViewRenderer.A, (StringBuilder)object, ": onClick on container");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        nativeAdViewRenderer.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public static final void i(NativeAdViewRenderer nativeAdViewRenderer) {
        block3: {
            Object object = "this$0";
            Intrinsics.checkNotNullParameter(nativeAdViewRenderer, (String)object);
            object = nativeAdViewRenderer.w;
            if (object == null) break block3;
            try {
                object.b();
            }
            catch (Exception exception) {
                object = new StringBuilder("");
                Object object2 = Unit.a;
                ((StringBuilder)object).append(object2);
                Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                object2 = "Render ad onAttachSuccess Failed";
                nativeAdViewRenderer.a((JioAdError$JioAdErrorType)((Object)object), (String)object2);
            }
        }
    }

    public static final void i(NativeAdViewRenderer nativeAdViewRenderer, View object) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        object = new StringBuilder();
        j_0.i(nativeAdViewRenderer.A, (StringBuilder)object, ": onClick on container");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        nativeAdViewRenderer.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public static final void j(NativeAdViewRenderer nativeAdViewRenderer) {
        block3: {
            Object object = "this$0";
            Intrinsics.checkNotNullParameter(nativeAdViewRenderer, (String)object);
            object = nativeAdViewRenderer.w;
            if (object == null) break block3;
            try {
                object.b();
            }
            catch (Exception exception) {
                object = new StringBuilder("");
                Object object2 = Unit.a;
                ((StringBuilder)object).append(object2);
                Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                object2 = "Render ad onAttachSuccess Failed";
                nativeAdViewRenderer.a((JioAdError$JioAdErrorType)((Object)object), (String)object2);
            }
        }
    }

    public static final void j(NativeAdViewRenderer nativeAdViewRenderer, View object) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        object = new StringBuilder();
        j_0.i(nativeAdViewRenderer.A, (StringBuilder)object, ": onClick on container");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        nativeAdViewRenderer.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void k(NativeAdViewRenderer object) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        try {
            object = ((NativeAdViewRenderer)object).w;
            if (object == null) return;
            object.b();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void k(NativeAdViewRenderer nativeAdViewRenderer, View object) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "this$0");
        object = new StringBuilder();
        j_0.i(nativeAdViewRenderer.A, (StringBuilder)object, ": onClick on container");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        nativeAdViewRenderer.handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void l(NativeAdViewRenderer object) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        try {
            object = ((NativeAdViewRenderer)object).w;
            if (object == null) return;
            object.b();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static /* synthetic */ void mute$default(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2, int n3, Object object) {
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            bl2 = true;
        }
        nativeAdViewRenderer.mute(bl2);
    }

    public static /* synthetic */ void unMute$default(NativeAdViewRenderer nativeAdViewRenderer, boolean bl2, int n3, Object object) {
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            bl2 = true;
        }
        nativeAdViewRenderer.unMute(bl2);
    }

    public final void A() {
        Object object = Looper.getMainLooper();
        a a2 = new a(this);
        Handler handler = new Handler(object, (Handler.Callback)a2);
        a2 = this.j;
        String string2 = this.A.P();
        object = new com.jio.jioads.native.utils.a((Context)a2, handler, string2);
        this.t0 = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean B() {
        Exception exception2;
        String string2;
        Object object;
        block4: {
            int n3;
            Object object2;
            block3: {
                object = "plr";
                string2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                object2 = ((com.jio.jioads.controller.f)this.h).a;
                boolean bl2 = ((com.jio.jioads.controller.o)object2).u;
                if (!bl2) return 0 != 0;
                object2 = this.A.n0();
                if (object2 != null) {
                    return (boolean)((Boolean)object2).booleanValue();
                }
                try {
                    object2 = this.s();
                    Object object3 = Constants$HeaderKeys.JIO_DATA;
                    String string3 = ((Constants$HeaderKeys)((Object)object3)).getKey();
                    Locale locale = Locale.ROOT;
                    string3 = string3.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(string3, string2);
                    bl2 = ((HashMap)object2).containsKey(string3);
                    if (!bl2) return 0 != 0;
                    object2 = this.s();
                    object3 = ((Constants$HeaderKeys)((Object)object3)).getKey();
                    object3 = ((String)object3).toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object3, string2);
                    string2 = ((HashMap)object2).get(object3);
                    if (string2 != null) break block3;
                    string2 = "{}";
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            if ((n3 = (object2 = new JSONObject(string2)).has(object)) == 0) return 0 != 0;
            int n4 = object2.getInt(object);
            if (n4 != (n3 = 1)) return 0 != 0;
            return 1 != 0;
        }
        string2 = "Exception while getting PLAYER flag ";
        LO1.b(string2, exception2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        return 0 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void C() {
        block59: {
            NativeAdViewRenderer nativeAdViewRenderer = this;
            Object object = this.m;
            int n3 = ((HashMap)object).size();
            if (n3 == 0) break block59;
            object = this.m.keySet();
            Iterator iterator = object.iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                int n4;
                int n7;
                Object object2;
                Object object3;
                int n8;
                int n10;
                int n14;
                Object object4;
                Object object5;
                int n15;
                int n16;
                Object object6;
                Object object7;
                Object object8;
                block60: {
                    Exception exception2;
                    block58: {
                        block57: {
                            boolean bl2;
                            object8 = object = iterator.next();
                            object8 = (String)object;
                            object7 = object = nativeAdViewRenderer.m.get(object8);
                            object7 = (h)object;
                            object = (View)nativeAdViewRenderer.n.get(object8);
                            if (object7 == null || (object6 = nativeAdViewRenderer.R) == null || (n16 = object6.containsKey(object8)) != (n15 = 1)) continue;
                            object6 = nativeAdViewRenderer.R;
                            Intrinsics.checkNotNull(object6);
                            object6 = (com.jio.jioads.utils.i)object6.get(object8);
                            if (object6 != null) {
                                object5 = ((com.jio.jioads.utils.i)object6).b;
                            } else {
                                bl2 = false;
                                object5 = null;
                            }
                            if (object5 == null) continue;
                            object6 = ((com.jio.jioads.utils.i)object6).b;
                            bl2 = object6 instanceof byte[];
                            if (bl2) {
                                object6 = (byte[])object6;
                            } else {
                                n16 = 0;
                                object6 = null;
                            }
                            object5 = "<set-?>";
                            if (object6 != null) {
                                Intrinsics.checkNotNullParameter(object6, (String)object5);
                                ((h)object7).b = (byte[])object6;
                            }
                            if ((object6 = (Object)((h)object7).b) == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("imageByteArray");
                                n16 = 0;
                                object6 = null;
                            }
                            object4 = new StringBuilder();
                            Object object9 = nativeAdViewRenderer.A;
                            String string2 = ": setting bitmap file ";
                            l_0.d(object9, (StringBuilder)object4, string2, (String)object8);
                            object4 = JioAds.Companion;
                            ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object9 = JioAds$LogLevel.NONE;
                            int n17 = ((h)object7).f;
                            n14 = -2;
                            n10 = -1;
                            n8 = 0;
                            if (n17 != 0) {
                                object8 = new StringBuilder();
                                object7 = nativeAdViewRenderer.A;
                                object3 = ": isGif";
                                com.jio.jioads.common.l.a((com.jio.jioads.common.b)object7, (StringBuilder)object8, (String)object3, (JioAds$Companion)object4);
                                object8 = "null cannot be cast to non-null type android.view.ViewGroup";
                                Intrinsics.checkNotNull(object, (String)object8);
                                object = (ViewGroup)object;
                                Intrinsics.checkNotNullParameter(object, (String)object5);
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("gifContainer");
                                    n3 = 0;
                                    object = null;
                                }
                                object8 = nativeAdViewRenderer.j;
                                object7 = object8 != null ? new g((Context)object8) : null;
                                if (object7 != null) {
                                    object2 = ((g)object7).a;
                                } else {
                                    n7 = 0;
                                    object2 = null;
                                }
                                object8 = nativeAdViewRenderer.A.K();
                                object7 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                                if (object8 == object7 && (n4 = Intrinsics.areEqual(object8 = nativeAdViewRenderer.A.y(), object7 = Boolean.TRUE)) == 0 && object != null) {
                                    n4 = 5;
                                    object.setPadding(n4, n4, n4, n4);
                                }
                                if ((n4 = nativeAdViewRenderer.l) == 0) {
                                    object8 = new ViewGroup.LayoutParams(n14, n14);
                                    if (object != null) {
                                        object.removeAllViews();
                                    }
                                    if (object != null) {
                                        object.addView((View)object2, (ViewGroup.LayoutParams)object8);
                                    }
                                } else {
                                    object8 = new ViewGroup.LayoutParams(n10, n14);
                                    if (object != null) {
                                        object.removeAllViews();
                                    }
                                    if (object != null) {
                                        object.addView((View)object2, (ViewGroup.LayoutParams)object8);
                                    }
                                }
                                if (object != null) {
                                    object.setVisibility(0);
                                }
                                if (object2 != null) {
                                    object2.a((byte[])object6);
                                }
                                if (object2 == null) continue;
                                object2.a();
                                continue;
                            }
                            object9 = new StringBuilder();
                            com.jio.jioads.common.b b2 = nativeAdViewRenderer.A;
                            String string3 = ": isImage";
                            com.jio.jioads.common.l.a(b2, (StringBuilder)object9, string3, (JioAds$Companion)object4);
                            object4 = "null cannot be cast to non-null type android.widget.ImageView";
                            Intrinsics.checkNotNull(object, (String)object4);
                            object = (ImageView)object;
                            Intrinsics.checkNotNullParameter(object, (String)object5);
                            ((h)object7).c = object;
                            Intrinsics.checkNotNull(object8);
                            n3 = ((Object)object6).length;
                            try {
                                object5 = new BitmapFactory.Options();
                                ((BitmapFactory.Options)object5).inJustDecodeBounds = n15;
                                BitmapFactory.decodeByteArray((byte[])object6, (int)0, (int)n3, (BitmapFactory.Options)object5);
                                int n18 = ((h)object7).d;
                                if (n18 <= 0 || (n17 = ((h)object7).e) <= 0) break block57;
                                int n19 = ((BitmapFactory.Options)object5).outHeight;
                                int n20 = ((BitmapFactory.Options)object5).outWidth;
                                if (n19 <= n17 && n20 <= n18) {
                                    n7 = 1;
                                } else {
                                    n19 /= 2;
                                    n20 /= 2;
                                    int n21 = 1;
                                    while ((n7 = n19 / n21) >= n17 && (n7 = n20 / n21) >= n18) {
                                        n21 *= 2;
                                    }
                                    n7 = n21;
                                }
                                ((BitmapFactory.Options)object5).inSampleSize = n7;
                            }
                            catch (Exception exception2) {
                                break block58;
                            }
                        }
                        ((BitmapFactory.Options)object5).inJustDecodeBounds = false;
                        object2 = BitmapFactory.decodeByteArray((byte[])object6, (int)0, (int)n3, (BitmapFactory.Options)object5);
                        break block60;
                    }
                    object = Utility.INSTANCE.printStacktrace(exception2);
                    object6 = "message";
                    Intrinsics.checkNotNullParameter(object, (String)object6);
                    object = JioAds.Companion;
                    ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    v12.a("Image returning null", (String)object6, (JioAds$Companion)object);
                    n7 = 0;
                    object2 = null;
                }
                ((h)object7).a().setImageBitmap((Bitmap)object2);
                object = nativeAdViewRenderer.A.K();
                object6 = JioAdView$AD_TYPE.CUSTOM_NATIVE;
                object2 = "iconByteArray";
                object5 = ": Exception occurs in removing mediaLayout inside loadAllMediaInView: ";
                object4 = "mainImageByteArray";
                if (object != object6) {
                    n3 = (int)(Intrinsics.areEqual(object8, object4) ? 1 : 0);
                    if (n3 != 0) {
                        object = new RelativeLayout.LayoutParams(n10, n10);
                        object8 = nativeAdViewRenderer.A.K();
                        if (object8 == (object6 = JioAdView$AD_TYPE.INTERSTITIAL) && ((object8 = nativeAdViewRenderer.A.Y()) == null || (n4 = (int)(j_0.l((Context)object8) ? 1 : 0)) != n15)) {
                            object = new RelativeLayout.LayoutParams(n10, n14);
                        }
                        object8 = object;
                        try {
                            object = nativeAdViewRenderer.G;
                            if (object != null && (n16 = object.getChildCount()) > 0 && (n16 = (int)(this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0)) == 0) {
                                this.h();
                                object.removeAllViews();
                            }
                        }
                        catch (Exception exception) {
                            object6 = new StringBuilder();
                            j_0.n(nativeAdViewRenderer.A, (StringBuilder)object6, (String)object5);
                            object2 = Utility.INSTANCE;
                            com.jio.jioads.jioreel.tracker.model.b.c((Utility)object2, exception, (StringBuilder)object6);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object = JioAds$LogLevel.NONE;
                        }
                        object = nativeAdViewRenderer.A.K();
                        object6 = JioAdView$AD_TYPE.INTERSTITIAL;
                        n7 = 8;
                        if (object != object6) {
                            object = nativeAdViewRenderer.G;
                            if (object != null) {
                                object7 = ((h)object7).a();
                                object.addView((View)object7, (ViewGroup.LayoutParams)object8);
                                object.setVisibility(0);
                            }
                            if ((object = nativeAdViewRenderer.G) == null) continue;
                            n4 = nativeAdViewRenderer.A0 ^ n15;
                            if (n4 == 0) {
                                n8 = 8;
                            }
                            object.setVisibility(n8);
                            continue;
                        }
                        object = nativeAdViewRenderer.U;
                        if (object != null && (n3 = (int)(((com.jio.jioads.videomodule.s)object).c() ? 1 : 0)) == n15 || (object = nativeAdViewRenderer.A.K()) != object6) continue;
                        object = nativeAdViewRenderer.G;
                        if (object != null) {
                            object7 = ((h)object7).a();
                            object.addView((View)object7, (ViewGroup.LayoutParams)object8);
                            object.setVisibility(0);
                        }
                        if ((object = nativeAdViewRenderer.G) == null) continue;
                        n4 = nativeAdViewRenderer.A0 ^ n15;
                        if (n4 == 0) {
                            n8 = 8;
                        }
                        object.setVisibility(n8);
                        continue;
                    }
                    n3 = (int)(Intrinsics.areEqual(object8, object2) ? 1 : 0);
                    if (n3 == 0) continue;
                    object = new ViewGroup.LayoutParams(n10, n10);
                    object8 = nativeAdViewRenderer.A.K();
                    if (object8 == (object6 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) {
                        object8 = nativeAdViewRenderer.t;
                        object6 = Constants$DynamicDisplaySize.SIZE_300x250;
                        object3 = ((Constants$DynamicDisplaySize)((Object)object6)).getDynamicSize();
                        n4 = (int)(Intrinsics.areEqual(object8, object3) ? 1 : 0);
                        if (n4 == 0 && (n4 = (int)(Intrinsics.areEqual(object8 = nativeAdViewRenderer.t, object3 = Constants$DynamicDisplaySize.SIZE_160x600.getDynamicSize()) ? 1 : 0)) == 0 && (n4 = (int)(Intrinsics.areEqual(object8 = nativeAdViewRenderer.t, object3 = Constants$DynamicDisplaySize.SIZE_300x600.getDynamicSize()) ? 1 : 0)) == 0 && (n4 = (int)(Intrinsics.areEqual(object8 = nativeAdViewRenderer.t, object3 = Constants$DynamicDisplaySize.SIZE_970x250.getDynamicSize()) ? 1 : 0)) == 0) {
                            nativeAdViewRenderer.l = false;
                        } else {
                            object8 = nativeAdViewRenderer.t;
                            n4 = (int)(Intrinsics.areEqual(object8, object6 = ((Constants$DynamicDisplaySize)((Object)object6)).getDynamicSize()) ? 1 : 0);
                            if (n4 == 0 && (object8 = nativeAdViewRenderer.H) != null) {
                                n16 = 16;
                                object8.setPadding(n16, n16, n16, n16);
                            }
                        }
                        object8 = nativeAdViewRenderer.H;
                        if (object8 != null) {
                            object8.removeAllViews();
                        }
                        if ((object8 = nativeAdViewRenderer.H) != null) {
                            object7 = ((h)object7).a();
                            object8.addView((View)object7, (ViewGroup.LayoutParams)object);
                        }
                        if ((object = nativeAdViewRenderer.H) == null) continue;
                        object.setVisibility(0);
                        continue;
                    }
                    object8 = nativeAdViewRenderer.H;
                    if (object8 != null) {
                        object8.removeAllViews();
                    }
                    if ((object8 = nativeAdViewRenderer.H) != null) {
                        object7 = ((h)object7).a();
                        object8.addView((View)object7, (ViewGroup.LayoutParams)object);
                    }
                    if ((object = nativeAdViewRenderer.H) == null) continue;
                    object.setVisibility(0);
                    continue;
                }
                object = nativeAdViewRenderer.A.K();
                if (object != object6) continue;
                n3 = ((String)object8).hashCode();
                if (n3 != (n16 = -2005652177)) {
                    n16 = -1568714521;
                    if (n3 != n16) {
                        n16 = 1337024952;
                        if (n3 != n16 || (n3 = (int)(((String)object8).equals(object2) ? 1 : 0)) == 0) continue;
                        object = new ViewGroup.LayoutParams(n10, n10);
                        object8 = nativeAdViewRenderer.q0;
                        if (object8 != null) {
                            object8.removeAllViews();
                        }
                        if ((object8 = nativeAdViewRenderer.q0) != null) {
                            object7 = ((h)object7).a();
                            object8.addView((View)object7, (ViewGroup.LayoutParams)object);
                        }
                        if ((object = nativeAdViewRenderer.q0) == null) continue;
                        object.setVisibility(0);
                        continue;
                    }
                    object = "customImageByteArray";
                    n3 = (int)(((String)object8).equals(object) ? 1 : 0);
                    if (n3 == 0) continue;
                    try {
                        object = nativeAdViewRenderer.p0;
                        if (object != null && (n4 = object.getChildCount()) > 0 && (n4 = (int)(this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0)) == 0) {
                            this.h();
                            object.removeAllViews();
                        }
                    }
                    catch (Exception exception) {
                        object8 = new StringBuilder();
                        object6 = nativeAdViewRenderer.A;
                        object3 = ": Exception occurs in removing customImageContainer inside loadAllMediaInView: ";
                        j_0.n((com.jio.jioads.common.b)object6, (StringBuilder)object8, (String)object3);
                        object6 = Utility.INSTANCE;
                        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object6, exception, (StringBuilder)object8);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                    }
                    if ((object = nativeAdViewRenderer.p0) != null) {
                        object8 = ((h)object7).a();
                        object7 = new ViewGroup.LayoutParams(n10, n10);
                        object.addView((View)object8, (ViewGroup.LayoutParams)object7);
                    }
                    if ((object = nativeAdViewRenderer.p0) == null) continue;
                    object.setVisibility(0);
                    continue;
                }
                n3 = (int)(((String)object8).equals(object4) ? 1 : 0);
                if (n3 == 0) continue;
                object8 = new RelativeLayout.LayoutParams(n10, n10);
                try {
                    object = nativeAdViewRenderer.G;
                    if (object != null && (n16 = object.getChildCount()) > 0 && (n16 = (int)(this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0)) == 0) {
                        this.h();
                        object.removeAllViews();
                    }
                }
                catch (Exception exception) {
                    object6 = new StringBuilder();
                    j_0.n(nativeAdViewRenderer.A, (StringBuilder)object6, (String)object5);
                    object3 = Utility.INSTANCE;
                    com.jio.jioads.jioreel.tracker.model.b.c((Utility)object3, exception, (StringBuilder)object6);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
                if ((object = nativeAdViewRenderer.G) == null) continue;
                object7 = ((h)object7).a();
                object.addView((View)object7, (ViewGroup.LayoutParams)object8);
                object.setVisibility(0);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void D() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 107->110)] java.lang.Exception
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void E() {
        boolean bl2;
        Object object = new StringBuilder();
        j_0.i(this.A, (StringBuilder)object, " loadViewToContainerCustomNative called");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        JioAdView$AD_TYPE jioAdView$AD_TYPE = this.A.K();
        JioAdView$AD_TYPE jioAdView$AD_TYPE2 = JioAdView$AD_TYPE.CUSTOM_NATIVE;
        if (jioAdView$AD_TYPE != jioAdView$AD_TYPE2) {
            StringBuilder stringBuilder = new StringBuilder();
            com.jio.jioads.common.b b2 = this.A;
            String string2 = ":  wrong adType";
            com.jio.jioads.common.l.a(b2, stringBuilder, string2, (JioAds$Companion)object);
            return;
        }
        ViewGroup viewGroup = this.s;
        if (viewGroup == null) {
            StringBuilder stringBuilder = new StringBuilder();
            com.jio.jioads.common.b b3 = this.A;
            String string3 = ": Native Passed ad container is not valid";
            com.jio.jioads.common.l.a(b3, stringBuilder, string3, (JioAds$Companion)object);
            object = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
            String string4 = "Passed Native ad container is not valid else";
            this.a((JioAdError$JioAdErrorType)((Object)object), string4);
            return;
        }
        object = null;
        viewGroup.setVisibility(0);
        ViewGroup viewGroup2 = this.v;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        try {
            ViewGroup viewGroup3;
            ViewGroup viewGroup4 = this.v;
            if (viewGroup4 != null) {
                viewGroup4.removeAllViews();
            }
            if ((viewGroup3 = this.v) != null) {
                ViewGroup viewGroup5 = this.s;
                viewGroup3.addView((View)viewGroup5);
            }
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            String string5 = this.A.P();
            stringBuilder.append(string5);
            stringBuilder.append(": Exception while set adview loadViewToContainerCustomNative: ");
            Unit unit = Unit.a;
            stringBuilder.append(unit);
            String string6 = stringBuilder.toString();
            String string7 = "message";
            Intrinsics.checkNotNullParameter(string6, string7);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            JioAds$LogLevel jioAds$LogLevel2 = JioAds$LogLevel.NONE;
        }
        if (!(bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease())) {
            this.a(false);
            object = new StringBuilder();
            com.jio.jioads.common.b b4 = this.A;
            String string8 = ": inside calling from loadViewToContainerCustomNative";
            j_0.i(b4, (StringBuilder)object, string8);
            object = JioAds.Companion.getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            this.w();
        }
        if ((object = this.v) == null) return;
        int n3 = 1;
        Ly1 ly1 = new Ly1(this, n3);
        object.post((Runnable)ly1);
    }

    public final String F() {
        Object object;
        Boolean bl2 = Boolean.FALSE;
        Object object2 = this.g;
        Object object3 = null;
        object2 = object2 != null ? ((com.jio.jioads.native.parser.a)object2).p : null;
        boolean bl3 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (!bl3 && !(bl3 = this.A0)) {
            bl3 = false;
            object = null;
        } else {
            bl3 = true;
        }
        object = bl3;
        List list = this.A;
        list = list != null ? list.a() : null;
        Object object4 = this.g;
        String string2 = object4 != null ? ((com.jio.jioads.native.parser.a)object4).o : null;
        String string3 = object4 != null ? ((com.jio.jioads.native.parser.a)object4).b : null;
        String string4 = object4 != null ? ((com.jio.jioads.native.parser.a)object4).l : null;
        if (object4 != null) {
            object3 = ((com.jio.jioads.native.parser.a)object4).f;
        }
        String string5 = object3;
        String string6 = this.A.m0();
        object3 = object;
        object = list;
        list = string2;
        object4 = string3;
        string2 = string4;
        string3 = string5;
        string4 = string6;
        return com.jio.jioads.native.utils.b.a(bl2, (String)object2, (Boolean)object3, (List)object, (String)((Object)list), (String)object4, string2, string5, string6);
    }

    public final void G() {
        com.jio.jioads.carousel.data.b b2;
        Object object = new StringBuilder();
        Object object2 = this.A;
        Object object3 = ": inside prepareCarouselAd()";
        j_0.i(object2, object, (String)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = Boolean.FALSE;
        this.C0 = object;
        t t3 = new t(this);
        ViewGroup viewGroup = this.z0;
        if (viewGroup != null && (object = this.g) != null && (b2 = ((com.jio.jioads.native.parser.a)object).V) != null) {
            object3 = this.A;
            com.jio.jioads.common.c c2 = this.h;
            Intrinsics.checkNotNull(viewGroup);
            int n3 = this.B0;
            boolean bl2 = this.E0;
            object2 = object;
            object = new com.jio.jioads.carousel.view.i((com.jio.jioads.common.b)object3, c2, viewGroup, b2, n3, t3, bl2);
            this.D0 = object;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final void H() {
        block38: {
            block37: {
                block44: {
                    block43: {
                        block41: {
                            block42: {
                                block40: {
                                    block39: {
                                        var1_1 = this;
                                        var2_2 = 1;
                                        var3_3 = 1.4E-45f;
                                        var4_4 = new StringBuilder();
                                        var5_5 = this.A;
                                        var6_6 = ": NativeAd: prepareDynamicDisplayAd() called ";
                                        com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var5_5, (StringBuilder)var4_4, (String)var6_6);
                                        var7_7 = 0;
                                        var8_8 = 0.0f;
                                        var4_4 = null;
                                        var5_5 = this.A;
                                        var9_9 = var5_5.l();
                                        if (var9_9 != 0) break block39;
                                        var6_6 = this.j;
                                        var5_5 = new RelativeLayout((Context)var6_6);
                                        this.s = var5_5;
                                        break block39;
                                        catch (Exception var10_10) {
                                            var11_16 = null;
                                            break block37;
                                        }
                                    }
                                    var5_5 = var1_1.A;
                                    var9_9 = var5_5.W();
                                    var12_22 = 0;
                                    var6_6 = null;
                                    if (var9_9 == var2_2) break block40;
                                    var5_5 = var1_1.g;
                                    if (var5_5 != null) {
                                        var13_23 = var5_5.G;
                                    } else {
                                        var14_24 = 0;
                                        var13_23 = null;
                                    }
                                    if (var13_23 == null) break block40;
                                    if (var5_5 != null) {
                                        var5_5 = var5_5.G;
                                    } else {
                                        var9_9 = 0;
                                        var5_5 = null;
                                        var15_25 = 0.0f;
                                    }
                                    var13_23 = "UNIFIED_AD";
                                    var9_9 = (int)kotlin.text.b.i((String)var5_5, (String)var13_23, false);
                                    if (var9_9 == 0) break block40;
                                    var5_5 = var1_1.s;
                                    var1_1.a((ViewGroup)var5_5, null);
                                    var5_5 = var1_1.s;
                                    if (var5_5 != null) {
                                        var6_6 = new ge1_1(var1_1, var2_2);
                                        var16_26 = 1000L;
                                        var5_5.postDelayed((Runnable)var6_6, var16_26);
                                    }
                                    while (true) {
                                        var11_17 = null;
                                        ** GOTO lbl335
                                        break;
                                    }
                                }
                                var9_9 = var1_1.o;
                                var14_24 = 6;
                                var18_27 = -1;
                                var19_28 = "";
                                var20_29 = " : For vast Ad response Display Size not valid";
                                var21_30 = "x";
                                var22_31 = 300;
                                var23_32 = 250;
                                if (var9_9 != var18_27) ** GOTO lbl258
                                var5_5 = new StringBuilder();
                                var24_33 = var1_1.A;
                                var24_33 = var24_33.P();
                                var5_5.append((String)var24_33);
                                var24_33 = ": set native dynamic display";
                                var5_5.append((String)var24_33);
                                var5_5 = var5_5.toString();
                                com.jio.jioads.util.j.a((String)var5_5);
                                var5_5 = var1_1.A;
                                var9_9 = var5_5.W();
                                var24_33 = ",height: ";
                                var25_34 = ". Display ad width: ";
                                if (var9_9 != var2_2) ** GOTO lbl143
                                var5_5 = var1_1.A;
                                if ((var9_9 = (int)Intrinsics.areEqual(var5_5 = var5_5.y(), var11_17 = Boolean.TRUE)) != 0) ** continue;
                                var5_5 = this.R();
                                var11_17 = var1_1.d((String)var5_5);
                                var26_35 = var1_1.c((String)var5_5);
                                var27_38 = new StringBuilder();
                                var4_4 = var1_1.A;
                                var4_4 = var4_4.P();
                                var27_38.append((String)var4_4);
                                var4_4 = " : For VAST Ad type :layoutName: ";
                                var27_38.append((String)var4_4);
                                var27_38.append((String)var5_5);
                                var27_38.append(var25_34);
                                var27_38.append((String)var11_17);
                                var27_38.append((String)var24_33);
                                var27_38.append(var26_35);
                                var4_4 = var27_38.toString();
                                com.jio.jioads.util.j.a((String)var4_4);
                                var4_4 = this.F();
                                var5_5 = new String[]{var21_30};
                                var4_4 = StringsKt.a0((CharSequence)var4_4, (String[])var5_5, false, 0, var14_24);
                                var5_5 = var4_4.get(0);
                                var5_5 = (String)var5_5;
                                var15_25 = Float.parseFloat((String)var5_5);
                                var6_6 = Utility.INSTANCE;
                                var9_9 = var6_6.convertDpToPixel(var15_25);
                                var10_11 /* !! */  = var4_4.get(var2_2);
                                var10_11 /* !! */  = (String)var10_11 /* !! */ ;
                                var3_3 = Float.parseFloat((String)var10_11 /* !! */ );
                                var2_2 = var6_6.convertDpToPixel(var3_3);
                                var4_4 = this.q();
                                var7_7 = var4_4.length();
                                if (var7_7 > 0 && (var7_7 = Integer.parseInt((String)(var4_4 = this.q()))) < var23_32 && (var7_7 = (var4_4 = this.r()).length()) > 0 && (var7_7 = Integer.parseInt((String)(var4_4 = this.r()))) < var22_31) break block41;
                                break block42;
                                catch (Exception var10_12) {
                                    var11_18 = null;
                                    break block37;
                                }
                            }
                            if (var9_9 < var22_31 || var2_2 < var23_32) break block41;
                            while (true) {
                                var11_17 = null;
                                ** GOTO lbl335
                                break;
                            }
                        }
                        var10_11 /* !! */  = new StringBuilder();
                        var4_4 = var1_1.A;
                        var4_4 = var4_4.P();
                        var10_11 /* !! */ .append((String)var4_4);
                        var10_11 /* !! */ .append(var20_29);
                        var10_11 /* !! */  = var10_11 /* !! */ .toString();
                        com.jio.jioads.util.j.b((String)var10_11 /* !! */ );
                        var10_11 /* !! */  = JioAdError$JioAdErrorType.ERROR_INSUFFICIENT_ELEMENTS;
                        var1_1.a((JioAdError$JioAdErrorType)var10_11 /* !! */ , (String)var19_28);
                        return;
lbl143:
                        // 1 sources

                        var4_4 = var1_1.A;
                        var7_7 = var4_4.l();
                        if (var7_7 != 0 && (var4_4 = var1_1.s) != null) {
                            var4_4 = var1_1.w;
                            if (var4_4 != null) {
                                var4_4 = var4_4.n();
                            } else {
                                var7_7 = 0;
                                var8_8 = 0.0f;
                                var4_4 = null;
                            }
                            if ((var7_7 = Intrinsics.areEqual(var4_4, var5_5 = "JSON")) != 0) ** continue;
                        }
                        if ((var4_4 = var1_1.s) == null) {
                            var5_5 = var1_1.j;
                            var4_4 = new RelativeLayout((Context)var5_5);
                            var1_1.s = var4_4;
                        }
                        if ((var9_9 = (var4_4 = this.R()).length()) == 0) {
                            var5_5 = var1_1.A;
                            if ((var5_5 = var5_5.m0()) != null && (var9_9 = var5_5.length()) != 0) {
                                var10_13 = "Wrong Ad size received for dynamic display";
                                var4_4 = JioAdError$JioAdErrorType.ERROR_WRONG_AD_SIZE;
                                var1_1.a((JioAdError$JioAdErrorType)var4_4, var10_13);
                                return;
                            }
                        }
                        if ((var9_9 = (int)Intrinsics.areEqual(var4_4, var5_5 = "jio_content_stream")) != 0) {
                            var1_1.E0 = var2_2;
                        }
                        if ((var5_5 = var1_1.j) != null && (var5_5 = var5_5.getResources()) != null) {
                            var19_28 = "layout";
                            var20_29 = var1_1.j;
                            if (var20_29 != null) {
                                var20_29 = var20_29.getPackageName();
                            } else {
                                var28_41 = 0.0f;
                                var20_29 = null;
                            }
                            var9_9 = var5_5.getIdentifier((String)var4_4, (String)var19_28, var20_29);
                            var5_5 = var9_9;
                        } else {
                            var9_9 = 0;
                            var15_25 = 0.0f;
                            var5_5 = null;
                        }
                        if (var5_5 == null || (var29_42 = var5_5.intValue()) == 0) ** GOTO lbl194
                        var19_28 = var1_1.j;
                        var19_28 = LayoutInflater.from((Context)var19_28);
                        var9_9 = var5_5.intValue();
                        var11_19 = null;
                        var5_5 = var19_28.inflate(var9_9, null);
                        var19_28 = "null cannot be cast to non-null type android.widget.RelativeLayout";
                        Intrinsics.checkNotNull(var5_5, (String)var19_28);
                        var5_5 = (RelativeLayout)var5_5;
                        break block43;
                        catch (Exception var10_14) {
                            break block37;
                        }
lbl194:
                        // 1 sources

                        var11_20 = null;
                        var5_5 = new StringBuilder();
                        var19_28 = var1_1.A;
                        var19_28 = var19_28.P();
                        var5_5.append((String)var19_28);
                        var19_28 = ": layoutResourceId is not set for dynamic display ad";
                        var5_5.append((String)var19_28);
                        var5_5 = var5_5.toString();
                        com.jio.jioads.util.j.a((String)var5_5);
                        var19_28 = var1_1.j;
                        var5_5 = new RelativeLayout((Context)var19_28);
                    }
                    var1_1.s = var5_5;
                    var5_5 = var1_1.t;
                    if (var5_5 != null && (var5_5 = StringsKt.a0((CharSequence)var5_5, var19_28 = new String[]{var21_30}, false, 0, var14_24)) != null) {
                        var13_23 = new String[]{};
                        var5_5 = var5_5.toArray((T[])var13_23);
                        var5_5 = (String[])var5_5;
                    } else {
                        var9_9 = 0;
                        var5_5 = null;
                        var15_25 = 0.0f;
                    }
                    if (var5_5 == null) ** GOTO lbl-1000
                    var14_24 = ((Object)var5_5).length;
                    var29_42 = 2;
                    var30_43 = 2.8E-45f;
                    if (var14_24 >= var29_42) {
                        var6_6 = var5_5[0];
                        var10_11 /* !! */  = var5_5[var2_2];
                        var13_23 = Utility.INSTANCE;
                        var30_43 = Float.parseFloat((String)var6_6);
                        var29_42 = var13_23.convertDpToPixel(var30_43);
                        var28_41 = Float.parseFloat((String)var10_11 /* !! */ );
                        var14_24 = var13_23.convertDpToPixel(var28_41);
                        var5_5 = new ViewGroup.LayoutParams(var29_42, var14_24);
                        var13_23 = var1_1.s;
                        if (var13_23 != null) {
                            var13_23.setLayoutParams((ViewGroup.LayoutParams)var5_5);
                        }
                        var5_5 = new StringBuilder();
                        var13_23 = var1_1.A;
                        var13_23 = var13_23.P();
                        var5_5.append((String)var13_23);
                        var13_23 = ":layoutName: ";
                        var5_5.append((String)var13_23);
                        var5_5.append((String)var4_4);
                        var5_5.append(var25_34);
                        var5_5.append((String)var6_6);
                        var5_5.append((String)var24_33);
                        var5_5.append((String)var10_11 /* !! */ );
                        var10_11 /* !! */  = var5_5.toString();
                        com.jio.jioads.util.j.a((String)var10_11 /* !! */ );
                    } else lbl-1000:
                    // 2 sources

                    {
                        var10_11 /* !! */  = "Error in prepareDynamicDisplayAd displayAdSizeArray is null ";
                        com.jio.jioads.util.j.b((String)var10_11 /* !! */ );
                    }
                    break block44;
lbl258:
                    // 1 sources

                    var11_21 = null;
                    var4_4 = this.q();
                    var7_7 = var4_4.length();
                    if (var7_7 > 0 && (var7_7 = (var4_4 = this.r()).length()) > 0) {
                        var4_4 = new StringBuilder();
                        var5_5 = this.r();
                        var4_4.append((String)var5_5);
                        var9_9 = 120;
                        var15_25 = 1.68E-43f;
                        var4_4.append((char)var9_9);
                        var5_5 = this.q();
                        var4_4.append((String)var5_5);
                        var4_4 = var4_4.toString();
                    } else {
                        var26_36 = Boolean.FALSE;
                        var4_4 = var1_1.g;
                        var27_39 = var4_4 != null ? (var4_4 = var4_4.p) : null;
                        var7_7 = (int)this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (var7_7 == 0 && (var7_7 = (int)var1_1.A0) == 0) {
                            var7_7 = 0;
                            var8_8 = 0.0f;
                            var4_4 = null;
                        } else {
                            var7_7 = 1;
                            var8_8 = 1.4E-45f;
                        }
                        var31_44 = (boolean)var7_7;
                        var4_4 = var1_1.A;
                        var32_46 = var4_4.a();
                        var4_4 = var1_1.g;
                        var33_48 = var4_4 != null ? (var5_5 = var4_4.o) : null;
                        var34_50 = var4_4 != null ? (var5_5 = var4_4.b) : null;
                        var35_52 = var4_4 != null ? (var5_5 = var4_4.l) : null;
                        var36_54 = var4_4 != null ? (var4_4 = var4_4.f) : null;
                        var37_56 = var4_4 = var1_1.t;
                        var4_4 = com.jio.jioads.native.utils.b.a(var26_36, (String)var27_39, var31_44, var32_46, (String)var33_48, (String)var34_50, (String)var35_52, (String)var36_54, (String)var4_4);
                    }
                    var1_1.t = var4_4;
                    var4_4 = this.F();
                    var5_5 = new String[]{var21_30};
                    var4_4 = StringsKt.a0((CharSequence)var4_4, (String[])var5_5, false, 0, var14_24);
                    var5_5 = var4_4.get(0);
                    var5_5 = (String)var5_5;
                    var15_25 = Float.parseFloat((String)var5_5);
                    var6_6 = Utility.INSTANCE;
                    var9_9 = var6_6.convertDpToPixel(var15_25);
                    var4_4 = var4_4.get(var2_2);
                    var4_4 = (String)var4_4;
                    var8_8 = Float.parseFloat((String)var4_4);
                    var7_7 = var6_6.convertDpToPixel(var8_8);
                    var6_6 = var1_1.A;
                    var12_22 = var6_6.W();
                    if (var12_22 == var2_2 && ((var2_2 = (var10_11 /* !! */  = this.q()).length()) > 0 && (var2_2 = Integer.parseInt((String)(var10_11 /* !! */  = this.q()))) < var23_32 || (var2_2 = (var10_11 /* !! */  = this.r()).length()) > 0 && (var2_2 = Integer.parseInt((String)(var10_11 /* !! */  = this.r()))) < var22_31 || var9_9 < var22_31 || var7_7 < var23_32)) {
                        var10_11 /* !! */  = new StringBuilder();
                        var4_4 = var1_1.A;
                        var4_4 = var4_4.P();
                        var10_11 /* !! */ .append((String)var4_4);
                        var10_11 /* !! */ .append(var20_29);
                        var10_11 /* !! */  = var10_11 /* !! */ .toString();
                        com.jio.jioads.util.j.b((String)var10_11 /* !! */ );
                        var10_11 /* !! */  = JioAdError$JioAdErrorType.ERROR_INSUFFICIENT_ELEMENTS;
                        var1_1.a((JioAdError$JioAdErrorType)var10_11 /* !! */ , (String)var19_28);
                        return;
                    }
                    var10_11 /* !! */  = new StringBuilder();
                    var4_4 = var1_1.A;
                    var4_4 = var4_4.P();
                    var10_11 /* !! */ .append((String)var4_4);
                    var4_4 = ": set native dynamic display custom container here";
                    var10_11 /* !! */ .append((String)var4_4);
                    var10_11 /* !! */  = var10_11 /* !! */ .toString();
                    com.jio.jioads.util.j.a((String)var10_11 /* !! */ );
                    this.T();
                }
                var10_11 /* !! */  = var1_1.A;
                var2_2 = var10_11 /* !! */ .W();
                if (var2_2 == 0) {
                    var10_11 /* !! */  = var1_1.s;
                    if (var10_11 /* !! */  != null) {
                        var4_4 = "JioCarouselAd";
                        var10_11 /* !! */  = var10_11 /* !! */ .findViewWithTag(var4_4);
                        var10_11 /* !! */  = (ViewGroup)var10_11 /* !! */ ;
                    } else {
                        var2_2 = 0;
                        var10_11 /* !! */  = null;
                        var3_3 = 0.0f;
                    }
                    var1_1.z0 = var10_11 /* !! */ ;
                }
                this.d();
                break block38;
            }
            var4_4 = new StringBuilder("Error in prepareDynamicDisplayAd: ");
            var26_37 = Utility.INSTANCE;
            com.jio.jioads.jioreel.tracker.model.b.c(var26_37, (Exception)var10_15, (StringBuilder)var4_4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var4_4 = JioAds$LogLevel.NONE;
            var4_4 = new StringBuilder("NativeAdView showDynamicDisplayAd catch:: ");
            var5_5 = var10_15.getMessage();
            var4_4.append((String)var5_5);
            var4_4 = var4_4.toString();
            var5_5 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
            var1_1.a((JioAdError$JioAdErrorType)var5_5, (String)var4_4);
            var4_4 = var1_1.A.k0();
            var6_6 = JioAdView$AdState.DESTROYED;
            var27_40 = var4_4 != var6_6 ? (var4_4 = var1_1.A.Y()) : null;
            var31_45 = var1_1.A.P();
            var32_47 = com.jio.jioads.cdnlogging.d.a;
            var33_49 = var5_5.getErrorTitle();
            var6_6 = "exception:";
            var4_4 = new StringBuilder((String)var6_6);
            var34_51 = com.jio.jioads.instream.audio.a.a((Exception)var10_15, (StringBuilder)var4_4);
            var35_53 = ((com.jio.jioads.controller.f)var1_1.h).a.T();
            var38_58 = var1_1.A.q0();
            var39_59 = var5_5.getErrorCode();
            var10_15 = ((com.jio.jioads.controller.f)var1_1.h).a;
            var2_2 = (int)var10_15.a();
            var37_57 = (boolean)var2_2;
            var36_55 = "prepareDynamicDisplayAd";
            var26_37.logError((Context)var27_40, var31_45, var32_47, var33_49, var34_51, var35_53, var36_55, var37_57, var38_58, var39_59, false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void I() {
        Exception exception2;
        String string2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        int n3;
        NativeAdViewRenderer nativeAdViewRenderer;
        block26: {
            Object object6;
            block21: {
                block20: {
                    block25: {
                        block24: {
                            block23: {
                                int n4;
                                block22: {
                                    nativeAdViewRenderer = this;
                                    n3 = 1;
                                    object5 = new StringBuilder();
                                    object4 = this.A;
                                    object3 = "message";
                                    object2 = ": called prepareInterstitialNativeAd()";
                                    j_0.i(object4, (StringBuilder)object5, (String)object2);
                                    object5 = JioAds.Companion;
                                    ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object4 = JioAds$LogLevel.NONE;
                                    object4 = null;
                                    try {
                                        int n7;
                                        object2 = this.A;
                                        int n8 = object2.l();
                                        if (n8 == 0) {
                                            object = this.j;
                                            object2 = new RelativeLayout((Context)object);
                                            this.s = object2;
                                        }
                                        if ((object2 = nativeAdViewRenderer.g) != null) {
                                            object = ((com.jio.jioads.native.parser.a)object2).G;
                                        } else {
                                            n7 = 0;
                                            object = null;
                                        }
                                        string2 = null;
                                        if (object != null) {
                                            if (object2 != null) {
                                                object2 = ((com.jio.jioads.native.parser.a)object2).G;
                                            } else {
                                                n8 = 0;
                                                object2 = null;
                                            }
                                            object = "UNIFIED_AD";
                                            n8 = (int)(kotlin.text.b.i((String)object2, (String)object, false) ? 1 : 0);
                                            if (n8 != 0) {
                                                boolean bl2 = nativeAdViewRenderer.k;
                                                if (bl2) {
                                                    object5 = nativeAdViewRenderer.s;
                                                    nativeAdViewRenderer.a((ViewGroup)object5, null);
                                                }
                                                if ((object5 = nativeAdViewRenderer.s) == null) return;
                                                object3 = new mm_1(nativeAdViewRenderer, n3);
                                                long l2 = 1000L;
                                                object5.postDelayed((Runnable)object3, l2);
                                                return;
                                            }
                                        }
                                        object2 = nativeAdViewRenderer.A;
                                        if ((object2 = object2.C()) != null) {
                                            n7 = 6;
                                            object = n7;
                                            object2 = fh1_2.g(object, (Map)object2);
                                            object2 = (Integer[])object2;
                                            object = object2[0];
                                            nativeAdViewRenderer.p = n7 = ((Integer)object).intValue();
                                            object2 = object2[n3];
                                            nativeAdViewRenderer.q = n8 = ((Integer)object2).intValue();
                                        }
                                        if ((n8 = nativeAdViewRenderer.p) != (n7 = -1)) break block20;
                                        object5 = nativeAdViewRenderer.s;
                                        if (object5 == null) {
                                            object3 = nativeAdViewRenderer.j;
                                            object5 = new RelativeLayout((Context)object3);
                                            nativeAdViewRenderer.s = object5;
                                        }
                                        object5 = this.t();
                                        nativeAdViewRenderer.s = object5;
                                        object5 = nativeAdViewRenderer.A;
                                        if ((object5 = object5.H()) == null) break block21;
                                        object5 = nativeAdViewRenderer.A;
                                        object6 = (object5 = object5.H()) == (object3 = JioAdView$ORIENTATION_TYPE.PORTRAIT) ? nativeAdViewRenderer.b(false) : nativeAdViewRenderer.b(n3 != 0);
                                    }
                                    catch (Exception exception2) {}
                                    try {
                                        n4 = ((String)object6).hashCode();
                                        int n10 = -2097166016;
                                        if (n4 != n10) {
                                            n10 = -1629653373;
                                            if (n4 != n10) {
                                                n10 = 1339834785;
                                                if (n4 != n10) {
                                                    n10 = 1801166501;
                                                    if (n4 != n10 || (n4 = (int)(((String)object6).equals(object5 = "jio_native_interstitial") ? 1 : 0)) == 0) break block22;
                                                    n4 = R$layout.jio_native_interstitial;
                                                    object5 = n4;
                                                    break block23;
                                                }
                                                object5 = "jio_native_interstitial_landscape";
                                                n4 = (int)(((String)object6).equals(object5) ? 1 : 0);
                                                if (n4 == 0) break block22;
                                                n4 = R$layout.jio_native_interstitial_landscape;
                                                object5 = n4;
                                                break block23;
                                            }
                                            object5 = "jio_native_interstitial_landscape_stb";
                                            n4 = (int)(((String)object6).equals(object5) ? 1 : 0);
                                            if (n4 == 0) break block22;
                                            n4 = R$layout.jio_native_interstitial_landscape_stb;
                                            object5 = n4;
                                            break block23;
                                        }
                                        object5 = "jio_native_interstitial_tablet";
                                        n4 = (int)(((String)object6).equals(object5) ? 1 : 0);
                                        if (n4 == 0) break block22;
                                        n4 = R$layout.jio_native_interstitial_tablet;
                                        object5 = n4;
                                        break block23;
                                    }
                                    catch (Exception exception3) {}
                                }
                                n4 = 0;
                                object5 = null;
                            }
                            object3 = nativeAdViewRenderer.j;
                            object3 = LayoutInflater.from((Context)object3);
                            if (object5 == null) break block24;
                            n3 = (Integer)object5;
                            break block25;
                            break block26;
                        }
                        object5 = nativeAdViewRenderer.j;
                        Intrinsics.checkNotNull(object5);
                        object5 = object5.getResources();
                        object2 = "layout";
                        object = nativeAdViewRenderer.j;
                        Intrinsics.checkNotNull(object);
                        object = object.getPackageName();
                        n3 = object5.getIdentifier((String)object6, (String)object2, (String)object);
                    }
                    object6 = object3.inflate(n3, null);
                    object5 = "null cannot be cast to non-null type android.widget.RelativeLayout";
                    Intrinsics.checkNotNull(object6, (String)object5);
                    object6 = (RelativeLayout)object6;
                    nativeAdViewRenderer.s = object6;
                    break block21;
                }
                object6 = new StringBuilder();
                object2 = nativeAdViewRenderer.A;
                object2 = object2.P();
                ((StringBuilder)object6).append((String)object2);
                object2 = ": using custom container for native Interstitial";
                ((StringBuilder)object6).append((String)object2);
                object6 = ((StringBuilder)object6).toString();
                Intrinsics.checkNotNullParameter(object6, (String)object3);
                object6 = ((JioAds$Companion)object5).getInstance();
                ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.T();
            }
            if ((object6 = nativeAdViewRenderer.s) == null) return;
            this.d();
            return;
        }
        object5 = new StringBuilder("NativeAdView showDynamicDisplayAd catch ");
        object3 = exception2.getMessage();
        ((StringBuilder)object5).append((String)object3);
        object5 = ((StringBuilder)object5).toString();
        object3 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        nativeAdViewRenderer.a((JioAdError$JioAdErrorType)((Object)object3), (String)object5);
        object5 = nativeAdViewRenderer.A.k0();
        object2 = JioAdView$AdState.DESTROYED;
        if (object5 != object2) {
            object5 = nativeAdViewRenderer.A;
            object4 = object5.Y();
        }
        object = object4;
        object2 = Utility.INSTANCE;
        string2 = nativeAdViewRenderer.A.P();
        com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
        String string3 = ((JioAdError$JioAdErrorType)((Object)object3)).getErrorTitle();
        object4 = "exception:";
        object5 = new StringBuilder((String)object4);
        String string4 = com.jio.jioads.instream.audio.a.a(exception2, (StringBuilder)object5);
        com.jio.jioads.cdnlogging.a a2 = ((com.jio.jioads.controller.f)nativeAdViewRenderer.h).a.T();
        String string5 = nativeAdViewRenderer.A.q0();
        String string6 = ((JioAdError$JioAdErrorType)((Object)object3)).getErrorCode();
        com.jio.jioads.controller.o o3 = ((com.jio.jioads.controller.f)nativeAdViewRenderer.h).a;
        n3 = o3.a();
        Boolean bl3 = n3 != 0;
        String string7 = "prepareInterstitialNativeAd";
        ((Utility)object2).logError((Context)object, string2, d2, string3, string4, a2, string7, bl3, string5, string6, false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void J() {
        block14: {
            block13: {
                block15: {
                    var1_1 = this;
                    var2_2 = "  : ";
                    var3_3 /* !! */  = "NativeAdView Passed custom layout is not valid catch ";
                    var4_4 /* !! */  = new StringBuilder();
                    var5_8 /* !! */  = this.A;
                    var6_9 = "message";
                    var7_10 = ": NativeAd: prepareNativeContentStream() called ";
                    j_0.i(var5_8 /* !! */ , (StringBuilder)var4_4 /* !! */ , (String)var7_10);
                    var4_4 /* !! */  = JioAds.Companion;
                    var4_4 /* !! */ .getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var5_8 /* !! */  = JioAds$LogLevel.NONE;
                    var5_8 /* !! */  = null;
                    var7_10 = this.A;
                    var8_11 = var7_10.l();
                    if (var8_11 == 0) {
                        var9_12 = this.j;
                        var7_10 = new RelativeLayout((Context)var9_12);
                        this.s = var7_10;
                    }
                    var7_10 = new StringBuilder();
                    var9_12 = var1_1.A;
                    var9_12 = var9_12.P();
                    var7_10.append((String)var9_12);
                    var9_12 = ": Inside setNativeContentStream";
                    var7_10.append((String)var9_12);
                    var7_10 = var7_10.toString();
                    Intrinsics.checkNotNullParameter(var7_10, (String)var6_9);
                    var7_10 = var4_4 /* !! */ .getInstance();
                    var7_10.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var7_10 = var1_1.g;
                    if (var7_10 != null) {
                        var9_12 = var7_10.G;
                    } else {
                        var10_13 = 0;
                        var9_12 = null;
                    }
                    if (var9_12 != null) {
                        if (var7_10 != null) {
                            var7_10 = var7_10.G;
                        } else {
                            var8_11 = 0;
                            var7_10 = null;
                        }
                        var9_12 = "UNIFIED_AD";
                        var8_11 = kotlin.text.b.i((String)var7_10, (String)var9_12, false);
                        if (var8_11 != 0) {
                            var4_4 /* !! */  = var1_1.s;
                            var1_1.a((ViewGroup)var4_4 /* !! */ , null);
                            var6_9 = Looper.getMainLooper();
                            var4_4 /* !! */  = new Handler((Looper)var6_9);
                            var8_11 = 1;
                            var6_9 = new XX1(var1_1, var8_11);
                            var11_14 = 1000L;
                            var4_4 /* !! */ .postDelayed((Runnable)var6_9, var11_14);
                            return;
                        }
                    }
                    if ((var7_10 = var1_1.j) != null && (var8_11 = (var7_10 = var1_1.A).l()) == 0) break block15;
                    var7_10 = var1_1.h;
                    var7_10 = (com.jio.jioads.controller.f)var7_10;
                    var7_10 = var7_10.a;
                    var8_11 = (int)var7_10.C;
                    if ((var8_11 == 0 || (var7_10 = var1_1.s) != null) && (var7_10 = var1_1.s) != null) ** GOTO lbl127
                }
                if ((var8_11 = var1_1.o) != (var10_13 = -1)) ** GOTO lbl113
                var4_4 /* !! */  = var1_1.s;
                if (var4_4 /* !! */  != null) break block13;
                var7_10 = var1_1.j;
                var4_4 /* !! */  = new RelativeLayout((Context)var7_10);
                var1_1.s = var4_4 /* !! */ ;
                {
                    catch (Exception var4_5) {
                        break block14;
                    }
                }
            }
            try {
                var13_15 = R$layout.jio_content_stream;
                var7_10 = var1_1.j;
                var7_10 = LayoutInflater.from((Context)var7_10);
                var4_4 /* !! */  = var7_10.inflate(var13_15, null);
                var7_10 = "null cannot be cast to non-null type android.widget.RelativeLayout";
                Intrinsics.checkNotNull(var4_4 /* !! */ , (String)var7_10);
                var4_4 /* !! */  = (RelativeLayout)var4_4 /* !! */ ;
                var1_1.s = var4_4 /* !! */ ;
            }
            catch (Exception var4_6) {
                var7_10 = new StringBuilder(var3_3 /* !! */ );
                var9_12 = var4_6.getMessage();
                var7_10.append((String)var9_12);
                var7_10 = var7_10.toString();
                var9_12 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
                var1_1.a((JioAdError$JioAdErrorType)var9_12, (String)var7_10);
                var7_10 = new StringBuilder();
                var9_12 = var1_1.A;
                var9_12 = var9_12.P();
                var7_10.append((String)var9_12);
                var7_10.append((String)var2_2);
                var9_12 = Utility.INSTANCE;
                var4_4 /* !! */  = var9_12.printStacktrace(var4_6);
                var7_10.append((String)var4_4 /* !! */ );
                var4_4 /* !! */  = var7_10.toString();
                Intrinsics.checkNotNullParameter(var4_4 /* !! */ , (String)var6_9);
                var4_4 /* !! */  = JioAds.Companion;
                var4_4 /* !! */  = var4_4 /* !! */ .getInstance();
                var4_4 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var4_4 /* !! */  = JioAds$LogLevel.NONE;
lbl113:
                // 1 sources

                var7_10 = new StringBuilder();
                var9_12 = var1_1.A;
                var9_12 = var9_12.P();
                var7_10.append((String)var9_12);
                var9_12 = ": using custom container for content stream";
                var7_10.append((String)var9_12);
                var7_10 = var7_10.toString();
                Intrinsics.checkNotNullParameter(var7_10, (String)var6_9);
                var4_4 /* !! */  = var4_4 /* !! */ .getInstance();
                var4_4 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.T();
lbl127:
                // 4 sources

                if ((var4_4 /* !! */  = var1_1.s) == null) return;
                this.d();
                return;
            }
        }
        var6_9 = new StringBuilder(var3_3 /* !! */ );
        var3_3 /* !! */  = var4_5.getMessage();
        var6_9.append(var3_3 /* !! */ );
        var3_3 /* !! */  = var6_9.toString();
        var6_9 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
        var1_1.a((JioAdError$JioAdErrorType)var6_9, var3_3 /* !! */ );
        var3_3 /* !! */  = new StringBuilder();
        var7_10 = var1_1.A;
        j_0.n((com.jio.jioads.common.b)var7_10, (StringBuilder)var3_3 /* !! */ , (String)var2_2);
        var9_12 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)var9_12, var4_5, (StringBuilder)var3_3 /* !! */ );
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var2_2 = JioAds$LogLevel.NONE;
        var2_2 = var1_1.A.k0();
        var3_3 /* !! */  = JioAdView$AdState.DESTROYED;
        if (var2_2 != var3_3 /* !! */ ) {
            var2_2 = var1_1.A;
            var5_8 /* !! */  = var2_2.Y();
        }
        var14_17 = var1_1.A.P();
        var15_18 = com.jio.jioads.cdnlogging.d.a;
        var16_19 = var6_9.getErrorTitle();
        var3_3 /* !! */  = "exception:";
        var2_2 = new StringBuilder(var3_3 /* !! */ );
        var17_20 = com.jio.jioads.instream.audio.a.a(var4_5, (StringBuilder)var2_2);
        var18_21 = ((com.jio.jioads.controller.f)var1_1.h).a.T();
        var19_22 = var1_1.A.q0();
        var20_23 = var6_9.getErrorCode();
        var4_7 = ((com.jio.jioads.controller.f)var1_1.h).a;
        var13_16 = var4_7.a();
        var21_24 = var13_16;
        var22_25 = "prepareNativeContentStream";
        var9_12.logError((Context)var5_8 /* !! */ , var14_17, var15_18, var16_19, var17_20, var18_21, var22_25, var21_24, var19_22, var20_23, false);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void K() {
        block29: {
            boolean bl2;
            block25: {
                void var2_20;
                void var1_7;
                block28: {
                    block27: {
                        block26: {
                            StringBuilder stringBuilder = new StringBuilder();
                            com.jio.jioads.common.b b2 = this.A;
                            String string2 = ": NativeAd: prepareNativeCustomAd() called ";
                            j_0.i(b2, stringBuilder, string2);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                            try {
                                bl2 = this.A0;
                                if (bl2) break block25;
                            }
                            catch (Exception exception) {
                                return;
                            }
                            ViewGroup viewGroup = this.s;
                            Object var2_16 = null;
                            if (viewGroup == null) break block26;
                            String string3 = "NativeCustomImageLayout";
                            View view = viewGroup.findViewWithTag((Object)string3);
                            ViewGroup viewGroup2 = (ViewGroup)view;
                            break block27;
                        }
                        bl2 = false;
                        Object var1_6 = null;
                    }
                    ViewGroup viewGroup = this.s;
                    if (viewGroup == null) break block28;
                    String string4 = "NativeMediaLayout";
                    View view = viewGroup.findViewWithTag((Object)string4);
                    ViewGroup viewGroup3 = (ViewGroup)view;
                }
                com.jio.jioads.common.b b3 = this.A;
                JioAdView$AD_TYPE jioAdView$AD_TYPE = b3.K();
                JioAdView$AD_TYPE jioAdView$AD_TYPE2 = JioAdView$AD_TYPE.CUSTOM_NATIVE;
                if (jioAdView$AD_TYPE != jioAdView$AD_TYPE2 || var1_7 == null || var2_20 != null) break block25;
                bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (bl2) break block25;
                com.jio.jioads.common.b b4 = this.A;
                bl2 = b4.X();
                if (bl2) break block25;
                com.jio.jioads.common.b b5 = this.A;
                int[] nArray = b5.b();
                if (nArray != null) break block25;
                String string5 = "Custom image size not passed";
                JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_WRONG_AD_SIZE;
                this.a(jioAdError$JioAdErrorType, string5);
                return;
            }
            bl2 = false;
            Object var1_13 = null;
            this.K = false;
            ArrayList arrayList = new ArrayList();
            this.L = arrayList;
            ViewGroup viewGroup = this.s;
            if (viewGroup == null) break block29;
            viewGroup.setVisibility(0);
        }
        HashMap hashMap = new HashMap();
        this.m = hashMap;
        this.y();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void L() {
        Exception exception3;
        String string2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        NativeAdViewRenderer nativeAdViewRenderer;
        block19: {
            Object object6;
            block13: {
                block14: {
                    Exception exception22;
                    block18: {
                        int n3;
                        int n4;
                        block17: {
                            block16: {
                                block15: {
                                    nativeAdViewRenderer = this;
                                    object5 = "something went to wrong while loading native infeed ad ";
                                    object6 = new StringBuilder();
                                    object4 = this.A;
                                    object3 = "message";
                                    object2 = ": Inside PrepareNativeInfeedAd";
                                    j_0.i(object4, (StringBuilder)object6, (String)object2);
                                    object6 = JioAds.Companion;
                                    ((JioAds$Companion)object6).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object4 = JioAds$LogLevel.NONE;
                                    object4 = null;
                                    try {
                                        int n7;
                                        object2 = this.A;
                                        n4 = object2.l();
                                        if (n4 == 0) {
                                            object = this.j;
                                            object2 = new RelativeLayout((Context)object);
                                            this.s = object2;
                                            object2.removeAllViews();
                                        }
                                        object2 = nativeAdViewRenderer.A;
                                        if ((object2 = object2.K()) != null) {
                                            object2 = nativeAdViewRenderer.g;
                                            if (object2 != null) {
                                                object2 = ((com.jio.jioads.native.parser.a)object2).G;
                                            } else {
                                                n4 = 0;
                                                object2 = null;
                                            }
                                            object = "UNIFIED_AD";
                                            string2 = null;
                                            n4 = (int)(kotlin.text.b.i((String)object2, (String)object, false) ? 1 : 0);
                                            if (n4 != 0) {
                                                object6 = nativeAdViewRenderer.s;
                                                nativeAdViewRenderer.a((ViewGroup)object6, null);
                                                object3 = Looper.getMainLooper();
                                                object6 = new Handler((Looper)object3);
                                                n4 = 2;
                                                object3 = new i4_0(nativeAdViewRenderer, n4);
                                                long l2 = 1000L;
                                                object6.postDelayed((Runnable)object3, l2);
                                                break block13;
                                            }
                                        }
                                        if ((object2 = nativeAdViewRenderer.j) == null) break block13;
                                        object2 = nativeAdViewRenderer.A;
                                        n4 = object2.l();
                                        if (n4 != 0) {
                                            object2 = nativeAdViewRenderer.h;
                                            object2 = (com.jio.jioads.controller.f)object2;
                                            object2 = ((com.jio.jioads.controller.f)object2).a;
                                            n4 = (int)(((com.jio.jioads.controller.o)object2).C ? 1 : 0);
                                            if (n4 == 0 && (object2 = nativeAdViewRenderer.s) != null) break block13;
                                        }
                                        if ((n4 = nativeAdViewRenderer.o) != (n7 = -1)) break block14;
                                        object6 = nativeAdViewRenderer.s;
                                        if (object6 != null) break block15;
                                        object3 = nativeAdViewRenderer.j;
                                        object6 = new RelativeLayout((Context)object3);
                                        nativeAdViewRenderer.s = object6;
                                    }
                                    catch (Exception exception3) {
                                        break block19;
                                    }
                                }
                                try {
                                    object6 = Utility.INSTANCE;
                                    object3 = nativeAdViewRenderer.j;
                                    Intrinsics.checkNotNull(object3);
                                    n3 = ((Utility)object6).isDeviceTypeTablet((Context)object3);
                                    if (n3 != 0) break block16;
                                    object3 = nativeAdViewRenderer.j;
                                    Intrinsics.checkNotNull(object3);
                                    n3 = ((Utility)object6).getCurrentUIModeType((Context)object3);
                                    n4 = 4;
                                    if (n3 == n4) break block16;
                                    n3 = R$layout.jio_in_feed;
                                    break block17;
                                }
                                catch (Exception exception22) {
                                    break block18;
                                }
                            }
                            n3 = R$layout.jio_in_feed_728x90;
                        }
                        object2 = nativeAdViewRenderer.j;
                        Intrinsics.checkNotNull(object2);
                        n4 = (int)(((Utility)object6).isDeviceTypeTablet((Context)object2) ? 1 : 0);
                        if (n4 == 0) {
                            object2 = nativeAdViewRenderer.j;
                            Intrinsics.checkNotNull(object2);
                            ((Utility)object6).getCurrentUIModeType((Context)object2);
                        }
                        object6 = nativeAdViewRenderer.j;
                        object6 = LayoutInflater.from((Context)object6);
                        object6 = object6.inflate(n3, null);
                        object3 = "null cannot be cast to non-null type android.widget.RelativeLayout";
                        Intrinsics.checkNotNull(object6, (String)object3);
                        object6 = (RelativeLayout)object6;
                        nativeAdViewRenderer.s = object6;
                        break block13;
                    }
                    object3 = new StringBuilder((String)object5);
                    object6 = exception22.getMessage();
                    ((StringBuilder)object3).append((String)object6);
                    object6 = ((StringBuilder)object3).toString();
                    object3 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                    nativeAdViewRenderer.a((JioAdError$JioAdErrorType)((Object)object3), (String)object6);
                    break block13;
                }
                object2 = new StringBuilder();
                object = nativeAdViewRenderer.A;
                object = object.P();
                ((StringBuilder)object2).append((String)object);
                object = ": using custom container for In-Feed ad";
                ((StringBuilder)object2).append((String)object);
                object2 = ((StringBuilder)object2).toString();
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object6 = ((JioAds$Companion)object6).getInstance();
                ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.T();
            }
            object6 = nativeAdViewRenderer.s;
            if (object6 == null) return;
            this.d();
            return;
        }
        object3 = new StringBuilder((String)object5);
        object5 = exception3.getMessage();
        ((StringBuilder)object3).append((String)object5);
        object5 = ((StringBuilder)object3).toString();
        object3 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        nativeAdViewRenderer.a((JioAdError$JioAdErrorType)((Object)object3), (String)object5);
        object5 = nativeAdViewRenderer.A.k0();
        object2 = JioAdView$AdState.DESTROYED;
        if (object5 != object2) {
            object5 = nativeAdViewRenderer.A;
            object4 = object5.Y();
        }
        object = object4;
        object2 = Utility.INSTANCE;
        string2 = nativeAdViewRenderer.A.P();
        com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
        String string3 = ((JioAdError$JioAdErrorType)((Object)object3)).getErrorTitle();
        object4 = "exception:";
        object5 = new StringBuilder((String)object4);
        String string4 = com.jio.jioads.instream.audio.a.a(exception3, (StringBuilder)object5);
        com.jio.jioads.cdnlogging.a a2 = ((com.jio.jioads.controller.f)nativeAdViewRenderer.h).a.T();
        String string5 = nativeAdViewRenderer.A.q0();
        String string6 = ((JioAdError$JioAdErrorType)((Object)object3)).getErrorCode();
        com.jio.jioads.controller.o o3 = ((com.jio.jioads.controller.f)nativeAdViewRenderer.h).a;
        boolean bl2 = o3.a();
        Boolean bl3 = bl2;
        String string7 = "prepareNativeInfeedAd";
        ((Utility)object2).logError((Context)object, string2, d2, string3, string4, a2, string7, bl3, string5, string6, false);
    }

    public final void M() {
        Object object;
        Object object2;
        Object object3 = new StringBuilder();
        Object object4 = this.A.P();
        ((StringBuilder)object3).append((String)object4);
        ((StringBuilder)object3).append(": inside  prepredNativeVideoAd");
        com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
        object3 = new Ref$IntRef();
        object4 = this.A;
        int n3 = object4.i();
        int n4 = 1;
        int n7 = -1;
        if (n3 != n7) {
            object4 = new StringBuilder();
            object2 = this.A;
            object = ": Native video Ad  setting getCustomInstreamLayoutId() ";
            com.jio.jioads.jioreel.tracker.model.b.a(object2, (StringBuilder)object4, object);
            object4 = this.A;
            n3 = object4.i();
        } else {
            n3 = this.o;
            if (n3 == n7 && (object4 = this.A.K()) == (object2 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) && (n3 = (object4 = this.A).W()) == n4) {
                object4 = new StringBuilder();
                object2 = this.A;
                object = ": Native video Ad  setting jio_vast_dynamic_display ";
                com.jio.jioads.jioreel.tracker.model.b.a(object2, (StringBuilder)object4, object);
                n3 = R$layout.jio_vast_dynamic_display;
            } else {
                object4 = this.A.K();
                if (object4 == (object2 = JioAdView$AD_TYPE.INTERSTITIAL) && ((object4 = this.A.Y()) == null || (n3 = (int)(j_0.l((Context)object4) ? 1 : 0)) != n4)) {
                    object4 = new StringBuilder();
                    object2 = this.A;
                    object = ": Native video Interstitial Ad  setting jio_native_interstial_video ";
                    com.jio.jioads.jioreel.tracker.model.b.a(object2, (StringBuilder)object4, object);
                    n3 = R$layout.jio_native_interstial_video;
                } else {
                    object4 = this.A.K();
                    if (object4 == object2 && (object4 = this.A.Y()) != null && (n3 = (int)(j_0.l((Context)object4) ? 1 : 0)) == n4) {
                        object4 = new StringBuilder();
                        object2 = this.A;
                        object = ": Native video Interstitial Ad  setting jio_native_interstial_stb layout for stb ";
                        com.jio.jioads.jioreel.tracker.model.b.a(object2, (StringBuilder)object4, object);
                        n3 = R$layout.jio_native_interstial_stb;
                    } else {
                        object4 = new StringBuilder();
                        object2 = this.A;
                        object = ": Native video Ad  setting jio_native_video ";
                        com.jio.jioads.jioreel.tracker.model.b.a(object2, (StringBuilder)object4, object);
                        n3 = R$layout.jio_native_video;
                    }
                }
            }
        }
        ((Ref$IntRef)object3).element = n3;
        object4 = this.G;
        n7 = 0;
        object2 = null;
        if (object4 == null) {
            object4 = this.s;
            if (object4 != null) {
                object = "NativeMediaLayout";
                object4 = (ViewGroup)object4.findViewWithTag(object);
            } else {
                n3 = 0;
                object4 = null;
            }
            this.G = object4;
        }
        this.h0 = n4;
        this.A();
        HashMap hashMap = this.s();
        com.jio.jioads.common.b b2 = this.A;
        com.jio.jioads.common.c c2 = this.h;
        w w4 = new w(this, (Ref$IntRef)object3);
        com.jio.jioads.controller.a a2 = this.u;
        object = object4;
        object4 = new com.jio.jioads.instreamads.vastparser.n(hashMap, b2, c2, w4, a2);
        this.W = object4;
        ((com.jio.jioads.instreamads.vastparser.n)object4).l = object3 = new x(this);
        object3 = this.A;
        int n8 = object3.W();
        if (n8 == n4 && ((object3 = this.A.K()) == (object4 = JioAdView$AD_TYPE.INSTREAM_VIDEO) || (object3 = this.A.K()) == (object4 = JioAdView$AD_TYPE.INTERSTITIAL) || (object3 = this.A.K()) == (object4 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) || (object3 = this.A.K()) == (object4 = JioAdView$AD_TYPE.INSTREAM_AUDIO))) {
            object3 = this.W;
            if (object3 != null) {
                object4 = this.f;
                ((com.jio.jioads.instreamads.vastparser.n)object3).u((String)object4);
            }
        } else {
            object3 = this.W;
            if (object3 != null) {
                object4 = this.g;
                if (object4 != null) {
                    object2 = ((com.jio.jioads.native.parser.a)object4).H;
                }
                ((com.jio.jioads.instreamads.vastparser.n)object3).u((String)object2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void N() {
        block10: {
            block9: {
                var1_1 = this.p0;
                if (var1_1 == null) break block9;
                var1_1 = this.g;
                var2_2 = 0;
                var3_4 = null;
                if (var1_1 != null) {
                    var1_1 = var1_1.D;
                } else {
                    var4_6 = 0;
                    var1_1 = null;
                }
                if (var1_1 == null || (var5_7 = this.p()) == null || (var4_6 = TextUtils.isEmpty((CharSequence)var5_7)) != 0) break block10;
                var1_1 = new StringBuilder();
                l_0.d(this.A, (StringBuilder)var1_1, ": Custom Image URL: ", var5_7);
                var1_1 = JioAds.Companion;
                var1_1.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var6_8 = JioAds$LogLevel.NONE;
                var6_8 = new URL(var5_7);
                var6_8 = var6_8.getPath();
                var7_10 = 0;
                var8_11 = null;
                var9_12 = 1;
                if (var6_8 != null) {
                    var10_13 = 6;
                    var2_2 = StringsKt.Q((CharSequence)var6_8, '/', 0, var10_13);
                    var11_14 = '\\';
                    var10_13 = StringsKt.Q((CharSequence)var6_8, var11_14, 0, var10_13);
                    var2_2 = Math.max(var2_2, var10_13) + var9_12;
                    var3_4 = var6_8.substring(var2_2);
                    var6_8 = "this as java.lang.String).substring(startIndex)";
                    Intrinsics.checkNotNullExpressionValue(var3_4, (String)var6_8);
                }
                var6_8 = new StringBuilder();
                var12_15 = this.A;
                var13_16 = ": Custom Image File Name: ";
                l_0.d((com.jio.jioads.common.b)var12_15, (StringBuilder)var6_8, var13_16, var3_4);
                var6_8 = var1_1.getInstance();
                var6_8.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var14_17 = TextUtils.isEmpty(var3_4);
                if (var14_17 || var3_4 == null) ** GOTO lbl-1000
                var6_8 = Locale.getDefault();
                var12_15 = "getDefault(...)";
                Intrinsics.checkNotNullExpressionValue(var6_8, (String)var12_15);
                var3_4 = var3_4.toLowerCase((Locale)var6_8);
                var6_8 = "this as java.lang.String).toLowerCase(locale)";
                Intrinsics.checkNotNullExpressionValue(var3_4, (String)var6_8);
                if (var3_4 != null && (var2_2 = (int)StringsKt.F((CharSequence)var3_4, (CharSequence)(var6_8 = ".gif"), false)) == var9_12) {
                    var3_4 = new StringBuilder();
                    var6_8 = this.A;
                    var8_11 = ": Adding Custom Image URL into ImageDetailMap in GIF Format";
                    com.jio.jioads.common.l.a((com.jio.jioads.common.b)var6_8, (StringBuilder)var3_4, var8_11, (JioAds$Companion)var1_1);
                    var13_16 = this.p0;
                    if (var13_16 != null) {
                        var7_10 = this.M;
                        var10_13 = this.N;
                        Intrinsics.checkNotNull(var13_16);
                        var15_18 = "customImageByteArray";
                        var16_20 = true;
                        var6_8 = this;
                        this.a(var7_10, var10_13, (View)var13_16, var15_18, var5_7, var16_20);
                    }
                } else lbl-1000:
                // 2 sources

                {
                    var3_4 = this.j;
                    var13_16 = new ImageView((Context)var3_4);
                    var13_16.setAdjustViewBounds((boolean)var9_12);
                    var3_4 = ImageView.ScaleType.FIT_XY;
                    var13_16.setScaleType((ImageView.ScaleType)var3_4);
                    var3_4 = new StringBuilder();
                    var6_8 = this.A;
                    var8_11 = ": Adding Custom Image URL into ImageDetailMap in IMAGE Format";
                    com.jio.jioads.common.l.a((com.jio.jioads.common.b)var6_8, (StringBuilder)var3_4, var8_11, (JioAds$Companion)var1_1);
                    var7_10 = this.M;
                    var10_13 = this.N;
                    var15_19 = "customImageByteArray";
                    var16_21 = false;
                    var6_8 = this;
                    this.a(var7_10, var10_13, (View)var13_16, var15_19, var5_7, false);
                }
                if ((var3_4 = this.p0) != null) {
                    var4_6 = var3_4.isClickable();
                    if (var4_6 == var9_12) {
                        this.K = var9_12;
                        var1_1 = this.p0;
                        Intrinsics.checkNotNull(var1_1);
                        var3_4 = this.L;
                        var3_4.add(var1_1);
                    }
                } else {
                    var3_4 = new StringBuilder();
                    var6_8 = this.A;
                    var8_11 = ": Custom Page Container getting null so ad not clickable";
                    com.jio.jioads.common.l.a((com.jio.jioads.common.b)var6_8, (StringBuilder)var3_4, var8_11, (JioAds$Companion)var1_1);
                }
                break block10;
            }
            var1_1 = new StringBuilder();
            var3_5 = this.A;
            var6_9 = ": CustomImageContainer Value getting: ";
            j_0.n((com.jio.jioads.common.b)var3_5, (StringBuilder)var1_1, var6_9);
            var3_5 = this.p0;
            var1_1.append(var3_5);
            var2_3 = ' ';
            var1_1.append(var2_3);
            var1_1 = var1_1.toString();
            var3_5 = "message";
            Intrinsics.checkNotNullParameter(var1_1, (String)var3_5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var1_1 = JioAds$LogLevel.NONE;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void O() {
        int n3;
        String string2;
        int n4;
        JSONArray jSONArray;
        int n7;
        block14: {
            Exception exception2;
            block13: {
                Object object;
                Object object2;
                Object object3;
                n7 = 1;
                try {
                    object3 = this.g;
                    object2 = null;
                    jSONArray = object3 != null ? ((com.jio.jioads.native.parser.a)object3).z : null;
                }
                catch (Exception exception2) {
                    break block13;
                }
                n4 = this.z;
                string2 = "message";
                if (n4 == 0) {
                    if (object3 != null) {
                        object2 = ((com.jio.jioads.native.parser.a)object3).d;
                    }
                    if (object2 != null) {
                        object3 = new StringBuilder();
                        object = this.A;
                        object = object.P();
                        ((StringBuilder)object3).append((String)object);
                        object = ": Inside processImpressionNotification call addFCAPCount from native ad";
                        ((StringBuilder)object3).append((String)object);
                        object3 = ((StringBuilder)object3).toString();
                        Intrinsics.checkNotNullParameter(object3, string2);
                        object3 = JioAds.Companion;
                        object3 = ((JioAds$Companion)object3).getInstance();
                        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioAds$LogLevel.NONE;
                        object3 = this.w;
                        if (object3 != null) {
                            object = "i";
                            object3.b((String)object2, (String)object);
                        }
                    } else {
                        object3 = new StringBuilder();
                        object2 = this.A;
                        object2 = object2.P();
                        ((StringBuilder)object3).append((String)object2);
                        object2 = ": Campaign ID is null, cannot call addFCAPCount";
                        ((StringBuilder)object3).append((String)object2);
                        object3 = ((StringBuilder)object3).toString();
                        Intrinsics.checkNotNullParameter(object3, string2);
                        object3 = JioAds.Companion;
                        object3 = ((JioAds$Companion)object3).getInstance();
                        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioAds$LogLevel.NONE;
                    }
                }
                object3 = new StringBuilder();
                object2 = this.A;
                object2 = object2.P();
                ((StringBuilder)object3).append((String)object2);
                object2 = ": check for impression URL ";
                ((StringBuilder)object3).append((String)object2);
                object3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object3, string2);
                object3 = JioAds.Companion;
                object3 = ((JioAds$Companion)object3).getInstance();
                ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                if (jSONArray == null || (n3 = jSONArray.length()) <= 0) return;
                n3 = jSONArray.length();
                object2 = null;
                object = null;
                int n8 = 0;
                break block14;
            }
            Utility utility = Utility.INSTANCE;
            utility.printStacktrace(exception2);
            return;
        }
        for (n4 = 0; n4 < n3; n4 += n7) {
            boolean bl2;
            int n10;
            Object object = jSONArray.getString(n4);
            Object object4 = com.jio.jioads.util.i.a;
            if (object != null && (n10 = StringsKt.F((CharSequence)object, (CharSequence)(object4 = "[frt]"), false)) == n7) {
                n10 = 1;
            } else {
                n10 = 0;
                object4 = null;
            }
            Object object5 = this.j;
            if (object5 != null && (bl2 = com.jio.jioads.util.i.l((com.jio.jioads.common.c)(object5 = this.h))) && n10) {
                com.jio.jioads.util.i.g = n8 += n7;
            }
            if ((object4 = this.F) != null && !(n10 = ((HashMap)object4).containsKey(object))) {
                object4 = this.F;
                if (object4 != null) {
                    object5 = Boolean.TRUE;
                    object4 = ((HashMap)object4).put(object, object5);
                    object4 = (Boolean)object4;
                }
                Intrinsics.checkNotNull(object);
                object4 = JioEventTracker$TrackingEvents.EVENT_IMPRESSION;
                this.a((String)object, (JioEventTracker$TrackingEvents)((Object)object4));
                this.z = n7;
                continue;
            }
            object = new StringBuilder();
            object4 = this.A;
            object4 = object4.P();
            ((StringBuilder)object).append((String)object4);
            object4 = ": impression URL already registered";
            ((StringBuilder)object).append((String)object4);
            object = ((StringBuilder)object).toString();
            Intrinsics.checkNotNullParameter(object, string2);
            object = JioAds.Companion;
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final void P() {
        block27: {
            block23: {
                block22: {
                    block21: {
                        block26: {
                            block25: {
                                block24: {
                                    var1_1 = this.s;
                                    var2_3 = 0;
                                    var3_4 = null;
                                    if (var1_1 != null) {
                                        var4_5 = "NativeMediaLayout";
                                        var1_1 = var1_1.findViewWithTag(var4_5);
                                    } else {
                                        var5_6 = 0;
                                        var1_1 = null;
                                    }
                                    if (var1_1 != null) {
                                        var6_7 = var1_1 instanceof RelativeLayout;
                                        if (var6_7) {
                                            var4_5 = var1_1;
                                            var4_5 = var1_1;
                                            this.G = var4_5;
                                        } else {
                                            var4_5 = new StringBuilder();
                                            var7_8 = this.A;
                                            var8_9 = ": jio_native_media_layout must be tagged on a RelativeLayout";
                                            j_0.i((com.jio.jioads.common.b)var7_8, (StringBuilder)var4_5, var8_9);
                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                            var4_5 = JioAds$LogLevel.NONE;
                                        }
                                    }
                                    if (var1_1 == null) break block23;
                                    var1_1 = this.g;
                                    if (var1_1 != null) {
                                        var1_1 = var1_1.p;
                                        var9_10 /* !! */  = var1_1;
                                    } else {
                                        var9_10 /* !! */  = null;
                                    }
                                    var5_6 = TextUtils.isEmpty(var9_10 /* !! */ );
                                    var10_11 = false;
                                    var11_12 = 1;
                                    if (var5_6 != 0) break block24;
                                    var1_1 = new StringBuilder();
                                    var4_5 = this.A;
                                    var7_8 = ": Main Image URL: ";
                                    l_0.d((com.jio.jioads.common.b)var4_5, (StringBuilder)var1_1, (String)var7_8, (String)var9_10 /* !! */ );
                                    var1_1 = JioAds.Companion;
                                    var1_1.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    var4_5 = JioAds$LogLevel.NONE;
                                    var4_5 = new URL((String)var9_10 /* !! */ );
                                    var4_5 = var4_5.getPath();
                                    if (var4_5 != null) {
                                        var12_13 = 6;
                                        var2_3 = StringsKt.Q((CharSequence)var4_5, '/', 0, var12_13);
                                        var13_14 = 92;
                                        var12_13 = StringsKt.Q((CharSequence)var4_5, (char)var13_14, 0, var12_13);
                                        var2_3 = Math.max(var2_3, var12_13) + var11_12;
                                        var3_4 = var4_5.substring(var2_3);
                                        var4_5 = "this as java.lang.String).substring(startIndex)";
                                        Intrinsics.checkNotNullExpressionValue(var3_4, (String)var4_5);
                                    }
                                    var4_5 = new StringBuilder();
                                    var7_8 = this.A;
                                    var8_9 = ": Main Image File Name: ";
                                    l_0.d((com.jio.jioads.common.b)var7_8, (StringBuilder)var4_5, var8_9, (String)var3_4);
                                    var4_5 = var1_1.getInstance();
                                    var4_5.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    var6_7 = TextUtils.isEmpty((CharSequence)var3_4);
                                    if (var6_7 || var3_4 == null) ** GOTO lbl-1000
                                    var4_5 = Locale.getDefault();
                                    var7_8 = "getDefault(...)";
                                    Intrinsics.checkNotNullExpressionValue(var4_5, (String)var7_8);
                                    var3_4 = var3_4.toLowerCase((Locale)var4_5);
                                    var4_5 = "this as java.lang.String).toLowerCase(locale)";
                                    Intrinsics.checkNotNullExpressionValue(var3_4, (String)var4_5);
                                    if (var3_4 != null && (var2_3 = (int)StringsKt.F((CharSequence)var3_4, (CharSequence)(var4_5 = ".gif"), false)) == var11_12) {
                                        var3_4 = new StringBuilder();
                                        var4_5 = this.A;
                                        var7_8 = ": Adding Main Image Into ImageDetailMap in GIF Format";
                                        com.jio.jioads.common.l.a((com.jio.jioads.common.b)var4_5, (StringBuilder)var3_4, (String)var7_8, (JioAds$Companion)var1_1);
                                        var1_1 = this.G;
                                        if (var1_1 != null) {
                                            Intrinsics.checkNotNull(var1_1);
                                            var12_13 = var1_1.getMeasuredWidth();
                                            var1_1 = this.G;
                                            Intrinsics.checkNotNull(var1_1);
                                            var13_14 = var1_1.getMeasuredHeight();
                                            var14_15 = this.G;
                                            Intrinsics.checkNotNull(var14_15);
                                            var15_17 = "mainImageByteArray";
                                            var16_19 = true;
                                            var4_5 = this;
                                            this.a(var12_13, var13_14, (View)var14_15, var15_17, (String)var9_10 /* !! */ , var16_19);
                                        }
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var3_4 = new StringBuilder();
                                        var4_5 = this.A;
                                        var7_8 = ": Adding Main Image Into ImageDetailMap in IMAGE Format";
                                        j_0.i((com.jio.jioads.common.b)var4_5, (StringBuilder)var3_4, (String)var7_8);
                                        var1_1.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var1_1 = this.j;
                                        var14_16 = new ImageView((Context)var1_1);
                                        var12_13 = var14_16.getMeasuredWidth();
                                        var13_14 = var14_16.getMeasuredHeight();
                                        var15_18 = "mainImageByteArray";
                                        var16_20 = false;
                                        var4_5 = this;
                                        this.a(var12_13, var13_14, (View)var14_16, var15_18, (String)var9_10 /* !! */ , false);
                                    }
                                    break block22;
                                }
                                var5_6 = TextUtils.isEmpty((CharSequence)var9_10 /* !! */ );
                                if (var5_6 != 0) {
                                    var1_1 = this.g;
                                    if (var1_1 != null) {
                                        var3_4 = var1_1.D;
                                    }
                                    if (var3_4 == null && (var5_6 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == 0) {
                                        var1_1 = JioAdError$JioAdErrorType.ERROR_MEDIA_FILES_EMPTY;
                                        this.a((JioAdError$JioAdErrorType)var1_1, "Main image is not available in the response");
                                        return;
                                    }
                                }
                                if ((var5_6 = TextUtils.isEmpty((CharSequence)var9_10 /* !! */ )) == 0 || (var5_6 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == 0 || (var5_6 = this.k0) == 0) break block22;
                                var1_1 = this.G;
                                if (var1_1 == null) break block25;
                                var5_6 = var1_1.getChildCount();
                                break block26;
                                catch (Exception var1_2) {
                                    break block21;
                                }
                            }
                            var5_6 = 0;
                            var1_1 = null;
                        }
                        if (var5_6 > 0 && (var1_1 = this.G) != null) {
                            var1_1.removeAllViews();
                        }
                        break block22;
                    }
                    var3_4 = new StringBuilder();
                    var4_5 = this.A;
                    var7_8 = ": Exception occurs in removing  mediaLayout: ";
                    j_0.n((com.jio.jioads.common.b)var4_5, (StringBuilder)var3_4, (String)var7_8);
                    var4_5 = Utility.INSTANCE;
                    com.jio.jioads.jioreel.tracker.model.b.c((Utility)var4_5, var1_2, (StringBuilder)var3_4);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 = JioAds$LogLevel.NONE;
                }
                if ((var1_1 = this.G) != null) {
                    var5_6 = var1_1.isClickable();
                    if (var5_6 == var11_12) {
                        var10_11 = true;
                    }
                    if (var10_11) {
                        this.K = var11_12;
                        var1_1 = this.G;
                        Intrinsics.checkNotNull(var1_1);
                        var3_4 = this.L;
                        var3_4.add(var1_1);
                    }
                }
                break block27;
            }
            var1_1 = new StringBuilder();
            var3_4 = this.A;
            var4_5 = ": Media Layout getting null not set in to container jio_native_media_layout not found";
            j_0.i((com.jio.jioads.common.b)var3_4, (StringBuilder)var1_1, (String)var4_5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var1_1 = JioAds$LogLevel.NONE;
        }
        if ((var5_6 = this.K) == 0 && (var1_1 = this.r0) != null) {
            var1_1 = new StringBuilder();
            var3_4 = this.A;
            var4_5 = ": Making TitleView Clickable";
            j_0.i((com.jio.jioads.common.b)var3_4, (StringBuilder)var1_1, (String)var4_5);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var1_1 = JioAds$LogLevel.NONE;
            var1_1 = this.r0;
            Intrinsics.checkNotNull(var1_1);
            var3_4 = this.L;
            var3_4.add(var1_1);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Q() {
        Exception exception2;
        block5: {
            Object object;
            ArrayList<Object> arrayList;
            block3: {
                block4: {
                    try {
                        boolean bl2;
                        boolean bl3;
                        arrayList = new ArrayList<Object>();
                        object = this.i;
                        if (object == null) break block3;
                        Intrinsics.checkNotNull(object);
                        arrayList.add(object);
                        object = this.A;
                        object = object.Y();
                        if (object == null || (bl3 = j_0.l((Context)object)) != (bl2 = true)) break block4;
                        break block3;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                object = this.G;
                if (object != null) {
                    Intrinsics.checkNotNull(object);
                    arrayList.add(object);
                }
            }
            object = new y(this, arrayList);
            long l2 = 1000L;
            com.jio.jioads.util.s.b(l2, (Function0)object);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.A.P();
        stringBuilder.append((String)object);
        object = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception2, stringBuilder);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final String R() {
        void var12_22;
        Object object;
        Serializable serializable;
        Object object2;
        int n3;
        String[] stringArray;
        int n4;
        NativeAdViewRenderer nativeAdViewRenderer = this;
        Object object3 = this.A.m0();
        boolean bl2 = false;
        int n7 = 1;
        boolean bl3 = object3 != null && (n4 = ((String)object3).length()) > 0;
        n4 = nativeAdViewRenderer.o;
        int n8 = -1;
        boolean bl4 = n4 == n8;
        List list = nativeAdViewRenderer.A.a();
        object3 = nativeAdViewRenderer.A.m0();
        if (object3 != null && (object3 = StringsKt.a0((CharSequence)object3, stringArray = new String[]{"x"}, false, 0, n3 = 6)) != null) {
            String[] stringArray2 = new String[]{};
            object3 = object3.toArray(stringArray2);
            String[] stringArray3 = object3;
        } else {
            Object var12_21 = null;
        }
        object3 = nativeAdViewRenderer.A;
        n4 = object3.W();
        if (n4 == n7) {
            String string2 = "getContainerSizeForVastAd(Ljava/lang/String;)Ljava/lang/String;";
            n8 = 1;
            object2 = NativeAdViewRenderer.class;
            String string3 = "getContainerSizeForVastAd";
            object3 = serializable;
            object = this;
            serializable = new FunctionReferenceImpl(n8, this, (Class)object2, string3, string2, 0);
        } else {
            String string4 = "getContainerSize(Ljava/lang/String;)Ljava/lang/String;";
            n8 = 1;
            object2 = NativeAdViewRenderer.class;
            String string5 = "getContainerSize";
            object3 = serializable;
            object = this;
            serializable = new FunctionReferenceImpl(n8, this, (Class)object2, string5, string4, 0);
        }
        object3 = serializable;
        n8 = 250;
        if (bl3 && bl4) {
            object = this.r();
            n3 = ((String)object).length();
            if (n3 > 0 && (n3 = Integer.parseInt((String)(object = this.r()))) >= n8 && (n3 = ((String)(object = this.q())).length()) > 0 && (n3 = Integer.parseInt((String)(object = this.q()))) >= n8) {
                String string6 = Constants$DynamicDisplaySize.SIZE_300x250.getDynamicSize();
                object3 = (String)serializable.invoke(string6);
                return String.valueOf(object3);
            }
            String string7 = Constants$DynamicDisplaySize.SIZE_300x50.getDynamicSize();
            object3 = (String)object3.invoke(string7);
            return String.valueOf(object3);
        }
        if (list != null && (n3 = (int)(list.isEmpty() ? 1 : 0)) == 0) {
            void var12_25;
            Boolean bl5 = Boolean.FALSE;
            object = nativeAdViewRenderer.g;
            if (object != null) {
                Object object4 = object = ((com.jio.jioads.native.parser.a)object).p;
            } else {
                Object var12_24 = null;
            }
            n3 = (int)(this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0);
            if (n3 != 0 || (n3 = (int)(nativeAdViewRenderer.A0 ? 1 : 0)) != 0) {
                bl2 = true;
            }
            serializable = Boolean.valueOf(bl2);
            object = nativeAdViewRenderer.g;
            Object object5 = object != null ? (object2 = ((com.jio.jioads.native.parser.a)object).o) : null;
            Object object6 = object != null ? (object2 = ((com.jio.jioads.native.parser.a)object).b) : null;
            Object object7 = object != null ? (object2 = ((com.jio.jioads.native.parser.a)object).l) : null;
            Object object8 = object != null ? (object = ((com.jio.jioads.native.parser.a)object).f) : null;
            object = nativeAdViewRenderer.A;
            String string8 = object.m0();
            String string9 = com.jio.jioads.native.utils.b.a(bl5, (String)var12_25, (Boolean)serializable, list, (String)object5, (String)object6, (String)object7, (String)object8, string8);
            object3 = (String)object3.invoke(string9);
            return String.valueOf(object3);
        }
        if (var12_22 != null && (n3 = Integer.parseInt((String)(object = var12_22[0]))) >= n8 && (n3 = Integer.parseInt((String)(object = var12_22[n7]))) >= n8) {
            String string10 = Constants$DynamicDisplaySize.SIZE_300x250.getDynamicSize();
            object3 = (String)object3.invoke(string10);
            return String.valueOf(object3);
        }
        String string11 = Constants$DynamicDisplaySize.SIZE_300x50.getDynamicSize();
        object3 = (String)object3.invoke(string11);
        return String.valueOf(object3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void S() {
        Exception exception2;
        block21: {
            String string2;
            String string3;
            int n3;
            com.jio.jioads.common.b b2;
            block20: {
                block19: {
                    try {
                        b2 = this.A;
                        n3 = b2.W();
                        if (n3 != 0) return;
                        b2 = this.s;
                        string3 = "NativeDescription2";
                        string2 = null;
                        if (b2 == null) break block19;
                        b2 = b2.findViewWithTag(string3);
                        break block20;
                    }
                    catch (Exception exception2) {
                        break block21;
                    }
                }
                n3 = 0;
                b2 = null;
            }
            Object object = this.g;
            object = object != null ? ((com.jio.jioads.native.parser.a)object).t : null;
            String string4 = "Description2 must be tagged on a TextView";
            this.a((View)b2, (String)object, string3, string4);
            b2 = this.s;
            string3 = "Rating";
            if (b2 != null) {
                b2 = b2.findViewWithTag(string3);
            } else {
                n3 = 0;
                b2 = null;
            }
            object = this.g;
            object = object != null ? ((com.jio.jioads.native.parser.a)object).a : null;
            string4 = "Ratings must be tagged on a RatingBar";
            this.a((View)b2, (String)object, string3, string4);
            b2 = this.s;
            string3 = "Downloads";
            if (b2 != null) {
                b2 = b2.findViewWithTag(string3);
            } else {
                n3 = 0;
                b2 = null;
            }
            object = this.g;
            object = object != null ? ((com.jio.jioads.native.parser.a)object).m : null;
            string4 = "Downloads must be tagged on a TextView";
            this.a((View)b2, (String)object, string3, string4);
            b2 = this.s;
            string3 = "SalePrice";
            if (b2 != null) {
                b2 = b2.findViewWithTag(string3);
            } else {
                n3 = 0;
                b2 = null;
            }
            object = this.g;
            object = object != null ? ((com.jio.jioads.native.parser.a)object).v : null;
            string4 = "Sale Price must be tagged on a TextView";
            this.a((View)b2, (String)object, string3, string4);
            b2 = this.s;
            string3 = "Likes";
            if (b2 != null) {
                b2 = b2.findViewWithTag(string3);
            } else {
                n3 = 0;
                b2 = null;
            }
            object = this.g;
            object = object != null ? ((com.jio.jioads.native.parser.a)object).u : null;
            string4 = "Likes must be tagged on a TextView";
            this.a((View)b2, (String)object, string3, string4);
            b2 = this.s;
            string3 = "Price";
            if (b2 != null) {
                b2 = b2.findViewWithTag(string3);
            } else {
                n3 = 0;
                b2 = null;
            }
            object = this.g;
            object = object != null ? ((com.jio.jioads.native.parser.a)object).n : null;
            string4 = "Price must be tagged on a TextView";
            this.a((View)b2, (String)object, string3, string4);
            b2 = this.s;
            string3 = "Phone";
            if (b2 != null) {
                b2 = b2.findViewWithTag(string3);
            } else {
                n3 = 0;
                b2 = null;
            }
            object = this.g;
            object = object != null ? ((com.jio.jioads.native.parser.a)object).w : null;
            string4 = "Phone must be tagged on a TextView";
            this.a((View)b2, (String)object, string3, string4);
            b2 = this.s;
            string3 = "Address";
            if (b2 != null) {
                b2 = b2.findViewWithTag(string3);
            } else {
                n3 = 0;
                b2 = null;
            }
            object = this.g;
            object = object != null ? ((com.jio.jioads.native.parser.a)object).x : null;
            string4 = "Address must be tagged on a TextView";
            this.a((View)b2, (String)object, string3, string4);
            b2 = this.s;
            string3 = "DisplayUrl";
            if (b2 != null) {
                b2 = b2.findViewWithTag(string3);
            } else {
                n3 = 0;
                b2 = null;
            }
            object = this.g;
            if (object != null) {
                string2 = ((com.jio.jioads.native.parser.a)object).y;
            }
            object = "Display URL must be tagged on a TextView";
            this.a((View)b2, string2, string3, (String)object);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.A;
        String string5 = ": Exception in rendering secondary native elements ";
        j_0.n((com.jio.jioads.common.b)object, stringBuilder, string5);
        object = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception2, stringBuilder);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void T() {
        block38: {
            int n3;
            Object object;
            Object object2;
            Object object3;
            block37: {
                object3 = new StringBuilder();
                object2 = this.A;
                object = ": NativeAd: setCustomContainer() called ";
                j_0.i(object2, (StringBuilder)object3, object);
                object3 = JioAds.Companion;
                ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = this.A;
                n3 = object2.l();
                if (n3 == 0) break block37;
                object2 = ((com.jio.jioads.controller.f)this.h).a;
                n3 = ((com.jio.jioads.controller.o)object2).C;
                if ((n3 == 0 || (object2 = this.s) != null) && (object2 = this.s) != null) break block38;
            }
            object2 = this.A.K();
            object = JioAdView$AD_TYPE.INTERSTITIAL;
            int n4 = 1;
            String string2 = "null cannot be cast to non-null type android.view.ViewGroup";
            ViewParent viewParent = null;
            if (object2 == object) {
                object3 = this.d;
                if (object3 != null) {
                    object3 = LayoutInflater.from((Context)this.j);
                    object2 = this.d;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("newOrienation");
                        n3 = 0;
                        object2 = null;
                    }
                    n3 = object2 == (object = JioAdView$ORIENTATION_TYPE.PORTRAIT) ? this.p : this.q;
                    object3 = object3.inflate(n3, null);
                    Intrinsics.checkNotNull(object3, string2);
                    object3 = (ViewGroup)object3;
                    this.s = object3;
                } else {
                    object3 = this.A.H();
                    if (object3 != null) {
                        object3 = LayoutInflater.from((Context)this.j);
                        object2 = this.A.H();
                        n3 = object2 == (object = JioAdView$ORIENTATION_TYPE.PORTRAIT) ? this.p : this.q;
                        object3 = object3.inflate(n3, null);
                        Intrinsics.checkNotNull(object3, string2);
                        object3 = (ViewGroup)object3;
                        this.s = object3;
                    } else {
                        object3 = LayoutInflater.from((Context)this.j);
                        object2 = this.j;
                        n3 = object2 != null && (object2 = object2.getResources()) != null && (object2 = object2.getConfiguration()) != null && (n3 = ((Configuration)object2).orientation) == n4 ? this.p : this.q;
                        object3 = object3.inflate(n3, null);
                        Intrinsics.checkNotNull(object3, string2);
                        object3 = (ViewGroup)object3;
                        this.s = object3;
                    }
                }
            } else {
                boolean bl2;
                int n7;
                object2 = this.A.m0();
                object = "null cannot be cast to non-null type android.widget.RelativeLayout";
                if (object2 != null && (n3 = ((String)object2).length()) > 0 && (n3 = ((String)(object2 = this.q())).length()) > 0 && (n3 = Integer.parseInt((String)(object2 = this.q()))) < (n7 = 250) || (n3 = ((String)(object2 = this.r())).length()) > 0 && (n3 = Integer.parseInt((String)(object2 = this.r()))) < (n7 = 300)) {
                    Object object4;
                    int n8;
                    Object object5;
                    Object object6;
                    object2 = this.R();
                    n7 = (int)(Intrinsics.areEqual(object2, object6 = "") ? 1 : 0);
                    if (n7 != 0 && (object6 = this.A.m0()) != null && (n7 = ((String)object6).length()) != 0) {
                        object6 = JioAdError$JioAdErrorType.ERROR_WRONG_AD_SIZE;
                        object5 = "Wrong Ad size received for dynamic display";
                        this.a((JioAdError$JioAdErrorType)((Object)object6), (String)object5);
                    }
                    if ((object6 = this.j) != null && (object6 = object6.getResources()) != null) {
                        object5 = this.j;
                        if (object5 != null) {
                            object5 = object5.getPackageName();
                        } else {
                            n8 = 0;
                            object5 = null;
                        }
                        object4 = "layout";
                        n7 = object6.getIdentifier((String)object2, (String)object4, (String)object5);
                        object6 = n7;
                    } else {
                        n7 = 0;
                        object6 = null;
                    }
                    if (object6 != null && (n8 = ((Integer)object6).intValue()) != 0) {
                        object5 = LayoutInflater.from((Context)this.j);
                        n7 = (Integer)object6;
                        object6 = object5.inflate(n7, null);
                        Intrinsics.checkNotNull(object6, object);
                        object6 = (RelativeLayout)object6;
                    } else {
                        object6 = new StringBuilder();
                        object5 = this.A;
                        object4 = ": layoutResourceId is not set for dynamic display ad";
                        j_0.i((com.jio.jioads.common.b)object5, (StringBuilder)object6, (String)object4);
                        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object5 = this.j;
                        object6 = new RelativeLayout((Context)object5);
                    }
                    this.s = object6;
                    object6 = this.t;
                    Intrinsics.checkNotNull(object6);
                    object5 = new String[]{"x"};
                    object6 = StringsKt.a0((CharSequence)object6, object5, false, 0, 6);
                    object5 = new String[]{};
                    object6 = object6.toArray((T[])object5);
                    object5 = object6[0];
                    Object object7 = object6[n4];
                    object4 = Utility.INSTANCE;
                    float f5 = Float.parseFloat((String)object5);
                    int n10 = ((Utility)object4).convertDpToPixel(f5);
                    float f6 = Float.parseFloat((String)object7);
                    int n14 = ((Utility)object4).convertDpToPixel(f6);
                    object6 = new ViewGroup.LayoutParams(n10, n14);
                    object4 = this.s;
                    if (object4 != null) {
                        object4.setLayoutParams((ViewGroup.LayoutParams)object6);
                    }
                    object6 = new StringBuilder();
                    object4 = this.A.P();
                    ((StringBuilder)object6).append((String)object4);
                    object4 = ":layoutName: ";
                    ((StringBuilder)object6).append((String)object4);
                    ((StringBuilder)object6).append((String)object2);
                    ((StringBuilder)object6).append(". Display ad width: ");
                    ((StringBuilder)object6).append((String)object5);
                    ((StringBuilder)object6).append(",height: ");
                    ((StringBuilder)object6).append((String)object7);
                    object2 = ((StringBuilder)object6).toString();
                    object7 = "message";
                    Intrinsics.checkNotNullParameter(object2, (String)object7);
                    object3 = ((JioAds$Companion)object3).getInstance();
                    ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                } else {
                    object3 = this.s;
                    if (object3 == null) {
                        object2 = this.j;
                        object3 = new RelativeLayout((Context)object2);
                        this.s = object3;
                    }
                    object3 = LayoutInflater.from((Context)this.j);
                    n3 = this.o;
                    object3 = object3.inflate(n3, null);
                    Intrinsics.checkNotNull(object3, string2);
                    object3 = (ViewGroup)object3;
                    this.s = object3;
                    object3 = this.A.y();
                    object2 = Boolean.TRUE;
                    bl2 = Intrinsics.areEqual(object3, object2);
                    if (bl2 && (object3 = this.s) != null) {
                        object2 = object3.getLayoutParams();
                        n4 = -1;
                        if (object2 != null) {
                            ((ViewGroup.LayoutParams)object2).height = n4;
                            ((ViewGroup.LayoutParams)object2).width = n4;
                        } else {
                            object2 = new RelativeLayout.LayoutParams(n4, n4);
                        }
                        object3.setLayoutParams((ViewGroup.LayoutParams)object2);
                    }
                }
                object3 = this.s;
                bl2 = this.a((ViewGroup)object3);
                if (bl2 && (object3 = this.A.K()) == (object2 = JioAdView$AD_TYPE.CUSTOM_NATIVE)) {
                    object3 = this.v;
                    if (object3 != null) {
                        object3 = object3.getParent();
                    } else {
                        bl2 = false;
                        object3 = null;
                    }
                    if (object3 != null) {
                        object3 = this.v;
                        if (object3 != null) {
                            object3 = object3.getParent();
                        } else {
                            bl2 = false;
                            object3 = null;
                        }
                        Intrinsics.checkNotNull(object3, string2);
                        object3 = (ViewGroup)object3;
                        object2 = this.s;
                        object3.removeView((View)object2);
                    }
                }
                if ((object3 = this.s) != null) {
                    object3 = object3.getParent();
                } else {
                    bl2 = false;
                    object3 = null;
                }
                if (object3 != null) {
                    object3 = this.s;
                    if (object3 != null) {
                        object3 = object3.getParent();
                    } else {
                        bl2 = false;
                        object3 = null;
                    }
                    bl2 = object3 instanceof RelativeLayout;
                    if (bl2) {
                        object3 = this.s;
                        if (object3 != null) {
                            viewParent = object3.getParent();
                        }
                        Intrinsics.checkNotNull(viewParent, object);
                        viewParent = (RelativeLayout)viewParent;
                        object3 = this.s;
                        viewParent.removeView((View)object3);
                    }
                }
            }
        }
    }

    public final void U() {
        block9: {
            int n3;
            ViewGroup viewGroup;
            block10: {
                Object object;
                block11: {
                    float f5;
                    Object object2;
                    block12: {
                        viewGroup = this.s;
                        n3 = 0;
                        object = null;
                        if (viewGroup != null) {
                            object2 = "NativeDescription";
                            viewGroup = (TextView)viewGroup.findViewWithTag(object2);
                        } else {
                            viewGroup = null;
                        }
                        if (viewGroup == null) break block9;
                        object2 = this.g;
                        if (object2 != null) {
                            object = ((com.jio.jioads.native.parser.a)object2).l;
                        }
                        if ((n3 = TextUtils.isEmpty(object)) != 0) break block10;
                        object = this.j;
                        if (object == null || (object = this.A.K()) != (object2 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) break block11;
                        object = Utility.INSTANCE;
                        object2 = this.j;
                        Intrinsics.checkNotNull(object2);
                        boolean n4 = ((Utility)object).isDeviceTypeTablet((Context)object2);
                        if (n4) break block12;
                        object2 = this.j;
                        Intrinsics.checkNotNull(object2);
                        n3 = ((Utility)object).getCurrentUIModeType((Context)object2);
                        int n7 = 4;
                        f5 = 5.6E-45f;
                        if (n3 != n7) break block11;
                    }
                    if ((n3 = (int)(Intrinsics.areEqual(object = this.t, object2 = Constants$DynamicDisplaySize.SIZE_728x90.getDynamicSize()) ? 1 : 0)) != 0 || (n3 = (int)(Intrinsics.areEqual(object = this.t, object2 = Constants$DynamicDisplaySize.SIZE_970x90.getDynamicSize()) ? 1 : 0)) != 0) {
                        object = new StringBuilder();
                        object2 = this.A;
                        String string2 = ": device type is STB so setting description text font to 14";
                        j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object, string2);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        object = this.J;
                        if (object != null) {
                            int n8 = 1096810496;
                            f5 = 14.0f;
                            object.setTextSize(f5);
                        }
                    }
                }
                if ((object = this.g) == null || (object = ((com.jio.jioads.native.parser.a)object).l) == null) {
                    object = "";
                }
                viewGroup.setText((CharSequence)object);
                n3 = 0;
                object = null;
                viewGroup.setVisibility(0);
                break block9;
            }
            n3 = 8;
            viewGroup.setVisibility(n3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void V() {
        block64: {
            block68: {
                block65: {
                    block67: {
                        block66: {
                            block63: {
                                var1_1 /* !! */  = new StringBuilder();
                                j_0.n(this.A, (StringBuilder)var1_1 /* !! */ , ": Inside setNativeAdClickUrls, clickType value is: ");
                                var2_2 = this.Q;
                                var3_3 = "message";
                                ir3_0.b((StringBuilder)var1_1 /* !! */ , (String)var2_2, var3_3);
                                var1_1 /* !! */  = JioAds.Companion;
                                var1_1 /* !! */ .getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var2_2 = JioAds$LogLevel.NONE;
                                var2_2 = this.Q;
                                var4_4 = "2";
                                var5_5 = Intrinsics.areEqual(var2_2, var4_4);
                                var6_6 = 4;
                                if (var5_5 != 0) {
                                    var1_1 /* !! */  = this.i;
                                    if (var1_1 /* !! */  != null) {
                                        var1_1 /* !! */ .setVisibility(var6_6);
                                    }
                                    return;
                                }
                                var2_2 = this.Q;
                                var7_7 = "3";
                                var5_5 = Intrinsics.areEqual(var2_2, var7_7);
                                if (var5_5 != 0 && (var2_2 = this.i) != null) {
                                    var2_2.setVisibility(var6_6);
                                }
                                var2_2 = this.g;
                                var6_6 = 0;
                                var4_4 = null;
                                if (var2_2 != null) {
                                    var2_2 = var2_2.l;
                                } else {
                                    var5_5 = 0;
                                    var2_2 = null;
                                }
                                var5_5 = TextUtils.isEmpty((CharSequence)var2_2);
                                var8_8 = -1;
                                var9_9 = 1;
                                if (var5_5 != 0) {
                                    var2_2 = this.g;
                                    if (var2_2 != null) {
                                        var2_2 = var2_2.o;
                                    } else {
                                        var5_5 = 0;
                                        var2_2 = null;
                                    }
                                    var5_5 = TextUtils.isEmpty((CharSequence)var2_2);
                                    if (var5_5 != 0 && ((var2_2 = this.A.Y()) == null || (var5_5 = j_0.l((Context)var2_2)) != var9_9) && (var2_2 = this.A.K()) == (var10_10 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL)) {
                                        var2_2 = this.i;
                                        if (var2_2 != null) {
                                            var2_2 = var2_2.getLayoutParams();
                                        } else {
                                            var5_5 = 0;
                                            var2_2 = null;
                                        }
                                        if (var2_2 != null) {
                                            var2_2.width = var8_8;
                                        }
                                    }
                                }
                                var2_2 = this.F0;
                                var5_5 = TextUtils.isEmpty((CharSequence)var2_2);
                                var11_11 = 8;
                                if (var5_5 == 0) break block63;
                                var1_1 /* !! */  = this.i;
                                if (var1_1 /* !! */  != null) {
                                    var1_1 /* !! */ .setVisibility(var11_11);
                                }
                                break block64;
                            }
                            var2_2 = this.G0;
                            var5_5 = TextUtils.isEmpty((CharSequence)var2_2);
                            var12_12 = false;
                            var13_13 = null;
                            if (var5_5 == 0) {
                                var1_1 /* !! */  = this.g;
                                if (var1_1 /* !! */  != null) {
                                    var1_1 /* !! */  = var1_1 /* !! */ .f;
                                } else {
                                    var14_14 = 0;
                                    var1_1 /* !! */  = null;
                                }
                                var14_14 = TextUtils.isEmpty((CharSequence)var1_1 /* !! */ );
                                if (var14_14 == 0 && (var1_1 /* !! */  = this.i) != null) {
                                    var2_2 = this.g;
                                    if (var2_2 != null) {
                                        var2_2 = var2_2.f;
                                    } else {
                                        var5_5 = 0;
                                        var2_2 = null;
                                    }
                                    var1_1 /* !! */ .setText((CharSequence)var2_2);
                                } else {
                                    var1_1 /* !! */  = this.i;
                                    if (var1_1 /* !! */  != null) {
                                        var1_1 /* !! */  = this.A.K();
                                        if (var1_1 /* !! */  == (var2_2 = JioAdView$AD_TYPE.INTERSTITIAL)) {
                                            var1_1 /* !! */  = this.i;
                                            if (var1_1 /* !! */  != null) {
                                                var2_2 = "Know More";
                                                var1_1 /* !! */ .setText((CharSequence)var2_2);
                                            }
                                            var1_1 /* !! */  = this.A.Y();
                                            if (var1_1 /* !! */  != null && (var14_14 = (int)j_0.l((Context)var1_1 /* !! */ )) == var9_9 && (var1_1 /* !! */  = this.i) != null) {
                                                var2_2 = "Visit Advertiser";
                                                var1_1 /* !! */ .setText((CharSequence)var2_2);
                                            }
                                        } else {
                                            var1_1 /* !! */  = this.i;
                                            if (var1_1 /* !! */  != null) {
                                                var2_2 = this.j;
                                                if (var2_2 != null) {
                                                    var15_15 = R$string.jio_native_ad_click_text;
                                                    var2_2 = var2_2.getString(var15_15);
                                                } else {
                                                    var5_5 = 0;
                                                    var2_2 = null;
                                                }
                                                var1_1 /* !! */ .setText((CharSequence)var2_2);
                                            }
                                        }
                                    }
                                }
                                var14_14 = (int)this.k;
                                if (var14_14 != 0) {
                                    var1_1 /* !! */  = this.i;
                                    if (var1_1 /* !! */  != null) {
                                        var1_1 /* !! */ .setVisibility(0);
                                    }
                                } else {
                                    var1_1 /* !! */  = this.i;
                                    if (var1_1 /* !! */  != null) {
                                        var1_1 /* !! */ .setVisibility(var11_11);
                                    }
                                }
                            } else {
                                var2_2 = "ctaUrl is empty so hiding CTA button";
                                v12.a((String)var2_2, var3_3, (JioAds$Companion)var1_1 /* !! */ );
                                var1_1 /* !! */  = this.i;
                                if (var1_1 /* !! */  != null) {
                                    var1_1 /* !! */ .setVisibility(var11_11);
                                }
                            }
                            var14_14 = this.o;
                            if (var14_14 != var8_8) break block64;
                            var1_1 /* !! */  = this.A.K();
                            if (var1_1 /* !! */  == (var2_2 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) && (var1_1 /* !! */  = this.i) != null) {
                                var5_5 = R$drawable.jio_dynamic_display_button;
                                var1_1 /* !! */ .setBackgroundResource(var5_5);
                            }
                            if ((var1_1 /* !! */  = this.g) != null) {
                                var1_1 /* !! */  = var1_1 /* !! */ .i;
                            } else {
                                var14_14 = 0;
                                var1_1 /* !! */  = null;
                            }
                            var5_5 = (int)TextUtils.isEmpty((CharSequence)var1_1 /* !! */ );
                            var3_3 = "matcher(...)";
                            var7_7 = "";
                            var16_16 = "this as java.lang.String).toLowerCase(locale)";
                            var10_10 /* !! */  = "getDefault(...)";
                            var17_17 = "compile(...)";
                            var18_18 = "#([0-9a-f]{3}|[0-9a-f]{6}|[0-9a-f]{8})";
                            if (var5_5 != 0) break block65;
                            var2_2 = Pattern.compile(var18_18);
                            Intrinsics.checkNotNullExpressionValue(var2_2, var17_17);
                            if (var1_1 /* !! */  == null) break block66;
                            var19_19 = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(var19_19, (String)var10_10 /* !! */ );
                            var1_1 /* !! */  = var1_1 /* !! */ .toLowerCase(var19_19);
                            Intrinsics.checkNotNullExpressionValue(var1_1 /* !! */ , var16_16);
                            if (var1_1 /* !! */  != null) break block67;
                        }
                        var1_1 /* !! */  = var7_7;
                    }
                    var1_1 /* !! */  = var2_2.matcher((CharSequence)var1_1 /* !! */ );
                    Intrinsics.checkNotNullExpressionValue(var1_1 /* !! */ , var3_3);
                    var14_14 = (int)var1_1 /* !! */ .matches();
                    break block68;
                }
                var14_14 = 0;
                var1_1 /* !! */  = null;
            }
            if (var14_14 == 0) ** GOTO lbl-1000
            var1_1 /* !! */  = this.i;
            if (var1_1 /* !! */  != null) {
                var1_1 /* !! */  = var1_1 /* !! */ .getTextColors();
            } else {
                var14_14 = 0;
                var1_1 /* !! */  = null;
            }
            if (var1_1 /* !! */  == null && (var1_1 /* !! */  = this.A.K()) != (var2_2 = JioAdView$AD_TYPE.INTERSTITIAL)) {
                var1_1 /* !! */  = this.i;
                if (var1_1 /* !! */  != null) {
                    var2_2 = this.g;
                    if (var2_2 != null) {
                        var2_2 = var2_2.i;
                    } else {
                        var5_5 = 0;
                        var2_2 = null;
                    }
                    var5_5 = Color.parseColor((String)var2_2);
                    var1_1 /* !! */ .setTextColor(var5_5);
                }
            } else if ((var1_1 /* !! */  = this.j) != null) {
                var1_1 /* !! */  = this.i;
                if (var1_1 /* !! */  != null) {
                    var1_1 /* !! */  = var1_1 /* !! */ .getTextColors();
                } else {
                    var14_14 = 0;
                    var1_1 /* !! */  = null;
                }
                if (var1_1 /* !! */  == null) {
                    var1_1 /* !! */  = this.j;
                    Intrinsics.checkNotNull(var1_1 /* !! */ );
                    var5_5 = R$color.jio_white;
                    var14_14 = t70.getColor((Context)var1_1 /* !! */ , var5_5);
                    var2_2 = this.i;
                    if (var2_2 != null) {
                        var2_2.setTextColor(var14_14);
                    }
                }
            }
            if ((var1_1 /* !! */  = this.g) != null) {
                var1_1 /* !! */  = var1_1 /* !! */ .j;
            } else {
                var14_14 = 0;
                var1_1 /* !! */  = null;
            }
            var5_5 = (int)TextUtils.isEmpty((CharSequence)var1_1 /* !! */ );
            if (var5_5 == 0) {
                var2_2 = Pattern.compile(var18_18);
                Intrinsics.checkNotNullExpressionValue(var2_2, var17_17);
                if (var1_1 /* !! */  != null) {
                    var13_13 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(var13_13, (String)var10_10 /* !! */ );
                    var1_1 /* !! */  = var1_1 /* !! */ .toLowerCase(var13_13);
                    Intrinsics.checkNotNullExpressionValue(var1_1 /* !! */ , var16_16);
                    if (var1_1 /* !! */  != null) {
                        var7_7 = var1_1 /* !! */ ;
                    }
                }
                var1_1 /* !! */  = var2_2.matcher((CharSequence)var7_7);
                Intrinsics.checkNotNullExpressionValue(var1_1 /* !! */ , var3_3);
                var12_12 = var1_1 /* !! */ .matches();
            }
            if (var12_12 && (var1_1 /* !! */  = this.A.K()) != (var2_2 = JioAdView$AD_TYPE.INTERSTITIAL)) {
                var1_1 /* !! */  = this.i;
                if (var1_1 /* !! */  != null) {
                    var5_5 = R$drawable.jio_button_dynamic;
                    var1_1 /* !! */ .setBackgroundResource(var5_5);
                }
                if ((var1_1 /* !! */  = this.i) != null) {
                    var1_1 /* !! */  = var1_1 /* !! */ .getBackground();
                } else {
                    var14_14 = 0;
                    var1_1 /* !! */  = null;
                }
                Intrinsics.checkNotNull(var1_1 /* !! */ , "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                var1_1 /* !! */  = (GradientDrawable)var1_1 /* !! */ ;
                var2_2 = this.g;
                if (var2_2 != null) {
                    var4_4 = var2_2.j;
                }
                var5_5 = Color.parseColor((String)var4_4);
                var1_1 /* !! */ .setColor(var5_5);
            }
        }
    }

    public final void W() {
        Object object = this.A;
        int n3 = object.W();
        if (n3 == 0) {
            Object object2;
            object = this.G0;
            Object object3 = "";
            if (object != null && (n3 = ((String)object).length()) != 0) {
                object = this.A;
                object2 = this.g;
                if (object2 == null || (object2 = ((com.jio.jioads.native.parser.a)object2).f) == null) {
                    object2 = "Visit Advertiser";
                }
                object.d((String)object2);
            } else {
                object = this.A;
                object.d((String)object3);
            }
            object = this.A;
            object2 = this.g;
            if (object2 == null || (object2 = ((com.jio.jioads.native.parser.a)object2).b) == null) {
                object2 = object3;
            }
            object.c((String)object2);
            object = this.A;
            object2 = this.F0;
            if (object2 == null) {
                object2 = object3;
            }
            object.b((String)object2);
            object = this.A;
            object2 = this.g;
            if (object2 == null || (object2 = ((com.jio.jioads.native.parser.a)object2).h) == null) {
                object2 = object3;
            }
            object.e((String)object2);
            object = this.A;
            object2 = this.g;
            if (object2 != null && (object2 = ((com.jio.jioads.native.parser.a)object2).k) != null) {
                object3 = object2;
            }
            object.a((String)object3);
        }
    }

    public final void X() {
        block13: {
            int n3;
            Object object;
            block14: {
                Object object2;
                String string2;
                block15: {
                    Object object3;
                    float f5;
                    int n4;
                    block16: {
                        object = this.J;
                        if (object == null) break block13;
                        object = this.g;
                        string2 = null;
                        if (object != null) {
                            object = object.b;
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        n4 = TextUtils.isEmpty((CharSequence)object);
                        n3 = 4;
                        f5 = 5.6E-45f;
                        if (n4 != 0) break block14;
                        object = this.j;
                        if (object == null || (object = this.A.K()) != (object3 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) break block15;
                        object = Utility.INSTANCE;
                        object3 = this.j;
                        Intrinsics.checkNotNull(object3);
                        boolean bl2 = object.isDeviceTypeTablet((Context)object3);
                        if (bl2) break block16;
                        object3 = this.j;
                        Intrinsics.checkNotNull(object3);
                        n4 = object.getCurrentUIModeType((Context)object3);
                        if (n4 != n3) break block15;
                    }
                    if ((n4 = (int)(Intrinsics.areEqual(object = this.t, object2 = Constants$DynamicDisplaySize.SIZE_728x90.getDynamicSize()) ? 1 : 0)) != 0 || (n4 = (int)(Intrinsics.areEqual(object = this.t, object2 = Constants$DynamicDisplaySize.SIZE_970x90.getDynamicSize()) ? 1 : 0)) != 0) {
                        object = new StringBuilder();
                        object2 = this.A;
                        object3 = ": device type is STB so setting font to 20";
                        j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object, (String)object3);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        object = this.J;
                        if (object != null) {
                            n3 = 1101004800;
                            f5 = 20.0f;
                            object.setTextSize(f5);
                        }
                        object = this.J;
                        if (object != null) {
                            n3 = 2;
                            f5 = 2.8E-45f;
                            object.setMaxLines(n3);
                        }
                    }
                }
                if ((object = this.J) != null) {
                    object2 = this.g;
                    if (object2 != null) {
                        string2 = ((com.jio.jioads.native.parser.a)object2).b;
                    }
                    object.setText((CharSequence)string2);
                }
                if ((object = this.J) != null) {
                    string2 = null;
                    object.setVisibility(0);
                }
                break block13;
            }
            object = this.J;
            if (object != null) {
                object.setVisibility(n3);
            }
        }
    }

    public final void Y() {
        Object object;
        int n3;
        int n4;
        Object object2;
        Object object3 = this.s;
        int n7 = 0;
        Object object4 = null;
        if (object3 != null) {
            object2 = "NativeCTA";
            object3 = object3.findViewWithTag(object2);
        } else {
            n4 = 0;
            object3 = null;
        }
        if (object3 != null) {
            n3 = object3 instanceof Button;
            if (n3 == 0 && (n3 = object3 instanceof TextView) == 0) {
                object3 = new StringBuilder();
                object2 = this.A;
                object = ": jio_native_cta must be tagged on a Button";
                j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
            } else {
                object3 = (TextView)object3;
                this.i = object3;
            }
        }
        if ((object3 = this.i) != null) {
            object3 = this.F0;
            n4 = TextUtils.isEmpty((CharSequence)object3);
            n3 = 8;
            if (n4 != 0) {
                object3 = this.i;
                if (object3 != null) {
                    object3.setVisibility(n3);
                }
            } else {
                object3 = this.G0;
                n4 = TextUtils.isEmpty((CharSequence)object3);
                if (n4 == 0) {
                    object3 = this.i;
                    if (object3 != null) {
                        n3 = 0;
                        object2 = null;
                        object3.setVisibility(0);
                    }
                    object3 = this.g;
                    if (object3 != null) {
                        object3 = object3.f;
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    n4 = TextUtils.isEmpty((CharSequence)object3);
                    n3 = 1;
                    if (n4 == 0) {
                        object3 = this.i;
                        if (object3 != null) {
                            object = this.g;
                            if (object != null) {
                                object4 = ((com.jio.jioads.native.parser.a)object).f;
                            }
                            object3.setText((CharSequence)object4);
                        }
                        if ((object3 = this.i) != null && (n4 = object3.isClickable()) == n3) {
                            this.K = n3;
                            object3 = this.i;
                            Intrinsics.checkNotNull(object3);
                            object4 = this.L;
                            object4.add(object3);
                        }
                    } else {
                        object3 = this.i;
                        if (object3 != null) {
                            object = this.j;
                            if (object != null) {
                                n7 = R$string.jio_native_ad_click_text;
                                object4 = object.getString(n7);
                            }
                            object3.setText((CharSequence)object4);
                        }
                        if ((object3 = this.i) != null && (n4 = object3.isClickable()) == n3) {
                            this.K = n3;
                            object3 = this.i;
                            Intrinsics.checkNotNull(object3);
                            object4 = this.L;
                            object4.add(object3);
                        }
                    }
                } else {
                    object4 = "message";
                    Intrinsics.checkNotNullParameter("ctaUrl is empty so hiding CTA button custom", (String)object4);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    object3 = this.i;
                    if (object3 != null) {
                        object3.setVisibility(n3);
                    }
                }
            }
        }
    }

    public final void Z() {
        int n3 = 1;
        Object object = new StringBuilder();
        Object object2 = this.A;
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object, ": isPreparedAd is ");
        int n4 = this.g0;
        ((StringBuilder)object).append(n4 != 0);
        n4 = 32;
        ((StringBuilder)object).append((char)n4);
        object = ((StringBuilder)object).toString();
        Object object3 = "message";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        int n7 = this.g0;
        int n8 = 2;
        Object object5 = "<set-?>";
        if (n7 != 0) {
            int n10;
            int n14;
            Object object6;
            Object object7;
            block73: {
                object4 = new StringBuilder();
                object7 = this.A;
                object6 = ": isPreparedAd is true in showVideoAd() ";
                j_0.n((com.jio.jioads.common.b)object7, (StringBuilder)object4, (String)object6);
                n14 = this.Z;
                ((StringBuilder)object4).append(n14);
                object4 = ((StringBuilder)object4).toString();
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = this.U;
                if (object != null) {
                    object4 = com.jio.jioads.videomodule.z.a;
                    Intrinsics.checkNotNullParameter(object4, (String)object5);
                    ((com.jio.jioads.videomodule.s)object).A = object4;
                }
                object = this.G;
                if (object == null) break block73;
                n7 = object.getChildCount();
                if (n7 <= 0) break block73;
                try {
                    object.removeAllViews();
                }
                catch (Exception exception) {
                    object4 = new StringBuilder();
                    object5 = this.A;
                    object7 = ": Exception occurs in removing mediaLayout: ";
                    j_0.n((com.jio.jioads.common.b)object5, (StringBuilder)object4, (String)object7);
                    object5 = Utility.INSTANCE;
                    com.jio.jioads.jioreel.tracker.model.b.c((Utility)object5, exception, (StringBuilder)object4);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
            }
            if ((n10 = (object = this.A).l()) != 0) {
                Object object8;
                n10 = this.Z;
                n7 = 8;
                int n15 = 10;
                n14 = 0;
                object7 = null;
                if (n10 == n3 && (object6 = this.V) != null) {
                    object = this.A;
                    n10 = object.W();
                    if (n10 == n3) {
                        object = this.s;
                        if ((object != null || (object2 = this.v) != null) && (object2 = this.V) != null) {
                            if (object == null) {
                                object = this.v;
                                Intrinsics.checkNotNull(object);
                            }
                            boolean bl2 = this.v0;
                            com.jio.jioads.videomodule.s.A((com.jio.jioads.videomodule.s)object2, (ViewGroup)object, null, bl2, n15);
                        }
                        if ((object = this.v) != null && (n10 = (int)(object.isClickable() ? 1 : 0)) == n3) {
                            object = this.V;
                            if (object != null) {
                                object = ((com.jio.jioads.videomodule.s)object).c0();
                            } else {
                                n10 = 0;
                                object = null;
                            }
                            if (object != null) {
                                object = this.V;
                                if (object != null) {
                                    object7 = ((com.jio.jioads.videomodule.s)object).c0();
                                }
                                this.a((View)object7);
                            }
                            if ((object = this.V) != null && (object = ((com.jio.jioads.videomodule.s)object).c0()) != null) {
                                object2 = new c(this);
                                object.setOnClickListener((View.OnClickListener)object2);
                            }
                        }
                    } else {
                        object = this.G;
                        if (object != null) {
                            object2 = this.V;
                            if (object2 != null) {
                                Intrinsics.checkNotNull(object);
                                object3 = this.v;
                                n7 = (int)(this.v0 ? 1 : 0);
                                ((com.jio.jioads.videomodule.s)object2).w((ViewGroup)object, (ViewGroup)object3, n7 != 0);
                            }
                        } else {
                            object = this.p0;
                            if (object != null && (object = this.A.K()) == (object2 = JioAdView$AD_TYPE.CUSTOM_NATIVE) && (object = this.V) != null) {
                                object2 = this.p0;
                                Intrinsics.checkNotNull(object2);
                                object3 = this.v;
                                n15 = (int)(this.v0 ? 1 : 0);
                                com.jio.jioads.videomodule.s.A((com.jio.jioads.videomodule.s)object, (ViewGroup)object2, (ViewGroup)object3, n15 != 0, n7);
                            }
                        }
                        if ((object = this.G) != null && (n10 = (int)(object.isClickable() ? 1 : 0)) == n3) {
                            object = this.V;
                            if (object != null) {
                                object = ((com.jio.jioads.videomodule.s)object).c0();
                            } else {
                                n10 = 0;
                                object = null;
                            }
                            if (object != null) {
                                object = this.V;
                                if (object != null) {
                                    object7 = ((com.jio.jioads.videomodule.s)object).c0();
                                }
                                this.a((View)object7);
                            }
                            if ((object = this.V) != null && (object = ((com.jio.jioads.videomodule.s)object).c0()) != null) {
                                object2 = new d(this);
                                object.setOnClickListener((View.OnClickListener)object2);
                            }
                        }
                    }
                    if ((object = this.w) != null) {
                        object.a(n3 != 0);
                    }
                    this.Z = n8;
                } else if (n10 == n8 && (object8 = this.U) != null) {
                    object = new StringBuilder();
                    object8 = this.A;
                    object6 = ":  jioVideoView currentVideoViewState: ";
                    j_0.n((com.jio.jioads.common.b)object8, (StringBuilder)object, (String)object6);
                    object8 = this.U;
                    if (object8 != null) {
                        object8 = ((com.jio.jioads.videomodule.s)object8).A;
                    } else {
                        n8 = 0;
                        object8 = null;
                    }
                    ((StringBuilder)object).append(object8);
                    ((StringBuilder)object).append((char)n4);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object3);
                    object = JioAds.Companion;
                    ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = this.A;
                    n4 = object2.W();
                    if (n4 == n3) {
                        object = this.s;
                        if ((object != null || (object2 = this.v) != null) && (object2 = this.U) != null) {
                            if (object == null) {
                                object = this.v;
                                Intrinsics.checkNotNull(object);
                            }
                            boolean bl3 = this.v0;
                            com.jio.jioads.videomodule.s.A((com.jio.jioads.videomodule.s)object2, (ViewGroup)object, null, bl3, n15);
                        }
                        if ((object = this.v) != null && (n10 = (int)(object.isClickable() ? 1 : 0)) == n3) {
                            object = this.U;
                            if (object != null) {
                                object = ((com.jio.jioads.videomodule.s)object).c0();
                            } else {
                                n10 = 0;
                                object = null;
                            }
                            if (object != null) {
                                object = this.U;
                                if (object != null) {
                                    object7 = ((com.jio.jioads.videomodule.s)object).c0();
                                }
                                this.a((View)object7);
                            }
                            if ((object = this.U) != null && (object = ((com.jio.jioads.videomodule.s)object).c0()) != null) {
                                object2 = new Ny1(this, n3);
                                object.setOnClickListener((View.OnClickListener)object2);
                            }
                        }
                    } else {
                        object2 = new StringBuilder();
                        object3 = this.A;
                        object8 = ":  passsing nativeAdViewFromPublisher both:";
                        com.jio.jioads.common.l.a((com.jio.jioads.common.b)object3, (StringBuilder)object2, (String)object8, (JioAds$Companion)object);
                        object = this.G;
                        if (object != null) {
                            object2 = this.U;
                            if (object2 != null) {
                                Intrinsics.checkNotNull(object);
                                object3 = this.v;
                                n7 = (int)(this.v0 ? 1 : 0);
                                ((com.jio.jioads.videomodule.s)object2).w((ViewGroup)object, (ViewGroup)object3, n7 != 0);
                            }
                        } else {
                            object = this.p0;
                            if (object != null && (object = this.A.K()) == (object2 = JioAdView$AD_TYPE.CUSTOM_NATIVE) && (object = this.U) != null) {
                                object2 = this.p0;
                                Intrinsics.checkNotNull(object2);
                                object3 = this.v;
                                n8 = (int)(this.v0 ? 1 : 0);
                                com.jio.jioads.videomodule.s.A((com.jio.jioads.videomodule.s)object, (ViewGroup)object2, (ViewGroup)object3, n8 != 0, n7);
                            }
                        }
                        if ((object = this.G) != null && (n10 = (int)(object.isClickable() ? 1 : 0)) == n3) {
                            object = this.U;
                            if (object != null) {
                                object = ((com.jio.jioads.videomodule.s)object).c0();
                            } else {
                                n10 = 0;
                                object = null;
                            }
                            if (object != null) {
                                object = this.U;
                                if (object != null) {
                                    object7 = ((com.jio.jioads.videomodule.s)object).c0();
                                }
                                this.a((View)object7);
                            }
                            if ((object = this.U) != null && (object = ((com.jio.jioads.videomodule.s)object).c0()) != null) {
                                object2 = new Oy1(this, n3);
                                object.setOnClickListener((View.OnClickListener)object2);
                            }
                        }
                    }
                    if ((object = this.w) != null) {
                        object.a(n3 != 0);
                    }
                    this.Z = n3;
                } else if (n10 == n3 && (object = this.U) != null) {
                    this.f();
                }
            } else {
                object = new StringBuilder();
                object4 = this.A;
                String string2 = ": nativeAdViewFromPublisher value is ";
                j_0.n((com.jio.jioads.common.b)object4, (StringBuilder)object, string2);
                object4 = this.v;
                ((StringBuilder)object).append(object4);
                ((StringBuilder)object).append((char)n4);
                Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), (String)object3);
                object = JioAds.Companion.getInstance();
                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.f();
            }
            n10 = (int)(this.o0 ? 1 : 0);
            if (n10 != 0) {
                object = this.V;
                if (object != null) {
                    ((com.jio.jioads.videomodule.s)object).F(n3 != 0);
                }
                if ((object = this.U) != null) {
                    ((com.jio.jioads.videomodule.s)object).F(n3 != 0);
                }
            }
            com.jio.jioads.common.b b2 = this.A;
            b2.i(false);
            this.g0 = false;
        } else {
            int n16;
            this.h0 = false;
            n4 = (int)(this.j0 ? 1 : 0);
            if (n4 != 0) {
                object2 = new StringBuilder();
                object3 = this.A;
                object4 = ": inside showVideoAd() starting refresh handler as Player give error so start refresh handler here ";
                com.jio.jioads.common.l.a((com.jio.jioads.common.b)object3, (StringBuilder)object2, (String)object4, (JioAds$Companion)object);
                object = this.w;
                if (object != null) {
                    object.d();
                }
            }
            object = this.G;
            object2 = "container";
            if (object != null && (n16 = this.Z) == n3 && (object = this.U) != null && (n16 = (int)(((com.jio.jioads.videomodule.s)object).c() ? 1 : 0)) == n3 && (object = this.d) != null && (object = this.A.K()) == (object3 = JioAdView$AD_TYPE.INTERSTITIAL)) {
                com.jio.jioads.videomodule.s s7 = this.U;
                if (s7 != null) {
                    object = this.G;
                    Intrinsics.checkNotNull(object);
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    s7.h = object;
                    object2 = s7.e0;
                    if (object2 != null) {
                        Intrinsics.checkNotNullParameter(object, (String)object5);
                        ((com.jio.jioads.videomodule.renderer.e)object2).e = object;
                    }
                    s7.t();
                    s7.j();
                }
            } else {
                Object object9;
                object = this.G;
                if (object != null && (n16 = this.Z) == n8 && (object = this.V) != null && (n16 = (int)(((com.jio.jioads.videomodule.s)object).c() ? 1 : 0)) == n3 && (object9 = this.d) != null && (object9 = this.A.K()) == (object = JioAdView$AD_TYPE.INTERSTITIAL)) {
                    object9 = this.V;
                    if (object9 != null) {
                        object = this.G;
                        Intrinsics.checkNotNull(object);
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        ((com.jio.jioads.videomodule.s)object9).h = object;
                        object2 = ((com.jio.jioads.videomodule.s)object9).e0;
                        if (object2 != null) {
                            Intrinsics.checkNotNullParameter(object, (String)object5);
                            ((com.jio.jioads.videomodule.renderer.e)object2).e = object;
                        }
                        ((com.jio.jioads.videomodule.s)object9).t();
                        ((com.jio.jioads.videomodule.s)object9).j();
                    }
                } else {
                    object9 = this.G;
                    if (object9 != null && (object9 = this.A.K()) == (object = JioAdView$AD_TYPE.INTERSTITIAL) && (object9 = this.U) != null) {
                        object = this.G;
                        Intrinsics.checkNotNull(object);
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        ((com.jio.jioads.videomodule.s)object9).h = object;
                        object2 = ((com.jio.jioads.videomodule.s)object9).e0;
                        if (object2 != null) {
                            Intrinsics.checkNotNullParameter(object, (String)object5);
                            ((com.jio.jioads.videomodule.renderer.e)object2).e = object;
                        }
                        ((com.jio.jioads.videomodule.s)object9).t();
                        ((com.jio.jioads.videomodule.s)object9).j();
                    }
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
    public final String a(String string2) {
        void var13_103;
        boolean bl2;
        String string3;
        String string4;
        String string5;
        Object object;
        block60: {
            String string6;
            block57: {
                String string7;
                String string8;
                int n3;
                block59: {
                    String string9;
                    block58: {
                        block56: {
                            Constants$DynamicDisplaySize constants$DynamicDisplaySize;
                            String string10;
                            String string11;
                            String string12;
                            String string13;
                            String string14;
                            String string15;
                            String string16;
                            String string17;
                            String string18;
                            String string19;
                            float f5;
                            NativeAdViewRenderer nativeAdViewRenderer;
                            block49: {
                                void var13_95;
                                String string20;
                                int n4;
                                int n7;
                                int n8;
                                int n10;
                                int n14;
                                block54: {
                                    block55: {
                                        block51: {
                                            int n15;
                                            int n16;
                                            block53: {
                                                int n17;
                                                int n18;
                                                block52: {
                                                    int n19;
                                                    int n20;
                                                    block50: {
                                                        float f6;
                                                        Boolean bl3;
                                                        Boolean bl4;
                                                        ViewGroup viewGroup;
                                                        ViewGroup viewGroup2;
                                                        Boolean bl5;
                                                        float f7;
                                                        String string21;
                                                        float f8;
                                                        float f11;
                                                        nativeAdViewRenderer = this;
                                                        object = string2;
                                                        ViewGroup viewGroup3 = this.A.A();
                                                        n3 = 0;
                                                        f5 = 0.0f;
                                                        string5 = null;
                                                        if (viewGroup3 != null) {
                                                            n14 = viewGroup3.getWidth();
                                                        } else {
                                                            n14 = 0;
                                                            f11 = 0.0f;
                                                            Object var4_6 = null;
                                                        }
                                                        ViewGroup viewGroup4 = nativeAdViewRenderer.A.A();
                                                        if (viewGroup4 != null) {
                                                            n10 = viewGroup4.getHeight();
                                                        } else {
                                                            n10 = 0;
                                                            f8 = 0.0f;
                                                            Object var10_47 = null;
                                                        }
                                                        nativeAdViewRenderer.t = object;
                                                        Boolean bl6 = nativeAdViewRenderer.A.O();
                                                        Boolean bl7 = Boolean.TRUE;
                                                        n16 = Intrinsics.areEqual(bl6, bl7);
                                                        n20 = 1;
                                                        float f12 = Float.MIN_VALUE;
                                                        n8 = 0;
                                                        float f14 = 0.0f;
                                                        string19 = null;
                                                        if (n16 != 0 && (string21 = nativeAdViewRenderer.t) != null && (n16 = string21.length()) != 0) {
                                                            void var4_14;
                                                            void var13_66;
                                                            void var4_11;
                                                            String string22 = nativeAdViewRenderer.t;
                                                            if (string22 != null) {
                                                                String[] stringArray = new String[]{"x"};
                                                                n16 = 6;
                                                                f7 = 8.4E-45f;
                                                                List list = StringsKt.a0(string22, stringArray, false, 0, n16);
                                                            } else {
                                                                n14 = 0;
                                                                Object var4_10 = null;
                                                                f11 = 0.0f;
                                                            }
                                                            Utility utility = Utility.INSTANCE;
                                                            if (var4_11 != null) {
                                                                String string23 = (String)var4_11.get(0);
                                                            } else {
                                                                n16 = 0;
                                                                Object var13_65 = null;
                                                                f7 = 0.0f;
                                                            }
                                                            Intrinsics.checkNotNull(var13_66);
                                                            f7 = Float.parseFloat((String)var13_66);
                                                            n16 = utility.convertDpToPixel(f7);
                                                            if (var4_11 != null) {
                                                                String string24 = (String)var4_11.get(n20);
                                                            } else {
                                                                n14 = 0;
                                                                Object var4_13 = null;
                                                                f11 = 0.0f;
                                                            }
                                                            Intrinsics.checkNotNull(var4_14);
                                                            f11 = Float.parseFloat((String)var4_14);
                                                            n10 = utility.convertDpToPixel(f11);
                                                            n14 = n16;
                                                        }
                                                        if ((n16 = (int)(Intrinsics.areEqual(bl5 = nativeAdViewRenderer.A.y(), bl7) ? 1 : 0)) != 0 && (viewGroup2 = nativeAdViewRenderer.s) != null) {
                                                            void var14_107;
                                                            void var13_72;
                                                            StringBuilder stringBuilder = new StringBuilder();
                                                            j_0.i(nativeAdViewRenderer.A, stringBuilder, ": getContainerSize : Vertical Ad so considering Device width and Height");
                                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                                                            Utility utility = Utility.INSTANCE;
                                                            Context context = nativeAdViewRenderer.j;
                                                            Object[] objectArray = utility.getScreenHeightAndWidth(context);
                                                            String string25 = (String)tp_2.A(objectArray);
                                                            String string26 = "0";
                                                            if (string25 == null) {
                                                                String string27 = string26;
                                                            }
                                                            n16 = Integer.parseInt((String)var13_72);
                                                            String string28 = (String)tp_2.E(n20, objectArray);
                                                            if (string28 != null) {
                                                                String string29 = string28;
                                                            }
                                                            f8 = Integer.parseInt((String)var14_107);
                                                            n10 = utility.convertDpToPixel(f8);
                                                            f7 = n16;
                                                            n14 = utility.convertDpToPixel(f7);
                                                            int n21 = n10;
                                                            n10 = n14;
                                                            n14 = n21;
                                                        }
                                                        if ((viewGroup = nativeAdViewRenderer.A.A()) != null && (n16 = (int)(Intrinsics.areEqual(bl4 = nativeAdViewRenderer.A.y(), bl3 = Boolean.FALSE) ? 1 : 0)) != 0) {
                                                            ViewGroup viewGroup5 = nativeAdViewRenderer.A.A();
                                                            if (viewGroup5 != null) {
                                                                n14 = viewGroup5.getWidth();
                                                            } else {
                                                                n14 = 0;
                                                                f11 = 0.0f;
                                                                Object var4_21 = null;
                                                            }
                                                            ViewGroup viewGroup6 = nativeAdViewRenderer.A.A();
                                                            if (viewGroup6 != null) {
                                                                n10 = viewGroup6.getHeight();
                                                            } else {
                                                                n10 = 0;
                                                                f8 = 0.0f;
                                                                Object var10_58 = null;
                                                            }
                                                            StringBuilder stringBuilder = new StringBuilder();
                                                            String string30 = nativeAdViewRenderer.A.P();
                                                            stringBuilder.append(string30);
                                                            stringBuilder.append(": AdContainer height is :getContainerSize ");
                                                            stringBuilder.append(n10);
                                                            stringBuilder.append(" Width is : ");
                                                            stringBuilder.append(n14);
                                                            n7 = 32;
                                                            f6 = 4.5E-44f;
                                                            stringBuilder.append((char)n7);
                                                            String string31 = stringBuilder.toString();
                                                            String string32 = "message";
                                                            Intrinsics.checkNotNullParameter(string31, string32);
                                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                                                            if (n14 > 0 || n10 > 0) {
                                                                n14 = 0;
                                                                f11 = 0.0f;
                                                                Object var4_23 = null;
                                                                n10 = 0;
                                                                f8 = 0.0f;
                                                                Object var10_59 = null;
                                                            }
                                                        }
                                                        string18 = "jio_dynamic_ad_layout_160_600";
                                                        string17 = "jio_content_stream";
                                                        string16 = "jio_dynamic_ad_layout_300_600";
                                                        string15 = "jio_dynamic_ad_layout_320_100";
                                                        string14 = "jio_dynamic_ad_layout_970_250";
                                                        string13 = "";
                                                        string6 = "jio_dynamic_ad_layout";
                                                        if (n14 == 0 || n10 == 0) break block49;
                                                        nativeAdViewRenderer.t = object;
                                                        object = Utility.INSTANCE;
                                                        f5 = 970.0f;
                                                        n3 = ((Utility)object).convertDpToPixel(f5);
                                                        f12 = 728.0f;
                                                        n20 = ((Utility)object).convertDpToPixel(f12);
                                                        f14 = 600.0f;
                                                        n8 = ((Utility)object).convertDpToPixel(f14);
                                                        float f15 = 320.0f;
                                                        n18 = ((Utility)object).convertDpToPixel(f15);
                                                        float f16 = 300.0f;
                                                        n15 = ((Utility)object).convertDpToPixel(f16);
                                                        String string33 = string18;
                                                        f7 = 250.0f;
                                                        n16 = ((Utility)object).convertDpToPixel(f7);
                                                        String string34 = string17;
                                                        f6 = 160.0f;
                                                        n7 = ((Utility)object).convertDpToPixel(f6);
                                                        String string35 = string16;
                                                        float f17 = 100.0f;
                                                        n17 = ((Utility)object).convertDpToPixel(f17);
                                                        String string36 = string15;
                                                        float f18 = 90.0f;
                                                        n19 = ((Utility)object).convertDpToPixel(f18);
                                                        String string37 = string14;
                                                        float f19 = 50.0f;
                                                        n4 = ((Utility)object).convertDpToPixel(f19);
                                                        string14 = nativeAdViewRenderer.t;
                                                        Constants$DynamicDisplaySize constants$DynamicDisplaySize2 = Constants$DynamicDisplaySize.SIZE_970x250;
                                                        string20 = string13;
                                                        string13 = constants$DynamicDisplaySize2.getDynamicSize();
                                                        boolean bl8 = Intrinsics.areEqual(string14, string13);
                                                        if (bl8) {
                                                            if (n3 <= n14 && n16 <= n10) {
                                                                String string38 = string37;
                                                                return var13_95;
                                                            }
                                                            object = Constants$DynamicDisplaySize.SIZE_970x90.getDynamicSize();
                                                            String string39 = nativeAdViewRenderer.a((String)object);
                                                            return var13_95;
                                                        }
                                                        string13 = Constants$DynamicDisplaySize.SIZE_970x90.getDynamicSize();
                                                        bl8 = Intrinsics.areEqual(string14, string13);
                                                        if (!bl8) break block50;
                                                        if (n3 > n14 || n19 > n10) {
                                                            object = Constants$DynamicDisplaySize.SIZE_728x90.getDynamicSize();
                                                            String string40 = nativeAdViewRenderer.a((String)object);
                                                            return var13_95;
                                                        }
                                                        break block51;
                                                    }
                                                    string5 = Constants$DynamicDisplaySize.SIZE_728x90.getDynamicSize();
                                                    n3 = (int)(Intrinsics.areEqual(string14, string5) ? 1 : 0);
                                                    if (n3 == 0) break block52;
                                                    if (n20 > n14 || n19 > n10) {
                                                        object = Constants$DynamicDisplaySize.SIZE_320x100.getDynamicSize();
                                                        String string41 = nativeAdViewRenderer.a((String)object);
                                                        return var13_95;
                                                    }
                                                    break block51;
                                                }
                                                string5 = Constants$DynamicDisplaySize.SIZE_320x100.getDynamicSize();
                                                n3 = (int)(Intrinsics.areEqual(string14, string5) ? 1 : 0);
                                                if (n3 != 0) {
                                                    if (n18 <= n14 && n17 <= n10) {
                                                        String string42 = string15;
                                                        return var13_95;
                                                    }
                                                    object = Constants$DynamicDisplaySize.SIZE_320x50.getDynamicSize();
                                                    String string43 = nativeAdViewRenderer.a((String)object);
                                                    return var13_95;
                                                }
                                                string5 = Constants$DynamicDisplaySize.SIZE_320x50.getDynamicSize();
                                                n3 = (int)(Intrinsics.areEqual(string14, string5) ? 1 : 0);
                                                if (n3 == 0) break block53;
                                                if (n18 > n14 || n4 > n10) {
                                                    object = Constants$DynamicDisplaySize.SIZE_300x600.getDynamicSize();
                                                    String string44 = nativeAdViewRenderer.a((String)object);
                                                    return var13_95;
                                                }
                                                break block51;
                                            }
                                            string5 = Constants$DynamicDisplaySize.SIZE_300x600.getDynamicSize();
                                            n3 = (int)(Intrinsics.areEqual(string14, string5) ? 1 : 0);
                                            if (n3 != 0) {
                                                if (n15 <= n14 && n8 <= n10) {
                                                    String string45 = string16;
                                                    return var13_95;
                                                }
                                                object = Constants$DynamicDisplaySize.SIZE_300x250.getDynamicSize();
                                                String string46 = nativeAdViewRenderer.a((String)object);
                                                return var13_95;
                                            }
                                            string5 = Constants$DynamicDisplaySize.SIZE_300x250.getDynamicSize();
                                            n3 = (int)(Intrinsics.areEqual(string14, string5) ? 1 : 0);
                                            if (n3 != 0) {
                                                if (n15 <= n14 && n16 <= n10) {
                                                    String string47 = string17;
                                                    return var13_95;
                                                }
                                                object = Constants$DynamicDisplaySize.SIZE_300x50.getDynamicSize();
                                                String string48 = nativeAdViewRenderer.a((String)object);
                                                return var13_95;
                                            }
                                            string5 = Constants$DynamicDisplaySize.SIZE_300x50.getDynamicSize();
                                            n3 = (int)(Intrinsics.areEqual(string14, string5) ? 1 : 0);
                                            if (n3 == 0) break block54;
                                            if (n15 > n14 || n4 > n10) break block55;
                                        }
                                        String string49 = string6;
                                        return var13_95;
                                    }
                                    object = Constants$DynamicDisplaySize.SIZE_160x600.getDynamicSize();
                                    try {
                                        String string50 = nativeAdViewRenderer.a((String)object);
                                        return var13_95;
                                    }
                                    catch (Throwable throwable) {
                                        Throwable throwable2 = throwable;
                                        throw throwable;
                                    }
                                }
                                object = Constants$DynamicDisplaySize.SIZE_160x600.getDynamicSize();
                                n4 = (int)(Intrinsics.areEqual(string14, object) ? 1 : 0);
                                if (n4 != 0 && n7 <= n14 && n8 <= n10) {
                                    return var13_95;
                                }
                                String string51 = string20;
                                return var13_95;
                            }
                            string4 = string18;
                            string8 = string17;
                            string7 = string16;
                            string9 = string15;
                            String string52 = string14;
                            string3 = string13;
                            Boolean bl9 = Boolean.FALSE;
                            object = nativeAdViewRenderer.g;
                            Object object2 = object != null ? (object = ((com.jio.jioads.native.parser.a)object).p) : null;
                            bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            if (bl2 || (bl2 = nativeAdViewRenderer.A0)) {
                                n3 = 1;
                                f5 = Float.MIN_VALUE;
                            }
                            Boolean bl10 = n3 != 0;
                            List list = nativeAdViewRenderer.A.a();
                            object = nativeAdViewRenderer.g;
                            String string53 = object != null ? (string12 = ((com.jio.jioads.native.parser.a)object).o) : null;
                            String string54 = object != null ? (string11 = ((com.jio.jioads.native.parser.a)object).b) : null;
                            String string55 = object != null ? (string10 = ((com.jio.jioads.native.parser.a)object).l) : null;
                            if (object != null) {
                                string19 = ((com.jio.jioads.native.parser.a)object).f;
                            }
                            object = nativeAdViewRenderer.t;
                            n3 = Intrinsics.areEqual(object = com.jio.jioads.native.utils.b.a(bl9, (String)object2, bl10, list, string53, string54, string55, string19, (String)object), string5 = (constants$DynamicDisplaySize = Constants$DynamicDisplaySize.SIZE_970x250).getDynamicSize());
                            if (n3 != 0) {
                                nativeAdViewRenderer.t = object = constants$DynamicDisplaySize.getDynamicSize();
                                String string56 = string52;
                                return var13_103;
                            }
                            Constants$DynamicDisplaySize constants$DynamicDisplaySize3 = Constants$DynamicDisplaySize.SIZE_970x90;
                            string5 = constants$DynamicDisplaySize3.getDynamicSize();
                            n3 = Intrinsics.areEqual(object, string5);
                            if (n3 == 0) break block56;
                            nativeAdViewRenderer.t = object = constants$DynamicDisplaySize3.getDynamicSize();
                            break block57;
                        }
                        Constants$DynamicDisplaySize constants$DynamicDisplaySize = Constants$DynamicDisplaySize.SIZE_728x90;
                        string5 = constants$DynamicDisplaySize.getDynamicSize();
                        n3 = (int)(Intrinsics.areEqual(object, string5) ? 1 : 0);
                        if (n3 == 0) break block58;
                        nativeAdViewRenderer.t = object = constants$DynamicDisplaySize.getDynamicSize();
                        break block57;
                    }
                    Constants$DynamicDisplaySize constants$DynamicDisplaySize = Constants$DynamicDisplaySize.SIZE_320x100;
                    string5 = constants$DynamicDisplaySize.getDynamicSize();
                    n3 = (int)(Intrinsics.areEqual(object, string5) ? 1 : 0);
                    if (n3 != 0) {
                        nativeAdViewRenderer.t = object = constants$DynamicDisplaySize.getDynamicSize();
                        String string57 = string9;
                        return var13_103;
                    }
                    Constants$DynamicDisplaySize constants$DynamicDisplaySize4 = Constants$DynamicDisplaySize.SIZE_320x50;
                    string5 = constants$DynamicDisplaySize4.getDynamicSize();
                    n3 = (int)(Intrinsics.areEqual(object, string5) ? 1 : 0);
                    if (n3 == 0) break block59;
                    nativeAdViewRenderer.t = object = constants$DynamicDisplaySize4.getDynamicSize();
                    break block57;
                }
                Constants$DynamicDisplaySize constants$DynamicDisplaySize = Constants$DynamicDisplaySize.SIZE_300x600;
                string5 = constants$DynamicDisplaySize.getDynamicSize();
                n3 = (int)(Intrinsics.areEqual(object, string5) ? 1 : 0);
                if (n3 != 0) {
                    nativeAdViewRenderer.t = object = constants$DynamicDisplaySize.getDynamicSize();
                    String string58 = string7;
                    return var13_103;
                }
                Constants$DynamicDisplaySize constants$DynamicDisplaySize5 = Constants$DynamicDisplaySize.SIZE_300x250;
                string5 = constants$DynamicDisplaySize5.getDynamicSize();
                n3 = (int)(Intrinsics.areEqual(object, string5) ? 1 : 0);
                if (n3 != 0) {
                    nativeAdViewRenderer.t = object = constants$DynamicDisplaySize5.getDynamicSize();
                    String string59 = string8;
                    return var13_103;
                }
                Constants$DynamicDisplaySize constants$DynamicDisplaySize6 = Constants$DynamicDisplaySize.SIZE_300x50;
                string5 = constants$DynamicDisplaySize6.getDynamicSize();
                n3 = (int)(Intrinsics.areEqual(object, string5) ? 1 : 0);
                if (n3 == 0) break block60;
                nativeAdViewRenderer.t = object = constants$DynamicDisplaySize6.getDynamicSize();
            }
            String string60 = string6;
            return var13_103;
        }
        Constants$DynamicDisplaySize constants$DynamicDisplaySize = Constants$DynamicDisplaySize.SIZE_160x600;
        string5 = constants$DynamicDisplaySize.getDynamicSize();
        bl2 = Intrinsics.areEqual(object, string5);
        if (bl2) {
            nativeAdViewRenderer.t = object = constants$DynamicDisplaySize.getDynamicSize();
            String string61 = string4;
            return var13_103;
        }
        String string62 = string3;
        return var13_103;
    }

    public final void a() {
        Object object = new StringBuilder();
        j_0.i(this.A, (StringBuilder)object, ": Image URL is in GIF Format");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = this.A.K();
        Object object3 = JioAdView$AD_TYPE.CONTENT_STREAM;
        String string2 = null;
        if (object2 != object3 && (object2 = this.A.K()) != (object3 = JioAdView$AD_TYPE.INTERSTITIAL)) {
            object2 = this.A.K();
            if (object2 == (object3 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) {
                ViewGroup viewGroup = this.G;
                if (viewGroup != null) {
                    object = this.g;
                    if (object != null) {
                        string2 = ((com.jio.jioads.native.parser.a)object).p;
                    }
                    Intrinsics.checkNotNull(viewGroup);
                    int n3 = this.M;
                    int n4 = this.N;
                    String string3 = "mainImageByteArray";
                    boolean bl2 = true;
                    this.b(n3, n4, (View)viewGroup, string2, string3, bl2);
                } else {
                    object2 = new StringBuilder();
                    object3 = this.A;
                    string2 = ": mediaLayout is null for DynamicDisplay ad";
                    com.jio.jioads.common.l.a((com.jio.jioads.common.b)object3, (StringBuilder)object2, string2, (JioAds$Companion)object);
                }
            }
        } else {
            ViewGroup viewGroup = this.G;
            if (viewGroup != null) {
                object = this.g;
                if (object != null) {
                    string2 = ((com.jio.jioads.native.parser.a)object).p;
                }
                Intrinsics.checkNotNull(viewGroup);
                int n7 = this.M;
                int n8 = this.N;
                String string4 = "mainImageByteArray";
                boolean bl3 = true;
                this.b(n7, n8, (View)viewGroup, string2, string4, bl3);
            } else {
                object2 = new StringBuilder();
                object3 = this.A;
                string2 = ": mediaLayout is null for ContentStream Or Interstitial ad";
                com.jio.jioads.common.l.a((com.jio.jioads.common.b)object3, (StringBuilder)object2, string2, (JioAds$Companion)object);
            }
        }
    }

    public final void a(int n3, int n4, View view, String string2, String string3, boolean bl2) {
        HashMap hashMap = this.m;
        h h3 = new h(string3, n3, n4, bl2);
        hashMap.put(string2, h3);
        this.n.put(string2, view);
    }

    public final void a(View view) {
        boolean bl2;
        Object object;
        Object object2 = this.A.k0();
        if (object2 != (object = JioAdView$AdState.DESTROYED) && (bl2 = Intrinsics.areEqual(object2 = this.A.y(), object = Boolean.TRUE))) {
            if (view != null) {
                object2 = new j(this);
                view.setOnTouchListener((View.OnTouchListener)object2);
            }
            object2 = this.A.Y();
            object = new B(this);
            view = new GestureDetector((Context)object2, (GestureDetector.OnGestureListener)object);
            this.b = view;
        }
    }

    /*
     * Exception decompiling
     */
    public final void a(View var1_1, String var2_4, String var3_5, String var4_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 63->67)] java.lang.Exception
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

    /*
     * Exception decompiling
     */
    public final void a(View var1_1, List var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [137[FORLOOP]], but top level block is 80[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public final void a(ViewGroup object, List object2) {
        block18: {
            String string2;
            block19: {
                string2 = "message";
                Object object3 = this.get_cTAFallbackUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.H0 = object3;
                if (object == null) break block18;
                object3 = new StringBuilder();
                Object object4 = this.A;
                object4 = object4.P();
                ((StringBuilder)object3).append((String)object4);
                object4 = "  registerImpression from NativeAd";
                ((StringBuilder)object3).append((String)object4);
                object3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object3, string2);
                object3 = JioAds.Companion;
                object3 = ((JioAds$Companion)object3).getInstance();
                ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                if (object2 == null) break block19;
                int n3 = object2.size();
                object4 = null;
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object5 = object2.get(i3);
                    object5 = (View)object5;
                    object5.setOnClickListener(null);
                    object5.setOnTouchListener(null);
                    continue;
                }
            }
            try {
                this.a((View)object, (List)object2);
            }
            catch (Exception exception) {
                object = new StringBuilder();
                object2 = this.A.P();
                object.append((String)object2);
                object.append(": ");
                object2 = Unit.a;
                object.append(object2);
                Intrinsics.checkNotNullParameter(object.toString(), string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
    }

    public final void a(JioAdError$JioAdErrorType jioAdError$JioAdErrorType, String object) {
        Object object2 = new StringBuilder();
        l_0.d(this.A, (StringBuilder)object2, " : ", (String)object);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        object = j_0.c(JioAdError.Companion, jioAdError$JioAdErrorType, (String)object);
        object3 = new StringBuilder();
        Object object4 = this.A;
        String string2 = ": NativeAd: setJioAdError() ERROR: ";
        j_0.n((com.jio.jioads.common.b)object4, (StringBuilder)object3, string2);
        object4 = ((JioAdError)object).getErrorDescription();
        ((StringBuilder)object3).append((String)object4);
        object3 = ((StringBuilder)object3).toString();
        object4 = "message";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = this.A;
        object3 = JioAdView$AdState.FAILED;
        object2.j((JioAdView$AdState)((Object)object3));
        object2 = this.w;
        if (object2 != null) {
            object = ((JioAdError)object).getErrorDescription();
            object2.f(jioAdError$JioAdErrorType, (String)object);
        }
    }

    public final void a(Integer n3) {
        int n4;
        if (n3 != null && (n4 = n3.intValue()) > 0) {
            Object object = Looper.getMainLooper();
            Handler handler = new Handler(object);
            object = new f(this);
            long l2 = n3.intValue();
            int n7 = 1000;
            long l3 = n7;
            handler.postDelayed((Runnable)object, l2 *= l3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string2, JioEventTracker$TrackingEvents jioEventTracker$TrackingEvents) {
        Exception exception2;
        Object object;
        Object object2;
        Object object3;
        NativeAdViewRenderer nativeAdViewRenderer;
        block22: {
            Object object4;
            Object object5;
            block19: {
                int n3;
                boolean bl2;
                Object object6;
                Object object7;
                int n4;
                Object object8;
                Object object9;
                ArrayList<Object> arrayList;
                int n7;
                block21: {
                    block20: {
                        nativeAdViewRenderer = this;
                        object5 = string2;
                        object3 = jioEventTracker$TrackingEvents;
                        object2 = "[frt]";
                        object = "fre=";
                        try {
                            n7 = string2.length();
                            object4 = "message";
                            if (n7 <= 0) break block19;
                            arrayList = com.jio.jioads.util.i.a;
                            object9 = null;
                            object8 = StringsKt.F(string2, (CharSequence)object2, false);
                            if (object8 == (n4 = 1)) {
                                object8 = 1;
                            } else {
                                object8 = 0;
                                object7 = null;
                            }
                            object6 = nativeAdViewRenderer.j;
                            if (object6 != null && object3 == (object6 = JioEventTracker$TrackingEvents.EVENT_IMPRESSION) && (bl2 = com.jio.jioads.util.i.l((com.jio.jioads.common.c)(object6 = nativeAdViewRenderer.h))) && object8 != 0) {
                                object7 = new StringBuilder((String)object);
                                object = nativeAdViewRenderer.h;
                                object = (com.jio.jioads.controller.f)object;
                                object = ((com.jio.jioads.controller.f)object).j();
                                ((StringBuilder)object7).append(object);
                                object = "&[frt]";
                                ((StringBuilder)object7).append((String)object);
                                object = ((StringBuilder)object7).toString();
                                object7 = nativeAdViewRenderer.j;
                                Intrinsics.checkNotNull(object7);
                                object5 = kotlin.text.b.n((String)object5, (String)object2, (String)object, false);
                                object2 = nativeAdViewRenderer.A;
                                object2 = object2.P();
                                object = nativeAdViewRenderer.h;
                                object5 = ((com.jio.jioads.util.i)((Object)arrayList)).m((Context)object7, (String)object5, (String)object2, (com.jio.jioads.common.c)object);
                            }
                            object2 = this.o();
                            int n8 = ((Object)object2).length;
                            n3 = 2;
                            arrayList = "";
                            if (n8 == n3) {
                                object2 = new StringBuilder();
                                object7 = this.o();
                                object8 = object7[0];
                                ((StringBuilder)object2).append((int)object8);
                                object8 = 120;
                                ((StringBuilder)object2).append((char)object8);
                                object7 = this.o();
                                object8 = object7[n4];
                                ((StringBuilder)object2).append((int)object8);
                                object7 = object2 = ((StringBuilder)object2).toString();
                            } else {
                                object7 = arrayList;
                            }
                            object2 = nativeAdViewRenderer.A;
                            object2 = object2.K();
                            object6 = JioAdView$AD_TYPE.INTERSTITIAL;
                            if (object2 != object6 || (n8 = (int)(this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0)) == 0) break block20;
                            bl2 = true;
                            break block21;
                        }
                        catch (Exception exception2) {
                            break block22;
                        }
                    }
                    bl2 = false;
                    object6 = null;
                }
                object9 = new ArrayList();
                ((ArrayList)object9).add(object5);
                int n10 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (n10 != 0) {
                    n10 = nativeAdViewRenderer.Z;
                    if (n10 == n4) {
                        object5 = nativeAdViewRenderer.U;
                        if (object5 != null && (object5 = ((com.jio.jioads.videomodule.s)object5).l) != null) {
                            arrayList = object5;
                        }
                        nativeAdViewRenderer.w0 = arrayList;
                    } else if (n10 == n3) {
                        object5 = nativeAdViewRenderer.V;
                        if (object5 != null && (object5 = ((com.jio.jioads.videomodule.s)object5).l) != null) {
                            arrayList = object5;
                        }
                        nativeAdViewRenderer.w0 = arrayList;
                    }
                }
                if ((n10 = (int)(TextUtils.isEmpty((CharSequence)(object5 = nativeAdViewRenderer.w0)) ? 1 : 0)) != 0) {
                    object5 = Utility.INSTANCE;
                    object2 = nativeAdViewRenderer.A;
                    object2 = object2.P();
                    nativeAdViewRenderer.w0 = object5 = ((Utility)object5).getCcbValue((String)object2);
                }
                object5 = new StringBuilder();
                object2 = nativeAdViewRenderer.A;
                object2 = object2.P();
                ((StringBuilder)object5).append((String)object2);
                object2 = ": NativeAdViewRenderer eventType: ";
                ((StringBuilder)object5).append((String)object2);
                ((StringBuilder)object5).append(object3);
                object2 = " ccbValue : ";
                ((StringBuilder)object5).append((String)object2);
                object2 = nativeAdViewRenderer.w0;
                ((StringBuilder)object5).append((String)object2);
                object5 = ((StringBuilder)object5).toString();
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object5 = JioAds.Companion;
                object5 = ((JioAds$Companion)object5).getInstance();
                ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object5 = JioAds$LogLevel.NONE;
                object2 = new JioEventTracker();
                object = nativeAdViewRenderer.A;
                object4 = n4;
                object5 = nativeAdViewRenderer.h;
                object5 = (com.jio.jioads.controller.f)object5;
                object5 = ((com.jio.jioads.controller.f)object5).a;
                n7 = 0;
                arrayList = null;
                object5 = com.jio.jioads.controller.o.o((com.jio.jioads.controller.o)object5, null, null, null);
                Object object10 = nativeAdViewRenderer.v;
                if (object10 != null) {
                    n4 = object10.getWidth();
                    object10 = n4;
                } else {
                    n4 = 0;
                    object10 = null;
                }
                String string3 = String.valueOf(object10);
                object10 = nativeAdViewRenderer.v;
                if (object10 != null) {
                    n7 = object10.getHeight();
                    arrayList = n7;
                }
                String string4 = String.valueOf(arrayList);
                String string5 = "";
                arrayList = nativeAdViewRenderer.h;
                arrayList = (com.jio.jioads.controller.f)((Object)arrayList);
                arrayList = ((com.jio.jioads.controller.f)((Object)arrayList)).a;
                boolean bl3 = ((com.jio.jioads.controller.o)((Object)arrayList)).a();
                arrayList = nativeAdViewRenderer.h;
                arrayList = (com.jio.jioads.controller.f)((Object)arrayList);
                arrayList = ((com.jio.jioads.controller.f)((Object)arrayList)).a;
                n7 = ((com.jio.jioads.controller.o)((Object)arrayList)).k;
                String string6 = nativeAdViewRenderer.w0;
                object10 = nativeAdViewRenderer.A;
                String string7 = object10.m0();
                int n14 = 98304;
                n4 = 0;
                object10 = null;
                String string8 = string6;
                string6 = null;
                object3 = jioEventTracker$TrackingEvents;
                arrayList = object9;
                object9 = object7;
                object8 = bl2;
                object6 = object5;
                JioEventTracker.fireEvents$default((JioEventTracker)object2, jioEventTracker$TrackingEvents, (com.jio.jioads.common.b)object, arrayList, (Integer)object4, (String)object7, bl2, false, (String)object5, false, string3, string4, string5, bl3, n7, string8, null, null, string7, n14, null);
                return;
            }
            object5 = new StringBuilder();
            object2 = this.A;
            object2 = object2.P();
            ((StringBuilder)object5).append((String)object2);
            object2 = ": Context or AdView is null or no urls available to fire for impression";
            ((StringBuilder)object5).append((String)object2);
            object5 = ((StringBuilder)object5).toString();
            Intrinsics.checkNotNullParameter(object5, (String)object4);
            object5 = JioAds.Companion;
            object5 = ((JioAds$Companion)object5).getInstance();
            ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
            return;
        }
        object2 = new StringBuilder();
        object3 = nativeAdViewRenderer.A;
        object = ": Exception occurs in firing track event: ";
        j_0.n((com.jio.jioads.common.b)object3, (StringBuilder)object2, (String)object);
        object3 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object3, exception2, (StringBuilder)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    public final void a(boolean bl2) {
        Object object;
        Object object2 = this.v;
        if (object2 != null && (object2 = this.A.K()) == (object = JioAdView$AD_TYPE.INTERSTITIAL)) {
            Object object3 = new StringBuilder();
            object2 = this.A;
            object = ": Firing Impression for image based ad: is need to fire viewableImpression: ";
            j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object);
            boolean bl3 = this.D;
            ((StringBuilder)object3).append(bl3);
            object3 = ((StringBuilder)object3).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object3, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            object3 = this.w;
            if (object3 != null && !(bl2 = object3.e()) && !(bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease())) {
                this.O();
                object3 = this.w;
                if (object3 != null) {
                    bl3 = true;
                    object3.i(bl3);
                }
            }
            if (bl2 = this.D) {
                object3 = this.w;
                if (object3 != null) {
                    bl3 = false;
                    object2 = null;
                    object3.e(false);
                }
                this.a0();
            }
            return;
        }
        object2 = this.v;
        if (object2 != null) {
            object = new i(this, bl2);
            object2.post((Runnable)object);
        }
    }

    public final boolean a(ViewGroup object) {
        boolean bl2;
        block8: {
            Object object2;
            block10: {
                block11: {
                    Object object3;
                    JioAdView$AD_TYPE jioAdView$AD_TYPE;
                    block9: {
                        int n3;
                        int n4;
                        int n7;
                        int n8;
                        float f5;
                        int n10;
                        bl2 = true;
                        if (object == null || (object2 = this.A.K()) != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INFEED) && (object2 = this.A.K()) != (object3 = JioAdView$AD_TYPE.CONTENT_STREAM)) break block8;
                        object2 = object.getLayoutParams();
                        object3 = this.A.K();
                        if (object3 == jioAdView$AD_TYPE) {
                            n10 = 50;
                            f5 = 7.0E-44f;
                        } else {
                            n10 = 250;
                            f5 = 3.5E-43f;
                        }
                        object3 = this.A.K();
                        JioAdView$AD_TYPE jioAdView$AD_TYPE2 = JioAdView$AD_TYPE.CUSTOM_NATIVE;
                        if (object3 == jioAdView$AD_TYPE2 || object2 == null) break block9;
                        int n14 = ((ViewGroup.LayoutParams)object2).width;
                        int n15 = -1;
                        float f6 = 0.0f / 0.0f;
                        if (n14 == n15 || n14 == (n8 = -2) || (n7 = ((ViewGroup.LayoutParams)object2).height) == n15 || n7 == n8) break block9;
                        object = Utility.INSTANCE;
                        f6 = 300;
                        n15 = ((Utility)object).convertDpToPixel(f6);
                        if (n14 == n15 && (n4 = ((ViewGroup.LayoutParams)object2).height) == (n3 = ((Utility)object).convertDpToPixel(f5 = (float)n10))) break block10;
                        break block11;
                    }
                    object2 = object.findViewWithTag((Object)"NativeIconLayout");
                    jioAdView$AD_TYPE = object.findViewWithTag((Object)"NativeTitle");
                    object3 = "NativeMediaLayout";
                    object = object.findViewWithTag(object3);
                    if (object2 == null) {
                        bl2 = false;
                    }
                    if (jioAdView$AD_TYPE == null) {
                        bl2 = false;
                    }
                    if ((object2 = this.A.K()) != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.CONTENT_STREAM) || object != null) break block10;
                }
                bl2 = false;
            }
            if (!bl2) {
                object = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                object2 = "Custom container failed to set";
                this.a((JioAdError$JioAdErrorType)((Object)object), (String)object2);
            }
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    public final void a0() {
        block14: {
            Object object;
            int n4;
            Object object2;
            Object object3;
            Object object4;
            block13: {
                boolean bl2;
                boolean bl22;
                block12: {
                    void var6_15;
                    int n3;
                    void var6_10;
                    boolean bl3;
                    object4 = new StringBuilder();
                    j_0.i(this.A, (StringBuilder)object4, ": inside startViewableImpressionTimer");
                    object4 = JioAds.Companion;
                    ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    object3 = this.v;
                    bl22 = false;
                    object2 = null;
                    n4 = 1;
                    if (object3 == null) break block12;
                    object3 = this.w;
                    if (object3 != null) {
                        object3 = object3.a();
                    } else {
                        boolean n32 = false;
                        object3 = null;
                    }
                    if (object3 != null || (object3 = this.w) == null || (bl3 = object3.i())) break block12;
                    object3 = this.v;
                    if (object3 != null) {
                        object = Utility.INSTANCE;
                        int n7 = 5;
                        boolean bl4 = ((Utility)object).checkVisibility((ViewGroup)object3, n7);
                    } else {
                        boolean bl5 = false;
                        object3 = null;
                    }
                    if (var6_10 == false) break block12;
                    object3 = this.A;
                    int n8 = object3.W();
                    if (n8 == 0 && (object3 = this.g) != null && (object3 = ((com.jio.jioads.native.parser.a)object3).F) != null && (n3 = object3.isEmpty() ^ n4) == n4) {
                        boolean bl6 = true;
                    } else {
                        boolean bl7 = false;
                        object3 = null;
                    }
                    if (var6_15 != false && (object3 = this.A.K()) != (object = JioAdView$AD_TYPE.INSTREAM_AUDIO)) break block13;
                }
                if ((object3 = this.w) != null && !(bl2 = object3.i())) {
                    bl22 = true;
                }
                if (!bl22 || (object3 = this.A.K()) != (object2 = JioAdView$AD_TYPE.INTERSTITIAL)) break block14;
            }
            object3 = new StringBuilder();
            object2 = this.A;
            object = ": inside startViewableTimer";
            com.jio.jioads.common.l.a((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object, (JioAds$Companion)object4);
            object4 = this.w;
            if (object4 != null) {
                object3 = this.A;
                object2 = "jioAdView";
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                int n10 = object3.W();
                long l2 = n10 != 0 && n10 == n4 ? 2000L : 1000L;
                object4.h(l2);
            }
            if ((object4 = this.w) != null) {
                object4.c();
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String b(String object) {
        void var11_98;
        String string2;
        int n3;
        Object object2;
        block60: {
            String string3;
            block57: {
                String string4;
                String string5;
                int n4;
                block59: {
                    String string6;
                    block58: {
                        block56: {
                            Constants$DynamicDisplaySize constants$DynamicDisplaySize;
                            String string7;
                            String string8;
                            String string9;
                            String string10;
                            String string11;
                            String string12;
                            String string13;
                            String string14;
                            String string15;
                            String string16;
                            String string17;
                            int n7;
                            NativeAdViewRenderer nativeAdViewRenderer;
                            block49: {
                                void var11_90;
                                String string18;
                                int n8;
                                int n10;
                                block54: {
                                    block55: {
                                        block51: {
                                            String string19;
                                            int n14;
                                            int n15;
                                            int n16;
                                            block53: {
                                                int n17;
                                                int n18;
                                                block52: {
                                                    int n19;
                                                    int n20;
                                                    block50: {
                                                        float f5;
                                                        Boolean bl2;
                                                        Boolean bl3;
                                                        ViewGroup viewGroup;
                                                        ViewGroup viewGroup2;
                                                        Boolean bl4;
                                                        float f6;
                                                        String string20;
                                                        float f7;
                                                        float f8;
                                                        nativeAdViewRenderer = this;
                                                        object2 = object;
                                                        this.t = object;
                                                        object2 = this.A.A();
                                                        n7 = 0;
                                                        Object var5_6 = null;
                                                        if (object2 != null) {
                                                            n3 = object2.getWidth();
                                                        } else {
                                                            n3 = 0;
                                                            f8 = 0.0f;
                                                            object2 = null;
                                                        }
                                                        ViewGroup viewGroup3 = nativeAdViewRenderer.A.A();
                                                        if (viewGroup3 != null) {
                                                            n4 = viewGroup3.getHeight();
                                                        } else {
                                                            n4 = 0;
                                                            f7 = 0.0f;
                                                            Object var8_28 = null;
                                                        }
                                                        Boolean bl5 = nativeAdViewRenderer.A.O();
                                                        Boolean bl6 = Boolean.TRUE;
                                                        n16 = Intrinsics.areEqual(bl5, bl6);
                                                        n15 = 1;
                                                        float f11 = Float.MIN_VALUE;
                                                        n20 = 0;
                                                        float f12 = 0.0f;
                                                        string17 = null;
                                                        if (n16 != 0 && (string20 = nativeAdViewRenderer.t) != null && (n16 = TextUtils.isEmpty((CharSequence)string20)) == 0) {
                                                            void var11_58;
                                                            object2 = nativeAdViewRenderer.t;
                                                            if (object2 != null) {
                                                                String[] stringArray = new String[]{"x"};
                                                                n16 = 6;
                                                                f6 = 8.4E-45f;
                                                                object2 = StringsKt.a0((CharSequence)object2, stringArray, false, 0, n16);
                                                            } else {
                                                                n3 = 0;
                                                                object2 = null;
                                                                f8 = 0.0f;
                                                            }
                                                            Utility utility = Utility.INSTANCE;
                                                            if (object2 != null) {
                                                                String string21 = (String)object2.get(0);
                                                            } else {
                                                                n16 = 0;
                                                                Object var11_57 = null;
                                                                f6 = 0.0f;
                                                            }
                                                            Intrinsics.checkNotNull(var11_58);
                                                            f6 = Float.parseFloat((String)var11_58);
                                                            n16 = utility.convertDpToPixel(f6);
                                                            if (object2 != null) {
                                                                object2 = (String)object2.get(n15);
                                                            } else {
                                                                n3 = 0;
                                                                object2 = null;
                                                                f8 = 0.0f;
                                                            }
                                                            Intrinsics.checkNotNull(object2);
                                                            f8 = Float.parseFloat((String)object2);
                                                            n4 = utility.convertDpToPixel(f8);
                                                            n3 = n16;
                                                        }
                                                        if ((n16 = Intrinsics.areEqual(bl4 = nativeAdViewRenderer.A.y(), bl6)) != 0 && (viewGroup2 = nativeAdViewRenderer.s) != null) {
                                                            void var12_102;
                                                            void var11_64;
                                                            object2 = new StringBuilder();
                                                            j_0.i(nativeAdViewRenderer.A, (StringBuilder)object2, ": getContainerSizeForVastAd : Vertical Ad so considering Device width and Height");
                                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                            object2 = JioAds$LogLevel.NONE;
                                                            object2 = Utility.INSTANCE;
                                                            Context context = nativeAdViewRenderer.j;
                                                            Object[] objectArray = ((Utility)object2).getScreenHeightAndWidth(context);
                                                            String string22 = (String)tp_2.A(objectArray);
                                                            String string23 = "0";
                                                            if (string22 == null) {
                                                                String string24 = string23;
                                                            }
                                                            n16 = Integer.parseInt((String)var11_64);
                                                            String string25 = (String)tp_2.E(n15, objectArray);
                                                            if (string25 != null) {
                                                                String string26 = string25;
                                                            }
                                                            f7 = Integer.parseInt((String)var12_102);
                                                            n4 = ((Utility)object2).convertDpToPixel(f7);
                                                            f6 = n16;
                                                            n3 = ((Utility)object2).convertDpToPixel(f6);
                                                            int n21 = n4;
                                                            n4 = n3;
                                                            n3 = n21;
                                                        }
                                                        if ((viewGroup = nativeAdViewRenderer.A.A()) != null && (n16 = (int)(Intrinsics.areEqual(bl3 = nativeAdViewRenderer.A.y(), bl2 = Boolean.FALSE) ? 1 : 0)) != 0) {
                                                            object2 = nativeAdViewRenderer.A.A();
                                                            if (object2 != null) {
                                                                n3 = object2.getWidth();
                                                            } else {
                                                                n3 = 0;
                                                                f8 = 0.0f;
                                                                object2 = null;
                                                            }
                                                            ViewGroup viewGroup4 = nativeAdViewRenderer.A.A();
                                                            if (viewGroup4 != null) {
                                                                n4 = viewGroup4.getHeight();
                                                            } else {
                                                                n4 = 0;
                                                                f7 = 0.0f;
                                                                Object var8_39 = null;
                                                            }
                                                            StringBuilder stringBuilder = new StringBuilder();
                                                            String string27 = nativeAdViewRenderer.A.P();
                                                            stringBuilder.append(string27);
                                                            stringBuilder.append(": AdContainer height is :getContainerSizeForVastAd ");
                                                            stringBuilder.append(n4);
                                                            stringBuilder.append(" Width is : ");
                                                            stringBuilder.append(n3);
                                                            n10 = 32;
                                                            f5 = 4.5E-44f;
                                                            stringBuilder.append((char)n10);
                                                            String string28 = stringBuilder.toString();
                                                            String string29 = "message";
                                                            Intrinsics.checkNotNullParameter(string28, string29);
                                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                            JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                                                            if (n3 > 0 || n4 > 0) {
                                                                n3 = 0;
                                                                f8 = 0.0f;
                                                                object2 = null;
                                                                n4 = 0;
                                                                f7 = 0.0f;
                                                                Object var8_41 = null;
                                                            }
                                                        }
                                                        string16 = "jio_dynamic_ad_layout_160_600";
                                                        string15 = "jio_content_stream";
                                                        string14 = "jio_dynamic_ad_layout_300_600";
                                                        string13 = "jio_dynamic_ad_layout_320_100";
                                                        string12 = "jio_dynamic_ad_layout_970_250";
                                                        string11 = "";
                                                        string3 = "jio_dynamic_ad_layout";
                                                        if (n3 == 0 || n4 == 0) break block49;
                                                        Utility utility = Utility.INSTANCE;
                                                        f11 = 970.0f;
                                                        n15 = utility.convertDpToPixel(f11);
                                                        f12 = 728.0f;
                                                        n20 = utility.convertDpToPixel(f12);
                                                        float f14 = 600.0f;
                                                        n8 = utility.convertDpToPixel(f14);
                                                        float f15 = 320.0f;
                                                        n18 = utility.convertDpToPixel(f15);
                                                        float f16 = 300.0f;
                                                        n14 = utility.convertDpToPixel(f16);
                                                        object = string16;
                                                        f6 = 250.0f;
                                                        n16 = utility.convertDpToPixel(f6);
                                                        String string30 = string15;
                                                        f5 = 160.0f;
                                                        n10 = utility.convertDpToPixel(f5);
                                                        String string31 = string14;
                                                        float f17 = 100.0f;
                                                        n17 = utility.convertDpToPixel(f17);
                                                        String string32 = string13;
                                                        float f18 = 90.0f;
                                                        n19 = utility.convertDpToPixel(f18);
                                                        String string33 = string12;
                                                        float f19 = 50.0f;
                                                        n7 = utility.convertDpToPixel(f19);
                                                        string12 = nativeAdViewRenderer.t;
                                                        Constants$DynamicDisplaySize constants$DynamicDisplaySize2 = Constants$DynamicDisplaySize.SIZE_970x250;
                                                        string18 = string11;
                                                        string11 = constants$DynamicDisplaySize2.getDynamicSize();
                                                        boolean bl7 = Intrinsics.areEqual(string12, string11);
                                                        if (bl7) {
                                                            if (n15 <= n3 && n16 <= n4) {
                                                                String string34 = string33;
                                                                return var11_90;
                                                            }
                                                            object2 = Constants$DynamicDisplaySize.SIZE_970x90.getDynamicSize();
                                                            String string35 = nativeAdViewRenderer.b((String)object2);
                                                            return var11_90;
                                                        }
                                                        string11 = Constants$DynamicDisplaySize.SIZE_970x90.getDynamicSize();
                                                        bl7 = Intrinsics.areEqual(string12, string11);
                                                        if (!bl7) break block50;
                                                        if (n15 > n3 || n19 > n4) {
                                                            object2 = Constants$DynamicDisplaySize.SIZE_728x90.getDynamicSize();
                                                            String string36 = nativeAdViewRenderer.b((String)object2);
                                                            return var11_90;
                                                        }
                                                        break block51;
                                                    }
                                                    string19 = Constants$DynamicDisplaySize.SIZE_728x90.getDynamicSize();
                                                    n15 = (int)(Intrinsics.areEqual(string12, string19) ? 1 : 0);
                                                    if (n15 == 0) break block52;
                                                    if (n20 > n3 || n19 > n4) {
                                                        object2 = Constants$DynamicDisplaySize.SIZE_320x100.getDynamicSize();
                                                        String string37 = nativeAdViewRenderer.b((String)object2);
                                                        return var11_90;
                                                    }
                                                    break block51;
                                                }
                                                string19 = Constants$DynamicDisplaySize.SIZE_320x100.getDynamicSize();
                                                n15 = (int)(Intrinsics.areEqual(string12, string19) ? 1 : 0);
                                                if (n15 != 0) {
                                                    if (n18 <= n3 && n17 <= n4) {
                                                        String string38 = string13;
                                                        return var11_90;
                                                    }
                                                    object2 = Constants$DynamicDisplaySize.SIZE_320x50.getDynamicSize();
                                                    String string39 = nativeAdViewRenderer.b((String)object2);
                                                    return var11_90;
                                                }
                                                string19 = Constants$DynamicDisplaySize.SIZE_320x50.getDynamicSize();
                                                n15 = (int)(Intrinsics.areEqual(string12, string19) ? 1 : 0);
                                                if (n15 == 0) break block53;
                                                if (n18 > n3 || n7 > n4) {
                                                    object2 = Constants$DynamicDisplaySize.SIZE_300x600.getDynamicSize();
                                                    String string40 = nativeAdViewRenderer.b((String)object2);
                                                    return var11_90;
                                                }
                                                break block51;
                                            }
                                            string19 = Constants$DynamicDisplaySize.SIZE_300x600.getDynamicSize();
                                            n15 = (int)(Intrinsics.areEqual(string12, string19) ? 1 : 0);
                                            if (n15 != 0) {
                                                if (n14 <= n3 && n8 <= n4) {
                                                    String string41 = string14;
                                                    return var11_90;
                                                }
                                                object2 = Constants$DynamicDisplaySize.SIZE_300x250.getDynamicSize();
                                                String string42 = nativeAdViewRenderer.b((String)object2);
                                                return var11_90;
                                            }
                                            string19 = Constants$DynamicDisplaySize.SIZE_300x250.getDynamicSize();
                                            n15 = (int)(Intrinsics.areEqual(string12, string19) ? 1 : 0);
                                            if (n15 != 0) {
                                                if (n14 <= n3 && n16 <= n4) {
                                                    String string43 = string15;
                                                    return var11_90;
                                                }
                                                object2 = Constants$DynamicDisplaySize.SIZE_300x50.getDynamicSize();
                                                String string44 = nativeAdViewRenderer.b((String)object2);
                                                return var11_90;
                                            }
                                            String string45 = Constants$DynamicDisplaySize.SIZE_300x50.getDynamicSize();
                                            n16 = (int)(Intrinsics.areEqual(string12, string45) ? 1 : 0);
                                            if (n16 == 0) break block54;
                                            if (n14 > n3 || n7 > n4) break block55;
                                        }
                                        String string46 = string3;
                                        return var11_90;
                                    }
                                    object2 = Constants$DynamicDisplaySize.SIZE_160x600.getDynamicSize();
                                    try {
                                        String string47 = nativeAdViewRenderer.b((String)object2);
                                        return var11_90;
                                    }
                                    catch (Throwable throwable) {
                                        Throwable throwable2 = throwable;
                                        throw throwable;
                                    }
                                }
                                String string48 = Constants$DynamicDisplaySize.SIZE_160x600.getDynamicSize();
                                n7 = (int)(Intrinsics.areEqual(string12, string48) ? 1 : 0);
                                if (n7 != 0 && n10 <= n3 && n8 <= n4) {
                                    Object object3 = object;
                                    return var11_90;
                                }
                                String string49 = string18;
                                return var11_90;
                            }
                            object = string16;
                            string5 = string15;
                            string4 = string14;
                            string6 = string13;
                            String string50 = string12;
                            string2 = string11;
                            Boolean bl8 = Boolean.FALSE;
                            object2 = nativeAdViewRenderer.g;
                            Object object4 = object2 != null ? (object2 = ((com.jio.jioads.native.parser.a)object2).p) : null;
                            n3 = (int)(this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0);
                            if (n3 != 0 || (n3 = (int)(nativeAdViewRenderer.A0 ? 1 : 0)) != 0) {
                                n7 = 1;
                            }
                            Boolean bl9 = n7 != 0;
                            List list = nativeAdViewRenderer.A.a();
                            object2 = nativeAdViewRenderer.g;
                            String string51 = object2 != null ? (string10 = ((com.jio.jioads.native.parser.a)object2).o) : null;
                            String string52 = object2 != null ? (string9 = ((com.jio.jioads.native.parser.a)object2).b) : null;
                            String string53 = object2 != null ? (string8 = ((com.jio.jioads.native.parser.a)object2).l) : null;
                            if (object2 != null) {
                                string17 = ((com.jio.jioads.native.parser.a)object2).f;
                            }
                            object2 = nativeAdViewRenderer.t;
                            n4 = (int)(Intrinsics.areEqual(object2 = com.jio.jioads.native.utils.b.a(bl8, (String)object4, bl9, list, string51, string52, string53, string17, (String)object2), string7 = (constants$DynamicDisplaySize = Constants$DynamicDisplaySize.SIZE_970x250).getDynamicSize()) ? 1 : 0);
                            if (n4 != 0) {
                                nativeAdViewRenderer.t = object2 = constants$DynamicDisplaySize.getDynamicSize();
                                String string54 = string50;
                                return var11_98;
                            }
                            Constants$DynamicDisplaySize constants$DynamicDisplaySize3 = Constants$DynamicDisplaySize.SIZE_970x90;
                            String string55 = constants$DynamicDisplaySize3.getDynamicSize();
                            n4 = (int)(Intrinsics.areEqual(object2, string55) ? 1 : 0);
                            if (n4 == 0) break block56;
                            nativeAdViewRenderer.t = object2 = constants$DynamicDisplaySize3.getDynamicSize();
                            break block57;
                        }
                        Constants$DynamicDisplaySize constants$DynamicDisplaySize = Constants$DynamicDisplaySize.SIZE_728x90;
                        String string56 = constants$DynamicDisplaySize.getDynamicSize();
                        n4 = (int)(Intrinsics.areEqual(object2, string56) ? 1 : 0);
                        if (n4 == 0) break block58;
                        nativeAdViewRenderer.t = object2 = constants$DynamicDisplaySize.getDynamicSize();
                        break block57;
                    }
                    Constants$DynamicDisplaySize constants$DynamicDisplaySize = Constants$DynamicDisplaySize.SIZE_320x100;
                    String string57 = constants$DynamicDisplaySize.getDynamicSize();
                    n4 = (int)(Intrinsics.areEqual(object2, string57) ? 1 : 0);
                    if (n4 != 0) {
                        nativeAdViewRenderer.t = object2 = constants$DynamicDisplaySize.getDynamicSize();
                        String string58 = string6;
                        return var11_98;
                    }
                    Constants$DynamicDisplaySize constants$DynamicDisplaySize4 = Constants$DynamicDisplaySize.SIZE_320x50;
                    String string59 = constants$DynamicDisplaySize4.getDynamicSize();
                    n4 = (int)(Intrinsics.areEqual(object2, string59) ? 1 : 0);
                    if (n4 == 0) break block59;
                    nativeAdViewRenderer.t = object2 = constants$DynamicDisplaySize4.getDynamicSize();
                    break block57;
                }
                Constants$DynamicDisplaySize constants$DynamicDisplaySize = Constants$DynamicDisplaySize.SIZE_300x600;
                String string60 = constants$DynamicDisplaySize.getDynamicSize();
                n4 = (int)(Intrinsics.areEqual(object2, string60) ? 1 : 0);
                if (n4 != 0) {
                    nativeAdViewRenderer.t = object2 = constants$DynamicDisplaySize.getDynamicSize();
                    String string61 = string4;
                    return var11_98;
                }
                Constants$DynamicDisplaySize constants$DynamicDisplaySize5 = Constants$DynamicDisplaySize.SIZE_300x250;
                String string62 = constants$DynamicDisplaySize5.getDynamicSize();
                n4 = (int)(Intrinsics.areEqual(object2, string62) ? 1 : 0);
                if (n4 != 0) {
                    nativeAdViewRenderer.t = object2 = constants$DynamicDisplaySize5.getDynamicSize();
                    String string63 = string5;
                    return var11_98;
                }
                Constants$DynamicDisplaySize constants$DynamicDisplaySize6 = Constants$DynamicDisplaySize.SIZE_300x50;
                String string64 = constants$DynamicDisplaySize6.getDynamicSize();
                n4 = (int)(Intrinsics.areEqual(object2, string64) ? 1 : 0);
                if (n4 == 0) break block60;
                nativeAdViewRenderer.t = object2 = constants$DynamicDisplaySize6.getDynamicSize();
            }
            String string65 = string3;
            return var11_98;
        }
        Constants$DynamicDisplaySize constants$DynamicDisplaySize = Constants$DynamicDisplaySize.SIZE_160x600;
        String string66 = constants$DynamicDisplaySize.getDynamicSize();
        n3 = (int)(Intrinsics.areEqual(object2, string66) ? 1 : 0);
        if (n3 != 0) {
            nativeAdViewRenderer.t = object2 = constants$DynamicDisplaySize.getDynamicSize();
            Object object5 = object;
            return var11_98;
        }
        String string67 = string2;
        return var11_98;
    }

    public final String b(boolean bl2) {
        Context context = this.j;
        if (context != null) {
            int n3;
            Utility utility = Utility.INSTANCE;
            int n4 = utility.getCurrentUIModeType(context);
            if (n4 == (n3 = 4)) {
                return "jio_native_interstitial_landscape_stb";
            }
            boolean bl3 = utility.isDeviceTypeTablet(context);
            if (bl3) {
                return "jio_native_interstitial_tablet";
            }
            String string2 = bl2 ? "jio_native_interstitial_landscape" : "jio_native_interstitial";
            return string2;
        }
        return "";
    }

    public final void b() {
        Object object;
        float f5;
        int n3;
        int n4;
        Object object2 = new ArrayList();
        Object object3 = this.t;
        String string2 = null;
        String string3 = null;
        int n7 = 1;
        if (object3 != null && (n4 = object3.length()) != 0) {
            object2 = this.t;
            if (object2 != null) {
                object3 = new Context[]{"x"};
                n3 = 6;
                f5 = 8.4E-45f;
                object2 = StringsKt.a0((CharSequence)object2, (String[])object3, false, 0, n3);
            } else {
                boolean bl2 = false;
                object2 = null;
            }
        } else {
            object3 = this.A.y();
            n4 = (int)(Intrinsics.areEqual(object3, object = Boolean.TRUE) ? 1 : 0);
            if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object3 = this.A.O(), object) ? 1 : 0)) != 0) {
                int n8;
                object2 = this.A.m0();
                if (object2 != null && (n8 = ((String)object2).length()) != 0 && (n8 = ((String)(object2 = this.q())).length()) > 0) {
                    object2 = this.r();
                    object3 = this.q();
                    object2 = xx_2.i(object2, object3);
                } else {
                    object2 = new StringBuilder();
                    j_0.i(this.A, (StringBuilder)object2, ": addMainImageView : Vertical Ad so considering Device width and Height");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    object2 = Utility.INSTANCE;
                    object3 = this.j;
                    object2 = ((Utility)object2).getScreenHeightAndWidth((Context)object3);
                    object3 = (String)tp_2.A((Object[])object2);
                    object = "0";
                    if (object3 == null) {
                        object3 = object;
                    }
                    n4 = Integer.parseInt((String)object3);
                    if ((object2 = (String)tp_2.E(n7, (Object[])object2)) != null) {
                        object = object2;
                    }
                    n8 = Integer.parseInt((String)object);
                    object3 = String.valueOf(n4);
                    object2 = String.valueOf(n8);
                    object2 = xx_2.i(object3, object2);
                }
            }
        }
        object3 = this.j;
        ImageView imageView = new ImageView(object3);
        object3 = this.A.m0();
        if (object3 != null && (n4 = object3.length()) != 0 && (n4 = (object3 = this.q()).length()) > 0) {
            if (object2 != null) {
                object3 = (String)object2.get(n7);
            } else {
                n4 = 0;
                object3 = null;
            }
            if (object3 != null) {
                object3 = Utility.INSTANCE;
                object = (String)object2.get(n7);
                f5 = Float.parseFloat((String)object);
                n4 = object3.convertDpToPixel(f5);
                imageView.setMaxHeight(n4);
            }
        }
        imageView.setAdjustViewBounds(n7 != 0);
        object3 = ImageView.ScaleType.FIT_XY;
        imageView.setScaleType((ImageView.ScaleType)object3);
        object3 = this.A.K();
        object = JioAdView$AD_TYPE.CONTENT_STREAM;
        if (object3 != object && (object3 = this.A.K()) != (object = JioAdView$AD_TYPE.INTERSTITIAL)) {
            object3 = this.A.K();
            if (object3 == (object = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) && object2 != null) {
                object3 = new StringBuilder();
                object = this.A;
                String string4 = ":  dynamic sizes : ";
                j_0.n((com.jio.jioads.common.b)object, (StringBuilder)object3, string4);
                n3 = Integer.parseInt((String)object2.get(0));
                object3.append(n3);
                object3.append(" x ");
                n3 = Integer.parseInt((String)object2.get(n7));
                object3.append(n3);
                object3 = object3.toString();
                object = "message";
                Intrinsics.checkNotNullParameter(object3, (String)object);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object3 = this.g;
                if (object3 != null) {
                    string3 = object3.p;
                }
                object3 = (String)object2.get(0);
                int n10 = Integer.parseInt((String)object3);
                object2 = (String)object2.get(n7);
                int n14 = Integer.parseInt((String)object2);
                String string5 = "mainImageByteArray";
                object = this;
                this.b(n10, n14, (View)imageView, string3, string5, false);
            }
        } else {
            object2 = this.g;
            if (object2 != null) {
                string3 = ((com.jio.jioads.native.parser.a)object2).p;
            }
            int n15 = this.M;
            int n16 = this.N;
            String string6 = "mainImageByteArray";
            object = this;
            this.b(n15, n16, (View)imageView, string3, string6, false);
            object2 = new StringBuilder();
            object3 = this.A;
            string2 = ": image added";
            j_0.i((com.jio.jioads.common.b)object3, (StringBuilder)object2, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
        }
    }

    public final void b(int n3, int n4, View view, String string2, String string3, boolean bl2) {
        HashMap hashMap = this.m;
        Object object = new StringBuilder();
        Object object2 = this.A;
        String string4 = ": Inside initDataHolder";
        j_0.i(object2, (StringBuilder)object, string4);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = new h(string2, n3, n4, bl2);
        hashMap.put(string3, object2);
        this.n.put(string3, view);
        StringBuilder stringBuilder = new StringBuilder();
        Object object3 = this.A.P();
        stringBuilder.append((String)object3);
        stringBuilder.append(": key: ");
        stringBuilder.append(string3);
        stringBuilder.append(" , image : ");
        object3 = (h)this.m.get(string3);
        if (object3 != null) {
            object3 = ((h)object3).a;
        } else {
            n4 = 0;
            object3 = null;
        }
        d90_0.b(stringBuilder, (String)object3, "message", (JioAds$Companion)object);
    }

    public final String c(String object) {
        int n3;
        String[] stringArray;
        String string2 = "";
        boolean bl2 = Intrinsics.areEqual(object, string2);
        if (bl2) {
            object = JioAdError$JioAdErrorType.ERROR_WRONG_AD_SIZE;
            stringArray = "Wrong Ad size received for dynamic display";
            this.a((JioAdError$JioAdErrorType)((Object)object), (String)stringArray);
        }
        if ((object = this.t) == null) {
            object = JioAdError$JioAdErrorType.ERROR_WRONG_AD_SIZE;
            this.a((JioAdError$JioAdErrorType)((Object)object), "Display ad size is null");
            return string2;
        }
        stringArray = new String[]{"x"};
        object = StringsKt.a0(object, stringArray, false, 0, 6);
        stringArray = new String[0];
        int n4 = ((Object)(object = object.toArray(stringArray))).length;
        if (n4 >= (n3 = 2)) {
            return object[1];
        }
        object = JioAdError$JioAdErrorType.ERROR_WRONG_AD_SIZE;
        this.a((JioAdError$JioAdErrorType)((Object)object), "Display ad size format is incorrect");
        return string2;
    }

    public final void c(boolean bl2) {
        Object object;
        boolean bl3;
        String string2;
        Object object2 = new StringBuilder();
        j_0.i(this.A, (StringBuilder)object2, ": inside preparedAllViewsForRender");
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        object3 = this.s;
        String string3 = null;
        if (object3 != null) {
            string2 = "NativeTitle";
            object3 = (TextView)object3.findViewWithTag((Object)string2);
        } else {
            bl3 = false;
            object3 = null;
        }
        this.J = object3;
        object3 = this.s;
        if (object3 != null) {
            string2 = "NativeCTA";
            object3 = (TextView)object3.findViewWithTag((Object)string2);
        } else {
            bl3 = false;
            object3 = null;
        }
        this.i = object3;
        object3 = new StringBuilder();
        string2 = this.A.P();
        ((StringBuilder)object3).append(string2);
        ((StringBuilder)object3).append(" preparedAllViewsForRender callAfterDownloadMediaFile value: ");
        ((StringBuilder)object3).append(bl2);
        ((StringBuilder)object3).append(" isNativeVideoReadyToShowAfter5min value is: ");
        boolean bl4 = this.k0;
        ((StringBuilder)object3).append(bl4);
        bl4 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        ((StringBuilder)object3).append(bl4);
        object3 = ((StringBuilder)object3).toString();
        string2 = "message";
        Intrinsics.checkNotNullParameter(object3, string2);
        object3 = ((JioAds$Companion)object2).getInstance();
        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        bl3 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (bl3 && bl2) {
            object = new StringBuilder();
            object3 = this.A;
            string2 = " preparedAllViewsForRender start preparing video";
            j_0.i((com.jio.jioads.common.b)object3, (StringBuilder)object, string2);
            object = ((JioAds$Companion)object2).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            this.M();
        }
        if (bl2 = this.k0) {
            object = new StringBuilder();
            j_0.i(this.A, (StringBuilder)object, " inside isNativeVideoReadyToShowAfter5min setting all views");
            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            this.C();
            this.X();
            this.W();
            this.U();
            this.S();
            this.Q();
            object = new StringBuilder();
            object3 = this.A;
            string2 = ": handleCallbacks : call from preparedAllViewsForRender";
            com.jio.jioads.common.l.a((com.jio.jioads.common.b)object3, (StringBuilder)object, string2, (JioAds$Companion)object2);
            object = this.A;
            bl2 = object.l();
            if (!bl2) {
                object = this.g;
                if (object != null) {
                    string3 = ((com.jio.jioads.native.parser.a)object).p;
                }
                if (!(string3 != null && (bl2 = string3.length()) || !(bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) || (bl2 = this.g0))) {
                    object = new StringBuilder();
                    object3 = this.A;
                    string3 = ": Callback not giving as wait for Vast Success ad main image not in response";
                    com.jio.jioads.common.l.a((com.jio.jioads.common.b)object3, (StringBuilder)object, string3, (JioAds$Companion)object2);
                } else {
                    object = new StringBuilder();
                    object3 = this.A;
                    string3 = ": handleCallbacks : Giving onAdPreparedCallBack callback to publisher";
                    com.jio.jioads.common.l.a((com.jio.jioads.common.b)object3, (StringBuilder)object, string3, (JioAds$Companion)object2);
                    object = this.w;
                    if (object != null) {
                        object.b();
                    }
                }
            } else {
                object = new StringBuilder();
                object3 = this.A;
                string3 = ": onAdrefreshLoadAdCalled : call from handleCallbacks";
                com.jio.jioads.common.l.a((com.jio.jioads.common.b)object3, (StringBuilder)object, string3, (JioAds$Companion)object2);
                bl2 = this.u0;
                if (bl2) {
                    this.h();
                    bl2 = false;
                    object = null;
                    this.u0 = false;
                }
                if ((object = this.w) != null) {
                    object.f();
                }
            }
            bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (!bl2) {
                this.V();
            } else {
                object = this.i;
                if (object != null) {
                    int n3 = 8;
                    object.setVisibility(n3);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean c() {
        block58: {
            block59: {
                block60: {
                    block57: {
                        var1_1 /* !! */  = new StringBuilder();
                        var2_2 = this.A;
                        var3_3 = ": inside handleIconLayoutAddUrlInList";
                        com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var2_2, (StringBuilder)var1_1 /* !! */ , var3_3);
                        var1_1 /* !! */  = this.H;
                        var4_4 = 0;
                        var2_2 = null;
                        if (var1_1 /* !! */  == null) {
                            var1_1 /* !! */  = this.s;
                            if (var1_1 /* !! */  != null) {
                                var3_3 = "NativeIconLayout";
                                var1_1 /* !! */  = (FrameLayout)var1_1 /* !! */ .findViewWithTag((Object)var3_3);
                            } else {
                                var5_5 = '\u0000';
                                var1_1 /* !! */  = null;
                            }
                            this.H = var1_1 /* !! */ ;
                        }
                        if ((var1_1 /* !! */  = this.s) != null) {
                            var3_3 = "NativeMediaLayout";
                            var1_1 /* !! */  = (ViewGroup)var1_1 /* !! */ .findViewWithTag((Object)var3_3);
                        } else {
                            var5_5 = '\u0000';
                            var1_1 /* !! */  = null;
                        }
                        this.G = var1_1 /* !! */ ;
                        var1_1 /* !! */  = this.H;
                        var3_3 = null;
                        if (var1_1 /* !! */  != null) {
                            var1_1 /* !! */  = this.g;
                            if (var1_1 /* !! */  != null) {
                                var1_1 /* !! */  = var1_1 /* !! */ .o;
                            } else {
                                var5_5 = '\u0000';
                                var1_1 /* !! */  = null;
                            }
                            var5_5 = (char)TextUtils.isEmpty((CharSequence)var1_1 /* !! */ );
                            if (var5_5 == '\u0000') {
                                var1_1 /* !! */  = this.g;
                                if (var1_1 /* !! */  != null) {
                                    var1_1 /* !! */  = var1_1 /* !! */ .o;
                                } else {
                                    var5_5 = '\u0000';
                                    var1_1 /* !! */  = null;
                                }
                                this.e((String)var1_1 /* !! */ );
                            } else {
                                var1_1 /* !! */  = this.A.K();
                                if ((var1_1 /* !! */  != (var6_6 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) || (var5_5 = (char)Intrinsics.areEqual(var1_1 /* !! */  = this.t, var6_6 = Constants$DynamicDisplaySize.SIZE_728x90.getDynamicSize())) == '\u0000') && (var5_5 = (char)Intrinsics.areEqual(var1_1 /* !! */  = this.t, var6_6 = Constants$DynamicDisplaySize.SIZE_320x100.getDynamicSize())) == '\u0000' && (var5_5 = (char)Intrinsics.areEqual(var1_1 /* !! */  = this.t, var6_6 = Constants$DynamicDisplaySize.SIZE_970x90.getDynamicSize())) == '\u0000') {
                                    var1_1 /* !! */  = new StringBuilder();
                                    var6_6 = this.A;
                                    var7_7 = ": icon layout is null so making it invisible";
                                    com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var6_6, (StringBuilder)var1_1 /* !! */ , var7_7);
                                    var1_1 /* !! */  = this.H;
                                    if (var1_1 /* !! */  != null) {
                                        var8_9 = 8;
                                        var1_1 /* !! */ .setVisibility(var8_9);
                                    }
                                } else {
                                    var1_1 /* !! */  = this.g;
                                    if (var1_1 /* !! */  != null) {
                                        var1_1 /* !! */  = var1_1 /* !! */ .p;
                                    } else {
                                        var5_5 = '\u0000';
                                        var1_1 /* !! */  = null;
                                    }
                                    var5_5 = (char)TextUtils.isEmpty((CharSequence)var1_1 /* !! */ );
                                    if (var5_5 == '\u0000') {
                                        var1_1 /* !! */  = new StringBuilder();
                                        var6_6 = this.A;
                                        var7_8 = ": icon url is null and main image is available so considering main image";
                                        com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var6_6, (StringBuilder)var1_1 /* !! */ , var7_8);
                                        var1_1 /* !! */  = this.g;
                                        if (var1_1 /* !! */  != null) {
                                            var1_1 /* !! */  = var1_1 /* !! */ .p;
                                        } else {
                                            var5_5 = '\u0000';
                                            var1_1 /* !! */  = null;
                                        }
                                        this.e((String)var1_1 /* !! */ );
                                        this.l = false;
                                    }
                                }
                            }
                        }
                        var1_1 /* !! */  = this.A;
                        var5_5 = var1_1 /* !! */ .W();
                        var8_9 = 6;
                        var9_10 = '\u0001';
                        if (var5_5 != '\u0000' || (var1_1 /* !! */  = this.t) == null || (var5_5 = var1_1 /* !! */ .length()) == '\u0000') ** GOTO lbl-1000
                        var1_1 /* !! */  = this.t;
                        Intrinsics.checkNotNull(var1_1 /* !! */ );
                        var10_11 = new String[]{"x"};
                        var1_1 /* !! */  = (String)StringsKt.a0((CharSequence)var1_1 /* !! */ , (String[])var10_11, false, 0, var8_9).get(var9_10);
                        var5_5 = Integer.parseInt((String)var1_1 /* !! */ );
                        var11_12 = '\u00fa';
                        if (var5_5 >= var11_12) {
                            var5_5 = (char)this.A0;
                            if (var5_5 != '\u0000' && (var1_1 /* !! */  = this.z0) == null) {
                                var1_1 /* !! */  = this.g;
                                if (var1_1 /* !! */  != null) {
                                    var1_1 /* !! */  = var1_1 /* !! */ .p;
                                } else {
                                    var5_5 = '\u0000';
                                    var1_1 /* !! */  = null;
                                }
                                if ((var1_1 /* !! */  == null || (var5_5 = var1_1 /* !! */ .length()) == '\u0000') && (var5_5 = (char)this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == '\u0000') {
                                    var1_1 /* !! */  = JioAdError$JioAdErrorType.ERROR_INSUFFICIENT_ELEMENTS;
                                    this.a((JioAdError$JioAdErrorType)var1_1 /* !! */ , "carousal container is not available");
                                    this.A0 = false;
                                    return false;
                                }
                            }
                            if ((var5_5 = (char)this.A0) == '\u0000' && (var1_1 /* !! */  = this.z0) != null && (var1_1 /* !! */  = this.G) == null) {
                                var1_1 /* !! */  = JioAdError$JioAdErrorType.ERROR_INSUFFICIENT_ELEMENTS;
                                this.a((JioAdError$JioAdErrorType)var1_1 /* !! */ , "carousel ad is not available");
                                this.A0 = false;
                                return false;
                            }
                        } else lbl-1000:
                        // 2 sources

                        {
                            var1_1 /* !! */  = new StringBuilder();
                            var10_11 = this.A;
                            var12_13 = ": disable carousel for small custom sizes";
                            com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var10_11, (StringBuilder)var1_1 /* !! */ , var12_13);
                            this.A0 = false;
                        }
                        if ((var1_1 /* !! */  = this.G) == null) break block58;
                        var1_1 /* !! */  = this.A.K();
                        if (var1_1 /* !! */  != (var10_11 = JioAdView$AD_TYPE.CONTENT_STREAM) && (var1_1 /* !! */  = this.A.K()) != (var10_11 = JioAdView$AD_TYPE.INTERSTITIAL) && (var1_1 /* !! */  = this.A.K()) != (var10_11 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) {
                            return (boolean)var9_10;
                        }
                        var5_5 = (char)this.A0;
                        if (var5_5 != '\u0000') {
                            return (boolean)var9_10;
                        }
                        var1_1 /* !! */  = this.g;
                        if (var1_1 /* !! */  != null) {
                            var1_1 /* !! */  = var1_1 /* !! */ .p;
                        } else {
                            var5_5 = '\u0000';
                            var1_1 /* !! */  = null;
                        }
                        var5_5 = (char)TextUtils.isEmpty((CharSequence)var1_1 /* !! */ );
                        if (var5_5 != '\u0000') break block59;
                        var1_1 /* !! */  = this.g;
                        if (var1_1 /* !! */  != null) {
                            var1_1 /* !! */  = var1_1 /* !! */ .p;
                        } else {
                            var5_5 = '\u0000';
                            var1_1 /* !! */  = null;
                        }
                        var10_11 = new StringBuilder();
                        var12_13 = this.A.P();
                        var10_11.append(var12_13);
                        var10_11.append(": Main image url: ");
                        var10_11.append((String)var1_1 /* !! */ );
                        com.jio.jioads.util.j.a(var10_11.toString());
                        var10_11 = this.G;
                        var12_13 = "message";
                        if (var10_11 == null) break block60;
                        try {
                            var10_11 = new URL((String)var1_1 /* !! */ );
                            var1_1 /* !! */  = var10_11.getPath();
                            if (var1_1 /* !! */  == null) break block57;
                            var4_4 = 47;
                        }
                        catch (Exception v0) {}
                        var4_4 = StringsKt.Q((CharSequence)var1_1 /* !! */ , (char)var4_4, 0, var8_9);
                        var11_12 = '\\';
                        var8_9 = StringsKt.Q((CharSequence)var1_1 /* !! */ , var11_12, 0, var8_9);
                        var4_4 = Math.max(var4_4, var8_9) + var9_10;
                        var2_2 = var1_1 /* !! */ .substring(var4_4);
                        var1_1 /* !! */  = "this as java.lang.String).substring(startIndex)";
                        Intrinsics.checkNotNullExpressionValue(var2_2, (String)var1_1 /* !! */ );
                    }
                    var1_1 /* !! */  = new StringBuilder();
                    var6_6 = this.A;
                    var6_6 = var6_6.P();
                    var1_1 /* !! */ .append((String)var6_6);
                    var6_6 = ": File name = ";
                    var1_1 /* !! */ .append((String)var6_6);
                    var1_1 /* !! */ .append((String)var2_2);
                    var1_1 /* !! */  = var1_1 /* !! */ .toString();
                    Intrinsics.checkNotNullParameter(var1_1 /* !! */ , var12_13);
                    var1_1 /* !! */  = JioAds.Companion;
                    var1_1 /* !! */  = var1_1 /* !! */ .getInstance();
                    var1_1 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var1_1 /* !! */  = JioAds$LogLevel.NONE;
                    var5_5 = (char)TextUtils.isEmpty((CharSequence)var2_2);
                    if (var5_5 != '\u0000' || var2_2 == null) ** GOTO lbl208
                    var1_1 /* !! */  = Locale.getDefault();
                    var6_6 = "getDefault(...)";
                    Intrinsics.checkNotNullExpressionValue(var1_1 /* !! */ , (String)var6_6);
                    var1_1 /* !! */  = var2_2.toLowerCase((Locale)var1_1 /* !! */ );
                    var2_2 = "this as java.lang.String).toLowerCase(locale)";
                    Intrinsics.checkNotNullExpressionValue(var1_1 /* !! */ , (String)var2_2);
                    if (var1_1 /* !! */  == null) ** GOTO lbl208
                    var2_2 = ".gif";
                    var5_5 = (char)StringsKt.F((CharSequence)var1_1 /* !! */ , (CharSequence)var2_2, false);
                    if (var5_5 != var9_10) ** GOTO lbl208
                    this.a();
                    break block58;
lbl208:
                    // 3 sources

                    this.b();
                    break block58;
                }
                var1_1 /* !! */  = new StringBuilder();
                var2_2 = this.A;
                var3_3 = ": No mediaLayout available to render image";
                j_0.i((com.jio.jioads.common.b)var2_2, (StringBuilder)var1_1 /* !! */ , var3_3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var1_1 /* !! */  = JioAds$LogLevel.NONE;
                break block58;
            }
            var1_1 /* !! */  = new StringBuilder();
            var2_2 = this.A.P();
            var1_1 /* !! */ .append((String)var2_2);
            var2_2 = ": Main Image Url is not present";
            var1_1 /* !! */ .append((String)var2_2);
            var1_1 /* !! */  = var1_1 /* !! */ .toString();
            com.jio.jioads.util.j.b((String)var1_1 /* !! */ );
            var5_5 = (char)this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (var5_5 == '\u0000') {
                var1_1 /* !! */  = JioAdError$JioAdErrorType.ERROR_INSUFFICIENT_ELEMENTS;
                this.a((JioAdError$JioAdErrorType)var1_1 /* !! */ , "");
                return false;
            }
        }
        return (boolean)var9_10;
    }

    public final void clearAllData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        int n3;
        boolean bl2;
        Timer timer;
        Object object = "message";
        Intrinsics.checkNotNullParameter("Inside ClearAllData() Native ad renderer class", (String)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = this.U;
        if (object2 != null) {
            ((com.jio.jioads.videomodule.s)object2).u();
        }
        object2 = null;
        this.U = null;
        object = this.V;
        if (object != null) {
            ((com.jio.jioads.videomodule.s)object).u();
        }
        this.V = null;
        object = this.t0;
        if (object != null) {
            ((com.jio.jioads.native.utils.a)object).a();
        }
        if ((object = this.t0) != null) {
            timer = ((com.jio.jioads.native.utils.a)object).e;
            if (timer != null) {
                timer.cancel();
            }
            ((com.jio.jioads.native.utils.a)object).a = null;
            ((com.jio.jioads.native.utils.a)object).e = null;
            ((com.jio.jioads.native.utils.a)object).b = null;
        }
        this.t0 = null;
        object = this.s;
        if (object != null) {
            object.removeAllViews();
        }
        if ((object = this.v) != null) {
            timer = this.s;
            object.removeView((View)timer);
        }
        if ((object = this.v) != null) {
            object.removeAllViews();
        }
        this.Q = object = "0";
        timer = null;
        this.i0 = false;
        nz0_2 nz0_22 = fh1_2.f();
        this.e = nz0_22;
        this.g = null;
        this.i = null;
        this.k = bl2 = true;
        this.l = bl2;
        this.m.clear();
        this.o = n3 = -1;
        this.p = n3;
        this.q = n3;
        this.r = 0;
        this.s = null;
        this.t = null;
        this.x = null;
        this.y = null;
        this.z = false;
        this.B = n3;
        this.C = false;
        this.E = null;
        this.F = null;
        this.G = null;
        this.I = bl2;
        this.J = null;
        this.K = false;
        this.r0 = null;
        this.m.clear();
        this.L.clear();
        this.M = 320;
        this.N = n3 = 200;
        LinkedHashMap linkedHashMap = this.O;
        linkedHashMap.clear();
        this.Q = object;
        object = this.W;
        if (object != null) {
            ((com.jio.jioads.instreamads.vastparser.n)object).t();
        }
        this.W = null;
        this.f0 = false;
        this.k0 = bl2;
        this.l0 = false;
        this.m0 = false;
        this.g0 = false;
        this.h0 = bl2;
        this.Z = (int)(bl2 ? 1 : 0);
        this.a0 = null;
        this.b0 = 0;
        object = this.G;
        if (object != null) {
            this.G = null;
        }
        this.w0 = "";
        this.s0 = null;
        this.r0 = null;
        this.j0 = false;
    }

    public final String d(String object) {
        String[] stringArray;
        String string2 = "";
        boolean bl2 = Intrinsics.areEqual(object, string2);
        if (bl2) {
            object = JioAdError$JioAdErrorType.ERROR_WRONG_AD_SIZE;
            stringArray = "Wrong Ad size received for dynamic display";
            this.a((JioAdError$JioAdErrorType)((Object)object), (String)stringArray);
        }
        if ((object = this.t) == null) {
            object = JioAdError$JioAdErrorType.ERROR_WRONG_AD_SIZE;
            this.a((JioAdError$JioAdErrorType)((Object)object), "Display ad size is null");
            return string2;
        }
        stringArray = new String[]{"x"};
        object = StringsKt.a0(object, stringArray, false, 0, 6);
        stringArray = new String[]{};
        object = object.toArray(stringArray);
        int n3 = ((Object)object).length;
        int n4 = 1;
        if (n3 == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            stringArray = null;
        }
        if ((n3 ^= n4) != 0) {
            return object[0];
        }
        object = JioAdError$JioAdErrorType.ERROR_WRONG_AD_SIZE;
        this.a((JioAdError$JioAdErrorType)((Object)object), "Display ad size format is incorrect");
        return string2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        block15: {
            var1_1 = this;
            var2_2 = 1;
            var3_3 = new StringBuilder();
            var4_4 = this.A;
            var5_5 /* !! */  = ": inside attachNativeAdViewToContainerView";
            j_0.i((com.jio.jioads.common.b)var4_4, (StringBuilder)var3_3, var5_5 /* !! */ );
            var3_3 = JioAds.Companion;
            var3_3.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var4_4 = JioAds$LogLevel.NONE;
            try {
                var4_4 = this.A;
                var6_6 = var4_4.W();
                var5_5 /* !! */  = "message";
                if (var6_6 != var2_2) ** GOTO lbl68
                var4_4 = this.A;
                if ((var4_4 = var4_4.K()) != (var7_7 = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
                }
                ** GOTO lbl-1000
            }
            catch (Exception var8_8) {
                break block15;
            }
            {
                var4_4 = this.A;
                var4_4 = var4_4.K();
                var7_7 = JioAdView$AD_TYPE.INTERSTITIAL;
                if (var4_4 == var7_7) ** GOTO lbl-1000
            }
            {
                var4_4 = this.A;
                if ((var4_4 = var4_4.K()) == (var7_7 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) ** GOTO lbl-1000
            }
            {
                var4_4 = this.A;
                if ((var4_4 = var4_4.K()) != (var7_7 = JioAdView$AD_TYPE.INSTREAM_AUDIO)) ** GOTO lbl68
            }
lbl-1000:
            // 4 sources

            {
                var4_4 = var1_1.A;
                if ((var4_4 = var4_4.K()) != (var7_7 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) ** GOTO lbl65
            }
            {
                var4_4 = var1_1.A;
                var6_6 = (int)Intrinsics.areEqual(var4_4 = var4_4.y(), var7_7 = Boolean.TRUE);
                if (var6_6 != 0) {
                    var4_4 = new StringBuilder();
                    var7_7 = var1_1.A;
                    var7_7 = var7_7.P();
                    var4_4.append((String)var7_7);
                    var7_7 = ": Inside attachNativeAdViewToContainerView isFullScreen ";
                    var4_4.append((String)var7_7);
                    var7_7 = var1_1.A;
                    var7_7 = var7_7.y();
                    var4_4.append(var7_7);
                    var4_4 = var4_4.toString();
                    Intrinsics.checkNotNullParameter(var4_4, var5_5 /* !! */ );
                    var3_3 = var3_3.getInstance();
                    var3_3.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var3_3 = new ey2_2(var1_1, var2_2);
                    com.jio.jioads.util.s.d((Function0)var3_3);
                    return;
                }
                var8_9 = this.R();
                var3_3 = var1_1.d((String)var8_9);
                var8_9 = var1_1.c((String)var8_9);
                var9_13 = Integer.parseInt((String)var3_3);
                if (var9_13 < (var6_6 = 100)) {
                    var2_2 = Integer.parseInt((String)var8_9);
                    if (var2_2 < var6_6) return;
                }
                var8_9 = new k(var1_1);
                com.jio.jioads.util.s.d((Function0)var8_9);
                return;
lbl65:
                // 1 sources

                var8_10 = new l(var1_1);
                com.jio.jioads.util.s.d(var8_10);
                return;
lbl68:
                // 2 sources

                if ((var8_11 = var1_1.s) == null) ** GOTO lbl103
                var8_11 = var1_1.m;
                var8_11.clear();
                var8_11 = var1_1.n;
                var8_11.clear();
                var2_2 = (int)this.c();
                var4_4 = var1_1.A;
                var4_4 = var4_4.K();
                var7_7 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                if (var4_4 != var7_7) ** GOTO lbl85
            }
            {
                var4_4 = var1_1.C0;
                var7_7 = Boolean.TRUE;
                var6_6 = (int)Intrinsics.areEqual(var4_4, var7_7);
                if (var6_6 == 0 && (var4_4 = var1_1.U) == null && (var4_4 = var1_1.V) == null) {
                    this.x();
                }
                if ((var6_6 = (int)var1_1.A0) != 0 && (var4_4 = var1_1.z0) != null) {
                    this.G();
                }
lbl85:
                // 4 sources

                var4_4 = new StringBuilder();
                var7_7 = var1_1.A;
                var7_7 = var7_7.P();
                var4_4.append((String)var7_7);
                var7_7 = ": Inside attachNativeAdViewToContainerView A Value an isSucceed is: ";
                var4_4.append((String)var7_7);
                var4_4.append((boolean)var2_2);
                var4_4 = var4_4.toString();
                Intrinsics.checkNotNullParameter(var4_4, var5_5 /* !! */ );
                var3_3 = var3_3.getInstance();
                var3_3.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (var2_2 == 0) return;
                this.j();
                return;
lbl103:
                // 1 sources

                var8_11 = new StringBuilder();
                var4_4 = var1_1.A;
                var4_4 = var4_4.P();
                var8_11.append((String)var4_4);
                var4_4 = ": containerView set to null";
                var8_11.append((String)var4_4);
                var8_11 = var8_11.toString();
                Intrinsics.checkNotNullParameter(var8_11, var5_5 /* !! */ );
                var8_11 = var3_3.getInstance();
                var8_11.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                return;
            }
        }
        var9_14 = false;
        var1_1.r = 0;
        var3_3 = new StringBuilder();
        j_0.n(var1_1.A, (StringBuilder)var3_3, ": ");
        var7_7 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)var7_7, var8_8, (StringBuilder)var3_3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var3_3 = JioAds$LogLevel.NONE;
        var3_3 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        var1_1.a((JioAdError$JioAdErrorType)var3_3, "Error while Rendering Ad");
        var4_4 = var1_1.A.k0();
        var5_5 /* !! */  = JioAdView$AdState.DESTROYED;
        if (var4_4 != var5_5 /* !! */ ) {
            var4_4 = var1_1.A.Y();
        } else {
            var6_6 = 0;
            var4_4 = null;
        }
        var10_15 = var4_4;
        var11_16 = var1_1.A.P();
        var12_17 = com.jio.jioads.cdnlogging.d.a;
        var13_18 = var3_3.getErrorTitle();
        var5_5 /* !! */  = "exception:";
        var4_4 = new StringBuilder(var5_5 /* !! */ );
        var14_19 = com.jio.jioads.instream.audio.a.a(var8_8, (StringBuilder)var4_4);
        var15_20 = ((com.jio.jioads.controller.f)var1_1.h).a.T();
        var16_21 = var1_1.A.q0();
        var17_22 = var3_3.getErrorCode();
        var8_12 = ((com.jio.jioads.controller.f)var1_1.h).a;
        var2_2 = (int)var8_12.a();
        var18_23 = (boolean)var2_2;
        var19_24 = "attachNativeAdViewToContainerView";
        var7_7.logError((Context)var10_15, var11_16, var12_17, var13_18, var14_19, var15_20, var19_24, var18_23, var16_21, var17_22, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(boolean bl2) {
        block82: {
            Object object;
            Object object2;
            block80: {
                Exception exception2;
                Object object3;
                String string2;
                Object object4;
                Object object5;
                String string3;
                Object object6;
                Object object7;
                block81: {
                    block79: {
                        int n3;
                        boolean bl3 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (bl3 && bl2) {
                            this.M();
                        }
                        if (!(bl2 = this.k0)) break block82;
                        this.C();
                        object2 = this.s;
                        bl3 = false;
                        object = null;
                        if (object2 != null) {
                            object7 = "NativeTitle";
                            object2 = object2.findViewWithTag(object7);
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        if (object2 != null) {
                            boolean bl4 = object2 instanceof TextView;
                            if (bl4) {
                                object2 = (TextView)object2;
                                this.r0 = object2;
                            } else {
                                object2 = new StringBuilder();
                                object7 = this.A;
                                object6 = ": jio_native_title must be tagged on a TextView";
                                j_0.i((com.jio.jioads.common.b)object7, (StringBuilder)object2, (String)object6);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object2 = JioAds$LogLevel.NONE;
                            }
                        }
                        object2 = this.r0;
                        object7 = "message";
                        int n4 = 8;
                        boolean bl5 = true;
                        string3 = null;
                        if (object2 != null) {
                            object2 = this.g;
                            if (object2 != null) {
                                object2 = ((com.jio.jioads.native.parser.a)object2).b;
                            } else {
                                bl2 = false;
                                object2 = null;
                            }
                            if (object2 != null && (bl2 = ((String)object2).length())) {
                                object2 = this.r0;
                                if (object2 != null) {
                                    object5 = this.g;
                                    if (object5 != null) {
                                        object5 = ((com.jio.jioads.native.parser.a)object5).b;
                                    } else {
                                        n3 = 0;
                                        object5 = null;
                                    }
                                    object2.setText((CharSequence)object5);
                                }
                                if ((object2 = this.r0) != null) {
                                    object2.setVisibility(0);
                                }
                                object2 = new StringBuilder();
                                object5 = this.A;
                                object4 = ":  titleViewCustomNative?.text Textview :";
                                j_0.n((com.jio.jioads.common.b)object5, (StringBuilder)object2, (String)object4);
                                object5 = this.r0;
                                if (object5 != null) {
                                    object5 = object5.getText();
                                } else {
                                    n3 = 0;
                                    object5 = null;
                                }
                                ((StringBuilder)object2).append(object5);
                                Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), (String)object7);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object2 = JioAds$LogLevel.NONE;
                                object2 = this.r0;
                                if (object2 != null && (bl2 = object2.isClickable()) == bl5) {
                                    this.K = bl5;
                                    object2 = this.r0;
                                    Intrinsics.checkNotNull(object2);
                                    object5 = this.L;
                                    object5.add(object2);
                                }
                            } else {
                                object2 = this.r0;
                                if (object2 != null) {
                                    object2.setVisibility(n4);
                                }
                            }
                        }
                        if ((object2 = this.s) != null) {
                            object5 = "NativeDescription";
                            object2 = object2.findViewWithTag(object5);
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        if (object2 != null) {
                            n3 = object2 instanceof TextView;
                            if (n3 != 0) {
                                object5 = object2;
                                object5 = (TextView)object2;
                                this.s0 = object5;
                            } else {
                                object5 = new StringBuilder();
                                object4 = this.A;
                                string2 = ": jio_native_description must be tagged on a TextView";
                                j_0.i((com.jio.jioads.common.b)object4, (StringBuilder)object5, string2);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object5 = JioAds$LogLevel.NONE;
                            }
                        }
                        if ((object5 = this.s0) != null) {
                            object5 = this.g;
                            if (object5 != null) {
                                object5 = ((com.jio.jioads.native.parser.a)object5).l;
                            } else {
                                n3 = 0;
                                object5 = null;
                            }
                            if (object5 != null && (n3 = ((String)object5).length()) != 0) {
                                object6 = this.s0;
                                if (object6 != null) {
                                    object5 = this.g;
                                    if (object5 != null) {
                                        object5 = ((com.jio.jioads.native.parser.a)object5).l;
                                    } else {
                                        n3 = 0;
                                        object5 = null;
                                    }
                                    object6.setText((CharSequence)object5);
                                }
                                if ((object6 = this.s0) != null) {
                                    object6.setVisibility(0);
                                }
                                if (object2 != null) {
                                    ((View)object2).setVisibility(0);
                                }
                                object2 = this.s0;
                                if (object2 != null && (bl2 = object2.isClickable()) == bl5) {
                                    this.K = bl5;
                                    object2 = this.s0;
                                    Intrinsics.checkNotNull(object2);
                                    object6 = this.L;
                                    object6.add(object2);
                                }
                            } else {
                                object3 = this.s0;
                                if (object3 != null) {
                                    object3.setVisibility(n4);
                                }
                                if (object2 != null) {
                                    ((View)object2).setVisibility(n4);
                                }
                                object2 = new StringBuilder();
                                object6 = this.A;
                                object3 = ": NativeAD: Ad Description is Absent in Ad";
                                j_0.i((com.jio.jioads.common.b)object6, (StringBuilder)object2, (String)object3);
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object2 = JioAds$LogLevel.NONE;
                            }
                        }
                        this.Y();
                        this.W();
                        object2 = this.s;
                        if (object2 != null) {
                            object6 = "NativeDescription2";
                            object2 = object2.findViewWithTag(object6);
                            object3 = this.g;
                            if (object3 != null) {
                                object3 = object3.t;
                            } else {
                                bl5 = false;
                                object3 = null;
                            }
                            object5 = "Description2 must be tagged on a TextView";
                            this.a((View)object2, (String)object3, (String)object6, (String)object5);
                        }
                        object2 = this.s;
                        object6 = "Rating";
                        if (object2 != null) {
                            object2 = object2.findViewWithTag(object6);
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        object3 = this.g;
                        if (object3 != null) {
                            object3 = object3.a;
                        } else {
                            bl5 = false;
                            object3 = null;
                        }
                        object5 = "Ratings must be tagged on a RatingBar";
                        this.a((View)object2, (String)object3, (String)object6, (String)object5);
                        object2 = this.s;
                        object6 = "Downloads";
                        if (object2 != null) {
                            object2 = object2.findViewWithTag(object6);
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        object3 = this.g;
                        if (object3 != null) {
                            object3 = object3.m;
                        } else {
                            bl5 = false;
                            object3 = null;
                        }
                        object5 = "Downloads must be tagged on a TextView";
                        this.a((View)object2, (String)object3, (String)object6, (String)object5);
                        object2 = this.s;
                        object6 = "SalePrice";
                        if (object2 != null) {
                            object2 = object2.findViewWithTag(object6);
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        object3 = this.g;
                        if (object3 != null) {
                            object3 = object3.v;
                        } else {
                            bl5 = false;
                            object3 = null;
                        }
                        object5 = "Sale Price must be tagged on a TextView";
                        this.a((View)object2, (String)object3, (String)object6, (String)object5);
                        object2 = this.s;
                        object6 = "Likes";
                        if (object2 != null) {
                            object2 = object2.findViewWithTag(object6);
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        object3 = this.g;
                        if (object3 != null) {
                            object3 = object3.u;
                        } else {
                            bl5 = false;
                            object3 = null;
                        }
                        object5 = "Likes must be tagged on a TextView";
                        this.a((View)object2, (String)object3, (String)object6, (String)object5);
                        object2 = this.s;
                        object6 = "Price";
                        if (object2 != null) {
                            object2 = object2.findViewWithTag(object6);
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        object3 = this.g;
                        if (object3 != null) {
                            object3 = object3.n;
                        } else {
                            bl5 = false;
                            object3 = null;
                        }
                        object5 = "Price must be tagged on a TextView";
                        this.a((View)object2, (String)object3, (String)object6, (String)object5);
                        object2 = this.s;
                        object6 = "Phone";
                        if (object2 != null) {
                            object2 = object2.findViewWithTag(object6);
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        object3 = this.g;
                        if (object3 != null) {
                            object3 = object3.w;
                        } else {
                            bl5 = false;
                            object3 = null;
                        }
                        object5 = "Phone must be tagged on a TextView";
                        this.a((View)object2, (String)object3, (String)object6, (String)object5);
                        object2 = this.s;
                        object6 = "Address";
                        if (object2 != null) {
                            object2 = object2.findViewWithTag(object6);
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        object3 = this.g;
                        if (object3 != null) {
                            object3 = object3.x;
                        } else {
                            bl5 = false;
                            object3 = null;
                        }
                        object5 = "Address must be tagged on a TextView";
                        this.a((View)object2, (String)object3, (String)object6, (String)object5);
                        object2 = this.s;
                        object6 = "DisplayUrl";
                        if (object2 != null) {
                            object2 = object2.findViewWithTag(object6);
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        object3 = this.g;
                        if (object3 != null) {
                            object3 = object3.y;
                        } else {
                            bl5 = false;
                            object3 = null;
                        }
                        object5 = "Display URL must be tagged on a TextView";
                        this.a((View)object2, (String)object3, (String)object6, (String)object5);
                        try {
                            object2 = this.A;
                            bl2 = object2.l();
                            if (bl2) break block79;
                            bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            if (bl2) break block80;
                            object2 = new StringBuilder();
                            object6 = this.A;
                            object6 = object6.P();
                            ((StringBuilder)object2).append((String)object6);
                            object6 = ": startRefreshAndGiveCallbackToPublisher : Giving onAdPreparedCallBack callback to publisher";
                            ((StringBuilder)object2).append((String)object6);
                            object2 = ((StringBuilder)object2).toString();
                            Intrinsics.checkNotNullParameter(object2, (String)object7);
                            object2 = JioAds.Companion;
                            object2 = ((JioAds$Companion)object2).getInstance();
                            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object2 = JioAds$LogLevel.NONE;
                            object2 = this.w;
                            if (object2 != null) {
                                object2.b();
                            }
                            break block80;
                        }
                        catch (Exception exception2) {
                            break block81;
                        }
                    }
                    object2 = new StringBuilder();
                    object6 = this.A;
                    object6 = object6.P();
                    ((StringBuilder)object2).append((String)object6);
                    object6 = ": NativeAdViewRenderer calling loadAd";
                    ((StringBuilder)object2).append((String)object6);
                    object2 = ((StringBuilder)object2).toString();
                    Intrinsics.checkNotNullParameter(object2, (String)object7);
                    object2 = JioAds.Companion;
                    object2 = ((JioAds$Companion)object2).getInstance();
                    ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    bl2 = this.u0;
                    if (bl2) {
                        this.h();
                        this.u0 = false;
                    }
                    if ((object2 = this.w) != null) {
                        object2.f();
                    }
                    break block80;
                }
                object7 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
                this.a((JioAdError$JioAdErrorType)((Object)object7), "Unable to render Native Ad");
                object6 = this.A.k0();
                object3 = JioAdView$AdState.DESTROYED;
                if (object6 != object3) {
                    object = this.A.Y();
                }
                object3 = object;
                object6 = Utility.INSTANCE;
                string3 = this.A.P();
                object5 = com.jio.jioads.cdnlogging.d.a;
                object4 = ((JioAdError$JioAdErrorType)((Object)object7)).getErrorTitle();
                object = new StringBuilder("exception:");
                string2 = com.jio.jioads.instream.audio.a.a(exception2, (StringBuilder)object);
                com.jio.jioads.cdnlogging.a a2 = ((com.jio.jioads.controller.f)this.h).a.T();
                String string4 = this.A.q0();
                String string5 = ((JioAdError$JioAdErrorType)((Object)object7)).getErrorCode();
                object2 = ((com.jio.jioads.controller.f)this.h).a;
                bl2 = ((com.jio.jioads.controller.o)object2).a();
                Boolean bl6 = bl2;
                String string6 = "startRefreshAndGiveCallbackToPublisher";
                ((Utility)object6).logError((Context)object3, string3, (com.jio.jioads.cdnlogging.d)((Object)object5), (String)object4, string2, a2, string6, bl6, string4, string5, false);
            }
            if (!(bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease())) {
                object2 = this.s;
                object = this.L;
                this.a((ViewGroup)object2, (List)object);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        int n3;
        Object object = new StringBuilder();
        Object object2 = this.A;
        String string2 = ": NativeAd: cacheAndPrepareAd() called ";
        com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object2, (StringBuilder)object, string2);
        object = this.w;
        object2 = null;
        if (object != null) {
            object = object.n();
        } else {
            n3 = 0;
            object = null;
        }
        string2 = "VAST";
        n3 = Intrinsics.areEqual(object, string2);
        if (n3 != 0 && (object = this.s) != null && (object = this.A) != null && (n3 = object.W()) == 0) {
            this.s = null;
        }
        n3 = 0;
        this.g0 = false;
        this.C0 = null;
        object = this.A.K();
        if (object == (object2 = JioAdView$AD_TYPE.INFEED)) {
            object = new StringBuilder();
            object2 = this.A.P();
            ((StringBuilder)object).append((String)object2);
            object2 = ": NativeAd: Ad-type is INFEED";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            com.jio.jioads.util.j.a((String)object);
            this.L();
            return;
        }
        object = this.A.K();
        if (object == (object2 = JioAdView$AD_TYPE.CONTENT_STREAM)) {
            object = new StringBuilder();
            object2 = this.A.P();
            ((StringBuilder)object).append((String)object2);
            object2 = ": NativeAd: Ad-type is CONTENT_STREAM";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            com.jio.jioads.util.j.a((String)object);
            this.J();
            return;
        }
        object = this.A.K();
        if (object == (object2 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) {
            object = new StringBuilder();
            object2 = this.A.P();
            ((StringBuilder)object).append((String)object2);
            object2 = ": NativeAd: Ad-type is DYNAMIC_DISPLAY";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            com.jio.jioads.util.j.a((String)object);
            this.H();
            return;
        }
        object = this.A.K();
        if (object == (object2 = JioAdView$AD_TYPE.CUSTOM_NATIVE)) {
            Exception exception2;
            block12: {
                block11: {
                    block10: {
                        try {
                            object = new StringBuilder();
                            object2 = this.A;
                            object2 = object2.P();
                            ((StringBuilder)object).append((String)object2);
                            object2 = ": NativeAd: Ad-type is CUSTOM_NATIVE";
                            ((StringBuilder)object).append((String)object2);
                            object = ((StringBuilder)object).toString();
                            com.jio.jioads.util.j.a((String)object);
                            object = new StringBuilder();
                            object2 = this.A;
                            object2 = object2.P();
                            ((StringBuilder)object).append((String)object2);
                            object2 = ": Loading Custom Native Ad";
                            ((StringBuilder)object).append((String)object2);
                            object = ((StringBuilder)object).toString();
                            com.jio.jioads.util.j.a((String)object);
                            object = this.A;
                            n3 = (int)(object.l() ? 1 : 0);
                            if (n3 == 0) break block10;
                            object = this.h;
                            object = (com.jio.jioads.controller.f)object;
                            object = ((com.jio.jioads.controller.f)object).a;
                            n3 = (int)(((com.jio.jioads.controller.o)object).C ? 1 : 0);
                            if (n3 == 0 && (object = this.s) != null) break block11;
                        }
                        catch (Exception exception2) {
                            break block12;
                        }
                    }
                    this.T();
                }
                this.K();
                return;
            }
            string2 = "NativeAdView cacheAndPrepareAd() catch ";
            object2 = new StringBuilder(string2);
            String string3 = exception2.getMessage();
            ((StringBuilder)object2).append(string3);
            string3 = ((StringBuilder)object2).toString();
            object2 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
            this.a((JioAdError$JioAdErrorType)((Object)object2), string3);
            return;
        }
        object = this.A.K();
        if (object == (object2 = JioAdView$AD_TYPE.INTERSTITIAL)) {
            object = new StringBuilder();
            object2 = this.A.P();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(": NativeAd: Ad-type is INTERSTITIAL");
            com.jio.jioads.util.j.a(((StringBuilder)object).toString());
            object = new StringBuilder();
            object2 = this.A.P();
            ((StringBuilder)object).append((String)object2);
            object2 = ": Loading INTERSTITIAL Ad";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            com.jio.jioads.util.j.a((String)object);
            this.I();
            return;
        }
        object = JioAdError$JioAdErrorType.ERROR_MISMATCH_AD_TYPE;
        object2 = "Wrong ad type is passed";
        this.a((JioAdError$JioAdErrorType)((Object)object), (String)object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void e(String object) {
        int n3;
        Boolean bl2;
        String string2;
        String string3;
        String string4;
        Object object2;
        void var2_6;
        char c2;
        int n4;
        int n7;
        int n8;
        URL uRL = new URL((String)object);
        String string5 = uRL.getPath();
        Object object3 = null;
        int n10 = 1;
        int n14 = 0;
        String string6 = null;
        if (string5 == null) {
            n8 = 0;
            Object var2_4 = null;
        } else {
            n7 = 6;
            n4 = StringsKt.Q(string5, '/', 0, n7);
            c2 = '\\';
            n7 = StringsKt.Q(string5, c2, 0, n7);
            n4 = Math.max(n4, n7) + n10;
            String string7 = string5.substring(n4);
            String string8 = "this as java.lang.String).substring(startIndex)";
            Intrinsics.checkNotNullExpressionValue(string7, string8);
        }
        StringBuilder stringBuilder = new StringBuilder();
        Object object4 = this.A.P();
        stringBuilder.append((String)object4);
        stringBuilder.append(": Icon image Url: ");
        stringBuilder.append((String)object);
        com.jio.jioads.util.j.a(stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        object4 = this.A.P();
        stringBuilder2.append((String)object4);
        stringBuilder2.append(": Icon Url File Name: ");
        stringBuilder2.append((String)var2_6);
        String string9 = stringBuilder2.toString();
        com.jio.jioads.util.j.a(string9);
        n4 = (int)(TextUtils.isEmpty((CharSequence)var2_6) ? 1 : 0);
        object4 = ": Display ad and main image is not null so considering same.Url: ";
        if (n4 == 0 && var2_6 != null) {
            String string10;
            Locale locale = Locale.getDefault();
            object2 = "getDefault(...)";
            Intrinsics.checkNotNullExpressionValue(locale, (String)object2);
            String string11 = var2_6.toLowerCase(locale);
            String string12 = "this as java.lang.String).toLowerCase(locale)";
            Intrinsics.checkNotNullExpressionValue(string11, string12);
            if (string11 != null && (n8 = StringsKt.F(string11, string10 = ".gif", false)) == n10) {
                StringBuilder stringBuilder3 = new StringBuilder();
                object3 = this.A;
                Object object5 = "Icon URL is in GIF Format";
                com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object3, stringBuilder3, (String)object5);
                JioAdView$AD_TYPE jioAdView$AD_TYPE = this.A.K();
                object3 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                if (jioAdView$AD_TYPE == object3) {
                    int n15;
                    String string13;
                    String string14;
                    String string15;
                    String string16 = this.t;
                    object3 = Constants$DynamicDisplaySize.SIZE_300x250.getDynamicSize();
                    n8 = Intrinsics.areEqual(string16, object3);
                    if (!(n8 || (n8 = Intrinsics.areEqual(string15 = this.t, object3 = Constants$DynamicDisplaySize.SIZE_160x600.getDynamicSize())) || (n8 = Intrinsics.areEqual(string14 = this.t, object3 = Constants$DynamicDisplaySize.SIZE_300x600.getDynamicSize())) || (n8 = Intrinsics.areEqual(string13 = this.t, object3 = Constants$DynamicDisplaySize.SIZE_970x250.getDynamicSize())))) {
                        void var2_17;
                        com.jio.jioads.native.parser.a a2 = this.g;
                        if (a2 != null) {
                            String string17 = a2.p;
                        } else {
                            n8 = 0;
                            Object var2_16 = null;
                        }
                        n8 = TextUtils.isEmpty((CharSequence)var2_17);
                        if (!n8) {
                            object = this.g;
                            if (object != null) {
                                object = ((com.jio.jioads.native.parser.a)object).p;
                            } else {
                                n15 = 0;
                                object = null;
                            }
                            StringBuilder stringBuilder4 = new StringBuilder();
                            object3 = this.A.P();
                            stringBuilder4.append((String)object3);
                            stringBuilder4.append((String)object4);
                            stringBuilder4.append((String)object);
                            String string18 = stringBuilder4.toString();
                            com.jio.jioads.util.j.a(string18);
                        }
                    }
                    object4 = object;
                    if (object == null) return;
                    n15 = ((String)object).length();
                    if (n15 == 0) {
                        return;
                    }
                    FrameLayout frameLayout = this.H;
                    if (frameLayout != null) {
                        Intrinsics.checkNotNull(frameLayout);
                        n10 = 0;
                        object5 = null;
                        n14 = 0;
                        string6 = null;
                        object2 = "iconByteArray";
                        boolean bl3 = true;
                        object3 = this;
                        this.b(0, 0, (View)frameLayout, (String)object, (String)object2, bl3);
                        return;
                    }
                    object = new StringBuilder();
                    com.jio.jioads.common.b b2 = this.A;
                    object3 = ": iconLayout is null for dynamic display ad";
                    com.jio.jioads.jioreel.tracker.model.b.a(b2, (StringBuilder)object, (String)object3);
                    return;
                }
                JioAdView$AD_TYPE jioAdView$AD_TYPE2 = this.A.K();
                if (jioAdView$AD_TYPE2 == (object3 = JioAdView$AD_TYPE.INTERSTITIAL)) {
                    FrameLayout frameLayout;
                    object = this.g;
                    if (object != null) {
                        string6 = ((com.jio.jioads.native.parser.a)object).p;
                    }
                    if ((frameLayout = this.H) != null) {
                        Intrinsics.checkNotNull(frameLayout);
                        n7 = 0;
                        object4 = null;
                        c2 = '\u0000';
                        object2 = null;
                        String string19 = "iconByteArray";
                        boolean bl4 = true;
                        NativeAdViewRenderer nativeAdViewRenderer = this;
                        this.b(0, 0, (View)frameLayout, string6, string19, bl4);
                        return;
                    }
                    object = new StringBuilder();
                    com.jio.jioads.common.b b3 = this.A;
                    object3 = ": iconLayout is null for Interstitial ad";
                    com.jio.jioads.jioreel.tracker.model.b.a(b3, (StringBuilder)object, (String)object3);
                    return;
                }
                object4 = this.H;
                if (object4 != null) {
                    Intrinsics.checkNotNull(object4);
                    n14 = 48;
                    n4 = 48;
                    String string20 = "iconByteArray";
                    boolean bl5 = true;
                    object5 = this;
                    object2 = object;
                    this.b(n14, n4, (View)object4, (String)object, string20, bl5);
                    return;
                }
                object = new StringBuilder();
                com.jio.jioads.common.b b4 = this.A;
                object3 = ": iconLayout is null in else";
                com.jio.jioads.jioreel.tracker.model.b.a(b4, (StringBuilder)object, (String)object3);
                return;
            }
        }
        Context context = this.j;
        ImageView imageView = new ImageView(context);
        imageView.setAdjustViewBounds(n10 != 0);
        Object object6 = ImageView.ScaleType.FIT_XY;
        imageView.setScaleType((ImageView.ScaleType)object6);
        object6 = this.A.K();
        JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
        if (object6 != jioAdView$AD_TYPE) {
            n14 = 48;
            n4 = 48;
            String string21 = "iconByteArray";
            boolean bl6 = false;
            object6 = this;
            object4 = imageView;
            object2 = object;
            this.b(n14, n4, (View)imageView, (String)object, string21, false);
            return;
        }
        object6 = this.t;
        String string22 = Constants$DynamicDisplaySize.SIZE_300x250.getDynamicSize();
        n10 = Intrinsics.areEqual(object6, string22);
        if (n10 == 0 && (n10 = Intrinsics.areEqual(object6 = this.t, string4 = Constants$DynamicDisplaySize.SIZE_160x600.getDynamicSize())) == 0 && (n10 = Intrinsics.areEqual(object6 = this.t, string3 = Constants$DynamicDisplaySize.SIZE_300x600.getDynamicSize())) == 0 && (n10 = Intrinsics.areEqual(object6 = this.t, string2 = Constants$DynamicDisplaySize.SIZE_970x250.getDynamicSize())) == 0 && (n10 = Intrinsics.areEqual(object6 = this.A.O(), bl2 = Boolean.FALSE)) != 0 && ((object6 = this.A.m0()) == null || (n10 = ((String)object6).length()) == 0)) {
            object = this.g;
            if (object != null) {
                object = ((com.jio.jioads.native.parser.a)object).p;
            } else {
                n3 = 0;
                object = null;
            }
            this.l = false;
            object3 = new StringBuilder();
            object6 = this.A.P();
            ((StringBuilder)object3).append((String)object6);
            ((StringBuilder)object3).append((String)object4);
            ((StringBuilder)object3).append((String)object);
            object3 = ((StringBuilder)object3).toString();
            com.jio.jioads.util.j.a((String)object3);
        } else {
            object3 = ImageView.ScaleType.CENTER_INSIDE;
            imageView.setScaleType((ImageView.ScaleType)object3);
        }
        object2 = object;
        object = new StringBuilder();
        object3 = this.A;
        object6 = ": Icon URL is in IMAGE Format";
        com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object3, (StringBuilder)object, (String)object6);
        if (object2 == null) return;
        n3 = ((String)object2).length();
        if (n3 != 0) {
            n14 = 0;
            string6 = null;
            n4 = 0;
            Object var11_52 = null;
            String string23 = "iconByteArray";
            boolean bl7 = false;
            object6 = this;
            object4 = imageView;
            this.b(0, 0, (View)imageView, (String)object2, string23, false);
            return;
        }
    }

    public final void f() {
        int n3 = 1;
        Object object = this.v;
        if (object != null) {
            object = this.A;
            int n4 = object.W();
            Object object2 = null;
            if (n4 == n3) {
                object = new StringBuilder();
                Object object3 = this.A;
                String string2 = ": loadAd called ";
                j_0.i((com.jio.jioads.common.b)object3, (StringBuilder)object, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = this.s;
                if ((object != null || (object3 = this.v) != null) && (object3 = this.U) != null) {
                    if (object == null) {
                        object = this.v;
                        Intrinsics.checkNotNull(object);
                    }
                    boolean bl2 = this.v0;
                    int n7 = 10;
                    com.jio.jioads.videomodule.s.A((com.jio.jioads.videomodule.s)object3, (ViewGroup)object, null, bl2, n7);
                }
                if ((object = this.v) != null && (n4 = (int)(object.isClickable() ? 1 : 0)) == n3) {
                    object = this.U;
                    if (object != null) {
                        object = ((com.jio.jioads.videomodule.s)object).c0();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    if (object != null) {
                        object = this.U;
                        if (object != null) {
                            object2 = ((com.jio.jioads.videomodule.s)object).c0();
                        }
                        this.a((View)object2);
                    }
                    if ((object = this.U) != null && (object = ((com.jio.jioads.videomodule.s)object).c0()) != null) {
                        object2 = new b_0(this);
                        object.setOnClickListener((View.OnClickListener)object2);
                    }
                }
            } else {
                object = this.v;
                Object object4 = null;
                if (object != null) {
                    object.setVisibility(0);
                }
                object = this.G;
                if (object != null) {
                    object.setVisibility(0);
                }
                object = this.G;
                if (object != null) {
                    object4 = this.U;
                    if (object4 != null) {
                        Intrinsics.checkNotNull(object);
                        ViewGroup viewGroup = this.v;
                        boolean bl3 = this.v0;
                        ((com.jio.jioads.videomodule.s)object4).w((ViewGroup)object, viewGroup, bl3);
                    }
                } else {
                    object = this.p0;
                    if (object != null && (object = this.A.K()) == (object4 = JioAdView$AD_TYPE.CUSTOM_NATIVE) && (object = this.U) != null) {
                        object4 = this.p0;
                        Intrinsics.checkNotNull(object4);
                        ViewGroup viewGroup = this.v;
                        boolean bl4 = this.v0;
                        int n8 = 8;
                        com.jio.jioads.videomodule.s.A((com.jio.jioads.videomodule.s)object, (ViewGroup)object4, viewGroup, bl4, n8);
                    }
                }
                if ((object = this.G) != null && (n4 = (int)(object.isClickable() ? 1 : 0)) == n3) {
                    object = this.U;
                    if (object != null) {
                        object = ((com.jio.jioads.videomodule.s)object).c0();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    if (object != null) {
                        object = this.U;
                        if (object != null) {
                            object2 = ((com.jio.jioads.videomodule.s)object).c0();
                        }
                        this.a((View)object2);
                    }
                    if ((object = this.U) != null && (object = ((com.jio.jioads.videomodule.s)object).c0()) != null) {
                        object2 = new pv_0(this, n3);
                        object.setOnClickListener((View.OnClickListener)object2);
                    }
                }
            }
            this.Z = n3;
            object = this.w;
            if (object != null) {
                object.a(n3 != 0);
            }
        } else {
            JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
            object = "Container set to null";
            this.a(jioAdError$JioAdErrorType, (String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void fireViewableImpressionTracker$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        Exception exception2;
        Object object;
        block6: {
            Object object2;
            int n3 = 1;
            object = "message";
            try {
                object2 = new StringBuilder();
                Object object3 = this.A;
                object3 = object3.P();
                ((StringBuilder)object2).append((String)object3);
                object3 = ": Inside fireViewableImpressionTracker() check for viewable registered or not";
                ((StringBuilder)object2).append((String)object3);
                object2 = ((StringBuilder)object2).toString();
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object2 = JioAds.Companion;
                object2 = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = this.g;
                if (object2 == null) return;
                object2 = ((com.jio.jioads.native.parser.a)object2).B;
            }
            catch (Exception exception2) {
                break block6;
            }
            if (object2 == null) return;
            int n4 = object2.length();
            if (n4 <= 0) return;
            n4 = object2.length();
            int n7 = 0;
            while (n7 < n4) {
                int n8;
                Object object4 = object2.getString(n7);
                Object object5 = this.F;
                if (object5 != null && (n8 = ((HashMap)object5).containsKey(object4)) == n3) {
                    object4 = new StringBuilder();
                    object5 = this.A;
                    object5 = object5.P();
                    ((StringBuilder)object4).append((String)object5);
                    object5 = ":viewable impression URL already registered";
                    ((StringBuilder)object4).append((String)object5);
                    object4 = ((StringBuilder)object4).toString();
                    Intrinsics.checkNotNullParameter(object4, (String)object);
                    object4 = JioAds.Companion;
                    object4 = ((JioAds$Companion)object4).getInstance();
                    ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = JioAds$LogLevel.NONE;
                } else {
                    object5 = this.F;
                    if (object5 != null) {
                        Intrinsics.checkNotNull(object4);
                        Boolean bl2 = Boolean.TRUE;
                        object5.put(object4, bl2);
                    }
                    Intrinsics.checkNotNull(object4);
                    object5 = JioEventTracker$TrackingEvents.EVENT_VIEWABLE_IMPRESSION;
                    this.a((String)object4, (JioEventTracker$TrackingEvents)((Object)object5));
                }
                n7 += n3;
            }
            return;
        }
        object = Utility.INSTANCE;
        ((Utility)object).printStacktrace(exception2);
    }

    public final void g() {
        ViewGroup viewGroup = this.z0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        viewGroup = null;
        this.z0 = null;
        this.E0 = false;
        Object object = this.D0;
        if (object != null) {
            boolean bl2;
            Object object2 = ((com.jio.jioads.carousel.view.i)object).j;
            if (object2 != null) {
                com.jio.jioads.util.s.a((View)object2);
            }
            ((com.jio.jioads.carousel.view.i)object).j = null;
            ((com.jio.jioads.carousel.view.i)object).k = null;
            object = ((com.jio.jioads.carousel.view.i)object).d.c.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (com.jio.jioads.carousel.data.a)object.next();
                Bitmap bitmap = ((com.jio.jioads.carousel.data.a)object2).j;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                ((com.jio.jioads.carousel.data.a)object2).j = null;
            }
        }
    }

    public final String getBrandUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.y;
    }

    public final String getCTAFallbackUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.H0;
    }

    public final String getClickUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        boolean bl2;
        boolean bl3;
        String string2 = this.F0;
        if (string2 != null) {
            string2 = ((Object)StringsKt.m0(string2)).toString();
        } else {
            bl3 = false;
            string2 = null;
        }
        String string3 = this.H0;
        string3 = string3 != null ? ((Object)StringsKt.m0(string3)).toString() : null;
        String string4 = this.y;
        if (string4 != null) {
            string4 = ((Object)StringsKt.m0(string4)).toString();
        } else {
            bl2 = false;
            string4 = null;
        }
        boolean bl4 = TextUtils.isEmpty((CharSequence)string4);
        if (!bl4) {
            return string4;
        }
        bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            return string2;
        }
        bl3 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl3) {
            return string3;
        }
        return null;
    }

    public final List getClickViewList() {
        return this.L;
    }

    public final ViewGroup getContainerView() {
        return this.s;
    }

    public final com.jio.jioads.common.b getIJioAdView() {
        return this.A;
    }

    public final com.jio.jioads.videomodule.s getJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.U;
    }

    public final com.jio.jioads.videomodule.s getJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.V;
    }

    public final ViewGroup getMediaLayout$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.G;
    }

    public final String getNativeAdClickUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.F0;
    }

    public final boolean getShouldShowCarousel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.A0;
    }

    public final int getSkipOffSetDuration$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        int n3;
        com.jio.jioads.videomodule.s s7 = this.U;
        if (s7 != null) {
            n3 = s7.e0();
        } else {
            s7 = this.V;
            if (s7 != null) {
                n3 = s7.e0();
            } else {
                n3 = 0;
                s7 = null;
            }
        }
        return n3;
    }

    public final String getTime() {
        return this.P;
    }

    public final ViewGroup getView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.s;
    }

    public final boolean getWaitForCompleteHTMLAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.c;
    }

    public final String get_cTAFallbackUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        Exception exception2;
        block4: {
            String string2;
            block3: {
                com.jio.jioads.native.parser.a a2;
                string2 = null;
                try {
                    a2 = this.g;
                    if (a2 == null) break block3;
                }
                catch (Exception exception2) {
                    break block4;
                }
                string2 = a2.k;
            }
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        j_0.n(this.A, stringBuilder, ": Error in getCtaUrl(): ");
        com.jio.jioads.jioreel.tracker.model.b.c(Utility.INSTANCE, exception2, stringBuilder);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return null;
    }

    public final void h() {
        Object object;
        Object object2 = new StringBuilder();
        j_0.i(this.A, (StringBuilder)object2, ": clear old video data");
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        int n3 = 0;
        object3 = null;
        this.x0 = false;
        this.Q = object = "0";
        boolean bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        int n4 = 1;
        if (!bl2) {
            this.k = n4;
        }
        this.k0 = n4;
        this.b0 = 0;
        long l2 = 0L;
        object3 = l2;
        this.a0 = object3;
        object3 = this.u;
        object = JioAdView$AdState.STARTING;
        ((V)object3).e((JioAdView$AdState)((Object)object));
        object3 = this.A.K();
        object = JioAdView$AD_TYPE.INTERSTITIAL;
        if (object3 != object) {
            n3 = this.Z;
            bl2 = false;
            object = null;
            if (n3 == n4) {
                object3 = new StringBuilder();
                com.jio.jioads.common.b b2 = this.A;
                String string2 = ": showVideoAd: CLEAR FIRST..";
                com.jio.jioads.common.l.a(b2, (StringBuilder)object3, string2, (JioAds$Companion)object2);
                object2 = this.U;
                if (object2 != null) {
                    ((com.jio.jioads.videomodule.s)object2).u();
                }
                this.U = null;
            } else {
                n4 = 2;
                if (n3 == n4) {
                    object3 = new StringBuilder();
                    com.jio.jioads.common.b b3 = this.A;
                    String string3 = ":  showVideoAd: CLEAR SECOND..";
                    com.jio.jioads.common.l.a(b3, (StringBuilder)object3, string3, (JioAds$Companion)object2);
                    object2 = this.V;
                    if (object2 != null) {
                        ((com.jio.jioads.videomodule.s)object2).u();
                    }
                    this.V = null;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleNativeAdClick$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        Exception exception2;
        Object object;
        boolean bl2;
        Object object2;
        NativeAdViewRenderer nativeAdViewRenderer;
        block12: {
            Object object3;
            int n3;
            Object object4;
            block11: {
                block10: {
                    nativeAdViewRenderer = this;
                    Intrinsics.checkNotNullParameter("handle native click called", "message");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = JioAds$LogLevel.NONE;
                    object2 = null;
                    try {
                        boolean bl3;
                        object4 = this.o();
                        bl2 = ((JioAds$LogLevel)object4).length;
                        n3 = false;
                        object = null;
                        int n4 = 1;
                        if (!bl2) {
                            bl2 = true;
                        } else {
                            bl2 = false;
                            object4 = null;
                        }
                        if (!(bl2 ^= n4) || (bl2 = ((JioAds$LogLevel)(object4 = (Object)this.o())).length) < (bl3 = 2 != 0)) break block10;
                        object4 = new StringBuilder();
                        object3 = this.o();
                        n3 = object3[0];
                        ((StringBuilder)object4).append(n3);
                        n3 = 120;
                        ((StringBuilder)object4).append((char)n3);
                        object = this.o();
                        n3 = object[n4];
                        ((StringBuilder)object4).append(n3);
                        object4 = ((StringBuilder)object4).toString();
                        break block11;
                    }
                    catch (Exception exception2) {
                        break block12;
                    }
                }
                object4 = "";
            }
            Object object5 = object4;
            com.jio.jioads.common.b b2 = nativeAdViewRenderer.A;
            object3 = nativeAdViewRenderer.h;
            String string2 = nativeAdViewRenderer.y;
            String string3 = nativeAdViewRenderer.x;
            String string4 = nativeAdViewRenderer.H0;
            String string5 = nativeAdViewRenderer.L0;
            String string6 = nativeAdViewRenderer.K0;
            object = nativeAdViewRenderer.v;
            if (object != null) {
                n3 = object.getWidth();
                object = n3;
            } else {
                n3 = 0;
                object = null;
            }
            String string7 = String.valueOf(object);
            object = nativeAdViewRenderer.v;
            if (object != null) {
                n3 = object.getHeight();
                object = n3;
            } else {
                n3 = 0;
                object = null;
            }
            String string8 = String.valueOf(object);
            p p2 = new p(nativeAdViewRenderer);
            object = this.s();
            int n7 = com.jio.jioads.utils.e.i((Map)object);
            object = object4;
            object4 = new com.jio.jioads.common.f(b2, (com.jio.jioads.common.c)object3, string2, string3, string4, (String)object5, string5, string6, string7, string8, p2, n7);
            ((com.jio.jioads.common.f)object4).a();
            return;
        }
        object = new StringBuilder();
        j_0.n(nativeAdViewRenderer.A, object, ": Exception while native ad click: ");
        Utility utility = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c(utility, exception2, object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = new StringBuilder("Exception while native ad click error: ");
        Object object6 = exception2.getMessage();
        object.append((String)object6);
        object = object.toString();
        object6 = JioAdError$JioAdErrorType.ERROR_IN_AD_CLICK;
        nativeAdViewRenderer.a((JioAdError$JioAdErrorType)((Object)object6), (String)object);
        object = nativeAdViewRenderer.A.k0();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        if (object != jioAdView$AdState) {
            object2 = nativeAdViewRenderer.A.Y();
        }
        Context context = object2;
        String string9 = nativeAdViewRenderer.A.P();
        com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
        String string10 = ((JioAdError$JioAdErrorType)((Object)object6)).getErrorTitle();
        object = "exception:";
        object2 = new StringBuilder((String)object);
        String string11 = com.jio.jioads.instream.audio.a.a(exception2, (StringBuilder)object2);
        com.jio.jioads.cdnlogging.a a2 = ((com.jio.jioads.controller.f)nativeAdViewRenderer.h).a.T();
        String string12 = nativeAdViewRenderer.A.q0();
        String string13 = ((JioAdError$JioAdErrorType)((Object)object6)).getErrorCode();
        com.jio.jioads.controller.o o3 = ((com.jio.jioads.controller.f)nativeAdViewRenderer.h).a;
        bl2 = o3.a();
        Boolean bl4 = bl2;
        String string14 = "handleNativeAdClick";
        utility.logError(context, string9, d2, string10, string11, a2, string14, bl4, string12, string13, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i() {
        boolean bl2;
        this.a = false;
        Object object = this.w;
        if (object != null) {
            bl2 = object.g();
            object = bl2;
        } else {
            bl2 = false;
            object = null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        com.jio.jioads.common.b b2 = this.A;
        Object object2 = ": loadViewToContainer value :";
        j_0.n(b2, stringBuilder, (String)object2);
        if (object == null) {
            object = "null";
        }
        stringBuilder.append(object);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.A.K();
        JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL;
        if (object != jioAdView$AD_TYPE) {
            object = this.v;
            int n3 = 5;
            boolean bl3 = true;
            if (object == null || (bl2 = ((Utility)(object2 = Utility.INSTANCE)).checkVisibility((ViewGroup)object, n3)) != bl3) {
                object = this.v;
                if (object == null) return;
                object2 = Utility.INSTANCE;
                bl2 = ((Utility)object2).checkVisibility((ViewGroup)object, n3) ^ bl3;
                if (bl2 != bl3) return;
                object = this.w;
                if (object == null) return;
                object.a(false);
                return;
            }
        }
        this.z();
    }

    public final void initNativeViewListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(com.jio.jioads.native.callbaks.a a2) {
        Intrinsics.checkNotNullParameter(a2, "jioNativeViewListener");
        this.w = a2;
    }

    public final boolean isNativeDynamicLowerThen100$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.a;
    }

    public final boolean isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        boolean bl2;
        block10: {
            block11: {
                int n3;
                int n4;
                JioAdView$AD_TYPE jioAdView$AD_TYPE;
                int n7;
                String string2;
                String string3;
                int n8;
                Object object;
                block9: {
                    object = this.A;
                    n8 = object.W();
                    string3 = "</vast>";
                    string2 = "<vast";
                    bl2 = false;
                    n7 = 1;
                    if (n8 != n7 || (object = this.A.K()) != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO) && (object = this.A.K()) != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL) && (object = this.A.K()) != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) && (object = this.A.K()) != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_AUDIO)) break block9;
                    object = this.f;
                    n8 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                    if (n8 != 0 || (n8 = (int)(StringsKt.F((CharSequence)(object = this.f), string2, false) ? 1 : 0)) == 0 && ((n8 = StringsKt.F((CharSequence)(object = this.f), string2 = "<VAST", false)) == 0 || (n8 = (int)(StringsKt.F((CharSequence)(object = this.f), string3, false) ? 1 : 0)) == 0 && (n8 = (int)(StringsKt.F((CharSequence)(object = this.f), string3 = "</VAST>", false) ? 1 : 0)) == 0) || (n8 = (int)(this.A0 ? 1 : 0)) != 0) break block10;
                    break block11;
                }
                object = this.A.K();
                if (object == (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INFEED) || (n8 = (object = this.A).W()) != 0) break block10;
                object = this.g;
                if (object != null) {
                    object = ((com.jio.jioads.native.parser.a)object).H;
                } else {
                    n8 = 0;
                    object = null;
                }
                if (object != null && (n4 = StringsKt.F((CharSequence)object, string2, n7 != 0)) == n7) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    string2 = null;
                }
                if (object != null && (n3 = StringsKt.F((CharSequence)object, string3, n7 != 0)) == n7) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    string3 = null;
                }
                if (object == null || (n8 = ((String)object).length()) == 0 || n4 == 0 || n3 == 0 || (n8 = (int)(this.A0 ? 1 : 0)) != 0) break block10;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final boolean isViewUpdate$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.i0;
    }

    public final void j() {
        Object object = new StringBuilder();
        Object object2 = this.A;
        Object object3 = ": inside downloadAllMediaFileAndSetToView ";
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object, (String)object3);
        int n3 = this.A0;
        ((StringBuilder)object).append(n3 != 0);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        object2 = this.m;
        n3 = ((HashMap)object2).size();
        if (n3 == 0) {
            n3 = (int)(this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0);
            if (n3 != 0) {
                object2 = Looper.getMainLooper();
                object = new Handler((Looper)object2);
                object2 = new com.jio.jioads.native.renderer.g(this);
                object.post((Runnable)object2);
            } else {
                n3 = (int)(this.A0 ? 1 : 0);
                if (n3 != 0) {
                    object2 = Looper.getMainLooper();
                    object = new Handler((Looper)object2);
                    int n4 = 1;
                    object2 = new cg_0(this, n4);
                    object.post((Runnable)object2);
                } else {
                    object2 = new StringBuilder();
                    object3 = this.A;
                    String string2 = ": All the ad image urls are null";
                    com.jio.jioads.common.l.a((com.jio.jioads.common.b)object3, (StringBuilder)object2, string2, (JioAds$Companion)object);
                    object = JioAdError$JioAdErrorType.ERROR_MEDIA_FILES_EMPTY;
                    object2 = "All the ad image urls are null";
                    this.a((JioAdError$JioAdErrorType)((Object)object), (String)object2);
                }
            }
        } else {
            HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
            object = this.m.keySet().iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (String)object.next();
                object3 = (h)this.m.get(object2);
                if (object3 == null) continue;
                Intrinsics.checkNotNull(object2);
                object3 = ((h)object3).a;
                hashMap.put(object2, object3);
            }
            Context context = this.j;
            if (context != null) {
                JioAds$MediaType jioAds$MediaType = JioAds$MediaType.IMAGE;
                m m2 = new m(this, hashMap);
                object2 = ((com.jio.jioads.controller.f)this.h).a;
                n3 = ((com.jio.jioads.controller.o)object2).l;
                Integer n7 = n3;
                String string3 = "";
                String string4 = "";
                String string5 = "";
                object3 = object;
                object = new com.jio.jioads.utils.l(context, hashMap, string3, jioAds$MediaType, false, string4, string5, m2, n7);
                ((com.jio.jioads.utils.l)object).a();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void k() {
        block15: {
            block16: {
                var1_1 = this.s;
                var2_2 = 0;
                var3_3 = null;
                if (var1_1 != null) {
                    var4_4 = "NativeIconLayout";
                    var1_1 = var1_1.findViewWithTag(var4_4);
                } else {
                    var5_5 = 0;
                    var1_1 = null;
                }
                if (var1_1 != null) {
                    var6_6 = var1_1 instanceof ViewGroup;
                    if (var6_6) {
                        this.q0 = var1_1;
                    } else {
                        var1_1 = new StringBuilder();
                        var4_4 = this.A;
                        var7_7 = ": native_icon_layout must be tagged on a ViewGroup";
                        j_0.i((com.jio.jioads.common.b)var4_4, (StringBuilder)var1_1, (String)var7_7);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var1_1 = JioAds$LogLevel.NONE;
                    }
                }
                if ((var1_1 = this.q0) == null) break block15;
                var1_1 = this.g;
                if (var1_1 != null) {
                    var1_1 = var1_1.o;
                    var8_8 /* !! */  = var1_1;
                } else {
                    var8_8 /* !! */  = null;
                }
                var5_5 = TextUtils.isEmpty(var8_8 /* !! */ );
                if (var5_5 != 0) break block16;
                var1_1 = new StringBuilder();
                var4_4 = this.A;
                var7_7 = ": Icon Image URL: ";
                l_0.d((com.jio.jioads.common.b)var4_4, (StringBuilder)var1_1, (String)var7_7, (String)var8_8 /* !! */ );
                var1_1 = JioAds.Companion;
                var1_1.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var4_4 = JioAds$LogLevel.NONE;
                var4_4 = new URL((String)var8_8 /* !! */ );
                var4_4 = var4_4.getPath();
                var9_9 = 1;
                if (var4_4 != null) {
                    var10_10 = 6;
                    var2_2 = StringsKt.Q((CharSequence)var4_4, '/', 0, var10_10);
                    var11_11 = 92;
                    var10_10 = StringsKt.Q((CharSequence)var4_4, (char)var11_11, 0, var10_10);
                    var2_2 = Math.max(var2_2, var10_10) + var9_9;
                    var3_3 = var4_4.substring(var2_2);
                    var4_4 = "this as java.lang.String).substring(startIndex)";
                    Intrinsics.checkNotNullExpressionValue(var3_3, (String)var4_4);
                }
                var4_4 = new StringBuilder();
                var7_7 = this.A;
                var12_12 = ": Icon Image file Name: ";
                l_0.d((com.jio.jioads.common.b)var7_7, (StringBuilder)var4_4, var12_12, (String)var3_3);
                var4_4 = var1_1.getInstance();
                var4_4.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var6_6 = TextUtils.isEmpty((CharSequence)var3_3);
                if (var6_6 || var3_3 == null) ** GOTO lbl-1000
                var4_4 = Locale.getDefault();
                var7_7 = "getDefault(...)";
                Intrinsics.checkNotNullExpressionValue(var4_4, (String)var7_7);
                var3_3 = var3_3.toLowerCase((Locale)var4_4);
                var4_4 = "this as java.lang.String).toLowerCase(locale)";
                Intrinsics.checkNotNullExpressionValue(var3_3, (String)var4_4);
                if (var3_3 != null && (var2_2 = (int)StringsKt.F((CharSequence)var3_3, (CharSequence)(var4_4 = ".gif"), false)) == var9_9) {
                    var3_3 = new StringBuilder();
                    var4_4 = this.A;
                    var7_7 = ": Adding Icon Image URL In GIF Format";
                    com.jio.jioads.common.l.a((com.jio.jioads.common.b)var4_4, (StringBuilder)var3_3, (String)var7_7, (JioAds$Companion)var1_1);
                    var13_13 = this.q0;
                    Intrinsics.checkNotNull(var13_13);
                    var10_10 = 80;
                    var11_11 = 80;
                    var14_15 = "iconByteArray";
                    var15_17 = true;
                    var4_4 = this;
                    this.a(var10_10, var11_11, (View)var13_13, var14_15, (String)var8_8 /* !! */ , var15_17);
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = new StringBuilder();
                    var4_4 = this.A;
                    var7_7 = ": Adding Icon Image URL In IMAGE Format";
                    j_0.i((com.jio.jioads.common.b)var4_4, (StringBuilder)var3_3, (String)var7_7);
                    var1_1.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var3_3 = this.j;
                    var13_14 = new ImageView((Context)var3_3);
                    var10_10 = 80;
                    var11_11 = 80;
                    var14_16 = "iconByteArray";
                    var15_18 = false;
                    var4_4 = this;
                    this.a(var10_10, var11_11, (View)var13_14, var14_16, (String)var8_8 /* !! */ , false);
                }
                var3_3 = this.q0;
                if (var3_3 != null) {
                    var5_5 = var3_3.isClickable();
                    if (var5_5 == var9_9) {
                        this.K = var9_9;
                        var1_1 = this.q0;
                        Intrinsics.checkNotNull(var1_1);
                        var3_3 = this.L;
                        var3_3.add(var1_1);
                    }
                } else {
                    var3_3 = new StringBuilder();
                    var4_4 = this.A;
                    var7_7 = ": iconLayoutCustomNative  set to null";
                    com.jio.jioads.common.l.a((com.jio.jioads.common.b)var4_4, (StringBuilder)var3_3, (String)var7_7, (JioAds$Companion)var1_1);
                }
                if ((var1_1 = this.q0) != null) {
                    var1_1.setVisibility(0);
                }
                break block15;
            }
            var3_3 = "message";
            Intrinsics.checkNotNullParameter("Removing old icon", (String)var3_3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var1_1 = JioAds$LogLevel.NONE;
            var1_1 = this.q0;
            if (var1_1 != null) {
                var2_2 = 8;
                var1_1.setVisibility(var2_2);
            }
        }
    }

    public final void l() {
        Object object;
        int n3;
        int n4;
        String string2;
        Object object2 = this.s;
        com.jio.jioads.utils.l l2 = null;
        if (object2 != null) {
            string2 = "AdSource";
            object2 = (TextView)object2.findViewWithTag((Object)string2);
        } else {
            n4 = 0;
            object2 = null;
        }
        if (object2 != null) {
            n3 = 8;
            object2.setVisibility(n3);
        }
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        object2 = this.m.keySet().iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            string2 = (String)object2.next();
            object = (h)this.m.get(string2);
            if (object == null) continue;
            Intrinsics.checkNotNull(string2);
            object = ((h)object).a;
            hashMap.put(string2, object);
        }
        n n7 = new n(this, hashMap);
        Context context = this.j;
        if (context != null) {
            JioAds$MediaType jioAds$MediaType = JioAds$MediaType.IMAGE;
            object2 = ((com.jio.jioads.controller.f)this.h).a;
            n4 = ((com.jio.jioads.controller.o)object2).l;
            Integer n8 = n4;
            String string3 = "";
            String string4 = "";
            String string5 = "";
            object = l2;
            l2 = new com.jio.jioads.utils.l(context, hashMap, string3, jioAds$MediaType, false, string4, string5, n7, n8);
        }
        if (l2 != null) {
            l2.a();
        }
    }

    public final void loadNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(ViewGroup object, boolean bl2) {
        int n3;
        int n4;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "adview");
        Object object3 = this.v();
        this.F0 = object3;
        object3 = this.u();
        this.G0 = object3;
        object3 = this.g;
        Object object4 = null;
        if (object3 != null) {
            object2 = ((com.jio.jioads.native.parser.a)object3).A;
        } else {
            n4 = 0;
            object2 = null;
        }
        this.J0 = object2;
        if (object3 != null) {
            object2 = ((com.jio.jioads.native.parser.a)object3).d;
        } else {
            n4 = 0;
            object2 = null;
        }
        this.K0 = object2;
        if (object3 != null) {
            object3 = ((com.jio.jioads.native.parser.a)object3).e;
        } else {
            n3 = 0;
            object3 = null;
        }
        this.L0 = object3;
        this.H0 = object3 = this.get_cTAFallbackUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        this.w0 = "";
        n3 = 0;
        this.C = false;
        this.D = bl2;
        Object object5 = new StringBuilder();
        object3 = this.A;
        object2 = "  NativeAd called loadad called getLastAdType: ";
        j_0.n((com.jio.jioads.common.b)object3, (StringBuilder)object5, (String)object2);
        object3 = this.w;
        if (object3 != null) {
            object3 = object3.n();
        } else {
            n3 = 0;
            object3 = null;
        }
        object2 = "message";
        ir3_0.b((StringBuilder)object5, (String)object3, (String)object2);
        object5 = JioAds.Companion;
        ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = this.v;
        if (object3 != null && (object3 = this.s) != null && (n3 = (object3 = this.A).W()) == (n4 = 1)) {
            object3 = this.w;
            if (object3 != null) {
                object4 = object3.n();
            }
            if ((n3 = (int)(Intrinsics.areEqual(object4, object3 = "JSON") ? 1 : 0)) != 0) {
                object3 = new StringBuilder();
                object4 = this.A;
                object2 = ":  clear above set view ";
                com.jio.jioads.common.l.a((com.jio.jioads.common.b)object4, (StringBuilder)object3, (String)object2, (JioAds$Companion)object5);
                object5 = this.v;
                if (object5 != null) {
                    object3 = this.s;
                    object5.removeView((View)object3);
                }
            }
        }
        this.v = object;
        object = this.F;
        if (object != null) {
            ((HashMap)object).clear();
        }
        object = new s(this);
        com.jio.jioads.util.s.d((Function0)object);
    }

    public final void m() {
        Object object;
        Object object2 = this.v;
        int n3 = 50;
        if (object2 != null) {
            object = Utility.INSTANCE;
            Intrinsics.checkNotNull(object2);
            boolean bl2 = ((Utility)object).checkVisibility((ViewGroup)object2, n3);
            object2 = bl2;
        } else {
            int n4 = -1;
            object2 = n4;
        }
        object = new StringBuilder();
        Object object3 = this.A.P();
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append(": Inside fireFirstImpression checking visibility for viewableImpression ");
        ((StringBuilder)object).append(object2);
        object2 = ((StringBuilder)object).toString();
        object = "message";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object3 = JioAds$LogLevel.NONE;
        object3 = this.v;
        if (object3 != null) {
            Object object4;
            Object object5 = Utility.INSTANCE;
            Intrinsics.checkNotNull(object3);
            n3 = (int)(((Utility)object5).checkVisibility((ViewGroup)object3, n3) ? 1 : 0);
            if (n3 != 0 && (object4 = this.w) != null) {
                object4 = new StringBuilder();
                object3 = this.A;
                object5 = ": viewableImpression refresh ad fired from first impression Is native video ad:: ";
                j_0.n((com.jio.jioads.common.b)object3, (StringBuilder)object4, (String)object5);
                boolean bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                ((StringBuilder)object4).append(bl2);
                object4 = ((StringBuilder)object4).toString();
                Intrinsics.checkNotNullParameter(object4, (String)object);
                object2 = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                boolean bl3 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (!bl3) {
                    object2 = this.w;
                    if (object2 != null) {
                        n3 = 0;
                        object4 = null;
                        object2.e(false);
                    }
                    this.a0();
                }
            }
        }
    }

    public final void mute(boolean bl2) {
        Object object = new StringBuilder();
        String string2 = this.A.P();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": NativeAdViewRenderer mute called isCalledByDev: ");
        ((StringBuilder)object).append(bl2);
        object = ((StringBuilder)object).toString();
        string2 = "message";
        Intrinsics.checkNotNullParameter(object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.U;
        if (object != null) {
            ((com.jio.jioads.videomodule.s)object).F(bl2);
        }
        if ((object = this.V) != null) {
            ((com.jio.jioads.videomodule.s)object).F(bl2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final int[] n() {
        block17: {
            JioAdView$AD_TYPE jioAdView$AD_TYPE;
            int n3;
            float f5;
            int n4;
            int n7;
            void var1_24;
            Object object;
            int n8;
            int n10;
            float f6;
            Object object2;
            block20: {
                void var1_22;
                block22: {
                    block21: {
                        block19: {
                            void var1_17;
                            void var1_13;
                            block18: {
                                void var1_5;
                                JioAdView$AD_TYPE jioAdView$AD_TYPE2 = this.A.K();
                                object2 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                                f6 = 0.0f;
                                if (jioAdView$AD_TYPE2 == object2) break block17;
                                ViewGroup viewGroup = this.s;
                                n10 = 0;
                                object2 = null;
                                if (viewGroup != null) {
                                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                                } else {
                                    n8 = 0;
                                    Object var1_4 = null;
                                }
                                if (var1_5 == null) break block18;
                                ViewGroup viewGroup2 = this.s;
                                if (viewGroup2 == null) break block19;
                                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                                break block20;
                            }
                            ViewGroup viewGroup = this.s;
                            if (viewGroup != null) {
                                ViewParent viewParent = viewGroup.getParent();
                            } else {
                                n8 = 0;
                                Object var1_12 = null;
                            }
                            if (var1_13 == null) break block19;
                            ViewGroup viewGroup3 = this.s;
                            if (viewGroup3 != null) {
                                ViewParent viewParent = viewGroup3.getParent();
                            } else {
                                n8 = 0;
                                Object var1_16 = null;
                            }
                            object = "null cannot be cast to non-null type android.view.ViewGroup";
                            Intrinsics.checkNotNull(var1_17, (String)object);
                            ViewGroup.LayoutParams layoutParams = ((ViewGroup)var1_17).getLayoutParams();
                            if (layoutParams == null) break block19;
                            ViewGroup viewGroup4 = this.s;
                            if (viewGroup4 == null) break block21;
                            ViewParent viewParent = viewGroup4.getParent();
                            break block22;
                        }
                        n8 = 0;
                        Object var1_9 = null;
                        break block20;
                    }
                    n8 = 0;
                    Object var1_21 = null;
                }
                Intrinsics.checkNotNull(var1_22, (String)object);
                ViewGroup.LayoutParams layoutParams = ((ViewGroup)var1_22).getLayoutParams();
            }
            if (var1_24 != null) {
                n7 = var1_24.height;
                n4 = -2;
                f5 = 0.0f / 0.0f;
                n3 = -1;
                if (n7 != n3 && n7 != n4 || (n7 = var1_24.width) != n3 && n7 != n4) {
                    if (var1_24 != null) {
                        n7 = var1_24.width;
                        object = n7;
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    if (var1_24 != null) {
                        n8 = var1_24.height;
                        object2 = n8;
                    }
                    if (object != null && object2 != null) {
                        n8 = (Integer)object;
                        n10 = (Integer)object2;
                        return new int[]{n8, n10};
                    }
                }
            }
            if ((jioAdView$AD_TYPE = this.A.K()) == (object2 = JioAdView$AD_TYPE.INFEED)) {
                void var1_31;
                Context context = this.j;
                if (context == null) {
                    return new int[]{0, 0};
                }
                object2 = Utility.INSTANCE;
                Intrinsics.checkNotNull(context);
                n8 = ((Utility)object2).isDeviceTypeTablet(context);
                n7 = 1;
                n4 = 2;
                f5 = 2.8E-45f;
                if (n8 == 0) {
                    Context context2 = this.j;
                    Intrinsics.checkNotNull(context2);
                    n8 = ((Utility)object2).getCurrentUIModeType(context2);
                    n3 = 4;
                    if (n8 != n3) {
                        int[] nArray = new int[n4];
                        f5 = 320.0f;
                        nArray[0] = n4 = ((Utility)object2).convertDpToPixel(f5);
                        f6 = 50.0f;
                        nArray[n7] = n10 = ((Utility)object2).convertDpToPixel(f6);
                        return var1_31;
                    }
                }
                int[] nArray = new int[n4];
                f5 = 728.0f;
                nArray[0] = n4 = ((Utility)object2).convertDpToPixel(f5);
                f6 = 90.0f;
                nArray[n7] = n10 = ((Utility)object2).convertDpToPixel(f6);
                return var1_31;
            }
            JioAdView$AD_TYPE jioAdView$AD_TYPE3 = this.A.K();
            if (jioAdView$AD_TYPE3 == (object2 = JioAdView$AD_TYPE.CONTENT_STREAM)) {
                Utility utility = Utility.INSTANCE;
                n10 = utility.convertDpToPixel(300.0f);
                n8 = utility.convertDpToPixel(250.0f);
                return new int[]{n10, n8};
            }
        }
        return new int[]{0, 0};
    }

    public final ArrayList nativeAdClickTrackersUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        Object object = this.g;
        object = object != null ? ((com.jio.jioads.native.parser.a)object).E : null;
        return object;
    }

    public final int[] o() {
        int[] nArray = this.A.b();
        if (nArray == null) {
            int n3;
            int n4 = 2;
            nArray = new int[n4];
            nArray[0] = 320;
            int n7 = 1;
            nArray[n7] = n3 = 200;
        }
        return nArray;
    }

    public final void onDestroy$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        Object object = new StringBuilder();
        j_0.i(this.A, object, ": Inside onDestroy of NativeAdViewRenderer");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.clearAllData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        this.g();
    }

    /*
     * Exception decompiling
     */
    public final String p() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [16 : 123->126)] java.lang.Exception
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

    public final void pause$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        boolean bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (bl2) {
            Object object = new StringBuilder();
            com.jio.jioads.common.b b2 = this.A;
            String string2 = ": Pause called from NativeAdViewRenderer class";
            j_0.i(b2, (StringBuilder)object, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.U;
            boolean bl3 = true;
            if (object != null) {
                ((com.jio.jioads.videomodule.s)object).K(bl3);
            }
            if ((object = this.V) != null) {
                ((com.jio.jioads.videomodule.s)object).K(bl3);
            }
            if ((object = this.t0) != null) {
                ((com.jio.jioads.native.utils.a)object).a();
            }
            if ((object = this.Y) != null && (b2 = this.X) != null) {
                Intrinsics.checkNotNull(object);
                b2.removeCallbacks((Runnable)object);
            }
            if ((object = this.X) != null) {
                bl3 = false;
                b2 = null;
                object.removeCallbacksAndMessages(null);
            }
        }
    }

    public final void playAgainFromPublisher$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(boolean n3) {
        n3 = this.Z;
        int n4 = 1;
        if (n3 == n4) {
            com.jio.jioads.videomodule.s s7 = this.U;
            if (s7 != null) {
                s7.g();
            }
        } else {
            com.jio.jioads.videomodule.s s8;
            n4 = 2;
            if (n3 == n4 && (s8 = this.V) != null) {
                s8.g();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void prepareInterstitialNativeAdWithHandler$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        Exception exception2;
        String string2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        boolean bl2;
        NativeAdViewRenderer nativeAdViewRenderer;
        block40: {
            int n3;
            Object object6;
            block35: {
                block34: {
                    block39: {
                        block38: {
                            block37: {
                                block36: {
                                    int n4;
                                    nativeAdViewRenderer = this;
                                    bl2 = true;
                                    object5 = new StringBuilder();
                                    object4 = this.A;
                                    object3 = ": NativeAd: prepareInterstitialNativeAd() called ";
                                    j_0.i(object4, (StringBuilder)object5, (String)object3);
                                    object5 = JioAds.Companion;
                                    ((JioAds$Companion)object5).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object4 = JioAds$LogLevel.NONE;
                                    object4 = null;
                                    try {
                                        int n7;
                                        object3 = this.A;
                                        n4 = object3.l();
                                        if (n4 == 0) {
                                            object2 = this.j;
                                            object3 = new RelativeLayout((Context)object2);
                                            this.s = object3;
                                        }
                                        if ((object3 = nativeAdViewRenderer.g) != null) {
                                            object2 = ((com.jio.jioads.native.parser.a)object3).G;
                                        } else {
                                            n7 = 0;
                                            object2 = null;
                                        }
                                        object = null;
                                        if (object2 != null) {
                                            if (object3 != null) {
                                                object3 = ((com.jio.jioads.native.parser.a)object3).G;
                                            } else {
                                                n4 = 0;
                                                object3 = null;
                                            }
                                            object2 = "UNIFIED_AD";
                                            n4 = (int)(kotlin.text.b.i((String)object3, (String)object2, false) ? 1 : 0);
                                            if (n4 != 0) {
                                                boolean bl3 = nativeAdViewRenderer.k;
                                                if (bl3) {
                                                    object5 = nativeAdViewRenderer.s;
                                                    nativeAdViewRenderer.a((ViewGroup)object5, null);
                                                }
                                                if ((object5 = nativeAdViewRenderer.s) == null) return;
                                                object3 = new jh0_0(nativeAdViewRenderer, (int)(bl2 ? 1 : 0));
                                                long l2 = 1000L;
                                                object5.postDelayed((Runnable)object3, l2);
                                                return;
                                            }
                                        }
                                        object3 = nativeAdViewRenderer.A;
                                        if ((object3 = object3.C()) != null) {
                                            n7 = 6;
                                            object2 = n7;
                                            object3 = fh1_2.g(object2, (Map)object3);
                                            object3 = (Integer[])object3;
                                            object2 = object3[0];
                                            nativeAdViewRenderer.p = n7 = ((Integer)object2).intValue();
                                            object3 = object3[bl2];
                                            nativeAdViewRenderer.q = n4 = ((Integer)object3).intValue();
                                        }
                                        n4 = nativeAdViewRenderer.p;
                                        n7 = -1;
                                        string2 = "message";
                                        if (n4 != n7) break block34;
                                        object5 = nativeAdViewRenderer.s;
                                        if (object5 == null) {
                                            object3 = nativeAdViewRenderer.j;
                                            object5 = new RelativeLayout((Context)object3);
                                            nativeAdViewRenderer.s = object5;
                                        }
                                        object5 = this.t();
                                        nativeAdViewRenderer.s = object5;
                                        object5 = nativeAdViewRenderer.A;
                                        if ((object5 = object5.H()) == null) break block35;
                                        object5 = nativeAdViewRenderer.A;
                                        object6 = (object5 = object5.H()) == (object3 = JioAdView$ORIENTATION_TYPE.PORTRAIT) ? nativeAdViewRenderer.b(false) : nativeAdViewRenderer.b(bl2);
                                    }
                                    catch (Exception exception2) {}
                                    try {
                                        n3 = ((String)object6).hashCode();
                                        n4 = -2097166016;
                                        if (n3 != n4) {
                                            n4 = -1629653373;
                                            if (n3 != n4) {
                                                n4 = 1339834785;
                                                if (n3 != n4) {
                                                    n4 = 1801166501;
                                                    if (n3 != n4 || (n3 = (int)(((String)object6).equals(object5 = "jio_native_interstitial") ? 1 : 0)) == 0) break block36;
                                                    n3 = R$layout.jio_native_interstitial;
                                                    object5 = n3;
                                                    break block37;
                                                }
                                                object5 = "jio_native_interstitial_landscape";
                                                n3 = (int)(((String)object6).equals(object5) ? 1 : 0);
                                                if (n3 == 0) break block36;
                                                n3 = R$layout.jio_native_interstitial_landscape;
                                                object5 = n3;
                                                break block37;
                                            }
                                            object5 = "jio_native_interstitial_landscape_stb";
                                            n3 = (int)(((String)object6).equals(object5) ? 1 : 0);
                                            if (n3 == 0) break block36;
                                            n3 = R$layout.jio_native_interstitial_landscape_stb;
                                            object5 = n3;
                                            break block37;
                                        }
                                        object5 = "jio_native_interstitial_tablet";
                                        n3 = (int)(((String)object6).equals(object5) ? 1 : 0);
                                        if (n3 == 0) break block36;
                                        n3 = R$layout.jio_native_interstitial_tablet;
                                        object5 = n3;
                                        break block37;
                                    }
                                    catch (Exception exception3) {}
                                }
                                n3 = 0;
                                object5 = null;
                            }
                            object3 = nativeAdViewRenderer.j;
                            object3 = LayoutInflater.from((Context)object3);
                            if (object5 == null) break block38;
                            bl2 = ((Integer)object5).intValue();
                            break block39;
                            break block40;
                        }
                        object5 = nativeAdViewRenderer.j;
                        Intrinsics.checkNotNull(object5);
                        object5 = object5.getResources();
                        object2 = "layout";
                        Object object7 = nativeAdViewRenderer.j;
                        Intrinsics.checkNotNull(object7);
                        object7 = object7.getPackageName();
                        bl2 = object5.getIdentifier((String)object6, (String)object2, (String)object7);
                    }
                    object6 = object3.inflate((int)(bl2 ? 1 : 0), null);
                    object5 = "null cannot be cast to non-null type android.widget.RelativeLayout";
                    Intrinsics.checkNotNull(object6, (String)object5);
                    object6 = (RelativeLayout)object6;
                    nativeAdViewRenderer.s = object6;
                    break block35;
                }
                object6 = new StringBuilder();
                object3 = nativeAdViewRenderer.A;
                object3 = object3.P();
                ((StringBuilder)object6).append((String)object3);
                object3 = ": using custom container for Interstitial";
                ((StringBuilder)object6).append((String)object3);
                object6 = ((StringBuilder)object6).toString();
                Intrinsics.checkNotNullParameter(object6, string2);
                object6 = ((JioAds$Companion)object5).getInstance();
                ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.T();
            }
            if ((object6 = nativeAdViewRenderer.s) != null) {
                object5 = "NativeTitle";
                object6 = object6.findViewWithTag(object5);
                object6 = (TextView)object6;
            } else {
                bl2 = false;
                object6 = null;
            }
            nativeAdViewRenderer.J = object6;
            object6 = nativeAdViewRenderer.s;
            if (object6 != null) {
                object5 = "NativeCTA";
                object6 = object6.findViewWithTag(object5);
                object6 = (TextView)object6;
            } else {
                bl2 = false;
                object6 = null;
            }
            nativeAdViewRenderer.i = object6;
            object6 = nativeAdViewRenderer.G;
            if (object6 != null) {
                object6.removeAllViews();
            }
            if ((object6 = nativeAdViewRenderer.H) != null) {
                object6.removeAllViews();
            }
            if ((object6 = nativeAdViewRenderer.s) != null) {
                object5 = "NativeMediaLayout";
                object6 = object6.findViewWithTag(object5);
                object6 = (ViewGroup)object6;
            } else {
                bl2 = false;
                object6 = null;
            }
            nativeAdViewRenderer.G = object6;
            object6 = nativeAdViewRenderer.s;
            if (object6 != null) {
                object5 = "NativeIconLayout";
                object6 = object6.findViewWithTag(object5);
                object6 = (FrameLayout)object6;
            } else {
                bl2 = false;
                object6 = null;
            }
            nativeAdViewRenderer.H = object6;
            this.X();
            this.W();
            bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (!bl2) {
                this.V();
            } else {
                object6 = nativeAdViewRenderer.i;
                if (object6 != null) {
                    n3 = 8;
                    object6.setVisibility(n3);
                }
            }
            this.U();
            bl2 = this.c();
            object5 = new StringBuilder();
            object3 = nativeAdViewRenderer.A;
            object3 = object3.P();
            ((StringBuilder)object5).append((String)object3);
            object3 = ": Inside prepareInterstitialNativeAdWithHandler, a Value an isSucceed is:  ";
            ((StringBuilder)object5).append((String)object3);
            ((StringBuilder)object5).append(bl2);
            object5 = ((StringBuilder)object5).toString();
            Intrinsics.checkNotNullParameter(object5, string2);
            object5 = JioAds.Companion;
            object5 = ((JioAds$Companion)object5).getInstance();
            ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
            if (!bl2) return;
            this.S();
            this.Q();
            object6 = nativeAdViewRenderer.s;
            if (object6 == null) return;
            this.C();
            object6 = nativeAdViewRenderer.G;
            if (object6 == null) {
                return;
            }
            object6.setVisibility(0);
            return;
        }
        object5 = new StringBuilder("NativeAdView showDynamicDisplayAd catch ");
        object3 = exception2.getMessage();
        ((StringBuilder)object5).append((String)object3);
        object5 = ((StringBuilder)object5).toString();
        object3 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        nativeAdViewRenderer.a((JioAdError$JioAdErrorType)((Object)object3), (String)object5);
        object5 = nativeAdViewRenderer.A.k0();
        object2 = JioAdView$AdState.DESTROYED;
        if (object5 != object2) {
            object5 = nativeAdViewRenderer.A;
            object4 = object5.Y();
        }
        object = object4;
        object2 = Utility.INSTANCE;
        string2 = nativeAdViewRenderer.A.P();
        com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
        String string3 = ((JioAdError$JioAdErrorType)((Object)object3)).getErrorTitle();
        object4 = "exception:";
        object5 = new StringBuilder((String)object4);
        String string4 = com.jio.jioads.instream.audio.a.a(exception2, (StringBuilder)object5);
        com.jio.jioads.cdnlogging.a a2 = ((com.jio.jioads.controller.f)nativeAdViewRenderer.h).a.T();
        String string5 = nativeAdViewRenderer.A.q0();
        String string6 = ((JioAdError$JioAdErrorType)((Object)object3)).getErrorCode();
        com.jio.jioads.controller.o o3 = ((com.jio.jioads.controller.f)nativeAdViewRenderer.h).a;
        bl2 = o3.a();
        Boolean bl4 = bl2;
        String string7 = "prepareInterstitialNativeAdWithHandler";
        ((Utility)object2).logError((Context)object, string2, d2, string3, string4, a2, string7, bl4, string5, string6, false);
    }

    public final void prepareViews$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        Object object = new StringBuilder();
        j_0.i(this.A, object, ": Preparing containerView inside prepareViews");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = new u(this);
        com.jio.jioads.util.s.d((Function0)object);
    }

    public final String q() {
        int n3;
        Object object = this.A.m0();
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object = String.valueOf(this.A.m0());
            String[] stringArray = new String[]{"x"};
            object = StringsKt.a0((CharSequence)object, stringArray, false, 0, 6);
            stringArray = new String[]{};
            return object.toArray(stringArray)[1];
        }
        object = new StringBuilder();
        j_0.i(this.A, (StringBuilder)object, ": Maximum Custom Size is not passed");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        return "";
    }

    public final String r() {
        int n3;
        Object object = this.A.m0();
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object = String.valueOf(this.A.m0());
            String[] stringArray = new String[]{"x"};
            object = StringsKt.a0((CharSequence)object, stringArray, false, 0, 6);
            stringArray = new String[]{};
            return object.toArray(stringArray)[0];
        }
        object = new StringBuilder();
        j_0.i(this.A, (StringBuilder)object, ": Maximum Custom Size is not passed");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        return "";
    }

    public final void resume$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        Object object;
        int n3;
        Object object2;
        boolean bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        boolean bl3 = true;
        if (bl2) {
            bl2 = this.v0;
            if (!bl2) {
                object2 = this.U;
                if (object2 != null) {
                    ((com.jio.jioads.videomodule.s)object2).O(bl3);
                }
                if ((object2 = this.V) != null) {
                    ((com.jio.jioads.videomodule.s)object2).O(bl3);
                }
            } else if (bl2 && ((object2 = this.U) != null && (bl2 = ((com.jio.jioads.videomodule.s)object2).j0) == bl3 || (object2 = this.V) != null && (bl2 = ((com.jio.jioads.videomodule.s)object2).j0) == bl3) && (object2 = this.t0) != null) {
                n3 = ((com.jio.jioads.native.utils.a)object2).i;
                if (n3 != 0) {
                    n3 = 0;
                    object = null;
                    ((com.jio.jioads.native.utils.a)object2).i = false;
                }
                ((com.jio.jioads.native.utils.a)object2).c();
            }
        }
        if ((object2 = this.X) != null && (object = this.Y) != null) {
            Intrinsics.checkNotNull(object);
            int n4 = this.T;
            long l2 = n4;
            long l3 = 1000L;
            object2.postDelayed((Runnable)object, l2 *= l3);
        }
        if ((bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) && (object2 = this.w) != null && !(bl2 = object2.g()) && (object2 = this.v) != null) {
            object2 = new StringBuilder();
            com.jio.jioads.common.b b2 = this.A;
            object = ": Resume call from OnResume()";
            j_0.i(b2, (StringBuilder)object2, (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            this.z();
        } else {
            bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (!bl2) {
                this.a(bl3);
                bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (!bl2 && (object2 = this.v) != null) {
                    Object object3 = Utility.INSTANCE;
                    Intrinsics.checkNotNull(object2);
                    n3 = 5;
                    bl2 = ((Utility)object3).checkVisibility((ViewGroup)object2, n3);
                    if (bl2) {
                        object2 = new StringBuilder();
                        object3 = this.A;
                        object = ": native ad starting refresh handler after view visibility";
                        j_0.i((com.jio.jioads.common.b)object3, (StringBuilder)object2, (String)object);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object2 = JioAds$LogLevel.NONE;
                        object2 = this.w;
                        if (object2 != null) {
                            object2.d();
                        }
                    }
                }
            }
        }
    }

    public final HashMap s() {
        return (HashMap)this.S.getValue();
    }

    public final void setBooleanVariableValue() {
        this.j0 = false;
    }

    public final void setBrandUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.y = string2;
    }

    public final void setCTAFallbackUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.H0 = string2;
    }

    public final void setClickViewList(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.L = list;
    }

    public final void setCloseAfter$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(InterstitialActivity interstitialActivity) {
        Intrinsics.checkNotNullParameter(interstitialActivity, "interstitialActivity");
        this.y0 = interstitialActivity;
    }

    public final void setContainerView(ViewGroup viewGroup) {
        this.s = viewGroup;
    }

    public final void setIJioAdView(com.jio.jioads.common.b b2) {
        Intrinsics.checkNotNullParameter(b2, "<set-?>");
        this.A = b2;
    }

    public final void setJioVideoView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(com.jio.jioads.videomodule.s s7) {
        this.U = s7;
    }

    public final void setJioVideoViewSecond$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(com.jio.jioads.videomodule.s s7) {
        this.V = s7;
    }

    public final void setMediaLayout$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(ViewGroup viewGroup) {
        this.G = viewGroup;
    }

    public final void setNativeDynamicLowerThen100$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(boolean bl2) {
        this.a = bl2;
    }

    public final void setOrientation$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(int n3) {
        JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE;
        JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE2;
        JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE3;
        int n4 = 1;
        this.d = n3 != n4 ? (n3 != (n4 = 2) ? (jioAdView$ORIENTATION_TYPE3 = JioAdView$ORIENTATION_TYPE.PORTRAIT) : (jioAdView$ORIENTATION_TYPE2 = JioAdView$ORIENTATION_TYPE.LANDSCAPE)) : (jioAdView$ORIENTATION_TYPE = JioAdView$ORIENTATION_TYPE.PORTRAIT);
    }

    public final void setShouldShowCarousel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(boolean bl2) {
        this.A0 = bl2;
    }

    public final void setTime(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.P = string2;
    }

    public final void setViewUpdate$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(boolean bl2) {
        this.i0 = bl2;
    }

    public final void setWaitForCompleteHTMLAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(boolean bl2) {
        this.c = bl2;
    }

    public final RelativeLayout t() {
        block48: {
            Object object;
            Object object2;
            int n3;
            Object object3;
            block60: {
                Object object4;
                block59: {
                    block58: {
                        int n4;
                        block57: {
                            block54: {
                                block55: {
                                    block56: {
                                        block53: {
                                            block51: {
                                                block52: {
                                                    block50: {
                                                        block49: {
                                                            object3 = this.j;
                                                            if (object3 == null) break block48;
                                                            object3 = object3.getResources();
                                                            if (object3 == null) break block48;
                                                            object3 = this.j;
                                                            if (object3 == null) break block49;
                                                            object3 = object3.getResources();
                                                            if (object3 == null) break block49;
                                                            object3 = object3.getConfiguration();
                                                            break block50;
                                                        }
                                                        n3 = 0;
                                                        object3 = null;
                                                    }
                                                    if (object3 == null) break block48;
                                                    object3 = this.d;
                                                    n4 = 1;
                                                    if (object3 != null) break block51;
                                                    object3 = this.j;
                                                    if (object3 == null) break block52;
                                                    object3 = object3.getResources();
                                                    if (object3 == null) break block52;
                                                    object3 = object3.getConfiguration();
                                                    if (object3 == null) break block52;
                                                    n3 = ((Configuration)object3).orientation;
                                                    if (n3 != n4) break block52;
                                                    object3 = JioAdView$ORIENTATION_TYPE.PORTRAIT;
                                                    break block51;
                                                }
                                                object3 = JioAdView$ORIENTATION_TYPE.LANDSCAPE;
                                            }
                                            object2 = new StringBuilder();
                                            object4 = this.A;
                                            object4 = object4.P();
                                            ((StringBuilder)object2).append((String)object4);
                                            object4 = ": Orientation: ";
                                            ((StringBuilder)object2).append((String)object4);
                                            ((StringBuilder)object2).append(object3);
                                            object2 = ((StringBuilder)object2).toString();
                                            object4 = "message";
                                            Intrinsics.checkNotNullParameter(object2, (String)object4);
                                            object2 = JioAds.Companion;
                                            object2 = ((JioAds$Companion)object2).getInstance();
                                            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                            object2 = JioAds$LogLevel.NONE;
                                            object2 = JioAdView$ORIENTATION_TYPE.LANDSCAPE;
                                            if (object3 == object2) break block53;
                                            n4 = 0;
                                            object = null;
                                        }
                                        object3 = this.b(n4 != 0);
                                        try {
                                            n4 = ((String)object3).hashCode();
                                            int n7 = -2097166016;
                                            if (n4 == n7) break block54;
                                            n7 = -1629653373;
                                            if (n4 == n7) break block55;
                                            n7 = 1339834785;
                                            if (n4 == n7) break block56;
                                            n7 = 1801166501;
                                            if (n4 != n7) break block57;
                                            object = "jio_native_interstitial";
                                        }
                                        catch (Exception exception) {}
                                        n4 = (int)(((String)object3).equals(object) ? 1 : 0);
                                        if (n4 == 0) break block57;
                                        n4 = R$layout.jio_native_interstitial;
                                        object = n4;
                                        break block58;
                                    }
                                    object = "jio_native_interstitial_landscape";
                                    n4 = (int)(((String)object3).equals(object) ? 1 : 0);
                                    if (n4 == 0) break block57;
                                    n4 = R$layout.jio_native_interstitial_landscape;
                                    object = n4;
                                    break block58;
                                }
                                object = "jio_native_interstitial_landscape_stb";
                                n4 = (int)(((String)object3).equals(object) ? 1 : 0);
                                if (n4 == 0) break block57;
                                n4 = R$layout.jio_native_interstitial_landscape_stb;
                                object = n4;
                                break block58;
                            }
                            object = "jio_native_interstitial_tablet";
                            n4 = (int)(((String)object3).equals(object) ? 1 : 0);
                            if (n4 == 0) break block57;
                            n4 = R$layout.jio_native_interstitial_tablet;
                            object = n4;
                            break block58;
                        }
                        n4 = 0;
                        object = null;
                    }
                    try {
                        object2 = this.j;
                    }
                    catch (Exception exception) {}
                    object2 = LayoutInflater.from((Context)object2);
                    if (object == null) break block59;
                    n3 = (Integer)object;
                    break block60;
                }
                object = this.j;
                Intrinsics.checkNotNull(object);
                object = object.getResources();
                object4 = "layout";
                Object object5 = this.j;
                Intrinsics.checkNotNull(object5);
                object5 = object5.getPackageName();
                n3 = object.getIdentifier((String)object3, (String)object4, (String)object5);
            }
            object3 = object2.inflate(n3, null);
            object = "null cannot be cast to non-null type android.widget.RelativeLayout";
            Intrinsics.checkNotNull(object3, (String)object);
            return (RelativeLayout)object3;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String u() {
        Exception exception2;
        Object object;
        block18: {
            block20: {
                int n3;
                CharSequence charSequence;
                Object object2;
                int n4;
                Object object3;
                Object object4;
                int n7;
                Object object5;
                block21: {
                    block17: {
                        block16: {
                            object5 = "message";
                            try {
                                object = this.g;
                                if (object == null) break block16;
                                object = ((com.jio.jioads.native.parser.a)object).g;
                                break block17;
                            }
                            catch (Exception exception2) {
                                break block18;
                            }
                        }
                        n7 = 0;
                        object = null;
                    }
                    object4 = new StringBuilder();
                    object3 = this.g;
                    if (object3 != null) {
                        object3 = ((com.jio.jioads.native.parser.a)object3).e;
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    ((StringBuilder)object4).append((String)object3);
                    object3 = ": Native click url: ";
                    ((StringBuilder)object4).append((String)object3);
                    ((StringBuilder)object4).append((String)object);
                    object4 = ((StringBuilder)object4).toString();
                    Intrinsics.checkNotNullParameter(object4, (String)object5);
                    object4 = JioAds.Companion;
                    object3 = ((JioAds$Companion)object4).getInstance();
                    ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    object3 = this.j;
                    if (object3 == null) break block20;
                    if (object == null || (n4 = TextUtils.isEmpty((CharSequence)object)) != 0) break block21;
                    n4 = TextUtils.isEmpty((CharSequence)object);
                    if (n4 != 0) break block20;
                    object3 = Utility.INSTANCE;
                    object2 = this.j;
                    Intrinsics.checkNotNull(object2);
                    n4 = (int)(((Utility)object3).isIntentActivityPresent((Context)object2, (String)object) ? 1 : 0);
                    if (n4 != 0) break block20;
                }
                object = (n7 = this.Z) == (n4 = 1) ? this.U : this.V;
                object2 = this.g;
                if ((object2 = object2 != null ? ((com.jio.jioads.native.parser.a)object2).k : null) != null) {
                    charSequence = StringsKt.m0((CharSequence)object2);
                    charSequence = ((Object)charSequence).toString();
                } else {
                    n3 = 0;
                    charSequence = null;
                }
                if (charSequence != null && (n3 = ((String)charSequence).length()) != 0) {
                    n3 = 0;
                    charSequence = null;
                } else {
                    n3 = 1;
                }
                if ((n4 ^= n3) == 0) {
                    object2 = null;
                }
                if (object2 == null) {
                    if (object != null) {
                        object = ((com.jio.jioads.videomodule.s)object).S();
                    } else {
                        n7 = 0;
                        object = null;
                    }
                } else {
                    object = object2;
                }
                object3 = new StringBuilder();
                object2 = this.g;
                object2 = object2 != null ? ((com.jio.jioads.native.parser.a)object2).e : null;
                ((StringBuilder)object3).append((String)object2);
                object2 = ": Native fallback click url: ";
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append((String)object);
                object3 = ((StringBuilder)object3).toString();
                Intrinsics.checkNotNullParameter(object3, (String)object5);
                object5 = ((JioAds$Companion)object4).getInstance();
                ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            }
            return object;
        }
        object = new StringBuilder();
        j_0.n(this.A, (StringBuilder)object, ": Error in getCtaUrl(): ");
        com.jio.jioads.jioreel.tracker.model.b.c(Utility.INSTANCE, exception2, (StringBuilder)object);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return null;
    }

    public final void unMute(boolean bl2) {
        Object object = new StringBuilder();
        String string2 = this.A.P();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(": NativeAdViewRenderer unmute called isCalledByDev: ");
        ((StringBuilder)object).append(bl2);
        object = ((StringBuilder)object).toString();
        string2 = "message";
        Intrinsics.checkNotNullParameter(object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.U;
        if (object != null) {
            ((com.jio.jioads.videomodule.s)object).Q(bl2);
        }
        if ((object = this.V) != null) {
            ((com.jio.jioads.videomodule.s)object).Q(bl2);
        }
    }

    public final void updateJioAdParser$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(com.jio.jioads.native.parser.a object, Map object2) {
        Intrinsics.checkNotNullParameter(object, "lJioAdParser");
        String string2 = "headers";
        Intrinsics.checkNotNullParameter(object2, string2);
        this.g = object;
        this.e = object2;
        this.s().clear();
        object = this.s();
        object2 = this.e;
        ((HashMap)object).putAll(object2);
        object = this.A.K();
        object2 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
        if (object == object2) {
            boolean bl2;
            this.i0 = bl2 = true;
        }
    }

    public final void updateJioAdParserVast$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(Map map2, String object) {
        Intrinsics.checkNotNullParameter(map2, "headers");
        Intrinsics.checkNotNullParameter(object, "adResponse");
        this.f = object;
        this.e = map2;
        this.s().clear();
        map2 = this.s();
        object = this.e;
        ((HashMap)map2).putAll(object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String v() {
        block19: {
            block17: {
                block20: {
                    block18: {
                        var1_1 = "message";
                        try {
                            var2_3 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            var3_4 = null;
                            if (var2_3) {
                                var4_5 = new StringBuilder();
                                var5_7 /* !! */  = this.A;
                                var5_7 /* !! */  = var5_7 /* !! */ .P();
                                var4_5.append((String)var5_7 /* !! */ );
                                var5_7 /* !! */  = ": Native video ad so trying to get VAST click URL first";
                                var4_5.append((String)var5_7 /* !! */ );
                                var4_5 = var4_5.toString();
                                Intrinsics.checkNotNullParameter(var4_5, (String)var1_1);
                                var4_5 = JioAds.Companion;
                                var5_7 /* !! */  = var4_5.getInstance();
                                var5_7 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var5_7 /* !! */  = JioAds$LogLevel.NONE;
                                var6_8 = this.Z;
                                var7_9 = 1;
                                if (var6_8 != var7_9) break block17;
                                var5_7 /* !! */  = this.U;
                                if (var5_7 /* !! */  == null) break block18;
                                var8_10 = var5_7 /* !! */ .b;
                                var8_10 = var8_10.a;
                                if (var8_10 == null) break block18;
                                var8_10 = var8_10.g;
                                var5_7 /* !! */  = var5_7 /* !! */ .T();
                                var9_12 = (int)var8_10.isEmpty();
                                if ((var7_9 ^= var9_12) == 0) break block18;
                            }
                            ** GOTO lbl100
                        }
                        catch (Exception var1_2) {
                            break block19;
                        }
                        var5_7 /* !! */  = var8_10.get(var5_7 /* !! */ );
                        var5_7 /* !! */  = (String)var5_7 /* !! */ ;
                        break block20;
                    }
                    var6_8 = 0;
                    var5_7 /* !! */  = null;
                }
                this.x = var5_7 /* !! */ ;
                ** GOTO lbl65
            }
            var10_14 = 2;
            if (var6_8 != var10_14) ** GOTO lbl65
            var5_7 /* !! */  = this.V;
            if (var5_7 /* !! */  == null) ** GOTO lbl61
            var8_11 = var5_7 /* !! */ .b;
            var8_11 = var8_11.a;
            if (var8_11 == null) ** GOTO lbl61
            var8_11 = var8_11.g;
            var5_7 /* !! */  = var5_7 /* !! */ .T();
            var9_13 = (int)var8_11.isEmpty();
            if ((var7_9 ^= var9_13) == 0) ** GOTO lbl61
            {
                block21: {
                    var5_7 /* !! */  = var8_11.get(var5_7 /* !! */ );
                    var5_7 /* !! */  = (String)var5_7 /* !! */ ;
                    break block21;
lbl61:
                    // 3 sources

                    var6_8 = 0;
                    var5_7 /* !! */  = null;
                }
                this.x = var5_7 /* !! */ ;
lbl65:
                // 3 sources

                var5_7 /* !! */  = this.x;
                if (var5_7 /* !! */  != null) return this.x;
                var5_7 /* !! */  = new StringBuilder();
                var11_15 = this.A;
                var11_15 = var11_15.P();
                var5_7 /* !! */ .append((String)var11_15);
                var11_15 = ": VAST click url is null so considering json clickUrl";
                var5_7 /* !! */ .append((String)var11_15);
                var5_7 /* !! */  = var5_7 /* !! */ .toString();
                Intrinsics.checkNotNullParameter(var5_7 /* !! */ , (String)var1_1);
                var1_1 = var4_5.getInstance();
                var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var1_1 = this.g;
                if (var1_1 != null) {
                    var4_5 = var1_1.g;
                } else {
                    var2_3 = false;
                    var4_5 = null;
                }
                this.x = var4_5;
                if (var1_1 != null) {
                    var1_1 = var1_1.h;
                } else {
                    var12_16 = false;
                    var1_1 = null;
                }
                this.y = var1_1;
                if (var4_5 != null) {
                    var12_16 = TextUtils.isEmpty((CharSequence)var4_5);
                    if (var12_16 == false) return this.x;
                }
                if ((var1_1 = this.g) != null) {
                    var3_4 = var1_1.k;
                }
                this.x = var3_4;
                return this.x;
lbl100:
                // 1 sources

                var1_1 = this.g;
                if (var1_1 != null) {
                    var4_6 = var1_1.g;
                } else {
                    var2_3 = false;
                    var4_6 = null;
                }
                this.x = var4_6;
                if (var1_1 != null) {
                    var1_1 = var1_1.h;
                } else {
                    var12_17 = false;
                    var1_1 = null;
                }
                this.y = var1_1;
                if (var4_6 != null) {
                    var12_17 = TextUtils.isEmpty((CharSequence)var4_6);
                    if (var12_17 == false) return this.x;
                }
                if ((var1_1 = this.g) != null) {
                    var3_4 = var1_1.k;
                }
                this.x = var3_4;
                return this.x;
            }
        }
        var4_5 = new StringBuilder();
        var3_4 = this.A;
        var5_7 /* !! */  = ": Error while getting native click URL";
        j_0.i((com.jio.jioads.common.b)var3_4, (StringBuilder)var4_5, (String)var5_7 /* !! */ );
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var4_5 = JioAds$LogLevel.NONE;
        var4_5 = Utility.INSTANCE;
        var4_5.printStacktrace(var1_2);
        return this.x;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void w() {
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        int n3;
        int n4;
        Object object;
        Object object2;
        block15: {
            String string2;
            block16: {
                block17: {
                    object2 = new StringBuilder();
                    j_0.i(this.A, (StringBuilder)object2, ": inside handleAdRenderCallback");
                    object2 = JioAds.Companion;
                    ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = this.A.K();
                    JioAdView$AD_TYPE jioAdView$AD_TYPE2 = JioAdView$AD_TYPE.INTERSTITIAL;
                    string2 = "";
                    if (object == jioAdView$AD_TYPE2) {
                        boolean bl2 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        if (!bl2) {
                            object = this.A;
                            object.U();
                        }
                        if (!(bl2 = this.D)) return;
                        object = new StringBuilder();
                        com.jio.jioads.common.b b2 = this.A;
                        String string3 = ": Give onAdRender callback from native INTERSTITIAL handleAdRenderCallback";
                        com.jio.jioads.common.l.a(b2, (StringBuilder)object, string3, (JioAds$Companion)object2);
                        object2 = this.w;
                        if (object2 == null) return;
                        object2.b(string2);
                        return;
                    }
                    object = this.w;
                    if (object != null) {
                        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.STARTED;
                        object.j(jioAdView$AdState);
                    }
                    if ((n4 = this.I) == 0) break block15;
                    object = this.A;
                    n4 = object.l();
                    if (n4 == 0) break block16;
                    object = this.U;
                    if (object == null) break block17;
                    com.jio.jioads.native.callbaks.a a2 = this.w;
                    if (a2 != null) {
                        void var4_21;
                        if ((object = ((com.jio.jioads.videomodule.s)object).T()) != null) {
                            Object object3 = object;
                        }
                        a2.a((String)var4_21);
                    }
                    break block15;
                }
                object = this.V;
                if (object != null) {
                    com.jio.jioads.native.callbaks.a a3 = this.w;
                    if (a3 != null) {
                        void var4_23;
                        if ((object = ((com.jio.jioads.videomodule.s)object).T()) != null) {
                            Object object4 = object;
                        }
                        a3.a((String)var4_23);
                    }
                    break block15;
                } else {
                    object = this.w;
                    if (object != null) {
                        object.a(string2);
                    }
                }
                break block15;
            }
            object = this.w;
            if (object != null) {
                object = new StringBuilder();
                com.jio.jioads.common.b b3 = this.A;
                String string4 = ": Give onAdRender callback from native ";
                j_0.n(b3, (StringBuilder)object, string4);
                JioAdView$AD_TYPE jioAdView$AD_TYPE3 = this.A.K();
                ((StringBuilder)object).append((Object)jioAdView$AD_TYPE3);
                ((StringBuilder)object).append(" handleAdRenderCallback");
                object = ((StringBuilder)object).toString();
                String string5 = "message";
                Intrinsics.checkNotNullParameter(object, string5);
                ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = this.w;
                if (object != null) {
                    object.b(string2);
                }
            }
        }
        if ((object = this.g) != null && (object = this.v) != null && (n4 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == 0) {
            object = Utility.INSTANCE;
            ViewGroup viewGroup = this.v;
            Intrinsics.checkNotNull(viewGroup);
            n3 = 5;
            n4 = ((Utility)object).checkVisibility(viewGroup, n3);
            if (n4 != 0) {
                object = new StringBuilder();
                com.jio.jioads.common.b b4 = this.A;
                String string6 = ": inside handleAdRenderCallback starting refresh handler";
                com.jio.jioads.common.l.a(b4, (StringBuilder)object, string6, (JioAds$Companion)object2);
                object2 = this.w;
                if (object2 == null) return;
                object2.d();
                return;
            }
        }
        if ((object = this.g) == null) return;
        n4 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (n4 == 0) return;
        object = this.A.K();
        if (object != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) return;
        object = this.R();
        String string7 = this.d((String)object);
        object = this.c((String)object);
        int n7 = Integer.parseInt(string7);
        if (n7 > (n3 = 100)) {
            n4 = Integer.parseInt((String)object);
            if (n4 > n3) return;
        }
        object = new StringBuilder();
        com.jio.jioads.common.b b5 = this.A;
        String string8 = ": native ad starting refresh handler dynamic display below 100";
        com.jio.jioads.common.l.a(b5, (StringBuilder)object, string8, (JioAds$Companion)object2);
        object2 = this.w;
        if (object2 == null) return;
        object2.d();
    }

    public final void x() {
        Object object;
        boolean bl2 = this.A0;
        int n3 = 8;
        if (bl2 && (object = this.z0) != null) {
            object = new StringBuilder();
            Object object2 = this.A;
            String string2 = " carousel Visible media layout: ";
            j_0.n((com.jio.jioads.common.b)object2, object, string2);
            object2 = this.G;
            object.append(object2);
            char c2 = ' ';
            object.append(c2);
            object2 = this.p0;
            object.append(object2);
            object = object.toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.G;
            if (object != null) {
                object.setVisibility(n3);
            }
            object = this.p0;
            if (object != null) {
                object.setVisibility(n3);
            }
            object = this.z0;
            if (object != null) {
                object.setVisibility(0);
            }
        } else {
            object = new StringBuilder();
            com.jio.jioads.common.b b2 = this.A;
            String string3 = " media/customImage layout Visible";
            j_0.i(b2, object, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.G;
            if (object != null) {
                object.setVisibility(0);
            }
            object = this.p0;
            if (object != null) {
                object.setVisibility(n3);
            }
            object = this.z0;
            if (object != null) {
                object.setVisibility(n3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void y() {
        Exception exception3;
        String string2;
        Object object;
        Object object2;
        block26: {
            int n3;
            Object object3;
            block25: {
                block27: {
                    block28: {
                        Exception exception22;
                        block24: {
                            block23: {
                                block22: {
                                    boolean bl2;
                                    int n4;
                                    this.m.clear();
                                    this.n.clear();
                                    object3 = this.s;
                                    boolean bl3 = false;
                                    object2 = null;
                                    if (object3 != null) {
                                        object = "NativeMediaLayout";
                                        object3 = (ViewGroup)object3.findViewWithTag(object);
                                    } else {
                                        n3 = 0;
                                        object3 = null;
                                    }
                                    object = this.s;
                                    if (object != null) {
                                        string2 = "NativeCustomImageLayout";
                                        object = (ViewGroup)object.findViewWithTag((Object)string2);
                                    } else {
                                        n4 = 0;
                                        object = null;
                                    }
                                    this.p0 = object;
                                    object = this.s;
                                    if (object != null) {
                                        string2 = "JioCarouselAd";
                                        object = (ViewGroup)object.findViewWithTag((Object)string2);
                                    } else {
                                        n4 = 0;
                                        object = null;
                                    }
                                    this.z0 = object;
                                    if (object3 != null) {
                                        this.G = object3;
                                    }
                                    if ((bl2 = this.A0) && object == null) {
                                        object = this.g;
                                        if (object != null) {
                                            object = ((com.jio.jioads.native.parser.a)object).p;
                                        } else {
                                            n4 = 0;
                                            object = null;
                                        }
                                        if (!(object != null && (n4 = ((String)object).length()) != 0 || (object = this.p()) != null && (n4 = ((String)object).length()) != 0 || (n4 = (int)(this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0)) != 0)) {
                                            object3 = JioAdError$JioAdErrorType.ERROR_INSUFFICIENT_ELEMENTS;
                                            this.a((JioAdError$JioAdErrorType)((Object)object3), "carousel container is not available");
                                            this.A0 = false;
                                            return;
                                        }
                                    }
                                    if ((n4 = this.A0) == 0 && (string2 = this.z0) != null && object3 == null && (string2 = this.p0) == null) {
                                        object3 = JioAdError$JioAdErrorType.ERROR_INSUFFICIENT_ELEMENTS;
                                        this.a((JioAdError$JioAdErrorType)((Object)object3), "carousel ad is not available");
                                        this.A0 = false;
                                        return;
                                    }
                                    if (n4 != 0 && (object = this.z0) != null) break block27;
                                    if (object3 != null) {
                                        object = this.g;
                                        if (object != null) {
                                            object2 = ((com.jio.jioads.native.parser.a)object).p;
                                        }
                                        if ((bl3 = TextUtils.isEmpty((CharSequence)object2)) && !(bl3 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease())) {
                                            object3 = new StringBuilder();
                                            j_0.i(this.A, (StringBuilder)object3, ": CustomNative: Main image not available in response ");
                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                            object3 = JioAds$LogLevel.NONE;
                                            object3 = JioAdError$JioAdErrorType.ERROR_MEDIA_FILES_EMPTY;
                                            this.a((JioAdError$JioAdErrorType)((Object)object3), "Main image not available in response");
                                            return;
                                        }
                                    }
                                    if ((object2 = this.p()) != null || (bl3 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease())) break block27;
                                    if (object3 == null) {
                                        object3 = new StringBuilder();
                                        j_0.i(this.A, (StringBuilder)object3, ": NativeAd: Custom native: Requested size not available in response");
                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        object3 = JioAds$LogLevel.NONE;
                                        object3 = JioAdError$JioAdErrorType.ERROR_WRONG_AD_SIZE;
                                        this.a((JioAdError$JioAdErrorType)((Object)object3), "Requested size not available in response");
                                        return;
                                    }
                                    object3 = this.p();
                                    if (object3 != null || (n3 = this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == 0 || (n3 = this.k0) == 0) break block28;
                                    try {
                                        object3 = this.G;
                                        if (object3 == null) break block22;
                                        n3 = object3.getChildCount();
                                        break block23;
                                    }
                                    catch (Exception exception22) {
                                        break block24;
                                    }
                                }
                                n3 = 0;
                                object3 = null;
                            }
                            if (n3 > 0 && (object3 = this.G) != null) {
                                object3.removeAllViews();
                            }
                            break block27;
                        }
                        object2 = new StringBuilder();
                        object = this.A;
                        string2 = ": Exception occurs in removing  mediaLayout: ";
                        j_0.n((com.jio.jioads.common.b)object, (StringBuilder)object2, string2);
                        object = Utility.INSTANCE;
                        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception22, (StringBuilder)object2);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioAds$LogLevel.NONE;
                        break block27;
                    }
                    object3 = new StringBuilder();
                    object2 = this.A;
                    object = ": Custom size invalid, so ignoring custom image";
                    j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                }
                try {
                    object3 = this.C0;
                    object2 = Boolean.TRUE;
                    n3 = Intrinsics.areEqual(object3, object2);
                    if (n3 != 0 || (object3 = this.U) != null || (object3 = this.V) != null) break block25;
                    this.x();
                }
                catch (Exception exception3) {
                    break block26;
                }
            }
            if ((n3 = this.A0) != 0 && (object3 = this.z0) != null) {
                this.G();
                return;
            }
            this.N();
            this.P();
            this.k();
            this.l();
            return;
        }
        this.r = 0;
        object2 = new StringBuilder();
        object = this.A;
        string2 = ": ";
        j_0.n((com.jio.jioads.common.b)object, (StringBuilder)object2, string2);
        object = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception3, (StringBuilder)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Enum enum_ = JioAds$LogLevel.NONE;
        enum_ = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR;
        object2 = "Error while Rendering Ad";
        this.a((JioAdError$JioAdErrorType)enum_, (String)object2);
    }

    public final void z() {
        int n3;
        int n4;
        Object object = new StringBuilder();
        Object object2 = this.A;
        Object object3 = ": adType is Native video so prepare native video";
        com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object2, (StringBuilder)object, object3);
        object = this.p0;
        if (object == null) {
            object = this.s;
            if (object != null) {
                object2 = "NativeMediaLayout";
                object = (ViewGroup)object.findViewWithTag(object2);
            } else {
                n4 = 0;
                object = null;
            }
        }
        this.G = object;
        object = this.A;
        n4 = object.W();
        if (n4 == (n3 = 1) && (object = this.A.K()) == (object3 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY)) {
            int n7;
            object = this.R();
            object2 = this.d((String)object);
            object = this.c((String)object);
            n3 = Integer.parseInt((String)object2);
            if (n3 >= (n7 = 300) && (n4 = Integer.parseInt((String)object)) >= (n3 = 250)) {
                object = new StringBuilder();
                object2 = this.A.P();
                ((StringBuilder)object).append((String)object2);
                object2 = ": Showing video from handleVideoViewLoadIntoContainer for dynamic display ad ";
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                com.jio.jioads.util.j.a((String)object);
                this.Z();
            }
        } else {
            object = new StringBuilder();
            j_0.n(this.A, (StringBuilder)object, ":  mediaLayout value is : ");
            object3 = this.G;
            if (object3 != null) {
                n3 = 0;
                object2 = null;
            }
            ((StringBuilder)object).append(n3 != 0);
            com.jio.jioads.util.j.a(((StringBuilder)object).toString());
            object = this.G;
            if (object != null) {
                object.setVisibility(0);
                object = (com.jio.jioads.controller.f)this.h;
                object2 = "mim";
                object = ((com.jio.jioads.controller.f)object).a((String)object2);
                n4 = ((String)object).length();
                if (n4 == 0) {
                    n4 = 0;
                    object = null;
                } else {
                    object = ((com.jio.jioads.controller.f)this.h).a((String)object2);
                    n4 = Integer.parseInt((String)object);
                }
                this.T = n4;
                object = new StringBuilder();
                object2 = this.A;
                object3 = ": adType is Native video and X-Jio-MainImage value= ";
                j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object, object3);
                n3 = this.T;
                ((StringBuilder)object).append(n3);
                com.jio.jioads.util.j.a(((StringBuilder)object).toString());
                object = this.G;
                if (object != null && (n4 = object.getChildCount()) == 0) {
                    object = new StringBuilder();
                    object2 = this.A;
                    object3 = ": Image not loaded, changing delay to 0";
                    com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object2, (StringBuilder)object, object3);
                    this.T = 0;
                }
                if ((object = this.d) != null && (object = this.A.K()) == (object2 = JioAdView$AD_TYPE.INTERSTITIAL) && (n4 = (int)(this.isNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() ? 1 : 0)) != 0) {
                    object = new StringBuilder();
                    object2 = this.A;
                    object3 = ": Set showMainImageTime is zero for Orientation Video Ad Support ";
                    com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object2, (StringBuilder)object, object3);
                    this.T = 0;
                }
                if ((n4 = this.T) > 0) {
                    object2 = Looper.getMainLooper();
                    object = new Handler((Looper)object2);
                    this.X = object;
                    object2 = new e(this);
                    this.Y = object2;
                    Intrinsics.checkNotNull(object2);
                    int n8 = this.T * 1000;
                    long l2 = n8;
                    object.postDelayed((Runnable)object2, l2);
                } else {
                    object = new StringBuilder();
                    object2 = this.A.P();
                    ((StringBuilder)object).append((String)object2);
                    object2 = ": Showing video from loadViewToContainer";
                    ((StringBuilder)object).append((String)object2);
                    object = ((StringBuilder)object).toString();
                    com.jio.jioads.util.j.a((String)object);
                    this.Z();
                }
            } else {
                object = new StringBuilder();
                object2 = this.A;
                object3 = ": inside loadIntoContainer starting refresh handler ";
                com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object2, (StringBuilder)object, object3);
                object = this.w;
                if (object != null) {
                    object.d();
                }
            }
        }
        object = new StringBuilder();
        com.jio.jioads.jioreel.tracker.model.b.a(this.A, (StringBuilder)object, ": inside calling from handleVideoViewLoadIntoContainer");
    }
}

