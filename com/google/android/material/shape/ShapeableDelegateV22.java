/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package com.google.android.material.shape;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.shape.ShapeableDelegateV22$1;

class ShapeableDelegateV22
extends ShapeableDelegate {
    private boolean canUseViewOutline = false;
    private float cornerRadius = 0.0f;

    public ShapeableDelegateV22(View view) {
        this.initMaskOutlineProvider(view);
    }

    public static /* synthetic */ float access$000(ShapeableDelegateV22 shapeableDelegateV22) {
        return shapeableDelegateV22.cornerRadius;
    }

    private float getDefaultCornerRadius() {
        RectF rectF;
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        if (shapeAppearanceModel != null && (rectF = this.maskBounds) != null) {
            return shapeAppearanceModel.topRightCornerSize.getCornerSize(rectF);
        }
        return 0.0f;
    }

    private void initMaskOutlineProvider(View view) {
        ShapeableDelegateV22$1 shapeableDelegateV22$1 = new ShapeableDelegateV22$1(this);
        view.setOutlineProvider((ViewOutlineProvider)shapeableDelegateV22$1);
    }

    private boolean isShapeRoundRect() {
        Object object = this.maskBounds;
        boolean bl2 = object.isEmpty();
        if (!bl2 && (object = this.shapeAppearanceModel) != null) {
            RectF rectF = this.maskBounds;
            return ((ShapeAppearanceModel)object).isRoundRect(rectF);
        }
        return false;
    }

    private boolean offsetZeroCornerEdgeBoundsIfPossible() {
        block2: {
            block4: {
                float f5;
                float f6;
                float f7;
                float f8;
                float f11;
                float f12;
                boolean bl2;
                RectF rectF;
                block6: {
                    float f14;
                    Object object;
                    block5: {
                        float f15;
                        float f16;
                        Object object2;
                        block3: {
                            float f17;
                            float f18;
                            Object object3;
                            object2 = this.maskBounds;
                            boolean bl3 = object2.isEmpty();
                            f16 = 0.0f;
                            rectF = null;
                            if (bl3 || (object2 = this.shapeAppearanceModel) == null || !(bl2 = this.offsetZeroCornerEdgeBoundsEnabled) || (bl3 = ((ShapeAppearanceModel)object2).isRoundRect((RectF)(object3 = this.maskBounds))) || !(bl3 = ShapeableDelegateV22.shapeUsesAllRoundedCornerTreatments((ShapeAppearanceModel)(object2 = this.shapeAppearanceModel)))) break block2;
                            object2 = this.shapeAppearanceModel.getTopLeftCornerSize();
                            object3 = this.maskBounds;
                            f12 = object2.getCornerSize((RectF)object3);
                            object3 = this.shapeAppearanceModel.getTopRightCornerSize();
                            Object object4 = this.maskBounds;
                            f11 = object3.getCornerSize((RectF)object4);
                            object4 = this.shapeAppearanceModel.getBottomLeftCornerSize();
                            Object object5 = this.maskBounds;
                            f8 = object4.getCornerSize((RectF)object5);
                            object5 = this.shapeAppearanceModel.getBottomRightCornerSize();
                            RectF rectF2 = this.maskBounds;
                            f7 = object5.getCornerSize(rectF2);
                            f6 = 0.0f;
                            rectF2 = null;
                            float f19 = f12 - 0.0f;
                            object = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                            if (object != false || (f18 = (f17 = f8 - 0.0f) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1)) != false || (f18 = f11 == f7 ? 0 : (f11 > f7 ? 1 : -1)) != false) break block3;
                            object2 = this.maskBounds;
                            f16 = ((RectF)object2).left - f11;
                            f8 = ((RectF)object2).top;
                            f7 = ((RectF)object2).right;
                            f6 = ((RectF)object2).bottom;
                            object2.set(f16, f8, f7, f6);
                            this.cornerRadius = f11;
                            break block4;
                        }
                        if (object != false || (object = (f15 = f11 - 0.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1)) != false || (object = f8 == f7 ? 0 : (f8 > f7 ? 1 : -1)) != false) break block5;
                        object2 = this.maskBounds;
                        f16 = ((RectF)object2).left;
                        f11 = ((RectF)object2).top - f8;
                        f7 = ((RectF)object2).right;
                        f6 = ((RectF)object2).bottom;
                        object2.set(f16, f11, f7, f6);
                        this.cornerRadius = f8;
                        break block4;
                    }
                    float f20 = f11 - 0.0f;
                    object = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
                    if (object != false || (object = (f14 = f7 - 0.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1)) != false || (object = f12 == f8 ? 0 : (f12 > f8 ? 1 : -1)) != false) break block6;
                    rectF = this.maskBounds;
                    f11 = rectF.left;
                    f8 = rectF.top;
                    f7 = rectF.right + f12;
                    f6 = rectF.bottom;
                    rectF.set(f11, f8, f7, f6);
                    this.cornerRadius = f12;
                    break block4;
                }
                float f22 = f8 - 0.0f;
                Object object = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                if (object != false || (object = (f5 = f7 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) != false || (bl2 = f12 == f11 ? 0 : (f12 > f11 ? 1 : -1))) break block2;
                rectF = this.maskBounds;
                f11 = rectF.left;
                f8 = rectF.top;
                f7 = rectF.right;
                f6 = rectF.bottom + f12;
                rectF.set(f11, f8, f7, f6);
                this.cornerRadius = f12;
            }
            return true;
        }
        return false;
    }

    private static boolean shapeUsesAllRoundedCornerTreatments(ShapeAppearanceModel object) {
        boolean bl2;
        CornerTreatment cornerTreatment = ((ShapeAppearanceModel)object).getTopLeftCorner();
        boolean bl3 = cornerTreatment instanceof RoundedCornerTreatment;
        if (bl3 && (bl3 = (cornerTreatment = ((ShapeAppearanceModel)object).getTopRightCorner()) instanceof RoundedCornerTreatment) && (bl3 = (cornerTreatment = ((ShapeAppearanceModel)object).getBottomLeftCorner()) instanceof RoundedCornerTreatment) && (bl2 = (object = ((ShapeAppearanceModel)object).getBottomRightCorner()) instanceof RoundedCornerTreatment)) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public void invalidateClippingMethod(View view) {
        float f5;
        this.cornerRadius = f5 = this.getDefaultCornerRadius();
        boolean bl2 = this.isShapeRoundRect();
        boolean bl3 = true;
        if (!bl2 && !(bl2 = this.offsetZeroCornerEdgeBoundsIfPossible())) {
            bl2 = false;
            f5 = 0.0f;
        } else {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        }
        this.canUseViewOutline = bl2;
        bl2 = this.shouldUseCompatClipping() ^ bl3;
        view.setClipToOutline(bl2);
        bl2 = this.shouldUseCompatClipping();
        if (bl2) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    public boolean shouldUseCompatClipping() {
        boolean bl2 = this.canUseViewOutline;
        bl2 = !bl2 || (bl2 = this.forceCompatClippingEnabled);
        return bl2;
    }
}

