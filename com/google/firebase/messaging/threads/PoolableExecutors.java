/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging.threads;

import com.google.firebase.messaging.threads.ExecutorFactory;
import com.google.firebase.messaging.threads.PoolableExecutors$DefaultExecutorFactory;

public class PoolableExecutors {
    private static final ExecutorFactory DEFAULT_INSTANCE;
    private static volatile ExecutorFactory instance;

    static {
        PoolableExecutors$DefaultExecutorFactory poolableExecutors$DefaultExecutorFactory = new PoolableExecutors$DefaultExecutorFactory(null);
        DEFAULT_INSTANCE = poolableExecutors$DefaultExecutorFactory;
        instance = poolableExecutors$DefaultExecutorFactory;
    }

    private PoolableExecutors() {
    }

    public static ExecutorFactory factory() {
        return instance;
    }

    public static void installExecutorFactory(ExecutorFactory object) {
        ExecutorFactory executorFactory = instance;
        ExecutorFactory executorFactory2 = DEFAULT_INSTANCE;
        if (executorFactory == executorFactory2) {
            instance = object;
            return;
        }
        object = new IllegalStateException("Trying to install an ExecutorFactory twice!");
        throw object;
    }
}

