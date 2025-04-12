/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import com.google.firebase.concurrent.a;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

class CustomThreadFactory
implements ThreadFactory {
    private static final ThreadFactory DEFAULT = Executors.defaultThreadFactory();
    private final String namePrefix;
    private final StrictMode.ThreadPolicy policy;
    private final int priority;
    private final AtomicLong threadCount;

    public CustomThreadFactory(String string2, int n3, StrictMode.ThreadPolicy threadPolicy) {
        AtomicLong atomicLong;
        this.threadCount = atomicLong = new AtomicLong();
        this.namePrefix = string2;
        this.priority = n3;
        this.policy = threadPolicy;
    }

    public static /* synthetic */ void a(CustomThreadFactory customThreadFactory, Runnable runnable2) {
        customThreadFactory.lambda$newThread$0(runnable2);
    }

    private /* synthetic */ void lambda$newThread$0(Runnable runnable2) {
        int n3 = this.priority;
        Process.setThreadPriority((int)n3);
        StrictMode.ThreadPolicy threadPolicy = this.policy;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
        runnable2.run();
    }

    public Thread newThread(Runnable runnable2) {
        Object object = DEFAULT;
        a a2 = new a(this, runnable2);
        runnable2 = object.newThread(a2);
        object = Locale.ROOT;
        object = this.namePrefix;
        long l2 = this.threadCount.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(" Thread #");
        stringBuilder.append(l2);
        object = stringBuilder.toString();
        ((Thread)runnable2).setName((String)object);
        return runnable2;
    }
}

