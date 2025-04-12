/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Platform;
import com.google.common.util.concurrent.TimeLimiter;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class FakeTimeLimiter
implements TimeLimiter {
    public Object callUninterruptiblyWithTimeout(Callable callable, long l2, TimeUnit timeUnit) {
        return this.callWithTimeout(callable, l2, timeUnit);
    }

    public Object callWithTimeout(Callable callable, long l2, TimeUnit timeUnit) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull((Object)timeUnit);
        try {
            return callable.call();
        }
        catch (Error error) {
            ExecutionError executionError = new ExecutionError(error);
            throw executionError;
        }
        catch (Exception exception) {
            Platform.restoreInterruptIfIsInterruptedException(exception);
            ExecutionException executionException = new ExecutionException(exception);
            throw executionException;
        }
        catch (RuntimeException runtimeException) {
            UncheckedExecutionException uncheckedExecutionException = new UncheckedExecutionException(runtimeException);
            throw uncheckedExecutionException;
        }
    }

    public Object newProxy(Object object, Class clazz, long l2, TimeUnit timeUnit) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(clazz);
        Preconditions.checkNotNull((Object)timeUnit);
        return object;
    }

    public void runUninterruptiblyWithTimeout(Runnable runnable2, long l2, TimeUnit timeUnit) {
        this.runWithTimeout(runnable2, l2, timeUnit);
    }

    public void runWithTimeout(Runnable runnable2, long l2, TimeUnit timeUnit) {
        Preconditions.checkNotNull(runnable2);
        Preconditions.checkNotNull((Object)timeUnit);
        try {
            runnable2.run();
            return;
        }
        catch (Error error) {
            ExecutionError executionError = new ExecutionError(error);
            throw executionError;
        }
        catch (RuntimeException runtimeException) {
            UncheckedExecutionException uncheckedExecutionException = new UncheckedExecutionException(runtimeException);
            throw uncheckedExecutionException;
        }
    }
}

