/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.data;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import kotlin.jvm.internal.Intrinsics;

public final class Product {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public Product(String object, int n3, String string2, String string3, String string4, String string5) {
        String string6 = "productId";
        this.a = object = Product.a(object, string6);
        if (n3 < 0) {
            string6 = "message";
            Intrinsics.checkNotNullParameter("Argument price must be greater than or equal to zero", string6);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
        }
        this.b = n3;
        this.c = object = Product.a(string2, "segment");
        this.d = object = Product.a(string3, "vertical");
        this.e = object = Product.a(string4, "brickname");
        this.f = object = Product.a(string5, "skuName");
    }

    public static String a(String object, String string2) {
        String string3 = "";
        String string4 = "message";
        String string5 = "Argument ";
        if (object == null) {
            object = new StringBuilder(string5);
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(" must not be null");
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return string3;
        }
        int n3 = object.length();
        if (n3 == 0) {
            object = new StringBuilder(string5);
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(" must be string of length greater than 0");
            Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return string3;
        }
        return object;
    }
}

