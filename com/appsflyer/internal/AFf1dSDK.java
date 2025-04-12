/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1oSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFh1hSDK;
import java.net.MalformedURLException;
import java.net.URL;

public final class AFf1dSDK
extends AFf1oSDK {
    private final AFh1hSDK component3;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public AFf1dSDK(AFh1hSDK aFh1hSDK, AFd1kSDK aFd1kSDK) {
        void var3_4;
        AFf1zSDK aFf1zSDK = aFh1hSDK.equals;
        if (aFf1zSDK == null) {
            AFf1zSDK aFf1zSDK2 = AFf1zSDK.getCurrencyIso4217Code;
        }
        void var4_8 = var3_4;
        AFf1zSDK aFf1zSDK3 = AFf1zSDK.getRevenue;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{aFf1zSDK3};
        StringBuilder stringBuilder = new StringBuilder();
        Object object = aFh1hSDK.getMonetizationNetwork;
        stringBuilder.append((String)object);
        stringBuilder.append("-");
        object = AFf1dSDK.getMediationNetwork(aFh1hSDK);
        stringBuilder.append((String)object);
        String string2 = ((Object)stringBuilder).toString();
        String string3 = aFh1hSDK.getMonetizationNetwork;
        object = this;
        super((AFf1zSDK)var4_8, aFf1zSDKArray, aFd1kSDK, string2, string3);
        this.component3 = aFh1hSDK;
    }

    private static String getMediationNetwork(AFh1hSDK object) {
        try {
            object = ((AFa1oSDK)object).component4;
        }
        catch (MalformedURLException malformedURLException) {
            return "";
        }
        URL uRL = new URL((String)object);
        return uRL.getHost();
    }

    public final AppsFlyerRequestListener areAllFieldsValid() {
        return this.component3.getMediationNetwork;
    }

    public final boolean copydefault() {
        return false;
    }

    public final AFe1tSDK getMediationNetwork(String object) {
        object = Base64.encodeToString((byte[])this.component3.getMediationNetwork(), (int)2);
        Object object2 = String.valueOf(object);
        AFLogger.afInfoLog("cached data: ".concat((String)object2));
        object2 = this.areAllFieldsValid;
        String string2 = this.component3.component4;
        object2.getMediationNetwork(string2, (String)object);
        object = this.component2;
        object2 = this.component3;
        return ((AFe1qSDK)object).AFAdRevenueData((AFh1hSDK)object2);
    }

    public final boolean getMediationNetwork() {
        int n3;
        int n4;
        Object object = this.component3.equals;
        if (object == null) {
            object = AFf1zSDK.getCurrencyIso4217Code;
        }
        AFf1zSDK aFf1zSDK = AFf1zSDK.AFInAppEventParameterName;
        return object == aFf1zSDK && (object = this.component4) != null && (n4 = ((AFe1kSDK)object).getStatusCode()) == (n3 = 424) || (n4 = super.getMediationNetwork()) != 0;
    }
}

