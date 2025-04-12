/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractIdleService;
import com.google.common.util.concurrent.AbstractIdleService$1;
import com.google.common.util.concurrent.AbstractService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Platform;
import com.google.common.util.concurrent.c;
import com.google.common.util.concurrent.d;
import java.util.concurrent.Executor;

final class AbstractIdleService$DelegateService
extends AbstractService {
    final /* synthetic */ AbstractIdleService this$0;

    private AbstractIdleService$DelegateService(AbstractIdleService abstractIdleService) {
        this.this$0 = abstractIdleService;
    }

    public /* synthetic */ AbstractIdleService$DelegateService(AbstractIdleService abstractIdleService, AbstractIdleService$1 abstractIdleService$1) {
        this(abstractIdleService);
    }

    public static /* synthetic */ void a(AbstractIdleService$DelegateService abstractIdleService$DelegateService) {
        abstractIdleService$DelegateService.lambda$doStop$1();
    }

    public static /* synthetic */ void b(AbstractIdleService$DelegateService abstractIdleService$DelegateService) {
        abstractIdleService$DelegateService.lambda$doStart$0();
    }

    private /* synthetic */ void lambda$doStart$0() {
        AbstractIdleService abstractIdleService = this.this$0;
        try {
            abstractIdleService.startUp();
            this.notifyStarted();
        }
        catch (Throwable throwable) {
            Platform.restoreInterruptIfIsInterruptedException(throwable);
            this.notifyFailed(throwable);
        }
    }

    private /* synthetic */ void lambda$doStop$1() {
        AbstractIdleService abstractIdleService = this.this$0;
        try {
            abstractIdleService.shutDown();
            this.notifyStopped();
        }
        catch (Throwable throwable) {
            Platform.restoreInterruptIfIsInterruptedException(throwable);
            this.notifyFailed(throwable);
        }
    }

    public final void doStart() {
        Executor executor = this.this$0.executor();
        Object object = AbstractIdleService.access$200(this.this$0);
        executor = MoreExecutors.renamingDecorator(executor, (Supplier)object);
        object = new d(this);
        executor.execute((Runnable)object);
    }

    public final void doStop() {
        Executor executor = this.this$0.executor();
        Object object = AbstractIdleService.access$200(this.this$0);
        executor = MoreExecutors.renamingDecorator(executor, (Supplier)object);
        object = new c(this);
        executor.execute((Runnable)object);
    }

    public String toString() {
        return this.this$0.toString();
    }
}

