/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transition;

import com.google.android.material.transition.FadeModeEvaluator;
import com.google.android.material.transition.FadeModeResult;
import com.google.android.material.transition.TransitionUtils;

class FadeModeEvaluators$3
implements FadeModeEvaluator {
    public FadeModeResult evaluate(float f5, float f6, float f7, float f8) {
        int n3 = 255;
        int n4 = TransitionUtils.lerp(n3, 0, f6, f7, f5);
        int n7 = TransitionUtils.lerp(0, n3, f6, f7, f5);
        return FadeModeResult.startOnTop(n4, n7);
    }
}

