/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.MoreExecutors$Application;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class MoreExecutors$Application$1
implements Runnable {
    final /* synthetic */ ExecutorService val$service;
    final /* synthetic */ long val$terminationTimeout;
    final /* synthetic */ TimeUnit val$timeUnit;

    public MoreExecutors$Application$1(MoreExecutors.Application application, ExecutorService executorService, long l2, TimeUnit timeUnit) {
        this.val$service = executorService;
        this.val$terminationTimeout = l2;
        this.val$timeUnit = timeUnit;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void run() {
        ExecutorService executorService;
        try {
            executorService = this.val$service;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        executorService.shutdown();
        executorService = this.val$service;
        long l2 = this.val$terminationTimeout;
        TimeUnit timeUnit = this.val$timeUnit;
        executorService.awaitTermination(l2, timeUnit);
    }
}

