/*
 * Decompiled with CFR 0.152.
 */
import com.bumptech.glide.load.engine.e;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class Nv1 {
    public static final Mv1 c;
    public final Jp a;
    public final AtomicReference b;

    static {
        Mv1 mv1;
        List list = Collections.emptyList();
        bw3 bw32 = new Object();
        Object object = new e(Object.class, Object.class, Object.class, list, bw32, null);
        List<e> list2 = Collections.singletonList(object);
        object = mv1;
        c = mv1 = new Mv1(Object.class, Object.class, Object.class, list2, null);
    }

    public Nv1() {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        this.b = atomicReference = new AtomicReference();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Class clazz, Class clazz2, Class clazz3, Mv1 mv1) {
        Jp jp = this.a;
        synchronized (jp) {
            Jp jp2 = this.a;
            IQ1 iQ1 = new IQ1(clazz, clazz2, clazz3);
            if (mv1 == null) {
                mv1 = c;
            }
            jp2.put(iQ1, mv1);
            return;
        }
    }
}

