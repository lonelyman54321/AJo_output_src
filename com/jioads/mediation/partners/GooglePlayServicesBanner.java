/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 */
package com.jioads.mediation.partners;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.RequestConfiguration$Builder;
import com.google.android.gms.common.GoogleApiAvailability;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdPartner;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jioads.mediation.partners.GooglePlayServicesBanner$AdViewListener;
import com.jioads.mediation.partners.GooglePlayServicesBanner$Companion;
import com.jioads.mediation.partners.JioMediationAd;
import com.jioads.mediation.partners.JioMediationListener;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class GooglePlayServicesBanner
extends JioMediationAd {
    public static final GooglePlayServicesBanner$Companion Companion;
    public JioMediationListener a;
    public AdView b;
    public boolean c;
    public JioAdPartner d;
    public String e;

    static {
        GooglePlayServicesBanner$Companion googlePlayServicesBanner$Companion;
        Companion = googlePlayServicesBanner$Companion = new GooglePlayServicesBanner$Companion(null);
    }

    public static final void a(GooglePlayServicesBanner object, AdRequest adRequest) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string2 = "$adRequest";
        Intrinsics.checkNotNullParameter(adRequest, string2);
        object = ((GooglePlayServicesBanner)object).b;
        if (object != null) {
            ((BaseAdView)((Object)object)).loadAd(adRequest);
        }
    }

    public static final /* synthetic */ JioMediationListener access$getMBannerListener$p(GooglePlayServicesBanner googlePlayServicesBanner) {
        return googlePlayServicesBanner.a;
    }

    public static final /* synthetic */ AdView access$getMGoogleAdView$p(GooglePlayServicesBanner googlePlayServicesBanner) {
        return googlePlayServicesBanner.b;
    }

    public static final /* synthetic */ boolean access$isFirstAd$p(GooglePlayServicesBanner googlePlayServicesBanner) {
        return googlePlayServicesBanner.c;
    }

    public static final /* synthetic */ void access$setFirstAd$p(GooglePlayServicesBanner googlePlayServicesBanner, boolean bl2) {
        googlePlayServicesBanner.c = bl2;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean isTablet(Context context) {
        void var3_6;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        context = context.getResources().getConfiguration();
        int bl2 = context.screenLayout & 0xF;
        int n3 = 3;
        if (bl2 >= n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            context = null;
        }
        return (boolean)var3_6;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void loadAd(JioAdView var1_1, JioMediationListener var2_4, Map var3_5, Map var4_6) {
        var5_7 = 1;
        var6_8 = "message";
        var7_9 = "appid";
        var8_10 /* !! */  = "keyword";
        var9_11 = "test";
        var10_12 = "adunitid";
        var11_13 /* !! */  = "adview";
        var12_14 = "network_name";
        Intrinsics.checkNotNullParameter(var1_1, "jioAdView");
        Intrinsics.checkNotNullParameter(var2_4 /* !! */ , "customEventListener");
        Intrinsics.checkNotNullParameter(var3_5 /* !! */ , "localExtras");
        var13_15 = "serverExtras";
        Intrinsics.checkNotNullParameter(var4_6 /* !! */ , var13_15);
        try {
            var14_16 = var3_5 /* !! */ .containsKey(var11_13 /* !! */ );
            if (var14_16) {
                var11_13 /* !! */  = var3_5 /* !! */ .get(var11_13 /* !! */ );
            }
            ** GOTO lbl-1000
        }
        catch (Exception var1_2) {
            ** GOTO lbl216
        }
        var15_17 = var11_13 /* !! */  instanceof JioAdView;
lbl-1000:
        // 2 sources

        {
            this.a = var2_4 /* !! */ ;
        }
        {
            var16_18 = var4_6 /* !! */ .isEmpty() ^ var5_7;
            if (!var16_18 || !(var16_18 = var4_6 /* !! */ .containsKey(var10_12))) ** GOTO lbl234
            var2_4 /* !! */  = var4_6 /* !! */ .get(var10_12);
            var2_4 /* !! */  = String.valueOf(var2_4 /* !! */ );
            var2_4 /* !! */  = StringsKt.m0((CharSequence)var2_4 /* !! */ );
            var2_4 /* !! */  = var2_4 /* !! */ .toString();
            var17_19 = var4_6 /* !! */ .containsKey(var12_14);
            var15_17 = 6;
            var14_16 = false;
            var13_15 = null;
            if (var17_19 == 0) ** GOTO lbl-1000
            var10_12 = var3_5 /* !! */ .get(var12_14);
            this.d = var10_12 = (JioAdPartner)var10_12;
            if (var10_12 != null) {
                var12_14 = var4_6 /* !! */ .get(var12_14);
                var12_14 = String.valueOf(var12_14);
                var10_12.setPartnerName((String)var12_14);
            }
            var10_12 = GoogleApiAvailability.class;
        }
        var18_20 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        var10_12 = var10_12.getName();
        Intrinsics.checkNotNull(var10_12);
        var12_14 = "GoogleApiAvailability";
        var17_19 = StringsKt.O((CharSequence)var10_12, (String)var12_14, 0, false, var15_17);
        var18_20 = -1;
        if (var17_19 == var18_20 || (var10_12 = this.d) == null) ** GOTO lbl-1000
        var12_14 = new StringBuilder();
        var19_21 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        var12_14.append(var19_21);
        var20_22 = "";
        var12_14.append((String)var20_22);
        var12_14 = var12_14.toString();
        var10_12.setPartnerSDKVersion((String)var12_14);
lbl-1000:
        // 4 sources

        {
            while (true) {
                block38: {
                    block34: {
                        block35: {
                            block36: {
                                block39: {
                                    block37: {
                                        var10_12 = var1_1.getContext();
                                        if (var10_12 != null) {
                                            var12_14 = new AdView((Context)var10_12);
                                        } else {
                                            var18_20 = 0;
                                            var12_14 = null;
                                        }
                                        this.b = var12_14;
                                        if (var12_14 != null) {
                                            var10_12 = new GooglePlayServicesBanner$AdViewListener(this);
                                            var12_14.setAdListener((AdListener)var10_12);
                                        }
                                        var10_12 = this.b;
                                        if (var10_12 != null) {
                                            var10_12.setAdUnitId((String)var2_4 /* !! */ );
                                        }
                                        var16_18 = var3_5 /* !! */ .containsKey(var9_11);
                                        if (var16_18) {
                                            var2_4 /* !! */  = var3_5 /* !! */ .get(var9_11);
                                            if ((var2_4 /* !! */  = (String[])var2_4 /* !! */ ) != null) {
                                                var21_23 = ((String[])var2_4 /* !! */ ).length;
                                                var10_12 = null;
                                                for (var17_19 = 0; var17_19 < var21_23; var12_14 = var12_14.build(), var17_19 += var5_7) {
                                                    var12_14 = new RequestConfiguration$Builder();
                                                    var20_22 = var2_4 /* !! */ [var17_19];
                                                    var20_22 = kotlin.collections.a.b(var20_22);
                                                    var12_14 = var12_14.setTestDeviceIds((List)var20_22);
                                                    MobileAds.setRequestConfiguration((RequestConfiguration)var12_14);
                                                }
                                            }
                                        }
                                        var2_4 /* !! */  = new AdRequest$Builder();
                                        var21_23 = var3_5 /* !! */ .containsKey(var8_10 /* !! */ );
                                        if (var21_23 != 0) {
                                            var8_10 /* !! */  = var3_5 /* !! */ .get(var8_10 /* !! */ );
                                            var8_10 /* !! */  = String.valueOf(var8_10 /* !! */ );
                                            var2_4 /* !! */ .addKeyword(var8_10 /* !! */ );
                                        }
                                        if (var22_24 = var4_6 /* !! */ .containsKey(var7_9)) {
                                            var4_6 /* !! */  = var4_6 /* !! */ .get(var7_9);
                                            var4_6 /* !! */  = String.valueOf(var4_6 /* !! */ );
                                            this.e = var4_6 /* !! */ ;
                                        }
                                        var4_6 /* !! */  = "adsize";
                                        var3_5 /* !! */  = var3_5 /* !! */ .get(var4_6 /* !! */ );
                                        var23_25 = TextUtils.isEmpty((CharSequence)(var3_5 /* !! */  = String.valueOf(var3_5 /* !! */ )));
                                        if (var23_25 != 0) break block34;
                                        var4_6 /* !! */  = var1_1.getIjioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        if (var4_6 /* !! */  != null) {
                                            var4_6 /* !! */  = var4_6 /* !! */ .y();
                                            var7_9 = Boolean.TRUE;
                                            var23_25 = Intrinsics.areEqual(var4_6 /* !! */ , var7_9);
                                        } else {
                                            var23_25 = 0;
                                            var4_6 /* !! */  = null;
                                        }
                                        if (var23_25 != 0) break block35;
                                        var4_6 /* !! */  = var1_1.getIjioAdView$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        if (var4_6 /* !! */  != null) {
                                            var4_6 /* !! */  = var4_6 /* !! */ .O();
                                            var7_9 = Boolean.TRUE;
                                            var23_25 = Intrinsics.areEqual(var4_6 /* !! */ , var7_9);
                                        } else {
                                            var23_25 = 0;
                                            var4_6 /* !! */  = null;
                                        }
                                        if (var23_25 != 0) break block35;
                                        var4_6 /* !! */  = "320x50";
                                        var23_25 = var3_5 /* !! */ .equalsIgnoreCase((String)var4_6 /* !! */ );
                                        if (var23_25 != 0 || (var23_25 = var3_5 /* !! */ .equalsIgnoreCase((String)(var4_6 /* !! */  = "300x50"))) != 0) break block36;
                                        var4_6 /* !! */  = "300x250";
                                        var23_25 = var3_5 /* !! */ .equalsIgnoreCase((String)var4_6 /* !! */ );
                                        if (var23_25 == 0) break block37;
                                        var3_5 /* !! */  = this.b;
                                        if (var3_5 /* !! */  != null) {
                                            var4_6 /* !! */  = AdSize.MEDIUM_RECTANGLE;
                                            var3_5 /* !! */ .setAdSize((AdSize)var4_6 /* !! */ );
                                        }
                                        break block38;
                                    }
                                    var4_6 /* !! */  = "160x600";
                                    var23_25 = var3_5 /* !! */ .equalsIgnoreCase((String)var4_6 /* !! */ );
                                    if (var23_25 == 0) break block39;
                                    var3_5 /* !! */  = this.b;
                                    if (var3_5 /* !! */  != null) {
                                        var4_6 /* !! */  = AdSize.WIDE_SKYSCRAPER;
                                        var3_5 /* !! */ .setAdSize((AdSize)var4_6 /* !! */ );
                                    }
                                    break block38;
                                }
                                var4_6 /* !! */  = "320x100";
                                var23_25 = var3_5 /* !! */ .equalsIgnoreCase((String)var4_6 /* !! */ );
                                if (var23_25 != 0) {
                                    var3_5 /* !! */  = this.b;
                                    if (var3_5 /* !! */  != null) {
                                        var4_6 /* !! */  = AdSize.LEADERBOARD;
                                        var3_5 /* !! */ .setAdSize((AdSize)var4_6 /* !! */ );
                                    }
                                    break block38;
                                } else {
                                    var4_6 /* !! */  = "728x90";
                                    var24_26 = var3_5 /* !! */ .equalsIgnoreCase((String)var4_6 /* !! */ );
                                    if (var24_26 && (var3_5 /* !! */  = this.b) != null) {
                                        var4_6 /* !! */  = AdSize.LEADERBOARD;
                                        var3_5 /* !! */ .setAdSize((AdSize)var4_6 /* !! */ );
                                    }
                                }
                                break block38;
                            }
                            var3_5 /* !! */  = this.b;
                            if (var3_5 /* !! */  != null) {
                                var4_6 /* !! */  = AdSize.BANNER;
                                var3_5 /* !! */ .setAdSize((AdSize)var4_6 /* !! */ );
                            }
                            break block38;
                        }
                        var4_6 /* !! */  = "x";
                        var4_6 /* !! */  = new String[]{var4_6 /* !! */ };
                        var4_6 /* !! */  = StringsKt.a0((CharSequence)var3_5 /* !! */ , var4_6 /* !! */ , false, 0, var15_17);
                        var7_9 = new StringBuilder();
                        var8_10 /* !! */  = var1_1.getAdspotId();
                        var7_9.append(var8_10 /* !! */ );
                        var8_10 /* !! */  = ": GMA mediation Adaptive Banner Size: ";
                        var7_9.append(var8_10 /* !! */ );
                        var7_9.append((String)var3_5 /* !! */ );
                        var3_5 /* !! */  = var7_9.toString();
                        Intrinsics.checkNotNullParameter(var3_5 /* !! */ , var6_8);
                        var3_5 /* !! */  = JioAds.Companion;
                        var3_5 /* !! */  = var3_5 /* !! */ .getInstance();
                        var3_5 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var3_5 /* !! */  = JioAds$LogLevel.NONE;
                        var3_5 /* !! */  = this.b;
                        if (var3_5 /* !! */  != null) {
                            var7_9 = var4_6 /* !! */ .get(0);
                            var7_9 = (String)var7_9;
                            var25_27 = Integer.parseInt((String)var7_9);
                            var4_6 /* !! */  = var4_6 /* !! */ .get(var5_7);
                            var4_6 /* !! */  = (String)var4_6 /* !! */ ;
                            var23_25 = Integer.parseInt((String)var4_6 /* !! */ );
                            var4_6 /* !! */  = AdSize.getInlineAdaptiveBannerAdSize(var25_27, var23_25);
                            var3_5 /* !! */ .setAdSize((AdSize)var4_6 /* !! */ );
                        }
                        break block38;
                    }
                    var3_5 /* !! */  = this.b;
                    if (var3_5 /* !! */  != null) {
                        var4_6 /* !! */  = AdSize.MEDIUM_RECTANGLE;
                        var3_5 /* !! */ .setAdSize((AdSize)var4_6 /* !! */ );
                    }
                }
                if ((var3_5 /* !! */  = this.e) != null && !(var24_26 = TextUtils.isEmpty((CharSequence)var3_5 /* !! */ )) && (var1_1 = var1_1.getContext()) != null) {
                    MobileAds.initialize((Context)var1_1);
                }
                var1_1 = var2_4 /* !! */ .build();
                var2_4 /* !! */  = "build(...)";
                Intrinsics.checkNotNullExpressionValue(var1_1, (String)var2_4 /* !! */ );
                var2_4 /* !! */  = Looper.myLooper();
                var3_5 /* !! */  = Looper.getMainLooper();
                var16_18 = Intrinsics.areEqual(var2_4 /* !! */ , var3_5 /* !! */ );
                if (var16_18) {
                    var2_4 /* !! */  = this.b;
                    if (var2_4 /* !! */  == null) return;
                    var2_4 /* !! */ .loadAd((AdRequest)var1_1);
                    return;
                }
                var3_5 /* !! */  = Looper.getMainLooper();
                var2_4 /* !! */  = new Handler((Looper)var3_5 /* !! */ );
                var3_5 /* !! */  = new s01_0(this, (AdRequest)var1_1);
                var2_4 /* !! */ .post((Runnable)var3_5 /* !! */ );
                return;
            }
lbl216:
            // 1 sources

            var2_4 /* !! */  = this.a;
            if (var2_4 /* !! */  == null) return;
            var3_5 /* !! */  = "Exception : ";
            var2_4 /* !! */  = new StringBuilder((String)var3_5 /* !! */ );
            var2_4 /* !! */ .append(var1_2);
            Intrinsics.checkNotNullParameter(var2_4 /* !! */ .toString(), var6_8);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            var1_3 = JioAds$LogLevel.NONE;
            var1_3 = this.a;
            if (var1_3 == null) return;
            var2_4 /* !! */  = JioAdError$JioAdErrorType.ERROR_IN_MEDIATION.getErrorCode();
            var3_5 /* !! */  = "Error while loading mediation ad";
            var1_3.onAdFailed((String)var2_4 /* !! */ , (String)var3_5 /* !! */ );
            return;
            catch (Exception v0) {
                ** continue;
            }
lbl234:
            // 1 sources

            var1_1 = this.a;
            if (var1_1 == null) return;
            var2_4 /* !! */  = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
            var2_4 /* !! */  = var2_4 /* !! */ .getErrorCode();
            var3_5 /* !! */  = "GooglePlayServicesBanner Mandatory parameters missing";
            var1_1.onAdFailed((String)var2_4 /* !! */ , (String)var3_5 /* !! */ );
            return;
        }
    }

    public final void onDestroy() {
        AdView adView = this.b;
        if (adView != null) {
            adView.removeAllViews();
        }
        if ((adView = this.b) != null) {
            adView.destroy();
        }
        this.b = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onInvalidate() {
        AdView adView;
        block6: {
            try {
                adView = this.b;
                if (adView == null) break block6;
            }
            catch (Exception exception) {
                return;
            }
            adView.destroy();
        }
        adView = null;
        this.b = null;
        adView = null;
        this.c = false;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public void showAd() {
    }
}

