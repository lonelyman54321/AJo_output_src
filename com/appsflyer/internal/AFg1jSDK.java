/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK$2;
import com.appsflyer.internal.AFf1cSDK;
import com.appsflyer.internal.AFg1mSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.google.firebase.messaging.FirebaseMessagingService;

public final class AFg1jSDK {
    public static String getMediationNetwork;
    public final AFd1rSDK AFAdRevenueData;

    static {
        StringBuilder stringBuilder = new StringBuilder("https://%sregister.%s/api/v");
        String string2 = AFb1rSDK.getRevenue;
        stringBuilder.append(string2);
        getMediationNetwork = ((Object)stringBuilder).toString();
    }

    public AFg1jSDK(Context object) {
        object = AFb1rSDK.getRevenue().getMonetizationNetwork((Context)object);
        this.AFAdRevenueData = object;
    }

    public static void getMediationNetwork(String object) {
        Object object2 = AFb1rSDK.getRevenue().getMonetizationNetwork();
        AFf1cSDK aFf1cSDK = new AFf1cSDK((String)object, (AFd1kSDK)object2);
        object = object2.copy();
        object2 = ((AFe1aSDK)object).AFAdRevenueData;
        AFe1aSDK$2 aFe1aSDK$2 = new AFe1aSDK$2((AFe1aSDK)object, aFf1cSDK);
        object2.execute(aFe1aSDK$2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean getMonetizationNetwork(Context context) {
        Object object = AppsFlyerLib.getInstance();
        boolean bl2 = ((AppsFlyerLib)object).isStopped();
        if (bl2) {
            return false;
        }
        try {
            object = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            String string2 = "com.google.firebase.MESSAGING_EVENT";
            Class<FirebaseMessagingServiceListener> object2 = FirebaseMessagingServiceListener.class;
            object = new Intent(string2, null, context, object2);
            boolean bl3 = AFb1qSDK.c_(context, (Intent)object);
            if (!bl3) return false;
            return true;
        }
        catch (Throwable throwable) {
            object = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.i;
            String string2 = "An error occurred while trying to verify manifest declarations: ";
            ((AFh1uSDK)object).e(aFh1vSDK, string2, throwable);
            return false;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    public static boolean getRevenue(AFd1rSDK aFd1rSDK) {
        return aFd1rSDK.getMediationNetwork("sentRegisterRequestToAF");
    }

    public final AFg1mSDK getMediationNetwork() {
        int n3;
        int n4;
        AppsFlyerProperties appsFlyerProperties;
        long l2;
        Object object = this.AFAdRevenueData;
        Object object2 = "afUninstallToken";
        object = object.getMonetizationNetwork((String)object2, null);
        AFd1rSDK aFd1rSDK = this.AFAdRevenueData;
        String string2 = "afUninstallToken_received_time";
        long l3 = 0L;
        long l4 = aFd1rSDK.getMediationNetwork(string2, l3);
        AFd1rSDK aFd1rSDK2 = this.AFAdRevenueData;
        String string3 = "afUninstallToken_queued";
        boolean bl2 = aFd1rSDK2.getMediationNetwork(string3);
        Object object3 = this.AFAdRevenueData;
        object3.getRevenue(string3, false);
        string3 = ",";
        if (object == null && (object3 = AppsFlyerProperties.getInstance().getString((String)object2)) != null) {
            object = ((String)object3).split(string3);
            l2 = ((String[])object).length + -1;
            object = object[l2];
        }
        if ((l2 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) == false && (object2 = (appsFlyerProperties = AppsFlyerProperties.getInstance()).getString((String)object2)) != null && (n4 = ((String[])(object2 = object2.split(string3))).length) >= (n3 = 2)) {
            try {
                n4 = ((String[])object2).length - n3;
            }
            catch (NumberFormatException numberFormatException) {}
            object2 = object2[n4];
            l4 = Long.parseLong((String)object2);
        }
        if (object != null) {
            object2 = new AFg1mSDK((String)object, l4, bl2);
            return object2;
        }
        return null;
    }
}

