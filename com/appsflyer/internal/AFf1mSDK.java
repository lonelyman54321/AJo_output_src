/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1kSDK;
import com.appsflyer.internal.AFb1uSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK$2;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFf1dSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFh1hSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;

public final class AFf1mSDK
extends AFe1eSDK {
    private static volatile boolean component1 = false;
    private Boolean areAllFieldsValid;
    private final AFb1uSDK component2;
    private final AFd1kSDK component3;
    private final AFe1aSDK component4;

    public AFf1mSDK(AFd1kSDK aFd1kSDK) {
        Object object = AFf1zSDK.getMediationNetwork;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{};
        super((AFf1zSDK)((Object)object), aFf1zSDKArray, "LoadCachedRequests");
        object = aFd1kSDK.valueOf();
        this.component2 = object;
        object = aFd1kSDK.copy();
        this.component4 = object;
        this.component3 = aFd1kSDK;
    }

    public static boolean component4() {
        return component1;
    }

    private static String getMonetizationNetwork(AFb1kSDK object) {
        long l2 = System.currentTimeMillis();
        String string2 = ((AFb1kSDK)object).getRevenue;
        int n3 = 10;
        long l3 = Long.parseLong(string2, n3);
        object = ((AFb1kSDK)object).AFAdRevenueData;
        Uri uri = Uri.parse((String)object);
        uri = uri.buildUpon();
        String string3 = "isCachedRequest";
        String string4 = "true";
        uri = uri.appendQueryParameter(string3, string4);
        string3 = "timeincache";
        l2 -= l3;
        l3 = 1000L;
        l2 /= l3;
        String string5 = String.valueOf(l2);
        string5 = uri.appendQueryParameter(string3, string5);
        try {
            object = string5.toString();
        }
        catch (Exception exception) {
            String string6 = "Couldn't parse the uri";
            AFLogger.afErrorLogForExcManagerOnly(string6, exception);
        }
        return object;
    }

    public final AFe1cSDK AFAdRevenueData() {
        boolean bl2;
        Object object = this.component2.getMediationNetwork().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (AFb1kSDK)object.next();
            Object object3 = AFLogger.INSTANCE;
            Object object4 = AFh1vSDK.component3;
            Object object5 = new StringBuilder("resending request: ");
            String string2 = object2.AFAdRevenueData;
            ((StringBuilder)object5).append(string2);
            object5 = object5.toString();
            ((AFh1uSDK)object3).i((AFh1vSDK)((Object)object4), (String)object5);
            object3 = AFf1mSDK.getMonetizationNetwork(object2);
            object5 = object2.getMonetizationNetwork();
            string2 = object2.getRevenue;
            object2 = object2.getCurrencyIso4217Code;
            object4 = new AFh1hSDK((String)object3, (byte[])object5, string2, (AFf1zSDK)((Object)object2));
            object2 = this.component4;
            object5 = this.component3;
            object3 = new AFf1dSDK((AFh1hSDK)object4, (AFd1kSDK)object5);
            object4 = ((AFe1aSDK)object2).AFAdRevenueData;
            object5 = new AFe1aSDK$2((AFe1aSDK)object2, (AFe1eSDK)object3);
            try {
                object4.execute((Runnable)object5);
            }
            catch (Exception exception) {
                object3 = AFLogger.INSTANCE;
                object4 = AFh1vSDK.component4;
                object5 = "Failed to resend cached request";
                ((AFh1uSDK)object3).e((AFh1vSDK)((Object)object4), (String)object5, exception);
            }
        }
        this.areAllFieldsValid = object = Boolean.TRUE;
        component1 = true;
        return AFe1cSDK.getRevenue;
    }

    public final boolean getMediationNetwork() {
        return false;
    }

    public final long getMonetizationNetwork() {
        return 30000L;
    }
}

