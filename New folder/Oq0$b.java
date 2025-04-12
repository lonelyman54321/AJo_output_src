/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;

public final class Oq0$b {
    public final ArrayDeque a;

    public Oq0$b() {
        ArrayDeque arrayDeque;
        this.a = arrayDeque = new ArrayDeque();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Oq0$a a() {
        Object object;
        ArrayDeque arrayDeque = this.a;
        synchronized (arrayDeque) {
            object = this.a;
            object = ((ArrayDeque)object).poll();
            object = (Oq0$a)object;
        }
        if (object != null) return object;
        return new Oq0$a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Oq0$a oq0$a) {
        ArrayDeque arrayDeque = this.a;
        synchronized (arrayDeque) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        ArrayDeque arrayDeque2 = this.a;
                        int n3 = arrayDeque2.size();
                        int n4 = 10;
                        if (n3 >= n4) break block3;
                        arrayDeque2 = this.a;
                        arrayDeque2.offer(oq0$a);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

