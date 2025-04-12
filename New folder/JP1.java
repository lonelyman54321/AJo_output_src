/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class JP1 {
    public final AtomicReference a;
    public final Jp b;

    public JP1() {
        Object object = new AtomicReference();
        this.a = object;
        this.b = object = new Jp();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Class clazz, Class clazz2, Class clazz3, List list) {
        Jp jp = this.b;
        synchronized (jp) {
            Jp jp2 = this.b;
            IQ1 iQ1 = new IQ1(clazz, clazz2, clazz3);
            jp2.put(iQ1, list);
            return;
        }
    }
}

