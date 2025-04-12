/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 */
package com.google.android.material.internal;

import android.animation.ValueAnimator;

class StateListAnimator$Tuple {
    final ValueAnimator animator;
    final int[] specs;

    public StateListAnimator$Tuple(int[] nArray, ValueAnimator valueAnimator) {
        this.specs = nArray;
        this.animator = valueAnimator;
    }
}

