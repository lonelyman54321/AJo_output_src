/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.RectF
 *  android.graphics.Region$Op
 *  android.os.Build$VERSION
 */
package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.google.android.material.textfield.CutoutDrawable;
import com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState;

class CutoutDrawable$ImplApi18
extends CutoutDrawable {
    public CutoutDrawable$ImplApi18(CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState) {
        super(cutoutDrawable$CutoutDrawableState, null);
    }

    public void drawStrokeShape(Canvas canvas) {
        RectF rectF = CutoutDrawable$CutoutDrawableState.access$200(this.drawableState);
        int n3 = rectF.isEmpty();
        if (n3 != 0) {
            super.drawStrokeShape(canvas);
        } else {
            canvas.save();
            n3 = Build.VERSION.SDK_INT;
            int n4 = 26;
            if (n3 >= n4) {
                rectF = CutoutDrawable$CutoutDrawableState.access$200(this.drawableState);
                Ih0.c(canvas, rectF);
            } else {
                rectF = CutoutDrawable$CutoutDrawableState.access$200(this.drawableState);
                Region.Op op2 = Region.Op.DIFFERENCE;
                canvas.clipRect(rectF, op2);
            }
            super.drawStrokeShape(canvas);
            canvas.restore();
        }
    }
}

