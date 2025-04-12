/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

public abstract class Cl2
implements dU2 {
    public final tr1_0 A;
    public final tr1_0 B;
    public final ParcelableSnapshotMutableState C;
    public final ParcelableSnapshotMutableState D;
    public final ParcelableSnapshotMutableState E;
    public final ParcelableSnapshotMutableState F;
    public final ParcelableSnapshotMutableState a;
    public final ml2_0 b;
    public final yl2 c;
    public int d;
    public int e;
    public long f;
    public long g;
    public float h;
    public float i;
    public final xm0_0 j;
    public final boolean k;
    public int l;
    public xs1$b m;
    public boolean n;
    public final ParcelableSnapshotMutableState o;
    public Vo0 p;
    public final xr1_1 q;
    public final ParcelableSnapshotMutableIntState r;
    public final ParcelableSnapshotMutableIntState s;
    public final xs1 t;
    public final Br1 u;
    public final pu_0 v;
    public final ParcelableSnapshotMutableState w;
    public final Cl2$c x;
    public long y;
    public final ws1_0 z;

    public Cl2(int n3, float f5, yy2_0 yy2_02) {
        double d2;
        double d5 = f5;
        double d7 = -0.5;
        double d9 = d7 == d5 ? 0 : (d7 < d5 ? -1 : 1);
        if (d9 <= 0 && (d9 = (d2 = d5 - (d7 = 0.5)) == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1)) <= 0) {
            long l2;
            int n4;
            Object object = new e72(0L);
            this.a = object = J83.g(object);
            this.b = object = new ml2_0(this);
            this.c = object = new yl2(n3, f5, this);
            this.d = n3;
            this.f = Long.MAX_VALUE;
            Object object2 = new Cl2$e(this);
            this.j = object = new xm0_0((Function1)object2);
            this.k = true;
            this.l = n4 = -1;
            object = El2.b;
            J83.h();
            wv1_0 wv1_02 = wv1_0.b;
            this.o = object = J83.f(object, wv1_02);
            this.p = object = El2.c;
            this.q = object = new xr1_1();
            this.r = object2 = Pv2.b(n4);
            Object object3 = Pv2.b(n3);
            this.s = object3;
            J83.l();
            object3 = qi_2.b;
            object2 = new Cl2$f(this);
            J83.d((I83)object3, (Function0)object2);
            J83.l();
            object2 = new Cl2$g(this);
            J83.d((I83)object3, (Function0)object2);
            this.t = object3 = new xs1(yy2_02, 2);
            this.u = object3 = new Br1();
            this.v = object3 = new pu_0();
            this.w = object3 = J83.g(null);
            this.x = object3 = new Cl2$c(this);
            this.y = l2 = f60.b(0, 0, 15);
            this.z = object3 = new ws1_0();
            this.A = object3 = A62.c();
            this.B = object3 = A62.c();
            object3 = Boolean.FALSE;
            this.C = object2 = J83.g(object3);
            this.D = object2 = J83.g(object3);
            this.E = object2 = J83.g(object3);
            this.F = object3 = J83.g(object3);
            return;
        }
        String string2 = g9_0.a(f5, "currentPageOffsetFraction ", " is not within the range -0.5 to 0.5");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static /* synthetic */ Object g(hm0_0 hm0_02, int n3, Qs3 un0_02, f80_0 f80_02, int n4) {
        if ((n4 &= 4) != 0) {
            int n7 = 7;
            n4 = 0;
            un0_02 = Hl.b(0.0f, n7, null);
        }
        return hm0_02.f(n3, 0.0f, un0_02, f80_02);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Object s(Cl2 var0, aS1 var1_1, Function2 var2_2, f80_0 var3_3) {
        block9: {
            block10: {
                block6: {
                    block7: {
                        block8: {
                            var4_4 = var3_3 instanceof Cl2$d;
                            if (!var4_4) ** GOTO lbl-1000
                            var5_5 = var3_3;
                            var5_5 = (Cl2$d)var3_3;
                            var6_6 = var5_5.f;
                            var7_7 = -1 << -1;
                            var8_8 = var6_6 & var7_7;
                            if (var8_8 != 0) {
                                var5_5.f = var6_6 -= var7_7;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var5_5 = new Cl2$d((Cl2)var0, (f80_0)var3_3);
                            }
                            var3_3 = var5_5.d;
                            var9_9 = j90_0.COROUTINE_SUSPENDED;
                            var7_7 = var5_5.f;
                            var8_8 = 2;
                            var10_10 = 1;
                            if (var7_7 == 0) break block6;
                            if (var7_7 == var10_10) break block7;
                            if (var7_7 != var8_8) break block8;
                            var0 = var5_5.a;
                            vl2_2.b(var3_3);
                            break block9;
                        }
                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var0;
                    }
                    var2_2 = var5_5.c;
                    var1_1 /* !! */  = var5_5.b;
                    var0 = var5_5.a;
                    vl2_2.b(var3_3);
                    break block10;
                }
                vl2_2.b(var3_3);
                var5_5.a = var0;
                var5_5.b = var1_1 /* !! */ ;
                var5_5.c = var2_2;
                var5_5.f = var10_10;
                var3_3 = var0.v.b(var5_5);
                if (var3_3 != var9_9) {
                    var3_3 = Unit.a;
                }
                if (var3_3 == var9_9) {
                    return var9_9;
                }
            }
            var3_3 = var0.j;
            var11_11 = var3_3.b();
            if (var11_11 == 0) {
                var11_11 = var0.j();
                var12_12 = var0.s;
                var12_12.e(var11_11);
            }
            var5_5.a = var0;
            var11_11 = 0;
            var5_5.b = null;
            var5_5.c = null;
            var5_5.f = var8_8;
            var3_3 = var0.j;
            if ((var1_1 /* !! */  = var3_3.a(var1_1 /* !! */ , var2_2, var5_5)) == var9_9) {
                return var9_9;
            }
        }
        var0.r.e(-1);
        return Unit.a;
    }

    public static Object t(hm0_0 object, int n3, f80_0 f80_02) {
        object.getClass();
        dl2_0 dl2_02 = new dl2_0((hm0_0)object, 0.0f, n3, null);
        Enum enum_ = aS1.Default;
        object = ((Cl2)object).a((aS1)enum_, dl2_02, f80_02);
        enum_ = j90_0.COROUTINE_SUSPENDED;
        if (object != enum_) {
            object = Unit.a;
        }
        return object;
    }

    public final Object a(aS1 aS12, Function2 function2, f80_0 f80_02) {
        return Cl2.s(this, aS12, function2, f80_02);
    }

    public final boolean b() {
        return this.j.b();
    }

    public final boolean c() {
        return (Boolean)this.D.getValue();
    }

    public final boolean d() {
        return (Boolean)this.C.getValue();
    }

    public final float e(float f5) {
        return this.j.e(f5);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object f(int var1_1, float var2_2, Gl var3_3, f80_0 var4_4) {
        block14: {
            block12: {
                block13: {
                    block9: {
                        block10: {
                            block11: {
                                var5_5 = var4_4 instanceof Cl2$a;
                                if (!var5_5) ** GOTO lbl-1000
                                var6_6 = var4_4;
                                var6_6 = (Cl2$a)var4_4;
                                var7_7 = var6_6.g;
                                var8_8 = -1 << -1;
                                var9_9 = var7_7 & var8_8;
                                if (var9_9 != 0) {
                                    var6_6.g = var7_7 -= var8_8;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var6_6 = new Cl2$a(this, (f80_0)var4_4);
                                }
                                var4_4 = var6_6.e;
                                var10_10 = j90_0.COROUTINE_SUSPENDED;
                                var8_8 = var6_6.g;
                                var9_9 = 2;
                                var11_11 = 1;
                                if (var8_8 == 0) break block9;
                                if (var8_8 == var11_11) break block10;
                                if (var8_8 != var9_9) break block11;
                                vl2_2.b(var4_4);
                                break block12;
                            }
                            var12_12 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var12_12;
                        }
                        var2_2 = var6_6.d;
                        var1_1 = var6_6.c;
                        var3_3 /* !! */  = var6_6.b;
                        var13_15 = var6_6.a;
                        vl2_2.b(var4_4);
                        break block13;
                    }
                    vl2_2.b(var4_4);
                    var14_16 = this.j();
                    if (var1_1 == var14_16 && (var14_16 = (int)((cfr_temp_0 = (var15_17 = this.k()) - var2_2) == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1))) == 0 || (var14_16 = this.m()) == 0) {
                        return Unit.a;
                    }
                    var6_6.a = this;
                    var6_6.b = var3_3 /* !! */ ;
                    var6_6.c = var1_1;
                    var6_6.d = var2_2;
                    var6_6.g = var11_11;
                    var4_4 = this.v.b(var6_6);
                    if (var4_4 != var10_10) {
                        var4_4 = Unit.a;
                    }
                    if (var4_4 == var10_10) {
                        return var10_10;
                    }
                    var13_15 = this;
                }
                var16_18 = var2_2;
                var18_19 = -0.5;
                var20_20 = var18_19 == var16_18 ? 0 : (var18_19 < var16_18 ? -1 : 1);
                if (var20_20 <= 0 && (var20_20 = (cfr_temp_1 = var16_18 - (var18_19 = 0.5)) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1)) <= 0) {
                    var20_20 = var13_15.i(var1_1);
                    var21_21 = var13_15.o();
                    var22_22 = var2_2 * var21_21;
                    var23_23 = new Cl2$b(var13_15);
                    var1_1 = 0;
                    var6_6.a = null;
                    var6_6.b = null;
                    var6_6.g = var9_9;
                    var21_21 = El2.a;
                    var24_24 = var13_15.b;
                    var12_13 = new fl2_0(var23_23, (int)var20_20, (ml2_0)var24_24, var22_22, var3_3 /* !! */ , null);
                    var24_24.getClass();
                    var3_3 /* !! */  = aS1.Default;
                    var24_24 = var24_24.a;
                    var12_13 = var24_24.a((aS1)var3_3 /* !! */ , (Function2)var12_13, var6_6);
                    if (var12_13 != var10_10) {
                        var12_13 = Unit.a;
                    }
                    if (var12_13 != var10_10) {
                        var12_13 = Unit.a;
                    }
                    if (var12_13 == var10_10) {
                        return var10_10;
                    } else {
                        ** GOTO lbl76
                    }
                }
                break block14;
            }
            return Unit.a;
        }
        var12_14 = g9_0.a(var2_2, "pageOffsetFraction ", " is not within the range -0.5 to 0.5");
        var12_14 = var12_14.toString();
        var24_25 = new IllegalArgumentException(var12_14);
        throw var24_25;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(vl2 vl22, boolean n3) {
        Throwable throwable2;
        Object object;
        Function1 function1;
        Object object2;
        block24: {
            long l2;
            long l3;
            Object object3;
            int n4;
            float f5;
            int n7;
            float f6;
            float f7;
            int n8;
            block26: {
                List list;
                block28: {
                    block27: {
                        Object object4;
                        block25: {
                            object2 = this.c;
                            n8 = 1;
                            f7 = Float.MIN_VALUE;
                            function1 = null;
                            if (n3 == 0) break block25;
                            f6 = vl22.l;
                            object2 = ((yl2)object2).c;
                            ((D83)object2).k(f6);
                            break block26;
                        }
                        object2.getClass();
                        object = vl22.k;
                        if (object != null) {
                            object4 = ((fl1_1)object).e;
                        } else {
                            n7 = 0;
                            object4 = null;
                            f5 = 0.0f;
                        }
                        ((yl2)object2).e = object4;
                        n7 = ((yl2)object2).d;
                        list = vl22.a;
                        if (n7 != 0) break block27;
                        object4 = list;
                        object4 = list;
                        n7 = object4.isEmpty() ^ n8;
                        if (n7 == 0) break block28;
                    }
                    ((yl2)object2).d = n8;
                    if (object != null) {
                        n3 = ((fl1_1)object).a;
                    } else {
                        n3 = 0;
                        f6 = 0.0f;
                        object = null;
                    }
                    f5 = vl22.l;
                    ((yl2)object2).b.e(n3);
                    is1_0 is1_02 = ((yl2)object2).f;
                    is1_02.d(n3);
                    object = ((yl2)object2).c;
                    ((D83)object).k(f5);
                }
                if ((n3 = this.l) != (n4 = -1)) {
                    object = list;
                    object = list;
                    n3 = object.isEmpty() ^ n8;
                    if (n3 != 0) {
                        n3 = (int)(this.n ? 1 : 0);
                        n7 = vl22.i;
                        if (n3 != 0) {
                            object = (Mk2)CollectionsKt.S(list);
                            n3 = object.getIndex();
                            n7 = n7 + n3 + n8;
                        } else {
                            object = (Mk2)CollectionsKt.L(list);
                            n3 = object.getIndex() - n7;
                            n7 = n3 + -1;
                        }
                        n3 = this.l;
                        if (n3 != n7) {
                            this.l = n4;
                            object = this.m;
                            if (object != null) {
                                object.cancel();
                            }
                            this.m = null;
                        }
                    }
                }
            }
            this.o.setValue(vl22);
            n3 = vl22.n;
            object = n3 != 0;
            object2 = this.C;
            ((h83_0)object2).setValue(object);
            object = vl22.j;
            if (object != null) {
                n4 = ((fl1_1)object).a;
            } else {
                n4 = 0;
                object2 = null;
            }
            if (n4 == 0 && (n4 = vl22.m) == 0) {
                n8 = 0;
                f7 = 0.0f;
                object3 = null;
            }
            object2 = n8 != 0;
            object3 = this.D;
            ((h83_0)object3).setValue(object2);
            if (object != null) {
                this.d = n3 = ((fl1_1)object).a;
            }
            this.e = n3 = vl22.m;
            object = v83$a.a();
            if (object != null) {
                function1 = ((v83_0)object).f();
            }
            object2 = v83$a.b((v83_0)object);
            try {
                f7 = this.i;
                f7 = Math.abs(f7);
                n7 = 0x3F000000;
                f5 = 0.5f;
            }
            catch (Throwable throwable2) {
                break block24;
            }
            n8 = (int)(f7 == f5 ? 0 : (f7 > f5 ? 1 : -1));
            if (n8 > 0 && (n8 = (int)(this.k ? 1 : 0)) != 0 && (n8 = (int)(this.q(f7 = this.i) ? 1 : 0)) != 0) {
                f7 = this.i;
                this.r(f7, vl22);
            }
            object3 = Unit.a;
            v83$a.e((v83_0)object, (v83_0)object2, function1);
            n3 = this.m();
            this.f = l3 = El2.a(vl22, n3);
            this.m();
            object = pg2_0.Horizontal;
            object2 = vl22.e;
            l3 = vl22.b();
            if (object2 == object) {
                n3 = 32;
                f6 = 4.5E-44f;
                l3 >>= n3;
            } else {
                long l4 = 0xFFFFFFFFL;
                l3 &= l4;
            }
            n3 = (int)l3;
            vl22.o.getClass();
            this.g = l2 = (long)kotlin.ranges.f.g(0, 0, n3);
            return;
        }
        v83$a.e((v83_0)object, (v83_0)object2, function1);
        throw throwable2;
    }

    public final int i(int n3) {
        int n4 = this.m();
        int n7 = 0;
        if (n4 > 0) {
            n4 = this.m() + -1;
            n7 = kotlin.ranges.f.g(n3, 0, n4);
        }
        return n7;
    }

    public final int j() {
        return this.c.b.o();
    }

    public final float k() {
        return this.c.c.c();
    }

    public final kl2_1 l() {
        return (kl2_1)this.o.getValue();
    }

    public abstract int m();

    public final int n() {
        return ((vl2)this.o.getValue()).b;
    }

    public final int o() {
        int n3 = this.n();
        return ((vl2)this.o.getValue()).c + n3;
    }

    public final long p() {
        return ((e72)this.a.getValue()).a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean q(float f5) {
        float f6;
        float f7;
        long l2;
        float f8;
        float f11;
        float f12;
        pg2_0 pg2_02;
        pg2_0 pg2_03 = this.l().a();
        if (pg2_03 == (pg2_02 = pg2_0.Vertical) ? (f12 = (f11 = (f5 = Math.signum(f5)) - (f8 = Math.signum(-e72.e(l2 = this.p())))) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) == false : (f12 = (f7 = (f5 = Math.signum(f5)) - (f6 = Math.signum(-e72.d(l2 = this.p())))) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) == false) return (boolean)1.0f;
        l2 = this.p();
        f5 = e72.d(l2);
        f12 = (int)f5;
        if (f12 != false) return (boolean)0.0f;
        l2 = this.p();
        f5 = e72.e(l2);
        f12 = (int)f5;
        if (f12 != false) return (boolean)0.0f;
        return (boolean)1.0f;
    }

    public final void r(float f5, kl2_1 kl2_12) {
        Object object = this.k;
        if (object == 0) {
            return;
        }
        Object object2 = kl2_12.h();
        object = object2.isEmpty();
        int n3 = 1;
        if ((object ^= n3) != 0) {
            int n4;
            int n7;
            object2 = null;
            float f6 = f5 - 0.0f;
            object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (object > 0) {
                object = 1;
            } else {
                object = 0;
                object2 = null;
            }
            if (object != 0) {
                Mk2 mk2 = (Mk2)CollectionsKt.S(kl2_12.h());
                n7 = mk2.getIndex();
                n4 = kl2_12.l() + n7 + n3;
            } else {
                Mk2 mk2 = (Mk2)CollectionsKt.L(kl2_12.h());
                n7 = mk2.getIndex();
                n4 = kl2_12.l();
                n7 -= n4;
                n4 = n7 + -1;
            }
            if (n4 >= 0 && n4 < (n3 = this.m())) {
                n3 = this.l;
                if (n4 != n3) {
                    Object object3;
                    n3 = (int)(this.n ? 1 : 0);
                    if (n3 != object && (object3 = this.m) != null) {
                        object3.cancel();
                    }
                    this.n = object;
                    this.l = n4;
                    object3 = this.t;
                    long l2 = this.y;
                    this.m = object3 = ((xs1)object3).a(n4, l2);
                }
                if (object != 0) {
                    xs1$b xs1$b;
                    object2 = (Mk2)CollectionsKt.S(kl2_12.h());
                    n3 = kl2_12.getPageSize();
                    n7 = kl2_12.i() + n3;
                    object = object2.getOffset() + n7;
                    int n8 = kl2_12.d();
                    float f7 = object -= n8;
                    float f8 = f7 - f5;
                    Object object4 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                    if (object4 < 0 && (xs1$b = this.m) != null) {
                        xs1$b.b();
                    }
                } else {
                    xs1$b xs1$b;
                    object2 = (Mk2)CollectionsKt.L(kl2_12.h());
                    int n10 = kl2_12.f();
                    object = object2.getOffset();
                    float f11 = n10 -= object;
                    float f12 = f11 - (f5 = -f5);
                    Object object5 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    if (object5 < 0 && (xs1$b = this.m) != null) {
                        xs1$b.b();
                    }
                }
            }
        }
    }
}

