/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.LinearGradient
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.Drawable
 */
package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.material.R$color;

public class ShadowDrawableWrapper
extends wu0_0 {
    static final double COS_45 = 0.0;
    static final float SHADOW_BOTTOM_SCALE = 1.0f;
    static final float SHADOW_HORIZ_SCALE = 0.5f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners;
    final RectF contentBounds;
    float cornerRadius;
    final Paint cornerShadowPaint;
    Path cornerShadowPath;
    private boolean dirty;
    final Paint edgeShadowPaint;
    float maxShadowSize;
    private boolean printedShadowClipWarning;
    float rawMaxShadowSize;
    float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    float shadowSize;
    private final int shadowStartColor;

    static {
        COS_45 = Math.cos(Math.toRadians(45.0));
    }

    public ShadowDrawableWrapper(Context context, Drawable drawable2, float f5, float f6, float f7) {
        super(drawable2);
        RectF rectF;
        int n3;
        boolean bl2;
        this.dirty = bl2 = true;
        this.addPaddingForCorners = bl2;
        this.printedShadowClipWarning = false;
        int n4 = R$color.design_fab_shadow_start_color;
        this.shadowStartColor = n4 = t70.getColor(context, n4);
        n4 = R$color.design_fab_shadow_mid_color;
        this.shadowMiddleColor = n4 = t70.getColor(context, n4);
        n4 = R$color.design_fab_shadow_end_color;
        this.shadowEndColor = n3 = t70.getColor(context, n4);
        super(5);
        this.cornerShadowPaint = context;
        Paint.Style style2 = Paint.Style.FILL;
        context.setStyle(style2);
        this.cornerRadius = f5 = (float)Math.round(f5);
        this.contentBounds = rectF = new RectF();
        super((Paint)context);
        this.edgeShadowPaint = rectF;
        rectF.setAntiAlias(false);
        this.setShadowSize(f6, f7);
    }

    private void buildComponents(Rect rect) {
        float f5 = this.rawMaxShadowSize;
        float f6 = 1.5f * f5;
        RectF rectF = this.contentBounds;
        float f7 = (float)rect.left + f5;
        float f8 = (float)rect.top + f6;
        float f11 = (float)rect.right - f5;
        float f12 = (float)rect.bottom - f6;
        rectF.set(f7, f8, f11, f12);
        rect = this.getDrawable();
        RectF rectF2 = this.contentBounds;
        int n3 = (int)rectF2.left;
        int n4 = (int)rectF2.top;
        int n7 = (int)rectF2.right;
        int n8 = (int)rectF2.bottom;
        rect.setBounds(n3, n4, n7, n8);
        this.buildShadowCorners();
    }

    private void buildShadowCorners() {
        LinearGradient linearGradient;
        float f5;
        Object object;
        Object[] objectArray;
        ShadowDrawableWrapper shadowDrawableWrapper = this;
        int n3 = 3;
        float f6 = this.cornerRadius;
        float f7 = -f6;
        float f8 = -f6;
        RectF rectF = new RectF(f7, f8, f6, f6);
        RectF rectF2 = new RectF(rectF);
        f7 = this.shadowSize;
        f8 = -f7;
        f7 = -f7;
        rectF2.inset(f8, f7);
        Path path = this.cornerShadowPath;
        if (path == null) {
            this.cornerShadowPath = path = new Path();
        } else {
            path.reset();
        }
        path = shadowDrawableWrapper.cornerShadowPath;
        Path.FillType fillType = Path.FillType.EVEN_ODD;
        path.setFillType(fillType);
        path = shadowDrawableWrapper.cornerShadowPath;
        f8 = -shadowDrawableWrapper.cornerRadius;
        int n4 = 0;
        path.moveTo(f8, 0.0f);
        path = shadowDrawableWrapper.cornerShadowPath;
        f8 = -shadowDrawableWrapper.shadowSize;
        path.rLineTo(f8, 0.0f);
        shadowDrawableWrapper.cornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        path = shadowDrawableWrapper.cornerShadowPath;
        f8 = 270.0f;
        float f11 = -90.0f;
        path.arcTo(rectF, f8, f11, false);
        path = shadowDrawableWrapper.cornerShadowPath;
        path.close();
        float f12 = -rectF2.top;
        f7 = 1.0f;
        float f14 = f12 - 0.0f;
        float f15 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (f15 > 0) {
            f8 = shadowDrawableWrapper.cornerRadius / f12;
            f11 = (f7 - f8) / 2.0f + f8;
            Paint paint = shadowDrawableWrapper.cornerShadowPaint;
            int n7 = shadowDrawableWrapper.shadowStartColor;
            int n8 = shadowDrawableWrapper.shadowMiddleColor;
            int n10 = shadowDrawableWrapper.shadowEndColor;
            objectArray = new int[]{0, n7, n8, n10};
            object = new float[4];
            object[0] = 0.0f;
            n4 = 1;
            object[n4] = f8;
            f15 = 2;
            f8 = 2.8E-45f;
            object[f15] = f11;
            object[n3] = f7;
            path = Shader.TileMode.CLAMP;
            n7 = 0;
            n8 = 0;
            f5 = 0.0f;
            LinearGradient linearGradient2 = linearGradient;
            fillType = linearGradient;
            linearGradient = path;
            linearGradient2(0.0f, 0.0f, f12, (int[])objectArray, object, (Shader.TileMode)path);
            paint.setShader((Shader)linearGradient2);
        }
        path = shadowDrawableWrapper.edgeShadowPaint;
        f11 = rectF.top;
        f5 = rectF2.top;
        int n14 = shadowDrawableWrapper.shadowStartColor;
        int n15 = shadowDrawableWrapper.shadowMiddleColor;
        f15 = shadowDrawableWrapper.shadowEndColor;
        int[] nArray = new int[]{n14, n15, (int)f15};
        float[] fArray = objectArray = new float[n3];
        objectArray[0] = 0.0f;
        fArray[1] = 0.5f;
        fArray[2] = 1.0f;
        object = Shader.TileMode.CLAMP;
        fillType = linearGradient;
        linearGradient = new LinearGradient(0.0f, f11, 0.0f, f5, nArray, objectArray, (Shader.TileMode)object);
        path.setShader((Shader)linearGradient);
        shadowDrawableWrapper.edgeShadowPaint.setAntiAlias(false);
    }

    public static float calculateHorizontalPadding(float f5, float f6, boolean bl2) {
        if (bl2) {
            double d2 = f5;
            double d5 = COS_45;
            double d7 = 1.0 - d5;
            double d9 = f6;
            d7 = d7 * d9 + d2;
            f5 = (float)d7;
        }
        return f5;
    }

    public static float calculateVerticalPadding(float f5, float f6, boolean bl2) {
        float f7 = 1.5f;
        if (bl2) {
            double d2 = f5 * f7;
            double d5 = COS_45;
            double d7 = 1.0 - d5;
            double d9 = f6;
            return (float)(d7 * d9 + d2);
        }
        return f5 * f7;
    }

    private void drawShadow(Canvas canvas) {
        Paint paint;
        float f5;
        int n3;
        float f6;
        float f7;
        Paint paint2;
        int n4;
        ShadowDrawableWrapper shadowDrawableWrapper = this;
        Canvas canvas2 = canvas;
        int n7 = canvas.save();
        float f8 = this.rotation;
        float f11 = this.contentBounds.centerX();
        RectF rectF = this.contentBounds;
        float f12 = rectF.centerY();
        canvas.rotate(f8, f11, f12);
        float f14 = this.cornerRadius;
        f8 = -f14;
        f11 = this.shadowSize;
        float f15 = f8 - f11;
        RectF rectF2 = this.contentBounds;
        f8 = rectF2.width();
        float f16 = f14 * 2.0f;
        f8 -= f16;
        f11 = 0.0f;
        Paint paint3 = null;
        f12 = Float.MIN_VALUE;
        int n8 = 0;
        float f17 = 0.0f;
        float f18 = f8 - 0.0f;
        float f19 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        if (f19 > 0) {
            n4 = 1;
        } else {
            n4 = 0;
            paint2 = null;
        }
        rectF2 = shadowDrawableWrapper.contentBounds;
        f8 = rectF2.height() - f16;
        float f20 = f8 - 0.0f;
        f19 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
        boolean bl2 = f19 > 0;
        f8 = shadowDrawableWrapper.rawShadowSize;
        f11 = 0.25f * f8;
        f11 = f8 - f11;
        f12 = 0.5f * f8;
        f12 = f8 - f12;
        int n10 = 1065353216;
        float f22 = 1.0f;
        f17 = f8 * f22;
        f8 -= f17;
        float f23 = f14 / (f12 += f14);
        float f24 = f14 / (f11 += f14);
        float f25 = f14 / (f8 += f14);
        n8 = canvas.save();
        rectF2 = shadowDrawableWrapper.contentBounds;
        f11 = rectF2.left + f14;
        f8 = rectF2.top + f14;
        canvas2.translate(f11, f8);
        canvas2.scale(f23, f24);
        rectF2 = shadowDrawableWrapper.cornerShadowPath;
        paint3 = shadowDrawableWrapper.cornerShadowPaint;
        canvas2.drawPath((Path)rectF2, paint3);
        if (n4 != 0) {
            f8 = f22 / f23;
            canvas2.scale(f8, f22);
            float f26 = shadowDrawableWrapper.contentBounds.width() - f16;
            f8 = shadowDrawableWrapper.cornerRadius;
            f12 = -f8;
            paint3 = shadowDrawableWrapper.edgeShadowPaint;
            rectF2 = canvas;
            Paint paint4 = paint3;
            paint3 = null;
            f11 = 0.0f;
            f7 = f12;
            f12 = f15;
            n10 = n8;
            f17 = f26;
            f6 = f25;
            f25 = f7;
            n3 = n7;
            f5 = f24;
            paint = paint4;
            canvas.drawRect(0.0f, f15, f26, f7, paint4);
        } else {
            n10 = n8;
            f6 = f25;
            n3 = n7;
            f5 = f24;
        }
        canvas2.restoreToCount(n10);
        n10 = canvas.save();
        rectF2 = shadowDrawableWrapper.contentBounds;
        f11 = rectF2.right - f14;
        f8 = rectF2.bottom - f14;
        canvas2.translate(f11, f8);
        f24 = f6;
        canvas2.scale(f23, f6);
        f19 = 0x43340000;
        f8 = 180.0f;
        canvas2.rotate(f8);
        rectF2 = shadowDrawableWrapper.cornerShadowPath;
        paint3 = shadowDrawableWrapper.cornerShadowPaint;
        canvas2.drawPath((Path)rectF2, paint3);
        if (n4 != 0) {
            f19 = 1065353216;
            f8 = 1.0f;
            f11 = f8 / f23;
            canvas2.scale(f11, f8);
            f17 = shadowDrawableWrapper.contentBounds.width() - f16;
            f8 = -shadowDrawableWrapper.cornerRadius;
            f11 = shadowDrawableWrapper.shadowSize;
            f25 = f8 + f11;
            paint2 = shadowDrawableWrapper.edgeShadowPaint;
            f11 = 0.0f;
            paint3 = null;
            rectF2 = canvas;
            f12 = f15;
            f7 = f5;
            f5 = f6;
            paint = paint2;
            canvas.drawRect(0.0f, f15, f17, f25, paint2);
        } else {
            f7 = f5;
            f5 = f6;
        }
        canvas2.restoreToCount(n10);
        n4 = canvas.save();
        rectF2 = shadowDrawableWrapper.contentBounds;
        f11 = rectF2.left + f14;
        f8 = rectF2.bottom - f14;
        canvas2.translate(f11, f8);
        canvas2.scale(f23, f5);
        f19 = 1132920832;
        f8 = 270.0f;
        canvas2.rotate(f8);
        rectF2 = shadowDrawableWrapper.cornerShadowPath;
        paint3 = shadowDrawableWrapper.cornerShadowPaint;
        canvas2.drawPath((Path)rectF2, paint3);
        if (bl2) {
            f19 = 1065353216;
            f8 = 1.0f;
            f22 = f8 / f5;
            canvas2.scale(f22, f8);
            f17 = shadowDrawableWrapper.contentBounds.height() - f16;
            f8 = shadowDrawableWrapper.cornerRadius;
            f25 = -f8;
            paint = shadowDrawableWrapper.edgeShadowPaint;
            f11 = 0.0f;
            paint3 = null;
            rectF2 = canvas;
            f12 = f15;
            canvas.drawRect(0.0f, f15, f17, f25, paint);
        }
        canvas2.restoreToCount(n4);
        n7 = canvas.save();
        rectF2 = shadowDrawableWrapper.contentBounds;
        f11 = rectF2.right - f14;
        f8 = rectF2.top + f14;
        canvas2.translate(f11, f8);
        f14 = f7;
        canvas2.scale(f23, f7);
        f19 = 1119092736;
        f8 = 90.0f;
        canvas2.rotate(f8);
        rectF2 = shadowDrawableWrapper.cornerShadowPath;
        paint3 = shadowDrawableWrapper.cornerShadowPaint;
        canvas2.drawPath((Path)rectF2, paint3);
        if (bl2) {
            f19 = 1065353216;
            f8 = 1.0f;
            f22 = f8 / f7;
            canvas2.scale(f22, f8);
            f17 = shadowDrawableWrapper.contentBounds.height() - f16;
            f8 = shadowDrawableWrapper.cornerRadius;
            f25 = -f8;
            paint = shadowDrawableWrapper.edgeShadowPaint;
            f11 = 0.0f;
            paint3 = null;
            rectF2 = canvas;
            f12 = f15;
            canvas.drawRect(0.0f, f15, f17, f25, paint);
        }
        canvas2.restoreToCount(n7);
        f19 = n3;
        canvas2.restoreToCount(n3);
    }

    private static int toEven(float f5) {
        int n3;
        int n4 = Math.round(f5);
        int n7 = n4 % 2;
        if (n7 == (n3 = 1)) {
            n4 += -1;
        }
        return n4;
    }

    public void draw(Canvas canvas) {
        boolean bl2 = this.dirty;
        if (bl2) {
            Rect rect = this.getBounds();
            this.buildComponents(rect);
            bl2 = false;
            rect = null;
            this.dirty = false;
        }
        this.drawShadow(canvas);
        super.draw(canvas);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public float getMaxShadowSize() {
        return this.rawMaxShadowSize;
    }

    public float getMinHeight() {
        float f5 = this.rawMaxShadowSize;
        float f6 = this.cornerRadius;
        float f7 = 1.5f;
        float f8 = f5 * f7;
        float f11 = 2.0f;
        f8 = f8 / f11 + f6;
        f5 = Math.max(f5, f8) * f11;
        return this.rawMaxShadowSize * f7 * f11 + f5;
    }

    public float getMinWidth() {
        float f5 = this.rawMaxShadowSize;
        float f6 = this.cornerRadius;
        float f7 = 2.0f;
        float f8 = f5 / f7 + f6;
        f5 = Math.max(f5, f8) * f7;
        return this.rawMaxShadowSize * f7 + f5;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        float f5 = this.rawMaxShadowSize;
        float f6 = this.cornerRadius;
        boolean bl2 = this.addPaddingForCorners;
        int n3 = (int)Math.ceil(ShadowDrawableWrapper.calculateVerticalPadding(f5, f6, bl2));
        f6 = this.rawMaxShadowSize;
        float f7 = this.cornerRadius;
        boolean bl3 = this.addPaddingForCorners;
        int n4 = (int)Math.ceil(ShadowDrawableWrapper.calculateHorizontalPadding(f6, f7, bl3));
        rect.set(n4, n3, n4, n3);
        return true;
    }

    public float getShadowSize() {
        return this.rawShadowSize;
    }

    public void onBoundsChange(Rect rect) {
        this.dirty = true;
    }

    public void setAddPaddingForCorners(boolean bl2) {
        this.addPaddingForCorners = bl2;
        this.invalidateSelf();
    }

    public void setAlpha(int n3) {
        super.setAlpha(n3);
        this.cornerShadowPaint.setAlpha(n3);
        this.edgeShadowPaint.setAlpha(n3);
    }

    public void setCornerRadius(float f5) {
        float f6 = this.cornerRadius;
        int n3 = Math.round(f5);
        float f7 = f6 - (f5 = (float)n3);
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            return;
        }
        this.cornerRadius = f5;
        this.dirty = true;
        this.invalidateSelf();
    }

    public void setMaxShadowSize(float f5) {
        float f6 = this.rawShadowSize;
        this.setShadowSize(f6, f5);
    }

    public final void setRotation(float f5) {
        float f6 = this.rotation;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.rotation = f5;
            this.invalidateSelf();
        }
    }

    public void setShadowSize(float f5) {
        float f6 = this.rawMaxShadowSize;
        this.setShadowSize(f5, f6);
    }

    public void setShadowSize(float f5, float f6) {
        float f7;
        int n3 = 0;
        float f8 = f5 - 0.0f;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object >= 0 && (n3 = (f7 = f6 - 0.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) >= 0) {
            float f11;
            float f12;
            float f14;
            int n4 = ShadowDrawableWrapper.toEven(f5);
            f5 = n4;
            int n7 = ShadowDrawableWrapper.toEven(f6);
            f6 = n7;
            n3 = 1;
            object = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
            if (object > 0) {
                n4 = (int)(this.printedShadowClipWarning ? 1 : 0);
                if (n4 == 0) {
                    this.printedShadowClipWarning = n3;
                }
                f5 = f6;
            }
            if ((object = (f14 = (f12 = this.rawShadowSize) - f5) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1)) == false && (object = (f11 = (f12 = this.rawMaxShadowSize) - f6) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1)) == false) {
                return;
            }
            this.rawShadowSize = f5;
            this.rawMaxShadowSize = f6;
            this.shadowSize = f5 = (float)Math.round(f5 * 1.5f);
            this.maxShadowSize = f6;
            this.dirty = n3;
            this.invalidateSelf();
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("invalid shadow size");
        throw illegalArgumentException;
    }
}

