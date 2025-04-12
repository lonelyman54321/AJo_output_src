/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.jio.jioads.util;

import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.a;
import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.multiad.model.e;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.h;
import com.jio.jioads.util.j;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

public final class i {
    public static final i a;
    public static final HashMap b;
    public static int c;
    public static Boolean d;
    public static Integer e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static JSONObject j;
    public static int k;
    public static Integer l;
    public static Integer m;

    static {
        JSONObject jSONObject;
        HashMap hashMap = new HashMap();
        a = hashMap;
        b = hashMap = new HashMap();
        d = Boolean.FALSE;
        e = 0;
        j = jSONObject = new JSONObject();
        l = 0;
        m = 0;
    }

    public static String a(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        object = j_0.d(object, "fill_story_pref", 0, "", "fill_rate_exp");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.String");
        return (String)object;
    }

    public static String b(Context context, String string2, String string3, c c2) {
        Object object;
        block8: {
            Object object2;
            int n3;
            String string4;
            Object object3;
            Object object4;
            String string5;
            Context context2;
            block7: {
                context2 = context;
                object = string2;
                string5 = string3;
                Intrinsics.checkNotNullParameter(context, "mContext");
                object4 = "impressionHeader";
                Intrinsics.checkNotNullParameter(string2, (String)object4);
                if (string3 == null) {
                    return string2;
                }
                Intrinsics.checkNotNullParameter(string3.concat(": Inside impressionUrlForHtmlAds"), "message");
                object4 = JioAds.Companion;
                ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                string4 = "frt";
                n3 = StringsKt.F(string2, string4, false);
                int n4 = 1;
                if (n3 == 0) break block7;
                object3 = a;
                object2 = j_0.d(context, "fill_story_pref", 0, "", string3);
                String string6 = "null cannot be cast to non-null type kotlin.String";
                Intrinsics.checkNotNull(object2, string6);
                object2 = (String)object2;
                boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
                if (bl2) break block7;
                boolean bl3 = com.jio.jioads.util.i.p(context, string3);
                if (bl3) {
                    int n7;
                    object2 = string3.concat(": Fill-Rate: Not within expiry time so not replacing frt macro in impressionUrlForHtmlAds");
                    com.jio.jioads.jioreel.tracker.model.b.g((String)object2, (JioAds$Companion)object4);
                    object4 = e;
                    if (object4 != null && (n7 = ((Integer)object4).intValue()) == 0) {
                        object4 = n4;
                        e = object4;
                    }
                    Boolean bl4 = Boolean.FALSE;
                    int n8 = 480;
                    object4 = object3;
                    object3 = context;
                    object2 = c2;
                    string6 = string3;
                    com.jio.jioads.util.i.k((i)object4, context, c2, string3, bl4, bl4, null, null, null, null, n8);
                } else {
                    object3 = string3.concat(": FillRate: Within expiry time so replacing frt macro");
                    com.jio.jioads.jioreel.tracker.model.b.g((String)object3, (JioAds$Companion)object4);
                }
                if (bl3) break block8;
            }
            object4 = Utility.INSTANCE;
            object3 = com.jio.jioads.util.i.d();
            object2 = "UTF-8";
            object4 = ((Utility)object4).encodeAdRequestParameters((Map)object3, (String)object2);
            object4 = kotlin.text.b.n((String)object, string4, (String)object4, false);
            h = n3 = h + 1;
            com.jio.jioads.util.i.h(context2, string5);
            object = object4;
        }
        return object;
    }

    public static Map d() {
        Object object = "1";
        Pair pair = new Pair("req", object);
        Pair pair2 = new Pair("res", object);
        Pair pair3 = new Pair("f", object);
        Pair[] pairArray = "0";
        object = new Pair("dl", pairArray);
        Pair pair4 = new Pair("cl", pairArray);
        pairArray = new Pair[]{pair, pair2, pair3, object, pair4};
        return fh1_2.i(pairArray);
    }

    /*
     * Unable to fully structure code
     */
    public static JSONObject e(Context var0, c var1_1) {
        block5: {
            block4: {
                var2_2 = new JSONObject();
                var3_3 = "message";
                Intrinsics.checkNotNullParameter("Inside Check Fill-Rate enable", var3_3);
                var4_4 = JioAds.Companion;
                var4_4.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var5_5 = JioAds$LogLevel.NONE;
                var5_5 = j_0.o((Context)var0, "master_config_pref");
                var1_1 = (f)var1_1;
                var6_6 = var1_1.a.U();
                if (var6_6 == null || (var7_7 = var6_6.length()) == 0) break block4;
                var0 = String.valueOf(var1_1.a.U());
                break block5;
            }
            var1_1 = var0.getPackageManager();
            if (var1_1 == null) ** GOTO lbl-1000
            var0 = var0.getPackageName();
            var7_7 = 0;
            var6_6 = null;
            if ((var0 = var1_1.getPackageInfo((String)var0, 0)) != null) {
                var0 = var0.packageName;
            } else lbl-1000:
            // 2 sources

            {
                var0 = null;
            }
            var0 = String.valueOf(var0);
        }
        var1_1 = "master_config_";
        var0 = var1_1.concat((String)var0);
        var0 = var5_5.getString((String)var0, null);
        if (var0 != null && (var8_8 = var0.length()) != 0) {
            Intrinsics.checkNotNullParameter("Master config data available", var3_3);
            var4_4.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var1_1 = new JSONObject((String)var0);
            var0 = "config";
            var9_9 = var1_1.has((String)var0);
            if (var9_9 && (var9_9 = (var0 = var1_1.getJSONObject((String)var0)).has((String)(var1_1 = "f-rate")))) {
                Intrinsics.checkNotNullParameter("Fill-rate config available", var3_3);
                var4_4.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var2_2 = var0.getJSONObject((String)var1_1);
                var0 = "getJSONObject(...)";
                Intrinsics.checkNotNullExpressionValue(var2_2, (String)var0);
            }
        }
        return var2_2;
    }

