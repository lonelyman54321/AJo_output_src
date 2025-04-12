/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from Nr0
 */
public final class nr0_2
implements Future {
    public final yr0_2 a;

    public nr0_2(yr0_2 yr0_22) {
        this.a = yr0_22;
    }

    public final boolean cancel(boolean bl2) {
        this.a.dispose();
        return false;
    }

    public final Object get() {
        return null;
    }

    public final Object get(long l2, TimeUnit timeUnit) {
        return null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }
}

