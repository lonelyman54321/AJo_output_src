/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.math.LinearTransformation;
import com.google.common.math.LinearTransformation$VerticalLinearTransformation;

final class LinearTransformation$RegularLinearTransformation
extends LinearTransformation {
    LinearTransformation inverse;
    final double slope;
    final double yIntercept;

    public LinearTransformation$RegularLinearTransformation(double d2, double d5) {
        this.slope = d2;
        this.yIntercept = d5;
        this.inverse = null;
    }

    public LinearTransformation$RegularLinearTransformation(double d2, double d5, LinearTransformation linearTransformation) {
        this.slope = d2;
        this.yIntercept = d5;
        this.inverse = linearTransformation;
    }

    private LinearTransformation createInverse() {
        double d2 = this.slope;
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object != false) {
            double d9 = 1.0 / d2;
            double d12 = this.yIntercept * -1.0 / d2;
            LinearTransformation$RegularLinearTransformation linearTransformation$RegularLinearTransformation = new LinearTransformation$RegularLinearTransformation(d9, d12, this);
            return linearTransformation$RegularLinearTransformation;
        }
        double d13 = this.yIntercept;
        LinearTransformation$VerticalLinearTransformation linearTransformation$VerticalLinearTransformation = new LinearTransformation$VerticalLinearTransformation(d13, this);
        return linearTransformation$VerticalLinearTransformation;
    }

    public LinearTransformation inverse() {
        LinearTransformation linearTransformation = this.inverse;
        if (linearTransformation == null) {
            this.inverse = linearTransformation = this.createInverse();
        }
        return linearTransformation;
    }

    public boolean isHorizontal() {
        double d2 = this.slope;
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        boolean bl2 = object == false;
        return bl2;
    }

    public boolean isVertical() {
        return false;
    }

    public double slope() {
        return this.slope;
    }

    public String toString() {
        Double d2 = this.slope;
        Double d5 = this.yIntercept;
        Object[] objectArray = new Object[]{d2, d5};
        return String.format("y = %g * x + %g", objectArray);
    }

    public double transform(double d2) {
        double d5 = this.slope;
        d2 *= d5;
        d5 = this.yIntercept;
        return d2 + d5;
    }
}

