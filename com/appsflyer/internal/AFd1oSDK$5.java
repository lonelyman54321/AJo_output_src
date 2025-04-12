/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import java.util.concurrent.LinkedBlockingQueue;

final class AFd1oSDK$5
extends LinkedBlockingQueue {
    private boolean getRevenue(Runnable runnable2) {
        boolean bl2 = this.isEmpty();
        if (bl2) {
            return super.offer(runnable2);
        }
        return false;
    }

    public final /* synthetic */ boolean offer(Object object) {
        object = (Runnable)object;
        return this.getRevenue((Runnable)object);
    }
}

