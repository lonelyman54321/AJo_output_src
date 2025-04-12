/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class Rf3
extends gj0_0
implements lf3_0 {
    public lf3_0 d;
    public long e;

    public final int a(long l2) {
        lf3_0 lf3_02 = this.d;
        lf3_02.getClass();
        long l3 = this.e;
        return lf3_02.a(l2 -= l3);
    }

    public final List b(long l2) {
        lf3_0 lf3_02 = this.d;
        lf3_02.getClass();
        long l3 = this.e;
        return lf3_02.b(l2 -= l3);
    }

    public final long c(int n3) {
        lf3_0 lf3_02 = this.d;
        lf3_02.getClass();
        long l2 = lf3_02.c(n3);
        long l3 = this.e;
        return l2 + l3;
    }

    public final int d() {
        lf3_0 lf3_02 = this.d;
        lf3_02.getClass();
        return lf3_02.d();
    }

    public final void g() {
        super.g();
        this.d = null;
    }
}

