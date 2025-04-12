/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class gr3 {
    public final Mr3 a;
    public final gr3 b;
    public final String c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final ParcelableSnapshotMutableLongState f;
    public final ParcelableSnapshotMutableLongState g;
    public final ParcelableSnapshotMutableState h;
    public final p83_0 i;
    public final p83_0 j;
    public final ParcelableSnapshotMutableState k;
    public long l;
    public final mp0 m;

    public gr3() {
        throw null;
    }

    public gr3(Mr3 mr3, gr3 object, String object2) {
        this.a = mr3;
        this.b = object;
        this.c = object2;
        this.d = object = J83.g(mr3.a());
        object2 = mr3.a();
        Object object3 = mr3.a();
        object = new gr3$c(object2, object3);
        this.e = object = J83.g(object);
        this.f = object = new ParcelableSnapshotMutableLongState(0L);
        this.g = object = new ParcelableSnapshotMutableLongState(Long.MIN_VALUE);
        object = Boolean.FALSE;
        this.h = object2 = J83.g(object);
        this.i = object2 = new p83_0();
        this.j = object2 = new p83_0();
        this.k = object = J83.g(object);
        object = new gr3$g(this);
        this.m = object = J83.e((Function0)object);
        mr3.d(this);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Object var1_1, b30_0 var2_2, int var3_3) {
        block12: {
            block13: {
                block11: {
                    var2_2 = var2_2.g(-1493585151);
                    var4_4 = var3_3 & 6;
                    if (var4_4 == 0) {
                        var4_4 = var3_3 & 8;
                        var4_4 = var4_4 == 0 ? (int)var2_2.J(var1_1) : (int)var2_2.x(var1_1);
                        var4_4 = var4_4 != 0 ? 4 : 2;
                        var4_4 |= var3_3;
                    } else {
                        var4_4 = var3_3;
                    }
                    var5_5 = var3_3 & 48;
                    var6_6 = 32;
                    if (var5_5 == 0) {
                        var5_5 = (int)var2_2.J(this);
                        var5_5 = var5_5 != 0 ? 32 : 16;
                        var4_4 |= var5_5;
                    }
                    if ((var5_5 = var4_4 & 19) != (var7_7 = 18) || (var5_5 = (int)var2_2.h()) == 0) break block11;
                    var2_2.D();
                    break block12;
                }
                var5_5 = (int)this.h();
                var7_7 = 0;
                if (var5_5 != 0) break block13;
                var2_2.K(1822507602);
                this.r(var1_1);
                var8_8 = this.a.a();
                var5_5 = (int)Intrinsics.areEqual(var1_1, var8_8);
                var9_9 = 1;
                if (var5_5 == 0) ** GOTO lbl-1000
                var8_8 = this.g;
                var10_10 = var8_8.x();
                cfr_temp_0 = var10_10 - (var12_11 = -9223372036854775808L);
                var5_5 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var5_5 != 0) {
                    var5_5 = 1;
                } else {
                    var5_5 = 0;
                    var8_8 = null;
                }
                if (var5_5 == 0 && (var5_5 = (int)(var8_8 = (Boolean)this.h.getValue()).booleanValue()) == 0) {
                    var4_4 = 1823982427;
                    var2_2.K(var4_4);
                    var2_2.T(false);
                } else lbl-1000:
                // 2 sources

                {
                    var5_5 = 1822738893;
                    var2_2.K(var5_5);
                    var8_8 = var2_2.v();
                    var14_12 = b30$a.a;
                    if (var8_8 == var14_12) {
                        var8_8 = Qx2.a(ly0_0.f(kotlin.coroutines.f.a, (b30_0)var2_2), (j30_0)var2_2);
                    }
                    var8_8 = ((Q30)var8_8).a;
                    var15_13 = var2_2.x(var8_8);
                    if ((var4_4 &= 112) != var6_6) {
                        var9_9 = 0;
                    }
                    var4_4 = var15_13 | var9_9;
                    var16_14 = var2_2.v();
                    if (var4_4 != 0 || var16_14 == var14_12) {
                        var17_15 = var8_8;
                        var17_15 = (c80)var8_8;
                        var16_14 = new gr3$e((c80)var17_15, this);
                        var2_2.o(var16_14);
                    }
                    var16_14 = (Function1)var16_14;
                    ly0_0.a(var8_8, this, (Function1)var16_14, (b30_0)var2_2);
                    var2_2.T(false);
                }
                var2_2.T(false);
                break block12;
            }
            var4_4 = 1823992347;
            var2_2.K(var4_4);
            var2_2.T(false);
        }
        var2_2 = var2_2.X();
        if (var2_2 != null) {
            var17_15 = new gr3$f(this, var1_1, var3_3);
            var2_2.d = var17_15;
        }
    }

    public final long b() {
        p83_0 p83_02 = this.i;
        int n3 = p83_02.size();
        long l2 = 0L;
        int n4 = 0;
        gr3 gr32 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = ((gr3$d)p83_02.get((int)i3)).l;
            long l3 = parcelableSnapshotMutableLongState.x();
            l2 = Math.max(l2, l3);
        }
        p83_02 = this.j;
        n3 = p83_02.size();
        while (n4 < n3) {
            gr32 = (gr3)p83_02.get(n4);
            long l4 = gr32.b();
            l2 = Math.max(l2, l4);
            ++n4;
        }
        return l2;
    }

    public final void c() {
        p83_0 p83_02 = this.i;
        int n3 = p83_02.size();
        int n4 = 0;
        gr3 gr32 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            gr3$d gr3$d = (gr3$d)p83_02.get(i3);
            gr3$d.f = null;
            gr3$d.e = null;
            gr3$d.i = false;
        }
        p83_02 = this.j;
        n3 = p83_02.size();
        while (n4 < n3) {
            gr32 = (gr3)p83_02.get(n4);
            gr32.c();
            ++n4;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean d() {
        Object object;
        int n3;
        p83_0 p83_02 = this.i;
        int n4 = p83_02.size();
        boolean bl2 = false;
        for (n3 = 0; n3 < n4; ++n3) {
            object = ((gr3$d)p83_02.get((int)n3)).e;
            if (object != null) return true;
        }
        p83_02 = this.j;
        n4 = p83_02.size();
        n3 = 0;
        while (n3 < n4) {
            object = (gr3)p83_02.get(n3);
            boolean bl3 = ((gr3)object).d();
            if (bl3) {
                return true;
            }
            ++n3;
        }
        return bl2;
    }

    public final long e() {
        long l2;
        Object object = this.b;
        if (object != null) {
            l2 = ((gr3)object).e();
        } else {
            object = this.f;
            l2 = ((F83)object).x();
        }
        return l2;
    }

    public final gr3$b f() {
        return (gr3$b)this.e.getValue();
    }

    public final long g() {
        return ((Number)this.m.getValue()).longValue();
    }

    public final boolean h() {
        return (Boolean)this.k.getValue();
    }

    public final void i(long l2, boolean bl2) {
        boolean bl3;
        Object object;
        Object object2;
        int n3;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        Object object3 = this.g;
        long l3 = ((F83)object3).x();
        long l4 = Long.MIN_VALUE;
        Object object4 = this.a;
        Object object5 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object5 == false) {
            ((F83)object3).z(l2);
            object3 = Boolean.TRUE;
            parcelableSnapshotMutableState = ((Mr3)object4).a;
            parcelableSnapshotMutableState.setValue(object3);
        } else {
            object3 = (Boolean)((Mr3)object4).a.getValue();
            boolean bl4 = (Boolean)object3;
            if (!bl4) {
                object3 = Boolean.TRUE;
                parcelableSnapshotMutableState = ((Mr3)object4).a;
                parcelableSnapshotMutableState.setValue(object3);
            }
        }
        object3 = Boolean.FALSE;
        parcelableSnapshotMutableState = this.h;
        parcelableSnapshotMutableState.setValue(object3);
        object3 = this.i;
        int n4 = ((p83_0)object3).size();
        boolean bl5 = true;
        for (n3 = 0; n3 < n4; ++n3) {
            object4 = (gr3$d)((p83_0)object3).get(n3);
            object2 = (Boolean)((gr3$d)object4).g.getValue();
            object5 = (Boolean)object2;
            object = ((gr3$d)object4).g;
            if (object5 == false) {
                long l7;
                if (bl2) {
                    object2 = ((gr3$d)object4).d();
                    l7 = ((ni3_0)object2).e();
                } else {
                    l7 = l2;
                }
                object2 = ((gr3$d)object4).d().g(l7);
                ((gr3$d)object4).h(object2);
                ((gr3$d)object4).k = object2 = ((gr3$d)object4).d().c(l7);
                object4 = ((gr3$d)object4).d();
                object4.getClass();
                bl3 = nl_1.a((ol_1)object4, l7);
                if (bl3) {
                    object4 = Boolean.TRUE;
                    ((h83_0)object).setValue(object4);
                }
            }
            if (bl3 = ((Boolean)(object4 = (Boolean)((h83_0)object).getValue())).booleanValue()) continue;
            bl5 = false;
        }
        object3 = this.j;
        n4 = ((p83_0)object3).size();
        for (n3 = 0; n3 < n4; ++n3) {
            Object object6;
            object4 = (gr3)((p83_0)object3).get(n3);
            object2 = ((gr3)object4).d.getValue();
            object5 = Intrinsics.areEqual(object2, object6 = ((Mr3)(object = ((gr3)object4).a)).a());
            if (object5 == false) {
                ((gr3)object4).i(l2, bl2);
            }
            if (bl3 = Intrinsics.areEqual(object4 = ((gr3)object4).d.getValue(), object2 = ((Mr3)object).a())) continue;
            bl5 = false;
        }
        if (bl5) {
            this.j();
        }
    }

    public final void j() {
        Object object;
        Object object2 = this.g;
        long l2 = Long.MIN_VALUE;
        ((F83)object2).z(l2);
        object2 = this.a;
        int n3 = object2 instanceof VR1;
        if (n3 != 0) {
            object = this.d.getValue();
            ((Mr3)object2).c(object);
        }
        l2 = 0L;
        this.p(l2);
        object = Boolean.FALSE;
        ((Mr3)object2).a.setValue(object);
        object2 = this.j;
        n3 = ((p83_0)object2).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            gr3 gr32 = (gr3)((p83_0)object2).get(i3);
            gr32.j();
        }
    }

    public final void k(float f5) {
        p83_0 p83_02 = this.i;
        int n3 = p83_02.size();
        int n4 = 0;
        gr3 gr32 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            float f6;
            float f7;
            float f8;
            ib3_0 ib3_02 = (gr3$d)p83_02.get(i3);
            ib3_02.getClass();
            float f11 = -4.0f;
            float f12 = f5 == f11 ? 0 : (f5 < f11 ? -1 : 1);
            if (f12 == false || (f8 = (f7 = f5 - (f6 = -5.0f)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) == false) {
                Object object = ((gr3$d)ib3_02).f;
                if (object != null) {
                    ni3_0 ni3_02 = ((gr3$d)ib3_02).d();
                    object = ((ni3_0)object).c;
                    ni3_02.a(object);
                    f8 = 0.0f;
                    f6 = 0.0f;
                    object = null;
                    ((gr3$d)ib3_02).e = null;
                    ((gr3$d)ib3_02).f = null;
                }
                Object object2 = f12 == false ? ((gr3$d)ib3_02).d().d : ((gr3$d)ib3_02).d().c;
                ((gr3$d)ib3_02).d().a(object2);
                object = ((gr3$d)ib3_02).d();
                ((ni3_0)object).i(object2);
                ((gr3$d)ib3_02).h(object2);
                object2 = ((gr3$d)ib3_02).d();
                long l2 = ((ni3_0)object2).e();
                ib3_02 = ((gr3$d)ib3_02).l;
                ((F83)ib3_02).z(l2);
                continue;
            }
            ib3_02 = ((gr3$d)ib3_02).h;
            ((D83)ib3_02).k(f5);
        }
        p83_02 = this.j;
        n3 = p83_02.size();
        while (n4 < n3) {
            gr32 = (gr3)p83_02.get(n4);
            gr32.k(f5);
            ++n4;
        }
    }

    public final void l() {
        p83_0 p83_02 = this.i;
        int n3 = p83_02.size();
        int n4 = 0;
        gr3 gr32 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = ((gr3$d)p83_02.get((int)i3)).h;
            float f5 = -2.0f;
            parcelableSnapshotMutableFloatState.k(f5);
        }
        p83_02 = this.j;
        n3 = p83_02.size();
        while (n4 < n3) {
            gr32 = (gr3)p83_02.get(n4);
            gr32.l();
            ++n4;
        }
    }

    public final void m(Object object, long l2, Object object2) {
        Object object3 = this.g;
        long l3 = Long.MIN_VALUE;
        ((F83)object3).z(l3);
        object3 = Boolean.FALSE;
        Object object4 = this.a;
        ((Mr3)object4).a.setValue(object3);
        int n3 = this.h();
        Object object5 = this.d;
        if (n3 == 0 || (n3 = Intrinsics.areEqual(object3 = ((Mr3)object4).a(), object)) == 0 || (n3 = Intrinsics.areEqual(object3 = ((h83_0)object5).getValue(), object2)) == 0) {
            object3 = ((Mr3)object4).a();
            n3 = Intrinsics.areEqual(object3, object);
            if (n3 == 0 && (n3 = object4 instanceof VR1) != 0) {
                ((Mr3)object4).c(object);
            }
            ((h83_0)object5).setValue(object2);
            object3 = Boolean.TRUE;
            object4 = this.k;
            ((h83_0)object4).setValue(object3);
            object3 = new gr3$c(object, object2);
            object = this.e;
            ((h83_0)object).setValue(object3);
        }
        object = this.j;
        int n4 = ((p83_0)object).size();
        n3 = 0;
        object3 = null;
        object4 = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            object5 = (gr3)((p83_0)object).get(i3);
            Object object6 = "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>";
            Intrinsics.checkNotNull(object5, (String)object6);
            boolean bl2 = ((gr3)object5).h();
            if (!bl2) continue;
            object6 = ((gr3)object5).a.a();
            Object object7 = ((gr3)object5).d.getValue();
            ((gr3)object5).m(object6, l2, object7);
        }
        object = this.i;
        n4 = ((p83_0)object).size();
        while (n3 < n4) {
            object4 = (gr3$d)((p83_0)object).get(n3);
            ((gr3$d)object4).g(l2);
            ++n3;
        }
        this.l = l2;
    }

    public final void n(long l2) {
        Object object;
        long l3;
        Object object2 = this.g;
        long l4 = ((F83)object2).x();
        long l7 = l4 - (l3 = Long.MIN_VALUE);
        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object3 == false) {
            ((F83)object2).z(l2);
        }
        this.p(l2);
        object2 = Boolean.FALSE;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.h;
        parcelableSnapshotMutableState.setValue(object2);
        object2 = this.i;
        int n3 = ((p83_0)object2).size();
        int n4 = 0;
        gr3 gr32 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object = (gr3$d)((p83_0)object2).get(i3);
            ((gr3$d)object).g(l2);
        }
        object2 = this.j;
        n3 = ((p83_0)object2).size();
        while (n4 < n3) {
            Object object4;
            gr32 = (gr3)((p83_0)object2).get(n4);
            object = gr32.d.getValue();
            boolean bl2 = Intrinsics.areEqual(object, object4 = gr32.a.a());
            if (!bl2) {
                gr32.n(l2);
            }
            ++n4;
        }
    }

    public final void o(gX2$a gX2$a) {
        p83_0 p83_02 = this.i;
        int n3 = p83_02.size();
        int n4 = 0;
        gr3 gr32 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            gr3$d gr3$d = (gr3$d)p83_02.get(i3);
            Object object = gr3$d.d().c;
            Object object2 = gr3$d.d().d;
            boolean bl2 = Intrinsics.areEqual(object, object2);
            if (!bl2) {
                gr3$d.f = object = gr3$d.d();
                gr3$d.e = gX2$a;
            }
            object2 = gr3$d.j;
            Object object3 = ((h83_0)object2).getValue();
            Object object4 = ((h83_0)object2).getValue();
            Ol ol = Pl.b(gr3$d.k);
            Vs3 vs3 = gr3$d.a;
            Object object5 = gr3$d.n;
            object2 = object;
            object = new ni3_0((Gl)object5, vs3, object3, object4, ol);
            object2 = gr3$d.d;
            ((h83_0)object2).setValue(object);
            object = gr3$d.d();
            long l2 = ((ni3_0)object).e();
            object5 = gr3$d.l;
            ((F83)object5).z(l2);
            gr3$d.i = bl2 = true;
        }
        p83_02 = this.j;
        n3 = p83_02.size();
        while (n4 < n3) {
            gr32 = (gr3)p83_02.get(n4);
            gr32.o(gX2$a);
            ++n4;
        }
    }

    public final void p(long l2) {
        Object object = this.b;
        if (object == null) {
            object = this.f;
            ((F83)object).z(l2);
        }
    }

    public final void q() {
        p83_0 p83_02 = this.i;
        int n3 = p83_02.size();
        int n4 = 0;
        gr3 gr32 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            Object object2;
            gr3$d gr3$d = (gr3$d)p83_02.get(i3);
            gX2$a gX2$a = gr3$d.e;
            if (gX2$a == null || (object2 = gr3$d.f) == null) continue;
            double d2 = gX2$a.g;
            float f5 = gX2$a.d;
            double d5 = f5;
            long l2 = ok1_1.c(d2 *= d5);
            object2 = ((ni3_0)object2).g(l2);
            boolean bl2 = gr3$d.i;
            if (bl2) {
                object = gr3$d.d();
                ((ni3_0)object).i(object2);
            }
            gr3$d.d().a(object2);
            long l3 = gr3$d.d().e();
            ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = gr3$d.l;
            parcelableSnapshotMutableLongState.z(l3);
            object = gr3$d.h;
            f5 = ((D83)object).c();
            float f6 = -2.0f;
            bl2 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
            if (!bl2 || (bl2 = gr3$d.i)) {
                gr3$d.h(object2);
            } else {
                object2 = gr3$d.o;
                l3 = ((gr3)object2).e();
                gr3$d.g(l3);
            }
            l3 = gX2$a.g;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 >= 0) {
                gX2$a = null;
                gr3$d.e = null;
                gr3$d.f = null;
                continue;
            }
            gX2$a.c = false;
        }
        p83_02 = this.j;
        n3 = p83_02.size();
        while (n4 < n3) {
            gr32 = (gr3)p83_02.get(n4);
            gr32.q();
            ++n4;
        }
    }

    public final void r(Object object) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.d;
        Object object2 = parcelableSnapshotMutableState.getValue();
        boolean bl2 = Intrinsics.areEqual(object2, object);
        if (!bl2) {
            Object object3 = parcelableSnapshotMutableState.getValue();
            object2 = new gr3$c(object3, object);
            this.e.setValue(object2);
            object2 = this.a;
            object3 = ((Mr3)object2).a();
            Object object4 = parcelableSnapshotMutableState.getValue();
            boolean bl3 = Intrinsics.areEqual(object3, object4);
            if (!bl3) {
                object3 = parcelableSnapshotMutableState.getValue();
                ((Mr3)object2).c(object3);
            }
            parcelableSnapshotMutableState.setValue(object);
            object = this.g;
            long l2 = ((F83)object).x();
            long l3 = Long.MIN_VALUE;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) {
                object = Boolean.TRUE;
                parcelableSnapshotMutableState = this.h;
                parcelableSnapshotMutableState.setValue(object);
            }
            this.l();
        }
    }

    public final String toString() {
        p83_0 p83_02 = this.i;
        int n3 = p83_02.size();
        String string2 = "Transition animation values: ";
        for (int i3 = 0; i3 < n3; ++i3) {
            gr3$d gr3$d = (gr3$d)p83_02.get(i3);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(gr3$d);
            stringBuilder.append(", ");
            string2 = stringBuilder.toString();
        }
        return string2;
    }
}

