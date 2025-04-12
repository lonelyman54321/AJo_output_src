/*
 * Decompiled with CFR 0.152.
 */
public class dX2$b
implements dx2_1 {
    public final long a;
    public final dX2$a b;

    public dX2$b(long l2) {
        this(l2, 0L);
    }

    public dX2$b(long l2, long l3) {
        dX2$a dX2$a;
        this.a = l2;
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        fx2_0 fx2_02 = l7 == false ? fx2_0.c : new fx2_0(l4, l3);
        this.b = dX2$a = new dX2$a(fx2_02, fx2_02);
    }

    public final dX2$a d(long l2) {
        return this.b;
    }

    public final boolean g() {
        return false;
    }

    public final long getDurationUs() {
        return this.a;
    }
}

