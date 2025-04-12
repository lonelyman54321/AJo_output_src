/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.SimpleTimeLimiter$1;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public final class q
implements Callable {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object[] c;

    public /* synthetic */ q(Object object, Method method, Object[] objectArray) {
        this.a = method;
        this.b = object;
        this.c = objectArray;
    }

    public final Object call() {
        Object object = this.b;
        Object[] objectArray = this.c;
        Method method = this.a;
        return SimpleTimeLimiter$1.a(object, method, objectArray);
    }
}

