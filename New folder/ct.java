/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.h;
import com.facebook.appevents.i;
import com.facebook.appevents.i$a;
import com.facebook.j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class ct {
    public static final ct a;
    public static final h b;

    static {
        Object object = new ct();
        a = object;
        Context context = FacebookSdk.a();
        b = object = new h(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Bundle a(ArrayList object) {
        Class<ct> clazz = ct.class;
        synchronized (clazz) {
            Object object2 = "purchaseLoggingParametersList";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = null;
            object = object.get(0);
            object = (ct$a)object;
            String string2 = "fb_mobile_purchase";
            BigDecimal bigDecimal = ((ct$a)object).a;
            double d2 = bigDecimal.doubleValue();
            Currency currency = ((ct$a)object).b;
            object2 = new rf1_1(string2, d2, currency);
            object2 = kotlin.collections.a.b(object2);
            long l2 = System.currentTimeMillis();
            currency = ((ct$a)object).c;
            object = ((ct$a)object).d;
            Pair pair = new Pair(currency, object);
            object = kotlin.collections.a.b(pair);
            boolean bl2 = true;
            return lg1_0.c((List)object2, l2, bl2, (List)object);
        }
    }

    public static ct$a b(String object, Bundle bundle, i i3, JSONObject object2, JSONObject object3) {
        String string2 = ng1$b.SUBS.getType();
        boolean bl2 = Intrinsics.areEqual(object, string2);
        if (bl2) {
            object = i.b;
            object = Q92.IAPParameters;
            object2 = Boolean.toString(object2.optBoolean("autoRenewing", false));
            Intrinsics.checkNotNullExpressionValue(object2, "toString(\n              \u2026      )\n                )");
            i$a.a((Q92)((Object)object), "fb_iap_subs_auto_renewing", (String)object2, bundle, i3);
            object2 = object3.optString("subscriptionPeriod");
            Intrinsics.checkNotNullExpressionValue(object2, "skuDetailsJSON.optString\u2026_IAP_SUBSCRIPTION_PERIOD)");
            i$a.a((Q92)((Object)object), "fb_iap_subs_period", (String)object2, bundle, i3);
            object2 = object3.optString("freeTrialPeriod");
            Intrinsics.checkNotNullExpressionValue(object2, "skuDetailsJSON.optString\u2026GP_IAP_FREE_TRIAL_PERIOD)");
            i$a.a((Q92)((Object)object), "fb_free_trial_period", (String)object2, bundle, i3);
            object2 = "introductoryPriceCycles";
            string2 = object3.optString((String)object2);
            Intrinsics.checkNotNullExpressionValue(string2, (String)object2);
            int n3 = string2.length();
            if (n3 > 0) {
                object2 = "fb_intro_price_cycles";
                i$a.a((Q92)((Object)object), (String)object2, string2, bundle, i3);
            }
            object2 = "introductoryPricePeriod";
            string2 = object3.optString((String)object2);
            Intrinsics.checkNotNullExpressionValue(string2, (String)object2);
            n3 = string2.length();
            if (n3 > 0) {
                object2 = "fb_intro_period";
                i$a.a((Q92)((Object)object), (String)object2, string2, bundle, i3);
            }
            object2 = "introductoryPriceAmountMicros";
            string2 = object3.optString((String)object2);
            Intrinsics.checkNotNullExpressionValue(string2, (String)object2);
            n3 = string2.length();
            if (n3 > 0) {
                object2 = "fb_intro_price_amount_micros";
                i$a.a((Q92)((Object)object), (String)object2, string2, bundle, i3);
            }
        }
        double d2 = (double)object3.getLong("price_amount_micros") / 1000000.0;
        object2 = new BigDecimal(d2);
        object3 = Currency.getInstance(object3.getString("price_currency_code"));
        Intrinsics.checkNotNullExpressionValue(object3, "getInstance(skuDetailsJS\u2026RICE_CURRENCY_CODE_V2V4))");
        object = new ct$a((BigDecimal)object2, (Currency)object3, bundle, i3);
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ArrayList c(String var0, Bundle var1_1, i var2_2, JSONObject var3_3) {
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 /* !! */  = var3_3;
        var8_8 = ng1$b.SUBS.getType();
        var9_9 = var0;
        var10_10 = Intrinsics.areEqual(var0, var8_8);
        var9_9 = "priceCurrencyCode";
        var11_11 = "priceAmountMicros";
        var12_12 = 0;
        var13_13 /* !! */  = null;
        if (var10_10) {
            var8_8 = new ArrayList();
            var14_14 = "subscriptionOfferDetails";
            var15_15 = var3_3.getJSONArray(var14_14);
            if (var15_15 == null) {
                return null;
            }
            var16_16 = var15_15.length();
            for (var7_7 = 0; var7_7 < var16_16; var7_7 += var35_33) {
                var17_17 /* !! */  = var6_6 /* !! */ .getJSONArray(var14_14).getJSONObject(var7_7);
                if (var17_17 /* !! */  == null) {
                    return null;
                }
                var18_18 = new Bundle((Bundle)var4_4);
                var19_19 = new i();
                var20_20 = var5_5.a;
                var21_21 /* !! */  = var20_20.keySet().iterator();
                block1: while (var22_22 = var21_21 /* !! */ .hasNext()) {
                    var23_23 = var21_21 /* !! */ .next();
                    var13_13 /* !! */  = (Q92)var23_23;
                    var13_13 /* !! */  = (Q92)var23_23;
                    var24_24 = var23_23 = var20_20.get((Object)var13_13 /* !! */ );
                    var24_24 = (Map)var23_23;
                    if (var24_24 == null) {
                        while (true) {
                            var12_12 = 0;
                            var13_13 /* !! */  = null;
                            continue block1;
                            break;
                        }
                    }
                    var23_23 = var24_24.keySet().iterator();
                    block3: while (true) {
                        if (!(var25_26 = var23_23.hasNext())) ** continue;
                        var26_27 /* !! */  = var23_23.next();
                        var27_28 = var20_20;
                        var20_20 = var26_27 /* !! */ ;
                        var20_20 = (String)var26_27 /* !! */ ;
                        var26_27 /* !! */  = var21_21 /* !! */ ;
                        var21_21 /* !! */  = var24_24.get(var20_20);
                        if (var21_21 /* !! */  != null) break;
lbl47:
                        // 2 sources

                        while (true) {
                            var21_21 /* !! */  = var26_27 /* !! */ ;
                            var20_20 = var27_28;
                            continue block3;
                            break;
                        }
                        break;
                    }
                    var19_19.a(var13_13 /* !! */ , (String)var20_20, var21_21 /* !! */ );
                    ** continue;
                }
                var24_24 = "basePlanId";
                var20_20 = var17_17 /* !! */ .getString((String)var24_24);
                var21_21 /* !! */  = i.b;
                var21_21 /* !! */  = Q92.IAPParameters;
                Intrinsics.checkNotNullExpressionValue(var20_20, (String)var24_24);
                i$a.a((Q92)var21_21 /* !! */ , "fb_iap_base_plan", (String)var20_20, var18_18, var19_19);
                var24_24 = var17_17 /* !! */ .getJSONArray("pricingPhases");
                var28_29 = var24_24.length();
                var12_12 = 1;
                var24_24 = var24_24.getJSONObject(var28_29 -= var12_12);
                if (var24_24 == null) {
                    return null;
                }
                var20_20 = var24_24.optString("billingPeriod");
                Intrinsics.checkNotNullExpressionValue(var20_20, "subscriptionJSON.optStri\u2026IOD\n                    )");
                var13_13 /* !! */  = "fb_iap_subs_period";
                i$a.a((Q92)var21_21 /* !! */ , (String)var13_13 /* !! */ , (String)var20_20, var18_18, var19_19);
                var20_20 = "recurrenceMode";
                var12_12 = (int)var24_24.has((String)var20_20);
                var17_17 /* !! */  = "fb_iap_subs_auto_renewing";
                if (var12_12 != 0 && (var28_29 = var24_24.getInt((String)var20_20)) != (var12_12 = 3)) {
                    var20_20 = "true";
                    i$a.a((Q92)var21_21 /* !! */ , (String)var17_17 /* !! */ , (String)var20_20, var18_18, var19_19);
                } else {
                    var20_20 = "false";
                    i$a.a((Q92)var21_21 /* !! */ , (String)var17_17 /* !! */ , (String)var20_20, var18_18, var19_19);
                }
                var17_17 /* !! */  = var14_14;
                var29_30 = var24_24.getLong(var11_11);
                var31_31 = var29_30;
                var33_32 = 1000000.0;
                var21_21 /* !! */  = new BigDecimal(var31_31 /= var33_32);
                var24_24 = Currency.getInstance(var24_24.getString(var9_9));
                Intrinsics.checkNotNullExpressionValue(var24_24, "getInstance(subscription\u2026RICE_CURRENCY_CODE_V5V7))");
                var20_20 = new ct$a((BigDecimal)var21_21 /* !! */ , (Currency)var24_24, var18_18, var19_19);
                var8_8.add(var20_20);
                var35_33 = 1;
                var12_12 = 0;
                var13_13 /* !! */  = null;
            }
            return var8_8;
        }
        var24_25 = "oneTimePurchaseOfferDetails";
        var6_6 /* !! */  = var3_3.getJSONObject((String)var24_25);
        if (var6_6 /* !! */  == null) {
            return null;
        }
        var36_34 = (double)var6_6 /* !! */ .getLong(var11_11) / 1000000.0;
        var8_8 = new BigDecimal(var36_34);
        var6_6 /* !! */  = Currency.getInstance(var6_6 /* !! */ .getString(var9_9));
        Intrinsics.checkNotNullExpressionValue(var6_6 /* !! */ , "getInstance(oneTimePurch\u2026RICE_CURRENCY_CODE_V5V7))");
        var24_25 = new ct$a((BigDecimal)var8_8, (Currency)var6_6 /* !! */ , (Bundle)var1_1, var2_2);
        var4_4 = new ct$a[]{var24_25};
        return xx_2.j(var4_4);
    }

    public static final boolean d() {
        boolean bl2;
        boolean bl3;
        al0_2 al0_22 = dl0_2.b(FacebookSdk.b());
        if (al0_22 != null && (bl3 = j.c()) && (bl2 = al0_22.i)) {
            bl2 = true;
        } else {
            bl2 = false;
            al0_22 = null;
        }
        return bl2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void e(String var0, String var1_1, boolean var2_2, ng1$a var3_3, boolean var4_4) {
        block47: {
            block42: {
                block43: {
                    var5_5 /* !! */  = var0;
                    var6_11 = var1_1;
                    var7_12 = false;
                    var8_13 = null;
                    var9_14 = 1;
                    Intrinsics.checkNotNullParameter(var0, "purchase");
                    var10_15 /* !! */  = "skuDetails";
                    Intrinsics.checkNotNullParameter(var1_1, (String)var10_15 /* !! */ );
                    var11_16 = ct.d();
                    if (!var11_16) {
                        return;
                    }
                    ct.a.getClass();
                    var10_15 /* !! */  = new HashMap();
                    var12_17 /* !! */  = "type";
                    var13_18 = false;
                    var14_19 /* !! */  = null;
                    try {
                        var15_20 = new JSONObject(var0);
                        var16_21 /* !! */  = new JSONObject(var1_1);
                        var17_22 = new Bundle(var9_14);
                        var18_23 = new i();
                        if (var3_3 != null) {
                            var5_5 /* !! */  = Q92.IAPParameters;
                            var19_24 = "fb_iap_sdk_supported_library_versions";
                            var20_25 /* !! */  = var3_3.getType();
                            i$a.a((Q92)var5_5 /* !! */ , (String)var19_24, (String)var20_25 /* !! */ , (Bundle)var17_22, (i)var18_23);
                        }
                    }
                    catch (Exception | JSONException v0) {
                        return;
                    }
                    {
                        block38: {
                            var5_5 /* !! */  = Q92.IAPParameters;
                            var19_24 = "fb_iap_product_id";
                            var20_25 /* !! */  = "productId";
                            var20_25 /* !! */  = var15_20.getString((String)var20_25 /* !! */ );
                            var21_26 = "purchaseJSON.getString(C\u2026stants.GP_IAP_PRODUCT_ID)";
                            Intrinsics.checkNotNullExpressionValue(var20_25 /* !! */ , (String)var21_26);
                            i$a.a((Q92)var5_5 /* !! */ , (String)var19_24, (String)var20_25 /* !! */ , (Bundle)var17_22, (i)var18_23);
                            var19_24 = "fb_iap_purchase_time";
                            var20_25 /* !! */  = "purchaseTime";
                            var20_25 /* !! */  = var15_20.getString((String)var20_25 /* !! */ );
                            var21_26 = "purchaseJSON.getString(C\u2026nts.GP_IAP_PURCHASE_TIME)";
                            Intrinsics.checkNotNullExpressionValue(var20_25 /* !! */ , (String)var21_26);
                            i$a.a((Q92)var5_5 /* !! */ , (String)var19_24, (String)var20_25 /* !! */ , (Bundle)var17_22, (i)var18_23);
                            var19_24 = "fb_iap_purchase_token";
                            var20_25 /* !! */  = "purchaseToken";
                            var20_25 /* !! */  = var15_20.getString((String)var20_25 /* !! */ );
                            var21_26 = "purchaseJSON.getString(C\u2026ts.GP_IAP_PURCHASE_TOKEN)";
                            Intrinsics.checkNotNullExpressionValue(var20_25 /* !! */ , (String)var21_26);
                            i$a.a((Q92)var5_5 /* !! */ , (String)var19_24, (String)var20_25 /* !! */ , (Bundle)var17_22, (i)var18_23);
                            var19_24 = "fb_iap_package_name";
                            var20_25 /* !! */  = "packageName";
                            var20_25 /* !! */  = var15_20.optString((String)var20_25 /* !! */ );
                            var21_26 = "purchaseJSON.optString(C\u2026ants.GP_IAP_PACKAGE_NAME)";
                            Intrinsics.checkNotNullExpressionValue(var20_25 /* !! */ , (String)var21_26);
                            i$a.a((Q92)var5_5 /* !! */ , (String)var19_24, (String)var20_25 /* !! */ , (Bundle)var17_22, (i)var18_23);
                            var19_24 = "fb_iap_product_title";
                            var20_25 /* !! */  = "title";
                            var20_25 /* !! */  = var16_21 /* !! */ .optString((String)var20_25 /* !! */ );
                            var21_26 = "skuDetailsJSON.optString(Constants.GP_IAP_TITLE)";
                            Intrinsics.checkNotNullExpressionValue(var20_25 /* !! */ , (String)var21_26);
                            i$a.a((Q92)var5_5 /* !! */ , (String)var19_24, (String)var20_25 /* !! */ , (Bundle)var17_22, (i)var18_23);
                            var19_24 = "fb_iap_product_description";
                            var20_25 /* !! */  = "description";
                            var20_25 /* !! */  = var16_21 /* !! */ .optString((String)var20_25 /* !! */ );
                            var21_26 = "skuDetailsJSON.optString\u2026tants.GP_IAP_DESCRIPTION)";
                            Intrinsics.checkNotNullExpressionValue(var20_25 /* !! */ , (String)var21_26);
                            i$a.a((Q92)var5_5 /* !! */ , (String)var19_24, (String)var20_25 /* !! */ , (Bundle)var17_22, (i)var18_23);
                            var19_24 = var16_21 /* !! */ .optString((String)var12_17 /* !! */ );
                            var20_25 /* !! */  = "fb_iap_product_type";
                            Intrinsics.checkNotNullExpressionValue(var19_24, (String)var12_17 /* !! */ );
                            i$a.a((Q92)var5_5 /* !! */ , (String)var20_25 /* !! */ , (String)var19_24, (Bundle)var17_22, (i)var18_23);
                            var5_5 /* !! */  = lg1_0.a;
                            var12_17 /* !! */  = lg1_0.class;
                            var22_27 = (int)td0.b(var12_17 /* !! */ );
                            if (var22_27 != 0) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var22_27 = 0;
                                    var5_5 /* !! */  = null;
                                    break block38;
                                    break;
                                }
                            }
                            try {
                                var5_5 /* !! */  = lg1_0.d;
                            }
                            catch (Throwable var5_6) {
                                var20_25 /* !! */  = var5_6;
                                td0.a(var12_17 /* !! */ , var5_6);
                                ** continue;
                            }
                        }
                        if (var5_5 /* !! */  != null) {
                            var12_17 /* !! */  = i.b;
                            var12_17 /* !! */  = Q92.IAPParameters;
                            var20_25 /* !! */  = "fb_iap_client_library_version";
                            i$a.a((Q92)var12_17 /* !! */ , (String)var20_25 /* !! */ , var5_5 /* !! */ , (Bundle)var17_22, (i)var18_23);
                        }
                        var5_5 /* !! */  = var10_15 /* !! */ .entrySet();
                        var5_5 /* !! */  = var5_5 /* !! */ .iterator();
                        while (var11_16 = var5_5 /* !! */ .hasNext()) {
                            var10_15 /* !! */  = var5_5 /* !! */ .next();
                            var10_15 /* !! */  = (Map.Entry)var10_15 /* !! */ ;
                            var12_17 /* !! */  = var10_15 /* !! */ .getKey();
                            var12_17 /* !! */  = (String)var12_17 /* !! */ ;
                            var10_15 /* !! */  = var10_15 /* !! */ .getValue();
                            var10_15 /* !! */  = (String)var10_15 /* !! */ ;
                            var20_25 /* !! */  = i.b;
                            var20_25 /* !! */  = Q92.IAPParameters;
                            i$a.a((Q92)var20_25 /* !! */ , (String)var12_17 /* !! */ , (String)var10_15 /* !! */ , (Bundle)var17_22, (i)var18_23);
                        }
                        var5_5 /* !! */  = "price_amount_micros";
                        var22_27 = (int)var16_21 /* !! */ .has(var5_5 /* !! */ );
                        if (var22_27 != 0) {
                            var5_5 /* !! */  = ct.b((String)var19_24, (Bundle)var17_22, (i)var18_23, (JSONObject)var15_20, var16_21 /* !! */ );
                            var10_15 /* !! */  = new ct$a[var9_14];
                            var10_15 /* !! */ [0] = var5_5 /* !! */ ;
                            var5_5 /* !! */  = xx_2.j(var10_15 /* !! */ );
                        } else {
                            var5_5 /* !! */  = "subscriptionOfferDetails";
                            var22_27 = (int)var16_21 /* !! */ .has(var5_5 /* !! */ );
                            if (var22_27 == 0) {
                                var5_5 /* !! */  = "oneTimePurchaseOfferDetails";
                                var22_27 = (int)var16_21 /* !! */ .has(var5_5 /* !! */ );
                                if (var22_27 == 0) return;
                            }
                            var5_5 /* !! */  = ct.c((String)var19_24, (Bundle)var17_22, (i)var18_23, var16_21 /* !! */ );
                        }
                        var10_15 /* !! */  = var5_5 /* !! */ ;
                    }
                    if (var10_15 /* !! */  == null) {
                        return;
                    }
                    var22_27 = var10_15 /* !! */ .isEmpty();
                    if (var22_27 != 0) {
                        return;
                    }
                    if (!var2_2 || (var22_27 = zk0_1.b(var5_5 /* !! */  = "app_events_if_auto_log_subs", (String)(var12_17 /* !! */  = FacebookSdk.b()), false)) == 0) break block42;
                    if (!var4_4) break block43;
                    var5_5 /* !! */  = "SubscriptionRestore";
lbl131:
                    // 5 sources

                    while (true) {
                        var16_21 /* !! */  = var5_5 /* !! */ ;
                        if (!var2_2) ** GOTO lbl198
                        ** GOTO lbl155
                        break;
                    }
                }
                var12_17 /* !! */  = jg1_1.a;
                var12_17 /* !! */ .getClass();
                var22_27 = td0.b(var12_17 /* !! */ );
                if (var22_27 != 0) ** GOTO lbl151
                var5_5 /* !! */  = "skuDetail";
                try {
                    block46: {
                        block44: {
                            block39: {
                                Intrinsics.checkNotNullParameter(var1_1, var5_5 /* !! */ );
                                var5_5 /* !! */  = new JSONObject(var1_1);
                                var6_11 = "freeTrialPeriod";
                                var5_5 /* !! */  = var5_5 /* !! */ .optString((String)var6_11);
                                if (var5_5 /* !! */  == null || (var22_27 = var5_5 /* !! */ .length()) <= 0) break block39;
                                var5_5 /* !! */  = "StartTrial";
                                ** GOTO lbl131
                            }
lbl152:
                            // 2 sources

                            while (true) {
                                var5_5 /* !! */  = "Subscribe";
                                ** GOTO lbl131
                                break;
                            }
lbl155:
                            // 1 sources

                            var5_5 /* !! */  = kJ0$b.AndroidManualImplicitSubsDedupe;
                            var22_27 = kj0_0.b((kJ0$b)var5_5 /* !! */ );
                            if (var22_27 == 0) break block44;
                            var6_11 = ct.class;
                            synchronized (var6_11) {
                                block45: {
                                    var5_5 /* !! */  = "purchaseLoggingParametersList";
                                    try {
                                        Intrinsics.checkNotNullParameter(var10_15 /* !! */ , var5_5 /* !! */ );
                                        var5_5 /* !! */  = "eventName";
                                        Intrinsics.checkNotNullParameter(var16_21 /* !! */ , var5_5 /* !! */ );
                                        var5_5 /* !! */  = new ArrayList();
                                        var12_17 /* !! */  = var10_15 /* !! */ .iterator();
                                        while (var13_18 = var12_17 /* !! */ .hasNext()) {
                                            var14_19 /* !! */  = var12_17 /* !! */ .next();
                                            var14_19 /* !! */  = (ct$a)var14_19 /* !! */ ;
                                            var17_22 = var14_19 /* !! */ .a;
                                            var23_28 = var17_22.doubleValue();
                                            var14_19 /* !! */  = var14_19 /* !! */ .b;
                                            var15_20 = new rf1_1((String)var16_21 /* !! */ , var23_28, (Currency)var14_19 /* !! */ );
                                            var5_5 /* !! */ .add(var15_20);
                                        }
                                    }
                                    catch (Throwable var5_8) {
                                        break block45;
                                    }
                                    var25_29 = System.currentTimeMillis();
                                    var27_30 = 10 != 0;
                                    var27_30 = yx_2.o(var10_15 /* !! */ , (int)var27_30);
                                    var15_20 = new ArrayList((int)var27_30);
                                    var17_22 = var10_15 /* !! */ .iterator();
                                    while (var28_31 = var17_22.hasNext()) {
                                        var18_23 = var17_22.next();
                                        var18_23 = (ct$a)var18_23;
                                        var20_25 /* !! */  = var18_23.c;
                                        var18_23 = var18_23.d;
                                        var19_24 = new Pair(var20_25 /* !! */ , var18_23);
                                        var15_20.add(var19_24);
                                    }
                                    var14_19 /* !! */  = lg1_0.c((List)var5_5 /* !! */ , var25_29, (boolean)var9_14, (List)var15_20);
                                    break block46;
                                }
                                throw var5_8;
                            }
                        }
                        if (!var2_2 && (var22_27 = kj0_0.b((kJ0$b)(var5_5 /* !! */  = kJ0$b.AndroidManualImplicitPurchaseDedupe))) != 0) {
                            var14_19 /* !! */  = ct.a(var10_15 /* !! */ );
                        }
                    }
                    var5_5 /* !! */  = ig1_2.a;
                    var5_5 /* !! */  = ((ct$a)var10_15 /* !! */ .get((int)0)).c;
                    var6_11 = ((ct$a)var10_15 /* !! */ .get((int)0)).d;
                    ig1_2.a(var14_19 /* !! */ , (Bundle)var5_5 /* !! */ , (i)var6_11);
                    var5_5 /* !! */  = "fb_mobile_purchase";
                    var22_27 = Intrinsics.areEqual(var16_21 /* !! */ , var5_5 /* !! */ );
                    if (var22_27 == 0) {
                        block41: {
                            var5_5 /* !! */  = ct.b;
                            var6_11 = ((ct$a)var10_15 /* !! */ .get((int)0)).a;
                            var29_32 = ((ct$a)var10_15 /* !! */ .get((int)0)).b;
                            var12_17 /* !! */  = ((ct$a)var10_15 /* !! */ .get((int)0)).c;
                            var21_26 = ((ct$a)var10_15 /* !! */ .get((int)0)).d;
                            var5_5 /* !! */ .getClass();
                            var8_13 = FacebookSdk.a;
                            var7_12 = j.c();
                            if (var7_12 == false) return;
                            var8_13 = var5_5 /* !! */ .a;
                            var8_13.getClass();
                            var22_27 = (int)td0.b(var8_13);
                            if (var22_27 != 0) {
                                return;
                            }
                            if (var6_11 != null && var29_32 != null) {
                                block40: {
                                    if (var12_17 /* !! */  == null) {
                                        try {
                                            var18_23 = var5_5 /* !! */  = new Bundle();
                                            break block40;
                                        }
                                        catch (Throwable var5_9) {
                                            break block41;
                                        }
                                    }
                                    var18_23 = var12_17 /* !! */ ;
                                }
                                var5_5 /* !! */  = "fb_currency";
                                var29_32 = var29_32.getCurrencyCode();
                                var18_23.putString(var5_5 /* !! */ , (String)var29_32);
                                var30_33 = var6_11.doubleValue();
                                var17_22 = var30_33;
                                var20_25 /* !! */  = v3.b();
                                var32_34 = true;
                                var15_20 = var8_13;
                                var8_13.f((String)var16_21 /* !! */ , (Double)var17_22, (Bundle)var18_23, var32_34, (UUID)var20_25 /* !! */ , (i)var21_26);
                                return;
                            }
                            var5_5 /* !! */  = lz3_0.a;
                            return;
                        }
                        td0.a(var8_13, var5_9);
                        return;
                    }
                    var5_5 /* !! */  = ct.b;
                    var14_19 /* !! */  = ((ct$a)var10_15 /* !! */ .get((int)0)).a;
                    var15_20 = ((ct$a)var10_15 /* !! */ .get((int)0)).b;
                    var16_21 /* !! */  = ((ct$a)var10_15 /* !! */ .get((int)0)).c;
                    var18_23 = ((ct$a)var10_15 /* !! */ .get((int)0)).d;
                    var5_5 /* !! */ .getClass();
                    var6_11 = FacebookSdk.a;
                    var33_35 = j.c();
                    if (var33_35 == false) return;
                    var6_11 = var5_5 /* !! */ .a;
                    var6_11.getClass();
                    var22_27 = (int)td0.b(var6_11);
                    if (var22_27 != 0) {
                        return;
                    }
                    var27_30 = true;
                    var12_17 /* !! */  = var6_11;
                    try {
                        var6_11.i((BigDecimal)var14_19 /* !! */ , (Currency)var15_20, (Bundle)var16_21 /* !! */ , var27_30, (i)var18_23);
                        return;
                    }
                    catch (Throwable var5_10) {
                        var8_13 = var5_10;
                        td0.a(var6_11, var5_10);
                    }
                    return;
                    catch (JSONException v1) {
                    }
                }
                catch (Throwable var5_7) {
                    td0.a(var12_17 /* !! */ , var5_7);
                }
                ** while (true)
            }
            if (!var4_4) break block47;
            var5_5 /* !! */  = "fb_mobile_purchase_restored";
            ** GOTO lbl131
        }
        var5_5 /* !! */  = "fb_mobile_purchase";
        ** while (true)
    }
}

