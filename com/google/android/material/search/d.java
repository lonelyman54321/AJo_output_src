/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 */
package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.search.SearchBarAnimationHelper;
import com.google.android.material.shape.MaterialShapeDrawable;

public final class d
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ MaterialShapeDrawable a;
    public final /* synthetic */ View b;

    public /* synthetic */ d(View view, MaterialShapeDrawable materialShapeDrawable) {
        this.a = materialShapeDrawable;
        this.b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        MaterialShapeDrawable materialShapeDrawable = this.a;
        View view = this.b;
        SearchBarAnimationHelper.c(materialShapeDrawable, view, valueAnimator);
    }
}

