/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.Scheduler$Worker;
import java.util.concurrent.TimeUnit;

public final class T30$a
extends Scheduler$Worker {
    public final zu1_2 a;
    public final t30_0 b;
    public final zu1_2 c;
    public final T30$c d;
    public volatile boolean e;

    public T30$a(T30$c yr0_22) {
        zu1_2 zu1_22;
        t30_0 t30_02;
        this.d = yr0_22;
        this.a = yr0_22;
        this.b = t30_02 = new t30_0();
        super();
        this.c = zu1_22;
        zu1_22.b(yr0_22);
        zu1_22.b(t30_02);
    }

    public final yr0_2 b(Runnable runnable2) {
        boolean bl2 = this.e;
        if (bl2) {
            return iz0_2.INSTANCE;
        }
        T30$c t30$c = this.d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zu1_2 zu1_22 = this.a;
        return t30$c.e(runnable2, 0L, timeUnit, zu1_22);
    }

    public final yr0_2 c(Runnable runnable2, long l2, TimeUnit timeUnit) {
        boolean bl2 = this.e;
        if (bl2) {
            return iz0_2.INSTANCE;
        }
        T30$c t30$c = this.d;
        t30_0 t30_02 = this.b;
        return t30$c.e(runnable2, l2, timeUnit, t30_02);
    }

    public final void dispose() {
        boolean bl2 = this.e;
        if (!bl2) {
            this.e = bl2 = true;
            zu1_2 zu1_22 = this.c;
            zu1_22.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.e;
    }
}

