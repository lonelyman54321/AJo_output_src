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
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.CutoutDrawable$1;
import com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState;
import com.google.android.material.textfield.CutoutDrawable$ImplApi18;

class CutoutDrawable
extends MaterialShapeDrawable {
    CutoutDrawable$CutoutDrawableState drawableState;

    private CutoutDrawable(CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState) {
        super(cutoutDrawable$CutoutDrawableState);
        this.drawableState = cutoutDrawable$CutoutDrawableState;
    }

    public /* synthetic */ CutoutDrawable(CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState, CutoutDrawable$1 cutoutDrawable$1) {
        this(cutoutDrawable$CutoutDrawableState);
    }

    public static /* synthetic */ CutoutDrawable access$400(CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState) {
        return CutoutDrawable.create(cutoutDrawable$CutoutDrawableState);
    }

    public static CutoutDrawable create(ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel == null) {
            shapeAppearanceModel = new ShapeAppearanceModel();
        }
        RectF rectF = new RectF();
        CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState = new CutoutDrawable$CutoutDrawableState(shapeAppearanceModel, rectF, null);
        return CutoutDrawable.create(cutoutDrawable$CutoutDrawableState);
    }

    private static CutoutDrawable create(CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState) {
        CutoutDrawable$ImplApi18 cutoutDrawable$ImplApi18 = new CutoutDrawable$ImplApi18(cutoutDrawable$CutoutDrawableState);
        return cutoutDrawable$ImplApi18;
    }

    public boolean hasCutout() {
        return CutoutDrawable$CutoutDrawableState.access$200(this.drawableState).isEmpty() ^ true;
    }

    public Drawable mutate() {
        CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState;
        CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState2 = this.drawableState;
        this.drawableState = cutoutDrawable$CutoutDrawableState = new CutoutDrawable$CutoutDrawableState(cutoutDrawable$CutoutDrawableState2, null);
        return this;
    }

    public void removeCutout() {
        this.setCutout(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void setCutout(float f5, float f6, float f7, float f8) {
        block3: {
            RectF rectF;
            block2: {
                rectF = CutoutDrawable$CutoutDrawableState.access$200(this.drawableState);
                float f11 = rectF.left;
                float f12 = f5 - f11;
                Object object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (object != false) break block2;
                rectF = CutoutDrawable$CutoutDrawableState.access$200(this.drawableState);
                f11 = rectF.top;
                float f14 = f6 - f11;
                object = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                if (object != false) break block2;
                rectF = CutoutDrawable$CutoutDrawableState.access$200(this.drawableState);
                f11 = rectF.right;
                float f15 = f7 - f11;
                object = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                if (object != false) break block2;
                rectF = CutoutDrawable$CutoutDrawableState.access$200(this.drawableState);
                f11 = rectF.bottom;
                float f16 = f8 - f11;
                object = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                if (object == false) break block3;
            }
            rectF = CutoutDrawable$CutoutDrawableState.access$200(this.drawableState);
            rectF.set(f5, f6, f7, f8);
            this.invalidateSelf();
        }
    }

    public void setCutout(RectF rectF) {
        float f5 = rectF.left;
        float f6 = rectF.top;
        float f7 = rectF.right;
        float f8 = rectF.bottom;
        this.setCutout(f5, f6, f7, f8);
    }
}

