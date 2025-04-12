/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.LocationManager
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  org.json.JSONObject
 */
package com.jioads.mediation;

import android.content.Context;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdPartner;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.native.t;
import com.jio.jioads.native.utils.a;
import com.jio.jioads.native.utils.b;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import com.jio.jioads.utils.Constants$DynamicDisplaySize;
import com.jioads.mediation.JioAdMediationController$cacheMediationAd$3;
import com.jioads.mediation.JioAdsMediationCallback;
import com.jioads.mediation.JioMediationSelector;
import com.jioads.mediation.partners.JioMediationListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class JioAdMediationController
extends com.jio.jioads.common.d {
    public ViewGroup a;
    public final com.jio.jioads.controller.a b;
    public final com.jio.jioads.common.b c;
    public final c d;
    public final JioAdsMediationCallback e;
    public JioMediationSelector f;
    public long g;
    public int h;
    public t i;
    public ViewGroup j;
    public Map k;

    public JioAdMediationController(ViewGroup viewGroup, com.jio.jioads.controller.a a2, com.jio.jioads.common.b b2, c c2, JioAdsMediationCallback jioAdsMediationCallback) {
        Intrinsics.checkNotNullParameter(a2, "jioAdCallback");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(c2, "iJioAdViewController");
        Intrinsics.checkNotNullParameter(jioAdsMediationCallback, "jioAdsMediationCallback");
        super(a2, b2, c2);
        this.a = viewGroup;
        this.b = a2;
        this.c = b2;
        this.d = c2;
        this.e = jioAdsMediationCallback;
        this.g = 1000L;
        this.h = -1;
    }

    public static void a(JioAdMediationController object, String string2, String string3, String string4) {
        JioAdError$JioAdErrorType jioAdError$JioAdErrorType = JioAdError$JioAdErrorType.ERROR_IN_MEDIATION;
        object.getClass();
        JioAdError jioAdError = j_0.c(JioAdError.Companion, jioAdError$JioAdErrorType, string4);
        object = ((JioAdMediationController)object).b;
        d d2 = com.jio.jioads.cdnlogging.d.a;
        ((V)object).d(jioAdError, false, d2, string2, "JioAdMediationController", string3, null);
    }

    public static final /* synthetic */ com.jio.jioads.common.b access$getIJioAdView$p(JioAdMediationController jioAdMediationController) {
        return jioAdMediationController.c;
    }

    public static final /* synthetic */ c access$getIJioAdViewController$p(JioAdMediationController jioAdMediationController) {
        return jioAdMediationController.d;
    }

    public static final /* synthetic */ com.jio.jioads.controller.a access$getJioAdCallback$p(JioAdMediationController jioAdMediationController) {
        return jioAdMediationController.b;
    }

    public static final /* synthetic */ JioAdsMediationCallback access$getJioAdsMediationCallback$p(JioAdMediationController jioAdMediationController) {
        return jioAdMediationController.e;
    }

    public static final /* synthetic */ JioMediationSelector access$getJioMediationSelector$p(JioAdMediationController jioAdMediationController) {
        return jioAdMediationController.f;
    }

    public static final /* synthetic */ t access$getRefreshTimeHandler$p(JioAdMediationController jioAdMediationController) {
        return jioAdMediationController.i;
    }

    public static final void access$prepareMediationVideoAd(JioAdMediationController jioAdMediationController) {
        jioAdMediationController.c.Z(1);
        jioAdMediationController.e.onLoadAdCalledForVideoMediationIMA();
    }

    public static final /* synthetic */ void access$setJioMediationSelector$p(JioAdMediationController jioAdMediationController, JioMediationSelector jioMediationSelector) {
        jioAdMediationController.f = jioMediationSelector;
    }

    public final void a() {
        Object object;
        Object object2 = this.c.K();
        if (object2 != (object = JioAdView$AD_TYPE.INTERSTITIAL)) {
            object2 = new StringBuilder();
            object = this.c;
            Object object3 = ": JioAdMediationController - Initialize Refresh Handler";
            j_0.i((com.jio.jioads.common.b)object, (StringBuilder)object2, (String)object3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            object2 = this.i;
            if (object2 != null) {
                ((t)object2).c();
            }
            object2 = null;
            this.i = null;
            object3 = this.c;
            com.jio.jioads.controller.a a2 = this.b;
            c c2 = this.d;
            Object object4 = this.k;
            if (object4 == null) {
                object4 = "responseHeaders";
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            } else {
                object2 = object4;
            }
            object = new t((com.jio.jioads.common.b)object3, a2, c2, (Map)object2);
            this.i = object;
            ((t)object).b();
            object2 = this.i;
            if (object2 != null) {
                ((t)object2).d();
            }
            object2 = this.c;
            boolean bl2 = true;
            object2.i(bl2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final int[] b() {
        JioAdView$AD_TYPE jioAdView$AD_TYPE = this.c.K();
        Object object = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
        float f5 = 0.0f;
        if (jioAdView$AD_TYPE != object) {
            JioAdView$AD_TYPE jioAdView$AD_TYPE2;
            int n3;
            int n4;
            void var6_18;
            int n7;
            JioAdView$AdState jioAdView$AdState = this.c.k0();
            if (jioAdView$AdState == (object = JioAdView$AdState.DESTROYED)) {
                return new int[]{0, 0};
            }
            Context context = this.c.Y();
            object = this.a;
            int n8 = 0;
            float f6 = 0.0f;
            Object var6_13 = null;
            if (object != null) {
                object = object.getLayoutParams();
            } else {
                n7 = 0;
                object = null;
            }
            if (object != null) {
                object = this.a;
                if (object != null) {
                    ViewGroup.LayoutParams layoutParams = object.getLayoutParams();
                }
            } else {
                object = this.a;
                if (object != null) {
                    object = object.getParent();
                } else {
                    n7 = 0;
                    object = null;
                }
                if (object != null) {
                    object = this.a;
                    if (object != null) {
                        object = object.getParent();
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    String string2 = "null cannot be cast to non-null type android.view.ViewGroup";
                    Intrinsics.checkNotNull(object, string2);
                    object = ((ViewGroup)object).getLayoutParams();
                    if (object != null) {
                        void var6_16;
                        object = this.a;
                        if (object != null) {
                            ViewParent viewParent = object.getParent();
                        }
                        Intrinsics.checkNotNull(var6_16, string2);
                        ViewGroup.LayoutParams layoutParams = ((ViewGroup)var6_16).getLayoutParams();
                    }
                }
            }
            if (var6_18 != null) {
                n7 = var6_18.height;
                n4 = -2;
                n3 = -1;
                if (n7 != n3 && n7 != n4 || (n7 = var6_18.width) != n3 && n7 != n4) {
                    Intrinsics.checkNotNull(var6_18);
                    int n10 = var6_18.width;
                    n7 = var6_18.height;
                    return new int[]{n10, n7};
                }
            }
            if (context != null && (object = this.c.K()) == (jioAdView$AD_TYPE2 = JioAdView$AD_TYPE.INFEED)) {
                void var1_6;
                object = Utility.INSTANCE;
                n8 = ((Utility)object).isDeviceTypeTablet(context);
                n4 = 1;
                n3 = 2;
                if (n8 == 0) {
                    int n14 = ((Utility)object).getCurrentUIModeType(context);
                    n8 = 4;
                    f6 = 5.6E-45f;
                    if (n14 != n8) {
                        int[] nArray = new int[n3];
                        f6 = 320.0f;
                        nArray[0] = n8 = ((Utility)object).convertDpToPixel(f6);
                        f5 = 50.0f;
                        nArray[n4] = n7 = ((Utility)object).convertDpToPixel(f5);
                        return var1_6;
                    }
                }
                int[] nArray = new int[n3];
                f6 = 728.0f;
                nArray[0] = n8 = ((Utility)object).convertDpToPixel(f6);
                f5 = 90.0f;
                nArray[n4] = n7 = ((Utility)object).convertDpToPixel(f5);
                return var1_6;
            }
            JioAdView$AD_TYPE jioAdView$AD_TYPE3 = this.c.K();
            if (jioAdView$AD_TYPE3 == (object = JioAdView$AD_TYPE.CONTENT_STREAM)) {
                Utility utility = Utility.INSTANCE;
                n7 = utility.convertDpToPixel(300.0f);
                int n15 = utility.convertDpToPixel(250.0f);
                return new int[]{n7, n15};
            }
        }
        return new int[]{0, 0};
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cacheMediationAd(JSONObject var1_1, String var2_2, Map var3_3) {
        block74: {
            block75: {
                block73: {
                    var4_4 = this;
                    var5_5 = var1_1;
                    var6_6 /* !! */  = var2_2;
                    var7_7 = var3_3;
                    Intrinsics.checkNotNullParameter(var3_3, "responseHeaders");
                    var8_8 /* !! */  = new StringBuilder();
                    var9_9 = this.c;
                    var10_10 = ": inside cacheMediationAd";
                    com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var9_9, var8_8 /* !! */ , (String)var10_10);
                    var8_8 /* !! */  = this.c.k0();
                    var9_9 = JioAdView$AdState.DESTROYED;
                    if (var8_8 /* !! */  == var9_9) {
                        return;
                    }
                    var8_8 /* !! */  = this.c.Y();
                    if (var1_1 == null) {
                        var5_5 = JioAdError.Companion;
                        var6_6 /* !! */  = JioAdError$JioAdErrorType.ERROR_NOFILL;
                        var7_7 = "Mediation Ad not available";
                        var9_9 = j_0.c((t_0)var5_5, (JioAdError$JioAdErrorType)var6_6 /* !! */ , (String)var7_7);
                        var5_5 = this.c;
                        var8_8 /* !! */  = var5_5.n();
                        if (var8_8 /* !! */  == null) return;
                        var16_21 = "";
                        var17_23 = null;
                        var15_19 = false;
                        var10_10 = null;
                        var21_27 = false;
                        var22_29 = 0.0f;
                        var11_12 = null;
                        var13_15 = null;
                        var14_17 = false;
                        var29_40 = null;
                        var27_36 = 64;
                        var26_34 = false;
                        var32_45 = null;
                        JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((JioAdView)var8_8 /* !! */ , (JioAdError)var9_9, false, null, null, null, var16_21, null, var27_36, null);
                        return;
                    }
                    this.k = var3_3;
                    var7_7 = var1_1.optString("appid");
                    var9_9 = var1_1.optString("adunitid");
                    var10_10 = new StringBuilder();
                    var11_11 /* !! */  = this.c.P();
                    var10_10.append(var11_11 /* !! */ );
                    var11_11 /* !! */  = ": cacheMediationAd header appid: ";
                    var10_10.append(var11_11 /* !! */ );
                    var10_10.append((String)var7_7);
                    com.jio.jioads.util.j.a(var10_10.toString());
                    var7_7 = new StringBuilder();
                    var10_10 = this.c.P();
                    var7_7.append((String)var10_10);
                    var10_10 = ": cacheMediationAd header adunitid: ";
                    var7_7.append((String)var10_10);
                    var7_7.append((String)var9_9);
                    com.jio.jioads.util.j.a(var7_7.toString());
                    var12_13 = 0;
                    var7_7 = null;
                    var9_9 = "type";
                    var9_9 = var1_1.optString((String)var9_9);
                    var10_10 = this.c;
                    var10_10 = var10_10.K();
                    var11_11 /* !! */  = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                    var13_14 = "video";
                    var14_16 = '\u0001';
                    if (var10_10 == var11_11 /* !! */  && (var15_18 = kotlin.text.b.i((String)var9_9, (String)var13_14, (boolean)var14_16))) ** GOTO lbl104
                    var10_10 = var4_4.c;
                    var10_10 = var10_10.K();
                    var11_11 /* !! */  = JioAdView$AD_TYPE.INFEED;
                    var16_20 = "native";
                    if (var10_10 == var11_11 /* !! */ ) break block73;
                    var10_10 = var4_4.c;
                    if ((var10_10 = var10_10.K()) == (var11_11 /* !! */  = JioAdView$AD_TYPE.CONTENT_STREAM)) break block73;
                    var10_10 = var4_4.c;
                    var10_10 = var10_10.K();
                    var11_11 /* !! */  = JioAdView$AD_TYPE.CUSTOM_NATIVE;
                    if (var10_10 != var11_11 /* !! */ ) ** GOTO lbl88
                }
                var15_18 = kotlin.text.b.i((String)var9_9, (String)var16_20, (boolean)var14_16);
                if (var15_18) ** GOTO lbl104
lbl88:
                // 2 sources

                var10_10 = var4_4.c;
                var10_10 = var10_10.K();
                var11_11 /* !! */  = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                var17_22 = "display";
                if (var10_10 != var11_11 /* !! */ ) ** GOTO lbl96
                var15_18 = kotlin.text.b.i((String)var9_9, var17_22, (boolean)var14_16);
                if (var15_18 || (var15_18 = kotlin.text.b.i((String)var9_9, (String)var16_20, (boolean)var14_16)) || (var15_18 = kotlin.text.b.i((String)var9_9, (String)var13_14, (boolean)var14_16))) ** GOTO lbl104
lbl96:
                // 2 sources

                var10_10 = var4_4.c;
                if ((var10_10 = var10_10.K()) != (var11_11 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL)) ** GOTO lbl101
                var15_18 = kotlin.text.b.i((String)var9_9, (String)var13_14, (boolean)var14_16);
                if (var15_18 || (var15_18 = kotlin.text.b.i((String)var9_9, var17_22, (boolean)var14_16)) || (var18_24 = kotlin.text.b.i((String)var9_9, (String)var16_20, (boolean)var14_16))) break block75;
lbl101:
                // 2 sources

                var9_9 = var4_4.d;
                var9_9 = (f)var9_9;
                var9_9.h(var6_6 /* !! */ );
            }
            var9_9 = new HashMap();
            var10_10 = "adview";
            var11_11 /* !! */  = var4_4.c;
            var11_11 /* !! */  = var11_11 /* !! */ .n();
            var9_9.put(var10_10, var11_11 /* !! */ );
            var10_10 = "jioAdPartner";
            var11_11 /* !! */  = new JioAdPartner();
            var9_9.put(var10_10, var11_11 /* !! */ );
            var10_10 = "timeOut";
            var19_25 = var4_4.g;
            var11_11 /* !! */  = Long.valueOf(var19_25);
            var9_9.put(var10_10, var11_11 /* !! */ );
            if (var8_8 /* !! */  != null && (var10_10 = var8_8 /* !! */ .getResources()) != null && (var10_10 = var10_10.getConfiguration()) != null) {
                var10_10 = var10_10.locale;
            } else {
                var15_18 = false;
                var10_10 = null;
            }
            if (var10_10 != null) {
                var11_11 /* !! */  = "language";
                var10_10 = var10_10.getISO3Language();
                var9_9.put(var11_11 /* !! */ , var10_10);
            }
            var15_18 = false;
            var10_10 = null;
            if (var8_8 /* !! */  != null && (var11_11 /* !! */  = var8_8 /* !! */ .getPackageName()) != null && (var13_14 = var8_8 /* !! */ .getPackageManager()) != null) {
                var11_11 /* !! */  = var13_14.getPackageInfo(var11_11 /* !! */ , 0);
            } else {
                var21_26 = 0;
                var11_11 /* !! */  = null;
                var22_28 = 0.0f;
            }
            if (var11_11 /* !! */  != null) {
                var13_14 = "appversion";
                var11_11 /* !! */  = var11_11 /* !! */ .versionName;
                var9_9.put(var13_14, var11_11 /* !! */ );
            }
            var11_11 /* !! */  = "packagename";
            var13_14 = var4_4.d;
            var13_14 = (f)var13_14;
            var13_14 = var13_14.a;
            var13_14 = var13_14.U();
            var9_9.put(var11_11 /* !! */ , var13_14);
            if (var8_8 /* !! */  != null && (var21_26 = var8_8 /* !! */ .checkCallingOrSelfPermission(var11_11 /* !! */  = "android.permission.ACCESS_FINE_LOCATION")) == 0) {
                var11_11 /* !! */  = "location";
                var8_8 /* !! */  = var8_8 /* !! */ .getSystemService(var11_11 /* !! */ );
                var13_14 = "null cannot be cast to non-null type android.location.LocationManager";
                Intrinsics.checkNotNull(var8_8 /* !! */ , (String)var13_14);
                var8_8 /* !! */  = (LocationManager)var8_8 /* !! */ ;
                var13_14 = "gps";
                var13_14 = var8_8 /* !! */ .getLastKnownLocation((String)var13_14);
                if (var13_14 == null) {
                    var13_14 = "network";
                    var13_14 = var8_8 /* !! */ .getLastKnownLocation((String)var13_14);
                }
                if (var13_14 != null) {
                    var9_9.put(var11_11 /* !! */ , var13_14);
                }
            }
            var8_8 /* !! */  = "UX_TYPE";
            var11_11 /* !! */  = var4_4.c;
            var11_11 /* !! */  = var11_11 /* !! */ .K();
            var9_9.put(var8_8 /* !! */ , var11_11 /* !! */ );
            var8_8 /* !! */  = "customContainer";
            var11_11 /* !! */  = var4_4.c;
            var11_11 /* !! */  = var11_11 /* !! */ .l0();
            var9_9.put(var8_8 /* !! */ , var11_11 /* !! */ );
            var8_8 /* !! */  = var4_4.c;
            var8_8 /* !! */  = var8_8 /* !! */ .K();
            var11_11 /* !! */  = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
            if (var8_8 /* !! */  == var11_11 /* !! */ ) break block74;
lbl179:
            // 4 sources

            while (true) {
                var8_8 /* !! */  = var4_4.c;
                var10_10 = var4_4.d;
                var4_4.f = var7_7 = new JioMediationSelector((com.jio.jioads.common.b)var8_8 /* !! */ , (Map)var9_9, (JSONObject)var5_5, (c)var10_10);
                var5_5 = var4_4.d;
                Intrinsics.checkNotNull(var7_7);
                ((f)var5_5).e((JioMediationSelector)var7_7);
                var5_5 = var4_4.c.K();
                var7_7 = JioAdView$AD_TYPE.INSTREAM_VIDEO;
                if (var5_5 != var7_7 && (var5_5 = var4_4.c.K()) != (var7_7 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY) && (var5_5 = var4_4.c.K()) != (var7_7 = JioAdView$AD_TYPE.INFEED) && (var5_5 = var4_4.c.K()) != (var7_7 = JioAdView$AD_TYPE.CUSTOM_NATIVE) && (var5_5 = var4_4.c.K()) != (var7_7 = JioAdView$AD_TYPE.CONTENT_STREAM) && (var5_5 = var4_4.c.K()) != (var7_7 = JioAdView$AD_TYPE.INTERSTITIAL)) {
                    var5_5 = JioAdError.Companion;
                    var6_6 /* !! */  = JioAdError$JioAdErrorType.ERROR_MISMATCH_AD_TYPE;
                    var7_7 = "Wrong Mediation ad type";
                    var9_9 = j_0.c((t_0)var5_5, (JioAdError$JioAdErrorType)var6_6 /* !! */ , (String)var7_7);
                    var5_5 = var4_4.c;
                    var8_8 /* !! */  = var5_5.n();
                    if (var8_8 /* !! */  == null) return;
                    var16_20 = "";
                    var17_22 = null;
                    var15_18 = false;
                    var10_10 = null;
                    var21_26 = 0;
                    var22_28 = 0.0f;
                    var11_11 /* !! */  = null;
                    var13_14 = null;
                    var14_16 = '\u0000';
                    var29_38 = null;
                    var27_35 = 64;
                    var26_33 = '\u0000';
                    var32_44 /* !! */  = null;
                    JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((JioAdView)var8_8 /* !! */ , (JioAdError)var9_9, false, null, null, null, (String)var16_20, null, var27_35, null);
                    return;
                }
                var5_5 = var4_4.f;
                if (var5_5 == null) return;
                var7_7 = new JioAdMediationController$cacheMediationAd$3(var4_4, var6_6 /* !! */ );
                var5_5.loadAd((JioMediationListener)var7_7);
                return;
            }
        }
        try {
            block87: {
                block86: {
                    block85: {
                        block84: {
                            block83: {
                                block82: {
                                    block76: {
                                        block78: {
                                            block81: {
                                                block79: {
                                                    block80: {
                                                        block77: {
                                                            var8_8 /* !! */  = var4_4.c;
                                                            var8_8 /* !! */  = var8_8 /* !! */ .O();
                                                            var11_11 /* !! */  = Boolean.TRUE;
                                                            var23_30 = Intrinsics.areEqual(var8_8 /* !! */ , var11_11 /* !! */ );
                                                            var13_14 = "";
                                                            var24_31 = "SIZE_";
                                                            var25_32 = "adsize";
                                                            var26_33 = 'x';
                                                            var16_20 = "0";
                                                            if (var23_30 == '\u0000') break block76;
                                                            var8_8 /* !! */  = var4_4.c;
                                                            var23_30 = Intrinsics.areEqual(var8_8 /* !! */  = var8_8 /* !! */ .y(), var11_11 /* !! */ );
                                                            if (var23_30 == '\u0000') break block77;
                                                            var7_7 = new StringBuilder();
                                                            var8_8 /* !! */  = var4_4.c;
                                                            var8_8 /* !! */  = var8_8 /* !! */ .P();
                                                            var7_7.append((String)var8_8 /* !! */ );
                                                            var8_8 /* !! */  = ": VerticalAd ads and isDynamicDisplayMultiFormat is Enabled so considering device dimensions";
                                                            var7_7.append((String)var8_8 /* !! */ );
                                                            var7_7 = var7_7.toString();
                                                            com.jio.jioads.util.j.a((String)var7_7);
                                                            var7_7 = Utility.INSTANCE;
                                                            var8_8 /* !! */  = var4_4.c;
                                                            var8_8 /* !! */  = var8_8 /* !! */ .Y();
                                                            var7_7 = var7_7.getScreenHeightAndWidth((Context)var8_8 /* !! */ );
                                                            var8_8 /* !! */  = tp_2.A((Object[])var7_7);
                                                            var8_8 /* !! */  = (String)var8_8 /* !! */ ;
                                                            if (var8_8 /* !! */  == null) {
                                                                var8_8 /* !! */  = var16_20;
                                                            }
                                                            var23_30 = Integer.parseInt((String)var8_8 /* !! */ );
                                                            var7_7 = tp_2.E(var14_16, (Object[])var7_7);
                                                            if ((var7_7 = (String)var7_7) != null) {
                                                                var16_20 = var7_7;
                                                            }
                                                            var12_13 = Integer.parseInt((String)var16_20);
                                                            var12_13 = Utility.convertPixelsToDp(var12_13);
                                                            var23_30 = Utility.convertPixelsToDp(var23_30);
                                                            var11_11 /* !! */  = new StringBuilder();
                                                            var11_11 /* !! */ .append(var12_13);
                                                            var11_11 /* !! */ .append(var26_33);
                                                            var11_11 /* !! */ .append((int)var23_30);
                                                            var11_11 /* !! */  = var11_11 /* !! */ .toString();
                                                            var7_7 = var25_32;
                                                            var8_8 /* !! */  = var24_31;
                                                            break block78;
                                                        }
                                                        var8_8 /* !! */  = new StringBuilder();
                                                        var16_20 = var4_4.c;
                                                        var16_20 = var16_20.P();
                                                        var8_8 /* !! */ .append((String)var16_20);
                                                        var16_20 = ": MediationController : isDynamicDisplayMultiFormatEnabled so considering MaxCustom Dimension";
                                                        var8_8 /* !! */ .append((String)var16_20);
                                                        var8_8 /* !! */  = var8_8 /* !! */ .toString();
                                                        com.jio.jioads.util.j.a((String)var8_8 /* !! */ );
                                                        var8_8 /* !! */  = var4_4.c;
                                                        var8_8 /* !! */  = var8_8 /* !! */ .m0();
                                                        var27_35 = 6;
                                                        var28_37 = "x";
                                                        if (var8_8 /* !! */  == null || (var23_30 = var8_8 /* !! */ .length()) <= '\u0000') break block79;
                                                        var8_8 /* !! */  = var4_4.c;
                                                        if ((var8_8 /* !! */  = var8_8 /* !! */ .m0()) != null) {
                                                            var7_7 = new String[]{var28_37};
                                                            var7_7 = StringsKt.a0(var8_8 /* !! */ , (String[])var7_7, false, 0, var27_35);
                                                        }
                                                        if (var7_7 == null) break block80;
                                                        var8_8 /* !! */  = var7_7.get(0);
                                                        var8_8 /* !! */  = (String)var8_8 /* !! */ ;
                                                        var8_8 /* !! */  = var8_8 /* !! */ .toString();
                                                        var23_30 = Integer.parseInt((String)var8_8 /* !! */ );
                                                        var7_7 = var7_7.get(var14_16);
                                                        var7_7 = (String)var7_7;
                                                        var7_7 = var7_7.toString();
                                                        var12_13 = Integer.parseInt((String)var7_7);
                                                        var11_11 /* !! */  = var4_4.c;
                                                        var29_38 = new int[]{var23_30, var12_13};
                                                        var11_11 /* !! */ .e0((int[])var29_38);
                                                        var21_26 = var12_13;
                                                        var14_16 = var23_30;
                                                        var7_7 = var25_32;
                                                        var8_8 /* !! */  = var24_31;
                                                        break block81;
                                                    }
                                                    var7_7 = var25_32;
                                                    var8_8 /* !! */  = var24_31;
                                                    ** GOTO lbl-1000
                                                }
                                                var7_7 = var4_4.c;
                                                var7_7 = var7_7.a();
                                                var8_8 /* !! */  = var4_4.c;
                                                var30_41 = var8_8 /* !! */ .m0();
                                                var23_30 = '\u0000';
                                                var17_22 = null;
                                                var16_20 = var11_11 /* !! */ ;
                                                var14_16 = '\u0006';
                                                var27_35 = 0;
                                                var31_42 = null;
                                                var32_44 /* !! */  = var7_7;
                                                var7_7 = var25_32;
                                                var33_46 = false;
                                                var25_32 = null;
                                                var8_8 /* !! */  = var24_31;
                                                var24_31 = null;
                                                var16_20 = com.jio.jioads.native.utils.b.a((Boolean)var11_11 /* !! */ , null, null, (List)var32_44 /* !! */ , null, null, null, null, var30_41);
                                                var34_48 = (int)TextUtils.isEmpty((CharSequence)var16_20);
                                                if (var34_48 == 0) {
                                                    var16_20 = var4_4.c;
                                                    var32_44 /* !! */  = var16_20.a();
                                                    var16_20 = var4_4.c;
                                                    var30_41 = var16_20.m0();
                                                    var33_46 = false;
                                                    var25_32 = null;
                                                    var24_31 = null;
                                                    var17_22 = null;
                                                    var27_35 = 0;
                                                    var31_42 = null;
                                                    var16_20 = var11_11 /* !! */ ;
                                                    var11_11 /* !! */  = com.jio.jioads.native.utils.b.a((Boolean)var11_11 /* !! */ , null, null, (List)var32_44 /* !! */ , null, null, null, null, var30_41);
                                                    var16_20 = new String[]{var28_37};
                                                    var11_11 /* !! */  = StringsKt.a0(var11_11 /* !! */ , (String[])var16_20, false, 0, var14_16);
                                                    var29_38 = var11_11 /* !! */ .get(0);
                                                    var29_38 = (String)var29_38;
                                                    var14_16 = Integer.parseInt((String)var29_38);
                                                    var34_48 = 1;
                                                    var35_50 = 1.4E-45f;
                                                    var11_11 /* !! */  = var11_11 /* !! */ .get(var34_48);
                                                    var21_26 = Integer.parseInt(var11_11 /* !! */ );
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var21_26 = 0;
                                                    var22_28 = 0.0f;
                                                    var11_11 /* !! */  = null;
                                                    var14_16 = '\u0000';
                                                    var29_38 = null;
                                                }
                                            }
                                            var16_20 = new StringBuilder();
                                            var16_20.append((int)var14_16);
                                            var14_16 = 'x';
                                            var16_20.append(var14_16);
                                            var16_20.append(var21_26);
                                            var11_11 /* !! */  = var16_20.toString();
                                        }
                                        var8_8 /* !! */  = kotlin.text.b.n(var11_11 /* !! */ , (String)var8_8 /* !! */ , (String)var13_14, false);
                                        var9_9.put(var7_7, var8_8 /* !! */ );
                                        ** GOTO lbl179
                                    }
                                    var17_22 = var25_32;
                                    var8_8 /* !! */  = var24_31;
                                    var14_16 = 'x';
                                    var31_43 = var4_4.c;
                                    if ((var31_43 = var31_43.n()) != null) {
                                        var31_43 = var31_43.getDynamicDisplayAdSizes();
                                    } else {
                                        var27_35 = 0;
                                        var31_43 = null;
                                    }
                                    if (var31_43 == null || (var27_35 = (int)var31_43.isEmpty()) != 0) break block82;
                                    var31_43 = var4_4.c;
                                    if ((var31_43 = var31_43.n()) != null) {
                                        var31_43 = var31_43.getDynamicDisplayAdSizes();
                                    } else {
                                        var27_35 = 0;
                                        var31_43 = null;
                                    }
                                    Intrinsics.checkNotNull(var31_43);
                                    var32_44 /* !! */  = Constants$DynamicDisplaySize.SIZE_300x250;
                                    var27_35 = (int)var31_43.contains((Object)var32_44 /* !! */ );
                                    if (var27_35 == 0) break block82;
                                    var11_11 /* !! */  = var4_4.c;
                                    if ((var11_11 /* !! */  = var11_11 /* !! */ .n()) != null && (var11_11 /* !! */  = var11_11 /* !! */ .getDynamicDisplayAdSizes()) != null) {
                                        var29_38 = var4_4.c;
                                        if ((var29_38 = var29_38.n()) != null) {
                                            var7_7 = var29_38.getDynamicDisplayAdSizes();
                                        }
                                        Intrinsics.checkNotNull(var7_7);
                                        var12_13 = var7_7.indexOf((Object)var32_44 /* !! */ );
                                        var7_7 = var11_11 /* !! */ .get(var12_13);
                                        var7_7 = (Constants$DynamicDisplaySize)var7_7;
                                    }
                                    var7_7 = String.valueOf(var7_7);
                                    ** GOTO lbl601
                                }
                                var31_43 = var4_4.c;
                                if ((var31_43 = var31_43.n()) != null) {
                                    var31_43 = var31_43.getDynamicDisplayAdSizes();
                                } else {
                                    var27_35 = 0;
                                    var31_43 = null;
                                }
                                if (var31_43 == null || (var27_35 = (int)var31_43.isEmpty()) != 0) break block83;
                                var31_43 = var4_4.c;
                                if ((var31_43 = var31_43.n()) != null) {
                                    var31_43 = var31_43.getDynamicDisplayAdSizes();
                                } else {
                                    var27_35 = 0;
                                    var31_43 = null;
                                }
                                Intrinsics.checkNotNull(var31_43);
                                var32_44 /* !! */  = Constants$DynamicDisplaySize.SIZE_300x50;
                                var27_35 = (int)var31_43.contains((Object)var32_44 /* !! */ );
                                if (var27_35 == 0) break block83;
                                var11_11 /* !! */  = var4_4.c;
                                if ((var11_11 /* !! */  = var11_11 /* !! */ .n()) != null && (var11_11 /* !! */  = var11_11 /* !! */ .getDynamicDisplayAdSizes()) != null) {
                                    var29_38 = var4_4.c;
                                    if ((var29_38 = var29_38.n()) != null) {
                                        var7_7 = var29_38.getDynamicDisplayAdSizes();
                                    }
                                    Intrinsics.checkNotNull(var7_7);
                                    var12_13 = var7_7.indexOf((Object)var32_44 /* !! */ );
                                    var7_7 = var11_11 /* !! */ .get(var12_13);
                                    var7_7 = (Constants$DynamicDisplaySize)var7_7;
                                }
                                var7_7 = String.valueOf(var7_7);
                                ** GOTO lbl601
                            }
                            var31_43 = var4_4.c;
                            if ((var31_43 = var31_43.n()) != null) {
                                var31_43 = var31_43.getDynamicDisplayAdSizes();
                            } else {
                                var27_35 = 0;
                                var31_43 = null;
                            }
                            if (var31_43 == null || (var27_35 = (int)var31_43.isEmpty()) != 0) break block84;
                            var31_43 = var4_4.c;
                            if ((var31_43 = var31_43.n()) != null) {
                                var31_43 = var31_43.getDynamicDisplayAdSizes();
                            } else {
                                var27_35 = 0;
                                var31_43 = null;
                            }
                            Intrinsics.checkNotNull(var31_43);
                            var32_44 /* !! */  = Constants$DynamicDisplaySize.SIZE_320x50;
                            var27_35 = (int)var31_43.contains((Object)var32_44 /* !! */ );
                            if (var27_35 == 0) break block84;
                            var11_11 /* !! */  = var4_4.c;
                            if ((var11_11 /* !! */  = var11_11 /* !! */ .n()) != null && (var11_11 /* !! */  = var11_11 /* !! */ .getDynamicDisplayAdSizes()) != null) {
                                var29_38 = var4_4.c;
                                if ((var29_38 = var29_38.n()) != null) {
                                    var7_7 = var29_38.getDynamicDisplayAdSizes();
                                }
                                Intrinsics.checkNotNull(var7_7);
                                var12_13 = var7_7.indexOf((Object)var32_44 /* !! */ );
                                var7_7 = var11_11 /* !! */ .get(var12_13);
                                var7_7 = (Constants$DynamicDisplaySize)var7_7;
                            }
                            var7_7 = String.valueOf(var7_7);
                            ** GOTO lbl601
                        }
                        var31_43 = var4_4.c;
                        if ((var31_43 = var31_43.n()) != null) {
                            var31_43 = var31_43.getDynamicDisplayAdSizes();
                        } else {
                            var27_35 = 0;
                            var31_43 = null;
                        }
                        if (var31_43 == null || (var27_35 = (int)var31_43.isEmpty()) != 0) break block85;
                        var31_43 = var4_4.c;
                        if ((var31_43 = var31_43.n()) != null) {
                            var31_43 = var31_43.getDynamicDisplayAdSizes();
                        } else {
                            var27_35 = 0;
                            var31_43 = null;
                        }
                        Intrinsics.checkNotNull(var31_43);
                        var32_44 /* !! */  = Constants$DynamicDisplaySize.SIZE_320x100;
                        var27_35 = (int)var31_43.contains((Object)var32_44 /* !! */ );
                        if (var27_35 == 0) break block85;
                        var11_11 /* !! */  = var4_4.c;
                        if ((var11_11 /* !! */  = var11_11 /* !! */ .n()) != null && (var11_11 /* !! */  = var11_11 /* !! */ .getDynamicDisplayAdSizes()) != null) {
                            var29_38 = var4_4.c;
                            if ((var29_38 = var29_38.n()) != null) {
                                var7_7 = var29_38.getDynamicDisplayAdSizes();
                            }
                            Intrinsics.checkNotNull(var7_7);
                            var12_13 = var7_7.indexOf((Object)var32_44 /* !! */ );
                            var7_7 = var11_11 /* !! */ .get(var12_13);
                            var7_7 = (Constants$DynamicDisplaySize)var7_7;
                        }
                        var7_7 = String.valueOf(var7_7);
                        ** GOTO lbl601
                    }
                    var31_43 = var4_4.c;
                    if ((var31_43 = var31_43.n()) != null) {
                        var31_43 = var31_43.getDynamicDisplayAdSizes();
                    } else {
                        var27_35 = 0;
                        var31_43 = null;
                    }
                    if (var31_43 == null || (var27_35 = (int)var31_43.isEmpty()) != 0) break block86;
                    var31_43 = var4_4.c;
                    if ((var31_43 = var31_43.n()) != null) {
                        var31_43 = var31_43.getDynamicDisplayAdSizes();
                    } else {
                        var27_35 = 0;
                        var31_43 = null;
                    }
                    Intrinsics.checkNotNull(var31_43);
                    var32_44 /* !! */  = Constants$DynamicDisplaySize.SIZE_160x600;
                    var27_35 = (int)var31_43.contains((Object)var32_44 /* !! */ );
                    if (var27_35 == 0) break block86;
                    var11_11 /* !! */  = var4_4.c;
                    if ((var11_11 /* !! */  = var11_11 /* !! */ .n()) != null && (var11_11 /* !! */  = var11_11 /* !! */ .getDynamicDisplayAdSizes()) != null) {
                        var29_38 = var4_4.c;
                        if ((var29_38 = var29_38.n()) != null) {
                            var7_7 = var29_38.getDynamicDisplayAdSizes();
                        }
                        Intrinsics.checkNotNull(var7_7);
                        var12_13 = var7_7.indexOf((Object)var32_44 /* !! */ );
                        var7_7 = var11_11 /* !! */ .get(var12_13);
                        var7_7 = (Constants$DynamicDisplaySize)var7_7;
                    }
                    var7_7 = String.valueOf(var7_7);
                    ** GOTO lbl601
                }
                var31_43 = var4_4.c;
                if ((var31_43 = var31_43.n()) != null) {
                    var31_43 = var31_43.getDynamicDisplayAdSizes();
                } else {
                    var27_35 = 0;
                    var31_43 = null;
                }
                if (var31_43 == null || (var27_35 = (int)var31_43.isEmpty()) != 0) break block87;
                var31_43 = var4_4.c;
                if ((var31_43 = var31_43.n()) != null) {
                    var31_43 = var31_43.getDynamicDisplayAdSizes();
                } else {
                    var27_35 = 0;
                    var31_43 = null;
                }
                Intrinsics.checkNotNull(var31_43);
                var32_44 /* !! */  = Constants$DynamicDisplaySize.SIZE_728x90;
                var27_35 = (int)var31_43.contains((Object)var32_44 /* !! */ );
                if (var27_35 == 0) break block87;
                var11_11 /* !! */  = var4_4.c;
                if ((var11_11 /* !! */  = var11_11 /* !! */ .n()) != null && (var11_11 /* !! */  = var11_11 /* !! */ .getDynamicDisplayAdSizes()) != null) {
                    var29_38 = var4_4.c;
                    if ((var29_38 = var29_38.n()) != null) {
                        var7_7 = var29_38.getDynamicDisplayAdSizes();
                    }
                    Intrinsics.checkNotNull(var7_7);
                    var12_13 = var7_7.indexOf((Object)var32_44 /* !! */ );
                    var7_7 = var11_11 /* !! */ .get(var12_13);
                    var7_7 = (Constants$DynamicDisplaySize)var7_7;
                }
                var7_7 = String.valueOf(var7_7);
                ** GOTO lbl601
            }
            var7_7 = var4_4.c;
            var12_13 = (int)Intrinsics.areEqual(var7_7 = var7_7.y(), var11_11 /* !! */ );
            if (var12_13 == 0) ** GOTO lbl605
            var7_7 = new StringBuilder();
            var11_11 /* !! */  = var4_4.c;
            var11_11 /* !! */  = var11_11 /* !! */ .P();
            var7_7.append(var11_11 /* !! */ );
            var11_11 /* !! */  = ": VerticalAd is enable so considering device dimensions";
            var7_7.append(var11_11 /* !! */ );
            var7_7 = var7_7.toString();
            com.jio.jioads.util.j.a((String)var7_7);
            var7_7 = Utility.INSTANCE;
            var11_11 /* !! */  = var4_4.c;
            var11_11 /* !! */  = var11_11 /* !! */ .Y();
            var11_11 /* !! */  = var7_7.getScreenHeightAndWidth((Context)var11_11 /* !! */ );
            var31_43 = tp_2.A((Object[])var11_11 /* !! */ );
            var31_43 = (String)var31_43;
            if (var31_43 == null) {
                var31_43 = var16_20;
            }
            var27_35 = Integer.parseInt((String)var31_43);
            var26_33 = '\u0001';
            var11_11 /* !! */  = tp_2.E(var26_33, (Object[])var11_11 /* !! */ );
            if ((var11_11 /* !! */  = (String)var11_11 /* !! */ ) != null) {
                var16_20 = var11_11 /* !! */ ;
            }
            var21_26 = Integer.parseInt((String)var16_20);
        }
        catch (Exception v0) {
            var7_7 = var9_9;
lbl577:
            // 2 sources

            while (true) {
                var8_8 /* !! */  = new StringBuilder();
                var9_9 = var4_4.c;
                var10_10 = ": error found while setting header params";
                j_0.i((com.jio.jioads.common.b)var9_9, var8_8 /* !! */ , (String)var10_10);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var8_8 /* !! */  = JioAds$LogLevel.NONE;
                var9_9 = var7_7;
                ** continue;
                break;
            }
        }
        var22_28 = var21_26;
        var21_26 = var7_7.convertDpToPixel(var22_28);
        var35_51 = var27_35;
        var12_13 = var7_7.convertDpToPixel(var35_51);
        var16_20 = new StringBuilder();
        var16_20.append(var21_26);
        var16_20.append(var14_16);
        var16_20.append(var12_13);
        var7_7 = var16_20.toString();
lbl601:
        // 7 sources

        var7_7 = kotlin.text.b.n((String)var7_7, (String)var8_8 /* !! */ , (String)var13_14, false);
        var9_9.put(var17_22, var7_7);
        ** GOTO lbl179
lbl605:
        // 1 sources

        var7_7 = JioAdError.Companion;
        var8_8 /* !! */  = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
        var7_7.getClass();
        var11_11 /* !! */  = t_0.a((JioAdError$JioAdErrorType)var8_8 /* !! */ );
        var7_7 = "Wrong Display Ad size";
        var11_11 /* !! */ .setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var7_7);
        var7_7 = var4_4.c;
        var10_10 = var7_7.n();
        if (var10_10 == null) return;
        var31_43 = "";
        var17_22 = null;
        var26_33 = '\u0000';
        var32_44 /* !! */  = null;
        var33_47 = 64;
        var24_31 = null;
        var13_14 = null;
        var14_16 = '\u0000';
        var29_39 = null;
        var34_49 = false;
        var35_52 = 0.0f;
        var16_20 = null;
        JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((JioAdView)var10_10, (JioAdError)var11_11 /* !! */ , false, null, null, null, (String)var31_43, null, var33_47, null);
        return;
        catch (Exception v1) {
            ** continue;
        }
    }

    public final ViewGroup getContainerView() {
        return this.j;
    }

    public ViewGroup getCustomNativeContainer() {
        return this.a;
    }

    public final int getRequestedDuration$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.h;
    }

    public void onAdDataUpdate(String string2, Map map2) {
    }

    public void onCacheAd() {
    }

    public void onCacheMediationAd(JSONObject jSONObject, String string2, Map map2) {
    }

    public void onDestroy() {
        int n3;
        Object object = new StringBuilder();
        com.jio.jioads.common.b b2 = this.c;
        Object object2 = " JioAdMediationController - Inside onDestroy() ";
        j_0.i(b2, (StringBuilder)object, (String)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.a;
        if (object != null) {
            n3 = object.getChildCount();
        } else {
            n3 = 0;
            object = null;
        }
        if (n3 > 0 && (object = this.j) != null && (n3 = object.getChildCount()) > 0) {
            object = this.a;
            if (object != null) {
                b2 = this.j;
                object.removeView((View)b2);
            }
            if ((object = this.j) != null) {
                object.removeAllViews();
            }
            if ((object = this.a) != null) {
                object.removeAllViews();
            }
        }
        object = this.i;
        b2 = null;
        if (object != null && (object2 = ((t)object).f) != null) {
            ((a)object2).a();
            object2 = ((t)object).f;
            if (object2 != null) {
                Timer timer = ((a)object2).e;
                if (timer != null) {
                    timer.cancel();
                }
                ((a)object2).a = null;
                ((a)object2).e = null;
                ((a)object2).b = null;
            }
            ((t)object).f = null;
        }
        if ((object = this.f) != null) {
            ((JioMediationSelector)object).onDestroy();
        }
        this.f = null;
        this.g = 1000L;
        this.h = -1;
        this.i = null;
        this.a = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public View onShowAdView() {
        Object object;
        String string2;
        String string3;
        CharSequence charSequence;
        block49: {
            block48: {
                Object object2;
                block50: {
                    Exception exception2;
                    Object object3;
                    Object object4;
                    Object object5;
                    block51: {
                        block46: {
                            int n3;
                            block47: {
                                Object object6;
                                int n4;
                                int n7;
                                int n8;
                                Object object7;
                                int n10;
                                block45: {
                                    charSequence = "GMA Native ad error while call add-view";
                                    string3 = "error in loading: GMA Native ad error while call add-view";
                                    object5 = "message";
                                    object4 = new StringBuilder();
                                    com.jio.jioads.jioreel.tracker.model.b.a(this.c, (StringBuilder)object4, ": Inside JioAdMediationController - onShowAdView");
                                    object4 = this.a;
                                    string2 = "Error in loading mediationAd: adContainer is null";
                                    n10 = 0;
                                    object = null;
                                    if (object4 == null) break block49;
                                    object4 = this.c;
                                    n3 = object4.W();
                                    if (n3 != 0) break block48;
                                    object4 = " ";
                                    object3 = "iJioAdView.isRefreshStarted() ";
                                    object7 = this.c.k0();
                                    if (object7 == (object2 = JioAdView$AdState.DESTROYED)) break block48;
                                    object2 = this.c.Y();
                                    object7 = new RelativeLayout((Context)object2);
                                    this.j = object7;
                                    object7 = new StringBuilder();
                                    object2 = this.c;
                                    String string4 = " loadViewToContainerCustomNative med called";
                                    com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object2, (StringBuilder)object7, string4);
                                    object7 = this.j;
                                    if (object7 != null) {
                                        object7 = object7.getParent();
                                    } else {
                                        n8 = 0;
                                        object7 = null;
                                    }
                                    if (object7 != null) {
                                        object7 = this.j;
                                        if (object7 != null) {
                                            object7 = object7.getParent();
                                        } else {
                                            n8 = 0;
                                            object7 = null;
                                        }
                                        n8 = object7 instanceof RelativeLayout;
                                        if (n8 != 0) {
                                            object7 = this.j;
                                            if (object7 != null) {
                                                object7 = object7.getParent();
                                            } else {
                                                n8 = 0;
                                                object7 = null;
                                            }
                                            Intrinsics.checkNotNull(object7, "null cannot be cast to non-null type android.widget.RelativeLayout");
                                            object7 = (RelativeLayout)object7;
                                            object2 = this.j;
                                            object7.removeView((View)object2);
                                        }
                                    }
                                    if ((object7 = this.j) != null) {
                                        object7.removeAllViews();
                                    }
                                    object7 = this.a;
                                    object2 = "loadMediationNativeAd";
                                    if (object7 == null) break block50;
                                    n7 = 0;
                                    string4 = null;
                                    object7.setVisibility(0);
                                    object7 = this.j;
                                    if (object7 != null) {
                                        object7.setVisibility(0);
                                    }
                                    object7 = new StringBuilder((String)object3);
                                    object3 = this.c;
                                    n4 = object3.l();
                                    ((StringBuilder)object7).append(n4 != 0);
                                    object3 = ((StringBuilder)object7).toString();
                                    com.jio.jioads.util.j.a((String)object3);
                                    object3 = this.i;
                                    n8 = 1;
                                    if (object3 != null) {
                                        Timer timer;
                                        int n14;
                                        object6 = ((t)object3).f;
                                        if (object6 != null) {
                                            n14 = ((a)object6).f;
                                        } else {
                                            n14 = 0;
                                            timer = null;
                                        }
                                        if (n14 == n8 && object3 != null && object6 != null) {
                                            ((a)object6).a();
                                            object6 = ((t)object3).f;
                                            if (object6 != null) {
                                                timer = ((a)object6).e;
                                                if (timer != null) {
                                                    timer.cancel();
                                                }
                                                ((a)object6).a = null;
                                                ((a)object6).e = null;
                                                ((a)object6).b = null;
                                            }
                                            ((t)object3).f = null;
                                        }
                                    }
                                    object3 = this.d;
                                    object3 = (f)object3;
                                    object3 = ((f)object3).a;
                                    n4 = ((o)object3).A;
                                    if (n4 != 0) {
                                        object3 = new StringBuilder((String)object4);
                                        object4 = this.c;
                                        object4 = object4.P();
                                        ((StringBuilder)object3).append((String)object4);
                                        object4 = ":  RegisterImpression from mediation NativeAd";
                                        ((StringBuilder)object3).append((String)object4);
                                        object4 = ((StringBuilder)object3).toString();
                                        com.jio.jioads.util.j.a((String)object4);
                                        object4 = this.a;
                                        if (object4 != null && (object4 = this.f) != null) {
                                            object3 = this.j;
                                            Intrinsics.checkNotNull(object3);
                                            ((JioMediationSelector)object4).handleMediationImpression((ViewGroup)object3);
                                        }
                                    }
                                    if ((object4 = this.a) == null) break block45;
                                    object4.setVisibility(0);
                                }
                                try {
                                    object4 = this.c;
                                    object4 = object4.K();
                                    object3 = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                                    if (object4 != object3) {
                                        object4 = this.b();
                                    } else {
                                        object4 = new StringBuilder();
                                        object3 = this.c;
                                        object3 = object3.P();
                                        ((StringBuilder)object4).append((String)object3);
                                        object3 = ": Ad type is dynamic so considering getContainerSize()";
                                        ((StringBuilder)object4).append((String)object3);
                                        object4 = ((StringBuilder)object4).toString();
                                        com.jio.jioads.util.j.a((String)object4);
                                        object4 = this.j;
                                        if (object4 != null) {
                                            object4 = Constants$DynamicDisplaySize.SIZE_970x250;
                                            object4 = ((Constants$DynamicDisplaySize)((Object)object4)).getDynamicSize();
                                            object3 = this.j;
                                            Intrinsics.checkNotNull(object3);
                                            object6 = this.c;
                                            object4 = com.jio.jioads.native.utils.b.b((String)object4, (ViewGroup)object3, (com.jio.jioads.common.b)object6);
                                        } else {
                                            object4 = this.a;
                                            if (object4 != null) {
                                                object4 = Constants$DynamicDisplaySize.SIZE_970x250;
                                                object4 = ((Constants$DynamicDisplaySize)((Object)object4)).getDynamicSize();
                                                object3 = this.a;
                                                Intrinsics.checkNotNull(object3);
                                                object6 = this.c;
                                                object4 = com.jio.jioads.native.utils.b.b((String)object4, (ViewGroup)object3, (com.jio.jioads.common.b)object6);
                                            } else {
                                                n3 = 0;
                                                object4 = null;
                                            }
                                        }
                                    }
                                    object3 = new StringBuilder();
                                    object6 = this.c;
                                    object6 = object6.P();
                                    ((StringBuilder)object3).append((String)object6);
                                    object6 = " : Value an dimensions height is ";
                                    ((StringBuilder)object3).append((String)object6);
                                    if (object4 != null) {
                                        int n15 = ((int[])object4)[0];
                                        object6 = n15;
                                    } else {
                                        boolean bl2 = false;
                                        object6 = null;
                                    }
                                    ((StringBuilder)object3).append(object6);
                                    object6 = " and width is ";
                                    ((StringBuilder)object3).append((String)object6);
                                    if (object4 != null) {
                                        n10 = ((int[])object4)[n8];
                                        object = n10;
                                    }
                                    ((StringBuilder)object3).append(object);
                                    object = ((StringBuilder)object3).toString();
                                    com.jio.jioads.util.j.a((String)object);
                                    if (object4 != null && (n10 = ((int[])object4)[0]) != 0 && (n10 = ((int[])object4)[n8]) != 0) {
                                        n4 = ((int[])object4)[0];
                                        n3 = ((int[])object4)[n8];
                                        object = new RelativeLayout.LayoutParams(n4, n3);
                                    } else {
                                        n3 = -2;
                                        object = new RelativeLayout.LayoutParams(n3, n3);
                                    }
                                    n3 = 13;
                                    n4 = -1;
                                    object.addRule(n3, n4);
                                    object4 = this.a;
                                    object3 = "GMA Native ad rendition error";
                                    if (object4 != null) {
                                        object7 = this.j;
                                        object4.addView((View)object7, (ViewGroup.LayoutParams)object);
                                    } else {
                                        JioAdMediationController.a(this, (String)object2, string2, (String)object3);
                                    }
                                    object4 = this.a;
                                    if (object4 != null) {
                                        n7 = object4.getChildCount();
                                    }
                                    if (n7 <= 0) break block46;
                                    object4 = this.c;
                                    object4 = object4.K();
                                    object = JioAdView$AD_TYPE.INTERSTITIAL;
                                    object3 = "";
                                    if (object4 != object) break block47;
                                    object4 = this.c;
                                    if ((object4 = object4.K()) != (object7 = JioAdView$AD_TYPE.INSTREAM_VIDEO)) break block47;
                                }
                                catch (Exception exception2) {}
                                object4 = this.c;
                                object4 = object4.K();
                                if (object4 != object) break block48;
                                object4 = new StringBuilder();
                                object = this.c;
                                object = object.P();
                                ((StringBuilder)object4).append((String)object);
                                object = ": Callback Mediation Interstitial ad onAdRender()";
                                ((StringBuilder)object4).append((String)object);
                                object4 = ((StringBuilder)object4).toString();
                                com.jio.jioads.util.j.a((String)object4);
                                object4 = this.c;
                                object = JioAdView$AdState.STARTED;
                                object4.j((JioAdView$AdState)((Object)object));
                                object4 = this.b;
                                object4 = (V)object4;
                                ((V)object4).i((String)object3);
                                break block48;
                                break block51;
                            }
                            if ((n3 = (int)((object4 = this.c).l() ? 1 : 0)) == 0) {
                                object4 = new StringBuilder();
                                object = this.c;
                                object = object.P();
                                ((StringBuilder)object4).append((String)object);
                                object = ": Callback Mediation ad onAdRender()";
                                ((StringBuilder)object4).append((String)object);
                                object4 = ((StringBuilder)object4).toString();
                                com.jio.jioads.util.j.a((String)object4);
                                object4 = this.c;
                                object = JioAdView$AdState.STARTED;
                                object4.j((JioAdView$AdState)((Object)object));
                                object4 = this.b;
                                object4 = (V)object4;
                                ((V)object4).i((String)object3);
                            } else {
                                object4 = this.i;
                                if (object4 != null) {
                                    ((t)object4).d();
                                }
                                object4 = new StringBuilder();
                                object = this.c;
                                object = object.P();
                                ((StringBuilder)object4).append((String)object);
                                object = ": Callback Mediation adRefresh()";
                                ((StringBuilder)object4).append((String)object);
                                object4 = ((StringBuilder)object4).toString();
                                com.jio.jioads.util.j.a((String)object4);
                                object4 = this.b;
                                object4 = (V)object4;
                                ((V)object4).g((String)object3);
                            }
                            this.a();
                            break block48;
                        }
                        object4 = new StringBuilder();
                        object = this.c;
                        object = object.P();
                        ((StringBuilder)object4).append((String)object);
                        object = ": GMA Native ad regeneration error";
                        ((StringBuilder)object4).append((String)object);
                        object4 = ((StringBuilder)object4).toString();
                        com.jio.jioads.util.j.b((String)object4);
                        object4 = "error in loading: adContainer child not set to null";
                        JioAdMediationController.a(this, (String)object2, (String)object4, (String)object3);
                        break block48;
                    }
                    try {
                        object = new StringBuilder();
                        object3 = this.c;
                        object3 = object3.P();
                        ((StringBuilder)object).append((String)object3);
                        object3 = ": GMA Native ad error while call add-view";
                        ((StringBuilder)object).append((String)object3);
                        object3 = Utility.INSTANCE;
                        String string5 = ((Utility)object3).printStacktrace(exception2);
                        ((StringBuilder)object).append(string5);
                        string5 = ((StringBuilder)object).toString();
                        Intrinsics.checkNotNullParameter(string5, (String)object5);
                        object5 = JioAds.Companion;
                        object5 = ((JioAds$Companion)object5).getInstance();
                        ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object5 = JioAds$LogLevel.NONE;
                        JioAdMediationController.a(this, (String)object2, string3, (String)charSequence);
                        break block48;
                    }
                    catch (Exception exception3) {}
                    object4 = new StringBuilder();
                    object = this.c;
                    object3 = ": Exception while set adview loadViewToContainerCustomNative: ";
                    j_0.n((com.jio.jioads.common.b)object, (StringBuilder)object4, (String)object3);
                    object = Utility.INSTANCE;
                    com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception3, (StringBuilder)object4);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                    JioAdMediationController.a(this, (String)object2, string3, (String)charSequence);
                    break block48;
                }
                charSequence = new StringBuilder();
                string3 = this.c.P();
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append(": Native Passed ad container is not valid");
                com.jio.jioads.util.j.b(((StringBuilder)charSequence).toString());
                charSequence = "error in loading: GMA Native, Passed ad container is not valid";
                string3 = "GMA Native Passed ad container is not valid";
                JioAdMediationController.a(this, (String)object2, (String)charSequence, string3);
            }
            object = Unit.a;
        }
        if (object == null) {
            charSequence = "onShowAdView";
            string3 = "Native ad rendition error";
            JioAdMediationController.a(this, (String)charSequence, string2, string3);
        }
        return this.a;
    }

    public void pauseAd(boolean bl2) {
        Object object = new StringBuilder();
        com.jio.jioads.common.b b2 = this.c;
        String string2 = ": pauseAd in JioAdMediationController";
        j_0.i(b2, (StringBuilder)object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.i;
        if (object != null) {
            ((t)object).c();
        }
    }

    public void resumeAd(boolean bl2) {
        boolean bl3;
        Object object = new StringBuilder();
        com.jio.jioads.common.b b2 = this.c;
        String string2 = ": resumeAd in JioAdMediationController";
        j_0.i(b2, (StringBuilder)object, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.i;
        if (object != null && !(bl3 = ((t)object).e) && (object = ((t)object).f) != null) {
            bl3 = ((a)object).i;
            if (bl3) {
                bl3 = false;
                b2 = null;
                ((a)object).i = false;
            }
            ((a)object).c();
        }
    }

    public final void setContainerView(ViewGroup viewGroup) {
        this.j = viewGroup;
    }

    public void setParentContainer(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "adContainer");
        this.a = viewGroup;
    }

    public final void setRequestedDuration$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(int n3) {
        this.h = n3;
    }
}

