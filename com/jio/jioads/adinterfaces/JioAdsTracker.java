/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import com.google.gson.Gson;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$Environment;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.g_0;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.adinterfaces.r;
import com.jio.jioads.adinterfaces.s_0;
import com.jio.jioads.jioreel.data.JioReelAdMetaData;
import com.jio.jioads.jioreel.ssai.CreativeResponse;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.jioreel.tracker.model.a;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.util.Utility;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.TypeIntrinsics;

public final class JioAdsTracker {
    public final Context a;
    public final Map b;
    public final LinkedHashMap c;

    public JioAdsTracker(Context object, Map map2) {
        Intrinsics.checkNotNullParameter(object, "context");
        this.a = object;
        this.b = map2;
        this.c = object;
    }

    public static final void a(Ref$ObjectRef object, JioAdsTracker jioAdsTracker) {
        Intrinsics.checkNotNullParameter(object, "$trackerUrl");
        Intrinsics.checkNotNullParameter(jioAdsTracker, "this$0");
        com.jio.jioads.jioreel.network.b b2 = new com.jio.jioads.jioreel.network.b();
        object = (String)((Ref$ObjectRef)object).element;
        s_0 s_02 = new s_0(jioAdsTracker);
        b2.a(8, (String)object, s_02);
    }

    public static final void a(Ref$ObjectRef object, String string2, JioAdsTracker object2, CreativeResponse creativeResponse) {
        Intrinsics.checkNotNullParameter(object, "$trackerUrl");
        Intrinsics.checkNotNullParameter(string2, "$creativeId");
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object2 = new com.jio.jioads.jioreel.network.b();
        object = (String)((Ref$ObjectRef)object).element;
        r r5 = new r(string2, creativeResponse);
        ((com.jio.jioads.jioreel.network.b)object2).a(8, (String)object, r5);
    }

    public static final /* synthetic */ Map access$getAdTrackers$p(JioAdsTracker jioAdsTracker) {
        return jioAdsTracker.c;
    }

    public static final /* synthetic */ Context access$getContext$p(JioAdsTracker jioAdsTracker) {
        return jioAdsTracker.a;
    }

    public static final /* synthetic */ void access$setDefaultTrackerInfo$p(JioAdsTracker jioAdsTracker, a a2) {
        jioAdsTracker.getClass();
    }

