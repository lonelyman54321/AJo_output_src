/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class Tv3$a
extends xw_2 {
    private static final long serialVersionUID = -4896760517184205454L;
    public final /* synthetic */ tv3_0 a;

    public Tv3$a(tv3_0 tv3_02) {
        this.a = tv3_02;
    }

    public final void cancel() {
        Object object = this.a;
        int n3 = ((tv3_0)object).h;
        if (n3 != 0) {
            return;
        }
        this.a.h = true;
        object = this.a.c;
        boolean bl2 = false;
        if ((object = (Runnable)((AtomicReference)object).getAndSet(null)) != null) {
            object.run();
        }
        this.a.g.lazySet(null);
        object = this.a.i;
        n3 = ((AtomicInteger)object).getAndIncrement();
        if (n3 == 0) {
            this.a.g.lazySet(null);
            object = this.a;
            bl2 = ((tv3_0)object).k;
            if (!bl2) {
                object = ((tv3_0)object).b;
                ((ab3_2)object).clear();
            }
        }
    }

    public final void clear() {
        this.a.b.clear();
    }

    public final boolean isEmpty() {
        return this.a.b.isEmpty();
    }

    public final Object poll() {
        return this.a.b.poll();
    }

    public final void request(long l2) {
        boolean bl2 = gf3_2.validate(l2);
        if (bl2) {
            tv3_0 tv3_02 = this.a;
            AtomicLong atomicLong = tv3_02.j;
            bu_2.a(atomicLong, l2);
            tv3_02.d();
        }
    }

    public final int requestFusion(int n3) {
        this.a.k = true;
        return 2;
    }
}

