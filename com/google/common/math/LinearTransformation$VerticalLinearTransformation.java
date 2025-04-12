/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.math.LinearTransformation;
import com.google.common.math.LinearTransformation$RegularLinearTransformation;

final class LinearTransformation$VerticalLinearTransformation
extends LinearTransformation {
    LinearTransformation inverse;
    final double x;

    public LinearTransformation$VerticalLinearTransformation(double d2) {
        this.x = d2;
        this.inverse = null;
    }

    public LinearTransformation$VerticalLinearTransformation(double d2, LinearTransformation linearTransformation) {
        this.x = d2;
        this.inverse = linearTransformation;
    }

    private LinearTransformation createInverse() {
        double d2 = this.x;
        LinearTransformation$RegularLinearTransformation linearTransformation$RegularLinearTransformation = new LinearTransformation$RegularLinearTransformation(0.0, d2, this);
        return linearTransformation$RegularLinearTransformation;
    }

    public LinearTransformation inverse() {
        LinearTransformation linearTransformation = this.inverse;
        if (linearTransformation == null) {
            this.inverse = linearTransformation = this.createInverse();
        }
        return linearTransformation;
    }

    public boolean isHorizontal() {
        return false;
    }

    public boolean isVertical() {
        return true;
    }

    public double slope() {
        IllegalStateException illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    public String toString() {
        Double d2 = this.x;
        Object[] objectArray = new Object[]{d2};
        return String.format("x = %g", objectArray);
    }

    public double transform(double d2) {
        IllegalStateException illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }
}

