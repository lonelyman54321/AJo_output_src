/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.jioreel.ssai;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.appsflyer.internal.e_0;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.adinterfaces.JioAdsMetadata$Builder;
import com.jio.jioads.adinterfaces.JioAdsTracker;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.controller.JioAdRequestGenerator;
import com.jio.jioads.jioreel.data.StreamType;
import com.jio.jioads.jioreel.data.e;
import com.jio.jioads.jioreel.data.f;
import com.jio.jioads.jioreel.listeners.JioReelListener;
import com.jio.jioads.jioreel.network.b;
import com.jio.jioads.jioreel.ssai.g;
import com.jio.jioads.jioreel.ssai.j;
import com.jio.jioads.jioreel.ssai.o;
import com.jio.jioads.jioreel.vast.a;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class p {
    public static p t;
    public final Context a;
    public final JioReelListener b;
    public final hh3_2 c;
    public String d;
    public String e;
    public String f;
    public final HashMap g;
    public final HashMap h;
    public final LinkedHashMap i;
    public StreamType j;
    public e k;
    public Boolean l;
    public String m;
    public final String n;
    public final String o;
    public final JioAdsTracker p;
    public int q;
    public JioAdsMetadata r;
    public boolean s;

    public p(Context context, JioReelListener hashMap) {
        this.a = context;
        this.b = hashMap;
        hashMap = yr1_2.b(com.jio.jioads.jioreel.ssai.g.c);
        this.c = hashMap;
        this.g = hashMap = new HashMap();
        this.h = hashMap = new HashMap();
        this.i = hashMap = new HashMap();
        Object object = Boolean.TRUE;
        this.l = object;
        this.n = "SPOT";
        this.o = "SSAI";
        this.p = object = new JioAdsTracker(context, hashMap);
        this.q = 8;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean d(String var0) {
        block47: {
            block48: {
                block40: {
                    block45: {
                        block46: {
                            block44: {
                                block43: {
                                    block42: {
                                        block41: {
                                            block39: {
                                                block35: {
                                                    block38: {
                                                        block37: {
                                                            block36: {
                                                                var1_1 = "matcher(...)";
                                                                var2_2 = "(\\d+)\\.(\\d+)\\.(\\d+)";
                                                                var3_3 = "group(...)";
                                                                var4_4 = "2.12.0";
                                                                var5_5 = 3;
                                                                var6_6 = 2;
                                                                var7_7 = 1;
                                                                var8_8 = Pattern.compile((String)var2_2);
                                                                var4_4 = var8_8.matcher((CharSequence)var4_4);
                                                                Intrinsics.checkNotNullExpressionValue(var4_4, var1_1);
                                                                var9_9 = var4_4.find();
                                                                if (var9_9 == 0) break block35;
                                                                var8_8 = var4_4.group(var7_7);
                                                                if (var8_8 == null) break block36;
                                                                var8_8 = var4_4.group(var7_7);
                                                                Intrinsics.checkNotNullExpressionValue(var8_8, var3_3);
                                                                var9_9 = Integer.parseInt((String)var8_8);
                                                            }
                                                            var9_9 = 0;
                                                            var8_8 = null;
                                                            var10_10 = var4_4.group(var6_6);
                                                            if (var10_10 == null) break block37;
                                                            var10_10 = var4_4.group(var6_6);
                                                            Intrinsics.checkNotNullExpressionValue(var10_10, var3_3);
                                                            var11_12 = Integer.parseInt(var10_10);
                                                        }
                                                        var11_12 = 0;
                                                        var10_10 = null;
                                                        try {
                                                            var12_13 = var4_4.group(var5_5);
                                                            if (var12_13 == null) break block38;
                                                        }
                                                        catch (Exception v0) {}
                                                        var4_4 = var4_4.group(var5_5);
                                                        Intrinsics.checkNotNullExpressionValue(var4_4, var3_3);
                                                        var13_14 = Integer.parseInt((String)var4_4);
                                                        break block39;
                                                    }
lbl51:
                                                    // 2 sources

                                                    while (true) {
                                                        var13_14 = 0;
                                                        var4_4 = null;
                                                        break block39;
                                                        break;
                                                    }
                                                    catch (Exception v1) lbl-1000:
                                                    // 2 sources

                                                    {
                                                        while (true) {
                                                            var11_12 = 0;
                                                            var10_10 = null;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                }
                                                var13_14 = 0;
                                                var4_4 = null;
                                                var9_9 = 0;
                                                var8_8 = null;
                                                var11_12 = 0;
                                                var10_11 = null;
                                                break block39;
                                                catch (Exception v2) {
                                                    var9_9 = 0;
                                                    var8_8 = null;
                                                    ** continue;
                                                }
                                            }
                                            try {
                                                var2_2 = Pattern.compile((String)var2_2);
                                            }
                                            catch (Exception v3) {}
                                            var0 = var2_2.matcher((CharSequence)var0);
                                            Intrinsics.checkNotNullExpressionValue(var0, var1_1);
                                            var14_15 = var0.find();
                                            if (var14_15 == 0) break block40;
                                            var1_1 = var0.group(var7_7);
                                            if (var1_1 == null) break block41;
                                            var1_1 = var0.group(var7_7);
                                            Intrinsics.checkNotNullExpressionValue(var1_1, var3_3);
                                            var14_15 = Integer.parseInt(var1_1);
                                            break block42;
                                            break block48;
                                        }
                                        var14_15 = 0;
                                        var1_1 = null;
                                    }
                                    try {
                                        var2_2 = var0.group(var6_6);
                                        if (var2_2 == null) break block43;
                                    }
                                    catch (Exception v4) {
                                        break block45;
                                    }
                                    var2_2 = var0.group(var6_6);
                                    Intrinsics.checkNotNullExpressionValue(var2_2, var3_3);
                                    var15_16 = Integer.parseInt((String)var2_2);
                                    break block44;
                                }
                                var15_16 = 0;
                                var2_2 = null;
                            }
                            try {
                                var16_17 = var0.group(var5_5);
                                if (var16_17 == null) break block46;
                            }
                            catch (Exception v5) {}
                            var0 = var0.group(var5_5);
                            Intrinsics.checkNotNullExpressionValue(var0, var3_3);
                            var17_18 = Integer.parseInt((String)var0);
                            break block47;
                        }
lbl122:
                        // 2 sources

                        while (true) {
                            var17_18 = 0;
                            var0 = null;
                            break block47;
                            break;
                        }
                    }
lbl127:
                    // 2 sources

                    while (true) {
                        var15_16 = 0;
                        var2_2 = null;
                        ** continue;
                        break;
                    }
                }
                var17_18 = 0;
                var0 = null;
                var14_15 = 0;
                var1_1 = null;
                var15_16 = 0;
                var2_2 = null;
                break block47;
            }
            var14_15 = 0;
            var1_1 = null;
            ** while (true)
        }
        if (var14_15 > var9_9 || var14_15 == var9_9 && var15_16 > var11_12 || var14_15 == var9_9 && var15_16 == var11_12 && var17_18 >= var13_14) {
            var7_7 = 0;
        }
        return (boolean)var7_7;
    }

    public final a a() {
        return (a)this.c.getValue();
    }

    public final void b(int n3, String string2, String string3) {
        block12: {
            boolean bl2;
            Object object;
            int n4;
            Object object2;
            Object object3;
            int n7;
            Object object4;
            Object object5;
            block13: {
                boolean bl3;
                boolean bl4;
                object5 = "event";
                Intrinsics.checkNotNullParameter(string2, (String)object5);
                if (string3 == null || !(bl4 = Intrinsics.areEqual(object5 = this.l, object4 = Boolean.TRUE))) break block12;
                object5 = new ArrayList();
                n7 = string2.hashCode();
                switch (n7) {
                    default: {
                        break;
                    }
                    case 560220243: {
                        object3 = "firstQuartile";
                        bl3 = string2.equals(object3);
                        if (!bl3) break;
                        object5 = this.a().d((String)object3, string3);
                        break;
                    }
                    case 109757538: {
                        object3 = "start";
                        bl3 = string2.equals(object3);
                        if (!bl3) break;
                        object5 = this.a().d((String)object3, string3);
                        break;
                    }
                    case -599445191: {
                        object3 = "complete";
                        bl3 = string2.equals(object3);
                        if (!bl3) break;
                        object5 = this.a().d((String)object3, string3);
                        break;
                    }
                    case -1337830390: {
                        object3 = "thirdQuartile";
                        bl3 = string2.equals(object3);
                        if (!bl3) break;
                        object5 = this.a().d((String)object3, string3);
                        break;
                    }
                    case -1638835128: {
                        object3 = "midpoint";
                        bl3 = string2.equals(object3);
                        if (!bl3) break;
                        object5 = this.a().d((String)object3, string3);
                    }
                }
                n7 = object5.isEmpty() ^ 1;
                if (n7 == 0) break block12;
                object3 = this.g;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(string3);
                n4 = 58;
                ((StringBuilder)object2).append((char)n4);
                ((StringBuilder)object2).append(string2);
                object2 = ((StringBuilder)object2).toString();
                object2 = ((HashMap)object3).get(object2);
                if (object2 == null) break block13;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(string3);
                ((StringBuilder)object2).append((char)n4);
                ((StringBuilder)object2).append(string2);
                object2 = ((StringBuilder)object2).toString();
                object2 = ((HashMap)object3).get(object2);
                object = Boolean.FALSE;
                bl3 = Intrinsics.areEqual(object2, object);
                if (!bl3) break block12;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string3);
            ((StringBuilder)object2).append((char)n4);
            ((StringBuilder)object2).append(string2);
            object2 = ((StringBuilder)object2).toString();
            ((HashMap)object3).put(object2, object4);
            object5 = object5.iterator();
            while (bl2 = object5.hasNext()) {
                object4 = (String)object5.next();
                if (object4 == null || (n7 = ((String)object4).length()) == 0) continue;
                object3 = new Object();
                object2 = this.a;
                ((k)object3).p = object2;
                ((k)object3).a = object4;
                ((k)object3).b = object4 = this.f(string3);
                Intrinsics.checkNotNullParameter(object2, "context");
                object4 = "common_prefs";
                Object object6 = "advid";
                object = "";
                object4 = j_0.d((Context)object2, (String)object4, 0, object, (String)object6);
                object6 = "null cannot be cast to non-null type kotlin.String";
                try {
                    Intrinsics.checkNotNull(object4, (String)object6);
                    object4 = (String)object4;
                }
                catch (Exception exception) {
                    bl2 = false;
                    object4 = null;
                }
                ((k)object3).r = object4;
                object4 = Utility.INSTANCE;
                object6 = ((Utility)object4).getUidFromPreferences((Context)object2);
                ((k)object3).s = object6;
                ((k)object3).t = object6 = this.r;
                ((k)object3).e = object6 = Boolean.FALSE;
                ((k)object3).l = object6 = Integer.valueOf(n3);
                object2 = object2.getPackageName();
                ((k)object3).w = object2;
                ((k)object3).f = "video";
                object4 = ((Utility)object4).replaceMacros((k)object3);
                object3 = new b();
                object2 = new j(string2, string3, (String)object4);
                n4 = 8;
                ((b)object3).a(n4, (String)object4, (Function1)object2);
            }
        }
    }

    public final void c(f object, String object2, String object3, e object4) {
        String string2 = object.a;
        int n3 = TextUtils.isEmpty((CharSequence)string2);
        if (n3 == 0) {
            this.d = string2;
        }
        Object object5 = new JioAdsMetadata$Builder();
        Object object6 = object.c;
        this.r = object5 = ((JioAdsMetadata$Builder)object5).setCustomMetadata((Map)object6).build();
        object5 = this.a;
        object6 = new JioAdRequestGenerator((Context)object5);
        Object object7 = new LinkedHashMap();
        Object object8 = object5.getPackageName();
        Object object9 = object.c;
        int n4 = 0;
        String string3 = null;
        int n7 = 8;
        object6 = JioAdRequestGenerator.commonAdRequestParams$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease$default((JioAdRequestGenerator)object6, object7, (Map)object9, (String)object8, null, n7, null);
        object7 = new StringBuilder();
        ((StringBuilder)object7).append((String)object2);
        ((StringBuilder)object7).append(": Inside viewApiCall");
        object7 = ((StringBuilder)object7).toString();
        object9 = "message";
        Intrinsics.checkNotNullParameter(object7, (String)object9);
        object7 = JioAds.Companion;
        ((JioAds$Companion)object7).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object8 = JioAds$LogLevel.NONE;
        int n8 = TextUtils.isEmpty((CharSequence)object3);
        if (n8 == 0) {
            object8 = "cgi";
            object6.put(object8, object3);
        }
        object3 = j_0.o((Context)object5, "multiad_pref");
        object8 = "loc";
        n4 = 0;
        string3 = null;
        if ((object3 = object3.getString((String)object8, null)) != null) {
            object8 = new JSONObject((String)object3);
            if ((object3 = object8.getString("pn")) != null && (n4 = ((String)object3).length()) != 0) {
                Intrinsics.checkNotNull(object3);
                string3 = "md_pn";
                object6.put(string3, object3);
            }
            if ((object3 = object8.getString("ct")) != null && (n4 = ((String)object3).length()) != 0) {
                Intrinsics.checkNotNull(object3);
                string3 = "md_ct";
                object6.put(string3, object3);
            }
            if ((object3 = object8.getString("cn")) != null && (n4 = ((String)object3).length()) != 0) {
                Intrinsics.checkNotNull(object3);
                string3 = "md_cn";
                object6.put(string3, object3);
            }
            if ((object3 = object8.getString("st")) != null && (n8 = ((String)object3).length()) != 0) {
                Intrinsics.checkNotNull(object3);
                object8 = "md_st";
                object6.put(object8, object3);
            }
        }
        object3 = Utility.INSTANCE;
        object6 = ((Utility)object3).encodeAdRequestParameters((Map)object6, "UTF-8");
        string2 = ((Object)StringsKt.m0(string2)).toString();
        object8 = new StringBuilder();
        ((StringBuilder)object8).append((String)object2);
        ((StringBuilder)object8).append(": Stream view url is ");
        ((StringBuilder)object8).append(string2);
        Intrinsics.checkNotNullParameter(((StringBuilder)object8).toString(), (String)object9);
        ((JioAds$Companion)object7).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object8 = new StringBuilder();
        ((StringBuilder)object8).append((String)object2);
        ((StringBuilder)object8).append(": Stream type is ");
        object = object.b;
        ((StringBuilder)object8).append(object);
        Intrinsics.checkNotNullParameter(((StringBuilder)object8).toString(), (String)object9);
        ((JioAds$Companion)object7).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object8 = null;
        string3 = "?";
        n8 = (int)(StringsKt.F(string2, string3, false) ? 1 : 0);
        if (n8 == 0) {
            object8 = new StringBuilder();
            ((StringBuilder)object8).append(string2);
            char c2 = '?';
            ((StringBuilder)object8).append(c2);
            ((StringBuilder)object8).append((String)object6);
            string2 = ((StringBuilder)object8).toString();
        } else {
            object8 = new StringBuilder();
            ((StringBuilder)object8).append(string2);
            char c3 = '&';
            ((StringBuilder)object8).append(c3);
            ((StringBuilder)object8).append((String)object6);
            string2 = ((StringBuilder)object8).toString();
        }
        boolean n10 = ((Utility)object3).isInternetAvailable((Context)object5);
        if (n10) {
            object3 = com.jio.jioads.jioreel.data.e.a;
            if (object4 == object3) {
                object3 = StreamType.LIVE;
                object4 = "meta combined url ";
                if (object == object3) {
                    l_0.h((String)object4, string2);
                    ((JioAds$Companion)object7).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = new b();
                    n3 = this.q;
                    object6 = new o(this, (String)object2);
                    ((b)object3).a(n3, string2, (Function1)object6);
                }
                if (object == (object3 = StreamType.VOD)) {
                    l_0.h((String)object4, string2);
                    ((JioAds$Companion)object7).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = new b();
                    int n14 = this.q;
                    object4 = new o(this, (String)object2);
                    ((b)object).a(n14, string2, (Function1)object4);
                }
            } else {
                object = com.jio.jioads.jioreel.data.e.b;
                if (object4 == object) {
                    l_0.h("Direct MetaFormed Url : ", string2);
                    ((JioAds$Companion)object7).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = this.j;
                    object2 = StreamType.VOD;
                    if (object == object2) {
                        object = "Currently Not Supported VOD for DirectPlayBack";
                        object2 = this.b;
                        object3 = "101";
                        object2.onAdError((String)object3, (String)object);
                    } else {
                        this.f = string2;
                        object2 = Looper.getMainLooper();
                        object = new Handler((Looper)object2);
                        int n15 = 1;
                        object2 = new e_0(this, n15);
                        object.post((Runnable)object2);
                    }
                }
            }
        } else {
            object = "Internet not available";
            v12.a((String)object, (String)object9, (JioAds$Companion)object7);
        }
    }

    public final e e() {
        return this.k;
    }

    public final String f(String string2) {
        Object object;
        Object object2;
        boolean bl2;
        LinkedHashMap linkedHashMap = this.i;
        if (string2 != null && !(bl2 = linkedHashMap.containsKey(string2))) {
            object2 = Utility.INSTANCE;
            object = UUID.randomUUID().toString();
            object2 = ((Utility)object2).getCcbValue((String)object);
            linkedHashMap.put(string2, object2);
        }
        if ((object2 = (String)linkedHashMap.get(string2)) != null) {
            object = Utility.INSTANCE;
            ((Utility)object).setCCBString$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)object2);
        }
        return (String)linkedHashMap.get(string2);
    }

    public final StreamType g() {
        return this.j;
    }
}

