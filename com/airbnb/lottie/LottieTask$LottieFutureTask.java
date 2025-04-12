/*
 * Decompiled with CFR 0.152.
 */
package com.airbnb.lottie;

import com.airbnb.lottie.LottieTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

class LottieTask$LottieFutureTask
extends FutureTask {
    public LottieTask a;

    public LottieTask$LottieFutureTask() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void done() {
        try {
            block7: {
                ExecutorService executorService;
                boolean bl2 = this.isCancelled();
                if (bl2) {
                    this.a = null;
                    return;
                }
                try {
                    LottieTask lottieTask = this.a;
                    Object object = this.get();
                    object = (HC1)object;
                    ExecutorService executorService2 = LottieTask.e;
                    lottieTask.f((HC1)object);
                    break block7;
                }
                catch (ExecutionException executionException) {
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                LottieTask lottieTask = this.a;
                HC1 hC1 = new HC1((Throwable)((Object)executorService));
                executorService = LottieTask.e;
                lottieTask.f(hC1);
            }
            this.a = null;
            return;
        }
        catch (Throwable throwable2) {}
        this.a = null;
        throw throwable2;
    }
}

