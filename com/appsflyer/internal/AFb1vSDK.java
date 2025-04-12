/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.os.Build
 *  android.provider.Settings$Secure
 *  com.appsflyer.oaid.OaidClient
 *  com.appsflyer.oaid.OaidClient$Info
 */
package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.oaid.OaidClient;

public final class AFb1vSDK {
    public static Boolean getCurrencyIso4217Code;
    static String getRevenue;

    public static AFb1tSDK b_(ContentResolver object) {
        int n3 = AFb1vSDK.getMonetizationNetwork();
        AFb1tSDK aFb1tSDK = null;
        if (n3 == 0) {
            return null;
        }
        if (object == null) {
            return null;
        }
        Object object2 = AppsFlyerProperties.getInstance();
        String string2 = "amazon_aid";
        if ((object2 = ((AppsFlyerProperties)object2).getString(string2)) == null && (n3 = (object2 = "Amazon").equals(string2 = Build.MANUFACTURER)) != 0) {
            object2 = "limit_ad_tracking";
            int n4 = 2;
            n3 = Settings.Secure.getInt((ContentResolver)object, (String)object2, (int)n4);
            String string3 = "advertising_id";
            if (n3 == 0) {
                object = Settings.Secure.getString((ContentResolver)object, (String)string3);
                object2 = Boolean.FALSE;
                aFb1tSDK = new AFb1tSDK((String)object, (Boolean)object2);
            } else if (n3 != n4) {
                try {
                    object = Settings.Secure.getString((ContentResolver)object, (String)string3);
                }
                catch (Throwable throwable) {
                    object2 = "Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)";
                    AFLogger.afErrorLog((String)object2, throwable);
                    object = "";
                }
                object2 = Boolean.TRUE;
                aFb1tSDK = new AFb1tSDK((String)object, (Boolean)object2);
            }
        }
        return aFb1tSDK;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AFb1tSDK getCurrencyIso4217Code(Context object) {
        Boolean bl2;
        void var0_8;
        boolean bl3;
        Object object2;
        Object object3;
        block6: {
            boolean bl4;
            object3 = AppsFlyerProperties.getInstance();
            object2 = getRevenue;
            boolean bl5 = true;
            bl3 = object2 != null;
            if (!bl3) {
                block7: {
                    boolean bl6;
                    object2 = getCurrencyIso4217Code;
                    if (object2 == null || !(bl6 = ((Boolean)object2).booleanValue())) {
                        object2 = getCurrencyIso4217Code;
                        if (object2 != null) return null;
                        object2 = "collectOAID";
                        bl6 = ((AppsFlyerProperties)object3).getBoolean((String)object2, bl5);
                        if (!bl6) return null;
                    }
                    object2 = new OaidClient(object);
                    bl4 = ((AppsFlyerProperties)object3).isEnableLog();
                    object2.setLogging(bl4);
                    OaidClient.Info info = object2.fetch();
                    if (info == null) return null;
                    object3 = info.getId();
                    try {
                        Boolean bl7 = info.getLat();
                        object2 = object3;
                        break block6;
                    }
                    catch (Throwable throwable) {
                        object2 = object3;
                        break block7;
                    }
                    catch (Throwable throwable) {
                        bl6 = false;
                        object2 = null;
                    }
                }
                String string2 = "No OAID library";
                AFLogger.afDebugLog(string2);
            }
            bl4 = false;
            Object var0_2 = null;
        }
        if (object2 == null) return null;
        object3 = new AFb1tSDK((String)object2, (Boolean)var0_8);
        ((AFb1tSDK)object3).getMediationNetwork = bl2 = Boolean.valueOf(bl3);
        return object3;
    }

    private static boolean getMonetizationNetwork() {
        boolean bl2;
        Boolean bl3 = getCurrencyIso4217Code;
        return bl3 == null || (bl2 = bl3.booleanValue());
        {
        }
    }
}

