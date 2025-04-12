/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/*
 * Renamed from ab3
 */
public final class ab3_2
implements b53_0 {
    public static final int i;
    public static final Object j;
    public final AtomicLong a;
    public final int b;
    public long c;
    public final int d;
    public AtomicReferenceArray e;
    public final int f;
    public AtomicReferenceArray g;
    public final AtomicLong h;

    static {
        Object object;
        i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
        j = object = new Object();
    }

    public ab3_2(int n3) {
        long l2;
        AtomicReferenceArray atomicReferenceArray;
        AtomicLong atomicLong;
        AtomicLong atomicLong2;
        this.a = atomicLong2 = new AtomicLong();
        this.h = atomicLong = new AtomicLong();
        n3 = Math.max(8, n3);
        int n4 = 1;
        n3 = Integer.numberOfLeadingZeros(n3 - n4);
        n3 = 32 - n3;
        n3 = n4 << n3;
        n4 = n3 + -1;
        int n7 = n3 + 1;
        this.e = atomicReferenceArray = new AtomicReferenceArray(n7);
        this.d = n4;
        n7 = n3 / 4;
        int n8 = i;
        this.b = n7 = Math.min(n7, n8);
        this.g = atomicReferenceArray;
        this.f = n4;
        this.c = l2 = (long)(n3 + -2);
        atomicLong2.lazySet(0L);
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
        AtomicLong atomicLong2 = this.a;
        long l3 = atomicLong2.get();
        long l4 = l3 - (l2 = (atomicLong = this.h).get());
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
            AtomicReferenceArray<Object> atomicReferenceArray;
            AtomicReferenceArray atomicReferenceArray2 = this.e;
            AtomicLong atomicLong = this.a;
            long l2 = atomicLong.get();
            int n3 = (int)l2;
            int n4 = this.d;
            n3 &= n4;
            long l3 = this.c;
            long l4 = 1L;
            int n7 = 1;
            Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object2 < 0) {
                atomicReferenceArray2.lazySet(n3, object);
                atomicLong.lazySet(l2 += l4);
                return n7 != 0;
            }
            int n8 = this.b;
            l3 = (long)n8 + l2;
            object2 = (int)l3 & n4;
            Object e2 = atomicReferenceArray2.get((int)object2);
            if (e2 == null) {
                this.c = l3 -= l4;
                atomicReferenceArray2.lazySet(n3, object);
                atomicLong.lazySet(l2 += l4);
                return n7 != 0;
            }
            l3 = l2 + l4;
            object2 = (int)l3 & n4;
            e2 = atomicReferenceArray2.get((int)object2);
            if (e2 == null) {
                atomicReferenceArray2.lazySet(n3, object);
                atomicLong.lazySet(l3);
                return n7 != 0;
            }
            long l7 = n4;
            n4 = atomicReferenceArray2.length();
            this.e = atomicReferenceArray = new AtomicReferenceArray<Object>(n4);
            this.c = l2 = l2 + l7 - l4;
            atomicReferenceArray.lazySet(n3, object);
            int n10 = atomicReferenceArray2.length() - n7;
            atomicReferenceArray2.lazySet(n10, atomicReferenceArray);
            object = j;
            atomicReferenceArray2.lazySet(n3, object);
            atomicLong.lazySet(l3);
            return n7 != 0;
        }
        object = new NullPointerException("Null is not a valid element");
        throw object;
    }

    public final Object poll() {
        boolean bl2;
        AtomicReferenceArray atomicReferenceArray = this.g;
        AtomicLong atomicLong = this.h;
        long l2 = atomicLong.get();
        int n3 = (int)l2;
        int n4 = this.f;
        Object object = atomicReferenceArray.get(n3 &= n4);
        Object object2 = j;
        int n7 = 1;
        if (object == object2) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        long l3 = 1L;
        if (object != null && !bl2) {
            atomicReferenceArray.lazySet(n3, null);
            atomicLong.lazySet(l2 += l3);
            return object;
        }
        if (bl2) {
            object = (AtomicReferenceArray)atomicReferenceArray.get(n4 += n7);
            atomicReferenceArray.lazySet(n4, null);
            this.g = object;
            atomicReferenceArray = ((AtomicReferenceArray)object).get(n3);
            if (atomicReferenceArray != null) {
                ((AtomicReferenceArray)object).lazySet(n3, null);
                atomicLong.lazySet(l2 += l3);
            }
            return atomicReferenceArray;
        }
        return null;
    }
}

