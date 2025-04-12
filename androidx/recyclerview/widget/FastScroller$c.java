/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.FastScroller;

public final class FastScroller$c
implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FastScroller a;

    public FastScroller$c(FastScroller fastScroller) {
        this.a = fastScroller;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int n3 = (int)(((Float)valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        FastScroller fastScroller = this.a;
        fastScroller.c.setAlpha(n3);
        fastScroller.d.setAlpha(n3);
        fastScroller.s.invalidate();
    }
}

