/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import com.google.android.material.tabs.TabLayout;

class TabLayout$1
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TabLayout this$0;

    public TabLayout$1(TabLayout tabLayout) {
        this.this$0 = tabLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        TabLayout tabLayout = this.this$0;
        int n3 = (Integer)valueAnimator.getAnimatedValue();
        tabLayout.scrollTo(n3, 0);
    }
}

