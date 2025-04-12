/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;

/*
 * Renamed from ft1
 */
public final class ft1_2
implements dU2 {
    public static final ds2_0 x;
    public final at1_0 a;
    public boolean b;
    public Ws1 c;
    public final et1 d;
    public final Fs1 e;
    public final ParcelableSnapshotMutableState f;
    public final xr1_1 g;
    public float h;
    public final xm0_0 i;
    public final boolean j;
    public hi2_0 k;
    public final ft1$e l;
    public final pu_0 m;
    public final LazyLayoutItemAnimator n;
    public final Br1 o;
    public final xs1 p;
    public final ft1$c q;
    public final ws1_0 r;
    public final tr1_0 s;
    public final ParcelableSnapshotMutableState t;
    public final ParcelableSnapshotMutableState u;
    public final tr1_0 v;
    public il_0 w;

    static {
        ft1$a ft1$a = ft1$a.c;
        ft1$b ft1$b = ft1$b.c;
        x = sr0_2.a(ft1$a, ft1$b);
    }

    public ft1_2() {
        hm0 hm02 = new hm0(2);
        this(0, 0, hm02);
    }

    public ft1_2(int n3, int n4) {
        hm0 hm02 = new hm0(2);
        this(n3, n4, hm02);
    }

    public ft1_2(int n3, int n4, at1_0 object) {
        this.a = object;
        Object object2 = new et1(n3, n4);
        this.d = object2;
        Object object3 = new Fs1(this);
        this.e = object3;
        object3 = jt1.b;
        J83.h();
        object2 = wv1_0.b;
        this.f = object3 = J83.f(object3, (I83)object2);
        this.g = object3 = new xr1_1();
        object3 = new ft1$g(this);
        this.i = object2 = new xm0_0((Function1)object3);
        this.j = true;
        this.l = object3 = new ft1$e(this);
        this.m = object3 = new pu_0();
        this.n = object3 = new LazyLayoutItemAnimator();
        this.o = object3 = new Br1();
        object.getClass();
        object = new ft1$d(this, n3);
        this.p = object3 = new xs1(null, (Function1)object);
        Object object4 = new ft1$c(this);
        this.q = object4;
        this.r = object4 = new ws1_0();
        this.s = object4 = A62.c();
        object4 = Boolean.FALSE;
        this.t = object3 = J83.g(object4);
        this.u = object4 = J83.g(object4);
        this.v = object4 = A62.c();
        object4 = FloatCompanionObject.INSTANCE;
        Ws3 ws3 = ya3_0.a;
        Float f5 = Float.valueOf(0.0f);
        object4 = Float.valueOf(0.0f);
        Object object5 = object4 = ws3.a.invoke(object4);
        object5 = (Ol)object4;
        object2 = object3;
        this.w = object3 = new il_0(ws3, f5, (Ol)object5, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static Object f(ft1_2 object, int n3, f80_0 f80_02) {
        Vo0 vo0 = ((Ws1)((ft1_2)object).f.getValue()).h;
        object = ((ft1_2)object).e;
        sq1_2 sq1_22 = new sq1_2(n3, vo0, (zr1)object, 0, null);
        object.getClass();
        Enum enum_ = aS1.Default;
        object = ((Fs1)object).a.a((aS1)enum_, sq1_22, f80_02);
        enum_ = j90_0.COROUTINE_SUSPENDED;
        if (object != enum_) {
            object = Unit.a;
        }
        if (object != enum_) {
            object = Unit.a;
        }
        if (object != enum_) {
            object = Unit.a;
        }
        return object;
    }

    public static Object k(ft1_2 object, int n3, f80_0 f80_02) {
        object.getClass();
        gt1_2 gt1_22 = new gt1_2((ft1_2)object, n3, 0, null);
        Enum enum_ = aS1.Default;
        object = ((ft1_2)object).a((aS1)enum_, gt1_22, f80_02);
        enum_ = j90_0.COROUTINE_SUSPENDED;
        if (object != enum_) {
            object = Unit.a;
        }
        return object;
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
                            var4_4 = var3_3 instanceof ft1$f;
                            if (!var4_4) ** GOTO lbl-1000
                            var5_5 = var3_3;
                            var5_5 = (ft1$f)var3_3;
                            var6_6 = var5_5.f;
                            var7_7 = -1 << -1;
                            var8_8 = var6_6 & var7_7;
                            if (var8_8 != 0) {
                                var5_5.f = var6_6 -= var7_7;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var5_5 = new ft1$f(this, (f80_0)var3_3);
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
                var3_3 = this.m.b(var5_5);
                if (var3_3 == var9_9) {
                    return var9_9;
                }
                var11_11 = this;
            }
            var3_3 = var11_11.i;
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
        return this.i.b();
    }

    public final boolean c() {
        return (Boolean)this.u.getValue();
    }

    public final boolean d() {
        return (Boolean)this.t.getValue();
    }

    public final float e(float f5) {
        return this.i.e(f5);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(Ws1 object, boolean object2, boolean n3) {
        Throwable throwable2;
        v83_0 v83_02;
        Object object3;
        Object object4;
        block23: {
            block24: {
                int n4;
                float f5;
                Object object5;
                int n7;
                Object object6;
                Object object7;
                block22: {
                    il_0 il_02;
                    float f6;
                    boolean bl2;
                    Object object8;
                    if (object2 == 0 && (object8 = this.b) != 0) {
                        this.c = object;
                        return;
                    }
                    object8 = 1;
                    float f7 = Float.MIN_VALUE;
                    if (object2 != 0) {
                        this.b = object8;
                    }
                    object4 = ((Ws1)object).a;
                    int n8 = 0;
                    float f8 = 0.0f;
                    object7 = null;
                    if (object4 != null) {
                        bl2 = ((xs1_0)object4).a;
                    } else {
                        bl2 = false;
                        f6 = 0.0f;
                        object6 = null;
                    }
                    if (!bl2 && !(bl2 = ((Ws1)object).b)) {
                        bl2 = false;
                        f6 = 0.0f;
                        object6 = null;
                    } else {
                        bl2 = true;
                        f6 = Float.MIN_VALUE;
                    }
                    object6 = bl2;
                    this.u.setValue(object6);
                    object6 = ((Ws1)object).c;
                    this.t.setValue(object6);
                    f6 = this.h;
                    float f11 = ((Ws1)object).d;
                    this.h = f6 -= f11;
                    this.f.setValue(object);
                    bl2 = false;
                    f6 = 0.0f;
                    object6 = null;
                    f11 = 0.0f;
                    n7 = 41;
                    String string2 = "scrollOffset should be non-negative (";
                    et1 et12 = this.d;
                    if (n3 != 0) {
                        n3 = ((Ws1)object).b;
                        f7 = n3;
                        float f12 = f7 - 0.0f;
                        object8 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                        if (object8 < 0) {
                            et12.getClass();
                            object = new StringBuilder(string2);
                            ((StringBuilder)object).append(n3);
                            ((StringBuilder)object).append((char)n7);
                            object = ((StringBuilder)object).toString();
                            object = object.toString();
                            IllegalStateException illegalStateException = new IllegalStateException((String)object);
                            throw illegalStateException;
                        }
                        object3 = et12.b;
                        ((e83_0)object3).e(n3);
                    } else {
                        et12.getClass();
                        if (object4 != null) {
                            object5 = ((xs1_0)object4).l;
                        } else {
                            n3 = 0;
                            object5 = null;
                            f5 = 0.0f;
                        }
                        et12.d = object5;
                        n3 = et12.c;
                        if (n3 != 0 || (n3 = ((Ws1)object).m) > 0) {
                            et12.c = object8;
                            n3 = ((Ws1)object).b;
                            f7 = n3;
                            float f14 = f7 - 0.0f;
                            object8 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                            if (object8 < 0) {
                                object = new StringBuilder(string2);
                                ((StringBuilder)object).append(n3);
                                ((StringBuilder)object).append((char)n7);
                                object = ((StringBuilder)object).toString();
                                object = object.toString();
                                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                                throw illegalStateException;
                            }
                            if (object4 != null) {
                                n8 = ((xs1_0)object4).a;
                            }
                            et12.a(n8, n3);
                        }
                        if ((n3 = (int)(this.j ? 1 : 0)) != 0) {
                            object5 = this.a;
                            object5.c((Ts1)object);
                        }
                    }
                    if (object2 == 0) return;
                    float f15 = jt1.a;
                    f5 = ((Ws1)object).e;
                    object5 = ((Ws1)object).h;
                    float f16 = f5 - (f15 = object5.J0(f15));
                    object2 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                    if (object2 <= 0) {
                        return;
                    }
                    v83_02 = v83$a.a();
                    if (v83_02 != null) {
                        object3 = v83_02.f();
                    } else {
                        object8 = 0;
                        object3 = null;
                        f7 = 0.0f;
                    }
                    object4 = v83$a.b(v83_02);
                    try {
                        object7 = this.w;
                        object7 = ((il_0)object7).b;
                        object7 = ((h83_0)object7).getValue();
                        object7 = (Number)object7;
                        f8 = ((Number)object7).floatValue();
                        il_02 = this.w;
                        boolean bl3 = il_02.f;
                        n4 = 3;
                        object = ((Ws1)object).g;
                        if (!bl3) break block22;
                        f8 -= f5;
                        n3 = 30;
                        f5 = 4.2E-44f;
                    }
                    catch (Throwable throwable2) {
                        break block23;
                    }
                    this.w = object5 = jl_0.b(il_02, f8, 0.0f, n3);
                    object5 = new ht1_2(this, null);
                    Ae3.d((i90_0)object, null, null, (Function2)object5, n4);
                    break block24;
                }
                object6 = FloatCompanionObject.INSTANCE;
                object6 = ya3_0.a;
                f5 = -f5;
                {
                    object5 = Float.valueOf(f5);
                    n7 = 60;
                    this.w = object7 = new il_0((Vs3)object6, object5, null, n7);
                    object5 = new it1_2(this, null);
                    Ae3.d((i90_0)object, null, null, (Function2)object5, n4);
                }
            }
            v83$a.e(v83_02, (v83_0)object4, (Function1)object3);
            return;
        }
        v83$a.e(v83_02, (v83_0)object4, (Function1)object3);
        throw throwable2;
    }

    public final int h() {
        return this.d.a.o();
    }

    public final int i() {
        return this.d.b.o();
    }

    public final Ts1 j() {
        return (Ts1)this.f.getValue();
    }

    public final void l(int n3, int n4) {
        et1 et12 = this.d;
        Object object = et12.a;
        int n7 = ((e83_0)object).o();
        if (n7 != n3 || (n7 = ((e83_0)(object = et12.b)).o()) != n4) {
            object = this.n;
            ((LazyLayoutItemAnimator)object).f();
        }
        et12.a(n3, n4);
        n3 = 0;
        et12.d = null;
        hi2_0 hi2_02 = this.k;
        if (hi2_02 != null) {
            hi2_02.f();
        }
    }
}

