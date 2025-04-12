/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class bq1$b
extends Ns2
implements xk1_0,
Tc,
rq1_1 {
    public boolean A;
    public Function1 B;
    public W01 C;
    public long D;
    public float E;
    public final bq1$b$c F;
    public boolean G;
    public final /* synthetic */ bq1 H;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public Xp1$f k;
    public boolean l;
    public long m;
    public Function1 n;
    public W01 o;
    public float p;
    public boolean q;
    public Object r;
    public boolean s;
    public boolean t;
    public final yp1_1 u;
    public final WR1 v;
    public boolean w;
    public boolean x;
    public final bq1$b$b y;
    public float z;

    public bq1$b(bq1 bq12) {
        bq1$b$b bq1$b$b;
        Object object;
        boolean bl2;
        long l2;
        Object object2;
        int n3;
        this.H = bq12;
        this.g = n3 = -1 >>> 1;
        this.h = n3;
        this.k = object2 = Xp1$f.NotUsed;
        this.m = l2 = 0L;
        this.q = bl2 = true;
        super(this);
        this.u = object;
        Object[] objectArray = new bq1$b[16];
        this.v = object = new WR1(objectArray);
        this.w = bl2;
        this.y = bq1$b$b = new bq1$b$b(this);
        this.D = l2;
        super(bq12, this);
        this.F = object2;
    }

    public final void A0(long l2, float f5, Function1 function1, W01 w01) {
        Object object;
        boolean bl2;
        this.t = bl2 = true;
        long l3 = this.m;
        boolean bl3 = Si1.b(l2, l3);
        boolean bl4 = false;
        bq1 bq12 = this.H;
        if (!bl3 || (bl3 = this.G)) {
            bl3 = bq12.m;
            if (bl3 || (bl3 = bq12.l) || (bl3 = this.G)) {
                bq12.e = bl2;
                this.G = false;
            }
            this.u0();
        }
        if (bl3 = iq1_1.b((xp1_0)(object = bq12.a))) {
            object = bq12.a().q;
            Object object2 = bq12.a;
            if (object == null || (object = ((tb1_0)object).i) == null) {
                object = aq1_0.a((xp1_0)object2).getPlacementScope();
            }
            bq1$a_0 bq1$a_0 = bq12.s;
            Intrinsics.checkNotNull(bq1$a_0);
            object2 = ((xp1_0)object2).A();
            if (object2 != null) {
                object2 = ((xp1_0)object2).z;
                ((bq1)object2).j = 0;
            }
            bq1$a_0.h = -1 >>> 1;
            int n3 = (int)(l2 >> 32);
            long l4 = 0xFFFFFFFFL & l2;
            int n4 = (int)l4;
            Ns2$a.d((Ns2$a)object, bq1$a_0, n3, n4);
        }
        if ((object = bq12.s) != null && !(bl3 = ((bq1$a_0)object).k)) {
            bl4 = true;
        }
        if (bl2 ^= bl4) {
            this.z0(l2, f5, function1, w01);
            return;
        }
        bh1_1.c("Error: Placement happened before lookahead.");
        throw null;
    }

    public final Object B() {
        return this.r;
    }

    public final boolean B0(long l2) {
        bq1 bq12 = this.H;
        Object object = bq12.a;
        boolean bl2 = ((xp1_0)object).I;
        boolean bl3 = true;
        bq1$c bq1$c = null;
        if (bl2 ^= bl3) {
            long l3;
            boolean bl4;
            object = aq1_0.a((xp1_0)object);
            xp1_0 xp1_02 = bq12.a;
            Object object2 = xp1_02.A();
            boolean bl5 = xp1_02.x;
            if (!(bl5 || object2 != null && (bl4 = ((xp1_0)object2).x))) {
                bl4 = false;
                object2 = null;
            } else {
                bl4 = true;
            }
            xp1_02.x = bl4;
            object2 = xp1_02.z;
            bl4 = ((bq1)object2).d;
            if (!bl4 && (bl4 = c60.c(l3 = this.d, l2))) {
                int n3 = Rg2.a;
                object.h(xp1_02, false);
                xp1_02.b0();
                return false;
            }
            this.u.f = false;
            object = bq1$b$d.c;
            this.V((Function1)object);
            this.i = bl3;
            l3 = bq12.a().c;
            this.n0(l2);
            object = bq12.c;
            Xp1$d xp1$d = Xp1$d.Idle;
            if (object == xp1$d) {
                int n4;
                object = Xp1$d.Measuring;
                bq12.c = object;
                bq12.d = false;
                bq12.t = l2;
                Object object3 = aq1_0.a(xp1_02).getSnapshotObserver();
                ah2_0 ah2_02 = object3.c;
                bq1$c = bq12.u;
                object3.a(xp1_02, ah2_02, bq1$c);
                object3 = bq12.c;
                if (object3 == object) {
                    bq12.e = bl3;
                    bq12.f = bl3;
                    bq12.c = xp1$d;
                }
                object3 = bq12.a();
                l2 = ((Ns2)object3).c;
                int n7 = bj1.b(l2, l3);
                if (n7 != 0) {
                    object3 = bq12.a();
                    n7 = ((Ns2)object3).a;
                    n4 = this.a;
                    if (n7 == n4) {
                        object3 = bq12.a();
                        n7 = ((Ns2)object3).b;
                        n4 = this.b;
                        if (n7 == n4) {
                            bl3 = false;
                        }
                    }
                }
                n7 = bq12.a().a;
                n4 = bq12.a().b;
                l2 = dj1.a(n7, n4);
                this.m0(l2);
                return bl3;
            }
            bh1_1.c("layout state is not idle before measure starts");
            throw null;
        }
        bh1_1.b("measure is called on a deactivated node");
        throw null;
    }

    public final void C() {
        boolean bl2;
        yp1_1 yp1_12;
        boolean bl3;
        block10: {
            Object object;
            vg2_1 vg2_12;
            Object object2;
            xp1_0 xp1_02;
            boolean bl4;
            bq1 bq12;
            block9: {
                this.x = bl3 = true;
                yp1_12 = this.u;
                yp1_12.i();
                bq12 = this.H;
                bl4 = bq12.e;
                xp1_02 = bq12.a;
                if (bl4) {
                    object2 = xp1_02.D();
                    int n3 = object2.c;
                    if (n3 > 0) {
                        object2 = object2.a;
                        int n4 = 0;
                        vg2_12 = null;
                        do {
                            int n7;
                            Xp1$f xp1$f;
                            object = (xp1_0)object2[n4];
                            Object object3 = ((xp1_0)object).z;
                            boolean bl5 = object3.d;
                            if (!bl5 || (object3 = object3.r.k) != (xp1$f = Xp1$f.InMeasureBlock) || (n7 = xp1_0.S((xp1_0)object)) == 0) continue;
                            n7 = 7;
                            xp1_0.Z(xp1_02, false, n7);
                        } while (++n4 < n3);
                    }
                }
                if (bl4 = bq12.f) break block9;
                bl4 = this.l;
                if (bl4) break block10;
                object2 = this.K();
                bl4 = object2.h;
                if (bl4 || !(bl4 = bq12.e)) break block10;
            }
            bq12.e = false;
            object2 = bq12.c;
            Object object4 = Xp1$d.LayingOut;
            bq12.c = object4;
            bq12.e(false);
            object4 = aq1_0.a(xp1_02).getSnapshotObserver();
            vg2_12 = ((ch2)object4).e;
            object = this.y;
            ((ch2)object4).a(xp1_02, vg2_12, (Function0)object);
            bq12.c = object2;
            object2 = this.K();
            bl4 = object2.h;
            if (bl4 && (bl4 = bq12.l)) {
                this.requestLayout();
            }
            bq12.f = false;
        }
        if (bl2 = yp1_12.d) {
            yp1_12.e = bl3;
        }
        if ((bl3 = yp1_12.b) && (bl3 = yp1_12.f())) {
            yp1_12.h();
        }
        this.x = false;
    }

    public final boolean E() {
        return this.s;
    }

    public final int I(int n3) {
        this.w0();
        return this.H.a().I(n3);
    }

    public final Fh1 K() {
        return this.H.a.y.b;
    }

    public final int N(int n3) {
        this.w0();
        return this.H.a().N(n3);
    }

    public final int P(int n3) {
        this.w0();
        return this.H.a().P(n3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Ns2 Q(long l2) {
        xp1_0 xp1_02;
        boolean bl2;
        bq1 bq12 = this.H;
        Object object = bq12.a;
        Xp1$f xp1$f = ((xp1_0)object).v;
        Xp1$f xp1$f2 = Xp1$f.NotUsed;
        if (xp1$f == xp1$f2) {
            ((xp1_0)object).o();
        }
        if (bl2 = iq1_1.b((xp1_0)(object = bq12.a))) {
            object = bq12.s;
            Intrinsics.checkNotNull(object);
            ((bq1$a_0)object).i = xp1$f2;
            ((bq1$a_0)object).Q(l2);
        }
        if ((object = (xp1_02 = bq12.a).A()) != null) {
            void var3_8;
            int n3;
            boolean bl3;
            Xp1$f xp1$f3 = this.k;
            if (xp1$f3 != xp1$f2 && !(bl3 = xp1_02.x)) {
                bh1_1.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            bq1 bq13 = ((xp1_0)object).z;
            int[] nArray = bq1$b$a.$EnumSwitchMapping$0;
            object = bq13.c;
            int n7 = ((Enum)object).ordinal();
            n7 = nArray[n7];
            if (n7 != (n3 = 1)) {
                n3 = 2;
                if (n7 != n3) {
                    StringBuilder stringBuilder = new StringBuilder("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    Xp1$d xp1$d = bq13.c;
                    stringBuilder.append((Object)xp1$d);
                    String string2 = stringBuilder.toString();
                    IllegalStateException illegalStateException = new IllegalStateException(string2);
                    throw illegalStateException;
                }
                Xp1$f xp1$f4 = Xp1$f.InLayoutBlock;
            } else {
                Xp1$f xp1$f5 = Xp1$f.InMeasureBlock;
            }
            this.k = var3_8;
        } else {
            this.k = xp1$f2;
        }
        this.B0(l2);
        return this;
    }

    public final int U(Oc oc) {
        bq1 bq12 = this.H;
        Object object = bq12.a.A();
        Xp1$d xp1$d = null;
        object = object != null ? object.z.c : null;
        Xp1$d xp1$d2 = Xp1$d.Measuring;
        yp1_1 yp1_12 = this.u;
        boolean bl2 = true;
        if (object == xp1$d2) {
            yp1_12.c = bl2;
        } else {
            object = bq12.a.A();
            if (object != null) {
                object = object.z;
                xp1$d = ((bq1)object).c;
            }
            if (xp1$d == (object = Xp1$d.LayingOut)) {
                yp1_12.d = bl2;
            }
        }
        this.l = bl2;
        int n3 = bq12.a().U(oc);
        this.l = false;
        return n3;
    }

    public final void V(Function1 function1) {
        Object[] objectArray = this.H.a.D();
        int n3 = objectArray.c;
        if (n3 > 0) {
            objectArray = objectArray.a;
            int n4 = 0;
            do {
                bq1$b bq1$b = ((xp1_0)objectArray[n4]).z.r;
                function1.invoke(bq1$b);
            } while (++n4 < n3);
        }
    }

    public final void X(boolean bl2) {
        bq1 bq12 = this.H;
        w32_0 w32_02 = bq12.a();
        boolean bl3 = w32_02.f;
        if (bl2 != bl3) {
            w32_0 w32_03 = bq12.a();
            w32_03.f = bl3;
            this.G = bl2 = true;
        }
    }

    public final void b0() {
        xp1_0.Z(this.H.a, false, 7);
    }

    public final void j0(long l2, float f5, W01 w01) {
        this.A0(l2, f5, null, w01);
    }

    public final void k0(long l2, float f5, Function1 function1) {
        this.A0(l2, f5, function1, null);
    }

    public final List o0() {
        Object object = this.H;
        Object[] objectArray = ((bq1)object).a;
        objectArray.g0();
        int n3 = this.w;
        WR1 wR1 = this.v;
        if (n3 == 0) {
            return wR1.f();
        }
        object = ((bq1)object).a;
        objectArray = ((xp1_0)object).D();
        int n4 = objectArray.c;
        if (n4 > 0) {
            objectArray = objectArray.a;
            int n7 = 0;
            do {
                Object object2 = (xp1_0)objectArray[n7];
                int n8 = wR1.c;
                if (n8 <= n7) {
                    object2 = ((xp1_0)object2).z.r;
                    wR1.b(object2);
                    continue;
                }
                object2 = ((xp1_0)object2).z.r;
                Object[] objectArray2 = wR1.a;
                Object cfr_ignored_0 = objectArray2[n7];
                objectArray2[n7] = object2;
            } while (++n7 < n4);
        }
        int n10 = ((xp1_0)object).v().size();
        n3 = wR1.c;
        wR1.o(n10, n3);
        this.w = false;
        return wR1.f();
    }

    public final Sc p() {
        return this.u;
    }

    public final void q0() {
        int n3;
        boolean bl2;
        Object[] objectArray;
        int n4;
        boolean bl3 = this.s;
        this.s = n4 = 1;
        xp1_0 xp1_02 = this.H.a;
        if (!bl3) {
            objectArray = xp1_02.z;
            bl2 = objectArray.d;
            n3 = 6;
            if (bl2) {
                xp1_0.Z(xp1_02, n4 != 0, n3);
            } else {
                bl3 = objectArray.g;
                if (bl3) {
                    xp1_0.X(xp1_02, n4 != 0, n3);
                }
            }
        }
        objectArray = xp1_02.y;
        w32_0 w32_02 = objectArray.c;
        objectArray = objectArray.b.p;
        while (!(bl2 = Intrinsics.areEqual(w32_02, objectArray)) && w32_02 != null) {
            bl2 = w32_02.F;
            if (bl2) {
                w32_02.p1();
            }
            w32_02 = w32_02.p;
        }
        objectArray = xp1_02.D();
        n4 = objectArray.c;
        if (n4 > 0) {
            objectArray = objectArray.a;
            int n7 = 0;
            xp1_02 = null;
            do {
                int n8;
                xp1_0 xp1_03;
                if ((n3 = (xp1_03 = (xp1_0)objectArray[n7]).B()) == (n8 = -1 >>> 1)) continue;
                bq1$b bq1$b = xp1_03.z.r;
                bq1$b.q0();
                xp1_0.a0(xp1_03);
            } while (++n7 < n4);
        }
    }

    public final void r0() {
        int n3 = (int)(this.s ? 1 : 0);
        if (n3 != 0) {
            boolean bl2;
            n3 = 0;
            this.s = false;
            Object[] objectArray = this.H;
            Object object = objectArray.a.y;
            Ns2 ns2 = ((T32)object).c;
            object = ((T32)object).b.p;
            while (!(bl2 = Intrinsics.areEqual(ns2, object)) && ns2 != null) {
                Object object2 = ((w32_0)ns2).G;
                if (object2 != null) {
                    object2 = ((w32_0)ns2).H;
                    if (object2 != null) {
                        ((w32_0)ns2).H = null;
                    }
                    ((w32_0)ns2).E1(null, false);
                    object2 = ((w32_0)ns2).m;
                    ((xp1_0)object2).Y(false);
                }
                ns2 = ((w32_0)ns2).p;
            }
            objectArray = objectArray.a.D();
            int n4 = objectArray.c;
            if (n4 > 0) {
                objectArray = objectArray.a;
                do {
                    ns2 = ((xp1_0)objectArray[n3]).z.r;
                    ((bq1$b)ns2).r0();
                } while (++n3 < n4);
            }
        }
    }

    public final void requestLayout() {
        xp1_0 xp1_02 = this.H.a;
        xp1_02.Y(false);
    }

    public final void u0() {
        Object[] objectArray = this.H;
        int n3 = objectArray.n;
        if (n3 > 0) {
            objectArray = objectArray.a.D();
            n3 = objectArray.c;
            if (n3 > 0) {
                objectArray = objectArray.a;
                int n4 = 0;
                do {
                    Object object = (xp1_0)objectArray[n4];
                    bq1 bq12 = ((xp1_0)object).z;
                    boolean bl2 = bq12.l;
                    if ((bl2 || (bl2 = bq12.m)) && !(bl2 = bq12.e)) {
                        ((xp1_0)object).Y(false);
                    }
                    object = bq12.r;
                    ((bq1$b)object).u0();
                } while (++n4 < n3);
            }
        }
    }

    public final int v(int n3) {
        this.w0();
        return this.H.a().v(n3);
    }

    public final void w0() {
        Enum enum_;
        Object object = this.H;
        Object object2 = ((bq1)object).a;
        Object object3 = 7;
        Object object4 = 0;
        Object object5 = null;
        xp1_0.Z(object2, false, object3);
        object = ((bq1)object).a;
        object2 = ((xp1_0)object).A();
        if (object2 != null && (enum_ = ((xp1_0)object).v) == (object5 = Xp1$f.NotUsed)) {
            enum_ = object2.z.c;
            object5 = bq1$b$a.$EnumSwitchMapping$0;
            object3 = enum_.ordinal();
            object4 = 1;
            object2 = (object3 = (Object)((Object)object5[object3])) != object4 ? (object3 != (object4 = 2) ? object2.v : Xp1$f.InLayoutBlock) : Xp1$f.InMeasureBlock;
            ((xp1_0)object).v = object2;
        }
    }

    public final Tc x() {
        Object object = this.H.a.A();
        object = object != null && (object = ((xp1_0)object).z) != null ? ((bq1)object).r : null;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void y0() {
        block11: {
            block10: {
                Object object;
                int n3 = 1;
                this.A = n3;
                Object object2 = this.H;
                Object object3 = ((bq1)object2).a.A();
                Object object4 = this.K();
                float f5 = object4.A;
                object2 = ((bq1)object2).a.y;
                w32_0 w32_02 = ((T32)object2).c;
                while (w32_02 != (object = ((T32)object2).b)) {
                    object = "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator";
                    Intrinsics.checkNotNull(w32_02, (String)object);
                    w32_02 = (sp1_1)w32_02;
                    float f6 = w32_02.A;
                    f5 += f6;
                    w32_02 = w32_02.p;
                }
                float f7 = this.z;
                float f8 = f5 - f7;
                Object object5 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                if (object5 != false) {
                    this.z = f5;
                    if (object3 != null) {
                        object3.Q();
                    }
                    if (object3 != null) {
                        object3.G();
                    }
                }
                object5 = this.s;
                int n4 = 0;
                f5 = 0.0f;
                object4 = null;
                if (object5 == false) {
                    if (object3 != null) {
                        object3.G();
                    }
                    this.q0();
                    object5 = this.f;
                    if (object5 != false && object3 != null) {
                        object3.Y(false);
                    }
                }
                if (object3 == null) break block10;
                object5 = this.f;
                if (object5 == false) {
                    object2 = object3.z;
                    object3 = ((bq1)object2).c;
                    object4 = Xp1$d.LayingOut;
                    if (object3 == object4) {
                        int n7 = this.h;
                        n4 = -1 >>> 1;
                        f5 = 0.0f / 0.0f;
                        if (n7 != n4) {
                            bh1_1.c("Place was called on a node which was placed already");
                            throw null;
                        }
                        this.h = n7 = ((bq1)object2).k;
                        ((bq1)object2).k = n7 += n3;
                    }
                }
                break block11;
            }
            this.h = 0;
        }
        this.C();
    }

    public final void z0(long l2, float f5, Function1 fx0_22, W01 w01) {
        bq1 bq12 = this.H;
        Object object = bq12.a;
        boolean bl2 = ((xp1_0)object).I;
        boolean bl3 = true;
        if (bl2 ^= bl3) {
            Object object2;
            Xp1$d xp1$d;
            bq12.c = xp1$d = Xp1$d.LayingOut;
            this.m = l2;
            this.p = f5;
            this.n = fx0_22;
            this.o = w01;
            this.j = bl3;
            bl2 = false;
            xp1$d = null;
            this.A = false;
            object = aq1_0.a((xp1_0)object);
            bl3 = bq12.e;
            if (!bl3 && (bl3 = this.s)) {
                w32_0 w32_02 = bq12.a();
                long l3 = w32_02.e;
                long l4 = Si1.d(l2, l3);
                w32_02.w1(l4, f5, (Function1)fx0_22, w01);
                this.y0();
            } else {
                yp1_1 yp1_12 = this.u;
                yp1_12.g = false;
                bq12.d(false);
                this.B = fx0_22;
                this.D = l2;
                this.E = f5;
                this.C = w01;
                object2 = object.getSnapshotObserver();
                wg2_0 wg2_02 = ((ch2)object2).f;
                xp1_0 xp1_02 = bq12.a;
                fx0_22 = this.F;
                ((ch2)object2).a(xp1_02, wg2_02, (Function0)fx0_22);
            }
            object2 = Xp1$d.Idle;
            bq12.c = object2;
            return;
        }
        bh1_1.b("place is called on a deactivated node");
        throw null;
    }
}

