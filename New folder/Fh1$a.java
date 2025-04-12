/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Fh1$a
extends xb1_0 {
    public final int I(int n3) {
        Object object = this.m.m.z();
        al1_1 al1_12 = ((ek1_0)object).a();
        object = ((ek1_0)object).a;
        w32_0 w32_02 = ((xp1_0)object).y.c;
        object = ((xp1_0)object).t();
        return al1_12.j(w32_02, (List)object, n3);
    }

    public final int N(int n3) {
        Object object = this.m.m.z();
        al1_1 al1_12 = ((ek1_0)object).a();
        object = ((ek1_0)object).a;
        w32_0 w32_02 = ((xp1_0)object).y.c;
        object = ((xp1_0)object).t();
        return al1_12.h(w32_02, (List)object, n3);
    }

    public final int P(int n3) {
        Object object = this.m.m.z();
        al1_1 al1_12 = ((ek1_0)object).a();
        object = ((ek1_0)object).a;
        w32_0 w32_02 = ((xp1_0)object).y.c;
        object = ((xp1_0)object).t();
        return al1_12.a(w32_02, (List)object, n3);
    }

    public final void P0() {
        bq1$a_0 bq1$a_0 = this.m.m.z.s;
        Intrinsics.checkNotNull(bq1$a_0);
        bq1$a_0.w0();
    }

    public final Ns2 Q(long l2) {
        this.n0(l2);
        Object object = this.m;
        Object object2 = ((w32_0)object).m.D();
        int n3 = ((WR1)object2).c;
        if (n3 > 0) {
            object2 = ((WR1)object2).a;
            int n4 = 0;
            do {
                Xp1$f xp1$f;
                bq1$a_0 bq1$a_0 = ((xp1_0)object2[n4]).z.s;
                Intrinsics.checkNotNull(bq1$a_0);
                bq1$a_0.i = xp1$f = Xp1$f.NotUsed;
            } while (++n4 < n3);
        }
        object = ((w32_0)object).m;
        object2 = ((xp1_0)object).p;
        object = ((xp1_0)object).t();
        bl1_0 bl1_02 = object2.c(this, (List)object, l2);
        xb1_0.L0(this, bl1_02);
        return this;
    }

    public final int o0(Oc oc) {
        Object object;
        Object object2 = this.m.m.z.s;
        Intrinsics.checkNotNull(object2);
        boolean bl2 = ((bq1$a_0)object2).j;
        boolean bl3 = true;
        sb1_1 sb1_12 = ((bq1$a_0)object2).r;
        if (!bl2) {
            object = ((bq1$a_0)object2).y;
            Xp1$d xp1$d = ((bq1)object).c;
            Xp1$d xp1$d2 = Xp1$d.LookaheadMeasuring;
            if (xp1$d == xp1$d2) {
                sb1_12.f = bl3;
                boolean bl4 = sb1_12.b;
                if (bl4) {
                    ((bq1)object).h = bl3;
                    ((bq1)object).i = bl3;
                }
            } else {
                sb1_12.g = bl3;
            }
        }
        if ((object = ((bq1$a_0)object2).K().Q) != null) {
            ((tb1_0)object).h = bl3;
        }
        ((bq1$a_0)object2).C();
        object2 = ((bq1$a_0)object2).K().Q;
        if (object2 != null) {
            bl2 = false;
            object = null;
            ((tb1_0)object2).h = false;
        }
        object2 = (Integer)sb1_12.i.get(oc);
        int n3 = object2 != null ? (Integer)object2 : -1 << -1;
        object = n3;
        this.r.put(oc, object);
        return n3;
    }

    public final int v(int n3) {
        Object object = this.m.m.z();
        al1_1 al1_12 = ((ek1_0)object).a();
        object = ((ek1_0)object).a;
        w32_0 w32_02 = ((xp1_0)object).y.c;
        object = ((xp1_0)object).t();
        return al1_12.i(w32_02, (List)object, n3);
    }
}

