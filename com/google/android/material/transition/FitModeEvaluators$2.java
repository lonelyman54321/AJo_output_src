/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package com.google.android.material.transition;

import android.graphics.RectF;
import com.google.android.material.transition.FitModeEvaluator;
import com.google.android.material.transition.FitModeResult;
import com.google.android.material.transition.TransitionUtils;

class FitModeEvaluators$2
implements FitModeEvaluator {
    public void applyMask(RectF rectF, float f5, FitModeResult fitModeResult) {
        float f6 = fitModeResult.currentEndWidth;
        float f7 = fitModeResult.currentStartWidth;
        f7 = Math.abs(f6 - f7);
        f6 = rectF.left;
        f7 = f7 / 2.0f * f5;
        rectF.left = f6 += f7;
        rectF.right = f5 = rectF.right - f7;
    }

    public FitModeResult evaluate(float f5, float f6, float f7, float f8, float f11, float f12, float f14) {
        float f15 = f11;
        f15 = TransitionUtils.lerp(f11, f14, f6, f7, f5, true);
        f6 = f15 / f11;
        f7 = f15 / f14;
        f11 = f15;
        f14 = f15;
        FitModeResult fitModeResult = new FitModeResult(f6, f7, f8 *= f6, f15, f12 *= f7, f15);
        return fitModeResult;
    }

    public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
        float f5 = fitModeResult.currentStartWidth;
        float f6 = fitModeResult.currentEndWidth;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = true;
            f6 = Float.MIN_VALUE;
        } else {
            object = false;
            f6 = 0.0f;
            fitModeResult = null;
        }
        return (boolean)object;
    }
}

