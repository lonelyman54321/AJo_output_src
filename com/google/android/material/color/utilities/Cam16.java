/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.ColorUtils;
import com.google.android.material.color.utilities.ViewingConditions;

public final class Cam16 {
    static final double[][] CAM16RGB_TO_XYZ;
    static final double[][] XYZ_TO_CAM16RGB;
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;
    private final double j;
    private final double jstar;
    private final double m;
    private final double q;
    private final double s;
    private final double[] tempArray;

    static {
        double[] dArray;
        double[] dArray2;
        double[] dArray3;
        double[] dArray4;
        int n3 = 3;
        double[] dArray5 = dArray4 = new double[n3];
        dArray4[0] = 0.401288;
        dArray5[1] = 0.650173;
        dArray5[2] = -0.051461;
        double[] dArray6 = dArray3 = new double[n3];
        dArray3[0] = -0.250268;
        dArray6[1] = 1.204414;
        dArray6[2] = 0.045854;
        double[] dArray7 = dArray2 = new double[n3];
        dArray2[0] = -0.002079;
        dArray7[1] = 0.048952;
        dArray7[2] = 0.953127;
        Object object = new double[n3][];
        object[0] = dArray4;
        int n4 = 1;
        object[n4] = dArray3;
        int n7 = 2;
        object[n7] = dArray2;
        XYZ_TO_CAM16RGB = object;
        double[] dArray8 = dArray2 = new double[n3];
        dArray2[0] = 1.8620678;
        dArray8[1] = -1.0112547;
        dArray8[2] = 0.14918678;
        Object object2 = object = (Object)new double[n3];
        object[0] = (double[])0.38752654;
        object2[1] = (double[])0.62144744;
        object2[2] = (double[])-0.00897398;
        double[] dArray9 = dArray = new double[n3];
        dArray[0] = -0.0158415;
        dArray9[1] = -0.03412294;
        dArray9[2] = 1.0499644;
        double[][] dArrayArray = new double[n3][];
        dArrayArray[0] = dArray2;
        dArrayArray[n4] = (double[])object;
        dArrayArray[n7] = dArray;
        CAM16RGB_TO_XYZ = dArrayArray;
    }

    private Cam16(double d2, double d5, double d7, double d9, double d12, double d13, double d14, double d15, double d16) {
        double[] dArray;
        double[] dArray2 = dArray = new double[3];
        dArray[0] = 0.0;
        dArray2[1] = 0.0;
        dArray2[2] = 0.0;
        this.tempArray = dArray;
        this.hue = d2;
        this.chroma = d5;
        this.j = d7;
        this.q = d9;
        this.m = d12;
        this.s = d13;
        this.jstar = d14;
        this.astar = d15;
        this.bstar = d16;
    }

    public static Cam16 fromInt(int n3) {
        ViewingConditions viewingConditions = ViewingConditions.DEFAULT;
        return Cam16.fromIntInViewingConditions(n3, viewingConditions);
    }

    public static Cam16 fromIntInViewingConditions(int n3, ViewingConditions viewingConditions) {
        int n4 = n3;
        int n7 = (0xFF0000 & n3) >> 16;
        int n8 = (0xFF00 & n3) >> 8;
        n4 = n3 & 0xFF;
        double d2 = ColorUtils.linearized(n7);
        double d5 = ColorUtils.linearized(n8);
        double d7 = ColorUtils.linearized(n4);
        double d9 = 0.41233895 * d2;
        double d12 = 0.35762064 * d5 + d9;
        double d13 = 0.18051042 * d7 + d12;
        d9 = 0.2126 * d2;
        d12 = 0.7152 * d5 + d9;
        double d14 = 0.0722 * d7 + d12;
        d5 = d5 * 0.11916382 + (d2 *= 0.01932141);
        double d15 = d7 * 0.95034478 + d5;
        return Cam16.fromXyzInViewingConditions(d13, d14, d15, viewingConditions);
    }

    public static Cam16 fromJch(double d2, double d5, double d7) {
        ViewingConditions viewingConditions = ViewingConditions.DEFAULT;
        return Cam16.fromJchInViewingConditions(d2, d5, d7, viewingConditions);
    }

