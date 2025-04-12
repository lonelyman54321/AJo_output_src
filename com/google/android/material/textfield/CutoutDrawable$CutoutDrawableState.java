/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 */
package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.CutoutDrawable;
import com.google.android.material.textfield.CutoutDrawable$1;

final class CutoutDrawable$CutoutDrawableState
extends MaterialShapeDrawable$MaterialShapeDrawableState {
    private final RectF cutoutBounds;

    private CutoutDrawable$CutoutDrawableState(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        super(shapeAppearanceModel, null);
        this.cutoutBounds = rectF;
    }

    public /* synthetic */ CutoutDrawable$CutoutDrawableState(ShapeAppearanceModel shapeAppearanceModel, RectF rectF, CutoutDrawable$1 cutoutDrawable$1) {
        this(shapeAppearanceModel, rectF);
    }

    private CutoutDrawable$CutoutDrawableState(CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState) {
        super(cutoutDrawable$CutoutDrawableState);
        cutoutDrawable$CutoutDrawableState = cutoutDrawable$CutoutDrawableState.cutoutBounds;
        this.cutoutBounds = cutoutDrawable$CutoutDrawableState;
    }

    public /* synthetic */ CutoutDrawable$CutoutDrawableState(CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState, CutoutDrawable$1 cutoutDrawable$1) {
        this(cutoutDrawable$CutoutDrawableState);
    }

    public static /* synthetic */ RectF access$200(CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState) {
        return cutoutDrawable$CutoutDrawableState.cutoutBounds;
    }

    public Drawable newDrawable() {
        CutoutDrawable cutoutDrawable = CutoutDrawable.access$400(this);
        cutoutDrawable.invalidateSelf();
        return cutoutDrawable;
    }
}

