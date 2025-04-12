/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/*
 * Renamed from jn3
 */
public final class jn3_0
extends cl1_2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g;
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e;
    public fr0_1 f;

    static {
        g = AtomicIntegerFieldUpdater.newUpdater(jn3_0.class, "_state$volatile");
    }

    public jn3_0() {
        Thread thread2;
        this.e = thread2 = Thread.currentThread();
    }

    public static void l(int n3) {
        StringBuilder stringBuilder = new StringBuilder("Illegal state ");
        stringBuilder.append(n3);
        String string2 = stringBuilder.toString().toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final boolean i() {
        return true;
    }

    public final void j(Throwable object) {
        int n3;
        int n4;
        int n7;
        do {
            object = g;
            n7 = ((AtomicIntegerFieldUpdater)object).get(this);
            n3 = 3;
            n4 = 2;
            if (n7 == 0) continue;
            int n8 = 1;
            if (n7 != n8 && n7 != n4 && n7 != n3) {
                jn3_0.l(n7);
                throw null;
            }
            return;
        } while ((n7 = (int)(((AtomicIntegerFieldUpdater)object).compareAndSet(this, n7, n4) ? 1 : 0)) == 0);
        this.e.interrupt();
        ((AtomicIntegerFieldUpdater)object).set(this, n3);
    }

    public final void k() {
        Object object;
        while (true) {
            int n3;
            int n4;
            if ((n4 = ((AtomicIntegerFieldUpdater)(object = g)).get(this)) != 0) {
                n3 = 2;
                if (n4 == n3) continue;
                n3 = 3;
                if (n4 == n3) {
                    Thread.interrupted();
                    return;
                }
                jn3_0.l(n4);
                throw null;
            }
            int n7 = 1;
            n3 = (int)(((AtomicIntegerFieldUpdater)object).compareAndSet(this, n4, n7) ? 1 : 0);
            if (n3 != 0) break;
        }
        object = this.f;
        if (object != null) {
            object.dispose();
        }
    }
}

