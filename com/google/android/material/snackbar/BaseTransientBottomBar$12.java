/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

class BaseTransientBottomBar$12
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BaseTransientBottomBar this$0;

    public BaseTransientBottomBar$12(BaseTransientBottomBar baseTransientBottomBar) {
        this.this$0 = baseTransientBottomBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        this.this$0.view.setScaleX(f5);
        this.this$0.view.setScaleY(f5);
    }
}

