/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.jio.jioads.multiad;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$Environment;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.m_0;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.multiad.L;
import com.jio.jioads.multiad.M;
import com.jio.jioads.multiad.e;
import com.jio.jioads.multiad.model.h;
import com.jio.jioads.multiad.v;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.c;
import com.jio.jioads.util.f;
import com.jio.jioads.utils.Constants$SDKVersion;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;

public final class N {
    public static HashMap a;
    public static HashMap b;
    public static HashMap c;
    public static ConcurrentHashMap d;
    public static final HashMap e;

    static {
        AbstractMap abstractMap;
        d = abstractMap = new AbstractMap();
        abstractMap = new AbstractMap();
        e = abstractMap;
    }

    public static long a(Context object, String string2) {
        long l2 = -1;
        if (object != null && string2 != null) {
            string2 = string2.concat("blk");
            Long l3 = l2;
            String string3 = "ad_seq_and_blk_pref";
            object = j_0.d((Context)object, string3, 3, l3, string2);
            string2 = "null cannot be cast to non-null type kotlin.Long";
            Intrinsics.checkNotNull(object, string2);
            object = (Long)object;
            long l4 = (Long)object;
            long l7 = 0L;
            long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
            if (l8 > 0) {
                l2 = Calendar.getInstance(Locale.ENGLISH).getTimeInMillis();
                return l4 - l2;
            }
        }
        return l2;
    }

