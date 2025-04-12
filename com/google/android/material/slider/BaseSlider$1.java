/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.slider;

import android.animation.ValueAnimator;
import androidx.core.view.ViewCompat;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.tooltip.TooltipDrawable;

class BaseSlider$1
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BaseSlider this$0;

    public BaseSlider$1(BaseSlider baseSlider) {
        this.this$0 = baseSlider;
    }

    public void onAnimationUpdate(ValueAnimator object) {
        boolean bl2;
        object = (Float)object.getAnimatedValue();
        float f5 = object.floatValue();
        Object object2 = BaseSlider.access$000(this.this$0).iterator();
        while (bl2 = object2.hasNext()) {
            TooltipDrawable tooltipDrawable = (TooltipDrawable)object2.next();
            tooltipDrawable.setRevealFraction(f5);
        }
        object = this.this$0;
        object2 = ViewCompat.a;
        object.postInvalidateOnAnimation();
    }
}

