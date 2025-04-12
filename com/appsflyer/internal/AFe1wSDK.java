/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFe1lSDK;
import java.util.concurrent.ExecutorService;

public final class AFe1wSDK {
    final AFe1lSDK getMediationNetwork;
    final ExecutorService getMonetizationNetwork;

    public AFe1wSDK(AFe1lSDK aFe1lSDK, ExecutorService executorService) {
        this.getMediationNetwork = aFe1lSDK;
        this.getMonetizationNetwork = executorService;
    }
}

