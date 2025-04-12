/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class Mj3 {
    public final Sl a;
    public final xm3 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final Vo0 g;
    public final RU0.a h;
    public final List i;
    public sq1_0 j;
    public bp1_0 k;

    public Mj3(Sl object, xm3 object2, int n3, int n4, boolean bl2, int n7, Vo0 vo0, RU0.a a2, List list) {
        this.a = object;
        this.b = object2;
        this.c = n3;
        this.d = n4;
        this.e = bl2;
        this.f = n7;
        this.g = vo0;
        this.h = a2;
        this.i = list;
        if (n3 > 0) {
            if (n4 > 0) {
                if (n4 <= n3) {
                    return;
                }
                object2 = "minLines greater than maxLines".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object2 = "no minLines".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = "no maxLines".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void a(bp1_0 bp1_02) {
        boolean bl2;
        Object object;
        sq1_0 sq1_02 = this.j;
        if (sq1_02 == null || bp1_02 != (object = this.k) || (bl2 = sq1_02.a())) {
            this.k = bp1_02;
            xm3 xm32 = ym3.a(this.b, bp1_02);
            Sl sl = this.a;
            List list = this.i;
            Vo0 vo0 = this.g;
            RU0.a a2 = this.h;
            object = sq1_02;
            sq1_02 = new sq1_0(sl, xm32, list, vo0, a2);
        }
        this.j = sq1_02;
    }
}

