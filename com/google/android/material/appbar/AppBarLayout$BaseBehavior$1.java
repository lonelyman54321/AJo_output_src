/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 */
package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

class AppBarLayout$BaseBehavior$1
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ AppBarLayout$BaseBehavior this$0;
    final /* synthetic */ AppBarLayout val$child;
    final /* synthetic */ CoordinatorLayout val$coordinatorLayout;

    public AppBarLayout$BaseBehavior$1(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.this$0 = appBarLayout$BaseBehavior;
        this.val$coordinatorLayout = coordinatorLayout;
        this.val$child = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.this$0;
        CoordinatorLayout coordinatorLayout = this.val$coordinatorLayout;
        AppBarLayout appBarLayout = this.val$child;
        int n3 = (Integer)valueAnimator.getAnimatedValue();
        appBarLayout$BaseBehavior.setHeaderTopBottomOffset(coordinatorLayout, (View)appBarLayout, n3);
    }
}

