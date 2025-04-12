/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.SimpleTimeLimiter$1;
import com.google.common.util.concurrent.TimeLimiter;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.UncheckedTimeoutException;
import com.google.common.util.concurrent.Uninterruptibles;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class SimpleTimeLimiter
implements TimeLimiter {
    private final ExecutorService executor;

    private SimpleTimeLimiter(ExecutorService executorService) {
        this.executor = executorService = (ExecutorService)Preconditions.checkNotNull(executorService);
    }

    public static /* synthetic */ Object access$000(SimpleTimeLimiter simpleTimeLimiter, Callable callable, long l2, TimeUnit timeUnit, boolean bl2) {
        return simpleTimeLimiter.callWithTimeout(callable, l2, timeUnit, bl2);
    }

    public static /* synthetic */ Exception access$100(Exception exception, boolean bl2) {
        return SimpleTimeLimiter.throwCause(exception, bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Object callWithTimeout(Callable object, long l2, TimeUnit timeUnit, boolean bl2) {
        InterruptedException interruptedException2;
        boolean bl3;
        block4: {
            Preconditions.checkNotNull(object);
            Preconditions.checkNotNull((Object)timeUnit);
            SimpleTimeLimiter.checkPositiveTimeout(l2);
            ExecutorService executorService = this.executor;
            object = executorService.submit(object);
            bl3 = true;
            if (!bl2) return Uninterruptibles.getUninterruptibly((Future)object, l2, timeUnit);
            try {
                return object.get(l2, timeUnit);
            }
            catch (TimeoutException timeoutException) {
            }
            catch (ExecutionException executionException) {
                throw SimpleTimeLimiter.throwCause(executionException, bl3);
            }
            catch (InterruptedException interruptedException2) {
                break block4;
            }
            object.cancel(bl3);
            object = new UncheckedTimeoutException(timeoutException);
            throw object;
        }
        object.cancel(bl3);
        throw interruptedException2;
    }

    private static void checkPositiveTimeout(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        Preconditions.checkArgument(bl2, "timeout must be positive: %s", l2);
    }

    public static SimpleTimeLimiter create(ExecutorService executorService) {
        SimpleTimeLimiter simpleTimeLimiter = new SimpleTimeLimiter(executorService);
        return simpleTimeLimiter;
    }

    private static boolean declaresInterruptedEx(Method classArray) {
        for (Class<?> clazz : classArray.getExceptionTypes()) {
            Class<InterruptedException> clazz2 = InterruptedException.class;
            if (clazz != clazz2) continue;
            return true;
        }
        return false;
    }

    private static Set findInterruptibleMethods(Class methodArray) {
        HashSet hashSet = Sets.newHashSet();
        for (Method method : methodArray.getMethods()) {
            boolean bl2 = SimpleTimeLimiter.declaresInterruptedEx(method);
            if (!bl2) continue;
            hashSet.add(method);
        }
        return hashSet;
    }

    private static Object newProxy(Class clazz, InvocationHandler object) {
        ClassLoader classLoader = clazz.getClassLoader();
        Class[] classArray = new Class[]{clazz};
        object = Proxy.newProxyInstance(classLoader, classArray, (InvocationHandler)object);
        return clazz.cast(object);
    }

    private static Exception throwCause(Exception exception, boolean bl2) {
        Throwable throwable = exception.getCause();
        if (throwable != null) {
            if (bl2) {
                Object[] objectArray = throwable.getStackTrace();
                Object[] objectArray2 = exception.getStackTrace();
                Class<StackTraceElement> clazz = StackTraceElement.class;
                objectArray = (StackTraceElement[])ObjectArrays.concat(objectArray, objectArray2, clazz);
                throwable.setStackTrace((StackTraceElement[])objectArray);
            }
            if (!(bl2 = throwable instanceof Exception)) {
                bl2 = throwable instanceof Error;
                if (bl2) {
                    throw (Error)throwable;
                }
                throw exception;
            }
            throw (Exception)throwable;
        }
        throw exception;
    }

    private void wrapAndThrowExecutionExceptionOrError(Throwable throwable) {
        boolean bl2 = throwable instanceof Error;
        if (!bl2) {
            bl2 = throwable instanceof RuntimeException;
            if (bl2) {
                UncheckedExecutionException uncheckedExecutionException = new UncheckedExecutionException(throwable);
                throw uncheckedExecutionException;
            }
            ExecutionException executionException = new ExecutionException(throwable);
            throw executionException;
        }
        throwable = (Error)throwable;
        ExecutionError executionError = new ExecutionError((Error)throwable);
        throw executionError;
    }

    private void wrapAndThrowRuntimeExecutionExceptionOrError(Throwable throwable) {
        boolean bl2 = throwable instanceof Error;
        if (bl2) {
            throwable = (Error)throwable;
            ExecutionError executionError = new ExecutionError((Error)throwable);
            throw executionError;
        }
        UncheckedExecutionException uncheckedExecutionException = new UncheckedExecutionException(throwable);
        throw uncheckedExecutionException;
    }

    public Object callUninterruptiblyWithTimeout(Callable object, long l2, TimeUnit timeUnit) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull((Object)timeUnit);
        SimpleTimeLimiter.checkPositiveTimeout(l2);
        ExecutorService executorService = this.executor;
        object = executorService.submit(object);
        try {
            return Uninterruptibles.getUninterruptibly((Future)object, l2, timeUnit);
        }
        catch (ExecutionException executionException) {
            object = executionException.getCause();
            this.wrapAndThrowExecutionExceptionOrError((Throwable)object);
            object = new AssertionError();
            throw object;
        }
        catch (TimeoutException timeoutException) {
            object.cancel(true);
            throw timeoutException;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Object callWithTimeout(Callable object, long l2, TimeUnit timeUnit) {
        void var6_7;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull((Object)timeUnit);
        SimpleTimeLimiter.checkPositiveTimeout(l2);
        ExecutorService executorService = this.executor;
        object = executorService.submit(object);
        try {
            return object.get(l2, timeUnit);
        }
        catch (ExecutionException executionException) {
            object = executionException.getCause();
            this.wrapAndThrowExecutionExceptionOrError((Throwable)object);
            object = new AssertionError();
            throw object;
        }
        catch (TimeoutException timeoutException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        object.cancel(true);
        throw var6_7;
    }

    public Object newProxy(Object object, Class clazz, long l2, TimeUnit timeUnit) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(clazz);
        Preconditions.checkNotNull((Object)timeUnit);
        SimpleTimeLimiter.checkPositiveTimeout(l2);
        Preconditions.checkArgument(clazz.isInterface(), "interfaceType must be an interface type");
        Set set = SimpleTimeLimiter.findInterruptibleMethods(clazz);
        SimpleTimeLimiter$1 simpleTimeLimiter$1 = new SimpleTimeLimiter$1(this, object, l2, timeUnit, set);
        return SimpleTimeLimiter.newProxy(clazz, simpleTimeLimiter$1);
    }

    public void runUninterruptiblyWithTimeout(Runnable object, long l2, TimeUnit timeUnit) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull((Object)timeUnit);
        SimpleTimeLimiter.checkPositiveTimeout(l2);
        ExecutorService executorService = this.executor;
        object = executorService.submit((Runnable)object);
        try {
            Uninterruptibles.getUninterruptibly((Future)object, l2, timeUnit);
            return;
        }
        catch (ExecutionException executionException) {
            object = executionException.getCause();
            this.wrapAndThrowRuntimeExecutionExceptionOrError((Throwable)object);
            object = new AssertionError();
            throw object;
        }
        catch (TimeoutException timeoutException) {
            object.cancel(true);
            throw timeoutException;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void runWithTimeout(Runnable object, long l2, TimeUnit timeUnit) {
        void var6_7;
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull((Object)timeUnit);
        SimpleTimeLimiter.checkPositiveTimeout(l2);
        ExecutorService executorService = this.executor;
        object = executorService.submit((Runnable)object);
        try {
            object.get(l2, timeUnit);
            return;
        }
        catch (ExecutionException executionException) {
            object = executionException.getCause();
            this.wrapAndThrowRuntimeExecutionExceptionOrError((Throwable)object);
            object = new AssertionError();
            throw object;
        }
        catch (TimeoutException timeoutException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        object.cancel(true);
        throw var6_7;
    }
}

