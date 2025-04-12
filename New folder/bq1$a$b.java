/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class bq1$a$b
extends Lambda
implements Function0 {
    public final /* synthetic */ bq1$a_0 c;
    public final /* synthetic */ xb1_0 d;
    public final /* synthetic */ bq1 e;

    public bq1$a$b(bq1$a_0 bq1$a_0, Fh1$a fh1$a, bq1 bq12) {
        this.c = bq1$a_0;
        this.d = fh1$a;
        this.e = bq12;
        super(0);
    }

    public final Object invoke() {
        int n3;
        Object object;
        Xp1$f xp1$f;
        int n4;
        Ns2 ns2;
        Object object2;
        int n7;
        bq1$a_0 bq1$a_0 = this.c;
        Object object3 = bq1$a_0.y;
        int n8 = 0;
        ((bq1)object3).j = 0;
        object3 = ((bq1)object3).a.D();
        int n10 = ((WR1)object3).c;
        int n14 = -1 >>> 1;
        if (n10 > 0) {
            object3 = ((WR1)object3).a;
            n7 = 0;
            object2 = null;
            do {
                ns2 = ((xp1_0)object3[n7]).z.s;
                Intrinsics.checkNotNull(ns2);
                ns2.g = n4 = ns2.h;
                ns2.h = n14;
                xp1$f = ns2.i;
                object = Xp1$f.InLayoutBlock;
                if (xp1$f != object) continue;
                ns2.i = xp1$f = Xp1$f.NotUsed;
            } while (++n7 < n10);
        }
        object3 = cq1_1.c;
        bq1$a_0.V((Function1)object3);
        object3 = bq1$a_0.K().Q;
        bq1 bq12 = this.e;
        if (object3 != null) {
            boolean bl2 = ((tb1_0)object3).h;
            object2 = bq12.a.v();
            n3 = object2.size();
            xp1$f = null;
            for (n4 = 0; n4 < n3; ++n4) {
                object = ((xp1_0)object2.get((int)n4)).y.c.h1();
                if (object == null) continue;
                ((tb1_0)object).h = bl2;
            }
        }
        this.d.z0().j();
        object3 = bq1$a_0.K().Q;
        if (object3 != null) {
            object3 = bq12.a.v();
            n10 = object3.size();
            object2 = null;
            for (n7 = 0; n7 < n10; ++n7) {
                ns2 = ((xp1_0)object3.get((int)n7)).y.c.h1();
                if (ns2 == null) continue;
                ((tb1_0)ns2).h = false;
            }
        }
        object3 = bq1$a_0.y.a.D();
        n10 = ((WR1)object3).c;
        if (n10 > 0) {
            object3 = ((WR1)object3).a;
            do {
                object2 = ((xp1_0)object3[n8]).z.s;
                Intrinsics.checkNotNull(object2);
                n3 = ((bq1$a_0)object2).g;
                n4 = ((bq1$a_0)object2).h;
                if (n3 == n4 || n4 != n14) continue;
                ((bq1$a_0)object2).q0();
            } while (++n8 < n10);
        }
        object3 = dq1_2.c;
        bq1$a_0.V((Function1)object3);
        return Unit.a;
    }
}