    public static void f(Context context, c c2, String string2, Boolean bl2, Boolean bl3, Integer n3, Integer n4, Integer n7, Integer n8) {
        Intrinsics.checkNotNullParameter(context, "context");
        Comparable<Boolean> comparable = Boolean.TRUE;
        int n10 = Intrinsics.areEqual(bl2, comparable);
        if (n10 != 0) {
            n10 = bl2.booleanValue();
            com.jio.jioads.util.i.g(context, c2, string2, n10 != 0);
        }
        if ((comparable = e) != null && (n10 = ((Integer)comparable).intValue()) == 0 && string2 != null) {
            comparable = com.jio.jioads.util.i.n(context, string2);
            String string3 = "servedAdCount";
            n10 = comparable.optInt(string3);
            comparable = n10;
            e = comparable;
        }
        com.jio.jioads.util.i.o(context, c2, string2, bl2, bl3, n3, n4, n7, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void g(Context context, c c2, String string2, boolean bl2) {
        boolean bl3;
        Object object;
        Context context2 = context;
        String string3 = string2;
        if (context != null) {
            object = com.jio.jioads.util.i.a(context);
        } else {
            bl3 = false;
            object = null;
        }
        bl3 = TextUtils.isEmpty((CharSequence)object);
        if (!bl3) {
            if (context2 != null) {
                object = com.jio.jioads.util.i.a(context);
            } else {
                bl3 = false;
                object = null;
            }
            object = String.valueOf(object);
            JSONObject jSONObject = new JSONObject(object);
            object = new StringBuilder();
            ((StringBuilder)object).append(string3);
            Object object2 = ": Fill-Rate expiryTimeObject: ";
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(jSONObject);
            object = ((StringBuilder)object).toString();
            String string4 = "message";
            Intrinsics.checkNotNullParameter(object, string4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            Iterator iterator = jSONObject.keys();
            object = "keys(...)";
            Intrinsics.checkNotNullExpressionValue(iterator, object);
            while (bl3 = iterator.hasNext()) {
                NumberFormatException numberFormatException2;
                Object object3;
                block15: {
                    Object object4;
                    int n3;
                    Object object5;
                    int n4;
                    Object object6;
                    String string5;
                    block14: {
                        block13: {
                            object = (String)iterator.next();
                            try {
                                long l2 = Long.parseLong(object);
                                long l3 = System.currentTimeMillis();
                                long l4 = l3 - l2;
                                Object object7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                                if (object7 <= 0) continue;
                                string5 = jSONObject.optString(object);
                                object = new StringBuilder();
                                ((StringBuilder)object).append(string3);
                                object2 = ": Fill-Rate time is expired for ";
                                ((StringBuilder)object).append((String)object2);
                                ((StringBuilder)object).append(string5);
                                object = ((StringBuilder)object).toString();
                                Intrinsics.checkNotNullParameter(object, string4);
                                object = JioAds.Companion;
                                object = ((JioAds$Companion)object).getInstance();
                                ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object = JioAds$LogLevel.NONE;
                                bl3 = false;
                                object = null;
                                object2 = 0;
                                object3 = 0;
                                if (context2 == null) break block13;
                                Intrinsics.checkNotNull(string5);
                                object2 = com.jio.jioads.util.i.n(context2, string5);
                                object3 = "servedAdCount";
                                int n7 = object2.optInt((String)object3);
                                object3 = n7;
                                object6 = "cl";
                                n4 = object2.optInt((String)object6);
                                object5 = "dl";
                                n3 = object2.optInt((String)object5);
                                object4 = object2 = Integer.valueOf(n3);
                                break block14;
                            }
                            catch (NumberFormatException numberFormatException2) {
                                break block15;
                            }
                        }
                        object4 = object2;
                        n4 = 0;
                        object6 = null;
                    }
                    if (context2 != null) {
                        object2 = com.jio.jioads.util.i.a(context);
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null && (n3 = ((Integer)object3).intValue()) == 0) {
                        n3 = 1;
                        e = object2 = Integer.valueOf(n3);
                    } else {
                        object2 = e;
                        if (object2 != null && (n3 = ((Integer)object2).intValue()) == 0) {
                            e = object3;
                        }
                    }
                    Intrinsics.checkNotNull(context);
                    object5 = bl2;
                    Comparable<Boolean> comparable = Boolean.FALSE;
                    Integer n8 = n4;
                    Object object8 = 0;
                    object = 0;
                    object2 = context;
                    object3 = c2;
                    object6 = object5;
                    object5 = comparable;
                    comparable = n8;
                    n8 = object8;
                    object8 = object;
                    com.jio.jioads.util.i.o(context, c2, string5, (Boolean)object6, (Boolean)object5, (Integer)object4, (Integer)comparable, n8, (Integer)object);
                    continue;
                }
                object3 = "Exception while hitting fireFillRateBeacon : ";
                object2 = new StringBuilder((String)object3);
                ((StringBuilder)object2).append(numberFormatException2);
                Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
    }

    public static void h(Context context, String object) {
        Object object2;
        Intrinsics.checkNotNullParameter(context, "mContext");
        Intrinsics.checkNotNullParameter(object, "mAdSpotId");
        int n3 = 0;
        Object object3 = null;
        c = 0;
        i = 0;
        h = 0;
        e = 0;
        d = Boolean.FALSE;
        j = object2 = new JSONObject();
        j_0.f(context, "reqp", object);
        object2 = "fill_story_pref";
        j_0.f(context, (String)object2, object);
        Object object4 = new StringBuilder();
        ((StringBuilder)object4).append((String)object);
        ((StringBuilder)object4).append(": Clearing Fill-Rate Preferences");
        object4 = ((StringBuilder)object4).toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object4, string2);
        object4 = JioAds.Companion;
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object5 = JioAds$LogLevel.NONE;
        object5 = "";
        String string3 = "fill_rate_exp";
        String string4 = String.valueOf(j_0.d(context, (String)object2, 0, object5, string3));
        boolean bl2 = TextUtils.isEmpty((CharSequence)string4);
        if (!bl2) {
            object3 = String.valueOf(j_0.d(context, (String)object2, 0, object5, string3));
            object5 = new StringBuilder();
            ((StringBuilder)object5).append((String)object);
            string4 = ": Removing FILL_RATE_EXP";
            ((StringBuilder)object5).append(string4);
            object5 = ((StringBuilder)object5).toString();
            Intrinsics.checkNotNullParameter(object5, string2);
            object4 = ((JioAds$Companion)object4).getInstance();
            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            int n4 = ((String)object3).length();
            if (n4 > 0) {
                boolean bl3;
                object4 = new JSONObject((String)object3);
                object3 = new ArrayList();
                object5 = object4.keys();
                string4 = "keys(...)";
                Intrinsics.checkNotNullExpressionValue(object5, string4);
                while (bl2 = object5.hasNext()) {
                    string4 = (String)object5.next();
                    Object object6 = object4.get(string4);
                    boolean bl4 = Intrinsics.areEqual(object6, object);
                    if (!bl4) continue;
                    Intrinsics.checkNotNull(string4);
                    ((ArrayList)object3).add(string4);
                }
                object3 = ((ArrayList)object3).iterator();
                while (bl3 = object3.hasNext()) {
                    object5 = (String)object3.next();
                    object4.remove((String)object5);
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append((String)object);
                    ((StringBuilder)object5).append(": After Removing FILL_RATE_EXP data for adspotId ");
                    ((StringBuilder)object5).append((String)object);
                    string4 = ": ";
                    ((StringBuilder)object5).append(string4);
                    ((StringBuilder)object5).append(object4);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object5).toString(), string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object5 = JioAds$LogLevel.NONE;
                }
                n3 = object4.length();
                if (n3 != 0) {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append(": Updating FILL_RATE_EXP preferences: ");
                    ((StringBuilder)object3).append(object4);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    context = j_0.o(context, (String)object2).edit();
                    object = object4.toString();
                    context = context.putString(string3, object);
                    context.apply();
                } else {
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append(": Clearing FILL_RATE_EXP preferences");
                    Intrinsics.checkNotNullParameter(((StringBuilder)object3).toString(), string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    j_0.f(context, (String)object2, string3);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void i(Context object, String iterator, f object2) {
        void var8_13;
        Object object3;
        boolean bl2;
        Object object4 = new StringBuilder();
        ((StringBuilder)object4).append((String)((Object)iterator));
        ((StringBuilder)object4).append(": Storing Fill-rate exp for: ");
        ((StringBuilder)object4).append((String)((Object)iterator));
        object4 = ((StringBuilder)object4).toString();
        String string2 = "message";
        Intrinsics.checkNotNullParameter(object4, string2);
        object4 = JioAds.Companion;
        ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object5 = JioAds$LogLevel.NONE;
        object5 = null;
        Object object6 = object2 != null ? com.jio.jioads.util.i.e((Context)object, (c)object2) : null;
        Map map2 = b;
        boolean n3 = ((HashMap)map2).isEmpty();
        boolean bl3 = true;
        boolean bl4 = n3 ^ bl3;
        if (bl4 && (bl2 = ((HashMap)map2).containsKey(iterator))) {
            map2 = TypeIntrinsics.asMutableMap(map2);
            map2.remove(iterator);
        }
        map2 = null;
        if (object6 != null) {
            int n4 = object6.length();
        } else {
            boolean bl5 = false;
            object3 = null;
        }
        if (var8_13 > 0) {
            if (object6 != null) {
                object5 = object6.optString("exp");
            }
            if (object5 != null) {
                Iterator iterator2;
                int n7;
                object6 = Calendar.getInstance(Locale.ENGLISH);
                object3 = TimeUnit.MINUTES;
                long l2 = Long.parseLong((String)object5);
                l2 = ((TimeUnit)((Object)object3)).toMillis(l2);
                long l3 = ((Calendar)object6).getTimeInMillis() + l2;
                object3 = new JSONObject();
                object3.put("tms", l3);
                Object object7 = "0";
                object3.put("cl", object7);
                object3.put("dl", object7);
                object3.put("servedAdCount", object7);
                object2 = String.valueOf(((Object[])((f)object2).b().b)[0]);
                object3.put("reqp", object2);
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)((Object)iterator));
                String string3 = ": Storing Fillrate ExpTime:";
                ((StringBuilder)object2).append(string3);
                ((StringBuilder)object2).append(l3);
                Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), string2);
                ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = object3.toString();
                object4 = "fill_story_pref";
                j_0.p((Context)object, (String)object4, 0, object2, (String)((Object)iterator));
                object2 = com.jio.jioads.util.i.a((Context)object);
                if (object2 != null && (n7 = ((String)object2).length()) != 0) {
                    bl3 = false;
                    iterator2 = null;
                }
                if (!bl3) {
                    boolean bl6;
                    boolean bl7;
                    string2 = new JSONObject((String)object2);
                    object2 = new ArrayList();
                    object3 = new LinkedHashMap();
                    iterator2 = string2.keys();
                    string3 = "keys(...)";
                    Intrinsics.checkNotNullExpressionValue(iterator2, string3);
                    while (bl7 = iterator2.hasNext()) {
                        string3 = (String)iterator2.next();
                        object7 = string2.get(string3);
                        boolean bl8 = Intrinsics.areEqual(object7, iterator);
                        Iterator<Object> iterator3 = "";
                        if (bl8) {
                            Intrinsics.checkNotNull(string3);
                            ((ArrayList)object2).add(string3);
                            string3 = String.valueOf(l3);
                            if (iterator != null) {
                                iterator3 = iterator;
                            }
                            object3.put(string3, iterator3);
                            continue;
                        }
                        string3 = String.valueOf(l3);
                        if (iterator != null) {
                            iterator3 = iterator;
                        }
                        object3.put(string3, iterator3);
                    }
                    iterator = ((ArrayList)object2).iterator();
                    while (bl6 = iterator.hasNext()) {
                        object2 = (String)iterator.next();
                        string2.remove((String)object2);
                    }
                    iterator = ((LinkedHashMap)object3).entrySet().iterator();
                    while (bl6 = iterator.hasNext()) {
                        object2 = (Map.Entry)iterator.next();
                        object5 = (String)object2.getKey();
                        object2 = (String)object2.getValue();
                        string2.put((String)object5, object2);
                    }
                    j = string2;
                } else {
                    object2 = j;
                    string2 = String.valueOf(l3);
                    object2.put(string2, (Object)iterator);
                }
                iterator = j.toString();
                object2 = "fill_rate_exp";
                j_0.p((Context)object, (String)object4, 0, iterator, (String)object2);
            }
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)((Object)iterator));
            iterator = ": Preference fill-Rate data is empty";
            ((StringBuilder)object).append((String)((Object)iterator));
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string2);
            object = ((JioAds$Companion)object4).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
    }

    public static void j(Context object, String string2, String string3) {
        if (string3 != null) {
            int n3;
            h = n3 = h + 1;
            int n4 = g;
            if (n4 == n3) {
                com.jio.jioads.util.i.h(object, string3);
                object = new StringBuilder();
                object.append(string3);
                string3 = ": Clearing Fill-Rate Preferences for ";
                object.append(string3);
                object.append(string2);
                object = object.toString();
                string2 = "message";
                Intrinsics.checkNotNullParameter(object, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
    }

    public static /* synthetic */ void k(i i3, Context context, c c2, String string2, Boolean bl2, Boolean bl3, Integer n3, Integer n4, Integer n7, Integer n8, int n10) {
        int n14 = n10;
        int n15 = n10 & 0x20;
        Integer n16 = 0;
        Integer n17 = n15 != 0 ? n16 : n3;
        n15 = n14 & 0x40;
        Integer n18 = n15 != 0 ? n16 : n4;
        n15 = n14 & 0x80;
        Integer n19 = n15 != 0 ? n16 : n7;
        Integer n20 = (n14 &= 0x100) != 0 ? n16 : n8;
        i3.getClass();
        com.jio.jioads.util.i.f(context, c2, string2, bl2, bl3, n17, n18, n19, n20);
    }

    public static boolean l(c object) {
        int n3;
        block3: {
            block2: {
                int n4;
                if (object == null) break block2;
                Object object2 = object;
                object2 = ((f)object).a;
                int n7 = ((o)object2).o;
                n3 = 1;
                if (n7 == n3 && (object = ((f)object).a.s) != null && (object = ((a)object).b) != null && (object = ((e)object).b) != null && (object = ((com.jio.jioads.multiad.model.c)object).u) != null && (n4 = ((Integer)object).intValue()) == n3) break block3;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    public static JSONObject n(Context object, String string2) {
        JSONObject jSONObject = new JSONObject();
        object = j_0.o(object, "fill_story_pref");
        String string3 = "";
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = object.getString(string2, string3)));
        if (!bl2) {
            Intrinsics.checkNotNull(object);
            jSONObject = new JSONObject((String)object);
        }
        return jSONObject;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void o(Context var0, c var1_1, String var2_2, Boolean var3_3, Boolean var4_4, Integer var5_5, Integer var6_6, Integer var7_7, Integer var8_8) {
        block49: {
            block51: {
                block50: {
                    var9_9 /* !! */  = var0;
                    var10_12 = var2_2;
                    var11_13 = var3_3;
                    var12_14 = var4_4;
                    var13_15 /* !! */  = var7_7;
                    var14_16 = 0;
                    var15_17 = null;
                    var16_18 = 1;
                    var17_19 = new Ref$ObjectRef();
                    var18_20 = var5_5;
                    var17_19.element = var5_5;
                    var19_21 = new Ref$ObjectRef();
                    var18_20 = var6_6;
                    var19_21.element = var6_6;
                    if (var1_1 != null) {
                        var18_20 = com.jio.jioads.util.i.e(var0, var1_1);
                    } else {
                        var20_22 = 0;
                        var18_20 = null;
                    }
                    if (var18_20 != null) {
                        var21_23 = "urls";
                        var22_24 = var18_20 = var18_20.getJSONArray((String)var21_23);
                    } else {
                        var23_25 = 0;
                        var22_24 = null;
                    }
                    var18_20 = Boolean.TRUE;
                    var20_22 = Intrinsics.areEqual(var12_14, var18_20);
                    var24_26 = "message";
                    if (var20_22 != 0 && (var20_22 = (var18_20 = com.jio.jioads.util.i.b).containsKey(var10_12)) != 0) {
                        var9_9 /* !! */  = new StringBuilder();
                        var9_9 /* !! */ .append(var10_12);
                        var9_9 /* !! */ .append(": Fill-Rate time is expired for ");
                        var9_9 /* !! */ .append(var10_12);
                        var9_9 /* !! */ .append(" and F-rate beacon is fired during next ads cacheAd so ignoring Media Error");
                        Intrinsics.checkNotNullParameter(var9_9 /* !! */ .toString(), (String)var24_26);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var9_9 /* !! */  = JioAds$LogLevel.NONE;
                        return;
                    }
                    Intrinsics.checkNotNull(var2_2);
                    var18_20 = com.jio.jioads.util.i.n(var9_9 /* !! */ , var10_12);
                    var25_27 = var18_20.length();
                    var26_28 = "UTF-8";
                    var27_29 /* !! */  = "reqp";
                    if (var25_27 == 0 || (var25_27 = (int)var18_20.isNull((String)var27_29 /* !! */ )) != 0 || (var25_27 = (int)TextUtils.isEmpty((CharSequence)(var21_23 = var18_20.get((String)var27_29 /* !! */ ).toString()))) != 0) break block50;
                    var18_20 = var18_20.get((String)var27_29 /* !! */ ).toString();
                    break block51;
                }
                if (var1_1 == null) ** GOTO lbl-1000
                var18_20 = var1_1;
                var18_20 = ((f)var1_1).b();
                if (var18_20 != null) {
                    var18_20 = (Object[])var18_20.b;
                } else lbl-1000:
                // 2 sources

                {
                    var20_22 = 0;
                    var18_20 = null;
                }
                var21_23 = Utility.INSTANCE;
                if (var18_20 != null) {
                    var18_20 = var18_20[0];
                } else {
                    var20_22 = 0;
                    var18_20 = null;
                }
                var18_20 = String.valueOf(var18_20);
                var18_20 = fh1_2.q(var21_23.parseQueryString((String)var18_20));
                var18_20 = var21_23.encodeAdRequestParameters((Map)var18_20, (String)var26_28);
            }
            var28_30 = var18_20;
            if (var22_24 == null) return;
            try {
                var18_20 = new StringBuilder();
                var18_20.append(var10_12);
                var21_23 = ": Fire Fill-rate url";
                var18_20.append((String)var21_23);
                var18_20 = var18_20.toString();
                Intrinsics.checkNotNullParameter(var18_20, (String)var24_26);
                var18_20 = JioAds.Companion;
                var18_20 = var18_20.getInstance();
                var18_20.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var18_20 = JioAds$LogLevel.NONE;
                com.jio.jioads.util.i.c = var20_22 = com.jio.jioads.util.i.c + var16_18;
                var18_20 = com.jio.jioads.util.i.e;
                if (var18_20 != null && (var20_22 = var18_20.intValue()) == 0 && (var20_22 = com.jio.jioads.util.i.c) > 0 && (var20_22 = (int)Intrinsics.areEqual(var11_13, var18_20 = Boolean.FALSE)) != 0) {
                    com.jio.jioads.util.i.f = var20_22 = com.jio.jioads.util.i.c;
                }
                var25_27 = var22_24.length();
                var20_22 = 0;
                var18_20 = null;
                break block49;
            }
            catch (Exception var9_10) {}
            var18_20 = new StringBuilder("Exception while firing Fill-rate Url ");
            var21_23 = Utility.INSTANCE;
            com.jio.jioads.jioreel.tracker.model.b.c((Utility)var21_23, var9_10, (StringBuilder)var18_20);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var9_11 = JioAds$LogLevel.NONE;
            return;
        }
        while (var20_22 < var25_27) {
            block58: {
                block57: {
                    block56: {
                        block53: {
                            block55: {
                                block54: {
                                    block52: {
                                        var15_17 = new StringBuilder();
                                        var15_17.append(var10_12);
                                        var29_31 = ": f-rate Url :: ";
                                        var15_17.append((String)var29_31);
                                        var29_31 = var22_24.get(var20_22);
                                        var15_17.append(var29_31);
                                        var15_17 = var15_17.toString();
                                        Intrinsics.checkNotNullParameter(var15_17, (String)var24_26);
                                        var15_17 = JioAds.Companion;
                                        var29_31 = var15_17.getInstance();
                                        var29_31.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        var29_31 = JioAds$LogLevel.NONE;
                                        var29_31 = var22_24.get(var20_22);
                                        var29_31 = var29_31.toString();
                                        var30_32 = var20_22;
                                        var18_20 = new LinkedHashMap();
                                        var31_33 = var25_27;
                                        var21_23 = var17_19.element;
                                        var21_23 = (Integer)var21_23;
                                        var32_34 /* !! */  = var22_24;
                                        var22_24 = "1";
                                        var33_35 /* !! */  = var28_30;
                                        var28_30 = "cl";
                                        var34_36 = var27_29 /* !! */ ;
                                        var27_29 /* !! */  = "dl";
                                        var35_37 = var29_31;
                                        var29_31 = "res";
                                        var36_38 = var26_28;
                                        var26_28 = "req";
                                        var12_14 = "0";
                                        if (var21_23 == null || (var25_27 = var21_23.intValue()) != 0) break block52;
                                        var21_23 = var19_21.element;
                                        if ((var21_23 = (Integer)var21_23) == null || (var25_27 = var21_23.intValue()) != 0 || (var21_23 = com.jio.jioads.util.i.e) == null || (var25_27 = var21_23.intValue()) != 0) break block52;
                                        var21_23 = Boolean.FALSE;
                                        var25_27 = (int)Intrinsics.areEqual(var11_13, var21_23);
                                        if (var25_27 != 0 && (var25_27 = (int)com.jio.jioads.util.i.p(var9_9 /* !! */ , var10_12)) != 0) {
                                            var18_20.put(var26_28, var22_24);
                                            var18_20.put(var29_31, var22_24);
                                        } else {
                                            var18_20.put(var26_28, var12_14);
                                            var18_20.put(var29_31, var12_14);
                                        }
                                        var21_23 = var17_19.element;
                                        if (var21_23 != null && (var25_27 = (var21_23 = (Number)var21_23).intValue()) > 0) {
                                            var21_23 = var17_19.element;
                                            var21_23 = (Integer)var21_23;
                                            var21_23 = var21_23.toString();
                                        } else {
                                            var21_23 = var12_14;
                                        }
                                        var18_20.put(var27_29 /* !! */ , var21_23);
                                        var21_23 = var19_21.element;
                                        if (var21_23 != null && (var25_27 = (var21_23 = (Number)var21_23).intValue()) > 0) {
                                            var21_23 = var19_21.element;
                                            var21_23 = (Integer)var21_23;
                                            var21_23 = var21_23.toString();
                                        } else {
                                            var21_23 = var12_14;
                                        }
                                        var18_20.put(var28_30, var21_23);
                                        var37_39 = var15_17;
                                        break block53;
                                    }
                                    if ((var25_27 = (int)com.jio.jioads.util.i.p(var9_9 /* !! */ , var10_12)) == 0) break block54;
                                    var21_23 = com.jio.jioads.util.i.d;
                                    var37_39 = var15_17;
                                    var15_17 = Boolean.TRUE;
                                    var25_27 = (int)Intrinsics.areEqual(var21_23, var15_17);
                                    if (var25_27 == 0) ** GOTO lbl-1000
                                    break block55;
                                }
                                var37_39 = var15_17;
                            }
                            var21_23 = com.jio.jioads.util.i.e;
                            var25_27 = (int)Intrinsics.areEqual(var21_23, var13_15 /* !! */ );
                            if (var25_27 != 0) ** GOTO lbl-1000
                            if (var8_8 != null) {
                                var25_27 = var8_8;
                                var14_16 = 1;
                                var21_23 = var25_27 += var14_16;
                            } else {
                                var25_27 = 0;
                                var21_23 = null;
                            }
                            var25_27 = (int)Intrinsics.areEqual(var13_15 /* !! */ , var21_23);
                            if (var25_27 != 0 && (var25_27 = com.jio.jioads.util.i.i) > 0) {
                                var21_23 = String.valueOf(var25_27);
                                var18_20.put(var26_28, var21_23);
                                var25_27 = com.jio.jioads.util.i.i;
                                var21_23 = String.valueOf(var25_27);
                                var18_20.put(var29_31, var21_23);
                                var21_23 = var17_19.element;
                                if (var21_23 != null && (var25_27 = (var21_23 = (Number)var21_23).intValue()) > 0) {
                                    var21_23 = var17_19.element;
                                    var21_23 = (Integer)var21_23;
                                    var21_23 = var21_23.toString();
                                } else {
                                    var21_23 = var12_14;
                                }
                                var18_20.put(var27_29 /* !! */ , var21_23);
                                var21_23 = var19_21.element;
                                if (var21_23 != null && (var25_27 = (var21_23 = (Number)var21_23).intValue()) > 0) {
                                    var21_23 = var19_21.element;
                                    var21_23 = (Integer)var21_23;
                                    var21_23 = var21_23.toString();
                                } else {
                                    var21_23 = var12_14;
                                }
                                var18_20.put(var28_30, var21_23);
                            } else lbl-1000:
                            // 3 sources

                            {
                                var21_23 = com.jio.jioads.util.i.e;
                                var21_23 = String.valueOf(var21_23);
                                var18_20.put(var26_28, var21_23);
                                var21_23 = com.jio.jioads.util.i.e;
                                var21_23 = String.valueOf(var21_23);
                                var18_20.put(var29_31, var21_23);
                                var21_23 = var17_19.element;
                                if (var21_23 != null && (var25_27 = (var21_23 = (Number)var21_23).intValue()) > 0) {
                                    var21_23 = var17_19.element;
                                    var21_23 = (Integer)var21_23;
                                    var21_23 = var21_23.toString();
                                } else {
                                    var21_23 = var12_14;
                                }
                                var18_20.put(var27_29 /* !! */ , var21_23);
                                var21_23 = var19_21.element;
                                if (var21_23 != null && (var25_27 = (var21_23 = (Number)var21_23).intValue()) > 0) {
                                    var21_23 = var19_21.element;
                                    var21_23 = (Integer)var21_23;
                                    var21_23 = var21_23.toString();
                                } else {
                                    var21_23 = var12_14;
                                }
                                var18_20.put(var28_30, var21_23);
                            }
                        }
                        var21_23 = Boolean.TRUE;
                        var14_16 = (int)Intrinsics.areEqual(var11_13, var21_23);
                        var11_13 = "f";
                        if (var14_16 == 0) ** GOTO lbl319
                        var18_20.put(var11_13, var12_14);
                        var15_17 = var17_19.element;
                        var15_17 = (Integer)var15_17;
                        if (var15_17 == null || (var14_16 = var15_17.intValue()) != 0) break block56;
                        var15_17 = var19_21.element;
                        if ((var15_17 = (Integer)var15_17) == null || (var14_16 = var15_17.intValue()) != 0) break block56;
                        var18_20.put(var26_28, var22_24);
                        var18_20.put(var29_31, var12_14);
                        var38_40 = var21_23;
                        var39_41 = var24_26;
                        ** GOTO lbl367
                    }
                    var18_20.put(var26_28, var12_14);
                    var18_20.put(var29_31, var12_14);
                    var15_17 = com.jio.jioads.util.i.e;
                    if (var15_17 == null || (var14_16 = var15_17.intValue()) != 0) break block57;
                    var15_17 = var17_19.element;
                    if ((var15_17 = (Integer)var15_17) != null && (var14_16 = var15_17.intValue()) == 0 || (var14_16 = com.jio.jioads.util.i.f) == 0) break block57;
                    var15_17 = var1_1;
                    var15_17 = (f)var1_1;
                    var15_17 = var15_17.a;
                    var41_43 = var15_17.a0();
                    var14_16 = 10;
                    var43_44 = var14_16;
                    var41_43 /= var43_44;
                    break block58;
                }
                var38_40 = var21_23;
                var40_42 = var26_28;
                var39_41 = var24_26;
                ** GOTO lbl300
            }
            var38_40 = var21_23;
            var25_27 = com.jio.jioads.util.i.f;
            var40_42 = var26_28;
            var39_41 = var24_26;
            var45_45 = var25_27;
            var41_43 -= var45_45;
            var45_45 = var41_43 * var43_44;
            var25_27 = (int)var45_45;
            {
                var17_19.element = var21_23 = Integer.valueOf(var25_27);
lbl300:
                // 2 sources

                var21_23 = com.jio.jioads.util.i.e;
                if (var21_23 == null || (var25_27 = var21_23.intValue()) != 0) ** GOTO lbl309
                var21_23 = var19_21.element;
                if ((var21_23 = (Integer)var21_23) != null && (var25_27 = var21_23.intValue()) == 0 || (var25_27 = com.jio.jioads.util.i.f) == 0) ** GOTO lbl309
                var21_23 = var1_1;
                var21_23 = (f)var1_1;
                var25_27 = var21_23.m();
                var47_46 = com.jio.jioads.util.i.f;
            }
            {
                var19_21.element = var21_23 = Integer.valueOf(var25_27 -= var47_46);
lbl309:
                // 3 sources

                var21_23 = var17_19.element;
                var21_23 = String.valueOf(var21_23);
                var18_20.put(var27_29 /* !! */ , var21_23);
                var21_23 = var19_21.element;
                var21_23 = String.valueOf(var21_23);
                var18_20.put(var28_30, var21_23);
                var26_28 = var40_42;
                ** GOTO lbl367
lbl319:
                // 1 sources

                var38_40 = var21_23;
                var40_42 = var26_28;
                var39_41 = var24_26;
                var18_20.put(var11_13, var22_24);
                var25_27 = (int)com.jio.jioads.util.i.p(var9_9 /* !! */ , var10_12);
                if (var25_27 != 0) {
                    var21_23 = var17_19.element;
                    if (var21_23 != null && (var25_27 = (var21_23 = (Number)var21_23).intValue()) > 0 || (var21_23 = var19_21.element) != null && (var25_27 = (var21_23 = (Number)var21_23).intValue()) > 0) {
                        var21_23 = com.jio.jioads.util.i.e;
                        var21_23 = String.valueOf(var21_23);
                        var26_28 = var40_42;
                        var18_20.put(var40_42, var21_23);
                        var21_23 = com.jio.jioads.util.i.e;
                        var21_23 = String.valueOf(var21_23);
                        var18_20.put(var29_31, var21_23);
                        var21_23 = var17_19.element;
                        if (var21_23 != null && (var25_27 = (var21_23 = (Number)var21_23).intValue()) > 0) {
                            var21_23 = var17_19.element;
                            var21_23 = (Integer)var21_23;
                            var21_23 = var21_23.toString();
                        } else {
                            var21_23 = var12_14;
                        }
                        var18_20.put(var27_29 /* !! */ , var21_23);
                        var21_23 = var19_21.element;
                        if (var21_23 != null && (var25_27 = (var21_23 = (Number)var21_23).intValue()) > 0) {
                            var21_23 = var19_21.element;
                            var21_23 = (Integer)var21_23;
                            var21_23 = var21_23.toString();
                        } else {
                            var21_23 = var12_14;
                        }
                        var18_20.put(var28_30, var21_23);
                    } else {
                        var26_28 = var40_42;
                        var21_23 = com.jio.jioads.util.i.e;
                        if (var21_23 != null && (var25_27 = var21_23.intValue()) == 0) {
                            var18_20.put(var40_42, var12_14);
                            var18_20.put(var29_31, var12_14);
                            var18_20.put(var28_30, var22_24);
                            var18_20.put(var27_29 /* !! */ , var12_14);
                        }
                    }
lbl367:
                    // 6 sources

                    var13_15 /* !! */  = var4_4;
                    var21_23 = var38_40;
                    var24_26 = var39_41;
                } else {
                    var21_23 = new StringBuilder();
                    var21_23.append(var10_12);
                    var24_26 = ": Time is not expired";
                    var21_23.append((String)var24_26);
                    var21_23 = var21_23.toString();
                    var24_26 = var39_41;
                    Intrinsics.checkNotNullParameter(var21_23, var39_41);
                    var21_23 = var37_39.getInstance();
                    var21_23.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var13_15 /* !! */  = var4_4;
                    var21_23 = var38_40;
                }
                var25_27 = (int)Intrinsics.areEqual(var13_15 /* !! */ , var21_23);
                if (var25_27 != 0 && (var25_27 = (int)com.jio.jioads.util.i.p(var9_9 /* !! */ , var10_12)) == 0) {
                    var18_20 = new StringBuilder();
                    var18_20.append(var10_12);
                    var21_23 = ": Parsing Error: ";
                    var18_20.append((String)var21_23);
                    var25_27 = com.jio.jioads.util.i.i;
                    var18_20.append(var25_27);
                    var21_23 = " :: currentServingTrackNumber: ";
                    var18_20.append((String)var21_23);
                    var25_27 = com.jio.jioads.util.i.c;
                    var18_20.append(var25_27);
                    var21_23 = " :: actualServedAdCount: ";
                    var18_20.append((String)var21_23);
                    var21_23 = com.jio.jioads.util.i.e;
                    var18_20.append(var21_23);
                    var18_20 = var18_20.toString();
                    Intrinsics.checkNotNullParameter(var18_20, (String)var24_26);
                    var18_20 = var37_39.getInstance();
                    var18_20.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var20_22 = com.jio.jioads.util.i.i;
                    var18_20 = String.valueOf(var20_22);
                    var21_23 = new Pair(var26_28, var18_20);
                    var20_22 = com.jio.jioads.util.i.i;
                    var18_20 = String.valueOf(var20_22);
                    var26_28 = new Pair(var29_31, var18_20);
                    var18_20 = new Pair(var11_13, var22_24);
                    var23_25 = com.jio.jioads.util.i.c;
                    var11_13 = com.jio.jioads.util.i.e;
                    if (var11_13 != null && var23_25 == (var48_47 = var11_13.intValue())) {
                        var22_24 = var19_21.element;
                        var22_24 = String.valueOf(var22_24);
                    } else {
                        var22_24 = var12_14;
                    }
                    var11_13 = new Pair(var28_30, var22_24);
                    var49_48 = com.jio.jioads.util.i.c;
                    var22_24 = com.jio.jioads.util.i.e;
                    if (var22_24 != null && var49_48 == (var23_25 = var22_24.intValue())) {
                        var28_30 = var17_19.element;
                        var12_14 = String.valueOf(var28_30);
                    }
                    var28_30 = new Pair(var27_29 /* !! */ , var12_14);
                    var50_49 = 5;
                    var27_29 /* !! */  = new Pair[var50_49];
                    var23_25 = 0;
                    var22_24 = null;
                    var27_29 /* !! */ [0] = var21_23;
                    var25_27 = 1;
                    var27_29 /* !! */ [var25_27] = var26_28;
                    var25_27 = 2;
                    var27_29 /* !! */ [var25_27] = var18_20;
                    var20_22 = 3;
                    var27_29 /* !! */ [var20_22] = var11_13;
                    var20_22 = 4;
                    var27_29 /* !! */ [var20_22] = var28_30;
                    var18_20 = fh1_2.j(var27_29 /* !! */ );
                } else {
                    var18_20 = fh1_2.q((Map)var18_20);
                }
                var21_23 = Utility.INSTANCE;
                var26_28 = var36_38;
                var18_20 = var21_23.encodeAdRequestParameters((Map)var18_20, var36_38);
                var28_30 = "asid";
                var27_29 /* !! */  = var1_1;
                var27_29 /* !! */  = (f)var1_1;
                var27_29 /* !! */  = var27_29 /* !! */ .a;
                var27_29 /* !! */  = var27_29 /* !! */ .s;
                if (var27_29 /* !! */  != null && (var27_29 /* !! */  = var27_29 /* !! */ .b) != null && (var27_29 /* !! */  = var27_29 /* !! */ .b) != null && (var27_29 /* !! */  = var27_29 /* !! */ .t) != null) {
                    var50_49 = var27_29 /* !! */ .intValue();
                } else {
                    var50_49 = 0;
                    var27_29 /* !! */  = null;
                }
                var27_29 /* !! */  = String.valueOf(var50_49);
                var22_24 = var35_37;
                var48_47 = 1;
                var28_30 = var21_23.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var35_37, (String)var28_30, (String)var27_29 /* !! */ , (boolean)var48_47);
                var22_24 = var33_35 /* !! */ ;
                var27_29 /* !! */  = var34_36;
                var48_47 = 0;
                var11_13 = null;
                var28_30 = var21_23.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var28_30, var34_36, (String)var33_35 /* !! */ , false);
                var12_14 = "frt";
                var18_20 = var21_23.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((String)var28_30, (String)var12_14, (String)var18_20, false);
                var28_30 = new StringBuilder();
                var28_30.append(var10_12);
                var11_13 = " : Firing fill-rate url ";
                var28_30.append((String)var11_13);
                var28_30.append((String)var18_20);
                var28_30 = var28_30.toString();
                Intrinsics.checkNotNullParameter(var28_30, (String)var24_26);
                var28_30 = var37_39.getInstance();
                var28_30.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var11_13 = new com.jio.jioads.network.c(var9_9 /* !! */ );
                var18_20 = StringsKt.m0((CharSequence)var18_20);
                var35_37 = var18_20.toString();
                var37_39 = var21_23.getUserAgentHeader(var9_9 /* !! */ );
                var12_14 = null;
                var51_50 = 0;
                var14_16 = var30_32;
                var18_20 = var52_51;
                var16_18 = var31_33;
                var21_23 = var0;
                var53_52 /* !! */  = var33_35 /* !! */ ;
                var28_30 = var3_3;
                var39_41 = var34_36;
                var27_29 /* !! */  = var4_4;
                var40_42 = var26_28;
                var26_28 = var2_2;
                var54_53 = var24_26;
                var24_26 = var17_19;
                var22_24 = var19_21;
                var52_51 = new h(var0, var3_3, var4_4, var2_2, var17_19, var19_21);
                var38_40 = Boolean.FALSE;
                var34_36 = null;
                var36_38 = null;
                var33_35 /* !! */  = var11_13;
                var11_13.b(0, (String)var35_37, null, (Map)var37_39, var51_50, var52_51, (Boolean)var38_40);
                var25_27 = var30_32 + 1;
                var11_13 = var3_3;
                var20_22 = var25_27;
                var12_14 = var13_15 /* !! */ ;
                var25_27 = var31_33;
                var28_30 = var53_52 /* !! */ ;
                var22_24 = var32_34 /* !! */ ;
                var27_29 /* !! */  = var39_41;
                var26_28 = var40_42;
                var24_26 = var54_53;
                var14_16 = 0;
                var15_17 = null;
                var16_18 = 1;
                var13_15 /* !! */  = var7_7;
            }
        }
    }

    public static boolean p(Context object, String string2) {
        boolean bl2;
        Object object2;
        Object object3 = null;
        String string3 = "";
        String string4 = "fill_story_pref";
        if (string2 != null) {
            object2 = j_0.d((Context)object, string4, 0, string3, string2);
        } else {
            bl2 = false;
            object2 = null;
        }
        String string5 = "null cannot be cast to non-null type kotlin.String";
        Intrinsics.checkNotNull(object2, string5);
        object2 = (String)object2;
        bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl2) {
            if (string2 != null) {
                object3 = j_0.d((Context)object, string4, 0, string3, string2);
            }
            Intrinsics.checkNotNull(object3, string5);
            object3 = (String)object3;
            object2 = new JSONObject((String)object3);
            object = object2.get("tms");
            string2 = "null cannot be cast to non-null type kotlin.Long";
            Intrinsics.checkNotNull(object, string2);
            object = (Long)object;
            long l2 = (Long)object;
            long l3 = System.currentTimeMillis();
            long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (l4 > 0) {
                return true;
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String c(Context var1_1, String var2_2, String var3_3, c var4_4, Integer var5_5, Integer var6_6, Integer var7_7) {
        block40: {
            block43: {
                block42: {
                    block41: {
                        block35: {
                            block38: {
                                block39: {
                                    block37: {
                                        block36: {
                                            var8_8 = var1_1;
                                            var9_9 = var3_3;
                                            Intrinsics.checkNotNullParameter(var1_1, "mContext");
                                            var10_10 = new StringBuilder();
                                            var10_10.append(var3_3);
                                            var10_10.append(": Fill-Rate Impression Url For VastAds");
                                            com.jio.jioads.util.j.a(var10_10.toString());
                                            var10_10 = "dl";
                                            var11_11 = "cl";
                                            if (var3_3 != null) {
                                                var12_12 = com.jio.jioads.util.i.n(var1_1, var3_3);
                                                var13_13 = var12_12.optInt("servedAdCount");
                                                com.jio.jioads.util.i.m = var13_13;
                                                com.jio.jioads.util.i.k = var14_14 = var12_12.optInt((String)var11_11);
                                                var15_15 = var12_12.optInt((String)var10_10);
                                                var12_12 = var15_15;
                                                com.jio.jioads.util.i.l = var12_12;
                                            }
                                            var12_12 = com.jio.jioads.util.i.b;
                                            var14_14 = var12_12.isEmpty();
                                            var16_16 = 1;
                                            if ((var14_14 ^= var16_16) != 0 && (var15_15 = var12_12.containsKey(var9_9)) != 0) {
                                                var10_10 = new StringBuilder();
                                                var10_10.append(var9_9);
                                                var10_10.append(": Fill-Rate time is expired for AdSpot ");
                                                var10_10.append(var9_9);
                                                var10_10.append(". SDK has already fired the Fill rate beacon during the next ads cacheAd, so the frt macro will not be replaced.");
                                                com.jio.jioads.util.j.a(var10_10.toString());
                                                return String.valueOf(var2_2);
                                            }
                                            var15_15 = com.jio.jioads.util.i.p(var8_8, var9_9);
                                            var17_17 = -1;
                                            var18_18 = null;
                                            if (var15_15 == 0 || (var15_15 = (int)Intrinsics.areEqual(var12_12 = com.jio.jioads.util.i.d, var19_19 /* !! */  = Boolean.FALSE)) == 0) break block35;
                                            var10_10 = new StringBuilder();
                                            var10_10.append(var9_9);
                                            var11_11 = ": Fill-Rate time has expired, so the frt macro won't be replaced in the impression URL.";
                                            var10_10.append((String)var11_11);
                                            var10_10 = var10_10.toString();
                                            com.jio.jioads.util.j.a((String)var10_10);
                                            if (var4_4 == null) break block36;
                                            var10_10 = var4_4;
                                            var10_10 = (f)var4_4;
                                            var20_20 = (int)var10_10.n();
                                            if (var20_20 == var16_16) break block37;
                                        }
                                        if ((var20_20 = var6_6.intValue()) > 0 || (var20_20 = var5_5.intValue()) > var17_17) break block37;
                                        var10_10 = com.jio.jioads.util.i.e;
                                        if (var10_10 != null && (var20_20 = var10_10.intValue()) == 0) {
                                            com.jio.jioads.util.i.e = var10_10 = com.jio.jioads.util.i.m;
                                        }
                                        var21_23 = null;
                                        var22_27 = null;
                                        var23_31 = null;
                                        var24_35 = 480;
                                        var10_10 = this;
                                        var11_11 = var1_1;
                                        var12_12 = var4_4;
                                        var13_13 = var3_3;
                                        var25_37 = var19_19 /* !! */ ;
                                        com.jio.jioads.util.i.k(this, var1_1, var4_4, var3_3, var19_19 /* !! */ , var19_19 /* !! */ , null, null, null, null, var24_35);
                                        break block38;
                                    }
                                    if ((var20_20 = var5_5.intValue()) <= var17_17) break block39;
                                    var10_10 = com.jio.jioads.util.i.m;
                                    if (var7_7 != null) {
                                        var26_41 = var7_7 + var16_16;
                                        var11_11 = var26_41;
                                    } else {
                                        var26_41 = 0;
                                        var11_11 = null;
                                    }
                                    var20_20 = (int)Intrinsics.areEqual(var10_10, var11_11);
                                    if (var20_20 != 0) ** GOTO lbl-1000
                                }
                                if ((var20_20 = var6_6.intValue()) > 0) {
                                    var10_10 = com.jio.jioads.util.i.m;
                                    if (var7_7 != null) {
                                        var26_41 = var7_7 + var16_16;
                                        var18_18 = var26_41;
                                    }
                                    ** if ((var20_20 = (int)Intrinsics.areEqual((Object)var10_10, var18_18)) == 0) goto lbl-1000
                                }
                                ** GOTO lbl-1000
lbl-1000:
                                // 2 sources

                                {
                                    var23_32 = com.jio.jioads.util.i.l;
                                    var20_20 = com.jio.jioads.util.i.k;
                                    var21_24 = var20_20;
                                    var22_28 = com.jio.jioads.util.i.m;
                                    var10_10 = var1_1;
                                    var11_11 = var4_4;
                                    var12_12 = var3_3;
                                    var13_13 = var19_19 /* !! */ ;
                                    var25_38 /* !! */  = var19_19 /* !! */ ;
                                    var19_19 /* !! */  = var23_32;
                                    var23_32 = var21_24;
                                    var21_24 = var22_28;
                                    var22_28 = var7_7;
                                    com.jio.jioads.util.i.f(var1_1, var4_4, var3_3, (Boolean)var13_13, (Boolean)var13_13, (Integer)var19_19 /* !! */ , var23_32, var21_24, var7_7);
                                    ** GOTO lbl117
                                }
lbl-1000:
                                // 2 sources

                                {
                                    if ((var20_20 = com.jio.jioads.util.i.i) > 0) {
                                        var23_33 = com.jio.jioads.util.i.l;
                                        var20_20 = com.jio.jioads.util.i.k;
                                        var21_25 = var20_20;
                                        var22_29 = com.jio.jioads.util.i.m;
                                        var10_10 = var1_1;
                                        var11_11 = var4_4;
                                        var12_12 = var3_3;
                                        var13_13 = var19_19 /* !! */ ;
                                        var25_39 = var19_19 /* !! */ ;
                                        var19_19 /* !! */  = var23_33;
                                        var23_33 = var21_25;
                                        var21_25 = var22_29;
                                        var22_29 = var7_7;
                                        com.jio.jioads.util.i.f(var1_1, var4_4, var3_3, (Boolean)var13_13, (Boolean)var13_13, (Integer)var19_19 /* !! */ , var23_33, var21_25, var7_7);
                                    }
                                }
                            }
                            var10_10 = var2_2;
                            break block40;
                        }
                        var12_12 = new StringBuilder();
                        var12_12.append(var9_9);
                        var13_13 = ": Fill-Rate: LoadAd called within expiry time, replacing frt macro in impression URL.";
                        var12_12.append((String)var13_13);
                        var12_12 = var12_12.toString();
                        com.jio.jioads.util.j.a((String)var12_12);
                        var27_44 = new Map<String, Object>();
                        if (var4_4 == null) break block41;
                        var12_12 = var4_4;
                        var12_12 = (f)var4_4;
                        var15_15 = (int)var12_12.n();
                        if (var15_15 == var16_16) break block42;
                    }
                    if ((var15_15 = var6_6.intValue()) > 0 || (var15_15 = var5_5.intValue()) > var17_17) break block42;
                    var10_10 = com.jio.jioads.util.i.d();
                    var11_11 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>";
                    Intrinsics.checkNotNull(var10_10, (String)var11_11);
                    var27_44 = TypeIntrinsics.asMutableMap(var10_10);
                    if (var9_9 != null) {
                        com.jio.jioads.util.i.h = var20_21 = com.jio.jioads.util.i.h + var16_16;
                        var26_42 = com.jio.jioads.util.i.g;
                        if (var26_42 == var20_21) {
                            com.jio.jioads.util.i.h(var8_8, var9_9);
                            var10_10 = "Clearing Fill-Rate Preferences";
                            com.jio.jioads.util.j.a((String)var10_10);
                        }
                    }
                    break block43;
                }
                com.jio.jioads.util.i.c = var15_15 = com.jio.jioads.util.i.c + var16_16;
                com.jio.jioads.util.i.d = var19_19 /* !! */  = Boolean.TRUE;
                var12_12 = nn_2.a(var9_9, ": TrackNumber: ");
                if (var7_7 != null) {
                    var14_14 = var7_7 + var16_16;
                    var13_13 = var14_14;
                } else {
                    var14_14 = 0;
                    var13_13 = null;
                }
                var12_12.append(var13_13);
                var12_12.append(" :: durationLoss: ");
                var13_13 = com.jio.jioads.util.i.l;
                var12_12.append(var13_13);
                var12_12.append(" :: countLoss: ");
                var14_14 = com.jio.jioads.util.i.k;
                var12_12.append(var14_14);
                var12_12.append(" :: servedAdCount: ");
                var13_13 = com.jio.jioads.util.i.m;
                var12_12.append(var13_13);
                com.jio.jioads.util.j.a(var12_12.toString());
                var13_13 = "1";
                var27_44.put("req", var13_13);
                var27_44.put("res", var13_13);
                var12_12 = "f";
                var27_44.put((String)var12_12, var13_13);
                var15_15 = var5_5;
                var13_13 = "0";
                if (var15_15 <= var17_17) ** GOTO lbl-1000
                var12_12 = com.jio.jioads.util.i.m;
                if (var7_7 != null) {
                    var28_45 = var7_7 + var16_16;
                    var25_40 = var28_45;
                } else {
                    var28_46 = false;
                    var25_40 = null;
                }
                var15_15 = (int)Intrinsics.areEqual(var12_12, var25_40);
                if (var15_15 != 0) {
                    var12_12 = String.valueOf(com.jio.jioads.util.i.l);
                    var27_44.put((String)var10_10, var12_12);
                } else lbl-1000:
                // 2 sources

                {
                    var27_44.put((String)var10_10, var13_13);
                }
                var20_22 = com.jio.jioads.util.i.k;
                if (var20_22 <= 0) ** GOTO lbl-1000
                var10_10 = com.jio.jioads.util.i.m;
                if (var7_7 != null) {
                    var15_15 = var7_7 + var16_16;
                    var12_12 = var15_15;
                } else {
                    var15_15 = 0;
                    var12_12 = null;
                }
                var20_22 = (int)Intrinsics.areEqual(var10_10, var12_12);
                if (var20_22 != 0) {
                    var20_22 = com.jio.jioads.util.i.k;
                    var10_10 = String.valueOf(var20_22);
                    var27_44.put((String)var11_11, var10_10);
                } else lbl-1000:
                // 2 sources

                {
                    var27_44.put((String)var11_11, var13_13);
                }
                var10_10 = com.jio.jioads.util.i.e;
                var11_11 = com.jio.jioads.util.i.m;
                var20_22 = (int)Intrinsics.areEqual(var10_10, var11_11);
                if (var20_22 != 0) ** GOTO lbl-1000
                var10_10 = com.jio.jioads.util.i.m;
                if (var7_7 != null) {
                    var26_43 = var7_7 + var16_16;
                    var11_11 = var26_43;
                } else {
                    var26_43 = 0;
                    var11_11 = null;
                }
                var20_22 = (int)Intrinsics.areEqual(var10_10, var11_11);
                if (var20_22 != 0 && (var20_22 = com.jio.jioads.util.i.i) > 0) {
                    var25_40 = Boolean.FALSE;
                    var22_30 = com.jio.jioads.util.i.m;
                    var29_47 = 96;
                    var23_34 = null;
                    var21_26 = null;
                    var10_10 = this;
                    var11_11 = var1_1;
                    var12_12 = var4_4;
                    var13_13 = var3_3;
                    var30_48 = var27_44;
                    var24_36 = var29_47;
                    com.jio.jioads.util.i.k(this, var1_1, var4_4, var3_3, (Boolean)var25_40, var19_19 /* !! */ , null, null, var22_30, var7_7, var29_47);
                } else lbl-1000:
                // 2 sources

                {
                    var30_48 = var27_44;
                }
                var10_10 = com.jio.jioads.util.i.e;
                var11_11 = com.jio.jioads.util.i.m;
                var20_22 = (int)Intrinsics.areEqual(var10_10, var11_11);
                if (var20_22 != 0) {
                    var10_10 = com.jio.jioads.util.i.m;
                    if (var7_7 != null) {
                        var26_43 = var7_7 + var16_16;
                        var11_11 = var26_43;
                    } else {
                        var26_43 = 0;
                        var11_11 = null;
                    }
                    var20_22 = (int)Intrinsics.areEqual(var10_10, var11_11);
                    if (var20_22 != 0 && (var20_22 = com.jio.jioads.util.i.i) > 0) {
                        var10_10 = "Parsing Error.";
                        com.jio.jioads.util.i.j(var8_8, (String)var10_10, var9_9);
                    }
                }
                if ((var20_22 = var5_5.intValue()) > var17_17) {
                    var10_10 = com.jio.jioads.util.i.m;
                    if (var7_7 != null) {
                        var26_43 = var7_7 + var16_16;
                        var18_18 = var26_43;
                    }
                    if ((var20_22 = (int)Intrinsics.areEqual(var10_10, var18_18)) != 0) {
                        var10_10 = "Duration based Ads.";
                        com.jio.jioads.util.i.j(var8_8, (String)var10_10, var9_9);
                    }
                }
                if ((var20_22 = var6_6.intValue()) > 0 && var7_7 != null) {
                    var20_22 = var6_6;
                    var26_43 = com.jio.jioads.util.i.k;
                    if ((var20_22 -= var26_43) == (var26_43 = var7_7 + var16_16)) {
                        var10_10 = "Count based Ads.";
                        com.jio.jioads.util.i.j(var8_8, (String)var10_10, var9_9);
                    }
                }
                var27_44 = var30_48;
            }
            var10_10 = Utility.INSTANCE;
            var11_11 = var10_10.encodeAdRequestParameters(var27_44, "UTF-8");
            var12_12 = "frt";
            var14_14 = 0;
            var13_13 = null;
            var25_40 = var2_2;
            var10_10 = var10_10.replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(var2_2, (String)var12_12, (String)var11_11, false);
        }
        return String.valueOf(var10_10);
    }

    public final String m(Context context, String string2, String string3, c c2) {
        Object object = "context";
        Intrinsics.checkNotNullParameter(context, (String)object);
        if (string3 == null) {
            return String.valueOf(string2);
        }
        Intrinsics.checkNotNullParameter(string3.concat(": Inside impressionUrlForNativeAds"), "message");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        int n3 = 0;
        object2 = j_0.d(context, "fill_story_pref", 0, "", string3);
        Object object3 = "null cannot be cast to non-null type kotlin.String";
        Intrinsics.checkNotNull(object2, (String)object3);
        object2 = (String)object2;
        int n4 = ((String)object2).length();
        int n7 = 1;
        if (n4 > 0 && (n4 = (int)(com.jio.jioads.util.i.p(context, string3) ? 1 : 0)) != 0) {
            int n8;
            object2 = string3.concat(": FillRate: Not within expiry time so not replacing frt macro in impression url");
            com.jio.jioads.jioreel.tracker.model.b.g((String)object2, (JioAds$Companion)object);
            object = e;
            if (object != null && (n8 = ((Integer)object).intValue()) == 0) {
                e = object = Integer.valueOf(n7);
            }
            object3 = Boolean.FALSE;
            object = this;
            object2 = c2;
            com.jio.jioads.util.i.k(this, context, c2, string3, (Boolean)object3, (Boolean)object3, null, null, null, null, 480);
            return String.valueOf(string2);
        }
        com.jio.jioads.jioreel.tracker.model.b.g(string3.concat(": FillRate: Within expiry time so replacing frt macro"), (JioAds$Companion)object);
        object = Utility.INSTANCE;
        object2 = com.jio.jioads.util.i.d();
        object2 = ((Utility)object).encodeAdRequestParameters((Map)object2, "UTF-8");
        String string4 = "frt";
        object = ((Utility)object).replaceKey$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(string2, string4, (String)object2, false);
        h = n4 = h + n7;
        n3 = g;
        if (n3 == n4) {
            com.jio.jioads.util.i.h(context, string3);
        }
        return object;
    }
}

