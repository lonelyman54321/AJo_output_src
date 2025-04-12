/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.facebook.shimmer;

import android.animation.ValueAnimator;
import com.facebook.shimmer.ShimmerDrawable;

class ShimmerDrawable$1
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ShimmerDrawable this$0;

    public ShimmerDrawable$1(ShimmerDrawable shimmerDrawable) {
        this.this$0 = shimmerDrawable;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.this$0.invalidateSelf();
    }
}

