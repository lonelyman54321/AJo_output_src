/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.RatingBar
 *  android.widget.TextView
 *  org.json.JSONObject
 */
package com.jioads.mediation.partners;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader$Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.VideoOptions$Builder;
import com.google.android.gms.ads.nativead.AdChoicesView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAd$Image;
import com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions$Builder;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdPartner;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AD_TYPE;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jioads.mediation.partners.GooglePlayServicesNative$loadAd$adLoader$1$1$1;
import com.jioads.mediation.partners.GooglePlayServicesNative$loadAd$adLoader$1$2;
import com.jioads.mediation.partners.JioMediationAd;
import com.jioads.mediation.partners.JioMediationListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONObject;

public final class GooglePlayServicesNative
extends JioMediationAd {
    public Context a;
    public JioMediationListener b;
    public NativeAd c;
    public boolean d = true;
    public int e;
    public JioAdView f;
    public NativeAdView g;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(GooglePlayServicesNative object, JioMediationListener jioMediationListener, JioAdView object2, NativeAd nativeAd) {
        void var0_4;
        void var3_29;
        void var2_8;
        void var1_7;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter(var1_7, "$jioCustomAdListener");
        String string2 = "$jioAdView";
        Intrinsics.checkNotNullParameter(var2_8, string2);
        String string3 = "nativeAdResponse";
        Intrinsics.checkNotNullParameter(var3_29, string3);
        ((GooglePlayServicesNative)object).c = var3_29;
        Intrinsics.checkNotNull(var3_29);
        MediaContent mediaContent = var3_29.getMediaContent();
        if (mediaContent != null) {
            VideoController videoController = mediaContent.getVideoController();
        } else {
            Object var0_3 = null;
        }
        Intrinsics.checkNotNull(var0_4);
        StringBuilder stringBuilder = new StringBuilder("hasVideoContent= ");
        boolean bl2 = var0_4.hasVideoContent();
        stringBuilder.append(bl2);
        String string4 = stringBuilder.toString();
        string2 = "message";
        Intrinsics.checkNotNullParameter(string4, string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
        boolean bl3 = var0_4.hasVideoContent();
        if (bl3) {
            GooglePlayServicesNative$loadAd$adLoader$1$1$1 googlePlayServicesNative$loadAd$adLoader$1$1$1 = new GooglePlayServicesNative$loadAd$adLoader$1$1$1((JioMediationListener)var1_7);
            var0_4.setVideoLifecycleCallbacks(googlePlayServicesNative$loadAd$adLoader$1$1$1);
        }
        JSONObject jSONObject = new JSONObject();
        String string5 = "type";
        Object object3 = "UNIFIED_AD";
        try {
            Double d2;
            String string6;
            jSONObject.put(string5, object3);
            String string7 = "title";
            object3 = var3_29.getHeadline();
            jSONObject.put(string7, object3);
            String string8 = "desc";
            object3 = var3_29.getBody();
            jSONObject.put(string8, object3);
            String string9 = "ctatext";
            object3 = var3_29.getCallToAction();
            jSONObject.put(string9, object3);
            String string10 = var3_29.getPrice();
            if (string10 != null && !(bl3 = TextUtils.isEmpty((CharSequence)(string6 = var3_29.getPrice())))) {
                String string11 = "price";
                object3 = var3_29.getPrice();
                jSONObject.put(string11, object3);
            }
            if ((d2 = var3_29.getStarRating()) != null) {
                String string12 = "rating";
                object3 = var3_29.getStarRating();
                Intrinsics.checkNotNull(object3);
                double d5 = (Double)object3;
                object3 = Double.toString(d5);
                jSONObject.put(string12, object3);
            }
            String string13 = "unifiedNativeAd";
            jSONObject.put(string13, (Object)var3_29);
        }
        catch (Exception exception) {}
        Object[] objectArray = new Object[]{jSONObject};
        Intrinsics.checkNotNullParameter("GMA mediation native ad prepared", string2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel2 = JioAds$LogLevel.NONE;
        var1_7.onNativeAdLoaded(objectArray);
    }

    public final void handleErrorCode(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        JioMediationListener jioMediationListener = this.b;
                        Intrinsics.checkNotNull(jioMediationListener);
                        String string2 = JioAdError$JioAdErrorType.ERROR_IN_MEDIATION.getErrorCode();
                        String string3 = "GooglePlayServicesNative Unknown error";
                        jioMediationListener.onAdFailed(string2, string3);
                    } else {
                        JioMediationListener jioMediationListener = this.b;
                        Intrinsics.checkNotNull(jioMediationListener);
                        String string4 = JioAdError$JioAdErrorType.ERROR_NOFILL.getErrorCode();
                        String string5 = "GooglePlayServicesNative ERROR_CODE_NO_FILL";
                        jioMediationListener.onAdFailed(string4, string5);
                    }
                } else {
                    JioMediationListener jioMediationListener = this.b;
                    Intrinsics.checkNotNull(jioMediationListener);
                    String string6 = JioAdError$JioAdErrorType.ERROR_NETWORK_ERROR.getErrorCode();
                    String string7 = "GooglePlayServicesNative ERROR_CODE_NETWORK_ERROR";
                    jioMediationListener.onAdFailed(string6, string7);
                }
            } else {
                JioMediationListener jioMediationListener = this.b;
                Intrinsics.checkNotNull(jioMediationListener);
                String string8 = JioAdError$JioAdErrorType.ERROR_INVALID_AD_REQUEST_PARAMETERS.getErrorCode();
                String string9 = "GooglePlayServicesNative ERROR_CODE_INVALID_REQUEST";
                jioMediationListener.onAdFailed(string8, string9);
            }
        } else {
            JioMediationListener jioMediationListener = this.b;
            Intrinsics.checkNotNull(jioMediationListener);
            String string10 = JioAdError$JioAdErrorType.ERROR_IN_MEDIATION.getErrorCode();
            String string11 = "GooglePlayServicesNative ERROR_CODE_INTERNAL_ERROR";
            jioMediationListener.onAdFailed(string10, string11);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleImpression(ViewGroup viewGroup) {
        Exception exception2;
        Object object;
        block37: {
            Object object2;
            block36: {
                boolean bl2;
                block35: {
                    object = "message";
                    Intrinsics.checkNotNullParameter(viewGroup, "parentView");
                    object2 = "show ad & handleImpressions Admob";
                    try {
                        float f5;
                        Intrinsics.checkNotNullParameter(object2, (String)object);
                        object = JioAds.Companion;
                        object = ((JioAds$Companion)object).getInstance();
                        ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        viewGroup.removeAllViews();
                        object = viewGroup.getContext();
                        object2 = "layout_inflater";
                        object = object.getSystemService((String)object2);
                        object2 = "null cannot be cast to non-null type android.view.LayoutInflater";
                        Intrinsics.checkNotNull(object, (String)object2);
                        object = (LayoutInflater)object;
                        object2 = this.g;
                        Object object3 = "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView";
                        String string2 = null;
                        if (object2 != null) {
                            Intrinsics.checkNotNull(object2, (String)object3);
                        } else {
                            int n3;
                            object2 = this.f;
                            if (object2 != null) {
                                object2 = ((JioAdView)object2).getAdType();
                            } else {
                                n3 = 0;
                                object2 = null;
                            }
                            Object object4 = JioAdView$AD_TYPE.INFEED;
                            String string3 = "layout";
                            if (object2 == object4) {
                                object2 = this.a;
                                Intrinsics.checkNotNull(object2);
                                object2 = object2.getResources();
                                object4 = "jio_in_feed_mediation";
                                Object object5 = this.a;
                                object5 = object5 != null ? object5.getPackageName() : null;
                                n3 = object2.getIdentifier((String)object4, string3, (String)object5);
                                object = object.inflate(n3, null);
                            } else {
                                object2 = this.a;
                                Intrinsics.checkNotNull(object2);
                                object2 = object2.getResources();
                                object4 = "jio_mediation_content_stream";
                                Object object6 = this.a;
                                object6 = object6 != null ? object6.getPackageName() : null;
                                n3 = object2.getIdentifier((String)object4, string3, (String)object6);
                                object = object.inflate(n3, null);
                            }
                            object2 = object;
                        }
                        Intrinsics.checkNotNull(object2, (String)object3);
                        object2 = (NativeAdView)((Object)object2);
                        object = "NativeTitle";
                        object = object2.findViewWithTag(object);
                        object = (TextView)object;
                        if (object != null) {
                            ((NativeAdView)((Object)object2)).setHeadlineView((View)object);
                            object3 = this.c;
                            if (object3 != null) {
                                object3 = ((NativeAd)object3).getHeadline();
                            } else {
                                bl2 = false;
                                object3 = null;
                                f5 = 0.0f;
                            }
                            object.setText((CharSequence)object3);
                        }
                        object = "NativeDescription";
                        object = object2.findViewWithTag(object);
                        if ((object = (TextView)object) != null) {
                            object3 = object.toString();
                            object2.setContentDescription((CharSequence)object3);
                            object3 = this.c;
                            if (object3 != null) {
                                object3 = ((NativeAd)object3).getBody();
                            } else {
                                bl2 = false;
                                object3 = null;
                                f5 = 0.0f;
                            }
                            object.setText((CharSequence)object3);
                        }
                        object = "NativeIconLayout";
                        object = object2.findViewWithTag(object);
                        if ((object = (ImageView)object) != null) {
                            ((NativeAdView)((Object)object2)).setIconView((View)object);
                            object3 = this.c;
                            if (object3 != null && (object3 = ((NativeAd)object3).getIcon()) != null) {
                                object3 = ((NativeAd$Image)object3).getDrawable();
                            } else {
                                bl2 = false;
                                object3 = null;
                                f5 = 0.0f;
                            }
                            object.setImageDrawable((Drawable)object3);
                        }
                        object = "NativeMediaLayout";
                        object = object2.findViewWithTag(object);
                        if ((object = (MediaView)((Object)object)) != null) {
                            ((NativeAdView)((Object)object2)).setMediaView((MediaView)((Object)object));
                            object3 = this.c;
                            if (object3 != null) {
                                object3 = ((NativeAd)object3).getMediaContent();
                            } else {
                                bl2 = false;
                                object3 = null;
                                f5 = 0.0f;
                            }
                            ((MediaView)((Object)object)).setMediaContent((MediaContent)object3);
                        }
                        object = "NativeCTA";
                        object = object2.findViewWithTag(object);
                        if ((object = (Button)object) != null) {
                            ((NativeAdView)((Object)object2)).setCallToActionView((View)object);
                            object3 = this.c;
                            if (object3 != null) {
                                object3 = ((NativeAd)object3).getCallToAction();
                            } else {
                                bl2 = false;
                                object3 = null;
                                f5 = 0.0f;
                            }
                            object.setText((CharSequence)object3);
                        }
                        object = "NativeAdchoice";
                        object = object2.findViewWithTag(object);
                        if ((object = (AdChoicesView)((Object)object)) != null) {
                            ((NativeAdView)((Object)object2)).setAdChoicesView((AdChoicesView)((Object)object));
                        }
                        object = "AdSource";
                        object = object2.findViewWithTag(object);
                        if ((object = (TextView)object) != null) {
                            ((NativeAdView)((Object)object2)).setAdvertiserView((View)object);
                            object3 = this.c;
                            if (object3 != null) {
                                object3 = ((NativeAd)object3).getAdvertiser();
                            } else {
                                bl2 = false;
                                object3 = null;
                                f5 = 0.0f;
                            }
                            object.setText((CharSequence)object3);
                        }
                        object = "Price";
                        object = object2.findViewWithTag(object);
                        if ((object = (TextView)object) != null) {
                            ((NativeAdView)((Object)object2)).setPriceView((View)object);
                            object3 = this.c;
                            if (object3 != null) {
                                object3 = ((NativeAd)object3).getPrice();
                            } else {
                                bl2 = false;
                                object3 = null;
                                f5 = 0.0f;
                            }
                            object.setText((CharSequence)object3);
                        }
                        object = "Rating";
                        object = object2.findViewWithTag(object);
                        if ((object = (RatingBar)object) != null) {
                            ((NativeAdView)((Object)object2)).setStarRatingView((View)object);
                            object3 = this.c;
                            if (object3 == null || (object3 = ((NativeAd)object3).getStarRating()) == null) {
                                bl2 = false;
                                f5 = 0.0f;
                                object3 = null;
                                object3 = 0;
                            }
                            f5 = ((Number)object3).floatValue();
                            object.setRating(f5);
                        }
                        object = "JioSponsored";
                        object = object2.findViewWithTag(object);
                        if ((object = (TextView)object) == null) break block35;
                        ((NativeAdView)((Object)object2)).setStoreView((View)object);
                        object3 = this.c;
                        if (object3 != null) {
                            string2 = ((NativeAd)object3).getStore();
                        }
                        object.setText((CharSequence)string2);
                    }
                    catch (Exception exception2) {}
                }
                if (!(bl2 = (object = object2.getParent()) instanceof ViewGroup)) break block36;
                object = (ViewGroup)object;
                object.removeView((View)object2);
                break block37;
            }
            object = this.c;
            Intrinsics.checkNotNull(object);
            ((NativeAdView)((Object)object2)).setNativeAd((NativeAd)object);
            viewGroup.addView((View)object2);
            return;
        }
        object = "handleImpressions Admob Exception : ";
        LO1.b((String)object, exception2);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        JioAds$LogLevel jioAds$LogLevel = JioAds$LogLevel.NONE;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void loadAd(JioAdView var1_1, JioMediationListener var2_2, Map var3_3, Map var4_4) {
        block89: {
            block88: {
                block87: {
                    block86: {
                        block84: {
                            block85: {
                                block83: {
                                    block82: {
                                        block81: {
                                            block80: {
                                                block79: {
                                                    block78: {
                                                        var5_5 = this;
                                                        var6_6 = var1_1;
                                                        var7_7 = var2_2;
                                                        var8_8 = var3_3;
                                                        var9_9 = var4_4;
                                                        var10_10 = "jioAdPartner";
                                                        var11_11 = "adunitid";
                                                        var12_12 /* !! */  = "appid";
                                                        var13_13 = "admobAdChoicePlacement";
                                                        var14_14 = "isMutedNonFullscreen";
                                                        var15_15 /* !! */  = "keyword";
                                                        var16_16 = "adview";
                                                        var17_17 = "customContainer";
                                                        var18_18 = "message";
                                                        var19_19 = "AdMob adUnitId: ";
                                                        var20_20 = "build(...)";
                                                        Intrinsics.checkNotNullParameter(var1_1, "jioAdView");
                                                        Intrinsics.checkNotNullParameter(var2_2, "jioCustomAdListener");
                                                        Intrinsics.checkNotNullParameter(var3_3, "localExtras");
                                                        Intrinsics.checkNotNullParameter(var4_4, "serverExtras");
                                                        var21_21 = "calling Native GMA LoadAd()";
                                                        Intrinsics.checkNotNullParameter(var21_21, var18_18);
                                                        var21_21 = JioAds.Companion;
                                                        var22_22 /* !! */  = var21_21.getInstance();
                                                        var22_22 /* !! */ .getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                        var22_22 /* !! */  = JioAds$LogLevel.NONE;
                                                        var6_6 = var1_1.getContext();
                                                        this.a = var6_6;
                                                        this.b = var2_2;
                                                        var6_6 = new AdRequest$Builder();
                                                        var23_23 = var3_3.containsKey(var16_16);
                                                        if (!var23_23) break block78;
                                                        var16_16 = var3_3.get(var16_16);
                                                        var16_16 = (JioAdView)var16_16;
                                                        this.f = var16_16;
                                                    }
                                                    var24_24 = var8_8.containsKey(var15_15 /* !! */ );
                                                    if (!var24_24) break block79;
                                                    var15_15 /* !! */  = var8_8.get(var15_15 /* !! */ );
                                                    var15_15 /* !! */  = String.valueOf(var15_15 /* !! */ );
                                                    var6_6.addKeyword(var15_15 /* !! */ );
                                                }
                                                var25_25 = var8_8.containsKey(var14_14);
                                                if (!var25_25) break block80;
                                                var14_14 = var8_8.get(var14_14);
                                                var15_15 /* !! */  = "null cannot be cast to non-null type kotlin.Boolean";
                                                Intrinsics.checkNotNull(var14_14, var15_15 /* !! */ );
                                                var14_14 = (Boolean)var14_14;
                                                var26_26 = var14_14.booleanValue();
                                                var5_5.d = var26_26;
                                            }
                                            var26_26 = var8_8.containsKey(var13_13);
                                            if (!var26_26) break block81;
                                            var13_13 = var8_8.get(var13_13);
                                            var14_14 = "null cannot be cast to non-null type kotlin.Int";
                                            Intrinsics.checkNotNull(var13_13, (String)var14_14);
                                            var13_13 = (Integer)var13_13;
                                            var27_27 = var13_13.intValue();
                                            var5_5.e = var27_27;
                                        }
                                        var27_27 = var8_8.containsKey(var12_12 /* !! */ );
                                        if (var27_27 == 0) break block82;
                                        var12_12 /* !! */  = var8_8.get(var12_12 /* !! */ );
                                        String.valueOf(var12_12 /* !! */ );
                                    }
                                    var28_28 = var8_8.containsKey(var17_17);
                                    if (!var28_28) break block83;
                                    var12_12 /* !! */  = var8_8.get(var17_17);
                                    var28_28 = var12_12 /* !! */  instanceof NativeAdView;
                                    if (var28_28) {
                                        var12_12 /* !! */  = var8_8.get(var17_17);
                                        var13_13 = "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView";
                                        Intrinsics.checkNotNull(var12_12 /* !! */ , (String)var13_13);
                                        var12_12 /* !! */  = (NativeAdView)var12_12 /* !! */ ;
                                        var5_5.g = var12_12 /* !! */ ;
                                    }
                                }
                                var28_28 = var9_9.containsKey(var11_11);
                                if (!var28_28) ** GOTO lbl230
                                var9_9 = var9_9.get(var11_11);
                                var9_9 = String.valueOf(var9_9);
                                var29_29 = var8_8.containsKey(var10_10);
                                if (var29_29 == 0) break block84;
                                var8_8 = var8_8.get(var10_10);
                                var8_8 = (JioAdPartner)var8_8;
                                var10_10 = "ca-mb-app-pub";
                                var29_29 = 0;
                                var11_11 = null;
                                var30_30 = kotlin.text.b.s((String)var9_9, (String)var10_10, false);
                                if (!var30_30) break block85;
                                var10_10 = "JioAdPartnerName Adx";
                                Intrinsics.checkNotNullParameter(var10_10, var18_18);
                                var10_10 = var21_21.getInstance();
                                var10_10.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                Intrinsics.checkNotNull(var8_8);
                                var10_10 = "Adx";
                                var8_8.setPartnerName((String)var10_10);
                                break block84;
                            }
                            var10_10 = "JioAdPartnerName AdMob";
                            Intrinsics.checkNotNullParameter(var10_10, var18_18);
                            var10_10 = var21_21.getInstance();
                            var10_10.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                            Intrinsics.checkNotNull(var8_8);
                            var10_10 = "AdMob";
                            var8_8.setPartnerName((String)var10_10);
                        }
                        var8_8 = var19_19.concat((String)var9_9);
                        Intrinsics.checkNotNullParameter(var8_8, var18_18);
                        var8_8 = var21_21.getInstance();
                        var8_8.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        var8_8 = var1_1.getContext();
                        if (var8_8 == null) break block86;
                        MobileAds.initialize((Context)var8_8);
                    }
                    var8_8 = new VideoOptions$Builder();
                    var30_30 = var5_5.d;
                    var8_8 = var8_8.setStartMuted(var30_30);
                    var30_30 = true;
                    var8_8 = var8_8.setClickToExpandRequested(var30_30);
                    var8_8 = var8_8.build();
                    var10_10 = var20_20;
                    Intrinsics.checkNotNullExpressionValue(var8_8, var20_20);
                    var11_11 = new NativeAdOptions$Builder();
                    var8_8 = var11_11.setVideoOptions((VideoOptions)var8_8);
                    var29_29 = var5_5.e;
                    var8_8 = var8_8.setAdChoicesPlacement(var29_29);
                    var8_8 = var8_8.build();
                    Intrinsics.checkNotNullExpressionValue(var8_8, var20_20);
                    var10_10 = var1_1.getContext();
                    if (var10_10 == null) break block87;
                    var11_11 = new AdLoader$Builder((Context)var10_10, (String)var9_9);
                    var10_10 = var1_1;
                    var9_9 = new u01_0(var5_5, var7_7, var1_1);
                    var9_9 = var11_11.forNativeAd((NativeAd$OnNativeAdLoadedListener)var9_9);
                    var10_10 = new GooglePlayServicesNative$loadAd$adLoader$1$2(var7_7, var5_5);
                    var9_9 = var9_9.withAdListener((AdListener)var10_10);
                    var8_8 = var9_9.withNativeAdOptions((NativeAdOptions)var8_8);
                    var8_8 = var8_8.build();
                    break block88;
                }
                var8_8 = null;
            }
            var9_9 = "calling GooglePlayServicesNative loadAd()";
            Intrinsics.checkNotNullParameter(var9_9, var18_18);
            var9_9 = var21_21.getInstance();
            var9_9.getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            if (var8_8 == null) break block89;
            var6_6 = var6_6.build();
            var8_8.loadAd((AdRequest)var6_6);
            break block89;
lbl230:
            // 1 sources

            var6_6 = JioAdError$JioAdErrorType.ERROR_MANDATORY_PARAM_MISSING;
            var6_6 = var6_6.getErrorCode();
            var8_8 = "GooglePlayServicesNative Mandatory parameters missing";
            try {
                var7_7.onAdFailed((String)var6_6, (String)var8_8);
                return;
            }
            catch (Exception v0) {
                Intrinsics.checkNotNullParameter("eroror GooglePlayServicesNative loadAd()", var18_18);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                var6_6 = JioAds$LogLevel.NONE;
                var6_6 = JioAdError$JioAdErrorType.ERROR_IN_MEDIATION.getErrorCode();
                var8_8 = "Error while loading mediation ad";
                var7_7.onAdFailed((String)var6_6, (String)var8_8);
            }
        }
    }

    public final void onDestroy() {
        NativeAd nativeAd = this.c;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.c = null;
    }

    public void onInvalidate() {
        this.b = null;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public void showAd() {
    }
}

