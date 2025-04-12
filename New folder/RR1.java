/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public class RR1
extends v83_0 {
    public static final int[] n = new int[0];
    public final Function1 e;
    public final Function1 f;
    public int g;
    public pr1_1 h;
    public ArrayList i;
    public y83 j;
    public int[] k;
    public int l;
    public boolean m;

    public RR1(int n3, y83 y832, Function1 function1, Function1 function12) {
        super(n3, y832);
        this.e = function1;
        this.f = function12;
        Object object = y83.e;
        this.j = object;
        object = n;
        this.k = (int[])object;
        this.l = 1;
    }

    public final void A(y83 object) {
        Object object2 = A83.c;
        synchronized (object2) {
            y83 y832 = this.j;
            object = y832.e((y83)object);
            this.j = object;
            object = Unit.a;
            return;
        }
    }

    public void B(pr1_1 pr1_12) {
        this.h = pr1_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public RR1 C(Function1 object, Function1 object2) {
        lu1_0 lu1_02;
        Object object3;
        int n3 = 1;
        int n4 = this.c ^ n3;
        int n7 = 0;
        Object object4 = null;
        if (n4 == 0) {
            sn2.b("Cannot use a disposed snapshot");
            throw null;
        }
        n4 = this.m;
        if (n4 != 0 && (n4 = this.d) < 0) {
            sn2.c("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        n4 = this.d();
        this.z(n4);
        Object object5 = A83.c;
        synchronized (object5) {
            int n8 = A83.e;
            A83.e = n7 = n8 + 1;
            object4 = A83.d;
            object4 = ((y83)object4).f(n8);
            A83.d = object4;
            object4 = this.e();
            y83 y832 = ((y83)object4).f(n8);
            this.r(y832);
            int n10 = this.d() + n3;
            y832 = A83.e((y83)object4, n10, n8);
            object4 = this.x();
            Function1 function1 = A83.l((Function1)object, (Function1)object4, n3 != 0);
            object = this.i();
            Function1 function12 = A83.b((Function1)object3, (Function1)object);
            object4 = lu1_02;
            lu1_02 = new lu1_0(n8, y832, function1, function12, this);
        }
        int n14 = this.m;
        if (n14 == 0 && (n14 = this.c) == 0) {
            n14 = this.d();
            synchronized (object5) {
                int n15 = A83.e;
                A83.e = n7 = n15 + 1;
                this.q(n15);
                object3 = A83.d;
                n7 = this.d();
                object3 = ((y83)object3).f(n7);
                A83.d = object3;
                object3 = Unit.a;
            }
            object3 = this.e();
            n14 += n3;
            n3 = this.d();
            object = A83.e((y83)object3, n14, n3);
            this.r((y83)object);
        }
        return lu1_02;
    }

    public final void b() {
        y83 y832 = A83.d;
        int n3 = this.d();
        y832 = y832.c(n3);
        y83 y833 = this.j;
        A83.d = y832.a(y833);
    }

    public void c() {
        boolean bl2 = this.c;
        if (!bl2) {
            super.c();
            this.l();
        }
    }

    public boolean g() {
        return false;
    }

    public int h() {
        return this.g;
    }

    public Function1 i() {
        return this.f;
    }

    public void k() {
        int n3;
        this.l = n3 = this.l + 1;
    }

    public void l() {
        Object[] objectArray;
        int n3;
        RR1 rR1 = this;
        int n4 = this.l;
        int n7 = 1;
        if (n4 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            objectArray = null;
        }
        int n8 = 0;
        if (n3 != 0) {
            rR1.l = n4 += -1;
            if (n4 == 0 && (n4 = (int)(rR1.m ? 1 : 0)) == 0) {
                Object object = this.w();
                if (object != null) {
                    n3 = rR1.m;
                    if ((n7 ^= n3) != 0) {
                        rR1.B(null);
                        n7 = this.d();
                        objectArray = ((ft2_0)object).b;
                        object = ((ft2_0)object).a;
                        n8 = ((Object)object).length + -2;
                        if (n8 >= 0) {
                            int n10 = 0;
                            while (true) {
                                reference var9_9 = object[n10];
                                reference var11_10 = var9_9 ^ (long)-1;
                                int n14 = 7;
                                var11_10 = var11_10 << n14 & var9_9;
                                long l2 = -9187201950435737472L;
                                reference cfr_temp_0 = (var11_10 &= l2) - l2;
                                Object object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                if (object2 != false) {
                                    int n15 = ~(n10 - n8) >>> 31;
                                    int n16 = 8;
                                    n15 = 8 - n15;
                                    for (n14 = 0; n14 < n15; ++n14) {
                                        long l3 = 0xFFL & var9_9;
                                        long l4 = 128L;
                                        long l7 = l3 - l4;
                                        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                        if (object3 < 0) {
                                            int n17 = (n10 << 3) + n14;
                                            Rb3 rb3 = ((pb3_0)objectArray[n17]).h();
                                            while (rb3 != null) {
                                                Integer n18;
                                                y83 y832;
                                                object2 = rb3.a;
                                                if (object2 == n7 || (object2 = (Object)CollectionsKt.F(y832 = rR1.j, n18 = Integer.valueOf((int)object2))) != false) {
                                                    rb3.a = 0;
                                                }
                                                rb3 = rb3.b;
                                            }
                                        }
                                        var9_9 >>= n16;
                                    }
                                    if (n15 != n16) break;
                                }
                                if (n10 != n8) {
                                    ++n10;
                                    continue;
                                }
                                break;
                            }
                        }
                    } else {
                        sn2.c("Unsupported operation on a snapshot that has been applied");
                        throw null;
                    }
                }
                this.a();
            }
            return;
        }
        sn2.b("no pending nested snapshots");
        throw null;
    }

    public void m() {
        boolean bl2 = this.m;
        if (!bl2 && !(bl2 = this.c)) {
            this.u();
        }
    }

    public void n(pb3_0 pb3_02) {
        pr1_1 pr1_12 = this.w();
        if (pr1_12 == null) {
            pr1_12 = gt2_1.a();
            this.B(pr1_12);
        }
        pr1_12.d(pb3_02);
    }

    public final void o() {
        int[] nArray = this.k;
        int n3 = nArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            int[] nArray2 = this.k;
            int n4 = nArray2[i3];
            A83.v(n4);
        }
        n3 = this.d;
        if (n3 >= 0) {
            A83.v(n3);
            this.d = n3 = -1;
        }
    }

    public void s(int n3) {
        this.g = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public v83_0 t(Function1 object) {
        Object object2;
        Object object3;
        int n3;
        int n4 = 1;
        int n7 = this.c ^ n4;
        int n8 = 0;
        Object object4 = null;
        if (n7 == 0) {
            sn2.b("Cannot use a disposed snapshot");
            throw null;
        }
        n7 = this.m;
        if (n7 != 0 && (n7 = this.d) < 0) {
            sn2.c("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        n7 = this.d();
        n8 = this.d();
        this.z(n8);
        object4 = A83.c;
        synchronized (object4) {
            int n10;
            n3 = A83.e;
            A83.e = n10 = n3 + 1;
            object3 = A83.d;
            object3 = ((y83)object3).f(n3);
            A83.d = object3;
            Object object5 = this.e();
            object2 = A83.e((y83)object5, n7 += n4, n3);
            object5 = this.x();
            object = A83.l((Function1)object, (Function1)object5, n4 != 0);
            object3 = new nu1_1(n3, (y83)object2, (Function1)object, this);
        }
        int n14 = this.m;
        if (n14 == 0 && (n14 = this.c) == 0) {
            n14 = this.d();
            synchronized (object4) {
                n7 = A83.e;
                A83.e = n3 = n7 + 1;
                this.q(n7);
                object2 = A83.d;
                n3 = this.d();
                object2 = ((y83)object2).f(n3);
                A83.d = object2;
                object2 = Unit.a;
            }
            object2 = this.e();
            n14 += n4;
            n4 = this.d();
            object = A83.e((y83)object2, n14, n4);
            this.r((y83)object);
        }
        return object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u() {
        int n3;
        int n32 = this.d();
        this.z(n32);
        Object object = Unit.a;
        n32 = (int)(this.m ? 1 : 0);
        if (n32 != 0) return;
        n32 = (int)(this.c ? 1 : 0);
        if (n32 != 0) return;
        n32 = this.d();
        Object object2 = A83.c;
        synchronized (object2) {
            int n4;
            n3 = A83.e;
            A83.e = n4 = n3 + 1;
            this.q(n3);
            y83 y832 = A83.d;
            n4 = this.d();
            A83.d = y832 = y832.f(n4);
        }
        object2 = this.e();
        n3 = this.d();
        object = A83.e((y83)object2, ++n32, n3);
        this.r((y83)object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public w83_0 v() {
        void var14_18;
        int n3;
        Object object;
        int n4;
        Object object2;
        pb3_0 pb3_02;
        int n7;
        int n8;
        Object object3;
        block35: {
            long l2;
            reference var30_30;
            Object object4;
            int n10;
            long l3;
            int n14;
            long l4;
            int n15;
            y83 y832;
            int n16;
            block36: {
                pr1_1 pr1_12;
                block34: {
                    Function2 function2;
                    Object object5;
                    int n17;
                    int n18;
                    Object object6;
                    Object object7;
                    block32: {
                        block33: {
                            object3 = this;
                            n8 = 1;
                            pr1_12 = this.w();
                            n7 = 0;
                            pb3_02 = null;
                            if (pr1_12 != null) {
                                object7 = A83.j;
                                object6 = (RR1)((AtomicReference)object7).get();
                                object2 = A83.d;
                                n16 = ((f01_0)((AtomicReference)object7).get()).b;
                                object7 = ((y83)object2).c(n16);
                                object7 = A83.c((RR1)object6, this, (y83)object7);
                            } else {
                                n16 = 0;
                                object7 = null;
                            }
                            object6 = mz0_2.a;
                            object2 = A83.c;
                            // MONITORENTER : object2
                            A83.d(this);
                            if (pr1_12 == null || (n18 = pr1_12.d) == 0) break block32;
                            object6 = A83.j;
                            object6 = ((AtomicReference)object6).get();
                            object6 = (f01_0)object6;
                            n18 = A83.e;
                            y832 = A83.d;
                            n17 = ((v83_0)object6).b;
                            if ((n18 = (int)(Intrinsics.areEqual(object7 = ((RR1)object3).y(n18, (HashMap)object7, y832 = y832.c(n17)), object5 = w83$b.a) ? 1 : 0)) != 0) break block33;
                            return object7;
                        }
                        this.b();
                        object7 = A83.a;
                        A83.w((v83_0)object6, (Function1)object7);
                        object7 = ((RR1)object6).h;
                        ((RR1)object3).B(null);
                        ((RR1)object6).h = null;
                        object6 = A83.h;
                    }
                    this.b();
                    object7 = A83.j;
                    object7 = ((AtomicReference)object7).get();
                    object7 = (f01_0)object7;
                    object5 = A83.a;
                    A83.w((v83_0)object7, (Function1)object5);
                    object7 = ((RR1)object7).h;
                    if (object7 != null && (n18 = (int)(((ft2_0)object7).c() ? 1 : 0)) != 0) {
                        object6 = A83.h;
                    } else {
                        n16 = 0;
                        object7 = null;
                    }
                    object5 = Unit.a;
                    // MONITOREXIT : object2
                    ((RR1)object3).m = n8;
                    if (object7 != null) {
                        object5 = new ht2_1((ft2_0)object7);
                        n15 = ((ft2_0)object7).b() ^ n8;
                        if (n15 != 0) {
                            n15 = object6.size();
                            for (n17 = 0; n17 < n15; n17 += n8) {
                                function2 = (Function2)object6.get(n17);
                                function2.invoke(object5, object3);
                            }
                        }
                    }
                    if (pr1_12 != null && (n18 = (int)(pr1_12.c() ? 1 : 0)) != 0) {
                        object5 = new ht2_1(pr1_12);
                        n15 = object6.size();
                        for (n17 = 0; n17 < n15; n17 += n8) {
                            function2 = (Function2)object6.get(n17);
                            function2.invoke(object5, object3);
                        }
                    }
                    object6 = A83.c;
                    // MONITORENTER : object6
                    this.o();
                    A83.g();
                    l4 = 255L;
                    n14 = 7;
                    l3 = -9187201950435737472L;
                    n10 = 8;
                    if (object7 == null) break block34;
                    object4 = ((ft2_0)object7).b;
                    object7 = ((ft2_0)object7).a;
                    n4 = ((Object)object7).length + -2;
                    if (n4 < 0) break block34;
                    n7 = 0;
                    pb3_02 = null;
                    while (true) {
                        reference var25_27;
                        reference var27_28;
                        reference cfr_temp_0;
                        Object object8;
                        if ((object8 = (cfr_temp_0 = (var27_28 = ((var25_27 = object7[n7]) ^ (long)-1) << n14 & var25_27 & l3) - l3) == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1)) != false) {
                            n18 = ~(n7 - n4) >>> 31;
                            n18 = 8 - n18;
                            y832 = null;
                            for (n15 = 0; n15 < n18; var25_27 >>= n10, ++n15) {
                                var30_30 = var25_27 & l4;
                                l2 = 128L;
                                reference cfr_temp_1 = var30_30 - l2;
                                Object object9 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                if (object9 >= 0) continue;
                                object8 = (n7 << 3) + n15;
                                Object object10 = object4[object8];
                                object10 = (pb3_0)object10;
                                A83.r((pb3_0)object10);
                            }
                            if (n18 != n10) break;
                        }
                        if (n7 == n4) break;
                        ++n7;
                    }
                }
                if (pr1_12 == null) break block35;
                try {
                    object = pr1_12.b;
                    object3 = pr1_12.a;
                    n3 = ((Object)object3).length + -2;
                    if (n3 < 0) break block35;
                    n7 = 0;
                    pb3_02 = null;
                    break block36;
                }
                catch (Throwable throwable) {}
                object3 = this;
                throw var14_18;
            }
            while (true) {
                Object object11;
                reference var37_35;
                long l7;
                long l8;
                if ((n16 = (int)((l8 = (l7 = (l4 = (long)((var37_35 = object3[n7]) ^ (long)-1)) << n14 & var37_35 & l3) - l3) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0) {
                    l4 = 255L;
                    object11 = 1;
                    l2 = 128L;
                } else {
                    n16 = ~(n7 - n3) >>> 31;
                    n16 = 8 - n16;
                    y832 = null;
                    for (n15 = 0; n15 < n16; var37_35 >>= n10, n15 += object11) {
                        l4 = 255L;
                        var30_30 = var37_35 & l4;
                        l2 = 128L;
                        reference cfr_temp_3 = var30_30 - l2;
                        object11 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                        if (object11 < 0) {
                            object11 = (n7 << 3) + n15;
                            {
                                object4 = object[object11];
                                object4 = (pb3_0)object4;
                                A83.r((pb3_0)object4);
                            }
                        }
                        object11 = 1;
                    }
                    l4 = 255L;
                    object11 = 1;
                    l2 = 128L;
                    if (n16 != n10) break;
                }
                if (n7 == n3) break;
                n7 += object11;
            }
        }
        object3 = this;
        try {
            object = this.i;
            if (object != null) {
                n3 = object.size();
                object2 = null;
                for (n4 = 0; n4 < n3; n4 += n7) {
                    pb3_02 = (pb3_0)object.get(n4);
                    pb3_02 = pb3_02;
                    A83.r(pb3_02);
                    n7 = 1;
                }
            }
        }
        catch (Throwable throwable) {
            throw var14_18;
        }
        n8 = 0;
        object = null;
        ((RR1)object3).i = null;
        object = Unit.a;
        // MONITOREXIT : object6
        return w83$b.a;
    }

    public pr1_1 w() {
        return this.h;
    }

    public Function1 x() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final w83_0 y(int n3, HashMap hashMap, y83 y832) {
        int n4;
        int n7;
        Object object;
        Object object2;
        int n8;
        int n10;
        ArrayList<Object> arrayList;
        ArrayList<Object> arrayList2;
        int n14;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        block21: {
            ArrayList<Object> arrayList3;
            block23: {
                int n15;
                int n16;
                block22: {
                    object8 = this;
                    object7 = hashMap;
                    object6 = this.e();
                    int n17 = this.d();
                    object6 = ((y83)object6).f(n17);
                    object5 = this.j;
                    object6 = ((y83)object6).e((y83)object5);
                    object5 = this.w();
                    Intrinsics.checkNotNull(object5);
                    object4 = ((ft2_0)object5).b;
                    object3 = ((ft2_0)object5).a;
                    n16 = ((long[])object3).length + -2;
                    if (n16 >= 0) break block22;
                    n14 = 0;
                    object8 = null;
                    n15 = 0;
                    arrayList3 = null;
                    arrayList2 = null;
                    break block23;
                }
                int n18 = 0;
                arrayList = null;
                arrayList2 = null;
                while (true) {
                    int n19;
                    long[] lArray;
                    Object[] objectArray;
                    Object object9;
                    block25: {
                        long l2;
                        block24: {
                            l2 = object3[n18];
                            long l3 = l2 ^ (long)-1;
                            int n20 = 7;
                            l3 = l3 << n20 & l2;
                            long l4 = -9187201950435737472L;
                            long l7 = (l3 &= l4) - l4;
                            Object object10 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                            if (object10 != false) break block24;
                            object9 = object6;
                            objectArray = object4;
                            lArray = object3;
                            n14 = 0;
                            object8 = null;
                            n19 = 1;
                            break block25;
                        }
                        n15 = ~(n18 - n16) >>> 31;
                        n10 = 8;
                        n15 = 8 - n15;
                        for (int i3 = 0; i3 < n15; l2 >>= n8, i3 += n19) {
                            block20: {
                                block26: {
                                    block27: {
                                        Object object11;
                                        long l8 = l2 & 0xFFL;
                                        long l12 = 128L;
                                        long l14 = l8 - l12;
                                        Object object12 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                                        if (object12 >= 0) break block26;
                                        int n21 = (n18 << 3) + i3;
                                        object2 = object11 = object4[n21];
                                        object2 = (pb3_0)object11;
                                        object = object2.h();
                                        objectArray = object4;
                                        lArray = object3;
                                        n7 = n3;
                                        object3 = y832;
                                        object8 = A83.t((Rb3)object, n3, y832);
                                        if (object8 != null && (object4 = A83.t((Rb3)object, n7 = this.d(), (y83)object6)) != null) break block27;
                                        object9 = object6;
                                        break block20;
                                    }
                                    object9 = object6;
                                    n19 = ((Rb3)object4).a;
                                    int n22 = 1;
                                    if (n19 == n22 || (n19 = (int)(Intrinsics.areEqual(object8, object4) ? 1 : 0)) != 0) break block20;
                                    n19 = this.d();
                                    if ((object = A83.t((Rb3)object, n19, (y83)(object3 = (Object)this.e()))) == null) {
                                        A83.s();
                                        throw null;
                                    }
                                    if (object7 == null || (object6 = (Rb3)object7.get(object8)) == null) {
                                        object6 = object2.i((Rb3)object4, (Rb3)object8, (Rb3)object);
                                    }
                                    if (object6 == null) {
                                        return new w83_0();
                                    }
                                    n8 = (int)(Intrinsics.areEqual(object6, object) ? 1 : 0);
                                    if (n8 == 0) {
                                        n8 = (int)(Intrinsics.areEqual(object6, object8) ? 1 : 0);
                                        if (n8 != 0) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList<Object>();
                                            }
                                            object8 = ((Rb3)object8).b();
                                            object = new Pair(object2, object8);
                                            arrayList.add(object);
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList<Object>();
                                            }
                                            arrayList2.add(object2);
                                            break block20;
                                        } else {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList<Object>();
                                            }
                                            if ((n14 = (int)(Intrinsics.areEqual(object6, object4) ? 1 : 0)) == 0) {
                                                object8 = new Pair(object2, object6);
                                            } else {
                                                object8 = ((Rb3)object4).b();
                                                object8 = object = new Pair(object2, object8);
                                            }
                                            arrayList.add(object8);
                                        }
                                    }
                                    break block20;
                                }
                                object9 = object6;
                                objectArray = object4;
                                lArray = object3;
                            }
                            n14 = 0;
                            object8 = null;
                            n8 = 8;
                            n19 = 1;
                            object8 = this;
                            object4 = objectArray;
                            object3 = lArray;
                            object6 = object9;
                            n10 = 8;
                        }
                        object9 = object6;
                        objectArray = object4;
                        lArray = object3;
                        n14 = 0;
                        object8 = null;
                        n8 = 8;
                        n19 = 1;
                        if (n15 != n8) break block21;
                    }
                    if (n18 == n16) break;
                    n18 += n19;
                    object8 = this;
                    object4 = objectArray;
                    object3 = lArray;
                    object6 = object9;
                }
                arrayList3 = arrayList;
            }
            arrayList = arrayList3;
        }
        if (arrayList != null) {
            this.u();
            n4 = arrayList.size();
            object8 = null;
            for (n14 = 0; n14 < n4; n14 += n8) {
                object = (Pair)arrayList.get(n14);
                object6 = (pb3_0)((Pair)object).a;
                object = (Rb3)((Pair)object).b;
                ((Rb3)object).a = n7 = this.d();
                object4 = A83.c;
                synchronized (object4) {
                    object3 = object6.h();
                    ((Rb3)object).b = object3;
                    object6.g((Rb3)object);
                    object = Unit.a;
                }
                n8 = 1;
            }
        }
        if (arrayList2 == null) {
            object = this;
            return w83$b.a;
        }
        n4 = arrayList2.size();
        object2 = null;
        for (n10 = 0; n10 < n4; n10 += n14) {
            object8 = (pb3_0)arrayList2.get(n10);
            ((pr1_1)object5).j(object8);
            n14 = 1;
        }
        object = this;
        object7 = this.i;
        if (object7 != null) {
            arrayList2 = CollectionsKt.W(arrayList2, (Collection)object7);
        }
        ((RR1)object).i = arrayList2;
        return w83$b.a;
    }

    public final void z(int n3) {
        Object object = A83.c;
        synchronized (object) {
            y83 y832 = this.j;
            Object object2 = y832.f(n3);
            this.j = object2;
            object2 = Unit.a;
            return;
        }
    }
}

