/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.search;

import android.animation.ValueAnimator;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.search.SearchViewAnimationHelper;

public final class i
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FadeThroughDrawable a;

    public /* synthetic */ i(FadeThroughDrawable fadeThroughDrawable) {
        this.a = fadeThroughDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SearchViewAnimationHelper.e(this.a, valueAnimator);
    }
}

