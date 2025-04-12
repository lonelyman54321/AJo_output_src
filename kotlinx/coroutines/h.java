/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DefaultExecutor;
import kotlinx.coroutines.ResumeUndispatchedRunnable;
import kotlinx.coroutines.g;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class h
extends g
implements ao0_1 {
    public final Executor b;

    public h(Executor executor) {
        this.b = executor;
        boolean bl2 = executor instanceof ScheduledThreadPoolExecutor;
        if (bl2) {
            executor = (ScheduledThreadPoolExecutor)executor;
            bl2 = true;
            ((ScheduledThreadPoolExecutor)executor).setRemoveOnCancelPolicy(bl2);
        }
    }

    public final fr0_1 H(long l2, Runnable runnable2, CoroutineContext coroutineContext) {
        fr0_1 fr0_12;
        ScheduledFuture<?> scheduledFuture;
        Object object;
        block6: {
            object = this.b;
            boolean bl2 = object instanceof ScheduledExecutorService;
            scheduledFuture = null;
            object = bl2 ? (ScheduledExecutorService)object : null;
            if (object != null) {
                Object object2 = TimeUnit.MILLISECONDS;
                try {
                    scheduledFuture = object.schedule(runnable2, l2, (TimeUnit)((Object)object2));
                }
                catch (RejectedExecutionException rejectedExecutionException) {
                    object = xc0_2.a("The task was rejected", rejectedExecutionException);
                    object2 = i$a.a;
                    object2 = (i)coroutineContext.get((CoroutineContext$a)object2);
                    if (object2 == null) break block6;
                    object2.d((CancellationException)object);
                }
            }
        }
        if (scheduledFuture != null) {
            fr0_12 = new er0_2(scheduledFuture);
        } else {
            object = DefaultExecutor.i;
            fr0_12 = ((DefaultExecutor)object).H(l2, runnable2, coroutineContext);
        }
        return fr0_12;
    }

    public final void J0(CoroutineContext coroutineContext, Runnable runnable2) {
        Executor executor = this.b;
        try {
            executor.execute(runnable2);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            Object object = xc0_2.a("The task was rejected", rejectedExecutionException);
            Object object2 = i$a.a;
            object2 = (i)coroutineContext.get((CoroutineContext$a)object2);
            if (object2 != null) {
                object2.d((CancellationException)object);
            }
            object = ir0_2.a;
            object = em0_2.b;
            ((em0_2)object).J0(coroutineContext, runnable2);
        }
    }

    public final void close() {
        Executor executor = this.b;
        boolean bl2 = executor instanceof ExecutorService;
        executor = bl2 ? (ExecutorService)executor : null;
        if (executor != null) {
            executor.shutdown();
        }
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Executor executor;
        boolean bl3 = object instanceof h;
        if (bl3 && (object = ((h)object).b) == (executor = this.b)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    public final void l0(long l2, CancellableContinuationImpl cancellableContinuationImpl) {
        ScheduledFuture<?> scheduledFuture;
        block5: {
            Executor executor = this.b;
            boolean bl2 = executor instanceof ScheduledExecutorService;
            scheduledFuture = null;
            executor = bl2 ? (ScheduledExecutorService)executor : null;
            if (executor != null) {
                Object object = new ResumeUndispatchedRunnable(this, cancellableContinuationImpl);
                Object object2 = TimeUnit.MILLISECONDS;
                try {
                    scheduledFuture = executor.schedule((Runnable)object, l2, (TimeUnit)((Object)object2));
                }
                catch (RejectedExecutionException rejectedExecutionException) {
                    CancellationException cancellationException = xc0_2.a("The task was rejected", rejectedExecutionException);
                    object = i$a.a;
                    object2 = cancellableContinuationImpl.e;
                    object = (i)object2.get((CoroutineContext$a)object);
                    if (object == null) break block5;
                    object.d(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            tk_2 tk_22 = new tk_2(scheduledFuture);
            dl_2.b(cancellableContinuationImpl, tk_22);
            return;
        }
        DefaultExecutor.i.l0(l2, cancellableContinuationImpl);
    }

    public final String toString() {
        return this.b.toString();
    }
}

