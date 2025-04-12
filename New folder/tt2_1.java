/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from tT2
 */
public final class tt2_1
extends bx0_0 {
    public double d;
    public double e;

    public final double a(double d2) {
        double d5;
        double d7 = this.d;
        double d9 = this.e;
        double d12 = d2 - d9;
        Object object = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (object < 0) {
            d5 = d9 * d2;
            d9 = (d9 - d2) * d7 + d2;
            d5 /= d9;
        } else {
            d5 = 1.0;
            double d13 = d5 - d9;
            double d14 = (d2 - d5) * d13;
            d5 -= d2;
            d9 = (d9 - d2) * d7;
            d5 -= d9;
            d5 = d14 / d5;
        }
        return d5;
    }

    public final double b(double d2) {
        double d5;
        double d7 = this.d;
        double d9 = this.e;
        double d12 = d2 - d9;
        Object object = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (object < 0) {
            d5 = d7 * d9 * d9;
            d9 = (d9 - d2) * d7 + d2;
            d9 *= d9;
            d5 /= d9;
        } else {
            d5 = 1.0;
            double d13 = d9 - d5;
            double d14 = d13 * d7 * d13;
            d7 = -d7;
            d9 = (d9 - d2) * d7 - d2 + d5;
            d9 *= d9;
            d5 = d14 / d9;
        }
        return d5;
    }
}

