/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class AFd1oSDK$AFa1tSDK
implements ThreadFactory {
    private static final AtomicInteger getCurrencyIso4217Code;
    private final AtomicInteger getMediationNetwork;

    static {
        AtomicInteger atomicInteger;
        getCurrencyIso4217Code = atomicInteger = new AtomicInteger();
    }

    public AFd1oSDK$AFa1tSDK() {
        AtomicInteger atomicInteger;
        this.getMediationNetwork = atomicInteger = new AtomicInteger();
        getCurrencyIso4217Code.incrementAndGet();
    }

    public final Thread newThread(Runnable runnable2) {
        int n3 = getCurrencyIso4217Code.get();
        int n4 = this.getMediationNetwork.incrementAndGet();
        StringBuilder stringBuilder = new StringBuilder("queue-");
        stringBuilder.append(n3);
        stringBuilder.append("-");
        stringBuilder.append(n4);
        String string2 = ((Object)stringBuilder).toString();
        Thread thread2 = new Thread(runnable2, string2);
        return thread2;
    }
}

