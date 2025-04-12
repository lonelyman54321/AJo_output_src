/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1dSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;

final class AFe1aSDK$5
implements Runnable {
    private /* synthetic */ AFe1aSDK AFAdRevenueData;
    private /* synthetic */ AFe1cSDK getCurrencyIso4217Code;
    private /* synthetic */ AFe1eSDK getRevenue;

    public AFe1aSDK$5(AFe1aSDK aFe1aSDK, AFe1eSDK aFe1eSDK, AFe1cSDK aFe1cSDK) {
        this.AFAdRevenueData = aFe1aSDK;
        this.getRevenue = aFe1eSDK;
        this.getCurrencyIso4217Code = aFe1cSDK;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        boolean bl2;
        Object object = AFLogger.INSTANCE;
        Object object2 = AFh1vSDK.component4;
        Object object3 = new StringBuilder("execution finished for ");
        Object object4 = this.getRevenue;
        ((StringBuilder)object3).append(object4);
        ((StringBuilder)object3).append(", result: ");
        object4 = this.getCurrencyIso4217Code;
        ((StringBuilder)object3).append(object4);
        object3 = object3.toString();
        ((AFh1uSDK)object).d((AFh1vSDK)((Object)object2), (String)object3);
        object = this.AFAdRevenueData.areAllFieldsValid;
        object2 = this.getRevenue;
        object.remove(object2);
        object = this.AFAdRevenueData.getRevenue.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (AFe1dSDK)object.next();
            object3 = this.getRevenue;
            object4 = this.getCurrencyIso4217Code;
            object2.getMonetizationNetwork((AFe1eSDK)object3, (AFe1cSDK)((Object)object4));
        }
        object = this.getCurrencyIso4217Code;
        object2 = AFe1cSDK.getRevenue;
        if (object == object2) {
            object = this.AFAdRevenueData.getMonetizationNetwork;
            object2 = this.getRevenue.getMonetizationNetwork;
            object.add(object2);
            this.AFAdRevenueData.getMonetizationNetwork();
            return;
        }
        object = this.getRevenue;
        boolean bl3 = ((AFe1eSDK)object).getMediationNetwork();
        if (bl3) {
            object = this.getRevenue;
            bl3 = AFe1aSDK.getCurrencyIso4217Code((AFe1eSDK)object);
            if (!bl3) return;
            object = this.AFAdRevenueData.component3;
            synchronized (object) {
                try {
                    object2 = this.AFAdRevenueData;
                    object2 = ((AFe1aSDK)object2).component2;
                    object3 = this.getRevenue;
                    object2.add(object3);
                    object2 = this.AFAdRevenueData;
                    object2 = ((AFe1aSDK)object2).getRevenue;
                    object2 = object2.iterator();
                    while (true) {
                        boolean bl4;
                        if (!(bl4 = object2.hasNext())) {
                            return;
                        }
                        object3 = object2.next();
                        object3 = (AFe1dSDK)object3;
                    }
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        } else {
            object = this.AFAdRevenueData.getMonetizationNetwork;
            object2 = this.getRevenue.getMonetizationNetwork;
            object.add(object2);
            object = this.AFAdRevenueData;
            ((AFe1aSDK)object).getMonetizationNetwork();
        }
    }
}

