/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.TimeoutFuture$1;
import java.util.concurrent.TimeoutException;

final class TimeoutFuture$TimeoutFutureException
extends TimeoutException {
    private TimeoutFuture$TimeoutFutureException(String string2) {
        super(string2);
    }

    public /* synthetic */ TimeoutFuture$TimeoutFutureException(String string2, TimeoutFuture$1 timeoutFuture$1) {
        this(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Throwable fillInStackTrace() {
        synchronized (this) {
            StackTraceElement[] stackTraceElementArray = null;
            stackTraceElementArray = new StackTraceElement[]{};
            this.setStackTrace(stackTraceElementArray);
            return this;
        }
    }
}

