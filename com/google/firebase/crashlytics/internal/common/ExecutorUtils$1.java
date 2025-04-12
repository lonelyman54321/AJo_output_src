/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.ExecutorUtils$1$1;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

class ExecutorUtils$1
implements ThreadFactory {
    final /* synthetic */ AtomicLong val$count;
    final /* synthetic */ String val$threadNameTemplate;

    public ExecutorUtils$1(String string2, AtomicLong atomicLong) {
        this.val$threadNameTemplate = string2;
        this.val$count = atomicLong;
    }

    public Thread newThread(Runnable runnable2) {
        Object object = Executors.defaultThreadFactory();
        Object object2 = new ExecutorUtils$1$1(this, runnable2);
        runnable2 = object.newThread((Runnable)object2);
        object = new StringBuilder();
        object2 = this.val$threadNameTemplate;
        ((StringBuilder)object).append((String)object2);
        long l2 = this.val$count.getAndIncrement();
        ((StringBuilder)object).append(l2);
        object = ((StringBuilder)object).toString();
        ((Thread)runnable2).setName((String)object);
        return runnable2;
    }
}

