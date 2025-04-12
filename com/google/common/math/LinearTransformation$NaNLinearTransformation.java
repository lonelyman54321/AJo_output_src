/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.math;

import com.google.common.math.LinearTransformation;

final class LinearTransformation$NaNLinearTransformation
extends LinearTransformation {
    static final LinearTransformation$NaNLinearTransformation INSTANCE;

    static {
        LinearTransformation$NaNLinearTransformation linearTransformation$NaNLinearTransformation;
        INSTANCE = linearTransformation$NaNLinearTransformation = new LinearTransformation$NaNLinearTransformation();
    }

    private LinearTransformation$NaNLinearTransformation() {
    }

    public LinearTransformation inverse() {
        return this;
    }

    public boolean isHorizontal() {
        return false;
    }

    public boolean isVertical() {
        return false;
    }

    public double slope() {
        return 0.0 / 0.0;
    }

    public String toString() {
        return "NaN";
    }

    public double transform(double d2) {
        return 0.0 / 0.0;
    }
}

