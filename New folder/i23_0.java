/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.b;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from i23
 */
public class i23_0
extends p1_0
implements qr1_2,
es0_2,
ox0_2 {
    public final int e;
    public final int f;
    public final he_2 g;
    public Object[] h;
    public long i;
    public long j;
    public int k;
    public int l;

    public i23_0(int n3, int n4, he_2 he_22) {
        this.e = n3;
        this.f = n4;
        this.g = he_22;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static j90_0 l(i23_0 var0, fs0_2 var1_3, f80_0 var2_5) {
        block23: {
            block25: {
                block24: {
                    block26: {
                        var3_7 = var2_5 instanceof j23_0;
                        if (!var3_7) ** GOTO lbl-1000
                        var4_8 = var2_5;
                        var4_8 = (j23_0)var2_5;
                        var5_9 = var4_8.g;
                        var6_10 = -1 << -1;
                        var7_11 = var5_9 & var6_10;
                        if (var7_11 != 0) {
                            var4_8.g = var5_9 -= var6_10;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var4_8 = new j23_0((i23_0)var0, (f80_0)var2_5);
                        }
                        var2_5 = var4_8.e;
                        var8_12 = j90_0.COROUTINE_SUSPENDED;
                        var6_10 = var4_8.g;
                        var7_11 = 3;
                        var9_13 = 2;
                        var10_14 = 1;
                        if (var6_10 == 0) break block26;
                        if (var6_10 != var10_14) {
                            block22: {
                                if (var6_10 != var9_13) {
                                    if (var6_10 != var7_11) {
                                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        throw var0;
                                    }
                                    var0 = var4_8.d;
                                    var1_3 = var4_8.c;
                                    var11_15 = var4_8.b;
                                    var12_16 = var4_8.a;
lbl28:
                                    // 2 sources

                                    while (true) {
                                        try {
                                            vl2_2.b(var2_5);
                                            break block22;
                                        }
                                        catch (Throwable var0_1) {
                                            break block23;
                                        }
                                        break;
                                    }
                                }
                                var0 = var4_8.d;
                                var1_3 = var4_8.c;
                                var11_15 = var4_8.b;
                                var12_16 = var4_8.a;
                                ** continue;
                            }
                            var2_5 = var11_15;
                            var11_15 = var0;
                            var0 = var12_16;
                        } else {
                            var1_3 = var4_8.c;
                            var0 = var4_8.b;
                            var11_15 = var4_8.a;
                            try {
                                vl2_2.b(var2_5);
                                var2_5 = var0;
                                var0 = var11_15;
                                break block24;
                            }
                            catch (Throwable var0_2) {
                                var12_16 = var11_15;
                                break block23;
                            }
                        }
                    }
                    vl2_2.b(var2_5);
                    var2_5 = (l23_0)var0.f();
                    var6_10 = var1_3 instanceof bf3_2;
                    if (var6_10 != 0) {
                        var11_15 = var1_3;
                        try {
                            var11_15 = (bf3_2)var1_3;
                            var4_8.a = var0;
                            var4_8.b = (fs0_2)var1_3;
                            var4_8.c = var2_5;
                            var4_8.g = var10_14;
                            var11_15 = var11_15.c(var4_8);
                            if (var11_15 == var8_12) {
                                return var8_12;
                            }
                        }
                        catch (Throwable var1_4) {
                            var12_16 = var0;
                            var0 = var1_4;
                            var1_3 = var2_5;
                            break block23;
                        }
                    }
                    var13_17 = var2_5;
                    var2_5 = var1_3;
                    var1_3 = var13_17;
                }
                try {
                    var11_15 = var4_8.getContext();
                    var12_16 = i$a.a;
                    var11_15 = var11_15.get((CoroutineContext$a)var12_16);
                    var11_15 = (i)var11_15;
lbl85:
                    // 4 sources

                    while (true) {
                        var12_16 = var0.t((l23_0)var1_3);
                        if (var12_16 == (var14_18 = k23_0.a)) {
                        }
                        ** GOTO lbl-1000
                        break;
                    }
                }
                catch (Throwable var2_6) {
                    break block25;
                }
                {
                    var4_8.a = var0;
                    var4_8.b = (fs0_2)var2_5;
                    var4_8.c = var1_3;
                    var4_8.d = var11_15;
                    var4_8.g = var9_13;
                    var12_16 = var0.j((l23_0)var1_3, (j23_0)var4_8);
                    if (var12_16 != var8_12) ** GOTO lbl85
                    return var8_12;
                }
            }
            var12_16 = var0;
            var0 = var2_6;
            break block23;
lbl-1000:
            // 1 sources

            {
                if (var11_15 != null && !(var15_19 = var11_15.isActive())) {
                    var2_5 = var11_15.w();
                    throw var2_5;
                }
                var4_8.a = var0;
                var4_8.b = (fs0_2)var2_5;
                var4_8.c = var1_3;
                var4_8.d = var11_15;
                var4_8.g = var7_11;
                if ((var12_16 = ((fs0_2)var2_5).emit(var12_16, var4_8)) == var8_12) ** break;
                ** continue;
                return var8_12;
            }
        }
        var12_16.i((r1_0)var1_3);
        throw var0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean a(Object object) {
        int n3;
        boolean bl2;
        f80_0[] f80_0Array;
        int n4;
        block6: {
            block5: {
                n4 = 1;
                f80_0Array = q1_0.a;
                // MONITORENTER : this
                bl2 = this.r(object);
                n3 = 0;
                if (!bl2) break block5;
                f80_0Array = this.o(f80_0Array);
                bl2 = true;
                break block6;
            }
            bl2 = false;
            object = null;
        }
        // MONITOREXIT : this
        int n7 = f80_0Array.length;
        while (n3 < n7) {
            f80_0 f80_02 = f80_0Array[n3];
            if (f80_02 != null) {
                Object object2 = tl2_2.b;
                object2 = Unit.a;
                f80_02.resumeWith(object2);
            }
            n3 += n4;
        }
        return bl2;
    }

    public final List c() {
        synchronized (this) {
            Throwable throwable2;
            long l2 = this.p();
            int n3 = this.k;
            long l3 = n3;
            l2 += l3;
            l3 = this.i;
            int n4 = (int)(l2 -= l3);
            if (n4 == 0) {
                mz0_2 mz0_22 = mz0_2.a;
                return mz0_22;
            }
            ArrayList<Object> arrayList = new ArrayList<Object>(n4);
            Object[] objectArray = this.h;
            Intrinsics.checkNotNull(objectArray);
            for (int i3 = 0; i3 < n4; ++i3) {
                long l4;
                try {
                    l4 = this.i;
                }
                catch (Throwable throwable2) {
                }
                long l7 = i3;
                l4 += l7;
                Object object = k23_0.c(objectArray, l4);
                arrayList.add(object);
                continue;
            }
            return arrayList;
            throw throwable2;
        }
    }

    public final Object collect(fs0_2 fs0_22, f80_0 f80_02) {
        return i23_0.l(this, fs0_22, f80_02);
    }

    public final void d() {
        synchronized (this) {
            long l2 = this.p();
            int n3 = this.k;
            long l3 = n3;
            long l4 = l2 + l3;
            long l7 = this.j;
            l2 = this.p();
            n3 = this.k;
            l3 = n3;
            long l8 = l2 + l3;
            l2 = this.p();
            n3 = this.k;
            l3 = n3;
            l2 += l3;
            n3 = this.l;
            l3 = n3;
            long l12 = l2 + l3;
            this.u(l4, l7, l8, l12);
            Unit unit = Unit.a;
            return;
        }
    }

    public final es0_2 e(CoroutineContext coroutineContext, int n3, he_2 he_22) {
        return k23_0.e(this, coroutineContext, n3, he_22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object emit(Object object, f80_0 f80_02) {
        j90_0 j90_02;
        Object object2;
        CancellableContinuationImpl cancellableContinuationImpl;
        Object object3;
        int n3;
        int n4;
        block10: {
            int n7;
            i23$a i23$a;
            f80_0[] f80_0Array;
            block9: {
                n4 = 1;
                n3 = this.a(object);
                if (n3 != 0) {
                    return Unit.a;
                }
                object3 = zj1_2.b(f80_02);
                cancellableContinuationImpl = new CancellableContinuationImpl(n4, (f80_0)object3);
                cancellableContinuationImpl.r();
                f80_0Array = q1_0.a;
                // MONITORENTER : this
                n3 = this.r(object);
                if (n3 == 0) break block9;
                object = tl2_2.b;
                object = Unit.a;
                cancellableContinuationImpl.resumeWith(object);
                object = this.o(f80_0Array);
                n3 = 0;
                object3 = null;
                break block10;
            }
            long l2 = this.p();
            int n8 = this.k;
            int n10 = this.l;
            long l3 = (long)(n8 += n10) + l2;
            object3 = i23$a;
            object2 = this;
            i23$a = new i23$a(this, l3, object, cancellableContinuationImpl);
            this.n(i23$a);
            this.l = n7 = this.l + n4;
            n7 = this.f;
            if (n7 == 0) {
                f80_0Array = this.o(f80_0Array);
            }
            object = f80_0Array;
            object3 = i23$a;
        }
        // MONITOREXIT : this
        if (object3 != null) {
            object2 = new mr0_2((fr0_1)object3);
            dl_2.b(cancellableContinuationImpl, (b)object2);
        }
        n3 = ((f80_0[])object).length;
        object2 = null;
        for (int i3 = 0; i3 < n3; i3 += n4) {
            f80_0 f80_03 = object[i3];
            if (f80_03 == null) continue;
            Object object4 = tl2_2.b;
            object4 = Unit.a;
            f80_03.resumeWith(object4);
        }
        object = cancellableContinuationImpl.q();
        if (object == (j90_02 = j90_0.COROUTINE_SUSPENDED)) {
            object3 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object3);
        }
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return object;
    }

    public final r1_0 g() {
        l23_0 l23_02 = new l23_0();
        return l23_02;
    }

    public final r1_0[] h() {
        return new l23_0[2];
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object j(l23_0 object, j23_0 j23_02) {
        void var2_2;
        Object object2 = zj1_2.b((f80_0)var2_2);
        int n3 = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(n3, (f80_0)object2);
        cancellableContinuationImpl.r();
        synchronized (this) {
            long l2 = this.s((l23_0)object);
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 < 0) {
                ((l23_0)object).b = cancellableContinuationImpl;
            } else {
                object = tl2_2.b;
                object = Unit.a;
                cancellableContinuationImpl.resumeWith(object);
            }
            object = Unit.a;
        }
        object = cancellableContinuationImpl.q();
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        if (object == j90_02) {
            object2 = "frame";
            Intrinsics.checkNotNullParameter(var2_2, (String)object2);
        }
        if (object == j90_02) {
            return object;
        }
        return Unit.a;
    }

    public final void k() {
        int n3;
        int n4 = this.f;
        if (n4 == 0 && (n4 = this.l) <= (n3 = 1)) {
            return;
        }
        Object[] objectArray = this.h;
        Intrinsics.checkNotNull(objectArray);
        while ((n3 = this.l) > 0) {
            gh3_2 gh3_22;
            long l2 = this.p();
            int n7 = this.k;
            int n8 = this.l;
            long l3 = n7 += n8;
            l2 += l3;
            l3 = 1L;
            Object object = k23_0.c(objectArray, l2 -= l3);
            if (object != (gh3_22 = k23_0.a)) break;
            this.l = n3 = this.l + -1;
            l2 = this.p();
            n7 = this.k;
            n8 = this.l;
            l3 = n7 + n8;
            n7 = 0;
            k23_0.d(objectArray, l2 += l3, null);
        }
    }

    public final void m() {
        long l2;
        int n3;
        Object[] objectArray = this.h;
        Intrinsics.checkNotNull(objectArray);
        long l3 = this.p();
        int n4 = 0;
        k23_0.d(objectArray, l3, null);
        this.k = n3 = this.k + -1;
        long l4 = this.p() + 1L;
        long l7 = this.i;
        long l8 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
        if (l8 < 0) {
            this.i = l4;
        }
        if ((l8 = (l2 = (l7 = this.j) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) < 0) {
            r1_0[] r1_0Array;
            int n7 = this.b;
            if (n7 != 0 && (r1_0Array = this.a) != null) {
                n4 = r1_0Array.length;
                for (l8 = (long)0; l8 < n4; ++l8) {
                    long l12;
                    r1_0 r1_02 = r1_0Array[l8];
                    if (r1_02 == null) continue;
                    r1_02 = (l23_0)r1_02;
                    long l14 = ((l23_0)r1_02).a;
                    long l15 = 0L;
                    long l16 = l14 - l15;
                    Object object = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                    if (object < 0 || (l12 = l14 == l4 ? 0 : (l14 < l4 ? -1 : 1)) >= 0) continue;
                    ((l23_0)r1_02).a = l4;
                }
            }
            this.j = l4;
        }
    }

    public final void n(Object object) {
        int n3 = this.k;
        int n4 = this.l;
        n3 += n4;
        Object[] objectArray = this.h;
        int n7 = 2;
        if (objectArray == null) {
            n4 = 0;
            boolean bl2 = false;
            objectArray = this.q(null, 0, n7);
        } else {
            int n8 = objectArray.length;
            if (n3 >= n8) {
                n8 = objectArray.length * 2;
                objectArray = this.q(objectArray, n3, n8);
            }
        }
        long l2 = this.p();
        long l3 = n3;
        k23_0.d(objectArray, l2 += l3, object);
    }

    public final f80_0[] o(f80_0[] f80_0Array) {
        r1_0[] r1_0Array;
        int n3 = f80_0Array.length;
        int n4 = this.b;
        if (n4 != 0 && (r1_0Array = this.a) != null) {
            for (r1_0 r1_02 : r1_0Array) {
                Object object;
                int n7;
                long l2;
                long l3;
                long l4;
                long l7;
                if (r1_02 == null) continue;
                r1_02 = (l23_0)r1_02;
                CancellableContinuationImpl cancellableContinuationImpl = ((l23_0)r1_02).b;
                if (cancellableContinuationImpl == null || (l7 = (l4 = (l3 = this.s((l23_0)r1_02)) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) < 0) continue;
                int n8 = f80_0Array.length;
                if (n3 >= n8) {
                    n8 = f80_0Array.length;
                    n7 = 2;
                    n8 *= 2;
                    n8 = Math.max(n7, n8);
                    f80_0Array = Arrays.copyOf(f80_0Array, n8);
                    object = "copyOf(...)";
                    Intrinsics.checkNotNullExpressionValue(f80_0Array, (String)object);
                }
                object = f80_0Array;
                object = f80_0Array;
                n7 = n3 + 1;
                object[n3] = cancellableContinuationImpl;
                ((l23_0)r1_02).b = null;
                n3 = n7;
            }
        }
        return f80_0Array;
    }

    public final long p() {
        long l2 = this.j;
        long l3 = this.i;
        return Math.min(l2, l3);
    }

    public final Object[] q(Object[] object, int n3, int n4) {
        if (n4 > 0) {
            Object[] objectArray = new Object[n4];
            this.h = objectArray;
            if (object == null) {
                return objectArray;
            }
            long l2 = this.p();
            for (int i3 = 0; i3 < n3; ++i3) {
                long l3 = (long)i3 + l2;
                int n7 = (int)l3;
                int n8 = ((Object[])object).length + -1;
                Object object2 = object[n7 &= n8];
                k23_0.d(objectArray, l3, object2);
            }
            return objectArray;
        }
        String string2 = "Buffer size overflow".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean r(Object object) {
        long l2;
        long l3;
        long l4;
        int n3 = this.b;
        int n4 = this.e;
        int n7 = 1;
        if (n3 == 0) {
            if (n4 == 0) return n7 != 0;
            this.n(object);
            this.k = n3 = this.k + n7;
            if (n3 > n4) {
                this.m();
            }
            long l7 = this.p();
            int n8 = this.k;
            long l8 = n8;
            this.j = l7 += l8;
            return n7 != 0;
        }
        n3 = this.k;
        int n10 = this.f;
        if (n3 >= n10 && (n3 = (int)((l4 = (l3 = this.j) - (l2 = this.i)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) <= 0) {
            int[] nArray = i23$b.$EnumSwitchMapping$0;
            he_2 he_22 = this.g;
            int n14 = he_22.ordinal();
            n3 = nArray[n14];
            if (n3 == n7) return false;
            n14 = 2;
            if (n3 == n14) return n7 != 0;
            n14 = 3;
            if (n3 != n14) {
                NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                throw noWhenBranchMatchedException;
            }
        }
        this.n(object);
        this.k = n3 = this.k + n7;
        if (n3 > n10) {
            this.m();
        }
        long l12 = this.p();
        long l14 = this.k;
        l12 += l14;
        l14 = this.i;
        n3 = (int)(l12 -= l14);
        if (n3 <= n4) return n7 != 0;
        long l15 = 1L;
        long l16 = l14 + l15;
        l3 = this.j;
        l2 = this.p();
        long l17 = this.k;
        l2 += l17;
        l17 = this.p();
        long l18 = this.k;
        l17 += l18;
        n3 = this.l;
        l18 = n3;
        i23_0 i23_02 = this;
        this.u(l16, l3, l2, l17 += l18);
        return n7 != 0;
    }

    public final long s(l23_0 l23_02) {
        long l2 = l23_02.a;
        long l3 = this.p();
        long l4 = this.k;
        long l7 = l2 - (l3 += l4);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return l2;
        }
        object = this.f;
        l3 = -1;
        if (object > 0) {
            return l3;
        }
        l4 = this.p();
        long l8 = l2 - l4;
        object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object > 0) {
            return l3;
        }
        object = this.l;
        if (object == false) {
            return l3;
        }
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object t(l23_0 object) {
        Object object2;
        block7: {
            long l2;
            block8: {
                object2 = q1_0.a;
                // MONITORENTER : this
                long l3 = this.s((l23_0)object);
                l2 = 0L;
                long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                if (l4 < 0) {
                    object = k23_0.a;
                    break block7;
                }
                l2 = object.a;
                object2 = this.h;
                Intrinsics.checkNotNull(object2);
                object2 = k23_0.c(object2, l3);
                l4 = object2 instanceof i23$a;
                if (l4 == false) break block8;
                object2 = (i23$a)object2;
                object2 = object2.c;
            }
            long l7 = 1L;
            object.a = l3 += l7;
            object = this.v(l2);
            Object object3 = object2;
            object2 = object;
            object = object3;
        }
        // MONITOREXIT : this
        int n3 = ((f80_0[])object2).length;
        int n4 = 0;
        while (n4 < n3) {
            Object object4 = object2[n4];
            if (object4 != null) {
                Object object5 = tl2_2.b;
                object5 = Unit.a;
                object4.resumeWith(object5);
            }
            ++n4;
        }
        return object;
    }

    public final void u(long l2, long l3, long l4, long l7) {
        int n3;
        int n4;
        long l8;
        long l12 = Math.min(l3, l2);
        long l14 = this.p();
        while ((l8 = l14 == l12 ? 0 : (l14 < l12 ? -1 : 1)) < 0) {
            Object[] objectArray = this.h;
            Intrinsics.checkNotNull(objectArray);
            k23_0.d(objectArray, l14, null);
            long l15 = 1L;
            l14 += l15;
        }
        this.i = l2;
        this.j = l3;
        this.k = n4 = (int)(l4 - l12);
        this.l = n3 = (int)(l7 - l4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final f80_0[] v(long l2) {
        long l3;
        long l4;
        Object[] objectArray;
        long l7;
        long l8;
        int n3;
        long l12;
        long l14;
        long l15;
        r1_0[] r1_0Array;
        int n4;
        i23_0 i23_02 = this;
        long l16 = this.j;
        f80_0[] f80_0Array = q1_0.a;
        Object object = l2 == l16 ? 0 : (l2 < l16 ? -1 : 1);
        if (object > 0) {
            return f80_0Array;
        }
        l16 = this.p();
        int n7 = this.k;
        long l17 = (long)n7 + l16;
        int n8 = this.f;
        long l18 = 1L;
        if (n8 == 0 && (n4 = this.l) > 0) {
            l17 += l18;
        }
        if ((n4 = i23_02.b) != 0 && (r1_0Array = i23_02.a) != null) {
            for (r1_0 r1_02 : r1_0Array) {
                long l19;
                if (r1_02 == null) continue;
                l23_0 l23_02 = (l23_0)r1_02;
                l15 = l23_02.a;
                long l20 = 0L;
                long l21 = l15 - l20;
                Object object2 = l21 == 0L ? 0 : (l21 < 0L ? -1 : 1);
                if (object2 < 0 || (l19 = l15 == l17 ? 0 : (l15 < l17 ? -1 : 1)) >= 0) continue;
                l17 = l15;
            }
        }
        if ((n4 = (int)((l14 = l17 - (l12 = i23_02.j)) == 0L ? 0 : (l14 < 0L ? -1 : 1))) <= 0) {
            return f80_0Array;
        }
        l12 = this.p();
        l15 = i23_02.k;
        l12 += l15;
        n4 = i23_02.b;
        if (n4 > 0) {
            l15 = l12 - l17;
            n4 = (int)l15;
            n3 = i23_02.l;
            n4 = n8 - n4;
            n4 = Math.min(n3, n4);
        } else {
            n4 = i23_02.l;
        }
        n3 = i23_02.l;
        l15 = (long)n3 + l12;
        gh3_2 gh3_22 = k23_0.a;
        if (n4 <= 0) {
            l8 = l17;
            l7 = l15;
            objectArray = f80_0Array;
        } else {
            f80_0[] f80_0Array2;
            block14: {
                long l22;
                f80_0Array2 = new f80_0[n4];
                objectArray = i23_02.h;
                Intrinsics.checkNotNull(objectArray);
                l18 = l12;
                int n10 = 0;
                while ((l22 = l12 == l15 ? 0 : (l12 < l15 ? -1 : 1)) < 0) {
                    l8 = l17;
                    Object object3 = k23_0.c(objectArray, l12);
                    if (object3 != gh3_22) {
                        f80_0 f80_02;
                        String string2 = "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter";
                        Intrinsics.checkNotNull(object3, string2);
                        object3 = (i23$a)object3;
                        int n14 = n10 + 1;
                        l7 = l15;
                        f80_0Array2[n10] = f80_02 = ((i23$a)object3).d;
                        k23_0.d(objectArray, l12, gh3_22);
                        object3 = ((i23$a)object3).c;
                        k23_0.d(objectArray, l18, object3);
                        l15 = 1L;
                        l18 += l15;
                        if (n14 >= n4) break block14;
                        n10 = n14;
                    } else {
                        l7 = l15;
                        l15 = 1L;
                    }
                    l12 += l15;
                    l17 = l8;
                    l15 = l7;
                }
                l8 = l17;
                l7 = l15;
            }
            objectArray = f80_0Array2;
            l12 = l18;
        }
        l16 = l12 - l16;
        int n15 = (int)l16;
        int n16 = i23_02.b;
        l17 = n16 == 0 ? l12 : l8;
        l18 = i23_02.i;
        n16 = Math.min(i23_02.e, n15);
        l16 = n16;
        l16 = l12 - l16;
        l16 = Math.max(l18, l16);
        if (n8 == 0 && (l4 = l16 == l7 ? 0 : (l16 < l7 ? -1 : 1)) < 0) {
            Object[] objectArray2 = i23_02.h;
            Intrinsics.checkNotNull(objectArray2);
            Object object4 = k23_0.c(objectArray2, l16);
            l4 = (long)Intrinsics.areEqual(object4, gh3_22);
            if (l4 != false) {
                l3 = 1L;
                l12 += l3;
                l16 += l3;
            }
        }
        l3 = l12;
        this.u(l16, l17, l12, l7);
        this.k();
        n16 = objectArray.length;
        n15 = 1;
        n16 = n16 == 0 ? 1 : 0;
        if ((n16 ^= n15) == 0) return objectArray;
        return i23_02.o((f80_0[])objectArray);
    }
}

