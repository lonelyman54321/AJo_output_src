/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.appsflyer.internal;

import android.os.Handler;
import com.appsflyer.internal.AFj1mSDK;

final class AFj1mSDK$5
implements Runnable {
    private /* synthetic */ AFj1mSDK getRevenue;

    public AFj1mSDK$5(AFj1mSDK aFj1mSDK) {
        this.getRevenue = aFj1mSDK;
    }

    public final void run() {
        Object object = this.getRevenue.AFAdRevenueData;
        synchronized (object) {
            Object object2 = this.getRevenue;
            ((AFj1mSDK)object2).getMonetizationNetwork();
            object2 = this.getRevenue;
            Handler handler = ((AFj1mSDK)object2).getCurrencyIso4217Code;
            object2 = ((AFj1mSDK)object2).getMonetizationNetwork;
            long l2 = 150L;
            handler.postDelayed((Runnable)object2, l2);
            object2 = this.getRevenue;
            boolean bl2 = true;
            ((AFj1mSDK)object2).getMediationNetwork = bl2;
            return;
        }
    }
}

