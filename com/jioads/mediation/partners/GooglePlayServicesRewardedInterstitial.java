/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 */
package com.jioads.mediation.partners;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.common.GoogleApiAvailability;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdPartner;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.util.Utility;
import com.jioads.mediation.partners.GooglePlayServicesRewardedInterstitial$Companion;
import com.jioads.mediation.partners.GooglePlayServicesRewardedInterstitial$loadRewardedInterstitialAd$1;
import com.jioads.mediation.partners.GooglePlayServicesRewardedInterstitial$showAd$1;
import com.jioads.mediation.partners.JioMediationAd;
import com.jioads.mediation.partners.JioMediationListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class GooglePlayServicesRewardedInterstitial
extends JioMediationAd {
    public static final GooglePlayServicesRewardedInterstitial$Companion Companion;
    public JioMediationListener a;
    public RewardedInterstitialAd b;
    public Context c;
    public JioAdPartner d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;

    static {
        GooglePlayServicesRewardedInterstitial$Companion googlePlayServicesRewardedInterstitial$Companion;
        Companion = googlePlayServicesRewardedInterstitial$Companion = new GooglePlayServicesRewardedInterstitial$Companion(null);
    }

    public static final void a(GooglePlayServicesRewardedInterstitial googlePlayServicesRewardedInterstitial, AdRequest$Builder object) {
        Intrinsics.checkNotNullParameter(googlePlayServicesRewardedInterstitial, "this$0");
        Intrinsics.checkNotNullParameter(object, "$adRequest");
        Intrinsics.checkNotNullParameter("Not in UI thread so calling loadAd() of GMA from UI thread", "message");
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        object = ((AdRequest$Builder)object).build();
        Intrinsics.checkNotNullExpressionValue(object, "build(...)");
        jioAds$LogLevel = googlePlayServicesRewardedInterstitial.c;
        Intrinsics.checkNotNull((Object)jioAds$LogLevel, "null cannot be cast to non-null type android.app.Activity");
        jioAds$LogLevel = (Activity)jioAds$LogLevel;
        String string2 = googlePlayServicesRewardedInterstitial.f;
        Intrinsics.checkNotNull(string2);
        GooglePlayServicesRewardedInterstitial$loadRewardedInterstitialAd$1 googlePlayServicesRewardedInterstitial$loadRewardedInterstitialAd$1 = new GooglePlayServicesRewardedInterstitial$loadRewardedInterstitialAd$1(googlePlayServicesRewardedInterstitial);
        RewardedInterstitialAd.load((Context)jioAds$LogLevel, string2, (AdRequest)object, (RewardedInterstitialAdLoadCallback)googlePlayServicesRewardedInterstitial$loadRewardedInterstitialAd$1);
    }

    public static final void a(GooglePlayServicesRewardedInterstitial object, RewardItem object2) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(object2, "rewardItem");
        int n3 = object2.getAmount();
        object2 = object2.getType();
        Intrinsics.checkNotNullExpressionValue(object2, "getType(...)");
        ((GooglePlayServicesRewardedInterstitial)object).h = true;
        object = new StringBuilder("User earned the reward. ");
        ((StringBuilder)object).append(n3);
        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), "message");
        object = JioAds.Companion;
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        l_0.h("rewardType. ", (String)object2);
        ((JioAds$Companion)object).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public static final String access$getErrorReason(GooglePlayServicesRewardedInterstitial object, int n3) {
        int n4;
        object.getClass();
        object = n3 != 0 ? (n3 != (n4 = 1) ? (n3 != (n4 = 2) ? (n3 != (n4 = 3) ? "" : "No fill") : "Network Error") : "Invalid request") : "Internal error";
        return object;
    }

    public static final /* synthetic */ JioMediationListener access$getMRewardedInterstitialAdListener$p(GooglePlayServicesRewardedInterstitial googlePlayServicesRewardedInterstitial) {
        return googlePlayServicesRewardedInterstitial.a;
    }

    public static final /* synthetic */ void access$setMGoogleRewardedInterstitialAd$p(GooglePlayServicesRewardedInterstitial googlePlayServicesRewardedInterstitial, RewardedInterstitialAd rewardedInterstitialAd) {
        googlePlayServicesRewardedInterstitial.b = rewardedInterstitialAd;
    }

    public final String getAdUnitId() {
        return this.f;
    }

    public final Context getContext() {
        return this.c;
    }

    public final boolean isEligibleForReward() {
        return this.h;
    }

    public final boolean isVideoCompleted() {
        return this.g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void loadAd(JioAdView object, JioMediationListener object2, Map object3, Map object4) {
        Exception exception2;
        block18: {
            block15: {
                block16: {
                    boolean bl2;
                    boolean bl3;
                    String string2;
                    String string3;
                    String string4;
                    String string5;
                    String string6;
                    block17: {
                        int n3;
                        string6 = "appid";
                        string5 = "keyword";
                        string4 = "adunitid";
                        Object object5 = "network_name";
                        String string7 = "jioAdPartner name: ";
                        string3 = "RewardedInterstitial Video adUnitId= ";
                        Intrinsics.checkNotNullParameter(object, "jioAdView");
                        Intrinsics.checkNotNullParameter(object2, "customEventListener");
                        Intrinsics.checkNotNullParameter(object3, "localExtras");
                        string2 = "serverExtras";
                        Intrinsics.checkNotNullParameter(object4, string2);
                        try {
                            string2 = ((JioAdView)object).getContext();
                            this.c = string2;
                            this.a = object2;
                            n3 = object4.isEmpty() ^ 1;
                            if (n3 == 0) break block15;
                            n3 = object4.containsKey(string4);
                            if (n3 == 0) break block16;
                            n3 = object4.containsKey(object5);
                            string2 = "message";
                            if (n3 == 0) break block17;
                            object2 = object3.get(object5);
                            object2 = (JioAdPartner)object2;
                            this.d = object2;
                            if (object2 != null) {
                                object5 = object4.get(object5);
                                object5 = String.valueOf(object5);
                                ((JioAdPartner)object2).setPartnerName((String)object5);
                            }
                            object2 = GoogleApiAvailability.class;
                        }
                        catch (Exception exception2) {}
                        try {
                            int n4 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                            object2 = ((Class)object2).getName();
                            Intrinsics.checkNotNull(object2);
                            object5 = "GoogleApiAvailability";
                            int n7 = 6;
                            n3 = StringsKt.O((CharSequence)object2, (String)object5, 0, false, n7);
                            n4 = -1;
                            if (n3 != n4 && (object2 = this.d) != null) {
                                object5 = new StringBuilder();
                                n7 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                                ((StringBuilder)object5).append(n7);
                                String string8 = "";
                                ((StringBuilder)object5).append(string8);
                                object5 = ((StringBuilder)object5).toString();
                                ((JioAdPartner)object2).setPartnerSDKVersion((String)object5);
                            }
                            object2 = new StringBuilder(string7);
                            object5 = this.d;
                            string7 = null;
                            if (object5 != null) {
                                object5 = ((JioAdPartner)object5).getPartnerName();
                            } else {
                                n4 = 0;
                                object5 = null;
                            }
                            ((StringBuilder)object2).append((String)object5);
                            object5 = " and partner SDK version: ";
                            ((StringBuilder)object2).append((String)object5);
                            object5 = this.d;
                            if (object5 != null) {
                                string7 = ((JioAdPartner)object5).getPartnerSDKVersion();
                            }
                            ((StringBuilder)object2).append(string7);
                            object2 = ((StringBuilder)object2).toString();
                            Intrinsics.checkNotNullParameter(object2, string2);
                            object2 = JioAds.Companion;
                            object2 = ((JioAds$Companion)object2).getInstance();
                            ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            object2 = JioAds$LogLevel.NONE;
                        }
                        catch (Exception exception3) {}
                    }
                    object2 = object4.get(string4);
                    object2 = String.valueOf(object2);
                    this.f = object2;
                    object2 = new StringBuilder(string3);
                    object4 = this.f;
                    ((StringBuilder)object2).append((String)object4);
                    object2 = ((StringBuilder)object2).toString();
                    Intrinsics.checkNotNullParameter(object2, string2);
                    object2 = JioAds.Companion;
                    object2 = ((JioAds$Companion)object2).getInstance();
                    ((JioAds)object2).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                    object2 = new AdRequest$Builder();
                    boolean bl4 = object3.containsKey(string5);
                    if (bl4) {
                        object4 = object3.get(string5);
                        object4 = String.valueOf(object4);
                        ((AbstractAdRequestBuilder)object2).addKeyword((String)object4);
                    }
                    if (bl4 = object3.containsKey(string6)) {
                        object3 = object3.get(string6);
                        this.e = object3 = String.valueOf(object3);
                    }
                    if ((object3 = this.e) != null && !(bl3 = TextUtils.isEmpty((CharSequence)object3)) && (object = ((JioAdView)object).getContext()) != null) {
                        MobileAds.initialize((Context)object);
                    }
                    if (bl2 = Intrinsics.areEqual(object = Looper.myLooper(), object3 = Looper.getMainLooper())) {
                        object = ((AdRequest$Builder)object2).build();
                        object2 = "build(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                        object2 = this.c;
                        object3 = "null cannot be cast to non-null type android.app.Activity";
                        Intrinsics.checkNotNull(object2, (String)object3);
                        object2 = (Activity)object2;
                        object3 = this.f;
                        Intrinsics.checkNotNull(object3);
                        object4 = new GooglePlayServicesRewardedInterstitial$loadRewardedInterstitialAd$1(this);
                        RewardedInterstitialAd.load((Context)object2, (String)object3, (AdRequest)object, (RewardedInterstitialAdLoadCallback)object4);
                        return;
                    }
                    break block18;
                    object3 = Looper.getMainLooper();
                    object = new Handler((Looper)object3);
                    object3 = new x01_0(0, this, object2);
                    object.post((Runnable)object3);
                    return;
                }
                object = this.a;
                if (object == null) return;
                object2 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
                object2 = ((JioAdError$JioAdErrorType)((Object)object2)).getErrorCode();
                object3 = "GooglePlayServicesRewardedInterstitial Mandatory parameters missing";
                object.onAdFailed((String)object2, (String)object3);
                return;
            }
            object = this.a;
            if (object == null) return;
            object2 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
            object2 = ((JioAdError$JioAdErrorType)((Object)object2)).getErrorCode();
            object3 = "GooglePlayServicesRewardedInterstitial serverExtras missing";
            object.onAdFailed((String)object2, (String)object3);
            return;
        }
        object2 = this.a;
        if (object2 == null) return;
        object3 = JioAdError$JioAdErrorType.ERROR_IN_MEDIATION.getErrorCode();
        object4 = "Error while loading mediation ad";
        object2.onAdFailed((String)object3, (String)object4);
        object2 = Utility.INSTANCE;
        ((Utility)object2).printStacktrace(exception2);
    }

    public final void onDestroy() {
    }

    public void onInvalidate() {
        Object var1_1 = null;
        try {
            this.b = null;
        }
        catch (Exception exception) {
            Utility utility = Utility.INSTANCE;
            utility.printStacktrace(exception);
        }
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void setAdUnitId(String string2) {
        this.f = string2;
    }

    public final void setContext(Context context) {
        this.c = context;
    }

    public final void setEligibleForReward(boolean bl2) {
        this.h = bl2;
    }

    public final void setVideoCompleted(boolean bl2) {
        this.g = bl2;
    }

    public void showAd() {
        block10: {
            RewardedInterstitialAd rewardedInterstitialAd = this.b;
            if (rewardedInterstitialAd == null) break block10;
            Object object = new GooglePlayServicesRewardedInterstitial$showAd$1(this);
            rewardedInterstitialAd.setFullScreenContentCallback((FullScreenContentCallback)object);
            rewardedInterstitialAd = this.b;
            if (rewardedInterstitialAd == null) break block10;
            object = this.c;
            Object object2 = "null cannot be cast to non-null type android.app.Activity";
            Intrinsics.checkNotNull(object, (String)object2);
            object = (Activity)object;
            int n3 = 3;
            object2 = new k5(this, n3);
            try {
                rewardedInterstitialAd.show((Activity)object, (OnUserEarnedRewardListener)object2);
            }
            catch (Exception exception) {
                object = new StringBuilder("Error in showAd: ");
                object2 = Utility.INSTANCE;
                com.jio.jioads.jioreel.tracker.model.b.c((Utility)object2, exception, (StringBuilder)object);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = this.a;
                if (object == null) break block10;
                object2 = JioAdError$JioAdErrorType.ERROR_RENDITION_ERROR.getErrorCode();
                String string2 = "GooglePlayServicesRewardedInterstitial ";
                StringBuilder stringBuilder = new StringBuilder(string2);
                String string3 = exception.getMessage();
                stringBuilder.append(string3);
                string3 = stringBuilder.toString();
                object.onAdFailed((String)object2, string3);
            }
        }
    }
}

