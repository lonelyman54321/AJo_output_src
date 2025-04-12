/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractIdleService$DelegateService;
import com.google.common.util.concurrent.AbstractIdleService$ThreadNameSupplier;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.Service$Listener;
import com.google.common.util.concurrent.Service$State;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class AbstractIdleService
implements Service {
    private final Service delegate;
    private final Supplier threadNameSupplier;

    public AbstractIdleService() {
        Object object = new AbstractIdleService$ThreadNameSupplier(this, null);
        this.threadNameSupplier = object;
        this.delegate = object = new AbstractIdleService$DelegateService(this, null);
    }

    public static /* synthetic */ void a(AbstractIdleService abstractIdleService, Runnable runnable2) {
        abstractIdleService.lambda$executor$0(runnable2);
    }

    public static /* synthetic */ Supplier access$200(AbstractIdleService abstractIdleService) {
        return abstractIdleService.threadNameSupplier;
    }

    private /* synthetic */ void lambda$executor$0(Runnable runnable2) {
        MoreExecutors.newThread((String)this.threadNameSupplier.get(), runnable2).start();
    }

    public final void addListener(Service$Listener service$Listener, Executor executor) {
        this.delegate.addListener(service$Listener, executor);
    }

    public final void awaitRunning() {
        this.delegate.awaitRunning();
    }

    public final void awaitRunning(long l2, TimeUnit timeUnit) {
        this.delegate.awaitRunning(l2, timeUnit);
    }

    public final void awaitTerminated() {
        this.delegate.awaitTerminated();
    }

    public final void awaitTerminated(long l2, TimeUnit timeUnit) {
        this.delegate.awaitTerminated(l2, timeUnit);
    }

    public Executor executor() {
        O0 o0 = new O0(this);
        return o0;
    }

    public final Throwable failureCause() {
        return this.delegate.failureCause();
    }

    public final boolean isRunning() {
        return this.delegate.isRunning();
    }

    public String serviceName() {
        return this.getClass().getSimpleName();
    }

    public abstract void shutDown();

    public final Service startAsync() {
        this.delegate.startAsync();
        return this;
    }

    public abstract void startUp();

    public final Service$State state() {
        return this.delegate.state();
    }

    public final Service stopAsync() {
        this.delegate.stopAsync();
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.serviceName();
        stringBuilder.append((String)object);
        stringBuilder.append(" [");
        object = this.state();
        stringBuilder.append(object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

