/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.b$a;
import androidx.compose.foundation.text.modifiers.b$b;
import androidx.compose.foundation.text.modifiers.b$c;
import androidx.compose.foundation.text.modifiers.b$d;
import androidx.compose.foundation.text.modifiers.b$e;
import androidx.compose.foundation.text.modifiers.b$f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b
extends LP1$c
implements rp1_1,
it0_0,
dy2_0 {
    public Map A;
    public UQ1 B;
    public b$b C;
    public b$a D;
    public Sl n;
    public xm3 o;
    public RU0$a p;
    public Function1 q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public List v;
    public Function1 w;
    public UX2 x;
    public gy_1 y;
    public Function1 z;

    public b() {
        throw null;
    }

    public b(Sl sl, xm3 xm32, RU0$a rU0$a, Function1 function1, int n3, boolean bl2, int n4, int n7, List list, Function1 function12, UX2 uX2, gy_1 gy_12, Function1 function13) {
        this.n = sl;
        this.o = xm32;
        this.p = rU0$a;
        this.q = function1;
        this.r = n3;
        this.s = bl2;
        this.t = n4;
        this.u = n7;
        this.v = list;
        this.w = function12;
        this.x = uX2;
        this.y = gy_12;
        this.z = function13;
    }

    public static final void r1(b b2) {
        b2.getClass();
        go0.f(b2).J();
        go0.f(b2).I();
        jt0_0.a(b2);
    }

    public final /* synthetic */ void C0() {
    }

    public final /* synthetic */ boolean N() {
        return false;
    }

    public final /* synthetic */ boolean c1() {
        return false;
    }

    public final void i0(UY2 uY2) {
        Object object;
        b$b b$b = this.C;
        if (b$b == null) {
            this.C = b$b = new b$b(this);
        }
        Object object2 = this.n;
        Object object3 = RY2.a;
        object3 = MY2.v;
        object2 = kotlin.collections.a.b(object2);
        uY2.a((TY2)object3, object2);
        object2 = this.D;
        if (object2 != null) {
            object3 = ((b$a)object2).b;
            object = MY2.w;
            gn1_2[] gn1_2Array = RY2.a;
            int n3 = 14;
            gn1_2 cfr_ignored_0 = gn1_2Array[n3];
            object.getClass();
            uY2.a((TY2)object, object3);
            boolean bl2 = ((b$a)object2).c;
            object3 = MY2.x;
            int n4 = 15;
            object = gn1_2Array[n4];
            object2 = bl2;
            object3.getClass();
            uY2.a((TY2)object3, object2);
        }
        object2 = new b$c(this);
        object3 = yY2.j;
        object = new H1(null, (fx0_2)object2);
        uY2.a((TY2)object3, object);
        object2 = new b$d(this);
        object3 = yY2.k;
        object = new H1(null, (fx0_2)object2);
        uY2.a((TY2)object3, object);
        object2 = new b$e(this);
        object3 = yY2.l;
        object = new H1(null, (fx0_2)object2);
        uY2.a((TY2)object3, object);
        RY2.c(uY2, b$b);
    }

    public final int maxIntrinsicHeight(Rj1 object, Qj1 object2, int n3) {
        object2 = this.u1((Vo0)object);
        object = object.getLayoutDirection();
        return ((UQ1)object2).a(n3, (bp1_0)((Object)object));
    }

    public final int maxIntrinsicWidth(Rj1 object, Qj1 object2, int n3) {
        object2 = this.u1((Vo0)object);
        object = object.getLayoutDirection();
        return Nj3.a(((UQ1)object2).d((bp1_0)((Object)object)).b());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final bl1_0 measure-3p2s80s(dl1_1 object, xk1_0 object2, long l2) {
        int n3;
        Object object3;
        int n4;
        float f5;
        Object object4;
        int n7;
        int n8;
        Object object5;
        UQ1 uQ1;
        block11: {
            block12: {
                block9: {
                    block10: {
                        float f6;
                        float f7;
                        long l3;
                        Object object6;
                        uQ1 = this.u1((Vo0)object);
                        object5 = object.getLayoutDirection();
                        n8 = uQ1.g;
                        n7 = 1;
                        if (n8 > n7) {
                            object4 = uQ1.i;
                            object6 = uQ1.b;
                            Vo0 vo0 = uQ1.k;
                            Intrinsics.checkNotNull(vo0);
                            RU0$a rU0$a = uQ1.c;
                            uQ1.i = object4 = jP1$a.a((jp1_1)object4, (bp1_0)((Object)object5), (xm3)object6, vo0, rU0$a);
                            int n10 = uQ1.g;
                            l2 = ((jp1_1)object4).a(n10, l2);
                        }
                        if ((object4 = uQ1.n) == null) break block9;
                        object6 = ((Tl3)object4).b;
                        sq1_0 sq1_02 = ((RQ1)object6).a;
                        int n14 = sq1_02.a();
                        if (n14 != 0) break block9;
                        object4 = ((Tl3)object4).a;
                        bp1_0 bp1_02 = ((Sl3)object4).h;
                        if (object5 != bp1_02 || (n8 = (int)(c60.c(l2, l3 = ((Sl3)object4).j) ? 1 : 0)) == 0 && ((n8 = c60.i(l2)) != (n14 = c60.i(l3)) || (n8 = (int)((f7 = (f5 = (float)c60.h(l2)) - (f6 = ((RQ1)object6).e)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) < 0 || (n8 = (int)(((RQ1)object6).c ? 1 : 0)) != 0)) break block9;
                        object4 = uQ1.n;
                        Intrinsics.checkNotNull(object4);
                        object4 = ((Tl3)object4).a;
                        long l4 = ((Sl3)object4).j;
                        n8 = (int)(c60.c(l2, l4) ? 1 : 0);
                        if (n8 == 0) break block10;
                        n4 = 0;
                        object3 = null;
                        break block11;
                    }
                    object4 = uQ1.n;
                    Intrinsics.checkNotNull(object4);
                    object4 = ((Tl3)object4).b;
                    uQ1.n = object3 = uQ1.e((bp1_0)((Object)object5), l2, (RQ1)object4);
                    break block12;
                }
                object4 = uQ1.b(l2, (bp1_0)((Object)object5));
                object3 = uQ1.e((bp1_0)((Object)object5), l2, (RQ1)object4);
                uQ1.n = object3;
            }
            n4 = 1;
        }
        Tl3 tl3 = uQ1.n;
        if (tl3 == null) {
            object = new IllegalStateException("You must call layoutWithConstraints first");
            throw object;
        }
        sq1_0 sq1_03 = tl3.b.a;
        sq1_03.a();
        if (n4 != 0) {
            void var5_10;
            Map map2;
            UX2 uX2;
            n4 = 2;
            go0.d(this, n4).p1();
            Function1 function1 = this.q;
            if (function1 != null) {
                function1.invoke(tl3);
            }
            if ((uX2 = this.x) != null) {
                object5 = uX2.d.b;
                if (object5 != null && (n3 = (int)(Intrinsics.areEqual(object5 = ((Tl3)object5).a.a, object4 = tl3.a.a) ? 1 : 0)) == 0) {
                    object5 = uX2.b;
                    object5.c();
                }
                object5 = uX2.d;
                n8 = 0;
                f5 = 0.0f;
                object4 = null;
                object5 = wc3_1.a((wc3_1)object5, null, tl3, n7);
                uX2.d = object5;
            }
            if ((map2 = this.A) == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(n4);
            }
            object3 = Pc.a;
            object5 = Math.round(tl3.d);
            var5_10.put(object3, object5);
            object3 = Pc.b;
            float f8 = tl3.e;
            n3 = Math.round(f8);
            object5 = n3;
            var5_10.put(object3, object5);
            this.A = var5_10;
        }
        if ((object3 = this.w) != null) {
            ArrayList arrayList = tl3.f;
            object3.invoke(arrayList);
        }
        long l7 = tl3.c;
        l2 = l7 >> 32;
        int n15 = (int)l2;
        long l8 = 0xFFFFFFFFL;
        n4 = (int)(l7 &= l8);
        int n16 = 262142;
        n3 = Math.min(n15, n16);
        n8 = -1 >>> 1;
        f5 = 0.0f / 0.0f;
        n16 = n15 == n8 ? -1 >>> 1 : Math.min(n15, n16);
        n7 = n16 == n8 ? n3 : n16;
        n7 = f60.c(n7);
        if (n4 != n8) {
            n8 = Math.min(n7, n4);
        }
        n7 = Math.min(n7, n4);
        l7 = f60.a(n3, n16, n7, n8);
        object2 = object2.Q(l7);
        Map map3 = this.A;
        Intrinsics.checkNotNull(map3);
        object5 = new b$f((Ns2)object2);
        return object.V0(n15, n4, map3, (Function1)object5);
    }

    public final int minIntrinsicHeight(Rj1 object, Qj1 object2, int n3) {
        object2 = this.u1((Vo0)object);
        object = object.getLayoutDirection();
        return ((UQ1)object2).a(n3, (bp1_0)((Object)object));
    }

    public final int minIntrinsicWidth(Rj1 object, Qj1 object2, int n3) {
        object2 = this.u1((Vo0)object);
        object = object.getLayoutDirection();
        return Nj3.a(((UQ1)object2).d((bp1_0)((Object)object)).c());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(E60 var1_1) {
        block27: {
            block29: {
                block26: {
                    block28: {
                        var2_4 = this.m;
                        if (var2_4 == 0) {
                            return;
                        }
                        var3_5 = this.x;
                        var4_6 = 3;
                        var5_7 = false;
                        if (var3_5 == null) break block28;
                        var6_8 = var3_5.b.d();
                        var7_9 = var3_5.a;
                        if ((var6_8 = (MX2)var6_8.b(var7_9)) == null) break block28;
                        var9_10 = var6_8.b;
                        var10_11 = var6_8.a;
                        var11_12 = var6_8.c;
                        var12_13 = var11_12 == 0 ? var10_11.b : var9_10.b;
                        if (var12_13 == (var11_12 = var11_12 == 0 ? var9_10.b : var10_11.b)) break block28;
                        var3_5.getClass();
                        if (var12_13 > 0) {
                            var12_13 = 0;
                            var13_14 = 0.0f;
                            var14_15 = null;
                        }
                        if (var11_12 > 0) {
                            var11_12 = 0;
                            var6_8 = null;
                        }
                        if ((var9_10 = var3_5.d.b) != null) {
                            var6_8 = var9_10.k(var12_13, var11_12);
                        } else {
                            var11_12 = 0;
                            var6_8 = null;
                        }
                        var10_11 = var6_8;
                        if (var6_8 == null) break block28;
                        var6_8 = var3_5.d.b;
                        if (var6_8 == null) ** GOTO lbl-1000
                        var9_10 = var6_8.a;
                        var15_16 = (int)km3.b(var9_10.f, var4_6);
                        if (var15_16 == 0 && (var11_12 = (int)var6_8.d()) != 0) {
                            var16_17 = C63.d(var1_1.l());
                            var17_19 = var1_1.l();
                            var19_20 = C63.b(var17_19);
                            var6_8 = var1_1.M0();
                            var20_21 = var6_8.l();
                            var9_10 = var6_8.a();
                            var9_10.p();
                            try {
                                var14_15 = var6_8.a;
                                var22_22 = 1;
                                var23_23 = 0;
                                var24_24 = null;
                                var25_25 = null;
                                var14_15.b(0.0f, 0.0f, var16_17, var19_20, var22_22);
                                var26_26 = var3_5.c;
                                var28_27 = 60;
                                var19_20 = 8.4E-44f;
                                var25_25 = null;
                                var16_17 = 0.0f;
                                var29_28 = null;
                                var9_10 = var1_1;
                                Jt0.h((Kt0)var1_1, (gn2)var10_11, var26_26, 0.0f, null, var28_27);
                            }
                            finally {
                                jz.b((xL$b)var6_8, var20_21);
                            }
                        } else lbl-1000:
                        // 2 sources

                        {
                            var16_18 = 0.0f;
                            var29_28 = null;
                            var28_27 = 60;
                            var19_20 = 8.4E-44f;
                            var26_26 = var3_5.c;
                            var25_25 = null;
                            var9_10 = var1_1;
                            Jt0.h((Kt0)var1_1, (gn2)var10_11, var26_26, 0.0f, null, var28_27);
                        }
                    }
                    var3_5 = var1_1.M0().a();
                    var6_8 = this.u1((Vo0)var1_1).n;
                    if (var6_8 == null) {
                        var1_1 = new IllegalStateException("You must call layoutWithConstraints first");
                        throw var1_1;
                    }
                    var15_16 = var6_8.d();
                    var28_27 = 1;
                    var19_20 = 1.4E-45f;
                    var4_6 = var15_16 != 0 && (var4_6 = (int)km3.b(var15_16 = this.r, var4_6)) == 0 ? 1 : 0;
                    if (var4_6 != 0) {
                        var7_9 = var6_8.c;
                        var12_13 = 32;
                        var26_26 = var7_9 >> var12_13;
                        var23_23 = (int)var26_26;
                        var13_14 = var23_23;
                        var30_29 = (int)(var7_9 & 0xFFFFFFFFL);
                        var31_30 = var30_29;
                        var32_31 = 0L;
                        var7_9 = bo1_1.a(var13_14, var31_30);
                        var9_10 = cg2_0.d(var32_31, var7_9);
                        var3_5.p();
                        var3_5.d((aG2)var9_10, var28_27);
                    }
                    try {
                        var9_10 = this.o;
                        var9_10 = var9_10.a;
                        var10_11 = var9_10.m;
                        if (var10_11 == null) {
                            var10_11 = Jj3.b;
                        }
                        var25_25 = var10_11;
                        var10_11 = var9_10.n;
                        if (var10_11 == null) {
                            var10_11 = b13_0.d;
                        }
                        var24_24 = var10_11;
                        var10_11 = var9_10.p;
                        if (var10_11 == null) {
                            var10_11 = rM0.a;
                        }
                        var29_28 = var10_11;
                        var9_10 = var9_10.a;
                        var10_11 = var9_10.d();
                        var6_8 = var6_8.b;
                        if (var10_11 == null) break block26;
                    }
                    catch (Throwable var1_3) {
                        break block27;
                    }
                    var9_10 = this.o;
                    var9_10 = var9_10.a;
                    var9_10 = var9_10.a;
                    var13_14 = var9_10.getAlpha();
                    var9_10 = var3_5;
                    RQ1.h((RQ1)var6_8, (iL)var3_5, (ZD)var10_11, var13_14, (b13_0)var24_24, (Jj3)var25_25, (Qt0)var29_28);
                    break block29;
                }
                var9_10 = this.y;
                var7_9 = var9_10 != null ? var9_10.a() : OX.l;
                cfr_temp_0 = var7_9 - (var34_32 = (long)16);
                var12_13 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var12_13 == 0) {
                    var9_10 = this.o;
                    var7_9 = var9_10.b();
                    cfr_temp_1 = var7_9 - var34_32;
                    var12_13 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var12_13 != 0) {
                        var9_10 = this.o;
                        var7_9 = var9_10.b();
                    } else {
                        var7_9 = OX.b;
                    }
                }
                var9_10 = var3_5;
                RQ1.g((RQ1)var6_8, (iL)var3_5, var7_9, (b13_0)var24_24, (Jj3)var25_25, (Qt0)var29_28);
            }
            if (var4_6 != 0) {
                var3_5.h();
            }
            if ((var3_5 = this.D) != null && (var2_4 = var3_5.c) == var28_27) {
                var2_4 = 0;
                var3_5 = null;
            } else {
                var3_5 = this.n;
                var2_4 = (int)Fj3.a((Sl)var3_5);
            }
            if (var2_4 == 0) {
                var3_5 = this.v;
                if (var3_5 == null) return;
                var2_4 = (int)var3_5.isEmpty();
                if (var2_4 != 0) {
                    return;
                }
                if (var5_7 != false) return;
            }
            var1_1.e1();
            return;
        }
        if (var4_6 == 0) throw var1_3;
        var3_5.h();
        throw var1_3;
    }

    public final void s1(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        boolean bl6;
        Object object;
        if (bl3 || bl4 || bl5) {
            int n3;
            object = this.t1();
            Sl sl = this.n;
            xm3 xm32 = this.o;
            RU0$a rU0$a = this.p;
            int n4 = this.r;
            boolean bl7 = this.s;
            int n7 = this.t;
            int n8 = this.u;
            List list = this.v;
            ((UQ1)object).a = sl;
            ((UQ1)object).b = xm32;
            ((UQ1)object).c = rU0$a;
            ((UQ1)object).d = n4;
            ((UQ1)object).e = bl7;
            ((UQ1)object).f = n7;
            ((UQ1)object).g = n8;
            ((UQ1)object).h = list;
            sl = null;
            ((UQ1)object).l = null;
            ((UQ1)object).n = null;
            ((UQ1)object).p = n3 = -1;
            ((UQ1)object).o = n3;
        }
        if (!(bl6 = this.m)) {
            return;
        }
        if (bl3 || bl2 && (object = this.C) != null) {
            object = go0.f(this);
            ((xp1_0)object).J();
        }
        if (bl3 || bl4 || bl5) {
            xp1_0 xp1_02 = go0.f(this);
            xp1_02.I();
            jt0_0.a(this);
        }
        if (bl2) {
            jt0_0.a(this);
        }
    }

    public final UQ1 t1() {
        UQ1 uQ1 = this.B;
        if (uQ1 == null) {
            Sl sl = this.n;
            xm3 xm32 = this.o;
            RU0$a rU0$a = this.p;
            int n3 = this.r;
            boolean bl2 = this.s;
            int n4 = this.t;
            int n7 = this.u;
            List list = this.v;
            this.B = uQ1 = new UQ1(sl, xm32, rU0$a, n3, bl2, n4, n7, list);
        }
        uQ1 = this.B;
        Intrinsics.checkNotNull(uQ1);
        return uQ1;
    }

    public final UQ1 u1(Vo0 vo0) {
        boolean bl2;
        Object object = this.D;
        if (object != null && (bl2 = ((b$a)object).c) && (object = ((b$a)object).d) != null) {
            ((UQ1)object).c(vo0);
            return object;
        }
        object = this.t1();
        ((UQ1)object).c(vo0);
        return object;
    }

    public final boolean v1(Function1 function1, Function1 object, UX2 uX2, Function1 function12) {
        boolean bl2;
        boolean bl3;
        Function1 function13 = this.q;
        boolean bl4 = true;
        if (function13 != function1) {
            this.q = function1;
            bl3 = true;
        } else {
            bl3 = false;
            function1 = null;
        }
        function13 = this.w;
        if (function13 != object) {
            this.w = object;
            bl3 = true;
        }
        if (!(bl2 = Intrinsics.areEqual(object = this.x, uX2))) {
            this.x = uX2;
            bl3 = true;
        }
        if ((object = this.z) != function12) {
            this.z = function12;
        } else {
            bl4 = bl3;
        }
        return bl4;
    }

    public final boolean w1(xm3 object, List list, int n3, int n4, boolean n7, RU0$a rU0$a, int n8) {
        xm3 xm32 = this.o;
        boolean bl2 = xm32.c((xm3)object);
        boolean bl3 = true;
        bl2 ^= bl3;
        this.o = object;
        object = this.v;
        int n10 = Intrinsics.areEqual(object, list);
        if (n10 == 0) {
            this.v = list;
            bl2 = true;
        }
        if ((n10 = this.u) != n3) {
            this.u = n3;
            bl2 = true;
        }
        if ((n10 = this.t) != n4) {
            this.t = n4;
            bl2 = true;
        }
        if ((n10 = (int)(this.s ? 1 : 0)) != n7) {
            this.s = n7;
            bl2 = true;
        }
        if ((n10 = (int)(Intrinsics.areEqual(object = this.p, rU0$a) ? 1 : 0)) == 0) {
            this.p = rU0$a;
            bl2 = true;
        }
        if ((n10 = (int)(km3.b(this.r, n8) ? 1 : 0)) == 0) {
            this.r = n8;
        } else {
            bl3 = bl2;
        }
        return bl3;
    }

    public final boolean x1(Sl sl) {
        List list;
        String string2 = this.n.a;
        String string3 = sl.a;
        boolean bl2 = Intrinsics.areEqual(string2, string3);
        boolean bl3 = true;
        bl2 ^= bl3;
        List list2 = this.n.b();
        List list3 = sl.b();
        boolean bl4 = Intrinsics.areEqual(list2, list3) ^ bl3;
        list3 = this.n.c;
        if (list3 == null) {
            list3 = mz0_2.a;
        }
        if ((list = sl.c) == null) {
            list = mz0_2.a;
        }
        boolean bl5 = Intrinsics.areEqual(list3, list) ^ bl3;
        list = this.n.d;
        List list4 = sl.d;
        boolean bl6 = Intrinsics.areEqual(list, list4) ^ bl3;
        if (!(bl2 || bl4 || bl5 || bl6)) {
            bl3 = false;
            string3 = null;
        }
        if (bl3) {
            this.n = sl;
        }
        if (bl2) {
            sl = null;
            this.D = null;
        }
        return bl3;
    }
}

