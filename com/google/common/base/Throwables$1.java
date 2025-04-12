/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Throwables;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.Objects;

class Throwables$1
extends AbstractList {
    final /* synthetic */ Throwable val$t;

    public Throwables$1(Throwable throwable) {
        this.val$t = throwable;
    }

    public StackTraceElement get(int n3) {
        Method method = Throwables.access$000();
        Objects.requireNonNull(method);
        Object object = Throwables.access$100();
        Objects.requireNonNull(object);
        Throwable throwable = this.val$t;
        Integer n4 = n3;
        Object[] objectArray = new Object[]{throwable, n4};
        return (StackTraceElement)Throwables.access$200(method, object, objectArray);
    }

    public int size() {
        Method method = Throwables.access$300();
        Objects.requireNonNull(method);
        Object object = Throwables.access$100();
        Objects.requireNonNull(object);
        Throwable throwable = this.val$t;
        Object[] objectArray = new Object[]{throwable};
        return (Integer)Throwables.access$200(method, object, objectArray);
    }
}

