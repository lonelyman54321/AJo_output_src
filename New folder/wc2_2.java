/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/*
 * Renamed from wC2
 */
public abstract class wc2_2
extends cc2_2
implements df3_2 {
    public volatile boolean c;

    public final boolean c() {
        AtomicInteger atomicInteger = this.a;
        int n3 = atomicInteger.getAndIncrement();
        if (!n3) {
            n3 = 1;
        } else {
            n3 = 0;
            atomicInteger = null;
        }
        return n3 != 0;
    }

    public final boolean d() {
        boolean bl2;
        AtomicInteger atomicInteger = this.a;
        int n3 = atomicInteger.get();
        boolean bl3 = false;
        if (n3 == 0 && (bl2 = atomicInteger.compareAndSet(0, n3 = 1))) {
            bl3 = true;
        }
        return bl3;
    }

    public final void e(long l2) {
        boolean bl2 = gf3_2.validate(l2);
        if (bl2) {
            AtomicLong atomicLong = this.b;
            bu_2.a(atomicLong, l2);
        }
    }

    public void request(long l2) {
        this.e(l2);
    }
}

