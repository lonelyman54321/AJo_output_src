/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.timepicker.ClockHandView;

class ClockHandView$1
extends AnimatorListenerAdapter {
    final /* synthetic */ ClockHandView this$0;

    public ClockHandView$1(ClockHandView clockHandView) {
        this.this$0 = clockHandView;
    }

    public void onAnimationCancel(Animator animator2) {
        animator2.end();
    }
}

