/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool;
import io.reactivex.internal.schedulers.IoScheduler$a;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

final class IoScheduler$EventLoopWorker
extends Scheduler$Worker
implements Runnable {
    public final t30_0 a;
    public final IoScheduler$CachedWorkerPool b;
    public final IoScheduler$a c;
    public final AtomicBoolean d;

    /*
     * Enabled aggressive block sorting
     */
    public IoScheduler$EventLoopWorker(IoScheduler$CachedWorkerPool object) {
        Object object2 = new AtomicBoolean();
        this.d = object2;
        this.b = object;
        this.a = object2 = new t30_0();
        object2 = ((IoScheduler$CachedWorkerPool)object).c;
        boolean bl2 = ((t30_0)object2).b;
        if (bl2) {
            object = IoScheduler.h;
        } else {
            block3: {
                while (!(bl2 = ((ConcurrentLinkedQueue)(object2 = ((IoScheduler$CachedWorkerPool)object).b)).isEmpty())) {
                    object2 = (IoScheduler$a)((IoScheduler$CachedWorkerPool)object).b.poll();
                    if (object2 == null) continue;
                    break block3;
                }
                ThreadFactory threadFactory = ((IoScheduler$CachedWorkerPool)object).f;
                object2 = new IoScheduler$a(threadFactory);
                object = ((IoScheduler$CachedWorkerPool)object).c;
                ((t30_0)object).b((yr0_2)object2);
            }
            object = object2;
        }
        this.c = object;
    }

    public final yr0_2 c(Runnable runnable2, long l2, TimeUnit timeUnit) {
        yr0_2 yr0_22 = this.a;
        boolean bl2 = ((t30_0)yr0_22).b;
        if (bl2) {
            return iz0_2.INSTANCE;
        }
        yr0_22 = this.c;
        t30_0 t30_02 = this.a;
        return ((b32_0)yr0_22).e(runnable2, l2, timeUnit, t30_02);
    }

    public final void dispose() {
        Object object = this.d;
        IoScheduler$a ioScheduler$a = null;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
        if (bl3) {
            object = this.a;
            ((t30_0)object).dispose();
            bl3 = IoScheduler.i;
            if (bl3) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                ioScheduler$a = this.c;
                long l2 = 0L;
                ioScheduler$a.e(this, l2, timeUnit, null);
            } else {
                object = this.b;
                object.getClass();
                long l3 = System.nanoTime();
                long l4 = ((IoScheduler$CachedWorkerPool)object).a;
                IoScheduler$a ioScheduler$a2 = this.c;
                ioScheduler$a2.c = l3 += l4;
                object = ((IoScheduler$CachedWorkerPool)object).b;
                ((ConcurrentLinkedQueue)object).offer(ioScheduler$a2);
            }
        }
    }

    public final boolean isDisposed() {
        return this.d.get();
    }

    public final void run() {
        IoScheduler$CachedWorkerPool ioScheduler$CachedWorkerPool = this.b;
        ioScheduler$CachedWorkerPool.getClass();
        long l2 = System.nanoTime();
        long l3 = ioScheduler$CachedWorkerPool.a;
        IoScheduler$a ioScheduler$a = this.c;
        ioScheduler$a.c = l2 += l3;
        ioScheduler$CachedWorkerPool.b.offer(ioScheduler$a);
    }
}

