/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Au1
 */
public final class au1_1
extends zf0_1 {
    public double[] a;
    public double[][] b;
    public double[] c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final double b(double d2) {
        double d5;
        double[] dArray = this.a;
        int n3 = dArray.length;
        double d7 = dArray[0];
        double[][] dArray2 = this.b;
        Object object = d2 == d7 ? 0 : (d2 < d7 ? -1 : 1);
        if (object <= 0) {
            dArray = dArray2[0];
            d5 = dArray[0];
            d2 -= d7;
            d7 = this.e(d7);
            return d7 * d2 + d5;
        }
        d7 = dArray[n3 += -1];
        double d9 = d2 - d7;
        Object object2 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object2 >= 0) {
            dArray = dArray2[n3];
            d5 = dArray[0];
            d2 -= d7;
            d7 = this.e(d7);
            return d7 * d2 + d5;
        }
        int n4 = 0;
        while (n4 < n3) {
            double d12 = dArray[n4];
            double d13 = d2 - d12;
            Object object3 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
            if (object3 == false) {
                return dArray2[n4][0];
            }
            object3 = n4 + 1;
            double d14 = dArray[object3];
            double d15 = d2 - d14;
            Object object4 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
            if (object4 < 0) {
                d2 = (d2 - d12) / (d14 -= d12);
                d12 = dArray2[n4][0];
                double d16 = dArray2[object3][0];
                d7 = (1.0 - d2) * d12;
                return d16 * d2 + d7;
            }
            n4 = (int)object3;
        }
        return 0.0;
    }

    public final void c(double d2, double[] dArray) {
        int n3;
        double[] dArray2 = this.a;
        int n4 = dArray2.length;
        double[][] dArray3 = this.b;
        double[] dArray4 = dArray3[0];
        int n7 = dArray4.length;
        double d5 = dArray2[0];
        double[] dArray5 = this.c;
        Object object = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
        if (object <= 0) {
            this.f(d5, dArray5);
            Object var14_12 = null;
            for (n4 = 0; n4 < n7; ++n4) {
                double[] dArray6 = dArray3[0];
                double d7 = dArray6[n4];
                d5 = dArray2[0];
                d5 = d2 - d5;
                double d9 = dArray5[n4];
                dArray[n4] = d5 = d5 * d9 + d7;
            }
            return;
        }
        int n8 = n4 + -1;
        double d12 = dArray2[n8];
        double d13 = d2 - d12;
        Object object2 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
        if (object2 >= 0) {
            this.f(d12, dArray5);
            for (n3 = 0; n3 < n7; ++n3) {
                double[] dArray7 = dArray3[n8];
                d12 = dArray7[n3];
                double d14 = dArray2[n8];
                d14 = d2 - d14;
                double d15 = dArray5[n3];
                dArray[n3] = d14 = d14 * d15 + d12;
            }
            return;
        }
        n8 = 0;
        Object var15_15 = null;
        while (n8 < (object2 = (Object)(n4 + -1))) {
            double d16;
            double d17;
            double d18;
            double d19 = dArray2[n8];
            double d20 = d2 - d19;
            object = d20 == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
            if (object == false) {
                for (object2 = (Object)false; object2 < n7; ++object2) {
                    dArray5 = dArray3[n8];
                    dArray[object2] = d12 = dArray5[object2];
                }
            }
            if ((d18 = (d17 = d2 - (d16 = dArray2[object2 = (Object)(n8 + 1)])) == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1)) < 0) {
                double d22 = dArray2[n8];
                double d23 = (d2 - d22) / (d16 -= d22);
                while (n3 < n7) {
                    d12 = dArray3[n8][n3];
                    dArray5 = dArray3[object2];
                    double d24 = dArray5[n3];
                    double d25 = (1.0 - d23) * d12;
                    dArray[n3] = d24 = d24 * d23 + d25;
                    ++n3;
                }
                return;
            }
            n8 = (int)object2;
        }
    }

    public final void d(double d2, float[] fArray) {
        int n3;
        double[] dArray = this.a;
        int n4 = dArray.length;
        double[][] dArray2 = this.b;
        double[] dArray3 = dArray2[0];
        int n7 = dArray3.length;
        double d5 = dArray[0];
        double[] dArray4 = this.c;
        Object object = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
        if (object <= 0) {
            this.f(d5, dArray4);
            for (n4 = 0; n4 < n7; ++n4) {
                float f5;
                double[] dArray5 = dArray2[0];
                double d7 = dArray5[n4];
                d5 = dArray[0];
                d5 = d2 - d5;
                double d9 = dArray4[n4];
                d5 = d5 * d9 + d7;
                fArray[n4] = f5 = (float)d5;
            }
            return;
        }
        d5 = dArray[n4 += -1];
        double d12 = d2 - d5;
        object = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
        if (object >= 0) {
            this.f(d5, dArray4);
            for (n3 = 0; n3 < n7; ++n3) {
                float f6;
                double[] dArray6 = dArray2[n4];
                double d13 = dArray6[n3];
                d5 = dArray[n4];
                d5 = d2 - d5;
                double d14 = dArray4[n3];
                d5 = d5 * d14 + d13;
                fArray[n3] = f6 = (float)d5;
            }
            return;
        }
        int n8 = 0;
        float f7 = 0.0f;
        Object var14_14 = null;
        while (n8 < n4) {
            double d15;
            double d16;
            double d17;
            int n10;
            double d18 = dArray[n8];
            double d19 = d2 - d18;
            object = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
            if (object == false) {
                for (n10 = 0; n10 < n7; ++n10) {
                    float f8;
                    dArray4 = dArray2[n8];
                    double d20 = dArray4[n10];
                    fArray[n10] = f8 = (float)d20;
                }
            }
            if ((d17 = (d16 = d2 - (d15 = dArray[n10 = n8 + 1])) == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1)) < 0) {
                double d22 = dArray[n8];
                d2 = (d2 - d22) / (d15 -= d22);
                while (n3 < n7) {
                    float f11;
                    d15 = dArray2[n8][n3];
                    dArray = dArray2[n10];
                    d22 = dArray[n3];
                    double d23 = (1.0 - d2) * d15;
                    d22 = d22 * d2 + d23;
                    fArray[n3] = f11 = (float)d22;
                    ++n3;
                }
                return;
            }
            n8 = n10;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final double e(double d2) {
        int n3;
        double d5;
        double d7;
        double[] dArray = this.a;
        int n4 = dArray.length;
        double d9 = dArray[0];
        double d12 = d2 - d9;
        Object object = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (object < 0 || (d7 = (d5 = d2 - (d9 = dArray[n3 = n4 + -1])) == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1)) >= 0) {
            d2 = d9;
        }
        n3 = 0;
        int n7;
        while (n3 < (n7 = n4 + -1)) {
            n7 = n3 + 1;
            double d13 = dArray[n7];
            double d14 = d2 - d13;
            Object object2 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
            if (object2 <= 0) {
                d2 = dArray[n3];
                double[][] dArray2 = this.b;
                double d15 = dArray2[n3][0];
                return (dArray2[n7][0] - d15) / (d13 -= d2);
            }
            n3 = n7;
        }
        return 0.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void f(double d2, double[] dArray) {
        int n3;
        int n4;
        double d5;
        double d7;
        double[] dArray2 = this.a;
        int n7 = dArray2.length;
        double[][] dArray3 = this.b;
        int n8 = 0;
        double[] dArray4 = dArray3[0];
        int n10 = dArray4.length;
        double d9 = dArray2[0];
        double d12 = d2 - d9;
        Object object = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (object <= 0 || (d7 = (d5 = d2 - (d9 = dArray2[n4 = n7 + -1])) == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1)) >= 0) {
            d2 = d9;
        }
        n4 = 0;
        while (n4 < (n3 = n7 + -1)) {
            n3 = n4 + 1;
            double d13 = dArray2[n3];
            double d14 = d2 - d13;
            Object object2 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
            if (object2 <= 0) {
                d2 = dArray2[n4];
                d13 -= d2;
                while (n8 < n10) {
                    double d15;
                    double d16 = dArray3[n4][n8];
                    double[] dArray5 = dArray3[n3];
                    dArray[n8] = d15 = (dArray5[n8] - d16) / d13;
                    ++n8;
                }
                return;
            }
            n4 = n3;
        }
    }

    public final double[] g() {
        return this.a;
    }
}

