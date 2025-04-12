/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Path
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 *  android.view.View
 */
package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import com.google.android.material.canvas.CanvasCompat$CanvasOperation;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.ShapeableDelegateV14;
import com.google.android.material.shape.ShapeableDelegateV22;
import com.google.android.material.shape.ShapeableDelegateV33;

public abstract class ShapeableDelegate {
    boolean forceCompatClippingEnabled = false;
    RectF maskBounds;
    boolean offsetZeroCornerEdgeBoundsEnabled = false;
    ShapeAppearanceModel shapeAppearanceModel;
    final Path shapePath;

    public ShapeableDelegate() {
        RectF rectF;
        this.maskBounds = rectF = new RectF();
        this.shapePath = rectF;
    }

    public static ShapeableDelegate create(View object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            ShapeableDelegateV33 shapeableDelegateV33 = new ShapeableDelegateV33((View)object);
            return shapeableDelegateV33;
        }
        n4 = 22;
        if (n3 >= n4) {
            ShapeableDelegateV22 shapeableDelegateV22 = new ShapeableDelegateV22((View)object);
            return shapeableDelegateV22;
        }
        object = new ShapeableDelegateV14();
        return object;
    }

    private boolean isMaskBoundsValid() {
        float f5;
        float f6;
        int n3;
        RectF rectF = this.maskBounds;
        float f7 = rectF.left;
        float f8 = rectF.right;
        float f11 = f7 - f8;
        Object object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object <= 0 && (n3 = (f6 = (f7 = rectF.top) - (f5 = rectF.bottom)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) <= 0) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
            rectF = null;
        }
        return n3 != 0;
    }

    private void updateShapePath() {
        Object object;
        boolean bl2 = this.isMaskBoundsValid();
        if (bl2 && (object = this.shapeAppearanceModel) != null) {
            object = ShapeAppearancePathProvider.getInstance();
            ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
            RectF rectF = this.maskBounds;
            Path path = this.shapePath;
            float f5 = 1.0f;
            ((ShapeAppearancePathProvider)object).calculatePath(shapeAppearanceModel, f5, rectF, path);
        }
    }

    public abstract void invalidateClippingMethod(View var1);

    public boolean isForceCompatClippingEnabled() {
        return this.forceCompatClippingEnabled;
    }

    public void maybeClip(Canvas canvas, CanvasCompat$CanvasOperation canvasCompat$CanvasOperation) {
        Path path;
        boolean bl2 = this.shouldUseCompatClipping();
        if (bl2 && !(bl2 = (path = this.shapePath).isEmpty())) {
            canvas.save();
            path = this.shapePath;
            canvas.clipPath(path);
            canvasCompat$CanvasOperation.run(canvas);
            canvas.restore();
        } else {
            canvasCompat$CanvasOperation.run(canvas);
        }
    }

    public void onMaskChanged(View view, RectF rectF) {
        this.maskBounds = rectF;
        this.updateShapePath();
        this.invalidateClippingMethod(view);
    }

    public void onShapeAppearanceChanged(View view, ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        this.updateShapePath();
        this.invalidateClippingMethod(view);
    }

    public void setForceCompatClippingEnabled(View view, boolean bl2) {
        boolean bl3 = this.forceCompatClippingEnabled;
        if (bl2 != bl3) {
            this.forceCompatClippingEnabled = bl2;
            this.invalidateClippingMethod(view);
        }
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(View view, boolean bl2) {
        this.offsetZeroCornerEdgeBoundsEnabled = bl2;
        this.invalidateClippingMethod(view);
    }

    public abstract boolean shouldUseCompatClipping();
}

