/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1wSDK;
import com.appsflyer.internal.AFf1ySDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFg1aSDK;
import com.appsflyer.internal.AFh1oSDK;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class AFg1bSDK
extends AFf1oSDK {
    private static final List component3 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private String AFInAppEventParameterName;
    private final AFd1rSDK copy;
    private Map copydefault;
    private final AFe1qSDK equals;
    private final AFd1qSDK hashCode;
    private final AFh1oSDK toString;

    public AFg1bSDK(AFd1kSDK object) {
        Object object2 = AFf1zSDK.copydefault;
        AFf1zSDK aFf1zSDK = AFf1zSDK.getRevenue;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{aFf1zSDK};
        super((AFf1zSDK)((Object)object2), aFf1zSDKArray, (AFd1kSDK)object, "GCD-FETCH");
        object2 = object.getCurrencyIso4217Code();
        this.equals = object2;
        object2 = object.getRevenue();
        this.copy = object2;
        object2 = object.component3();
        this.toString = object2;
        this.hashCode = object = object.getMediationNetwork();
        object = AFf1zSDK.getMonetizationNetwork;
        this.getCurrencyIso4217Code.add(object);
        object = AFf1zSDK.equals;
        this.getCurrencyIso4217Code.add(object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1cSDK AFAdRevenueData() {
        block26: {
            var1_1 /* !! */  = null;
            var2_4 = 1;
            var3_5 = "is_first_launch";
            var4_6 = "af_channel";
            var5_7 = "af_siteid";
            var6_8 = "[GCD-A03] Server retrieving attempt finished";
            var7_9 = this.component1;
            var8_10 = var7_9.getCurrencyIso4217Code();
            if (var8_10) {
                AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
                this.AFInAppEventParameterName = "'isStopTracking' enabled";
                var1_1 /* !! */  = new AFf1ySDK();
                throw var1_1 /* !! */ ;
            }
            var7_9 = AFe1cSDK.getMonetizationNetwork;
            var9_11 = 0;
            while (true) {
                block25: {
                    block24: {
                        block23: {
                            if (var9_11 > (var10_12 = 2)) {
                                return var7_9;
                            }
                            if (var9_11 >= var10_12) {
                                var8_10 = true;
                            } else {
                                var8_10 = false;
                                var7_9 = null;
                            }
                            var11_13 = this.toString;
                            var11_13.hashCode = var12_15 = System.currentTimeMillis();
                            try {
                                var11_13 = super.AFAdRevenueData();
                                var14_16 = this.component4;
                                if (var14_16 != null) break block23;
                            }
                            catch (Exception var11_14) {
                                break block24;
                            }
                            catch (AFf1wSDK var1_3) {
                                ** GOTO lbl147
                            }
                            while (true) {
                                var7_9 = this.toString;
                                var7_9.getCurrencyIso4217Code(var9_11);
                                AFLogger.afDebugLog(var6_8);
                                ** GOTO lbl54
                                break;
                            }
                        }
                        try {
                            block27: {
                                var15_17 = var14_16.getStatusCode();
                                var16_18 = 403;
                                if (var15_17 != var16_18 && var15_17 < (var16_18 = 500)) {
                                    var16_18 = 0;
                                    var17_19 = null;
                                } else {
                                    var16_18 = 1;
                                }
                                var18_20 = var14_16.isSuccessful();
                                var19_21 = 404;
                                if (var18_20 || var15_17 == var19_21) ** GOTO lbl-1000
                                if (!var8_10 && var16_18 != 0) ** continue;
                                break block27;
lbl54:
                                // 1 sources

                                var7_9 = var11_13;
                                break block25;
                            }
                            var11_13 = "Error connection to server: ";
                            var14_16 = String.valueOf(var15_17);
                            this.AFInAppEventParameterName = var11_13 = var11_13.concat((String)var14_16);
                            var1_1 /* !! */  = AFe1cSDK.getMonetizationNetwork;
                        }
                        catch (Throwable var1_2) {
                            break block26;
                        }
lbl64:
                        // 2 sources

                        while (true) {
                            this.toString.getCurrencyIso4217Code(var9_11);
                            AFLogger.afDebugLog(var6_8);
                            return var1_1 /* !! */ ;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var11_13 = var14_16.getBody();
                            var11_13 = (Map)var11_13;
                            var20_23 = var14_16.getStatusCode();
                            var21_22 = "iscache";
                            var21_22 = var11_13.get(var21_22);
                            var21_22 = (Boolean)var21_22;
                            if (var20_23 == var19_21) {
                                var14_16 = "error_reason";
                                var11_13.remove(var14_16);
                                var14_16 = "status_code";
                                var11_13.remove(var14_16);
                                var14_16 = "af_status";
                                var17_19 = "Organic";
                                var11_13.put(var14_16, var17_19);
                                var14_16 = "af_message";
                                var17_19 = "organic install";
                                var11_13.put(var14_16, var17_19);
                            }
                            if (var21_22 != null && (var20_23 = (int)var21_22.booleanValue()) == 0) {
                                var14_16 = this.copy;
                                var21_22 = "appsflyerConversionDataCacheExpiration";
                                var22_24 = System.currentTimeMillis();
                                var14_16.getMonetizationNetwork((String)var21_22, var22_24);
                            }
                            if ((var20_23 = (int)var11_13.containsKey(var5_7)) != 0) {
                                var20_23 = (int)var11_13.containsKey(var4_6);
                                if (var20_23 != 0) {
                                    var21_22 = "[Invite] Detected App-Invite via channel: ";
                                    var14_16 = new StringBuilder((String)var21_22);
                                    var21_22 = var11_13.get(var4_6);
                                    var14_16.append(var21_22);
                                    var14_16 = var14_16.toString();
                                    AFLogger.afDebugLog((String)var14_16);
                                } else {
                                    var14_16 = "[CrossPromotion] App was installed via %s's Cross Promotion";
                                    var21_22 = var11_13.get(var5_7);
                                    var17_19 = new Object[var2_4];
                                    var17_19[0] = var21_22;
                                    var14_16 = String.format((String)var14_16, var17_19);
                                    AFLogger.afDebugLog((String)var14_16);
                                }
                            }
                            var14_16 = Boolean.FALSE;
                            var11_13.put(var3_5, var14_16);
                            var14_16 = new JSONObject((Map)var11_13);
                            var14_16 = var14_16.toString();
                            var21_22 = this.copy;
                            var17_19 = "attributionId";
                            var21_22.AFAdRevenueData((String)var17_19, (String)var14_16);
                            var14_16 = this.copy;
                            var21_22 = "sixtyDayConversionData";
                            var20_23 = (int)var14_16.getMediationNetwork((String)var21_22);
                            if (var20_23 == 0) {
                                var14_16 = Boolean.TRUE;
                                var11_13.put(var3_5, var14_16);
                            }
                            this.copydefault = var11_13;
                            var1_1 /* !! */  = AFe1cSDK.getRevenue;
                            ** continue;
                        }
                    }
                    var21_22 = "[GCD] Error: ";
                    var14_16 = new StringBuilder((String)var21_22);
                    var21_22 = var11_14.getMessage();
                    var14_16.append((String)var21_22);
                    var14_16 = var14_16.toString();
                    AFLogger.afErrorLog((String)var14_16, var11_14, false, false);
                    var14_16 = AFe1cSDK.getMonetizationNetwork;
                    if (var8_10) break;
                    this.toString.getCurrencyIso4217Code(var9_11);
                    AFLogger.afDebugLog(var6_8);
                    var7_9 = var14_16;
                }
                var9_11 += var2_4;
            }
            {
                this.AFInAppEventParameterName = var1_1 /* !! */  = var11_14.getMessage();
                throw var11_14;
lbl147:
                // 1 sources

                var24_25 = "[GCD-E05] AppsFlyer dev key is missing";
                AFLogger.afDebugLog(var24_25);
                this.AFInAppEventParameterName = var24_25 = "AppsFlyer dev key is missing";
                throw var1_3;
            }
        }
        this.toString.getCurrencyIso4217Code(var9_11);
        AFLogger.afDebugLog(var6_8);
        throw var1_2;
    }

    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public final boolean copydefault() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final AFe1tSDK getMediationNetwork(String var1_1) {
        var2_2 = this.copy;
        var3_3 = this.hashCode.component4();
        if ((var2_2 = AFb1rSDK.getMonetizationNetwork((AFd1rSDK)var2_2, (String)var3_3)) == null || (var4_4 = (var3_3 = var2_2.trim()).isEmpty())) ** GOTO lbl19
        var3_3 = AFg1bSDK.component3;
        var5_5 /* !! */  = Locale.getDefault();
        var4_4 = var3_3.contains(var5_5 /* !! */  = var2_2.toLowerCase((Locale)var5_5 /* !! */ ));
        if (!var4_4) {
            var3_3 = "-";
            var2_2 = var3_3.concat((String)var2_2);
        } else {
            var5_5 /* !! */  = "[GCD] AF detected using redundant Google-Play channel for attribution - ";
            var3_3 = new StringBuilder((String)var5_5 /* !! */ );
            var3_3.append((String)var2_2);
            var3_3.append(". Using without channel postfix.");
            var2_2 = var3_3.toString();
            AFLogger.afWarnLog((String)var2_2);
lbl19:
            // 2 sources

            var2_2 = "";
        }
        var3_3 = this.equals;
        var5_5 /* !! */  = new Object[]{var3_3, var2_2, var1_1};
        var6_6 = System.identityHashCode(var3_3);
        var1_1 = (AFe1tSDK)AFe1qSDK.AFAdRevenueData(var5_5 /* !! */ , -465858035, 465858035, var6_6);
        var2_2 = new StringBuilder("[GCD-B01] URL: ");
        var3_3 = var1_1.getRevenue.getMediationNetwork;
        var2_2.append((String)var3_3);
        AFLogger.afInfoLog(var2_2.toString());
        return var1_1;
    }

    public final boolean getMediationNetwork() {
        return false;
    }

    public final void getRevenue() {
        boolean bl2;
        super.getRevenue();
        Map map2 = this.copydefault;
        String string2 = this.AFInAppEventParameterName;
        if (map2 != null) {
            AFg1aSDK.AFAdRevenueData(map2);
            return;
        }
        if (string2 != null && !(bl2 = string2.isEmpty())) {
            AFg1aSDK.getRevenue(string2);
            return;
        }
        AFg1aSDK.getRevenue("Unknown error");
    }
}

