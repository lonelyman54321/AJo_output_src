/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.MathUtils;

public class ColorUtils {
    static final double[][] SRGB_TO_XYZ;
    static final double[] WHITE_POINT_D65;
    static final double[][] XYZ_TO_SRGB;

    static {
        double[] dArray;
        double[] dArray2;
        double[] dArray3;
        double[] dArray4;
        double[] dArray5;
        int n3 = 3;
        double[] dArray6 = dArray5 = new double[n3];
        dArray5[0] = 0.41233895;
        dArray6[1] = 0.35762064;
        dArray6[2] = 0.18051042;
        double[] dArray7 = dArray4 = new double[n3];
        dArray4[0] = 0.2126;
        dArray7[1] = 0.7152;
        dArray7[2] = 0.0722;
        double[] dArray8 = dArray3 = new double[n3];
        dArray3[0] = 0.01932141;
        dArray8[1] = 0.11916382;
        dArray8[2] = 0.95034478;
        Object object = new double[n3][];
        object[0] = dArray5;
        int n4 = 1;
        object[n4] = dArray4;
        int n7 = 2;
        object[n7] = dArray3;
        SRGB_TO_XYZ = object;
        double[] dArray9 = dArray3 = new double[n3];
        dArray3[0] = 3.2413774792388685;
        dArray9[1] = -1.5376652402851851;
        dArray9[2] = -0.49885366846268053;
        Object object2 = object = (Object)new double[n3];
        object[0] = (double[])-0.9691452513005321;
        object2[1] = (double[])1.8758853451067872;
        object2[2] = (double[])0.04156585616912061;
        double[] dArray10 = dArray2 = new double[n3];
        dArray2[0] = 0.05562093689691305;
        dArray10[1] = -0.20395524564742123;
        dArray10[2] = 1.0571799111220335;
        double[][] dArrayArray = new double[n3][];
        dArrayArray[0] = dArray3;
        dArrayArray[n4] = (double[])object;
        dArrayArray[n7] = dArray2;
        XYZ_TO_SRGB = dArrayArray;
        double[] dArray11 = dArray = new double[n3];
        dArray[0] = 95.047;
        dArray11[1] = 100.0;
        dArray11[2] = 108.883;
        WHITE_POINT_D65 = dArray;
    }

    private ColorUtils() {
    }

    public static int alphaFromArgb(int n3) {
        return n3 >> 24 & 0xFF;
    }

    public static int argbFromLab(double d2, double d5, double d7) {
        double[] dArray = WHITE_POINT_D65;
        d2 = (d2 + 16.0) / 116.0;
        d5 = d5 / 500.0 + d2;
        d7 /= 200.0;
        d7 = d2 - d7;
        d5 = ColorUtils.labInvf(d5);
        d2 = ColorUtils.labInvf(d2);
        d7 = ColorUtils.labInvf(d7);
        double d9 = dArray[0];
        double d12 = d5 * d9;
        d5 = dArray[1];
        double d13 = d2 * d5;
        d2 = dArray[2];
        double d14 = d7 * d2;
        return ColorUtils.argbFromXyz(d12, d13, d14);
    }

    public static int argbFromLinrgb(double[] dArray) {
        int n3 = ColorUtils.delinearized(dArray[0]);
        int n4 = ColorUtils.delinearized(dArray[1]);
        int n7 = ColorUtils.delinearized(dArray[2]);
        return ColorUtils.argbFromRgb(n3, n4, n7);
    }

    public static int argbFromLstar(double d2) {
        int n3 = ColorUtils.delinearized(ColorUtils.yFromLstar(d2));
        return ColorUtils.argbFromRgb(n3, n3, n3);
    }

    public static int argbFromRgb(int n3, int n4, int n7) {
        n3 = (n3 & 0xFF) << 16 | 0xFF000000;
        n4 = (n4 & 0xFF) << 8;
        n3 |= n4;
        n4 = n7 & 0xFF;
        return n3 | n4;
    }

    public static int argbFromXyz(double d2, double d5, double d7) {
        Object object = XYZ_TO_SRGB;
        double[] dArray = object[0];
        double d9 = dArray[0] * d2;
        int n3 = 1;
        double d12 = dArray[n3] * d5 + d9;
        int n4 = 2;
        double d13 = dArray[n4] * d7 + d12;
        dArray = object[n3];
        d12 = dArray[0] * d2;
        double d14 = dArray[n3] * d5 + d12;
        d12 = dArray[n4] * d7 + d14;
        object = object[n4];
        reference var18_11 = object[0] * d2;
        reference var20_12 = object[n3] * d5 + var18_11;
        var18_11 = object[n4] * d7 + var20_12;
        int n7 = ColorUtils.delinearized(d13);
        n4 = ColorUtils.delinearized(d12);
        int n8 = ColorUtils.delinearized((double)var18_11);
        return ColorUtils.argbFromRgb(n7, n4, n8);
    }

