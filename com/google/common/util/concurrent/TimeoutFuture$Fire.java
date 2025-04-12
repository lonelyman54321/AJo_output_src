/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.TimeoutFuture;
import com.google.common.util.concurrent.TimeoutFuture$TimeoutFutureException;
import java.util.concurrent.TimeUnit;

final class TimeoutFuture$Fire
implements Runnable {
    TimeoutFuture timeoutFutureRef;

    public TimeoutFuture$Fire(TimeoutFuture timeoutFuture) {
        this.timeoutFutureRef = timeoutFuture;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        Throwable throwable3;
        Throwable throwable22;
        String string2;
        Object object;
        boolean bl2;
        ListenableFuture listenableFuture;
        TimeoutFuture timeoutFuture;
        block10: {
            CharSequence charSequence;
            block9: {
                charSequence = "Timed out (timeout delayed by ";
                timeoutFuture = this.timeoutFutureRef;
                if (timeoutFuture == null) {
                    return;
                }
                listenableFuture = TimeoutFuture.access$000(timeoutFuture);
                if (listenableFuture == null) {
                    return;
                }
                this.timeoutFutureRef = null;
                bl2 = listenableFuture.isDone();
                if (bl2) {
                    timeoutFuture.setFuture(listenableFuture);
                    return;
                }
                bl2 = true;
                try {
                    object = TimeoutFuture.access$100(timeoutFuture);
                    TimeoutFuture.access$102(timeoutFuture, null);
                    string2 = "Timed out";
                    if (object == null) break block9;
                }
                catch (Throwable throwable22) {}
                try {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long l2 = object.getDelay(timeUnit);
                    l2 = Math.abs(l2);
                    long l3 = 10;
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 <= 0) break block9;
                    object = new StringBuilder((String)charSequence);
                    ((StringBuilder)object).append(l2);
                    charSequence = " ms after scheduled time)";
                    ((StringBuilder)object).append((String)charSequence);
                    string2 = ((StringBuilder)object).toString();
                }
                catch (Throwable throwable3) {
                    break block10;
                }
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            object = ": ";
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(listenableFuture);
            charSequence = ((StringBuilder)charSequence).toString();
            object = new TimeoutFuture$TimeoutFutureException((String)charSequence, null);
            timeoutFuture.setException((Throwable)object);
            listenableFuture.cancel(bl2);
            return;
        }
        object = new TimeoutFuture$TimeoutFutureException(string2, null);
        timeoutFuture.setException((Throwable)object);
        throw throwable3;
        listenableFuture.cancel(bl2);
        throw throwable22;
    }
}