    public static Pair b(String object, int n3, com.jio.jioads.multiad.model.e object2) {
        int n4;
        Object object3;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(object, "adspotId");
        Object object4 = null;
        if (object2 != null && (object2 = ((com.jio.jioads.multiad.model.e)object2).c) != null) {
            object3 = new JSONObject((String)object2);
        } else {
            n4 = 0;
            object3 = null;
        }
        if (object3 != null) {
            int n8;
            object2 = object3.optJSONArray("dom");
            JSONArray jSONArray = object3.optJSONArray("mth");
            Object object5 = "itr";
            object3 = object3.optJSONArray((String)object5);
            Objects.toString(object2);
            if (object3 != null) {
                object3.length();
            }
            Objects.toString(object2);
            Objects.toString(object3);
            if (object3 != null && object2 != null && (n8 = object3.length()) > 0) {
                int n10;
                Object object6;
                object3.length();
                n8 = object3.length();
                Object object7 = ": selected weight index : ";
                String string2 = "message";
                if (n8 > n3) {
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append((String)object);
                    ((StringBuilder)object5).append((String)object7);
                    ((StringBuilder)object5).append(n3);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object5).toString(), string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object5 = JioAds$LogLevel.NONE;
                    object6 = object3.optJSONObject(n3);
                } else {
                    object6 = new StringBuilder();
                    ((StringBuilder)object6).append((String)object);
                    ((StringBuilder)object6).append(" :Index value is grater then iteration object so selecting last iteration index");
                    Intrinsics.checkNotNullParameter(((StringBuilder)object6).toString(), string2);
                    object6 = JioAds.Companion;
                    ((JioAds$Companion)object6).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object5 = JioAds$LogLevel.NONE;
                    object5 = nn_2.a((String)object, (String)object7);
                    n10 = object3.length() - n7;
                    ((StringBuilder)object5).append(n10);
                    object5 = ((StringBuilder)object5).toString();
                    Intrinsics.checkNotNullParameter(object5, string2);
                    ((JioAds$Companion)object6).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    n3 = object3.length() - n7;
                    object6 = object3.optJSONObject(n3);
                }
                object3 = "wt";
                object6 = object6.optJSONArray((String)object3);
                if (object6 != null) {
                    int n14;
                    block18: {
                        int n15;
                        Object object8;
                        Object object9;
                        object4 = new ArrayList();
                        n4 = object6.length();
                        n8 = 0;
                        object5 = null;
                        object7 = null;
                        n14 = 0;
                        Object object10 = null;
                        for (n10 = 0; n10 < n4; n10 += n7) {
                            object9 = object6.opt(n10);
                            object8 = "null cannot be cast to non-null type kotlin.Int";
                            Intrinsics.checkNotNull(object9, object8);
                            n15 = (Integer)object9;
                            object9 = n14 += n15;
                            ((ArrayList)object4).add(object9);
                        }
                        object6 = "BACKUP_AD";
                        if (n14 == 0) {
                            object2 = n7;
                            object = new Pair(object6, object2);
                            return object;
                        }
                        object3 = new Random();
                        n4 = object3.nextInt(n14);
                        object7 = new StringBuilder();
                        ((StringBuilder)object7).append((String)object);
                        ((StringBuilder)object7).append(" :Random number for domain selection : ");
                        ((StringBuilder)object7).append(n4);
                        Intrinsics.checkNotNullParameter(((StringBuilder)object7).toString(), string2);
                        object7 = JioAds.Companion;
                        ((JioAds$Companion)object7).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object10 = JioAds$LogLevel.NONE;
                        object10 = new StringBuilder();
                        ((StringBuilder)object10).append((String)object);
                        object9 = " :Pacing Probability array : ";
                        ((StringBuilder)object10).append((String)object9);
                        ((StringBuilder)object10).append(object4);
                        Intrinsics.checkNotNullParameter(((StringBuilder)object10).toString(), string2);
                        object7 = ((JioAds$Companion)object7).getInstance();
                        ((JioAds)object7).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        n10 = ((ArrayList)object4).size();
                        object10 = null;
                        for (n14 = 0; n14 < n10; n14 += n7) {
                            object9 = ((ArrayList)object4).get(n14);
                            Intrinsics.checkNotNullExpressionValue(object9, "get(...)");
                            object9 = (Number)object9;
                            n15 = ((Number)object9).intValue();
                            object8 = new StringBuilder();
                            ((StringBuilder)object8).append((String)object);
                            String string3 = " :Domain allocation Weight value ";
                            ((StringBuilder)object8).append(string3);
                            ((StringBuilder)object8).append(n15);
                            Intrinsics.checkNotNullParameter(((StringBuilder)object8).toString(), string2);
                            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object8 = JioAds$LogLevel.NONE;
                            if (n4 >= n15) {
                                continue;
                            }
                            break block18;
                        }
                        n14 = 0;
                        object10 = null;
                    }
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append((String)object);
                    ((StringBuilder)object4).append(" :Selected Domain index ");
                    ((StringBuilder)object4).append(n14);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object4).toString(), string2);
                    object4 = JioAds.Companion;
                    ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object3 = JioAds$LogLevel.NONE;
                    n4 = object2.length();
                    if (n4 > n14) {
                        if (jSONArray != null && n14 < (n3 = jSONArray.length())) {
                            n3 = jSONArray.optInt(n14);
                            if (n3 == n7) {
                                n7 = 0;
                            } else {
                                jSONArray.optInt(n14);
                            }
                            object6 = new StringBuilder();
                            ((StringBuilder)object6).append((String)object);
                            ((StringBuilder)object6).append(": requested method in domain name ");
                            ((StringBuilder)object6).append(n7);
                            Intrinsics.checkNotNullParameter(((StringBuilder)object6).toString(), string2);
                            ((JioAds$Companion)object4).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object6 = object2.optString(n14);
                            object2 = n7;
                            object = new Pair(object6, object2);
                        } else {
                            object6 = object2.optString(n14);
                            object2 = n7;
                            object = new Pair(object6, object2);
                        }
                    } else {
                        object2 = n7;
                        object = new Pair(object6, object2);
                    }
                    return object;
                }
            }
        }
        return null;
    }

    public static void c(Context context, int n3, int n4, String string2, int n7) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "key");
        Comparable<Calendar> comparable = Calendar.getInstance(Locale.ENGLISH);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long l2 = n3;
        long l3 = timeUnit.toMillis(l2);
        long l4 = ((Calendar)comparable).getTimeInMillis() + l3;
        Object object = new JSONObject();
        object.put("tms", l4);
        object.put("totalAds", n4);
        object.put("expiredAds", n7);
        comparable = new Comparable<Calendar>();
        ((StringBuilder)comparable).append(string2);
        ((StringBuilder)comparable).append(": storing tms: ");
        ((StringBuilder)comparable).append(l4);
        ((StringBuilder)comparable).append(" totalAds: ");
        ((StringBuilder)comparable).append(n4);
        ((StringBuilder)comparable).append(" expiredAds: ");
        ((StringBuilder)comparable).append(n7);
        Intrinsics.checkNotNullParameter(((StringBuilder)comparable).toString(), "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = object.toString();
        j_0.p(context, "multiad_pref", 0, object, string2);
    }

    public static /* synthetic */ void d(Context context, String string2, m_0 m_02, int n3) {
        int n4 = n3 & 4;
        n4 = n4 != 0 ? 1 : 0;
        if ((n3 &= 0x10) != 0) {
            m_02 = null;
        }
        N.h(context, string2, n4 != 0, false, m_02);
    }

    public static void e(Context context, String string2, f f5) {
        l_0.h("Starting/Continuing fibotimer for package ", string2);
        Object object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object2 = JioAds$LogLevel.NONE;
        object2 = b;
        if (object2 == null) {
            object2 = new HashMap();
            b = object2;
        }
        if (f5 == null) {
            f5 = new f();
            object2 = new StringBuilder("Created new fibotimer for package ");
            ((StringBuilder)object2).append(string2);
            char c2 = ' ';
            ((StringBuilder)object2).append(c2);
            ((StringBuilder)object2).append(f5);
            object2 = ((StringBuilder)object2).toString();
            String string3 = "message";
            Intrinsics.checkNotNullParameter(object2, string3);
            object = ((JioAds$Companion)object).getInstance();
            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        object = b;
        Intrinsics.checkNotNull(object);
        ((HashMap)object).put(string2, f5);
        object = new M(context, string2);
        f5.a((c)object);
    }

    public static void f(Context context, String string2, Integer number) {
        if (context != null && string2 != null && number != null) {
            Object object = Calendar.getInstance(Locale.ENGLISH);
            int n3 = number;
            if (n3 > 0) {
                long l2 = ((Calendar)object).getTimeInMillis();
                int n4 = number;
                int n7 = 60000;
                long l3 = n4 *= n7;
                number = l2 += l3;
            } else {
                boolean bl2 = false;
                number = null;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(": Selected timeInMillis for Jio_Block: ");
            ((StringBuilder)object).append(number);
            object = ((StringBuilder)object).toString();
            String string3 = "message";
            Intrinsics.checkNotNullParameter(object, string3);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            if (number != null) {
                string2 = string2.concat("blk");
                object = "ad_seq_and_blk_pref";
                n3 = 3;
                j_0.p(context, (String)object, n3, number, string2);
            }
        }
    }

    public static final void g(Context context, String object, String string2, boolean bl2) {
        Object object2;
        Object object3;
        CharSequence charSequence;
        Object object4 = new JSONObject((String)object);
        object = d;
        String string3 = "master_config_";
        if (object != null) {
            charSequence = new StringBuilder(string3);
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            object = ((ConcurrentHashMap)object).put(charSequence, object4);
        }
        object = kp1_0.c(string3, string2);
        string3 = object4.toString();
        charSequence = "master_config_pref";
        String string4 = null;
        j_0.p(context, (String)charSequence, 0, string3, (String)object);
        string3 = "message";
        Intrinsics.checkNotNullParameter("master config stored in pref", string3);
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object5 = JioAds$LogLevel.NONE;
        object5 = "exp";
        int n3 = object4.has((String)object5);
        if (n3 != 0) {
            object5 = object4.getString((String)object5);
            object3 = Calendar.getInstance(Locale.ENGLISH);
            object2 = TimeUnit.MINUTES;
            Intrinsics.checkNotNull(object5);
            long l2 = Long.parseLong((String)object5);
            long l3 = object2.toMillis(l2);
            long l4 = ((Calendar)object3).getTimeInMillis() + l3;
            object2 = kp1_0.c("master_config_expiry_", string2);
            object5 = l4;
            n3 = 3;
            j_0.p(context, (String)charSequence, n3, object5, (String)object2);
        }
        if ((n3 = object4.has((String)(object5 = "config"))) != 0) {
            String string5;
            int n4;
            boolean bl3 = (object5 = object4.getJSONObject((String)object5)).has((String)(object3 = "te"));
            if (bl3) {
                object3 = object5.optString((String)object3);
                object2 = kp1_0.c("config_level_te_", string2);
                j_0.p(context, (String)charSequence, 0, object3, (String)object2);
            }
            if (bl3 = object5.has((String)(object3 = "csl"))) {
                object3 = object5.optString((String)object3);
                object2 = kp1_0.c("csl_", string2);
                j_0.p(context, (String)charSequence, 0, object3, (String)object2);
            }
            Intrinsics.checkNotNull(object5);
            if (bl2 && (n4 = object5.has(string5 = "epf")) != 0 && (string5 = object5.optJSONArray(string5)) != null && (n4 = string5.length()) > 0) {
                string4 = "Prefetching enabled for: ";
                charSequence = new StringBuilder(string4);
                ((StringBuilder)charSequence).append((Object)string5);
                charSequence = ((StringBuilder)charSequence).toString();
                Intrinsics.checkNotNullParameter(charSequence, string3);
                ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = new Object();
                object4 = object4.toString();
                string3 = "toString(...)";
                Intrinsics.checkNotNullExpressionValue(object4, string3);
                object = ((v)object).a((String)object4, string2);
                object4 = new e();
                ((e)object4).a(context, string2, (h)object, (JSONArray)string5);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h(Context context, String string2, boolean bl2, boolean n3, NetworkTaskListener networkTaskListener) {
        Exception exception2;
        Object object;
        Object object2;
        String string3;
        Object object3;
        Context context2;
        block16: {
            char c2;
            Object object4;
            Object object5;
            String string4;
            Object object6;
            String string5;
            int n4;
            Object object7;
            int n7;
            block13: {
                Object object8;
                Object object9;
                Object object10;
                boolean bl3;
                block12: {
                    Object object11;
                    block15: {
                        block14: {
                            context2 = context;
                            n7 = n3;
                            object3 = networkTaskListener;
                            string3 = "context";
                            Intrinsics.checkNotNullParameter(context, string3);
                            string3 = string2 == null ? JioAds.Companion.getInstance().getAppPackage$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : string2;
                            object2 = new HashMap();
                            object7 = Constants$SDKVersion.Companion.getLIBRARY_VERSION();
                            ((HashMap)object2).put("vr", object7);
                            object7 = Utility.INSTANCE;
                            bl3 = false;
                            object10 = null;
                            n4 = 1;
                            object9 = Utility.getCcbValue$default((Utility)object7, null, n4, null);
                            ((HashMap)object2).put("ccb", object9);
                            object9 = JioAds.Companion;
                            object = ((JioAds$Companion)object9).getInstance().getAppVersion$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            ((HashMap)object2).put("av", object);
                            int n8 = 2;
                            object2 = Utility.encodeParameters$default((Utility)object7, object2, null, n8, null);
                            object7 = new StringBuilder();
                            object = ((JioAds$Companion)object9).getInstance().getEnvironment$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object8 = JioAds$Environment.DEV;
                            object = object == object8 ? "https://mercury.akamaized.net/cfg/dev/an/" : ((object = ((JioAds$Companion)object9).getInstance().getEnvironment$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == (object8 = JioAds$Environment.SIT) ? "https://mercury.akamaized.net/cfg/sit/an/" : ((object = ((JioAds$Companion)object9).getInstance().getEnvironment$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == (object8 = JioAds$Environment.STG) ? "https://mercury.akamaized.net/cfg/stg/an/" : "https://mercury.akamaized.net/cfg/an/"));
                            object8 = ".json?";
                            string5 = ko_0.a((StringBuilder)object7, object, string3, (String)object8, (String)object2);
                            object2 = bl2;
                            object7 = "Fibotimer is already running for requested package: ";
                            object = new Ref$ObjectRef();
                            try {
                                object8 = context.getPackageManager();
                                object6 = context.getPackageName();
                                object8 = object8.getPackageInfo((String)object6, 0);
                                object8 = ((PackageInfo)object8).packageName;
                                object6 = b;
                                string4 = "message";
                                if (object6 == null) break block12;
                                Intrinsics.checkNotNull(object6);
                                boolean bl4 = ((HashMap)object6).containsKey(string3);
                                if (!bl4) break block12;
                                object8 = b;
                                Intrinsics.checkNotNull(object8);
                                ((Ref$ObjectRef)object).element = object8 = ((HashMap)object8).get(string3);
                                object8 = new StringBuilder((String)object7);
                                ((StringBuilder)object8).append(string3);
                                object7 = " and isComingFromCacheAd ";
                                ((StringBuilder)object8).append((String)object7);
                                ((StringBuilder)object8).append(n7 != 0);
                                object7 = ((StringBuilder)object8).toString();
                                Intrinsics.checkNotNullParameter(object7, string4);
                                object7 = ((JioAds$Companion)object9).getInstance();
                                ((JioAds)object7).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object7 = JioAds$LogLevel.NONE;
                                if (!n7) break block13;
                                object11 = c;
                                if (object11 == null) break block14;
                                object11 = ((HashMap)object11).get(string3);
                                if ((object11 = (ArrayList)object11) == null) break block14;
                                object11 = CollectionsKt.k0((Iterable)object11);
                                break block15;
                            }
                            catch (Exception exception2) {
                                break block16;
                            }
                        }
                        n7 = 0;
                        object11 = null;
                    }
                    if (object11 != null) {
                        boolean bl5;
                        object11 = object11.iterator();
                        while (bl5 = object11.hasNext()) {
                            object3 = object11.next();
                            object3 = (NetworkTaskListener)object3;
                            object2 = "Fibo timer is running";
                            int n10 = 404;
                            object3.onError(n10, object2, null);
                        }
                    }
                    if ((object11 = c) == null) return;
                    object11 = ((HashMap)object11).remove(string3);
                    object11 = (ArrayList)object11;
                    return;
                }
                if ((object5 = b) != null && !(n7 = Intrinsics.areEqual(string3, object8))) {
                    object5 = b;
                    Intrinsics.checkNotNull(object5);
                    n7 = ((HashMap)object5).size();
                    if (n7 > 0) {
                        boolean bl6;
                        object5 = b;
                        Intrinsics.checkNotNull(object5);
                        object5 = ((HashMap)object5).keySet();
                        object7 = "<get-keys>(...)";
                        Intrinsics.checkNotNullExpressionValue(object5, (String)object7);
                        object7 = new ArrayList();
                        object5 = object5.iterator();
                        while (bl3 = object5.hasNext()) {
                            object10 = object5.next();
                            boolean bl7 = Intrinsics.areEqual(object10 = (String)object10, object8);
                            if (bl7) continue;
                            object9 = b;
                            Intrinsics.checkNotNull(object9);
                            object9 = ((HashMap)object9).get(object10);
                            object9 = (f)object9;
                            object6 = new StringBuilder();
                            object4 = "Stopping & removing fibotimer for child package ";
                            ((StringBuilder)object6).append((String)object4);
                            ((StringBuilder)object6).append((String)object10);
                            c2 = ' ';
                            ((StringBuilder)object6).append(c2);
                            ((StringBuilder)object6).append(object9);
                            object6 = ((StringBuilder)object6).toString();
                            Intrinsics.checkNotNullParameter(object6, string4);
                            object6 = JioAds.Companion;
                            object4 = ((JioAds$Companion)object6).getInstance();
                            ((JioAds)object4).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object4 = JioAds$LogLevel.NONE;
                            if (object9 != null && (c2 = (char)(((f)object9).i ? 1 : 0)) == n4) {
                                object4 = "fibonacci stopped";
                                Intrinsics.checkNotNullParameter(object4, string4);
                                object6 = ((JioAds$Companion)object6).getInstance();
                                ((JioAds)object6).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object9 = ((f)object9).h;
                                if (object9 != null) {
                                    object9.cancel();
                                }
                            }
                            ((ArrayList)object7).add(object10);
                        }
                        object5 = ((ArrayList)object7).iterator();
                        while (bl6 = object5.hasNext()) {
                            object7 = object5.next();
                            object7 = (String)object7;
                            object10 = b;
                            Intrinsics.checkNotNull(object10);
                            ((HashMap)object10).remove(object7);
                        }
                    }
                }
            }
            if ((object5 = c) != null && (n7 = ((HashMap)object5).containsKey(string3)) == n4) {
                if (object3 == null) return;
                N.i(string3, (NetworkTaskListener)object3);
                return;
            }
            object5 = new StringBuilder();
            object7 = "master config url: ";
            ((StringBuilder)object5).append((String)object7);
            ((StringBuilder)object5).append(string5);
            object5 = ((StringBuilder)object5).toString();
            Intrinsics.checkNotNullParameter(object5, string4);
            object5 = JioAds.Companion;
            object5 = ((JioAds$Companion)object5).getInstance();
            ((JioAds)object5).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object5 = JioAds$LogLevel.NONE;
            if (object3 != null) {
                N.i(string3, (NetworkTaskListener)object3);
            }
            object6 = new com.jio.jioads.network.c(context2);
            Integer n14 = 0;
            object5 = new L(string3, context2, (Boolean)object2, (Ref$ObjectRef)object);
            Boolean bl8 = Boolean.FALSE;
            string4 = null;
            c2 = '\u0000';
            object4 = null;
            ((com.jio.jioads.network.c)object6).b(0, string5, null, null, n14, (NetworkTaskListener)object5, bl8);
            return;
        }
        object3 = new StringBuilder("Exception in master config ");
        object2 = Utility.INSTANCE;
        com.jio.jioads.jioreel.tracker.model.b.c((Utility)object2, exception2, (StringBuilder)object3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        Object object12 = JioAds$LogLevel.NONE;
        object12 = (f)((Ref$ObjectRef)object).element;
        N.e(context2, string3, (f)object12);
    }

    public static void i(String string2, NetworkTaskListener object) {
        Cloneable cloneable = c;
        if (cloneable == null) {
            cloneable = new HashMap();
            c = cloneable;
        }
        cloneable = c;
        Intrinsics.checkNotNull(cloneable);
        boolean bl2 = ((HashMap)cloneable).containsKey(string2);
        if (bl2) {
            cloneable = c;
            Intrinsics.checkNotNull(cloneable);
            cloneable = (ArrayList)((HashMap)cloneable).get(string2);
            if (cloneable == null) {
                cloneable = new ArrayList();
            }
            ((ArrayList)cloneable).add(object);
            object = c;
            Intrinsics.checkNotNull(object);
            ((HashMap)object).put(string2, cloneable);
        } else {
            cloneable = c;
            Intrinsics.checkNotNull(cloneable);
            int n3 = 1;
            Object[] objectArray = new NetworkTaskListener[n3];
            objectArray[0] = object;
            object = xx_2.d(objectArray);
            ((HashMap)cloneable).put(string2, object);
        }
    }

    public static boolean j(String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "adSpotId");
        Serializable serializable = e;
        boolean bl3 = serializable.containsKey(string2);
        if (bl3 && (bl2 = Intrinsics.areEqual(string2 = serializable.get(string2), serializable = Boolean.TRUE))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }
}

