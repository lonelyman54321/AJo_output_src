/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

public final class VI3
implements Callable {
    public final /* synthetic */ WI3 a;

    public /* synthetic */ VI3(WI3 wI3) {
        this.a = wI3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object call() {
        Object object = this.a;
        EI3 eI3 = ((WI3)object).a;
        hI3$b hI3$b = eI3.b;
        hI3$b hI3$b2 = hI3$b.ENQUEUED;
        if (hI3$b != hI3$b2) {
            qx1.a().getClass();
            return Boolean.TRUE;
        }
        int n3 = eI3.f();
        if (n3 == 0) {
            hI3$b = eI3.b;
            if (hI3$b != hI3$b2) return Boolean.FALSE;
            n3 = eI3.k;
            if (n3 <= 0) return Boolean.FALSE;
        }
        object = ((WI3)object).g;
        object.getClass();
        long l2 = System.currentTimeMillis();
        long l3 = eI3.a();
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) return Boolean.FALSE;
        object = qx1.a();
        object.getClass();
        return Boolean.TRUE;
    }
}

