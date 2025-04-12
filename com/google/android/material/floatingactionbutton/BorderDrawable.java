/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.LinearGradient
 *  android.graphics.Outline
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.floatingactionbutton.BorderDrawable$BorderState;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

class BorderDrawable
extends Drawable {
    private static final float DRAW_STROKE_WIDTH_MULTIPLE = 1.3333f;
    private ColorStateList borderTint;
    float borderWidth;
    private int bottomInnerStrokeColor;
    private int bottomOuterStrokeColor;
    private final RectF boundsRectF;
    private int currentBorderTintColor;
    private boolean invalidateShader;
    private final Paint paint;
    private final ShapeAppearancePathProvider pathProvider;
    private final Rect rect;
    private final RectF rectF;
    private ShapeAppearanceModel shapeAppearanceModel;
    private final Path shapePath;
    private final BorderDrawable$BorderState state;
    private int topInnerStrokeColor;
    private int topOuterStrokeColor;

    public BorderDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        Object object;
        this.pathProvider = object = ShapeAppearancePathProvider.getInstance();
        this.shapePath = object;
        super();
        this.rect = object;
        super();
        this.rectF = object;
        super();
        this.boundsRectF = object;
        super(this, null);
        this.state = object;
        int n3 = 1;
        this.invalidateShader = n3;
        this.shapeAppearanceModel = shapeAppearanceModel;
        super(n3);
        this.paint = shapeAppearanceModel;
        object = Paint.Style.STROKE;
        shapeAppearanceModel.setStyle((Paint.Style)object);
    }

    private Shader createGradientShader() {
        Rect rect = this.rect;
        this.copyBounds(rect);
        float f5 = this.borderWidth;
        float f6 = rect.height();
        f5 /= f6;
        int n3 = this.topOuterStrokeColor;
        int n4 = this.currentBorderTintColor;
        int n7 = hZ.g(n3, n4);
        n3 = this.topInnerStrokeColor;
        n4 = this.currentBorderTintColor;
        int n8 = hZ.g(n3, n4);
        n3 = hZ.i(this.topInnerStrokeColor, 0);
        int n10 = this.currentBorderTintColor;
        n10 = hZ.g(n3, n10);
        n3 = hZ.i(this.bottomInnerStrokeColor, 0);
        int n14 = this.currentBorderTintColor;
        n14 = hZ.g(n3, n14);
        n3 = this.bottomInnerStrokeColor;
        int n15 = this.currentBorderTintColor;
        n15 = hZ.g(n3, n15);
        n3 = this.bottomOuterStrokeColor;
        int n16 = this.currentBorderTintColor;
        n16 = hZ.g(n3, n16);
        int[] nArray = new int[]{n7, n8, n10, n14, n15, n16};
        f6 = 1.0f;
        float f7 = f6 - f5;
        float[] fArray = new float[]{0.0f, f5, f5 = 0.5f, f5, f7, f6};
        float f8 = rect.top;
        float f11 = rect.bottom;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, f8, 0.0f, f11, nArray, fArray, tileMode);
        return linearGradient;
    }

    public void draw(Canvas canvas) {
        float f5;
        Paint paint;
        boolean bl2 = this.invalidateShader;
        if (bl2) {
            paint = this.paint;
            Shader shader = this.createGradientShader();
            paint.setShader(shader);
            bl2 = false;
            f5 = 0.0f;
            paint = null;
            this.invalidateShader = false;
        }
        paint = this.paint;
        f5 = paint.getStrokeWidth();
        float f6 = 2.0f;
        f5 /= f6;
        Object object = this.rect;
        this.copyBounds((Rect)object);
        object = this.rectF;
        Rect rect = this.rect;
        object.set(rect);
        object = this.shapeAppearanceModel.getTopLeftCornerSize();
        rect = this.getBoundsAsRectF();
        float f7 = object.getCornerSize((RectF)rect);
        float f8 = this.rectF.width() / f6;
        f6 = Math.min(f7, f8);
        object = this.shapeAppearanceModel;
        rect = this.getBoundsAsRectF();
        boolean bl3 = ((ShapeAppearanceModel)object).isRoundRect((RectF)rect);
        if (bl3) {
            this.rectF.inset(f5, f5);
            paint = this.rectF;
            object = this.paint;
            canvas.drawRoundRect((RectF)paint, f6, f6, (Paint)object);
        }
    }

    public RectF getBoundsAsRectF() {
        RectF rectF = this.boundsRectF;
        Rect rect = this.getBounds();
        rectF.set(rect);
        return this.boundsRectF;
    }

    public Drawable.ConstantState getConstantState() {
        return this.state;
    }

    public int getOpacity() {
        float f5 = this.borderWidth;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = -3;
            f5 = 0.0f / 0.0f;
        } else {
            object = -2;
            f5 = 0.0f / 0.0f;
        }
        return (int)object;
    }

    public void getOutline(Outline outline) {
        Object object = this.shapeAppearanceModel;
        Object object2 = this.getBoundsAsRectF();
        boolean bl2 = ((ShapeAppearanceModel)object).isRoundRect((RectF)object2);
        if (bl2) {
            object = this.shapeAppearanceModel.getTopLeftCornerSize();
            object2 = this.getBoundsAsRectF();
            float f5 = object.getCornerSize((RectF)object2);
            object2 = this.getBounds();
            outline.setRoundRect((Rect)object2, f5);
            return;
        }
        object = this.rect;
        this.copyBounds((Rect)object);
        object = this.rectF;
        object2 = this.rect;
        object.set((Rect)object2);
        object = this.pathProvider;
        object2 = this.shapeAppearanceModel;
        RectF rectF = this.rectF;
        Path path = this.shapePath;
        ((ShapeAppearancePathProvider)object).calculatePath((ShapeAppearanceModel)object2, 1.0f, rectF, path);
        object = this.shapePath;
        DrawableUtils.setOutlineToPath(outline, (Path)object);
    }

    public boolean getPadding(Rect rect) {
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        RectF rectF = this.getBoundsAsRectF();
        int n3 = shapeAppearanceModel.isRoundRect(rectF);
        if (n3 != 0) {
            float f5 = this.borderWidth;
            n3 = Math.round(f5);
            rect.set(n3, n3, n3, n3);
        }
        return true;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public boolean isStateful() {
        boolean bl2;
        ColorStateList colorStateList = this.borderTint;
        if (colorStateList != null && (bl2 = colorStateList.isStateful()) || (bl2 = super.isStateful())) {
            bl2 = true;
        } else {
            bl2 = false;
            colorStateList = null;
        }
        return bl2;
    }

    public void onBoundsChange(Rect rect) {
        this.invalidateShader = true;
    }

    public boolean onStateChange(int[] nArray) {
        int n3;
        int n4;
        int n7;
        ColorStateList colorStateList = this.borderTint;
        if (colorStateList != null && (n7 = colorStateList.getColorForState(nArray, n4 = this.currentBorderTintColor)) != (n3 = this.currentBorderTintColor)) {
            n3 = 1;
            this.invalidateShader = n3;
            this.currentBorderTintColor = n7;
        }
        if ((n7 = this.invalidateShader) != 0) {
            this.invalidateSelf();
        }
        return this.invalidateShader;
    }

    public void setAlpha(int n3) {
        this.paint.setAlpha(n3);
        this.invalidateSelf();
    }

    public void setBorderTint(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int n3;
            int[] nArray = this.getState();
            int n4 = this.currentBorderTintColor;
            this.currentBorderTintColor = n3 = colorStateList.getColorForState(nArray, n4);
        }
        this.borderTint = colorStateList;
        this.invalidateShader = true;
        this.invalidateSelf();
    }

    public void setBorderWidth(float f5) {
        float f6 = this.borderWidth;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.borderWidth = f5;
            Paint paint = this.paint;
            float f8 = 1.3333f;
            paint.setStrokeWidth(f5 *= f8);
            boolean bl2 = true;
            f5 = Float.MIN_VALUE;
            this.invalidateShader = bl2;
            this.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        this.invalidateSelf();
    }

    public void setGradientColors(int n3, int n4, int n7, int n8) {
        this.topOuterStrokeColor = n3;
        this.topInnerStrokeColor = n4;
        this.bottomOuterStrokeColor = n7;
        this.bottomInnerStrokeColor = n8;
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        this.invalidateSelf();
    }
}

