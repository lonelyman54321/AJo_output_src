/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  android.graphics.drawable.Drawable$Callback
 *  android.view.View
 */
package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.textfield.CutoutDrawable;
import com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState;

class CutoutDrawable$ImplApi14
extends CutoutDrawable {
    private Paint cutoutPaint;
    private int savedLayer;

    public CutoutDrawable$ImplApi14(CutoutDrawable$CutoutDrawableState cutoutDrawable$CutoutDrawableState) {
        super(cutoutDrawable$CutoutDrawableState, null);
    }

    private Paint getCutoutPaint() {
        Paint paint = this.cutoutPaint;
        if (paint == null) {
            this.cutoutPaint = paint = new Paint(1);
            Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
            paint.setStyle(style2);
            paint = this.cutoutPaint;
            int n3 = -1;
            paint.setColor(n3);
            paint = this.cutoutPaint;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            style2 = new PorterDuffXfermode(mode);
            paint.setXfermode((Xfermode)style2);
        }
        return this.cutoutPaint;
    }

    private void postDraw(Canvas canvas) {
        Drawable.Callback callback2 = this.getCallback();
        int n3 = this.useHardwareLayer(callback2);
        if (n3 == 0) {
            n3 = this.savedLayer;
            canvas.restoreToCount(n3);
        }
    }

    private void preDraw(Canvas canvas) {
        Drawable.Callback callback2 = this.getCallback();
        int n3 = this.useHardwareLayer(callback2);
        if (n3 != 0) {
            int n4 = (callback2 = (View)callback2).getLayerType();
            if (n4 != (n3 = 2)) {
                n4 = 0;
                canvas = null;
                callback2.setLayerType(n3, null);
            }
        } else {
            this.saveCanvasLayer(canvas);
        }
    }

    private void saveCanvasLayer(Canvas canvas) {
        int n3;
        float f5 = canvas.getWidth();
        float f6 = canvas.getHeight();
        this.savedLayer = n3 = canvas.saveLayer(0.0f, 0.0f, f5, f6, null);
    }

    private boolean useHardwareLayer(Drawable.Callback callback2) {
        return callback2 instanceof View;
    }

    public void draw(Canvas canvas) {
        this.preDraw(canvas);
        super.draw(canvas);
        this.postDraw(canvas);
    }

    public void drawStrokeShape(Canvas canvas) {
        super.drawStrokeShape(canvas);
        RectF rectF = CutoutDrawable$CutoutDrawableState.access$200(this.drawableState);
        Paint paint = this.getCutoutPaint();
        canvas.drawRect(rectF, paint);
    }
}

