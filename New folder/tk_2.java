/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import kotlinx.coroutines.b;

/*
 * Renamed from tK
 */
public final class tk_2
implements b {
    public final Future a;

    public tk_2(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    public final void b(Throwable throwable) {
        this.a.cancel(false);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CancelFutureOnCancel[");
        Future future = this.a;
        stringBuilder.append(future);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

