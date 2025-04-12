/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.executors;

import com.affise.attribution.executors.ExecutorServiceProvider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

public final class ExecutorServiceProviderImpl
implements ExecutorServiceProvider {
    private final ExecutorService executor;
    private final String threadName;

    public ExecutorServiceProviderImpl(String object) {
        Intrinsics.checkNotNullParameter(object, "threadName");
        this.threadName = object;
        this.executor = object = Executors.newSingleThreadExecutor();
    }

    public ExecutorService provideExecutorService() {
        ExecutorService executorService = this.executor;
        Intrinsics.checkNotNullExpressionValue(executorService, "executor");
        return executorService;
    }
}

