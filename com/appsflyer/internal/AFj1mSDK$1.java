/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.appsflyer.internal;

import android.os.Handler;
import com.appsflyer.internal.AFj1mSDK;

final class AFj1mSDK$1
implements Runnable {
    private /* synthetic */ AFj1mSDK AFAdRevenueData;

    public AFj1mSDK$1(AFj1mSDK aFj1mSDK) {
        this.AFAdRevenueData = aFj1mSDK;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = this.AFAdRevenueData.AFAdRevenueData;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object2 = this.AFAdRevenueData;
                        boolean bl2 = ((AFj1mSDK)object2).getMediationNetwork;
                        if (!bl2) break block3;
                        Handler handler = ((AFj1mSDK)object2).getCurrencyIso4217Code;
                        object2 = ((AFj1mSDK)object2).getRevenue;
                        handler.removeCallbacks((Runnable)object2);
                        object2 = this.AFAdRevenueData;
                        handler = ((AFj1mSDK)object2).getCurrencyIso4217Code;
                        object2 = ((AFj1mSDK)object2).getMonetizationNetwork;
                        handler.removeCallbacks((Runnable)object2);
                        object2 = this.AFAdRevenueData;
                        ((AFj1mSDK)object2).AFAdRevenueData();
                        object2 = this.AFAdRevenueData;
                        bl2 = false;
                        handler = null;
                        ((AFj1mSDK)object2).getMediationNetwork = false;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

