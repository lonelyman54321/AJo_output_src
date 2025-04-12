/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from W32
 */
public abstract class w32_0
extends tb1_0
implements xk1_0,
zp1,
Tg2 {
    public static final W32$d I;
    public static final W32$c J;
    public static final uo2_0 K;
    public static final tp1_1 L;
    public static final float[] M;
    public static final W32$a N;
    public static final W32$b O;
    public float A;
    public MR1 B;
    public tp1_1 C;
    public final W32$f D;
    public final W32$h E;
    public boolean F;
    public Qg2 G;
    public W01 H;
    public final xp1_0 m;
    public boolean n;
    public boolean o;
    public w32_0 p;
    public w32_0 q;
    public boolean r;
    public boolean s;
    public Function1 t;
    public Vo0 u;
    public bp1_0 v;
    public float w;
    public bl1_0 x;
    public LinkedHashMap y;
    public long z;

    static {
        long l2;
        float f5;
        I = W32$d.c;
        J = W32$c.c;
        Object object = new Object();
        ((uo2_0)object).b = f5 = 1.0f;
        ((uo2_0)object).c = f5;
        ((uo2_0)object).d = f5;
        ((uo2_0)object).h = l2 = b11_0.a;
        ((uo2_0)object).i = l2;
        ((uo2_0)object).m = 8.0f;
        ((uo2_0)object).n = l2 = Oq3.b;
        Object object2 = fg2_1.a;
        ((uo2_0)object).o = object2;
        ((uo2_0)object).q = 0;
        ((uo2_0)object).r = 9205357640488583168L;
        ((uo2_0)object).s = object2 = km3.a();
        object2 = bp1_0.Ltr;
        ((uo2_0)object).t = object2;
        K = object;
        L = object = new tp1_1();
        M = QK1.a();
        N = object = new Object();
        O = object = new Object();
    }

    public w32_0(xp1_0 object) {
        Vo0 vo0;
        this.m = object;
        this.u = vo0 = object.r;
        object = object.s;
        this.v = object;
        this.w = 0.8f;
        this.z = 0L;
        super(this);
        this.D = object;
        super(this);
        this.E = object;
    }

    public static w32_0 A1(zp1 zp12) {
        zp1 zp13;
        boolean bl2 = zp12 instanceof yb1_0;
        if (bl2) {
            zp13 = zp12;
            zp13 = (yb1_0)zp12;
        } else {
            bl2 = false;
            zp13 = null;
        }
        if (zp13 == null || (zp13 = ((yb1_0)zp13).a.m) == null) {
            Intrinsics.checkNotNull(zp12, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            zp13 = zp12;
            zp13 = (w32_0)zp12;
        }
        return zp13;
    }

    public final long A(long l2) {
        Object object = this.j1();
        boolean bl2 = ((LP1$c)object).m;
        if (bl2) {
            object = ap1_0.d(this);
            l2 = aq1_0.a(this.m).o(l2);
            long l3 = object.a0(0L);
            l2 = e72.h(l2, l3);
            return this.r1((zp1)object, l2);
        }
        bh1_1.c("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final tb1_0 A0() {
        return this.q;
    }

    public final Object B() {
        xp1_0 xp1_02 = this.m;
        Object object = xp1_02.y;
        int n3 = 64;
        boolean bl2 = ((T32)object).d(n3);
        if (bl2) {
            this.j1();
            object = new Ref$ObjectRef();
            LP1$c lP1$c = xp1_02.y.d;
            while (lP1$c != null) {
                int n4 = lP1$c.c & n3;
                if (n4 != 0) {
                    WR1 wR1 = null;
                    Object object2 = lP1$c;
                    while (object2 != null) {
                        Object object3;
                        Object object4;
                        int n7 = object2 instanceof sm2_0;
                        if (n7 != 0) {
                            object2 = (sm2_0)object2;
                            object4 = xp1_02.r;
                            object3 = ((Ref$ObjectRef)object).element;
                            ((Ref$ObjectRef)object).element = object2 = object2.F((Vo0)object4, object3);
                        } else {
                            n7 = ((LP1$c)object2).c & n3;
                            if (n7 != 0 && (n7 = object2 instanceof mo0_0) != 0) {
                                int n8;
                                object4 = object2;
                                object4 = ((mo0_0)object2).o;
                                int n10 = 0;
                                object3 = null;
                                while (true) {
                                    n8 = 1;
                                    if (object4 == null) break;
                                    int n14 = ((LP1$c)object4).c & n3;
                                    if (n14 != 0) {
                                        if (++n10 == n8) {
                                            object2 = object4;
                                        } else {
                                            if (wR1 == null) {
                                                n8 = 16;
                                                Object[] objectArray = new LP1$c[n8];
                                                wR1 = new WR1(objectArray);
                                            }
                                            if (object2 != null) {
                                                wR1.b(object2);
                                                n4 = 0;
                                                object2 = null;
                                            }
                                            wR1.b(object4);
                                        }
                                    }
                                    object4 = ((LP1$c)object4).f;
                                }
                                if (n10 == n8) continue;
                            }
                        }
                        object2 = go0.b(wR1);
                    }
                }
                lP1$c = lP1$c.e;
            }
            return ((Ref$ObjectRef)object).element;
        }
        return null;
    }

    public final long B0() {
        return this.z;
    }

    public final long B1(long l2, boolean bl2) {
        Qg2 qg2 = this.G;
        if (qg2 != null) {
            l2 = qg2.d(l2, false);
        }
        if (bl2 || !(bl2 = this.f)) {
            long l3 = this.z;
            float f5 = e72.d(l2);
            int n3 = 32;
            int n4 = (int)(l3 >> n3);
            float f6 = n4;
            float f7 = e72.e(l2);
            long l4 = 0xFFFFFFFFL;
            int n7 = (int)(l3 &= l4);
            float f8 = n7;
            l2 = h72.a(f5 += f6, f7 += f8);
        }
        return l2;
    }

    public final void C1(w32_0 object, float[] fArray) {
        boolean bl2 = Intrinsics.areEqual(object, this);
        if (!bl2) {
            w32_0 w32_02 = this.q;
            Intrinsics.checkNotNull(w32_02);
            w32_02.C1((w32_0)object, fArray);
            long l2 = this.z;
            long l3 = 0L;
            boolean bl3 = Si1.b(l2, l3);
            if (!bl3) {
                object = M;
                QK1.d((float[])object);
                l2 = this.z;
                int n3 = 32;
                l3 = l2 >> n3;
                int n4 = (int)l3;
                float f5 = -((float)n4);
                long l4 = 0xFFFFFFFFL;
                int n7 = (int)(l2 &= l4);
                float f6 = -((float)n7);
                QK1.i((float[])object, f5, f6);
                QK1.g(fArray, (float[])object);
            }
            if ((object = this.G) != null) {
                object.i(fArray);
            }
        }
    }

    public final void D1(w32_0 w32_02, float[] fArray) {
        boolean bl2;
        w32_0 w32_03 = this;
        while (!(bl2 = Intrinsics.areEqual(w32_03, w32_02))) {
            long l2;
            long l3;
            boolean bl3;
            Qg2 qg2 = w32_03.G;
            if (qg2 != null) {
                qg2.a(fArray);
            }
            if (!(bl3 = Si1.b(l3 = w32_03.z, l2 = 0L))) {
                float[] fArray2 = M;
                QK1.d(fArray2);
                int n3 = 32;
                long l4 = l3 >> n3;
                int n4 = (int)l4;
                float f5 = n4;
                long l7 = 0xFFFFFFFFL;
                int n7 = (int)(l3 &= l7);
                float f6 = n7;
                QK1.i(fArray2, f5, f6);
                QK1.g(fArray, fArray2);
            }
            w32_03 = w32_03.q;
            Intrinsics.checkNotNull(w32_03);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void E1(Function1 object, boolean bl2) {
        boolean bl3;
        Object object2;
        boolean bl4 = true;
        if (object != null && (object2 = this.H) != null) {
            bl3 = false;
            object2 = null;
        } else {
            bl3 = true;
        }
        if (bl3) {
            Object object3;
            boolean bl5;
            Object object4;
            object2 = this.m;
            if (!bl2 && (object4 = this.t) == object && (bl5 = Intrinsics.areEqual(object4 = this.u, object3 = ((xp1_0)object2).r)) && (object4 = this.v) == (object3 = ((xp1_0)object2).s)) {
                boolean bl6 = false;
                object4 = null;
            } else {
                boolean bl7 = true;
            }
            this.u = object3 = ((xp1_0)object2).r;
            object3 = ((xp1_0)object2).s;
            this.v = object3;
            boolean bl8 = ((xp1_0)object2).e();
            W32$h w32$h = this.E;
            if (bl8 && object != null) {
                void var2_6;
                this.t = object;
                object = this.G;
                if (object == null) {
                    object = aq1_0.a((xp1_0)object2);
                    int n3 = Rg2.a;
                    object4 = this.D;
                    object = object.e((Function2)object4, w32$h, null);
                    long l2 = this.c;
                    object.f(l2);
                    l2 = this.z;
                    object.j(l2);
                    this.G = object;
                    this.F1(bl4);
                    ((xp1_0)object2).C = bl4;
                    w32$h.invoke();
                } else if (var2_6 != false) {
                    this.F1(bl4);
                }
            } else {
                this.t = null;
                object = this.G;
                if (object != null) {
                    object.destroy();
                    ((xp1_0)object2).C = bl4;
                    w32$h.invoke();
                    object = this.j1();
                    boolean bl9 = ((LP1$c)object).m;
                    if (bl9 && (object = ((xp1_0)object2).i) != null) {
                        object.i((xp1_0)object2);
                    }
                }
                this.G = null;
                this.F = false;
            }
            return;
        }
        bh1_1.b("layerBlock can't be provided when explicitLayer is provided");
        throw null;
    }

    public final long F(zp1 zp12, long l2) {
        return this.r1(zp12, l2);
    }

    public final void F1(boolean bl2) {
        block10: {
            block9: {
                block7: {
                    block8: {
                        sg2_0 sg2_02;
                        float f5;
                        boolean bl3;
                        Object object = this.H;
                        if (object != null) {
                            return;
                        }
                        object = this.G;
                        xp1_0 xp1_02 = null;
                        if (object == null) break block7;
                        Object object2 = this.t;
                        if (object2 == null) break block8;
                        uo2_0 uo2_02 = K;
                        float f6 = 1.0f;
                        uo2_02.d(f6);
                        uo2_02.k(f6);
                        uo2_02.b(f6);
                        uo2_02.m(0.0f);
                        uo2_02.c(0.0f);
                        uo2_02.t(0.0f);
                        long l2 = b11_0.a;
                        uo2_02.q(l2);
                        uo2_02.s(l2);
                        uo2_02.g(0.0f);
                        uo2_02.h(0.0f);
                        uo2_02.j(0.0f);
                        uo2_02.f(8.0f);
                        long l3 = Oq3.b;
                        uo2_02.f0(l3);
                        Object object3 = fg2_1.a;
                        uo2_02.I0((i13)object3);
                        f6 = 0.0f;
                        uo2_02.r(false);
                        uo2_02.i();
                        uo2_02.o(0);
                        uo2_02.r = l2 = 9205357640488583168L;
                        uo2_02.u = null;
                        uo2_02.a = 0;
                        xp1_02 = this.m;
                        uo2_02.s = object3 = xp1_02.r;
                        object3 = xp1_02.s;
                        uo2_02.t = object3;
                        uo2_02.r = l3 = dj1.b(this.c);
                        object3 = aq1_0.a(xp1_02).getSnapshotObserver();
                        W32$j w32$j = new W32$j((Function1)object2);
                        object2 = I;
                        ((ch2)object3).a(this, (Function1)object2, w32$j);
                        object2 = this.C;
                        if (object2 == null) {
                            this.C = object2 = new tp1_1();
                        }
                        ((tp1_1)object2).a = f6 = uo2_02.b;
                        ((tp1_1)object2).b = f6 = uo2_02.c;
                        ((tp1_1)object2).c = f6 = uo2_02.e;
                        ((tp1_1)object2).d = f6 = uo2_02.f;
                        ((tp1_1)object2).e = f6 = uo2_02.j;
                        ((tp1_1)object2).f = f6 = uo2_02.k;
                        ((tp1_1)object2).g = f6 = uo2_02.l;
                        ((tp1_1)object2).h = f6 = uo2_02.m;
                        ((tp1_1)object2).i = l3 = uo2_02.n;
                        object.c(uo2_02);
                        this.s = bl3 = uo2_02.p;
                        this.w = f5 = uo2_02.d;
                        if (bl2 && (sg2_02 = xp1_02.i) != null) {
                            sg2_02.i(xp1_02);
                        }
                        break block9;
                    }
                    bh1_1.d("updateLayerParameters requires a non-null layerBlock");
                    throw null;
                }
                Function1 function1 = this.t;
                if (function1 != null) break block10;
            }
            return;
        }
        bh1_1.c("null layer with a non-null layerBlock");
        throw null;
    }

    public final aG2 G(zp1 object, boolean bl2) {
        Object object2 = this.j1();
        boolean bl3 = ((LP1$c)object2).m;
        float f5 = 0.0f;
        w32_0 w32_02 = null;
        if (bl3) {
            bl3 = object.e();
            if (bl3) {
                float f6;
                object2 = w32_0.A1((zp1)object);
                ((w32_0)object2).s1();
                w32_02 = this.f1((w32_0)object2);
                MR1 mR1 = this.B;
                float f7 = 0.0f;
                if (mR1 == null) {
                    mR1 = new Object();
                    mR1.a = 0.0f;
                    mR1.b = 0.0f;
                    mR1.c = 0.0f;
                    mR1.d = 0.0f;
                    this.B = mR1;
                }
                mR1.a = 0.0f;
                mR1.b = 0.0f;
                long l2 = object.a();
                int n3 = 32;
                int n4 = (int)(l2 >> n3);
                mR1.c = f7 = (float)n4;
                l2 = object.a();
                long l3 = 0xFFFFFFFFL;
                int n7 = (int)(l2 &= l3);
                mR1.d = f6 = (float)n7;
                while (object2 != w32_02) {
                    f6 = 0.0f;
                    object = null;
                    ((w32_0)object2).x1(mR1, bl2, false);
                    n7 = (int)(mR1.b() ? 1 : 0);
                    if (n7 != 0) {
                        return aG2.e;
                    }
                    object2 = ((w32_0)object2).q;
                    Intrinsics.checkNotNull(object2);
                }
                this.L0(w32_02, mR1, bl2);
                float f8 = mR1.a;
                float f11 = mR1.b;
                f5 = mR1.c;
                float f12 = mR1.d;
                object = new aG2(f8, f11, f5, f12);
                return object;
            }
            StringBuilder stringBuilder = new StringBuilder("LayoutCoordinates ");
            stringBuilder.append(object);
            stringBuilder.append(" is not attached!");
            bh1_1.c(stringBuilder.toString());
            throw null;
        }
        bh1_1.c("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final void G0() {
        W01 w01 = this.H;
        if (w01 != null) {
            long l2 = this.z;
            float f5 = this.A;
            this.j0(l2, f5, w01);
        } else {
            long l3 = this.z;
            float f6 = this.A;
            Function1 function1 = this.t;
            this.k0(l3, f6, function1);
        }
    }

    public final float H0() {
        return this.m.r.H0();
    }

    public final long J(long l2) {
        l2 = this.a0(l2);
        return aq1_0.a(this.m).c(l2);
    }

    public final void L(float[] fArray) {
        sg2_0 sg2_02 = aq1_0.a(this.m);
        w32_0 w32_02 = w32_0.A1(ap1_0.d(this));
        this.D1(w32_02, fArray);
        sg2_02.f(fArray);
    }

    public final void L0(w32_0 w32_02, MR1 mR1, boolean bl2) {
        if (w32_02 == this) {
            return;
        }
        Object object = this.q;
        if (object != null) {
            ((w32_0)object).L0(w32_02, mR1, bl2);
        }
        long l2 = this.z;
        int n3 = 32;
        float f5 = 4.5E-44f;
        int n4 = (int)(l2 >> n3);
        float f6 = mR1.a;
        float f7 = n4;
        mR1.a = f6 -= f7;
        mR1.c = f6 = mR1.c - f7;
        long l3 = 0xFFFFFFFFL;
        int n7 = (int)(l2 &= l3);
        float f8 = mR1.b;
        float f11 = n7;
        mR1.b = f8 -= f11;
        mR1.d = f8 = mR1.d - f11;
        object = this.G;
        if (object != null) {
            boolean bl3 = true;
            f11 = Float.MIN_VALUE;
            object.b(mR1, bl3);
            boolean bl4 = this.s;
            if (bl4 && bl2) {
                l2 = this.c;
                long l4 = l2 >> n3;
                n3 = (int)l4;
                f5 = n3;
                int n8 = (int)(l2 &= l3);
                float f12 = n8;
                bl4 = false;
                f8 = 0.0f;
                object = null;
                mR1.a(0.0f, 0.0f, f5, f12);
            }
        }
    }

    public final long P0(w32_0 w32_02, long l2) {
        boolean bl2;
        if (w32_02 == this) {
            return l2;
        }
        w32_0 w32_03 = this.q;
        boolean bl3 = true;
        if (w32_03 != null && !(bl2 = Intrinsics.areEqual(w32_02, w32_03))) {
            long l3 = w32_03.P0(w32_02, l2);
            return this.g1(l3, bl3);
        }
        return this.g1(l2, bl3);
    }

    public final long R0(long l2) {
        float f5 = C63.d(l2);
        float f6 = this.c0();
        f5 -= f6;
        float f7 = C63.b(l2);
        float f8 = (int)(this.c & 0xFFFFFFFFL);
        f7 -= f8;
        f8 = 2.0f;
        f5 /= f8;
        f5 = Math.max(0.0f, f5);
        f7 /= f8;
        f7 = Math.max(0.0f, f7);
        return bo1_1.a(f5, f7);
    }

    public final zp1 S() {
        LP1$c lP1$c = this.j1();
        boolean bl2 = lP1$c.m;
        if (bl2) {
            this.s1();
            return this.m.y.c.q;
        }
        bh1_1.c("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final float W0(long l2, long l3) {
        float f5;
        float f6;
        float f7;
        float f8;
        long l4;
        int n3;
        float f11;
        float f12 = this.c0();
        float f14 = C63.d(l3);
        long l7 = 0xFFFFFFFFL;
        float f15 = 1.0f / 0.0f;
        Object object = f12 == f14 ? 0 : (f12 > f14 ? 1 : -1);
        if (object >= 0 && (object = (f11 = (f12 = (float)(n3 = (int)(l4 = this.c & l7))) - (f14 = C63.b(l3))) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) >= 0) {
            return f15;
        }
        l3 = this.R0(l3);
        f12 = C63.d(l3);
        float f16 = C63.b(l3);
        float f17 = e72.d(l2);
        n3 = 0;
        f14 = 0.0f;
        float f18 = f17 - 0.0f;
        Object object2 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
        if (object2 < 0) {
            f17 = -f17;
        } else {
            object2 = this.c0();
            float f19 = object2;
            f17 -= f19;
        }
        f17 = Math.max(0.0f, f17);
        float f20 = e72.e(l2);
        float f22 = f20 - 0.0f;
        float f23 = f22 == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1);
        if (f23 < 0) {
            f20 = -f20;
        } else {
            long l8 = this.c & l7;
            f23 = (int)l8;
            float f24 = f23;
            f20 -= f24;
        }
        f20 = Math.max(0.0f, f20);
        l2 = h72.a(f17, f20);
        float f25 = f12 - 0.0f;
        float f26 = f25 == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1);
        if ((f26 > 0 || (f26 = (f8 = f16 - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) > 0) && (f26 = (f7 = (f17 = e72.d(l2)) - f12) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) <= 0 && (f6 = (f5 = (f17 = e72.e(l2)) - f16) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) <= 0) {
            f6 = 32;
            l3 = l2 >> f6;
            f26 = (int)l3;
            f16 = Float.intBitsToFloat((int)f26);
            f23 = (int)(l2 &= l7);
            f20 = Float.intBitsToFloat((int)f23);
            f16 *= f16;
            f20 *= f20;
            f15 = f20 + f16;
        }
        return f15;
    }

    public final void Y0(iL iL2, W01 w01) {
        Qg2 qg2 = this.G;
        if (qg2 != null) {
            qg2.g(iL2, w01);
        } else {
            long l2 = this.z;
            int n3 = 32;
            long l3 = l2 >> n3;
            int n4 = (int)l3;
            float f5 = n4;
            long l4 = 0xFFFFFFFFL;
            int n7 = (int)(l2 &= l4);
            float f6 = n7;
            iL2.g(f5, f6);
            this.b1(iL2, w01);
            float f7 = -f5;
            f6 = -f6;
            iL2.g(f7, f6);
        }
    }

    public final long a() {
        return this.c;
    }

    public final long a0(long l2) {
        Object object = this.j1();
        boolean bl2 = ((LP1$c)object).m;
        if (bl2) {
            this.s1();
            object = this;
            while (object != null) {
                boolean bl3 = true;
                l2 = ((w32_0)object).B1(l2, bl3);
                object = ((w32_0)object).q;
            }
            return l2;
        }
        bh1_1.c("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final void a1(iL iL2, ei ei2) {
        long l2 = this.c;
        float f5 = (int)(l2 >> 32);
        float f6 = 0.5f;
        float f7 = (float)((int)(l2 & 0xFFFFFFFFL)) - f6;
        aG2 aG22 = new aG2(f6, f6, f5 -= f6, f7);
        iL2.c(aG22, ei2);
    }

    public final void b1(iL iL2, W01 w01) {
        int n3 = 4;
        Object object = this.k1(n3);
        if (object == null) {
            this.v1(iL2, w01);
        } else {
            Object object2 = this.m;
            object2.getClass();
            object2 = aq1_0.a((xp1_0)object2);
            zp1_2 zp1_22 = object2.getSharedDrawScope();
            long l2 = this.c;
            long l3 = dj1.b(l2);
            zp1_22.getClass();
            WR1 wR1 = null;
            while (object != null) {
                int n4 = object instanceof it0_0;
                if (n4 != 0) {
                    fo0 fo02 = object;
                    fo02 = (it0_0)object;
                    object = zp1_22;
                    object2 = iL2;
                    zp1_22.e(iL2, l3, this, (it0_0)fo02, w01);
                } else {
                    n4 = ((LP1$c)object).c & n3;
                    if (n4 != 0 && (n4 = object instanceof mo0_0) != 0) {
                        int n7;
                        object2 = object;
                        object2 = ((mo0_0)object).o;
                        int n8 = 0;
                        while (true) {
                            n7 = 1;
                            if (object2 == null) break;
                            int n10 = ((LP1$c)object2).c & n3;
                            if (n10 != 0) {
                                if (++n8 == n7) {
                                    object = object2;
                                } else {
                                    if (wR1 == null) {
                                        n7 = 16;
                                        Object[] objectArray = new LP1$c[n7];
                                        wR1 = new WR1(objectArray);
                                    }
                                    if (object != null) {
                                        wR1.b(object);
                                        object = null;
                                    }
                                    wR1.b(object2);
                                }
                            }
                            object2 = ((LP1$c)object2).f;
                        }
                        if (n8 == n7) continue;
                    }
                }
                object = go0.b(wR1);
            }
        }
    }

    public abstract void c1();

    public final boolean e() {
        return this.j1().m;
    }

    public final w32_0 f1(w32_0 object) {
        int n3;
        int n4;
        int n7;
        Object object2 = ((w32_0)object).m;
        Object object3 = this.m;
        if (object2 == object3) {
            object2 = ((w32_0)object).j1();
            object3 = this.j1().a;
            int n8 = ((LP1$c)object3).m;
            if (n8 != 0) {
                object3 = ((LP1$c)object3).e;
                while (object3 != null) {
                    n8 = ((LP1$c)object3).c & 2;
                    if (n8 != 0 && object3 == object2) {
                        return object;
                    }
                    object3 = ((LP1$c)object3).e;
                }
                return this;
            }
            bh1_1.c("visitLocalAncestors called on an unattached node");
            throw null;
        }
        while ((n7 = ((xp1_0)object2).k) > (n4 = ((xp1_0)object3).k)) {
            object2 = ((xp1_0)object2).A();
            Intrinsics.checkNotNull(object2);
        }
        Object object4 = object3;
        while ((n4 = ((xp1_0)object4).k) > (n3 = ((xp1_0)object2).k)) {
            object4 = ((xp1_0)object4).A();
            Intrinsics.checkNotNull(object4);
        }
        while (object2 != object4) {
            object2 = ((xp1_0)object2).A();
            object4 = ((xp1_0)object4).A();
            if (object2 != null && object4 != null) continue;
            object = new IllegalArgumentException("layouts are not part of the same hierarchy");
            throw object;
        }
        if (object4 == object3) {
            object = this;
        } else {
            object3 = ((w32_0)object).m;
            if (object2 != object3) {
                object = ((xp1_0)object2).y.b;
            }
        }
        return object;
    }

    public final long g1(long l2, boolean bl2) {
        if (bl2 || !(bl2 = this.f)) {
            long l3 = this.z;
            float f5 = e72.d(l2);
            int n3 = 32;
            int n4 = (int)(l3 >> n3);
            float f6 = n4;
            float f7 = e72.e(l2);
            long l4 = 0xFFFFFFFFL;
            int n7 = (int)(l3 &= l4);
            float f8 = n7;
            l2 = h72.a(f5 -= f6, f7 -= f8);
        }
        Qg2 qg2 = this.G;
        if (qg2 != null) {
            boolean bl3 = true;
            l2 = qg2.d(l2, bl3);
        }
        return l2;
    }

    public final float getDensity() {
        return this.m.r.getDensity();
    }

    public final bp1_0 getLayoutDirection() {
        return this.m.s;
    }

    public abstract xb1_0 h1();

    public final long i1() {
        Vo0 vo0 = this.u;
        long l2 = this.m.t.d();
        return vo0.Z0(l2);
    }

    public void j0(long l2, float f5, W01 w01) {
        boolean bl2 = this.n;
        if (bl2) {
            xb1_0 xb1_02 = this.h1();
            Intrinsics.checkNotNull(xb1_02);
            long l3 = xb1_02.n;
            this.w1(l3, f5, null, w01);
        } else {
            this.w1(l2, f5, null, w01);
        }
    }

    public abstract LP1$c j1();

    public void k0(long l2, float f5, Function1 function1) {
        boolean bl2 = this.n;
        if (bl2) {
            tb1_0 tb1_02 = this.h1();
            Intrinsics.checkNotNull(tb1_02);
            long l3 = tb1_02.n;
            tb1_02 = this;
            this.w1(l3, f5, function1, null);
        } else {
            w32_0 w32_02 = this;
            long l4 = l2;
            this.w1(l2, f5, function1, null);
        }
    }

    public final LP1$c k1(int n3) {
        boolean bl2 = c42_0.h(n3);
        LP1$c lP1$c = this.j1();
        if (bl2 || (lP1$c = lP1$c.e) != null) {
            int n4;
            LP1$c lP1$c2 = this.l1(bl2);
            while (lP1$c2 != null && (n4 = lP1$c2.d & n3) != 0) {
                n4 = lP1$c2.c & n3;
                if (n4 != 0) {
                    return lP1$c2;
                }
                if (lP1$c2 == lP1$c) break;
                lP1$c2 = lP1$c2.f;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final LP1$c l1(boolean bl2) {
        Object object;
        T32 t32 = this.m.y;
        w32_0 w32_02 = t32.c;
        if (w32_02 == this) {
            return t32.e;
        }
        t32 = null;
        if (bl2) {
            object = this.q;
            if (object == null) return null;
            if ((object = ((w32_0)object).j1()) == null) return null;
            return ((LP1$c)object).f;
        }
        object = this.q;
        if (object == null) return null;
        return ((w32_0)object).j1();
    }

    public final void m1(LP1$c lP1$c, W32$e w32$e, long l2, C61 c61, boolean n3, boolean n4) {
        block20: {
            C61 c612 = c61;
            if (lP1$c == null) {
                w32_0 w32_02 = this;
                int n7 = n4;
                this.o1(w32$e, l2, c61, n3 != 0, n4 != 0);
            } else {
                W32$g w32$g;
                Object object = w32$g;
                Object object2 = w32$e;
                Object object3 = c61;
                int n8 = n3;
                int n10 = n4;
                w32$g = new W32$g(this, lP1$c, w32$e, l2, c61, n3 != 0, n4 != 0);
                float f5 = -1.0f;
                int n14 = n4;
                c61.c(lP1$c, f5, n4 != 0, w32$g);
                object = lP1$c.h;
                if (object != null) {
                    int n15;
                    n14 = 16;
                    boolean bl2 = c42_0.h(n14);
                    object = ((w32_0)object).l1(bl2);
                    bl2 = false;
                    if (object != null && (n15 = ((LP1$c)object).m) != 0) {
                        object = ((LP1$c)object).a;
                        n15 = ((LP1$c)object).m;
                        if (n15 != 0) {
                            n15 = ((LP1$c)object).d & n14;
                            if (n15 != 0) {
                                while (object != null) {
                                    n15 = ((LP1$c)object).c & n14;
                                    if (n15 != 0) {
                                        object2 = object;
                                        WR1 wR1 = null;
                                        while (object2 != null) {
                                            int n16 = object2 instanceof gw2_0;
                                            if (n16 != 0) {
                                                n15 = (int)((object2 = (gw2_0)object2).Y0() ? 1 : 0);
                                                if (n15 != 0) {
                                                    break block20;
                                                }
                                            } else {
                                                n16 = ((LP1$c)object2).c & n14;
                                                if (n16 != 0 && (n16 = object2 instanceof mo0_0) != 0) {
                                                    object3 = object2;
                                                    object3 = ((mo0_0)object2).o;
                                                    n8 = 0;
                                                    while (true) {
                                                        n10 = 1;
                                                        if (object3 == null) break;
                                                        int n17 = ((LP1$c)object3).c & n14;
                                                        if (n17 != 0) {
                                                            if (++n8 == n10) {
                                                                object2 = object3;
                                                            } else {
                                                                if (wR1 == null) {
                                                                    Object[] objectArray = new LP1$c[n14];
                                                                    wR1 = new WR1(objectArray);
                                                                }
                                                                if (object2 != null) {
                                                                    wR1.b(object2);
                                                                    n15 = 0;
                                                                    object2 = null;
                                                                }
                                                                wR1.b(object3);
                                                            }
                                                        }
                                                        object3 = ((LP1$c)object3).f;
                                                    }
                                                    if (n8 == n10) continue;
                                                }
                                            }
                                            object2 = go0.b(wR1);
                                        }
                                    }
                                    object = ((LP1$c)object).f;
                                }
                            }
                        } else {
                            bh1_1.c("visitLocalDescendants called on an unattached node");
                            throw null;
                        }
                    }
                    c612.e = false;
                }
            }
        }
    }

    public final long n(long l2) {
        Object object = this.j1();
        boolean bl2 = ((LP1$c)object).m;
        if (bl2) {
            l2 = aq1_0.a(this.m).n(l2);
            object = ap1_0.d(this);
            return this.r1((zp1)object, l2);
        }
        bh1_1.c("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void n1(W32$e w32$e, long l2, C61 c61, boolean bl2, boolean bl3) {
        float f5;
        Object object;
        LP1$c lP1$c;
        block11: {
            y32_0 y32_02;
            boolean bl4;
            C61 c612;
            long l3;
            block12: {
                long l4;
                long l7;
                float f6;
                float f7;
                int n3;
                w32_0 w32_02 = this;
                l3 = l2;
                c612 = c61;
                bl4 = bl3;
                int n4 = w32$e.b();
                lP1$c = this.k1(n4);
                n4 = (int)(h72.b(l2) ? 1 : 0);
                if (n4 == 0 || (object = this.G) != null && (n3 = this.s) != 0 && (n4 = (int)(object.h(l2) ? 1 : 0)) == 0) {
                    y32_0 y32_03;
                    long l8;
                    if (!bl2) return;
                    long l12 = this.i1();
                    float f8 = w32_02.W0(l3, l12);
                    n4 = (int)(Float.isInfinite(f8) ? 1 : 0);
                    if (n4 != 0) return;
                    n4 = (int)(Float.isNaN(f8) ? 1 : 0);
                    if (n4 != 0) return;
                    n4 = c612.c;
                    n3 = xx_2.h(c61);
                    if (n4 != n3) {
                        float f11 = 0.0f;
                        object = null;
                        l12 = D61.a(f8, false);
                        l8 = c61.a();
                        n4 = pr0_0.b(l8, l12);
                        if (n4 <= 0) return;
                    }
                    float f12 = 0.0f;
                    if (lP1$c == null) {
                        object = this;
                        l8 = l2;
                        this.o1(w32$e, l2, c61, bl2, false);
                        return;
                    }
                    object = y32_03;
                    l3 = l2;
                    y32_03 = new y32_0(this, lP1$c, w32$e, l2, c61, bl2, false, f8);
                    c612.c(lP1$c, f8, false, y32_03);
                    return;
                }
                if (lP1$c == null) {
                    this.o1(w32$e, l2, c61, bl2, bl3);
                    return;
                }
                float f14 = e72.d(l2);
                float f15 = e72.e(l2);
                int n7 = 0;
                float f16 = 0.0f;
                float f17 = f14 - 0.0f;
                Object object2 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                if (object2 >= 0 && (n7 = (f7 = f15 - 0.0f) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) >= 0 && (n4 = (int)((f6 = f14 - (f16 = (float)(n7 = this.c0()))) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1))) < 0) {
                    l7 = w32_02.c;
                    long l14 = 0xFFFFFFFFL;
                    f14 = (int)(l7 &= l14);
                    float f18 = f15 - f14;
                    n4 = (int)(f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1));
                    if (n4 < 0) {
                        object = this;
                        this.m1(lP1$c, w32$e, l2, c61, bl2, bl3);
                        return;
                    }
                }
                if (!bl2) {
                    n4 = 2139095040;
                    f14 = 1.0f / 0.0f;
                    f5 = 1.0f / 0.0f;
                } else {
                    l4 = this.i1();
                    f5 = f14 = w32_02.W0(l3, l4);
                }
                n4 = (int)(Float.isInfinite(f5) ? 1 : 0);
                if (n4 != 0 || (n4 = (int)(Float.isNaN(f5) ? 1 : 0)) != 0) break block11;
                n4 = c612.c;
                n3 = xx_2.h(c61);
                if (n4 == n3) break block12;
                l4 = D61.a(f5, bl4);
                l7 = c61.a();
                n4 = pr0_0.b(l7, l4);
                if (n4 <= 0) break block11;
            }
            object = y32_02;
            l3 = l2;
            y32_02 = new y32_0(this, lP1$c, w32$e, l2, c61, bl2, bl3, f5);
            c612.c(lP1$c, f5, bl4, y32_02);
            return;
        }
        object = this;
        this.z1(lP1$c, w32$e, l2, c61, bl2, bl3, f5);
    }

    public void o1(W32$e w32$e, long l2, C61 c61, boolean bl2, boolean bl3) {
        w32_0 w32_02 = this.p;
        if (w32_02 != null) {
            boolean bl4 = true;
            long l3 = w32_02.g1(l2, bl4);
            w32_02.n1(w32$e, l3, c61, bl2, bl3);
        }
    }

    public final void p1() {
        Object object = this.G;
        if (object != null) {
            object.invalidate();
        } else {
            object = this.q;
            if (object != null) {
                ((w32_0)object).p1();
            }
        }
    }

    public final boolean q1() {
        float f5;
        float f6;
        float f7;
        Object object = this.G;
        if (object != null && (f7 = (f6 = (f5 = this.w) - 0.0f) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) <= 0) {
            return true;
        }
        object = this.q;
        if (object != null) {
            return ((w32_0)object).q1();
        }
        return false;
    }

    public final tb1_0 r0() {
        return this.p;
    }

    public final long r1(zp1 zp12, long l2) {
        boolean bl2 = zp12 instanceof yb1_0;
        if (bl2) {
            zp1 zp13 = zp12;
            ((yb1_0)zp12).a.m.s1();
            long l3 = -9223372034707292160L;
            return ((yb1_0)zp12).c(this, l2 ^= l3) ^ l3;
        }
        zp12 = w32_0.A1(zp12);
        ((w32_0)zp12).s1();
        w32_0 w32_02 = this.f1((w32_0)zp12);
        while (zp12 != w32_02) {
            boolean bl3 = true;
            l2 = ((w32_0)zp12).B1(l2, bl3);
            zp12 = ((w32_0)zp12).q;
            Intrinsics.checkNotNull(zp12);
        }
        return this.P0(w32_02, l2);
    }

    public final boolean s0() {
        boolean bl2;
        Object object = this.G;
        if (object != null && !(bl2 = this.r) && (bl2 = ((xp1_0)(object = this.m)).e())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final void s1() {
        bq1 bq12 = this.m.z;
        Object object = bq12.a.z.c;
        Object object2 = Xp1$d.LayingOut;
        boolean bl2 = true;
        if (object == object2 || object == (object2 = Xp1$d.LookaheadLayingOut)) {
            object2 = bq12.r;
            boolean bl3 = ((bq1$b)object2).x;
            if (bl3) {
                bq12.e(bl2);
            } else {
                bq12.d(bl2);
            }
        }
        if (object == (object2 = Xp1$d.LookaheadLayingOut)) {
            boolean bl4;
            object = bq12.s;
            if (object != null && (bl4 = ((bq1$a_0)object).u) == bl2) {
                bq12.g(bl2);
            } else {
                bq12.f(bl2);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void t1() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 97->101)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final zp1 u0() {
        return this;
    }

    public final void u1() {
        int n3 = 128;
        boolean bl2 = c42_0.h(n3);
        LP1$c lP1$c = this.j1();
        if (bl2 || (lP1$c = lP1$c.e) != null) {
            int n4;
            LP1$c lP1$c2 = this.l1(bl2);
            while (lP1$c2 != null && (n4 = lP1$c2.d & n3) != 0) {
                n4 = lP1$c2.c & n3;
                if (n4 != 0) {
                    n4 = 0;
                    fo0 fo02 = lP1$c2;
                    WR1 wR1 = null;
                    while (fo02 != null) {
                        int n7 = fo02 instanceof xp1_1;
                        if (n7 != 0) {
                            fo02 = (xp1_1)fo02;
                            fo02.o0(this);
                        } else {
                            n7 = ((LP1$c)fo02).c & n3;
                            if (n7 != 0 && (n7 = fo02 instanceof mo0_0) != 0) {
                                int n8;
                                fo0 fo03 = fo02;
                                fo03 = ((mo0_0)fo02).o;
                                int n10 = 0;
                                while (true) {
                                    n8 = 1;
                                    if (fo03 == null) break;
                                    int n14 = ((LP1$c)fo03).c & n3;
                                    if (n14 != 0) {
                                        if (++n10 == n8) {
                                            fo02 = fo03;
                                        } else {
                                            if (wR1 == null) {
                                                n8 = 16;
                                                Object[] objectArray = new LP1$c[n8];
                                                wR1 = new WR1(objectArray);
                                            }
                                            if (fo02 != null) {
                                                wR1.b(fo02);
                                                fo02 = null;
                                            }
                                            wR1.b(fo03);
                                        }
                                    }
                                    fo03 = ((LP1$c)fo03).f;
                                }
                                if (n10 == n8) continue;
                            }
                        }
                        fo02 = go0.b(wR1);
                    }
                }
                if (lP1$c2 == lP1$c) break;
                lP1$c2 = lP1$c2.f;
            }
        }
    }

    public void v1(iL iL2, W01 w01) {
        w32_0 w32_02 = this.p;
        if (w32_02 != null) {
            w32_02.Y0(iL2, w01);
        }
    }

    public final boolean w0() {
        boolean bl2;
        bl1_0 bl1_02 = this.x;
        if (bl1_02 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            bl1_02 = null;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w1(long l2, float f5, Function1 object, W01 w01) {
        Object object2;
        long l3;
        boolean bl2;
        W32$f w32$f = null;
        xp1_0 xp1_02 = this.m;
        W32$h w32$h = null;
        if (w01 != null) {
            if (object != null) {
                bh1_1.b("both ways to create layers shouldn't be used together");
                throw null;
            }
            object = this.H;
            if (object != w01) {
                this.H = null;
                this.E1(null, false);
                this.H = w01;
            }
            if ((object = this.G) == null) {
                object = aq1_0.a(xp1_02);
                w32$f = this.D;
                w32$h = this.E;
                object = object.e(w32$f, w32$h, w01);
                long l4 = this.c;
                object.f(l4);
                object.j(l2);
                this.G = object;
                xp1_02.C = bl2 = true;
                w32$h.invoke();
            }
        } else {
            w01 = this.H;
            if (w01 != null) {
                this.H = null;
                this.E1(null, false);
            }
            this.E1((Function1)object, false);
        }
        if (!(bl2 = Si1.b(l3 = this.z, l2))) {
            this.z = l2;
            xp1_02.z.r.u0();
            object = this.G;
            if (object != null) {
                object.j(l2);
            } else {
                object2 = this.q;
                if (object2 != null) {
                    ((w32_0)object2).p1();
                }
            }
            tb1_0.C0(this);
            object2 = xp1_02.i;
            if (object2 != null) {
                object2.i(xp1_02);
            }
        }
        this.A = f5;
        boolean bl3 = this.h;
        if (!bl3) {
            object2 = this.z0();
            Ps2 ps2 = new Ps2((bl1_0)object2, this);
            this.q0(ps2);
        }
    }

    public final void x1(MR1 mR1, boolean bl2, boolean bl3) {
        float f5;
        float f6;
        long l2;
        Qg2 qg2 = this.G;
        long l3 = 0xFFFFFFFFL;
        int n3 = 32;
        float f7 = 4.5E-44f;
        if (qg2 != null) {
            int n4 = this.s;
            if (n4 != 0) {
                if (bl3) {
                    l2 = this.i1();
                    float f8 = C63.d(l2);
                    int n7 = 0x40000000;
                    float f11 = 2.0f;
                    f6 = C63.b(l2) / f11;
                    f5 = -(f8 /= f11);
                    f11 = -f6;
                    long l4 = this.c;
                    long l7 = l4 >> n3;
                    int n8 = (int)l7;
                    float f12 = (float)n8 + f8;
                    n4 = (int)(l4 &= l3);
                    f8 = (float)n4 + f6;
                    mR1.a(f5, f11, f12, f8);
                } else if (bl2) {
                    l2 = this.c;
                    long l8 = l2 >> n3;
                    int n10 = (int)l8;
                    float f14 = n10;
                    f6 = (int)(l2 &= l3);
                    boolean bl4 = false;
                    f5 = 0.0f;
                    mR1.a(0.0f, 0.0f, f14, f6);
                }
                bl2 = mR1.b();
                if (bl2) {
                    return;
                }
            }
            bl2 = false;
            f6 = 0.0f;
            qg2.b(mR1, false);
        }
        l2 = this.z;
        int n14 = (int)(l2 >> n3);
        f7 = mR1.a;
        float f15 = n14;
        mR1.a = f7 += f15;
        mR1.c = f7 = mR1.c + f15;
        int n15 = (int)(l2 & l3);
        f6 = mR1.b;
        f5 = n15;
        mR1.b = f6 += f5;
        mR1.d = f6 = mR1.d + f5;
    }

    public final void y(zp1 zp12, float[] fArray) {
        zp12 = w32_0.A1(zp12);
        ((w32_0)zp12).s1();
        w32_0 w32_02 = this.f1((w32_0)zp12);
        QK1.d(fArray);
        ((w32_0)zp12).D1(w32_02, fArray);
        this.C1(w32_02, fArray);
    }

    public final xp1_0 y0() {
        return this.m;
    }

    public final void y1(bl1_0 object) {
        Object object2 = this.x;
        if (object != object2) {
            LinkedHashMap linkedHashMap;
            int n3;
            int n4;
            int n7;
            this.x = object;
            xp1_0 xp1_02 = this.m;
            int n8 = 1;
            if (object2 == null || (n7 = object.getWidth()) != (n4 = object2.getWidth()) || (n7 = object.getHeight()) != (n3 = object2.getHeight())) {
                n3 = object.getWidth();
                n7 = object.getHeight();
                Object object3 = this.G;
                if (object3 != null) {
                    long l2 = dj1.a(n3, n7);
                    object3.f(l2);
                } else {
                    n4 = (int)(xp1_02.L() ? 1 : 0);
                    if (n4 != 0 && (object3 = this.q) != null) {
                        ((w32_0)object3).p1();
                    }
                }
                long l3 = dj1.a(n3, n7);
                this.m0(l3);
                object2 = this.t;
                n7 = 0;
                if (object2 != null) {
                    this.F1(false);
                }
                n3 = 4;
                n4 = (int)(c42_0.h(n3) ? 1 : 0);
                LP1$c lP1$c = this.j1();
                if (n4 != 0 || (lP1$c = lP1$c.e) != null) {
                    int n10;
                    object3 = this.l1(n4 != 0);
                    while (object3 != null && (n10 = ((LP1$c)object3).d & n3) != 0) {
                        n10 = ((LP1$c)object3).c & n3;
                        if (n10 != 0) {
                            n10 = 0;
                            Object object4 = object3;
                            WR1 wR1 = null;
                            while (object4 != null) {
                                int n14 = object4 instanceof it0_0;
                                if (n14 != 0) {
                                    object4 = (it0_0)object4;
                                    object4.C0();
                                } else {
                                    n14 = ((LP1$c)object4).c & n3;
                                    if (n14 != 0 && (n14 = object4 instanceof mo0_0) != 0) {
                                        Object object5 = object4;
                                        object5 = ((mo0_0)object4).o;
                                        int n15 = 0;
                                        while (object5 != null) {
                                            int n16 = ((LP1$c)object5).c & n3;
                                            if (n16 != 0) {
                                                if (++n15 == n8) {
                                                    object4 = object5;
                                                } else {
                                                    if (wR1 == null) {
                                                        n16 = 16;
                                                        Object[] objectArray = new LP1$c[n16];
                                                        wR1 = new WR1(objectArray);
                                                    }
                                                    if (object4 != null) {
                                                        wR1.b(object4);
                                                        object4 = null;
                                                    }
                                                    wR1.b(object5);
                                                }
                                            }
                                            object5 = ((LP1$c)object5).f;
                                        }
                                        if (n15 == n8) continue;
                                    }
                                }
                                object4 = go0.b(wR1);
                            }
                        }
                        if (object3 == lP1$c) break;
                        object3 = ((LP1$c)object3).f;
                    }
                }
                object2 = xp1_02.i;
                if (object2 != null) {
                    object2.i(xp1_02);
                }
            }
            if (((object2 = this.y) != null && (n3 = (int)(object2.isEmpty() ? 1 : 0)) == 0 || (n3 = (object2 = object.p()).isEmpty() ^ n8) != 0) && (n3 = (int)(Intrinsics.areEqual(object2 = object.p(), linkedHashMap = this.y) ? 1 : 0)) == 0) {
                xp1_02.z.r.u.g();
                object2 = this.y;
                if (object2 == null) {
                    this.y = object2 = new Object();
                }
                object2.clear();
                object = object.p();
                object2.putAll(object);
            }
        }
    }

    public final bl1_0 z0() {
        Object object = this.x;
        if (object != null) {
            return object;
        }
        String string2 = "Asking for measurement result of unmeasured layout modifier".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final void z1(LP1$c lP1$c, W32$e objectArray, long l2, C61 c61, boolean bl2, boolean bl3, float f5) {
        C61 c612 = c61;
        if (lP1$c == null) {
            Object[] objectArray2 = objectArray;
            this.o1((W32$e)objectArray, l2, c61, bl2, bl3);
        } else {
            Object[] objectArray3 = objectArray;
            int n3 = objectArray.a(lP1$c);
            if (n3 != 0) {
                w32_0 w32_02 = this;
                W32$i w32$i = new W32$i(this, lP1$c, (W32$e)objectArray, l2, c61, bl2, bl3, f5);
                n3 = c61.c;
                int n4 = xx_2.h(c61);
                if (n3 == n4) {
                    c61.c(lP1$c, f5, bl3, w32$i);
                    n3 = c61.c + 1;
                    n4 = xx_2.h(c61);
                    if (n3 == n4) {
                        c61.d();
                    }
                } else {
                    long l3;
                    int n7;
                    long l4 = c61.a();
                    int n8 = c61.c;
                    c61.c = n7 = xx_2.h(c61);
                    c61.c(lP1$c, f5, bl3, w32$i);
                    n7 = c61.c + 1;
                    int n10 = xx_2.h(c61);
                    if (n7 < n10 && (n3 = pr0_0.b(l4, l3 = c61.a())) > 0) {
                        n3 = c61.c + 1;
                        n4 = n8 + 1;
                        objectArray3 = c61.a;
                        n10 = c61.d;
                        rp_1.i(objectArray3, n4, objectArray3, n3, n10);
                        objectArray3 = c61.b;
                        n10 = c61.d;
                        Intrinsics.checkNotNullParameter(objectArray3, "<this>");
                        String string2 = "destination";
                        Intrinsics.checkNotNullParameter(objectArray3, string2);
                        System.arraycopy(objectArray3, n3, objectArray3, n4, n10 -= n3);
                        n3 = c61.d + n8;
                        n4 = c61.c;
                        c61.c = n3 = n3 - n4 + -1;
                    }
                    c61.d();
                    c612.c = n8;
                }
            } else {
                n3 = objectArray.b();
                LP1$c lP1$c2 = Z32.a(lP1$c, n3);
                long l7 = l2;
                C61 c613 = c61;
                this.z1(lP1$c2, (W32$e)objectArray, l2, c61, bl2, bl3, f5);
            }
        }
    }
}

