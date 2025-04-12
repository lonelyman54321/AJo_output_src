/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.math.DoubleUtils;
import com.google.common.math.LinearTransformation$LinearTransformationBuilder;
import com.google.common.math.LinearTransformation$NaNLinearTransformation;
import com.google.common.math.LinearTransformation$RegularLinearTransformation;
import com.google.common.math.LinearTransformation$VerticalLinearTransformation;

public abstract class LinearTransformation {
    public static LinearTransformation forNaN() {
        return LinearTransformation$NaNLinearTransformation.INSTANCE;
    }

    public static LinearTransformation horizontal(double d2) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d2));
        LinearTransformation$RegularLinearTransformation linearTransformation$RegularLinearTransformation = new LinearTransformation$RegularLinearTransformation(0.0, d2);
        return linearTransformation$RegularLinearTransformation;
    }

    public static LinearTransformation$LinearTransformationBuilder mapping(double d2, double d5) {
        LinearTransformation$LinearTransformationBuilder linearTransformation$LinearTransformationBuilder;
        boolean bl2 = DoubleUtils.isFinite(d2);
        if (bl2 && (bl2 = DoubleUtils.isFinite(d5))) {
            bl2 = true;
        } else {
            bl2 = false;
            linearTransformation$LinearTransformationBuilder = null;
        }
        Preconditions.checkArgument(bl2);
        linearTransformation$LinearTransformationBuilder = new LinearTransformation$LinearTransformationBuilder(d2, d5, null);
        return linearTransformation$LinearTransformationBuilder;
    }

    public static LinearTransformation vertical(double d2) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d2));
        LinearTransformation$VerticalLinearTransformation linearTransformation$VerticalLinearTransformation = new LinearTransformation$VerticalLinearTransformation(d2);
        return linearTransformation$VerticalLinearTransformation;
    }

    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double var1);
}

