/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1bSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFf1eSDK;
import org.json.JSONObject;

final class AFa1bSDK$5
implements AppsFlyerRequestListener {
    private /* synthetic */ AFf1eSDK AFAdRevenueData;
    private /* synthetic */ AFa1bSDK getRevenue;

    public AFa1bSDK$5(AFa1bSDK aFa1bSDK, AFf1eSDK aFf1eSDK) {
        this.getRevenue = aFa1bSDK;
        this.AFAdRevenueData = aFf1eSDK;
    }

    public final void onError(int n3, String string2) {
        Object object;
        int n4 = 50;
        if (n3 == n4 && (object = this.AFAdRevenueData.component4) != null) {
            string2 = object.toString();
        }
        object = this.getRevenue;
        String string3 = ((AFa1bSDK)object).getCurrencyIso4217Code;
        String string4 = ((AFa1bSDK)object).getRevenue;
        object = ((AFa1bSDK)object).getMonetizationNetwork;
        AFa1bSDK.getRevenue(false, string3, string4, (String)object, string2);
    }

    public final void onSuccess() {
        String string2;
        Object object;
        Object object2;
        Object object3 = this.AFAdRevenueData.component4;
        try {
            object3 = ((AFe1kSDK)object3).getBody();
        }
        catch (Exception exception) {
            object2 = String.valueOf(exception);
            AFLogger.afErrorLog("Failed Validate request: ".concat((String)object2), exception);
            object2 = this.getRevenue;
            object = ((AFa1bSDK)object2).getCurrencyIso4217Code;
            string2 = ((AFa1bSDK)object2).getRevenue;
            object2 = ((AFa1bSDK)object2).getMonetizationNetwork;
            String string3 = exception.getMessage();
            AFa1bSDK.getRevenue(false, (String)object, string2, (String)object2, string3);
            return;
        }
        object3 = (String)object3;
        object2 = new JSONObject((String)object3);
        object3 = "Validate response ok: ";
        object = String.valueOf(object2);
        object3 = ((String)object3).concat((String)object);
        AFLogger.afInfoLog((String)object3);
        object3 = "result";
        boolean bl2 = object2.optBoolean((String)object3);
        object = this.getRevenue;
        string2 = ((AFa1bSDK)object).getCurrencyIso4217Code;
        String string4 = ((AFa1bSDK)object).getRevenue;
        object = ((AFa1bSDK)object).getMonetizationNetwork;
        object2 = object2.toString();
        AFa1bSDK.getRevenue(bl2, string2, string4, (String)object, (String)object2);
    }
}

