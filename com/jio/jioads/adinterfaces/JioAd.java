/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.AdEventTracker;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAd$NativeAd;
import com.jio.jioads.adinterfaces.JioAd$VideoAd;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.V;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.t_0;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.a;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instreamads.vastparser.model.g;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class JioAd {
    public boolean a;
    public String b;
    public final String c;
    public Context d;
    public int e;
    public AdEventTracker f;
    public JioAd$NativeAd g;
    public String h;
    public JioAd$VideoAd i;
    public JSONObject j;
    public m k;
    public a l;
    public Integer m;
    public JioAdView n;
    public final b o;
    public final c p;
    public final HashMap q;

    public JioAd(Context context, JioAdView jioAdView, m m2, a a2, g g3, j j3, int n3, int n4, String string2, String string3, b b2, c c2) {
        AdEventTracker adEventTracker;
        Object object;
        JioAd jioAd = this;
        String string4 = string2;
        Object object2 = b2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jioAdView, "jioAdView");
        Intrinsics.checkNotNullParameter(a2, "jioAdViewListener");
        Intrinsics.checkNotNullParameter(string2, "ccbString");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        this.q = object = new HashMap();
        this.l = a2;
        this.o = b2;
        this.p = c2;
        object2 = adEventTracker;
        object = context;
        this.f = adEventTracker = new AdEventTracker(context, jioAdView, this, a2, c2);
        this.d = context;
        object2 = m2;
        this.k = m2;
        this.n = jioAdView;
        int n7 = n3 != 0 ? n3 : 5;
        jioAd.e = n7;
        jioAd.c = string4;
        object2 = g3;
        object = j3;
        jioAd.i = object2 = this.a(g3, j3);
        jioAd.m = object2 = Integer.valueOf(n4);
        object2 = string3;
        jioAd.b = string3;
    }

    public JioAd(Context context, JioAdView jioAdView, com.jio.jioads.native.parser.a a2, a a3, Integer n3, int n4, String string2, String string3, b b2, m m2, HashMap hashMap, c c2) {
        int n7;
        AdEventTracker adEventTracker;
        JioAd jioAd = this;
        Object object = b2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jioAdView, "jioAdView");
        Intrinsics.checkNotNullParameter(a3, "jioAdViewListener");
        Intrinsics.checkNotNullParameter(string2, "ccbString");
        Intrinsics.checkNotNullParameter(b2, "iJioAdView");
        Intrinsics.checkNotNullParameter(hashMap, "headers");
        new HashMap();
        this.d = context;
        this.n = jioAdView;
        this.h = string3;
        this.o = b2;
        object = m2;
        this.k = m2;
        this.l = a3;
        this.q = hashMap;
        this.p = c2;
        object = adEventTracker;
        this.f = adEventTracker = new AdEventTracker(context, jioAdView, this, a3, c2);
        this.c = string2;
        this.m = object = Integer.valueOf(n4);
        if (n3 == null || (n7 = n3.intValue()) != 0) {
            Intrinsics.checkNotNull(n3);
            n7 = n3;
        } else {
            n7 = 8;
        }
        jioAd.e = n7;
        object = a2;
        this.a(a2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final JioAd$VideoAd a() {
        int n3;
        Object object;
        Object object2;
        Object object3;
        j j3;
        boolean bl2;
        boolean bl3;
        Object object4 = this.l;
        Object object5 = null;
        if (object4 == null) return null;
        object4 = this.k;
        if (object4 != null) {
            object4 = ((m)object4).c;
        } else {
            bl3 = false;
            object4 = null;
        }
        if (object4 == null) {
            bl2 = false;
            j3 = null;
        } else {
            block17: {
                object3 = object4.iterator();
                while (bl2 = object3.hasNext()) {
                    j3 = (j)object3.next();
                    object2 = j3;
                    object2 = j3;
                    object = this.k;
                    if (object != null) {
                        object2 = com.jio.jioads.instreamads.vastparser.model.m.i((j)object2);
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 == null) continue;
                    break block17;
                }
                bl2 = false;
                j3 = null;
            }
            j3 = j3;
        }
        if (object4 != null && !(bl3 = object4.isEmpty()) && j3 != null) {
            object4 = this.k;
            if (object4 != null) {
                object4 = com.jio.jioads.instreamads.vastparser.model.m.i(j3);
            } else {
                bl3 = false;
                object4 = null;
            }
            if (object4 != null) {
                object3 = ((com.jio.jioads.instreamads.vastparser.model.f)object4).b;
            } else {
                boolean bl4 = false;
                object3 = null;
            }
            if (object3 != null) {
                object3 = ((com.jio.jioads.instreamads.vastparser.model.f)object4).b;
                Intrinsics.checkNotNull(object3);
                int n4 = object3.size();
                if (n4 > 0) {
                    void var10_14;
                    object4 = ((com.jio.jioads.instreamads.vastparser.model.f)object4).b;
                    object3 = this.p;
                    n3 = 0;
                    object2 = null;
                    if (object3 != null) {
                        object = j3.h;
                        String string2 = j3.i;
                        HashMap hashMap = this.q;
                        object3 = (f)object3;
                        boolean bl5 = ((f)object3).f((String)object, string2, hashMap);
                    } else {
                        boolean bl6 = false;
                        object3 = null;
                    }
                    if (object4 == null) return this.a((g)object5, j3);
                    object4 = CollectionsKt.m0((Collection)object4);
                    object = this.d;
                    Intrinsics.checkNotNull(object);
                    object5 = new com.jio.jioads.utils.o((Context)object);
                    object = this.o.B();
                    if (object != null) {
                        n3 = (Integer)object;
                    }
                    object5 = ((com.jio.jioads.utils.o)object5).c((ArrayList)object4, n3, (boolean)var10_14);
                    return this.a((g)object5, j3);
                }
            }
        }
        bl2 = false;
        j3 = null;
        return this.a((g)object5, j3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JioAd$VideoAd a(g var1_1, j var2_2) {
        block99: {
            block105: {
                block100: {
                    block98: {
                        block86: {
                            block104: {
                                block96: {
                                    block97: {
                                        block103: {
                                            block94: {
                                                block95: {
                                                    block102: {
                                                        block92: {
                                                            block93: {
                                                                block101: {
                                                                    block90: {
                                                                        block91: {
                                                                            block89: {
                                                                                block88: {
                                                                                    block85: {
                                                                                        var3_3 = this;
                                                                                        var4_4 = var1_1;
                                                                                        var5_11 = var2_2;
                                                                                        var6_12 = this.n;
                                                                                        var7_13 = null;
                                                                                        if (var6_12 == null || (var6_12 = this.l) == null) break block99;
                                                                                        if (var1_1 == null || var2_2 == null) break block100;
                                                                                        var6_12 = new JioAd$VideoAd(this);
                                                                                        this.j = var8_14 /* !! */  = new JSONObject();
                                                                                        var8_14 /* !! */  = var2_2.h;
                                                                                        var9_16 = null;
                                                                                        if (var8_14 /* !! */  == null || (var8_14 /* !! */  = StringsKt.a0((CharSequence)var8_14 /* !! */ , var10_17 /* !! */  = new String[]{"**"}, false, 0, var11_19 = 6)) == null || (var8_14 /* !! */  = (String)CollectionsKt.N(0, (List)var8_14 /* !! */ )) == null) {
                                                                                            var8_14 /* !! */  = var5_11.h;
                                                                                        }
                                                                                        var3_3.h = var8_14 /* !! */ ;
                                                                                        var10_17 /* !! */  = var3_3.k;
                                                                                        if (var10_17 /* !! */  != null && (var12_20 = var10_17 /* !! */ .a) != null) {
                                                                                            Intrinsics.checkNotNull(var10_17 /* !! */ );
                                                                                            var12_20.r((m)var10_17 /* !! */ , (String)var8_14 /* !! */ );
                                                                                            var8_14 /* !! */  = Unit.a;
                                                                                        }
                                                                                        var8_14 /* !! */  = var3_3.k;
                                                                                        Intrinsics.checkNotNull(var8_14 /* !! */ );
                                                                                        var8_14 /* !! */ .getClass();
                                                                                        var8_14 /* !! */  = com.jio.jioads.instreamads.vastparser.model.m.i((j)var2_2);
                                                                                        var10_17 /* !! */  = var5_11.n;
                                                                                        try {
                                                                                            var12_20 = new JSONArray();
                                                                                            var13_22 /* !! */  = var3_3.j;
                                                                                            Intrinsics.checkNotNull(var13_22 /* !! */ );
                                                                                            var14_24 = "ads";
                                                                                            var13_22 /* !! */ .put((String)var14_24, var12_20);
                                                                                            var15_26 = new JSONObject();
                                                                                            var12_20.put(var15_26);
                                                                                            var12_20 = new JSONObject();
                                                                                            var13_22 /* !! */  = "id";
                                                                                            var14_24 = var3_3.h;
                                                                                            var12_20.put((String)var13_22 /* !! */ , var14_24);
                                                                                            var13_22 /* !! */  = var3_3.h;
                                                                                            var6_12.setId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var13_22 /* !! */ );
                                                                                            if (var10_17 /* !! */  == null) break block85;
                                                                                            var13_22 /* !! */  = var10_17 /* !! */ .a;
                                                                                            var14_24 = "system";
                                                                                            var12_20.put((String)var14_24, (Object)var13_22 /* !! */ );
                                                                                            var6_12.setAdSystem$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var13_22 /* !! */ );
                                                                                        }
                                                                                        catch (JSONException var4_5) {
                                                                                            var5_11 = var3_3;
                                                                                            var3_3 = var6_12;
                                                                                            break block86;
                                                                                        }
                                                                                    }
                                                                                    if (var10_17 /* !! */  != null) {
                                                                                        var13_22 /* !! */  = var10_17 /* !! */ .c;
                                                                                        var14_24 = "title";
                                                                                        var12_20.put((String)var14_24, (Object)var13_22 /* !! */ );
                                                                                        var6_12.setTitle$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var13_22 /* !! */ );
                                                                                    }
                                                                                    if (var10_17 /* !! */  != null) {
                                                                                        var10_17 /* !! */  = var10_17 /* !! */ .d;
                                                                                        var13_22 /* !! */  = "description";
                                                                                        var12_20.put((String)var13_22 /* !! */ , (Object)var10_17 /* !! */ );
                                                                                        var6_12.setDesc$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var10_17 /* !! */ );
                                                                                    }
                                                                                    var10_17 /* !! */  = "-1";
                                                                                    if (var8_14 /* !! */  != null && !(var16_27 = TextUtils.isEmpty((CharSequence)(var8_14 /* !! */  = var8_14 /* !! */ .a)))) {
                                                                                        var10_17 /* !! */  = var8_14 /* !! */ ;
                                                                                    }
                                                                                    if ((var8_14 /* !! */  = var3_3.k) != null && (var8_14 /* !! */  = var8_14 /* !! */ .a) != null) {
                                                                                        var13_22 /* !! */  = var3_3.h;
                                                                                        var8_14 /* !! */  = var8_14 /* !! */ .v;
                                                                                        var8_14 /* !! */  = var8_14 /* !! */ .get(var13_22 /* !! */ );
                                                                                        var8_14 /* !! */  = (AdMetaData$AdParams)var8_14 /* !! */ ;
                                                                                    } else {
                                                                                        var17_28 = 0;
                                                                                        var8_14 /* !! */  = null;
                                                                                    }
                                                                                    if (var8_14 /* !! */  != null && (var13_22 /* !! */  = var8_14 /* !! */ .getVideoCtaText()) != null) {
                                                                                        var13_22 /* !! */  = StringsKt.m0((CharSequence)var13_22 /* !! */ );
                                                                                        var13_22 /* !! */  = var13_22 /* !! */ .toString();
                                                                                    } else {
                                                                                        var16_27 = false;
                                                                                        var13_22 /* !! */  = null;
                                                                                    }
                                                                                    var16_27 = TextUtils.isEmpty((CharSequence)var13_22 /* !! */ );
                                                                                    if (!var16_27) {
                                                                                        if (var8_14 /* !! */  != null && (var8_14 /* !! */  = var8_14 /* !! */ .getVideoCtaText()) != null) {
                                                                                            var8_14 /* !! */  = StringsKt.m0((CharSequence)var8_14 /* !! */ );
                                                                                            var8_14 /* !! */  = var8_14 /* !! */ .toString();
                                                                                        } else {
                                                                                            var17_28 = 0;
                                                                                            var8_14 /* !! */  = null;
                                                                                        }
                                                                                    } else {
                                                                                        var8_14 /* !! */  = "Visit Advertiser";
                                                                                    }
                                                                                    var6_12.setCtaText$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var8_14 /* !! */ );
                                                                                    var8_14 /* !! */  = "skipOffset";
                                                                                    var12_20.put((String)var8_14 /* !! */ , (Object)var10_17 /* !! */ );
                                                                                    var6_12.setSkipOffset$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var10_17 /* !! */ );
                                                                                    var8_14 /* !! */  = "meta";
                                                                                    var15_26.put((String)var8_14 /* !! */ , var12_20);
                                                                                    var8_14 /* !! */  = new JSONObject();
                                                                                    var10_17 /* !! */  = var4_4.j;
                                                                                    var12_20 = "url";
                                                                                    var8_14 /* !! */ .put((String)var12_20, (Object)var10_17 /* !! */ );
                                                                                    var12_20 = var4_4.a;
                                                                                    var13_22 /* !! */  = "delivery";
                                                                                    var8_14 /* !! */ .put((String)var13_22 /* !! */ , var12_20);
                                                                                    var13_22 /* !! */  = var4_4.b;
                                                                                    var14_24 = "bitrate";
                                                                                    var8_14 /* !! */ .put((String)var14_24, (Object)var13_22 /* !! */ );
                                                                                    var14_24 = var4_4.e;
                                                                                    var18_29 /* !! */  = "width";
                                                                                    var8_14 /* !! */ .put(var18_29 /* !! */ , var14_24);
                                                                                    var18_29 /* !! */  = var4_4.f;
                                                                                    var19_31 = "height";
                                                                                    var8_14 /* !! */ .put((String)var19_31, (Object)var18_29 /* !! */ );
                                                                                    var4_4 = var4_4.g;
                                                                                    var19_31 = "type";
                                                                                    var8_14 /* !! */ .put((String)var19_31, var4_4);
                                                                                    var19_31 = var3_3.k;
                                                                                    if (var19_31 != null && (var19_31 = var19_31.a) != null) {
                                                                                        var5_11 = var5_11.h;
                                                                                        var5_11 = var19_31.j((String)var5_11);
                                                                                    } else {
                                                                                        var20_33 = 0;
                                                                                        var5_11 = null;
                                                                                    }
                                                                                    var20_33 = j_0.a((String)var5_11);
                                                                                    var21_34 = var20_33;
                                                                                    var6_12.setDuration$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var21_34);
                                                                                    var5_11 = "duration";
                                                                                    var8_14 /* !! */ .put((String)var5_11, var21_34);
                                                                                    var5_11 = "media";
                                                                                    var15_26.put((String)var5_11, (Object)var8_14 /* !! */ );
                                                                                    var10_17 /* !! */  = String.valueOf(var10_17 /* !! */ );
                                                                                    var12_20 = String.valueOf(var12_20);
                                                                                    var13_22 /* !! */  = String.valueOf(var13_22 /* !! */ );
                                                                                    var14_24 = String.valueOf(var14_24);
                                                                                    var18_29 /* !! */  = String.valueOf(var18_29 /* !! */ );
                                                                                    var19_31 = String.valueOf(var4_4);
                                                                                    var8_14 /* !! */  = var6_12;
                                                                                    var6_12.setMedia$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var10_17 /* !! */ , (String)var12_20, (String)var13_22 /* !! */ , (String)var14_24, var18_29 /* !! */ , (String)var19_31, var21_34);
                                                                                    var4_4 = var3_3.k;
                                                                                    if (var4_4 != null && (var5_11 = var4_4.a) != null) {
                                                                                        var8_14 /* !! */  = var3_3.h;
                                                                                        Intrinsics.checkNotNull(var4_4);
                                                                                        var4_4 = var5_11.k((m)var4_4, (String)var8_14 /* !! */ );
                                                                                    } else {
                                                                                        var4_4 = null;
                                                                                    }
                                                                                    var4_4 = var3_3.a((List)var4_4, false);
                                                                                    var5_11 = new JSONArray((Collection)var4_4);
                                                                                    var8_14 /* !! */  = "impression";
                                                                                    var15_26.put((String)var8_14 /* !! */ , var5_11);
                                                                                    var6_12.setImpressions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((List)var4_4);
                                                                                    var4_4 = var3_3.k;
                                                                                    if (var4_4 != null && (var5_11 = var4_4.a) != null) {
                                                                                        var8_14 /* !! */  = var3_3.h;
                                                                                        Intrinsics.checkNotNull(var4_4);
                                                                                        var4_4 = var5_11.m((m)var4_4, (String)var8_14 /* !! */ );
                                                                                    } else {
                                                                                        var4_4 = null;
                                                                                    }
                                                                                    var4_4 = var3_3.a((List)var4_4, false);
                                                                                    var5_11 = new JSONArray((Collection)var4_4);
                                                                                    var8_14 /* !! */  = "viewableimpressions";
                                                                                    var15_26.put((String)var8_14 /* !! */ , var5_11);
                                                                                    var6_12.setViewableImpressions$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((List)var4_4);
                                                                                    var4_4 = new JSONObject();
                                                                                    var5_11 = var3_3.k;
                                                                                    var17_28 = 1;
                                                                                    if (var5_11 == null || (var5_11 = var5_11.a) == null) ** GOTO lbl-1000
                                                                                    var5_11 = var5_11.g;
                                                                                    var10_17 /* !! */  = var3_3.h;
                                                                                    var11_19 = var5_11.isEmpty() ^ var17_28;
                                                                                    if (var11_19 != 0) {
                                                                                        var5_11 = var5_11.get(var10_17 /* !! */ );
                                                                                        var5_11 = (String)var5_11;
                                                                                    } else lbl-1000:
                                                                                    // 2 sources

                                                                                    {
                                                                                        var20_33 = 0;
                                                                                        var5_11 = null;
                                                                                    }
                                                                                    var10_17 /* !! */  = var3_3.k;
                                                                                    if (var10_17 /* !! */  == null || (var10_17 /* !! */  = var10_17 /* !! */ .a) == null) ** GOTO lbl-1000
                                                                                    var12_20 = var3_3.h;
                                                                                    var10_17 /* !! */  = var10_17 /* !! */ .t;
                                                                                    if (var10_17 /* !! */  != null) {
                                                                                        Intrinsics.checkNotNull(var10_17 /* !! */ );
                                                                                        var10_17 /* !! */  = var10_17 /* !! */ .get(var12_20);
                                                                                        var10_17 /* !! */  = (String)var10_17 /* !! */ ;
                                                                                    } else lbl-1000:
                                                                                    // 2 sources

                                                                                    {
                                                                                        var10_17 /* !! */  = null;
                                                                                    }
                                                                                    var12_20 = var3_3.k;
                                                                                    if (var12_20 != null && (var12_20 = var12_20.a) != null) {
                                                                                        var13_22 /* !! */  = var3_3.h;
                                                                                        Intrinsics.checkNotNull(var13_22 /* !! */ );
                                                                                        var14_24 = var3_3.k;
                                                                                        Intrinsics.checkNotNull(var14_24);
                                                                                        var12_20 = var12_20.e((m)var14_24, (String)var13_22 /* !! */ );
                                                                                    } else {
                                                                                        var11_19 = 0;
                                                                                        var12_20 = null;
                                                                                    }
                                                                                    var13_22 /* !! */  = var3_3.k;
                                                                                    if (var13_22 /* !! */  != null && (var13_22 /* !! */  = var13_22 /* !! */ .a) != null) {
                                                                                        var14_24 = var3_3.h;
                                                                                        var13_22 /* !! */  = var13_22 /* !! */ .u;
                                                                                        var13_22 /* !! */  = var13_22 /* !! */ .get(var14_24);
                                                                                        var13_22 /* !! */  = (String)var13_22 /* !! */ ;
                                                                                    } else {
                                                                                        var16_27 = false;
                                                                                        var13_22 /* !! */  = null;
                                                                                    }
                                                                                    var14_24 = var3_3.o;
                                                                                    var14_24 = var14_24.k0();
                                                                                    var18_29 /* !! */  = JioAdView$AdState.DESTROYED;
                                                                                    if (var14_24 != var18_29 /* !! */ ) ** GOTO lbl-1000
                                                                                    return null;
lbl-1000:
                                                                                    // 1 sources

                                                                                    {
                                                                                        var14_24 = var3_3.o;
                                                                                        var14_24 = var14_24.Y();
                                                                                        var12_20 = var3_3.a((List)var12_20, (boolean)var17_28);
                                                                                        var23_35 = TextUtils.isEmpty((CharSequence)var5_11);
                                                                                        if (var23_35) ** GOTO lbl305
                                                                                        var18_29 /* !! */  = new Object();
                                                                                        var18_29 /* !! */ .p = var14_24;
                                                                                        var19_31 = var3_3.o;
                                                                                        var18_29 /* !! */ .q = var19_31 = var19_31.P();
                                                                                        var18_29 /* !! */ .a = var5_11;
                                                                                        var18_29 /* !! */ .b = var5_11 = var3_3.c;
                                                                                        var5_11 = "";
                                                                                        if (var14_24 == null) break block88;
                                                                                        var19_31 = "context";
                                                                                        Intrinsics.checkNotNullParameter(var14_24, (String)var19_31);
                                                                                        var19_31 = "common_prefs";
                                                                                        var24_36 = "advid";
                                                                                    }
                                                                                    try {
                                                                                        var19_31 = j_0.d((Context)var14_24, (String)var19_31, 0, var5_11, (String)var24_36);
                                                                                        var24_36 = "null cannot be cast to non-null type kotlin.String";
                                                                                        Intrinsics.checkNotNull(var19_31, (String)var24_36);
                                                                                        var19_31 = (String)var19_31;
                                                                                    }
                                                                                    catch (Exception v0) {}
                                                                                }
                                                                                var19_31 = null;
                                                                                {
                                                                                    var18_29 /* !! */ .r = var19_31;
                                                                                    var19_31 = Utility.INSTANCE;
                                                                                    var24_36 = var19_31.getUidFromPreferences((Context)var14_24);
                                                                                    var18_29 /* !! */ .s = var24_36;
                                                                                    var18_29 /* !! */ .e = var24_36 = Boolean.TRUE;
                                                                                    var24_36 = var3_3.h;
                                                                                    var25_37 = var3_3.b;
                                                                                    var8_14 /* !! */  = var3_3.p;
                                                                                    if (var8_14 /* !! */  != null) {
                                                                                        var8_14 /* !! */  = (f)var8_14 /* !! */ ;
                                                                                        var8_14 /* !! */  = var8_14 /* !! */ .a;
                                                                                        var8_14 /* !! */  = com.jio.jioads.controller.o.o((o)var8_14 /* !! */ , (String)var24_36, (String)var25_37, null);
                                                                                    } else {
                                                                                        var17_28 = 0;
                                                                                        var8_14 /* !! */  = null;
                                                                                    }
                                                                                    var18_29 /* !! */ .d = var8_14 /* !! */ ;
                                                                                    var17_28 = this.getSequence$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                                                    var8_14 /* !! */  = Integer.valueOf(var17_28);
                                                                                    var18_29 /* !! */ .l = var8_14 /* !! */ ;
                                                                                    var8_14 /* !! */  = var3_3.o;
                                                                                    var8_14 /* !! */  = var8_14 /* !! */ .q0();
                                                                                    var18_29 /* !! */ .w = var8_14 /* !! */ ;
                                                                                    var8_14 /* !! */  = Boolean.FALSE;
                                                                                    var18_29 /* !! */ .n = var8_14 /* !! */ ;
                                                                                    var18_29 /* !! */ .o = var8_14 /* !! */ ;
                                                                                    var8_14 /* !! */  = var3_3.k;
                                                                                    if (var8_14 /* !! */  != null) {
                                                                                        var17_28 = 1;
                                                                                    } else {
                                                                                        var17_28 = 0;
                                                                                        var8_14 /* !! */  = null;
                                                                                    }
                                                                                    var8_14 /* !! */  = Boolean.valueOf((boolean)var17_28);
                                                                                    var18_29 /* !! */ .m = var8_14 /* !! */ ;
                                                                                    var8_14 /* !! */  = var3_3.o;
                                                                                    var8_14 /* !! */ .L();
                                                                                    var8_14 /* !! */  = var3_3.o;
                                                                                    var17_28 = var8_14 /* !! */ .W();
                                                                                    var8_14 /* !! */  = Integer.valueOf(var17_28);
                                                                                    var18_29 /* !! */ .F = var8_14 /* !! */ ;
                                                                                    var8_14 /* !! */  = var3_3.o;
                                                                                    var8_14 /* !! */  = var8_14 /* !! */ .K();
                                                                                    var18_29 /* !! */ .u = var8_14 /* !! */ ;
                                                                                    var8_14 /* !! */  = var3_3.d;
                                                                                    if (var8_14 /* !! */  == null || (var8_14 /* !! */  = var8_14 /* !! */ .getPackageName()) == null) {
                                                                                        var8_14 /* !! */  = var5_11;
                                                                                    }
                                                                                    var18_29 /* !! */ .h = var8_14 /* !! */ ;
                                                                                    if (var14_24 != null) {
                                                                                        var5_11 = var19_31.getCbValue((Context)var14_24, (String)var5_11);
                                                                                    } else {
                                                                                        var20_33 = 0;
                                                                                        var5_11 = null;
                                                                                    }
                                                                                    var18_29 /* !! */ .i = var5_11;
                                                                                    var5_11 = var19_31.replaceMacros((k)var18_29 /* !! */ );
lbl305:
                                                                                    // 2 sources

                                                                                    var8_14 /* !! */  = "brandUrl";
                                                                                    var4_4.put((String)var8_14 /* !! */ , (Object)var13_22 /* !! */ );
                                                                                    var8_14 /* !! */  = "clickThrough";
                                                                                    var4_4.put((String)var8_14 /* !! */ , var5_11);
                                                                                    var8_14 /* !! */  = "clickTracking";
                                                                                    var14_24 = new JSONArray();
                                                                                    var4_4.put((String)var8_14 /* !! */ , var14_24);
                                                                                    var8_14 /* !! */  = "videoClicks";
                                                                                    var15_26.put((String)var8_14 /* !! */ , var4_4);
                                                                                    var6_12.setBrandUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var13_22 /* !! */ );
                                                                                    var6_12.setClickThroughUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var5_11);
                                                                                    var6_12.setClickTrackingUrls$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((List)var12_20);
                                                                                    var6_12.setCtaUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var10_17 /* !! */ );
                                                                                    var4_4 = var3_3.k;
                                                                                    var5_11 = "start";
                                                                                    if (var4_4 != null && (var8_14 /* !! */  = var4_4.a) != null) {
                                                                                        var10_17 /* !! */  = var3_3.h;
                                                                                        Intrinsics.checkNotNull(var4_4);
                                                                                        var4_4 = var8_14 /* !! */ .f((m)var4_4, (String)var5_11, (String)var10_17 /* !! */ );
                                                                                    } else {
                                                                                        var4_4 = null;
                                                                                    }
                                                                                    var4_4 = var3_3.a((List)var4_4, false);
                                                                                    var8_14 /* !! */  = var3_3.k;
                                                                                    var10_17 /* !! */  = "firstQuartile";
                                                                                    if (var8_14 /* !! */  != null && (var12_20 = var8_14 /* !! */ .a) != null) {
                                                                                        var13_22 /* !! */  = var3_3.h;
                                                                                        Intrinsics.checkNotNull(var8_14 /* !! */ );
                                                                                        var8_14 /* !! */  = var12_20.f((m)var8_14 /* !! */ , (String)var10_17 /* !! */ , (String)var13_22 /* !! */ );
                                                                                    } else {
                                                                                        var17_28 = 0;
                                                                                        var8_14 /* !! */  = null;
                                                                                    }
                                                                                    var8_14 /* !! */  = var3_3.a((List)var8_14 /* !! */ , false);
                                                                                    var12_20 = var3_3.k;
                                                                                    var13_22 /* !! */  = "midpoint";
                                                                                    if (var12_20 != null && (var14_24 = var12_20.a) != null) {
                                                                                        var18_29 /* !! */  = var3_3.h;
                                                                                        Intrinsics.checkNotNull(var12_20);
                                                                                        var12_20 = var14_24.f((m)var12_20, (String)var13_22 /* !! */ , var18_29 /* !! */ );
                                                                                    } else {
                                                                                        var11_19 = 0;
                                                                                        var12_20 = null;
                                                                                    }
                                                                                    var12_20 = var3_3.a((List)var12_20, false);
                                                                                    var14_24 = var3_3.k;
                                                                                    var18_29 /* !! */  = "thirdQuartile";
                                                                                    if (var14_24 != null && (var19_31 = var14_24.a) != null) {
                                                                                        var24_36 = var3_3.h;
                                                                                        Intrinsics.checkNotNull(var14_24);
                                                                                        var14_24 = var19_31.f((m)var14_24, var18_29 /* !! */ , (String)var24_36);
                                                                                    } else {
                                                                                        var14_24 = null;
                                                                                    }
                                                                                    var14_24 = var3_3.a((List)var14_24, false);
                                                                                    var19_31 = var3_3.k;
                                                                                    var24_36 = "complete";
                                                                                    if (var19_31 != null && (var25_37 = var19_31.a) != null) {
                                                                                        var7_13 = var3_3.h;
                                                                                        Intrinsics.checkNotNull(var19_31);
                                                                                        var7_13 = var25_37.f((m)var19_31, (String)var24_36, (String)var7_13);
                                                                                    } else {
                                                                                        var7_13 = null;
                                                                                    }
                                                                                    var7_13 = var3_3.a((List)var7_13, false);
                                                                                    var19_31 = var3_3.k;
                                                                                    var25_37 = "mute";
                                                                                    if (var19_31 == null) break block89;
                                                                                }
                                                                                var9_16 = var19_31.a;
                                                                                if (var9_16 == null) break block89;
                                                                                var26_38 = var6_12;
                                                                                {
                                                                                    catch (JSONException var4_7) {
                                                                                        var26_38 = var6_12;
                                                                                        ** GOTO lbl-1000
                                                                                    }
                                                                                    ** try [egrp 6[TRYBLOCK] [222 : 2453->3036)] { 
lbl381:
                                                                                    // 1 sources

                                                                                    var6_12 = var3_3.h;
                                                                                    Intrinsics.checkNotNull(var19_31);
                                                                                    var6_12 = var9_16.f((m)var19_31, (String)var25_37, (String)var6_12);
lbl384:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var19_31 = null;
                                                                                        var6_12 = var3_3.a((List)var6_12, false);
                                                                                        var19_31 = var3_3.k;
                                                                                        var9_16 = "unmute";
                                                                                        if (var19_31 == null) break block90;
                                                                                        break block91;
                                                                                        break;
                                                                                    }
                                                                                }
lbl391:
                                                                                // 1 sources

                                                                                catch (JSONException var4_6) lbl-1000:
                                                                                // 2 sources

                                                                                {
                                                                                    var5_11 = var3_3;
lbl393:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var3_3 = var26_38;
                                                                                        break block86;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            var26_38 = var6_12;
                                                                            var6_12 = null;
                                                                            ** while (true)
                                                                        }
                                                                        var27_39 = var15_26;
                                                                        var15_26 = var19_31.a;
                                                                        if (var15_26 != null) {
                                                                            var1_1 = var25_37;
                                                                            var25_37 = var3_3.h;
                                                                            Intrinsics.checkNotNull(var19_31);
                                                                            var19_31 = var15_26.f((m)var19_31, (String)var9_16, (String)var25_37);
lbl408:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var25_37 = null;
                                                                                var19_31 = var3_3.a((List)var19_31, false);
                                                                                var25_37 = var3_3.k;
                                                                                var15_26 = "pause";
                                                                                if (var25_37 == null) break block92;
                                                                                break block93;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var1_1 = var25_37;
                                                                        break block101;
                                                                    }
                                                                    var1_1 = var25_37;
                                                                    var27_39 = var15_26;
                                                                }
                                                                var19_31 = null;
                                                                ** while (true)
                                                            }
                                                            var2_2 = var9_16;
                                                            var9_16 = var25_37.a;
                                                            if (var9_16 != null) {
                                                                var28_40 = var19_31;
                                                                var19_31 = var3_3.h;
                                                                Intrinsics.checkNotNull(var25_37);
                                                                var19_31 = var9_16.f((m)var25_37, (String)var15_26, (String)var19_31);
lbl431:
                                                                // 2 sources

                                                                while (true) {
                                                                    var25_37 = null;
                                                                    var19_31 = var3_3.a((List)var19_31, false);
                                                                    var25_37 = var3_3.k;
                                                                    var9_16 = "resume";
                                                                    if (var25_37 == null) break block94;
                                                                    break block95;
                                                                    break;
                                                                }
                                                            }
                                                            var28_40 = var19_31;
                                                            break block102;
                                                        }
                                                        var28_40 = var19_31;
                                                        var2_2 = var9_16;
                                                    }
                                                    var19_31 = null;
                                                    ** while (true)
                                                }
                                                var29_41 = var15_26;
                                                var15_26 = var25_37.a;
                                                if (var15_26 != null) {
                                                    var30_42 = var19_31;
                                                    var19_31 = var3_3.h;
                                                    Intrinsics.checkNotNull(var25_37);
                                                    var19_31 = var15_26.f((m)var25_37, (String)var9_16, (String)var19_31);
lbl454:
                                                    // 2 sources

                                                    while (true) {
                                                        var25_37 = null;
                                                        var19_31 = var3_3.a((List)var19_31, false);
                                                        var25_37 = var3_3.k;
                                                        var15_26 = "skip";
                                                        if (var25_37 == null) break block96;
                                                        break block97;
                                                        break;
                                                    }
                                                }
                                                var30_42 = var19_31;
                                                break block103;
                                            }
                                            var30_42 = var19_31;
                                            var29_41 = var15_26;
                                        }
                                        var19_31 = null;
                                        ** while (true)
                                    }
                                    var31_43 = var9_16;
                                    var9_16 = var25_37.a;
                                    if (var9_16 != null) {
                                        var32_44 = var19_31;
                                        var19_31 = var3_3.h;
                                        Intrinsics.checkNotNull(var25_37);
                                        var19_31 = var9_16.f((m)var25_37, (String)var15_26, (String)var19_31);
lbl477:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var32_44 = var19_31;
                                    break block104;
                                }
                                var32_44 = var19_31;
                                var31_43 = var9_16;
                            }
                            var19_31 = null;
                            ** while (true)
                            var25_37 = null;
                            var19_31 = var3_3.a((List)var19_31, false);
                            var25_37 = new HashMap<Object, Object>();
                            var9_16 = new JSONArray((Collection)var4_4);
                            var25_37.put((String)var5_11, var9_16);
                            var9_16 = new JSONArray((Collection)var8_14 /* !! */ );
                            var25_37.put((String)var10_17 /* !! */ , var9_16);
                            var9_16 = new JSONArray((Collection)var12_20);
                            var25_37.put((String)var13_22 /* !! */ , var9_16);
                            var9_16 = new JSONArray((Collection)var14_24);
                            var25_37.put(var18_29 /* !! */ , var9_16);
                            var9_16 = new JSONArray((Collection)var7_13);
                            var25_37.put((String)var24_36, var9_16);
                            var9_16 = new JSONArray((Collection)var6_12);
                            var3_3 = var1_1;
                            try {
                                var25_37.put((String)var1_1, var9_16);
                                var3_3 = var28_40;
                                var9_16 = new JSONArray((Collection)var28_40);
                                var3_3 = var2_2;
                                var25_37.put((String)var2_2, var9_16);
                                var3_3 = var30_42;
                                var9_16 = new JSONArray((Collection)var30_42);
                                var3_3 = var29_41;
                                var25_37.put((String)var29_41, var9_16);
                                var3_3 = var32_44;
                                var9_16 = new JSONArray((Collection)var32_44);
                                var3_3 = var31_43;
                                var25_37.put((String)var31_43, var9_16);
                                var9_16 = new JSONArray((Collection)var19_31);
                                var25_37.put((String)var15_26, var9_16);
                                var9_16 = "trackingEvents";
                                var31_43 = var15_26;
                                var15_26 = var27_39;
                                var27_39.put((String)var9_16, (Object)var25_37);
                                var25_37 = new HashMap<Object, Object>();
                                if (var4_4 != null) {
                                    var25_37.put(var5_11, var4_4);
                                    var4_4 = Unit.a;
                                }
                            }
                            catch (JSONException var4_8) {
                                var5_11 = this;
                                ** continue;
                            }
                            if (var8_14 /* !! */  != null) {
                                var25_37.put(var10_17 /* !! */ , var8_14 /* !! */ );
                                var4_4 = Unit.a;
                            }
                            if (var12_20 != null) {
                                var25_37.put(var13_22 /* !! */ , var12_20);
                                var4_4 = Unit.a;
                            }
                            if (var14_24 != null) {
                                var25_37.put(var18_29 /* !! */ , var14_24);
                                var4_4 = Unit.a;
                            }
                            if (var7_13 != null) {
                                var25_37.put(var24_36, var7_13);
                                var4_4 = Unit.a;
                            }
                            if (var6_12 != null) {
                                var4_4 = var1_1;
                                var25_37.put(var1_1, var6_12);
                                var4_4 = Unit.a;
                            }
                            if (var28_40 != null) {
                                var4_4 = var2_2;
                                var5_11 = var28_40;
                                var25_37.put(var2_2, var28_40);
                                var4_4 = Unit.a;
                            }
                            if (var30_42 != null) {
                                var4_4 = var29_41;
                                var5_11 = var30_42;
                                var25_37.put(var29_41, var30_42);
                                var4_4 = Unit.a;
                            }
                            if (var32_44 != null) {
                                var4_4 = var32_44;
                                var25_37.put(var3_3, var32_44);
                                var4_4 = Unit.a;
                            }
                            if (var19_31 != null) {
                                var4_4 = var31_43;
                                var25_37.put(var31_43, var19_31);
                                var4_4 = Unit.a;
                            }
                            var3_3 = var26_38;
                            try {
                                var26_38.setTrackingEvents$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var25_37);
                                var5_11 = this;
                            }
                            catch (JSONException var4_10) {
                                var5_11 = this;
                                break block86;
                            }
                            try {
                                var4_4 = this.k;
                                if (var4_4 != null && (var4_4 = var4_4.a) != null) {
                                    var6_12 = this.h;
                                    var4_4 = var4_4.n((String)var6_12);
                                } else {
                                    var4_4 = null;
                                }
                                var6_12 = null;
                                var4_4 = var5_11.a((List)var4_4, false);
                                var3_3.setErrorUrls$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((List)var4_4);
                                break block98;
                            }
                            catch (JSONException var4_9) {}
                        }
                        var6_12 = new StringBuilder();
                        var7_13 = var5_11.n;
                        Intrinsics.checkNotNull(var7_13);
                        var7_13 = var7_13.getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var6_12.append((String)var7_13);
                        var6_12.append(": Error while preparing custom ad metadata ");
                        var7_13 = Utility.INSTANCE;
                        var4_4 = var7_13.printStacktrace((Exception)var4_4);
                        var6_12.append((String)var4_4);
                        var4_4 = var6_12.toString();
                        var6_12 = "message";
                        Intrinsics.checkNotNullParameter(var4_4, (String)var6_12);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var4_4 = JioAds$LogLevel.NONE;
                    }
                    var6_12 = var3_3;
                    break block105;
                }
                var5_11 = var3_3;
                var4_4 = JioAdError.Companion;
                var3_3 = JioAdError$JioAdErrorType.ERROR_PARSING;
                var8_15 = j_0.c((t_0)var4_4, (JioAdError$JioAdErrorType)var3_3, "Error in parsing Video Data");
                var4_4 = var5_11.l;
                Intrinsics.checkNotNull(var4_4);
                var12_21 = com.jio.jioads.cdnlogging.d.a;
                var7_13 = var4_4;
                var7_13 = (V)var4_4;
                var13_23 = "setVideoData";
                var14_25 = "JioAd";
                var10_18 = null;
                var18_30 = "Error in parsing Video Data";
                var19_32 = null;
                var7_13.d(var8_15, false, var12_21, var13_23, var14_25, var18_30, null);
                var6_12 = null;
            }
            var4_4 = var5_11.k;
            if (var4_4 != null && (var4_4 = var4_4.a) != null) {
                var3_3 = var4_4.f;
                if (var3_3 != null) {
                    var3_3.clear();
                }
                var3_3 = null;
                var4_4.f = null;
                var4_4 = Unit.a;
            }
            return var6_12;
        }
        var5_11 = var3_3;
        return null;
    }

    public final String a(JSONObject object) {
        block4: {
            int n3;
            int n4;
            Object object2 = this.o.b();
            if (object2 != null && (n4 = ((int[])object2).length) == (n3 = 2) && object != null) {
                StringBuilder stringBuilder = new StringBuilder();
                n3 = object2[0];
                stringBuilder.append(n3);
                stringBuilder.append('x');
                n3 = 1;
                int n7 = object2[n3];
                stringBuilder.append(n7);
                object2 = stringBuilder.toString();
                n4 = (int)(object.has((String)object2) ? 1 : 0);
                if (n4 != 0) {
                    try {
                        object = object.getString((String)object2);
                        break block4;
                    }
                    catch (JSONException jSONException) {
                        object = Utility.INSTANCE.printStacktrace((Exception)((Object)jSONException));
                        object2 = "message";
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                    }
                }
            }
            object = null;
        }
        return object;
    }

    public final ArrayList a(List object, boolean bl2) {
        Object object2 = this.n;
        if (object2 != null && (object2 = this.l) != null) {
            object2 = new Object();
            if (object != null) {
                boolean bl3;
                object = object.iterator();
                while (bl3 = object.hasNext()) {
                    int n3;
                    Object object3;
                    Object object4;
                    Object object5;
                    Object object6;
                    boolean bl4;
                    JioAdView$AdState jioAdView$AdState;
                    Object object7;
                    Object object8;
                    block27: {
                        char c2;
                        block26: {
                            int n4;
                            block25: {
                                object8 = (String)object.next();
                                if (object8 == null) continue;
                                object7 = this.n;
                                Intrinsics.checkNotNull(object7);
                                if ((object7 = object7.getMAdType$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == null) continue;
                                object7 = this.o.k0();
                                if (object7 == (jioAdView$AdState = JioAdView$AdState.DESTROYED)) {
                                    return null;
                                }
                                object7 = this.o.Y();
                                bl4 = true;
                                try {
                                    object6 = this.o;
                                }
                                catch (Exception exception) {}
                                object6 = object6.b();
                                if (object6 == null) break block25;
                                int n7 = ((Object)object6).length;
                                c2 = 2;
                                if (n7 != c2) break block25;
                                object5 = new StringBuilder();
                                c2 = (char)object6[0];
                                ((StringBuilder)object5).append((int)c2);
                                c2 = 'x';
                                ((StringBuilder)object5).append(c2);
                                n4 = object6[bl4];
                                ((StringBuilder)object5).append(n4);
                                object6 = ((StringBuilder)object5).toString();
                                break block26;
                            }
                            n4 = false;
                            object6 = null;
                        }
                        object5 = new Object();
                        ((k)object5).p = object7;
                        object4 = this.o.P();
                        ((k)object5).q = object4;
                        ((k)object5).a = object8;
                        ((k)object5).b = object8 = this.c;
                        object8 = "";
                        if (object7 != null) {
                            Intrinsics.checkNotNullParameter(object7, "context");
                            object4 = "common_prefs";
                            object3 = "advid";
                            try {
                                object4 = j_0.d((Context)object7, (String)object4, 0, object8, (String)object3);
                                object3 = "null cannot be cast to non-null type kotlin.String";
                            }
                            catch (Exception exception) {}
                            Intrinsics.checkNotNull(object4, (String)object3);
                            object4 = (String)object4;
                            break block27;
                        }
                        c2 = '\u0000';
                        object4 = null;
                    }
                    ((k)object5).r = object4;
                    object4 = Utility.INSTANCE;
                    object7 = ((Utility)object4).getUidFromPreferences((Context)object7);
                    ((k)object5).s = object7;
                    ((k)object5).v = object6;
                    ((k)object5).f = object6;
                    object7 = bl2;
                    ((k)object5).e = object7;
                    object7 = this.h;
                    object6 = this.b;
                    object3 = this.p;
                    if (object3 != null) {
                        object3 = ((f)object3).a;
                        object7 = com.jio.jioads.controller.o.o((o)object3, (String)object7, (String)object6, null);
                    } else {
                        n3 = 0;
                        object7 = null;
                    }
                    ((k)object5).d = object7;
                    n3 = this.getSequence$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object7 = n3;
                    ((k)object5).l = object7;
                    object7 = this.o.q0();
                    ((k)object5).w = object7;
                    object7 = Boolean.FALSE;
                    ((k)object5).n = object7;
                    ((k)object5).o = object7;
                    object7 = this.g;
                    if (object7 != null) {
                        n3 = (int)(((JioAd$NativeAd)object7).isNativeVideoAd() ? 1 : 0);
                        object7 = n3 != 0;
                    } else {
                        object7 = this.k;
                        if (object7 == null) {
                            bl4 = false;
                            jioAdView$AdState = null;
                        }
                        object7 = bl4;
                    }
                    ((k)object5).m = object7;
                    this.o.L();
                    n3 = this.o.W();
                    object7 = n3;
                    ((k)object5).F = object7;
                    object7 = this.o.K();
                    ((k)object5).u = object7;
                    object7 = this.d;
                    if (object7 != null && (object7 = object7.getPackageName()) != null) {
                        object8 = object7;
                    }
                    ((k)object5).h = object8;
                    object8 = this.o.R();
                    ((k)object5).t = object8;
                    object8 = ((Utility)object4).replaceMacros((k)object5);
                    ((ArrayList)object2).add(object8);
                }
            }
            return object2;
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(com.jio.jioads.native.parser.a object) {
        String string2;
        int n3 = 1;
        Object object2 = new JioAd$NativeAd(this);
        this.g = object2;
        object2 = new JSONObject();
        this.j = object2;
        if (object == null) return;
        object2 = ((com.jio.jioads.native.parser.a)object).d;
        Object object3 = this.g;
        Intrinsics.checkNotNull(object3);
        ((JioAd$NativeAd)object3).setCampaignid$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
        object3 = this.j;
        Intrinsics.checkNotNull(object3);
        Object object4 = "campaignId";
        object3.put((String)object4, object2);
        this.b = object2;
        object2 = ((com.jio.jioads.native.parser.a)object).A;
        object3 = new ArrayList();
        Intrinsics.checkNotNull(object2);
        int n4 = object2.length();
        boolean bl2 = false;
        Object object5 = null;
        int n7 = 0;
        Object object6 = null;
        while (true) {
            if (n7 < n4) {
                string2 = object2.getString(n7);
                ((ArrayList)object3).add(string2);
            } else {
                object2 = this.a((List)object3, n3 != 0);
                object3 = this.g;
                Intrinsics.checkNotNull(object3);
                ((JioAd$NativeAd)object3).setClickTrackers$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((List)object2);
                object3 = this.j;
                Intrinsics.checkNotNull(object3);
                object4 = "clickTrackers";
                object6 = new JSONArray((Collection)object2);
                object3.put((String)object4, object6);
                object2 = ((com.jio.jioads.native.parser.a)object).z;
                object3 = new ArrayList();
                Intrinsics.checkNotNull(object2);
                n4 = object2.length();
                n7 = 0;
                object6 = null;
                break;
                catch (JSONException jSONException) {}
            }
            n7 += n3;
        }
        while (true) {
            if (n7 < n4) {
                string2 = object2.getString(n7);
                ((ArrayList)object3).add(string2);
            } else {
                object2 = this.a((List)object3, false);
                object3 = this.g;
                Intrinsics.checkNotNull(object3);
                ((JioAd$NativeAd)object3).setImpressionTrackers$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((List)object2);
                object3 = this.j;
                Intrinsics.checkNotNull(object3);
                object4 = "impressionTrackers";
                object6 = new JSONArray((Collection)object2);
                object3.put((String)object4, object6);
                object2 = ((com.jio.jioads.native.parser.a)object).B;
                object3 = new ArrayList();
                Intrinsics.checkNotNull(object2);
                n4 = object2.length();
                n7 = 0;
                object6 = null;
                break;
                catch (JSONException jSONException) {}
            }
            n7 += n3;
        }
        while (true) {
            block22: {
                JSONException jSONException222;
                block25: {
                    block24: {
                        block23: {
                            if (n7 < n4) {
                                string2 = object2.getString(n7);
                                ((ArrayList)object3).add(string2);
                                break block22;
                            }
                            try {
                                object2 = this.a((List)object3, false);
                                object3 = this.g;
                                Intrinsics.checkNotNull(object3);
                                ((JioAd$NativeAd)object3).setViewableImpressionTrackers$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((List)object2);
                                object3 = this.j;
                                Intrinsics.checkNotNull(object3);
                                object4 = "viewableImpressionTrackers";
                                object5 = new JSONArray((Collection)object2);
                                object3.put((String)object4, object5);
                                object2 = ((com.jio.jioads.native.parser.a)object).f;
                                object3 = this.g;
                                Intrinsics.checkNotNull(object3);
                                ((JioAd$NativeAd)object3).setCtaText$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                                object3 = this.j;
                                Intrinsics.checkNotNull(object3);
                                object4 = "ctaText";
                                object3.put((String)object4, object2);
                                object2 = ((com.jio.jioads.native.parser.a)object).j;
                                object3 = this.g;
                                Intrinsics.checkNotNull(object3);
                                ((JioAd$NativeAd)object3).setCtaBackColor$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                                object3 = this.j;
                                Intrinsics.checkNotNull(object3);
                                object4 = "ctaBackColor";
                                object3.put((String)object4, object2);
                                object2 = ((com.jio.jioads.native.parser.a)object).i;
                                object3 = this.g;
                                Intrinsics.checkNotNull(object3);
                                ((JioAd$NativeAd)object3).setCtaTextColor$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                                object3 = this.j;
                                Intrinsics.checkNotNull(object3);
                                object4 = "ctaTextColor";
                                object3.put((String)object4, object2);
                                object2 = ((com.jio.jioads.native.parser.a)object).D;
                                object2 = this.a((JSONObject)object2);
                                object3 = this.g;
                                Intrinsics.checkNotNull(object3);
                                ((JioAd$NativeAd)object3).setCustomImage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                                object3 = this.j;
                                Intrinsics.checkNotNull(object3);
                                object4 = "customImage";
                                object3.put((String)object4, object2);
                                object2 = new HashMap();
                                object3 = ((com.jio.jioads.native.parser.a)object).D;
                                if (object3 == null) break block23;
                                object4 = object3.keys();
                                break block24;
                            }
                            catch (JSONException jSONException222) {
                                break block25;
                            }
                        }
                        n4 = 0;
                        object4 = null;
                    }
                    if (object4 != null) {
                        while (bl2 = object4.hasNext()) {
                            object5 = object4.next();
                            object5 = (String)object5;
                            object6 = object3.getString((String)object5);
                            Intrinsics.checkNotNull(object5);
                            Intrinsics.checkNotNull(object6);
                            ((HashMap)object2).put(object5, object6);
                        }
                    }
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setCustomImages$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((HashMap)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "customImages";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).l;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setDescription$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "description";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).t;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setDescription2$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "description2";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).o;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setIconImage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "iconImage";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).p;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setMainImage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "mainImage";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).q;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setMediumImage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "mediumImage";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).k;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setLinkFallback$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "linkFallback";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).s;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setSponsored$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "sponsored";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).b;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setTitle$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "title";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).c;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setObjective$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "objective";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).m;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setDownloads$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "downloads";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).a;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setRating$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "ratings";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).u;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setLikes$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "likes";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).v;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setSalePrice$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "salePrice";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).n;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setPrice$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "price";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).w;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setPhone$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "phone";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).M;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setCategory$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "category";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).N;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setBrand$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "brand";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).R;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setCurrency$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "currency";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).T;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setDiscountPrice$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "discountPrice";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).Q;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setExpiry$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "expiry";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).P;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setSegment$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "segment";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).O;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setEComSrc$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "ecomSrc";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).S;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setDiscountPercentage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "discountPercentage";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).J;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setContentId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "contentId";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).K;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setSecondContentId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "secondContentId";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).L;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setSlotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "slotId";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).h;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setBrandUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "brandUrl";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).x;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setAddress$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "address";
                    object3.put((String)object4, object2);
                    object2 = ((com.jio.jioads.native.parser.a)object).y;
                    object3 = this.g;
                    Intrinsics.checkNotNull(object3);
                    ((JioAd$NativeAd)object3).setDisplayUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                    object3 = this.j;
                    Intrinsics.checkNotNull(object3);
                    object4 = "displayUrl";
                    object3.put((String)object4, object2);
                    object2 = this.o;
                    object2 = object2.K();
                    boolean bl3 = ((com.jio.jioads.native.parser.a)object).c((JioAdView$AD_TYPE)((Object)object2));
                    if (bl3 && (object2 = this.k) != null) {
                        object2 = ((com.jio.jioads.native.parser.a)object).H;
                        object3 = this.g;
                        Intrinsics.checkNotNull(object3);
                        ((JioAd$NativeAd)object3).setVideo$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
                        object3 = this.j;
                        Intrinsics.checkNotNull(object3);
                        object4 = "video";
                        object3.put((String)object4, object2);
                        object2 = this.g;
                        Intrinsics.checkNotNull(object2);
                        object3 = this.a();
                        ((JioAd$NativeAd)object2).setVideoData$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((JioAd$VideoAd)object3);
                        object2 = this.g;
                        Intrinsics.checkNotNull(object2);
                        ((JioAd$NativeAd)object2).setNativeVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(n3 != 0);
                        object2 = this.j;
                        Intrinsics.checkNotNull(object2);
                        object3 = "isNativeVideoAd";
                        object2.put((String)object3, n3 != 0);
                    }
                    Object object7 = ((com.jio.jioads.native.parser.a)object).g;
                    object2 = this.g;
                    Intrinsics.checkNotNull(object2);
                    ((JioAd$NativeAd)object2).setCtaUrl$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object7);
                    object2 = this.j;
                    Intrinsics.checkNotNull(object2);
                    object3 = "ctaUrl";
                    object2.put((String)object3, object7);
                    object = ((com.jio.jioads.native.parser.a)object).I;
                    object7 = this.g;
                    Intrinsics.checkNotNull(object7);
                    ((JioAd$NativeAd)object7).setCtaAppName$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object);
                    object7 = this.j;
                    Intrinsics.checkNotNull(object7);
                    object2 = "ctaAppPackgeName";
                    object7.put((String)object2, object);
                    return;
                }
                CharSequence charSequence = new StringBuilder("Exception in parseNativeData JioAd ");
                object2 = Utility.INSTANCE;
                Object object8 = ((Utility)object2).printStacktrace((Exception)((Object)jSONException222));
                charSequence.append((String)object8);
                object8 = charSequence.toString();
                charSequence = "message";
                Intrinsics.checkNotNullParameter(object8, (String)charSequence);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object8 = JioAds$LogLevel.NONE;
                return;
                catch (JSONException jSONException3) {}
            }
            n7 += n3;
        }
    }

    public final void destroy() {
        Object object = new StringBuilder();
        Object object2 = this.n;
        object2 = object2 != null ? ((JioAdView)object2).getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : null;
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(": destroy called on JioAd adId: ");
        object2 = this.h;
        String string2 = "message";
        ir3_0.b((StringBuilder)object, (String)object2, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        this.a = true;
        this.d = null;
        this.e = 0;
        object = this.f;
        if (object != null) {
            ((AdEventTracker)object).destroy$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        this.f = null;
        this.g = null;
        this.h = null;
        this.b = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.n = null;
        this.l = null;
        this.m = null;
    }

    public final int getAdCategory() {
        return this.e;
    }

    public final AdEventTracker getAdEventTracker() {
        return this.f;
    }

    public final String getAdId() {
        return this.h;
    }

    public final String getCampaignId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.b;
    }

    public final String getMCcbString$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.c;
    }

    public final JSONObject getMetadata() {
        Object object;
        boolean bl2 = this.a;
        if (!bl2 && (object = this.n) != null) {
            object = new StringBuilder();
            Object object2 = this.n;
            Intrinsics.checkNotNull(object2);
            object2 = ((JioAdView)object2).getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(": publisher called getMetadata()");
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return this.j;
        }
        return null;
    }

    public final JioAd$NativeAd getNativeAd() {
        Object object;
        boolean bl2 = this.a;
        if (!bl2 && (object = this.n) != null && (object = this.l) != null) {
            object = new StringBuilder();
            Object object2 = this.n;
            Intrinsics.checkNotNull(object2);
            object2 = ((JioAdView)object2).getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(": publisher called getNativeAd()");
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return this.g;
        }
        return null;
    }

    public final JioAd$NativeAd getNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.g;
    }

    public final int getSequence$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        int n3;
        Integer n4 = this.m;
        if (n4 != null) {
            n3 = n4;
        } else {
            n3 = 0;
            n4 = null;
        }
        return n3;
    }

    public final JioAd$VideoAd getVideoAd() {
        Object object;
        boolean bl2 = this.a;
        if (!bl2 && (object = this.n) != null && (object = this.l) != null) {
            object = new StringBuilder();
            Object object2 = this.n;
            Intrinsics.checkNotNull(object2);
            object2 = ((JioAdView)object2).getMAdspotId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(": publisher called getVideoAd()");
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return this.i;
        }
        return null;
    }

    public final JioAd$VideoAd getVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() {
        return this.i;
    }

    public final void setCampaignId$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(String string2) {
        this.b = string2;
    }

    public final void setNativeAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAd$NativeAd jioAd$NativeAd) {
        this.g = jioAd$NativeAd;
    }

    public final void setVideoAd$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(JioAd$VideoAd jioAd$VideoAd) {
        this.i = jioAd$VideoAd;
    }
}

