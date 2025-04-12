/*
 * Decompiled with CFR 0.152.
 */
public final class Kx$c {
    public final long a;
    public final long b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    public Kx$c(long l2, long l3, long l4, long l7, long l8, long l12) {
        long l14;
        long l15 = l2;
        this.a = l2;
        l15 = l3;
        this.b = l3;
        this.d = l14 = 0L;
        this.e = l4;
        this.f = l7;
        this.g = l8;
        this.c = l12;
        this.h = l15 = Kx$c.a(l3, l14, l4, l7, l8, l12);
    }

    public static long a(long l2, long l3, long l4, long l7, long l8, long l12) {
        long l14;
        long l15 = 1L;
        long l16 = l7 + l15;
        long l17 = l16 - l8;
        long l18 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        if (l18 < 0 && (l18 = (l14 = (l16 = l3 + l15) - l4) == 0L ? 0 : (l14 < 0L ? -1 : 1)) < 0) {
            l16 = l2 - l3;
            float f5 = l8 - l7;
            float f6 = l4 - l3;
            l16 = (long)((float)l16 * (f5 /= f6));
            long l19 = l16 / (long)20;
            l16 = l16 + l7 - l12 - l19;
            l15 = l8 - l15;
            l2 = l16;
            l3 = l7;
            l4 = l15;
            return gz3.i(l16, l7, l15);
        }
        return l7;
    }
}

