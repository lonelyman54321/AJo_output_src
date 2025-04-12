/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import com.google.android.material.navigation.NavigationBarItemView;

class NavigationBarItemView$3
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ NavigationBarItemView this$0;
    final /* synthetic */ float val$newProgress;

    public NavigationBarItemView$3(NavigationBarItemView navigationBarItemView, float f5) {
        this.this$0 = navigationBarItemView;
        this.val$newProgress = f5;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        NavigationBarItemView navigationBarItemView = this.this$0;
        float f6 = this.val$newProgress;
        NavigationBarItemView.access$500(navigationBarItemView, f5, f6);
    }
}

