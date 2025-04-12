/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;

public final class fF$b {
    public final ArrayDeque a;

    public fF$b() {
        Object object = dz3.a;
        object = new ArrayDeque;
        super(0);
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(IZ0 iZ0) {
        synchronized (this) {
            ArrayDeque arrayDeque = null;
            iZ0.b = null;
            iZ0.c = null;
            arrayDeque = this.a;
            arrayDeque.offer(iZ0);
            return;
        }
    }
}