    private static Cam16 fromJchInViewingConditions(double d2, double d5, double d7, ViewingConditions viewingConditions) {
        double d9;
        double d12 = viewingConditions.getC();
        double d13 = 4.0;
        d12 = d13 / d12;
        double d14 = d2 / 100.0;
        double d15 = Math.sqrt(d14) * d12;
        d12 = (viewingConditions.getAw() + d13) * d15;
        d15 = viewingConditions.getFlRoot();
        d12 *= d15;
        d15 = d9 = viewingConditions.getFlRoot() * d5;
        d14 = Math.sqrt(d14);
        d14 = d5 / d14;
        double d16 = viewingConditions.getC() * d14;
        d14 = viewingConditions.getAw() + d13;
        d13 = Math.sqrt(d16 / d14) * 50.0;
        d16 = Math.toRadians(d7);
        d14 = 1.7000000000000002 * d2;
        double d17 = 0.007 * d2 + 1.0;
        d14 /= d17;
        d9 = Math.log1p(d9 * 0.0228);
        d17 = 43.859649122807014 * d9;
        d9 = Math.cos(d16) * d17;
        d16 = Math.sin(d16) * d17;
        Cam16 cam16 = new Cam16(d7, d5, d2, d12, d15, d13, d14, d9, d16);
        return cam16;
    }

    public static Cam16 fromUcs(double d2, double d5, double d7) {
        ViewingConditions viewingConditions = ViewingConditions.DEFAULT;
        return Cam16.fromUcsInViewingConditions(d2, d5, d7, viewingConditions);
    }

