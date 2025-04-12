/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class bq1$b$c
extends Lambda
implements Function0 {
    public final /* synthetic */ bq1 c;
    public final /* synthetic */ bq1$b d;

    public bq1$b$c(bq1 bq12, bq1$b bq1$b) {
        this.c = bq12;
        this.d = bq1$b;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Object object2 = ((bq1)object).a().q;
        if (object2 == null || (object2 = ((tb1_0)object2).i) == null) {
            object2 = aq1_0.a(((bq1)object).a).getPlacementScope();
        }
        bq1$b bq1$b = this.d;
        Function1 function1 = bq1$b.B;
        W01 w01 = bq1$b.C;
        if (w01 != null) {
            object = ((bq1)object).a();
            long l2 = bq1$b.D;
            float f5 = bq1$b.E;
            object2.getClass();
            Ns2$a.a((Ns2$a)object2, (Ns2)object);
            long l3 = ((Ns2)object).e;
            l2 = Si1.d(l2, l3);
            ((w32_0)object).j0(l2, f5, w01);
        } else if (function1 == null) {
            object = ((bq1)object).a();
            long l4 = bq1$b.D;
            float f6 = bq1$b.E;
            object2.getClass();
            Ns2$a.a((Ns2$a)object2, (Ns2)object);
            long l7 = ((Ns2)object).e;
            l4 = Si1.d(l4, l7);
            object2 = null;
            ((w32_0)object).k0(l4, f6, null);
        } else {
            object = ((bq1)object).a();
            long l8 = bq1$b.D;
            float f7 = bq1$b.E;
            object2.getClass();
            Ns2$a.a((Ns2$a)object2, (Ns2)object);
            long l12 = ((Ns2)object).e;
            l8 = Si1.d(l8, l12);
            ((w32_0)object).k0(l8, f7, function1);
        }
        return Unit.a;
    }
}

