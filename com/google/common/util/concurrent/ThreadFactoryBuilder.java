/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ThreadFactoryBuilder$1;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class ThreadFactoryBuilder {
    private ThreadFactory backingThreadFactory = null;
    private Boolean daemon = null;
    private String nameFormat = null;
    private Integer priority = null;
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;

    public static /* synthetic */ String access$000(String string2, Object[] objectArray) {
        return ThreadFactoryBuilder.format(string2, objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static ThreadFactory doBuild(ThreadFactoryBuilder object) {
        String string2 = ((ThreadFactoryBuilder)object).nameFormat;
        Boolean bl2 = ((ThreadFactoryBuilder)object).daemon;
        Integer n3 = ((ThreadFactoryBuilder)object).priority;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = ((ThreadFactoryBuilder)object).uncaughtExceptionHandler;
        object = ((ThreadFactoryBuilder)object).backingThreadFactory;
        if (object == null) {
            object = Executors.defaultThreadFactory();
        }
        Object object2 = object;
        if (string2 != null) {
            long l2 = 0L;
            object = new AtomicLong(l2);
        } else {
            object = null;
        }
        Object object3 = object;
        return new ThreadFactoryBuilder$1((ThreadFactory)object2, string2, (AtomicLong)object3, bl2, n3, uncaughtExceptionHandler);
    }

    private static String format(String string2, Object ... objectArray) {
        return String.format(Locale.ROOT, string2, objectArray);
    }

    public ThreadFactory build() {
        return ThreadFactoryBuilder.doBuild(this);
    }

    public ThreadFactoryBuilder setDaemon(boolean bl2) {
        Boolean bl3;
        this.daemon = bl3 = Boolean.valueOf(bl2);
        return this;
    }

    public ThreadFactoryBuilder setNameFormat(String string2) {
        Integer n3 = 0;
        Object[] objectArray = new Object[]{n3};
        ThreadFactoryBuilder.format(string2, objectArray);
        this.nameFormat = string2;
        return this;
    }

    public ThreadFactoryBuilder setPriority(int n3) {
        Integer n4;
        boolean bl2 = false;
        int n7 = 1;
        int n8 = n3 >= n7 ? 1 : 0;
        String string2 = "Thread priority (%s) must be >= %s";
        Preconditions.checkArgument(n8 != 0, string2, n3, n7);
        n8 = 10;
        if (n3 <= n8) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "Thread priority (%s) must be <= %s", n3, n8);
        this.priority = n4 = Integer.valueOf(n3);
        return this;
    }

    public ThreadFactoryBuilder setThreadFactory(ThreadFactory threadFactory) {
        this.backingThreadFactory = threadFactory = (ThreadFactory)Preconditions.checkNotNull(threadFactory);
        return this;
    }

    public ThreadFactoryBuilder setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler)Preconditions.checkNotNull(uncaughtExceptionHandler);
        return this;
    }
}

