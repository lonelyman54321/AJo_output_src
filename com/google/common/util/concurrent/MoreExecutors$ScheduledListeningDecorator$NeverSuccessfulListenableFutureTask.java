/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture$TrustedFuture;

final class MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask
extends AbstractFuture$TrustedFuture
implements Runnable {
    private final Runnable delegate;

    public MoreExecutors$ScheduledListeningDecorator$NeverSuccessfulListenableFutureTask(Runnable runnable2) {
        this.delegate = runnable2 = (Runnable)Preconditions.checkNotNull(runnable2);
    }

    public String pendingToString() {
        StringBuilder stringBuilder = new StringBuilder("task=[");
        Runnable runnable2 = this.delegate;
        stringBuilder.append(runnable2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /*
     * WARNING - void declaration
     */
    public void run() {
        void var1_4;
        Runnable runnable2 = this.delegate;
        try {
            runnable2.run();
            return;
        }
        catch (Error error) {
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        this.setException((Throwable)var1_4);
        throw var1_4;
    }
}

