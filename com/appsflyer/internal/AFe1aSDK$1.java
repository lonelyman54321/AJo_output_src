/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1dSDK;
import com.appsflyer.internal.AFe1eSDK;
import java.util.Iterator;

final class AFe1aSDK$1
implements Runnable {
    private /* synthetic */ AFe1eSDK getMediationNetwork;
    private /* synthetic */ AFe1aSDK getRevenue;

    public AFe1aSDK$1(AFe1aSDK aFe1aSDK, AFe1eSDK aFe1eSDK) {
        this.getRevenue = aFe1aSDK;
        this.getMediationNetwork = aFe1eSDK;
    }

    public final void run() {
        boolean bl2;
        Iterator iterator = this.getRevenue.getRevenue.iterator();
        while (bl2 = iterator.hasNext()) {
            AFe1dSDK aFe1dSDK = (AFe1dSDK)iterator.next();
            AFe1eSDK aFe1eSDK = this.getMediationNetwork;
            aFe1dSDK.getCurrencyIso4217Code(aFe1eSDK);
        }
    }
}

