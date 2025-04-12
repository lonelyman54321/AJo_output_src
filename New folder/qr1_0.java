/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from qr1
 */
public final class qr1_0
implements dU2 {
    public static final ds2_0 t;
    public final hr1 a;
    public final kr1_0 b;
    public final ParcelableSnapshotMutableState c;
    public final xr1_1 d;
    public float e;
    public final xm0_0 f;
    public final boolean g;
    public hi2_0 h;
    public final qr1$e i;
    public final pu_0 j;
    public final LazyLayoutItemAnimator k;
    public final Br1 l;
    public final xs1 m;
    public final qr1$c n;
    public final ws1_0 o;
    public final tr1_0 p;
    public final tr1_0 q;
    public final ParcelableSnapshotMutableState r;
    public final ParcelableSnapshotMutableState s;

    static {
        qr1$a qr1$a = qr1$a.c;
        qr1$b qr1$b = qr1$b.c;
        t = sr0_2.a(qr1$a, qr1$b);
    }

    public qr1_0() {
        gm0_0 gm0_02 = new gm0_0(2);
        this(0, 0, gm0_02);
    }

    public qr1_0(int n3, int n4) {
        gm0_0 gm0_02 = new gm0_0(2);
        this(n3, n4, gm0_02);
    }

    public qr1_0(int n3, int n4, hr1 object) {
        this.a = object;
        Object object2 = new kr1_0(n3, n4);
        this.b = object2;
        Object object3 = sr1.a;
        J83.h();
        object2 = wv1_0.b;
        this.c = object3 = J83.f(object3, (I83)object2);
        this.d = object3 = new xr1_1();
        object3 = new qr1$g(this);
        this.f = object2 = new xm0_0((Function1)object3);
        this.g = true;
        this.i = object3 = new qr1$e(this);
        this.j = object3 = new pu_0();
        this.k = object3 = new LazyLayoutItemAnimator();
        this.l = object3 = new Br1();
        object.getClass();
        object = new qr1$d(this, n3);
        this.m = object3 = new xs1(null, (Function1)object);
        Object object4 = new qr1$c(this);
        this.n = object4;
        this.o = object4 = new ws1_0();
        this.p = object4 = A62.c();
        this.q = object4 = A62.c();
        object4 = Boolean.FALSE;
        this.r = object3 = J83.g(object4);
        this.s = object4 = J83.g(object4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object a(aS1 var1_1, Function2 var2_2, f80_0 var3_3) {
        block7: {
            block8: {
                block4: {
                    block5: {
                        block6: {
                            var4_4 = var3_3 instanceof qr1$f;
                            if (!var4_4) ** GOTO lbl-1000
                            var5_5 = var3_3;
                            var5_5 = (qr1$f)var3_3;
                            var6_6 = var5_5.f;
                            var7_7 = -1 << -1;
                            var8_8 = var6_6 & var7_7;
                            if (var8_8 != 0) {
                                var5_5.f = var6_6 -= var7_7;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var5_5 = new qr1$f(this, (f80_0)var3_3);
                            }
                            var3_3 = var5_5.d;
                            var9_9 = j90_0.COROUTINE_SUSPENDED;
                            var7_7 = var5_5.f;
                            var8_8 = 2;
                            var10_10 = 1;
                            if (var7_7 == 0) break block4;
                            if (var7_7 == var10_10) break block5;
                            if (var7_7 != var8_8) break block6;
                            vl2_2.b(var3_3);
                            break block7;
                        }
                        var1_1 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1 /* !! */ ;
                    }
                    var2_2 = var5_5.c;
                    var1_1 /* !! */  = var5_5.b;
                    var11_11 = var5_5.a;
                    vl2_2.b(var3_3);
                    break block8;
                }
                vl2_2.b(var3_3);
                var5_5.a = this;
                var5_5.b = var1_1 /* !! */ ;
                var5_5.c = var2_2;
                var5_5.f = var10_10;
                var3_3 = this.j.b(var5_5);
                if (var3_3 == var9_9) {
                    return var9_9;
                }
                var11_11 = this;
            }
            var3_3 = var11_11.f;
            var7_7 = 0;
            var11_11 = null;
            var5_5.a = null;
            var5_5.b = null;
            var5_5.c = null;
            var5_5.f = var8_8;
            var1_1 /* !! */  = var3_3.a(var1_1 /* !! */ , var2_2, var5_5);
            if (var1_1 /* !! */  == var9_9) {
                return var9_9;
            }
        }
        return Unit.a;
    }

    public final boolean b() {
        return this.f.b();
    }

    public final boolean c() {
        return (Boolean)this.s.getValue();
    }

    public final boolean d() {
        return (Boolean)this.r.getValue();
    }

    public final float e(float f5) {
        return this.f.e(f5);
    }

    /*
     * WARNING - void declaration
     */
    public final void f(cr1_0 object, boolean object2) {
        Object object3;
        String string2;
        char c2;
        block15: {
            block13: {
                block14: {
                    kr1_0 kr1_02;
                    float f5;
                    Object object4;
                    Object object5;
                    int n3;
                    block11: {
                        int n4;
                        block12: {
                            void var7_13;
                            int n7;
                            void var7_9;
                            Boolean bl2;
                            float f6 = this.e;
                            float f7 = ((cr1_0)object).d;
                            this.e = f6 -= f7;
                            this.c.setValue(object);
                            n3 = 0;
                            f6 = 0.0f;
                            object5 = ((cr1_0)object).a;
                            if (object5 != null) {
                                int c22 = object5.a;
                            } else {
                                boolean bl3 = false;
                                bl2 = null;
                            }
                            object4 = 1;
                            f5 = Float.MIN_VALUE;
                            if (var7_9 == false && (n7 = ((cr1_0)object).b) == 0) {
                                boolean bl4 = false;
                                bl2 = null;
                            } else {
                                boolean bl5 = true;
                            }
                            bl2 = (boolean)var7_13;
                            this.s.setValue(bl2);
                            bl2 = ((cr1_0)object).c;
                            this.r.setValue(bl2);
                            c2 = ')';
                            string2 = "scrollOffset should be non-negative (";
                            kr1_02 = this.b;
                            if (object2 == false) break block11;
                            n4 = ((cr1_0)object).b;
                            float f8 = n4;
                            float f11 = f8 - 0.0f;
                            object2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                            if (object2 < 0) break block12;
                            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = kr1_02.b;
                            parcelableSnapshotMutableIntState.e(n4);
                            break block13;
                        }
                        kr1_02.getClass();
                        Serializable serializable = new StringBuilder(string2);
                        serializable.append(n4);
                        serializable.append(c2);
                        object = serializable.toString();
                        object = object.toString();
                        serializable = new IllegalStateException((String)object);
                        throw serializable;
                    }
                    kr1_02.getClass();
                    if (object5 != null && (object3 = object5.b) != null && (object3 = (dr1_0)tp_2.A((Object[])object3)) != null) {
                        object3 = ((dr1_0)object3).b;
                    } else {
                        object2 = false;
                        float f12 = 0.0f;
                        object3 = null;
                    }
                    kr1_02.d = object3;
                    object2 = kr1_02.c;
                    if (object2 == 0 && (object2 = ((cr1_0)object).l) <= 0) break block14;
                    kr1_02.c = object4;
                    object2 = ((cr1_0)object).b;
                    f5 = object2;
                    float f14 = f5 - 0.0f;
                    object4 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    if (object4 < 0) break block15;
                    if (object5 != null && (object5 = object5.b) != null && (object5 = (dr1_0)tp_2.A(object5)) != null) {
                        n3 = object5.a;
                    }
                    kr1_02.a(n3, (int)object2);
                }
                if ((object2 = (Object)this.g) != 0) {
                    object3 = this.a;
                    object3.b((Zq1)object);
                }
            }
            return;
        }
        object = new StringBuilder(string2);
        ((StringBuilder)object).append((int)object2);
        ((StringBuilder)object).append(c2);
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object3 = new IllegalStateException((String)object);
        throw object3;
    }

    public final Zq1 g() {
        return (Zq1)this.c.getValue();
    }
}

