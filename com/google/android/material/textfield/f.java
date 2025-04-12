/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate;

public final class f
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ DropdownMenuEndIconDelegate a;

    public /* synthetic */ f(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.a = dropdownMenuEndIconDelegate;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DropdownMenuEndIconDelegate.c(this.a, valueAnimator);
    }
}

