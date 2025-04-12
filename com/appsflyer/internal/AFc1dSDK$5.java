/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFc1dSDK;
import java.util.concurrent.Callable;

final class AFc1dSDK$5
implements Callable {
    private /* synthetic */ AFc1dSDK getMediationNetwork;

    public AFc1dSDK$5(AFc1dSDK aFc1dSDK) {
        this.getMediationNetwork = aFc1dSDK;
    }

    public final Object call() {
        AFc1dSDK aFc1dSDK = this.getMediationNetwork;
        boolean bl2 = aFc1dSDK.getCurrencyIso4217Code();
        if (bl2) {
            return this.getMediationNetwork.getMonetizationNetwork();
        }
        return null;
    }
}

