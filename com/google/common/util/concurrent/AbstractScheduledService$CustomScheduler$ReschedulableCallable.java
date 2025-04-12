/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractScheduledService$Cancellable;
import com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler;
import com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$Schedule;
import com.google.common.util.concurrent.AbstractScheduledService$CustomScheduler$SupplantableFuture;
import com.google.common.util.concurrent.AbstractScheduledService$FutureAsCancellable;
import com.google.common.util.concurrent.AbstractService;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.Platform;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

final class AbstractScheduledService$CustomScheduler$ReschedulableCallable
implements Callable {
    private AbstractScheduledService$CustomScheduler$SupplantableFuture cancellationDelegate;
    private final ScheduledExecutorService executor;
    private final ReentrantLock lock;
    private final AbstractService service;
    final /* synthetic */ AbstractScheduledService$CustomScheduler this$0;
    private final Runnable wrappedRunnable;

    public AbstractScheduledService$CustomScheduler$ReschedulableCallable(AbstractScheduledService$CustomScheduler object, AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable2) {
        this.this$0 = object;
        this.lock = object = new ReentrantLock();
        this.wrappedRunnable = runnable2;
        this.executor = scheduledExecutorService;
        this.service = abstractService;
    }

    private AbstractScheduledService$Cancellable initializeOrUpdateCancellationDelegate(AbstractScheduledService$CustomScheduler$Schedule object) {
        Object object2 = this.cancellationDelegate;
        if (object2 == null) {
            ReentrantLock reentrantLock = this.lock;
            object = this.submitToExecutor((AbstractScheduledService$CustomScheduler$Schedule)object);
            this.cancellationDelegate = object2 = new AbstractScheduledService$CustomScheduler$SupplantableFuture(reentrantLock, (Future)object);
            return object2;
        }
        boolean bl2 = (object2 = AbstractScheduledService$CustomScheduler$SupplantableFuture.access$600((AbstractScheduledService$CustomScheduler$SupplantableFuture)object2)).isCancelled();
        if (!bl2) {
            object2 = this.cancellationDelegate;
            object = this.submitToExecutor((AbstractScheduledService$CustomScheduler$Schedule)object);
            AbstractScheduledService$CustomScheduler$SupplantableFuture.access$602((AbstractScheduledService$CustomScheduler$SupplantableFuture)object2, (Future)object);
        }
        return this.cancellationDelegate;
    }

    private ScheduledFuture submitToExecutor(AbstractScheduledService$CustomScheduler$Schedule object) {
        ScheduledExecutorService scheduledExecutorService = this.executor;
        long l2 = AbstractScheduledService$CustomScheduler$Schedule.access$700(object);
        object = AbstractScheduledService$CustomScheduler$Schedule.access$800(object);
        return scheduledExecutorService.schedule(this, l2, (TimeUnit)((Object)object));
    }

    public Void call() {
        this.wrappedRunnable.run();
        this.reschedule();
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AbstractScheduledService$Cancellable reschedule() {
        block9: {
            var1_1 = this.this$0;
            var1_1 = var1_1.getNextSchedule();
            var2_7 = this.lock;
            var2_7.lock();
            try {}
            catch (Error var1_3) {
                var2_7 = var1_1;
                return var2_7;
            }
            catch (RuntimeException var1_4) {}
            finally {
                break block9;
            }
lbl13:
            // 1 sources

            while (true) {
                if (var2_7 == null) return var1_1;
                var3_9 = this.service;
                var3_9.notifyFailed((Throwable)var2_7);
                return var1_1;
            }
            catch (Throwable var1_5) {
                Platform.restoreInterruptIfIsInterruptedException(var1_5);
                this.service.notifyFailed(var1_5);
                var2_8 = Futures.immediateCancelledFuture();
                return new AbstractScheduledService$FutureAsCancellable(var2_8);
            }
        }
        var1_1 = this.initializeOrUpdateCancellationDelegate((AbstractScheduledService$CustomScheduler$Schedule)var1_1);
        this.lock.unlock();
        var2_7 = null;
        ** while (true)
    }
}

