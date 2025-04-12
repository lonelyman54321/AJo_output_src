/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractExecutionThreadService$1;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.Service$Listener;
import com.google.common.util.concurrent.Service$State;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public abstract class AbstractExecutionThreadService
implements Service {
    private static final Logger logger = Logger.getLogger(AbstractExecutionThreadService.class.getName());
    private final Service delegate;

    public AbstractExecutionThreadService() {
        AbstractExecutionThreadService$1 abstractExecutionThreadService$1 = new AbstractExecutionThreadService$1(this);
        this.delegate = abstractExecutionThreadService$1;
    }

    public static /* synthetic */ void a(AbstractExecutionThreadService abstractExecutionThreadService, Runnable runnable2) {
        abstractExecutionThreadService.lambda$executor$0(runnable2);
    }

    public static /* synthetic */ Logger access$000() {
        return logger;
    }

    private /* synthetic */ void lambda$executor$0(Runnable runnable2) {
        MoreExecutors.newThread(this.serviceName(), runnable2).start();
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
        L0 l0 = new L0(this);
        return l0;
    }

    public final Throwable failureCause() {
        return this.delegate.failureCause();
    }

    public final boolean isRunning() {
        return this.delegate.isRunning();
    }

    public abstract void run();

    public String serviceName() {
        return this.getClass().getSimpleName();
    }

    public void shutDown() {
    }

    public final Service startAsync() {
        this.delegate.startAsync();
        return this;
    }

    public void startUp() {
    }

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

    public void triggerShutdown() {
    }
}

