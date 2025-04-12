/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Path
 *  android.graphics.Path$Direction
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.widget.FrameLayout
 */
package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ClippableRoundedCornerLayout
extends FrameLayout {
    private float cornerRadius;
    private Path path;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public void dispatchDraw(Canvas canvas) {
        Path path = this.path;
        if (path == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int n3 = canvas.save();
        Path path2 = this.path;
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(n3);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public void resetClipBoundsAndCornerRadius() {
        this.path = null;
        this.cornerRadius = 0.0f;
        this.invalidate();
    }

    public void updateClipBoundsAndCornerRadius(float f5, float f6, float f7, float f8, float f11) {
        RectF rectF = new RectF(f5, f6, f7, f8);
        this.updateClipBoundsAndCornerRadius(rectF, f11);
    }

    public void updateClipBoundsAndCornerRadius(Rect rect, float f5) {
        float f6 = rect.left;
        float f7 = rect.top;
        float f8 = rect.right;
        float f11 = rect.bottom;
        this.updateClipBoundsAndCornerRadius(f6, f7, f8, f11, f5);
    }

    public void updateClipBoundsAndCornerRadius(RectF rectF, float f5) {
        Path path = this.path;
        if (path == null) {
            this.path = path = new Path();
        }
        this.cornerRadius = f5;
        this.path.reset();
        path = this.path;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f5, f5, direction);
        this.path.close();
        this.invalidate();
    }

    public void updateCornerRadius(float f5) {
        float f6 = this.getLeft();
        float f7 = this.getTop();
        float f8 = this.getRight();
        float f11 = this.getBottom();
        this.updateClipBoundsAndCornerRadius(f6, f7, f8, f11, f5);
    }
}

