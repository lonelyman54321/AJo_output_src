/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Callables;
import java.util.concurrent.Executor;

class MoreExecutors$2
implements Executor {
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ Supplier val$nameSupplier;

    public MoreExecutors$2(Executor executor, Supplier supplier) {
        this.val$executor = executor;
        this.val$nameSupplier = supplier;
    }

    public void execute(Runnable runnable2) {
        Executor executor = this.val$executor;
        Supplier supplier = this.val$nameSupplier;
        runnable2 = Callables.threadRenaming(runnable2, supplier);
        executor.execute(runnable2);
    }
}

