/*
 * Decompiled with CFR 0.152.
 */
package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.b$p;

public final class d {
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final b$p j;

    public d() {
        b$p b$p;
        double d2;
        this.a = d2 = Math.sqrt(1500.0);
        this.b = 0.5;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = b$p;
    }

    public d(float f5) {
        b$p b$p;
        double d2;
        this.a = d2 = Math.sqrt(1500.0);
        this.b = 0.5;
        this.c = false;
        this.j = b$p;
        this.i = d2 = (double)f5;
    }

    public final void a() {
        double d2;
        this.b = d2 = (double)1.0f;
        this.c = false;
    }

    public final void b(float f5) {
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object > 0) {
            double d2;
            this.a = d2 = Math.sqrt(f5);
            this.c = false;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Spring stiffness constant must be positive.");
        throw illegalArgumentException;
    }

    public final b$p c(double d2, double d5, long l2) {
        block11: {
            double d7;
            double d9;
            double d12;
            float f5;
            double d13;
            double d14;
            double d15;
            double d16;
            Object object;
            d d17;
            block10: {
                d17 = this;
                object = this.c;
                d16 = 1.0;
                if (object != 0) break block10;
                d15 = this.i;
                d14 = Double.MAX_VALUE;
                double d18 = d15 - d14;
                object = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                if (object == 0) break block11;
                d15 = this.b;
                double d19 = d15 - d16;
                object = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                if (object > 0) {
                    d14 = -d15;
                    d13 = this.a;
                    this.f = d15 = Math.sqrt(d15 * d15 - d16) * d13 + (d14 *= d13);
                    d15 = this.b;
                    d14 = -d15;
                    d13 = this.a;
                    d14 *= d13;
                    d15 = Math.sqrt(d15 * d15 - d16) * d13;
                    this.g = d14 -= d15;
                } else {
                    d14 = 0.0;
                    double d20 = d15 - d14;
                    object = d20 == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                    if (object >= 0 && (object = (Object)(d15 == d16 ? 0 : (d15 < d16 ? -1 : 1))) < 0) {
                        d14 = this.a;
                        d15 *= d15;
                        this.h = d15 = Math.sqrt(d16 - d15) * d14;
                    }
                }
                object = 1;
                f5 = Float.MIN_VALUE;
                d17.c = object;
            }
            d15 = (double)l2 / 1000.0;
            d14 = d17.i;
            d14 = d2 - d14;
            d13 = d17.b;
            double d22 = Math.E;
            object = d13 == d16 ? 0 : (d13 > d16 ? 1 : -1);
            if (object > 0) {
                d12 = d17.g;
                d13 = d12 * d14 - d5;
                d9 = d17.f;
                double d23 = d12 - d9;
                d13 /= d23;
                d13 = d14 - d13;
                d14 = d14 * d12 - d5;
                d9 = d12 - d9;
                d14 /= d9;
                d12 *= d15;
                d12 = Math.pow(d22, d12) * d13;
                d9 = d17.f * d15;
                d9 = Math.pow(d22, d9) * d14 + d12;
                d12 = d17.g;
                d13 *= d12;
                d12 *= d15;
                d12 = Math.pow(d22, d12) * d13;
                d13 = d17.f;
                d14 *= d13;
                d7 = Math.pow(d22, d13 *= d15) * d14 + d12;
            } else {
                object = d13 == d16 ? 0 : (d13 > d16 ? 1 : -1);
                if (object == 0) {
                    d12 = d17.a;
                    d13 = d12 * d14 + d5;
                    d9 = d13 * d15 + d14;
                    d12 = -d12 * d15;
                    d12 = Math.pow(d22, d12) * d9;
                    d14 = -d17.a * d15;
                    d14 = Math.pow(d22, d14) * d9;
                    d9 = d17.a;
                    double d24 = -d9;
                    d9 = -d9 * d15;
                    d7 = Math.pow(d22, d9) * d13 + (d14 *= d24);
                    d9 = d12;
                } else {
                    d9 = d17.h;
                    d16 /= d9;
                    d9 = d17.a;
                    double d25 = (d13 * d9 * d14 + d5) * d16;
                    d12 = -d13 * d9 * d15;
                    d12 = Math.pow(d22, d12);
                    d13 = Math.cos(d17.h * d15) * d14;
                    d9 = (Math.sin(d17.h * d15) * d25 + d13) * d12;
                    d12 = d17.a;
                    d13 = -d12 * d9;
                    d22 = d17.b;
                    d13 *= d22;
                    d22 = -d22 * d12 * d15;
                    d12 = Math.pow(Math.E, d22);
                    d22 = d17.h;
                    d2 = d9;
                    d9 = -d22 * d14;
                    d14 = Math.sin(d22 * d15) * d9;
                    d22 = d17.h;
                    d25 *= d22;
                    d7 = (Math.cos(d22 *= d15) * d25 + d14) * d12 + d13;
                    d9 = d2;
                }
            }
            d12 = d17.i;
            f5 = (float)(d9 + d12);
            b$p b$p = d17.j;
            b$p.a = f5;
            b$p.b = f5 = (float)d7;
            return b$p;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        throw illegalStateException;
    }
}

