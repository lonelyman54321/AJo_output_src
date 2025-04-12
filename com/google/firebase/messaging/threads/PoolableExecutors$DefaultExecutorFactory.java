/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging.threads;

import com.google.firebase.messaging.threads.ExecutorFactory;
import com.google.firebase.messaging.threads.PoolableExecutors$1;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class PoolableExecutors$DefaultExecutorFactory
implements ExecutorFactory {
    private static final long CORE_THREAD_TIMEOUT_SECS = 60L;

    private PoolableExecutors$DefaultExecutorFactory() {
    }

    public /* synthetic */ PoolableExecutors$DefaultExecutorFactory(PoolableExecutors$1 poolableExecutors$1) {
        this();
    }

    public void executeOneOff(String object, String string2, ThreadPriority threadPriority, Runnable runnable2) {
        object = new Thread(runnable2, string2);
        ((Thread)object).start();
    }

    public ScheduledExecutorService newScheduledThreadPool(int n3, ThreadPriority threadPriority) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(n3));
    }

    public ScheduledExecutorService newScheduledThreadPool(int n3, ThreadFactory threadFactory, ThreadPriority threadPriority) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(n3, threadFactory));
    }

    public ExecutorService newSingleThreadExecutor(ThreadPriority threadPriority) {
        return this.newThreadPool(1, threadPriority);
    }

    public ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory, ThreadPriority threadPriority) {
        return this.newThreadPool(1, threadFactory, threadPriority);
    }

    public ExecutorService newThreadPool(int n3, ThreadPriority threadPriority) {
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        return this.newThreadPool(n3, threadFactory, threadPriority);
    }

    public ExecutorService newThreadPool(int n3, ThreadFactory threadFactory, ThreadPriority object) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        object = new ThreadPoolExecutor(n3, n3, (long)60, timeUnit, linkedBlockingQueue, threadFactory);
        ((ThreadPoolExecutor)object).allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService((ExecutorService)object);
    }

    public ExecutorService newThreadPool(ThreadPriority threadPriority) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    public ExecutorService newThreadPool(ThreadFactory threadFactory, ThreadPriority threadPriority) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory));
    }

    public Future submitOneOff(String futureTask, String string2, ThreadPriority object, Runnable runnable2) {
        futureTask = new FutureTask<Object>(runnable2, null);
        object = new Thread(futureTask, string2);
        ((Thread)object).start();
        return futureTask;
    }
}

