/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/*
 * Renamed from nG2
 */
public final class ng2_2
extends tf_0 {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(ng2_2.class, "copyCount");
    private volatile int copyCount;

    public final void a() {
        a.incrementAndGet(this);
    }

    public final boolean b() {
        int n3 = this.copyCount;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean c() {
        int n3 = this.copyCount;
        Serializable serializable = null;
        if (n3 == 0) {
            return false;
        }
        Object object = a;
        n3 = ((AtomicIntegerFieldUpdater)object).decrementAndGet(this);
        int n4 = 1;
        if (n3 >= 0) {
            return n4 != 0;
        }
        int n7 = -1;
        if (n3 == n7) {
            this.copyCount = 0;
            return false;
        }
        serializable = new StringBuilder("Shared copies count is negative: ");
        serializable.append(n3 += n4);
        object = serializable.toString();
        object = object.toString();
        serializable = new IllegalStateException((String)object);
        throw serializable;
    }
}

