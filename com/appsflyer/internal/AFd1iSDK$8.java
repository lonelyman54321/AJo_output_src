/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFd1cSDK;
import com.appsflyer.internal.AFd1hSDK;
import com.appsflyer.internal.AFd1iSDK;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class AFd1iSDK$8
extends Lambda
implements Function0 {
    private /* synthetic */ AFd1iSDK getMediationNetwork;

    public AFd1iSDK$8(AFd1iSDK aFd1iSDK) {
        this.getMediationNetwork = aFd1iSDK;
        super(0);
    }

    public final AFd1cSDK getMonetizationNetwork() {
        AFd1hSDK aFd1hSDK = this.getMediationNetwork.getRevenue();
        AFd1cSDK aFd1cSDK = new AFd1cSDK(aFd1hSDK);
        return aFd1cSDK;
    }

    public final /* synthetic */ Object invoke() {
        return this.getMonetizationNetwork();
    }
}

