/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.SimpleTimeLimiter;
import com.google.common.util.concurrent.q;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.TimeUnit;

class SimpleTimeLimiter$1
implements InvocationHandler {
    final /* synthetic */ SimpleTimeLimiter this$0;
    final /* synthetic */ Set val$interruptibleMethods;
    final /* synthetic */ Object val$target;
    final /* synthetic */ long val$timeoutDuration;
    final /* synthetic */ TimeUnit val$timeoutUnit;

    public SimpleTimeLimiter$1(SimpleTimeLimiter simpleTimeLimiter, Object object, long l2, TimeUnit timeUnit, Set set) {
        this.this$0 = simpleTimeLimiter;
        this.val$target = object;
        this.val$timeoutDuration = l2;
        this.val$timeoutUnit = timeUnit;
        this.val$interruptibleMethods = set;
    }

    public static /* synthetic */ Object a(Object object, Method method, Object[] objectArray) {
        return SimpleTimeLimiter$1.lambda$invoke$0(method, object, objectArray);
    }

    private static /* synthetic */ Object lambda$invoke$0(Method method, Object object, Object[] objectArray) {
        try {
            return method.invoke(object, objectArray);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw SimpleTimeLimiter.access$100(invocationTargetException, false);
        }
    }

    public Object invoke(Object object, Method method, Object[] objectArray) {
        object = this.val$target;
        q q2 = new q(object, method, objectArray);
        SimpleTimeLimiter simpleTimeLimiter = this.this$0;
        long l2 = this.val$timeoutDuration;
        TimeUnit timeUnit = this.val$timeoutUnit;
        boolean bl2 = this.val$interruptibleMethods.contains(method);
        return SimpleTimeLimiter.access$000(simpleTimeLimiter, q2, l2, timeUnit, bl2);
    }
}

