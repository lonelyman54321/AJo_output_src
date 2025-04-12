/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.Cam16;
import com.google.android.material.color.utilities.ColorUtils;
import com.google.android.material.color.utilities.MathUtils;

public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = ViewingConditions.defaultWithBackgroundLstar(50.0);
    private final double aw;
    private final double c;
    private final double fl;
    private final double flRoot;
    private final double n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;
    private final double z;

    private ViewingConditions(double d2, double d5, double d7, double d9, double d12, double d13, double[] dArray, double d14, double d15, double d16) {
        this.n = d2;
        this.aw = d5;
        this.nbb = d7;
        this.ncb = d9;
        this.c = d12;
        this.nc = d13;
        this.rgbD = dArray;
        this.fl = d14;
        this.flRoot = d15;
        this.z = d16;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d2) {
        double[] dArray = ColorUtils.whitePointD65();
        double d5 = ColorUtils.yFromLstar(50.0) * 63.66197723675813 / 100.0;
        return ViewingConditions.make(dArray, d5, d2, 2.0, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ViewingConditions make(double[] dArray, double d2, double d5, double d7, boolean bl2) {
        double[] dArray2;
        double d9;
        double d12;
        double d13 = d2;
        int n3 = 3;
        double d14 = 0.1;
        double d15 = d5;
        d15 = Math.max(d14, d5);
        double[][] dArray3 = Cam16.XYZ_TO_CAM16RGB;
        double d16 = dArray[0];
        double[] dArray4 = dArray3[0];
        double d17 = dArray4[0] * d16;
        int n4 = 1;
        double d18 = dArray[n4];
        double d19 = dArray4[n4] * d18 + d17;
        int n7 = 2;
        double d20 = dArray[n7];
        double d22 = dArray4[n7] * d20 + d19;
        dArray4 = dArray3[n4];
        d19 = dArray4[0] * d16;
        double d23 = dArray4[n4] * d18 + d19;
        d19 = dArray4[n7] * d20 + d23;
        double[] dArray5 = dArray3[n7];
        d23 = dArray5[0];
        d16 *= d23;
        d23 = dArray5[n4];
        d18 = d18 * d23 + d16;
        d16 = dArray5[n7];
        d20 = d20 * d16 + d18;
        d16 = 10.0;
        d18 = d7 / d16;
        d23 = 0.8;
        double d24 = d18 + d23;
        double d25 = d24 - (d18 = 0.9);
        Object object = d25 == 0.0 ? 0 : (d25 > 0.0 ? 1 : -1);
        if (object >= 0) {
            d18 = d24 - d18;
            d12 = d18 * d16;
            d23 = 0.59;
            d9 = 0.69;
            d16 = MathUtils.lerp(d23, d9, d12);
        } else {
            d18 = d24 - d23;
            d12 = d18 * d16;
            d23 = 0.525;
            d9 = 0.59;
            d16 = MathUtils.lerp(d23, d9, d12);
        }
        double d26 = d16;
        d16 = 1.0;
        if (bl2) {
            d12 = d16;
        } else {
            d14 = Math.exp((-d13 - 42.0) / 92.0);
            d23 = 0.2777777777777778;
            d14 *= d23;
            d12 = d14 = (d16 - d14) * d24;
        }
        d14 = MathUtils.clampDouble(0.0, 1.0, d12);
        d23 = 100.0;
        d9 = d23 / d22 * d14 + d16 - d14;
        d12 = d23 / d19 * d14 + d16 - d14;
        double d27 = d23 / d20 * d14 + d16 - d14;
        double[] dArray6 = dArray2 = new double[n3];
        dArray2[0] = d9;
        dArray2[n4] = d12;
        dArray2[n7] = d27;
        d9 = 5.0 * d13;
        d12 = d9 + d16;
        d12 = d16 / d12;
        d27 = d12 * d12 * d12 * d12;
        d16 -= d27;
        d27 *= d13;
        d13 = 0.1 * d16 * d16;
        d16 = Math.cbrt(d9) * d13 + d27;
        d13 = ColorUtils.yFromLstar(d15);
        double d28 = dArray[n4];
        double d29 = d13 /= d28;
        double d30 = Math.sqrt(d13) + 1.48;
        d13 = Math.pow(d13, 0.2);
        d28 = 0.725 / d13;
        d13 = dArray2[0] * d16 * d22 / d23;
        double d32 = 0.42;
        d13 = Math.pow(d13, d32);
        double d34 = Math.pow(dArray2[n4] * d16 * d19 / d23, d32);
        d32 = Math.pow(dArray2[n7] * d16 * d20 / d23, d32);
        dArray2 = new double[n3];
        dArray2[0] = d13;
        double d35 = d34;
        int n8 = 1;
        dArray2[n8] = d34;
        int n10 = 2;
        dArray2[n10] = d32;
        d32 = dArray2[0];
        d35 = 400.0;
        d34 = d32 * d35;
        d18 = 27.13;
        d34 /= (d32 += d18);
        d32 = dArray2[n8];
        d19 = d32 * d35;
        d32 = dArray2[n10];
        d35 *= d32;
        double[] dArray7 = new double[n3];
        dArray7[0] = d34;
        dArray7[n8] = d19 /= (d32 += d18);
        dArray7[n10] = d35 /= (d32 += d18);
        d35 = dArray7[0] * 2.0;
        d32 = dArray7[n8];
        double d36 = (dArray7[n10] * 0.05 + (d35 += d32)) * d28;
        double d37 = Math.pow(d16, 0.25);
        return new ViewingConditions(d29, d36, d28, d28, d26, d24, dArray6, d16, d37, d30);
    }

    public double getAw() {
        return this.aw;
    }

    public double getC() {
        return this.c;
    }

    public double getFl() {
        return this.fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.n;
    }

    public double getNbb() {
        return this.nbb;
    }

    public double getNc() {
        return this.nc;
    }

    public double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    public double getZ() {
        return this.z;
    }
}

