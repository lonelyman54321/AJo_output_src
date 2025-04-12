/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.ColorUtils;
import com.google.android.material.color.utilities.PointProvider;

public final class PointProviderLab
implements PointProvider {
    public double distance(double[] dArray, double[] dArray2) {
        double d2 = dArray[0];
        double d5 = dArray2[0];
        d2 -= d5;
        int n3 = 1;
        d5 = dArray[n3];
        double d7 = dArray2[n3];
        d5 -= d7;
        n3 = 2;
        d7 = dArray[n3];
        double d9 = dArray2[n3];
        d2 *= d2;
        d5 = d5 * d5 + d2;
        return (d7 -= d9) * d7 + d5;
    }

    public double[] fromInt(int n3) {
        double[] dArray = ColorUtils.labFromArgb(n3);
        double d2 = dArray[0];
        int n4 = 1;
        double d5 = dArray[n4];
        int n7 = 2;
        double d7 = dArray[n7];
        dArray = new double[3];
        dArray[0] = d2;
        dArray[n4] = d5;
        dArray[n7] = d7;
        return dArray;
    }

    public int toInt(double[] dArray) {
        double d2 = dArray[0];
        double d5 = dArray[1];
        double d7 = dArray[2];
        return ColorUtils.argbFromLab(d2, d5, d7);
    }
}

