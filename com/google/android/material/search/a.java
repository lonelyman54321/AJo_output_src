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

public final class a
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;

    public /* synthetic */ a(View view) {
        this.a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.a;
        SearchBarAnimationHelper.a(valueAnimator, view);
    }
}

