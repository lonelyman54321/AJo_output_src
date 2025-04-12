/*
 * Decompiled with CFR 0.152.
 */
public final class Kx$a
implements dx2_1 {
    public final Kx$d a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public Kx$a(Kx$d kx$d, long l2, long l3, long l4, long l7, long l8) {
        this.a = kx$d;
        this.b = l2;
        this.c = 0L;
        this.d = l3;
        this.e = l4;
        this.f = l7;
        this.g = l8;
    }

    public final dX2$a d(long l2) {
        long l3 = this.a.a(l2);
        long l4 = this.f;
        long l7 = this.g;
        long l8 = this.c;
        long l12 = this.d;
        long l14 = this.e;
        long l15 = Kx$c.a(l3, l8, l12, l14, l4, l7);
        fx2_0 fx2_02 = new fx2_0(l2, l15);
        dX2$a dX2$a = new dX2$a(fx2_02, fx2_02);
        return dX2$a;
    }

    public final boolean g() {
        return true;
    }

    public final long getDurationUs() {
        return this.b;
    }
}

