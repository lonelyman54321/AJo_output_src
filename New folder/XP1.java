/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;

public final class XP1
extends zf0_1 {
    public final double[] a;
    public final double[][] b;
    public final double[][] c;
    public final double[] d;

    public XP1(double[] dArray, double[][] dArray2) {
        double d2;
        double d5;
        Object object;
        double d7;
        Object object2;
        double d9;
        double d12;
        Object object3;
        XP1 xP1 = this;
        double[] dArray3 = dArray;
        double[][] dArray4 = dArray2;
        int n3 = dArray.length;
        double[] dArray5 = dArray2[0];
        int n4 = dArray5.length;
        double[] dArray6 = new double[n4];
        this.d = dArray6;
        int n7 = n3 + -1;
        int n8 = 2;
        Object object4 = new int[n8];
        int n10 = 1;
        object4[n10] = n4;
        object4[0] = n7;
        Object object5 = Double.TYPE;
        object4 = (double[][])Array.newInstance(object5, object4);
        Object object6 = new int[n8];
        object6[n10] = n4;
        object6[0] = n3;
        double[][] dArray7 = (double[][])Array.newInstance(object5, object6);
        object5 = null;
        for (object3 = 0; object3 < n4; ++object3) {
            int n14;
            int n15 = 0;
            object6 = null;
            while (n15 < n7) {
                n14 = n15 + 1;
                d12 = dArray3[n14];
                d9 = dArray3[n15];
                object2 = object4[n15];
                d7 = dArray4[n14][object3];
                object = dArray4[n15];
                d5 = object[object3];
                object2[object3] = d7 = (d7 - d5) / (d12 -= d9);
                if (n15 == 0) {
                    object6 = dArray7[n15];
                    object6[object3] = (int)d7;
                } else {
                    double[] dArray8 = dArray7[n15];
                    object6 = object4[n15 += -1];
                    int n16 = object6[object3] + d7;
                    d2 = 0.5;
                    dArray8[object3] = n16 *= d2;
                }
                n15 = n14;
            }
            object6 = dArray7[n7];
            n14 = n3 + -2;
            int n17 = object4[n14];
            d12 = n17[object3];
            object6[object3] = (int)d12;
        }
        for (n3 = 0; n3 < n7; ++n3) {
            for (n8 = 0; n8 < n4; ++n8) {
                object5 = object4[n3];
                Class<Double> clazz = object5[n8];
                d12 = 0.0;
                Class<Double> clazz2 = clazz - d12;
                object3 = clazz2 == 0 ? 0 : (clazz2 > 0 ? 1 : -1);
                if (object3 == 0) {
                    dArray7[n3][n8] = d12;
                    object3 = n3 + 1;
                    object5 = dArray7[object3];
                    object5[n8] = (Class<Double>)d12;
                    continue;
                }
                object5 = dArray7[n3];
                d12 = (double)(object5[n8] / clazz);
                object3 = n3 + 1;
                object2 = dArray7[object3];
                d2 = object2[n8];
                d9 = Math.hypot(d12, clazz = d2 / clazz);
                double d13 = d9 - (d7 = 9.0);
                Object object7 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                if (object7 <= 0) continue;
                d7 = 3.0 / d9;
                object2 = dArray7[n3];
                d12 *= d7;
                object = object4[n3];
                d5 = object[n8];
                object2[n8] = d12 *= d5;
                object5 = dArray7[object3];
                d7 *= clazz;
                clazz = (Class<Double>)object[n8];
                object5[n8] = (Class<Double>)(d7 *= clazz);
            }
        }
        xP1.a = dArray3;
        xP1.b = dArray4;
        xP1.c = dArray7;
    }

    public static double h(double d2, double d5, double d7, double d9, double d12, double d13) {
        double d14 = d5 * d5;
        double d15 = -6.0 * d14 * d9;
        double d16 = 6.0;
        double d17 = d5 * d16;
        double d18 = d17 * d9 + d15;
        d16 = d16 * d14 * d7 + d18;
        d15 = 3.0 * d2;
        d17 = d15 * d13 * d14 + (d16 -= (d17 *= d7));
        d15 = d15 * d12 * d14 + d17;
        d14 = 2.0 * d2 * d13 * d5;
        d15 -= d14;
        d14 = 4.0 * d2 * d12 * d5;
        return d2 * d12 + (d15 -= d14);
    }

    public static double i(double d2, double d5, double d7, double d9, double d12, double d13) {
        double d14 = d5 * d5;
        double d15 = d14 * d5;
        double d16 = -2.0 * d15 * d9;
        double d17 = 3.0 * d14;
        double d18 = d17 * d9 + d16;
        d16 = 2.0;
        double d19 = d15 * d16 * d7 + d18;
        d19 = d19 - (d17 *= d7) + d7;
        d17 = d2 * d13;
        d18 = d17 * d15 + d19;
        d19 = d2 * d12;
        d15 = d15 * d19 + d18;
        d15 -= (d17 *= d14);
        d16 = d16 * d2 * d12 * d14;
        return d19 * d5 + (d15 -= d16);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final double b(double d2) {
        double d5;
        double d7;
        XP1 xP1 = this;
        double[] dArray = this.a;
        int n3 = dArray.length;
        double d9 = dArray[0];
        double[][] dArray2 = this.b;
        Object object = d2 == d9 ? 0 : (d2 < d9 ? -1 : 1);
        if (object <= 0) {
            double[] dArray3 = dArray2[0];
            d7 = dArray3[0];
            d5 = d2 - d9;
            d9 = this.e(d9);
            return d9 * d5 + d7;
        }
        d9 = dArray[n3 += -1];
        double d12 = d2 - d9;
        Object object2 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
        if (object2 >= 0) {
            double[] dArray4 = dArray2[n3];
            d7 = dArray4[0];
            d5 = d2 - d9;
            d9 = this.e(d9);
            return d9 * d5 + d7;
        }
        int n4 = 0;
        while (n4 < n3) {
            double d13 = dArray[n4];
            double d14 = d2 - d13;
            Object object3 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
            if (object3 == false) {
                return dArray2[n4][0];
            }
            object3 = n4 + 1;
            double d15 = dArray[object3];
            double d16 = d2 - d15;
            Object object4 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
            if (object4 < 0) {
                double d17 = d15 - d13;
                double d18 = (d2 - d13) / d17;
                double d19 = dArray2[n4][0];
                double d20 = dArray2[object3][0];
                double[][] dArray5 = xP1.c;
                double d22 = dArray5[n4][0];
                double d23 = dArray5[object3][0];
                return XP1.i(d17, d18, d19, d20, d22, d23);
            }
            n4 = (int)object3;
        }
        return 0.0;
    }

    public final void c(double d2, double[] dArray) {
        int n3;
        XP1 xP1 = this;
        double[] dArray2 = this.a;
        int n4 = dArray2.length;
        double[][] dArray3 = this.b;
        double[] dArray4 = dArray3[0];
        int n7 = dArray4.length;
        double d5 = dArray2[0];
        double[] dArray5 = this.d;
        Object object = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
        if (object <= 0) {
            this.f(d5, dArray5);
            Object var15_13 = null;
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
        Object var16_16 = null;
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
                    double d24 = dArray3[n8][n3];
                    double d25 = dArray3[object2][n3];
                    Object object3 = xP1.c;
                    double[] dArray8 = object3[n8];
                    double d26 = dArray8[n3];
                    object3 = object3[object2];
                    double[] dArray9 = object3[n3];
                    dArray[n3] = d22 = XP1.i(d16, d23, d24, d25, d26, (double)dArray9);
                    ++n3;
                }
                return;
            }
            n8 = (int)object2;
        }
    }

    public final void d(double d2, float[] fArray) {
        int n3;
        XP1 xP1 = this;
        double[] dArray = this.a;
        int n4 = dArray.length;
        double[][] dArray2 = this.b;
        double[] dArray3 = dArray2[0];
        int n7 = dArray3.length;
        double d5 = dArray[0];
        double[] dArray4 = this.d;
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
        Object var15_15 = null;
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
                double d23 = (d2 - d22) / (d15 -= d22);
                while (n3 < n7) {
                    float f11;
                    double d24 = dArray2[n8][n3];
                    double d25 = dArray2[n10][n3];
                    Object object2 = xP1.c;
                    double[] dArray7 = object2[n8];
                    double d26 = dArray7[n3];
                    object2 = object2[n10];
                    double[] dArray8 = object2[n3];
                    d22 = XP1.i(d15, d23, d24, d25, d26, (double)dArray8);
                    fArray[n3] = f11 = (float)d22;
                    ++n3;
                }
                return;
            }
            n8 = n10;
        }
    }

    public final double e(double d2) {
        int n3;
        int n4;
        double d5;
        XP1 xP1 = this;
        Object object = this.a;
        int n7 = ((double[])object).length;
        double d7 = object[0];
        double d9 = d2 - d7;
        Object object2 = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        if (object2 >= 0 && (object2 = (d5 = d2 - (d7 = object[n4 = n7 + -1])) == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1)) < 0) {
            d7 = d2;
        }
        object2 = false;
        while (object2 < (n3 = n7 + -1)) {
            n3 = (int)(object2 + true);
            double d12 = object[n3];
            double d13 = d7 - d12;
            Object object3 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
            if (object3 <= 0) {
                double d14 = object[object2];
                double d15 = (d7 - d14) / (d12 -= d14);
                object = xP1.b;
                void var18_13 = object[object2][0];
                void var20_14 = object[n3][0];
                object = xP1.c;
                void var22_15 = object[object2][0];
                void var24_16 = object[n3][0];
                return XP1.h(d12, d15, (double)var18_13, (double)var20_14, (double)var22_15, (double)var24_16) / d12;
            }
            object2 = n3;
        }
        return 0.0;
    }

    public final void f(double d2, double[] dArray) {
        int n3;
        int n4;
        double d5;
        XP1 xP1 = this;
        Object object = this.a;
        int n7 = ((double[])object).length;
        double[][] dArray2 = this.b;
        int n8 = 0;
        double[] dArray3 = dArray2[0];
        int n10 = dArray3.length;
        double d7 = object[0];
        double d9 = d2 - d7;
        Object object2 = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        if (object2 > 0 && (object2 = (d5 = d2 - (d7 = object[n4 = n7 + -1])) == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1)) < 0) {
            d7 = d2;
        }
        object2 = false;
        while (object2 < (n3 = n7 + -1)) {
            n3 = (int)(object2 + true);
            double d12 = object[n3];
            double d13 = d7 - d12;
            Object object3 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
            if (object3 <= 0) {
                double d14 = object[object2];
                d7 = (d7 - d14) / (d12 -= d14);
                while (n8 < n10) {
                    double d15;
                    double d16 = dArray2[object2][n8];
                    double d17 = dArray2[n3][n8];
                    object = xP1.c;
                    double d18 = object[object2];
                    void var26_20 = d18[n8];
                    object = object[n3];
                    double d19 = object[n8];
                    dArray[n8] = d15 = XP1.h(d12, d7, d16, d17, (double)var26_20, d19) / d12;
                    ++n8;
                }
                break;
            }
            object2 = n3;
        }
    }

    public final double[] g() {
        return this.a;
    }
}

