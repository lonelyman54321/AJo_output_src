/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class ExecutorUtils$2
extends BackgroundPriorityRunnable {
    final /* synthetic */ ExecutorService val$service;
    final /* synthetic */ String val$serviceName;
    final /* synthetic */ long val$terminationTimeout;
    final /* synthetic */ TimeUnit val$timeUnit;

    public ExecutorUtils$2(String string2, ExecutorService executorService, long l2, TimeUnit timeUnit) {
        this.val$serviceName = string2;
        this.val$service = executorService;
        this.val$terminationTimeout = l2;
        this.val$timeUnit = timeUnit;
    }

    public void onRun() {
        block17: {
            Object object = "Executing shutdown hook for ";
            Object object2 = Logger.getLogger();
            CharSequence charSequence = new StringBuilder((String)object);
            object = this.val$serviceName;
            charSequence.append((String)object);
            object = charSequence.toString();
            ((Logger)object2).d((String)object);
            object = this.val$service;
            object.shutdown();
            object = this.val$service;
            long l2 = this.val$terminationTimeout;
            Object object3 = this.val$timeUnit;
            boolean bl2 = object.awaitTermination(l2, (TimeUnit)((Object)object3));
            if (bl2) break block17;
            object = Logger.getLogger();
            object2 = new StringBuilder();
            charSequence = this.val$serviceName;
            ((StringBuilder)object2).append((String)charSequence);
            charSequence = " did not shut down in the allocated time. Requesting immediate shutdown.";
            ((StringBuilder)object2).append((String)charSequence);
            object2 = ((StringBuilder)object2).toString();
            ((Logger)object).d((String)object2);
            object = this.val$service;
            try {
                object.shutdownNow();
            }
            catch (InterruptedException interruptedException) {
                object = Logger.getLogger();
                object2 = Locale.US;
                object2 = this.val$serviceName;
                object3 = "Interrupted while waiting for ";
                charSequence = new StringBuilder((String)object3);
                charSequence.append((String)object2);
                charSequence.append(" to shut down. Requesting immediate shutdown.");
                object2 = charSequence.toString();
                ((Logger)object).d((String)object2);
                object = this.val$service;
                object.shutdownNow();
            }
        }
    }
}

