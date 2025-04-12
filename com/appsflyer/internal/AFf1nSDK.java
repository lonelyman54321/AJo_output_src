/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler$PurchaseValidationCallback;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1tSDK;
import com.appsflyer.internal.AFf1zSDK;
import java.util.Map;

public final class AFf1nSDK
extends AFf1tSDK {
    public AFf1nSDK(Map object, PurchaseHandler$PurchaseValidationCallback purchaseHandler$PurchaseValidationCallback, AFd1kSDK aFd1kSDK) {
        AFf1zSDK aFf1zSDK = AFf1zSDK.valueOf;
        Object object2 = AFf1zSDK.getRevenue;
        object2 = AFf1zSDK.AFAdRevenueData;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{object2, object2};
        object2 = this;
        super(aFf1zSDK, aFf1zSDKArray, aFd1kSDK, (Map)object, purchaseHandler$PurchaseValidationCallback);
        object = AFf1zSDK.getMonetizationNetwork;
        this.getCurrencyIso4217Code.add(object);
    }

    public final AFe1tSDK AFAdRevenueData(Map map2, String string2, String string3) {
        return this.component2.getMediationNetwork(map2, string2, string3);
    }
}

