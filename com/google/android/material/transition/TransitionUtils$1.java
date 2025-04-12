/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package com.google.android.material.transition;

import android.graphics.RectF;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.transition.TransitionUtils;
import com.google.android.material.transition.TransitionUtils$CornerSizeBinaryOperator;

class TransitionUtils$1
implements TransitionUtils$CornerSizeBinaryOperator {
    final /* synthetic */ RectF val$endBounds;
    final /* synthetic */ float val$endFraction;
    final /* synthetic */ float val$fraction;
    final /* synthetic */ RectF val$startBounds;
    final /* synthetic */ float val$startFraction;

    public TransitionUtils$1(RectF rectF, RectF rectF2, float f5, float f6, float f7) {
        this.val$startBounds = rectF;
        this.val$endBounds = rectF2;
        this.val$startFraction = f5;
        this.val$endFraction = f6;
        this.val$fraction = f7;
    }

    public CornerSize apply(CornerSize cornerSize, CornerSize cornerSize2) {
        RectF rectF = this.val$startBounds;
        float f5 = cornerSize.getCornerSize(rectF);
        rectF = this.val$endBounds;
        float f6 = cornerSize2.getCornerSize(rectF);
        float f7 = this.val$startFraction;
        float f8 = this.val$endFraction;
        float f11 = this.val$fraction;
        f5 = TransitionUtils.lerp(f5, f6, f7, f8, f11);
        cornerSize2 = new AbsoluteCornerSize(f5);
        return cornerSize2;
    }
}

