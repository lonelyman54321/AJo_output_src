/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 */
package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo;
import com.google.android.material.math.MathUtils;

public class CircularRevealWidget$CircularRevealEvaluator
implements TypeEvaluator {
    public static final TypeEvaluator CIRCULAR_REVEAL;
    private final CircularRevealWidget$RevealInfo revealInfo;

    static {
        CircularRevealWidget$CircularRevealEvaluator circularRevealWidget$CircularRevealEvaluator = new CircularRevealWidget$CircularRevealEvaluator();
        CIRCULAR_REVEAL = circularRevealWidget$CircularRevealEvaluator;
    }

    public CircularRevealWidget$CircularRevealEvaluator() {
        CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo;
        this.revealInfo = circularRevealWidget$RevealInfo = new CircularRevealWidget$RevealInfo(null);
    }

    public CircularRevealWidget$RevealInfo evaluate(float f5, CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo, CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo2) {
        CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo3 = this.revealInfo;
        float f6 = circularRevealWidget$RevealInfo.centerX;
        float f7 = circularRevealWidget$RevealInfo2.centerX;
        f6 = MathUtils.lerp(f6, f7, f5);
        f7 = circularRevealWidget$RevealInfo.centerY;
        float f8 = circularRevealWidget$RevealInfo2.centerY;
        f7 = MathUtils.lerp(f7, f8, f5);
        float f11 = circularRevealWidget$RevealInfo.radius;
        float f12 = circularRevealWidget$RevealInfo2.radius;
        f5 = MathUtils.lerp(f11, f12, f5);
        circularRevealWidget$RevealInfo3.set(f6, f7, f5);
        return this.revealInfo;
    }
}

