/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK$2;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFf1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFj1fSDK;
import com.appsflyer.internal.AFk1wSDK;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;

public class CrossPromotionHelper {
    private static String getCurrencyIso4217Code = "https://%simpression.%s";

    private static LinkGenerator getMediationNetwork(Context object, String string2, String string3, Map map2, String string4) {
        String string5 = "af_cross_promotion";
        LinkGenerator linkGenerator = new LinkGenerator(string5);
        linkGenerator.getMediationNetwork = string4;
        linkGenerator.AFAdRevenueData = string2;
        string2 = "af_siteid";
        object = object.getPackageName();
        linkGenerator.addParameter(string2, (String)object);
        if (string3 != null) {
            linkGenerator.setCampaign(string3);
        }
        if (map2 != null) {
            linkGenerator.addParameters(map2);
        }
        return linkGenerator;
    }

    private static void getMediationNetwork(String object, Context object2, AFk1wSDK object3) {
        Object object4 = AFb1rSDK.getRevenue();
        ((AFb1rSDK)object4).AFAdRevenueData((Context)object2);
        object2 = ((AFb1rSDK)object4).getMonetizationNetwork();
        object4 = new AFf1uSDK((AFd1kSDK)object2, (String)object, (AFk1wSDK)object3);
        object = object2.copy();
        object2 = ((AFe1aSDK)object).AFAdRevenueData;
        object3 = new AFe1aSDK$2((AFe1aSDK)object, (AFe1eSDK)object4);
        object2.execute((Runnable)object3);
    }

    public static void logAndOpenStore(Context context, String string2, String string3) {
        CrossPromotionHelper.logAndOpenStore(context, string2, string3, null);
    }

    public static void logAndOpenStore(Context object, String object2, String object3, Map hashMap) {
        Object object4 = AFj1fSDK.getCurrencyIso4217Code;
        String string2 = AppsFlyerLib.getInstance().getHostPrefix();
        String string3 = AFb1rSDK.getRevenue().getHostName();
        int n3 = 2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        boolean bl2 = true;
        objectArray[bl2] = string3;
        object4 = String.format((String)object4, objectArray);
        object2 = CrossPromotionHelper.getMediationNetwork((Context)object, (String)object2, (String)object3, hashMap, (String)object4);
        object4 = AppsFlyerProperties.getInstance();
        boolean bl3 = ((AppsFlyerProperties)object4).getBoolean(string3 = "waitForCustomerId", false);
        if (bl3) {
            object = AFLogger.INSTANCE;
            object2 = AFh1vSDK.AFInAppEventParameterName;
            ((AFLogger)object).i((AFh1vSDK)((Object)object2), "CustomerUserId not set, track And Open Store is disabled", bl2);
            return;
        }
        object4 = AppsFlyerLib.getInstance();
        bl3 = ((AppsFlyerLib)object4).isStopped();
        if (bl3) {
            object = AFLogger.INSTANCE;
            object2 = AFh1vSDK.AFInAppEventParameterName;
            ((AFLogger)object).i((AFh1vSDK)((Object)object2), "SDK is stopped, track And Open Store is disabled", bl2);
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<String, String>();
        }
        hashMap.put("af_campaign", (String)object3);
        AppsFlyerLib.getInstance().logEvent((Context)object, "af_cross_promotion", hashMap);
        object2 = ((LinkGenerator)object2).generateLink();
        object3 = new AFk1wSDK((Context)object);
        CrossPromotionHelper.getMediationNetwork((String)object2, (Context)object, (AFk1wSDK)object3);
    }

    public static void logCrossPromoteImpression(Context context, String string2, String string3) {
        CrossPromotionHelper.logCrossPromoteImpression(context, string2, string3, null);
    }

    public static void logCrossPromoteImpression(Context object, String object2, String string2, Map map2) {
        Object object3 = AppsFlyerProperties.getInstance();
        String string3 = "waitForCustomerId";
        boolean bl2 = ((AppsFlyerProperties)object3).getBoolean(string3, false);
        int n3 = 1;
        if (bl2) {
            object = AFLogger.INSTANCE;
            object2 = AFh1vSDK.AFInAppEventParameterName;
            ((AFLogger)object).i((AFh1vSDK)((Object)object2), "CustomerUserId not set, Promote Impression is disabled", n3 != 0);
            return;
        }
        object3 = AppsFlyerLib.getInstance();
        bl2 = ((AppsFlyerLib)object3).isStopped();
        if (bl2) {
            object = AFLogger.INSTANCE;
            object2 = AFh1vSDK.AFInAppEventParameterName;
            ((AFLogger)object).i((AFh1vSDK)((Object)object2), "SDK is stopped, Promote Impression is disabled", n3 != 0);
            return;
        }
        object3 = getCurrencyIso4217Code;
        String string4 = AppsFlyerLib.getInstance().getHostPrefix();
        String string5 = AFb1rSDK.getRevenue().getHostName();
        Object[] objectArray = new Object[2];
        objectArray[0] = string4;
        objectArray[n3] = string5;
        object3 = String.format((String)object3, objectArray);
        CrossPromotionHelper.getMediationNetwork(CrossPromotionHelper.getMediationNetwork((Context)object, object2, string2, map2, (String)object3).generateLink(), (Context)object, null);
    }

    /*
     * Unable to fully structure code
     */
    public static void setUrl(Map var0) {
        var0 = var0.entrySet().iterator();
        while ((var1_1 = var0.hasNext()) != 0) {
            block5: {
                block4: {
                    var2_2 = (Map.Entry)var0.next();
                    var3_3 = (String)var2_2.getValue();
                    var2_2 = (String)var2_2.getKey();
                    var4_4 = var2_2.hashCode();
                    var5_5 = 96801;
                    var6_6 = 1;
                    if (var4_4 == var5_5) break block4;
                    var5_5 = 120623625;
                    if (var4_4 != var5_5 || (var1_1 = (int)var2_2.equals(var7_7 = "impression")) == 0) ** GOTO lbl-1000
                    var1_1 = 1;
                    break block5;
                }
                var7_7 = "app";
                var1_1 = var2_2.equals(var7_7);
                if (var1_1 != 0) {
                    var1_1 = 0;
                    var2_2 = null;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = -1;
                }
            }
            if (var1_1 != 0) {
                if (var1_1 != var6_6) continue;
                CrossPromotionHelper.getCurrencyIso4217Code = var3_3;
                continue;
            }
            AFj1fSDK.getCurrencyIso4217Code = var3_3;
        }
    }
}

