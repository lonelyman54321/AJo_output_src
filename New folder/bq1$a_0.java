/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bq1$a
 */
public final class bq1$a_0
extends Ns2
implements xk1_0,
Tc,
rq1_1 {
    public boolean f;
    public int g;
    public int h;
    public Xp1$f i;
    public boolean j;
    public boolean k;
    public boolean l;
    public c60 m;
    public long n;
    public Function1 o;
    public W01 p;
    public boolean q;
    public final sb1_1 r;
    public final WR1 s;
    public boolean t;
    public boolean u;
    public boolean v;
    public Object w;
    public boolean x;
    public final /* synthetic */ bq1 y;

    public bq1$a_0(bq1 object) {
        Object object2;
        int n3;
        this.y = object;
        this.g = n3 = -1 >>> 1;
        this.h = n3;
        this.i = object2 = Xp1$f.NotUsed;
        this.n = 0L;
        super(this);
        this.r = object2;
        Object[] objectArray = new bq1$a_0[16];
        super(objectArray);
        this.s = object2;
        n3 = 1;
        this.t = n3;
        this.v = n3;
        this.w = object = ((bq1)object).r.r;
    }

    public final Object B() {
        return this.w;
    }

    public final void C() {
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        int n3;
        Object[] objectArray;
        boolean bl3;
        this.u = bl3 = true;
        sb1_1 sb1_12 = this.r;
        sb1_12.i();
        bq1 bq12 = this.y;
        boolean bl4 = bq12.h;
        xp1_0 xp1_02 = bq12.a;
        if (bl4) {
            objectArray = xp1_02.D();
            n3 = objectArray.c;
            if (n3 > 0) {
                objectArray = objectArray.a;
                int n4 = 0;
                object3 = null;
                do {
                    int n7;
                    Xp1$f xp1$f;
                    object2 = (xp1_0)objectArray[n4];
                    object = ((xp1_0)object2).z;
                    boolean bl5 = ((bq1)object).g;
                    if (!bl5 || (object = ((xp1_0)object2).y()) != (xp1$f = Xp1$f.InMeasureBlock)) continue;
                    object2 = ((xp1_0)object2).z;
                    object = ((bq1)object2).s;
                    Intrinsics.checkNotNull(object);
                    object2 = ((bq1)object2).s;
                    if (object2 != null) {
                        object2 = ((bq1$a_0)object2).m;
                    } else {
                        n7 = 0;
                        object2 = null;
                    }
                    Intrinsics.checkNotNull(object2);
                    long l2 = ((c60)object2).a;
                    n7 = ((bq1$a_0)object).z0(l2);
                    if (n7 == 0) continue;
                    n7 = 7;
                    xp1_0.X(xp1_02, false, n7);
                } while (++n4 < n3);
            }
        }
        objectArray = this.K().Q;
        Intrinsics.checkNotNull(objectArray);
        n3 = (int)(bq12.i ? 1 : 0);
        if (n3 != 0 || (n3 = (int)(this.j ? 1 : 0)) == 0 && (n3 = (int)(objectArray.h ? 1 : 0)) == 0 && (n3 = (int)(bq12.h ? 1 : 0)) != 0) {
            bq12.h = false;
            Xp1$d xp1$d = bq12.c;
            object3 = Xp1$d.LookaheadLayingOut;
            bq12.c = object3;
            object3 = aq1_0.a(xp1_02);
            bq12.g(false);
            object3 = object3.getSnapshotObserver();
            object = objectArray;
            object = (Fh1$a)objectArray;
            object2 = new bq1$a$b(this, (Fh1$a)object, bq12);
            object3.getClass();
            object = xp1_02.c;
            if (object != null) {
                object = ((ch2)object3).h;
                ((ch2)object3).a(xp1_02, (Function1)object, (Function0)object2);
            } else {
                object = ((ch2)object3).e;
                ((ch2)object3).a(xp1_02, (Function1)object, (Function0)object2);
            }
            bq12.c = xp1$d;
            boolean bl6 = bq12.o;
            if (bl6 && (bl4 = objectArray.h)) {
                this.requestLayout();
            }
            bq12.i = false;
        }
        if (bl2 = sb1_12.d) {
            sb1_12.e = bl3;
        }
        if ((bl3 = sb1_12.b) && (bl3 = sb1_12.f())) {
            sb1_12.h();
        }
        this.u = false;
    }

    public final boolean E() {
        return this.q;
    }

    public final int I(int n3) {
        this.u0();
        xb1_0 xb1_02 = this.y.a().h1();
        Intrinsics.checkNotNull(xb1_02);
        return xb1_02.I(n3);
    }

    public final Fh1 K() {
        return this.y.a.y.b;
    }

    public final int N(int n3) {
        this.u0();
        xb1_0 xb1_02 = this.y.a().h1();
        Intrinsics.checkNotNull(xb1_02);
        return xb1_02.N(n3);
    }

    public final int P(int n3) {
        this.u0();
        xb1_0 xb1_02 = this.y.a().h1();
        Intrinsics.checkNotNull(xb1_02);
        return xb1_02.P(n3);
    }

    public final Ns2 Q(long l2) {
        Object object;
        boolean bl2;
        Enum enum_;
        Object object2;
        Object object3;
        Object object4;
        block15: {
            block14: {
                object4 = this.y;
                object3 = ((bq1)object4).a.A();
                object2 = 0;
                enum_ = null;
                if (object3 != null) {
                    object3 = object3.z.c;
                } else {
                    bl2 = false;
                    object3 = null;
                }
                object = Xp1$d.LookaheadMeasuring;
                if (object3 == object) break block14;
                object3 = ((bq1)object4).a.A();
                if (object3 != null) {
                    object3 = object3.z.c;
                } else {
                    bl2 = false;
                    object3 = null;
                }
                object = Xp1$d.LookaheadLayingOut;
                if (object3 != object) break block15;
            }
            bl2 = false;
            object3 = null;
            ((bq1)object4).b = false;
        }
        if ((object = (object3 = ((bq1)object4).a).A()) != null) {
            Xp1$f xp1$f = this.i;
            Xp1$f xp1$f2 = Xp1$f.NotUsed;
            if (xp1$f != xp1$f2 && !(bl2 = object3.x)) {
                bh1_1.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            object3 = ((xp1_0)object).z;
            enum_ = ((bq1)object3).c;
            object = bq1$a$a.$EnumSwitchMapping$0;
            object2 = enum_.ordinal();
            Object object5 = 1;
            if ((object2 = (Object)((Object)object[object2])) != object5 && object2 != (object5 = 2)) {
                object5 = 3;
                if (object2 != object5 && object2 != (object5 = 4)) {
                    CharSequence charSequence = new StringBuilder("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    object4 = ((bq1)object3).c;
                    charSequence.append(object4);
                    charSequence = charSequence.toString();
                    IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
                    throw illegalStateException;
                }
                object3 = Xp1$f.InLayoutBlock;
            } else {
                object3 = Xp1$f.InMeasureBlock;
            }
            this.i = object3;
        } else {
            object3 = Xp1$f.NotUsed;
            this.i = object3;
        }
        object4 = ((bq1)object4).a;
        object3 = ((xp1_0)object4).v;
        enum_ = Xp1$f.NotUsed;
        if (object3 == enum_) {
            ((xp1_0)object4).o();
        }
        this.z0(l2);
        return this;
    }

    public final int U(Oc oc) {
        Object object = this.y;
        Object object2 = ((bq1)object).a.A();
        Xp1$d xp1$d = null;
        object2 = object2 != null ? object2.z.c : null;
        Xp1$d xp1$d2 = Xp1$d.LookaheadMeasuring;
        sb1_1 sb1_12 = this.r;
        boolean bl2 = true;
        if (object2 == xp1$d2) {
            sb1_12.c = bl2;
        } else {
            object2 = ((bq1)object).a.A();
            if (object2 != null) {
                object2 = object2.z;
                xp1$d = ((bq1)object2).c;
            }
            if (xp1$d == (object2 = Xp1$d.LookaheadLayingOut)) {
                sb1_12.d = bl2;
            }
        }
        this.j = bl2;
        object = ((bq1)object).a().h1();
        Intrinsics.checkNotNull(object);
        int n3 = ((tb1_0)object).U(oc);
        this.j = false;
        return n3;
    }

    public final void V(Function1 function1) {
        Object[] objectArray = this.y.a.D();
        int n3 = objectArray.c;
        if (n3 > 0) {
            objectArray = objectArray.a;
            int n4 = 0;
            do {
                bq1$a_0 bq1$a_0 = ((xp1_0)objectArray[n4]).z.s;
                Intrinsics.checkNotNull(bq1$a_0);
                function1.invoke(bq1$a_0);
            } while (++n4 < n3);
        }
    }

    public final void X(boolean bl2) {
        boolean bl3;
        Object object = this.y;
        Object object2 = ((bq1)object).a().h1();
        if (object2 != null) {
            bl3 = ((tb1_0)object2).f;
            object2 = bl3;
        } else {
            bl3 = false;
            object2 = null;
        }
        Boolean bl4 = bl2;
        bl3 = Intrinsics.areEqual(bl4, object2);
        if (!bl3 && (object = ((bq1)object).a().h1()) != null) {
            ((tb1_0)object).f = bl2;
        }
    }

    public final void b0() {
        xp1_0.X(this.y.a, false, 7);
    }

    public final void j0(long l2, float f5, W01 w01) {
        this.y0(l2, null, w01);
    }

    public final void k0(long l2, float f5, Function1 function1) {
        this.y0(l2, function1, null);
    }

    public final void o0() {
        block4: {
            xp1_0 xp1_02;
            int n3;
            int n4 = this.q;
            this.q = n3 = 1;
            bq1 bq12 = this.y;
            if (n4 == 0 && (n4 = bq12.g) != 0) {
                n4 = 6;
                xp1_02 = bq12.a;
                xp1_0.X(xp1_02, n3 != 0, n4);
            }
            Object object = bq12.a.D();
            n3 = object.c;
            if (n3 > 0) {
                block3: {
                    object = object.a;
                    int n7 = 0;
                    bq12 = null;
                    do {
                        xp1_02 = (xp1_0)object[n7];
                        bq1$a_0 bq1$a_0 = xp1_02.z.s;
                        if (bq1$a_0 == null) break block3;
                        int n8 = bq1$a_0.h;
                        int n10 = -1 >>> 1;
                        if (n8 == n10) continue;
                        bq1$a_0.o0();
                        xp1_0.a0(xp1_02);
                    } while (++n7 < n3);
                    break block4;
                }
                String string2 = "Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.".toString();
                object = new IllegalArgumentException(string2);
                throw object;
            }
        }
    }

    public final Sc p() {
        return this.r;
    }

    public final void q0() {
        int n3 = (int)(this.q ? 1 : 0);
        if (n3 != 0) {
            n3 = 0;
            this.q = false;
            Object[] objectArray = this.y.a.D();
            int n4 = objectArray.c;
            if (n4 > 0) {
                objectArray = objectArray.a;
                do {
                    bq1$a_0 bq1$a_0 = ((xp1_0)objectArray[n3]).z.s;
                    Intrinsics.checkNotNull(bq1$a_0);
                    bq1$a_0.q0();
                } while (++n3 < n4);
            }
        }
    }

    public final void r0() {
        Object[] objectArray = this.y;
        int n3 = objectArray.q;
        if (n3 > 0) {
            objectArray = objectArray.a.D();
            n3 = objectArray.c;
            if (n3 > 0) {
                objectArray = objectArray.a;
                int n4 = 0;
                do {
                    Object object = (xp1_0)objectArray[n4];
                    bq1 bq12 = ((xp1_0)object).z;
                    boolean bl2 = bq12.o;
                    if ((bl2 || (bl2 = bq12.p)) && !(bl2 = bq12.h)) {
                        ((xp1_0)object).W(false);
                    }
                    if ((object = bq12.s) == null) continue;
                    ((bq1$a_0)object).r0();
                } while (++n4 < n3);
            }
        }
    }

    public final void requestLayout() {
        xp1_0 xp1_02 = this.y.a;
        xp1_02.W(false);
    }

    public final void u0() {
        Enum enum_;
        Object object = this.y;
        Object object2 = ((bq1)object).a;
        Object object3 = 7;
        int n3 = 0;
        Object object4 = null;
        xp1_0.X(object2, false, object3);
        object = ((bq1)object).a;
        object2 = ((xp1_0)object).A();
        if (object2 != null && (enum_ = ((xp1_0)object).v) == (object4 = Xp1$f.NotUsed)) {
            enum_ = object2.z.c;
            object4 = bq1$a$a.$EnumSwitchMapping$0;
            object3 = enum_.ordinal();
            n3 = 2;
            object2 = (object3 = (Object)((Object)object4[object3])) != n3 ? (object3 != (n3 = 3) ? object2.v : Xp1$f.InLayoutBlock) : Xp1$f.InMeasureBlock;
            ((xp1_0)object).v = object2;
        }
    }

    public final int v(int n3) {
        this.u0();
        xb1_0 xb1_02 = this.y.a().h1();
        Intrinsics.checkNotNull(xb1_02);
        return xb1_02.v(n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w0() {
        block6: {
            block5: {
                int n3 = 1;
                this.x = n3;
                Object object = this.y.a.A();
                int n4 = this.q;
                int n7 = 0;
                Xp1$d xp1$d = null;
                if (n4 == 0) {
                    this.o0();
                    n4 = this.f;
                    if (n4 != 0 && object != null) {
                        ((xp1_0)object).W(false);
                    }
                }
                if (object == null) break block5;
                n4 = this.f;
                if (n4 == 0) {
                    object = ((xp1_0)object).z;
                    Xp1$d xp1$d2 = ((bq1)object).c;
                    xp1$d = Xp1$d.LayingOut;
                    if (xp1$d2 == xp1$d || xp1$d2 == (xp1$d = Xp1$d.LookaheadLayingOut)) {
                        n4 = this.h;
                        n7 = -1 >>> 1;
                        if (n4 != n7) {
                            bh1_1.c("Place was called on a node which was placed already");
                            throw null;
                        }
                        this.h = n4 = ((bq1)object).j;
                        ((bq1)object).j = n4 += n3;
                    }
                }
                break block6;
            }
            this.h = 0;
        }
        this.C();
    }

    public final Tc x() {
        Object object = this.y.a.A();
        object = object != null && (object = ((xp1_0)object).z) != null ? ((bq1)object).s : null;
        return object;
    }

    public final void y0(long l2, Function1 function1, W01 w01) {
        bq1 bq12 = this.y;
        Object object = bq12.a;
        boolean bl2 = ((xp1_0)object).I;
        boolean bl3 = true;
        if (bl2 ^= bl3) {
            Xp1$d xp1$d;
            object = Xp1$d.LookaheadLayingOut;
            bq12.c = object;
            this.k = bl3;
            bl2 = false;
            object = null;
            this.x = false;
            long l3 = this.n;
            boolean bl4 = Si1.b(l2, l3);
            if (!bl4) {
                bl4 = bq12.p;
                if (bl4 || (bl4 = bq12.o)) {
                    bq12.h = bl3;
                }
                this.r0();
            }
            xp1_0 xp1_02 = bq12.a;
            Object object2 = aq1_0.a(xp1_02);
            boolean bl5 = bq12.h;
            if (!bl5 && (bl5 = this.q)) {
                object = bq12.a().h1();
                Intrinsics.checkNotNull(object);
                long l4 = ((Ns2)object).e;
                l4 = Si1.d(l2, l4);
                ((xb1_0)object).R0(l4);
                this.w0();
            } else {
                bq12.f(false);
                this.r.g = false;
                object = object2.getSnapshotObserver();
                eq1_2 eq1_22 = new eq1_2(bq12, (sg2_0)object2, l2);
                object.getClass();
                object2 = xp1_02.c;
                if (object2 != null) {
                    object2 = ((ch2)object).g;
                    ((ch2)object).a(xp1_02, (Function1)object2, eq1_22);
                } else {
                    object2 = ((ch2)object).f;
                    ((ch2)object).a(xp1_02, (Function1)object2, eq1_22);
                }
            }
            this.n = l2;
            this.o = function1;
            this.p = w01;
            bq12.c = xp1$d = Xp1$d.Idle;
            return;
        }
        bh1_1.b("place is called on a deactivated node");
        throw null;
    }

    public final boolean z0(long l2) {
        bq1 bq12 = this.y;
        Object object = bq12.a;
        boolean bl2 = ((xp1_0)object).I;
        boolean bl3 = true;
        Object object2 = null;
        if (bl2 ^= bl3) {
            hq1_1 hq1_12;
            long l3;
            int n3;
            object = ((xp1_0)object).A();
            xp1_0 xp1_02 = bq12.a;
            boolean bl4 = xp1_02.x;
            if (!(bl4 || object != null && (n3 = ((xp1_0)object).x) != 0)) {
                n3 = 0;
                object = null;
            } else {
                n3 = 1;
            }
            xp1_02.x = n3;
            object = xp1_02.z;
            n3 = ((bq1)object).g;
            if (n3 == 0) {
                object = this.m;
                if (object == null) {
                    n3 = 0;
                    object = null;
                } else {
                    l3 = ((c60)object).a;
                    n3 = c60.c(l3, l2);
                }
                if (n3 != 0) {
                    sg2_0 sg2_02 = xp1_02.i;
                    if (sg2_02 != null) {
                        sg2_02.h(xp1_02, bl3);
                    }
                    xp1_02.b0();
                    return false;
                }
            }
            this.m = object = new c60(l2);
            this.n0(l2);
            this.r.f = false;
            object = bq1$a$c.c;
            this.V((Function1)object);
            n3 = this.l;
            if (n3 != 0) {
                l3 = this.c;
            } else {
                n3 = -1 << -1;
                l3 = dj1.a(n3, n3);
            }
            this.l = bl3;
            object = bq12.a().h1();
            if (object != null) {
                bl4 = true;
            } else {
                bl4 = false;
                hq1_12 = null;
            }
            if (bl4) {
                object2 = Xp1$d.LookaheadMeasuring;
                bq12.c = object2;
                bq12.g = false;
                object2 = aq1_0.a(xp1_02).getSnapshotObserver();
                hq1_12 = new hq1_1(bq12, l2);
                object2.getClass();
                Object object3 = xp1_02.c;
                if (object3 != null) {
                    object3 = ((ch2)object2).b;
                    ((ch2)object2).a(xp1_02, (Function1)object3, hq1_12);
                } else {
                    object3 = ((ch2)object2).c;
                    ((ch2)object2).a(xp1_02, (Function1)object3, hq1_12);
                }
                bq12.h = bl3;
                bq12.i = bl3;
                int n4 = iq1_1.b(xp1_02);
                if (n4 != 0) {
                    bq12.e = bl3;
                    bq12.f = bl3;
                } else {
                    bq12.d = bl3;
                }
                object3 = Xp1$d.Idle;
                bq12.c = object3;
                n4 = ((Ns2)object).a;
                int n7 = ((Ns2)object).b;
                l2 = dj1.a(n4, n7);
                this.m0(l2);
                l2 = l3 >> 32;
                n7 = (int)l2;
                n4 = ((Ns2)object).a;
                if (n7 == n4 && (n7 = (int)(l2 = 0xFFFFFFFFL & l3)) == (n4 = ((Ns2)object).b)) {
                    bl3 = false;
                }
                return bl3;
            }
            bh1_1.c("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        bh1_1.b("measure is called on a deactivated node");
        throw null;
    }
}

