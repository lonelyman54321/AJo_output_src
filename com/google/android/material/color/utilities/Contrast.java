/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.ColorUtils;

public final class Contrast {
    private static final double CONTRAST_RATIO_EPSILON = 0.04;
    private static final double LUMINANCE_GAMUT_MAP_TOLERANCE = 0.4;
    public static final double RATIO_30 = 3.0;
    public static final double RATIO_45 = 4.5;
    public static final double RATIO_70 = 7.0;
    public static final double RATIO_MAX = 21.0;
    public static final double RATIO_MIN = 1.0;

    private Contrast() {
    }

    public static double darker(double d2, double d5) {
        double d7;
        double d9;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16 = -1.0;
        double d17 = 0.0;
        double d18 = d2 - d17;
        Object object = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
        if (object >= 0 && (d15 = (d14 = d2 - (d13 = 100.0)) == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1)) <= 0 && (d15 = (d12 = (d9 = ((d2 = ColorUtils.yFromLstar(d2)) + (d7 = 5.0)) / d5 - d7) - d17) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1)) >= 0 && (d15 = d9 == d13 ? 0 : (d9 > d13 ? 1 : -1)) <= 0) {
            double d19;
            Object object2;
            d2 = Contrast.ratioOfYs(d2, d9);
            d7 = Math.abs(d2 - d5);
            Object object3 = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
            if (object3 < 0 && (object2 = (d19 = d7 - (d2 = 0.04)) == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1)) > 0) {
                return d16;
            }
            d2 = ColorUtils.lstarFromY(d9);
            d5 = 0.4;
            double d20 = (d2 -= d5) - d17;
            object2 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
            if (object2 >= 0 && (object2 = d2 == d13 ? 0 : (d2 > d13 ? 1 : -1)) <= 0) {
                return d2;
            }
        }
        return d16;
    }

    public static double darkerUnsafe(double d2, double d5) {
        d2 = Contrast.darker(d2, d5);
        return Math.max(0.0, d2);
    }

    public static double lighter(double d2, double d5) {
        double d7;
        double d9;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16 = -1.0;
        double d17 = 0.0;
        double d18 = d2 - d17;
        Object object = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
        if (object >= 0 && (d15 = (d14 = d2 - (d13 = 100.0)) == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1)) <= 0 && (d15 = (d12 = (d9 = ((d2 = ColorUtils.yFromLstar(d2)) + (d7 = 5.0)) * d5 - d7) - d17) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1)) >= 0 && (d15 = d9 == d13 ? 0 : (d9 > d13 ? 1 : -1)) <= 0) {
            double d19;
            Object object2;
            d2 = Contrast.ratioOfYs(d9, d2);
            d7 = Math.abs(d2 - d5);
            Object object3 = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
            if (object3 < 0 && (object2 = (d19 = d7 - (d2 = 0.04)) == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1)) > 0) {
                return d16;
            }
            d2 = ColorUtils.lstarFromY(d9);
            d5 = 0.4;
            double d20 = (d2 += d5) - d17;
            object2 = d20 == 0.0 ? 0 : (d20 < 0.0 ? -1 : 1);
            if (object2 >= 0 && (object2 = d2 == d13 ? 0 : (d2 > d13 ? 1 : -1)) <= 0) {
                return d2;
            }
        }
        return d16;
    }

    public static double lighterUnsafe(double d2, double d5) {
        double d7 = (d2 = Contrast.lighter(d2, d5)) - (d5 = 0.0);
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object < 0) {
            d2 = 100.0;
        }
        return d2;
    }

    public static double ratioOfTones(double d2, double d5) {
        d2 = ColorUtils.yFromLstar(d2);
        d5 = ColorUtils.yFromLstar(d5);
        return Contrast.ratioOfYs(d2, d5);
    }

    public static double ratioOfYs(double d2, double d5) {
        double d7 = Math.max(d2, d5);
        double d9 = d7 - d5;
        Object object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object != false) {
            d2 = d5;
        }
        d5 = 5.0;
        return (d7 += d5) / (d2 += d5);
    }
}

