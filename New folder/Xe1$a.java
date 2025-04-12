/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class Xe1$a
extends x0_0
implements Xe1 {
    public final Xe1 b;
    public final int c;
    public final int d;

    public Xe1$a(Xe1 xe1, int n3, int n4) {
        this.b = xe1;
        this.c = n3;
        int n7 = xe1.size();
        bv1_0.c(n3, n4, n7);
        this.d = n4 -= n3;
    }

    public final int a() {
        return this.d;
    }

    public final Object get(int n3) {
        int n4 = this.d;
        bv1_0.a(n3, n4);
        n4 = this.c + n3;
        return this.b.get(n4);
    }

    public final List subList(int n3, int n4) {
        int n7 = this.d;
        bv1_0.c(n3, n4, n7);
        int n8 = this.c;
        n3 += n8;
        Xe1 xe1 = this.b;
        Xe1$a xe1$a = new Xe1$a(xe1, n3, n8 += n4);
        return xe1$a;
    }
}

