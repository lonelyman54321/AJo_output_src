/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

public class MathUtils {
    private MathUtils() {
    }

    public static double clampDouble(double d2, double d5, double d7) {
        Object object = d7 == d2 ? 0 : (d7 < d2 ? -1 : 1);
        if (object < 0) {
            return d2;
        }
        Object object2 = d7 == d5 ? 0 : (d7 > d5 ? 1 : -1);
        if (object2 > 0) {
            return d5;
        }
        return d7;
    }

    public static int clampInt(int n3, int n4, int n7) {
        if (n7 < n3) {
            return n3;
        }
        if (n7 > n4) {
            return n4;
        }
        return n7;
    }

    public static double differenceDegrees(double d2, double d5) {
        d2 = Math.abs(d2 - d5);
        d5 = 180.0;
        d2 = Math.abs(d2 - d5);
        return d5 - d2;
    }

    public static double lerp(double d2, double d5, double d7) {
        double d9 = (1.0 - d7) * d2;
        return d7 * d5 + d9;
    }

    public static double[] matrixMultiply(double[] dArray, double[][] dArray2) {
        double d2 = dArray[0];
        double[] dArray3 = dArray2[0];
        double d5 = dArray3[0] * d2;
        int n3 = 1;
        double d7 = dArray[n3];
        double d9 = dArray3[n3] * d7 + d5;
        int n4 = 2;
        double d12 = dArray[n4];
        double d13 = dArray3[n4] * d12 + d9;
        dArray3 = dArray2[n3];
        d9 = dArray3[0] * d2;
        double d14 = dArray3[n3] * d7 + d9;
        d9 = dArray3[n4] * d12 + d14;
        dArray3 = dArray2[n4];
        d14 = dArray3[0];
        d2 *= d14;
        d14 = dArray3[n3];
        d7 = d7 * d14 + d2;
        d2 = dArray3[n4];
        d12 = d12 * d2 + d7;
        double[] dArray4 = new double[3];
        dArray4[0] = d13;
        dArray4[n3] = d9;
        dArray4[n4] = d12;
        return dArray4;
    }

    public static double rotationDirection(double d2, double d5) {
        double d7 = (d2 = MathUtils.sanitizeDegreesDouble(d5 - d2)) - (d5 = 180.0);
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        d2 = object <= 0 ? 1.0 : -1.0;
        return d2;
    }

    public static double sanitizeDegreesDouble(double d2) {
        double d5 = 360.0;
        double d7 = 0.0;
        double d9 = (d2 %= d5) - d7;
        Object object = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        if (object < 0) {
            d2 += d5;
        }
        return d2;
    }

    public static int sanitizeDegreesInt(int n3) {
        if ((n3 %= 360) < 0) {
            n3 += 360;
        }
        return n3;
    }

    public static int signum(double d2) {
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object < 0) {
            return -1;
        }
        object = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (object == false) {
            return 0;
        }
        return 1;
    }
}

