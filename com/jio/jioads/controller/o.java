/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.PackageInfo
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jio.jioads.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdView;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdEvent;
import com.jio.jioads.adinterfaces.JioAdEvent$AdEventType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdPodVariant;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAdView$ORIENTATION_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.adinterfaces.JioAdsLoader;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader$JioVmapListener;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.e0;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.controller.JioAdRequestGenerator;
import com.jio.jioads.controller.a;
import com.jio.jioads.controller.c;
import com.jio.jioads.controller.d;
import com.jio.jioads.controller.e;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.h;
import com.jio.jioads.controller.i;
import com.jio.jioads.controller.j;
import com.jio.jioads.controller.k;
import com.jio.jioads.controller.l;
import com.jio.jioads.controller.m;
import com.jio.jioads.controller.n;
import com.jio.jioads.instreamads.vmapParser.model.b;
import com.jio.jioads.instreamads.vmapbuilder.VmapResponseListeners;
import com.jio.jioads.multiad.I;
import com.jio.jioads.multiad.N;
import com.jio.jioads.multiad.model.g;
import com.jio.jioads.multiad.t;
import com.jio.jioads.multiad.v;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.util.Utility;
import com.jio.jioads.utils.Constants$CompanionAdSize;
import com.jio.jioads.utils.Constants$HeaderKeys;
import com.jio.jioads.utils.Constants$ResponseHeaderKeys;
import com.jio.jioads.videomodule.s;
import com.jioads.mediation.JioMediationSelector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class o {
    public static HashMap T;
    public static HashMap U;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public String F;
    public JioAds$MediaType G;
    public AdView H;
    public boolean I;
    public ViewGroup J;
    public String K;
    public String L;
    public Drawable M;
    public Drawable N;
    public boolean O;
    public long P;
    public final f Q;
    public NetworkTaskListener R;
    public c S;
    public final com.jio.jioads.common.b a;
    public final a b;
    public HashMap c;
    public JSONArray d;
    public boolean e;
    public t f;
    public com.jio.jioads.instream.video.vodVmap.m g;
    public String h;
    public String i;
    public String j;
    public int k;
    public int l;
    public com.jio.jioads.network.c m;
    public String n;
    public boolean o;
    public JioMediationSelector p;
    public com.jio.jioads.common.j q;
    public com.jio.jioads.common.d r;
    public com.jio.jioads.common.a s;
    public Map t;
    public final boolean u;
    public String v;
    public VmapResponseListeners w;
    public JioAdsLoader x;
    public boolean y;
    public boolean z;

    static {
        HashMap hashMap;
        U = hashMap = new HashMap();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public o(com.jio.jioads.common.b var1_1, a var2_2) {
        block19: {
            var3_3 = this;
            var4_4 = var1_1;
            var5_5 /* !! */  = var2_2;
            var6_6 = 3;
            var7_7 = 2;
            var8_8 = 4;
            var9_9 = 1;
            var10_10 = "Class not found";
            Intrinsics.checkNotNullParameter(var1_1, "iJioAdView");
            Intrinsics.checkNotNullParameter(var2_2, "mJioAdCallback");
            super();
            this.a = var1_1;
            this.b = var2_2;
            var11_11 = "";
            this.h = var11_11;
            this.i = var11_11;
            this.j = var11_11;
            this.k = var12_12 = 20;
            this.l = var12_12;
            this.n = var11_11;
            var13_13 = JioAds$MediaType.NONE;
            this.G = var13_13;
            this.P = var14_14 = (long)-1;
            super(this);
            this.Q = var13_13;
            var16_15 = var1_1.K();
            if (var16_15 == null) {
                var17_16 = -1;
                break block19;
            }
            var18_17 /* !! */  = com.jio.jioads.controller.d.$EnumSwitchMapping$0;
            var17_16 = var16_15.ordinal();
            var17_16 = var18_17 /* !! */ [var17_16];
        }
        var18_17 /* !! */  = (int[])"com.jio.jioads.native.NativeAdController";
        switch (var17_16) {
            default: {
                break;
            }
            case 7: {
                var11_11 = "com.jio.jioads.instream.audio.InstreamAudio";
                break;
            }
            case 1: 
            case 3: 
            case 5: 
            case 6: {
                var11_11 = var18_17 /* !! */ ;
                break;
            }
            case 4: {
                var11_11 = "com.jio.jioads.instream.video.InstreamVideo";
                break;
            }
            case 2: {
                var11_11 = "com.jio.jioads.interstitial.InterstitialAdController";
            }
        }
        super();
        var18_17 /* !! */  = (int[])var1_1.P();
        var16_15.append((String)var18_17 /* !! */ );
        var18_17 /* !! */  = (int[])": init: JioAdViewController: ";
        var16_15.append((String)var18_17 /* !! */ );
        var16_15.append((String)var11_11);
        var16_15 = var16_15.toString();
        com.jio.jioads.util.j.a((String)var16_15);
        var17_16 = var11_11.length();
        if (var17_16 > 0) {
            var11_11 = Class.forName((String)var11_11);
            var16_15 = new Class[var8_8];
            var18_17 /* !! */  = (int[])ViewGroup.class;
            var16_15[0] = var18_17 /* !! */ ;
            var18_17 /* !! */  = (int[])a.class;
            var16_15[var9_9] = var18_17 /* !! */ ;
            var18_17 /* !! */  = (int[])com.jio.jioads.common.b.class;
            var16_15[var7_7] = var18_17 /* !! */ ;
            var18_17 /* !! */  = (int[])com.jio.jioads.common.c.class;
            var16_15[var6_6] = var18_17 /* !! */ ;
            if ((var11_11 = var11_11.getConstructor((Class<?>)var16_15)) != null) {
                var16_15 = var1_1.A();
                var19_18 = new Object[var8_8];
                var19_18[0] = var16_15;
                var19_18[var9_9] = var5_5 /* !! */ ;
                var19_18[var7_7] = var4_4;
                var19_18[var6_6] = var13_13;
                var5_5 /* !! */  = var11_11.newInstance(var19_18);
            } else {
                var5_5 /* !! */  = null;
            }
            var5_5 /* !! */  = (com.jio.jioads.common.d)var5_5 /* !! */ ;
            var3_3.r = var5_5 /* !! */ ;
        } else {
            var20_19 /* !! */  = new StringBuilder();
            var21_20 /* !! */  = var1_1.P();
            var20_19 /* !! */ .append(var21_20 /* !! */ );
            var21_20 /* !! */  = ":  Class not found";
            var20_19 /* !! */ .append(var21_20 /* !! */ );
            var20_19 /* !! */  = var20_19 /* !! */ .toString();
            com.jio.jioads.util.j.b((String)var20_19 /* !! */ );
            var20_19 /* !! */  = JioAdError.Companion;
            var21_20 /* !! */  = JioAdError$JioAdErrorType.ERROR_CACHE_AD;
            var20_19 /* !! */ .getClass();
            var13_13 = t_0.a((JioAdError$JioAdErrorType)var21_20 /* !! */ );
            var13_13.setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var10_10);
            var18_17 /* !! */  = (int[])com.jio.jioads.cdnlogging.d.a;
            var11_11 = var5_5 /* !! */ ;
            var11_11 = (V)var5_5 /* !! */ ;
            var22_21 = "makeAdRequest:onError";
            var23_22 = "JioAdViewController";
            var24_23 = "Class not found";
            var17_16 = 0;
            var16_15 = null;
            var11_11.d((JioAdError)var13_13, false, (com.jio.jioads.cdnlogging.d)var18_17 /* !! */ , var22_21, var23_22, var24_23, null);
        }
        ** try [egrp 2[TRYBLOCK] [44 : 593->596)] { 
lbl112:
        // 1 sources

        ** GOTO lbl126
lbl-1000:
        // 1 sources

        {
            catch (ClassNotFoundException v0) {
                try {
                    var5_5 /* !! */  = new StringBuilder();
                    var20_19 /* !! */  = ": Exoplayer dependency not available";
                    var21_20 /* !! */  = var3_3.a;
                    j_0.i((com.jio.jioads.common.b)var21_20 /* !! */ , (StringBuilder)var5_5 /* !! */ , (String)var20_19 /* !! */ );
                    var5_5 /* !! */  = JioAds.Companion;
                    var5_5 /* !! */  = var5_5 /* !! */ .getInstance();
                    var5_5 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var5_5 /* !! */  = JioAds$LogLevel.NONE;
                    var9_9 = 0;
lbl126:
                    // 2 sources

                    var3_3.u = var9_9;
                    var5_5 /* !! */  = var1_1.Y();
                    if (var5_5 /* !! */  != null) {
                        var20_19 /* !! */  = new com.jio.jioads.common.j((Context)var5_5 /* !! */ , (com.jio.jioads.common.b)var4_4);
                        var3_3.q = var20_19 /* !! */ ;
                        var4_4 = var3_3.r;
                        if (var4_4 != null) {
                            Intrinsics.checkNotNull(var20_19 /* !! */ );
                            var4_4.setParentContainer((ViewGroup)var20_19 /* !! */ );
                        }
                    }
                }
                catch (Exception v1) {
                    var4_4 = new StringBuilder();
                    var5_5 /* !! */  = var3_3.a.P();
                    var4_4.append((String)var5_5 /* !! */ );
                    var4_4.append(": Class not found: ");
                    var5_5 /* !! */  = Unit.a;
                    var4_4.append(var5_5 /* !! */ );
                    com.jio.jioads.util.j.b(var4_4.toString());
                    var4_4 = JioAdError.Companion;
                    var5_5 /* !! */  = JioAdError$JioAdErrorType.ERROR_CACHE_AD;
                    var13_13 = j_0.c((t_0)var4_4, (JioAdError$JioAdErrorType)var5_5 /* !! */ , var10_10);
                    var4_4 = var3_3.b;
                    var18_17 /* !! */  = (int[])com.jio.jioads.cdnlogging.d.a;
                    var11_11 = var4_4;
                    var11_11 = (V)var4_4;
                    var23_22 = "JioAdViewController";
                    var24_23 = "Class not found";
                    var17_16 = 0;
                    var16_15 = null;
                    var22_21 = "makeAdRequest:onError";
                    var11_11.d((JioAdError)var13_13, false, (com.jio.jioads.cdnlogging.d)var18_17 /* !! */ , var22_21, var23_22, var24_23, null);
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
    public static final boolean G(o object, String charSequence, String string2, Map object2) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        String string3;
        void var1_14;
        Object object3;
        String string4 = "ads";
        Object object4 = "cmps";
        String string5 = "pod";
        object.getClass();
        boolean bl6 = object3.isEmpty();
        if (bl6) {
            object3 = ((o)object).t;
        }
        if (object3 == null) return false;
        bl6 = object3.isEmpty();
        if (bl6) return false;
        bl6 = ((o)object).o;
        String string6 = "1";
        if (!bl6) {
            Constants$HeaderKeys constants$HeaderKeys = Constants$HeaderKeys.JIO_DATA;
            String string7 = constants$HeaderKeys.getKey();
            Locale locale = Locale.ROOT;
            string7 = string7.toLowerCase(locale);
            String string8 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
            Intrinsics.checkNotNullExpressionValue(string7, string8);
            boolean bl7 = object3.containsKey(string7);
            if (bl7 && !(bl7 = TextUtils.isEmpty((CharSequence)var1_14))) {
                string3 = constants$HeaderKeys.getKey().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(string3, string8);
                string3 = (String)object3.get(string3);
                boolean bl8 = TextUtils.isEmpty((CharSequence)string3);
                if (bl8) return false;
                bl8 = TextUtils.isEmpty((CharSequence)var1_14);
                if (bl8) return false;
                try {
                    boolean bl9;
                    Intrinsics.checkNotNull(string3);
                    object3 = new JSONObject(string3);
                    boolean bl10 = ((o)object).o;
                    String string9 = "strm";
                    if (!bl10) {
                        bl10 = object3.has(string5);
                        string7 = "fbk";
                        if (bl10 || (bl10 = object3.has(string7))) {
                            block21: {
                                boolean bl11;
                                bl10 = object3.has(string5);
                                string3 = bl10 ? object3.getJSONObject(string5) : object3.getJSONObject(string7);
                                bl8 = string3.has((String)object4);
                                if (!bl8) return false;
                                string3 = string3.getJSONObject((String)object4);
                                object3 = string3.keys();
                                Intrinsics.checkNotNull(object3);
                                while (bl11 = object3.hasNext()) {
                                    object4 = object3.next();
                                    object4 = (String)object4;
                                    boolean bl12 = (object4 = string3.getJSONObject((String)object4)).has(string4);
                                    if (!bl12 || !(bl12 = (object4 = object4.getJSONObject(string4)).has((String)var1_14))) continue;
                                    Intrinsics.checkNotNull(var1_14);
                                    bl12 = (object4 = object4.getJSONObject((String)var1_14)).has(string9);
                                    if (!bl12) {
                                        continue;
                                    }
                                    break block21;
                                }
                                return false;
                            }
                            String string10 = object4.getString(string9);
                            return Intrinsics.areEqual(string10, string6);
                        }
                    }
                    if (!(bl9 = object3.has(string9))) return false;
                    String string11 = object3.getString(string9);
                    return Intrinsics.areEqual(string11, string6);
                }
                catch (Exception exception) {
                    StringBuilder stringBuilder = new StringBuilder();
                    string3 = ": Exception fetching streaming enabled flag from header";
                    j_0.i(((o)object).a, stringBuilder, string3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                }
                return false;
            }
        }
        if (!(bl5 = ((o)object).o)) return false;
        bl5 = TextUtils.isEmpty((CharSequence)var1_14);
        if (bl5) return false;
        bl5 = TextUtils.isEmpty((CharSequence)string3);
        if (bl5) return false;
        object3 = ((o)object).s;
        string4 = null;
        if (object3 != null && (object4 = ((com.jio.jioads.common.a)object3).c) != null) {
            object4 = ((com.jio.jioads.multiad.model.e)object4).a;
        } else {
            bl4 = false;
            object4 = null;
        }
        if (object4 != null) {
            if (object3 != null && (object3 = ((com.jio.jioads.common.a)object3).c) != null) {
                object3 = ((com.jio.jioads.multiad.model.e)object3).a;
            } else {
                bl5 = false;
                object3 = null;
            }
            Intrinsics.checkNotNull(object3);
            object3 = com.jio.jioads.controller.o.m(string3, (HashMap)object3);
        } else {
            bl5 = false;
            object3 = null;
        }
        if (object3 == null) {
            com.jio.jioads.common.a a2 = ((o)object).s;
            if (a2 != null && (object4 = a2.b) != null) {
                object4 = ((com.jio.jioads.multiad.model.e)object4).a;
            } else {
                bl4 = false;
                object4 = null;
            }
            if (object4 != null) {
                void var0_7;
                com.jio.jioads.multiad.model.e e2;
                if (a2 != null && (e2 = a2.b) != null) {
                    HashMap hashMap = e2.a;
                } else {
                    bl3 = false;
                    Object var0_6 = null;
                }
                Intrinsics.checkNotNull(var0_7);
                object3 = com.jio.jioads.controller.o.m(string3, (HashMap)var0_7);
            }
        }
        if (object3 == null) return false;
        HashMap hashMap = ((com.jio.jioads.multiad.model.f)object3).d;
        if (hashMap == null) return false;
        bl3 = hashMap.containsKey(var1_14);
        if (bl3 != (bl2 = true)) return false;
        HashMap hashMap2 = ((com.jio.jioads.multiad.model.f)object3).d;
        Intrinsics.checkNotNull(hashMap2);
        com.jio.jioads.multiad.model.a a3 = (com.jio.jioads.multiad.model.a)hashMap2.get(var1_14);
        if (a3 == null) return Intrinsics.areEqual(string4, string6);
        com.jio.jioads.multiad.model.b b2 = a3.e;
        if (b2 == null) return Intrinsics.areEqual(string4, string6);
        string4 = b2.o;
        return Intrinsics.areEqual(string4, string6);
    }

    public static com.jio.jioads.multiad.model.f m(String string2, HashMap hashMap) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            boolean bl2;
            Iterator iterator = hashMap.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                boolean bl3;
                Object object = (String)iterator.next();
                if ((object = (HashMap)hashMap.get(object)) == null || !(bl3 = ((HashMap)object).containsKey(string2))) continue;
                return (com.jio.jioads.multiad.model.f)((HashMap)object).get(string2);
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String o(o object, String charSequence, String string2, Map object2) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Object e2;
        String string3;
        JSONObject jSONObject3;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        com.jio.jioads.common.a a2;
        boolean bl5;
        void var0_3;
        String string4;
        void var1_17;
        String string5;
        String string6;
        Object object3;
        Object object4;
        HashMap hashMap;
        block18: {
            hashMap = "ads";
            String string7 = "cmps";
            object4 = "pod";
            if (object3 == null) {
                object3 = ((o)object).t;
            } else {
                object.getClass();
            }
            string6 = null;
            if (object3 == null) return string6;
            boolean bl6 = object3.isEmpty();
            if (bl6) {
                return string6;
            }
            string5 = "cid";
            boolean bl7 = object3.containsKey(string5);
            if (bl7) {
                Object v4 = object3.get(string5);
                string6 = (String)v4;
                return (String)v4;
            }
            bl7 = ((o)object).o;
            if (bl7) break block18;
            Constants$HeaderKeys constants$HeaderKeys = Constants$HeaderKeys.JIO_DATA;
            String string8 = constants$HeaderKeys.getKey();
            Locale locale = Locale.ROOT;
            string8 = string8.toLowerCase(locale);
            String string9 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
            Intrinsics.checkNotNullExpressionValue(string8, string9);
            boolean bl8 = object3.containsKey(string8);
            if (!bl8 || (bl8 = TextUtils.isEmpty((CharSequence)var1_17))) break block18;
            string4 = constants$HeaderKeys.getKey().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(string4, string9);
            string4 = (String)object3.get(string4);
            boolean bl9 = TextUtils.isEmpty((CharSequence)string4);
            if (bl9) return string6;
            bl9 = TextUtils.isEmpty((CharSequence)var1_17);
            if (bl9) return string6;
            try {
                String string10;
                boolean bl10;
                block20: {
                    boolean bl11;
                    block19: {
                        Intrinsics.checkNotNull(string4);
                        object3 = new JSONObject(string4);
                        bl10 = ((o)object).o;
                        if (bl10) break block19;
                        bl10 = object3.has(object4);
                        string10 = "fbk";
                        if (bl10 || (bl10 = object3.has(string10))) break block20;
                    }
                    if (!(bl11 = object3.has(string5))) return string6;
                    String string11 = object3.getString(string5);
                    return var0_3;
                }
                bl10 = object3.has(object4);
                string4 = bl10 ? object3.getJSONObject(object4) : object3.getJSONObject(string10);
                bl9 = string4.has(string7);
                if (!bl9) return string6;
                string4 = string4.getJSONObject(string7);
                object3 = string4.keys();
                Intrinsics.checkNotNull(object3);
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                string4 = ": Exception fetching click id from header";
                j_0.i(((o)object).a, stringBuilder, string4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                return string6;
            }
        }
        if (!(bl5 = ((o)object).o)) return string6;
        bl5 = TextUtils.isEmpty((CharSequence)var1_17);
        if (bl5) return string6;
        bl5 = TextUtils.isEmpty((CharSequence)string4);
        if (bl5) return string6;
        object3 = ((o)object).s;
        hashMap = object3 != null && (hashMap = ((com.jio.jioads.common.a)object3).c) != null ? ((com.jio.jioads.multiad.model.e)((Object)hashMap)).a : null;
        if (hashMap != null) {
            if (object3 != null && (object3 = ((com.jio.jioads.common.a)object3).c) != null) {
                object3 = ((com.jio.jioads.multiad.model.e)object3).a;
            } else {
                bl5 = false;
                object3 = null;
            }
            Intrinsics.checkNotNull(object3);
            object3 = com.jio.jioads.controller.o.m(string4, (HashMap)object3);
        } else {
            bl5 = false;
            object3 = null;
        }
        if (object3 == null && (hashMap = (a2 = ((o)object).s) != null && (hashMap = a2.b) != null ? ((com.jio.jioads.multiad.model.e)((Object)hashMap)).a : null) != null) {
            void var0_11;
            com.jio.jioads.multiad.model.e e5;
            if (a2 != null && (e5 = a2.b) != null) {
                HashMap hashMap2 = e5.a;
            } else {
                bl4 = false;
                Object var0_10 = null;
            }
            Intrinsics.checkNotNull(var0_11);
            object3 = com.jio.jioads.controller.o.m(string4, (HashMap)var0_11);
        }
        if (object3 == null) return string6;
        HashMap hashMap3 = ((com.jio.jioads.multiad.model.f)object3).d;
        if (hashMap3 == null) return string6;
        bl4 = hashMap3.containsKey(var1_17);
        if (bl4 != (bl3 = true)) return string6;
        HashMap hashMap4 = ((com.jio.jioads.multiad.model.f)object3).d;
        Intrinsics.checkNotNull(hashMap4);
        com.jio.jioads.multiad.model.a a3 = (com.jio.jioads.multiad.model.a)hashMap4.get(var1_17);
        if (a3 == null) return string6;
        com.jio.jioads.multiad.model.b b2 = a3.e;
        if (b2 == null) return string6;
        return b2.g;
        do {
            boolean bl12;
            if (!(bl12 = object3.hasNext())) return string6;
        } while (!(bl2 = (jSONObject3 = string4.getJSONObject(string3 = (String)(e2 = object3.next()))).has((String)((Object)hashMap))) || !(bl2 = (jSONObject2 = jSONObject3.getJSONObject((String)((Object)hashMap))).has((String)var1_17)) || !(bl2 = (jSONObject = jSONObject2.getJSONObject(object4 = var1_17 == null ? "" : var1_17)).has(string5)));
        String string12 = jSONObject.getString(string5);
        return var0_3;
    }

    public static void w(String object, String string2, l object2) {
        HashMap hashMap = T;
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        T = hashMap;
        Intrinsics.checkNotNull(hashMap);
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)object);
        char c2 = '_';
        ((StringBuilder)charSequence).append(c2);
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((StringBuilder)charSequence).toString();
        Cloneable cloneable = T;
        Intrinsics.checkNotNull(cloneable);
        CharSequence charSequence2 = new StringBuilder();
        charSequence2.append((String)object);
        charSequence2.append(c2);
        charSequence2.append(string2);
        charSequence2 = charSequence2.toString();
        cloneable = (ArrayList)((HashMap)cloneable).get(charSequence2);
        if (cloneable != null) {
            ((ArrayList)cloneable).add(object2);
        } else {
            cloneable = new ArrayList();
            ((ArrayList)cloneable).add(object2);
        }
        hashMap.put(charSequence, cloneable);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(": listenerList size= ");
        hashMap = T;
        Intrinsics.checkNotNull(hashMap);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(c2);
        ((StringBuilder)charSequence).append(string2);
        object = ((StringBuilder)charSequence).toString();
        object = (ArrayList)hashMap.get(object);
        if (object != null) {
            int n3 = ((ArrayList)object).size();
            object = n3;
        } else {
            boolean bl2 = false;
            object = null;
        }
        ((StringBuilder)object2).append(object);
        Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
    }

    public final void A(boolean bl2) {
        Object object;
        Object object2;
        Object object3;
        String string2;
        Object object4;
        Object object5;
        o o3 = this;
        Object object6 = this.a;
        Object object7 = object6.k0();
        if (object7 == (object5 = JioAdView$AdState.DESTROYED)) {
            com.jio.jioads.audioplayer.b.a(object6, ": JioAdView state is destroyed so returning from selectFromAdCache() 1");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object6 = JioAds$LogLevel.NONE;
            return;
        }
        if ((object6 = object6.Y()) == null) {
            return;
        }
        object7 = this.f;
        if (object7 == null) {
            object4 = this.Y();
            string2 = this.n;
            boolean bl3 = this.a();
            object5 = this.U();
            if (object5 == null) {
                object6 = object6.getPackageName();
                object3 = object6;
            } else {
                object3 = object5;
            }
            Intrinsics.checkNotNull(object3);
            boolean bl4 = this.g0();
            object2 = new n(o3);
            object = o3.a;
            object5 = object7;
            object7 = new t((String)object4, (com.jio.jioads.common.b)object, string2, bl3, (String)object3, bl4, (n)object2);
            o3.f = object7;
        }
        com.jio.jioads.common.a a2 = this.S();
        long l2 = this.a0();
        boolean bl5 = false;
        object6 = null;
        object7 = "multiAdUtility";
        if (bl2) {
            Object object8;
            object5 = o3.f;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                object8 = null;
            } else {
                object8 = object5;
            }
            int n3 = this.Z();
            bl5 = o3.E;
            object7 = com.jio.jioads.multiad.t.r;
            ((t)object8).d(a2, l2, n3, null, bl5);
        } else {
            boolean bl6 = this.g0();
            if (bl6) {
                Intrinsics.checkNotNullParameter("Ignoring backup ad selection incase of hybrid multi ad", "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object6 = JioAds$LogLevel.NONE;
                object6 = JioAdError.Companion;
                object7 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                object5 = "No ad in Inventory";
                object = j_0.c((t_0)object6, (JioAdError$JioAdErrorType)((Object)object7), (String)object5);
                com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
                object6 = o3.b;
                object4 = object6;
                object4 = (V)object6;
                object3 = "selectFromAdCache";
                String string3 = "JioAdViewController";
                string2 = null;
                object2 = "Ignoring backup ad selection incase of hybrid multi ad";
                Object var17_17 = null;
                ((V)object4).d((JioAdError)object, false, d2, (String)object3, string3, (String)object2, null);
            } else {
                Object object9;
                object5 = o3.f;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    object9 = null;
                } else {
                    object9 = object5;
                }
                int n4 = this.Z();
                bl5 = o3.E;
                object7 = com.jio.jioads.multiad.t.r;
                ((t)object9).b(a2, l2, n4, null, bl5);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final boolean B(Integer var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [6 : 159->168)] java.lang.Exception
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
    public final boolean C(Map object, boolean bl2) {
        boolean bl3;
        int n3;
        block28: {
            String string2;
            Object object2;
            block29: {
                boolean bl4;
                int n4;
                int n7;
                Object object3;
                int n8;
                block30: {
                    block25: {
                        int n10;
                        block26: {
                            Object object4;
                            block27: {
                                boolean bl5;
                                block24: {
                                    block21: {
                                        block20: {
                                            Object object5;
                                            boolean bl6;
                                            Object object6;
                                            block23: {
                                                block22: {
                                                    Exception exception2;
                                                    block18: {
                                                        block17: {
                                                            block16: {
                                                                n3 = 1;
                                                                object2 = "type";
                                                                object6 = (Boolean)this.X().a;
                                                                bl6 = object6;
                                                                n8 = 0;
                                                                string2 = null;
                                                                object3 = this.a;
                                                                if (!bl6 || !(bl6 = this.o)) break block22;
                                                                com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object3, ": initMediationHeaderArray for Multi Ad ");
                                                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                object6 = JioAds$LogLevel.NONE;
                                                                try {
                                                                    object5 = this.s;
                                                                    if (object5 == null || (object5 = ((com.jio.jioads.common.a)object5).c) == null || (object5 = ((com.jio.jioads.multiad.model.e)object5).b) == null) break block16;
                                                                    object5 = ((com.jio.jioads.multiad.model.c)object5).a;
                                                                    break block17;
                                                                }
                                                                catch (Exception exception2) {
                                                                    break block18;
                                                                }
                                                            }
                                                            n7 = 0;
                                                            object5 = null;
                                                        }
                                                        object6 = new JSONArray((String)object5);
                                                        this.d = object6;
                                                        break block23;
                                                    }
                                                    object5 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object3, ": Getting error in initMediationHeaderArray(): ");
                                                    object4 = Utility.INSTANCE;
                                                    com.jio.jioads.jioreel.tracker.model.b.c((Utility)object4, exception2, (StringBuilder)object5);
                                                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                    object6 = JioAds$LogLevel.NONE;
                                                    break block23;
                                                }
                                                object6 = this.p((Map)object);
                                                this.d = object6;
                                            }
                                            bl6 = false;
                                            object6 = null;
                                            if (object == null) {
                                                com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object3, ": Not a mediation ad so returning false");
                                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                object = JioAds$LogLevel.NONE;
                                                this.e = false;
                                                return false;
                                            }
                                            n7 = this.o;
                                            if (n7 != 0) {
                                                object = this.s;
                                                if (object != null && (object = ((com.jio.jioads.common.a)object).c) != null && (object = ((com.jio.jioads.multiad.model.e)object).b) != null) {
                                                    object = ((com.jio.jioads.multiad.model.c)object).a;
                                                } else {
                                                    bl3 = false;
                                                    object = null;
                                                }
                                            } else {
                                                object = this.p((Map)object).toString();
                                            }
                                            Intrinsics.checkNotNull(object);
                                            try {
                                                object5 = new JSONArray((String)object);
                                                n4 = object3.x();
                                                n4 = (int)(object5.isNull(n4) ? 1 : 0);
                                                if (n4 != 0 || (object5 = object5.getJSONObject(n4 = object3.x())) == null || (n4 = (int)(object5.has((String)(object4 = "network_name")) ? 1 : 0)) == 0 || (n4 = (int)(object5.has((String)object2) ? 1 : 0)) == 0) break block20;
                                                object2 = object5.getString((String)object2);
                                                Intrinsics.checkNotNull(object2);
                                                object5 = Locale.getDefault();
                                                object4 = "getDefault(...)";
                                                Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
                                                object2 = ((String)object2).toLowerCase((Locale)object5);
                                                object5 = "this as java.lang.String).toLowerCase(locale)";
                                                Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
                                                object5 = "native";
                                                bl5 = StringsKt.F((CharSequence)object2, (CharSequence)object5, false);
                                                if (!bl5) break block20;
                                                bl5 = true;
                                                break block21;
                                            }
                                            catch (Exception exception) {}
                                        }
                                        bl5 = false;
                                        object2 = null;
                                    }
                                    this.A = bl5;
                                    n7 = 32;
                                    object4 = this.b;
                                    if (!bl5) break block24;
                                    object3.Z(0);
                                    object4 = (V)object4;
                                    ((V)object4).o();
                                    object = JioAdView$AdState.RECEIVED;
                                    object3.j((JioAdView$AdState)((Object)object));
                                    object = this.w;
                                    if (object == null) return n3 != 0;
                                    object2 = this.v;
                                    if (object2 == null) break block25;
                                    n8 = ((String)object2).length() - n3;
                                    n10 = 0;
                                    object3 = null;
                                    n4 = 0;
                                    object4 = null;
                                    break block26;
                                }
                                this.A = false;
                                this.e = bl5 = this.K((String)object);
                                if (!bl5) break block27;
                                com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object3, ": VAST Mediation Ad");
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object2 = JioAds$LogLevel.NONE;
                                object3.Z(n3);
                                object2 = JioAdView$AdState.RECEIVED;
                                object3.j((JioAdView$AdState)((Object)object2));
                                object4 = (V)object4;
                                ((V)object4).o();
                                object2 = this.w;
                                if (object2 == null) break block28;
                                object3 = this.v;
                                if (object3 == null) break block29;
                                n8 = ((String)object3).length() - n3;
                                n4 = 0;
                                object4 = null;
                                bl4 = false;
                                break block30;
                            }
                            bl2 = this.I((String)object);
                            if (bl2) {
                                com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object3, ": HTML Mediation Ad");
                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                Enum enum_ = JioAds$LogLevel.NONE;
                                bl2 = 2;
                                object3.Z((int)(bl2 ? 1 : 0));
                                enum_ = JioAdView$AdState.RECEIVED;
                                object3.j((JioAdView$AdState)enum_);
                                object4 = (V)object4;
                                ((V)object4).o();
                            }
                            break block28;
                        }
                        while (n10 <= n8) {
                            int n14 = n4 == 0 ? n10 : n8;
                            n14 = Intrinsics.compare(((String)object2).charAt(n14), n7);
                            n14 = n14 <= 0 ? 1 : 0;
                            if (n4 == 0) {
                                if (n14 == 0) {
                                    n4 = 1;
                                    continue;
                                }
                                n10 += n3;
                                continue;
                            }
                            if (n14 == 0) break;
                            n8 += -1;
                        }
                        string2 = com.jio.jioads.adinterfaces.a.a(n8, n3, n10, (String)object2);
                    }
                    object.onVmapResponseReceived(string2, bl2);
                    return n3 != 0;
                }
                while (n4 <= n8) {
                    int n15 = !bl4 ? n4 : n8;
                    n15 = Intrinsics.compare(((String)object3).charAt(n15), n7);
                    n15 = n15 <= 0 ? 1 : 0;
                    if (!bl4) {
                        if (n15 == 0) {
                            bl4 = true;
                            continue;
                        }
                        n4 += n3;
                        continue;
                    }
                    if (n15 == 0) break;
                    n8 += -1;
                }
                string2 = com.jio.jioads.adinterfaces.a.a(n8, n3, n4, (String)object3);
            }
            object2.onVmapResponseReceived(string2, bl2);
        }
        if (bl2 = this.e) return n3 != 0;
        bl3 = this.I((String)object);
        if (!bl3) return 0 != 0;
        return n3 != 0;
    }

    public final boolean D(JSONObject object, JSONObject object2) {
        block7: {
            Object object3 = "sh";
            String string2 = "sk";
            int n3 = object2.optInt(string2);
            int n4 = object.optInt(string2);
            int n7 = object.optInt((String)object3);
            int n8 = 1;
            n7 += n8;
            if ((n4 += n8) > n3) break block7;
            object.put((String)object3, n7);
            object.put(string2, n4);
            object = object.toString();
            try {
                this.z((String)object, false);
                return n8 != 0;
            }
            catch (Exception exception) {
                object2 = new StringBuilder();
                object3 = this.a;
                string2 = ": ";
                j_0.n((com.jio.jioads.common.b)object3, (StringBuilder)object2, string2);
                object3 = Utility.INSTANCE;
                com.jio.jioads.jioreel.tracker.model.b.c((Utility)object3, exception, (StringBuilder)object2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
            }
        }
        return false;
    }

    public final String E(String object) {
        String string2;
        block17: {
            Intrinsics.checkNotNullParameter(object, "key");
            Object object2 = Constants$ResponseHeaderKeys.JIO_DATA;
            Object object3 = object2.getResponseHeader();
            Locale locale = Locale.ROOT;
            object3 = ((String)object3).toLowerCase(locale);
            String string3 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
            Intrinsics.checkNotNullExpressionValue(object3, string3);
            boolean bl2 = Intrinsics.areEqual(object, object3);
            string2 = "";
            if (bl2) {
                object = this.t;
                Intrinsics.checkNotNull(object);
                object3 = object2.getResponseHeader().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(object3, string3);
                boolean bl3 = object.containsKey(object3);
                if (bl3) {
                    object = this.t;
                    Intrinsics.checkNotNull(object);
                    object2 = object2.getResponseHeader().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                    return (String)object.get(object2);
                }
            } else {
                object3 = this.t;
                if (object3 != null) {
                    String string4 = object2.getResponseHeader().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(string4, string3);
                    bl2 = object3.containsKey(string4);
                    boolean bl4 = true;
                    if (bl2 == bl4) {
                        block16: {
                            try {
                                object3 = this.t;
                            }
                            catch (Exception exception) {}
                            Intrinsics.checkNotNull(object3);
                            object2 = object2.getResponseHeader();
                            object2 = ((String)object2).toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(object2, string3);
                            object2 = object3.get(object2);
                            object2 = (String)object2;
                            if (object2 != null) break block16;
                            object2 = string2;
                        }
                        object3 = new JSONObject((String)object2);
                        boolean bl5 = object3.has((String)object);
                        if (!bl5) break block17;
                        return object3.getString((String)object);
                    }
                }
            }
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void F(Map object) {
        JioAdView$AdState jioAdView$AdState;
        Object object2 = "blk";
        String string2 = "pod";
        String string3 = "mid";
        String string4 = "ls";
        String string5 = "app_zone";
        String string6 = "adseq";
        com.jio.jioads.common.b b2 = this.a;
        JioAdView$AdState jioAdView$AdState2 = b2.k0();
        if (jioAdView$AdState2 == (jioAdView$AdState = JioAdView$AdState.DESTROYED)) {
            return;
        }
        jioAdView$AdState2 = b2.Y();
        if (object == null) return;
        Constants$HeaderKeys constants$HeaderKeys = Constants$HeaderKeys.JIO_DATA;
        String string7 = constants$HeaderKeys.getKey();
        Locale locale = Locale.ROOT;
        String string8 = string7.toLowerCase(locale);
        String string9 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
        Intrinsics.checkNotNullExpressionValue(string8, string9);
        boolean bl2 = object.containsKey(string8);
        boolean bl3 = true;
        if (bl2 != bl3) return;
        try {
            int n3;
            this.t = object;
            object = constants$HeaderKeys.getKey();
            object = ((String)object).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(object, string9);
            object = this.E((String)object);
            if (object == null) {
                object = "";
            }
            if ((n3 = (constants$HeaderKeys = new JSONObject((String)object)).has(string4)) != 0) {
                JioAdView$AdState jioAdView$AdState3;
                object = constants$HeaderKeys.getString(string4);
                Intrinsics.checkNotNull(object);
                string4 = b2.Y();
                if (string4 != null && (jioAdView$AdState3 = b2.k0()) != jioAdView$AdState) {
                    String string10 = "common_prefs";
                    String string11 = "localStore";
                    locale = null;
                    j_0.p((Context)string4, string10, 0, object, string11);
                }
            }
            if ((n3 = constants$HeaderKeys.has(string3)) != 0) {
                object = constants$HeaderKeys.getString(string3);
                Intrinsics.checkNotNull(object);
                this.L((String)object);
            }
            if ((n3 = constants$HeaderKeys.has(string6)) != 0) {
                object = constants$HeaderKeys.getString(string6);
                this.z((String)object, bl3);
            } else {
                boolean bl4;
                n3 = this.o;
                if (n3 == 0 && (n3 = constants$HeaderKeys.has(string2)) != 0 && (bl4 = (object = constants$HeaderKeys.getJSONObject(string2)).has(string5)) && (bl4 = (string2 = object.getJSONObject(string5)).has(string6))) {
                    object = object.getJSONObject(string5);
                    object = object.getString(string6);
                    this.z((String)object, bl3);
                }
            }
            n3 = constants$HeaderKeys.has((String)object2);
            if (n3 == 0) return;
            object = constants$HeaderKeys.getString((String)object2);
            object2 = com.jio.jioads.multiad.N.a;
            object2 = b2.P();
            Intrinsics.checkNotNull(object);
            n3 = Integer.parseInt((String)object);
            object = n3;
            com.jio.jioads.multiad.N.f((Context)jioAdView$AdState2, (String)object2, (Integer)object);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void H() {
        Object object;
        Object object2 = this.a;
        Object object3 = object2.Y();
        if (object3 != null && (object2 = object2.k0()) != (object = JioAdView$AdState.DESTROYED)) {
            object2 = this.Y();
            object = "multiad_pref";
            j_0.f(object3, (String)object, (String)object2);
            object2 = this.b0();
            j_0.f(object3, (String)object, (String)object2);
            object2 = this.s;
            object3 = object2 != null && (object3 = ((com.jio.jioads.common.a)object2).c) != null ? object3.a : null;
            if (object3 != null && object2 != null && (object2 = ((com.jio.jioads.common.a)object2).c) != null && (object2 = ((com.jio.jioads.multiad.model.e)object2).a) != null) {
                ((HashMap)object2).clear();
            }
        }
    }

    public final boolean I(String string2) {
        block15: {
            int n3;
            JSONArray jSONArray;
            Object object = "type";
            Object object2 = this.a;
            try {
                jSONArray = new JSONArray(string2);
                n3 = object2.x();
            }
            catch (Exception exception) {}
            n3 = (int)(jSONArray.isNull(n3) ? 1 : 0);
            if (n3 != 0) break block15;
            n3 = object2.x();
            string2 = jSONArray.getJSONObject(n3);
            if (string2 == null) break block15;
            object2 = "network_name";
            boolean bl2 = string2.has((String)object2);
            if (!bl2) break block15;
            bl2 = string2.has((String)object);
            if (!bl2) break block15;
            string2 = string2.getString((String)object);
            Intrinsics.checkNotNull(string2);
            object = Locale.getDefault();
            object2 = "getDefault(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            string2 = string2.toLowerCase((Locale)object);
            object = "this as java.lang.String).toLowerCase(locale)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object);
            object = "display";
            n3 = (int)(StringsKt.F(string2, (CharSequence)object, false) ? 1 : 0);
            if (n3 != 0) {
                return true;
            }
        }
        return false;
    }

    public final void J() {
        Object object = this.g;
        if (object != null) {
            boolean bl2;
            Object object2;
            s s7 = ((com.jio.jioads.instream.video.vodVmap.m)object).r;
            if (s7 != null) {
                s7.u();
            }
            s7 = null;
            ((com.jio.jioads.instream.video.vodVmap.m)object).r = null;
            JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener = ((com.jio.jioads.instream.video.vodVmap.m)object).d;
            if (jioVmapAdsLoader$JioVmapListener != null) {
                JioAdEvent$AdEventType jioAdEvent$AdEventType = JioAdEvent$AdEventType.AD_BREAK_ENDED;
                object2 = new JioAdEvent(jioAdEvent$AdEventType);
                jioVmapAdsLoader$JioVmapListener.onJioVmapEvent((JioAdEvent)object2, null);
            }
            if ((bl2 = Intrinsics.areEqual(object = ((com.jio.jioads.instream.video.vodVmap.m)object).l, object2 = "end")) && jioVmapAdsLoader$JioVmapListener != null) {
                object2 = JioAdEvent$AdEventType.ALL_ADS_COMPLETED;
                object = new JioAdEvent((JioAdEvent$AdEventType)((Object)object2));
                jioVmapAdsLoader$JioVmapListener.onJioVmapEvent((JioAdEvent)object, null);
            }
        }
        if ((object = this.r) != null) {
            Intrinsics.checkNotNull(object);
            ((com.jio.jioads.common.d)object).closeAd();
        }
    }

    public final boolean K(String string2) {
        block16: {
            int n3;
            JSONArray jSONArray;
            Object object = "type";
            String string3 = "network_name";
            com.jio.jioads.common.b b2 = this.a;
            try {
                jSONArray = new JSONArray(string2);
                n3 = b2.x();
            }
            catch (Exception exception) {}
            n3 = (int)(jSONArray.isNull(n3) ? 1 : 0);
            if (n3 != 0) break block16;
            n3 = b2.x();
            string2 = jSONArray.getJSONObject(n3);
            if (string2 == null) break block16;
            boolean bl2 = string2.has(string3);
            if (!bl2) break block16;
            bl2 = string2.has((String)object);
            if (!bl2) break block16;
            string2.getString(string3);
            string2 = string2.getString((String)object);
            Intrinsics.checkNotNull(string2);
            object = Locale.getDefault();
            string3 = "getDefault(...)";
            Intrinsics.checkNotNullExpressionValue(object, string3);
            string2 = string2.toLowerCase((Locale)object);
            object = "this as java.lang.String).toLowerCase(locale)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object);
            object = "video";
            n3 = (int)(StringsKt.F(string2, (CharSequence)object, false) ? 1 : 0);
            if (n3 != 0) {
                return true;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void L(String var1_1) {
        block27: {
            block29: {
                block28: {
                    var2_2 = this;
                    var3_3 = var1_1;
                    var4_4 /* !! */  = this.a;
                    var5_5 = var4_4 /* !! */ .k0();
                    if (var5_5 == (var6_6 /* !! */  = JioAdView$AdState.DESTROYED)) {
                        return;
                    }
                    var5_5 = var4_4 /* !! */ .Y();
                    if (var5_5 == null) {
                        return;
                    }
                    var6_6 /* !! */  = j_0.o((Context)var5_5, "common_prefs");
                    var7_7 = new StringBuilder();
                    l_0.d((com.jio.jioads.common.b)var4_4 /* !! */ , (StringBuilder)var7_7, ": globalIdHeader: ", var1_1);
                    var7_7 = JioAds.Companion;
                    var7_7.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var8_8 /* !! */  = JioAds$LogLevel.NONE;
                    var9_9 = TextUtils.isEmpty((CharSequence)var1_1);
                    if (var9_9) break block27;
                    var8_8 /* !! */  = new JSONObject(var1_1);
                    var3_3 = "type";
                    var10_10 = var8_8 /* !! */ .optString((String)var3_3);
                    var11_11 = "id";
                    var12_12 = var8_8 /* !! */ .optString(var11_11);
                    var13_13 = "expiry";
                    var14_14 = var8_8 /* !! */ .optString(var13_13);
                    var15_15 = "mtype";
                    var8_8 /* !! */  = var8_8 /* !! */ .optString(var15_15);
                    var16_16 = "GlobalId";
                    var17_17 = "";
                    var18_18 = var6_6 /* !! */ .getString(var16_16, var17_17);
                    var19_19 /* !! */  = new JSONObject();
                    var20_20 = TextUtils.isEmpty((CharSequence)var18_18);
                    if (!var20_20) {
                        if (var18_18 == null) {
                            var18_18 = var17_17;
                        }
                        var2_2 = new JSONObject(var18_18);
                    } else {
                        var2_2 = var19_19 /* !! */ ;
                    }
                    var18_18 = new JSONObject();
                    var19_19 /* !! */  = var4_4 /* !! */ .q0();
                    var21_21 = TextUtils.isEmpty((CharSequence)var19_19 /* !! */ );
                    if (var21_21) break block28;
                    var1_1 = var18_18;
                    var18_18 = var4_4 /* !! */ .q0();
                    var22_22 = var2_2.has(var18_18);
                    if (var22_22) {
                        var18_18 = var4_4 /* !! */ .q0();
                        if ((var18_18 = var2_2.optJSONObject(var18_18)) == null) {
                            var18_18 = new JSONObject();
                        }
lbl50:
                        // 5 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    break block29;
                }
                var1_1 = var18_18;
                var18_18 = var5_5.getPackageName();
                var22_23 = TextUtils.isEmpty((CharSequence)var18_18);
                if (var22_23 || !(var22_23 = var2_2.has(var18_18 = var5_5.getPackageName()))) break block29;
                var18_18 = var5_5.getPackageName();
                if ((var18_18 = var2_2.optJSONObject(var18_18)) == null) {
                    var18_18 = new JSONObject();
                }
                ** GOTO lbl50
            }
            var18_18 = var1_1;
            ** while (true)
            var1_1 = var16_16;
            var16_16 = "1";
            var23_24 = var10_10.equals(var16_16);
            var19_19 /* !! */  = var6_6 /* !! */ ;
            var6_6 /* !! */  = "message";
            var24_25 = var7_7;
            var7_7 = "adspots";
            if (var23_24) {
                var18_18.put(var11_11, (Object)var12_12);
                var18_18.put(var13_13, (Object)var14_14);
                var18_18.put((String)var3_3, (Object)var10_10);
                var25_26 = var18_18.has((String)var7_7);
                if (var25_26) {
                    var18_18.remove((String)var7_7);
                }
                var3_3 = var18_18.optString(var15_15, var17_17);
                var7_7 = new JSONObject();
                var26_28 = TextUtils.isEmpty((CharSequence)var3_3);
                if (!var26_28) {
                    var7_7 = new JSONObject((String)var3_3);
                }
                var3_3 = var4_4 /* !! */ .P();
                var7_7.put((String)var3_3, (Object)var8_8 /* !! */ );
                var18_18.put(var15_15, var7_7);
                var3_3 = var4_4 /* !! */ .q0();
                var25_26 = TextUtils.isEmpty((CharSequence)var3_3);
                if (!var25_26) {
                    var3_3 = var4_4 /* !! */ .q0();
                    if (var3_3 != null) {
                        var2_2.put((String)var3_3, (Object)var18_18);
                    }
                } else {
                    var3_3 = var5_5.getPackageName();
                    var2_2.put((String)var3_3, (Object)var18_18);
                }
                var3_3 = new StringBuilder();
                var4_4 /* !! */  = var4_4 /* !! */ .P();
                var3_3.append((String)var4_4 /* !! */ );
                var4_4 /* !! */  = ": packageSetObject: ";
                var3_3.append((String)var4_4 /* !! */ );
                var3_3.append(var2_2);
                Intrinsics.checkNotNullParameter(var3_3.toString(), (String)var6_6 /* !! */ );
                var24_25.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var3_3 = var19_19 /* !! */ .edit();
                if (var3_3 != null) {
                    var2_2 = var2_2.toString();
                    var16_16 = var1_1;
                    if ((var2_2 = var3_3.putString(var1_1, (String)var2_2)) != null) {
                        var2_2.apply();
                    }
                }
            } else {
                var16_16 = "2";
                var23_24 = var10_10.equals(var16_16);
                if (var23_24) {
                    var16_16 = var18_18.optString((String)var7_7, var17_17);
                    var27_29 = new JSONObject();
                    var28_30 = TextUtils.isEmpty((CharSequence)var16_16);
                    if (!var28_30) {
                        var29_31 /* !! */  = var6_6 /* !! */ ;
                        var6_6 /* !! */  = new JSONObject(var16_16);
                    } else {
                        var29_31 /* !! */  = var6_6 /* !! */ ;
                        var6_6 /* !! */  = var27_29;
                    }
                    var16_16 = var18_18.optString(var15_15, var17_17);
                    var17_17 = new JSONObject();
                    var30_32 = TextUtils.isEmpty((CharSequence)var16_16);
                    if (!var30_32) {
                        var17_17 = new JSONObject(var16_16);
                    }
                    var16_16 = new JSONObject();
                    var16_16.put(var11_11, (Object)var12_12);
                    var16_16.put(var13_13, (Object)var14_14);
                    var16_16.put((String)var3_3, (Object)var10_10);
                    var3_3 = var4_4 /* !! */ .P();
                    var6_6 /* !! */ .put((String)var3_3, var16_16);
                    var18_18.put((String)var7_7, (Object)var6_6 /* !! */ );
                    var3_3 = var4_4 /* !! */ .P();
                    var17_17.put((String)var3_3, (Object)var8_8 /* !! */ );
                    var18_18.put(var15_15, (Object)var17_17);
                    var3_3 = var4_4 /* !! */ .q0();
                    var25_27 = TextUtils.isEmpty((CharSequence)var3_3);
                    if (!var25_27) {
                        var3_3 = var4_4 /* !! */ .q0();
                        if (var3_3 != null) {
                            var2_2.put((String)var3_3, (Object)var18_18);
                        }
                    } else {
                        var3_3 = var5_5.getPackageName();
                        var2_2.put((String)var3_3, (Object)var18_18);
                    }
                    var3_3 = new StringBuilder("packageSetObject: ");
                    var3_3.append(var2_2);
                    var3_3 = var3_3.toString();
                    var4_4 /* !! */  = var29_31 /* !! */ ;
                    Intrinsics.checkNotNullParameter(var3_3, (String)var29_31 /* !! */ );
                    var24_25.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var3_3 = var19_19 /* !! */ .edit();
                    if (var3_3 != null) {
                        var2_2 = var2_2.toString();
                        var4_4 /* !! */  = var1_1;
                        if ((var2_2 = var3_3.putString(var1_1, (String)var2_2)) != null) {
                            var2_2.apply();
                        }
                    }
                }
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean M() {
        Exception exception2;
        Object object;
        boolean bl2;
        Object object2;
        block12: {
            Object object3;
            Object object4;
            block11: {
                object4 = "message";
                object2 = this.a;
                bl2 = false;
                try {
                    object = new StringBuilder();
                    object3 = object2.P();
                    ((StringBuilder)object).append((String)object3);
                    object3 = ": JioAdViewController: destroy() called";
                    ((StringBuilder)object).append((String)object3);
                    object = ((StringBuilder)object).toString();
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    object4 = JioAds.Companion;
                    object4 = ((JioAds$Companion)object4).getInstance();
                    ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = JioAds$LogLevel.NONE;
                    object4 = com.jio.jioads.multiad.N.a;
                    object4 = this.U();
                    if (object4 != null) break block11;
                    object4 = "";
                }
                catch (Exception exception2) {
                    break block12;
                }
            }
            object = this.R;
            object3 = "packageName";
            Intrinsics.checkNotNullParameter(object4, (String)object3);
            object3 = com.jio.jioads.multiad.N.c;
            if (object3 != null) {
                object4 = ((HashMap)object3).get(object4);
                if ((object4 = (ArrayList)object4) != null) {
                    object4 = TypeIntrinsics.asMutableCollection(object4);
                    object4.remove(object);
                }
            }
            object4 = null;
            this.R = null;
            object = this.q;
            if (object != null) {
                ((com.jio.jioads.common.j)((Object)object)).f = null;
            }
            if (object != null) {
                ((com.jio.jioads.common.j)((Object)object)).b();
            }
            object = (object = this.q) != null ? object.getParent() : null;
            {
                boolean bl3 = object instanceof ViewGroup;
                if ((object = bl3 ? (ViewGroup)object : null) != null) {
                    object3 = this.q;
                    object.removeView((View)object3);
                }
                this.q = null;
                object = this.m;
                if (object != null) {
                    ((com.jio.jioads.network.c)object).a();
                }
                this.m = null;
                object = this.p;
                if (object != null) {
                    ((JioMediationSelector)object).onDestroy();
                }
                this.p = null;
                object = this.r;
                if (object != null) {
                    ((com.jio.jioads.common.d)object).onDestroy();
                }
                this.m = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.c = null;
                this.F = null;
                this.D = false;
                this.E = false;
                this.J = null;
                this.K = null;
                this.L = null;
                this.M = null;
                this.N = null;
                this.O = false;
                return true;
            }
        }
        object2 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object2, ": Exception while destroying JioAdView ");
        object = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception2, (StringBuilder)object2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        return bl2;
    }

    public final String N() {
        JioAdView$AdState jioAdView$AdState;
        Object object = this.a;
        Context context = object.Y();
        String string2 = "";
        if (context != null && (object = object.k0()) != (jioAdView$AdState = JioAdView$AdState.DESTROYED)) {
            return String.valueOf(j_0.d(context, "multiad_pref", 0, string2, "eads"));
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void O(String string2) {
        int n3;
        String string3;
        String string4;
        String string5;
        Object object;
        JioAdView$AdState jioAdView$AdState;
        com.jio.jioads.common.b b2;
        String string6;
        Object object2;
        block86: {
            String string7;
            Object object3;
            int n4;
            block83: {
                int n7;
                String string8;
                Object object4;
                JSONObject jSONObject;
                boolean bl2;
                block82: {
                    block81: {
                        Object object5;
                        block80: {
                            o o3;
                            block79: {
                                o3 = this;
                                object2 = "getJSONObject(...)";
                                boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                                string6 = !bl3 ? string2 : this.E("adid");
                                b2 = o3.a;
                                jioAdView$AdState = b2.k0();
                                if (jioAdView$AdState == (object = JioAdView$AdState.DESTROYED)) {
                                    return;
                                }
                                jioAdView$AdState = b2.Y();
                                object = new StringBuilder();
                                string5 = b2.P();
                                ((StringBuilder)object).append(string5);
                                ((StringBuilder)object).append(": Inside updateAdWeightage :: currentAdId is: ");
                                ((StringBuilder)object).append(string6);
                                ((StringBuilder)object).append(" and aadId is::");
                                string5 = "message";
                                object5 = string2;
                                ir3_0.b((StringBuilder)object, string2, string5);
                                object = JioAds.Companion;
                                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object5 = JioAds$LogLevel.NONE;
                                if (string6 == null) {
                                    return;
                                }
                                object5 = o3.f;
                                if (object5 == null) return;
                                n4 = TextUtils.isEmpty((CharSequence)string6);
                                if (n4 != 0) return;
                                object5 = o3.f;
                                object3 = "multiAdUtility";
                                string7 = null;
                                if (object5 != null) break block79;
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                n4 = 0;
                                object5 = null;
                            }
                            object5 = ((t)object5).p;
                            object5 = ((com.jio.jioads.multiad.j)object5).a;
                            object5 = ((t)object5).j;
                            n4 = object5.containsKey(string6);
                            if (n4 == 0) return;
                            object5 = new StringBuilder();
                            string4 = b2.P();
                            ((StringBuilder)object5).append(string4);
                            string4 = ": Inside updateAdWeightage for adId: ";
                            ((StringBuilder)object5).append(string4);
                            ((StringBuilder)object5).append(string6);
                            object5 = ((StringBuilder)object5).toString();
                            Intrinsics.checkNotNullParameter(object5, string5);
                            object5 = ((JioAds$Companion)object).getInstance();
                            ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object5 = o3.f;
                            if (object5 != null) break block80;
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            n4 = 0;
                            object5 = null;
                        }
                        object5 = ((t)object5).p;
                        object5 = ((com.jio.jioads.multiad.j)object5).a;
                        object5 = ((t)object5).j;
                        object5 = fh1_2.g(string6, (Map)object5);
                        object5 = (Map)object5;
                        object3 = object5.keySet();
                        object3 = CollectionsKt.K((Iterable)object3);
                        object3 = (String)object3;
                        object5 = fh1_2.g(object3, (Map)object5);
                        object5 = (Number)object5;
                        n4 = ((Number)object5).intValue();
                        string4 = "multiad_pref";
                        bl2 = false;
                        jSONObject = null;
                        string3 = "playedAdWithWeight_";
                        if (jioAdView$AdState == null) break block81;
                        object4 = new StringBuilder(string3);
                        string8 = b2.P();
                        ((StringBuilder)object4).append(string8);
                        object4 = ((StringBuilder)object4).toString();
                        string8 = "";
                        object4 = j_0.d((Context)jioAdView$AdState, string4, 0, string8, (String)object4);
                        break block82;
                    }
                    n7 = 0;
                    object4 = null;
                }
                string8 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(object4, string8);
                object4 = (String)object4;
                int n8 = TextUtils.isEmpty((CharSequence)object4);
                if (n8 != 0) break block83;
                string6 = new JSONArray((String)object4);
                n3 = string6.length();
                object4 = null;
                for (n7 = 0; n7 < n3; ++n7) {
                    block85: {
                        int n10;
                        block84: {
                            string8 = string6.getJSONObject(n7);
                            Intrinsics.checkNotNullExpressionValue(string8, (String)object2);
                            n10 = string8.has((String)object3);
                            if (n10 == 0) break block84;
                            string8.put((String)object3, n4);
                            break block85;
                        }
                        string8 = "json";
                        Intrinsics.checkNotNullParameter(string6, string8);
                        string8 = "key";
                        Intrinsics.checkNotNullParameter(object3, string8);
                        n8 = string6.length();
                        for (n10 = 0; n10 < n8; ++n10) {
                            try {
                                jSONObject = string6.getJSONObject(n10);
                            }
                            catch (Exception exception) {}
                            Intrinsics.checkNotNullExpressionValue(jSONObject, (String)object2);
                            bl2 = jSONObject.has((String)object3);
                            if (!bl2) {
                                bl2 = false;
                                jSONObject = null;
                                continue;
                            }
                            break block85;
                            break;
                        }
                        string7 = new JSONObject();
                        string7.put((String)object3, n4);
                    }
                    bl2 = false;
                    jSONObject = null;
                }
                if (string7 == null) break block86;
                try {
                    string6.put((Object)string7);
                    break block86;
                }
                catch (Exception exception) {
                    com.jio.jioads.audioplayer.b.a(b2, " + played campaign array set null");
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    return;
                }
            }
            object2 = new StringBuilder();
            string7 = b2.P();
            ((StringBuilder)object2).append(string7);
            string7 = ": Inside playedCampaignArray for adId :";
            ((StringBuilder)object2).append(string7);
            ((StringBuilder)object2).append(string6);
            object2 = ((StringBuilder)object2).toString();
            Intrinsics.checkNotNullParameter(object2, string5);
            object2 = ((JioAds$Companion)object).getInstance();
            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            string6 = new JSONArray();
            object2 = new JSONObject();
            object2.put((String)object3, n4);
            string6.put(object2);
        }
        object2 = new StringBuilder();
        object = b2.P();
        ((StringBuilder)object2).append((String)object);
        object = ": selectAdBySequential storing Ad weightage in pref:  ";
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append((Object)string6);
        object2 = ((StringBuilder)object2).toString();
        Intrinsics.checkNotNullParameter(object2, string5);
        object2 = JioAds.Companion;
        object2 = ((JioAds$Companion)object2).getInstance();
        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        if (jioAdView$AdState == null) return;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(string3);
        object = b2.P();
        ((StringBuilder)object2).append((String)object);
        object2 = ((StringBuilder)object2).toString();
        string6 = string6.toString();
        n3 = 0;
        object = null;
        j_0.p((Context)jioAdView$AdState, string4, 0, string6, (String)object2);
    }

    public final void P() {
        Object object;
        com.jio.jioads.common.b b2 = this.a;
        Object object2 = b2.k0();
        if (object2 == (object = JioAdView$AdState.DESTROYED)) {
            return;
        }
        if ((b2 = b2.Y()) == null) {
            return;
        }
        object2 = this.R;
        if (object2 == null) {
            object2 = new e(this);
        }
        this.R = object2;
        object2 = com.jio.jioads.multiad.N.a;
        object2 = this.U();
        object = this.R;
        com.jio.jioads.multiad.N.h((Context)b2, (String)object2, false, true, (NetworkTaskListener)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Q(String string2) {
        Utility utility;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string3 = "1";
        if (bl2) {
            this.h = string3;
            this.i = string3;
            this.j = string3;
            return;
        }
        bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string4 = "0";
        if (!bl2) {
            utility = Utility.INSTANCE;
            Intrinsics.checkNotNull(string2);
            bl2 = utility.isSDKError(string2);
            if (bl2) {
                this.h = string3;
                this.i = string3;
                this.j = string4;
                return;
            }
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            utility = Utility.INSTANCE;
            Intrinsics.checkNotNull(string2);
            bl2 = utility.isDeliveryError(string2);
            if (bl2) {
                this.h = string3;
                this.i = string4;
                this.j = string4;
                return;
            }
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)string2)) return;
        utility = Utility.INSTANCE;
        Intrinsics.checkNotNull(string2);
        boolean bl3 = utility.isApplicationError(string2);
        if (!bl3) return;
        this.h = string4;
        this.i = string4;
        this.j = string4;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Integer R() {
        long l2;
        long l3;
        long l4;
        long l7;
        void var15_30;
        long l8;
        long l12;
        int n3;
        Object object;
        o o3 = this;
        Object object2 = this.a;
        Object object3 = object2.k0();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        int n4 = 0;
        Object object4 = null;
        if (object3 == jioAdView$AdState) {
            return null;
        }
        object3 = object2.Y();
        boolean bl2 = this.g0();
        if (!bl2) return null;
        StringBuilder stringBuilder = new StringBuilder();
        com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object2, stringBuilder, ": hybrid multi ad is enabled");
        String string2 = "";
        String string3 = "multiad_pref";
        boolean bl3 = false;
        if (object3 != null) {
            object = this.b0();
            object = j_0.d((Context)object3, string3, 0, string2, (String)object);
        } else {
            n3 = 0;
            object = null;
        }
        String string4 = "null cannot be cast to non-null type kotlin.String";
        Intrinsics.checkNotNull(object, string4);
        object = (String)object;
        Object object5 = new StringBuilder();
        Object object6 = object2.P();
        ((StringBuilder)object5).append((String)object6);
        ((StringBuilder)object5).append(": tms hybridAdReqExpiryTime: ");
        ((StringBuilder)object5).append((String)object);
        ((StringBuilder)object5).append("  :: getTMSPrefKey(): ");
        object6 = this.b0();
        ((StringBuilder)object5).append((String)object6);
        object5 = ((StringBuilder)object5).toString();
        com.jio.jioads.util.j.a((String)object5);
        boolean bl4 = TextUtils.isEmpty((CharSequence)object);
        long l14 = 0L;
        if (!bl4) {
            object5 = new JSONObject((String)object);
            object = new StringBuilder();
            String string5 = object2.P();
            ((StringBuilder)object).append(string5);
            ((StringBuilder)object).append(": tms expiryTimeObject: ");
            ((StringBuilder)object).append(object5);
            com.jio.jioads.util.j.a(((StringBuilder)object).toString());
            object = object5.get("tms");
            string5 = "null cannot be cast to non-null type kotlin.Long";
            Intrinsics.checkNotNull(object, string5);
            l12 = (Long)object;
            object = object5.get("totalAds");
            String string6 = "null cannot be cast to non-null type kotlin.Int";
            Intrinsics.checkNotNull(object, string6);
            object = (Integer)object;
            n3 = (Integer)object;
            String string7 = "expiredAds";
            object5 = object5.get(string7);
            Intrinsics.checkNotNull(object5, string6);
            object5 = (Integer)object5;
            int n7 = (Integer)object5;
        } else {
            l12 = l14;
            n3 = 0;
            object = null;
            boolean bl5 = false;
            object5 = null;
        }
        int n8 = 80;
        if (n3 > 0 && (l8 = var15_30 * 100 / n3) >= n8 || (l8 = l12 == l14 ? 0 : (l12 < l14 ? -1 : 1)) != false && (l7 = (l4 = (l14 = System.currentTimeMillis()) - l12) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            boolean bl6 = this.g0();
            if (!bl6) return null;
            object3 = new StringBuilder();
            String string8 = object2.P();
            ((StringBuilder)object3).append(string8);
            String string9 = ": All ads are expired for hybrid multi ad";
            ((StringBuilder)object3).append(string9);
            object3 = ((StringBuilder)object3).toString();
            com.jio.jioads.util.j.a((String)object3);
            this.H();
            if (n3 <= 0) return null;
            object3 = ": retry with small ad request: percentage reached: +";
            object2 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object2, (String)object3);
            void var15_31 = var15_30 * 100 / n3;
            ((StringBuilder)object2).append((int)var15_31);
            object2 = ((StringBuilder)object2).toString();
            com.jio.jioads.util.j.a((String)object2);
            return null;
        }
        l14 = System.currentTimeMillis();
        if (l8 != false && (l7 = l12 == l14 ? 0 : (l12 < l14 ? -1 : 1)) > 0) {
            JSONObject jSONObject;
            object6 = com.jio.jioads.multiad.N.a;
            object6 = object2.P();
            String string10 = this.Y();
            Intrinsics.checkNotNullParameter(object3, "context");
            Intrinsics.checkNotNullParameter(object6, "adspotId");
            object4 = "key";
            Intrinsics.checkNotNullParameter(string10, (String)object4);
            object3 = j_0.d((Context)object3, string3, 0, string2, string10);
            Intrinsics.checkNotNull(object3, string4);
            object3 = (String)object3;
            bl2 = TextUtils.isEmpty((CharSequence)object3);
            if (!bl2 && (n4 = (int)((jSONObject = new JSONObject((String)object3)).has((String)(object3 = "asi")) ? 1 : 0)) != 0 && (object3 = jSONObject.optJSONObject((String)object3)) != null) {
                bl3 = object3.has((String)object6);
            }
            if (bl3) {
                void var15_32;
                object3 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object2, ": multiAd response model not available, fetching from SP & parsing for ");
                String string11 = this.Y();
                ((StringBuilder)object3).append(string11);
                object3 = ((StringBuilder)object3).toString();
                com.jio.jioads.util.j.a((String)object3);
                if (n3 > 0 && (var15_32 = var15_30 * 100 / n3) >= n8) {
                    object3 = new StringBuilder();
                    String string12 = object2.P();
                    ((StringBuilder)object3).append(string12);
                    String string13 = ": retry with small ad request failed because of percentage";
                    ((StringBuilder)object3).append(string13);
                    com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
                    object3 = new StringBuilder();
                    object2 = object2.P();
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append(": percentage reached: +");
                    ((StringBuilder)object3).append((int)var15_32);
                    object2 = ((StringBuilder)object3).toString();
                    com.jio.jioads.util.j.a((String)object2);
                    return null;
                }
                object3 = new StringBuilder();
                String string14 = ": Parsing from Locally stored ";
                com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)object2, (StringBuilder)object3, string14);
                object2 = o3.s;
                if (object2 == null) return null;
                object2 = ((com.jio.jioads.common.a)object2).b;
                if (object2 == null) return null;
                object2 = ((com.jio.jioads.multiad.model.e)object2).b;
                if (object2 == null) return null;
                return ((com.jio.jioads.multiad.model.c)object2).r;
            }
        }
        if (l8 != false && (n4 = (l3 = (l2 = System.currentTimeMillis()) - l12) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            object3 = new StringBuilder();
            object2 = object2.K();
            ((StringBuilder)object3).append(object2);
            ((StringBuilder)object3).append(": All ads are expired for hybrid multi ad: Tms Time reached");
            object2 = ((StringBuilder)object3).toString();
            com.jio.jioads.util.j.a((String)object2);
            this.H();
            return null;
        }
        object3 = new StringBuilder();
        String string15 = object2.P();
        ((StringBuilder)object3).append(string15);
        ((StringBuilder)object3).append(" : Multi ad response not present for the language of article");
        com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
        object3 = new StringBuilder();
        String string16 = " :adding apz value: ";
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object3, string16);
        object2 = o3.s;
        object2 = object2 != null && (object2 = ((com.jio.jioads.common.a)object2).b) != null && (object2 = ((com.jio.jioads.multiad.model.e)object2).b) != null ? ((com.jio.jioads.multiad.model.c)object2).r : null;
        ((StringBuilder)object3).append(object2);
        com.jio.jioads.util.j.a(((StringBuilder)object3).toString());
        object2 = o3.s;
        if (object2 == null) return null;
        object2 = ((com.jio.jioads.common.a)object2).b;
        if (object2 == null) return null;
        object2 = ((com.jio.jioads.multiad.model.e)object2).b;
        if (object2 == null) return null;
        return ((com.jio.jioads.multiad.model.c)object2).r;
    }

    public final com.jio.jioads.common.a S() {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5 = new HashMap();
        Object object6 = this.s;
        if (object6 != null && (object6 = ((com.jio.jioads.common.a)object6).b) != null && (object6 = ((com.jio.jioads.multiad.model.e)object6).a) != null) {
            ((HashMap)object5).putAll(object6);
        }
        List list = this.s;
        com.jio.jioads.multiad.model.d d2 = null;
        object4 = list != null && (object4 = ((com.jio.jioads.common.a)((Object)list)).b) != null ? ((com.jio.jioads.multiad.model.e)object4).b : null;
        object3 = list != null && (object3 = ((com.jio.jioads.common.a)((Object)list)).b) != null ? ((com.jio.jioads.multiad.model.e)object3).c : null;
        list = list != null && (list = ((com.jio.jioads.common.a)((Object)list)).b) != null ? ((com.jio.jioads.multiad.model.e)((Object)list)).d : null;
        object6 = new com.jio.jioads.multiad.model.e((HashMap)object5, (com.jio.jioads.multiad.model.c)object4, (String)object3, list);
        object5 = new HashMap();
        list = this.s;
        if (list != null && (list = ((com.jio.jioads.common.a)((Object)list)).c) != null && (list = ((com.jio.jioads.multiad.model.e)((Object)list)).a) != null) {
            ((HashMap)object5).putAll(list);
        }
        object3 = (object4 = this.s) != null && (object3 = ((com.jio.jioads.common.a)object4).c) != null ? ((com.jio.jioads.multiad.model.e)object3).b : null;
        object2 = object4 != null && (object2 = ((com.jio.jioads.common.a)object4).c) != null ? ((com.jio.jioads.multiad.model.e)object2).c : null;
        object = object4 != null && (object = ((com.jio.jioads.common.a)object4).c) != null ? ((com.jio.jioads.multiad.model.e)object).d : null;
        list = new com.jio.jioads.multiad.model.e((HashMap)object5, (com.jio.jioads.multiad.model.c)object3, (String)object2, (List)object);
        if (object4 != null) {
            d2 = ((com.jio.jioads.common.a)object4).a;
        }
        object5 = new com.jio.jioads.common.a(d2, (com.jio.jioads.multiad.model.e)object6, (com.jio.jioads.multiad.model.e)((Object)list));
        return object5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final com.jio.jioads.cdnlogging.a T() {
        Exception exception3;
        com.jio.jioads.cdnlogging.a a2;
        com.jio.jioads.common.b b2;
        Object object;
        Object object2;
        block13: {
            String string2;
            Object object3;
            block12: {
                Exception exception22;
                block14: {
                    int n3;
                    JSONObject jSONObject;
                    boolean bl2;
                    int n4;
                    object3 = "";
                    object2 = "2";
                    object = "1";
                    Object object4 = "csl";
                    b2 = this.a;
                    Object object5 = this.s;
                    if (object5 != null && (object5 = ((com.jio.jioads.common.a)object5).a) != null) {
                        object5 = ((com.jio.jioads.multiad.model.d)object5).a;
                    } else {
                        n4 = 0;
                        object5 = null;
                    }
                    a2 = new com.jio.jioads.cdnlogging.a();
                    try {
                        bl2 = TextUtils.isEmpty((CharSequence)object5);
                        if (bl2) return a2;
                        Intrinsics.checkNotNull(object5);
                        jSONObject = new JSONObject((String)object5);
                        n4 = jSONObject.has((String)object4);
                        string2 = "message";
                        if (n4 == 0) break block12;
                    }
                    catch (Exception exception3) {
                        break block13;
                    }
                    try {
                        object4 = jSONObject.optString((String)object4);
                        n3 = Intrinsics.areEqual(object4, object);
                        if (n3 == 0) return a2;
                        object4 = "sev";
                        object4 = jSONObject.optString((String)object4);
                        n4 = TextUtils.isEmpty((CharSequence)object4);
                        bl2 = true;
                        if (n4 != 0) {
                            a2.d = bl2;
                            return a2;
                        }
                    }
                    catch (Exception exception22) {
                        break block14;
                    }
                    Intrinsics.checkNotNull(object4);
                    object5 = "[";
                    object4 = kotlin.text.b.n((String)object4, (String)object5, (String)object3, false);
                    object5 = "]";
                    object3 = kotlin.text.b.n((String)object4, (String)object5, (String)object3, false);
                    object4 = ",";
                    object4 = new String[]{object4};
                    n4 = 6;
                    object3 = StringsKt.a0((CharSequence)object3, object4, false, 0, n4);
                    object4 = new String[]{};
                    object3 = object3.toArray((T[])object4);
                    object3 = (String[])object3;
                    n3 = ((Object)object3).length;
                    object3 = Arrays.copyOf(object3, n3);
                    object3 = xx_2.i((Object[])object3);
                    boolean bl3 = object3.contains(object);
                    if (!bl3) {
                        bl3 = object3.contains(object2);
                        object4 = "4";
                        object5 = "3";
                        if (!(bl3 && (bl3 = object3.contains(object5)) && (bl3 = object3.contains(object4)))) {
                            boolean bl4;
                            boolean bl5 = object3.contains(object2);
                            if (bl5) {
                                a2.c = bl2;
                            }
                            if (bl5 = object3.contains(object5)) {
                                a2.b = bl2;
                            }
                            if (!(bl4 = object3.contains(object4))) return a2;
                            a2.a = bl2;
                            return a2;
                        }
                    }
                    a2.d = bl2;
                    return a2;
                }
                object2 = new StringBuilder();
                object = b2.P();
                ((StringBuilder)object2).append((String)object);
                object = ": Error found in getErrorFlags() function: ";
                ((StringBuilder)object2).append((String)object);
                object = Utility.INSTANCE;
                Object object6 = ((Utility)object).printStacktrace(exception22);
                ((StringBuilder)object2).append((String)object6);
                object6 = ((StringBuilder)object2).toString();
                Intrinsics.checkNotNullParameter(object6, string2);
                object6 = JioAds.Companion;
                object6 = ((JioAds$Companion)object6).getInstance();
                ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object6 = JioAds$LogLevel.NONE;
                return a2;
            }
            object3 = new StringBuilder();
            object2 = b2.P();
            ((StringBuilder)object3).append((String)object2);
            object2 = ": CSL flag is not available";
            ((StringBuilder)object3).append((String)object2);
            object3 = ((StringBuilder)object3).toString();
            Intrinsics.checkNotNullParameter(object3, string2);
            object3 = JioAds.Companion;
            object3 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object3 = JioAds$LogLevel.NONE;
            return a2;
        }
        com.jio.jioads.audioplayer.b.a(b2, ": Exception in setting CSL");
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = Utility.INSTANCE;
        String string3 = ((Utility)object).printStacktrace(exception3);
        com.jio.jioads.jioreel.tracker.model.b.g(string3, (JioAds$Companion)object2);
        return a2;
    }

    public final String U() {
        boolean bl2;
        Object object = this.a;
        Object object2 = object.k0();
        JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
        Object object3 = null;
        if (object2 == jioAdView$AdState) {
            return null;
        }
        object2 = object.Y();
        object = object.q0();
        if (object2 != null) {
            jioAdView$AdState = object2.getPackageManager();
        } else {
            bl2 = false;
            jioAdView$AdState = null;
        }
        if (jioAdView$AdState != null) {
            bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2) {
                object = object2.getPackageManager();
                if (object != null) {
                    object2 = object2.getPackageName();
                    bl2 = false;
                    jioAdView$AdState = null;
                    object = object.getPackageInfo((String)object2, 0);
                } else {
                    object = null;
                }
                if (object != null) {
                    object3 = ((PackageInfo)object).packageName;
                }
            } else {
                object3 = object;
            }
        }
        return object3;
    }

    public final String V() {
        boolean bl2;
        Object object = this.a;
        Object object2 = object.k0();
        Object object3 = JioAdView$AdState.DESTROYED;
        Object object4 = "";
        if (object2 == object3) {
            return object4;
        }
        object2 = object.Y();
        object3 = object.R();
        object2 = object3 != null ? ((JioAdsMetadata)object3).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)object2) : null;
        if (object2 != null && (bl2 = ((HashMap)object2).containsKey(object3 = "lang"))) {
            com.jio.jioads.audioplayer.b.a(object, ": lang in custom metadata");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = ((HashMap)object2).get(object3);
            object4 = object;
            object4 = (String)object;
        } else if (object2 != null && (bl2 = ((HashMap)object2).containsKey(object3 = "loa"))) {
            com.jio.jioads.audioplayer.b.a(object, ": loa in custom metadata");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = ((HashMap)object2).get(object3);
            object4 = object;
            object4 = (String)object;
        } else if (object2 != null && (bl2 = ((HashMap)object2).containsKey(object3 = "md_lang"))) {
            com.jio.jioads.audioplayer.b.a(object, ": lang in custom metadata with md params");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = ((HashMap)object2).get(object3);
            object4 = object;
            object4 = (String)object;
        } else if (object2 != null && (bl2 = ((HashMap)object2).containsKey(object3 = "md_loa"))) {
            com.jio.jioads.audioplayer.b.a(object, ": loa in custom metadata with md params");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = ((HashMap)object2).get(object3);
            object4 = object;
            object4 = (String)object;
        }
        return object4;
    }

    public final String W() {
        JioAdView$AdState jioAdView$AdState;
        Object object = this.a;
        Context context = object.Y();
        String string2 = "";
        if (context != null && (object = object.k0()) != (jioAdView$AdState = JioAdView$AdState.DESTROYED)) {
            object = j_0.d(context, "common_prefs", 0, string2, "localStore");
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.String");
            return (String)object;
        }
        return string2;
    }

    public final Pair X() {
        int n3;
        int n4 = this.o;
        Object object = null;
        if (n4 != 0) {
            Object object2 = this.s;
            if (object2 != null && (object2 = ((com.jio.jioads.common.a)object2).c) != null && (object2 = ((com.jio.jioads.multiad.model.e)object2).b) != null) {
                object = ((com.jio.jioads.multiad.model.c)object2).a;
            }
            n4 = TextUtils.isEmpty(object);
            boolean bl2 = false;
            Boolean bl3 = null;
            if (n4 == 0) {
                if (object != null) {
                    n4 = ((String)object).length();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                if (n4 > 0) {
                    bl2 = true;
                }
            }
            if ((n4 = TextUtils.isEmpty((CharSequence)object)) == 0) {
                bl3 = bl2;
                JSONArray jSONArray = new JSONArray((String)object);
                object2 = new Pair(bl3, jSONArray);
            } else {
                object = bl2;
                bl3 = new JSONArray();
                object2 = new Pair(object, bl3);
            }
            return object2;
        }
        Object object3 = this.d;
        if (object3 != null && (n3 = object3.length()) > 0) {
            Boolean bl4 = Boolean.TRUE;
            object = new Pair(bl4, object3);
            return object;
        }
        Boolean bl5 = Boolean.FALSE;
        object3 = new Pair(bl5, null);
        return object3;
    }

    public final String Y() {
        com.jio.jioads.common.a a2 = this.s;
        if (a2 != null) {
            return this.a.P();
        }
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int Z() {
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        Object object;
        int n3;
        block10: {
            Integer n4;
            com.jio.jioads.multiad.model.c c2;
            com.jio.jioads.multiad.model.e e2;
            com.jio.jioads.common.a a2;
            int n7;
            boolean bl2;
            block11: {
                Integer n8;
                com.jio.jioads.multiad.model.c c3;
                com.jio.jioads.multiad.model.e e5;
                JioAdView$AdPodVariant jioAdView$AdPodVariant;
                bl2 = this.o;
                n3 = 0;
                if (!bl2) return n3;
                object = this.a;
                JioAdView$AD_TYPE jioAdView$AD_TYPE2 = object.K();
                if (jioAdView$AD_TYPE2 != (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO)) break block10;
                Integer n10 = object.q();
                n7 = n10 != null ? n10 : -1;
                int n14 = 1;
                if (n7 > 0) break block11;
                JioAdView$AdPodVariant jioAdView$AdPodVariant2 = object.L();
                if (jioAdView$AdPodVariant2 != (jioAdView$AdPodVariant = JioAdView$AdPodVariant.NONE)) break block10;
                com.jio.jioads.common.a a3 = this.s;
                if (a3 != null && (e5 = a3.c) != null && (c3 = e5.b) != null && (n8 = c3.k) != null && (n7 = n8.intValue()) == n14) {
                    n7 = 1;
                } else {
                    n7 = 0;
                    Object var4_12 = null;
                }
                if (n7 == 0) break block10;
            }
            if ((a2 = this.s) != null && (e2 = a2.c) != null && (c2 = e2.b) != null && (n4 = c2.l) != null) {
                n7 = n4;
            } else {
                n7 = 0;
                Object var4_20 = null;
            }
            if (n7 > 0) {
                object = this.s;
                if (object != null && (object = ((com.jio.jioads.common.a)object).c) != null && (object = ((com.jio.jioads.multiad.model.e)object).b) != null) {
                    object = ((com.jio.jioads.multiad.model.c)object).l;
                } else {
                    bl2 = false;
                    object = null;
                }
                Intrinsics.checkNotNull(object);
                return (Integer)object;
            }
            Integer n15 = object.q();
            if (n15 == null) return 1;
            n7 = n15;
            if (n7 <= 0) return 1;
            if ((object = object.q()) == null) return n3;
            return (Integer)object;
        }
        if ((object = object.K()) != jioAdView$AD_TYPE) return n3;
        return -100;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        int n3;
        boolean bl2;
        String string2;
        Object object;
        block9: {
            block8: {
                Exception exception2;
                String string3;
                block7: {
                    String string4;
                    block5: {
                        block6: {
                            object = this.t;
                            string2 = "message";
                            bl2 = true;
                            if (object == null) return false;
                            string3 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                            Object object2 = "<this>";
                            Intrinsics.checkNotNullParameter(object, (String)object2);
                            try {
                                object2 = Constants$HeaderKeys.JIO_DATA;
                                String string5 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                                Locale locale = Locale.ROOT;
                                string5 = string5.toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(string5, string3);
                                boolean bl3 = object.containsKey(string5);
                                string4 = "nwhit";
                                if (!bl3) break block5;
                                object2 = ((Constants$HeaderKeys)((Object)object2)).getKey();
                                object2 = ((String)object2).toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(object2, string3);
                                object = object.get(object2);
                                object = (String)object;
                                if (object != null) break block6;
                                object = "{}";
                            }
                            catch (Exception exception2) {
                                break block7;
                            }
                        }
                        if ((n3 = (int)((string3 = new JSONObject((String)object)).has(string4) ? 1 : 0)) == 0) break block8;
                        object = string3.getString(string4);
                        Intrinsics.checkNotNull(object);
                        int n4 = ((String)object).length();
                        if (n4 <= 0) break block8;
                        n3 = Integer.parseInt((String)object);
                        break block9;
                    }
                    int n7 = object.containsKey(string4);
                    if (n7 == 0) break block8;
                    object = object.get(string4);
                    if ((object = (String)object) == null) {
                        object = "";
                    }
                    if ((n7 = ((String)object).length()) <= 0) break block8;
                    n3 = Integer.parseInt((String)object);
                    break block9;
                }
                string3 = "Exception while getting NETWORK_TYPE value: ";
                LO1.b(string3, exception2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
            n3 = 0;
            object = null;
        }
        if (n3 != bl2) return false;
        n3 = 1;
        if (n3 == 0) return false;
        object = "com.android.volley.toolbox.Volley";
        try {
            Class.forName((String)object);
            object = "Volley library is available";
            Intrinsics.checkNotNullParameter(object, string2);
            object = JioAds.Companion;
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            n3 = 1;
        }
        catch (ClassNotFoundException classNotFoundException) {
            Intrinsics.checkNotNullParameter("Using Default network library for network call", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return false;
        }
        if (n3 == 0) return false;
        return bl2;
    }

    public final long a0() {
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        Object object = this.a;
        int n3 = object.f0();
        Number number = null;
        long l2 = -1;
        if (n3 != 0) {
            if ((object = object.n()) != null) {
                long l3 = ((JioAdView)object).getUpdatedCustomDuration$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                Long l4 = l3;
                long l7 = 0L;
                long l8 = l3 - l7;
                Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object2 > 0) {
                    number = l4;
                }
                if (number != null) {
                    l2 = number;
                }
            }
            return l2;
        }
        n3 = this.o;
        if (n3 == 0) {
            return l2;
        }
        Object object3 = object.K();
        if (object3 == (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
            int n4;
            object3 = object.b0();
            int n7 = -1;
            n3 = object3 != null ? (Integer)object3 : -1;
            String string2 = "message";
            int n8 = 2;
            if (n3 > n8) {
                object3 = object.b0();
                Intrinsics.checkNotNull(object3);
                long l12 = ((Integer)object3).intValue();
                StringBuilder stringBuilder = new StringBuilder();
                object = object.P();
                stringBuilder.append((String)object);
                stringBuilder.append(": publisher req duration: ");
                stringBuilder.append(l12);
                Intrinsics.checkNotNullParameter(stringBuilder.toString(), string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                return l12;
            }
            object3 = this.s;
            if (object3 != null && (object3 = ((com.jio.jioads.common.a)object3).c) != null && (object3 = ((com.jio.jioads.multiad.model.e)object3).b) != null && (object3 = ((com.jio.jioads.multiad.model.c)object3).k) != null && (n3 = ((Integer)object3).intValue()) == (n4 = 1) && (n3 = (object3 = this.s) != null && (object3 = ((com.jio.jioads.common.a)object3).c) != null && (object3 = ((com.jio.jioads.multiad.model.e)object3).b) != null && (object3 = ((com.jio.jioads.multiad.model.c)object3).n) != null ? (Integer)object3 : -1) > n8) {
                object3 = object.q();
                if (object3 != null) {
                    n7 = (Integer)object3;
                }
                if (n7 <= 0) {
                    object3 = this.s;
                    if (object3 != null && (object3 = ((com.jio.jioads.common.a)object3).c) != null && (object3 = ((com.jio.jioads.multiad.model.e)object3).b) != null) {
                        number = ((com.jio.jioads.multiad.model.c)object3).n;
                    }
                    Intrinsics.checkNotNull(number);
                    long l14 = ((Integer)number).intValue();
                    StringBuilder stringBuilder = new StringBuilder();
                    object = object.P();
                    stringBuilder.append((String)object);
                    stringBuilder.append(": server - pmxd: ");
                    stringBuilder.append(l14);
                    Intrinsics.checkNotNullParameter(stringBuilder.toString(), string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    return l14;
                }
            }
        }
        return l2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        Object object;
        Object object2 = this.t;
        String string2 = "application/xml";
        boolean bl2 = false;
        String string3 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            object = Constants$ResponseHeaderKeys.Content_Type;
            String string4 = ((Constants$ResponseHeaderKeys)((Object)object)).getResponseHeader();
            Locale locale = Locale.ROOT;
            string4 = string4.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(string4, string3);
            boolean bl3 = object2.containsKey(string4);
            if (bl3) {
                object2 = this.t;
                Intrinsics.checkNotNull(object2);
                string4 = ((Constants$ResponseHeaderKeys)((Object)object)).getResponseHeader().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(string4, string3);
                object2 = (CharSequence)object2.get(string4);
                bl3 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl3) {
                    object2 = this.t;
                    Intrinsics.checkNotNull(object2);
                    object = ((Constants$ResponseHeaderKeys)((Object)object)).getResponseHeader().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    object2 = object2.get(object);
                    Intrinsics.checkNotNull(object2);
                    object2 = (CharSequence)object2;
                    return StringsKt.F((CharSequence)object2, string2, false);
                }
            }
        }
        object2 = Constants$ResponseHeaderKeys.Content_Type.getResponseHeader();
        object = Locale.ROOT;
        object2 = ((String)object2).toLowerCase((Locale)object);
        Intrinsics.checkNotNullExpressionValue(object2, string3);
        object2 = this.E((String)object2);
        if (object2 == null) return bl2;
        return StringsKt.F((CharSequence)object2, string2, false);
    }

    public final String b0() {
        int n3;
        CharSequence charSequence = this.V();
        String string2 = "_tms";
        Object object = this.a;
        if (charSequence != null && (n3 = ((String)charSequence).length()) != 0) {
            charSequence = new StringBuilder();
            object = object.P();
            ((StringBuilder)charSequence).append((String)object);
            char c2 = '_';
            ((StringBuilder)charSequence).append(c2);
            object = this.V();
            if (object != null) {
                Object object2 = Locale.ROOT;
                object = ((String)object).toLowerCase((Locale)object2);
                object2 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            } else {
                c2 = '\u0000';
                object = null;
            }
            charSequence = h30_0.a((StringBuilder)charSequence, (String)object, string2);
        } else {
            charSequence = new StringBuilder();
            object = object.P();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }

    public final void c() {
        Object object = " ";
        Object object2 = new StringBuilder((String)object);
        com.jio.jioads.common.b b2 = this.a;
        Object object3 = b2.P();
        ((StringBuilder)object2).append((String)object3);
        object3 = ": onShowAdView: called JioAdViewController";
        ((StringBuilder)object2).append((String)object3);
        com.jio.jioads.util.j.a(((StringBuilder)object2).toString());
        object2 = new StringBuilder((String)object);
        j_0.n(b2, (StringBuilder)object2, ": value an isResponseValid is: ");
        boolean bl2 = this.j0();
        ((StringBuilder)object2).append(bl2);
        object = " and isPgmAdRendering is : ";
        ((StringBuilder)object2).append((String)object);
        bl2 = this.D;
        ((StringBuilder)object2).append(bl2);
        object2 = ((StringBuilder)object2).toString();
        com.jio.jioads.util.j.a((String)object2);
        boolean bl3 = this.D;
        if (bl3 && !(bl3 = this.j0())) {
            object2 = new StringBuilder();
            object = b2.P();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(": PGM Ad expired");
            com.jio.jioads.util.j.b(((StringBuilder)object2).toString());
            object2 = JioAdError.Companion;
            object = JioAdError$JioAdErrorType.ERROR_NOFILL;
            JioAdError jioAdError = j_0.c((t_0)object2, (JioAdError$JioAdErrorType)((Object)object), "Prepared PGM ad is expired");
            com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
            object3 = object2 = this.b;
            ((V)object2).d(jioAdError, false, d2, "loadad", "JioAdViewController", "Prepared PGM ad is expired", null);
            return;
        }
        bl3 = this.A;
        if (bl3 && (object2 = this.q) != null) {
            object2.removeAllViews();
        }
        if ((object2 = this.q) != null) {
            object = new h(this);
            object3 = "viewListener";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            ((com.jio.jioads.common.j)((Object)object2)).f = object;
        }
        if (bl3 = b2.c()) {
            this.C = bl3 = true;
            bl2 = false;
            this.A = false;
            object = com.jio.jioads.controller.m.a(b2, ": pgm ad rendering isPlaceHolderPGMPrepared: ");
            object3 = b2.n();
            if (object3 != null) {
                boolean c2 = ((JioAdView)object3).isPlaceHolderPGMPrepared$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = c2;
            } else {
                boolean bl4 = false;
                object3 = null;
            }
            ((StringBuilder)object).append(object3);
            char c2 = ' ';
            ((StringBuilder)object).append(c2);
            com.jio.jioads.util.j.a(((StringBuilder)object).toString());
            object = b2.n();
            if (object != null && (bl2 = ((JioAdView)object).isPlaceHolderPGMPrepared$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == bl3) {
                object2 = new StringBuilder();
                object = b2.P();
                ((StringBuilder)object2).append((String)object);
                object = ": pgm loadpgmAd invoked ";
                ((StringBuilder)object2).append((String)object);
                object2 = ((StringBuilder)object2).toString();
                com.jio.jioads.util.j.a((String)object2);
                this.d();
            } else {
                object2 = new StringBuilder();
                object = b2.P();
                ((StringBuilder)object2).append((String)object);
                object = ": pgm calling showAds";
                ((StringBuilder)object2).append((String)object);
                object2 = ((StringBuilder)object2).toString();
                com.jio.jioads.util.j.a((String)object2);
                this.j();
            }
        } else {
            this.j();
        }
    }

    public final void c0() {
        boolean bl2;
        this.E = bl2 = true;
        this.D = false;
        this.I = bl2;
        Object object = new StringBuilder();
        Object object2 = this.a;
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object, ": pgm isPgmNoFill: ");
        boolean bl3 = this.E;
        ((StringBuilder)object).append(bl3);
        object = ((StringBuilder)object).toString();
        Object object3 = "message";
        Intrinsics.checkNotNullParameter(object, object3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        object4 = object2.K();
        JioAdView$AD_TYPE jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO;
        if (object4 == jioAdView$AD_TYPE) {
            object3 = object2.L();
            if (object3 == (object4 = JioAdView$AdPodVariant.INFINITE_AD_DURATION_WITH_LOOP)) {
                object3 = new StringBuilder();
                object4 = ": pgm no fill prepare next video";
                j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object4);
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = this.r;
                if (object != null) {
                    ((com.jio.jioads.common.d)object).prepareNextVideoAd();
                }
            } else {
                bl3 = this.i0();
                if (bl3) {
                    object3 = new StringBuilder();
                    object4 = ": pgm no fill only pgm configured & continue with promo or backup";
                    j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object4);
                    ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = this.r;
                    if (object != null) {
                        ((com.jio.jioads.common.d)object).continueWithPromoBackSelection();
                    }
                } else {
                    object3 = new StringBuilder();
                    object4 = ": pgm no fill load promo ad from the list";
                    j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object3, (String)object4);
                    ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = this.r;
                    if (object != null) {
                        ((com.jio.jioads.common.d)object).onHandleNoFillPgm();
                    }
                }
            }
        } else {
            object2 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object2, ": pgm no fill so it will use local promo or backup : ");
            object4 = this.F;
            ((StringBuilder)object2).append((String)object4);
            object2 = ((StringBuilder)object2).toString();
            Intrinsics.checkNotNullParameter(object2, object3);
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            this.f();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d() {
        Object object;
        boolean bl2;
        long l2;
        Object object2;
        Object object3;
        int n3;
        String string2;
        boolean bl3;
        o o3 = this;
        Object object4 = new StringBuilder();
        Object object5 = this.a;
        j_0.i((com.jio.jioads.common.b)object5, (StringBuilder)object4, ": Inside loadPgm function");
        object4 = JioAds.Companion;
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object6 = JioAds$LogLevel.NONE;
        this.D = bl3 = true;
        Object object7 = object5.n();
        char c2 = '\u0000';
        Object object8 = null;
        if (object7 != null) {
            ((JioAdView)object7).setPlaceHolderPGMPrepared$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(false);
        }
        object7 = o3.s;
        boolean bl4 = false;
        Object object9 = null;
        if (object7 != null && (object7 = ((com.jio.jioads.common.a)object7).c) != null && (object7 = ((com.jio.jioads.multiad.model.e)object7).a) != null && (object7 = (HashMap)((HashMap)object7).get(string2 = "pgm")) != null) {
            object7 = (com.jio.jioads.multiad.model.f)((HashMap)object7).get(string2);
        } else {
            n3 = 0;
            object7 = null;
        }
        if (object7 == null) return;
        JioAdView$AdState jioAdView$AdState = object5.k0();
        if (jioAdView$AdState == (object3 = JioAdView$AdState.DESTROYED)) {
            return;
        }
        Context context = object5.Y();
        if (context == null) {
            return;
        }
        long l3 = o3.P;
        String string3 = "message";
        long l4 = -1;
        long l7 = l3 - l4;
        Object object10 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object10 != false) {
            object3 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object5, ": PGM Ad selected expiry set to: ");
            long l8 = o3.P;
            object2 = new Date(l8);
            ((StringBuilder)object3).append(object2);
            Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string3);
            object3 = ((JioAds$Companion)object4).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            l3 = System.currentTimeMillis();
            l8 = o3.P;
            l2 = l3 == l8 ? 0 : (l3 < l8 ? -1 : 1);
            if (l2 > 0) {
                object6 = new StringBuilder();
                object7 = ": pgm is expired";
                j_0.i((com.jio.jioads.common.b)object5, (StringBuilder)object6, (String)object7);
                object4 = ((JioAds$Companion)object4).getInstance();
                ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                this.c0();
                o3.P = l4;
                return;
            }
            object3 = new StringBuilder();
            object2 = ": pgm is not expired";
            j_0.i((com.jio.jioads.common.b)object5, (StringBuilder)object3, (String)object2);
            object3 = ((JioAds$Companion)object4).getInstance();
            ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            o3.C = bl3;
            o3.A = false;
        }
        object3 = new StringBuilder();
        object2 = ": Inside proceedWithProgrammaticAd";
        j_0.i((com.jio.jioads.common.b)object5, (StringBuilder)object3, (String)object2);
        object3 = ((JioAds$Companion)object4).getInstance();
        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        boolean bl5 = ((com.jio.jioads.multiad.model.f)object7).k;
        int n4 = bl5 != bl3 && bl5 == (bl2 = 2 != 0) ? 1 : 0;
        object3 = object5.b();
        if (object3 != null) {
            object2 = new StringBuilder();
            JioAdView$AdState jioAdView$AdState2 = object3[0];
            ((StringBuilder)object2).append((int)jioAdView$AdState2);
            char c3 = 'x';
            ((StringBuilder)object2).append(c3);
            JioAdView$AdState jioAdView$AdState3 = object3[bl3];
            ((StringBuilder)object2).append((int)jioAdView$AdState3);
            object = object3 = ((StringBuilder)object2).toString();
        } else {
            object = null;
        }
        object3 = new JioAdRequestGenerator(context);
        bl2 = o3.o;
        String string4 = o3.n;
        Object object11 = object5.P();
        Object object12 = object5.R();
        if (object12 != null) {
            object9 = ((JioAdsMetadata)object12).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(context);
        }
        HashMap hashMap = object9;
        JioAdView$ORIENTATION_TYPE jioAdView$ORIENTATION_TYPE = object5.H();
        String string5 = this.U();
        JioAdView$AD_TYPE jioAdView$AD_TYPE = object5.K();
        List list = object5.a();
        Integer n7 = object5.q();
        Integer n8 = object5.J();
        Integer n10 = object5.b0();
        Integer n14 = this.R();
        String string6 = this.N();
        String string7 = this.W();
        boolean bl6 = object5.v();
        object9 = o3.x;
        String string8 = object5.m0();
        String string9 = object5.G();
        boolean bl7 = true;
        Object object13 = string4;
        object9 = (Object[])((JioAdRequestGenerator)object3).getAdRequestData((boolean)bl2, null, (String)string4, (String)object11, (HashMap)hashMap, (JioAdView$ORIENTATION_TYPE)jioAdView$ORIENTATION_TYPE, (String)string5, (JioAdView$AD_TYPE)jioAdView$AD_TYPE, (List)list, (Integer)n7, (Integer)n8, (Integer)n10, (String)object, (Integer)n14, (String)string6, (String)string7, (boolean)bl6, (JioAdsLoader)object9, (boolean)bl7, (String)string8, (String)string9).b;
        object3 = Utility.INSTANCE;
        object9 = String.valueOf(object9[0]);
        object9 = fh1_2.q(((Utility)object3).parseQueryString((String)object9));
        object9 = ((Utility)object3).encodeAdRequestParameters((Map)object9, "UTF-8");
        object2 = ((com.jio.jioads.multiad.model.f)object7).j;
        boolean bl8 = TextUtils.isEmpty((CharSequence)object2);
        char c5 = '?';
        if (!bl8) {
            Intrinsics.checkNotNull(object2);
            string4 = "lod";
            c2 = StringsKt.F((CharSequence)object2, string4, false);
            if (c2 != '\u0000') {
                object8 = "";
                object2 = ((Utility)object3).replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2, string4, (String)object8, bl3);
            }
            if (bl3 = TextUtils.isEmpty((CharSequence)object9)) {
                object6 = new StringBuilder();
                ((StringBuilder)object6).append((String)object9);
                ((StringBuilder)object6).append(c5);
                ((StringBuilder)object6).append((String)object2);
                object6 = ((StringBuilder)object6).toString();
            } else {
                object6 = new StringBuilder();
                ((StringBuilder)object6).append((String)object9);
                c2 = '&';
                ((StringBuilder)object6).append(c2);
                ((StringBuilder)object6).append((String)object2);
                object6 = ((StringBuilder)object6).toString();
            }
        } else {
            object6 = object9;
        }
        object8 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object5, ": pgm request url: ");
        object9 = ((com.jio.jioads.multiad.model.f)object7).g;
        ((StringBuilder)object8).append((String)object9);
        ((StringBuilder)object8).append(c5);
        ((StringBuilder)object8).append((String)object6);
        Intrinsics.checkNotNullParameter(((StringBuilder)object8).toString(), string3);
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = new JioAdRequestGenerator(context);
        string4 = object5.P();
        object12 = this.W();
        String string10 = this.U();
        l2 = 1;
        object8 = ((JioAdRequestGenerator)object2).getRequestHeaders$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string4, (String)object12, context, string10, (boolean)l2);
        object9 = new StringBuilder();
        object5 = object5.P();
        ((StringBuilder)object9).append((String)object5);
        ((StringBuilder)object9).append(": pgm urlHeaders: ");
        ((StringBuilder)object9).append(object8);
        object5 = ((StringBuilder)object9).toString();
        Intrinsics.checkNotNullParameter(object5, string3);
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object4 = o3.m;
        if (object4 == null) {
            o3.m = object4 = new com.jio.jioads.network.c(context);
        }
        if ((object4 = o3.m) == null) return;
        object5 = ((com.jio.jioads.multiad.model.f)object7).g;
        n3 = o3.k;
        object13 = n3;
        object7 = new j(o3);
        object9 = o3.Q.a;
        bl4 = ((o)object9).a();
        Boolean bl9 = bl4;
        object11 = object7;
        ((com.jio.jioads.network.c)object4).b(n4, (String)object5, (String)object6, (Map)object8, (Integer)object13, (NetworkTaskListener)object7, bl9);
    }

    /*
     * Unable to fully structure code
     */
    public final void d0() {
        block91: {
            block90: {
                block89: {
                    block87: {
                        block88: {
                            block86: {
                                block84: {
                                    block83: {
                                        block82: {
                                            var1_1 = "ad_seq_and_blk_pref";
                                            var2_2 = "app_zone";
                                            var3_3 = "pod";
                                            var4_4 = "message";
                                            var5_5 = "adspotSequenceLocal_";
                                            var6_6 = this.a;
                                            var7_7 = var6_6.k0();
                                            if (var7_7 == (var8_8 = JioAdView$AdState.DESTROYED)) {
                                                return;
                                            }
                                            var7_7 = var6_6.Y();
                                            var8_8 = new StringBuilder();
                                            var9_9 = var6_6.P();
                                            var8_8.append((String)var9_9);
                                            var9_9 = ": incrementLocalShowAdCounter";
                                            var8_8.append((String)var9_9);
                                            var8_8 = var8_8.toString();
                                            Intrinsics.checkNotNullParameter(var8_8, var4_4);
                                            var8_8 = JioAds.Companion;
                                            var9_9 = var8_8.getInstance();
                                            var9_9.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                            var9_9 = JioAds$LogLevel.NONE;
                                            var9_9 = this.t;
                                            if (var9_9 == null) break block82;
                                            var10_10 = Constants$ResponseHeaderKeys.JIO_DATA;
                                            var10_10 = var10_10.getResponseHeader();
                                            var11_11 = Locale.ROOT;
                                            var10_10 = var10_10.toLowerCase((Locale)var11_11);
                                            var11_11 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                                            Intrinsics.checkNotNullExpressionValue(var10_10, (String)var11_11);
                                            var9_9 = var9_9.get(var10_10);
                                            var9_9 = (String)var9_9;
                                            break block83;
                                        }
                                        var12_12 = 0;
                                        var9_9 = null;
                                    }
                                    var13_13 = 1;
                                    var11_11 = "sl";
                                    var14_14 = "sh";
                                    var15_15 = "adseq";
                                    if (var9_9 != null) {
                                        block85: {
                                            var16_16 = var9_9.length();
                                            if (var16_16 == 0) break block84;
                                            var17_17 = new JSONObject((String)var9_9);
                                            var12_12 = var17_17.has(var15_15);
                                            if (var12_12 == 0) break block85;
                                            var2_2 = var17_17.optString(var15_15);
                                            var3_3 = new JSONObject((String)var2_2);
                                            var18_18 = var3_3.optInt((String)var11_11);
                                            var19_19 = var3_3.optInt(var14_14);
                                            break block86;
                                        }
                                        var12_12 = this.o;
                                        if (var12_12 != 0) break block87;
                                        var12_12 = var17_17.has(var3_3);
                                        if (var12_12 == 0) break block87;
                                        var3_3 = var17_17.optJSONObject(var3_3);
                                        if (var3_3 == null) break block87;
                                        var12_12 = var3_3.has((String)var2_2);
                                        if (var12_12 == 0) break block87;
                                        var2_2 = var3_3.optString((String)var2_2);
                                        var9_9 = new JSONObject((String)var2_2);
                                        var18_18 = (int)var9_9.has(var15_15);
                                        if (var18_18 == 0) break block87;
                                        var2_2 = var9_9.optString(var15_15);
                                        var3_3 = new JSONObject((String)var2_2);
                                        var18_18 = var3_3.optInt((String)var11_11);
                                        var19_19 = var3_3.optInt(var14_14);
                                        break block86;
                                    }
                                }
                                var2_2 = this.t;
                                if (var2_2 == null) break block87;
                                var18_18 = var2_2.containsKey(var15_15);
                                if (var18_18 != var13_13) break block87;
                                var2_2 = this.t;
                                Intrinsics.checkNotNull(var2_2);
                                var2_2 = var2_2.get(var15_15);
                                var2_2 = (String)var2_2;
                                if (var2_2 == null) break block88;
                                var3_3 = new JSONObject((String)var2_2);
                                var18_18 = var3_3.optInt((String)var11_11);
                                var19_19 = var3_3.optInt(var14_14);
                            }
lbl128:
                            // 2 sources

                            while (true) {
                                var12_12 = 1;
                                break block89;
                                break;
                            }
                        }
                        var18_18 = 0;
                        var2_2 = null;
                        var19_19 = 0;
                        var3_3 = null;
                        ** while (true)
                    }
                    var18_18 = 0;
                    var2_2 = null;
                    var19_19 = 0;
                    var3_3 = null;
                    var12_12 = 0;
                    var9_9 = null;
                }
                if (var7_7 == null || var12_12 == 0) ** GOTO lbl242
                try {
                    var9_9 = new StringBuilder(var5_5);
                    var15_15 = var6_6.P();
                }
                catch (Exception v0) {
                    ** continue;
                }
                var9_9.append(var15_15);
                var9_9 = var9_9.toString();
                var15_15 = "";
                var9_9 = j_0.d((Context)var7_7, (String)var1_1, 0, var15_15, (String)var9_9);
                var15_15 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(var9_9, var15_15);
                var9_9 = (String)var9_9;
                var20_20 = TextUtils.isEmpty((CharSequence)var9_9);
                if (!var20_20) break block90;
                var9_9 = "{\"sl\":0,\"sk\":0,\"sh\":0,\"ad-request-cycle-completed\":false}";
            }
            var15_15 = new JSONObject((String)var9_9);
            var12_12 = var15_15.optInt(var14_14) + var13_13;
            var15_15.put(var14_14, var12_12);
            var10_10 = new StringBuilder();
            var14_14 = var6_6.P();
            var10_10.append(var14_14);
            var14_14 = ": localShowCount= ";
            var10_10.append(var14_14);
            var10_10.append(var12_12);
            var14_14 = " and headerShowCount= ";
            var10_10.append(var14_14);
            var10_10.append(var19_19);
            var10_10 = var10_10.toString();
            Intrinsics.checkNotNullParameter(var10_10, var4_4);
            var10_10 = var8_8.getInstance();
            var10_10.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (var19_19 <= 0 || var12_12 != var19_19 || var18_18 <= 0) break block91;
            var21_21 = System.currentTimeMillis();
            var19_19 = 60000;
            var23_22 = var18_18 *= var19_19;
            var21_21 += var23_22;
            var15_15.put((String)var11_11, var21_21);
        }
        var2_2 = new StringBuilder(var5_5);
        var3_3 = var6_6.P();
        var2_2.append(var3_3);
        var2_2 = var2_2.toString();
        var3_3 = var15_15.toString();
        j_0.p((Context)var7_7, (String)var1_1, 0, var3_3, (String)var2_2);
        var1_1 = new StringBuilder();
        var2_2 = var6_6.P();
        var1_1.append((String)var2_2);
        var2_2 = ": local Ad sequence value after increment ";
        var1_1.append((String)var2_2);
        var1_1.append((Object)var15_15);
        var1_1 = var1_1.toString();
        Intrinsics.checkNotNullParameter(var1_1, var4_4);
        var1_1 = var8_8.getInstance();
        var1_1.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
lbl242:
        // 3 sources

    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        Object object;
        Object object2;
        block48: {
            String string2;
            Serializable serializable;
            Object object3;
            block47: {
                boolean bl2;
                boolean bl3;
                Object object4;
                Object object5;
                Object object6;
                o o3;
                block53: {
                    int n3;
                    block46: {
                        Object object7;
                        block51: {
                            boolean bl4;
                            long l2;
                            int n4;
                            Object object8;
                            Object object9;
                            block52: {
                                block50: {
                                    int n7;
                                    block42: {
                                        block49: {
                                            JSONException jSONException2;
                                            block45: {
                                                block44: {
                                                    block43: {
                                                        String string3;
                                                        o3 = this;
                                                        object2 = new StringBuilder();
                                                        object = this.a;
                                                        j_0.i((com.jio.jioads.common.b)object, (StringBuilder)object2, ": inside proceed with ad request");
                                                        object2 = JioAds.Companion;
                                                        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                        object3 = JioAds$LogLevel.NONE;
                                                        object3 = object.k0();
                                                        object6 = JioAdView$AdState.DESTROYED;
                                                        if (object3 == object6) {
                                                            return;
                                                        }
                                                        object3 = object.Y();
                                                        if (object3 == null) {
                                                            return;
                                                        }
                                                        object6 = this.U();
                                                        object5 = "";
                                                        if (object6 == null) {
                                                            object6 = object5;
                                                        }
                                                        object7 = new StringBuilder();
                                                        l_0.d((com.jio.jioads.common.b)object, (StringBuilder)object7, ": checking if master config available for package ", (String)object6);
                                                        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                        object7 = o3.s;
                                                        serializable = null;
                                                        if (object7 != null) {
                                                            object7 = ((com.jio.jioads.common.a)object7).b;
                                                        } else {
                                                            n7 = 0;
                                                            object7 = null;
                                                        }
                                                        string2 = "message";
                                                        object4 = "master_config_pref";
                                                        object9 = "null cannot be cast to non-null type kotlin.String";
                                                        if (object7 != null) break block49;
                                                        object7 = com.jio.jioads.multiad.N.a;
                                                        Intrinsics.checkNotNullParameter(object6, "packageName");
                                                        object7 = com.jio.jioads.multiad.N.d;
                                                        object8 = "master_config_";
                                                        if (object7 != null) {
                                                            string3 = ((String)object8).concat((String)object6);
                                                            object7 = (JSONObject)((ConcurrentHashMap)object7).get(string3);
                                                        } else {
                                                            n7 = 0;
                                                            object7 = null;
                                                        }
                                                        if (object7 == null) {
                                                            object8 = ((String)object8).concat((String)object6);
                                                            object8 = j_0.d((Context)object3, (String)object4, 0, object5, (String)object8);
                                                            Intrinsics.checkNotNull(object8, (String)object9);
                                                            object8 = (String)object8;
                                                        } else {
                                                            object8 = object5;
                                                        }
                                                        if (object7 == null && (n7 = TextUtils.isEmpty((CharSequence)object8)) != 0) break block42;
                                                        object7 = new StringBuilder();
                                                        string3 = ": master config available";
                                                        j_0.i((com.jio.jioads.common.b)object, (StringBuilder)object7, string3);
                                                        object2 = ((JioAds$Companion)object2).getInstance();
                                                        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                        try {
                                                            object2 = new Object();
                                                            object2 = ((v)object2).a((String)object8, (String)object6);
                                                            object6 = o3.s;
                                                            if (object6 != null) break block42;
                                                            if (object2 == null) break block43;
                                                            object7 = ((com.jio.jioads.multiad.model.h)object2).b;
                                                            break block44;
                                                        }
                                                        catch (JSONException jSONException2) {
                                                            break block45;
                                                        }
                                                    }
                                                    n7 = 0;
                                                    object7 = null;
                                                }
                                                if (object2 != null && (object2 = ((com.jio.jioads.multiad.model.h)object2).a) != null) {
                                                    object8 = object.P();
                                                    object2 = ((HashMap)object2).get(object8);
                                                    object2 = (com.jio.jioads.multiad.model.e)object2;
                                                } else {
                                                    n3 = 0;
                                                    object2 = null;
                                                }
                                                object6 = new com.jio.jioads.common.a((com.jio.jioads.multiad.model.d)object7, (com.jio.jioads.multiad.model.e)object2, null);
                                                o3.s = object6;
                                                break block42;
                                            }
                                            object6 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object, ": ");
                                            object7 = Utility.INSTANCE;
                                            object2 = ((Utility)object7).printStacktrace((Exception)((Object)jSONException2));
                                            ((StringBuilder)object6).append((String)object2);
                                            Intrinsics.checkNotNullParameter(((StringBuilder)object6).toString(), string2);
                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                            object2 = JioAds$LogLevel.NONE;
                                            break block42;
                                        }
                                        object6 = new StringBuilder();
                                        object7 = ": master config response available";
                                        j_0.i((com.jio.jioads.common.b)object, (StringBuilder)object6, (String)object7);
                                        object2 = ((JioAds$Companion)object2).getInstance();
                                        ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    }
                                    if ((object2 = o3.s) == null || (object2 = ((com.jio.jioads.common.a)object2).b) == null || (object2 = ((com.jio.jioads.multiad.model.e)object2).b) == null || (object2 = ((com.jio.jioads.multiad.model.c)object2).d) == null || (n3 = ((Integer)object2).intValue()) != (n4 = 1)) break block50;
                                    object2 = new StringBuilder("config_level_te_");
                                    object7 = this.U();
                                    ((StringBuilder)object2).append((String)object7);
                                    object2 = ((StringBuilder)object2).toString();
                                    object2 = j_0.d((Context)object3, (String)object4, 0, object5, (String)object2);
                                    Intrinsics.checkNotNull(object2, (String)object9);
                                    object2 = (String)object2;
                                    o3.n = object2;
                                    object2 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object, ":te value taken from app level ");
                                    object7 = o3.n;
                                    ir3_0.b((StringBuilder)object2, (String)object7, string2);
                                    object2 = JioAds.Companion;
                                    ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object7 = o3.n;
                                    n7 = TextUtils.isEmpty((CharSequence)object7);
                                    if ((n7 != 0 || (object7 = o3.n) != null && (n7 = ((String)object7).equals(object4 = "0")) == n4) && (object4 = (object7 = o3.s) != null && (object4 = ((com.jio.jioads.common.a)object7).b) != null && (object4 = ((com.jio.jioads.multiad.model.e)object4).b) != null ? ((com.jio.jioads.multiad.model.c)object4).c : null) != null) {
                                        if (object7 != null && (object7 = ((com.jio.jioads.common.a)object7).b) != null && (object7 = ((com.jio.jioads.multiad.model.e)object7).b) != null) {
                                            object7 = ((com.jio.jioads.multiad.model.c)object7).c;
                                        } else {
                                            n7 = 0;
                                            object7 = null;
                                        }
                                        o3.n = object7 = String.valueOf(object7);
                                        object7 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object, ":te value taken from adspot level ");
                                        object4 = o3.n;
                                        d90_0.b((StringBuilder)object7, (String)object4, string2, (JioAds$Companion)object2);
                                    }
                                    o3.o = n4;
                                    object7 = new StringBuilder();
                                    object4 = ": checking if multiad response is available";
                                    j_0.i((com.jio.jioads.common.b)object, (StringBuilder)object7, (String)object4);
                                    ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object7 = o3.s;
                                    if (object7 != null) {
                                        object7 = ((com.jio.jioads.common.a)object7).c;
                                    } else {
                                        n7 = 0;
                                        object7 = null;
                                    }
                                    object4 = "multiad_pref";
                                    if (object7 == null) {
                                        object7 = this.Y();
                                        object5 = j_0.d((Context)object3, (String)object4, 0, object5, (String)object7);
                                        Intrinsics.checkNotNull(object5, (String)object9);
                                        object5 = (String)object5;
                                        n7 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
                                        if (n7 == 0) {
                                            object7 = new StringBuilder();
                                            object9 = ": parsing multiad response";
                                            j_0.i((com.jio.jioads.common.b)object, (StringBuilder)object7, (String)object9);
                                            ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                            object2 = o3.s;
                                            if (object2 != null) {
                                                object7 = object.P();
                                                object5 = com.jio.jioads.multiad.v.c((String)object5, (String)object7);
                                                ((com.jio.jioads.common.a)object2).c = object5;
                                            }
                                        }
                                    }
                                    object2 = com.jio.jioads.util.i.a;
                                    object2 = o3.Q;
                                    bl3 = com.jio.jioads.util.i.l((com.jio.jioads.common.c)object2);
                                    if (!bl3 || (object5 = object.k0()) == (object7 = JioAdView$AdState.FAILED)) break block46;
                                    object5 = object.P();
                                    object7 = object.k0();
                                    object9 = com.jio.jioads.util.i.a((Context)object3);
                                    boolean bl5 = TextUtils.isEmpty((CharSequence)object9);
                                    if (bl5) break block51;
                                    if (object9 != null) {
                                        object8 = new JSONObject((String)object9);
                                    } else {
                                        bl5 = false;
                                        object8 = null;
                                    }
                                    l2 = System.currentTimeMillis();
                                    if (object8 == null || (object9 = object8.keys()) == null) break block51;
                                    break block52;
                                }
                                com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object, ": single ad config, proceeding to request");
                                object2 = JioAds.Companion.getInstance();
                                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                this.g();
                                return;
                            }
                            while (bl4 = object9.hasNext()) {
                                long l3;
                                long l4;
                                String string4 = (String)object9.next();
                                Intrinsics.checkNotNull(string4);
                                object6 = "\\d+";
                                serializable = new Regex((String)object6);
                                n4 = (int)(((Regex)serializable).c(string4) ? 1 : 0);
                                if (n4 != 0 && (n4 = (int)((l4 = l2 - (l3 = Long.parseLong(string4))) == 0L ? 0 : (l4 < 0L ? -1 : 1))) > 0 && (n4 = (int)(Intrinsics.areEqual(object5, object6 = object8.optString(string4)) ? 1 : 0)) != 0) {
                                    com.jio.jioads.util.i.g((Context)object3, (com.jio.jioads.common.c)object2, (String)object5, false);
                                    object6 = JioAdView$AdState.FAILED;
                                    if (object7 != object6) {
                                        com.jio.jioads.util.i.i((Context)object3, (String)object5, (f)object2);
                                    }
                                    break block46;
                                }
                                n4 = 1;
                                serializable = null;
                            }
                        }
                        if (object7 != (object6 = JioAdView$AdState.FAILED)) {
                            com.jio.jioads.util.i.i((Context)object3, (String)object5, (f)object2);
                        }
                        com.jio.jioads.util.i.g((Context)object3, (com.jio.jioads.common.c)object2, (String)object5, false);
                    }
                    if ((object2 = o3.s) != null) {
                        object3 = ((com.jio.jioads.common.a)object2).c;
                    } else {
                        bl2 = false;
                        object3 = null;
                    }
                    if (object3 == null) {
                        com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object, ": multiAd response not available");
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object2 = JioAds$LogLevel.NONE;
                        this.g();
                        return;
                    }
                    if (object2 != null && (object3 = ((com.jio.jioads.common.a)object2).c) != null && (object3 = ((com.jio.jioads.multiad.model.e)object3).b) != null) {
                        object3 = ((com.jio.jioads.multiad.model.c)object3).b;
                    } else {
                        bl2 = false;
                        object3 = null;
                    }
                    serializable = object2 != null && (object2 = ((com.jio.jioads.common.a)object2).b) != null && (object2 = ((com.jio.jioads.multiad.model.e)object2).b) != null ? ((com.jio.jioads.multiad.model.c)object2).b : null;
                    if (object3 == null) {
                        com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object, ": first ad request");
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object2 = JioAds$LogLevel.NONE;
                        this.g();
                        return;
                    }
                    n3 = (int)(Intrinsics.areEqual(object3, serializable) ? 1 : 0);
                    object6 = " :storing tms:  removeHybridAdCountDetails ";
                    if (n3 != 0) break block53;
                    object2 = object.k0();
                    if (object2 == (object5 = JioAdView$AdState.DESTROYED)) break block47;
                    object2 = object.Y();
                    try {
                        Intrinsics.checkNotNullParameter(object6, string2);
                        object6 = JioAds.Companion;
                        object6 = ((JioAds$Companion)object6).getInstance();
                        ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object6 = JioAds$LogLevel.NONE;
                        if (object2 != null) {
                            object6 = this.b0();
                            j_0.f((Context)object2, (String)object4, (String)object6);
                        }
                        break block47;
                    }
                    catch (Exception exception) {}
                }
                com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object, ": master config version same, checking if ads available in cache");
                object2 = JioAds.Companion;
                ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                bl2 = this.g0();
                if (!bl2 && (bl2 = this.e0())) {
                    bl2 = true;
                    o3.A(bl2);
                    return;
                }
                bl2 = true;
                bl3 = this.e0();
                if (bl3 && (bl3 = this.g0()) && (object5 = this.R()) != null) {
                    o3.A(bl2);
                    return;
                }
                bl3 = this.e0();
                if (bl3 && (bl3 = this.g0()) && (object5 = this.R()) == null) {
                    o3.A(bl2);
                    return;
                }
                object3 = object.k0();
                if (object3 == (object5 = JioAdView$AdState.DESTROYED)) break block48;
                object3 = object.Y();
                try {
                    Intrinsics.checkNotNullParameter(object6, string2);
                    object2 = ((JioAds$Companion)object2).getInstance();
                    ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    if (object3 != null) {
                        object2 = this.b0();
                        j_0.f((Context)object3, (String)object4, (String)object2);
                    }
                    break block48;
                }
                catch (Exception exception) {}
            }
            object2 = new StringBuilder();
            object = object.P();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(": master config version changed: ");
            ((StringBuilder)object2).append(object3);
            object = " --> ";
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(serializable);
            Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
            this.g();
            return;
        }
        com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object, ": ads not present");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object2 = JioAds$LogLevel.NONE;
        this.g();
    }

    public final boolean e0() {
        boolean bl2;
        block10: {
            boolean bl3;
            block9: {
                boolean bl4;
                Object object;
                Iterator iterator = this.s;
                int n3 = 0;
                String string2 = null;
                if (iterator != null && (object = ((com.jio.jioads.common.a)((Object)iterator)).c) != null) {
                    object = ((com.jio.jioads.multiad.model.e)object).a;
                } else {
                    bl4 = false;
                    object = null;
                }
                bl2 = true;
                if (object != null) {
                    Intrinsics.checkNotNull(iterator);
                    iterator = ((com.jio.jioads.common.a)((Object)iterator)).c;
                    Intrinsics.checkNotNull(iterator);
                    iterator = ((com.jio.jioads.multiad.model.e)((Object)iterator)).a;
                    Intrinsics.checkNotNull(iterator);
                    iterator = iterator.entrySet().iterator();
                    while (bl4 = iterator.hasNext()) {
                        object = (HashMap)iterator.next().getValue();
                        bl4 = object.isEmpty() ^ bl2;
                        if (!bl4) continue;
                        bl3 = true;
                        break;
                    }
                } else {
                    bl3 = false;
                    iterator = null;
                }
                if (bl3) break block9;
                object = this.s;
                if (object != null && (object = ((com.jio.jioads.common.a)object).c) != null && (object = ((com.jio.jioads.multiad.model.e)object).b) != null) {
                    string2 = ((com.jio.jioads.multiad.model.c)object).a;
                }
                if (!(bl4 = TextUtils.isEmpty(string2)) && (n3 = (object = new JSONArray(string2)).length()) > 0) break block10;
            }
            bl2 = bl3;
        }
        return bl2;
    }

    public final void f() {
        Object object = new StringBuilder();
        Object object2 = this.a;
        j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object, ": pgm inside processSelectedPromotionalresponse");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object3 = JioAds$LogLevel.NONE;
        object3 = this.F;
        if (object3 == null) {
            object3 = new StringBuilder();
            j_0.i((com.jio.jioads.common.b)object2, (StringBuilder)object3, ": pgm selected response is null");
            ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAdError.Companion;
            object2 = JioAdError$JioAdErrorType.ERROR_NOFILL;
            object3 = "Ad not available";
            JioAdError jioAdError = j_0.c((t_0)object, (JioAdError$JioAdErrorType)((Object)object2), (String)object3);
            com.jio.jioads.cdnlogging.d d2 = com.jio.jioads.cdnlogging.d.a;
            Object object4 = object = this.b;
            object4 = (V)object;
            String string2 = "processSelectedPromotionalResponse";
            String string3 = "JioAdViewController";
            Object var9_11 = null;
            String string4 = "NoFillFromPGM";
            ((V)object4).d(jioAdError, false, d2, string2, string3, string4, null);
        } else {
            object2 = this.t;
            Object object5 = this.Q;
            object5.getClass();
            Object object6 = new StringBuilder("After pgm onAdDataUpdate headers :");
            ((StringBuilder)object6).append(object2);
            object6 = ((StringBuilder)object6).toString();
            String string5 = "message";
            Intrinsics.checkNotNullParameter(object6, string5);
            object6 = ((JioAds$Companion)object).getInstance();
            ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = ((f)object5).a;
            ((o)object5).I = true;
            boolean bl2 = ((o)object5).A;
            if (bl2 && (bl2 = ((Boolean)(object6 = (Boolean)((o)object5).X().a)).booleanValue())) {
                object6 = "Starting mediationFlow";
                v12.a((String)object6, string5, (JioAds$Companion)object);
                ((o)object5).x((String)object3, (Map)object2);
            } else {
                ((o)object5).C = false;
                object = ((o)object5).r;
                if (object != null) {
                    ((com.jio.jioads.common.d)object).onAdDataUpdate((String)object3, (Map)object2);
                }
            }
        }
    }

    public final boolean f0() {
        boolean bl2;
        boolean bl3;
        Object object;
        Object object2;
        Object object3 = this.t;
        boolean bl4 = true;
        String string2 = "application/xhtml+xml";
        String string3 = "text/html";
        String string4 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
        if (object3 != null) {
            Intrinsics.checkNotNull(object3);
            object2 = Constants$ResponseHeaderKeys.Content_Type;
            object = ((Constants$ResponseHeaderKeys)((Object)object2)).getResponseHeader();
            Locale locale = Locale.ROOT;
            object = ((String)object).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(object, string4);
            bl3 = object3.containsKey(object);
            if (bl3) {
                object3 = this.t;
                Intrinsics.checkNotNull(object3);
                object = ((Constants$ResponseHeaderKeys)((Object)object2)).getResponseHeader().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(object, string4);
                object3 = (CharSequence)object3.get(object);
                bl3 = TextUtils.isEmpty((CharSequence)object3);
                if (!bl3) {
                    object3 = this.t;
                    Intrinsics.checkNotNull(object3);
                    object = ((Constants$ResponseHeaderKeys)((Object)object2)).getResponseHeader().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object, string4);
                    object3 = object3.get(object);
                    Intrinsics.checkNotNull(object3);
                    object3 = (CharSequence)object3;
                    bl3 = StringsKt.F((CharSequence)object3, string3, false);
                    if (!bl3) {
                        object3 = this.t;
                        Intrinsics.checkNotNull(object3);
                        string3 = ((Constants$ResponseHeaderKeys)((Object)object2)).getResponseHeader().toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(string3, string4);
                        object3 = object3.get(string3);
                        Intrinsics.checkNotNull(object3);
                        object3 = (CharSequence)object3;
                        bl3 = StringsKt.F((CharSequence)object3, string2, false);
                        if (!bl3) {
                            bl4 = false;
                        }
                    }
                    return bl4;
                }
            }
        }
        object3 = Constants$ResponseHeaderKeys.Content_Type;
        object2 = ((Constants$ResponseHeaderKeys)((Object)object3)).getResponseHeader();
        object = Locale.ROOT;
        object2 = ((String)object2).toLowerCase((Locale)object);
        Intrinsics.checkNotNullExpressionValue(object2, string4);
        object2 = this.E((String)object2);
        if (object2 != null) {
            bl2 = StringsKt.F((CharSequence)object2, string2, false);
        } else {
            bl2 = false;
            string2 = null;
        }
        if (!bl2) {
            object3 = ((Constants$ResponseHeaderKeys)((Object)object3)).getResponseHeader().toLowerCase((Locale)object);
            Intrinsics.checkNotNullExpressionValue(object3, string4);
            object3 = this.E((String)object3);
            if (object3 != null) {
                bl3 = StringsKt.F((CharSequence)object3, string3, false);
            } else {
                bl3 = false;
                object3 = null;
            }
            if (!bl3) {
                bl4 = false;
            }
        }
        return bl4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        var1_1 = this;
        synchronized (this) {
            block53: {
                block60: {
                    block57: {
                        block59: {
                            block58: {
                                block55: {
                                    block56: {
                                        block54: {
                                            block52: {
                                                try {
                                                    var2_2 = new StringBuilder();
                                                    var3_4 = this.a;
                                                    var4_5 = ": inside requestAd()";
                                                    com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var3_4, (StringBuilder)var2_2, (String)var4_5);
                                                    var2_2 = this.a;
                                                    var2_2 = var2_2.k0();
                                                    var3_4 = JioAdView$AdState.DESTROYED;
                                                    if (var2_2 != var3_4) break block52;
                                                }
                                                catch (Throwable var2_3) {
                                                    break block53;
                                                }
                                                return;
                                            }
                                            var2_2 = this.a;
                                            var2_2 = var2_2.Y();
                                            var4_5 = "";
                                            var5_6 = com.jio.jioads.multiad.N.a;
                                            var5_6 = this.a;
                                            var5_6 = var5_6.P();
                                            var6_7 = "adspotId";
                                            Intrinsics.checkNotNullParameter(var5_6, (String)var6_7);
                                            var6_7 = com.jio.jioads.multiad.N.a;
                                            if (var6_7 == null) {
                                                var6_7 = new HashMap();
                                                com.jio.jioads.multiad.N.a = var6_7;
                                            }
                                            var6_7 = com.jio.jioads.multiad.N.a;
                                            var7_8 = 1;
                                            if (var6_7 != null && (var8_9 = var6_7.containsKey(var5_6)) == 0) {
                                                var6_7 = new StringBuilder();
                                                var6_7.append((String)var5_6);
                                                var9_10 = ": throttle adspotId not present";
                                                var6_7.append((String)var9_10);
                                                var6_7 = var6_7.toString();
                                                var9_10 = "message";
                                                Intrinsics.checkNotNullParameter(var6_7, (String)var9_10);
                                                var6_7 = JioAds.Companion;
                                                var6_7 = var6_7.getInstance();
                                                var6_7.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                var6_7 = JioAds$LogLevel.NONE;
                                                var6_7 = com.jio.jioads.multiad.N.a;
                                                Intrinsics.checkNotNull(var6_7);
                                                var9_10 = 0;
                                                var6_7.put(var5_6, var9_10);
                                                var8_9 = 0;
                                                var6_7 = null;
                                            } else {
                                                var6_7 = com.jio.jioads.multiad.N.a;
                                                Intrinsics.checkNotNull(var6_7);
                                                var6_7 = var6_7.get(var5_6);
                                                var6_7 = (Integer)var6_7;
                                                if (var6_7 != null) {
                                                    var8_9 = var6_7.intValue();
                                                } else {
                                                    var8_9 = 0;
                                                    var6_7 = null;
                                                }
                                                var9_10 = var8_9 += var7_8;
                                                var10_11 = com.jio.jioads.multiad.N.a;
                                                Intrinsics.checkNotNull(var10_11);
                                                var10_11.put(var5_6, var9_10);
                                            }
                                            var5_6 = var1_1.a;
                                            var5_6 = var5_6.P();
                                            var9_10 = "adspotId";
                                            Intrinsics.checkNotNullParameter(var5_6, (String)var9_10);
                                            var9_10 = com.jio.jioads.multiad.N.a;
                                            var11_12 = -1;
                                            if (var9_10 == null || (var12_13 = var9_10.containsKey(var5_6))) break block54;
                                            var5_6 = var11_12;
                                            break block55;
                                        }
                                        var9_10 = com.jio.jioads.multiad.N.a;
                                        if (var9_10 == null) break block56;
                                        var5_6 = var9_10.get(var5_6);
                                        if ((var5_6 = (Integer)var5_6) != null) break block55;
                                    }
                                    var5_6 = var11_12;
                                }
                                var13_14 /* !! */  = var5_6.intValue();
                                var12_13 = false;
                                var9_10 = null;
                                if (var13_14 /* !! */  == var11_12) break block57;
                                var4_5 = new StringBuilder();
                                var5_6 = var1_1.a;
                                var5_6 = var5_6.P();
                                var4_5.append((String)var5_6);
                                var5_6 = ":Throttle logic enabled, index ";
                                var4_5.append((String)var5_6);
                                var4_5.append(var8_9);
                                var4_5 = var4_5.toString();
                                com.jio.jioads.util.j.a((String)var4_5);
                                var4_5 = var1_1.a;
                                var4_5 = var4_5.P();
                                var5_6 = var1_1.s;
                                if (var5_6 != null) {
                                    var5_6 = var5_6.b;
                                } else {
                                    var13_14 /* !! */  = 0;
                                    var5_6 = null;
                                }
                                var4_5 = com.jio.jioads.multiad.N.b((String)var4_5, var8_9, (com.jio.jioads.multiad.model.e)var5_6);
                                if (var4_5 == null) break block58;
                                var5_6 = var4_5.a;
                                if ((var5_6 = (String)var5_6) != null) break block59;
                            }
                            var5_6 = "";
                        }
                        if (var4_5 != null) {
                            var4_5 = var4_5.b;
                            var4_5 = (Number)var4_5;
                            var14_15 = var4_5.intValue();
                        } else {
                            var14_15 = '\u0001';
                        }
                        var15_16 = var5_6;
                        break block60;
                    }
                    var5_6 = new StringBuilder();
                    var6_7 = var1_1.a;
                    var16_17 = ": Throttling logic disabled";
                    com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var6_7, (StringBuilder)var5_6, (String)var16_17);
                    var15_16 = var4_5;
                    var14_15 = '\u0001';
                }
                var13_14 /* !! */  = (int)TextUtils.isEmpty((CharSequence)var15_16);
                if (var13_14 /* !! */  == 0 && (var13_14 /* !! */  = (int)var15_16.equalsIgnoreCase((String)(var5_6 = "BACKUP_AD"))) != 0) {
                    var1_1.A(false);
                    return;
                }
                var5_6 = new StringBuilder();
                var6_7 = var1_1.a;
                var16_17 = ": inside makeAdRequest.isMultiAdEnabled: ";
                j_0.n((com.jio.jioads.common.b)var6_7, (StringBuilder)var5_6, (String)var16_17);
                var8_9 = (int)var1_1.o;
                var5_6.append((boolean)var8_9);
                var6_7 = ", requested method: ";
                var5_6.append((String)var6_7);
                var5_6.append((int)var14_15);
                var6_7 = ", teValue: ";
                var5_6.append((String)var6_7);
                var6_7 = var1_1.n;
                var5_6.append((String)var6_7);
                var5_6 = var5_6.toString();
                com.jio.jioads.util.j.a((String)var5_6);
                var5_6 = var1_1.a;
                var5_6 = var5_6.k0();
                if (var5_6 == var3_4) ** GOTO lbl526
                {
                    var17_18 = var1_1.o;
                    var3_4 = new com.jio.jioads.network.c((Context)var2_2);
                    var1_1.m = var3_4;
                    var3_4 = new l(var1_1, var17_18, (Context)var2_2);
                    var5_6 = var1_1.a;
                    if ((var5_6 = (Object)var5_6.b()) != null) {
                        var6_7 = new StringBuilder();
                        var18_19 /* !! */  = var5_6[0];
                        var6_7.append((int)var18_19 /* !! */ );
                        var18_19 /* !! */  = 120;
                        var6_7.append((char)var18_19 /* !! */ );
                        var13_14 /* !! */  = (int)var5_6[var7_8];
                        var6_7.append(var13_14 /* !! */ );
                        var19_20 = var5_6 = var6_7.toString();
                    } else {
                        var19_20 = null;
                    }
                    var5_6 = new StringBuilder();
                    var6_7 = var1_1.a;
                    var16_17 = ": requestTimeOut value set : ";
                    j_0.n((com.jio.jioads.common.b)var6_7, (StringBuilder)var5_6, (String)var16_17);
                    var8_9 = var1_1.k;
                    var5_6.append(var8_9);
                    var5_6 = var5_6.toString();
                    com.jio.jioads.util.j.a((String)var5_6);
                    var5_6 = var1_1.a;
                    var5_6 = var5_6.K();
                    var6_7 = var1_1.a;
                    var6_7 = var6_7.m0();
                    var16_17 = var1_1.a;
                    var16_17 = var16_17.a();
                    var20_21 = var1_1.a;
                    var20_21 = var20_21.y();
                    var21_23 = var1_1.a;
                    var21_23 = var21_23.O();
                    var22_24 /* !! */  = JioAdView$AD_TYPE.DYNAMIC_DISPLAY;
                    if (var5_6 != var22_24 /* !! */ ) ** GOTO lbl280
                }
                {
                    block63: {
                        block65: {
                            block64: {
                                block62: {
                                    block61: {
                                        var13_14 /* !! */  = (int)TextUtils.isEmpty((CharSequence)var6_7);
                                        if (var13_14 /* !! */  != 0 && (var16_17 == null || (var13_14 /* !! */  = (int)var16_17.isEmpty()) != 0) && (var13_14 /* !! */  = (int)Intrinsics.areEqual(var20_21, var5_6 = Boolean.FALSE)) != 0) {
                                            var2_2 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
                                            var3_4 = JioAdError.Companion;
                                            var4_5 = "Please pass dynamic display ad size.";
                                            var6_7 = j_0.c((t_0)var3_4, (JioAdError$JioAdErrorType)var2_2, (String)var4_5);
                                            var2_2 = var1_1.a;
                                            var5_6 = var2_2.n();
                                            if (var5_6 != null) {
                                                var16_17 = "";
                                                var11_12 = 0;
                                                var10_11 = null;
                                                var23_25 = false;
                                                var20_21 = null;
                                                var17_18 = 64 != 0;
                                                var15_16 = null;
                                                var7_8 = 0;
                                                var24_30 = null;
                                                var12_13 = false;
                                                var9_10 = null;
                                                JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((JioAdView)var5_6, (JioAdError)var6_7, false, null, null, null, (String)var16_17, null, (int)var17_18, null);
                                            }
                                            return;
                                        }
                                        var5_6 = Boolean.TRUE;
                                        var13_14 /* !! */  = (int)Intrinsics.areEqual(var21_23, var5_6);
                                        if (var13_14 /* !! */  == 0 || (var13_14 /* !! */  = (int)TextUtils.isEmpty((CharSequence)var6_7)) != 0) break block61;
                                        Intrinsics.checkNotNull(var6_7);
                                        var5_6 = "x";
                                        var5_6 = new String[]{var5_6};
                                        var18_19 /* !! */  = 6;
                                        var5_6 = StringsKt.a0((CharSequence)var6_7, (String[])var5_6, false, 0, (int)var18_19 /* !! */ );
                                        var6_7 = var5_6.get(0);
                                        var6_7 = (String)var6_7;
                                        var8_9 = Integer.parseInt((String)var6_7);
                                        var18_19 /* !! */  = 50;
                                        if (var8_9 < var18_19 /* !! */ ) ** GOTO lbl-1000
                                        var5_6 = var5_6.get(var7_8);
                                        var13_14 /* !! */  = Integer.parseInt((String)(var5_6 = (String)var5_6));
                                        if (var13_14 /* !! */  >= var18_19 /* !! */ ) {
                                            var5_6 = var1_1.a;
                                            if ((var5_6 = var5_6.T()) != null && (var13_14 /* !! */  = var5_6.intValue()) == var11_12) {
                                                var2_2 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
                                                var3_4 = JioAdError.Companion;
                                                var4_5 = "Please pass custom layout by calling setCustomDisplayAdContainer().";
                                                var6_7 = j_0.c((t_0)var3_4, (JioAdError$JioAdErrorType)var2_2, (String)var4_5);
                                                var2_2 = var1_1.a;
                                                var5_6 = var2_2.n();
                                                if (var5_6 != null) {
                                                    var16_17 = "";
                                                    var11_12 = 0;
                                                    var10_11 = null;
                                                    var23_26 = false;
                                                    var20_21 = null;
                                                    var17_18 = 64 != 0;
                                                    var15_16 = null;
                                                    var7_8 = 0;
                                                    var24_31 = null;
                                                    var12_13 = false;
                                                    var9_10 = null;
                                                    JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((JioAdView)var5_6, (JioAdError)var6_7, false, null, null, null, (String)var16_17, null, (int)var17_18, null);
                                                }
                                                return;
                                            }
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var2_2 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
                                            var3_4 = JioAdError.Companion;
                                            var4_5 = "Please pass dynamic display ad dimension to be greater than 50x50.";
                                            var6_7 = j_0.c((t_0)var3_4, (JioAdError$JioAdErrorType)var2_2, (String)var4_5);
                                            var2_2 = var1_1.a;
                                            var5_6 = var2_2.n();
                                            if (var5_6 != null) {
                                                var16_17 = "";
                                                var11_12 = 0;
                                                var10_11 = null;
                                                var23_27 = false;
                                                var20_21 = null;
                                                var17_18 = 64 != 0;
                                                var15_16 = null;
                                                var7_8 = 0;
                                                var24_32 = null;
                                                var12_13 = false;
                                                var9_10 = null;
                                                JioAdView.adFailedToLoad$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((JioAdView)var5_6, (JioAdError)var6_7, false, null, null, null, (String)var16_17, null, (int)var17_18, null);
                                            }
                                            return;
                                        }
                                    }
                                    if (var2_2 == null || (var5_6 = var1_1.x) == null) break block62;
                                    var20_21 = new JioAdRequestGenerator((Context)var2_2);
                                    var21_23 = var1_1.n;
                                    var3_4 = var1_1.a;
                                    var22_24 /* !! */  = var3_4.P();
                                    var3_4 = var1_1.a;
                                    if ((var3_4 = var3_4.R()) != null) {
                                        var9_10 = var3_4.getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)var2_2);
                                    }
                                    var25_34 = var9_10;
                                    var2_2 = var1_1.a;
                                    var26_37 = var2_2.H();
                                    var27_40 = this.U();
                                    var2_2 = var1_1.a;
                                    var28_43 = var2_2.K();
                                    var2_2 = var1_1.a;
                                    var29_46 = var2_2.a();
                                    var2_2 = var1_1.a;
                                    var30_49 = var2_2.q();
                                    var2_2 = var1_1.a;
                                    var31_52 = var2_2.J();
                                    var2_2 = var1_1.a;
                                    var32_55 = var2_2.b0();
                                    var33_58 = this.R();
                                    var34_61 = this.N();
                                    var35_64 = this.W();
                                    var2_2 = var1_1.a;
                                    var36_67 = var2_2.v();
                                    var2_2 = var1_1.x;
                                    var3_4 = var1_1.a;
                                    var37_70 = var3_4.m0();
                                    var3_4 = var1_1.a;
                                    var38_73 = var3_4.G();
                                    var2_2 = var20_21.getAdRequestData(var17_18, (String)var15_16, (String)var21_23, (String)var22_24 /* !! */ , (HashMap)var9_10, var26_37, var27_40, var28_43, var29_46, var30_49, var31_52, var32_55, (String)var19_20, var33_58, var34_61, var35_64, var36_67, (JioAdsLoader)var2_2, false, var37_70, var38_73);
                                    var3_4 = new StringBuilder();
                                    var4_5 = var1_1.a;
                                    var5_6 = ": JioAdsLoader setRequestUrl called adRequestData : ";
                                    j_0.n((com.jio.jioads.common.b)var4_5, (StringBuilder)var3_4, (String)var5_6);
                                    var4_5 = var2_2.a;
                                    var4_5 = (String)var4_5;
                                    var3_4.append((String)var4_5);
                                    var14_15 = '?';
                                    var3_4.append(var14_15);
                                    var5_6 = var2_2.b;
                                    var5_6 = (Object[])var5_6;
                                    var5_6 = var5_6[0];
                                    var3_4.append(var5_6);
                                    var3_4 = var3_4.toString();
                                    com.jio.jioads.util.j.a((String)var3_4);
                                    var3_4 = var1_1.x;
                                    if (var3_4 != null) {
                                        var5_6 = new StringBuilder();
                                        var6_7 = var2_2.a;
                                        var6_7 = (String)var6_7;
                                        var5_6.append((String)var6_7);
                                        var5_6.append(var14_15);
                                        var2_2 = var2_2.b;
                                        var2_2 = (Object[])var2_2;
                                        var2_2 = var2_2[0];
                                        var5_6.append(var2_2);
                                        var2_2 = var5_6.toString();
                                        var3_4.setRequestUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var2_2);
                                    }
                                    break block63;
                                }
                                var5_6 = var1_1.a;
                                var13_14 /* !! */  = (int)var5_6.N();
                                if (var13_14 /* !! */  == 0 || !var17_18) break block64;
                                var5_6 = this.U();
                                if (var5_6 == null) break block63;
                                var6_7 = var1_1.a;
                                var6_7 = var6_7.P();
                                var10_11 = com.jio.jioads.controller.o.T;
                                if (var10_11 != null) {
                                    var16_17 = new StringBuilder();
                                    var16_17.append((String)var5_6);
                                    var23_28 = '_';
                                    var16_17.append(var23_28);
                                    var16_17.append((String)var6_7);
                                    var6_7 = var16_17.toString();
                                    var6_7 = var10_11.get(var6_7);
                                    var6_7 = (ArrayList)var6_7;
                                } else {
                                    var8_9 = 0;
                                    var6_7 = null;
                                }
                                if (var6_7 != null) {
                                    var2_2 = new StringBuilder();
                                    var4_5 = var1_1.a;
                                    var6_7 = ": Ad request is already ongoing";
                                    com.jio.jioads.jioreel.tracker.model.b.a((com.jio.jioads.common.b)var4_5, (StringBuilder)var2_2, (String)var6_7);
                                    var2_2 = var1_1.a;
                                    var2_2 = var2_2.P();
                                    com.jio.jioads.controller.o.w((String)var5_6, (String)var2_2, (l)var3_4);
                                    return;
                                }
                                if (var2_2 != null) {
                                    var6_7 = var1_1.a;
                                    var6_7 = var6_7.P();
                                    com.jio.jioads.controller.o.w((String)var5_6, (String)var6_7, (l)var3_4);
                                    var20_21 = new JioAdRequestGenerator((Context)var2_2);
                                    var21_23 = var1_1.n;
                                    var3_4 = var1_1.a;
                                    var22_24 /* !! */  = var3_4.P();
                                    var3_4 = var1_1.a;
                                    var3_4 = var3_4.R();
                                    if (var3_4 != null) {
                                        var9_10 = var3_4.getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)var2_2);
                                    }
                                    var25_35 = var9_10;
                                    var2_2 = var1_1.a;
                                    var26_38 /* !! */  = var2_2.H();
                                    var27_41 = this.U();
                                    var2_2 = var1_1.a;
                                    var28_44 /* !! */  = var2_2.K();
                                    var2_2 = var1_1.a;
                                    var29_47 = var2_2.a();
                                    var2_2 = var1_1.a;
                                    var30_50 /* !! */  = var2_2.q();
                                    var2_2 = var1_1.a;
                                    var31_53 = var2_2.J();
                                    var2_2 = var1_1.a;
                                    var32_56 = var2_2.b0();
                                    var33_59 = this.R();
                                    var34_62 = this.N();
                                    var35_65 = this.W();
                                    var2_2 = var1_1.a;
                                    var36_68 = var2_2.v();
                                    var2_2 = var1_1.x;
                                    var3_4 = var1_1.a;
                                    var37_71 = var3_4.m0();
                                    var3_4 = var1_1.a;
                                    var38_74 = var3_4.G();
                                    var2_2 = var20_21.getAdRequestData(var17_18, (String)var15_16, (String)var21_23, (String)var22_24 /* !! */ , (HashMap)var9_10, var26_38 /* !! */ , (String)var27_41, var28_44 /* !! */ , (List)var29_47, var30_50 /* !! */ , var31_53, var32_56, (String)var19_20, var33_59, var34_62, var35_65, var36_68, (JioAdsLoader)var2_2, false, var37_71, var38_74);
                                    var21_23 = var1_1.m;
                                    if (var21_23 != null) {
                                        var25_35 = var3_4 = var2_2.a;
                                        var25_35 = (String)var3_4;
                                        var3_4 = var2_2.b;
                                        var3_4 = (Object[])var3_4;
                                        var3_4 = var3_4[0];
                                        var26_38 /* !! */  = String.valueOf(var3_4);
                                        var2_2 = var2_2.b;
                                        var2_2 = (Object[])var2_2;
                                        var2_2 = var2_2[var7_8];
                                        var3_4 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String?, kotlin.String?>";
                                        Intrinsics.checkNotNull(var2_2, (String)var3_4);
                                        var27_41 = var2_2;
                                        var27_41 = (Map)var2_2;
                                        var39_76 = var1_1.k;
                                        var28_44 /* !! */  = Integer.valueOf(var39_76);
                                        var2_2 = new k(var1_1, (String)var5_6);
                                        var3_4 = var1_1.Q;
                                        var3_4 = var3_4.a;
                                        var40_78 = var3_4.a();
                                        var30_50 /* !! */  = Boolean.valueOf(var40_78);
                                        var29_47 = var2_2;
                                        var21_23.b(var14_15, (String)var25_35, (String)var26_38 /* !! */ , (Map)var27_41, (Integer)var28_44 /* !! */ , (NetworkTaskListener)var2_2, (Boolean)var30_50 /* !! */ );
                                    }
                                }
                                break block63;
                            }
                            var5_6 = com.jio.jioads.multiad.e.d;
                            var6_7 = var1_1.a;
                            var13_14 /* !! */  = (int)Intrinsics.areEqual(var5_6, var6_7 = var6_7.P());
                            if (var13_14 /* !! */  == 0) break block65;
                            var2_2 = "listener";
                            Intrinsics.checkNotNullParameter(var3_4, (String)var2_2);
                            var2_2 = com.jio.jioads.multiad.e.e;
                            if (var2_2 == null) {
                                com.jio.jioads.multiad.e.e = var2_2 = new ArrayList();
                            }
                            if ((var2_2 = com.jio.jioads.multiad.e.e) != null) {
                                var2_2.add(var3_4);
                            }
                            break block63;
                        }
                        if (var2_2 != null) {
                            var20_21 = new JioAdRequestGenerator((Context)var2_2);
                            var21_23 = var1_1.n;
                            var5_6 = var1_1.a;
                            var22_24 /* !! */  = var5_6.P();
                            var5_6 = var1_1.a;
                            if ((var5_6 = var5_6.R()) != null) {
                                var9_10 = var5_6.getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)var2_2);
                            }
                            var25_36 = var9_10;
                            var2_2 = var1_1.a;
                            var26_39 /* !! */  = var2_2.H();
                            var27_42 = this.U();
                            var2_2 = var1_1.a;
                            var28_45 /* !! */  = var2_2.K();
                            var2_2 = var1_1.a;
                            var29_48 = var2_2.a();
                            var2_2 = var1_1.a;
                            var30_51 /* !! */  = var2_2.q();
                            var2_2 = var1_1.a;
                            var31_54 = var2_2.J();
                            var2_2 = var1_1.a;
                            var32_57 = var2_2.b0();
                            var33_60 = this.R();
                            var34_63 = this.N();
                            var35_66 = this.W();
                            var2_2 = var1_1.a;
                            var36_69 = var2_2.v();
                            var2_2 = var1_1.x;
                            var5_6 = var1_1.a;
                            var37_72 = var5_6.m0();
                            var5_6 = var1_1.a;
                            var38_75 = var5_6.G();
                            var2_2 = var20_21.getAdRequestData(var17_18, (String)var15_16, (String)var21_23, (String)var22_24 /* !! */ , (HashMap)var9_10, var26_39 /* !! */ , (String)var27_42, var28_45 /* !! */ , (List)var29_48, var30_51 /* !! */ , var31_54, var32_57, (String)var19_20, var33_60, var34_63, var35_66, var36_69, (JioAdsLoader)var2_2, false, var37_72, var38_75);
                            var5_6 = var1_1.a;
                            var5_6 = var5_6.P();
                            var6_7 = com.jio.jioads.multiad.e.c;
                            if (var6_7 == null) {
                                var6_7 = new ArrayList();
                                com.jio.jioads.multiad.e.c = var6_7;
                            }
                            if (var5_6 != null && (var6_7 = com.jio.jioads.multiad.e.c) != null) {
                                var6_7.add(var5_6);
                            }
                            if ((var21_23 = var1_1.m) != null) {
                                var25_36 = var5_6 = var2_2.a;
                                var25_36 = (String)var5_6;
                                var5_6 = var2_2.b;
                                var5_6 = (Object[])var5_6;
                                var5_6 = var5_6[0];
                                var26_39 /* !! */  = String.valueOf(var5_6);
                                var2_2 = var2_2.b;
                                var2_2 = (Object[])var2_2;
                                var2_2 = var2_2[var7_8];
                                var5_6 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String?, kotlin.String?>";
                                Intrinsics.checkNotNull(var2_2, (String)var5_6);
                                var27_42 = var2_2;
                                var27_42 = (Map)var2_2;
                                var39_77 = var1_1.k;
                                var28_45 /* !! */  = Integer.valueOf((int)var39_77);
                                var2_2 = var1_1.Q;
                                var2_2 = var2_2.a;
                                var39_77 = var2_2.a();
                                var30_51 /* !! */  = Boolean.valueOf(var39_77);
                                var29_48 = var3_4;
                                var21_23.b(var14_15, (String)var25_36, (String)var26_39 /* !! */ , (Map)var27_42, (Integer)var28_45 /* !! */ , (NetworkTaskListener)var3_4, (Boolean)var30_51 /* !! */ );
                            }
                        }
                        break block63;
