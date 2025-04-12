/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.MathUtils;

public final class ContrastCurve {
    private final double high;
    private final double low;
    private final double medium;
    private final double normal;

    public ContrastCurve(double d2, double d5, double d7, double d9) {
        this.low = d2;
        this.normal = d5;
        this.medium = d7;
        this.high = d9;
    }

    public double getContrast(double d2) {
        double d5 = -1.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
        if (object <= 0) {
            return this.low;
        }
        double d9 = 1.0;
        double d12 = 0.0;
        double d13 = d2 - d12;
        Object object2 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
        if (object2 < 0) {
            double d14 = this.low;
            double d15 = this.normal;
            double d16 = (d2 - d5) / d9;
            return MathUtils.lerp(d14, d15, d16);
        }
        d5 = 0.5;
        double d17 = d2 - d5;
        object2 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
        if (object2 < 0) {
            double d18 = this.normal;
            double d19 = this.medium;
            double d20 = (d2 - d12) / d5;
            return MathUtils.lerp(d18, d19, d20);
        }
        Object object3 = d2 == d9 ? 0 : (d2 < d9 ? -1 : 1);
        if (object3 < 0) {
            double d22 = this.medium;
            double d23 = this.high;
            double d24 = (d2 - d5) / d5;
            return MathUtils.lerp(d22, d23, d24);
        }
        return this.high;
    }
}

