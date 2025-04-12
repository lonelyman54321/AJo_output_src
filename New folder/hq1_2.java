/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from HQ1
 */
public final class hq1_2
implements b53_0 {
    public final AtomicReference a;
    public final AtomicReference b;

    public hq1_2() {
        AtomicReference<HQ1$a> atomicReference;
        HQ1$a hQ1$a;
        this.a = hQ1$a = new AtomicReference();
        this.b = atomicReference = new AtomicReference<HQ1$a>();
        HQ1$a hQ1$a2 = new HQ1$a();
        atomicReference.lazySet(hQ1$a2);
        hQ1$a = hQ1$a.getAndSet(hQ1$a2);
    }

    public final void clear() {
        boolean bl2;
        Object object;
        while ((object = this.poll()) != null && !(bl2 = this.isEmpty())) {
        }
    }

    public final boolean isEmpty() {
        boolean bl2;
        HQ1$a hQ1$a;
        HQ1$a hQ1$a2 = (HQ1$a)this.b.get();
        if (hQ1$a2 == (hQ1$a = (HQ1$a)this.a.get())) {
            bl2 = true;
        } else {
            bl2 = false;
            hQ1$a2 = null;
        }
        return bl2;
    }

    public final boolean offer(Object object) {
        if (object != null) {
            HQ1$a hQ1$a = new AtomicReference();
            hQ1$a.a = object;
            this.a.getAndSet(hQ1$a).lazySet(hQ1$a);
            return true;
        }
        object = new NullPointerException("Null is not a valid element");
        throw object;
    }

    public final Object poll() {
        AtomicReference atomicReference = this.b;
        Object object = (HQ1$a)atomicReference.get();
        HQ1$a hQ1$a = (HQ1$a)((AtomicReference)object).get();
        if (hQ1$a != null) {
            object = hQ1$a.a;
            hQ1$a.a = null;
            atomicReference.lazySet(hQ1$a);
            return object;
        }
        hQ1$a = (HQ1$a)this.a.get();
        if (object != hQ1$a) {
            while ((hQ1$a = (HQ1$a)((AtomicReference)object).get()) == null) {
            }
            object = hQ1$a.a;
            hQ1$a.a = null;
            atomicReference.lazySet(hQ1$a);
            return object;
        }
        return null;
    }
}

