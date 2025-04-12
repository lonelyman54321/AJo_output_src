/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.ExecutionModule;
import com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory$InstanceHolder;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import java.util.concurrent.Executor;

public final class ExecutionModule_ExecutorFactory
implements Factory {
    public static ExecutionModule_ExecutorFactory create() {
        return ExecutionModule_ExecutorFactory$InstanceHolder.access$000();
    }

    public static Executor executor() {
        return (Executor)Preconditions.checkNotNullFromProvides(ExecutionModule.executor());
    }

    public Executor get() {
        return ExecutionModule_ExecutorFactory.executor();
    }
}

