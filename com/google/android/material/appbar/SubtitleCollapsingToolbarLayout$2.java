/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.SubtitleCollapsingToolbarLayout;

class SubtitleCollapsingToolbarLayout$2
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ SubtitleCollapsingToolbarLayout this$0;

    public SubtitleCollapsingToolbarLayout$2(SubtitleCollapsingToolbarLayout subtitleCollapsingToolbarLayout) {
        this.this$0 = subtitleCollapsingToolbarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        SubtitleCollapsingToolbarLayout subtitleCollapsingToolbarLayout = this.this$0;
        int n3 = (Integer)valueAnimator.getAnimatedValue();
        subtitleCollapsingToolbarLayout.setScrimAlpha(n3);
    }
}

