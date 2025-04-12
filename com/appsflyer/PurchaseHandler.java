/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

import com.appsflyer.PurchaseHandler$PurchaseValidationCallback;
import com.appsflyer.internal.AFb1jSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFe1aSDK;
import java.util.Map;

public final class PurchaseHandler {
    private final AFd1qSDK AFAdRevenueData;
    public final AFe1aSDK getMediationNetwork;
    public final AFd1kSDK getRevenue;

    public PurchaseHandler(AFd1kSDK object) {
        AFd1qSDK aFd1qSDK;
        this.getRevenue = object;
        this.AFAdRevenueData = aFd1qSDK = object.getMediationNetwork();
        this.getMediationNetwork = object = object.copy();
    }

    public final boolean getCurrencyIso4217Code(Map map2, PurchaseHandler$PurchaseValidationCallback purchaseHandler$PurchaseValidationCallback, String ... object) {
        Object object2 = this.AFAdRevenueData;
        boolean bl2 = AFb1jSDK.getMediationNetwork(map2, object, (AFd1qSDK)object2);
        if (!bl2 && purchaseHandler$PurchaseValidationCallback != null) {
            object2 = "Invalid Request Data";
            object = new IllegalArgumentException((String)object2);
            purchaseHandler$PurchaseValidationCallback.onFailure((Throwable)object);
        }
        return bl2;
    }
}

