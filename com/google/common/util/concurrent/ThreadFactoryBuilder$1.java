/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

class ThreadFactoryBuilder$1
implements ThreadFactory {
    final /* synthetic */ ThreadFactory val$backingThreadFactory;
    final /* synthetic */ AtomicLong val$count;
    final /* synthetic */ Boolean val$daemon;
    final /* synthetic */ String val$nameFormat;
    final /* synthetic */ Integer val$priority;
    final /* synthetic */ Thread.UncaughtExceptionHandler val$uncaughtExceptionHandler;

    public ThreadFactoryBuilder$1(ThreadFactory threadFactory, String string2, AtomicLong atomicLong, Boolean bl2, Integer n3, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.val$backingThreadFactory = threadFactory;
        this.val$nameFormat = string2;
        this.val$count = atomicLong;
        this.val$daemon = bl2;
        this.val$priority = n3;
        this.val$uncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    public Thread newThread(Runnable runnable2) {
        runnable2 = this.val$backingThreadFactory.newThread(runnable2);
        Objects.requireNonNull(runnable2);
        Object object = this.val$nameFormat;
        if (object != null) {
            Number number = this.val$count;
            Objects.requireNonNull(number);
            long l2 = number.getAndIncrement();
            number = l2;
            int n4 = 1;
            Object[] objectArray = new Object[n4];
            objectArray[0] = number;
            object = ThreadFactoryBuilder.access$000((String)object, objectArray);
            ((Thread)runnable2).setName((String)object);
        }
        if ((object = this.val$daemon) != null) {
            boolean n3 = (Boolean)object;
            ((Thread)runnable2).setDaemon(n3);
        }
        if ((object = this.val$priority) != null) {
            int n3 = (Integer)object;
            ((Thread)runnable2).setPriority(n3);
        }
        if ((object = this.val$uncaughtExceptionHandler) != null) {
            ((Thread)runnable2).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)object);
        }
        return runnable2;
    }
}

