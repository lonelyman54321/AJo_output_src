/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFg1uSDK$AFa1vSDK;
import com.appsflyer.internal.AFg1wSDK;
import java.util.concurrent.ConcurrentHashMap;

final class AFg1wSDK$4
implements AFg1uSDK$AFa1vSDK {
    private /* synthetic */ AFg1wSDK AFAdRevenueData;

    public AFg1wSDK$4(AFg1wSDK aFg1wSDK) {
        this.AFAdRevenueData = aFg1wSDK;
    }

    public final void AFAdRevenueData(String string2, String string3) {
        ConcurrentHashMap concurrentHashMap;
        AFg1wSDK aFg1wSDK = this.AFAdRevenueData;
        aFg1wSDK.getRevenue = concurrentHashMap = new ConcurrentHashMap();
        this.AFAdRevenueData.getRevenue.put("signedData", string2);
        this.AFAdRevenueData.getRevenue.put("signature", string3);
        this.AFAdRevenueData.component2();
        AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
    }

    public final void getCurrencyIso4217Code(String string2, Exception exception) {
        ConcurrentHashMap concurrentHashMap;
        Object object = this.AFAdRevenueData;
        ((AFg1wSDK)object).getRevenue = concurrentHashMap = new ConcurrentHashMap();
        object = exception.getMessage();
        if (object == null) {
            object = "unknown";
        }
        this.AFAdRevenueData.component2();
        this.AFAdRevenueData.getRevenue.put("error", object);
        boolean bl2 = true;
        AFLogger.afErrorLog(string2, exception, bl2, bl2, false);
    }
}

