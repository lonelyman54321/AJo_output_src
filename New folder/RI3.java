/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;

public final class RI3
implements Runnable {
    public final /* synthetic */ WorkDatabase a;
    public final /* synthetic */ EI3 b;
    public final /* synthetic */ EI3 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Set f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ RI3(WorkDatabase workDatabase, EI3 eI3, EI3 eI32, List list, String string2, Set set, boolean bl2) {
        this.a = workDatabase;
        this.b = eI3;
        this.c = eI32;
        this.d = list;
        this.e = string2;
        this.f = set;
        this.g = bl2;
    }

    public final void run() {
        RI3 rI3 = this;
        Object object = this.a;
        FI3 fI3 = ((WorkDatabase)object).f();
        LI3 lI3 = ((WorkDatabase)object).g();
        Object object2 = this.b;
        hI3$b hI3$b = ((EI3)object2).b;
        long l2 = ((EI3)object2).n;
        int n3 = ((EI3)object2).t;
        int n4 = n3 + 1;
        long l3 = ((EI3)object2).u;
        int n7 = ((EI3)object2).v;
        int n8 = ((EI3)object2).k;
        int n10 = ((EI3)object2).s;
        EI3 eI3 = this.c;
        int n14 = 12835837;
        Object object3 = eI3;
        int n15 = 0;
        int n16 = n8;
        n8 = 0;
        int n17 = n7;
        n7 = n10;
        n10 = 1;
        object3 = EI3.b(eI3, null, hI3$b, null, null, n16, l2, n7, n4, l3, n17, n14);
        int n18 = eI3.v;
        if (n18 == n10) {
            long l4;
            ((EI3)object3).u = l4 = eI3.u;
            ((EI3)object3).v = n15 = ((EI3)object3).v + n10;
        }
        object2 = Wz0.c(rI3.d, (EI3)object3);
        fI3.s((EI3)object2);
        object2 = rI3.e;
        lI3.b((String)object2);
        object3 = rI3.f;
        lI3.c((String)object2, (Set)object3);
        boolean bl2 = rI3.g;
        if (!bl2) {
            long l7 = -1;
            fI3.b(l7, (String)object2);
            object = ((WorkDatabase)object).e();
            object.delete((String)object2);
        }
    }
}

