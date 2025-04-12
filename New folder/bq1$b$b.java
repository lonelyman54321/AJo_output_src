/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class bq1$b$b
extends Lambda
implements Function0 {
    public final /* synthetic */ bq1$b c;

    public bq1$b$b(bq1$b bq1$b) {
        this.c = bq1$b;
        super(0);
    }

    public final Object invoke() {
        Object object;
        int n3;
        Object object2;
        int n4;
        bq1$b bq1$b = this.c;
        Object object3 = bq1$b.H;
        int n7 = 0;
        ((bq1)object3).k = 0;
        object3 = ((bq1)object3).a.D();
        int n8 = ((WR1)object3).c;
        int n10 = -1 >>> 1;
        if (n8 > 0) {
            object3 = ((WR1)object3).a;
            n4 = 0;
            do {
                object2 = ((xp1_0)object3[n4]).z.r;
                ((bq1$b)object2).g = n3 = ((bq1$b)object2).h;
                ((bq1$b)object2).h = n10;
                ((bq1$b)object2).t = false;
                object = ((bq1$b)object2).k;
                Xp1$f xp1$f = Xp1$f.InLayoutBlock;
                if (object != xp1$f) continue;
                ((bq1$b)object2).k = object = Xp1$f.NotUsed;
            } while (++n4 < n8);
        }
        object3 = fq1_2.c;
        bq1$b.V((Function1)object3);
        bq1$b.K().z0().j();
        object3 = bq1$b.H.a;
        Object[] objectArray = ((xp1_0)object3).D();
        n4 = objectArray.c;
        if (n4 > 0) {
            objectArray = objectArray.a;
            do {
                object2 = (xp1_0)objectArray[n7];
                object = ((xp1_0)object2).z.r;
                n3 = ((bq1$b)object).g;
                int n14 = ((xp1_0)object2).B();
                if (n3 == n14) continue;
                ((xp1_0)object3).Q();
                ((xp1_0)object3).G();
                n3 = ((xp1_0)object2).B();
                if (n3 != n10) continue;
                object2 = ((xp1_0)object2).z.r;
                ((bq1$b)object2).r0();
            } while (++n7 < n4);
        }
        object3 = gq1_2.c;
        bq1$b.V((Function1)object3);
        return Unit.a;
    }
}

