/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Rect
 */
package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.google.android.material.search.SearchViewAnimationHelper;

public final class f
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SearchViewAnimationHelper a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Rect d;

    public /* synthetic */ f(SearchViewAnimationHelper searchViewAnimationHelper, float f5, float f6, Rect rect) {
        this.a = searchViewAnimationHelper;
        this.b = f5;
        this.c = f6;
        this.d = rect;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f5 = this.c;
        Rect rect = this.d;
        SearchViewAnimationHelper searchViewAnimationHelper = this.a;
        float f6 = this.b;
        SearchViewAnimationHelper.b(searchViewAnimationHelper, f6, f5, rect, valueAnimator);
    }
}

