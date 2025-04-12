/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Xp1
 */
public final class xp1_0
implements C20,
hi2_0,
Tg2,
Fp1,
N20,
Sg2$a {
    public static final Xp1$c J;
    public static final Xp1$a K;
    public static final Xp1$b L;
    public static final Wp1 M;
    public jq1_2 A;
    public w32_0 B;
    public boolean C;
    public LP1 D;
    public LP1 E;
    public Function1 F;
    public Function1 G;
    public boolean H;
    public boolean I;
    public final boolean a;
    public int b;
    public xp1_0 c;
    public int d;
    public final YR1 e;
    public WR1 f;
    public boolean g;
    public xp1_0 h;
    public sg2_0 i;
    public AndroidViewHolder j;
    public int k;
    public boolean l;
    public zy2_0 m;
    public final WR1 n;
    public boolean o;
    public al1_1 p;
    public ek1_0 q;
    public Vo0 r;
    public bp1_0 s;
    public NC3 t;
    public M30 u;
    public Xp1$f v;
    public Xp1$f w;
    public boolean x;
    public final T32 y;
    public final bq1 z;

    static {
        Object object = new Xp1$e("Undefined intrinsics block and it is required");
        J = object;
        K = Xp1$a.c;
        L = object = new Object();
        M = object = new Object();
    }

    public xp1_0() {
        this(3, 0, false);
    }

    public xp1_0(int n3, int n4, boolean bl2) {
        n4 = 1;
        if ((n3 &= n4) != 0) {
            bl2 = false;
        }
        n3 = CY2.a.addAndGet(n4);
        this(bl2, n3);
    }

    public xp1_0(boolean bl2, int n3) {
        this.a = bl2;
        this.b = n3;
        int n4 = 16;
        Object object = new xp1_0[n4];
        Object object2 = new WR1((Object[])object);
        super(this);
        Object object3 = new YR1((WR1)object2, (Xp1$h)object);
        this.e = object3;
        object2 = new xp1_0[n4];
        this.n = object3 = new WR1((Object[])object2);
        this.o = bl2 = true;
        this.p = object2 = J;
        this.r = object2 = aq1_0.a;
        this.s = object2 = bp1_0.Ltr;
        this.t = object2 = L;
        M30.a0.getClass();
        this.u = object2 = M30$a.b;
        this.v = object2 = Xp1$f.NotUsed;
        this.w = object2;
        super(this);
        this.y = object2;
        super(this);
        this.z = object2;
        this.C = bl2;
        this.D = object3 = LP1$a.b;
    }

    public static boolean S(xp1_0 xp1_02) {
        c60 c602;
        bq1$b bq1$b = xp1_02.z.r;
        boolean bl2 = bq1$b.i;
        if (bl2) {
            long l2 = bq1$b.d;
            c602 = new c60(l2);
        } else {
            c602 = null;
        }
        return xp1_02.R(c602);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void X(xp1_0 object, boolean bl2, int n3) {
        xp1_0 xp1_02;
        Xp1$f xp1$f;
        Object object2;
        String string2;
        int n4 = n3 & 1;
        boolean bl3 = false;
        if (n4 != 0) {
            bl2 = false;
            string2 = null;
        }
        n4 = n3 & 2;
        int n7 = 1;
        if (n4 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            Object var7_7 = null;
        }
        if ((n3 &= 4) != 0) {
            bl3 = true;
        }
        if ((object2 = ((xp1_0)object).c) == null) {
            bh1_1.c("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        object2 = ((xp1_0)object).i;
        if (object2 == null) {
            return;
        }
        boolean bl4 = ((xp1_0)object).l;
        if (bl4) return;
        bl4 = ((xp1_0)object).a;
        if (bl4) return;
        object2.y((xp1_0)object, n7 != 0, bl2, n4 != 0);
        if (!bl3) return;
        object = ((xp1_0)object).z.s;
        Intrinsics.checkNotNull(object);
        object = ((bq1$a_0)object).y;
        object2 = ((bq1)object).a.A();
        object = ((bq1)object).a.v;
        if (object2 == null) return;
        Xp1$f xp1$f2 = Xp1$f.NotUsed;
        if (object == xp1$f2) return;
        while ((xp1$f = ((xp1_0)object2).v) == object && (xp1_02 = ((xp1_0)object2).A()) != null) {
            object2 = xp1_02;
        }
        int[] nArray = bq1$a$a.$EnumSwitchMapping$1;
        int n10 = ((Enum)object).ordinal();
        n10 = nArray[n10];
        if (n10 != n7) {
            n4 = 2;
            if (n10 != n4) {
                string2 = "Intrinsics isn't used by the parent".toString();
                object = new IllegalStateException(string2);
                throw object;
            }
            object = ((xp1_0)object2).c;
            if (object != null) {
                ((xp1_0)object2).W(bl2);
                return;
            }
            ((xp1_0)object2).Y(bl2);
            return;
        }
        object = ((xp1_0)object2).c;
        n4 = 6;
        if (object != null) {
            xp1_0.X((xp1_0)object2, bl2, n4);
            return;
        }
        xp1_0.Z((xp1_0)object2, bl2, n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void Z(xp1_0 object, boolean bl2, int n3) {
        xp1_0 xp1_02;
        Xp1$f xp1$f;
        xp1_0 xp1_03;
        String string2;
        int n4 = 2;
        int n7 = 1;
        int n8 = n3 & 1;
        if (n8) {
            bl2 = false;
            string2 = null;
        }
        if (n8 = n3 & 2) {
            n8 = 1;
        } else {
            n8 = 0;
            Object var7_7 = null;
        }
        if ((n3 &= 4) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            xp1_03 = null;
        }
        boolean bl3 = ((xp1_0)object).l;
        if (bl3) return;
        bl3 = ((xp1_0)object).a;
        if (bl3) return;
        sg2_0 sg2_02 = ((xp1_0)object).i;
        if (sg2_02 == null) {
            return;
        }
        sg2_02.y((xp1_0)object, false, bl2, n8 != 0);
        if (n3 == 0) return;
        object = ((xp1_0)object).z.r.H;
        xp1_03 = ((bq1)object).a.A();
        object = ((bq1)object).a.v;
        if (xp1_03 == null) return;
        Xp1$f xp1$f2 = Xp1$f.NotUsed;
        if (object == xp1$f2) return;
        while ((xp1$f = xp1_03.v) == object && (xp1_02 = xp1_03.A()) != null) {
            xp1_03 = xp1_02;
        }
        int[] nArray = bq1$b$a.$EnumSwitchMapping$1;
        int n14 = ((Enum)object).ordinal();
        n14 = nArray[n14];
        if (n14 == n7) {
            int n15 = 6;
            xp1_0.Z(xp1_03, bl2, n15);
            return;
        }
        if (n14 == n4) {
            xp1_03.Y(bl2);
            return;
        }
        string2 = "Intrinsics isn't used by the parent".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public static void a0(xp1_0 object) {
        Object object2 = ((xp1_0)object).z.c;
        Object object3 = Xp1$g.$EnumSwitchMapping$0;
        int bl2 = ((Enum)object2).ordinal();
        boolean bl3 = object3[bl2];
        boolean bl4 = true;
        bq1 bq12 = ((xp1_0)object).z;
        if (bl3 == bl4) {
            boolean bl5 = bq12.g;
            int n3 = 6;
            if (bl5) {
                xp1_0.X((xp1_0)object, bl4, n3);
            } else {
                boolean bl6;
                boolean bl7 = bq12.h;
                if (bl7) {
                    ((xp1_0)object).W(bl4);
                }
                if (bl6 = bq12.d) {
                    xp1_0.Z((xp1_0)object, bl4, n3);
                } else {
                    boolean bl8 = bq12.e;
                    if (bl8) {
                        ((xp1_0)object).Y(bl4);
                    }
                }
            }
            return;
        }
        object2 = new StringBuilder("Unexpected state ");
        object3 = (Object)bq12.c;
        ((StringBuilder)object2).append(object3);
        object2 = ((StringBuilder)object2).toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final xp1_0 A() {
        boolean bl2;
        boolean bl3;
        xp1_0 xp1_02 = this.h;
        while (xp1_02 != null && (bl3 = xp1_02.a) == (bl2 = true)) {
            xp1_02 = xp1_02.h;
        }
        return xp1_02;
    }

    public final int B() {
        return this.z.r.h;
    }

    public final WR1 C() {
        boolean bl2 = this.o;
        WR1 wR1 = this.n;
        if (bl2) {
            wR1.g();
            Object object = this.D();
            int n3 = wR1.c;
            wR1.c(n3, (WR1)object);
            object = M;
            wR1.p((Comparator)object);
            bl2 = false;
            object = null;
            this.o = false;
        }
        return wR1;
    }

    public final WR1 D() {
        WR1 wR1;
        this.g0();
        int n3 = this.d;
        if (n3 == 0) {
            wR1 = this.e.a;
        } else {
            wR1 = this.f;
            Intrinsics.checkNotNull(wR1);
        }
        return wR1;
    }

    public final void E(long l2, C61 c61, boolean bl2, boolean bl3) {
        T32 t32 = this.y;
        w32_0 w32_02 = t32.c;
        long l3 = w32_02.g1(l2, true);
        w32_0 w32_03 = t32.c;
        W32$a w32$a = w32_0.N;
        w32_03.n1(w32$a, l3, c61, bl2, bl3);
    }

    public final void F(int n3, xp1_0 object) {
        boolean bl2;
        Object object2 = ((xp1_0)object).h;
        WR1 wR1 = null;
        int n4 = 1;
        if (object2 == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        String string2 = " Other tree: ";
        String string3 = "Cannot insert ";
        if (!bl2) {
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(object);
            stringBuilder.append(" because it already has a parent. This tree: ");
            object2 = this.q(0);
            stringBuilder.append((String)object2);
            stringBuilder.append(string2);
            object = ((xp1_0)object).h;
            if (object != null) {
                object = ((xp1_0)object).q(0);
            } else {
                boolean bl3 = false;
                object = null;
            }
            stringBuilder.append((String)object);
            bh1_1.c(stringBuilder.toString());
            throw null;
        }
        object2 = ((xp1_0)object).i;
        if (object2 == null) {
            ((xp1_0)object).h = this;
            object2 = this.e;
            wR1 = ((YR1)object2).a;
            wR1.a(n3, object);
            Object object3 = ((YR1)object2).b;
            object3.invoke();
            this.Q();
            n3 = (int)(((xp1_0)object).a ? 1 : 0);
            if (n3 != 0) {
                this.d = n3 = this.d + n4;
            }
            this.K();
            object3 = this.i;
            if (object3 != null) {
                ((xp1_0)object).n((sg2_0)object3);
            }
            object3 = ((xp1_0)object).z;
            n3 = ((bq1)object3).n;
            if (n3 > 0) {
                object3 = this.z;
                int n7 = ((bq1)object3).n + n4;
                ((bq1)object3).b(n7);
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(string3);
        stringBuilder.append(object);
        stringBuilder.append(" because it already has an owner. This tree: ");
        object2 = this.q(0);
        stringBuilder.append((String)object2);
        stringBuilder.append(string2);
        object = ((xp1_0)object).q(0);
        stringBuilder.append((String)object);
        bh1_1.c(stringBuilder.toString());
        throw null;
    }

    public final void G() {
        Object object;
        Object object2;
        boolean bl2 = this.C;
        if (bl2) {
            boolean bl3;
            object2 = this.y;
            object = ((T32)object2).b;
            object2 = ((T32)object2).c.q;
            this.B = null;
            while (!(bl3 = Intrinsics.areEqual(object, object2))) {
                Qg2 qg2;
                if (object != null) {
                    qg2 = ((w32_0)object).G;
                } else {
                    bl3 = false;
                    qg2 = null;
                }
                if (qg2 != null) {
                    this.B = object;
                    break;
                }
                if (object != null) {
                    object = ((w32_0)object).q;
                    continue;
                }
                object = null;
            }
        }
        if ((object2 = this.B) != null && (object = ((w32_0)object2).G) == null) {
            bh1_1.d("layer was not set");
            throw null;
        }
        if (object2 != null) {
            ((w32_0)object2).p1();
        } else {
            object2 = this.A();
            if (object2 != null) {
                ((xp1_0)object2).G();
            }
        }
    }

    public final void H() {
        Object object = this.y;
        w32_0 w32_02 = ((T32)object).c;
        Fh1 fh1 = ((T32)object).b;
        while (w32_02 != fh1) {
            Intrinsics.checkNotNull(w32_02, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            w32_02 = (sp1_1)w32_02;
            Qg2 qg2 = w32_02.G;
            if (qg2 != null) {
                qg2.invalidate();
            }
            w32_02 = w32_02.p;
        }
        object = ((T32)object).b.G;
        if (object != null) {
            object.invalidate();
        }
    }

    public final void I() {
        xp1_0 xp1_02 = this.c;
        int n3 = 7;
        if (xp1_02 != null) {
            xp1_0.X(this, false, n3);
        } else {
            xp1_0.Z(this, false, n3);
        }
    }

    public final void J() {
        this.m = null;
        aq1_0.a(this).x();
    }

    public final void K() {
        xp1_0 xp1_02;
        int n3 = this.d;
        if (n3 > 0) {
            n3 = 1;
            this.g = n3;
        }
        if ((n3 = (int)(this.a ? 1 : 0)) != 0 && (xp1_02 = this.h) != null) {
            xp1_02.K();
        }
    }

    public final boolean L() {
        return this.z.r.s;
    }

    public final Boolean M() {
        Object object = this.z.s;
        if (object != null) {
            boolean bl2 = ((bq1$a_0)object).q;
            object = bl2;
        } else {
            boolean bl3 = false;
            object = null;
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void N() {
        Throwable throwable2;
        block6: {
            boolean bl2;
            Object object;
            block4: {
                block5: {
                    Object object2 = this.v;
                    object = Xp1$f.NotUsed;
                    if (object2 == object) {
                        this.p();
                    }
                    object2 = this.z.s;
                    Intrinsics.checkNotNull(object2);
                    ((Object)object2).getClass();
                    bl2 = true;
                    try {
                        ((bq1$a_0)object2).f = bl2;
                        bl2 = ((bq1$a_0)object2).k;
                        if (!bl2) break block4;
                        ((bq1$a_0)object2).x = false;
                        bl2 = ((bq1$a_0)object2).q;
                        long l2 = ((bq1$a_0)object2).n;
                        Function1 function1 = ((bq1$a_0)object2).o;
                        W01 w01 = ((bq1$a_0)object2).p;
                        ((bq1$a_0)object2).y0(l2, function1, w01);
                        if (!bl2 || (bl2 = ((bq1$a_0)object2).x)) break block5;
                        object = ((bq1$a_0)object2).y;
                        object = ((bq1)object).a;
                        if ((object = ((xp1_0)object).A()) == null) break block5;
                        ((xp1_0)object).W(false);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                ((bq1$a_0)object2).f = false;
                return;
            }
            object = "replace() called on item that was not placed";
            {
                bh1_1.c((String)object);
                bl2 = false;
                object = null;
                throw null;
            }
        }
        ((bq1$a_0)object2).f = false;
        throw throwable2;
    }

    public final void O(int n3, int n4, int n7) {
        if (n3 == n4) {
            return;
        }
        for (int i3 = 0; i3 < n7; ++i3) {
            int n8 = n3 > n4 ? n3 + i3 : n3;
            int n10 = n3 > n4 ? n4 + i3 : n4 + n7 + -2;
            Object object = this.e;
            Object object2 = ((YR1)object).a.n(n8);
            Function0 function0 = ((YR1)object).b;
            function0.invoke();
            object2 = (xp1_0)object2;
            object = ((YR1)object).a;
            ((WR1)object).a(n10, object2);
            function0.invoke();
        }
        this.Q();
        this.K();
        this.I();
    }

    public final void P(xp1_0 objectArray) {
        int n3;
        Object object = objectArray.z;
        int n4 = ((bq1)object).n;
        if (n4 > 0) {
            object = this.z;
            n3 = ((bq1)object).n + -1;
            ((bq1)object).b(n3);
        }
        if ((object = this.i) != null) {
            objectArray.r();
        }
        n4 = 0;
        object = null;
        objectArray.h = null;
        w32_0 w32_02 = objectArray.y.c;
        w32_02.q = null;
        n3 = (int)(objectArray.a ? 1 : 0);
        if (n3 != 0) {
            this.d = n3 = this.d + -1;
            objectArray = objectArray.e.a;
            n3 = objectArray.c;
            if (n3 > 0) {
                objectArray = objectArray.a;
                int n7 = 0;
                do {
                    w32_0 w32_03 = ((xp1_0)objectArray[n7]).y.c;
                    w32_03.q = null;
                } while (++n7 < n3);
            }
        }
        this.K();
        this.Q();
    }

    public final void Q() {
        boolean bl2 = this.a;
        if (bl2) {
            xp1_0 xp1_02 = this.A();
            if (xp1_02 != null) {
                xp1_02.Q();
            }
        } else {
            this.o = bl2 = true;
        }
    }

    public final boolean R(c60 c602) {
        boolean bl2;
        if (c602 != null) {
            Object object = this.v;
            Xp1$f xp1$f = Xp1$f.NotUsed;
            if (object == xp1$f) {
                this.o();
            }
            object = this.z.r;
            long l2 = c602.a;
            bl2 = ((bq1$b)object).B0(l2);
        } else {
            bl2 = false;
            c602 = null;
        }
        return bl2;
    }

    public final void T() {
        WR1 wR1;
        YR1 yR1 = this.e;
        WR1 wR12 = yR1.a;
        int n3 = wR12.c + -1;
        while (true) {
            int n4 = -1;
            wR1 = yR1.a;
            if (n4 >= n3) break;
            xp1_0 xp1_02 = (xp1_0)wR1.a[n3];
            this.P(xp1_02);
            n3 += -1;
        }
        wR1.g();
        yR1.b.invoke();
    }

    public final void U(int n3, int n4) {
        if (n4 >= 0) {
            if (n3 <= (n4 = n4 + n3 + -1)) {
                while (true) {
                    Object object = this.e;
                    Object object2 = (xp1_0)((YR1)object).a.a[n4];
                    this.P((xp1_0)object2);
                    object2 = ((YR1)object).a.n(n4);
                    object = ((YR1)object).b;
                    object.invoke();
                    object2 = (xp1_0)object2;
                    if (n4 == n3) break;
                    n4 += -1;
                }
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("count (");
        stringBuilder.append(n4);
        stringBuilder.append(") must be greater than 0");
        bh1_1.b(stringBuilder.toString());
        throw null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void V() {
        Throwable throwable2;
        block6: {
            boolean bl2;
            Object object;
            block4: {
                block5: {
                    Object object2 = this.v;
                    object = Xp1$f.NotUsed;
                    if (object2 == object) {
                        this.p();
                    }
                    object2 = this.z.r;
                    ((Object)object2).getClass();
                    bl2 = true;
                    try {
                        ((bq1$b)object2).f = bl2;
                        bl2 = ((bq1$b)object2).j;
                        if (!bl2) break block4;
                        boolean bl3 = ((bq1$b)object2).s;
                        long l2 = ((bq1$b)object2).m;
                        float f5 = ((bq1$b)object2).p;
                        Function1 function1 = ((bq1$b)object2).n;
                        W01 w01 = ((bq1$b)object2).o;
                        object = object2;
                        ((bq1$b)object2).z0(l2, f5, function1, w01);
                        if (!bl3 || (bl2 = ((bq1$b)object2).A)) break block5;
                        object = ((bq1$b)object2).H;
                        object = ((bq1)object).a;
                        if ((object = ((xp1_0)object).A()) == null) break block5;
                        ((xp1_0)object).Y(false);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                ((bq1$b)object2).f = false;
                return;
            }
            object = "replace called on unplaced item";
            {
                bh1_1.c((String)object);
                bl2 = false;
                object = null;
                throw null;
            }
        }
        ((bq1$b)object2).f = false;
        throw throwable2;
    }

    public final void W(boolean bl2) {
        sg2_0 sg2_02;
        boolean bl3 = this.a;
        if (!bl3 && (sg2_02 = this.i) != null) {
            boolean bl4 = true;
            sg2_02.l(this, bl4, bl2);
        }
    }

    public final void Y(boolean bl2) {
        sg2_0 sg2_02;
        boolean bl3 = this.a;
        if (!bl3 && (sg2_02 = this.i) != null) {
            sg2_02.l(this, false, bl2);
        }
    }

    public final void a() {
        boolean bl2;
        Object object = this.j;
        if (object != null) {
            ((AndroidViewHolder)object).a();
        }
        if ((object = this.A) != null) {
            ((jq1_2)object).a();
        }
        object = this.y;
        w32_0 w32_02 = ((T32)object).c;
        object = ((T32)object).b.p;
        while (!(bl2 = Intrinsics.areEqual(w32_02, object)) && w32_02 != null) {
            w32_02.r = bl2 = true;
            w32_02.E.invoke();
            Object object2 = w32_02.G;
            if (object2 != null) {
                object2 = w32_02.H;
                xp1_0 xp1_02 = null;
                if (object2 != null) {
                    w32_02.H = null;
                }
                bl2 = false;
                object2 = null;
                w32_02.E1(null, false);
                xp1_02 = w32_02.m;
                xp1_02.Y(false);
            }
            w32_02 = w32_02.p;
        }
    }

    public final xp1_0 b() {
        return this.A();
    }

    public final void b0() {
        Object[] objectArray = this.D();
        int n3 = objectArray.c;
        if (n3 > 0) {
            objectArray = objectArray.a;
            int n4 = 0;
            do {
                Xp1$f xp1$f;
                xp1_0 xp1_02 = (xp1_0)objectArray[n4];
                xp1_02.v = xp1$f = xp1_02.w;
                Xp1$f xp1$f2 = Xp1$f.NotUsed;
                if (xp1$f == xp1$f2) continue;
                xp1_02.b0();
            } while (++n4 < n3);
        }
    }

    public final void c() {
        boolean bl2;
        Object object = this.j;
        if (object != null) {
            ((AndroidViewHolder)object).c();
        }
        object = this.A;
        boolean bl3 = true;
        if (object != null) {
            ((jq1_2)object).e(bl3);
        }
        this.I = bl3;
        object = this.y;
        Object object2 = ((T32)object).d;
        while (object2 != null) {
            bl2 = ((LP1$c)object2).m;
            if (bl2) {
                ((LP1$c)object2).m1();
            }
            object2 = ((LP1$c)object2).e;
        }
        object2 = object = ((T32)object).d;
        while (object2 != null) {
            bl2 = ((LP1$c)object2).m;
            if (bl2) {
                ((LP1$c)object2).o1();
            }
            object2 = ((LP1$c)object2).e;
        }
        while (object != null) {
            bl3 = ((LP1$c)object).m;
            if (bl3) {
                ((LP1$c)object).i1();
            }
            object = ((LP1$c)object).e;
        }
        boolean bl4 = this.e();
        if (bl4) {
            this.J();
        }
    }

    public final void c0(Vo0 object) {
        Object object2 = this.r;
        int n3 = Intrinsics.areEqual(object2, object);
        if (n3 == 0) {
            this.r = object;
            this.I();
            object = this.A();
            if (object != null) {
                ((xp1_0)object).G();
            }
            this.H();
            object = this.y.e;
            while (object != null) {
                n3 = ((LP1$c)object).c & 0x10;
                if (n3 != 0) {
                    object2 = object;
                    object2 = (gw2_0)object;
                    object2.F0();
                } else {
                    n3 = object instanceof ui_0;
                    if (n3 != 0) {
                        object2 = object;
                        object2 = (ui_0)object;
                        object2.q0();
                    }
                }
                object = ((LP1$c)object).f;
            }
        }
    }

    public final List d() {
        Object object = this.y;
        Object object2 = ((T32)object).f;
        if (object2 == null) {
            object = mz0_2.a;
        } else {
            Object object3;
            int n3 = ((WR1)object2).c;
            Object object4 = new NP1[n3];
            WR1 wR1 = new WR1((Object[])object4);
            object4 = ((T32)object).e;
            int n4 = 0;
            LP1 lP1 = null;
            while (object4 != null && object4 != (object3 = ((T32)object).d)) {
                w32_0 w32_02 = object4.h;
                if (w32_02 != null) {
                    int n7;
                    Qg2 qg2 = w32_02.G;
                    Qg2 qg22 = ((T32)object).b.G;
                    Object[] objectArray = object4.f;
                    if (objectArray != object3 || w32_02 == (object3 = objectArray.h)) {
                        n7 = 0;
                        qg22 = null;
                    }
                    if (qg2 == null) {
                        qg2 = qg22;
                    }
                    n7 = n4 + 1;
                    objectArray = ((WR1)object2).a;
                    lP1 = (LP1)objectArray[n4];
                    object3 = new NP1(lP1, w32_02, qg2);
                    wR1.b(object3);
                    object4 = object4.f;
                    n4 = n7;
                    continue;
                }
                object2 = "getModifierInfo called on node with no coordinator".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object = wR1.f();
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void d0(bp1_0 object) {
        bp1_0 bp1_02 = this.s;
        if (bp1_02 == object) return;
        this.s = object;
        this.I();
        object = this.A();
        if (object != null) {
            ((xp1_0)object).G();
        }
        this.H();
        object = this.y.e;
        int n3 = ((LP1$c)object).d & 4;
        if (n3 == 0) return;
        while (object != null) {
            n3 = ((LP1$c)object).c & 4;
            if (n3 != 0) {
                n3 = 0;
                bp1_02 = null;
                Object object2 = object;
                WR1 wR1 = null;
                while (object2 != null) {
                    int n4 = object2 instanceof it0_0;
                    if (n4 != 0) {
                        n4 = (object2 = (it0_0)object2) instanceof ui_0;
                        if (n4 != 0) {
                            object2 = (ui_0)object2;
                            object2.q0();
                        }
                    } else {
                        n4 = ((LP1$c)object2).c & 4;
                        if (n4 != 0 && (n4 = object2 instanceof mo0_0) != 0) {
                            int n7;
                            Object object3 = object2;
                            object3 = ((mo0_0)object2).o;
                            int n8 = 0;
                            while (true) {
                                n7 = 1;
                                if (object3 == null) break;
                                int n10 = ((LP1$c)object3).c & 4;
                                if (n10 != 0) {
                                    if (++n8 == n7) {
                                        object2 = object3;
                                    } else {
                                        if (wR1 == null) {
                                            n7 = 16;
                                            Object[] objectArray = new LP1$c[n7];
                                            wR1 = new WR1(objectArray);
                                        }
                                        if (object2 != null) {
                                            wR1.b(object2);
                                            object2 = null;
                                        }
                                        wR1.b(object3);
                                    }
                                }
                                object3 = ((LP1$c)object3).f;
                            }
                            if (n8 == n7) continue;
                        }
                    }
                    object2 = go0.b(wR1);
                }
            }
            if ((n3 = ((LP1$c)object).d & 4) == 0) return;
            object = ((LP1$c)object).f;
        }
    }

    public final boolean e() {
        boolean bl2;
        sg2_0 sg2_02 = this.i;
        if (sg2_02 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            sg2_02 = null;
        }
        return bl2;
    }

    public final void e0(xp1_0 object) {
        Object object2 = this.c;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (!bl2) {
            this.c = object;
            if (object != null) {
                boolean bl3;
                object = this.z;
                object2 = ((bq1)object).s;
                if (object2 == null) {
                    ((bq1)object).s = object2 = new bq1$a_0((bq1)object);
                }
                object = this.y;
                object2 = ((T32)object).c;
                object = ((T32)object).b.p;
                while (!(bl3 = Intrinsics.areEqual(object2, object)) && object2 != null) {
                    ((w32_0)object2).c1();
                    object2 = ((w32_0)object2).p;
                }
            }
            this.I();
        }
    }

    public final void f() {
        c60 c602;
        Object object = this.c;
        boolean bl2 = false;
        int n3 = 5;
        if (object != null) {
            xp1_0.X(this, false, n3);
        } else {
            xp1_0.Z(this, false, n3);
        }
        object = this.z.r;
        boolean bl3 = ((bq1$b)object).i;
        if (bl3) {
            long l2 = ((Ns2)object).d;
            c602 = new c60(l2);
        } else {
            n3 = 0;
            c602 = null;
        }
        if (c602 != null) {
            object = this.i;
            if (object != null) {
                long l3 = c602.a;
                object.m(this, l3);
            }
        } else {
            object = this.i;
            if (object != null) {
                int n4 = Rg2.a;
                boolean bl4 = true;
                object.b(bl4);
            }
        }
    }

    public final void f0(NC3 object) {
        NC3 nC3 = this.t;
        int n3 = Intrinsics.areEqual(nC3, object);
        if (n3 == 0) {
            this.t = object;
            object = this.y.e;
            n3 = ((LP1$c)object).d;
            int n4 = 16;
            if ((n3 &= n4) != 0) {
                while (object != null) {
                    n3 = ((LP1$c)object).c & n4;
                    if (n3 != 0) {
                        n3 = 0;
                        nC3 = null;
                        Object object2 = object;
                        WR1 wR1 = null;
                        while (object2 != null) {
                            int n7 = object2 instanceof gw2_0;
                            if (n7 != 0) {
                                object2 = (gw2_0)object2;
                                object2.a1();
                            } else {
                                n7 = ((LP1$c)object2).c & n4;
                                if (n7 != 0 && (n7 = object2 instanceof mo0_0) != 0) {
                                    int n8;
                                    Object object3 = object2;
                                    object3 = ((mo0_0)object2).o;
                                    int n10 = 0;
                                    while (true) {
                                        n8 = 1;
                                        if (object3 == null) break;
                                        int n14 = ((LP1$c)object3).c & n4;
                                        if (n14 != 0) {
                                            if (++n10 == n8) {
                                                object2 = object3;
                                            } else {
                                                if (wR1 == null) {
                                                    Object[] objectArray = new LP1$c[n4];
                                                    wR1 = new WR1(objectArray);
                                                }
                                                if (object2 != null) {
                                                    wR1.b(object2);
                                                    object2 = null;
                                                }
                                                wR1.b(object3);
                                            }
                                        }
                                        object3 = ((LP1$c)object3).f;
                                    }
                                    if (n10 == n8) continue;
                                }
                            }
                            object2 = go0.b(wR1);
                        }
                    }
                    if ((n3 = ((LP1$c)object).d & n4) == 0) break;
                    object = ((LP1$c)object).f;
                }
            }
        }
    }

    public final void g() {
        int n3 = this.e();
        if (n3 != 0) {
            Object object = this.j;
            if (object != null) {
                ((AndroidViewHolder)object).g();
            }
            object = this.A;
            int n4 = 0;
            Object object2 = null;
            if (object != null) {
                ((jq1_2)object).e(false);
            }
            n3 = this.I;
            T32 t32 = this.y;
            if (n3 != 0) {
                this.I = false;
                this.J();
            } else {
                object = t32.d;
                while (object != null) {
                    n4 = ((LP1$c)object).m;
                    if (n4 != 0) {
                        ((LP1$c)object).m1();
                    }
                    object = ((LP1$c)object).e;
                }
                object2 = object = t32.d;
                while (object2 != null) {
                    boolean bl2 = ((LP1$c)object2).m;
                    if (bl2) {
                        ((LP1$c)object2).o1();
                    }
                    object2 = ((LP1$c)object2).e;
                }
                while (object != null) {
                    n4 = (int)(((LP1$c)object).m ? 1 : 0);
                    if (n4 != 0) {
                        ((LP1$c)object).i1();
                    }
                    object = ((LP1$c)object).e;
                }
            }
            object = CY2.a;
            n4 = 1;
            this.b = n3 = ((AtomicInteger)object).addAndGet(n4);
            object = t32.e;
            while (object != null) {
                ((LP1$c)object).h1();
                object = ((LP1$c)object).f;
            }
            t32.e();
            xp1_0.a0(this);
            return;
        }
        bh1_1.b("onReuse is only expected on attached node");
        throw null;
    }

    public final void g0() {
        int n3 = this.d;
        if (n3 > 0 && (n3 = (int)(this.g ? 1 : 0)) != 0) {
            Object[] objectArray;
            int n4;
            n3 = 0;
            Object object = null;
            this.g = false;
            Object object2 = this.f;
            if (object2 == null) {
                n4 = 16;
                objectArray = new xp1_0[n4];
                object2 = new WR1(objectArray);
                this.f = object2;
            }
            ((WR1)object2).g();
            objectArray = this.e.a;
            int n7 = objectArray.c;
            if (n7 > 0) {
                objectArray = objectArray.a;
                do {
                    Object object3 = (xp1_0)objectArray[n3];
                    int n8 = ((xp1_0)object3).a;
                    if (n8 != 0) {
                        object3 = ((xp1_0)object3).D();
                        n8 = ((WR1)object2).c;
                        ((WR1)object2).c(n8, (WR1)object3);
                        continue;
                    }
                    ((WR1)object2).b(object3);
                } while (++n3 < n7);
            }
            object = this.z;
            object2 = ((bq1)object).r;
            n4 = 1;
            ((bq1$b)object2).w = n4;
            object = ((bq1)object).s;
            if (object != null) {
                ((bq1$a_0)object).t = n4;
            }
        }
    }

    public final int getHeight() {
        return this.z.r.b;
    }

    public final int getWidth() {
        return this.z.r.a;
    }

    public final void h() {
        block17: {
            LP1$c lP1$c;
            int n3;
            int n4;
            Object object;
            T32 t32;
            int n7;
            block16: {
                block15: {
                    n7 = 1;
                    t32 = this.y;
                    object = t32.b;
                    n4 = 128;
                    n3 = c42_0.h(n4);
                    if (n3 == 0) break block15;
                    lP1$c = ((Fh1)object).P;
                    break block16;
                }
                lP1$c = ((Fh1)object).P.e;
                if (lP1$c == null) break block17;
            }
            Object object2 = w32_0.I;
            object = ((w32_0)object).l1(n3 != 0);
            while (object != null && (n3 = ((LP1$c)object).d & n4) != 0) {
                n3 = ((LP1$c)object).c & n4;
                if (n3 != 0) {
                    n3 = 0;
                    object2 = object;
                    WR1 wR1 = null;
                    while (object2 != null) {
                        Object object3;
                        int n8 = object2 instanceof xp1_1;
                        if (n8 != 0) {
                            object2 = (xp1_1)object2;
                            object3 = t32.b;
                            object2.o0((zp1)object3);
                        } else {
                            n8 = ((LP1$c)object2).c & n4;
                            if (n8 != 0 && (n8 = object2 instanceof mo0_0) != 0) {
                                object3 = object2;
                                object3 = ((mo0_0)object2).o;
                                int n10 = 0;
                                while (object3 != null) {
                                    int n14 = ((LP1$c)object3).c & n4;
                                    if (n14 != 0) {
                                        if ((n10 += n7) == n7) {
                                            object2 = object3;
                                        } else {
                                            if (wR1 == null) {
                                                n14 = 16;
                                                Object[] objectArray = new LP1$c[n14];
                                                wR1 = new WR1(objectArray);
                                            }
                                            if (object2 != null) {
                                                wR1.b(object2);
                                                object2 = null;
                                            }
                                            wR1.b(object3);
                                        }
                                    }
                                    object3 = ((LP1$c)object3).f;
                                }
                                if (n10 == n7) continue;
                            }
                        }
                        object2 = go0.b(wR1);
                    }
                }
                if (object == lP1$c) break;
                object = ((LP1$c)object).f;
            }
        }
    }

    public final void i(al1_1 al1_12) {
        Object object = this.p;
        boolean bl2 = Intrinsics.areEqual(object, al1_12);
        if (!bl2) {
            this.p = al1_12;
            object = this.q;
            if (object != null) {
                object = ((ek1_0)object).b;
                ((h83_0)object).setValue(al1_12);
            }
            this.I();
        }
    }

    public final zp1 j() {
        return this.y.b;
    }

    public final void k(M30 object) {
        this.u = object;
        Object object2 = O30.f;
        object2 = (Vo0)object.a((H30)object2);
        this.c0((Vo0)object2);
        object2 = O30.l;
        object2 = (bp1_0)((Object)object.a((H30)object2));
        this.d0((bp1_0)((Object)object2));
        object2 = O30.q;
        object = (NC3)object.a((H30)object2);
        this.f0((NC3)object);
        object = this.y.e;
        int n3 = ((LP1$c)object).d;
        int n4 = 32768;
        if ((n3 &= n4) != 0) {
            while (object != null) {
                n3 = ((LP1$c)object).c & n4;
                if (n3 != 0) {
                    n3 = 0;
                    object2 = null;
                    Object object3 = object;
                    WR1 wR1 = null;
                    while (object3 != null) {
                        int n7 = object3 instanceof J30;
                        int n8 = 1;
                        if (n7 != 0) {
                            object3 = ((J30)object3).e();
                            n7 = (int)(((LP1$c)object3).m ? 1 : 0);
                            if (n7 != 0) {
                                c42_0.d((LP1$c)object3);
                            } else {
                                ((LP1$c)object3).j = n8;
                            }
                        } else {
                            n7 = ((LP1$c)object3).c & n4;
                            if (n7 != 0 && (n7 = object3 instanceof mo0_0) != 0) {
                                Object object4 = object3;
                                object4 = ((mo0_0)object3).o;
                                int n10 = 0;
                                while (object4 != null) {
                                    int n14 = ((LP1$c)object4).c & n4;
                                    if (n14 != 0) {
                                        if (++n10 == n8) {
                                            object3 = object4;
                                        } else {
                                            if (wR1 == null) {
                                                n14 = 16;
                                                Object[] objectArray = new LP1$c[n14];
                                                wR1 = new WR1(objectArray);
                                            }
                                            if (object3 != null) {
                                                wR1.b(object3);
                                                object3 = null;
                                            }
                                            wR1.b(object4);
                                        }
                                    }
                                    object4 = ((LP1$c)object4).f;
                                }
                                if (n10 == n8) continue;
                            }
                        }
                        object3 = go0.b(wR1);
                    }
                }
                if ((n3 = ((LP1$c)object).d & n4) == 0) break;
                object = ((LP1$c)object).f;
            }
        }
    }

    public final void l(LP1 lP1) {
        LP1$a lP1$a;
        LP1 lP12;
        boolean bl2 = this.a;
        boolean bl3 = true;
        if (bl2 && (lP12 = this.D) != (lP1$a = LP1$a.b)) {
            bl2 = false;
            lP12 = null;
        } else {
            bl2 = true;
        }
        lP1$a = null;
        if (bl2) {
            bl2 = this.I ^ bl3;
            if (bl2) {
                bl2 = this.e();
                if (bl2) {
                    this.m(lP1);
                } else {
                    this.E = lP1;
                }
                return;
            }
            bh1_1.b("modifier is updated when deactivated");
            throw null;
        }
        bh1_1.b("Modifiers are not supported on virtual LayoutNodes");
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void m(LP1 var1_1) {
        block41: {
            block40: {
                block44: {
                    block42: {
                        block43: {
                            block39: {
                                var2_2 = this;
                                var3_3 /* !! */  = var1_1;
                                this.D = var1_1;
                                var4_4 = this.y;
                                var5_5 = var4_4.e;
                                var6_6 = U32.a;
                                if (var5_5 == var6_6) break block41;
                                var5_5.e = var6_6;
                                var6_6.f = var5_5;
                                var7_7 = var4_4.f;
                                if (var7_7 != null) {
                                    var8_8 = var7_7.c;
                                } else {
                                    var8_8 = 0;
                                    var9_9 = null;
                                }
                                var10_10 /* !! */  = var4_4.g;
                                var11_11 = 16;
                                if (var10_10 /* !! */  == null) {
                                    var12_12 = new LP1$b[var11_11];
                                    var10_10 /* !! */  = new WR1((Object[])var12_12);
                                }
                                var13_13 = var10_10 /* !! */ ;
                                var14_14 = var10_10 /* !! */ .c;
                                if (var14_14 < var11_11) {
                                    var14_14 = 16;
                                }
                                var10_10 /* !! */  = new LP1[var14_14];
                                var12_12 = new WR1(var10_10 /* !! */ );
                                var12_12.b(var3_3 /* !! */ );
                                var15_15 = 0;
                                var3_3 /* !! */  = null;
                                while (true) {
                                    var14_14 = (int)var12_12.l();
                                    var16_16 = 1;
                                    if (var14_14 == 0) break;
                                    var14_14 = var12_12.c - var16_16;
                                    var10_10 /* !! */  = (LP1)var12_12.n(var14_14);
                                    if ((var16_16 = var10_10 /* !! */  instanceof xZ) != 0) {
                                        var10_10 /* !! */  = (xZ)var10_10 /* !! */ ;
                                        var17_17 = var10_10 /* !! */ .c;
                                        var12_12.b(var17_17);
                                        var10_10 /* !! */  = var10_10 /* !! */ .b;
                                        var12_12.b(var10_10 /* !! */ );
                                        continue;
                                    }
                                    var16_16 = var10_10 /* !! */  instanceof LP1$b;
                                    if (var16_16 != 0) {
                                        var13_13.b(var10_10 /* !! */ );
                                        continue;
                                    }
                                    if (var3_3 /* !! */  == null) {
                                        var3_3 /* !! */  = new v32_0((WR1)var13_13);
                                    }
                                    var17_17 = var3_3 /* !! */ ;
                                    var10_10 /* !! */ .all((Function1)var3_3 /* !! */ );
                                }
                                var15_15 = var13_13.c;
                                var18_18 = var4_4.d;
                                var10_10 /* !! */  = "expected prior modifier list to be non-empty";
                                var12_12 = var4_4.a;
                                if (var15_15 != var8_8) break block42;
                                var3_3 /* !! */  = var6_6.f;
                                for (var11_11 = 0; var3_3 /* !! */  != null && var11_11 < var8_8; ++var11_11) {
                                    if (var7_7 != null) {
                                        var19_19 /* !! */  = (LP1$b)var7_7.a[var11_11];
                                        var20_20 = (LP1$b)var13_13.a[var11_11];
                                        var21_21 = Intrinsics.areEqual(var19_19 /* !! */ , var20_20);
                                        if (var21_21 != 0) {
                                            var21_21 = 2;
                                            var22_22 = 2;
                                        } else {
                                            var21_21 = (int)U3.a(var19_19 /* !! */ , var20_20);
                                            if (var21_21 != 0) {
                                                var22_22 = 1;
                                            } else {
                                                var22_22 = 0;
                                                var5_5 = null;
                                            }
                                        }
                                        if (var22_22 != 0) {
                                            if (var22_22 == var16_16) {
                                                T32.h((LP1$b)var19_19 /* !! */ , var20_20, (LP1$c)var3_3 /* !! */ );
                                            }
                                            var3_3 /* !! */  = var3_3 /* !! */ .f;
                                            continue;
                                        }
                                        var3_3 /* !! */  = var3_3 /* !! */ .e;
                                        break;
                                    }
                                    break block39;
                                }
                                break block43;
                            }
                            bh1_1.d((String)var10_10 /* !! */ );
                            throw null;
                        }
                        var19_19 /* !! */  = var3_3 /* !! */ ;
                        if (var11_11 < var8_8) {
                            if (var7_7 != null) {
                                if (var3_3 /* !! */  != null) {
                                    var3_3 /* !! */  = var12_12.E;
                                    if (var3_3 /* !! */  != null) {
                                        var22_22 = 1;
                                    } else {
                                        var22_22 = 0;
                                        var5_5 = null;
                                    }
                                    var23_23 = var22_22 ^ 1;
                                    var3_3 /* !! */  = var4_4;
                                    var22_22 = var11_11;
                                    var9_9 = var7_7;
                                    var10_10 /* !! */  = var13_13;
                                    var4_4.f(var11_11, var7_7, (WR1)var13_13, (LP1$c)var19_19 /* !! */ , var23_23);
lbl103:
                                    // 3 sources

                                    while (true) {
                                        var22_22 = 1;
                                        break block40;
                                        break;
                                    }
                                }
                                bh1_1.d("structuralUpdate requires a non-null tail");
                                throw null;
                            }
                            bh1_1.d((String)var10_10 /* !! */ );
                            throw null;
                        }
                        ** GOTO lbl146
                    }
                    var5_5 = var12_12.E;
                    if (var5_5 == null || var8_8 != 0) break block44;
                    var5_5 = var6_6;
                    var3_3 /* !! */  = null;
                    for (var15_15 = 0; var15_15 < (var8_8 = var13_13.c); ++var15_15) {
                        var9_9 = (LP1$b)var13_13.a[var15_15];
                        var5_5 = T32.b((LP1$b)var9_9, (LP1$c)var5_5);
                    }
                    var3_3 /* !! */  = var18_18.e;
                    var22_22 = 0;
                    var5_5 = null;
                    while (true) {
                        if (var3_3 /* !! */  == null || var3_3 /* !! */  == (var9_9 = U32.a)) ** GOTO lbl103
                        var8_8 = var3_3 /* !! */ .c;
                        var3_3 /* !! */ .d = var22_22 |= var8_8;
                        var3_3 /* !! */  = var3_3 /* !! */ .e;
                    }
                }
                if (var15_15 != 0) ** GOTO lbl151
                if (var7_7 != null) {
                    var3_3 /* !! */  = var6_6.f;
                    var5_5 = null;
                    for (var22_22 = 0; var3_3 /* !! */  != null && var22_22 < (var8_8 = var7_7.c); ++var22_22) {
                        var3_3 /* !! */  = T32.c((LP1$c)var3_3 /* !! */ ).f;
                    }
                    var3_3 /* !! */  = var12_12.A();
                    if (var3_3 /* !! */  != null) {
                        var3_3 /* !! */  = var3_3 /* !! */ .y.b;
                    } else {
                        var15_15 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var5_5 = var4_4.b;
                    var5_5.q = var3_3 /* !! */ ;
                    var4_4.c = var5_5;
lbl146:
                    // 2 sources

                    var22_22 = 0;
                    var5_5 = null;
                } else {
                    bh1_1.d((String)var10_10 /* !! */ );
                    throw null;
lbl151:
                    // 1 sources

                    if (var7_7 == null) {
                        var3_3 /* !! */  = new LP1$b[var11_11];
                        var7_7 = new WR1(var3_3 /* !! */ );
                    }
                    if (var5_5 != null) {
                        var22_22 = 1;
                    } else {
                        var22_22 = 0;
                        var5_5 = null;
                    }
                    var23_24 = var22_22 ^ true;
                    var22_22 = 0;
                    var5_5 = null;
                    var3_3 /* !! */  = var4_4;
                    var9_9 = var7_7;
                    var10_10 /* !! */  = var13_13;
                    var4_4.f(0, var7_7, (WR1)var13_13, var6_6, var23_24);
                    ** continue;
                }
            }
            var4_4.f = var13_13;
            if (var7_7 != null) {
                var7_7.g();
            } else {
                var7_7 = null;
            }
            var4_4.g = var7_7;
            var3_3 /* !! */  = U32.a;
            if (var6_6 == var3_3 /* !! */ ) {
                var9_9 = var3_3 /* !! */ .f;
                if (var9_9 != null) {
                    var18_18 = var9_9;
                }
                var18_18.e = null;
                var3_3 /* !! */ .f = null;
                var3_3 /* !! */ .d = var8_8 = -1;
                var3_3 /* !! */ .h = null;
                if (var18_18 != var3_3 /* !! */ ) {
                    var4_4.e = var18_18;
                    if (var22_22 != 0) {
                        var4_4.g();
                    }
                    var2_2.z.h();
                    var3_3 /* !! */  = var2_2.c;
                    if (var3_3 /* !! */  == null && (var15_15 = (int)var4_4.d(512)) != 0) {
                        var2_2.e0(var2_2);
                    }
                    return;
                }
                bh1_1.c("trimChain did not update the head");
                throw null;
            }
            bh1_1.c("trimChain called on already trimmed chain");
            throw null;
        }
        bh1_1.c("padChain called on already padded chain");
        throw null;
    }

    public final void n(sg2_0 object) {
        int n3;
        Object object2 = this.i;
        int n4 = 1;
        if (object2 == null) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        boolean n7 = false;
        Object object3 = null;
        if (n3 != 0) {
            boolean bl2;
            boolean bl3;
            boolean bl4;
            int n8;
            Fh1 fh1;
            Object object4;
            object2 = this.h;
            if (object2 != null && (n3 = Intrinsics.areEqual(object2 = ((xp1_0)object2).i, object)) == 0) {
                boolean bl5;
                String string2 = "Attaching to a different owner(";
                object2 = new StringBuilder(string2);
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(") than the parent's owner(");
                object = this.A();
                if (object != null) {
                    object = ((xp1_0)object).i;
                } else {
                    bl5 = false;
                    object = null;
                }
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append("). This tree: ");
                object = this.q(0);
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append(" Parent tree: ");
                object = this.h;
                if (object != null) {
                    object = ((xp1_0)object).q(0);
                } else {
                    bl5 = false;
                    object = null;
                }
                ((StringBuilder)object2).append((String)object);
                bh1_1.c(((StringBuilder)object2).toString());
                throw null;
            }
            object2 = this.A();
            bq1 bq12 = this.z;
            if (object2 == null) {
                bq12.r.s = n4;
                object4 = bq12.s;
                if (object4 != null) {
                    ((bq1$a_0)object4).q = n4;
                }
            }
            object4 = this.y;
            Object object5 = ((T32)object4).c;
            if (object2 != null) {
                fh1 = ((xp1_0)object2).y.b;
            } else {
                n8 = 0;
                fh1 = null;
            }
            ((w32_0)object5).q = fh1;
            this.i = object;
            int n10 = object2 != null ? ((xp1_0)object2).k : -1;
            this.k = n10 += n4;
            object5 = this.E;
            if (object5 != null) {
                this.m((LP1)object5);
            }
            this.E = null;
            boolean bl6 = ((T32)object4).d(8);
            if (bl6) {
                this.J();
            }
            object.getClass();
            object3 = this.h;
            if (object3 == null || (object3 = object3.c) == null) {
                object3 = this.c;
            }
            this.e0((xp1_0)object3);
            object3 = this.c;
            if (object3 == null && (bl4 = ((T32)object4).d(512))) {
                this.e0(this);
            }
            if (!(bl3 = this.I)) {
                object3 = ((T32)object4).e;
                while (object3 != null) {
                    object3.h1();
                    object3 = object3.f;
                }
            }
            object3 = this.e.a;
            n10 = object3.c;
            if (n10 > 0) {
                object3 = object3.a;
                n8 = 0;
                fh1 = null;
                do {
                    xp1_0 xp1_02 = (xp1_0)object3[n8];
                    xp1_02.n((sg2_0)object);
                } while ((n8 += n4) < n10);
            }
            if (!(bl2 = this.I)) {
                ((T32)object4).e();
            }
            this.I();
            if (object2 != null) {
                ((xp1_0)object2).I();
            }
            object2 = ((T32)object4).c;
            object3 = ((T32)object4).b.p;
            while ((n10 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0)) == 0 && object2 != null) {
                object5 = ((w32_0)object2).t;
                ((w32_0)object2).E1((Function1)object5, n4 != 0);
                object5 = ((w32_0)object2).G;
                if (object5 != null) {
                    object5.invalidate();
                }
                object2 = ((w32_0)object2).p;
            }
            object2 = this.F;
            if (object2 != null) {
                object2.invoke(object);
            }
            bq12.h();
            boolean bl7 = this.I;
            if (!bl7) {
                object = ((T32)object4).e;
                n3 = ((LP1$c)object).d & 0x1C00;
                if (n3 != 0) {
                    while (object != null) {
                        n3 = ((LP1$c)object).c;
                        int n14 = n3 & 0x400;
                        if (n14 != 0) {
                            n14 = 1;
                        } else {
                            n14 = 0;
                            object3 = null;
                        }
                        int n15 = n3 & 0x800;
                        if (n15 != 0) {
                            n15 = 1;
                        } else {
                            n15 = 0;
                            bq12 = null;
                        }
                        n14 |= n15;
                        if ((n3 &= 0x1000) != 0) {
                            n3 = 1;
                        } else {
                            n3 = 0;
                            object2 = null;
                        }
                        if ((n3 |= n14) != 0) {
                            c42_0.a((LP1$c)object);
                        }
                        object = ((LP1$c)object).f;
                    }
                }
            }
            return;
        }
        object = new StringBuilder("Cannot attach ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" as it already is attached.  Tree: ");
        object2 = this.q(0);
        ((StringBuilder)object).append((String)object2);
        bh1_1.c(((StringBuilder)object).toString());
        throw null;
    }

    public final void o() {
        Object[] objectArray = this.v;
        this.w = objectArray;
        objectArray = Xp1$f.NotUsed;
        this.v = objectArray;
        objectArray = this.D();
        int n3 = objectArray.c;
        if (n3 > 0) {
            objectArray = objectArray.a;
            int n4 = 0;
            do {
                xp1_0 xp1_02 = (xp1_0)objectArray[n4];
                Xp1$f xp1$f = xp1_02.v;
                Xp1$f xp1$f2 = Xp1$f.NotUsed;
                if (xp1$f == xp1$f2) continue;
                xp1_02.o();
            } while (++n4 < n3);
        }
    }

    public final void p() {
        Object[] objectArray = this.v;
        this.w = objectArray;
        objectArray = Xp1$f.NotUsed;
        this.v = objectArray;
        objectArray = this.D();
        int n3 = objectArray.c;
        if (n3 > 0) {
            objectArray = objectArray.a;
            int n4 = 0;
            do {
                xp1_0 xp1_02 = (xp1_0)objectArray[n4];
                Xp1$f xp1$f = xp1_02.v;
                Xp1$f xp1$f2 = Xp1$f.InLayoutBlock;
                if (xp1$f != xp1$f2) continue;
                xp1_02.p();
            } while (++n4 < n3);
        }
    }

    public final String q(int n3) {
        char c2;
        CharSequence charSequence = new StringBuilder();
        Object[] objectArray = null;
        for (c2 = '\u0000'; c2 < n3; ++c2) {
            String string2 = "  ";
            ((StringBuilder)charSequence).append(string2);
        }
        ((StringBuilder)charSequence).append("|-");
        objectArray = this.toString();
        ((StringBuilder)charSequence).append((String)objectArray);
        c2 = '\n';
        ((StringBuilder)charSequence).append(c2);
        objectArray = this.D();
        int n4 = objectArray.c;
        if (n4 > 0) {
            objectArray = objectArray.a;
            int n7 = 0;
            do {
                Object object = (xp1_0)objectArray[n7];
                int n8 = n3 + 1;
                object = ((xp1_0)object).q(n8);
                ((StringBuilder)charSequence).append((String)object);
            } while (++n7 < n4);
        }
        charSequence = ((StringBuilder)charSequence).toString();
        if (n3 == 0) {
            n3 = ((String)charSequence).length() + -1;
            charSequence = ((String)charSequence).substring(0, n3);
            String string3 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
            Intrinsics.checkNotNullExpressionValue(charSequence, string3);
        }
        return charSequence;
    }

    public final void r() {
        int n3;
        Object[] objectArray;
        boolean bl2;
        Object object = this.i;
        int n4 = 0;
        String string2 = null;
        if (object == null) {
            object = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            xp1_0 xp1_02 = this.A();
            string2 = xp1_02 != null ? xp1_02.q(0) : null;
            ((StringBuilder)object).append(string2);
            bh1_1.d(((StringBuilder)object).toString());
            throw null;
        }
        Object object2 = this.A();
        bq1 bq12 = this.z;
        if (object2 != null) {
            Xp1$f xp1$f;
            ((xp1_0)object2).G();
            ((xp1_0)object2).I();
            object2 = bq12.r;
            ((bq1$b)object2).k = xp1$f = Xp1$f.NotUsed;
            object2 = bq12.s;
            if (object2 != null) {
                ((bq1$a_0)object2).i = xp1$f;
            }
        }
        object2 = bq12.r.u;
        int n7 = 1;
        ((Sc)object2).b = n7;
        ((Sc)object2).c = false;
        ((Sc)object2).e = false;
        ((Sc)object2).d = false;
        ((Sc)object2).f = false;
        ((Sc)object2).g = false;
        ((Sc)object2).h = null;
        object2 = bq12.s;
        if (object2 != null && (object2 = ((bq1$a_0)object2).r) != null) {
            ((Sc)object2).b = n7;
            ((Sc)object2).c = false;
            ((Sc)object2).e = false;
            ((Sc)object2).d = false;
            ((Sc)object2).f = false;
            ((Sc)object2).g = false;
            ((Sc)object2).h = null;
        }
        if ((object2 = this.G) != null) {
            object2.invoke(object);
        }
        if (bl2 = (objectArray = this.y).d(8)) {
            this.J();
        }
        object2 = objectArray.d;
        objectArray = object2;
        while (objectArray != null) {
            n3 = objectArray.m;
            if (n3 != 0) {
                objectArray.o1();
            }
            objectArray = objectArray.e;
        }
        this.l = n7;
        objectArray = this.e.a;
        n3 = objectArray.c;
        if (n3 > 0) {
            objectArray = objectArray.a;
            int n8 = 0;
            do {
                xp1_0 xp1_03 = (xp1_0)objectArray[n8];
                xp1_03.r();
            } while ((n8 += n7) < n3);
        }
        this.l = false;
        while (object2 != null) {
            n7 = ((LP1$c)object2).m;
            if (n7 != 0) {
                ((LP1$c)object2).i1();
            }
            object2 = ((LP1$c)object2).e;
        }
        object.j(this);
        this.i = null;
        this.e0(null);
        this.k = 0;
        object = bq12.r;
        ((bq1$b)object).h = n4 = -1 >>> 1;
        ((bq1$b)object).g = n4;
        ((bq1$b)object).s = false;
        object = bq12.s;
        if (object != null) {
            ((bq1$a_0)object).h = n4;
            ((bq1$a_0)object).g = n4;
            ((bq1$a_0)object).q = false;
        }
    }

    public final void s(iL iL2, W01 w01) {
        this.y.c.Y0(iL2, w01);
    }

    public final boolean s0() {
        return this.e();
    }

    public final List t() {
        Object object = this.z.s;
        Intrinsics.checkNotNull(object);
        Object object2 = ((bq1$a_0)object).y;
        Object[] objectArray = ((bq1)object2).a;
        objectArray.v();
        int n3 = ((bq1$a_0)object).t;
        WR1 wR1 = ((bq1$a_0)object).s;
        if (n3 == 0) {
            object = wR1.f();
        } else {
            object2 = ((bq1)object2).a;
            objectArray = ((xp1_0)object2).D();
            int n4 = objectArray.c;
            if (n4 > 0) {
                objectArray = objectArray.a;
                int n7 = 0;
                do {
                    Object object3 = (xp1_0)objectArray[n7];
                    int n8 = wR1.c;
                    if (n8 <= n7) {
                        object3 = ((xp1_0)object3).z.s;
                        Intrinsics.checkNotNull(object3);
                        wR1.b(object3);
                        continue;
                    }
                    object3 = ((xp1_0)object3).z.s;
                    Intrinsics.checkNotNull(object3);
                    Object[] objectArray2 = wR1.a;
                    Object cfr_ignored_0 = objectArray2[n7];
                    objectArray2[n7] = object3;
                } while (++n7 < n4);
            }
            object2 = ((xp1_0)object2).v();
            int n10 = object2.size();
            n3 = wR1.c;
            wR1.o(n10, n3);
            ((bq1$a_0)object).t = false;
            object = wR1.f();
        }
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = h03_0.d(this);
        stringBuilder.append((String)object);
        stringBuilder.append(" children: ");
        int n3 = this.v().size();
        stringBuilder.append(n3);
        stringBuilder.append(" measurePolicy: ");
        object = this.p;
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    public final List u() {
        return this.z.r.o0();
    }

    public final List v() {
        return this.D().f();
    }

    public final zy2_0 w() {
        boolean bl2 = this.e();
        if (bl2 && !(bl2 = this.I)) {
            Object object = this.y;
            int n3 = 8;
            bl2 = ((T32)object).d(n3);
            if (bl2 && (object = this.m) == null) {
                Object object2;
                object = new Ref$ObjectRef();
                ((Ref$ObjectRef)object).element = object2 = new zy2_0();
                object2 = aq1_0.a(this).getSnapshotObserver();
                Xp1$i xp1$i = new Xp1$i(this, (Ref$ObjectRef)object);
                bh2_0 bh2_02 = ((ch2)object2).d;
                ((ch2)object2).a(this, bh2_02, xp1$i);
                this.m = object = (zy2_0)((Ref$ObjectRef)object).element;
                return object;
            }
            return this.m;
        }
        return null;
    }

    public final List x() {
        return this.e.a.f();
    }

    public final Xp1$f y() {
        Object object = this.z.s;
        if (object == null || (object = object.i) == null) {
            object = Xp1$f.NotUsed;
        }
        return object;
    }

    public final ek1_0 z() {
        ek1_0 ek1_02 = this.q;
        if (ek1_02 == null) {
            al1_1 al1_12 = this.p;
            this.q = ek1_02 = new ek1_0(this, al1_12);
        }
        return ek1_02;
    }
}

