/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.widget.TextView
 */
package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.internal.TextScale;

class TextScale$1
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TextScale this$0;
    final /* synthetic */ TextView val$view;

    public TextScale$1(TextScale textScale, TextView textView) {
        this.this$0 = textScale;
        this.val$view = textView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        this.val$view.setScaleX(f5);
        this.val$view.setScaleY(f5);
    }
}

