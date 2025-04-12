/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractScheduledService;
import com.google.common.util.concurrent.AbstractScheduledService$1;
import com.google.common.util.concurrent.AbstractScheduledService$Cancellable;
import com.google.common.util.concurrent.AbstractScheduledService$Scheduler;
import com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$Task;
import com.google.common.util.concurrent.AbstractService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Platform;
import com.google.common.util.concurrent.Service$State;
import com.google.common.util.concurrent.e;
import com.google.common.util.concurrent.f;
import com.google.common.util.concurrent.g;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;

final class AbstractScheduledService$ServiceDelegate
extends AbstractService {
    private volatile ScheduledExecutorService executorService;
    private final ReentrantLock lock;
    private volatile AbstractScheduledService$Cancellable runningTask;
    private final Runnable task;
    final /* synthetic */ AbstractScheduledService this$0;

    private AbstractScheduledService$ServiceDelegate(AbstractScheduledService object) {
        this.this$0 = object;
        this.lock = object = new ReentrantLock();
        this.task = object = new AbstractScheduledService$ServiceDelegate$Task(this);
    }

    public /* synthetic */ AbstractScheduledService$ServiceDelegate(AbstractScheduledService abstractScheduledService, AbstractScheduledService$1 abstractScheduledService$1) {
        this(abstractScheduledService);
    }

    public static /* synthetic */ String a(AbstractScheduledService$ServiceDelegate abstractScheduledService$ServiceDelegate) {
        return abstractScheduledService$ServiceDelegate.lambda$doStart$0();
    }

    public static /* synthetic */ ReentrantLock access$200(AbstractScheduledService$ServiceDelegate abstractScheduledService$ServiceDelegate) {
        return abstractScheduledService$ServiceDelegate.lock;
    }

    public static /* synthetic */ AbstractScheduledService$Cancellable access$300(AbstractScheduledService$ServiceDelegate abstractScheduledService$ServiceDelegate) {
        return abstractScheduledService$ServiceDelegate.runningTask;
    }

    public static /* synthetic */ void b(AbstractScheduledService$ServiceDelegate abstractScheduledService$ServiceDelegate) {
        abstractScheduledService$ServiceDelegate.lambda$doStart$1();
    }

    public static /* synthetic */ void c(AbstractScheduledService$ServiceDelegate abstractScheduledService$ServiceDelegate) {
        abstractScheduledService$ServiceDelegate.lambda$doStop$2();
    }

    private /* synthetic */ String lambda$doStart$0() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.this$0.serviceName();
        stringBuilder.append((String)object);
        stringBuilder.append(" ");
        object = this.state();
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$doStart$1() {
        Throwable throwable3;
        block5: {
            Object object;
            block4: {
                object = this.lock;
                ((ReentrantLock)object).lock();
                try {
                    object = this.this$0;
                    ((AbstractScheduledService)object).startUp();
                    object = this.executorService;
                    Objects.requireNonNull(object);
                    object = this.this$0;
                    object = ((AbstractScheduledService)object).scheduler();
                    AbstractScheduledService abstractScheduledService = this.this$0;
                    AbstractService abstractService = AbstractScheduledService.access$500(abstractScheduledService);
                    ScheduledExecutorService scheduledExecutorService = this.executorService;
                    Runnable runnable2 = this.task;
                    this.runningTask = object = ((AbstractScheduledService$Scheduler)object).schedule(abstractService, scheduledExecutorService, runnable2);
                    this.notifyStarted();
                }
                catch (Throwable throwable2) {
                    try {
                        Platform.restoreInterruptIfIsInterruptedException(throwable2);
                        this.notifyFailed(throwable2);
                        object = this.runningTask;
                        if (object == null) break block4;
                        object = this.runningTask;
                        Object var2_6 = null;
                        object.cancel(false);
                    }
                    catch (Throwable throwable3) {
                        break block5;
                    }
                }
            }
            object = this.lock;
            ((ReentrantLock)object).unlock();
            return;
        }
        this.lock.unlock();
        throw throwable3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$doStop$2() {
        Object object;
        Throwable throwable2;
        Object object2;
        block7: {
            try {
                object2 = this.lock;
                ((ReentrantLock)object2).lock();
            }
            catch (Throwable throwable2) {}
            object2 = this.state();
            object = Service$State.STOPPING;
            if (object2 == object) break block7;
            object2 = this.lock;
            ((ReentrantLock)object2).unlock();
            return;
        }
        try {
            object2 = this.this$0;
            ((AbstractScheduledService)object2).shutDown();
        }
        catch (Throwable throwable3) {
            object = this.lock;
            ((ReentrantLock)object).unlock();
            throw throwable3;
        }
        object2 = this.lock;
        ((ReentrantLock)object2).unlock();
        this.notifyStopped();
        return;
        Platform.restoreInterruptIfIsInterruptedException(throwable2);
        this.notifyFailed(throwable2);
    }

    public final void doStart() {
        ScheduledExecutorService scheduledExecutorService = this.this$0.executor();
        Object object = new e(this);
        scheduledExecutorService = this.executorService = (scheduledExecutorService = MoreExecutors.renamingDecorator(scheduledExecutorService, (Supplier)object));
        object = new f(this);
        scheduledExecutorService.execute((Runnable)object);
    }

    public final void doStop() {
        Objects.requireNonNull(this.runningTask);
        Objects.requireNonNull(this.executorService);
        this.runningTask.cancel(false);
        ScheduledExecutorService scheduledExecutorService = this.executorService;
        g g3 = new g(this);
        scheduledExecutorService.execute(g3);
    }

    public String toString() {
        return this.this$0.toString();
    }
}

