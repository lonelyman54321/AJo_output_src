/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.math.DoubleUtils;
import com.google.common.math.LinearTransformation;
import com.google.common.math.LinearTransformation$1;
import com.google.common.math.LinearTransformation$RegularLinearTransformation;
import com.google.common.math.LinearTransformation$VerticalLinearTransformation;

public final class LinearTransformation$LinearTransformationBuilder {
    private final double x1;
    private final double y1;

    private LinearTransformation$LinearTransformationBuilder(double d2, double d5) {
        this.x1 = d2;
        this.y1 = d5;
    }

    public /* synthetic */ LinearTransformation$LinearTransformationBuilder(double d2, double d5, LinearTransformation$1 linearTransformation$1) {
        this(d2, d5);
    }

    public LinearTransformation and(double d2, double d5) {
        Object object = DoubleUtils.isFinite(d2);
        boolean bl2 = false;
        object = object && (object = DoubleUtils.isFinite(d5));
        Preconditions.checkArgument(object);
        double d7 = this.x1;
        object = d2 == d7 ? 0 : (d2 > d7 ? 1 : -1);
        if (!object) {
            d2 = this.y1;
            double d9 = d5 - d2;
            object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
            if (object) {
                bl2 = true;
            }
            Preconditions.checkArgument(bl2);
            double d12 = this.x1;
            LinearTransformation$VerticalLinearTransformation linearTransformation$VerticalLinearTransformation = new LinearTransformation$VerticalLinearTransformation(d12);
            return linearTransformation$VerticalLinearTransformation;
        }
        double d13 = this.y1;
        d5 -= d13;
        return this.withSlope(d5 /= (d2 -= d7));
    }

    public LinearTransformation withSlope(double d2) {
        Preconditions.checkArgument(Double.isNaN(d2) ^ true);
        boolean bl2 = DoubleUtils.isFinite(d2);
        if (bl2) {
            double d5 = this.y1;
            double d7 = this.x1 * d2;
            LinearTransformation$RegularLinearTransformation linearTransformation$RegularLinearTransformation = new LinearTransformation$RegularLinearTransformation(d2, d5 -= d7);
            return linearTransformation$RegularLinearTransformation;
        }
        double d9 = this.x1;
        LinearTransformation$VerticalLinearTransformation linearTransformation$VerticalLinearTransformation = new LinearTransformation$VerticalLinearTransformation(d9);
        return linearTransformation$VerticalLinearTransformation;
    }
}

