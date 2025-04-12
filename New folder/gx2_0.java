/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.navigation.d;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from gX2
 */
public final class gx2_0
extends Mr3 {
    public static final kl_1 r;
    public static final kl_1 s;
    public final ParcelableSnapshotMutableState b;
    public final ParcelableSnapshotMutableState c;
    public Object d;
    public gr3 e;
    public long f;
    public final kx2_1 g;
    public final ParcelableSnapshotMutableFloatState h;
    public bl_2 i;
    public final ks1_1 j;
    public final cs1_0 k;
    public long l;
    public final hr1_0 m;
    public gX2$a n;
    public final jx2_1 o;
    public float p;
    public final hx2_0 q;

    static {
        kl_1 kl_12;
        r = kl_12 = new kl_1(0.0f);
        s = kl_12 = new kl_1(1.0f);
    }

    public gx2_0(d object) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        this.b = parcelableSnapshotMutableState = J83.g(object);
        this.c = parcelableSnapshotMutableState = J83.g(object);
        this.d = object;
        this.g = object = new kx2_1(this, 0);
        this.h = object = tp1_0.e(0.0f);
        this.j = object = ls1_2.a();
        this.k = object = new cs1_0();
        this.l = Long.MIN_VALUE;
        this.m = object = new hr1_0(null);
        this.o = object = new jx2_1(this);
        this.q = object = new hx2_0(this);
    }

    public static final void f(gx2_0 gx2_02) {
        gr3 gr32 = gx2_02.e;
        if (gr32 != null) {
            Object object;
            long l2;
            Object object2 = gx2_02.n;
            if (object2 == null) {
                Object object3;
                float f5;
                float f6;
                float f7;
                float f8;
                l2 = gx2_02.f;
                long l3 = 0L;
                long l4 = l2 - l3;
                Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object4 > 0 && (f8 = (f7 = (f6 = ((D83)(object2 = gx2_02.h)).c()) - (f5 = 1.0f)) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) != false && (f8 = (float)Intrinsics.areEqual(object = gx2_02.c.getValue(), object3 = gx2_02.b.getValue())) == false) {
                    long l7;
                    object = new gX2$a();
                    ((gX2$a)object).d = f5 = ((D83)object2).c();
                    ((gX2$a)object).g = l7 = gx2_02.f;
                    double d2 = l7;
                    float f11 = ((D83)object2).c();
                    double d5 = f11;
                    double d7 = (1.0 - d5) * d2;
                    ((gX2$a)object).h = l7 = ok1_1.c(d7);
                    object3 = ((gX2$a)object).e;
                    float f12 = ((D83)object2).c();
                    ((kl_1)object3).e(f12, 0);
                    object2 = object;
                } else {
                    object4 = 0;
                    object2 = null;
                    float f14 = 0.0f;
                }
            }
            if (object2 != null) {
                ((gX2$a)object2).g = l2 = gx2_02.f;
                object = gx2_02.m;
                ((hr1_0)object).b(object2);
                gr32.o((gX2$a)object2);
            }
            gx2_02.n = null;
        }
    }

    public static final void g(gx2_0 gx2_02, gX2$a gX2$a, long l2) {
        long l3;
        gx2_02.getClass();
        long l4 = gX2$a.a;
        gX2$a.a = l3 = l4 + l2;
        l2 = gX2$a.h;
        float f5 = 1.0f;
        long l7 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (l7 >= 0) {
            gX2$a.d = f5;
        } else {
            JA3 jA3 = gX2$a.b;
            l7 = 0;
            float f6 = 0.0f;
            if (jA3 != null) {
                kl_1 kl_12 = gX2$a.f;
                if (kl_12 == null) {
                    kl_12 = r;
                }
                kl_1 kl_13 = gX2$a.e;
                kl_1 kl_14 = s;
                kl_12 = (kl_1)jA3.f(l3, kl_13, kl_14, kl_12);
                float f7 = kl_12.a(0);
                gX2$a.d = f5 = kotlin.ranges.f.f(f7, 0.0f, f5);
            } else {
                kl_1 kl_15 = gX2$a.e;
                f6 = kl_15.a(0);
                float f8 = l3;
                float f11 = l2;
                f8 /= f11;
                Ws3 ws3 = ya3_0.a;
                boolean bl2 = true;
                f11 = ((float)bl2 - f8) * f6;
                gX2$a.d = f5 = f5 * f8 + f11;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object h(gx2_0 var0, f80_0 var1_1) {
        block9: {
            block5: {
                block7: {
                    block10: {
                        block8: {
                            block6: {
                                var0.getClass();
                                var2_2 = var1_1 instanceof lx2_0;
                                if (!var2_2) ** GOTO lbl-1000
                                var3_3 = var1_1;
                                var3_3 = (lx2_0)var1_1;
                                var4_4 = var3_3.d;
                                var5_5 = -1 << -1;
                                var6_6 = var4_4 & var5_5;
                                if (var6_6 != 0) {
                                    var3_3.d = var4_4 -= var5_5;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var3_3 = new lx2_0((gx2_0)var0, (f80_0)var1_1);
                                }
                                var1_1 = var3_3.b;
                                var7_7 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                var5_5 = var3_3.d;
                                var6_6 = 2;
                                var8_8 = 1;
                                var9_9 = -9223372036854775808L;
                                if (var5_5 == 0) break block6;
                                if (var5_5 != var8_8 && var5_5 != var6_6) {
                                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw var0;
                                }
                                var0 = var3_3.a;
                                vl2_2.b(var1_1);
                                break block7;
                            }
                            vl2_2.b(var1_1);
                            var1_1 = var0.m;
                            var11_10 = var1_1.b;
                            if (var11_10 != 0 || (var1_1 = var0.n) != null) break block8;
                            var7_7 /* !! */  = Unit.a;
                            break block9;
                        }
                        var1_1 = var3_3.getContext();
                        var12_11 = mg3_0.h((CoroutineContext)var1_1);
                        var5_5 = 0;
                        var13_12 = null;
                        cfr_temp_0 = var12_11 - 0.0f;
                        var11_10 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                        if (var11_10 != 0) break block10;
                        var0.l();
                        var0.l = var9_9;
                        var7_7 /* !! */  = Unit.a;
                        break block9;
                    }
                    var14_13 = var0.l;
                    cfr_temp_1 = var14_13 - var9_9;
                    var11_10 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var11_10 != 0) break block7;
                    var3_3.a = var0;
                    var3_3.d = var8_8;
                    var1_1 = aQ1.a(var3_3.getContext());
                    var13_12 = var0.o;
                    if ((var1_1 = var1_1.R(var13_12, var3_3)) == var7_7 /* !! */ ) break block9;
                }
                do {
                    var1_1 = var0.m;
                    var11_10 = var1_1.b;
                    if (var11_10 == 0 && (var1_1 = var0.n) == null) break block5;
                    var3_3.a = var0;
                    var3_3.d = var6_6;
                } while ((var1_1 = var0.k(var3_3)) != var7_7 /* !! */ );
                break block9;
            }
            var0.l = var9_9;
            var7_7 /* !! */  = Unit.a;
        }
        return var7_7 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object i(gx2_0 var0, f80_0 var1_1) {
        block12: {
            block11: {
                block9: {
                    block10: {
                        block6: {
                            block7: {
                                block8: {
                                    var0.getClass();
                                    var2_2 = var1_1 instanceof nx2_0;
                                    if (!var2_2) ** GOTO lbl-1000
                                    var3_3 = var1_1;
                                    var3_3 = (nx2_0)var1_1;
                                    var4_4 = var3_3.e;
                                    var5_5 = -1 << -1;
                                    var6_6 = var4_4 & var5_5;
                                    if (var6_6 != 0) {
                                        var3_3.e = var4_4 -= var5_5;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var3_3 = new nx2_0((gx2_0)var0, (f80_0)var1_1);
                                    }
                                    var1_1 = var3_3.c;
                                    var7_7 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                    var5_5 = var3_3.e;
                                    var6_6 = 0;
                                    var8_8 = null;
                                    var9_9 = 2;
                                    var10_10 = 1;
                                    if (var5_5 == 0) break block6;
                                    if (var5_5 == var10_10) break block7;
                                    if (var5_5 != var9_9) break block8;
                                    var0 = var3_3.b;
                                    var3_3 = var3_3.a;
                                    vl2_2.b(var1_1);
                                    break block9;
                                }
                                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var0;
                            }
                            var0 = var3_3.b;
                            var11_11 = var3_3.a;
                            vl2_2.b(var1_1);
                            var1_1 = var0;
                            var0 = var11_11;
                            break block10;
                        }
                        vl2_2.b(var1_1);
                        var1_1 = var0.b.getValue();
                        var3_3.a = var0;
                        var3_3.b = var1_1;
                        var3_3.e = var10_10;
                        var11_11 = var0.j.d((f80_0)var3_3, null);
                        if (var11_11 == var7_7 /* !! */ ) break block11;
                    }
                    var3_3.a = var0;
                    var3_3.b = var1_1;
                    var3_3.e = var9_9;
                    var12_12 = zj1_2.b((f80_0)var3_3);
                    var11_11 = new CancellableContinuationImpl(var10_10, (f80_0)var12_12);
                    var11_11.r();
                    var0.i = var11_11;
                    var12_12 = var0.j;
                    var12_12.b(null);
                    var11_11 = var11_11.q();
                    if (var11_11 == var7_7 /* !! */ ) {
                        var8_8 = "frame";
                        Intrinsics.checkNotNullParameter(var3_3, var8_8);
                    }
                    if (var11_11 == var7_7 /* !! */ ) break block11;
                    var3_3 = var0;
                    var0 = var1_1;
                    var1_1 = var11_11;
                }
                var13_13 = Intrinsics.areEqual(var1_1, var0);
                if (!var13_13) break block12;
                var7_7 /* !! */  = Unit.a;
            }
            return var7_7 /* !! */ ;
        }
        var3_3.l = -9223372036854775808L;
        var0 = new CancellationException("targetState while waiting for composition");
        throw var0;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object j(gx2_0 var0, f80_0 var1_1) {
        block14: {
            block11: {
                block13: {
                    block9: {
                        block12: {
                            block10: {
                                block6: {
                                    block7: {
                                        block8: {
                                            var0.getClass();
                                            var2_2 = var1_1 instanceof ox2_0;
                                            if (!var2_2) ** GOTO lbl-1000
                                            var3_3 = var1_1;
                                            var3_3 = (ox2_0)var1_1;
                                            var4_4 = var3_3.e;
                                            var5_5 = -1 << -1;
                                            var6_6 = var4_4 & var5_5;
                                            if (var6_6 != 0) {
                                                var3_3.e = var4_4 -= var5_5;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var3_3 = new ox2_0((gx2_0)var0, (f80_0)var1_1);
                                            }
                                            var1_1 = var3_3.c;
                                            var7_7 = j90_0.COROUTINE_SUSPENDED;
                                            var5_5 = var3_3.e;
                                            var6_6 = 0;
                                            var8_8 = null;
                                            var9_9 = 2;
                                            var10_10 = 1;
                                            if (var5_5 == 0) break block6;
                                            if (var5_5 == var10_10) break block7;
                                            if (var5_5 != var9_9) break block8;
                                            var0 = var3_3.b;
                                            var3_3 = var3_3.a;
                                            vl2_2.b(var1_1);
                                            break block9;
                                        }
                                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        throw var0;
                                    }
                                    var0 = var3_3.b;
                                    var11_11 = var3_3.a;
                                    vl2_2.b(var1_1);
                                    break block10;
                                }
                                vl2_2.b(var1_1);
                                var1_1 = var0.b.getValue();
                                var3_3.a = var0;
                                var3_3.b = var1_1;
                                var3_3.e = var10_10;
                                var11_11 = var0.j.d((f80_0)var3_3, null);
                                if (var11_11 == var7_7) break block11;
                                var11_11 = var0;
                                var0 = var1_1;
                            }
                            var1_1 = var11_11.d;
                            var12_12 = Intrinsics.areEqual(var0, var1_1);
                            var13_13 = var11_11.j;
                            if (!var12_12) break block12;
                            var13_13.b(null);
                            break block13;
                        }
                        var3_3.a = var11_11;
                        var3_3.b = var0;
                        var3_3.e = var9_9;
                        var14_14 = zj1_2.b((f80_0)var3_3);
                        var1_1 = new CancellableContinuationImpl(var10_10, var14_14);
                        var1_1.r();
                        var11_11.i = var1_1;
                        var13_13.b(null);
                        var1_1 = var1_1.q();
                        if (var1_1 == var7_7) {
                            var8_8 = "frame";
                            Intrinsics.checkNotNullParameter(var3_3, var8_8);
                        }
                        if (var1_1 == var7_7) break block11;
                        var3_3 = var11_11;
                    }
                    var4_4 = (int)Intrinsics.areEqual(var1_1, var0);
                    if (var4_4 == 0) break block14;
                }
                var7_7 = Unit.a;
            }
            return var7_7;
        }
        var3_3.l = -9223372036854775808L;
        var7_7 = new StringBuilder("snapTo() was canceled because state was changed to ");
        var7_7.append(var1_1);
        var7_7.append(" instead of ");
        var7_7.append(var0);
        var0 = var7_7.toString();
        var3_3 = new CancellationException((String)var0);
        throw var3_3;
    }

    public final Object a() {
        return this.c.getValue();
    }

    public final Object b() {
        return this.b.getValue();
    }

    public final void c(Object object) {
        this.c.setValue(object);
    }

    public final void d(gr3 object) {
        boolean bl2;
        Object object2 = this.e;
        if (object2 != null && !(bl2 = Intrinsics.areEqual(object, object2))) {
            object2 = new StringBuilder("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: ");
            gr3 gr32 = this.e;
            ((StringBuilder)object2).append(gr32);
            ((StringBuilder)object2).append(", new instance: ");
            ((StringBuilder)object2).append(object);
            object = ((StringBuilder)object2).toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        this.e = object;
    }

    public final void e() {
        this.e = null;
        ((S83)yr3.b.getValue()).c(this);
    }

    public final Object k(f80_0 object) {
        Object object2 = object.getContext();
        float f5 = mg3_0.h(object2);
        hx2_0 hx2_02 = null;
        float f6 = f5 - 0.0f;
        Object object3 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object3 <= 0) {
            this.l();
            return Unit.a;
        }
        this.p = f5;
        object2 = aQ1.a(object.getContext());
        hx2_02 = this.q;
        if ((object = object2.R(hx2_02, (f80_0)object)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final void l() {
        Object object = this.e;
        if (object != null) {
            ((gr3)object).c();
        }
        object = this.m;
        Object[] objectArray = ((l62)object).a;
        int n3 = ((l62)object).b;
        rp_1.n(0, n3, null, objectArray);
        ((l62)object).b = 0;
        object = this.n;
        if (object != null) {
            this.n = null;
            float f5 = 1.0f;
            this.o(f5);
            this.n();
        }
    }

    public final Object m(float f5, Object object, f80_0 f80_02) {
        float f6;
        float f7 = 0.0f;
        gX2$b gX2$b = null;
        float f8 = 0.0f - f5;
        Object object2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object2 <= 0 && (object2 = (f6 = f5 - (f7 = 1.0f)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) <= 0) {
            gr3 gr32 = this.e;
            if (gr32 == null) {
                return Unit.a;
            }
            Object object3 = this.b.getValue();
            gX2$b = new gX2$b(object, object3, this, gr32, f5, null);
            Object object4 = cs1_0.a(this.k, gX2$b, f80_02);
            if (object4 == (object = j90_0.COROUTINE_SUSPENDED)) {
                return object4;
            }
            return Unit.a;
        }
        object = new StringBuilder("Expecting fraction between 0 and 1. Got ");
        ((StringBuilder)object).append(f5);
        String string2 = ((StringBuilder)object).toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final void n() {
        gr3 gr32 = this.e;
        if (gr32 == null) {
            return;
        }
        double d2 = this.h.c();
        double d5 = gr32.g();
        long l2 = ok1_1.c(d2 * d5);
        gr32.n(l2);
    }

    public final void o(float f5) {
        this.h.k(f5);
    }
}

