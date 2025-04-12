/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/*
 * Renamed from Za3
 */
public final class za3_2
extends AtomicReferenceArray
implements b53_0 {
    public static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    public final int a;
    public final AtomicLong b;
    public long c;
    public final AtomicLong d;
    public final int e;

    public za3_2(int n3) {
        AtomicLong atomicLong;
        int n4 = Integer.numberOfLeadingZeros(n3 + -1);
        n4 = 32 - n4;
        int n7 = 1;
        n4 = n7 << n4;
        super(n4);
        this.a = n4 = this.length() - n7;
        this.b = atomicLong = new AtomicLong();
        this.d = atomicLong = new AtomicLong();
        n3 /= 4;
        n4 = f;
        this.e = n3 = Math.min(n3, n4);
    }

    public final void clear() {
        boolean bl2;
        Object object;
        while ((object = this.poll()) != null || !(bl2 = this.isEmpty())) {
        }
    }

    public final boolean isEmpty() {
        boolean bl2;
        AtomicLong atomicLong;
        long l2;
        AtomicLong atomicLong2 = this.b;
        long l3 = atomicLong2.get();
        long l4 = l3 - (l2 = (atomicLong = this.d).get());
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            bl2 = true;
        } else {
            bl2 = false;
            atomicLong2 = null;
        }
        return bl2;
    }

    public final boolean offer(Object object) {
        if (object != null) {
            AtomicLong atomicLong = this.b;
            long l2 = atomicLong.get();
            int n3 = (int)l2;
            int n4 = this.a;
            n3 &= n4;
            long l3 = this.c;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 >= 0) {
                int n7 = this.e;
                l3 = (long)n7 + l2;
                object2 = (int)l3;
                Object e2 = this.get(n4 &= object2);
                if (e2 == null) {
                    this.c = l3;
                } else {
                    e2 = this.get(n3);
                    if (e2 != null) {
                        return false;
                    }
                }
            }
            this.lazySet(n3, object);
            atomicLong.lazySet(++l2);
            return true;
        }
        object = new NullPointerException("Null is not a valid element");
        throw object;
    }

    public final Object poll() {
        AtomicLong atomicLong = this.d;
        long l2 = atomicLong.get();
        int n3 = (int)l2;
        int n4 = this.a;
        Object e2 = this.get(n3 &= n4);
        if (e2 == null) {
            return null;
        }
        atomicLong.lazySet(++l2);
        this.lazySet(n3, null);
        return e2;
    }
}