    public static int blueFromArgb(int n3) {
        return n3 & 0xFF;
    }

    public static int delinearized(double d2) {
        double d5 = 0.0031308;
        double d7 = (d2 /= 100.0) - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object <= 0) {
            d5 = 12.92;
            d2 *= d5;
        } else {
            d2 = Math.pow(d2, 0.4166666666666667) * 1.055;
            d5 = 0.055;
            d2 -= d5;
        }
        int n3 = (int)Math.round(d2 * 255.0);
        return MathUtils.clampInt(0, 255, n3);
    }

    public static int greenFromArgb(int n3) {
        return n3 >> 8 & 0xFF;
    }

    public static boolean isOpaque(int n3) {
        int n4;
        n3 = (n3 = ColorUtils.alphaFromArgb(n3)) >= (n4 = 255) ? 1 : 0;
        return n3 != 0;
    }

    public static double labF(double d2) {
        double d5 = 0.008856451679035631;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object > 0) {
            return Math.pow(d2, 0.3333333333333333);
        }
        return (d2 * 903.2962962962963 + 16.0) / 116.0;
    }

    public static double[] labFromArgb(int n3) {
        double d2 = ColorUtils.linearized(ColorUtils.redFromArgb(n3));
        double d5 = ColorUtils.linearized(ColorUtils.greenFromArgb(n3));
        double d7 = ColorUtils.linearized(ColorUtils.blueFromArgb(n3));
        Object object = SRGB_TO_XYZ;
        double[] dArray = object[0];
        double d9 = dArray[0] * d2;
        int n4 = 1;
        double d12 = dArray[n4] * d5 + d9;
        int n7 = 2;
        double d13 = dArray[n7] * d7 + d12;
        dArray = object[n4];
        d12 = dArray[0] * d2;
        Object object2 = dArray[n4] * d5 + d12;
        d12 = dArray[n7] * d7 + object2;
        object = object[n7];
        object2 = object[0] * d2;
        d2 = (double)(object[n4] * d5 + object2);
        d5 = (double)(object[n7] * d7 + d2);
        double[] dArray2 = WHITE_POINT_D65;
        d7 = dArray2[0];
        d13 /= d7;
        d7 = dArray2[n4];
        d12 /= d7;
        d7 = dArray2[n7];
        d5 /= d7;
        d2 = ColorUtils.labF(d13);
        d7 = ColorUtils.labF(d12);
        d5 = ColorUtils.labF(d5);
        d12 = 116.0 * d7 - 16.0;
        d2 = (d2 - d7) * 500.0;
        d7 = (d7 - d5) * 200.0;
        double[] dArray3 = new double[3];
        dArray3[0] = d12;
        dArray3[n4] = d2;
        dArray3[n7] = d7;
        return dArray3;
    }

    public static double labInvf(double d2) {
        double d5 = d2 * d2 * d2;
        double d7 = 0.008856451679035631;
        double d9 = d5 - d7;
        Object object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object > 0) {
            return d5;
        }
        return (d2 * 116.0 - 16.0) / 903.2962962962963;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static double linearized(int n3) {
        double d2 = (double)n3 / 255.0;
        double d5 = 0.040449936;
        double d7 = 100.0;
        n3 = (int)(d2 == d5 ? 0 : (d2 < d5 ? -1 : 1));
        if (n3 <= 0) {
            d5 = 12.92;
            d2 /= d5;
            return d2 * d7;
        }
        d2 = (d2 + 0.055) / 1.055;
        d5 = 2.4;
        d2 = Math.pow(d2, d5);
        return d2 * d7;
    }

    public static double lstarFromArgb(int n3) {
        return ColorUtils.labF(ColorUtils.xyzFromArgb(n3)[1] / 100.0) * 116.0 - 16.0;
    }

    public static double lstarFromY(double d2) {
        return ColorUtils.labF(d2 / 100.0) * 116.0 - 16.0;
    }

    public static int redFromArgb(int n3) {
        return n3 >> 16 & 0xFF;
    }

    public static double[] whitePointD65() {
        return WHITE_POINT_D65;
    }

    public static double[] xyzFromArgb(int n3) {
        double d2 = ColorUtils.linearized(ColorUtils.redFromArgb(n3));
        double d5 = ColorUtils.linearized(ColorUtils.greenFromArgb(n3));
        double d7 = ColorUtils.linearized(ColorUtils.blueFromArgb(n3));
        double[] dArray = new double[]{d2, d5, d7};
        double[][] dArray2 = SRGB_TO_XYZ;
        return MathUtils.matrixMultiply(dArray, dArray2);
    }

    public static double yFromLstar(double d2) {
        return ColorUtils.labInvf((d2 + 16.0) / 116.0) * 100.0;
    }
}

