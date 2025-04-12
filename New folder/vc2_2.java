/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Renamed from vC2
 */
public abstract class vc2_2
extends ac2_2
implements e62_0 {
    public volatile boolean b;

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
}

