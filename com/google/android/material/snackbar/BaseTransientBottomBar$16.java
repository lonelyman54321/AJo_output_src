/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 */
package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;

class BaseTransientBottomBar$16
implements ValueAnimator.AnimatorUpdateListener {
    private int previousAnimatedIntValue = 0;
    final /* synthetic */ BaseTransientBottomBar this$0;

    public BaseTransientBottomBar$16(BaseTransientBottomBar baseTransientBottomBar) {
        this.this$0 = baseTransientBottomBar;
    }

    public void onAnimationUpdate(ValueAnimator object) {
        object = (Integer)object.getAnimatedValue();
        int n3 = (Integer)object;
        boolean bl2 = BaseTransientBottomBar.access$1700();
        if (bl2) {
            BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = this.this$0.view;
            int n4 = this.previousAnimatedIntValue;
            n4 = n3 - n4;
            ViewCompat.m(n4, (View)baseTransientBottomBar$SnackbarBaseLayout);
        } else {
            BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = this.this$0.view;
            float f5 = n3;
            baseTransientBottomBar$SnackbarBaseLayout.setTranslationY(f5);
        }
        this.previousAnimatedIntValue = n3;
    }
}

