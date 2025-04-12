/*
 * Decompiled with CFR 0.152.
 */
public final class Rs3 {
    public static Rs3 d;
    public long a;
    public long b;
    public int c;

    public final void a(double d2, double d5, long l2) {
        long l3;
        long l4;
        Rs3 rs3 = this;
        long l7 = 946728000000L;
        float f5 = (float)(l2 - l7) / 8.64E7f;
        float f6 = 0.01720197f * f5;
        float f7 = 6.24006f;
        double d7 = f6 += f7;
        double d9 = Math.sin(d7) * (double)0.0334196f + d7;
        double d12 = Math.sin(2.0f * f6) * 3.4906598739326E-4 + d9;
        float f8 = 3.0f;
        d9 = Math.sin(f6 * f8) * (double)5.236E-6f + d12 + 1.796593063 + Math.PI;
        d12 = d5;
        d12 = -d5 / 360.0;
        f6 = 9.0E-4f;
        f5 = (float)Math.round((double)(f5 - f6) - d12) + f6;
        double d13 = (double)f5 + d12;
        d7 = Math.sin(d7) * 0.0053 + d13;
        long l8 = 0x4000000000000000L;
        d13 = Math.sin(2.0 * d9) * -0.0069 + d7;
        d7 = Math.sin(d9);
        d7 = Math.asin(Math.sin(0.4092797040939331) * d7);
        d12 = 0.01745329238474369 * d2;
        long l12 = -4631161762379464704L;
        d9 = Math.sin(-0.10471975803375244);
        double d14 = Math.sin(d12);
        double d15 = Math.sin(d7) * d14;
        d9 -= d15;
        d12 = Math.cos(d12);
        d7 = Math.cos(d7) * d12;
        d9 /= d7;
        d7 = 1.0;
        int n3 = 1;
        long l14 = -1;
        d14 = 0.0 / 0.0;
        double d16 = d9 == d7 ? 0 : (d9 > d7 ? 1 : -1);
        if (d16 >= 0) {
            this.c = n3;
            this.a = l14;
            this.b = l14;
            return;
        }
        d7 = -1.0;
        d16 = 0.0;
        double d17 = d9 == d7 ? 0 : (d9 < d7 ? -1 : 1);
        if (d17 <= 0) {
            this.c = 0;
            this.a = l14;
            this.b = l14;
            return;
        }
        f7 = (float)(Math.acos(d9) / (Math.PI * 2));
        d7 = f7;
        d9 = d13 + d7;
        l14 = 4725570615333879808L;
        d14 = 8.64E7;
        this.a = l12 = Math.round(d9 *= d14) + l7;
        d13 = (d13 - d7) * d14;
        this.b = l8 = Math.round(d13) + l7;
        long l15 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1);
        if (l15 < 0 && (l4 = (l3 = (l7 = this.a) - l2) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            this.c = 0;
        } else {
            rs3.c = n3;
        }
    }
}

