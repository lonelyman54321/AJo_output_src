/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging.threads;

import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public interface ExecutorFactory {
    public void executeOneOff(String var1, String var2, ThreadPriority var3, Runnable var4);

    public ScheduledExecutorService newScheduledThreadPool(int var1, ThreadPriority var2);

    public ScheduledExecutorService newScheduledThreadPool(int var1, ThreadFactory var2, ThreadPriority var3);

    public ExecutorService newSingleThreadExecutor(ThreadPriority var1);

    public ExecutorService newSingleThreadExecutor(ThreadFactory var1, ThreadPriority var2);

    public ExecutorService newThreadPool(int var1, ThreadPriority var2);

    public ExecutorService newThreadPool(int var1, ThreadFactory var2, ThreadPriority var3);

    public ExecutorService newThreadPool(ThreadPriority var1);

    public ExecutorService newThreadPool(ThreadFactory var1, ThreadPriority var2);

    public Future submitOneOff(String var1, String var2, ThreadPriority var3, Runnable var4);
}

