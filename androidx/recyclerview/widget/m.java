/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.ItemTouchHelper$e;

public final class m
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ItemTouchHelper$e a;

    public m(ItemTouchHelper$e itemTouchHelper$e) {
        this.a = itemTouchHelper$e;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f5;
        this.a.m = f5 = valueAnimator.getAnimatedFraction();
    }
}

