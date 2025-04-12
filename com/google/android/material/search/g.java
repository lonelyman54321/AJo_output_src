/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.search;

import android.animation.ValueAnimator;
import com.google.android.material.search.SearchViewAnimationHelper;

public final class g
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ yu0_2 a;

    public /* synthetic */ g(yu0_2 yu0_22) {
        this.a = yu0_22;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SearchViewAnimationHelper.c(this.a, valueAnimator);
    }
}

