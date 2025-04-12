/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from o63$a
 */
public final class o63$a_0
extends Scheduler$Worker {
    public final ScheduledExecutorService a;
    public final t30_0 b;
    public volatile boolean c;

    public o63$a_0(ScheduledExecutorService object) {
        this.a = object;
        this.b = object = new t30_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final yr0_2 c(Runnable future, long l2, TimeUnit timeUnit) {
        RejectedExecutionException rejectedExecutionException2;
        block5: {
            ScheduledRunnable scheduledRunnable;
            block4: {
                boolean bl2 = this.c;
                if (bl2) {
                    return iz0_2.INSTANCE;
                }
                x03_0.b(future, "run is null");
                t30_0 t30_02 = this.b;
                scheduledRunnable = new ScheduledRunnable((Runnable)((Object)future), t30_02);
                future = this.b;
                ((t30_0)((Object)future)).b(scheduledRunnable);
                long l3 = 0L;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 <= 0) {
                    try {
                        future = this.a;
                        future = future.submit(scheduledRunnable);
                        break block4;
                    }
                    catch (RejectedExecutionException rejectedExecutionException2) {
                        break block5;
                    }
                }
                future = this.a;
                future = future.schedule(scheduledRunnable, l2, timeUnit);
            }
            scheduledRunnable.a(future);
            return scheduledRunnable;
        }
        this.dispose();
        dr2_2.b(rejectedExecutionException2);
        return iz0_2.INSTANCE;
    }

    public final void dispose() {
        boolean bl2 = this.c;
        if (!bl2) {
            this.c = bl2 = true;
            t30_0 t30_02 = this.b;
            t30_02.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.c;
    }
}