    public static /* synthetic */ void fetchAdTrackers$default(JioAdsTracker jioAdsTracker, String string2, CreativeResponse creativeResponse, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            creativeResponse = null;
        }
        jioAdsTracker.fetchAdTrackers(string2, creativeResponse);
    }

    public static /* synthetic */ AdMetaData$AdParams getAdParams$default(JioAdsTracker jioAdsTracker, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string3 = "";
        }
        return jioAdsTracker.getAdParams(string2, string3);
    }

    public static /* synthetic */ void triggerCompleted$default(JioAdsTracker jioAdsTracker, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string3 = "";
        }
        jioAdsTracker.triggerCompleted(string2, string3);
    }

    public static /* synthetic */ void triggerFirst$default(JioAdsTracker jioAdsTracker, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string3 = "";
        }
        jioAdsTracker.triggerFirst(string2, string3);
    }

    public static /* synthetic */ void triggerImpression$default(JioAdsTracker jioAdsTracker, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string3 = "";
        }
        jioAdsTracker.triggerImpression(string2, string3);
    }

    public static /* synthetic */ void triggerMid$default(JioAdsTracker jioAdsTracker, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string3 = "";
        }
        jioAdsTracker.triggerMid(string2, string3);
    }

    public static /* synthetic */ void triggerStart$default(JioAdsTracker jioAdsTracker, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string3 = "";
        }
        jioAdsTracker.triggerStart(string2, string3);
    }

    public static /* synthetic */ void triggerThird$default(JioAdsTracker jioAdsTracker, String string2, String string3, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string3 = "";
        }
        jioAdsTracker.triggerThird(string2, string3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void fetchAdTrackers(String var1_1, CreativeResponse var2_2) {
        block8: {
            block9: {
                Intrinsics.checkNotNullParameter(var1_1, "creativeId");
                var3_3 = this.c;
                var4_4 = var3_3.containsKey(var1_1);
                var5_5 = null;
                var6_6 = 1;
                var7_7 = "message";
                if (var4_4 == 0) break block8;
                l_0.h("Trackers already exist for ", var1_1);
                var3_3 = JioAds.Companion;
                var3_3.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var8_8 = JioAds$LogLevel.NONE;
                var8_8 = nn_2.a(var1_1, " creativeId response= ");
                var9_10 = this.c.get(var1_1);
                var8_8.append(var9_10);
                var8_8 = var8_8.toString();
                Intrinsics.checkNotNullParameter(var8_8, (String)var7_7);
                var3_3 = var3_3.getInstance();
                var3_3.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                if (var2_2 == null) break block9;
                var4_4 = 0;
                var3_3 = null;
                var10_12 = 2;
                var11_13 = JioAdsTracker.getAdParams$default(this, var1_1, null, var10_12, null);
                if (var11_13 != null && (var7_7 = var11_13.getCtaUrl()) != null) {
                    var7_7 = var7_7.getDeeplink();
                } else {
                    var10_12 = 0;
                    var7_7 = null;
                }
                if (var7_7 != null && (var10_12 = var7_7.length()) != 0) ** GOTO lbl-1000
                if (var11_13 != null && (var7_7 = var11_13.getCtaUrl()) != null) {
                    var7_7 = var7_7.getFallback();
                } else {
                    var10_12 = 0;
                    var7_7 = null;
                }
                if (var7_7 != null && (var10_12 = var7_7.length()) != 0) ** GOTO lbl-1000
                if (var11_13 != null) {
                    var3_3 = var11_13.getSecondaryCtaUrl();
                }
                if (var3_3 != null && (var4_4 = var3_3.length()) != 0) lbl-1000:
                // 3 sources

                {
                    var12_15 = true;
                } else {
                    var12_15 = false;
                    var9_10 = null;
                }
                var6_6 = 0;
                var14_17 = null;
                var15_19 = 0L;
                var5_5 = null;
                var17_20 = 12;
                var3_3 = var13_16;
                var13_16 = new JioReelAdMetaData(var1_1, null, 0, var15_19, var12_15, var11_13, var17_20, null);
                var2_2.onSuccess(var13_16);
            }
            return;
        }
        var3_3 = new Ref$ObjectRef();
        var3_3.element = "https://mercury.akamaized.net/cfg/jioAdsTracker/{tracker}.json";
        var8_9 = JioAds.Companion;
        var9_11 /* !! */  = var8_9.getInstance().getEnvironment$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (var9_11 /* !! */  == (var11_14 = JioAds$Environment.SIT)) {
            var9_11 /* !! */  = "https://mercury.akamaized.net/cfg/sit/jioAdsTracker/{tracker}.json";
            var3_3.element = var9_11 /* !! */ ;
        }
        var3_3.element = var5_5 = kotlin.text.b.n((String)var3_3.element, "{tracker}", var1_1, false);
        var5_5 = new StringBuilder("Creative id URL ");
        var9_11 /* !! */  = (String)var3_3.element;
        d90_0.b((StringBuilder)var5_5, (String)var9_11 /* !! */ , (String)var7_7, var8_9);
        var5_5 = JioAds$LogLevel.NONE;
        var5_5 = Executors.newFixedThreadPool(var6_6);
        var14_18 = new g_0((Ref$ObjectRef)var3_3, var1_1, this, var2_2);
        var5_5.submit(var14_18);
    }

    public final void fetchDefaultTrackerInfo() {
        int n3;
        int n4 = 1;
        Object object = this.a;
        Object object2 = "common_prefs";
        Object object3 = null;
        Object object4 = "";
        Object object5 = "default_trackers";
        if ((object = (String)j_0.d((Context)object, (String)object2, 0, object4, object5)) != null && (n3 = ((String)object).length()) != 0) {
            object2 = new Gson();
            object4 = b.class;
            object = ((Gson)object2).fromJson((String)object, (Class)object4);
            com.jio.jioads.jioreel.tracker.model.b.f(object);
        }
        object = new Ref$ObjectRef();
        ((Ref$ObjectRef)object).element = "https://mercury.akamaized.net/cfg/jioAdsTracker/{tracker}.json";
        object2 = JioAds.Companion;
        object4 = ((JioAds$Companion)object2).getInstance().getEnvironment$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        if (object4 == (object5 = JioAds$Environment.SIT)) {
            ((Ref$ObjectRef)object).element = object4 = "https://mercury.akamaized.net/cfg/sit/jioAdsTracker/{tracker}.json";
        }
        ((Ref$ObjectRef)object).element = object3 = kotlin.text.b.n((String)((Ref$ObjectRef)object).element, "{tracker}", "trackerweb", false);
        object3 = new StringBuilder();
        object4 = (String)((Ref$ObjectRef)object).element;
        ((StringBuilder)object3).append((String)object4);
        ((StringBuilder)object3).append("?ccb=");
        object4 = Utility.getCcbValue$default(Utility.INSTANCE, null, n4, null);
        ((StringBuilder)object3).append((String)object4);
        ((Ref$ObjectRef)object).element = object3 = ((StringBuilder)object3).toString();
        object3 = new StringBuilder("Firing default Tracker URL ");
        object4 = (String)((Ref$ObjectRef)object).element;
        d90_0.b((StringBuilder)object3, (String)object4, "message", (JioAds$Companion)object2);
        object2 = JioAds$LogLevel.NONE;
        object2 = Executors.newFixedThreadPool(n4);
        object3 = new dn1_1(n4, object, this);
        object2.submit((Runnable)object3);
    }

    public final AdMetaData$AdParams getAdParams(String string2, String object) {
        block6: {
            Intrinsics.checkNotNullParameter(string2, "creativeId");
            String string3 = "impressionId";
            Intrinsics.checkNotNullParameter(object, string3);
            object = this.c;
            boolean bl2 = object.containsKey(string2);
            if (!bl2) break block6;
            object = this.c;
            string2 = ((LinkedHashMap)object).get(string2);
            try {
                com.jio.jioads.jioreel.tracker.model.b.f(string2);
            }
            catch (Exception exception) {
                object = new StringBuilder("Error in getting ad params ");
                string3 = exception.getLocalizedMessage();
                ((StringBuilder)object).append(string3);
                char c2 = ',';
                ((StringBuilder)object).append(c2);
                ((StringBuilder)object).append(exception);
                Object object2 = ((StringBuilder)object).toString();
                object = "message";
                Intrinsics.checkNotNullParameter(object2, (String)object);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
            }
        }
        return null;
    }

    public final Map getMetaData() {
        return this.b;
    }

    public final void triggerCompleted(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "creativeId");
        Intrinsics.checkNotNullParameter(object2, "impressionId");
        object2 = this.c;
        boolean bl2 = object2.containsKey(object);
        String string2 = "No completed tracker found for ";
        if (bl2) {
            com.jio.jioads.jioreel.tracker.model.b.f(this.c.get(object));
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append((String)object);
            object2 = ((StringBuilder)object2).toString();
            string2 = "message";
            Intrinsics.checkNotNullParameter(object2, string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
        } else {
            l_0.h(string2, (String)object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object2 = JioAds$LogLevel.NONE;
        }
        object2 = p.t;
        if (object2 != null) {
            TypeIntrinsics.asMutableMap(((p)object2).i).remove(object);
            object = Utility.INSTANCE;
            bl2 = false;
            object2 = null;
            ((Utility)object).setCCBString$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(null);
        }
    }

    public final void triggerFirst(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "creativeId");
        Intrinsics.checkNotNullParameter(object2, "impressionId");
        object2 = this.c;
        boolean bl2 = object2.containsKey(object);
        String string2 = "No first quartile tracker found for ";
        if (bl2) {
            com.jio.jioads.jioreel.tracker.model.b.f(this.c.get(object));
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            l_0.h(string2, object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void triggerImpression(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "creativeId");
        Intrinsics.checkNotNullParameter(object2, "impressionId");
        object2 = Utility.INSTANCE;
        Object object3 = this.a;
        ((Utility)object2).getCbValue((Context)object3, (String)object);
        object2 = this.c;
        boolean bl2 = object2.containsKey(object);
        object3 = "No impression tracker found for ";
        if (bl2) {
            com.jio.jioads.jioreel.tracker.model.b.f(this.c.get(object));
            object2 = new StringBuilder((String)object3);
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            l_0.h((String)object3, object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void triggerMid(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "creativeId");
        Intrinsics.checkNotNullParameter(object2, "impressionId");
        object2 = this.c;
        boolean bl2 = object2.containsKey(object);
        String string2 = "No mid quartile tracker found for ";
        if (bl2) {
            com.jio.jioads.jioreel.tracker.model.b.f(this.c.get(object));
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            l_0.h(string2, object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void triggerStart(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "creativeId");
        Intrinsics.checkNotNullParameter(object2, "impressionId");
        object2 = this.c;
        boolean bl2 = object2.containsKey(object);
        String string2 = "No start tracker found for ";
        if (bl2) {
            com.jio.jioads.jioreel.tracker.model.b.f(this.c.get(object));
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            l_0.h(string2, object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }

    public final void triggerThird(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "creativeId");
        Intrinsics.checkNotNullParameter(object2, "impressionId");
        object2 = this.c;
        boolean bl2 = object2.containsKey(object);
        String string2 = "No third quartile tracker found for ";
        if (bl2) {
            com.jio.jioads.jioreel.tracker.model.b.f(this.c.get(object));
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            object2 = "message";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        } else {
            l_0.h(string2, object);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
    }
}

