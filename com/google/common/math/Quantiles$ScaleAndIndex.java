/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;
import com.google.common.math.Quantiles;
import com.google.common.math.Quantiles$1;
import com.google.common.primitives.Doubles;
import java.math.RoundingMode;
import java.util.Collection;

public final class Quantiles$ScaleAndIndex {
    private final int index;
    private final int scale;

    private Quantiles$ScaleAndIndex(int n3, int n4) {
        Quantiles.access$300(n4, n3);
        this.scale = n3;
        this.index = n4;
    }

    public /* synthetic */ Quantiles$ScaleAndIndex(int n3, int n4, Quantiles$1 quantiles$1) {
        this(n3, n4);
    }

    public double compute(Collection object) {
        object = Doubles.toArray((Collection)object);
        return this.computeInPlace((double[])object);
    }

    public double compute(double ... dArray) {
        dArray = (double[])dArray.clone();
        return this.computeInPlace(dArray);
    }

    public double compute(int ... objectArray) {
        objectArray = Quantiles.access$500(objectArray);
        return this.computeInPlace((double[])objectArray);
    }

    public double compute(long ... objectArray) {
        objectArray = Quantiles.access$400(objectArray);
        return this.computeInPlace((double[])objectArray);
    }

    public double computeInPlace(double ... dArray) {
        RoundingMode roundingMode;
        int n3 = dArray.length;
        int n4 = 0;
        int n7 = 1;
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            roundingMode = null;
        }
        String string2 = "Cannot calculate quantiles of an empty dataset";
        Preconditions.checkArgument(n3 != 0, string2);
        n3 = Quantiles.access$600(dArray);
        if (n3 != 0) {
            return 0.0 / 0.0;
        }
        long l2 = this.index;
        long l3 = dArray.length - n7;
        l2 *= l3;
        l3 = this.scale;
        roundingMode = RoundingMode.DOWN;
        n3 = (int)LongMath.divide(l2, l3, roundingMode);
        l3 = n3;
        int n8 = this.scale;
        long l4 = n8;
        int n10 = (int)(l2 -= (l3 *= l4));
        int n14 = dArray.length - n7;
        Quantiles.access$700(n3, dArray, 0, n14);
        if (n10 == 0) {
            return dArray[n3];
        }
        n4 = n3 + 1;
        n14 = dArray.length - n7;
        Quantiles.access$700(n4, dArray, n4, n14);
        double d2 = dArray[n3];
        double d5 = dArray[n4];
        double d7 = n10;
        double d9 = this.scale;
        return Quantiles.access$800(d2, d5, d7, d9);
    }
}

