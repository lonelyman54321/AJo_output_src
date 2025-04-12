/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.Scheduler;
import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.schedulers.RxThreadFactory;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from o63
 */
public final class o63_0
extends Scheduler {
    public static final RxThreadFactory d;
    public static final ScheduledExecutorService e;
    public final AtomicReference c;

    static {
        RxThreadFactory rxThreadFactory;
        ScheduledExecutorService scheduledExecutorService;
        e = scheduledExecutorService = Executors.newScheduledThreadPool(0);
        scheduledExecutorService.shutdown();
        int n3 = Integer.getInteger("rx2.single-priority", 5);
        n3 = Math.min(10, n3);
        boolean bl2 = true;
        n3 = Math.max((int)(bl2 ? 1 : 0), n3);
        d = rxThreadFactory = new RxThreadFactory("RxSingleScheduler", n3, bl2);
    }

    public o63_0() {
        AtomicReference<ScheduledExecutorService> atomicReference;
        this.c = atomicReference = new AtomicReference<ScheduledExecutorService>();
        boolean n3 = SchedulerPoolFactory.a;
        int n4 = 1;
        Object object = d;
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(n4, (ThreadFactory)object);
        boolean bl2 = SchedulerPoolFactory.a;
        if (bl2 && (bl2 = scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            object = scheduledExecutorService;
            object = (ScheduledThreadPoolExecutor)scheduledExecutorService;
            ConcurrentHashMap concurrentHashMap = SchedulerPoolFactory.d;
            concurrentHashMap.put(object, scheduledExecutorService);
        }
        atomicReference.lazySet(scheduledExecutorService);
    }

    public final Scheduler$Worker a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)this.c.get();
        o63$a_0 o63$a_0 = new o63$a_0(scheduledExecutorService);
        return o63$a_0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final yr0_2 c(Runnable future, long l2, TimeUnit timeUnit) {
        RejectedExecutionException rejectedExecutionException2;
        block4: {
            lt2_2 lt2_22;
            block3: {
                String string2 = "run is null";
                x03_0.b(future, string2);
                lt2_22 = new j0_0((Runnable)((Object)future));
                future = this.c;
                long l3 = 0L;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 <= 0) {
                    try {
                        future = ((AtomicReference)((Object)future)).get();
                        future = (ScheduledExecutorService)((Object)future);
                        future = future.submit(lt2_22);
                        break block3;
                    }
                    catch (RejectedExecutionException rejectedExecutionException2) {
                        break block4;
                    }
                }
                future = ((AtomicReference)((Object)future)).get();
                future = (ScheduledExecutorService)((Object)future);
                future = future.schedule(lt2_22, l2, timeUnit);
            }
            lt2_22.a(future);
            return lt2_22;
        }
        dr2_2.b(rejectedExecutionException2);
        return iz0_2.INSTANCE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final yr0_2 d(Runnable scheduledFuture, long l2, long l3, TimeUnit timeUnit) {
        Object object = this.c;
        long l4 = 0L;
        long l7 = l3 - l4;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 <= 0) {
            RejectedExecutionException rejectedExecutionException2;
            block7: {
                ai1_2 ai1_22;
                block6: {
                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)((AtomicReference)object).get();
                    ai1_22 = new ai1_2((Runnable)((Object)scheduledFuture), scheduledExecutorService);
                    Object object3 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                    if (object3 <= 0) {
                        try {
                            scheduledFuture = scheduledExecutorService.submit(ai1_22);
                            break block6;
                        }
                        catch (RejectedExecutionException rejectedExecutionException2) {
                            break block7;
                        }
                    }
                    scheduledFuture = scheduledExecutorService.schedule(ai1_22, l2, timeUnit);
                }
                ai1_22.a(scheduledFuture);
                return ai1_22;
            }
            dr2_2.b(rejectedExecutionException2);
            return iz0_2.INSTANCE;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new j0_0((Runnable)((Object)scheduledFuture));
        try {
            scheduledFuture = ((AtomicReference)object).get();
            object = scheduledFuture;
            object = (ScheduledExecutorService)((Object)scheduledFuture);
            scheduledFuture = object.scheduleAtFixedRate(scheduledDirectPeriodicTask, l2, l3, timeUnit);
            scheduledDirectPeriodicTask.a(scheduledFuture);
            return scheduledDirectPeriodicTask;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            dr2_2.b(rejectedExecutionException);
            return iz0_2.INSTANCE;
        }
    }
}

