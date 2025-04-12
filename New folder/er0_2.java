/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/*
 * Renamed from Er0
 */
public final class er0_2
implements fr0_1 {
    public final Future a;

    public er0_2(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisposableFutureHandle[");
        Future future = this.a;
        stringBuilder.append(future);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

