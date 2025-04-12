/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WR
 */
public final class wr_2
extends wx2_2 {
    public final le_2 e;
    public final /* synthetic */ AtomicReferenceArray f;

    public wr_2(long l2, wr_2 wr_22, le_2 le_22, int n3) {
        super(l2, wr_22, n3);
        AtomicReferenceArray atomicReferenceArray;
        this.e = le_22;
        int n4 = pe_2.b * 2;
        this.f = atomicReferenceArray = new AtomicReferenceArray(n4);
    }

    public final int g() {
        return pe_2.b;
    }

    public final void h(int n3, CoroutineContext object) {
        le_2 le_22;
        int n4 = pe_2.b;
        boolean bl2 = n3 >= n4;
        if (bl2) {
            n3 -= n4;
        }
        AtomicReferenceArray atomicReferenceArray = this.f;
        int bl3 = n3 * 2;
        atomicReferenceArray = atomicReferenceArray.get(bl3);
        while (true) {
            gh3_2 gh3_22;
            Object object2 = this.l(n3);
            boolean bl4 = object2 instanceof me3_2;
            le_22 = this.e;
            if (!bl4 && !(bl4 = object2 instanceof ne3_2)) {
                gh3_22 = pe_2.j;
                if (object2 != gh3_22 && object2 != (gh3_22 = pe_2.k)) {
                    gh3_22 = pe_2.g;
                    if (object2 == gh3_22 || object2 == (gh3_22 = pe_2.f)) continue;
                    Object function1 = pe_2.i;
                    if (object2 != function1 && object2 != (function1 = pe_2.d)) {
                        function1 = pe_2.l;
                        if (object2 == function1) {
                            return;
                        }
                        object = new StringBuilder("unexpected state: ");
                        ((StringBuilder)object).append(object2);
                        object = ((StringBuilder)object).toString().toString();
                        function1 = new IllegalStateException((String)object);
                        throw function1;
                    }
                    return;
                }
                this.n(n3, null);
                if (bl2) {
                    Intrinsics.checkNotNull(le_22);
                    Function1 function1 = le_22.b;
                    if (function1 != null) {
                        hz0_2.a(function1, atomicReferenceArray, (CoroutineContext)object);
                    }
                }
                return;
            }
            gh3_22 = bl2 ? pe_2.j : pe_2.k;
            boolean bl5 = this.k(n3, object2, gh3_22);
            if (bl5) break;
        }
        this.n(n3, null);
        boolean bl6 = bl2 ^ true;
        this.m(n3, bl6);
        if (bl2) {
            Intrinsics.checkNotNull(le_22);
            Function1 function1 = le_22.b;
            if (function1 != null) {
                hz0_2.a(function1, atomicReferenceArray, (CoroutineContext)object);
            }
        }
    }

    public final boolean k(int n3, Object object, Object object2) {
        boolean bl2;
        AtomicReferenceArray atomicReferenceArray = this.f;
        n3 *= 2;
        int n4 = 1;
        n3 += n4;
        while (!(bl2 = atomicReferenceArray.compareAndSet(n3, object, object2))) {
            Object e2 = atomicReferenceArray.get(n3);
            if (e2 == object) continue;
            n4 = 0;
            break;
        }
        return n4 != 0;
    }

    public final Object l(int n3) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        n3 = n3 * 2 + 1;
        return atomicReferenceArray.get(n3);
    }

    public final void m(int n3, boolean bl2) {
        if (bl2) {
            le_2 le_22 = this.e;
            Intrinsics.checkNotNull(le_22);
            int n4 = pe_2.b;
            long l2 = n4;
            long l3 = this.c * l2;
            l2 = n3;
            le_22.N(l3 += l2);
        }
        this.i();
    }

    public final void n(int n3, Object object) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        atomicReferenceArray.set(n3 *= 2, object);
    }

    public final void o(int n3, Object object) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        n3 = n3 * 2 + 1;
        atomicReferenceArray.set(n3, object);
    }
}

