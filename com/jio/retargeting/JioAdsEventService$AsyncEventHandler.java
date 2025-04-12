/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.jio.retargeting;

import android.content.Context;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.utils.Constants$PRIORITY_EVENTS;
import com.jio.retargeting.JioAdsEventService;
import com.jio.retargeting.datastore.RetargetPref;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class JioAdsEventService$AsyncEventHandler
implements Runnable {
    public final JSONObject a;
    public final long b;
    public final /* synthetic */ JioAdsEventService c;

    public JioAdsEventService$AsyncEventHandler(JioAdsEventService jioAdsEventService, JSONObject jSONObject, long l2) {
        Intrinsics.checkNotNullParameter(jSONObject, "serializedEvent");
        this.c = jioAdsEventService;
        this.a = jSONObject;
        this.b = l2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block10: {
            block11: {
                var1_1 = 1;
                var2_2 /* !! */  = "EventsInLimitAdTracking";
                var3_3 = this.c;
                try {
                    var4_4 = new ArrayList();
                    JioAdsEventService.access$setOneTimeWorkRequestList$p(var3_3, var4_4);
                    var4_4 = Constants$PRIORITY_EVENTS.values();
                    var5_5 = var4_4.length;
                    var6_6 = 0;
                }
                catch (Exception var13_13) {
                    break block10;
                }
                while (true) {
                    var7_7 = this.a;
                    if (var6_6 >= var5_5) break;
                    var8_8 /* !! */  = var4_4[var6_6];
                    var9_9 = var8_8 /* !! */ .getPriorityEventValue();
                    if (var9_9 == (var11_11 = var7_7.optInt(var10_10 = "eventId"))) {
                        var12_12 = true;
                        break block11;
                    }
                    var6_6 += var1_1;
                }
                var12_12 = false;
                var4_4 = null;
            }
            var14_16 = RetargetPref.INSTANCE;
            var15_17 = this.b;
            var6_6 = (int)var14_16.addEventData((JSONObject)var7_7, var15_17);
            var7_7 = var14_16.getConfigs();
            var8_8 /* !! */  = "message";
            var10_10 = "eventsInLimitAdTracking: true, so blocking the events";
            if (var7_7 == null || !(var17_18 = var7_7.has((String)var2_2 /* !! */ ))) ** GOTO lbl59
            var18_19 = var7_7.optInt((String)var2_2 /* !! */ );
            var7_7 = var3_3.getContext();
            var19_20 = "context";
            Intrinsics.checkNotNullParameter(var7_7, var19_20);
            var19_20 = "common_prefs";
            var20_21 = "limit-tracking";
            var21_22 = "";
            var22_23 = 4;
            try {
                var7_7 = j_0.d((Context)var7_7, var19_20, var22_23, var21_22, var20_21);
                var19_20 = "null cannot be cast to non-null type kotlin.Boolean";
                Intrinsics.checkNotNull(var7_7, var19_20);
                var7_7 = (Boolean)var7_7;
                var23_24 = var7_7.booleanValue();
            }
            catch (Exception v0) {
                var23_24 = false;
                var7_7 = null;
            }
            if (!var23_24 || var18_19 != 0) ** GOTO lbl59
            {
                block12: {
                    Intrinsics.checkNotNullParameter(var10_10, (String)var8_8 /* !! */ );
                    var2_2 /* !! */  = JioAds.Companion;
                    var2_2 /* !! */  = var2_2 /* !! */ .getInstance();
                    var2_2 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var2_2 /* !! */  = JioAds$LogLevel.NONE;
                    break block12;
lbl59:
                    // 2 sources

                    var1_1 = 0;
                    var13_14 /* !! */  = null;
                }
                if ((var12_12 || var6_6 != 0 || (var18_19 = (int)var14_16.fireIfQueueFull()) != 0) && var1_1 == 0) {
                    JioAdsEventService.access$sendBatchedEvents(var3_3);
                    return;
                }
                if (var1_1 != 0) {
                    Intrinsics.checkNotNullParameter(var10_10, (String)var8_8 /* !! */ );
                    var13_14 /* !! */  = JioAds.Companion;
                    var13_14 /* !! */  = var13_14 /* !! */ .getInstance();
                    var13_14 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    var13_14 /* !! */  = JioAds$LogLevel.NONE;
                    return;
                }
                var13_14 /* !! */  = "Non priority event and Batch is not yet full, event will be sent once batch is full.";
                Intrinsics.checkNotNullParameter(var13_14 /* !! */ , (String)var8_8 /* !! */ );
                var13_14 /* !! */  = JioAds.Companion;
                var13_14 /* !! */  = var13_14 /* !! */ .getInstance();
                var13_14 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var13_14 /* !! */  = JioAds$LogLevel.NONE;
                return;
            }
        }
        var2_2 /* !! */  = "Error in AsyncEventHandler";
        LO1.b((String)var2_2 /* !! */ , var13_13);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        var13_15 = JioAds$LogLevel.NONE;
    }
}

