/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Fh1
extends w32_0 {
    public static final ei R;
    public final ai3_1 P;
    public xb1_0 Q;

    static {
        ei ei2 = fi.a();
        long l2 = OX.g;
        ei2.f(l2);
        ei2.n(1.0f);
        ei2.m(1);
        R = ei2;
    }

    public Fh1(xp1_0 object) {
        super((xp1_0)object);
        ai3_1 ai3_12;
        super();
        ai3_12.d = 0;
        this.P = ai3_12;
        ai3_12.h = this;
        object = ((xp1_0)object).c;
        object = object != null ? new xb1_0(this) : null;
        this.Q = object;
    }

    public final int I(int n3) {
        Object object = this.m.z();
        al1_1 al1_12 = ((ek1_0)object).a();
        object = ((ek1_0)object).a;
        w32_0 w32_02 = ((xp1_0)object).y.c;
        object = ((xp1_0)object).u();
        return al1_12.j(w32_02, (List)object, n3);
    }

    public final int N(int n3) {
        Object object = this.m.z();
        al1_1 al1_12 = ((ek1_0)object).a();
        object = ((ek1_0)object).a;
        w32_0 w32_02 = ((xp1_0)object).y.c;
        object = ((xp1_0)object).u();
        return al1_12.h(w32_02, (List)object, n3);
    }

    public final int P(int n3) {
        Object object = this.m.z();
        al1_1 al1_12 = ((ek1_0)object).a();
        object = ((ek1_0)object).a;
        w32_0 w32_02 = ((xp1_0)object).y.c;
        object = ((xp1_0)object).u();
        return al1_12.a(w32_02, (List)object, n3);
    }

    public final Ns2 Q(long l2) {
        Object object;
        boolean bl2 = this.o;
        if (bl2) {
            object = this.Q;
            Intrinsics.checkNotNull(object);
            l2 = ((Ns2)object).d;
        }
        this.n0(l2);
        Object object2 = this.m;
        Object object3 = ((xp1_0)object2).D();
        int n3 = ((WR1)object3).c;
        if (n3 > 0) {
            object3 = ((WR1)object3).a;
            int n4 = 0;
            do {
                Xp1$f xp1$f;
                bq1$b bq1$b = ((xp1_0)object3[n4]).z.r;
                bq1$b.k = xp1$f = Xp1$f.NotUsed;
            } while (++n4 < n3);
        }
        object3 = ((xp1_0)object2).p;
        object2 = ((xp1_0)object2).u();
        object = object3.c(this, (List)object2, l2);
        this.y1((bl1_0)object);
        this.t1();
        return this;
    }

    public final void c1() {
        xb1_0 xb1_02 = this.Q;
        if (xb1_02 == null) {
            this.Q = xb1_02 = new xb1_0(this);
        }
    }

    public final xb1_0 h1() {
        return this.Q;
    }

    public final void j0(long l2, float f5, W01 w01) {
        super.j0(l2, f5, w01);
        boolean bl2 = this.g;
        if (!bl2) {
            this.u1();
            bq1$b bq1$b = this.m.z.r;
            bq1$b.y0();
        }
    }

    public final LP1$c j1() {
        return this.P;
    }

    public final void k0(long l2, float f5, Function1 function1) {
        super.k0(l2, f5, function1);
        boolean bl2 = this.g;
        if (!bl2) {
            this.u1();
            bq1$b bq1$b = this.m.z.r;
            bq1$b.y0();
        }
    }

    public final int o0(Oc object) {
        int n3;
        Object object2 = this.Q;
        if (object2 != null) {
            n3 = ((tb1_0)object2).o0((Oc)object);
        } else {
            bq1 bq12;
            object2 = this.m.z.r;
            boolean bl2 = ((bq1$b)object2).l;
            boolean bl3 = true;
            yp1_1 yp1_12 = ((bq1$b)object2).u;
            if (!bl2) {
                bq12 = ((bq1$b)object2).H;
                Xp1$d xp1$d = bq12.c;
                Xp1$d xp1$d2 = Xp1$d.Measuring;
                if (xp1$d == xp1$d2) {
                    yp1_12.f = bl3;
                    boolean bl4 = yp1_12.b;
                    if (bl4) {
                        bq12.e = bl3;
                        bq12.f = bl3;
                    }
                } else {
                    yp1_12.g = bl3;
                }
            }
            ((bq1$b)object2).K().h = bl3;
            ((bq1$b)object2).C();
            object2 = ((bq1$b)object2).K();
            bl2 = false;
            bq12 = null;
            ((tb1_0)object2).h = false;
            object2 = yp1_12.i;
            object = (Integer)((HashMap)object2).get(object);
            n3 = object != null ? (Integer)object : -1 << -1;
        }
        return n3;
    }

    public final void o1(W32$e w32$e, long l2, C61 c61, boolean bl2, boolean bl3) {
        boolean bl4;
        boolean bl5;
        Object object;
        float f5;
        int n3;
        int n4;
        int n7;
        Object object2;
        C61 c612;
        block5: {
            block3: {
                block4: {
                    long l3;
                    float f6;
                    Fh1 fh1 = this;
                    long l4 = l2;
                    c612 = c61;
                    object2 = this.m;
                    n7 = w32$e.d((xp1_0)object2);
                    n4 = 1;
                    n3 = 0;
                    f5 = 0.0f;
                    if (n7 == 0) break block3;
                    n7 = h72.b(l2);
                    if (n7 != 0 && ((object = this.G) == null || !(bl5 = this.s) || (n7 = (int)(object.h(l2) ? 1 : 0)) != 0)) break block4;
                    if (!bl2 || (bl5 = Float.isInfinite(f6 = fh1.W0(l4, l3 = this.i1()))) || (n7 = (int)(Float.isNaN(f6) ? 1 : 0)) != 0) break block3;
                    n3 = 1;
                    f5 = Float.MIN_VALUE;
                    bl4 = false;
                    break block5;
                }
                bl4 = bl3;
                n3 = 1;
                f5 = Float.MIN_VALUE;
                break block5;
            }
            bl4 = bl3;
        }
        if (n3 != 0) {
            int n8 = c612.c;
            object2 = ((xp1_0)object2).C();
            n7 = ((WR1)object2).c;
            if (n7 > 0) {
                Object[] objectArray = ((WR1)object2).a;
                int n10 = n7 -= n4;
                do {
                    object = object2 = objectArray[n10];
                    object = (xp1_0)object2;
                    int n14 = ((xp1_0)object).L();
                    if (n14 == 0) continue;
                    object2 = w32$e;
                    long l7 = l2;
                    w32$e.c((xp1_0)object, l2, c61, bl2, bl4);
                    long l8 = c61.a();
                    l7 = l8 >> 32;
                    f5 = Float.intBitsToFloat((int)l7);
                    bl5 = false;
                    float f6 = f5 - 0.0f;
                    n3 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
                    if (n3 >= 0 || (n7 = (int)(l8 &= (l7 = 0xFFFFFFFFL))) == 0) continue;
                    n14 = c612.e;
                    if (n14 == 0) break;
                    c612.c = n14 = c612.d - n4;
                } while ((n10 += -1) >= 0);
            }
            c612.c = n8;
        }
    }

    public final int v(int n3) {
        Object object = this.m.z();
        al1_1 al1_12 = ((ek1_0)object).a();
        object = ((ek1_0)object).a;
        w32_0 w32_02 = ((xp1_0)object).y.c;
        object = ((xp1_0)object).u();
        return al1_12.i(w32_02, (List)object, n3);
    }

    public final void v1(iL iL2, W01 object) {
        boolean bl2;
        Object[] objectArray = this.m;
        sg2_0 sg2_02 = aq1_0.a((xp1_0)objectArray);
        objectArray = objectArray.C();
        int n3 = objectArray.c;
        if (n3 > 0) {
            objectArray = objectArray.a;
            int n4 = 0;
            do {
                xp1_0 xp1_02;
                boolean bl3;
                if (!(bl3 = (xp1_02 = (xp1_0)objectArray[n4]).L())) continue;
                xp1_02.s(iL2, (W01)object);
            } while (++n4 < n3);
        }
        if (bl2 = sg2_02.getShowLayoutBounds()) {
            object = R;
            this.a1(iL2, (ei)object);
        }
    }
}

