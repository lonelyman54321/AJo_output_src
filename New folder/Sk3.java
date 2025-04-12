/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class Sk3 {
    public final Pv3 a;
    public i72 b;
    public Function1 c;
    public Vt1 d;
    public final ParcelableSnapshotMutableState e;
    public EE3 f;
    public SV g;
    public zm3 h;
    public t31 i;
    public ou0_0 j;
    public final ParcelableSnapshotMutableState k;
    public final ParcelableSnapshotMutableState l;
    public long m;
    public Integer n;
    public long o;
    public final ParcelableSnapshotMutableState p;
    public final ParcelableSnapshotMutableState q;
    public int r;
    public ql3_0 s;
    public p63 t;
    public final Sk3$g u;
    public final Sk3$a v;

    public Sk3() {
        this(null);
    }

    public Sk3(Pv3 object) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        this.a = object;
        this.b = object = Zz3.a;
        this.c = object = Sk3$b.c;
        long l2 = 0L;
        int n3 = 7;
        object = new ql3_0(null, l2, n3);
        this.e = object = J83.g(object);
        this.f = object = EE3$a.a;
        object = Boolean.TRUE;
        this.k = parcelableSnapshotMutableState = J83.g(object);
        this.l = object = J83.g(object);
        this.m = l2;
        this.o = l2;
        this.p = object = J83.g(null);
        this.q = object = J83.g(null);
        this.r = -1;
        this.s = object = new ql3_0(null, l2, n3);
        this.u = object = new Sk3$g(this);
        this.v = object = new Sk3$a(this);
    }

    public static final void a(Sk3 sk3, e72 e722) {
        sk3.q.setValue(e722);
    }

    public static final void b(Sk3 sk3, v21_0 v21_02) {
        sk3.p.setValue((Object)v21_02);
    }

    /*
     * WARNING - void declaration
     */
    public static final long c(Sk3 sk3, ql3_0 ql3_02, long l2, boolean bl2, boolean n3, PX2 pX2, boolean bl3) {
        long l3;
        block22: {
            block20: {
                long l4;
                Object object;
                int n4;
                Object object2;
                int n7;
                Object object3;
                block25: {
                    void var16_35;
                    block28: {
                        block27: {
                            Object object4;
                            block26: {
                                block24: {
                                    void var16_31;
                                    void var50_89;
                                    String string2;
                                    int n8;
                                    boolean bl4;
                                    int n10;
                                    int n14;
                                    long l7;
                                    boolean bl5;
                                    boolean bl6;
                                    long l8;
                                    long l12;
                                    long l14;
                                    block23: {
                                        void var40_71;
                                        int n15;
                                        int n16;
                                        Object object5;
                                        Object object6;
                                        block21: {
                                            void var15_21;
                                            void var32_62;
                                            p63 p632;
                                            p63 p633;
                                            int n17;
                                            Sk3 sk32 = sk3;
                                            object3 = ql3_02;
                                            n7 = n3;
                                            object6 = sk3.d;
                                            if (object6 == null || (object6 = ((Vt1)object6).d()) == null) break block20;
                                            object5 = sk3.b;
                                            l14 = ql3_02.b;
                                            int n19 = mm3.c;
                                            n19 = 32;
                                            int n20 = (int)(l14 >>= n19);
                                            n16 = object5.b(n20);
                                            object4 = sk3.b;
                                            l3 = ql3_02.b;
                                            long l15 = 0xFFFFFFFFL;
                                            int n21 = (int)(l3 & l15);
                                            int n22 = object4.b(n21);
                                            long l16 = nm3.a(n16, n22);
                                            boolean bl7 = false;
                                            object2 = null;
                                            long l17 = l2;
                                            int n24 = ((Ul3)object6).b(l2, false);
                                            if (n3 == 0 && !bl2) {
                                                long l18 = l16 >> n19;
                                                int n25 = (int)l18;
                                            } else {
                                                int n26 = n24;
                                            }
                                            if (n7 != 0 && !bl2) {
                                                long l19 = l16 & l15;
                                                int n27 = (int)l19;
                                            } else {
                                                int n28 = n24;
                                            }
                                            object2 = sk32.t;
                                            int n29 = -1;
                                            if (bl2 || object2 == null || (n17 = sk32.r) == n29) {
                                                n17 = -1;
                                            }
                                            object6 = ((Ul3)object6).a;
                                            if (bl2) {
                                                n16 = 0;
                                                object5 = null;
                                                l12 = l3;
                                                int n30 = n24;
                                                p632 = p633;
                                            } else {
                                                l12 = l3;
                                                int n32 = 32;
                                                l3 = l16 >> n32;
                                                int n34 = (int)l3;
                                                uk2_0 uk2_02 = ky2_0.a((Tl3)object6, n34);
                                                MX2$a mX2$a = new MX2$a(uk2_02, n34, 1L);
                                                long l20 = 0xFFFFFFFFL;
                                                long l21 = l16 & l20;
                                                int n35 = (int)l21;
                                                uk2_0 uk2_03 = ky2_0.a((Tl3)object6, n35);
                                                int n36 = n24;
                                                p632 = p633;
                                                l17 = 1L;
                                                MX2$a mX2$a2 = new MX2$a(uk2_03, n35, l17);
                                                n4 = mm3.f(l16) ? 1 : 0;
                                                MX2 mX2 = new MX2(mX2$a, mX2$a2, n4 != 0);
                                                object5 = mX2;
                                            }
                                            KX2 kX2 = new KX2((int)var32_62, (int)var15_21, n17, (Tl3)object6);
                                            object3 = p632;
                                            p632(n7 != 0, (MX2)object5, kX2);
                                            n4 = 1;
                                            if (object5 == null || object2 == null || n4 != (n15 = ((p63)object2).b) || n4 != (n15 = ((p63)object2).c) || n7 != (n15 = (int)(((p63)object2).a ? 1 : 0))) break block21;
                                            object = ((p63)object2).e;
                                            l14 = 1L;
                                            l4 = ((KX2)object).a;
                                            long l22 = l14 - l4;
                                            l8 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
                                            if (l8 != false || var32_62 != (n15 = ((KX2)object).c) || var15_21 != (n7 = ((KX2)object).d)) break block21;
                                            l3 = l12;
                                            break block22;
                                        }
                                        object = sk3;
                                        sk3.t = object3;
                                        n15 = var40_71;
                                        sk3.r = var40_71;
                                        object6 = pX2;
                                        object3 = pX2.a((p63)object3);
                                        object6 = sk3.b;
                                        n16 = ((MX2)object3).a.b;
                                        n15 = object6.a(n16);
                                        object5 = sk3.b;
                                        object3 = ((MX2)object3).b;
                                        int n38 = ((MX2$a)object3).b;
                                        n38 = object5.a(n38);
                                        l4 = nm3.a(n15, n38);
                                        l14 = l12;
                                        boolean bl8 = mm3.a(l4, l12);
                                        if (!bl8) break block23;
                                        l3 = l12;
                                        break block22;
                                    }
                                    boolean bl9 = mm3.f(l4);
                                    if (bl9 != (bl6 = mm3.f(l12)) && (bl5 = mm3.a(l7 = nm3.a(n14 = (int)(0xFFFFFFFFL & l4), (int)(l8 = (long)((int)(l4 >> (n10 = 32))))), l12))) {
                                        boolean bl10 = true;
                                    } else {
                                        boolean bl11 = false;
                                        object3 = null;
                                    }
                                    boolean bl12 = mm3.b(l4);
                                    if (bl12 && (bl4 = mm3.b(l14))) {
                                        object4 = ql3_02;
                                        boolean bl13 = true;
                                    } else {
                                        object4 = ql3_02;
                                        boolean bl14 = false;
                                        object2 = null;
                                    }
                                    object4 = ((ql3_0)object4).a;
                                    if (bl3 && (n8 = (string2 = ((Sl)object4).a).length()) > 0 && var50_89 == false && var16_31 == false && (object3 = ((Sk3)object).i) != null) {
                                        object3.a();
                                    }
                                    object3 = Sk3.e((Sl)object4, l4);
                                    object4 = ((Sk3)object).c;
                                    object4.invoke(object3);
                                    if (!bl3) {
                                        boolean bl15 = mm3.b(l4) ^ n4;
                                        ((Sk3)object).t(bl15);
                                    }
                                    if ((object3 = ((Sk3)object).d) != null) {
                                        object4 = bl3;
                                        object3 = ((Vt1)object3).q;
                                        ((h83_0)object3).setValue(object4);
                                    }
                                    object3 = ((Sk3)object).d;
                                    if (object3 != null) {
                                        void var23_50;
                                        boolean bl16;
                                        boolean bl17 = mm3.b(l4);
                                        if (!bl17 && (bl16 = Tk3.b((Sk3)object, n4 != 0))) {
                                            boolean bl18 = true;
                                        } else {
                                            boolean bl19 = false;
                                            object4 = null;
                                        }
                                        object4 = (boolean)var23_50;
                                        object3 = ((Vt1)object3).m;
                                        ((h83_0)object3).setValue(object4);
                                    }
                                    if ((object3 = ((Sk3)object).d) != null) break block24;
                                    boolean bl20 = false;
                                    object4 = null;
                                    break block25;
                                }
                                boolean bl21 = mm3.b(l4);
                                if (bl21) break block26;
                                boolean bl22 = false;
                                object4 = null;
                                boolean bl23 = Tk3.b((Sk3)object, false);
                                if (!bl23) break block27;
                                boolean bl24 = true;
                                break block28;
                            }
                            boolean bl25 = false;
                            object4 = null;
                        }
                        boolean bl26 = false;
                        object2 = null;
                    }
                    object2 = (boolean)var16_35;
                    object3 = ((Vt1)object3).n;
                    ((h83_0)object3).setValue(object2);
                }
                object3 = ((Sk3)object).d;
                if (object3 != null) {
                    void var16_39;
                    boolean bl27 = mm3.b(l4);
                    if (bl27 && (n7 = Tk3.b((Sk3)object, n4 != 0)) != 0) {
                        boolean bl28 = true;
                    } else {
                        boolean bl29 = false;
                        object2 = null;
                    }
                    Boolean bl30 = (boolean)var16_39;
                    object3 = ((Vt1)object3).o;
                    ((h83_0)object3).setValue(bl30);
                }
                l3 = l4;
                break block22;
            }
            l3 = mm3.b;
        }
        return l3;
    }

    public static ql3_0 e(Sl sl, long l2) {
        ql3_0 ql3_02 = new ql3_0(sl, l2, null);
        return ql3_02;
    }

    public final void d(boolean bl2) {
        Object object = this.l();
        long l2 = ((ql3_0)object).b;
        boolean bl3 = mm3.b(l2);
        if (bl3) {
            return;
        }
        object = this.g;
        if (object != null) {
            Sl sl = tp1_0.b(this.l());
            object.a(sl);
        }
        if (!bl2) {
            return;
        }
        int n3 = mm3.d(this.l().b);
        object = this.l().a;
        long l3 = nm3.a(n3, n3);
        Object object2 = Sk3.e((Sl)object, l3);
        this.c.invoke(object2);
        object2 = x21_0.None;
        this.r((x21_0)((Object)object2));
    }

    public final void f() {
        Object object;
        Object object2 = this.l();
        long l2 = ((ql3_0)object2).b;
        boolean bl2 = mm3.b(l2);
        if (bl2) {
            return;
        }
        object2 = this.g;
        if (object2 != null) {
            object = tp1_0.b(this.l());
            object2.a((Sl)object);
        }
        object2 = this.l();
        int n3 = this.l().a.a.length();
        object2 = tp1_0.d((ql3_0)object2, n3);
        object = this.l();
        int n4 = this.l().a.a.length();
        object = tp1_0.c((ql3_0)object, n4);
        Sl$a sl$a = new Sl$a((Sl)object2);
        sl$a.b((Sl)object);
        object2 = sl$a.h();
        n3 = mm3.e(this.l().b);
        long l3 = nm3.a(n3, n3);
        object2 = Sk3.e((Sl)object2, l3);
        object = this.c;
        object.invoke(object2);
        object2 = x21_0.None;
        this.r((x21_0)((Object)object2));
        object2 = this.a;
        if (object2 != null) {
            n3 = 1;
            ((Pv3)object2).f = n3;
        }
    }

    public final void g(e72 object) {
        int n3;
        Object object2 = this.l();
        long l2 = ((ql3_0)object2).b;
        int n4 = mm3.b(l2);
        if (n4 == 0) {
            Object object3;
            object2 = this.d;
            Function1 function1 = null;
            if (object2 != null) {
                object2 = ((Vt1)object2).d();
            } else {
                n4 = 0;
                object2 = null;
            }
            if (object != null && object2 != null) {
                object3 = this.b;
                boolean bl2 = true;
                long l3 = object.a;
                n4 = ((Ul3)object2).b(l3, bl2);
                n4 = object3.a(n4);
            } else {
                object2 = this.l();
                long l4 = ((ql3_0)object2).b;
                n4 = mm3.d(l4);
            }
            object3 = this.l();
            long l7 = nm3.a(n4, n4);
            n4 = 5;
            object2 = ql3_0.a((ql3_0)object3, null, l7, n4);
            function1 = this.c;
            function1.invoke(object2);
        }
        object = object != null && (n3 = ((String)(object = this.l().a.a)).length()) > 0 ? x21_0.Cursor : x21_0.None;
        this.r((x21_0)((Object)object));
        this.t(false);
    }

    public final void h(boolean bl2) {
        boolean bl3;
        Object object = this.d;
        if (object != null && !(bl3 = ((Vt1)object).b()) && (object = this.j) != null) {
            ((ou0_0)object).b();
        }
        this.s = object = this.l();
        this.t(bl2);
        x21_0 x21_02 = x21_0.Selection;
        this.r(x21_02);
    }

    public final e72 i() {
        return (e72)this.q.getValue();
    }

    public final boolean j() {
        return (Boolean)this.l.getValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long k(boolean n3) {
        uk2_0 uk2_02;
        int n4;
        long l2;
        boolean bl2;
        boolean bl3 = true;
        float f5 = Float.MIN_VALUE;
        Object object = this.d;
        long l3 = 9205357640488583168L;
        if (object == null) return l3;
        if ((object = ((Vt1)object).d()) == null) return l3;
        object = ((Ul3)object).a;
        if (object == null) {
            return l3;
        }
        Object object2 = this.d;
        if (object2 != null && (object2 = ((Vt1)object2).a) != null) {
            object2 = ((Mj3)object2).a;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 == null) {
            return l3;
        }
        object2 = ((Sl)object2).a;
        String string2 = ((Tl3)object).a.a.a;
        bl2 = Intrinsics.areEqual(object2, string2);
        if (!bl2) {
            return l3;
        }
        long l4 = 0xFFFFFFFFL;
        int n7 = 32;
        Object object3 = this.l();
        if (n3 != 0) {
            l2 = ((ql3_0)object3).b;
            n4 = mm3.c;
            l2 >>= n7;
        } else {
            l2 = ((ql3_0)object3).b;
            n4 = mm3.c;
            l2 &= l4;
        }
        int n8 = (int)l2;
        object3 = this.b;
        int n10 = object3.b(n8);
        ql3_0 ql3_02 = this.l();
        long l7 = ql3_02.b;
        n8 = mm3.f(l7) ? 1 : 0;
        n4 = ((Tl3)object).f(n10);
        RQ1 rQ1 = ((Tl3)object).b;
        int n14 = rQ1.f;
        if (n4 >= n14) {
            return l3;
        }
        float f6 = 0.0f;
        Object object4 = null;
        uk2_0 uk2_03 = ((Tl3)object).a(n3 = n3 != 0 && n8 == 0 || n3 == 0 && n8 != 0 ? n10 : Math.max(n10 + -1, 0));
        if (uk2_03 != (uk2_02 = ((Tl3)object).j(n10))) {
            bl3 = false;
            f5 = 0.0f;
        }
        rQ1.j(n10);
        String string3 = rQ1.a.a.a;
        n3 = string3.length();
        object4 = rQ1.h;
        n3 = n10 == n3 ? xx_2.h((List)object4) : TQ1.a(n10, (ArrayList)object4);
        tm2 tm22 = (tm2)((ArrayList)object4).get(n3);
        object4 = tm22.a;
        n3 = tm22.b(n10);
        float f7 = object4.l(n3, bl3);
        long l8 = ((Tl3)object).c;
        f6 = (int)(l8 >> n7);
        uk2_02 = null;
        f7 = kotlin.ranges.f.f(f7, 0.0f, f6);
        f6 = rQ1.b(n4);
        int n15 = (int)(l8 &= l4);
        f5 = n15;
        f5 = kotlin.ranges.f.f(f6, 0.0f, f5);
        return h72.a(f7, f5);
    }

    public final ql3_0 l() {
        return (ql3_0)this.e.getValue();
    }

    public final void m() {
        Object object = this.h;
        object = object != null ? object.getStatus() : null;
        Cm3 cm3 = Cm3.Shown;
        if (object == cm3 && (object = this.h) != null) {
            object.hide();
        }
    }

    public final void n() {
        Object object = this.g;
        if (object != null && (object = object.b()) != null) {
            Object object2 = this.l();
            int n3 = this.l().a.a.length();
            object2 = tp1_0.d((ql3_0)object2, n3);
            Object object3 = new Sl$a((Sl)object2);
            ((Sl$a)object3).b((Sl)object);
            object2 = ((Sl$a)object3).h();
            object3 = this.l();
            int n4 = this.l().a.a.length();
            object3 = tp1_0.c((ql3_0)object3, n4);
            Sl$a sl$a = new Sl$a((Sl)object2);
            sl$a.b((Sl)object3);
            object2 = sl$a.h();
            object3 = this.l();
            n3 = mm3.e(((ql3_0)object3).b);
            int n7 = ((Sl)object).a.length() + n3;
            long l2 = nm3.a(n7, n7);
            object = Sk3.e((Sl)object2, l2);
            object2 = this.c;
            object2.invoke(object);
            object = x21_0.None;
            this.r((x21_0)((Object)object));
            object = this.a;
            if (object != null) {
                boolean bl2;
                ((Pv3)object).f = bl2 = true;
            }
        }
    }

    public final void o() {
        Object object = this.l().a;
        int n3 = this.l().a.a.length();
        long l2 = nm3.a(0, n3);
        object = Sk3.e((Sl)object, l2);
        this.c.invoke(object);
        ql3_0 ql3_02 = this.s;
        long l3 = ((ql3_0)object).b;
        this.s = object = ql3_0.a(ql3_02, null, l3, 5);
        this.h(true);
    }

    public final void p(boolean bl2) {
        Boolean bl3 = bl2;
        this.k.setValue(bl3);
    }

    public final void q(boolean bl2) {
        Boolean bl3 = bl2;
        this.l.setValue(bl3);
    }

    public final void r(x21_0 x21_02) {
        Object object = this.d;
        if (object != null) {
            x21_0 x21_03 = ((Vt1)object).a();
            if (x21_03 == x21_02) {
                object = null;
            }
            if (object != null) {
                object = ((Vt1)object).k;
                ((h83_0)object).setValue((Object)x21_02);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void s() {
        block17: {
            var1_1 = this;
            var2_2 = this.j();
            if (var2_2 == 0 || (var3_3 = this.d) != null && (var2_2 = (var3_3 = (Boolean)var3_3.q.getValue()).booleanValue()) == 0) break block17;
            var3_3 = this.l();
            var4_4 = var3_3.b;
            var2_2 = mm3.b(var4_4);
            var6_5 = 0.0f;
            var7_6 = null;
            var8_7 = var2_2 == 0 ? (var3_3 = new Sk3$c(var1_1)) : null;
            var3_3 = this.l();
            var9_8 = var3_3.b;
            var2_2 = mm3.b(var9_8);
            var11_9 = var1_1.k;
            if (var2_2 == 0 && (var2_2 = (var3_3 = (Boolean)var11_9.getValue()).booleanValue()) != 0) {
                var12_10 = var3_3 = new Sk3$d(var1_1);
            } else {
                var12_10 = null;
                var13_11 = 0.0f;
            }
            var3_3 = (Boolean)var11_9.getValue();
            var2_2 = var3_3.booleanValue();
            var14_12 = 1;
            var15_13 = 1.4E-45f;
            var16_14 = var2_2 != 0 && (var3_3 = var1_1.g) != null && (var2_2 = var3_3.c()) == var14_12 ? (var3_3 = new Sk3$e(var1_1)) : null;
            var3_3 = this.l();
            var17_15 = var3_3.b;
            var2_2 = mm3.c(var17_15);
            var19_16 = this.l().a.a;
            var20_17 = var19_16.length();
            if (var2_2 != var20_17) {
                var21_18 = var3_3 = new Sk3$f(var1_1);
            } else {
                var21_18 = null;
                var22_19 = 0.0f;
            }
            var3_3 = var1_1.h;
            if (var3_3 == null) break block17;
            var19_16 = var1_1.d;
            if (var19_16 == null) ** GOTO lbl-1000
            var23_20 = var19_16.p ^ var14_12;
            if (var23_20 != 0) {
                var7_6 = var19_16;
            }
            if (var7_6 != null) {
                var19_16 = var1_1.b;
                var24_21 = this.l().b >> 32;
                var26_22 = (int)var24_21;
                var20_17 = var19_16.b(var26_22);
                var27_23 = var1_1.b;
                var28_24 = this.l().b;
                var30_25 = 0xFFFFFFFFL;
                var32_26 = (int)(var28_24 &= var30_25);
                var23_20 = var27_23.b(var32_26);
                var33_27 = var1_1.d;
                var34_28 = 0L;
                if (var33_27 != null && (var33_27 = var33_27.c()) != null) {
                    var36_29 = var1_1.k((boolean)var14_12);
                    var36_29 = var33_27.a0(var36_29);
                } else {
                    var36_29 = var34_28;
                }
                var11_9 = var1_1.d;
                if (var11_9 != null && (var11_9 = var11_9.c()) != null) {
                    var26_22 = 0;
                    var38_30 = 0.0f;
                    var33_27 = null;
                    var28_24 = var1_1.k(false);
                    var34_28 = var11_9.a0(var28_24);
                }
                var11_9 = var1_1.d;
                var26_22 = 0;
                var38_30 = 0.0f;
                var33_27 = null;
                if (var11_9 != null && (var11_9 = var11_9.c()) != null) {
                    var39_31 = var7_6.d();
                    if (var39_31 != null && (var39_31 = var39_31.a) != null) {
                        var19_16 = var39_31.c(var20_17);
                        var40_32 = var19_16.b;
                        var39_31 = var12_10;
                        var41_33 = var21_18;
                    } else {
                        var39_31 = var12_10;
                        var41_33 = var21_18;
                        var20_17 = 0;
                        var40_32 = 0.0f;
                        var19_16 = null;
                    }
                    var42_34 = h72.a(0.0f, var40_32);
                    var9_8 = var11_9.a0(var42_34);
                    var15_13 = e72.e(var9_8);
                } else {
                    var39_31 = var12_10;
                    var41_33 = var21_18;
                    var14_12 = 0;
                    var15_13 = 0.0f;
                    var11_9 = null;
                }
                var19_16 = var1_1.d;
                if (var19_16 != null && (var19_16 = var19_16.c()) != null) {
                    var12_10 = var7_6.d();
                    if (var12_10 != null && (var12_10 = var12_10.a) != null) {
                        var12_10 = var12_10.c(var23_20);
                        var13_11 = var12_10.b;
                    } else {
                        var13_11 = 0.0f;
                        var12_10 = null;
                    }
                    var42_34 = h72.a(0.0f, var13_11);
                    var42_34 = var19_16.a0(var42_34);
                    var38_30 = e72.e(var42_34);
                }
                var40_32 = e72.d(var36_29);
                var13_11 = e72.d(var34_28);
                var40_32 = Math.min(var40_32, var13_11);
                var13_11 = e72.d(var36_29);
                var22_19 = e72.d(var34_28);
                var13_11 = Math.max(var13_11, var22_19);
                var15_13 = Math.min(var15_13, var38_30);
                var22_19 = e72.e(var36_29);
                var44_35 = e72.e(var34_28);
                var22_19 = Math.max(var22_19, var44_35);
                var23_20 = 25;
                var44_35 = var23_20;
                var7_6 = var7_6.a.g;
                var6_5 = var7_6.getDensity() * var44_35 + var22_19;
                var19_16 = var21_18 = new aG2(var40_32, var15_13, var13_11, var6_5);
            } else lbl-1000:
            // 2 sources

            {
                var39_31 = var12_10;
                var41_33 = var21_18;
                var19_16 = var7_6 = aG2.e;
            }
            var11_9 = var3_3;
            var12_10 = var39_31;
            var21_18 = var41_33;
            var3_3.a((aG2)var19_16, (Sk3$c)var8_7, (Sk3$e)var16_14, (Sk3$d)var39_31, (Sk3$f)var41_33);
        }
    }

    public final void t(boolean bl2) {
        Object object = this.d;
        if (object != null) {
            Boolean bl3 = bl2;
            object = ((Vt1)object).l;
            ((h83_0)object).setValue(bl3);
        }
        if (bl2) {
            this.s();
        } else {
            this.m();
        }
    }
}

