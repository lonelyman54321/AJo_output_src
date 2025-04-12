/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mm0
 */
public abstract class mm0_2
implements p62_0 {
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public final int a;
    public final int b;
    public final AtomicReferenceArray c;
    public final int[] d;
    private volatile /* synthetic */ long top;

    static {
        e = AtomicLongFieldUpdater.newUpdater(mm0_2.class, "top");
    }

    public mm0_2(int n3) {
        if (n3 > 0) {
            int n4 = -1 >>> 3;
            if (n3 <= n4) {
                AtomicReferenceArray atomicReferenceArray;
                this.top = 0L;
                this.a = n3 = Integer.highestOneBit(n3 * 4 + -1) * 2;
                this.b = n4 = Integer.numberOfLeadingZeros(n3) + 1;
                this.c = atomicReferenceArray = new AtomicReferenceArray(++n3);
                int[] nArray = new int[n3];
                this.d = nArray;
                return;
            }
            String string2 = hj0_0.a(n3, "capacity should be less or equal to 536870911 but it is ");
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        String string3 = hj0_0.a(n3, "capacity should be positive but it is ");
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public final void C0(Object object) {
        block4: {
            int n3;
            String string2 = "instance";
            Intrinsics.checkNotNullParameter(object, string2);
            this.h(object);
            int n4 = System.identityHashCode(object) * -1640531527;
            int n7 = this.b;
            n4 = (n4 >>> n7) + 1;
            for (n7 = 0; n7 < (n3 = 8); ++n7) {
                Object var7_7;
                AtomicReferenceArray atomicReferenceArray = this.c;
                do {
                    var7_7 = null;
                    boolean bl2 = atomicReferenceArray.compareAndSet(n4, null, object);
                    if (!bl2) continue;
                    if (n4 > 0) {
                        long l2;
                        long l3;
                        AtomicLongFieldUpdater atomicLongFieldUpdater;
                        int n8;
                        do {
                            l3 = this.top;
                            n8 = 32;
                            long l4 = l3 >> n8;
                            long l7 = 0xFFFFFFFFL;
                            l4 = (l4 & l7) + 1L;
                            int n10 = (int)(l7 & l3);
                            l7 = n4;
                            l2 = (l4 <<= n8) | l7;
                            object = this.d;
                            object[n4] = n10;
                        } while ((n8 = (int)((atomicLongFieldUpdater = e).compareAndSet(this, l3, l2) ? 1 : 0)) == 0);
                        break block4;
                    }
                    string2 = "index should be positive".toString();
                    object = new IllegalArgumentException(string2);
                    throw object;
                } while ((var7_7 = atomicReferenceArray.get(n4)) == null);
                if ((n4 += -1) != 0) continue;
                n4 = this.a;
            }
            Intrinsics.checkNotNullParameter(object, string2);
        }
    }

    public Object a(Object object) {
        Intrinsics.checkNotNullParameter(object, "instance");
        return object;
    }

    public final void b() {
        Object object;
        while ((object = this.d()) != null) {
            String string2 = "instance";
            Intrinsics.checkNotNullParameter(object, string2);
        }
        return;
    }

    public abstract Object c();

    public final void close() {
        this.b();
    }

    public final Object d() {
        Object object;
        int n3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        int n4;
        block2: {
            int n7;
            long l2;
            long l3;
            do {
                l3 = this.top;
                l2 = 0L;
                n3 = 0;
                Object object2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                if (object2 == false) break block2;
                n4 = 32;
                long l4 = l3 >> n4;
                long l7 = 0xFFFFFFFFL;
                l4 &= l7;
                long l8 = 1L;
                l4 += l8;
                n7 = (int)(l7 &= l3);
                if (n7 == 0) break block2;
                int n8 = this.d[n7];
                long l12 = l4 << n4;
                l2 = n8;
                atomicLongFieldUpdater = e;
                object = this;
            } while ((n4 = (int)(atomicLongFieldUpdater.compareAndSet(this, l3, l12 |= l2) ? 1 : 0)) == 0);
            n3 = n7;
        }
        n4 = 0;
        atomicLongFieldUpdater = null;
        if (n3 != 0) {
            object = this.c;
            atomicLongFieldUpdater = ((AtomicReferenceArray)object).getAndSet(n3, null);
        }
        return atomicLongFieldUpdater;
    }

    public final Object g0() {
        Object object;
        block3: {
            block2: {
                object = this.d();
                if (object == null) break block2;
                this.a(object);
                if (object != null) break block3;
            }
            object = this.c();
        }
        return object;
    }

    public void h(Object object) {
        Intrinsics.checkNotNullParameter(object, "instance");
    }
}

