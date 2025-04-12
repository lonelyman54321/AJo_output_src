/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.telephony.TelephonyManager
 *  android.view.ViewGroup
 */
package com.jio.jioads.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.common.j;
import com.jio.jioads.util.Utility;
import kotlin.jvm.internal.Intrinsics;

public final class i
extends BroadcastReceiver {
    public final /* synthetic */ j a;

    public i(j j3) {
        this.a = j3;
    }

    public final void onReceive(Context object, Intent object2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "intent");
        Object object3 = object2.getAction();
        String string2 = "android.intent.action.PHONE_STATE";
        boolean bl2 = Intrinsics.areEqual(object3, string2);
        if (bl2) {
            object3 = Utility.INSTANCE;
            boolean bl3 = ((Utility)object3).isPermissionGranted((Context)object, "android.permission.READ_PHONE_STATE");
            string2 = "message";
            if (bl3) {
                object = object2.getStringExtra("state");
                if (object == null) {
                    Intrinsics.checkNotNullParameter("Phone state is null so returning", string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    return;
                }
                object2 = TelephonyManager.EXTRA_STATE_RINGING;
                boolean bl4 = Intrinsics.areEqual(object, object2);
                int n3 = 5;
                j j3 = this.a;
                if (!bl4 && !(bl4 = Intrinsics.areEqual(object, object2 = TelephonyManager.EXTRA_STATE_OFFHOOK))) {
                    object2 = TelephonyManager.EXTRA_STATE_IDLE;
                    bl3 = Intrinsics.areEqual(object, object2);
                    if (bl3) {
                        Intrinsics.checkNotNullParameter("Inside STATE_IDLE", string2);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        bl3 = ((Utility)object3).checkVisibility((ViewGroup)j3, n3);
                        if (bl3 && (object = j3.f) != null) {
                            object.a();
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter("Inside RINGING or OFFHOOK so trying pausing ad", string2);
                    object = JioAds.Companion;
                    ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    bl4 = ((Utility)object3).checkVisibility((ViewGroup)j3, n3);
                    if (bl4) {
                        object2 = new StringBuilder();
                        object3 = j3.getIJioAdView().P();
                        ((StringBuilder)object2).append((String)object3);
                        object3 = ": onPause() of registerPhoneReceiver";
                        ((StringBuilder)object2).append((String)object3);
                        object2 = ((StringBuilder)object2).toString();
                        Intrinsics.checkNotNullParameter(object2, string2);
                        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = j3.f;
                        if (object != null) {
                            object.c();
                        }
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter("Phone state permission is missing", string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
            }
        }
    }
}

