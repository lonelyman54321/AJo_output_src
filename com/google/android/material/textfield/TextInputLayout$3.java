/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.textfield.TextInputLayout;

class TextInputLayout$3
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TextInputLayout this$0;

    public TextInputLayout$3(TextInputLayout textInputLayout) {
        this.this$0 = textInputLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        CollapsingTextHelper collapsingTextHelper = this.this$0.collapsingTextHelper;
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        collapsingTextHelper.setExpansionFraction(f5);
    }
}