lbl526:
                        // 1 sources

                        var2_2 = JioAdError.Companion;
                        var3_4 = JioAdError$JioAdErrorType.ERROR_CACHE_AD;
                        var4_5 = "Ad failed to load. AdView object is null";
                        var6_7 = j_0.c((t_0)var2_2, (JioAdError$JioAdErrorType)var3_4, (String)var4_5);
                        var2_2 = var1_1.b;
                        var24_33 = com.jio.jioads.cdnlogging.d.a;
                        var5_6 = var2_2;
                        var5_6 = (V)var2_2;
                        var9_10 = "makeAdRequest:onError";
                        var10_11 = "JioAdViewController";
                        var16_17 = "";
                        var23_29 = false;
                        var20_22 = null;
                        var5_6.d((JioAdError)var6_7, false, var24_33, (String)var9_10, (String)var10_11, (String)var16_17, null);
                    }
                    return;
                }
            }
            throw var2_3;
        }
    }

    public final boolean g0() {
        int n3;
        int n4;
        Object object = this.s;
        if (object == null || (object = ((com.jio.jioads.common.a)object).b) == null || (object = ((com.jio.jioads.multiad.model.e)object).b) == null || (object = ((com.jio.jioads.multiad.model.c)object).p) == null || (n4 = ((Integer)object).intValue()) != (n3 = 1) || (n4 = (object = this.s) != null && (object = ((com.jio.jioads.common.a)object).b) != null && (object = ((com.jio.jioads.multiad.model.e)object).b) != null && (object = ((com.jio.jioads.multiad.model.c)object).r) != null ? (Integer)object : -1) <= 0) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public final void h() {
        block24: {
            Object object;
            ViewGroup viewGroup;
            Object object2;
            block23: {
                object2 = this.a;
                viewGroup = object2.K();
                object = JioAdView$AD_TYPE.INSTREAM_AUDIO;
                if (viewGroup == object) break block23;
                viewGroup = object2.K();
                object = JioAdView$AD_TYPE.INTERSTITIAL;
                if (viewGroup != object) break block24;
            }
            viewGroup = object2.a0();
            if (viewGroup == null) break block24;
            viewGroup = object2.a0();
            Intrinsics.checkNotNull(viewGroup);
            object = null;
            viewGroup = viewGroup[0];
            viewGroup = viewGroup;
            object = object2.a0();
            Intrinsics.checkNotNull(object);
            int n3 = 1;
            object = object[n3];
            Drawable drawable2 = "null cannot be cast to non-null type com.jio.jioads.utils.Constants.CompanionAdSize";
            Intrinsics.checkNotNull(object, (String)drawable2);
            object = (Constants$CompanionAdSize)((Object)object);
            drawable2 = object2.a0();
            Intrinsics.checkNotNull(drawable2);
            int n4 = 2;
            drawable2 = drawable2[n4];
            drawable2 = drawable2;
            Drawable drawable3 = object2.a0();
            Intrinsics.checkNotNull(drawable3);
            int n7 = 3;
            drawable3 = drawable3[n7];
            drawable3 = drawable3;
            try {
                this.q(viewGroup, (Constants$CompanionAdSize)((Object)object), drawable2, drawable3);
            }
            catch (Exception exception) {
                viewGroup = ": Exception in setting container";
                com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object2, (String)viewGroup);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean h0() {
        Object object;
        StringBuilder stringBuilder = new StringBuilder("responseHeaders: ");
        Map map2 = this.t;
        stringBuilder.append(map2);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        Map map3 = this.t;
        boolean bl2 = false;
        map2 = null;
        String string2 = "application/json";
        String string3 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
        if (map3 != null) {
            Intrinsics.checkNotNull(map3);
            object = Constants$ResponseHeaderKeys.Content_Type;
            String string4 = ((Constants$ResponseHeaderKeys)((Object)object)).getResponseHeader();
            Locale locale = Locale.ROOT;
            string4 = string4.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(string4, string3);
            boolean bl3 = map3.containsKey(string4);
            if (bl3) {
                Map map4 = this.t;
                Intrinsics.checkNotNull(map4);
                string4 = ((Constants$ResponseHeaderKeys)((Object)object)).getResponseHeader().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(string4, string3);
                CharSequence charSequence = (CharSequence)map4.get(string4);
                bl3 = TextUtils.isEmpty((CharSequence)charSequence);
                if (!bl3) {
                    Map map5 = this.t;
                    Intrinsics.checkNotNull(map5);
                    object = ((Constants$ResponseHeaderKeys)((Object)object)).getResponseHeader().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    Object v4 = map5.get(object);
                    Intrinsics.checkNotNull(v4);
                    CharSequence charSequence2 = (CharSequence)v4;
                    return StringsKt.F(charSequence2, string2, false);
                }
            }
        }
        String string5 = Constants$ResponseHeaderKeys.Content_Type.getResponseHeader();
        object = Locale.ROOT;
        String string6 = string5.toLowerCase((Locale)object);
        Intrinsics.checkNotNullExpressionValue(string6, string3);
        String string7 = this.E(string6);
        if (string7 == null) return bl2;
        return StringsKt.F(string7, string2, false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i() {
        block43: {
            block41: {
                block42: {
                    block40: {
                        block39: {
                            block38: {
                                block36: {
                                    block35: {
                                        block37: {
                                            block34: {
                                                var1_1 = this.h0();
                                                var2_2 = 1;
                                                var3_3 = 0;
                                                var4_4 = null;
                                                var5_5 = this.a;
                                                if (var1_1 != 0) {
                                                    var5_5.Z(0);
                                                } else {
                                                    var1_1 = this.b();
                                                    if (var1_1 != 0) {
                                                        var5_5.Z(var2_2);
                                                    } else {
                                                        var1_1 = this.f0();
                                                        if (var1_1 != 0) {
                                                            var1_1 = 2;
                                                            var5_5.Z(var1_1);
                                                        }
                                                    }
                                                }
                                                this.a();
                                                var6_6 = this.t;
                                                var7_8 = "";
                                                var8_11 /* !! */  = "{}";
                                                var9_12 = "<this>";
                                                var10_13 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                                                var11_14 = false;
                                                var12_15 = null;
                                                if (var6_6 == null) ** GOTO lbl-1000
                                                Intrinsics.checkNotNullParameter(var6_6, (String)var9_12);
                                                try {
                                                    var13_16 = Constants$HeaderKeys.JIO_DATA;
                                                    var14_17 = var13_16.getKey();
                                                    var15_18 = Locale.ROOT;
                                                    var14_17 = var14_17.toLowerCase((Locale)var15_18);
                                                    Intrinsics.checkNotNullExpressionValue(var14_17, var10_13);
                                                    var16_19 = var6_6.containsKey(var14_17);
                                                    var17_20 = "adrt";
                                                    if (!var16_19) break block34;
                                                    var13_16 = var13_16.getKey();
                                                    var13_16 = var13_16.toLowerCase((Locale)var15_18);
                                                    Intrinsics.checkNotNullExpressionValue(var13_16, var10_13);
                                                    var6_6 = var6_6.get(var13_16);
                                                    var6_6 = (String)var6_6;
                                                    if (var6_6 == null) {
                                                        var6_6 = var8_11 /* !! */ ;
                                                    }
                                                    if ((var1_1 = (int)(var13_16 = new JSONObject((String)var6_6)).has(var17_20)) == 0) break block35;
                                                    var6_6 = var13_16.getString(var17_20);
                                                    Intrinsics.checkNotNull(var6_6);
                                                    var18_21 = var6_6.length();
                                                    if (var18_21 <= 0) break block35;
                                                    var1_1 = Integer.parseInt((String)var6_6);
                                                    break block36;
                                                }
                                                catch (Exception var6_7) {
                                                    break block37;
                                                }
                                            }
                                            var18_21 = (int)var6_6.containsKey(var17_20);
                                            if (var18_21 == 0) break block35;
                                            var6_6 = var6_6.get(var17_20);
                                            if ((var6_6 = (String)var6_6) == null) {
                                                var6_6 = var7_8;
                                            }
                                            if ((var18_21 = var6_6.length()) <= 0) break block35;
                                            var1_1 = Integer.parseInt((String)var6_6);
                                            break block36;
                                        }
                                        var13_16 = "Exception while getting AD_REQ_TIMEOUT value: ";
                                        LO1.b((String)var13_16, var6_7);
                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var6_6 = JioAds$LogLevel.NONE;
                                    }
                                    var1_1 = 0;
                                    var6_6 = null;
                                }
                                var13_16 = var1_1;
                                if (var1_1 <= 0) {
                                    var18_21 = 0;
                                    var13_16 = null;
                                }
                                if (var13_16 != null) {
                                    var1_1 = var13_16.intValue();
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var1_1 = var5_5.w();
                                }
                                this.k = var1_1;
                                var6_6 = com.jio.jioads.controller.m.a(var5_5, ": Request Timeout value from header or pub ");
                                var18_21 = this.k;
                                var14_17 = "message";
                                w12_0.b(var18_21, var14_17, (StringBuilder)var6_6);
                                var6_6 = JioAds.Companion;
                                var6_6.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                var13_16 = JioAds$LogLevel.NONE;
                                var13_16 = this.t;
                                if (var13_16 == null) ** GOTO lbl-1000
                                Intrinsics.checkNotNullParameter(var13_16, (String)var9_12);
                                try {
                                    var15_18 = Constants$HeaderKeys.JIO_DATA;
                                    var17_20 = var15_18.getKey();
                                    var19_22 = Locale.ROOT;
                                    var17_20 = var17_20.toLowerCase(var19_22);
                                    Intrinsics.checkNotNullExpressionValue(var17_20, var10_13);
                                    var20_23 = var13_16.containsKey(var17_20);
                                    var21_24 = "mdt";
                                    if (var20_23) {
                                        var15_18 = var15_18.getKey();
                                        var15_18 = var15_18.toLowerCase(var19_22);
                                        Intrinsics.checkNotNullExpressionValue(var15_18, var10_13);
                                        var13_16 = var13_16.get(var15_18);
                                        var13_16 = (String)var13_16;
                                        if (var13_16 == null) {
                                            var13_16 = var8_11 /* !! */ ;
                                        }
                                        if ((var18_21 = (int)(var15_18 = new JSONObject((String)var13_16)).has(var21_24)) == 0 || (var18_21 = var15_18.getInt(var21_24)) <= 0) break block38;
                                        var13_16 = var18_21;
                                        break block39;
                                    }
                                }
                                catch (Exception v0) {
                                    break block38;
                                }
                                {
                                    var22_25 = (int)var13_16.containsKey(var21_24);
                                    if (var22_25 == 0) break block38;
                                    var13_16 = var13_16.get(var21_24);
                                    if ((var13_16 = (String)var13_16) != null) {
                                        var18_21 = Integer.parseInt((String)var13_16);
                                    } else {
                                        var18_21 = 0;
                                        var13_16 = null;
                                    }
                                    if (var18_21 <= 0) break block38;
                                    var13_16 = var18_21;
                                    break block39;
                                }
                            }
                            var18_21 = 0;
                            var13_16 = null;
                        }
                        if (var13_16 == null) ** GOTO lbl-1000
                        var22_25 = var13_16.intValue();
                        if (var22_25 <= 0) {
                            var18_21 = 0;
                            var13_16 = null;
                        }
                        if (var13_16 != null) {
                            var18_21 = var13_16.intValue();
                        } else lbl-1000:
                        // 3 sources

                        {
                            var18_21 = var5_5.g();
                        }
                        this.l = var18_21;
                        var13_16 = com.jio.jioads.controller.m.a(var5_5, ": Media Timeout value considered ");
                        var22_25 = this.l;
                        var13_16.append(var22_25);
                        Intrinsics.checkNotNullParameter(var13_16.toString(), var14_17);
                        var6_6.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var13_16 = this.t;
                        if (var13_16 == null) break block43;
                        Intrinsics.checkNotNullParameter(var13_16, (String)var9_12);
                        try {
                            var9_12 = Constants$HeaderKeys.JIO_DATA;
                            var12_15 = var9_12.getKey();
                            var15_18 = Locale.ROOT;
                            var12_15 = var12_15.toLowerCase((Locale)var15_18);
                            Intrinsics.checkNotNullExpressionValue(var12_15, var10_13);
                            var11_14 = var13_16.containsKey(var12_15);
                            var17_20 = "mdc";
                            if (!var11_14) break block40;
                            var7_8 = var9_12.getKey();
                            var7_8 = var7_8.toLowerCase((Locale)var15_18);
                            Intrinsics.checkNotNullExpressionValue(var7_8, var10_13);
                            var7_8 = var13_16.get(var7_8);
                            if (var7_8 != null) {
                                var8_11 /* !! */  = var7_8;
                            }
                            var7_8 = new JSONObject(var8_11 /* !! */ );
                            var23_26 = var7_8.has(var17_20);
                            if (var23_26 == 0) break block41;
                            var7_8 = var7_8.getString(var17_20);
                            Intrinsics.checkNotNull(var7_8);
                            var23_26 = var7_8.length();
                            if (var23_26 > 0) {
                                var3_3 = Integer.parseInt(var7_8);
                            }
                            break block41;
                        }
                        catch (Exception var7_9) {
                            break block42;
                        }
                    }
                    var23_27 = var13_16.containsKey(var17_20);
                    if (var23_27 != 0) {
                        var8_11 /* !! */  = var13_16.get(var17_20);
                        if (var8_11 /* !! */  != null) {
                            var7_8 = var8_11 /* !! */ ;
                        }
                        var23_27 = var7_8.length();
                        if (var23_27 > 0) {
                            var3_3 = Integer.parseInt(var7_8);
                        }
                    }
                    break block41;
                }
                var8_11 /* !! */  = "Exception while getting MEDIA_CACHE value: ";
                LO1.b(var8_11 /* !! */ , var7_9);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var7_10 = JioAds$LogLevel.NONE;
            }
            var12_15 = var3_3;
        }
        if (var12_15 != null && (var3_3 = var12_15.intValue()) == var2_2) {
            var24_28 /* !! */  = JioAds$MediaType.ALL;
        } else if (var12_15 != null && (var2_2 = var12_15.intValue()) == (var3_3 = -1)) {
            var24_28 /* !! */  = JioAds$MediaType.NONE;
        } else {
            var24_28 /* !! */  = var5_5.r();
            if (var24_28 /* !! */  == null) {
                var24_28 /* !! */  = JioAds$MediaType.NONE;
            }
        }
        this.G = var24_28 /* !! */ ;
        var24_28 /* !! */  = com.jio.jioads.controller.m.a(var5_5, ": MediaCache value considered ");
        var4_4 = this.G;
        var24_28 /* !! */ .append((Object)var4_4);
        Intrinsics.checkNotNullParameter(var24_28 /* !! */ .toString(), var14_17);
        var6_6.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public final boolean i0() {
        boolean bl2;
        block22: {
            Object object;
            Integer n4;
            Object object2;
            block24: {
                block23: {
                    object2 = this.s;
                    n4 = null;
                    object = object2 != null && (object = ((com.jio.jioads.common.a)object2).c) != null ? ((com.jio.jioads.multiad.model.e)object).a : null;
                    bl2 = false;
                    if (object == null) break block22;
                    if (object2 != null && (object2 = ((com.jio.jioads.common.a)object2).c) != null) {
                        object2 = ((com.jio.jioads.multiad.model.e)object2).a;
                    } else {
                        boolean n3 = false;
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                    object = "cpd";
                    boolean bl3 = ((HashMap)object2).containsKey(object);
                    if (!bl3) break block23;
                    object2 = this.s;
                    if (object2 != null && (object2 = ((com.jio.jioads.common.a)object2).c) != null) {
                        object2 = ((com.jio.jioads.multiad.model.e)object2).a;
                    } else {
                        boolean bl4 = false;
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                    object2 = (HashMap)((HashMap)object2).get(object);
                    if (object2 != null) {
                        int n3 = ((HashMap)object2).size();
                        object2 = n3;
                    } else {
                        boolean bl5 = false;
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                    int n7 = (Integer)object2;
                    if (n7 > 0) break block22;
                }
                if ((object2 = this.s) != null && (object2 = ((com.jio.jioads.common.a)object2).c) != null) {
                    object2 = ((com.jio.jioads.multiad.model.e)object2).a;
                } else {
                    boolean bl6 = false;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                object = "dd";
                boolean bl7 = ((HashMap)object2).containsKey(object);
                if (!bl7) break block24;
                object2 = this.s;
                if (object2 != null && (object2 = ((com.jio.jioads.common.a)object2).c) != null) {
                    object2 = ((com.jio.jioads.multiad.model.e)object2).a;
                } else {
                    boolean bl8 = false;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                object2 = (HashMap)((HashMap)object2).get(object);
                if (object2 != null) {
                    int n8 = ((HashMap)object2).size();
                    object2 = n8;
                } else {
                    boolean bl9 = false;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                int n10 = (Integer)object2;
                if (n10 > 0) break block22;
            }
            if ((object2 = this.s) != null && (object2 = ((com.jio.jioads.common.a)object2).c) != null) {
                object2 = ((com.jio.jioads.multiad.model.e)object2).a;
            } else {
                boolean bl10 = false;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            object = "pgm";
            boolean bl11 = ((HashMap)object2).containsKey(object);
            if (bl11) {
                object2 = this.s;
                if (object2 != null && (object2 = ((com.jio.jioads.common.a)object2).c) != null) {
                    object2 = ((com.jio.jioads.multiad.model.e)object2).a;
                } else {
                    boolean bl12 = false;
                    object2 = null;
                }
                Intrinsics.checkNotNull(object2);
                object2 = (HashMap)((HashMap)object2).get(object);
                if (object2 != null) {
                    int n14 = ((HashMap)object2).size();
                    n4 = n14;
                }
                Intrinsics.checkNotNull(n4);
                int n15 = n4;
                if (n15 > 0) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public final void j() {
        JioAdView$AD_TYPE jioAdView$AD_TYPE;
        Object object = this.a;
        Object object2 = object.K();
        if (object2 == (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INTERSTITIAL)) {
            boolean bl2 = this.A;
            if (bl2) {
                object2 = this.p;
                if (object2 != null) {
                    object2 = object.K();
                    if (object2 == (jioAdView$AD_TYPE = JioAdView$AD_TYPE.INSTREAM_VIDEO)) {
                        object = this.t;
                        if (object != null) {
                            object2 = "med";
                            object = (String)object.get(object2);
                        } else {
                            object = null;
                        }
                        bl2 = TextUtils.isEmpty((CharSequence)object);
                        if (!bl2) {
                            Intrinsics.checkNotNull(object);
                            this.K((String)object);
                        }
                    } else {
                        object2 = ": Showing interstitial ad";
                        com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object, (String)object2);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        object = this.p;
                        if (object != null) {
                            ((JioMediationSelector)object).showAd();
                        }
                    }
                }
            } else {
                object = this.r;
                if (object != null) {
                    ((com.jio.jioads.common.d)object).onShowAdView();
                }
            }
        } else {
            com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object, ": inside callOnShowAdView()");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object2 = Looper.getMainLooper();
            object = new Handler((Looper)object2);
            int n3 = 1;
            object2 = new bp0_0(this, n3);
            object.post((Runnable)object2);
        }
    }

    public final boolean j0() {
        NumberFormatException numberFormatException2;
        CharSequence charSequence;
        boolean bl2;
        block8: {
            block7: {
                Calendar calendar;
                bl2 = true;
                try {
                    calendar = Calendar.getInstance();
                    charSequence = "pgm_expiry";
                }
                catch (NumberFormatException numberFormatException2) {}
                charSequence = this.E((String)charSequence);
                if (charSequence == null) break block7;
                boolean bl3 = kotlin.text.b.k(charSequence);
                if (bl3) break block7;
                bl3 = TextUtils.isDigitsOnly((CharSequence)charSequence);
                if (!bl3) break block7;
                long l2 = Long.parseLong((String)charSequence);
                long l3 = calendar.getTimeInMillis();
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 > 0) break block7;
                bl2 = false;
                break block8;
            }
            return bl2;
        }
        charSequence = new StringBuilder();
        j_0.n(this.a, (StringBuilder)charSequence, ": NumberFormatException while checking PGM Expiry Time: ");
        Object object = Utility.INSTANCE.printStacktrace(numberFormatException2);
        ((StringBuilder)charSequence).append((String)object);
        Intrinsics.checkNotNullParameter(((StringBuilder)charSequence).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        return bl2;
    }

    public final void k() {
        int n3;
        Object object;
        Object object2 = new StringBuilder();
        Object object3 = this.a;
        j_0.i((com.jio.jioads.common.b)object3, (StringBuilder)object2, ": pgm giving on prepare callback");
        object2 = JioAds.Companion;
        ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object4 = JioAds$LogLevel.NONE;
        object4 = object3.n();
        if (object4 != null) {
            boolean bl2 = true;
            ((JioAdView)object4).setPlaceHolderPGMPrepared$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(bl2);
        }
        object4 = this.s;
        if (object4 != null && (object4 = ((com.jio.jioads.common.a)object4).c) != null && (object4 = ((com.jio.jioads.multiad.model.e)object4).a) != null && (object4 = (HashMap)((HashMap)object4).get(object = "pgm")) != null) {
            object4 = (com.jio.jioads.multiad.model.f)((HashMap)object4).get(object);
        } else {
            n3 = 0;
            object4 = null;
        }
        long l2 = -1;
        if (object4 != null) {
            long l3 = ((com.jio.jioads.multiad.model.f)object4).i;
            long l4 = l3 - l2;
            Object object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object5 != false) {
                long l7;
                object = Calendar.getInstance();
                n3 = (int)((com.jio.jioads.multiad.model.f)object4).i;
                int n4 = 12;
                ((Calendar)object).add(n4, n3);
                this.P = l7 = ((Calendar)object).getTime().getTime();
                object3 = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object3, ": PGM expiry set to ");
                object4 = ((Calendar)object).getTime();
                ((StringBuilder)object3).append(object4);
                object3 = ((StringBuilder)object3).toString();
                object4 = "message";
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                object2 = ((JioAds$Companion)object2).getInstance();
                ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            }
            l2 = this.P;
        }
        this.P = l2;
        object2 = JioAdView$AdState.RECEIVED;
        object3 = (V)this.b;
        ((V)object3).e((JioAdView$AdState)((Object)object2));
        ((V)object3).o();
        object2 = JioAdView$AdState.PREPARED;
        ((V)object3).e((JioAdView$AdState)((Object)object2));
        ((V)object3).n();
    }

    public final void l() {
        Object object;
        int n3;
        Object object2;
        com.jio.jioads.common.b b2 = this.a;
        Object object3 = b2.k0();
        if (object3 == (object2 = JioAdView$AdState.DESTROYED)) {
            return;
        }
        if ((b2 = b2.Y()) == null) {
            return;
        }
        object3 = this.s;
        int n4 = 0;
        object2 = null;
        if (object3 != null && (object3 = ((com.jio.jioads.common.a)object3).c) != null) {
            object3 = ((com.jio.jioads.multiad.model.e)object3).b;
        } else {
            n3 = 0;
            object3 = null;
        }
        int n7 = this.g0();
        if (n7 != 0 && object3 != null && (object = ((com.jio.jioads.multiad.model.c)object3).q) != null && (n7 = ((Integer)object).intValue()) != 0 && (object = this.f) != null) {
            object = this.b0();
            Object object4 = "multiad_pref";
            t t3 = null;
            Object object5 = "";
            object = j_0.d((Context)b2, (String)object4, 0, object5, (String)object);
            String string2 = "null cannot be cast to non-null type kotlin.String";
            Intrinsics.checkNotNull(object, string2);
            object = (String)object;
            n7 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            Object object6 = "multiAdUtility";
            if (n7 != 0) {
                int n8;
                object = com.jio.jioads.multiad.N.a;
                object = this.b0();
                object3 = ((com.jio.jioads.multiad.model.c)object3).q;
                Intrinsics.checkNotNull(object3);
                n3 = (Integer)object3;
                object4 = this.f;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n8 = 0;
                    object4 = null;
                }
                n8 = ((t)object4).k;
                t3 = this.f;
                if (t3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                } else {
                    object2 = t3;
                }
                n4 = ((t)object2).l;
                com.jio.jioads.multiad.N.c((Context)b2, n3, n8, (String)object, n4);
            } else {
                int n10;
                object = com.jio.jioads.multiad.N.a;
                object = this.b0();
                object3 = ((com.jio.jioads.multiad.model.c)object3).q;
                Intrinsics.checkNotNull(object3);
                n3 = (Integer)object3;
                Object object7 = this.f;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n10 = 0;
                    object7 = null;
                }
                n10 = ((t)object7).k;
                t t4 = this.f;
                if (t4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                } else {
                    object2 = t4;
                }
                n4 = ((t)object2).l;
                Intrinsics.checkNotNullParameter(b2, "context");
                object6 = "tmsKey";
                Intrinsics.checkNotNullParameter(object, (String)object6);
                object5 = j_0.d((Context)b2, (String)object4, 0, object5, (String)object);
                Intrinsics.checkNotNull(object5, string2);
                object5 = (String)object5;
                boolean bl2 = TextUtils.isEmpty((CharSequence)object5);
                if (!bl2) {
                    string2 = new JSONObject((String)object5);
                    object5 = "expiredAds";
                    int n14 = string2.getInt((String)object5) + n4;
                    string2.put((String)object5, n14);
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(": updating expiredAds: ");
                    ((StringBuilder)object2).append(n14);
                    object2 = ((StringBuilder)object2).toString();
                    object5 = "message";
                    Intrinsics.checkNotNullParameter(object2, (String)object5);
                    object2 = JioAds.Companion;
                    ((JioAds$Companion)object2).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object6 = JioAds$LogLevel.NONE;
                    object6 = Calendar.getInstance(Locale.ENGLISH);
                    object7 = "tms";
                    long l2 = string2.getLong((String)object7);
                    long l3 = ((Calendar)object6).getTimeInMillis();
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 < 0) {
                        object7 = TimeUnit.MINUTES;
                        long l7 = n3;
                        l2 = ((TimeUnit)((Object)object7)).toMillis(l7);
                        l3 = ((Calendar)object6).getTimeInMillis() + l2;
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append((String)object);
                        object6 = ": updating tms: ";
                        ((StringBuilder)object3).append((String)object6);
                        ((StringBuilder)object3).append(l3);
                        Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), (String)object5);
                        object3 = ((JioAds$Companion)object2).getInstance();
                        ((JioAds)object3).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    }
                    object3 = string2.toString();
                    j_0.p((Context)b2, (String)object4, 0, object3, (String)object);
                } else {
                    com.jio.jioads.multiad.N.c((Context)b2, n3, n10, (String)object, n4);
                }
            }
        }
    }

    public final Integer n(String string2) {
        block11: {
            block12: {
                Object object;
                block15: {
                    block14: {
                        Object object2;
                        block13: {
                            int n3;
                            int n4;
                            Integer n7;
                            Intrinsics.checkNotNullParameter(string2, "property");
                            object2 = this.s;
                            object = object2 != null && (object = ((com.jio.jioads.common.a)object2).c) != null ? ((com.jio.jioads.multiad.model.e)object).b : null;
                            if (object != null) {
                                n7 = ((com.jio.jioads.multiad.model.c)object).k;
                            } else {
                                n4 = 0;
                                n7 = null;
                            }
                            if (n7 == null) {
                                object = object2 != null && (object2 = ((com.jio.jioads.common.a)object2).b) != null ? ((com.jio.jioads.multiad.model.e)object2).b : null;
                            }
                            if (object == null) break block11;
                            object2 = ((com.jio.jioads.multiad.model.c)object).k;
                            if (object2 == null || (n3 = ((Integer)object2).intValue()) != (n4 = 1)) break block12;
                            n3 = string2.hashCode();
                            if (n3 == (n4 = 3444851)) break block13;
                            n4 = 3445161;
                            if (n3 != n4) {
                                boolean bl2;
                                n4 = 3446462;
                                if (n3 == n4 && (bl2 = string2.equals(object2 = "podc"))) {
                                    return ((com.jio.jioads.multiad.model.c)object).l;
                                }
                            } else {
                                object2 = "pmxd";
                                boolean bl3 = string2.equals(object2);
                                if (bl3) {
                                    return ((com.jio.jioads.multiad.model.c)object).n;
                                }
                            }
                            break block14;
                        }
                        object2 = "pmnd";
                        boolean bl4 = string2.equals(object2);
                        if (bl4) break block15;
                    }
                    return 0;
                }
                return ((com.jio.jioads.multiad.model.c)object).m;
            }
            return 0;
        }
        return null;
    }

    public final JSONArray p(Map object) {
        Object object2;
        block18: {
            CharSequence charSequence = "message";
            Object object3 = this.a;
            String string2 = "med";
            object2 = new JSONArray();
            if (object != null) {
                Constants$ResponseHeaderKeys constants$ResponseHeaderKeys = Constants$ResponseHeaderKeys.JIO_DATA;
                String string3 = constants$ResponseHeaderKeys.getResponseHeader();
                Locale locale = Locale.ROOT;
                string3 = string3.toLowerCase(locale);
                String string4 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                Intrinsics.checkNotNullExpressionValue(string3, string4);
                boolean bl2 = object.containsKey(string3);
                boolean bl3 = true;
                if (bl2 == bl3) {
                    object = constants$ResponseHeaderKeys.getResponseHeader().toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object, string4);
                    object = this.E((String)object);
                    object = String.valueOf(object);
                    constants$ResponseHeaderKeys = new JSONObject((String)object);
                    bl2 = constants$ResponseHeaderKeys.has(string2);
                    if (!bl2) break block18;
                    object = new StringBuilder();
                    string3 = object3.P();
                    ((StringBuilder)object).append(string3);
                    string3 = ": initMediationHeaderArray for Single Ad ";
                    ((StringBuilder)object).append(string3);
                    object = ((StringBuilder)object).toString();
                    Intrinsics.checkNotNullParameter(object, charSequence);
                    object = JioAds.Companion;
                    object = ((JioAds$Companion)object).getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = constants$ResponseHeaderKeys.getString(string2);
                    boolean bl4 = TextUtils.isEmpty((CharSequence)object);
                    if (bl4) break block18;
                    try {
                        charSequence = new JSONArray((String)object);
                        object2 = charSequence;
                    }
                    catch (Exception exception) {
                        charSequence = com.jio.jioads.controller.m.a((com.jio.jioads.common.b)object3, ": Getting error in Mediation Header For SingleAd: ");
                        object3 = Utility.INSTANCE;
                        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object3, exception, (StringBuilder)charSequence);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                    }
                }
            }
        }
        return object2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void q(ViewGroup viewGroup, Constants$CompanionAdSize constants$CompanionAdSize, Drawable drawable2, Drawable drawable3) {
        void var13_24;
        Intrinsics.checkNotNullParameter((Object)constants$CompanionAdSize, "containerSize");
        String string2 = constants$CompanionAdSize.getCompanionAdSize();
        String[] stringArray = new String[]{"x"};
        int n3 = 6;
        List list = StringsKt.a0(string2, stringArray, false, 0, n3);
        String[] stringArray2 = new String[]{};
        String[] stringArray3 = list.toArray(stringArray2);
        String string3 = stringArray3[0];
        int n4 = 1;
        String string4 = stringArray3[n4];
        Object object = new StringBuilder();
        Object object2 = this.a;
        String string5 = ": setInstreamAudioAdContainer is called by pub.companionAd Width: ";
        j_0.n((com.jio.jioads.common.b)object2, (StringBuilder)object, string5);
        ViewGroup viewGroup2 = this.J;
        ((StringBuilder)object).append(viewGroup2);
        String string6 = " and companionAd Height: ";
        ((StringBuilder)object).append(string6);
        ViewGroup viewGroup3 = this.J;
        int n7 = 0;
        Object object3 = null;
        if (viewGroup3 != null) {
            int n8 = viewGroup3.getId();
            Integer n10 = n8;
        } else {
            boolean bl2 = false;
            Object var13_23 = null;
        }
        ((StringBuilder)object).append(var13_24);
        object = ((StringBuilder)object).toString();
        String string7 = "message";
        Intrinsics.checkNotNullParameter(object, string7);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        ViewGroup viewGroup4 = this.J;
        if (viewGroup4 != null) {
            int n14 = viewGroup4.getId();
            Integer n15 = n14;
            if (viewGroup != null) {
                n7 = viewGroup.getId();
                object3 = n7;
            }
            if ((n7 = (int)(Intrinsics.areEqual(n15, object3) ? 1 : 0)) != 0 && (n7 = (int)(Intrinsics.areEqual(object3 = this.K, string3) ? 1 : 0)) != 0 && (n7 = (int)(Intrinsics.areEqual(object3 = this.L, string4) ? 1 : 0)) != 0) {
                String string8 = "Audio companion Container & size params already set";
                v12.a(string8, string7, (JioAds$Companion)object);
                return;
            }
        }
        object3 = new StringBuilder();
        object2 = object2.P();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(string5);
        ((StringBuilder)object3).append(string3);
        ((StringBuilder)object3).append(string6);
        d90_0.b((StringBuilder)object3, string4, string7, (JioAds$Companion)object);
        this.J = viewGroup;
        this.K = string3;
        this.L = string4;
        this.M = drawable2;
        this.N = drawable3;
        object = this.r;
        if (object == null) return;
        int n16 = Integer.parseInt(string3);
        int n17 = Integer.parseInt(string4);
        Object object4 = object;
        n4 = n17;
        object2 = drawable2;
        string5 = drawable3;
        ((com.jio.jioads.common.d)object).setAudioCompanionContainer(viewGroup, n16, n17, drawable2, drawable3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void r(e0 object) {
        long l2;
        Object object2;
        this.w = object;
        object = this.a;
        JioAdView$AdState jioAdView$AdState = object.k0();
        if (jioAdView$AdState == (object2 = JioAdView$AdState.DESTROYED)) {
            return;
        }
        Context context = object.Y();
        if (context == null) {
            return;
        }
        object2 = com.jio.jioads.multiad.N.a;
        object2 = object.P();
        long l3 = com.jio.jioads.multiad.N.a(context, (String)object2);
        long l4 = l3 - (l2 = 0L);
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 >= 0) {
            object.h(l3);
            return;
        }
        Utility.INSTANCE.getCurrentUIModeType(context);
        object2 = this.r;
        if (object2 != null) {
            ((com.jio.jioads.common.d)object2).onCacheAd();
        }
        if ((object2 = this.U()) != null) {
            boolean bl2;
            Intrinsics.checkNotNullParameter(object2, "filteredPackageName");
            Object object4 = com.jio.jioads.multiad.N.b;
            boolean bl3 = true;
            if (object4 == null || (object2 = (com.jio.jioads.util.f)((HashMap)object4).get(object2)) == null || (bl2 = ((com.jio.jioads.util.f)object2).i) != bl3) {
                void var12_20;
                object2 = this.U();
                object4 = com.jio.jioads.multiad.N.c;
                if (object4 != null && (bl2 = ((HashMap)object4).containsKey(object2)) == bl3) {
                    String string2 = ": MasterConfig fetching is already in progress so adding into queue";
                    com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object, string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    this.P();
                    return;
                }
                l3 = System.currentTimeMillis();
                String string3 = this.U();
                if (string3 == null) {
                    String string4 = "";
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(var12_20, "packageName");
                String string5 = "master_config_expiry_";
                String string6 = string5.concat((String)var12_20);
                long l7 = -1;
                Long l8 = l7;
                String string7 = "master_config_pref";
                int n3 = 3;
                Object object5 = j_0.d(context, string7, n3, l8, string6);
                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type kotlin.Long");
                long l12 = (Long)object5;
                StringBuilder stringBuilder = new StringBuilder();
                String string8 = object.P();
                stringBuilder.append(string8);
                stringBuilder.append(": Current time: ");
                stringBuilder.append(l3);
                stringBuilder.append(" and master config Expiry time: ");
                stringBuilder.append(l12);
                Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
                JioAds$Companion jioAds$Companion = JioAds.Companion;
                jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                long l14 = l12 == l7 ? 0 : (l12 < l7 ? -1 : 1);
                if (l14 == false) {
                    object2 = new StringBuilder();
                    object4 = ": Master config doesn't exist";
                    j_0.i((com.jio.jioads.common.b)object, (StringBuilder)object2, (String)object4);
                    object = jioAds$Companion.getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    this.P();
                    return;
                }
                Object object6 = l3 == l12 ? 0 : (l3 < l12 ? -1 : 1);
                if (object6 >= 0) {
                    object2 = new StringBuilder();
                    object4 = ": Master config expired";
                    j_0.i((com.jio.jioads.common.b)object, (StringBuilder)object2, (String)object4);
                    object = jioAds$Companion.getInstance();
                    ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    this.P();
                    return;
                }
                this.e();
                return;
            }
        }
        String string9 = ": Fibo timer is running, not fetching master config again, proceeding.";
        com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object, string9);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.e();
    }

    public final void s(com.jio.jioads.instreamads.vmapParser.model.c c2, int n3, JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener, String string2, String string3, String string4, JioAdsMetadata jioAdsMetadata) {
        boolean bl2;
        com.jio.jioads.instream.video.vodVmap.m m2;
        int n4;
        Object object;
        o o3 = this;
        com.jio.jioads.instreamads.vmapParser.model.c c3 = c2;
        JioVmapAdsLoader$JioVmapListener jioVmapAdsLoader$JioVmapListener2 = jioVmapAdsLoader$JioVmapListener;
        Object object2 = jioAdsMetadata;
        Intrinsics.checkNotNullParameter(c2, "vmap");
        com.jio.jioads.common.b b2 = this.a;
        Object object3 = b2.k0();
        Object object4 = JioAdView$AdState.DESTROYED;
        if (object3 == object4) {
            return;
        }
        object3 = b2.Y();
        if (jioAdsMetadata != null) {
            object = object2 = jioAdsMetadata.getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)object3);
        } else {
            n4 = 0;
            object = null;
        }
        object4 = o3.b;
        Object object5 = o3.Q;
        object3 = o3.a;
        object2 = m2;
        Object object6 = jioVmapAdsLoader$JioVmapListener;
        Object object7 = c2;
        o3.g = m2 = new com.jio.jioads.instream.video.vodVmap.m((com.jio.jioads.common.b)object3, (a)object4, (f)object5, jioVmapAdsLoader$JioVmapListener, c2, (HashMap)object, n3, string2, string3, string4);
        m2.v = bl2 = o3.y;
        m2.x = bl2 = o3.z;
        object2 = CollectionsKt.k0(c3.a.keySet());
        StringBuilder stringBuilder = com.jio.jioads.controller.m.a(b2, ": Cue Points detected: ");
        object7 = com.jio.jioads.controller.i.c;
        object6 = null;
        n4 = 31;
        object3 = object2;
        object3 = CollectionsKt.R((Iterable)object2, null, null, null, (Function1)object7, n4);
        object4 = "message";
        ir3_0.b(stringBuilder, (String)object3, (String)object4);
        object3 = JioAds.Companion;
        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object5 = JioAds$LogLevel.NONE;
        object5 = "start";
        bl2 = object2.contains(object5);
        if (bl2) {
            object2 = o3.g;
            Intrinsics.checkNotNull(object2);
            ((com.jio.jioads.instream.video.vodVmap.m)object2).o = object6 = ((com.jio.jioads.instream.video.vodVmap.m)object2).h;
            object6 = ((com.jio.jioads.instream.video.vodVmap.m)object2).e;
            if (object6 != null) {
                Intrinsics.checkNotNull(object6);
                object7 = ((com.jio.jioads.instreamads.vmapParser.model.c)object6).a;
                n4 = (int)(object7.containsKey(object5) ? 1 : 0);
                if (n4 != 0) {
                    Intrinsics.checkNotNull(object6);
                    object6 = (b)object7.get(object5);
                    if (object6 != null) {
                        object7 = "vmap: Starting preparation of preroll ad";
                        v12.a((String)object7, (String)object4, (JioAds$Companion)object3);
                        object3 = ((b)object6).c;
                        object4 = null;
                        ((com.jio.jioads.instream.video.vodVmap.m)object2).e((String)object5, 0, (List)object3);
                    }
                }
            }
        } else {
            object2 = new StringBuilder();
            object4 = ": Preroll Ads not available in vmap";
            j_0.i(b2, (StringBuilder)object2, (String)object4);
            object2 = ((JioAds$Companion)object3).getInstance();
            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (jioVmapAdsLoader$JioVmapListener2 != null) {
                object3 = JioAdEvent$AdEventType.CONTENT_RESUME_REQUESTED;
                object2 = new JioAdEvent((JioAdEvent$AdEventType)((Object)object3));
                object3 = null;
                jioVmapAdsLoader$JioVmapListener2.onJioVmapEvent((JioAdEvent)object2, null);
            }
        }
    }

    public final void t(com.jio.jioads.multiad.model.b object, g object2, com.jio.jioads.multiad.model.c object3, JSONObject jSONObject) {
        boolean bl2;
        Object object4;
        Object object5;
        Object object6;
        String string2;
        if (object != null) {
            string2 = ((com.jio.jioads.multiad.model.b)object).f;
            if (string2 != null) {
                boolean bl3 = "1".equalsIgnoreCase(string2);
                object6 = "application/xml";
                object5 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                if (bl3) {
                    string2 = Constants$HeaderKeys.Content_Type.getKey();
                    object4 = Locale.ROOT;
                    string2 = string2.toLowerCase((Locale)object4);
                    Intrinsics.checkNotNullExpressionValue(string2, (String)object5);
                    jSONObject.put(string2, object6);
                } else {
                    object4 = "0";
                    string2 = ((com.jio.jioads.multiad.model.b)object).f;
                    bl3 = ((String)object4).equalsIgnoreCase(string2);
                    if (bl3) {
                        string2 = Constants$HeaderKeys.Content_Type.getKey();
                        object6 = Locale.ROOT;
                        string2 = string2.toLowerCase((Locale)object6);
                        Intrinsics.checkNotNullExpressionValue(string2, (String)object5);
                        object6 = "application/json";
                        jSONObject.put(string2, object6);
                    } else {
                        object4 = "2";
                        string2 = ((com.jio.jioads.multiad.model.b)object).f;
                        bl3 = ((String)object4).equalsIgnoreCase(string2);
                        if (bl3) {
                            string2 = Constants$HeaderKeys.Content_Type.getKey();
                            object6 = Locale.ROOT;
                            string2 = string2.toLowerCase((Locale)object6);
                            Intrinsics.checkNotNullExpressionValue(string2, (String)object5);
                            object6 = "text/html";
                            jSONObject.put(string2, object6);
                        } else {
                            object4 = "3";
                            string2 = ((com.jio.jioads.multiad.model.b)object).f;
                            bl3 = ((String)object4).equalsIgnoreCase(string2);
                            if (bl3) {
                                string2 = Constants$HeaderKeys.Content_Type.getKey();
                                object4 = Locale.ROOT;
                                string2 = string2.toLowerCase((Locale)object4);
                                Intrinsics.checkNotNullExpressionValue(string2, (String)object5);
                                jSONObject.put(string2, object6);
                            }
                        }
                    }
                }
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).g) != null) {
                object6 = "cid";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).h) != null) {
                object6 = "adr";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).d) != null) {
                object6 = "vd";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).a) != null) {
                object6 = "mdc";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).e) != null) {
                object6 = "skd";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).c) != null) {
                object6 = "vce";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).b) != null) {
                object6 = "fbk";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).k) != null) {
                object6 = "ao";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).i) != null) {
                object6 = "im";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).j) != null) {
                object6 = "vim";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).m) != null) {
                object6 = "inl";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).l) != null) {
                object6 = "wh";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).o) != null) {
                object6 = "strm";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((string2 = ((com.jio.jioads.multiad.model.b)object).p) != null) {
                object6 = "oia";
                jSONObject.put((String)object6, (Object)string2);
            }
            if ((object = ((com.jio.jioads.multiad.model.b)object).q) != null) {
                string2 = "mim";
                jSONObject.put(string2, object);
            }
        }
        if (object2 != null) {
            object = ((g)object2).a;
            if (object != null) {
                string2 = "fcr";
                jSONObject.put(string2, object);
            }
            if ((object = ((g)object2).b) != null) {
                string2 = "e";
                jSONObject.put(string2, object);
            }
            if ((object = ((g)object2).c) != null) {
                object2 = "aci";
                jSONObject.put((String)object2, object);
            }
        }
        object = "adseq";
        object2 = "plr";
        string2 = "nwhit";
        object6 = "adrt";
        if (object3 != null) {
            object5 = ((com.jio.jioads.multiad.model.c)object3).g;
            if (object5 != null) {
                jSONObject.put((String)object6, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).e) != null) {
                object4 = "at";
                jSONObject.put((String)object4, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).d) != null) {
                object4 = "ma";
                jSONObject.put((String)object4, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).u) != null) {
                object4 = "fre";
                jSONObject.put((String)object4, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).h) != null) {
                object4 = "mdt";
                jSONObject.put((String)object4, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).a) != null && !(bl2 = TextUtils.isEmpty((CharSequence)object5))) {
                object5 = ((com.jio.jioads.multiad.model.c)object3).a;
                object4 = "med";
                jSONObject.put((String)object4, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).j) != null) {
                jSONObject.put(string2, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).i) != null) {
                jSONObject.put((String)object2, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).m) != null) {
                object4 = "pmnd";
                jSONObject.put((String)object4, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).n) != null) {
                object4 = "pmxd";
                jSONObject.put((String)object4, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).k) != null) {
                object4 = "pod";
                jSONObject.put((String)object4, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).l) != null) {
                object4 = "podc";
                jSONObject.put((String)object4, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).f) != null) {
                object4 = "rwin";
                jSONObject.put((String)object4, object5);
            }
            if ((object5 = ((com.jio.jioads.multiad.model.c)object3).b) != null) {
                object4 = "vr";
                jSONObject.put((String)object4, object5);
            }
            if ((object3 = ((com.jio.jioads.multiad.model.c)object3).s) != null) {
                jSONObject.put((String)object, object3);
            }
        }
        object3 = this.s;
        bl2 = false;
        object5 = null;
        if ((object3 = object3 != null ? ((com.jio.jioads.common.a)object3).a : null) != null) {
            String string3;
            object4 = ((com.jio.jioads.multiad.model.d)object3).c;
            if (object4 != null) {
                string3 = "ae";
                jSONObject.put(string3, object4);
            }
            if ((object4 = ((com.jio.jioads.multiad.model.d)object3).b) != null) {
                string3 = "ls";
                jSONObject.put(string3, object4);
            }
            if ((object4 = ((com.jio.jioads.multiad.model.d)object3).a) != null) {
                string3 = "csl";
                jSONObject.put(string3, object4);
            }
            if ((object3 = ((com.jio.jioads.multiad.model.d)object3).d) != null) {
                object4 = "loc";
                jSONObject.put((String)object4, object3);
            }
        }
        if ((object3 = this.s) != null && (object3 = ((com.jio.jioads.common.a)object3).c) != null) {
            object5 = ((com.jio.jioads.multiad.model.e)object3).b;
        }
        if (object5 != null) {
            object3 = ((com.jio.jioads.multiad.model.c)object5).s;
            if (object3 != null) {
                jSONObject.put((String)object, object3);
            }
            if ((object = ((com.jio.jioads.multiad.model.c)object5).g) != null) {
                jSONObject.put((String)object6, object);
            }
            if ((object = ((com.jio.jioads.multiad.model.c)object5).j) != null) {
                jSONObject.put(string2, object);
            }
            if ((object = ((com.jio.jioads.multiad.model.c)object5).i) != null) {
                jSONObject.put((String)object2, object);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void u(String string2, int n3, int n4, boolean bl2) {
        block20: {
            boolean bl3;
            Object object;
            o o3 = this;
            String string3 = string2;
            com.jio.jioads.common.b b2 = this.a;
            JioAdView$AdState jioAdView$AdState = b2.k0();
            if (jioAdView$AdState == (object = JioAdView$AdState.DESTROYED)) break block20;
            jioAdView$AdState = b2.Y();
            object = new StringBuilder();
            Object object2 = ": Inside adReportingToServer: ErrorTitle= ";
            l_0.d(b2, (StringBuilder)object, (String)object2, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            object = this.s;
            if (object == null || (object = ((com.jio.jioads.common.a)object).b) == null || (object = ((com.jio.jioads.multiad.model.e)object).d) == null) break block20;
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                Object object3;
                boolean bl4;
                Object object4;
                Object object5;
                String string4;
                Object object6;
                Map map2;
                int n7;
                f f5;
                block22: {
                    block27: {
                        int n8;
                        int n10;
                        block30: {
                            void var17_30;
                            block29: {
                                void var17_28;
                                block28: {
                                    String string5;
                                    block23: {
                                        block26: {
                                            void var17_23;
                                            block25: {
                                                void var17_21;
                                                block24: {
                                                    block21: {
                                                        object2 = (String)object.next();
                                                        n10 = b2.N();
                                                        f5 = o3.Q;
                                                        n7 = 1;
                                                        map2 = null;
                                                        if (n10 != 0) break block21;
                                                        this.Q(string2);
                                                        break block22;
                                                    }
                                                    com.jio.jioads.audioplayer.b.a(b2, ": Reporting To Server for VMAP");
                                                    object6 = JioAds.Companion;
                                                    ((JioAds$Companion)object6).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                    JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                                                    String string6 = "0";
                                                    string4 = "1";
                                                    if (!bl2) break block23;
                                                    n10 = n3 - n4;
                                                    n8 = TextUtils.isEmpty((CharSequence)string2);
                                                    if (n8 == 0) break block24;
                                                    o3.h = object6 = String.valueOf(n3);
                                                    o3.i = object6 = String.valueOf(n3);
                                                    o3.j = string4;
                                                    break block22;
                                                }
                                                n8 = TextUtils.isEmpty((CharSequence)string2);
                                                if (n8 != 0) break block25;
                                                object5 = Utility.INSTANCE;
                                                Intrinsics.checkNotNull(string2);
                                                n8 = ((Utility)object5).isSDKError(string3);
                                                if (n8 == 0) break block25;
                                                o3.h = object5 = String.valueOf(n3);
                                                o3.i = object5 = String.valueOf(n10);
                                                if (n10 > 0) {
                                                    String string7 = string4;
                                                }
                                                o3.j = var17_21;
                                                break block22;
                                            }
                                            if ((n8 = TextUtils.isEmpty((CharSequence)string2)) != 0) break block26;
                                            object5 = Utility.INSTANCE;
                                            Intrinsics.checkNotNull(string2);
                                            n8 = (int)(((Utility)object5).isDeliveryError(string3) ? 1 : 0);
                                            if (n8 == 0) break block26;
                                            o3.h = object5 = String.valueOf(n3);
                                            o3.i = object5 = String.valueOf(n10);
                                            if (n10 > 0) {
                                                String string8 = string4;
                                            }
                                            o3.j = var17_23;
                                            break block22;
                                        }
                                        if ((n8 = TextUtils.isEmpty((CharSequence)string2)) == 0) {
                                            object5 = Utility.INSTANCE;
                                            Intrinsics.checkNotNull(string2);
                                            n8 = (int)(((Utility)object5).isApplicationError(string3) ? 1 : 0);
                                            if (n8 != 0) {
                                                void var17_25;
                                                o3.h = object5 = String.valueOf(n10);
                                                o3.i = object5 = String.valueOf(n10);
                                                if (n10 > 0) {
                                                    String string9 = string4;
                                                }
                                                o3.j = var17_25;
                                            }
                                        }
                                        break block22;
                                    }
                                    object5 = o3.s;
                                    if (object5 != null && (object4 = ((com.jio.jioads.common.a)object5).c) != null) {
                                        object4 = ((com.jio.jioads.multiad.model.e)object4).b;
                                    } else {
                                        bl4 = false;
                                        object4 = null;
                                    }
                                    object3 = object4 != null ? ((com.jio.jioads.multiad.model.c)object4).k : null;
                                    if (object3 == null) {
                                        if (object5 != null && (object5 = ((com.jio.jioads.common.a)object5).b) != null) {
                                            object4 = ((com.jio.jioads.multiad.model.e)object5).b;
                                        } else {
                                            bl4 = false;
                                            object4 = null;
                                        }
                                    }
                                    if (object4 != null) {
                                        object5 = ((com.jio.jioads.multiad.model.c)object4).k;
                                        Intrinsics.checkNotNull(object5);
                                        n8 = (Integer)object5;
                                    } else {
                                        n8 = 0;
                                        object5 = null;
                                    }
                                    if (n8 != n7 || (n8 = (int)(f5.n() ? 1 : 0)) == 0) break block27;
                                    object5 = new StringBuilder();
                                    object4 = " POD is Enabled";
                                    j_0.i(b2, (StringBuilder)object5, (String)object4);
                                    ((JioAds$Companion)object6).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object6 = o3.n("podc");
                                    Intrinsics.checkNotNull(object6);
                                    n10 = (Integer)object6;
                                    n8 = n10 - n4;
                                    bl4 = TextUtils.isEmpty((CharSequence)string2);
                                    if (!bl4) break block28;
                                    o3.h = string5 = String.valueOf(n10);
                                    o3.i = object6 = String.valueOf(n10);
                                    o3.j = string4;
                                    break block22;
                                }
                                bl4 = TextUtils.isEmpty((CharSequence)string2);
                                if (bl4) break block29;
                                object4 = Utility.INSTANCE;
                                Intrinsics.checkNotNull(string2);
                                bl4 = ((Utility)object4).isSDKError(string3);
                                if (!bl4) break block29;
                                o3.h = object6 = String.valueOf(n10);
                                o3.i = object6 = String.valueOf(n8);
                                if (n8 > 0) {
                                    String string10 = string4;
                                }
                                o3.j = var17_28;
                                break block22;
                            }
                            if (bl4 = TextUtils.isEmpty((CharSequence)string2)) break block30;
                            object4 = Utility.INSTANCE;
                            Intrinsics.checkNotNull(string2);
                            bl4 = ((Utility)object4).isDeliveryError(string3);
                            if (!bl4) break block30;
                            o3.h = object6 = String.valueOf(n10);
                            o3.i = object6 = String.valueOf(n8);
                            if (n8 > 0) {
                                String string11 = string4;
                            }
                            o3.j = var17_30;
                            break block22;
                        }
                        if ((n10 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0)) == 0) {
                            object6 = Utility.INSTANCE;
                            Intrinsics.checkNotNull(string2);
                            n10 = (int)(((Utility)object6).isApplicationError(string3) ? 1 : 0);
                            if (n10 != 0) {
                                void var17_32;
                                o3.h = object6 = String.valueOf(n8);
                                o3.i = object6 = String.valueOf(n8);
                                if (n8 > 0) {
                                    String string12 = string4;
                                }
                                o3.j = var17_32;
                            }
                        }
                        break block22;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    string4 = " POD is Disabled";
                    j_0.i(b2, stringBuilder, string4);
                    object6 = ((JioAds$Companion)object6).getInstance();
                    ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    this.Q(string2);
                }
                object6 = Utility.INSTANCE;
                String string13 = o3.h;
                object2 = ((Utility)object6).replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2, "adreqs", string13, n7 != 0);
                String string14 = o3.i;
                object2 = ((Utility)object6).replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2, "adres", string14, n7 != 0);
                String string15 = o3.j;
                string4 = "fs";
                object3 = ((Utility)object6).replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2, string4, string15, n7 != 0);
                object2 = new StringBuilder();
                String string16 = " replaced url for reporting ";
                l_0.d(b2, (StringBuilder)object2, string16, (String)object3);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = o3.m;
                if (object2 == null) {
                    object2 = new com.jio.jioads.network.c((Context)jioAdView$AdState);
                    o3.m = object2;
                }
                object5 = o3.m;
                Intrinsics.checkNotNull(object5);
                if (jioAdView$AdState != null) {
                    map2 = ((Utility)object6).getUserAgentHeader((Context)jioAdView$AdState);
                }
                Integer n14 = 0;
                object2 = f5.a;
                bl3 = ((o)object2).a();
                Boolean bl5 = bl3;
                bl4 = false;
                object4 = null;
                ((com.jio.jioads.network.c)object5).b(0, (String)object3, null, map2, n14, null, bl5);
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void v(String string2, String string3) {
        com.jio.jioads.common.b b2;
        Object object;
        HashMap hashMap;
        HashMap hashMap2;
        Object object2;
        Object object3;
        CharSequence charSequence;
        String string4;
        o o3;
        block20: {
            Object object4;
            block16: {
                Object object5;
                block18: {
                    block17: {
                        Exception exception222;
                        String string5;
                        block19: {
                            String string6;
                            Object object6;
                            Object object7;
                            block15: {
                                o3 = this;
                                string4 = string2;
                                charSequence = string3;
                                object3 = "pod";
                                object2 = "campaignid";
                                hashMap2 = "cmps";
                                hashMap = "fcr";
                                string5 = "Exception in addFCAPCountToManager JioAdViewController ";
                                object = new StringBuilder();
                                String string7 = "message";
                                b2 = this.a;
                                l_0.d(b2, (StringBuilder)object, ": Inside addFCAPCount.keykey=", string3);
                                object = JioAds.Companion;
                                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object4 = JioAds$LogLevel.NONE;
                                object4 = new StringBuilder();
                                object7 = ": Inside addFCAPCount.campaignId=";
                                l_0.d(b2, (StringBuilder)object4, (String)object7, string2);
                                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object = b2.k0();
                                object4 = JioAdView$AdState.DESTROYED;
                                if (object == object4) {
                                    return;
                                }
                                object = b2.Y();
                                object4 = this.Q;
                                object7 = ((f)object4).a;
                                boolean bl2 = ((o)object7).o;
                                if (bl2) break block16;
                                object7 = this.t;
                                if (object7 == null) break block17;
                                object6 = Constants$ResponseHeaderKeys.JIO_DATA;
                                string6 = object6.getResponseHeader();
                                Locale locale = Locale.ROOT;
                                string6 = string6.toLowerCase(locale);
                                object5 = object4;
                                object4 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                                Intrinsics.checkNotNullExpressionValue(string6, (String)object4);
                                bl2 = object7.containsKey(string6);
                                boolean bl3 = true;
                                if (bl2 != bl3) break block18;
                                object7 = object6.getResponseHeader().toLowerCase(locale);
                                Intrinsics.checkNotNullExpressionValue(object7, (String)object4);
                                object4 = this.E((String)object7);
                                if (object4 == null) {
                                    object4 = "";
                                }
                                object7 = new JSONObject((String)object4);
                                boolean bl4 = object7.has((String)((Object)hashMap));
                                object6 = "toString(...)";
                                string6 = "mod";
                                if (!bl4) break block15;
                                string4 = object7.getString((String)((Object)hashMap));
                                {
                                    catch (Exception exception222) {}
                                }
                                try {
                                    object3 = new JSONObject(string4);
                                    boolean bl5 = object3.has((String)object2);
                                    if (!bl5) return;
                                    string4 = object3.getString((String)object2);
                                    boolean bl6 = TextUtils.isEmpty((CharSequence)string4);
                                    if (bl6) return;
                                    bl6 = object3.has(string6);
                                    if (!bl6) return;
                                    object2 = object3.getJSONObject(string6);
                                    bl6 = object2.has((String)((Object)hashMap));
                                    if (!bl6) return;
                                    object3 = object3.getJSONObject(string6);
                                    object3 = object3.getJSONObject((String)((Object)hashMap));
                                    object2 = new I((Context)object);
                                    hashMap2 = b2.P();
                                    object3 = object3.toString();
                                    Intrinsics.checkNotNullExpressionValue(object3, (String)object6);
                                    Intrinsics.checkNotNull(string3);
                                    ((I)object2).d((String)((Object)hashMap2), string4, (String)object3, (String)charSequence);
                                    return;
                                }
                                catch (Exception exception3) {
                                    charSequence = new StringBuilder(string5);
                                    object3 = Utility.INSTANCE;
                                    Object object8 = ((Utility)object3).printStacktrace(exception3);
                                    ((StringBuilder)charSequence).append((String)object8);
                                    object8 = ((StringBuilder)charSequence).toString();
                                    Intrinsics.checkNotNullParameter(object8, string7);
                                    object8 = JioAds.Companion;
                                    object8 = ((JioAds$Companion)object8).getInstance();
                                    ((JioAds)object8).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                    object8 = JioAds$LogLevel.NONE;
                                    return;
                                }
                                break block19;
                            }
                            boolean bl7 = object7.has((String)object3);
                            if (!bl7) return;
                            if (string4 == null) return;
                            bl7 = (object3 = object7.getJSONObject((String)object3)).has((String)((Object)hashMap2));
                            if (!bl7) return;
                            object2 = object3.getJSONObject((String)((Object)hashMap2));
                            bl7 = object2.has(string4);
                            if (!bl7) return;
                            object3 = object3.getJSONObject((String)((Object)hashMap2));
                            bl7 = (object3 = object3.getJSONObject(string4)).has((String)((Object)hashMap));
                            if (!bl7) return;
                            object2 = new JSONObject((String)(object3 = object3.getString((String)((Object)hashMap))));
                            boolean bl8 = object2.has(string6);
                            if (!bl8) return;
                            object3 = object2.getJSONObject(string6);
                            bl7 = object3.has((String)((Object)hashMap));
                            if (!bl7) return;
                            object2 = new I((Context)object);
                            hashMap2 = b2.P();
                            object3 = object3.getJSONObject((String)((Object)hashMap));
                            object3 = object3.toString();
                            Intrinsics.checkNotNullExpressionValue(object3, (String)object6);
                            Intrinsics.checkNotNull(string3);
                            ((I)object2).d((String)((Object)hashMap2), string4, (String)object3, (String)charSequence);
                            return;
                        }
                        charSequence = new StringBuilder(string5);
                        object3 = Utility.INSTANCE;
                        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object3, exception222, (StringBuilder)charSequence);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
                        return;
                    }
                    object5 = object4;
                }
                object3 = object5;
                break block20;
            }
            object3 = object4;
        }
        object3 = ((f)object3).a;
        boolean bl9 = ((o)object3).o;
        if (!bl9) return;
        bl9 = TextUtils.isEmpty((CharSequence)string2);
        if (bl9) return;
        object3 = o3.s;
        boolean bl10 = false;
        object2 = null;
        hashMap2 = object3 != null && (hashMap2 = ((com.jio.jioads.common.a)object3).c) != null ? ((com.jio.jioads.multiad.model.e)((Object)hashMap2)).a : null;
        if (hashMap2 != null) {
            if (object3 != null) {
                object3 = ((com.jio.jioads.common.a)object3).c;
            } else {
                bl9 = false;
                object3 = null;
            }
            Intrinsics.checkNotNull(object3);
            object3 = ((com.jio.jioads.multiad.model.e)object3).a;
            Intrinsics.checkNotNull(object3);
            object3 = com.jio.jioads.controller.o.m(string4, (HashMap)object3);
        } else {
            bl9 = false;
            object3 = null;
        }
        if (object3 == null && (hashMap = (hashMap2 = o3.s) != null && (hashMap = ((com.jio.jioads.common.a)((Object)hashMap2)).b) != null ? ((com.jio.jioads.multiad.model.e)((Object)hashMap)).a : null) != null) {
            if (hashMap2 != null) {
                object3 = ((com.jio.jioads.common.a)((Object)hashMap2)).b;
            } else {
                bl9 = false;
                object3 = null;
            }
            Intrinsics.checkNotNull(object3);
            object3 = ((com.jio.jioads.multiad.model.e)object3).a;
            Intrinsics.checkNotNull(object3);
            object3 = com.jio.jioads.controller.o.m(string4, (HashMap)object3);
        }
        if (object3 == null) return;
        object3 = ((com.jio.jioads.multiad.model.f)object3).b;
        if (object3 != null) {
            object2 = ((g)object3).a;
        }
        if (bl9 = TextUtils.isEmpty((CharSequence)object2)) return;
        object3 = new I((Context)object);
        hashMap2 = b2.P();
        Intrinsics.checkNotNull(string2);
        object2 = String.valueOf(object2);
        Intrinsics.checkNotNull(string3);
        ((I)object3).d((String)((Object)hashMap2), string4, (String)object2, (String)charSequence);
    }

    public final void x(String object, Map object2) {
        block24: {
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            block23: {
                block22: {
                    object7 = "message";
                    object6 = this.a;
                    object5 = new StringBuilder();
                    object4 = object6.P();
                    ((StringBuilder)object5).append((String)object4);
                    object4 = ": JioAdViewController mediationFlow() response:";
                    ((StringBuilder)object5).append((String)object4);
                    ((StringBuilder)object5).append((String)object);
                    object5 = ((StringBuilder)object5).toString();
                    Intrinsics.checkNotNullParameter(object5, (String)object7);
                    object5 = JioAds.Companion;
                    object4 = ((JioAds$Companion)object5).getInstance();
                    ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object4 = JioAds$LogLevel.NONE;
                    object4 = new StringBuilder();
                    object3 = object6.P();
                    ((StringBuilder)object4).append((String)object3);
                    object3 = ": JioAdViewController mediationFlow() headers:";
                    ((StringBuilder)object4).append((String)object3);
                    ((StringBuilder)object4).append(object2);
                    object2 = ((StringBuilder)object4).toString();
                    Intrinsics.checkNotNullParameter(object2, (String)object7);
                    object2 = ((JioAds$Companion)object5).getInstance();
                    ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = this.X();
                    object2 = ((Pair)object2).b;
                    object2 = (JSONArray)object2;
                    if (object2 == null) break block22;
                    object7 = null;
                    object2 = object2.optJSONObject(0);
                    break block23;
                }
                object2 = null;
            }
            object7 = this.r;
            if (object7 == null) break block24;
            object5 = this.t;
            try {
                ((com.jio.jioads.common.d)object7).onCacheMediationAd((JSONObject)object2, (String)object, (Map)object5);
            }
            catch (JSONException jSONException) {
                com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)object6, ": Error while parsing Mediation header");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = JioAdError.Companion;
                object2 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                object7 = "No ads in inventory";
                object5 = j_0.c((t_0)object, (JioAdError$JioAdErrorType)((Object)object2), (String)object7);
                object3 = com.jio.jioads.cdnlogging.d.a;
                object = this.b;
                object6 = object;
                object6 = (V)object;
                String string2 = "processSelectedPromotionalResponse";
                String string3 = "JioAdViewController";
                object4 = null;
                String string4 = "NoFillFromMediation";
                ((V)object6).d((JioAdError)object5, false, (com.jio.jioads.cdnlogging.d)((Object)object3), string2, string3, string4, null);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void y(String var1_1, Map var2_2, Boolean var3_3) {
        block181: {
            block179: {
                block178: {
                    block188: {
                        block177: {
                            block166: {
                                block176: {
                                    block175: {
                                        block174: {
                                            block173: {
                                                block172: {
                                                    block171: {
                                                        block170: {
                                                            block169: {
                                                                block168: {
                                                                    block167: {
                                                                        block165: {
                                                                            block183: {
                                                                                block184: {
                                                                                    block185: {
                                                                                        block186: {
                                                                                            block187: {
                                                                                                block164: {
                                                                                                    block182: {
                                                                                                        block163: {
                                                                                                            block162: {
                                                                                                                block161: {
                                                                                                                    block159: {
                                                                                                                        block160: {
                                                                                                                            block180: {
                                                                                                                                var4_4 = this;
                                                                                                                                var5_5 = var1_1;
                                                                                                                                var6_6 /* !! */  = var2_2;
                                                                                                                                var7_7 = var3_3;
                                                                                                                                var8_8 = "errors";
                                                                                                                                var9_9 = "result";
                                                                                                                                var10_10 /* !! */  = "success";
                                                                                                                                var11_11 /* !! */  = "errorCode : ";
                                                                                                                                var12_12 = this.a;
                                                                                                                                var13_13 /* !! */  = var12_12.k0();
                                                                                                                                if (var13_13 /* !! */  == (var14_14 /* !! */  = JioAdView$AdState.DESTROYED)) {
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                var13_13 /* !! */  = var12_12.Y();
                                                                                                                                com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)var12_12, ": inside handle response");
                                                                                                                                var14_14 /* !! */  = JioAds.Companion;
                                                                                                                                var14_14 /* !! */ .getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                                                var15_15 /* !! */  = JioAds$LogLevel.NONE;
                                                                                                                                this.O = var16_16 = var3_3.booleanValue();
                                                                                                                                this.F(var2_2);
                                                                                                                                var16_16 = var12_12.f0();
                                                                                                                                var17_17 = this.Q;
                                                                                                                                if (!var16_16) ** GOTO lbl-1000
                                                                                                                                var15_15 /* !! */  = this.U();
                                                                                                                                var16_16 = TextUtils.isEmpty((CharSequence)var15_15 /* !! */ );
                                                                                                                                var18_18 = "1";
                                                                                                                                if (!var16_16 && (var16_16 = this.o)) {
                                                                                                                                    var15_15 /* !! */  = var17_17.a.s;
                                                                                                                                    if (var15_15 /* !! */  != null) {
                                                                                                                                        var15_15 /* !! */  = var15_15 /* !! */ .a;
                                                                                                                                    } else {
                                                                                                                                        var16_16 = false;
                                                                                                                                        var15_15 /* !! */  = null;
                                                                                                                                    }
                                                                                                                                    if (var15_15 /* !! */  != null) {
                                                                                                                                        var15_15 /* !! */  = var15_15 /* !! */ .c;
                                                                                                                                    } else {
                                                                                                                                        var16_16 = false;
                                                                                                                                        var15_15 /* !! */  = null;
                                                                                                                                    }
                                                                                                                                    var16_16 = Intrinsics.areEqual((Object)var15_15 /* !! */ , var18_18);
                                                                                                                                    var18_18 = new StringBuilder();
                                                                                                                                    var19_19 /* !! */  = var12_12.P();
                                                                                                                                    var18_18.append((String)var19_19 /* !! */ );
                                                                                                                                    var18_18.append(": inside isTrustedApp MultiEnabled ");
                                                                                                                                    var18_18.append(var16_16);
                                                                                                                                    var18_18 = var18_18.toString();
                                                                                                                                    var19_19 /* !! */  = "message";
                                                                                                                                    Intrinsics.checkNotNullParameter(var18_18, (String)var19_19 /* !! */ );
                                                                                                                                    var18_18 = var14_14 /* !! */ .getInstance();
                                                                                                                                    var18_18.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                                                } else {
                                                                                                                                    var15_15 /* !! */  = var4_4.E("ae");
                                                                                                                                    var19_19 /* !! */  = new StringBuilder();
                                                                                                                                    l_0.d((com.jio.jioads.common.b)var12_12, var19_19 /* !! */ , ": inside isTrustedApp single ad ", (String)var15_15 /* !! */ );
                                                                                                                                    var20_20 = var14_14 /* !! */ .getInstance();
                                                                                                                                    var20_20.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                                                    var16_16 = Intrinsics.areEqual(var18_18, (Object)var15_15 /* !! */ );
                                                                                                                                }
                                                                                                                                if (!var16_16) {
                                                                                                                                    var16_16 = false;
                                                                                                                                    var15_15 /* !! */  = null;
                                                                                                                                } else lbl-1000:
                                                                                                                                // 2 sources

                                                                                                                                {
                                                                                                                                    var16_16 = true;
                                                                                                                                }
                                                                                                                                var20_20 = var4_4.b;
                                                                                                                                if (!var16_16) break block179;
                                                                                                                                var21_21 = TextUtils.isEmpty((CharSequence)var1_1);
                                                                                                                                if (!var21_21) break block180;
                                                                                                                                var5_5 = JioAdError.Companion;
                                                                                                                                var6_6 /* !! */  = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                                                                                                                var7_7 = "No Ad in Inventory";
                                                                                                                                var9_9 = j_0.c((t_0)var5_5, (JioAdError$JioAdErrorType)var6_6 /* !! */ , (String)var7_7);
                                                                                                                                var11_11 /* !! */  = com.jio.jioads.cdnlogging.d.a;
                                                                                                                                var8_8 = var20_20;
                                                                                                                                var8_8 = (V)var20_20;
                                                                                                                                var12_12 = "makeAdRequest";
                                                                                                                                var13_13 /* !! */  = "JioAdViewController";
                                                                                                                                var10_10 /* !! */  = null;
                                                                                                                                var14_14 /* !! */  = "Ad response string is empty from server";
                                                                                                                                var16_16 = false;
                                                                                                                                var15_15 /* !! */  = null;
                                                                                                                                var8_8.d((JioAdError)var9_9, false, (com.jio.jioads.cdnlogging.d)var11_11 /* !! */ , (String)var12_12, (String)var13_13 /* !! */ , (String)var14_14 /* !! */ , null);
                                                                                                                                break block181;
                                                                                                                            }
                                                                                                                            Intrinsics.checkNotNull(var1_1);
                                                                                                                            var14_14 /* !! */  = new JSONObject((String)var5_5);
                                                                                                                            try {
                                                                                                                                var16_16 = var14_14 /* !! */ .has(var10_10 /* !! */ );
                                                                                                                                if (!var16_16) break block159;
                                                                                                                            }
                                                                                                                            catch (Exception v0) {}
                                                                                                                            var16_16 = var4_4.o;
                                                                                                                            if (var16_16) break block160;
                                                                                                                            var16_16 = var14_14 /* !! */ .getBoolean(var10_10 /* !! */ );
                                                                                                                            if (var16_16) break block160;
                                                                                                                            var16_16 = false;
                                                                                                                            var15_15 /* !! */  = null;
                                                                                                                            var22_23 = var4_4.C(var6_6 /* !! */ , false);
                                                                                                                            if (var22_23 != 0) break block161;
                                                                                                                        }
                                                                                                                        var16_16 = var14_14 /* !! */ .getBoolean(var10_10 /* !! */ );
                                                                                                                        break block162;
                                                                                                                    }
                                                                                                                    var16_16 = var4_4.o;
                                                                                                                    if (!var16_16) break block161;
                                                                                                                    var15_15 /* !! */  = new JSONObject();
                                                                                                                    var15_15 /* !! */ .put((String)var9_9, (Object)var14_14 /* !! */ );
                                                                                                                    var21_21 = true;
                                                                                                                    var15_15 /* !! */ .put(var10_10 /* !! */ , var21_21);
                                                                                                                    var14_14 /* !! */  = "statusCode";
                                                                                                                    var22_23 = 200;
                                                                                                                    try {
                                                                                                                        var15_15 /* !! */ .put((String)var14_14 /* !! */ , var22_23);
                                                                                                                        var14_14 /* !! */  = var15_15 /* !! */ ;
                                                                                                                    }
                                                                                                                    catch (Exception v1) {
                                                                                                                        var14_14 /* !! */  = var15_15 /* !! */ ;
                                                                                                                    }
                                                                                                                }
                                                                                                                var16_16 = true;
                                                                                                                break block162;
                                                                                                                break block182;
                                                                                                            }
                                                                                                            if (var16_16) break block163;
                                                                                                            var22_23 = var14_14 /* !! */ .has((String)var8_8);
                                                                                                            if (var22_23 == 0) break block163;
                                                                                                            var8_8 = var14_14 /* !! */ .getJSONArray((String)var8_8);
                                                                                                            var22_23 = 0;
                                                                                                            var18_18 = null;
                                                                                                            var8_8 = var8_8.getJSONObject(0);
                                                                                                            break block164;
                                                                                                            break block182;
                                                                                                        }
                                                                                                        var23_24 = false;
                                                                                                        var8_8 = null;
                                                                                                        break block164;
                                                                                                        catch (Exception v2) {
                                                                                                            var21_21 = false;
                                                                                                            var14_14 /* !! */  = null;
                                                                                                        }
                                                                                                    }
                                                                                                    var23_24 = false;
                                                                                                    var8_8 = null;
                                                                                                    var16_16 = true;
                                                                                                }
                                                                                                if (!var16_16) break block183;
                                                                                                var23_24 = var4_4.o;
                                                                                                if (!var23_24 || !(var23_24 = Intrinsics.areEqual(var7_7, var8_8 = Boolean.FALSE))) break block184;
                                                                                                if (var14_14 /* !! */  != null && (var24_25 = var14_14 /* !! */ .has(var10_10 /* !! */ )) == (var25_26 = true)) {
                                                                                                    var24_25 = true;
                                                                                                } else {
                                                                                                    var24_25 = false;
                                                                                                    var5_5 = null;
                                                                                                }
                                                                                                if (!var24_25) break block185;
                                                                                                var5_5 = var14_14 /* !! */ .optString(var10_10 /* !! */ );
                                                                                                var25_26 = TextUtils.isEmpty((CharSequence)var5_5);
                                                                                                if (var25_26 || !(var24_25 = Boolean.parseBoolean((String)var5_5))) break block186;
                                                                                                var24_25 = var14_14 /* !! */ .has((String)var9_9);
                                                                                                if (!var24_25) break block187;
                                                                                                var5_5 = var4_4.s;
                                                                                                if (var5_5 != null && (var6_6 /* !! */  = var5_5.b) != null && (var6_6 /* !! */  = var6_6 /* !! */ .b) != null) {
                                                                                                    var6_6 /* !! */  = var6_6 /* !! */ .b;
                                                                                                } else {
                                                                                                    var25_26 = false;
                                                                                                    var6_6 /* !! */  = null;
                                                                                                }
                                                                                                if (var6_6 /* !! */  == null) ** GOTO lbl-1000
                                                                                                if (var5_5 != null && (var5_5 = var5_5.b) != null && (var5_5 = var5_5.b) != null && (var5_5 = var5_5.b) != null) {
                                                                                                    var5_5 = var5_5.toString();
                                                                                                } else {
                                                                                                    var24_25 = false;
                                                                                                    var5_5 = null;
                                                                                                }
                                                                                                var6_6 /* !! */  = new StringBuilder();
                                                                                                var7_7 = ": masterConfigVersion: ";
                                                                                                l_0.d((com.jio.jioads.common.b)var12_12, (StringBuilder)var6_6 /* !! */ , (String)var7_7, (String)var5_5);
                                                                                                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                var6_6 /* !! */  = JioAds$LogLevel.NONE;
                                                                                                var6_6 /* !! */  = var14_14 /* !! */ .getJSONObject((String)var9_9);
                                                                                                if (var6_6 /* !! */  != null) {
                                                                                                    var7_7 = "vr";
                                                                                                    var18_18 = var6_6 /* !! */ .putOpt((String)var7_7, var5_5);
                                                                                                } else lbl-1000:
                                                                                                // 2 sources

                                                                                                {
                                                                                                    var22_23 = 0;
                                                                                                    var18_18 = null;
                                                                                                }
                                                                                                if (var13_13 /* !! */  != null) {
                                                                                                    var5_5 = "multiad_pref";
                                                                                                    var6_6 /* !! */  = "loc";
                                                                                                    j_0.f((Context)var13_13 /* !! */ , (String)var5_5, (String)var6_6 /* !! */ );
                                                                                                }
                                                                                                com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)var12_12, ": parsing multiad response");
                                                                                                var5_5 = JioAds.Companion;
                                                                                                var5_5.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                var6_6 /* !! */  = JioAds$LogLevel.NONE;
                                                                                                var6_6 /* !! */  = var12_12.P();
                                                                                                var6_6 /* !! */  = com.jio.jioads.multiad.v.c(String.valueOf(var18_18), (String)var6_6 /* !! */ );
                                                                                                var7_7 = var4_4.s;
                                                                                                if (var7_7 != null) {
                                                                                                    var7_7.c = var6_6 /* !! */ ;
                                                                                                }
                                                                                                var6_6 /* !! */  = new StringBuilder();
                                                                                                var7_7 = " : multiad response parsed";
                                                                                                j_0.i((com.jio.jioads.common.b)var12_12, (StringBuilder)var6_6 /* !! */ , (String)var7_7);
                                                                                                var6_6 /* !! */  = var5_5.getInstance();
                                                                                                var6_6 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                if (var13_13 /* !! */  != null) {
                                                                                                    var6_6 /* !! */  = var12_12.P();
                                                                                                    var7_7 = this.Y();
                                                                                                    var8_8 = String.valueOf(var18_18);
                                                                                                    j_0.g((Context)var13_13 /* !! */ , (String)var6_6 /* !! */ , (String)var7_7, (String)var8_8);
                                                                                                }
                                                                                                var6_6 /* !! */  = new StringBuilder();
                                                                                                var7_7 = ": MultiAd is enabled and status is success";
                                                                                                j_0.i((com.jio.jioads.common.b)var12_12, (StringBuilder)var6_6 /* !! */ , (String)var7_7);
                                                                                                var5_5 = var5_5.getInstance();
                                                                                                var5_5.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                                var24_25 = true;
                                                                                                var4_4.A(var24_25);
                                                                                                break block181;
                                                                                            }
                                                                                            com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)var12_12, ": MultiAd is enabled but result node is not available, trying backup ads");
                                                                                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                            var5_5 = JioAds$LogLevel.NONE;
                                                                                            var24_25 = false;
                                                                                            var5_5 = null;
                                                                                            var4_4.A(false);
                                                                                            break block181;
                                                                                        }
                                                                                        var24_25 = false;
                                                                                        var5_5 = null;
                                                                                        com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)var12_12, ": inside isMultiAdEnabled block and status is not success so trying backup ads");
                                                                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                        var6_6 /* !! */  = JioAds$LogLevel.NONE;
                                                                                        var4_4.A(false);
                                                                                        break block181;
                                                                                    }
                                                                                    var24_25 = false;
                                                                                    var5_5 = null;
                                                                                    com.jio.jioads.audioplayer.b.a((com.jio.jioads.common.b)var12_12, ": inside isMultiAdEnabled block and success node unavailable so trying backup ads");
                                                                                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                    var6_6 /* !! */  = JioAds$LogLevel.NONE;
                                                                                    var4_4.A(false);
                                                                                    break block181;
                                                                                }
                                                                                this.h();
                                                                                this.l();
                                                                                var8_8 = new StringBuilder();
                                                                                j_0.i((com.jio.jioads.common.b)var12_12, (StringBuilder)var8_8, ": Single Ad response");
                                                                                var8_8 = JioAds.Companion;
                                                                                var8_8.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                var9_9 = JioAds$LogLevel.NONE;
                                                                                var4_4.t = var6_6 /* !! */ ;
                                                                                var9_9 = new StringBuilder();
                                                                                var10_10 /* !! */  = ": Set HeaderValue for single ad ";
                                                                                j_0.i((com.jio.jioads.common.b)var12_12, (StringBuilder)var9_9, var10_10 /* !! */ );
                                                                                var8_8.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                this.i();
                                                                                var8_8 = var4_4.w;
                                                                                if (var8_8 != null) {
                                                                                    var26_28 = false;
                                                                                    var9_9 = null;
                                                                                    var8_8.onVmapResponseReceived(var5_5, false);
                                                                                } else {
                                                                                    var26_29 = false;
                                                                                    var9_9 = null;
                                                                                    var8_8 = Boolean.FALSE;
                                                                                    var27_32 = Intrinsics.areEqual(var7_7, var8_8);
                                                                                    if (var27_32 && (var27_32 = var4_4.C(var6_6 /* !! */ , false)) && (var27_32 = (var7_7 = (Boolean)this.X().a).booleanValue())) {
                                                                                        this.x(var1_1, var2_2);
                                                                                    } else {
                                                                                        var7_7 = var17_17.a;
                                                                                        var23_24 = false;
                                                                                        var8_8 = null;
                                                                                        var7_7.C = false;
                                                                                        var7_7 = var4_4.r;
                                                                                        if (var7_7 != null) {
                                                                                            var7_7.onAdDataUpdate((String)var5_5, var6_6 /* !! */ );
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break block181;
                                                                            }
                                                                            var6_6 /* !! */  = "";
                                                                            if (var8_8 == null) break block188;
                                                                            var7_7 = "errorCode";
                                                                            var7_7 = var8_8.getString((String)var7_7);
                                                                            var9_9 = new StringBuilder(var11_11 /* !! */ );
                                                                            var9_9.append((String)var7_7);
                                                                            var9_9 = var9_9.toString();
                                                                            com.jio.jioads.util.j.b((String)var9_9);
                                                                            var9_9 = "C31";
                                                                            var26_30 = var9_9.equalsIgnoreCase((String)var7_7);
                                                                            var10_10 /* !! */  = ": ";
                                                                            if (!var26_30) break block165;
                                                                            var8_8 = new StringBuilder();
                                                                            var9_9 = var12_12.P();
                                                                            var8_8.append((String)var9_9);
                                                                            var8_8.append(var10_10 /* !! */ );
                                                                            var9_9 = JioAdError$JioAdErrorType.ERROR_DAILY_IMPRESSION_LIMIT_REACHED;
                                                                            var9_9 = var9_9.getErrorTitle();
                                                                            var8_8.append((String)var9_9);
                                                                            var8_8 = var8_8.toString();
                                                                            com.jio.jioads.util.j.a((String)var8_8);
                                                                            var8_8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                                                            var6_6 /* !! */  = var8_8.getErrorTitle();
                                                                            break block166;
                                                                        }
                                                                        var9_9 = "C32";
                                                                        var26_30 = var9_9.equalsIgnoreCase((String)var7_7);
                                                                        if (!var26_30) break block167;
                                                                        var8_8 = JioAdError$JioAdErrorType.ERROR_LIFETIME_IMPRESSION_LIMIT_REACHED;
                                                                        var8_8 = var8_8.getErrorTitle();
                                                                        com.jio.jioads.util.j.a((String)var8_8);
                                                                        var8_8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                                                        var6_6 /* !! */  = var8_8.getErrorTitle();
                                                                        break block166;
                                                                    }
                                                                    var9_9 = "C37";
                                                                    var26_30 = var9_9.equalsIgnoreCase((String)var7_7);
                                                                    if (!var26_30) break block168;
                                                                    var8_8 = JioAdError$JioAdErrorType.ERROR_DAILY_CLICK_LIMIT_REACHED;
                                                                    var8_8 = var8_8.getErrorTitle();
                                                                    com.jio.jioads.util.j.a((String)var8_8);
                                                                    var8_8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                                                    var6_6 /* !! */  = var8_8.getErrorTitle();
                                                                    break block166;
                                                                }
                                                                var9_9 = "C38";
                                                                var26_30 = var9_9.equalsIgnoreCase((String)var7_7);
                                                                if (!var26_30) break block169;
                                                                var8_8 = new StringBuilder();
                                                                var9_9 = var12_12.P();
                                                                var8_8.append((String)var9_9);
                                                                var8_8.append(var10_10 /* !! */ );
                                                                var9_9 = JioAdError$JioAdErrorType.ERROR_LIFETIME_CLICK_LIMIT_REACHED;
                                                                var9_9 = var9_9.getErrorTitle();
                                                                var8_8.append((String)var9_9);
                                                                var8_8 = var8_8.toString();
                                                                com.jio.jioads.util.j.a((String)var8_8);
                                                                var8_8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                                                var6_6 /* !! */  = var8_8.getErrorTitle();
                                                                break block166;
                                                            }
                                                            var9_9 = "C39";
                                                            var26_30 = var9_9.equalsIgnoreCase((String)var7_7);
                                                            if (!var26_30) break block170;
                                                            var8_8 = new StringBuilder();
                                                            var9_9 = var12_12.P();
                                                            var8_8.append((String)var9_9);
                                                            var8_8.append(var10_10 /* !! */ );
                                                            var9_9 = JioAdError$JioAdErrorType.ERROR_DAILY_VIEW_LIMIT_REACHED;
                                                            var9_9 = var9_9.getErrorTitle();
                                                            var8_8.append((String)var9_9);
                                                            var8_8 = var8_8.toString();
                                                            com.jio.jioads.util.j.a((String)var8_8);
                                                            var8_8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                                            var6_6 /* !! */  = var8_8.getErrorTitle();
                                                            break block166;
                                                        }
                                                        var9_9 = "C40";
                                                        var26_30 = var9_9.equalsIgnoreCase((String)var7_7);
                                                        if (!var26_30) break block171;
                                                        var8_8 = new StringBuilder();
                                                        var9_9 = var12_12.P();
                                                        var8_8.append((String)var9_9);
                                                        var8_8.append(var10_10 /* !! */ );
                                                        var9_9 = JioAdError$JioAdErrorType.ERROR_LIFETIME_VIEW_LIMIT_REACHED;
                                                        var9_9 = var9_9.getErrorTitle();
                                                        var8_8.append((String)var9_9);
                                                        var8_8 = var8_8.toString();
                                                        com.jio.jioads.util.j.a((String)var8_8);
                                                        var8_8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                                        var6_6 /* !! */  = var8_8.getErrorTitle();
                                                        break block166;
                                                    }
                                                    var9_9 = "C41";
                                                    var26_30 = var9_9.equalsIgnoreCase((String)var7_7);
                                                    if (!var26_30) break block172;
                                                    var8_8 = new StringBuilder();
                                                    var9_9 = var12_12.P();
                                                    var8_8.append((String)var9_9);
                                                    var8_8.append(var10_10 /* !! */ );
                                                    var9_9 = JioAdError$JioAdErrorType.ERROR_MINUTE_IMPRESSION_LIMIT_REACHED;
                                                    var9_9 = var9_9.getErrorTitle();
                                                    var8_8.append((String)var9_9);
                                                    var8_8 = var8_8.toString();
                                                    com.jio.jioads.util.j.a((String)var8_8);
                                                    var8_8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                                    var6_6 /* !! */  = var8_8.getErrorTitle();
                                                    break block166;
                                                }
                                                var9_9 = "C42";
                                                var26_30 = var9_9.equalsIgnoreCase((String)var7_7);
                                                if (!var26_30) break block173;
                                                var8_8 = new StringBuilder();
                                                var9_9 = var12_12.P();
                                                var8_8.append((String)var9_9);
                                                var8_8.append(var10_10 /* !! */ );
                                                var9_9 = JioAdError$JioAdErrorType.ERROR_HOUR_IMPRESSION_LIMIT_REACHED;
                                                var9_9 = var9_9.getErrorTitle();
                                                var8_8.append((String)var9_9);
                                                var8_8 = var8_8.toString();
                                                com.jio.jioads.util.j.a((String)var8_8);
                                                var8_8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                                var6_6 /* !! */  = var8_8.getErrorTitle();
                                                break block166;
                                            }
                                            var9_9 = "C43";
                                            var26_30 = var9_9.equalsIgnoreCase((String)var7_7);
                                            if (!var26_30) break block174;
                                            var8_8 = new StringBuilder();
                                            var9_9 = var12_12.P();
                                            var8_8.append((String)var9_9);
                                            var8_8.append(var10_10 /* !! */ );
                                            var9_9 = JioAdError$JioAdErrorType.ERROR_MINUTE_CLICK_LIMIT_REACHED;
                                            var9_9 = var9_9.getErrorTitle();
                                            var8_8.append((String)var9_9);
                                            var8_8 = var8_8.toString();
                                            com.jio.jioads.util.j.a((String)var8_8);
                                            var8_8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                            var6_6 /* !! */  = var8_8.getErrorTitle();
                                            break block166;
                                        }
                                        var9_9 = "C44";
                                        var26_30 = var9_9.equalsIgnoreCase((String)var7_7);
                                        if (!var26_30) break block175;
                                        var8_8 = new StringBuilder();
                                        var9_9 = var12_12.P();
                                        var8_8.append((String)var9_9);
                                        var8_8.append(var10_10 /* !! */ );
                                        var9_9 = JioAdError$JioAdErrorType.ERROR_HOUR_CLICK_LIMIT_REACHED;
                                        var9_9 = var9_9.getErrorTitle();
                                        var8_8.append((String)var9_9);
                                        var8_8 = var8_8.toString();
                                        com.jio.jioads.util.j.a((String)var8_8);
                                        var8_8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                        var6_6 /* !! */  = var8_8.getErrorTitle();
                                        break block166;
                                    }
                                    var9_9 = "C45";
                                    var26_30 = var9_9.equalsIgnoreCase((String)var7_7);
                                    if (!var26_30) break block176;
                                    var8_8 = new StringBuilder();
                                    var9_9 = var12_12.P();
                                    var8_8.append((String)var9_9);
                                    var8_8.append(var10_10 /* !! */ );
                                    var9_9 = JioAdError$JioAdErrorType.ERROR_MINUTE_VIEW_LIMIT_REACHED;
                                    var9_9 = var9_9.getErrorTitle();
                                    var8_8.append((String)var9_9);
                                    var8_8 = var8_8.toString();
                                    com.jio.jioads.util.j.a((String)var8_8);
                                    var8_8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                    var6_6 /* !! */  = var8_8.getErrorTitle();
                                    break block166;
                                }
                                var9_9 = "C46";
                                var26_30 = var9_9.equalsIgnoreCase((String)var7_7);
                                if (!var26_30) break block177;
                                var8_8 = new StringBuilder();
                                var9_9 = var12_12.P();
                                var8_8.append((String)var9_9);
                                var8_8.append(var10_10 /* !! */ );
                                var9_9 = JioAdError$JioAdErrorType.ERROR_HOUR_VIEW_LIMIT_REACHED;
                                var9_9 = var9_9.getErrorTitle();
                                var8_8.append((String)var9_9);
                                var8_8 = var8_8.toString();
                                com.jio.jioads.util.j.a((String)var8_8);
                                var8_8 = JioAdError$JioAdErrorType.ERROR_NOFILL;
                                var6_6 /* !! */  = var8_8.getErrorTitle();
                            }
lbl611:
                            // 3 sources

                            while (true) {
                                var8_8 = var6_6 /* !! */ ;
lbl613:
                                // 2 sources

                                while (true) {
                                    var6_6 /* !! */  = var7_7;
                                    break block178;
                                    break;
                                }
                                break;
                            }
                        }
                        var9_9 = "errorMsg";
                        try {
                            var8_8 = var8_8.getString((String)var9_9);
                            var9_9 = "getString(...)";
                        }
                        catch (JSONException v3) {
                            ** continue;
                        }
                        Intrinsics.checkNotNullExpressionValue(var8_8, (String)var9_9);
                        ** continue;
                        catch (JSONException v4) {
                            var7_7 = var6_6 /* !! */ ;
                            ** GOTO lbl611
                        }
                    }
                    var8_8 = var6_6 /* !! */ ;
                }
                var7_7 = "AS16";
                var27_33 = var7_7.equalsIgnoreCase((String)var6_6 /* !! */ );
                var6_6 /* !! */  = var27_33 != false ? JioAdError$JioAdErrorType.ERROR_AD_SPOT_DOES_NOT_EXIST : ((var27_33 = (var7_7 = "AS17").equalsIgnoreCase((String)var6_6 /* !! */ )) != false ? JioAdError$JioAdErrorType.ERROR_UA_INVALID : ((var27_33 = (var7_7 = "AS18").equalsIgnoreCase((String)var6_6 /* !! */ )) != false ? JioAdError$JioAdErrorType.ERROR_OS_INVALID : ((var27_33 = (var7_7 = "L04").equalsIgnoreCase((String)var6_6 /* !! */ )) != false ? JioAdError$JioAdErrorType.ERROR_ADSPOT_NOT_LINKED : ((var25_27 = (var7_7 = "R01").equalsIgnoreCase((String)var6_6 /* !! */ )) != false ? JioAdError$JioAdErrorType.ERROR_INVALID_RESTRICTED_ORIGIN_REQUEST : JioAdError$JioAdErrorType.ERROR_NOFILL))));
                JioAdError.Companion.getClass();
                var18_18 = t_0.a((JioAdError$JioAdErrorType)var6_6 /* !! */ );
                var9_9 = "Ad failed to load: ";
                var7_7 = new StringBuilder((String)var9_9);
                var7_7.append((String)var8_8);
                var7_7 = var7_7.toString();
                var18_18.setErrorDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var7_7);
                var7_7 = new StringBuilder();
                var8_8 = ": Ad Failed To load error ";
                l_0.d((com.jio.jioads.common.b)var12_12, (StringBuilder)var7_7, (String)var8_8, (String)var5_5);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var5_5 = JioAds$LogLevel.NONE;
                var5_5 = var4_4.w;
                if (var5_5 != null) {
                    var5_5.onVmapErrorReceived((JioAdError)var18_18);
                }
                if (var6_6 /* !! */  == (var5_5 = JioAdError$JioAdErrorType.ERROR_NOFILL) && ((var5_5 = var12_12.K()) == (var6_6 /* !! */  = JioAdView$AD_TYPE.INSTREAM_VIDEO) || (var5_5 = var12_12.K()) == (var6_6 /* !! */  = JioAdView$AD_TYPE.INSTREAM_AUDIO) || (var5_5 = var12_12.K()) == (var6_6 /* !! */  = JioAdView$AD_TYPE.INTERSTITIAL))) {
                    var28_34 = com.jio.jioads.cdnlogging.d.c;
                    var17_17 = var20_20;
                    var17_17 = (V)var20_20;
                    var29_36 = "processResponse";
                    var30_38 = "JioAdViewController";
                    var31_40 = false;
                    var19_19 /* !! */  = null;
                    var32_42 = "";
                    var17_17.d((JioAdError)var18_18, false, var28_34, var29_36, var30_38, var32_42, null);
                } else {
                    var28_35 = com.jio.jioads.cdnlogging.d.c;
                    var17_17 = var20_20;
                    var17_17 = (V)var20_20;
                    var29_37 = "processResponse";
                    var30_39 = "JioAdViewController";
                    var31_41 = true;
                    var32_43 = "";
                    var17_17.d((JioAdError)var18_18, var31_41, var28_35, var29_37, var30_39, var32_43, null);
                }
                break block181;
            }
            var5_5 = new StringBuilder();
            j_0.i((com.jio.jioads.common.b)var12_12, (StringBuilder)var5_5, ": This functionality is only available for Trusted Apps");
            var14_14 /* !! */ .getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var5_5 = JioAdError.Companion;
            var6_6 /* !! */  = JioAdError$JioAdErrorType.ERROR_RESTRICTED_API;
            var5_5.getClass();
            var8_8 = t_0.a((JioAdError$JioAdErrorType)var6_6 /* !! */ );
            var10_10 /* !! */  = com.jio.jioads.cdnlogging.d.a;
            var7_7 = var20_20;
            var7_7 = (V)var20_20;
            var11_11 /* !! */  = "handleResponse";
            var12_12 = "JioAdViewController";
            var26_31 = false;
            var9_9 = null;
            var13_13 /* !! */  = "";
            var21_22 = false;
            var14_14 /* !! */  = null;
            var7_7.d((JioAdError)var8_8, false, (com.jio.jioads.cdnlogging.d)var10_10 /* !! */ , var11_11 /* !! */ , (String)var12_12, (String)var13_13 /* !! */ , null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void z(String string2, boolean bl2) {
        Exception exception2;
        com.jio.jioads.common.b b2;
        Object object;
        block5: {
            Object object2;
            object = "adspotSequenceLocal_";
            b2 = this.a;
            Object object3 = b2.Y();
            if (object3 == null) return;
            Object object4 = b2.k0();
            if (object4 == (object2 = JioAdView$AdState.DESTROYED)) {
                return;
            }
            object3 = j_0.o((Context)object3, "ad_seq_and_blk_pref");
            object4 = new StringBuilder();
            object2 = b2.P();
            ((StringBuilder)object4).append((String)object2);
            ((StringBuilder)object4).append(": Ad sequencing value ");
            ((StringBuilder)object4).append(string2);
            ((StringBuilder)object4).append(", isHeader = ");
            ((StringBuilder)object4).append(bl2);
            object4 = ((StringBuilder)object4).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object4, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
            if (bl2) {
                try {
                    bl2 = TextUtils.isEmpty((CharSequence)string2);
                    object = "adspotSequenceHeader_";
                    if (!bl2) {
                        Intrinsics.checkNotNull(string2);
                        Object object5 = new JSONObject(string2);
                        string2 = "sh";
                        boolean bl3 = object5.has(string2);
                        if (!bl3) return;
                        string2 = object3.edit();
                        object3 = new StringBuilder((String)object);
                        object = b2.P();
                        ((StringBuilder)object3).append((String)object);
                        object = ((StringBuilder)object3).toString();
                        object5 = object5.toString();
                        string2 = string2.putString((String)object, (String)object5);
                        string2.apply();
                        return;
                    }
                }
                catch (Exception exception2) {
                    break block5;
                }
                string2 = object3.edit();
                CharSequence charSequence = new StringBuilder((String)object);
                object = b2.P();
                charSequence.append((String)object);
                charSequence = charSequence.toString();
                string2 = string2.remove((String)charSequence);
                string2.apply();
                return;
            }
            SharedPreferences.Editor editor = object3.edit();
            object3 = new StringBuilder((String)object);
            object = b2.P();
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            string2 = editor.putString((String)object, string2);
            string2.apply();
            return;
        }
        StringBuilder stringBuilder = com.jio.jioads.controller.m.a(b2, ": Exception while storing Ad sequence header value ");
        object = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object, exception2, stringBuilder);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }
}

