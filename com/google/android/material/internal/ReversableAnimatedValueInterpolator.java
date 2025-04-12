/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 */
package com.google.android.material.internal;

import android.animation.TimeInterpolator;

public class ReversableAnimatedValueInterpolator
implements TimeInterpolator {
    private final TimeInterpolator sourceInterpolator;

    public ReversableAnimatedValueInterpolator(TimeInterpolator timeInterpolator) {
        this.sourceInterpolator = timeInterpolator;
    }

    public static TimeInterpolator of(boolean bl2, TimeInterpolator timeInterpolator) {
        if (bl2) {
            return timeInterpolator;
        }
        ReversableAnimatedValueInterpolator reversableAnimatedValueInterpolator = new ReversableAnimatedValueInterpolator(timeInterpolator);
        return reversableAnimatedValueInterpolator;
    }

    public float getInterpolation(float f5) {
        f5 = this.sourceInterpolator.getInterpolation(f5);
        return 1.0f - f5;
    }
}

