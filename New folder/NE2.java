/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.c;

public final class NE2
implements Lq0 {
    public final hm0_2 a;
    public final Sq0 b;

    public NE2(long l2, hm0_2 hm0_22, hn2_2 hn2_22, c c2) {
        Sq0 sq0;
        this.a = hm0_22;
        this.b = sq0 = new Sq0(l2, hm0_22, hn2_22, c2);
    }

    public final NE2$a a(String object) {
        Object object2 = ff_2.d;
        object = ff$a_0.c((String)object).c("SHA-256").e();
        object2 = this.b;
        object2 = (object = ((Sq0)object2).c((String)object)) != null ? new NE2$a((Sq0$a)object) : null;
        return object2;
    }

    public final NE2$b b(String object) {
        Object object2 = ff_2.d;
        object = ff$a_0.c((String)object).c("SHA-256").e();
        object2 = this.b;
        object2 = (object = ((Sq0)object2).d((String)object)) != null ? new NE2$b((Sq0$c)object) : null;
        return object2;
    }

    public final hm0_2 c() {
        return this.a;
    }
}

