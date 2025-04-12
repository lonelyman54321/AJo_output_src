/*
 * Decompiled with CFR 0.152.
 */
public final class bx0$a
extends bx0_0 {
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public bx0$a(String string2) {
        double d2;
        double d5;
        double d7;
        this.a = string2;
        int n3 = string2.indexOf(40);
        int n4 = 44;
        int n7 = string2.indexOf(n4, n3);
        this.d = d7 = Double.parseDouble(string2.substring(++n3, n7).trim());
        n3 = string2.indexOf(n4, ++n7);
        this.e = d5 = Double.parseDouble(string2.substring(n7, n3).trim());
        n4 = string2.indexOf(n4, ++n3);
        this.f = d5 = Double.parseDouble(string2.substring(n3, n4).trim());
        n3 = string2.indexOf(41, ++n4);
        this.g = d2 = Double.parseDouble(string2.substring(n4, n3).trim());
    }

    public final double a(double d2) {
        double d5;
        double d7;
        Object object;
        double d9 = 0.0;
        double d12 = d2 - d9;
        Object object2 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (object2 <= 0) {
            return d9;
        }
        d9 = 1.0;
        double d13 = d2 - d9;
        object2 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
        if (object2 >= 0) {
            return d9;
        }
        double d14 = d9 = 0.5;
        double d15 = d9;
        while ((object = (d7 = d14 - (d5 = 0.01)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) > 0) {
            d5 = this.d(d15);
            d14 *= d9;
            object = d5 == d2 ? 0 : (d5 < d2 ? -1 : 1);
            if (object < 0) {
                d15 += d14;
                continue;
            }
            d15 -= d14;
        }
        d9 = d15 - d14;
        d5 = this.d(d9);
        d15 += d14;
        d14 = this.d(d15);
        d9 = this.e(d9);
        d15 = this.e(d15) - d9;
        d2 = (d2 - d5) * d15;
        return d2 / (d14 -= d5) + d9;
    }

    public final double b(double d2) {
        double d5;
        double d7;
        Object object;
        double d9;
        double d12 = d9 = 0.5;
        double d13 = d9;
        while ((object = (d7 = d12 - (d5 = 1.0E-4)) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1)) > 0) {
            d5 = this.d(d13);
            d12 *= d9;
            object = d5 == d2 ? 0 : (d5 < d2 ? -1 : 1);
            if (object < 0) {
                d13 += d12;
                continue;
            }
            d13 -= d12;
        }
        d2 = d13 - d12;
        d9 = this.d(d2);
        d13 += d12;
        d12 = this.d(d13);
        d2 = this.e(d2);
        d13 = this.e(d13) - d2;
        return d13 / (d12 -= d9);
    }

    public final double d(double d2) {
        double d5 = 1.0 - d2;
        double d7 = 3.0 * d5;
        d5 = d5 * d7 * d2;
        d7 = d7 * d2 * d2;
        double d9 = d2 * d2 * d2;
        d2 = this.d * d5;
        return this.f * d7 + d2 + d9;
    }

    public final double e(double d2) {
        double d5 = 1.0 - d2;
        double d7 = 3.0 * d5;
        d5 = d5 * d7 * d2;
        d7 = d7 * d2 * d2;
        double d9 = d2 * d2 * d2;
        d2 = this.e * d5;
        return this.g * d7 + d2 + d9;
    }
}

