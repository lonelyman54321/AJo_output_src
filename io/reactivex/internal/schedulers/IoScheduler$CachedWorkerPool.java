/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.IoScheduler$a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

final class IoScheduler$CachedWorkerPool
implements Runnable {
    public final long a;
    public final ConcurrentLinkedQueue b;
    public final t30_0 c;
    public final ScheduledExecutorService d;
    public final ScheduledFuture e;
    public final ThreadFactory f;

    public IoScheduler$CachedWorkerPool(long l2, TimeUnit timeUnit, ThreadFactory threadFactory) {
        Object object;
        l2 = timeUnit != null ? timeUnit.toNanos(l2) : 0L;
        this.a = l2;
        Object object2 = new ConcurrentLinkedQueue();
        this.b = object2;
        this.c = object2 = new t30_0();
        this.f = threadFactory;
        if (timeUnit != null) {
            int n3 = 1;
            object = IoScheduler.e;
            object2 = Executors.newScheduledThreadPool(n3, (ThreadFactory)object);
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            object = object2.scheduleWithFixedDelay(this, l2, l2, timeUnit2);
        } else {
            boolean bl2 = false;
            object2 = null;
            object = null;
        }
        this.d = object2;
        this.e = object;
    }

    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        boolean bl2 = concurrentLinkedQueue.isEmpty();
        if (!bl2) {
            boolean bl3;
            long l2 = System.nanoTime();
            Iterator iterator = concurrentLinkedQueue.iterator();
            while (bl3 = iterator.hasNext()) {
                IoScheduler$a ioScheduler$a = (IoScheduler$a)iterator.next();
                long l3 = ioScheduler$a.c;
                long l4 = l3 - l2;
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object > 0) break;
                boolean bl4 = concurrentLinkedQueue.remove(ioScheduler$a);
                if (!bl4) continue;
                t30_0 t30_02 = this.c;
                t30_02.c(ioScheduler$a);
            }
        }
    }
}

