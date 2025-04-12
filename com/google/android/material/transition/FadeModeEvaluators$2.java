/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transition;

import com.google.android.material.transition.FadeModeEvaluator;
import com.google.android.material.transition.FadeModeResult;
import com.google.android.material.transition.TransitionUtils;

class FadeModeEvaluators$2
implements FadeModeEvaluator {
    public FadeModeResult evaluate(float f5, float f6, float f7, float f8) {
        int n3 = 255;
        return FadeModeResult.startOnTop(TransitionUtils.lerp(n3, 0, f6, f7, f5), n3);
    }
}

