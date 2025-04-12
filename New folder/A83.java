/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class A83 {
    public static final A83$a a;
    public static final U83 b;
    public static final Object c;
    public static y83 d;
    public static int e;
    public static final x83_0 f;
    public static final V83 g;
    public static List h;
    public static List i;
    public static final AtomicReference j;
    public static final v83_0 k;
    public static final Uq l;

    static {
        int n3;
        a = A83$a.c;
        Serializable serializable = new Serializable();
        b = serializable;
        serializable = new Serializable();
        c = serializable;
        serializable = y83.e;
        d = serializable;
        e = n3 = 2;
        Object object = new Object();
        int n4 = 16;
        int[] nArray = new int[n4];
        ((x83_0)object).b = nArray;
        nArray = new int[n4];
        ((x83_0)object).c = nArray;
        nArray = new int[n4];
        int n7 = 0;
        while (n7 < n4) {
            int n8;
            nArray[n7] = n8 = n7 + 1;
            n7 = n8;
        }
        ((x83_0)object).d = nArray;
        f = object;
        object = new Object();
        nArray = new int[n4];
        ((V83)object).b = nArray;
        jf3_0[] jf3_0Array = new jf3_0[n4];
        ((V83)object).c = jf3_0Array;
        g = object;
        h = object = mz0_2.a;
        i = object;
        n4 = e;
        e = n4 + 1;
        object = new f01_0(n4, (y83)((Object)serializable));
        serializable = d;
        n4 = ((v83_0)object).b;
        d = ((y83)((Object)serializable)).f(n4);
        j = serializable = new Serializable(object);
        k = (v83_0)serializable.get();
        serializable = new Serializable(0);
        l = serializable;
    }

    public static final void a() {
        A83.f(z83.c);
    }

    public static final Function1 b(Function1 function1, Function1 function12) {
        if (function1 != null && function12 != null && function1 != function12) {
            B83 b83 = new B83(function1, function12);
            function1 = b83;
        } else if (function1 == null) {
            function1 = function12;
        }
        return function1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final HashMap c(RR1 rR1, RR1 rR12, y83 y832) {
        Object object = rR12.w();
        int n3 = rR1.d();
        if (object == null) return null;
        y83 y833 = rR12.e();
        int n4 = rR12.d();
        y833 = y833.f(n4);
        Object[] objectArray = rR12.j;
        y833 = y833.e((y83)objectArray);
        objectArray = ((ft2_0)object).b;
        object = ((ft2_0)object).a;
        int n7 = ((Object)object).length + -2;
        if (n7 < 0) {
            return null;
        }
        int n8 = 0;
        HashMap<Rb3, Object> hashMap = null;
        while (true) {
            y83 y834;
            int n10;
            Object object2;
            block6: {
                int n14;
                reference var12_12;
                block5: {
                    var12_12 = object[n8];
                    reference var14_13 = var12_12 ^ (long)-1;
                    n14 = 7;
                    var14_13 = var14_13 << n14 & var12_12;
                    long l2 = -9187201950435737472L;
                    reference cfr_temp_0 = (var14_13 &= l2) - l2;
                    Object object3 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    if (object3 != false) break block5;
                    object2 = object;
                    n10 = n3;
                    y834 = y833;
                    object = null;
                    break block6;
                }
                int n15 = ~(n8 - n7) >>> 31;
                n15 = 8 - n15;
                for (n14 = 0; n14 < n15; var12_12 >>= n3, ++n14) {
                    block11: {
                        block7: {
                            Rb3 rb3;
                            Rb3 rb32;
                            pb3_0 pb3_02;
                            block10: {
                                block9: {
                                    Rb3 rb33;
                                    block8: {
                                        long l3 = 0xFFL & var12_12;
                                        long l4 = 128L;
                                        long l7 = l3 - l4;
                                        n10 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                        if (n10 >= 0) break block7;
                                        int n16 = (n8 << 3) + n14;
                                        pb3_02 = (pb3_0)objectArray[n16];
                                        rb33 = pb3_02.h();
                                        rb32 = A83.t(rb33, n3, y832);
                                        if (rb32 != null) break block8;
                                        object2 = object;
                                        break block9;
                                    }
                                    object2 = object;
                                    object = A83.t(rb33, n3, y833);
                                    if (object == null || (n10 = (int)(Intrinsics.areEqual(rb32, object) ? 1 : 0)) != 0) break block9;
                                    n10 = n3;
                                    n3 = rR12.d();
                                    y834 = y833;
                                    y833 = rR12.e();
                                    rb3 = A83.t(rb33, n3, y833);
                                    if (rb3 == null) {
                                        A83.s();
                                        throw null;
                                    }
                                    break block10;
                                }
                                n10 = n3;
                                y834 = y833;
                                break block11;
                            }
                            if ((object = pb3_02.i((Rb3)object, rb32, rb3)) == null) return null;
                            if (hashMap == null) {
                                hashMap = new HashMap<Rb3, Object>();
                            }
                            rb3 = hashMap;
                            hashMap.put(rb32, object);
                            break block11;
                        }
                        object2 = object;
                        n10 = n3;
                        y834 = y833;
                    }
                    object = null;
                    n3 = 8;
                    object = object2;
                    n3 = n10;
                    y833 = y834;
                }
                object2 = object;
                n10 = n3;
                y834 = y833;
                object = null;
                n3 = 8;
                if (n15 != n3) return hashMap;
            }
            if (n8 == n7) return hashMap;
            ++n8;
            object = object2;
            n3 = n10;
            y833 = y834;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d(v83_0 object) {
        boolean bl2;
        Object object2 = d;
        Object object3 = ((v83_0)object).d();
        boolean bl3 = ((y83)object2).d((int)object3);
        if (bl3) {
            return;
        }
        object2 = new StringBuilder("Snapshot is not open: id=");
        object3 = ((v83_0)object).d();
        ((StringBuilder)object2).append((int)object3);
        ((StringBuilder)object2).append(", disposed=");
        object3 = ((v83_0)object).c;
        ((StringBuilder)object2).append((boolean)object3);
        Object object4 = ", applied=";
        ((StringBuilder)object2).append((String)object4);
        object3 = object instanceof RR1;
        if (object3 != 0) {
            object = (RR1)object;
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            bl2 = ((RR1)object).m;
            object = bl2;
        } else {
            object = "read-only";
        }
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(", lowestPin=");
        object = c;
        synchronized (object) {
            object4 = f;
            int n3 = ((x83_0)object4).a;
            if (n3 > 0) {
                object4 = ((x83_0)object4).b;
                n3 = 0;
                object3 = object4[0];
            } else {
                object3 = -1;
            }
        }
        ((StringBuilder)object2).append((int)object3);
        object = ((StringBuilder)object2).toString();
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public static final y83 e(y83 y832, int n3, int n4) {
        while (n3 < n4) {
            y832 = y832.f(n3);
            ++n3;
        }
        return y832;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object f(Function1 var0) {
        block20: {
            var1_1 = 1;
            var2_2 = A83.k;
            var3_3 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot";
            Intrinsics.checkNotNull(var2_2, (String)var3_3);
            var2_2 = (f01_0)var2_2;
            var2_2 = A83.c;
            synchronized (var2_2) {
                block15: {
                    try {
                        var3_3 = A83.j;
                        var4_4 = var3_3 = var3_3.get();
                        var4_4 = (f01_0)var3_3;
                        var4_4 = var4_4.h;
                        if (var4_4 == null) break block15;
                        var5_5 = A83.l;
                        var5_5.addAndGet(var1_1);
                    }
                    catch (Throwable var6_6) {
                        ** break block16
                    }
                }
                var5_5 = var3_3;
                var5_5 = (v83_0)var3_3;
                var7_10 = var0;
                var5_5 = A83.w((v83_0)var5_5, (Function1)var0);
            }
            var2_2 = null;
            if (var4_4 != null) {
                block17: {
                    var8_11 = -1;
                    try {
                        var9_12 = A83.h;
                        var10_13 = var9_12.size();
                        for (var11_14 = 0; var11_14 < var10_13; var11_14 += var1_1) {
                            var12_15 = var9_12.get(var11_14);
                            var12_15 = (Function2)var12_15;
                            var13_16 = new ht2_1((ft2_0)var4_4);
                            var12_15.invoke(var13_16, var3_3);
                        }
                    }
                    catch (Throwable var6_7) {
                        break block17;
                    }
                    var3_3 = A83.l;
                    var3_3.addAndGet(var8_11);
                    break block20;
                }
                A83.l.addAndGet(var8_11);
                throw var6_7;
            }
        }
        var3_3 = A83.c;
        synchronized (var3_3) {
            block19: {
                block18: {
                    block21: {
                        try {
                            A83.g();
                            if (var4_4 == null) break block18;
                            var7_10 = var4_4.b;
                            var4_4 = var4_4.a;
                            var14_17 = ((Object)var4_4).length + -2;
                            if (var14_17 >= 0) {
                                var10_13 = 0;
lbl60:
                                // 2 sources

                                while (true) {
                                    var15_18 = var4_4[var10_13];
                                    break;
                                }
                            }
                            ** GOTO lbl-1000
                        }
                        catch (Throwable var6_8) {
                            break block19;
                        }
                        var17_19 = var15_18 ^ (long)-1;
                        var19_20 = 7;
                        var17_19 = var17_19 << var19_20 & var15_18;
                        var20_21 = -9187201950435737472L;
                        cfr_temp_0 = (var17_19 &= var20_21) - var20_21;
                        var22_22 /* !! */  = (reference)(cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1));
                        if (var22_22 /* !! */  == false) break block21;
                        var23_23 = ~(var10_13 - var14_17) >>> 31;
                        var24_24 = 8;
                        var23_23 = 8 - var23_23;
                        for (var19_20 = 0; var19_20 < var23_23; var15_18 >>= var24_24, var19_20 += var1_1) {
                            var25_25 = 255L & var15_18;
                            var27_26 = 128L;
                            cfr_temp_1 = var25_25 - var27_26;
                            var29_27 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                            if (var29_27 >= 0) continue;
                            var30_28 = (var10_13 << 3) + var19_20;
                            {
                                var31_29 = var7_10[var30_28];
                                var31_29 = (pb3_0)var31_29;
                                A83.r((pb3_0)var31_29);
                            }
                        }
                        if (var23_23 != var24_24) ** GOTO lbl-1000
                    }
                    if (var10_13 == var14_17) ** GOTO lbl-1000
                    var10_13 += var1_1;
                    ** continue;
lbl-1000:
                    // 3 sources

                    {
                        var6_9 = Unit.a;
                    }
                }
                return var5_5;
            }
            throw var6_8;
        }
lbl-1000:
        // 1 sources

        {
            throw var6_6;
        }
    }

    public static final void g() {
        Object object;
        V83 v83 = g;
        int n3 = v83.a;
        int n4 = 0;
        int n7 = 0;
        while (true) {
            boolean bl2 = false;
            Object object2 = null;
            if (n4 >= n3) break;
            object = v83.c[n4];
            if (object != null) {
                object2 = ((Reference)object).get();
            }
            if (object2 != null && !(bl2 = A83.q((pb3_0)(object2 = (pb3_0)object2)) ^ true)) {
                if (n7 != n4) {
                    Object object3;
                    v83.c[n7] = object;
                    object2 = v83.b;
                    object2[n7] = object3 = object2[n4];
                }
                ++n7;
            }
            ++n4;
        }
        for (n4 = n7; n4 < n3; ++n4) {
            v83.c[n4] = null;
            object = v83.b;
            object[n4] = false;
        }
        if (n7 != n3) {
            v83.a = n7;
        }
    }

    public static final v83_0 h(v83_0 v83_02, Function1 function1, boolean bl2) {
        v83_0 v83_03;
        boolean bl3 = v83_02 instanceof RR1;
        if (!bl3 && v83_02 != null) {
            v83_03 = new rr3_0(v83_02, function1, bl2);
        } else {
            v83_02 = bl3 ? (RR1)v83_02 : null;
            qr3_0 qr3_02 = new qr3_0((RR1)v83_02, function1, null, false, bl2);
            v83_03 = qr3_02;
        }
        return v83_03;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Rb3 i(Rb3 rb3) {
        Object object = A83.k();
        int n3 = ((v83_0)object).d();
        object = ((v83_0)object).e();
        if ((object = A83.t(rb3, n3, (y83)object)) != null) return object;
        object = c;
        synchronized (object) {
            block7: {
                Object object2 = A83.k();
                int n4 = ((v83_0)object2).d();
                object2 = ((v83_0)object2).e();
                rb3 = A83.t(rb3, n4, (y83)object2);
                if (rb3 == null) break block7;
                object = rb3;
                return object;
            }
            A83.s();
            throw null;
            finally {
            }
        }
    }

    public static final Rb3 j(Rb3 rb3, v83_0 object) {
        int n3 = ((v83_0)object).d();
        if ((rb3 = A83.t(rb3, n3, (y83)(object = ((v83_0)object).e()))) != null) {
            return rb3;
        }
        A83.s();
        throw null;
    }

    public static final v83_0 k() {
        v83_0 v83_02 = (v83_0)b.a();
        if (v83_02 == null) {
            v83_02 = (v83_0)j.get();
        }
        return v83_02;
    }

    public static final Function1 l(Function1 function1, Function1 function12, boolean bl2) {
        if (!bl2) {
            function12 = null;
        }
        if (function1 != null && function12 != null && function1 != function12) {
            A83$b a83$b = new A83$b(function1, function12);
            function1 = a83$b;
        } else if (function1 == null) {
            function1 = function12;
        }
        return function1;
    }

    /*
     * Unable to fully structure code
     */
    public static final Rb3 m(Rb3 var0, pb3_0 var1_1) {
        var2_2 = var1_1.h();
        var3_3 = A83.e;
        var4_4 = A83.f;
        var5_5 = var4_4.a;
        if (var5_5 > 0) {
            var6_6 = var4_4.b;
            var3_3 = var6_6[0];
        }
        var7_7 = 1;
        var3_3 -= var7_7;
        var5_5 = 0;
        var8_8 = null;
        var9_9 = null;
        block0: while (var2_2 != null) {
            var10_10 = var2_2.a;
            if (var10_10 == 0) {
                while (true) {
                    var8_8 = var2_2;
                    break block0;
                    break;
                }
            }
            if (var10_10 != 0 && var10_10 <= var3_3) {
                block15: {
                    var11_11 = 0L;
                    var13_12 = 1L;
                    var15_13 = 64;
                    if ((var10_10 += 0) >= 0 && var10_10 < var15_13) {
                        cfr_temp_0 = (var13_12 = var13_12 << var10_10 & var11_11) - var11_11;
                        if ((var10_10 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) != 0) {
                            while (true) {
                                var10_10 = 1;
                                break block15;
                                break;
                            }
                        }
                    } else if (var10_10 >= var15_13 && var10_10 < (var15_13 = 128)) {
                        var10_10 += -64;
                        if ((var10_10 = (int)((cfr_temp_1 = (var13_12 = var13_12 << var10_10 & var11_11) - var11_11) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) != 0) ** continue;
                    }
                    var10_10 = 0;
                }
                if (var10_10 == 0) {
                    if (var9_9 == null) {
                        var9_9 = var2_2;
                    } else {
                        if ((var3_3 = var2_2.a) < (var7_7 = var9_9.a)) ** continue;
                        var8_8 = var9_9;
                        break;
                    }
                }
            }
            var2_2 = var2_2.b;
        }
        var16_14 = -1 >>> 1;
        if (var8_8 != null) {
            var8_8.a = var16_14;
        } else {
            var8_8 = var0.b();
            var8_8.a = var16_14;
            var0 = var1_1.h();
            var8_8.b = var0;
            Intrinsics.checkNotNull(var8_8, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16");
            var1_1.g(var8_8);
            var0 = "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked";
            Intrinsics.checkNotNull(var8_8, (String)var0);
        }
        return var8_8;
    }

    public static final Rb3 n(Rb3 rb3, pb3_0 object, v83_0 v83_02) {
        Object object2 = c;
        synchronized (object2) {
            object = A83.m(rb3, (pb3_0)object);
            ((Rb3)object).a(rb3);
            int n3 = v83_02.d();
            ((Rb3)object).a = n3;
            return object;
        }
    }

    public static final void o(v83_0 object, pb3_0 pb3_02) {
        int n3 = ((v83_0)object).h() + 1;
        ((v83_0)object).s(n3);
        object = ((v83_0)object).i();
        if (object != null) {
            object.invoke(pb3_02);
        }
    }

    public static final Rb3 p(Rb3 rb3, pb3_0 pb3_02, v83_0 v83_02, Rb3 rb32) {
        int n3;
        int n4 = v83_02.g();
        if (n4 != 0) {
            v83_02.n(pb3_02);
        }
        if ((n3 = rb32.a) == (n4 = v83_02.d())) {
            return rb32;
        }
        Object object = c;
        synchronized (object) {
            rb3 = A83.m(rb3, pb3_02);
            rb3.a = n4;
            int n7 = rb32.a;
            n4 = 1;
            if (n7 != n4) {
                v83_02.n(pb3_02);
            }
            return rb3;
        }
    }

    public static final boolean q(pb3_0 pb3_02) {
        Rb3 rb3 = pb3_02.h();
        int n3 = e;
        Object object = f;
        int n4 = ((x83_0)object).a;
        boolean bl2 = false;
        if (n4 > 0) {
            int[] nArray = ((x83_0)object).b;
            n3 = nArray[0];
        }
        object = null;
        n4 = 0;
        Rb3 rb32 = null;
        int n7 = 0;
        while (rb3 != null) {
            int n8 = rb3.a;
            if (n8 != 0) {
                if (n8 < n3) {
                    if (object == null) {
                        ++n7;
                        object = rb3;
                    } else {
                        Object object2;
                        block14: {
                            int n10 = ((Rb3)object).a;
                            if (n8 < n10) {
                                object2 = object;
                                object = rb3;
                            } else {
                                object2 = rb3;
                            }
                            if (rb32 == null) {
                                Rb3 rb33 = rb32 = pb3_02.h();
                                while (rb32 != null) {
                                    int n14 = rb32.a;
                                    if (n14 < n3) {
                                        int n15 = rb33.a;
                                        if (n15 < n14) {
                                            rb33 = rb32;
                                        }
                                        rb32 = rb32.b;
                                        continue;
                                    }
                                    break block14;
                                }
                                rb32 = rb33;
                            }
                        }
                        ((Rb3)object).a = 0;
                        ((Rb3)object).a(rb32);
                        object = object2;
                    }
                } else {
                    ++n7;
                }
            }
            rb3 = rb3.b;
        }
        int n16 = 1;
        if (n7 > n16) {
            bl2 = true;
        }
        return bl2;
    }

    public static final void r(pb3_0 object) {
        block25: {
            int n3;
            Object[] objectArray;
            Object object2;
            Object object3;
            int n4;
            int[] nArray;
            int n7;
            jf3_0 jf3_02;
            int n8;
            int n10;
            int n14;
            int n15;
            V83 v83;
            block26: {
                block23: {
                    boolean bl2 = A83.q((pb3_0)object);
                    if (!bl2) break block25;
                    v83 = g;
                    n15 = v83.a;
                    n14 = System.identityHashCode(object);
                    n10 = -1;
                    n8 = 0;
                    jf3_02 = null;
                    if (n15 <= 0) break block26;
                    int n16 = v83.a + -1;
                    n7 = 0;
                    nArray = null;
                    while (n7 <= n16) {
                        block24: {
                            Object object4 = v83.b;
                            Object object5 = n7 + n16 >>> 1;
                            n4 = object4[object5];
                            if (n4 < n14) {
                                n7 = object5 + 1;
                                continue;
                            }
                            if (n4 > n14) {
                                n16 = object5 + -1;
                                continue;
                            }
                            object3 = v83.c[object5];
                            n7 = 0;
                            nArray = null;
                            if (object3 != null) {
                                object3 = object3.get();
                            } else {
                                n16 = 0;
                                object3 = null;
                            }
                            if (object == object3) {
                                n10 = object5;
                                break block23;
                            }
                            for (n16 = object5 + -1; n10 < n16 && (n4 = (object4 = v83.b)[n16]) == n14; n16 += -1) {
                                object4 = v83.c[n16];
                                if (object4 != null) {
                                    object4 = object4.get();
                                } else {
                                    n4 = 0;
                                    object4 = null;
                                }
                                if (object4 != object) {
                                    continue;
                                }
                                break block24;
                            }
                            n10 = v83.a;
                            for (n16 = ++object5; n16 < n10; ++n16) {
                                object2 = v83.b;
                                object5 = object2[n16];
                                if (object5 != n14) {
                                    n16 = -(n16 + 1);
                                } else {
                                    object2 = v83.c[n16];
                                    if (object2 != null) {
                                        object2 = object2.get();
                                    } else {
                                        object5 = 0;
                                        object2 = null;
                                    }
                                    if (object2 != object) {
                                        continue;
                                    }
                                }
                                break block24;
                            }
                            n10 = v83.a + 1;
                            n16 = -n10;
                        }
                        n10 = n16;
                        break block23;
                    }
                    n10 = -(++n7);
                }
                if (n10 >= 0) break block25;
            }
            n10 = -(n10 + 1);
            object3 = v83.c;
            n7 = ((jf3_0[])object3).length;
            if (n15 == n7) {
                object2 = new jf3_0[n7 *= 2];
                nArray = new int[n7];
                n4 = n10 + 1;
                rp_1.i(object3, n4, object2, n10, n15);
                object3 = v83.c;
                int n17 = 6;
                rp_1.k(object3, 0, object2, n10, n17);
                object3 = v83.b;
                rp_1.f(n4, n10, n15, (int[])object3, nArray);
                objectArray = v83.b;
                rp_1.j(0, n10, n17, (int[])objectArray, nArray);
                v83.c = object2;
                v83.b = nArray;
            } else {
                n8 = n10 + 1;
                rp_1.i(object3, n8, object3, n10, n15);
                object3 = v83.b;
                rp_1.f(n8, n10, n15, (int[])object3, (int[])object3);
            }
            objectArray = v83.c;
            objectArray[n10] = jf3_02 = new WeakReference(object);
            object = v83.b;
            object[n10] = n14;
            v83.a = n3 = v83.a + 1;
        }
    }

    public static final void s() {
        String string2 = "Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static final Rb3 t(Rb3 rb3, int n3, y83 y832) {
        Rb3 rb32 = null;
        while (rb3 != null) {
            int n4;
            int n7 = rb3.a;
            if (n7 != 0 && n7 <= n3 && (n7 = (int)(y832.d(n7) ? 1 : 0)) == 0 && (rb32 == null || (n7 = rb32.a) < (n4 = rb3.a))) {
                rb32 = rb3;
            }
            rb3 = rb3.b;
        }
        if (rb32 != null) {
            return rb32;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Rb3 u(Rb3 object, pb3_0 object2) {
        int n3;
        Object object3 = A83.k();
        Object object4 = ((v83_0)object3).f();
        if (object4 != null) {
            object4.invoke(object2);
        }
        if ((object = A83.t((Rb3)object, n3 = ((v83_0)object3).d(), (y83)(object3 = ((v83_0)object3).e()))) != null) return object;
        object = c;
        synchronized (object) {
            block10: {
                object3 = A83.k();
                object2 = object2.h();
                object4 = "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9";
                Intrinsics.checkNotNull(object2, (String)object4);
                n3 = ((v83_0)object3).d();
                object3 = ((v83_0)object3).e();
                object2 = A83.t((Rb3)object2, n3, (y83)object3);
                if (object2 == null) break block10;
                return object2;
            }
            A83.s();
            object2 = null;
            throw null;
        }
    }

    public static final void v(int n3) {
        int n4;
        int n7;
        x83_0 x83_02 = f;
        int[] nArray = x83_02.d;
        int n8 = nArray[n3];
        int n10 = x83_02.a + -1;
        x83_02.b(n8, n10);
        x83_02.a = n10 = x83_02.a + -1;
        int[] nArray2 = x83_02.b;
        int n14 = nArray2[n8];
        int n15 = n8;
        while (n15 > 0 && (n7 = nArray2[n4 = (n15 + 1 >> 1) + -1]) > n14) {
            x83_02.b(n4, n15);
            n15 = n4;
        }
        nArray2 = x83_02.b;
        n14 = x83_02.a >> 1;
        while (n8 < n14) {
            int n16;
            n15 = n8 + 1 << 1;
            n4 = n15 + -1;
            n7 = x83_02.a;
            if (n15 < n7 && (n7 = nArray2[n15]) < (n16 = nArray2[n4])) {
                n4 = nArray2[n8];
                if (n7 >= n4) break;
                x83_02.b(n15, n8);
                n8 = n15;
                continue;
            }
            n15 = nArray2[n4];
            n7 = nArray2[n8];
            if (n15 >= n7) break;
            x83_02.b(n4, n8);
            n8 = n4;
        }
        nArray = x83_02.d;
        nArray[n3] = n10 = x83_02.e;
        x83_02.e = n3;
    }

    public static final Object w(v83_0 object, Function1 object2) {
        Object object3 = d;
        int n3 = ((v83_0)object).d();
        object3 = ((y83)object3).c(n3);
        object2 = object2.invoke(object3);
        object3 = c;
        synchronized (object3) {
            int n4;
            n3 = e;
            e = n4 = n3 + 1;
            y83 y832 = d;
            int n7 = ((v83_0)object).d();
            d = y832 = y832.c(n7);
            AtomicReference atomicReference = j;
            f01_0 f01_02 = new f01_0(n3, y832);
            atomicReference.set(f01_02);
            ((v83_0)object).c();
            object = d;
            d = object = ((y83)object).f(n3);
            object = Unit.a;
            return object2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Rb3 x(Rb3 rb3, pb3_0 pb3_02, v83_0 v83_02) {
        Object object;
        Object object2;
        void var1_1;
        void var2_2;
        int n3 = var2_2.g();
        if (n3 != 0) {
            var2_2.n((pb3_0)var1_1);
        }
        n3 = var2_2.d();
        y83 y832 = var2_2.e();
        rb3 = A83.t(rb3, n3, y832);
        int n4 = 0;
        y832 = null;
        if (rb3 == null) {
            A83.s();
            throw null;
        }
        int n7 = rb3.a;
        int n8 = var2_2.d();
        if (n7 == n8) {
            return rb3;
        }
        Object object3 = c;
        synchronized (object3) {
            object2 = var1_1.h();
            y83 y833 = var2_2.e();
            object2 = A83.t((Rb3)object2, n3, y833);
            if (object2 == null) {
                A83.s();
                throw null;
            }
            n4 = ((Rb3)object2).a;
            if (n4 != n3) {
                object = A83.m((Rb3)object2, (pb3_0)var1_1);
                ((Rb3)object).a((Rb3)object2);
                ((Rb3)object).a = n4 = var2_2.d();
                object2 = object;
            }
        }
        object = "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord";
        Intrinsics.checkNotNull(object2, (String)object);
        int n10 = rb3.a;
        n3 = 1;
        if (n10 == n3) return object2;
        var2_2.n((pb3_0)var1_1);
        return object2;
    }
}

