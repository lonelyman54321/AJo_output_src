/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler$PurchaseValidationCallback;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1tSDK;
import com.appsflyer.internal.AFf1zSDK;
import java.util.Map;

public final class AFf1rSDK
extends AFf1tSDK {
    public AFf1rSDK(Map object, PurchaseHandler$PurchaseValidationCallback purchaseHandler$PurchaseValidationCallback, AFd1kSDK aFd1kSDK) {
        AFf1zSDK aFf1zSDK = AFf1zSDK.AFInAppEventParameterName;
        Object object2 = AFf1zSDK.getRevenue;
        object2 = AFf1zSDK.AFAdRevenueData;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{object2, object2};
        object2 = this;
        super(aFf1zSDK, aFf1zSDKArray, aFd1kSDK, (Map)object, purchaseHandler$PurchaseValidationCallback);
        object = AFf1zSDK.getMonetizationNetwork;
        this.getCurrencyIso4217Code.add(object);
    }

    public final AFe1tSDK AFAdRevenueData(Map map2, String string2, String string3) {
        return this.component2.getRevenue(map2, string2, string3);
    }

    public final boolean getMediationNetwork() {
        int n3;
        int n4;
        AFe1kSDK aFe1kSDK = this.component4;
        if (aFe1kSDK != null && (n4 = aFe1kSDK.getStatusCode()) == (n3 = 424)) {
            return true;
        }
        return super.getMediationNetwork();
    }
}

