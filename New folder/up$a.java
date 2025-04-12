/*
 * Decompiled with CFR 0.152.
 */
public final class up$a {
    public static final double[] s = new double[91];
    public double[] a;
    public double b;
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;
    public double k;
    public double l;
    public double m;
    public double n;
    public double o;
    public double p;
    public boolean q;
    public boolean r;

    public final double a() {
        double d2 = this.j;
        double d5 = this.p;
        d2 *= d5;
        d5 = -this.k;
        double d7 = this.o;
        d5 *= d7;
        d7 = this.n;
        d5 = Math.hypot(d2, d5);
        d7 /= d5;
        boolean bl2 = this.q;
        if (bl2) {
            d2 = -d2;
        }
        return d2 * d7;
    }

    public final double b() {
        double d2 = this.j;
        double d5 = this.p;
        d2 *= d5;
        d5 = -this.k;
        double d7 = this.o;
        d5 *= d7;
        d7 = this.n;
        d2 = Math.hypot(d2, d5);
        d7 /= d2;
        boolean bl2 = this.q;
        d2 = bl2 ? -d5 * d7 : d5 * d7;
        return d2;
    }

    public final double c(double d2) {
        double d5 = this.c;
        d2 -= d5;
        d5 = this.i;
        d2 *= d5;
        d5 = this.f;
        double d7 = this.e;
        return (d5 - d7) * d2 + d7;
    }

    public final double d(double d2) {
        double d5 = this.c;
        d2 -= d5;
        d5 = this.i;
        d2 *= d5;
        d5 = this.h;
        double d7 = this.g;
        return (d5 - d7) * d2 + d7;
    }

    public final double e() {
        double d2 = this.j;
        double d5 = this.o;
        d2 *= d5;
        d5 = this.l;
        return d2 + d5;
    }

    public final double f() {
        double d2 = this.k;
        double d5 = this.p;
        d2 *= d5;
        d5 = this.m;
        return d2 + d5;
    }

    public final void g(double d2) {
        double d5;
        double d7;
        boolean bl2 = this.q;
        if (bl2) {
            d7 = this.d - d2;
        } else {
            d7 = this.c;
            d7 = d2 - d7;
        }
        d2 = this.i;
        d7 *= d2;
        d2 = 0.0;
        double d9 = d7 == d2 ? 0 : (d7 < d2 ? -1 : 1);
        if (d9 > 0 && (d9 = (d5 = d7 - (d2 = 1.0)) == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1)) < 0) {
            double[] dArray = this.a;
            double d12 = dArray.length + -1;
            int n3 = (int)(d7 *= d12);
            d12 = n3;
            d7 -= d12;
            d12 = dArray[n3];
            double d13 = (dArray[++n3] - d12) * d7;
            d2 = d13 + d12;
        }
        this.o = d7 = Math.sin(d2 *= 1.5707963267948966);
        this.p = d2 = Math.cos(d2);
    }
}

