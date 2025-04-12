/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.google.android.material.card;

import android.animation.ValueAnimator;
import com.google.android.material.card.MaterialCardViewHelper;

public final class a
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ MaterialCardViewHelper a;

    public /* synthetic */ a(MaterialCardViewHelper materialCardViewHelper) {
        this.a = materialCardViewHelper;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        MaterialCardViewHelper.a(this.a, valueAnimator);
    }
}

