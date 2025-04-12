/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.LinearGradient
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.RadialGradient
 *  android.graphics.RectF
 *  android.graphics.Region$Op
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 */
package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

public class ShadowRenderer {
    private static final int COLOR_ALPHA_END = 0;
    private static final int COLOR_ALPHA_MIDDLE = 20;
    private static final int COLOR_ALPHA_START = 68;
    private static final int[] cornerColors;
    private static final float[] cornerPositions;
    private static final int[] edgeColors;
    private static final float[] edgePositions;
    private final Paint cornerShadowPaint;
    private final Paint edgeShadowPaint;
    private final Path scratch;
    private int shadowEndColor;
    private int shadowMiddleColor;
    private final Paint shadowPaint;
    private int shadowStartColor;
    private final Paint transparentPaint;

    static {
        float[] fArray;
        int n3 = 3;
        edgeColors = new int[n3];
        float[] fArray2 = fArray = new float[n3];
        fArray[0] = 0.0f;
        fArray2[1] = 0.5f;
        fArray2[2] = 1.0f;
        edgePositions = fArray;
        n3 = 4;
        cornerColors = new int[n3];
        float[] fArray3 = fArray = new float[n3];
        float[] fArray4 = fArray;
        fArray3[0] = 0.0f;
        fArray4[1] = 0.0f;
        fArray3[2] = 0.5f;
        fArray4[3] = 1.0f;
        cornerPositions = fArray;
    }

    public ShadowRenderer() {
        this(-16777216);
    }

    public ShadowRenderer(int n3) {
        Paint paint;
        Paint paint2;
        Path path;
        this.scratch = path = new Path();
        this.transparentPaint = path;
        this.shadowPaint = paint2 = new Paint();
        this.setShadowColor(n3);
        path.setColor(0);
        this.cornerShadowPaint = paint = new Paint(4);
        path = Paint.Style.FILL;
        paint.setStyle((Paint.Style)path);
        super(paint);
        this.edgeShadowPaint = path;
    }

    public void drawCornerShadow(Canvas canvas, Matrix matrix, RectF rectF, int n3, float f5, float f6) {
        RadialGradient radialGradient;
        Object object;
        ShadowRenderer shadowRenderer = this;
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int n4 = n3;
        float f7 = f6;
        int n7 = 1;
        float f8 = Float.MIN_VALUE;
        int n8 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        Paint paint = null;
        float f14 = f6 - 0.0f;
        Object object2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        object2 = object2 < 0 ? (Object)true : (Object)false;
        Path path = shadowRenderer.scratch;
        int n10 = 3;
        float f15 = 4.2E-45f;
        int n14 = 2;
        if (object2 != false) {
            int[] nArray = cornerColors;
            nArray[0] = 0;
            nArray[n7] = n8 = shadowRenderer.shadowEndColor;
            nArray[n14] = n8 = shadowRenderer.shadowMiddleColor;
            nArray[n10] = n8 = shadowRenderer.shadowStartColor;
            float f16 = f5;
        } else {
            path.rewind();
            float f17 = rectF.centerX();
            float f18 = rectF.centerY();
            path.moveTo(f17, f18);
            f17 = f5;
            path.arcTo(rectF2, f5, f7);
            path.close();
            int n15 = -n4;
            f18 = n15;
            rectF2.inset(f18, f18);
            object = cornerColors;
            object[0] = 0;
            object[n7] = n8 = shadowRenderer.shadowStartColor;
            object[n14] = n8 = shadowRenderer.shadowMiddleColor;
            object[n10] = n8 = shadowRenderer.shadowEndColor;
        }
        f11 = rectF.width();
        n10 = 0x40000000;
        f15 = 2.0f;
        float f19 = f11 / f15;
        float f20 = f19 - 0.0f;
        n8 = (int)(f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1));
        if (n8 <= 0) {
            return;
        }
        float f22 = (float)n4 / f19;
        n8 = 1065353216;
        f11 = 1.0f;
        f22 = f11 - f22;
        f12 = (f11 - f22) / f15 + f22;
        float[] fArray = cornerPositions;
        fArray[n7] = f22;
        fArray[n14] = f12;
        float f23 = rectF.centerX();
        float f24 = rectF.centerY();
        int[] nArray = cornerColors;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        object = radialGradient;
        radialGradient = new RadialGradient(f23, f24, f19, nArray, fArray, tileMode);
        Paint paint2 = shadowRenderer.cornerShadowPaint;
        paint2.setShader((Shader)radialGradient);
        canvas.save();
        canvas.concat(matrix);
        f22 = rectF.height();
        f8 = rectF.width();
        canvas2.scale(f11, f22 /= f8);
        if (object2 == false) {
            radialGradient = Region.Op.DIFFERENCE;
            canvas2.clipPath(path, (Region.Op)radialGradient);
            radialGradient = shadowRenderer.transparentPaint;
            canvas2.drawPath(path, (Paint)radialGradient);
        }
        paint = shadowRenderer.cornerShadowPaint;
        radialGradient = canvas;
        rectF2 = rectF;
        f8 = f5;
        f7 = f6;
        canvas.drawArc(rectF, f5, f6, true, paint);
        canvas.restore();
    }

    public void drawEdgeShadow(Canvas canvas, Matrix matrix, RectF rectF, int n3) {
        int n4;
        float f5 = rectF.bottom;
        float f6 = n3;
        rectF.bottom = f5 += f6;
        float f7 = -n3;
        rectF.offset(0.0f, f7);
        int[] nArray = edgeColors;
        nArray[0] = n4 = this.shadowEndColor;
        nArray[1] = n4 = this.shadowMiddleColor;
        nArray[2] = n4 = this.shadowStartColor;
        Paint paint = this.edgeShadowPaint;
        float f8 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.bottom;
        float[] fArray = edgePositions;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(f8, f11, f8, f12, nArray, fArray, tileMode);
        paint.setShader((Shader)linearGradient);
        canvas.save();
        canvas.concat(matrix);
        matrix = this.edgeShadowPaint;
        canvas.drawRect(rectF, (Paint)matrix);
        canvas.restore();
    }

    public void drawInnerCornerShadow(Canvas canvas, Matrix matrix, RectF rectF, int n3, float f5, float f6, float[] fArray) {
        float f7 = 0.0f;
        float f8 = f6 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object > 0) {
            f5 += f6;
            f6 = -f6;
        }
        this.drawCornerShadow(canvas, matrix, rectF, n3, f5, f6);
        Path path = this.scratch;
        path.rewind();
        f7 = fArray[0];
        float f11 = fArray[1];
        path.moveTo(f7, f11);
        path.arcTo(rectF, f5, f6);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        float f12 = rectF.height();
        float f14 = rectF.width();
        canvas.scale(1.0f, f12 /= f14);
        matrix = this.transparentPaint;
        canvas.drawPath(path, (Paint)matrix);
        matrix = this.shadowPaint;
        canvas.drawPath(path, (Paint)matrix);
        canvas.restore();
    }

    public Paint getShadowPaint() {
        return this.shadowPaint;
    }

    public void setShadowColor(int n3) {
        int n4;
        this.shadowStartColor = n4 = hZ.i(n3, 68);
        this.shadowMiddleColor = n4 = hZ.i(n3, 20);
        this.shadowEndColor = n3 = hZ.i(n3, 0);
        Paint paint = this.shadowPaint;
        n4 = this.shadowStartColor;
        paint.setColor(n4);
    }
}

