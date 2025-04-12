/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool;
import io.reactivex.internal.schedulers.IoScheduler$EventLoopWorker;
import io.reactivex.internal.schedulers.IoScheduler$a;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class IoScheduler
extends Scheduler {
    public static final RxThreadFactory d;
    public static final RxThreadFactory e;
    public static final long f;
    public static final TimeUnit g;
    public static final IoScheduler$a h;
    public static final boolean i;
    public static final IoScheduler$CachedWorkerPool j;
    public final AtomicReference c;

    static {
        RxThreadFactory rxThreadFactory;
        long l2;
        g = TimeUnit.SECONDS;
        long l3 = 60;
        f = l2 = Long.getLong("rx2.io-keep-alive-time", l3).longValue();
        RxThreadFactory rxThreadFactory2 = new RxThreadFactory("RxCachedThreadSchedulerShutdown");
        Object object = new IoScheduler$a(rxThreadFactory2);
        h = object;
        ((b32_0)object).dispose();
        int n3 = Integer.getInteger("rx2.io-priority", 5);
        n3 = Math.min(10, n3);
        boolean bl2 = true;
        n3 = Math.max((int)(bl2 ? 1 : 0), n3);
        Object object2 = new RxThreadFactory("RxCachedThreadScheduler", n3, false);
        d = object2;
        e = rxThreadFactory = new RxThreadFactory("RxCachedWorkerPoolEvictor", n3, false);
        n3 = (int)(Boolean.getBoolean("rx2.io-scheduled-release") ? 1 : 0);
        i = n3;
        long l4 = 0L;
        j = object = new IoScheduler$CachedWorkerPool(l4, null, (ThreadFactory)object2);
        ((IoScheduler$CachedWorkerPool)object).c.dispose();
        object2 = ((IoScheduler$CachedWorkerPool)object).e;
        if (object2 != null) {
            object2.cancel(bl2);
        }
        if ((object = ((IoScheduler$CachedWorkerPool)object).d) != null) {
            object.shutdownNow();
        }
    }

    public IoScheduler() {
        boolean bl2;
        Object object = j;
        Object object2 = new AtomicReference(object);
        this.c = object2;
        Object object3 = g;
        long l2 = f;
        RxThreadFactory rxThreadFactory = d;
        object2 = new IoScheduler$CachedWorkerPool(l2, (TimeUnit)((Object)object3), rxThreadFactory);
        while (!(bl2 = ((AtomicReference)(object3 = this.c)).compareAndSet(object, object2))) {
            if ((object3 = ((AtomicReference)object3).get()) == object) continue;
            ((IoScheduler$CachedWorkerPool)object2).c.dispose();
            object = ((IoScheduler$CachedWorkerPool)object2).e;
            if (object != null) {
                boolean bl3 = true;
                object.cancel(bl3);
            }
            if ((object2 = ((IoScheduler$CachedWorkerPool)object2).d) == null) break;
            object2.shutdownNow();
            break;
        }
    }

    public final Scheduler$Worker a() {
        IoScheduler$CachedWorkerPool ioScheduler$CachedWorkerPool = (IoScheduler$CachedWorkerPool)this.c.get();
        IoScheduler$EventLoopWorker ioScheduler$EventLoopWorker = new IoScheduler$EventLoopWorker(ioScheduler$CachedWorkerPool);
        return ioScheduler$EventLoopWorker;
    }
}

