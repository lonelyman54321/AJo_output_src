/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.Scheduler;
import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.schedulers.RxThreadFactory;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class T30
extends Scheduler {
    public static final T30$b d;
    public static final RxThreadFactory e;
    public static final int f;
    public static final T30$c g;
    public final AtomicReference c;

    static {
        T30$c[] t30$cArray = Runtime.getRuntime();
        int n3 = t30$cArray.availableProcessors();
        int n4 = 0;
        Number number = Integer.getInteger("rx2.computation-threads", 0);
        int n7 = number;
        if (n7 > 0 && n7 <= n3) {
            n3 = n7;
        }
        f = n3;
        number = new RxThreadFactory("RxComputationShutdown");
        t30$cArray = new b32_0((ThreadFactory)((Object)number));
        g = t30$cArray;
        t30$cArray.dispose();
        n3 = Integer.getInteger("rx2.computation-priority", 5);
        n3 = Math.min(10, n3);
        n7 = 1;
        n3 = Math.max(n7, n3);
        String string2 = "RxComputationThreadPool";
        Object object = new RxThreadFactory(string2, n3, n7 != 0);
        e = object;
        t30$cArray = new T30$b(0, (ThreadFactory)object);
        d = t30$cArray;
        t30$cArray = t30$cArray.b;
        n7 = t30$cArray.length;
        while (n4 < n7) {
            object = t30$cArray[n4];
            ((b32_0)object).dispose();
            ++n4;
        }
    }

    public T30() {
        AtomicReference atomicReference;
        boolean bl2;
        T30$b t30$b = d;
        T30$c[] t30$cArray = new AtomicReference(t30$b);
        this.c = t30$cArray;
        int n3 = f;
        Object object = e;
        t30$cArray = new T30$b(n3, (ThreadFactory)object);
        while (!(bl2 = (atomicReference = this.c).compareAndSet(t30$b, t30$cArray))) {
            if ((atomicReference = atomicReference.get()) == t30$b) continue;
            t30$cArray = t30$cArray.b;
            int n4 = t30$cArray.length;
            atomicReference = null;
            for (n3 = 0; n3 < n4; ++n3) {
                object = t30$cArray[n3];
                ((b32_0)object).dispose();
            }
        }
    }

    public final Scheduler$Worker a() {
        T30$c t30$c = ((T30$b)this.c.get()).a();
        T30$a t30$a = new T30$a(t30$c);
        return t30$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final yr0_2 c(Runnable future, long l2, TimeUnit timeUnit) {
        RejectedExecutionException rejectedExecutionException2;
        block4: {
            yr0_2 yr0_22;
            block3: {
                T30$c t30$c = ((T30$b)this.c.get()).a();
                t30$c.getClass();
                String string2 = "run is null";
                x03_0.b(future, string2);
                yr0_22 = new j0_0((Runnable)((Object)future));
                long l3 = 0L;
                future = t30$c.a;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 <= 0) {
                    try {
                        future = future.submit(yr0_22);
                        break block3;
                    }
                    catch (RejectedExecutionException rejectedExecutionException2) {
                        break block4;
                    }
                }
                future = future.schedule(yr0_22, l2, timeUnit);
            }
            yr0_22.a(future);
            return yr0_22;
        }
        dr2_2.b(rejectedExecutionException2);
        return iz0_2.INSTANCE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final yr0_2 d(Runnable future, long l2, long l3, TimeUnit timeUnit) {
        Object object = ((T30$b)this.c.get()).a();
        object.getClass();
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 <= 0) {
            RejectedExecutionException rejectedExecutionException2;
            block7: {
                yr0_2 yr0_22;
                block6: {
                    ScheduledExecutorService scheduledExecutorService = ((b32_0)object).a;
                    yr0_22 = new ai1_2((Runnable)((Object)future), scheduledExecutorService);
                    Object object2 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                    if (object2 <= 0) {
                        try {
                            future = scheduledExecutorService.submit(yr0_22);
                            break block6;
                        }
                        catch (RejectedExecutionException rejectedExecutionException2) {
                            break block7;
                        }
                    }
                    future = scheduledExecutorService.schedule(yr0_22, l2, timeUnit);
                }
                ((ai1_2)yr0_22).a(future);
                return yr0_22;
            }
            dr2_2.b(rejectedExecutionException2);
            return iz0_2.INSTANCE;
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new j0_0((Runnable)((Object)future));
        try {
            object = ((b32_0)object).a;
            future = object.scheduleAtFixedRate(scheduledDirectPeriodicTask, l2, l3, timeUnit);
            scheduledDirectPeriodicTask.a(future);
            return scheduledDirectPeriodicTask;
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            dr2_2.b(rejectedExecutionException);
            return iz0_2.INSTANCE;
        }
    }
}

