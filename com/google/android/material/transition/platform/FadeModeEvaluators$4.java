/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transition.platform;

import com.google.android.material.transition.platform.FadeModeEvaluator;
import com.google.android.material.transition.platform.FadeModeResult;
import com.google.android.material.transition.platform.TransitionUtils;

class FadeModeEvaluators$4
implements FadeModeEvaluator {
    public FadeModeResult evaluate(float f5, float f6, float f7, float f8) {
        f8 = xu0_1.a(f7, f6, f8, f6);
        int n3 = 255;
        int n4 = TransitionUtils.lerp(n3, 0, f6, f8, f5);
        int n7 = TransitionUtils.lerp(0, n3, f8, f7, f5);
        return FadeModeResult.startOnTop(n4, n7);
    }
}

