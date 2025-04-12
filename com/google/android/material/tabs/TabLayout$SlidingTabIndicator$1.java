/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 */
package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout$SlidingTabIndicator;

class TabLayout$SlidingTabIndicator$1
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TabLayout$SlidingTabIndicator this$1;
    final /* synthetic */ View val$currentView;
    final /* synthetic */ View val$targetView;

    public TabLayout$SlidingTabIndicator$1(TabLayout$SlidingTabIndicator slidingTabIndicator, View view, View view2) {
        this.this$1 = slidingTabIndicator;
        this.val$currentView = view;
        this.val$targetView = view2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        TabLayout$SlidingTabIndicator tabLayout$SlidingTabIndicator = this.this$1;
        View view = this.val$currentView;
        View view2 = this.val$targetView;
        float f5 = valueAnimator.getAnimatedFraction();
        TabLayout$SlidingTabIndicator.access$1800(tabLayout$SlidingTabIndicator, view, view2, f5);
    }
}

