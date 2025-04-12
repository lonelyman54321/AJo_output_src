/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package com.google.android.material.transition;

import android.graphics.RectF;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel$CornerSizeUnaryOperator;
import com.google.android.material.transition.TransitionUtils;

public final class a
implements ShapeAppearanceModel$CornerSizeUnaryOperator {
    public final /* synthetic */ RectF a;

    public /* synthetic */ a(RectF rectF) {
        this.a = rectF;
    }

    public final CornerSize apply(CornerSize cornerSize) {
        return TransitionUtils.a(this.a, cornerSize);
    }
}

