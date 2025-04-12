/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1jSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1lSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

public final class AFe1tSDK {
    private final AFe1jSDK AFAdRevenueData;
    private final AtomicBoolean getCurrencyIso4217Code;
    private final AFe1lSDK getMediationNetwork;
    private final ExecutorService getMonetizationNetwork;
    public final AFe1mSDK getRevenue;

    public AFe1tSDK(AFe1mSDK aFe1mSDK, ExecutorService executorService, AFe1lSDK aFe1lSDK, AFe1jSDK aFe1jSDK) {
        AtomicBoolean atomicBoolean;
        this.getCurrencyIso4217Code = atomicBoolean = new AtomicBoolean(false);
        this.getRevenue = aFe1mSDK;
        this.getMonetizationNetwork = executorService;
        this.getMediationNetwork = aFe1lSDK;
        this.AFAdRevenueData = aFe1jSDK;
    }

    public final AFe1kSDK getMonetizationNetwork() {
        Object object = this.getCurrencyIso4217Code;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object).getAndSet(bl2);
        if (!bl3) {
            Object object2;
            Object object3;
            object = this.getMediationNetwork;
            Object object4 = this.getRevenue;
            object = ((AFe1lSDK)object).getMediationNetwork((AFe1mSDK)object4);
            try {
                object4 = this.AFAdRevenueData;
            }
            catch (JSONException jSONException) {
                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", jSONException);
                object3 = jSONException.getMessage();
                object2 = new ParsingException((String)object3, jSONException, (AFe1kSDK)object);
                throw object2;
            }
            object2 = ((AFe1kSDK)object).getBody();
            object2 = (String)object2;
            Object object5 = object4.getRevenue((String)object2);
            int n3 = ((AFe1kSDK)object).getMediationNetwork;
            boolean bl4 = ((AFe1kSDK)object).getRevenue;
            Map map2 = ((AFe1kSDK)object).getMonetizationNetwork;
            AFe1nSDK aFe1nSDK = ((AFe1kSDK)object).AFAdRevenueData;
            object3 = object4;
            object4 = new AFe1kSDK(object5, n3, bl4, map2, aFe1nSDK);
            return object4;
        }
        object = new IllegalStateException("Http call is already executed");
        throw object;
    }
}

