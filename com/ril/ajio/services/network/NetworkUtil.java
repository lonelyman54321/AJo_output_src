/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.ril.ajio.services.network;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONObject;

public final class NetworkUtil {
    public static final NetworkUtil INSTANCE;

    static {
        NetworkUtil networkUtil;
        INSTANCE = networkUtil = new NetworkUtil();
    }

    private NetworkUtil() {
    }

    private final JSONObject getExternalAdsHomeConfig(Context context) {
        z40_0.Companion.getClass();
        return z40$a.a((Context)context).a.d("external_ads_home_config");
    }

    private final JSONObject getJioBannerAdsHomepageJsonObj(Context context) {
        z40_0.Companion.getClass();
        return z40$a.a((Context)context).a.d("jioBannerAdsConfigForHomePage");
    }

    private final JSONObject getJioBannerAdsMiscpageJsonObj(Context context) {
        z40_0.Companion.getClass();
        return z40$a.a((Context)context).a.d("jioAdsConfigMisc");
    }

    public final double getExternalBannerAdsHomePageApiTimeoutInterval(Context context) {
        double d2;
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = this.getExternalAdsHomeConfig(context);
        String string2 = "apiTimeoutInterval";
        boolean bl2 = jSONObject.has(string2);
        if (bl2) {
            context = this.getExternalAdsHomeConfig(context);
            d2 = context.getDouble(string2);
        } else {
            d2 = 0.0;
        }
        return d2;
    }

    public final double getJioBannerAdsHomePageApiTimeoutInterval(Context context) {
        double d2;
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = this.getJioBannerAdsHomepageJsonObj(context);
        String string2 = "timeOutInterval";
        boolean bl2 = jSONObject.has(string2);
        if (bl2) {
            context = this.getJioBannerAdsHomepageJsonObj(context);
            d2 = context.getDouble(string2);
        } else {
            d2 = 0.0;
        }
        return d2;
    }

    public final double getJioBannerAdsMiscPageApiTimeoutInterval(Context context) {
        double d2;
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = this.getJioBannerAdsMiscpageJsonObj(context);
        String string2 = "timeOutInterval";
        boolean bl2 = jSONObject.has(string2);
        if (bl2) {
            context = this.getJioBannerAdsMiscpageJsonObj(context);
            d2 = context.getDouble(string2);
        } else {
            d2 = 0.0;
        }
        return d2;
    }

    public final boolean isPayNowReq(m41_0 object) {
        boolean bl2;
        String string2;
        boolean bl3;
        String string3;
        String string4 = "headers";
        Intrinsics.checkNotNullParameter(object, string4);
        int n3 = ((m41_0)object).size();
        boolean bl4 = false;
        if (n3 > 0 && (string3 = ((m41_0)object).a(string4 = "RequestId")) != null && ((bl3 = b.i(string3 = ((m41_0)object).a(string4), string2 = "PAYMENT_PayNowByNetBanking", false)) || (bl3 = b.i(string3 = ((m41_0)object).a(string4), string2 = "PAYMENT_PayNowByCard", false)) || (bl3 = b.i(string3 = ((m41_0)object).a(string4), string2 = "PAYMENT_PayNowByWallet", false)) || (bl3 = b.i(string3 = ((m41_0)object).a(string4), string2 = "PAYMENT_PayNowByIW", false)) || (bl3 = b.i(string3 = ((m41_0)object).a(string4), string2 = "PAYMENT_PayNowByUPI", false)) || (bl3 = b.i(string3 = ((m41_0)object).a(string4), string2 = "PAYMENT_PayNowByCOD", false)) || (bl2 = b.i((String)(object = ((m41_0)object).a(string4)), string4 = "PAYMENT_PayNowByEMI", false)))) {
            bl4 = true;
        }
        return bl4;
    }
}

