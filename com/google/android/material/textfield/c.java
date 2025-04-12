/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.ClearTextEndIconDelegate;

public final class c
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ClearTextEndIconDelegate a;

    public /* synthetic */ c(ClearTextEndIconDelegate clearTextEndIconDelegate) {
        this.a = clearTextEndIconDelegate;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ClearTextEndIconDelegate.c(this.a, valueAnimator);
    }
}

