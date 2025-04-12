/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.FirebaseExecutors$DirectExecutor;
import com.google.firebase.concurrent.LimitedConcurrencyExecutor;
import com.google.firebase.concurrent.LimitedConcurrencyExecutorService;
import com.google.firebase.concurrent.PausableExecutor;
import com.google.firebase.concurrent.PausableExecutorImpl;
import com.google.firebase.concurrent.PausableExecutorService;
import com.google.firebase.concurrent.PausableExecutorServiceImpl;
import com.google.firebase.concurrent.PausableScheduledExecutorService;
import com.google.firebase.concurrent.PausableScheduledExecutorServiceImpl;
import com.google.firebase.concurrent.SequentialExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public class FirebaseExecutors {
    private FirebaseExecutors() {
    }

    public static Executor directExecutor() {
        return FirebaseExecutors$DirectExecutor.INSTANCE;
    }

    public static Executor newLimitedConcurrencyExecutor(Executor executor, int n3) {
        LimitedConcurrencyExecutor limitedConcurrencyExecutor = new LimitedConcurrencyExecutor(executor, n3);
        return limitedConcurrencyExecutor;
    }

    public static ExecutorService newLimitedConcurrencyExecutorService(ExecutorService executorService, int n3) {
        LimitedConcurrencyExecutorService limitedConcurrencyExecutorService = new LimitedConcurrencyExecutorService(executorService, n3);
        return limitedConcurrencyExecutorService;
    }

    public static ScheduledExecutorService newLimitedConcurrencyScheduledExecutorService(ExecutorService executorService, int n3) {
        executorService = FirebaseExecutors.newLimitedConcurrencyExecutorService(executorService, n3);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)ExecutorsRegistrar.SCHEDULER.get();
        DelegatingScheduledExecutorService delegatingScheduledExecutorService = new DelegatingScheduledExecutorService(executorService, scheduledExecutorService);
        return delegatingScheduledExecutorService;
    }

    public static PausableExecutor newPausableExecutor(Executor executor) {
        PausableExecutorImpl pausableExecutorImpl = new PausableExecutorImpl(false, executor);
        return pausableExecutorImpl;
    }

    public static PausableExecutorService newPausableExecutorService(ExecutorService executorService) {
        PausableExecutorServiceImpl pausableExecutorServiceImpl = new PausableExecutorServiceImpl(false, executorService);
        return pausableExecutorServiceImpl;
    }

    public static PausableScheduledExecutorService newPausableScheduledExecutorService(ScheduledExecutorService executorService) {
        executorService = FirebaseExecutors.newPausableExecutorService(executorService);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)ExecutorsRegistrar.SCHEDULER.get();
        PausableScheduledExecutorServiceImpl pausableScheduledExecutorServiceImpl = new PausableScheduledExecutorServiceImpl((PausableExecutorService)executorService, scheduledExecutorService);
        return pausableScheduledExecutorServiceImpl;
    }

    public static Executor newSequentialExecutor(Executor executor) {
        SequentialExecutor sequentialExecutor = new SequentialExecutor(executor);
        return sequentialExecutor;
    }
}

