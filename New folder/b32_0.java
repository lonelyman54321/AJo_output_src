/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from B32
 */
public class b32_0
extends Scheduler$Worker {
    public final ScheduledExecutorService a;
    public volatile boolean b;

    public b32_0(ThreadFactory object) {
        boolean bl2 = SchedulerPoolFactory.a;
        object = Executors.newScheduledThreadPool(1, (ThreadFactory)object);
        bl2 = SchedulerPoolFactory.a;
        if (bl2 && (bl2 = object instanceof ScheduledThreadPoolExecutor)) {
            Object object2 = object;
            object2 = (ScheduledThreadPoolExecutor)object;
            ConcurrentHashMap concurrentHashMap = SchedulerPoolFactory.d;
            concurrentHashMap.put(object2, object);
        }
        this.a = (ScheduledExecutorService)object;
    }

    public final yr0_2 b(Runnable runnable2) {
        return this.c(runnable2, 0L, null);
    }

    public final yr0_2 c(Runnable runnable2, long l2, TimeUnit timeUnit) {
        boolean bl2 = this.b;
        if (bl2) {
            return iz0_2.INSTANCE;
        }
        return this.e(runnable2, l2, timeUnit, null);
    }

    public final void dispose() {
        boolean bl2 = this.b;
        if (!bl2) {
            this.b = bl2 = true;
            ScheduledExecutorService scheduledExecutorService = this.a;
            scheduledExecutorService.shutdownNow();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ScheduledRunnable e(Runnable future, long l2, TimeUnit timeUnit, ar0_2 ar0_22) {
        RejectedExecutionException rejectedExecutionException2;
        ScheduledRunnable scheduledRunnable;
        block6: {
            block5: {
                boolean bl2;
                x03_0.b(future, "run is null");
                scheduledRunnable = new ScheduledRunnable((Runnable)((Object)future), ar0_22);
                if (ar0_22 != null && !(bl2 = ar0_22.b(scheduledRunnable))) {
                    return scheduledRunnable;
                }
                long l3 = 0L;
                future = this.a;
                Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (object <= 0) {
                    try {
                        future = future.submit(scheduledRunnable);
                        break block5;
                    }
                    catch (RejectedExecutionException rejectedExecutionException2) {
                        break block6;
                    }
                }
                future = future.schedule(scheduledRunnable, l2, timeUnit);
            }
            scheduledRunnable.a(future);
            return scheduledRunnable;
        }
        if (ar0_22 != null) {
            ar0_22.c(scheduledRunnable);
        }
        dr2_2.b(rejectedExecutionException2);
        return scheduledRunnable;
    }

    public final boolean isDisposed() {
        return this.b;
    }
}

