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
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;

class BaseTransientBottomBar$11
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BaseTransientBottomBar this$0;

    public BaseTransientBottomBar$11(BaseTransientBottomBar baseTransientBottomBar) {
        this.this$0 = baseTransientBottomBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = this.this$0.view;
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        baseTransientBottomBar$SnackbarBaseLayout.setAlpha(f5);
    }
}

