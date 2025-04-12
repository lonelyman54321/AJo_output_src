/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Callables;
import com.google.common.util.concurrent.WrappingScheduledExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

class MoreExecutors$4
extends WrappingScheduledExecutorService {
    final /* synthetic */ Supplier val$nameSupplier;

    public MoreExecutors$4(ScheduledExecutorService scheduledExecutorService, Supplier supplier) {
        this.val$nameSupplier = supplier;
        super(scheduledExecutorService);
    }

    public Runnable wrapTask(Runnable runnable2) {
        Supplier supplier = this.val$nameSupplier;
        return Callables.threadRenaming(runnable2, supplier);
    }

    public Callable wrapTask(Callable callable) {
        Supplier supplier = this.val$nameSupplier;
        return Callables.threadRenaming(callable, supplier);
    }
}

