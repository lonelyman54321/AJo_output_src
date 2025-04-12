/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.shape;

import com.google.android.material.shape.AdjustedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel$CornerSizeUnaryOperator;

class MaterialShapeDrawable$2
implements ShapeAppearanceModel$CornerSizeUnaryOperator {
    final /* synthetic */ MaterialShapeDrawable this$0;
    final /* synthetic */ float val$strokeInsetLength;

    public MaterialShapeDrawable$2(MaterialShapeDrawable materialShapeDrawable, float f5) {
        this.this$0 = materialShapeDrawable;
        this.val$strokeInsetLength = f5;
    }

    public CornerSize apply(CornerSize cornerSize) {
        boolean bl2 = cornerSize instanceof RelativeCornerSize;
        if (!bl2) {
            float f5 = this.val$strokeInsetLength;
            AdjustedCornerSize adjustedCornerSize = new AdjustedCornerSize(f5, cornerSize);
            cornerSize = adjustedCornerSize;
        }
        return cornerSize;
    }
}