    public static Cam16 fromUcsInViewingConditions(double d2, double d5, double d7, ViewingConditions viewingConditions) {
        double d9 = Math.hypot(d5, d7);
        double d12 = 0.0228;
        d9 = Math.expm1(d9 * d12) / d12;
        d12 = viewingConditions.getFlRoot();
        double d13 = d9 / d12;
        d9 = d5;
        d12 = d7;
        d9 = Math.atan2(d7, d5) * 57.29577951308232;
        double d14 = d9 - (d12 = 0.0);
        Object object = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
        if (object < 0) {
            d12 = 360.0;
            d9 += d12;
        }
        double d15 = d9;
        d9 = (d2 - 100.0) * 0.007;
        d12 = 1.0 - d9;
        return Cam16.fromJchInViewingConditions(d2 / d12, d13, d15, viewingConditions);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Cam16 fromXyzInViewingConditions(double d2, double d5, double d7, ViewingConditions viewingConditions) {
        double[][] dArray = XYZ_TO_CAM16RGB;
        double[] dArray2 = dArray[0];
        double d9 = dArray2[0] * d2;
        int n3 = 1;
        double d12 = dArray2[n3] * d5 + d9;
        int n4 = 2;
        double d13 = dArray2[n4] * d7 + d12;
        dArray2 = dArray[n3];
        d12 = dArray2[0] * d2;
        double d14 = dArray2[n3] * d5 + d12;
        d12 = dArray2[n4] * d7 + d14;
        double[] dArray3 = dArray[n4];
        d14 = dArray3[0] * d2;
        double d15 = dArray3[n3] * d5 + d14;
        d14 = dArray3[n4] * d7 + d15;
        double d16 = viewingConditions.getRgbD()[0] * d13;
        double d17 = viewingConditions.getRgbD()[n3] * d12;
        double[] dArray4 = viewingConditions.getRgbD();
        d12 = dArray4[n4] * d14;
        d13 = viewingConditions.getFl();
        d14 = Math.abs(d16) * d13;
        d13 = 100.0;
        d14 /= d13;
        d15 = 0.42;
        d14 = Math.pow(d14, d15);
        double d18 = viewingConditions.getFl();
        d18 = Math.pow(Math.abs(d17) * d18 / d13, d15);
        double d19 = viewingConditions.getFl();
        double d20 = Math.abs(d12) * d19;
        d2 = d12;
        d12 = Math.pow(d20 / d13, d15);
        double d22 = Math.signum(d16);
        double d23 = 400.0;
        d22 = d22 * d23 * d14;
        d15 = 27.13;
        d22 /= (d14 += d15);
        d17 = Math.signum(d17) * d23 * d18;
        d17 /= (d18 += d15);
        d14 = Math.signum(d2) * d23 * d12;
        d14 /= (d12 += d15);
        d23 = 11.0;
        d12 = d22 * d23;
        d15 = (-12.0 * d17 + d12 + d14) / d23;
        d23 = d22 + d17;
        d12 = 2.0;
        d18 = d14 * d12;
        d23 = (d23 - d18) / 9.0;
        d18 = 20.0;
        d19 = d22 * d18;
        d20 = (21.0 * d14 + (d19 += (d17 *= d18))) / d18;
        d19 = 40.0;
        d22 = (d22 * d19 + d17 + d14) / d18;
        d17 = Math.toDegrees(Math.atan2(d23, d15));
        d14 = 0.0;
        d18 = 360.0;
        Object object = d17 == d14 ? 0 : (d17 < d14 ? -1 : 1);
        if (object < 0) {
            d17 += d18;
        } else {
            Object object2 = d17 == d18 ? 0 : (d17 > d18 ? 1 : -1);
            if (object2 >= 0) {
                d17 -= d18;
            }
        }
        double d24 = d17;
        d17 = Math.toRadians(d17);
        d14 = viewingConditions.getNbb() * d22;
        d22 = viewingConditions.getAw();
        d14 /= d22;
        d22 = viewingConditions.getC();
        d19 = viewingConditions.getZ();
        double d25 = Math.pow(d14, d22 *= d19) * d13;
        d22 = viewingConditions.getC();
        d14 = 4.0;
        d22 = d14 / d22;
        d13 = d25 / d13;
        d19 = Math.sqrt(d13) * d22;
        d22 = (viewingConditions.getAw() + d14) * d19;
        d19 = viewingConditions.getFlRoot();
        double d26 = d19 * d22;
        d22 = 20.14;
        double d27 = d24 == d22 ? 0 : (d24 < d22 ? -1 : 1);
        d18 = d27 < 0 ? d24 + d18 : d24;
        d22 = (Math.cos(Math.toRadians(d18) + d12) + 3.8) * 0.25 * 3846.153846153846;
        d12 = viewingConditions.getNc() * d22;
        d22 = viewingConditions.getNcb() * d12;
        d23 = Math.hypot(d15, d23) * d22;
        d23 /= (d20 += 0.305);
        d12 = viewingConditions.getN();
        d22 = Math.pow(0.29, d12);
        d22 = Math.pow(1.64 - d22, 0.73);
        d23 = Math.pow(d23, 0.9) * d22;
        double d28 = d22 = Math.sqrt(d13) * d23;
        double d29 = d12 = viewingConditions.getFlRoot() * d22;
        d22 = viewingConditions.getC() * d23;
        d23 = viewingConditions.getAw() + d14;
        double d30 = Math.sqrt(d22 / d23) * 50.0;
        d22 = 1.7000000000000002 * d25;
        d23 = 0.007 * d25 + 1.0;
        double d32 = d22 / d23;
        d22 = Math.log1p(d12 * 0.0228) * 43.859649122807014;
        double d34 = Math.cos(d17) * d22;
        double d35 = Math.sin(d17) * d22;
        return new Cam16(d24, d28, d25, d26, d29, d30, d32, d34, d35);
    }

    public double distance(Cam16 cam16) {
        double d2 = this.getJstar();
        double d5 = cam16.getJstar();
        d2 -= d5;
        d5 = this.getAstar();
        double d7 = cam16.getAstar();
        d5 -= d7;
        d7 = this.getBstar();
        double d9 = cam16.getBstar();
        d2 *= d2;
        d5 = d5 * d5 + d2;
        return Math.pow(Math.sqrt((d7 -= d9) * d7 + d5), 0.63) * 1.41;
    }

    public double getAstar() {
        return this.astar;
    }

    public double getBstar() {
        return this.bstar;
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getJ() {
        return this.j;
    }

    public double getJstar() {
        return this.jstar;
    }

    public double getM() {
        return this.m;
    }

    public double getQ() {
        return this.q;
    }

    public double getS() {
        return this.s;
    }

    public int toInt() {
        ViewingConditions viewingConditions = ViewingConditions.DEFAULT;
        return this.viewed(viewingConditions);
    }

    public int viewed(ViewingConditions object) {
        double[] dArray = this.tempArray;
        object = this.xyzInViewingConditions((ViewingConditions)object, dArray);
        Object object2 = object[0];
        Object object3 = object[1];
        Object object4 = object[2];
        return ColorUtils.argbFromXyz((double)object2, (double)object3, (double)object4);
    }

    public double[] xyzInViewingConditions(ViewingConditions viewingConditions, double[] dArray) {
        double d2;
        double d5;
        double d7 = this.getChroma();
        double d9 = 100.0;
        double d12 = 0.0;
        double d13 = d7 - d12;
        Object object = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
        if (object != false && (object = (d5 = (d7 = this.getJ()) - d12) == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1)) != false) {
            d7 = this.getChroma();
            d2 = Math.sqrt(this.getJ() / d9);
            d7 /= d2;
        } else {
            d7 = d12;
        }
        d2 = viewingConditions.getN();
        d2 = Math.pow(0.29, d2);
        d2 = Math.pow(1.64 - d2, 0.73);
        d7 = Math.pow(d7 / d2, 1.1111111111111112);
        d2 = Math.toRadians(this.getHue());
        double d14 = (Math.cos(2.0 + d2) + 3.8) * 0.25;
        double d15 = viewingConditions.getAw();
        double d16 = this.getJ() / d9;
        double d17 = viewingConditions.getC();
        double d18 = 1.0 / d17;
        d17 = viewingConditions.getZ();
        d9 = d18 / d17;
        d16 = Math.pow(d16, d9) * d15;
        d9 = viewingConditions.getNc() * (d14 *= 3846.153846153846);
        d14 = viewingConditions.getNcb() * d9;
        d9 = viewingConditions.getNbb();
        d16 /= d9;
        d9 = Math.sin(d2);
        d2 = Math.cos(d2);
        d15 = 0.305 + d16;
        d18 = 23.0;
        d15 = d15 * d18 * d7;
        d14 *= d18;
        d18 = 11.0 * d7 * d2 + d14;
        d7 = d7 * 108.0 * d9 + d18;
        d2 *= (d15 /= d7);
        d15 *= d9;
        d7 = 451.0 * d2 + (d16 *= 460.0);
        d9 = 288.0 * d15 + d7;
        d7 = 1403.0;
        d9 /= d7;
        d14 = 891.0 * d2;
        d14 = d16 - d14;
        d18 = 261.0 * d15;
        d14 = (d14 - d18) / d7;
        d16 -= (d2 *= 220.0);
        d16 = (d16 - (d15 *= 6300.0)) / d7;
        d7 = Math.abs(d9);
        d2 = 27.13;
        d7 *= d2;
        d15 = Math.abs(d9);
        d18 = 400.0;
        d15 = d18 - d15;
        d7 /= d15;
        d7 = Math.max(d12, d7);
        d9 = Math.signum(d9);
        d15 = viewingConditions.getFl();
        d15 = 100.0 / d15 * d9;
        d9 = 2.380952380952381;
        d7 = Math.pow(d7, d9) * d15;
        d15 = Math.abs(d14) * d2;
        d17 = Math.abs(d14);
        d17 = d18 - d17;
        d15 /= d17;
        d15 = Math.max(d12, d15);
        d14 = Math.signum(d14);
        d17 = viewingConditions.getFl();
        double d19 = 100.0;
        d17 = d19 / d17 * d14;
        d14 = Math.pow(d15, d9) * d17;
        d15 = Math.abs(d16) * d2;
        d2 = Math.abs(d16);
        d12 = Math.max(d12, d15 /= (d18 -= d2));
        d16 = Math.signum(d16);
        d2 = viewingConditions.getFl();
        d2 = 100.0 / d2 * d16;
        d16 = Math.pow(d12, d9) * d2;
        double d20 = viewingConditions.getRgbD()[0];
        d7 /= d20;
        Object object2 = viewingConditions.getRgbD();
        int n3 = 1;
        d12 = object2[n3];
        d14 /= d12;
        object2 = viewingConditions.getRgbD();
        int n4 = 2;
        double d22 = object2[n4];
        object2 = CAM16RGB_TO_XYZ;
        double d23 = object2[0];
        d2 = d23[0] * d7;
        d15 = d23[n3] * d14 + d2;
        d2 = d23[n4] * (d16 /= d22) + d15;
        d23 = object2[n3];
        d15 = d23[0] * d7;
        d18 = d23[n3] * d14 + d15;
        d15 = d23[n4] * d16 + d18;
        object2 = object2[n4];
        d18 = object2[0];
        d7 *= d18;
        d18 = object2[n3];
        d14 = d14 * d18 + d7;
        d7 = object2[n4];
        d16 = d16 * d7 + d14;
        if (dArray != null) {
            dArray[0] = d2;
            dArray[n3] = d15;
            dArray[n4] = d16;
            return dArray;
        }
        double[] dArray2 = new double[3];
        dArray2[0] = d2;
        dArray2[n3] = d15;
        dArray2[n4] = d16;
        return dArray2;
    }
}

