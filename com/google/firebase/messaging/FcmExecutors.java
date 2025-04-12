/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.threads.ExecutorFactory;
import com.google.firebase.messaging.threads.PoolableExecutors;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class FcmExecutors {
    private static final String THREAD_FILE = "Firebase-Messaging-File";
    static final String THREAD_FILE_IO = "Firebase-Messaging-File-Io";
    private static final String THREAD_INIT = "Firebase-Messaging-Init";
    private static final String THREAD_INTENT_HANDLE = "Firebase-Messaging-Intent-Handle";
    private static final String THREAD_NETWORK_IO = "Firebase-Messaging-Network-Io";
    static final String THREAD_RPC_TASK = "Firebase-Messaging-Rpc-Task";
    private static final String THREAD_TASK = "Firebase-Messaging-Task";
    private static final String THREAD_TOPICS_IO = "Firebase-Messaging-Topics-Io";

    private FcmExecutors() {
    }

    private static Executor newCachedSingleThreadExecutor(String string2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory(string2);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long)30, timeUnit, linkedBlockingQueue, namedThreadFactory);
        return threadPoolExecutor;
    }

    public static ExecutorService newFileExecutor() {
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory(THREAD_FILE);
        return Executors.newSingleThreadExecutor(namedThreadFactory);
    }

    public static Executor newFileIOExecutor() {
        return FcmExecutors.newCachedSingleThreadExecutor(THREAD_FILE_IO);
    }

    public static ScheduledExecutorService newInitExecutor() {
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory(THREAD_INIT);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, namedThreadFactory);
        return scheduledThreadPoolExecutor;
    }

    public static ExecutorService newIntentHandleExecutor() {
        ExecutorFactory executorFactory = PoolableExecutors.factory();
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory(THREAD_INTENT_HANDLE);
        ThreadPriority threadPriority = ThreadPriority.HIGH_SPEED;
        return executorFactory.newSingleThreadExecutor(namedThreadFactory, threadPriority);
    }

    public static ExecutorService newNetworkIOExecutor() {
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory(THREAD_NETWORK_IO);
        return Executors.newSingleThreadExecutor(namedThreadFactory);
    }

    public static Executor newRpcTasksExecutor() {
        return FcmExecutors.newCachedSingleThreadExecutor(THREAD_RPC_TASK);
    }

    public static ExecutorService newTaskExecutor() {
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory(THREAD_TASK);
        return Executors.newSingleThreadExecutor(namedThreadFactory);
    }

    public static ScheduledExecutorService newTopicsSyncExecutor() {
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory(THREAD_TOPICS_IO);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, namedThreadFactory);
        return scheduledThreadPoolExecutor;
    }
}

