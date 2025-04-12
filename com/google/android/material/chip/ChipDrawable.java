/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Outline
 *  android.graphics.Paint
 *  android.graphics.Paint$Align
 *  android.graphics.Paint$FontMetrics
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PointF
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.RippleDrawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.graphics.drawable.shapes.OvalShape
 *  android.graphics.drawable.shapes.Shape
 *  android.os.Build$VERSION
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.AttributeSet
 */
package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.chip.ChipDrawable$Delegate;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class ChipDrawable
extends MaterialShapeDrawable
implements Drawable.Callback,
TextDrawableHelper$TextDrawableDelegate {
    private static final boolean DEBUG = false;
    private static final int[] DEFAULT_STATE;
    private static final int MAX_CHIP_ICON_HEIGHT = 24;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private static final ShapeDrawable closeIconRippleMask;
    private int alpha;
    private boolean checkable;
    private Drawable checkedIcon;
    private ColorStateList checkedIconTint;
    private boolean checkedIconVisible;
    private ColorStateList chipBackgroundColor;
    private float chipCornerRadius = -1.0f;
    private float chipEndPadding;
    private Drawable chipIcon;
    private float chipIconSize;
    private ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final Paint chipPaint;
    private float chipStartPadding;
    private ColorStateList chipStrokeColor;
    private float chipStrokeWidth;
    private ColorStateList chipSurfaceColor;
    private Drawable closeIcon;
    private CharSequence closeIconContentDescription;
    private float closeIconEndPadding;
    private Drawable closeIconRipple;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;
    private ColorStateList closeIconTint;
    private boolean closeIconVisible;
    private ColorFilter colorFilter;
    private ColorStateList compatRippleColor;
    private final Context context;
    private boolean currentChecked;
    private int currentChipBackgroundColor;
    private int currentChipStrokeColor;
    private int currentChipSurfaceColor;
    private int currentCompatRippleColor;
    private int currentCompositeSurfaceBackgroundColor;
    private int currentTextColor;
    private int currentTint;
    private final Paint debugPaint;
    private WeakReference delegate;
    private final Paint.FontMetrics fontMetrics;
    private boolean hasChipIconTint;
    private MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private boolean isShapeThemingEnabled;
    private int maxWidth;
    private final PointF pointF;
    private final RectF rectF;
    private ColorStateList rippleColor;
    private final Path shapePath;
    private boolean shouldDrawText;
    private MotionSpec showMotionSpec;
    private CharSequence text;
    private final TextDrawableHelper textDrawableHelper;
    private float textEndPadding;
    private float textStartPadding;
    private ColorStateList tint;
    private PorterDuffColorFilter tintFilter;
    private PorterDuff.Mode tintMode;
    private TextUtils.TruncateAt truncateAt;
    private boolean useCompatRipple;

    static {
        ShapeDrawable shapeDrawable;
        DEFAULT_STATE = new int[]{16842910};
        OvalShape ovalShape = new OvalShape();
        closeIconRippleMask = shapeDrawable = new ShapeDrawable((Shape)ovalShape);
    }

    private ChipDrawable(Context object, AttributeSet object2, int n3, int n4) {
        super((Context)object, (AttributeSet)object2, n3, n4);
        float f5;
        int n7;
        n3 = 1;
        super(n3);
        this.chipPaint = object2;
        super();
        this.fontMetrics = object2;
        super();
        this.rectF = object2;
        super();
        this.pointF = object2;
        super();
        this.shapePath = object2;
        this.alpha = n7 = 255;
        object2 = PorterDuff.Mode.SRC_IN;
        this.tintMode = object2;
        n4 = 0;
        super(null);
        this.delegate = object2;
        this.initializeElevationOverlay((Context)object);
        this.context = object;
        super(this);
        this.textDrawableHelper = object2;
        String string2 = "";
        this.text = string2;
        object2 = ((TextDrawableHelper)object2).getTextPaint();
        ((TextPaint)object2).density = f5 = object.getResources().getDisplayMetrics().density;
        this.debugPaint = null;
        object = DEFAULT_STATE;
        this.setState((int[])object);
        this.setCloseIconState((int[])object);
        this.shouldDrawText = n3;
        boolean bl2 = RippleUtils.USE_FRAMEWORK_RIPPLE;
        if (bl2) {
            object = closeIconRippleMask;
            n7 = -1;
            object.setTint(n7);
        }
    }

    private void applyChildDrawable(Drawable drawable2) {
        boolean bl2;
        if (drawable2 == null) {
            return;
        }
        drawable2.setCallback((Drawable.Callback)this);
        int bl22 = ut0_0.b(this);
        ut0_0.c(drawable2, bl22);
        int n3 = this.getLevel();
        drawable2.setLevel(n3);
        boolean bl3 = this.isVisible();
        boolean bl4 = false;
        ColorStateList colorStateList = null;
        drawable2.setVisible(bl3, false);
        Object object = this.closeIcon;
        if (drawable2 == object) {
            boolean bl5 = drawable2.isStateful();
            if (bl5) {
                object = this.getCloseIconState();
                drawable2.setState((int[])object);
            }
            object = this.closeIconTint;
            drawable2.setTintList((ColorStateList)object);
            return;
        }
        object = this.chipIcon;
        if (drawable2 == object && (bl4 = this.hasChipIconTint)) {
            colorStateList = this.chipIconTint;
            object.setTintList(colorStateList);
        }
        if (bl2 = drawable2.isStateful()) {
            object = this.getState();
            drawable2.setState((int[])object);
        }
    }

    private void calculateChipIconBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        boolean bl2 = this.showsChipIcon();
        if (bl2 || (bl2 = this.showsCheckedIcon())) {
            float f5 = this.chipStartPadding;
            float f6 = this.iconStartPadding;
            f5 += f6;
            f6 = this.getCurrentChipIconWidth();
            int n3 = ut0_0.b(this);
            if (n3 == 0) {
                float f7;
                n3 = rect.left;
                rectF.left = f7 = (float)n3 + f5;
                rectF.right = f7 += f6;
            } else {
                float f8;
                n3 = rect.right;
                rectF.right = f8 = (float)n3 - f5;
                rectF.left = f8 -= f6;
            }
            f5 = this.getCurrentChipIconHeight();
            float f11 = rect.exactCenterY();
            f6 = f5 / 2.0f;
            rectF.top = f11 -= f6;
            rectF.bottom = f11 += f5;
        }
    }

    private void calculateChipTouchBounds(Rect rect, RectF rectF) {
        rectF.set(rect);
        boolean bl2 = this.showsCloseIcon();
        if (bl2) {
            float f5 = this.chipEndPadding;
            float f6 = this.closeIconEndPadding;
            f5 += f6;
            f6 = this.closeIconSize;
            f5 += f6;
            f6 = this.closeIconStartPadding;
            f5 += f6;
            f6 = this.textEndPadding;
            f5 += f6;
            int n3 = ut0_0.b(this);
            if (n3 == 0) {
                float f7;
                int n4 = rect.right;
                rectF.right = f7 = (float)n4 - f5;
            } else {
                float f8;
                int n7 = rect.left;
                rectF.left = f8 = (float)n7 + f5;
            }
        }
    }

    private void calculateCloseIconBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        boolean bl2 = this.showsCloseIcon();
        if (bl2) {
            float f5 = this.chipEndPadding;
            float f6 = this.closeIconEndPadding;
            f5 += f6;
            int n3 = ut0_0.b(this);
            if (n3 == 0) {
                n3 = rect.right;
                rectF.right = f6 = (float)n3 - f5;
                f5 = this.closeIconSize;
                rectF.left = f6 -= f5;
            } else {
                n3 = rect.left;
                rectF.left = f6 = (float)n3 + f5;
                f5 = this.closeIconSize;
                rectF.right = f6 += f5;
            }
            float f7 = rect.exactCenterY();
            f5 = this.closeIconSize;
            n3 = 0x40000000;
            f6 = f5 / 2.0f;
            rectF.top = f7 -= f6;
            rectF.bottom = f7 += f5;
        }
    }

    private void calculateCloseIconTouchBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        int n3 = this.showsCloseIcon();
        if (n3 != 0) {
            float f5;
            float f6 = this.chipEndPadding;
            float f7 = this.closeIconEndPadding;
            f6 += f7;
            f7 = this.closeIconSize;
            f6 += f7;
            f7 = this.closeIconStartPadding;
            f6 += f7;
            f7 = this.textEndPadding;
            f6 += f7;
            int n4 = ut0_0.b(this);
            if (n4 == 0) {
                n4 = rect.right;
                rectF.right = f7 = (float)n4;
                rectF.left = f7 -= f6;
            } else {
                float f8;
                n4 = rect.left;
                rectF.left = f8 = (float)n4;
                rectF.right = f7 = (float)n4 + f6;
            }
            n3 = rect.top;
            rectF.top = f6 = (float)n3;
            int n7 = rect.bottom;
            rectF.bottom = f5 = (float)n7;
        }
    }

    private void calculateTextBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        CharSequence charSequence = this.text;
        if (charSequence != null) {
            float f5;
            float f6 = this.chipStartPadding;
            float f7 = this.calculateChipIconWidth() + f6;
            f6 = this.textStartPadding;
            f7 += f6;
            f6 = this.chipEndPadding;
            float f8 = this.calculateCloseIconWidth() + f6;
            f6 = this.textEndPadding;
            f8 += f6;
            int n3 = ut0_0.b(this);
            if (n3 == 0) {
                rectF.left = f6 = (float)rect.left + f7;
                n3 = rect.right;
                rectF.right = f6 = (float)n3 - f8;
            } else {
                rectF.left = f6 = (float)rect.left + f8;
                n3 = rect.right;
                rectF.right = f6 = (float)n3 - f7;
            }
            n3 = rect.top;
            rectF.top = f6 = (float)n3;
            int n4 = rect.bottom;
            rectF.bottom = f5 = (float)n4;
        }
    }

    private float calculateTextCenterFromBaseline() {
        TextPaint textPaint = this.textDrawableHelper.getTextPaint();
        Paint.FontMetrics fontMetrics = this.fontMetrics;
        textPaint.getFontMetrics(fontMetrics);
        textPaint = this.fontMetrics;
        float f5 = textPaint.descent;
        float f6 = textPaint.ascent;
        return (f5 + f6) / 2.0f;
    }

    private boolean canShowCheckedIcon() {
        Drawable drawable2;
        boolean bl2 = this.checkedIconVisible;
        if (bl2 && (drawable2 = this.checkedIcon) != null && (bl2 = this.checkable)) {
            bl2 = true;
        } else {
            bl2 = false;
            drawable2 = null;
        }
        return bl2;
    }

    public static ChipDrawable createFromAttributes(Context context, AttributeSet attributeSet, int n3, int n4) {
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, n3, n4);
        chipDrawable.loadFromAttributes(attributeSet, n3, n4);
        return chipDrawable;
    }

    public static ChipDrawable createFromResource(Context context, int n3) {
        String string2 = "chip";
        AttributeSet attributeSet = DrawableUtils.parseDrawableXml(context, n3, string2);
        int n4 = attributeSet.getStyleAttribute();
        if (n4 == 0) {
            n4 = R$style.Widget_MaterialComponents_Chip_Entry;
        }
        int n7 = R$attr.chipStandaloneStyle;
        return ChipDrawable.createFromAttributes(context, attributeSet, n7, n4);
    }

    private void drawCheckedIcon(Canvas canvas, Rect rect) {
        boolean bl2 = this.showsCheckedIcon();
        if (bl2) {
            RectF rectF = this.rectF;
            this.calculateChipIconBounds(rect, rectF);
            rect = this.rectF;
            float f5 = rect.left;
            float f6 = rect.top;
            canvas.translate(f5, f6);
            Drawable drawable2 = this.checkedIcon;
            RectF rectF2 = this.rectF;
            float f7 = rectF2.width();
            int n3 = (int)f7;
            RectF rectF3 = this.rectF;
            float f8 = rectF3.height();
            int n4 = (int)f8;
            drawable2.setBounds(0, 0, n3, n4);
            drawable2 = this.checkedIcon;
            drawable2.draw(canvas);
            f5 = -f5;
            f6 = -f6;
            canvas.translate(f5, f6);
        }
    }

    private void drawChipBackground(Canvas canvas, Rect rect) {
        boolean bl2 = this.isShapeThemingEnabled;
        if (!bl2) {
            Paint paint = this.chipPaint;
            int n3 = this.currentChipBackgroundColor;
            paint.setColor(n3);
            paint = this.chipPaint;
            Paint.Style style2 = Paint.Style.FILL;
            paint.setStyle(style2);
            paint = this.chipPaint;
            style2 = this.getTintColorFilter();
            paint.setColorFilter((ColorFilter)style2);
            paint = this.rectF;
            paint.set(rect);
            rect = this.rectF;
            float f5 = this.getChipCornerRadius();
            float f6 = this.getChipCornerRadius();
            Paint paint2 = this.chipPaint;
            canvas.drawRoundRect((RectF)rect, f5, f6, paint2);
        }
    }

    private void drawChipIcon(Canvas canvas, Rect rect) {
        boolean bl2 = this.showsChipIcon();
        if (bl2) {
            RectF rectF = this.rectF;
            this.calculateChipIconBounds(rect, rectF);
            rect = this.rectF;
            float f5 = rect.left;
            float f6 = rect.top;
            canvas.translate(f5, f6);
            Drawable drawable2 = this.chipIcon;
            RectF rectF2 = this.rectF;
            float f7 = rectF2.width();
            int n3 = (int)f7;
            RectF rectF3 = this.rectF;
            float f8 = rectF3.height();
            int n4 = (int)f8;
            drawable2.setBounds(0, 0, n3, n4);
            drawable2 = this.chipIcon;
            drawable2.draw(canvas);
            f5 = -f5;
            f6 = -f6;
            canvas.translate(f5, f6);
        }
    }

    private void drawChipStroke(Canvas canvas, Rect rect) {
        float f5 = this.chipStrokeWidth;
        int n3 = 0;
        float f6 = 0.0f;
        Paint.Style style2 = null;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object > 0 && (object = (Object)this.isShapeThemingEnabled) == false) {
            Paint paint = this.chipPaint;
            n3 = this.currentChipStrokeColor;
            paint.setColor(n3);
            paint = this.chipPaint;
            style2 = Paint.Style.STROKE;
            paint.setStyle(style2);
            object = this.isShapeThemingEnabled;
            if (object == false) {
                paint = this.chipPaint;
                style2 = this.getTintColorFilter();
                paint.setColorFilter((ColorFilter)style2);
            }
            paint = this.rectF;
            f6 = rect.left;
            float f8 = this.chipStrokeWidth;
            float f11 = 2.0f;
            float f12 = f8 / f11 + f6;
            f6 = rect.top;
            float f14 = f8 / f11 + f6;
            n3 = rect.right;
            f6 = n3;
            float f15 = f8 / f11;
            int n4 = rect.bottom;
            float f16 = n4;
            paint.set(f12, f14, f6 -= f15, f16 -= (f8 /= f11));
            f16 = this.chipCornerRadius;
            f5 = this.chipStrokeWidth / f11;
            paint = this.rectF;
            style2 = this.chipPaint;
            canvas.drawRoundRect((RectF)paint, f16 -= f5, f16, (Paint)style2);
        }
    }

    private void drawChipSurface(Canvas canvas, Rect rect) {
        boolean bl2 = this.isShapeThemingEnabled;
        if (!bl2) {
            Paint paint = this.chipPaint;
            int n3 = this.currentChipSurfaceColor;
            paint.setColor(n3);
            paint = this.chipPaint;
            Paint.Style style2 = Paint.Style.FILL;
            paint.setStyle(style2);
            paint = this.rectF;
            paint.set(rect);
            rect = this.rectF;
            float f5 = this.getChipCornerRadius();
            float f6 = this.getChipCornerRadius();
            Paint paint2 = this.chipPaint;
            canvas.drawRoundRect((RectF)rect, f5, f6, paint2);
        }
    }

    private void drawCloseIcon(Canvas canvas, Rect rect) {
        boolean bl2 = this.showsCloseIcon();
        if (bl2) {
            RectF rectF = this.rectF;
            this.calculateCloseIconBounds(rect, rectF);
            rect = this.rectF;
            float f5 = rect.left;
            float f6 = rect.top;
            canvas.translate(f5, f6);
            Drawable drawable2 = this.closeIcon;
            RectF rectF2 = this.rectF;
            float f7 = rectF2.width();
            int n3 = (int)f7;
            RectF rectF3 = this.rectF;
            float f8 = rectF3.height();
            int n4 = (int)f8;
            drawable2.setBounds(0, 0, n3, n4);
            boolean bl3 = RippleUtils.USE_FRAMEWORK_RIPPLE;
            if (bl3) {
                drawable2 = this.closeIconRipple;
                rectF2 = this.closeIcon.getBounds();
                drawable2.setBounds((Rect)rectF2);
                this.closeIconRipple.jumpToCurrentState();
                drawable2 = this.closeIconRipple;
                drawable2.draw(canvas);
            } else {
                drawable2 = this.closeIcon;
                drawable2.draw(canvas);
            }
            f5 = -f5;
            f6 = -f6;
            canvas.translate(f5, f6);
        }
    }

    private void drawCompatRipple(Canvas canvas, Rect rect) {
        Paint paint = this.chipPaint;
        int n3 = this.currentCompatRippleColor;
        paint.setColor(n3);
        paint = this.chipPaint;
        Paint.Style style2 = Paint.Style.FILL;
        paint.setStyle(style2);
        paint = this.rectF;
        paint.set(rect);
        boolean bl2 = this.isShapeThemingEnabled;
        if (!bl2) {
            rect = this.rectF;
            float f5 = this.getChipCornerRadius();
            float f6 = this.getChipCornerRadius();
            Paint paint2 = this.chipPaint;
            canvas.drawRoundRect((RectF)rect, f5, f6, paint2);
        } else {
            paint = new RectF(rect);
            rect = this.shapePath;
            this.calculatePathForSize((RectF)paint, (Path)rect);
            rect = this.chipPaint;
            paint = this.shapePath;
            style2 = this.getBoundsAsRectF();
            super.drawShape(canvas, (Paint)rect, (Path)paint, (RectF)style2);
        }
    }

    private void drawDebug(Canvas canvas, Rect rect) {
        Object object = this.debugPaint;
        if (object != null) {
            Paint paint;
            int n3 = 127;
            int n4 = hZ.i(-16777216, n3);
            object.setColor(n4);
            object = this.debugPaint;
            canvas.drawRect(rect, object);
            int n7 = this.showsChipIcon();
            if (n7 != 0 || (n7 = this.showsCheckedIcon()) != 0) {
                object = this.rectF;
                this.calculateChipIconBounds(rect, (RectF)object);
                object = this.rectF;
                paint = this.debugPaint;
                canvas.drawRect((RectF)object, paint);
            }
            if ((object = this.text) != null) {
                float f5 = rect.left;
                float f6 = rect.exactCenterY();
                n7 = rect.right;
                float f7 = n7;
                float f8 = rect.exactCenterY();
                Paint paint2 = this.debugPaint;
                canvas.drawLine(f5, f6, f7, f8, paint2);
            }
            if ((n7 = this.showsCloseIcon()) != 0) {
                object = this.rectF;
                this.calculateCloseIconBounds(rect, (RectF)object);
                object = this.rectF;
                paint = this.debugPaint;
                canvas.drawRect((RectF)object, paint);
            }
            object = this.debugPaint;
            n4 = hZ.i(-65536, n3);
            object.setColor(n4);
            object = this.rectF;
            this.calculateChipTouchBounds(rect, (RectF)object);
            object = this.rectF;
            paint = this.debugPaint;
            canvas.drawRect((RectF)object, paint);
            object = this.debugPaint;
            n4 = hZ.i(-16711936, n3);
            object.setColor(n4);
            object = this.rectF;
            this.calculateCloseIconTouchBounds(rect, (RectF)object);
            rect = this.rectF;
            object = this.debugPaint;
            canvas.drawRect((RectF)rect, object);
        }
    }

    private void drawText(Canvas canvas, Rect object) {
        Object object2 = this.text;
        if (object2 != null) {
            TextUtils.TruncateAt truncateAt;
            CharSequence charSequence;
            TextUtils.TruncateAt truncateAt2;
            object2 = this.pointF;
            object2 = this.calculateTextOriginAndAlignment((Rect)object, (PointF)object2);
            Object object3 = this.rectF;
            this.calculateTextBounds((Rect)object, (RectF)object3);
            object = this.textDrawableHelper.getTextAppearance();
            if (object != null) {
                object = this.textDrawableHelper.getTextPaint();
                object3 = this.getState();
                ((TextPaint)object).drawableState = (int[])object3;
                object = this.textDrawableHelper;
                object3 = this.context;
                ((TextDrawableHelper)object).updateTextPaintDrawState((Context)object3);
            }
            this.textDrawableHelper.getTextPaint().setTextAlign((Paint.Align)object2);
            object = this.textDrawableHelper;
            object2 = this.getText().toString();
            float f5 = ((TextDrawableHelper)object).getTextWidth((String)object2);
            int n3 = Math.round(f5);
            object2 = this.rectF;
            float f6 = object2.width();
            int n4 = Math.round(f6);
            int n7 = 0;
            object3 = null;
            if (n3 > n4) {
                n3 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n3 = 0;
                f5 = 0.0f;
                object = null;
            }
            if (n3 != 0) {
                n7 = canvas.save();
                object2 = this.rectF;
                canvas.clipRect((RectF)object2);
            }
            object2 = this.text;
            if (n3 != 0 && (truncateAt2 = this.truncateAt) != null) {
                truncateAt2 = this.textDrawableHelper.getTextPaint();
                charSequence = this.rectF;
                float f7 = charSequence.width();
                truncateAt = this.truncateAt;
                object2 = TextUtils.ellipsize((CharSequence)object2, (TextPaint)truncateAt2, (float)f7, (TextUtils.TruncateAt)truncateAt);
            }
            charSequence = object2;
            int n8 = object2.length();
            object2 = this.pointF;
            float f8 = ((PointF)object2).x;
            float f11 = ((PointF)object2).y;
            object2 = this.textDrawableHelper;
            TextPaint textPaint = ((TextDrawableHelper)object2).getTextPaint();
            truncateAt = null;
            truncateAt2 = canvas;
            canvas.drawText(charSequence, 0, n8, f8, f11, (Paint)textPaint);
            if (n3 != 0) {
                canvas.restoreToCount(n7);
            }
        }
    }

    private float getCurrentChipIconHeight() {
        boolean bl2 = this.currentChecked;
        Drawable drawable2 = bl2 ? this.checkedIcon : this.chipIcon;
        float f5 = this.chipIconSize;
        float f6 = 0.0f;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object <= 0 && drawable2 != null) {
            Context context = this.context;
            double d2 = Math.ceil(ViewUtils.dpToPx(context, 24));
            f5 = (float)d2;
            f6 = drawable2.getIntrinsicHeight();
            float f8 = f6 - f5;
            object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object <= 0) {
                return drawable2.getIntrinsicHeight();
            }
        }
        return f5;
    }

    private float getCurrentChipIconWidth() {
        boolean bl2 = this.currentChecked;
        Drawable drawable2 = bl2 ? this.checkedIcon : this.chipIcon;
        float f5 = this.chipIconSize;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (object <= 0 && drawable2 != null) {
            return drawable2.getIntrinsicWidth();
        }
        return f5;
    }

    private ColorFilter getTintColorFilter() {
        ColorFilter colorFilter = this.colorFilter;
        if (colorFilter == null) {
            colorFilter = this.tintFilter;
        }
        return colorFilter;
    }

    private static boolean hasState(int[] nArray, int n3) {
        if (nArray == null) {
            return false;
        }
        for (int n4 : nArray) {
            if (n4 != n3) continue;
            return true;
        }
        return false;
    }

    private static boolean isStateful(ColorStateList colorStateList) {
        boolean bl2;
        if (colorStateList != null && (bl2 = colorStateList.isStateful())) {
            bl2 = true;
        } else {
            bl2 = false;
            colorStateList = null;
        }
        return bl2;
    }

    private static boolean isStateful(Drawable drawable2) {
        boolean bl2;
        if (drawable2 != null && (bl2 = drawable2.isStateful())) {
            bl2 = true;
        } else {
            bl2 = false;
            drawable2 = null;
        }
        return bl2;
    }

    private static boolean isStateful(TextAppearance textAppearance) {
        boolean bl2;
        ColorStateList colorStateList;
        if (textAppearance != null && (colorStateList = textAppearance.getTextColor()) != null && (bl2 = (textAppearance = textAppearance.getTextColor()).isStateful())) {
            bl2 = true;
        } else {
            bl2 = false;
            textAppearance = null;
        }
        return bl2;
    }

    private void loadFromAttributes(AttributeSet object, int n3, int n4) {
        int n7;
        Context context = this.context;
        int[] nArray = R$styleable.Chip;
        int[] nArray2 = new int[]{};
        Object object2 = object;
        TypedArray typedArray = ThemeEnforcement.obtainStyledAttributes(context, object, nArray, n3, n4, nArray2);
        n4 = R$styleable.Chip_shapeAppearance;
        n4 = (int)(typedArray.hasValue(n4) ? 1 : 0);
        this.isShapeThemingEnabled = n4;
        Object object3 = this.context;
        int n8 = R$styleable.Chip_chipSurfaceColor;
        object3 = MaterialResources.getColorStateList((Context)object3, typedArray, n8);
        this.setChipSurfaceColor((ColorStateList)object3);
        object3 = this.context;
        n8 = R$styleable.Chip_chipBackgroundColor;
        object3 = MaterialResources.getColorStateList((Context)object3, typedArray, n8);
        this.setChipBackgroundColor((ColorStateList)object3);
        n4 = R$styleable.Chip_chipMinHeight;
        n8 = 0;
        context = null;
        float f5 = typedArray.getDimension(n4, 0.0f);
        this.setChipMinHeight(f5);
        n4 = R$styleable.Chip_chipCornerRadius;
        n4 = (int)(typedArray.hasValue(n4) ? 1 : 0);
        if (n4 != 0) {
            n4 = R$styleable.Chip_chipCornerRadius;
            f5 = typedArray.getDimension(n4, 0.0f);
            this.setChipCornerRadius(f5);
        }
        object3 = this.context;
        int n10 = R$styleable.Chip_chipStrokeColor;
        object3 = MaterialResources.getColorStateList((Context)object3, typedArray, n10);
        this.setChipStrokeColor((ColorStateList)object3);
        n4 = R$styleable.Chip_chipStrokeWidth;
        f5 = typedArray.getDimension(n4, 0.0f);
        this.setChipStrokeWidth(f5);
        object3 = this.context;
        n10 = R$styleable.Chip_rippleColor;
        object3 = MaterialResources.getColorStateList((Context)object3, typedArray, n10);
        this.setRippleColor((ColorStateList)object3);
        n4 = R$styleable.Chip_android_text;
        object3 = typedArray.getText(n4);
        this.setText((CharSequence)object3);
        object3 = this.context;
        n10 = R$styleable.Chip_android_textAppearance;
        object3 = MaterialResources.getTextAppearance((Context)object3, typedArray, n10);
        n10 = R$styleable.Chip_android_textSize;
        float f6 = ((TextAppearance)object3).getTextSize();
        float f7 = typedArray.getDimension(n10, f6);
        ((TextAppearance)object3).setTextSize(f7);
        n10 = Build.VERSION.SDK_INT;
        int n14 = 23;
        f6 = 3.2E-44f;
        if (n10 < n14) {
            object2 = this.context;
            n14 = R$styleable.Chip_android_textColor;
            object2 = MaterialResources.getColorStateList((Context)object2, typedArray, n14);
            ((TextAppearance)object3).setTextColor((ColorStateList)object2);
        }
        this.setTextAppearance((TextAppearance)object3);
        n4 = R$styleable.Chip_android_ellipsize;
        n4 = typedArray.getInt(n4, 0);
        n10 = 1;
        f7 = Float.MIN_VALUE;
        if (n4 != n10) {
            n10 = 2;
            f7 = 2.8E-45f;
            if (n4 != n10) {
                n10 = 3;
                f7 = 4.2E-45f;
                if (n4 == n10) {
                    object3 = TextUtils.TruncateAt.END;
                    this.setEllipsize((TextUtils.TruncateAt)object3);
                }
            } else {
                object3 = TextUtils.TruncateAt.MIDDLE;
                this.setEllipsize((TextUtils.TruncateAt)object3);
            }
        } else {
            object3 = TextUtils.TruncateAt.START;
            this.setEllipsize((TextUtils.TruncateAt)object3);
        }
        n4 = R$styleable.Chip_chipIconVisible;
        n4 = (int)(typedArray.getBoolean(n4, false) ? 1 : 0);
        this.setChipIconVisible(n4 != 0);
        object3 = NAMESPACE_APP;
        if (object != null && (object2 = object.getAttributeValue((String)object3, "chipIconEnabled")) != null && (object2 = object.getAttributeValue((String)object3, "chipIconVisible")) == null) {
            n10 = R$styleable.Chip_chipIconEnabled;
            n10 = (int)(typedArray.getBoolean(n10, false) ? 1 : 0);
            this.setChipIconVisible(n10 != 0);
        }
        object2 = this.context;
        n14 = R$styleable.Chip_chipIcon;
        object2 = MaterialResources.getDrawable((Context)object2, typedArray, n14);
        this.setChipIcon((Drawable)object2);
        n10 = R$styleable.Chip_chipIconTint;
        n10 = (int)(typedArray.hasValue(n10) ? 1 : 0);
        if (n10 != 0) {
            object2 = this.context;
            n14 = R$styleable.Chip_chipIconTint;
            object2 = MaterialResources.getColorStateList((Context)object2, typedArray, n14);
            this.setChipIconTint((ColorStateList)object2);
        }
        n10 = R$styleable.Chip_chipIconSize;
        n14 = -1082130432;
        f6 = -1.0f;
        f7 = typedArray.getDimension(n10, f6);
        this.setChipIconSize(f7);
        n10 = R$styleable.Chip_closeIconVisible;
        n10 = (int)(typedArray.getBoolean(n10, false) ? 1 : 0);
        this.setCloseIconVisible(n10 != 0);
        if (object != null && (object2 = object.getAttributeValue((String)object3, "closeIconEnabled")) != null && (object2 = object.getAttributeValue((String)object3, "closeIconVisible")) == null) {
            n10 = R$styleable.Chip_closeIconEnabled;
            n10 = (int)(typedArray.getBoolean(n10, false) ? 1 : 0);
            this.setCloseIconVisible(n10 != 0);
        }
        object2 = this.context;
        n14 = R$styleable.Chip_closeIcon;
        object2 = MaterialResources.getDrawable((Context)object2, typedArray, n14);
        this.setCloseIcon((Drawable)object2);
        object2 = this.context;
        n14 = R$styleable.Chip_closeIconTint;
        object2 = MaterialResources.getColorStateList((Context)object2, typedArray, n14);
        this.setCloseIconTint((ColorStateList)object2);
        n10 = R$styleable.Chip_closeIconSize;
        f7 = typedArray.getDimension(n10, 0.0f);
        this.setCloseIconSize(f7);
        n10 = R$styleable.Chip_android_checkable;
        n10 = (int)(typedArray.getBoolean(n10, false) ? 1 : 0);
        this.setCheckable(n10 != 0);
        n10 = R$styleable.Chip_checkedIconVisible;
        n10 = (int)(typedArray.getBoolean(n10, false) ? 1 : 0);
        this.setCheckedIconVisible(n10 != 0);
        if (object != null && (object2 = object.getAttributeValue((String)object3, "checkedIconEnabled")) != null && (object = object.getAttributeValue((String)object3, (String)(object2 = "checkedIconVisible"))) == null) {
            n7 = R$styleable.Chip_checkedIconEnabled;
            n7 = (int)(typedArray.getBoolean(n7, false) ? 1 : 0);
            this.setCheckedIconVisible(n7 != 0);
        }
        object = this.context;
        n4 = R$styleable.Chip_checkedIcon;
        object = MaterialResources.getDrawable((Context)object, typedArray, n4);
        this.setCheckedIcon((Drawable)object);
        n7 = R$styleable.Chip_checkedIconTint;
        n7 = (int)(typedArray.hasValue(n7) ? 1 : 0);
        if (n7 != 0) {
            object = this.context;
            n4 = R$styleable.Chip_checkedIconTint;
            object = MaterialResources.getColorStateList((Context)object, typedArray, n4);
            this.setCheckedIconTint((ColorStateList)object);
        }
        object = this.context;
        n4 = R$styleable.Chip_showMotionSpec;
        object = MotionSpec.createFromAttribute((Context)object, typedArray, n4);
        this.setShowMotionSpec((MotionSpec)object);
        object = this.context;
        n4 = R$styleable.Chip_hideMotionSpec;
        object = MotionSpec.createFromAttribute((Context)object, typedArray, n4);
        this.setHideMotionSpec((MotionSpec)object);
        n7 = R$styleable.Chip_chipStartPadding;
        float f8 = typedArray.getDimension(n7, 0.0f);
        this.setChipStartPadding(f8);
        n7 = R$styleable.Chip_iconStartPadding;
        f8 = typedArray.getDimension(n7, 0.0f);
        this.setIconStartPadding(f8);
        n7 = R$styleable.Chip_iconEndPadding;
        f8 = typedArray.getDimension(n7, 0.0f);
        this.setIconEndPadding(f8);
        n7 = R$styleable.Chip_textStartPadding;
        f8 = typedArray.getDimension(n7, 0.0f);
        this.setTextStartPadding(f8);
        n7 = R$styleable.Chip_textEndPadding;
        f8 = typedArray.getDimension(n7, 0.0f);
        this.setTextEndPadding(f8);
        n7 = R$styleable.Chip_closeIconStartPadding;
        f8 = typedArray.getDimension(n7, 0.0f);
        this.setCloseIconStartPadding(f8);
        n7 = R$styleable.Chip_closeIconEndPadding;
        f8 = typedArray.getDimension(n7, 0.0f);
        this.setCloseIconEndPadding(f8);
        n7 = R$styleable.Chip_chipEndPadding;
        f8 = typedArray.getDimension(n7, 0.0f);
        this.setChipEndPadding(f8);
        n7 = R$styleable.Chip_android_maxWidth;
        n7 = typedArray.getDimensionPixelSize(n7, -1 >>> 1);
        this.setMaxWidth(n7);
        typedArray.recycle();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean onStateChange(int[] var1_1, int[] var2_2) {
        var3_3 /* !! */  = super.onStateChange(var1_1 /* !! */ );
        var4_4 /* !! */  = this.chipSurfaceColor;
        if (var4_4 /* !! */  != null) {
            var5_5 = this.currentChipSurfaceColor;
            var6_6 = var4_4 /* !! */ .getColorForState(var1_1 /* !! */ , var5_5);
        } else {
            var6_6 = 0;
            var7_7 = 0.0f;
            var4_4 /* !! */  = null;
        }
        var6_6 = this.compositeElevationOverlayIfNeeded(var6_6);
        var5_5 = this.currentChipSurfaceColor;
        var8_8 = 1;
        if (var5_5 != var6_6) {
            this.currentChipSurfaceColor = var6_6;
            var3_3 /* !! */  = 1;
            var9_9 = 1.4E-45f;
        }
        if ((var10_10 = this.chipBackgroundColor) != null) {
            var11_11 = this.currentChipBackgroundColor;
            var5_5 = var10_10.getColorForState(var1_1 /* !! */ , var11_11);
        } else {
            var5_5 = 0;
            var10_10 = null;
        }
        var5_5 = this.compositeElevationOverlayIfNeeded(var5_5);
        var11_11 = this.currentChipBackgroundColor;
        if (var11_11 != var5_5) {
            this.currentChipBackgroundColor = var5_5;
            var3_3 /* !! */  = 1;
            var9_9 = 1.4E-45f;
        }
        if ((var5_5 = this.currentCompositeSurfaceBackgroundColor) != (var6_6 = MaterialColors.layer(var6_6, var5_5))) {
            var5_5 = 1;
        } else {
            var5_5 = 0;
            var10_10 = null;
        }
        var12_12 = this.getFillColor();
        if (var12_12 == null) {
            var11_11 = 1;
        } else {
            var11_11 = 0;
            var12_12 = null;
        }
        if ((var5_5 |= var11_11) != 0) {
            this.currentCompositeSurfaceBackgroundColor = var6_6;
            var13_13 /* !! */  = ColorStateList.valueOf((int)var6_6);
            this.setFillColor(var13_13 /* !! */ );
            var3_3 /* !! */  = 1;
            var9_9 = 1.4E-45f;
        }
        if ((var4_4 /* !! */  = this.chipStrokeColor) != null) {
            var5_5 = this.currentChipStrokeColor;
            var6_6 = var4_4 /* !! */ .getColorForState(var1_1 /* !! */ , var5_5);
        } else {
            var6_6 = 0;
            var7_7 = 0.0f;
            var4_4 /* !! */  = null;
        }
        var5_5 = this.currentChipStrokeColor;
        if (var5_5 != var6_6) {
            this.currentChipStrokeColor = var6_6;
            var3_3 /* !! */  = 1;
            var9_9 = 1.4E-45f;
        }
        if ((var4_4 /* !! */  = this.compatRippleColor) != null && (var6_6 = (int)RippleUtils.shouldDrawRippleCompat(var1_1 /* !! */ )) != 0) {
            var4_4 /* !! */  = this.compatRippleColor;
            var5_5 = this.currentCompatRippleColor;
            var6_6 = var4_4 /* !! */ .getColorForState(var1_1 /* !! */ , var5_5);
        } else {
            var6_6 = 0;
            var7_7 = 0.0f;
            var4_4 /* !! */  = null;
        }
        var5_5 = this.currentCompatRippleColor;
        if (var5_5 != var6_6) {
            this.currentCompatRippleColor = var6_6;
            var6_6 = (int)this.useCompatRipple;
            if (var6_6 != 0) {
                var3_3 /* !! */  = 1;
                var9_9 = 1.4E-45f;
            }
        }
        if ((var4_4 /* !! */  = this.textDrawableHelper.getTextAppearance()) != null && (var4_4 /* !! */  = this.textDrawableHelper.getTextAppearance().getTextColor()) != null) {
            var4_4 /* !! */  = this.textDrawableHelper.getTextAppearance().getTextColor();
            var5_5 = this.currentTextColor;
            var6_6 = var4_4 /* !! */ .getColorForState(var1_1 /* !! */ , var5_5);
        } else {
            var6_6 = 0;
            var7_7 = 0.0f;
            var4_4 /* !! */  = null;
        }
        var5_5 = this.currentTextColor;
        if (var5_5 != var6_6) {
            this.currentTextColor = var6_6;
            var3_3 /* !! */  = 1;
            var9_9 = 1.4E-45f;
        }
        if ((var6_6 = (int)ChipDrawable.hasState((int[])(var4_4 /* !! */  = (ColorStateList)this.getState()), var5_5 = 0x10100A0)) != 0 && (var6_6 = (int)this.checkable) != 0) {
            var6_6 = 1;
            var7_7 = 1.4E-45f;
        } else {
            var6_6 = 0;
            var7_7 = 0.0f;
            var4_4 /* !! */  = null;
        }
        var5_5 = (int)this.currentChecked;
        if (var5_5 == var6_6 || (var10_10 = this.checkedIcon) == null) ** GOTO lbl108
        var9_9 = this.calculateChipIconWidth();
        this.currentChecked = var6_6;
        var7_7 = this.calculateChipIconWidth();
        cfr_temp_0 = var9_9 - var7_7;
        var3_3 /* !! */  = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
        if (var3_3 /* !! */  != 0) {
            var3_3 /* !! */  = 1;
            var9_9 = 1.4E-45f;
            var6_6 = 1;
            var7_7 = 1.4E-45f;
        } else {
            var3_3 /* !! */  = 1;
            var9_9 = 1.4E-45f;
lbl108:
            // 2 sources

            var6_6 = 0;
            var7_7 = 0.0f;
            var4_4 /* !! */  = null;
        }
        var10_10 = this.tint;
        if (var10_10 != null) {
            var11_11 = this.currentTint;
            var5_5 = var10_10.getColorForState(var1_1 /* !! */ , var11_11);
        } else {
            var5_5 = 0;
            var10_10 = null;
        }
        var11_11 = this.currentTint;
        if (var11_11 != var5_5) {
            this.currentTint = var5_5;
            var13_13 /* !! */  = this.tint;
            var10_10 = this.tintMode;
            var13_13 /* !! */  = DrawableUtils.updateTintFilter(this, var13_13 /* !! */ , (PorterDuff.Mode)var10_10);
            this.tintFilter = var13_13 /* !! */ ;
        } else {
            var8_8 = var3_3 /* !! */ ;
        }
        var13_13 /* !! */  = this.chipIcon;
        var3_3 /* !! */  = ChipDrawable.isStateful((Drawable)var13_13 /* !! */ );
        if (var3_3 /* !! */  != 0) {
            var13_13 /* !! */  = this.chipIcon;
            var3_3 /* !! */  = var13_13 /* !! */ .setState(var1_1 /* !! */ );
            var8_8 |= var3_3 /* !! */ ;
        }
        if ((var3_3 /* !! */  = ChipDrawable.isStateful((Drawable)(var13_13 /* !! */  = this.checkedIcon))) != 0) {
            var13_13 /* !! */  = this.checkedIcon;
            var3_3 /* !! */  = var13_13 /* !! */ .setState(var1_1 /* !! */ );
            var8_8 |= var3_3 /* !! */ ;
        }
        if ((var3_3 /* !! */  = ChipDrawable.isStateful((Drawable)(var13_13 /* !! */  = this.closeIcon))) != 0) {
            var3_3 /* !! */  = var1_1 /* !! */ .length;
            var5_5 = var2_2.length;
            var13_13 /* !! */  = (ColorStateList)new int[var3_3 /* !! */  += var5_5];
            var5_5 = var1_1 /* !! */ .length;
            System.arraycopy(var1_1 /* !! */ , 0, var13_13 /* !! */ , 0, var5_5);
            var14_14 = var1_1 /* !! */ .length;
            var5_5 = var2_2.length;
            System.arraycopy(var2_2, 0, var13_13 /* !! */ , var14_14, var5_5);
            var1_1 /* !! */  = (int[])this.closeIcon;
            var14_14 = (int)var1_1 /* !! */ .setState((int[])var13_13 /* !! */ );
            var8_8 |= var14_14;
        }
        if ((var14_14 = RippleUtils.USE_FRAMEWORK_RIPPLE) != 0 && (var14_14 = ChipDrawable.isStateful((Drawable)(var1_1 /* !! */  = (int[])this.closeIconRipple))) != 0) {
            var1_1 /* !! */  = (int[])this.closeIconRipple;
            var14_14 = var1_1 /* !! */ .setState(var2_2);
            var8_8 |= var14_14;
        }
        if (var8_8 != 0) {
            this.invalidateSelf();
        }
        if (var6_6 != 0) {
            this.onSizeChange();
        }
        return (boolean)var8_8;
    }

    private void setChipSurfaceColor(ColorStateList object) {
        ColorStateList colorStateList = this.chipSurfaceColor;
        if (colorStateList != object) {
            this.chipSurfaceColor = object;
            object = this.getState();
            this.onStateChange((int[])object);
        }
    }

    private boolean showsCheckedIcon() {
        Drawable drawable2;
        boolean bl2 = this.checkedIconVisible;
        if (bl2 && (drawable2 = this.checkedIcon) != null && (bl2 = this.currentChecked)) {
            bl2 = true;
        } else {
            bl2 = false;
            drawable2 = null;
        }
        return bl2;
    }

    private boolean showsChipIcon() {
        Drawable drawable2;
        boolean bl2 = this.chipIconVisible;
        if (bl2 && (drawable2 = this.chipIcon) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            drawable2 = null;
        }
        return bl2;
    }

    private boolean showsCloseIcon() {
        Drawable drawable2;
        boolean bl2 = this.closeIconVisible;
        if (bl2 && (drawable2 = this.closeIcon) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            drawable2 = null;
        }
        return bl2;
    }

    private void unapplyChildDrawable(Drawable drawable2) {
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
    }

    private void updateCompatRippleColor() {
        ColorStateList colorStateList;
        boolean bl2 = this.useCompatRipple;
        if (bl2) {
            colorStateList = RippleUtils.sanitizeRippleDrawableColor(this.rippleColor);
        } else {
            bl2 = false;
            colorStateList = null;
        }
        this.compatRippleColor = colorStateList;
    }

    private void updateFrameworkCloseIconRipple() {
        ColorStateList colorStateList = RippleUtils.sanitizeRippleDrawableColor(this.getRippleColor());
        Drawable drawable2 = this.closeIcon;
        ShapeDrawable shapeDrawable = closeIconRippleMask;
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, drawable2, (Drawable)shapeDrawable);
        this.closeIconRipple = rippleDrawable;
    }

    public float calculateChipIconWidth() {
        boolean bl2 = this.showsChipIcon();
        if (!bl2 && !(bl2 = this.showsCheckedIcon())) {
            return 0.0f;
        }
        float f5 = this.iconStartPadding;
        float f6 = this.getCurrentChipIconWidth();
        f5 += f6;
        f6 = this.iconEndPadding;
        return f5 + f6;
    }

    public float calculateCloseIconWidth() {
        boolean bl2 = this.showsCloseIcon();
        if (bl2) {
            float f5 = this.closeIconStartPadding;
            float f6 = this.closeIconSize;
            f5 += f6;
            f6 = this.closeIconEndPadding;
            return f5 + f6;
        }
        return 0.0f;
    }

    public Paint.Align calculateTextOriginAndAlignment(Rect rect, PointF pointF) {
        int n3 = 0;
        float f5 = 0.0f;
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        CharSequence charSequence = this.text;
        if (charSequence != null) {
            float f6 = this.chipStartPadding;
            float f7 = this.calculateChipIconWidth() + f6;
            f6 = this.textStartPadding;
            f7 += f6;
            int n4 = ut0_0.b(this);
            if (n4 == 0) {
                n4 = rect.left;
                pointF.x = f6 = (float)n4 + f7;
            } else {
                n3 = rect.right;
                pointF.x = f5 = (float)n3 - f7;
                align = Paint.Align.RIGHT;
            }
            int n7 = rect.centerY();
            float f8 = n7;
            f6 = this.calculateTextCenterFromBaseline();
            pointF.y = f8 -= f6;
        }
        return align;
    }

    public void draw(Canvas canvas) {
        Rect rect = this.getBounds();
        int n3 = rect.isEmpty();
        if (n3 == 0 && (n3 = this.getAlpha()) != 0) {
            int n4;
            int n7 = this.alpha;
            n3 = 255;
            if (n7 < n3) {
                float f5 = rect.left;
                float f6 = rect.top;
                float f7 = rect.right;
                float f8 = rect.bottom;
                n4 = CanvasCompat.saveLayerAlpha(canvas, f5, f6, f7, f8, n7);
            } else {
                n4 = 0;
            }
            this.drawChipSurface(canvas, rect);
            this.drawChipBackground(canvas, rect);
            boolean bl2 = this.isShapeThemingEnabled;
            if (bl2) {
                super.draw(canvas);
            }
            this.drawChipStroke(canvas, rect);
            this.drawCompatRipple(canvas, rect);
            this.drawChipIcon(canvas, rect);
            this.drawCheckedIcon(canvas, rect);
            bl2 = this.shouldDrawText;
            if (bl2) {
                this.drawText(canvas, rect);
            }
            this.drawCloseIcon(canvas, rect);
            this.drawDebug(canvas, rect);
            int n8 = this.alpha;
            if (n8 < n3) {
                canvas.restoreToCount(n4);
            }
        }
    }

    public int getAlpha() {
        return this.alpha;
    }

    public Drawable getCheckedIcon() {
        return this.checkedIcon;
    }

    public ColorStateList getCheckedIconTint() {
        return this.checkedIconTint;
    }

    public ColorStateList getChipBackgroundColor() {
        return this.chipBackgroundColor;
    }

    public float getChipCornerRadius() {
        boolean bl2 = this.isShapeThemingEnabled;
        float f5 = bl2 ? this.getTopLeftCornerResolvedSize() : this.chipCornerRadius;
        return f5;
    }

    public float getChipEndPadding() {
        return this.chipEndPadding;
    }

    public Drawable getChipIcon() {
        Object object = this.chipIcon;
        object = object != null ? ut0_0.g(object) : null;
        return object;
    }

    public float getChipIconSize() {
        return this.chipIconSize;
    }

    public ColorStateList getChipIconTint() {
        return this.chipIconTint;
    }

    public float getChipMinHeight() {
        return this.chipMinHeight;
    }

    public float getChipStartPadding() {
        return this.chipStartPadding;
    }

    public ColorStateList getChipStrokeColor() {
        return this.chipStrokeColor;
    }

    public float getChipStrokeWidth() {
        return this.chipStrokeWidth;
    }

    public void getChipTouchBounds(RectF rectF) {
        Rect rect = this.getBounds();
        this.calculateChipTouchBounds(rect, rectF);
    }

    public Drawable getCloseIcon() {
        Object object = this.closeIcon;
        object = object != null ? ut0_0.g(object) : null;
        return object;
    }

    public CharSequence getCloseIconContentDescription() {
        return this.closeIconContentDescription;
    }

    public float getCloseIconEndPadding() {
        return this.closeIconEndPadding;
    }

    public float getCloseIconSize() {
        return this.closeIconSize;
    }

    public float getCloseIconStartPadding() {
        return this.closeIconStartPadding;
    }

    public int[] getCloseIconState() {
        return this.closeIconStateSet;
    }

    public ColorStateList getCloseIconTint() {
        return this.closeIconTint;
    }

    public void getCloseIconTouchBounds(RectF rectF) {
        Rect rect = this.getBounds();
        this.calculateCloseIconTouchBounds(rect, rectF);
    }

    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.truncateAt;
    }

    public MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    public float getIconEndPadding() {
        return this.iconEndPadding;
    }

    public float getIconStartPadding() {
        return this.iconStartPadding;
    }

    public int getIntrinsicHeight() {
        return (int)this.chipMinHeight;
    }

    public int getIntrinsicWidth() {
        float f5 = this.chipStartPadding;
        float f6 = this.calculateChipIconWidth() + f5;
        f5 = this.textStartPadding;
        f6 += f5;
        TextDrawableHelper textDrawableHelper = this.textDrawableHelper;
        String string2 = this.getText().toString();
        f5 = textDrawableHelper.getTextWidth(string2) + f6;
        f6 = this.textEndPadding;
        f5 += f6;
        f6 = this.calculateCloseIconWidth() + f5;
        f5 = this.chipEndPadding;
        int n3 = Math.round(f6 + f5);
        int n4 = this.maxWidth;
        return Math.min(n3, n4);
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        boolean bl2 = this.isShapeThemingEnabled;
        if (bl2) {
            super.getOutline(outline);
            return;
        }
        Rect rect = this.getBounds();
        boolean bl3 = rect.isEmpty();
        if (!bl3) {
            float f5 = this.chipCornerRadius;
            outline.setRoundRect(rect, f5);
        } else {
            int n3 = this.getIntrinsicWidth();
            int n4 = this.getIntrinsicHeight();
            float f6 = this.chipCornerRadius;
            outline.setRoundRect(0, 0, n3, n4, f6);
        }
        float f7 = (float)this.getAlpha() / 255.0f;
        outline.setAlpha(f7);
    }

    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    public MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    public CharSequence getText() {
        return this.text;
    }

    public TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.textEndPadding;
    }

    public float getTextStartPadding() {
        return this.textStartPadding;
    }

    public boolean getUseCompatRipple() {
        return this.useCompatRipple;
    }

    public void invalidateDrawable(Drawable drawable2) {
        drawable2 = this.getCallback();
        if (drawable2 != null) {
            drawable2.invalidateDrawable((Drawable)this);
        }
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    public boolean isCheckedIconEnabled() {
        return this.isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.checkedIconVisible;
    }

    public boolean isChipIconEnabled() {
        return this.isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.chipIconVisible;
    }

    public boolean isCloseIconEnabled() {
        return this.isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return ChipDrawable.isStateful(this.closeIcon);
    }

    public boolean isCloseIconVisible() {
        return this.closeIconVisible;
    }

    public boolean isShapeThemingEnabled() {
        return this.isShapeThemingEnabled;
    }

    public boolean isStateful() {
        Object object = this.chipSurfaceColor;
        boolean bl2 = ChipDrawable.isStateful(object);
        if (!(bl2 || (bl2 = ChipDrawable.isStateful(object = this.chipBackgroundColor)) || (bl2 = ChipDrawable.isStateful(object = this.chipStrokeColor)) || (bl2 = this.useCompatRipple) && (bl2 = ChipDrawable.isStateful(object = this.compatRippleColor)) || (bl2 = ChipDrawable.isStateful((TextAppearance)(object = this.textDrawableHelper.getTextAppearance()))) || (bl2 = this.canShowCheckedIcon()) || (bl2 = ChipDrawable.isStateful((Drawable)(object = this.chipIcon))) || (bl2 = ChipDrawable.isStateful((Drawable)(object = this.checkedIcon))) || (bl2 = ChipDrawable.isStateful(object = this.tint)))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public boolean onLayoutDirectionChanged(int n3) {
        int n4;
        int n7;
        int n8;
        Drawable drawable2;
        boolean n42 = super.onLayoutDirectionChanged(n3);
        int n10 = (int)(this.showsChipIcon() ? 1 : 0);
        if (n10 != 0) {
            drawable2 = this.chipIcon;
            n10 = ut0_0.c(drawable2, n3);
            n8 = n42 | n10;
        }
        if ((n10 = this.showsCheckedIcon()) != 0) {
            drawable2 = this.checkedIcon;
            n10 = ut0_0.c(drawable2, n3);
            n7 = n8 | n10;
        }
        if ((n10 = this.showsCloseIcon()) != 0) {
            drawable2 = this.closeIcon;
            n3 = (int)(ut0_0.c(drawable2, n3) ? 1 : 0);
            n4 = n7 | n3;
        }
        if (n4 != 0) {
            this.invalidateSelf();
        }
        return true;
    }

    public boolean onLevelChange(int n3) {
        int n4;
        int n7;
        int n8;
        Drawable drawable2;
        boolean n42 = super.onLevelChange(n3);
        int n10 = (int)(this.showsChipIcon() ? 1 : 0);
        if (n10 != 0) {
            drawable2 = this.chipIcon;
            n10 = drawable2.setLevel(n3);
            n8 = n42 | n10;
        }
        if ((n10 = this.showsCheckedIcon()) != 0) {
            drawable2 = this.checkedIcon;
            n10 = drawable2.setLevel(n3);
            n7 = n8 | n10;
        }
        if ((n10 = this.showsCloseIcon()) != 0) {
            drawable2 = this.closeIcon;
            n3 = (int)(drawable2.setLevel(n3) ? 1 : 0);
            n4 = n7 | n3;
        }
        if (n4 != 0) {
            this.invalidateSelf();
        }
        return n4 != 0;
    }

    public void onSizeChange() {
        ChipDrawable$Delegate chipDrawable$Delegate = (ChipDrawable$Delegate)this.delegate.get();
        if (chipDrawable$Delegate != null) {
            chipDrawable$Delegate.onChipDrawableSizeChange();
        }
    }

    public boolean onStateChange(int[] nArray) {
        boolean bl2 = this.isShapeThemingEnabled;
        if (bl2) {
            super.onStateChange(nArray);
        }
        int[] nArray2 = this.getCloseIconState();
        return this.onStateChange(nArray, nArray2);
    }

    public void onTextSizeChange() {
        this.onSizeChange();
        this.invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable2, Runnable runnable2, long l2) {
        drawable2 = this.getCallback();
        if (drawable2 != null) {
            drawable2.scheduleDrawable((Drawable)this, runnable2, l2);
        }
    }

    public void setAlpha(int n3) {
        int n4 = this.alpha;
        if (n4 != n3) {
            this.alpha = n3;
            this.invalidateSelf();
        }
    }

    public void setCheckable(boolean bl2) {
        boolean bl3 = this.checkable;
        if (bl3 != bl2) {
            float f5;
            this.checkable = bl2;
            float f6 = this.calculateChipIconWidth();
            if (!bl2 && (bl2 = this.currentChecked)) {
                bl2 = false;
                f5 = 0.0f;
                this.currentChecked = false;
            }
            f5 = this.calculateChipIconWidth();
            this.invalidateSelf();
            bl2 = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
            if (bl2) {
                this.onSizeChange();
            }
        }
    }

    public void setCheckableResource(int n3) {
        n3 = (int)(this.context.getResources().getBoolean(n3) ? 1 : 0);
        this.setCheckable(n3 != 0);
    }

    public void setCheckedIcon(Drawable drawable2) {
        Drawable drawable3 = this.checkedIcon;
        if (drawable3 != drawable2) {
            float f5 = this.calculateChipIconWidth();
            this.checkedIcon = drawable2;
            float f6 = this.calculateChipIconWidth();
            Drawable drawable4 = this.checkedIcon;
            this.unapplyChildDrawable(drawable4);
            drawable4 = this.checkedIcon;
            this.applyChildDrawable(drawable4);
            this.invalidateSelf();
            float f7 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
            if (f7 != false) {
                this.onSizeChange();
            }
        }
    }

    public void setCheckedIconEnabled(boolean bl2) {
        this.setCheckedIconVisible(bl2);
    }

    public void setCheckedIconEnabledResource(int n3) {
        n3 = (int)(this.context.getResources().getBoolean(n3) ? 1 : 0);
        this.setCheckedIconVisible(n3 != 0);
    }

    public void setCheckedIconResource(int n3) {
        Drawable drawable2 = xn.a(this.context, n3);
        this.setCheckedIcon(drawable2);
    }

    public void setCheckedIconTint(ColorStateList object) {
        ColorStateList colorStateList = this.checkedIconTint;
        if (colorStateList != object) {
            this.checkedIconTint = object;
            boolean bl2 = this.canShowCheckedIcon();
            if (bl2) {
                colorStateList = this.checkedIcon;
                colorStateList.setTintList(object);
            }
            object = this.getState();
            this.onStateChange((int[])object);
        }
    }

    public void setCheckedIconTintResource(int n3) {
        ColorStateList colorStateList = t70.getColorStateList(this.context, n3);
        this.setCheckedIconTint(colorStateList);
    }

    public void setCheckedIconVisible(int n3) {
        n3 = (int)(this.context.getResources().getBoolean(n3) ? 1 : 0);
        this.setCheckedIconVisible(n3 != 0);
    }

    public void setCheckedIconVisible(boolean bl2) {
        boolean bl3 = this.checkedIconVisible;
        if (bl3 != bl2) {
            bl3 = this.showsCheckedIcon();
            this.checkedIconVisible = bl2;
            bl2 = this.showsCheckedIcon();
            if (bl3 != bl2) {
                if (bl2) {
                    Drawable drawable2 = this.checkedIcon;
                    this.applyChildDrawable(drawable2);
                } else {
                    Drawable drawable3 = this.checkedIcon;
                    this.unapplyChildDrawable(drawable3);
                }
                this.invalidateSelf();
                this.onSizeChange();
            }
        }
    }

    public void setChipBackgroundColor(ColorStateList object) {
        ColorStateList colorStateList = this.chipBackgroundColor;
        if (colorStateList != object) {
            this.chipBackgroundColor = object;
            object = this.getState();
            this.onStateChange((int[])object);
        }
    }

    public void setChipBackgroundColorResource(int n3) {
        ColorStateList colorStateList = t70.getColorStateList(this.context, n3);
        this.setChipBackgroundColor(colorStateList);
    }

    public void setChipCornerRadius(float f5) {
        float f6 = this.chipCornerRadius;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.chipCornerRadius = f5;
            ShapeAppearanceModel shapeAppearanceModel = this.getShapeAppearanceModel();
            ShapeAppearanceModel shapeAppearanceModel2 = shapeAppearanceModel.withCornerSize(f5);
            this.setShapeAppearanceModel(shapeAppearanceModel2);
        }
    }

    public void setChipCornerRadiusResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setChipCornerRadius(f5);
    }

    public void setChipEndPadding(float f5) {
        float f6 = this.chipEndPadding;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.chipEndPadding = f5;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setChipEndPaddingResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setChipEndPadding(f5);
    }

    public void setChipIcon(Drawable drawable2) {
        Drawable drawable3 = this.getChipIcon();
        if (drawable3 != drawable2) {
            float f5;
            boolean bl2;
            float f6 = this.calculateChipIconWidth();
            if (drawable2 != null) {
                drawable2 = ut0_0.h(drawable2).mutate();
            } else {
                bl2 = false;
                f5 = 0.0f;
                drawable2 = null;
            }
            this.chipIcon = drawable2;
            f5 = this.calculateChipIconWidth();
            this.unapplyChildDrawable(drawable3);
            boolean bl3 = this.showsChipIcon();
            if (bl3) {
                drawable3 = this.chipIcon;
                this.applyChildDrawable(drawable3);
            }
            this.invalidateSelf();
            bl2 = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
            if (bl2) {
                this.onSizeChange();
            }
        }
    }

    public void setChipIconEnabled(boolean bl2) {
        this.setChipIconVisible(bl2);
    }

    public void setChipIconEnabledResource(int n3) {
        this.setChipIconVisible(n3);
    }

    public void setChipIconResource(int n3) {
        Drawable drawable2 = xn.a(this.context, n3);
        this.setChipIcon(drawable2);
    }

    public void setChipIconSize(float f5) {
        float f6 = this.chipIconSize;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            f6 = this.calculateChipIconWidth();
            this.chipIconSize = f5;
            f5 = this.calculateChipIconWidth();
            this.invalidateSelf();
            float f8 = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
            if (f8 != false) {
                this.onSizeChange();
            }
        }
    }

    public void setChipIconSizeResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setChipIconSize(f5);
    }

    public void setChipIconTint(ColorStateList object) {
        boolean bl2;
        this.hasChipIconTint = bl2 = true;
        ColorStateList colorStateList = this.chipIconTint;
        if (colorStateList != object) {
            this.chipIconTint = object;
            bl2 = this.showsChipIcon();
            if (bl2) {
                colorStateList = this.chipIcon;
                colorStateList.setTintList(object);
            }
            object = this.getState();
            this.onStateChange((int[])object);
        }
    }

    public void setChipIconTintResource(int n3) {
        ColorStateList colorStateList = t70.getColorStateList(this.context, n3);
        this.setChipIconTint(colorStateList);
    }

    public void setChipIconVisible(int n3) {
        n3 = (int)(this.context.getResources().getBoolean(n3) ? 1 : 0);
        this.setChipIconVisible(n3 != 0);
    }

    public void setChipIconVisible(boolean bl2) {
        boolean bl3 = this.chipIconVisible;
        if (bl3 != bl2) {
            bl3 = this.showsChipIcon();
            this.chipIconVisible = bl2;
            bl2 = this.showsChipIcon();
            if (bl3 != bl2) {
                if (bl2) {
                    Drawable drawable2 = this.chipIcon;
                    this.applyChildDrawable(drawable2);
                } else {
                    Drawable drawable3 = this.chipIcon;
                    this.unapplyChildDrawable(drawable3);
                }
                this.invalidateSelf();
                this.onSizeChange();
            }
        }
    }

    public void setChipMinHeight(float f5) {
        float f6 = this.chipMinHeight;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.chipMinHeight = f5;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setChipMinHeightResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setChipMinHeight(f5);
    }

    public void setChipStartPadding(float f5) {
        float f6 = this.chipStartPadding;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.chipStartPadding = f5;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setChipStartPaddingResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setChipStartPadding(f5);
    }

    public void setChipStrokeColor(ColorStateList object) {
        ColorStateList colorStateList = this.chipStrokeColor;
        if (colorStateList != object) {
            this.chipStrokeColor = object;
            boolean bl2 = this.isShapeThemingEnabled;
            if (bl2) {
                this.setStrokeColor((ColorStateList)object);
            }
            object = this.getState();
            this.onStateChange((int[])object);
        }
    }

    public void setChipStrokeColorResource(int n3) {
        ColorStateList colorStateList = t70.getColorStateList(this.context, n3);
        this.setChipStrokeColor(colorStateList);
    }

    public void setChipStrokeWidth(float f5) {
        float f6 = this.chipStrokeWidth;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.chipStrokeWidth = f5;
            Paint paint = this.chipPaint;
            paint.setStrokeWidth(f5);
            object = this.isShapeThemingEnabled;
            if (object != false) {
                super.setStrokeWidth(f5);
            }
            this.invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setChipStrokeWidth(f5);
    }

    public void setCloseIcon(Drawable drawable2) {
        Drawable drawable3 = this.getCloseIcon();
        if (drawable3 != drawable2) {
            float f5;
            boolean bl2;
            float f6 = this.calculateCloseIconWidth();
            if (drawable2 != null) {
                drawable2 = ut0_0.h(drawable2).mutate();
            } else {
                bl2 = false;
                f5 = 0.0f;
                drawable2 = null;
            }
            this.closeIcon = drawable2;
            bl2 = RippleUtils.USE_FRAMEWORK_RIPPLE;
            if (bl2) {
                this.updateFrameworkCloseIconRipple();
            }
            f5 = this.calculateCloseIconWidth();
            this.unapplyChildDrawable(drawable3);
            boolean bl3 = this.showsCloseIcon();
            if (bl3) {
                drawable3 = this.closeIcon;
                this.applyChildDrawable(drawable3);
            }
            this.invalidateSelf();
            bl2 = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
            if (bl2) {
                this.onSizeChange();
            }
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        Object object = this.closeIconContentDescription;
        if (object != charSequence) {
            object = Hx.c();
            Qj3 qj3 = ((Hx)object).c;
            this.closeIconContentDescription = charSequence = ((Hx)object).d(charSequence, qj3);
            this.invalidateSelf();
        }
    }

    public void setCloseIconEnabled(boolean bl2) {
        this.setCloseIconVisible(bl2);
    }

    public void setCloseIconEnabledResource(int n3) {
        this.setCloseIconVisible(n3);
    }

    public void setCloseIconEndPadding(float f5) {
        float f6 = this.closeIconEndPadding;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.closeIconEndPadding = f5;
            this.invalidateSelf();
            boolean bl2 = this.showsCloseIcon();
            if (bl2) {
                this.onSizeChange();
            }
        }
    }

    public void setCloseIconEndPaddingResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setCloseIconEndPadding(f5);
    }

    public void setCloseIconResource(int n3) {
        Drawable drawable2 = xn.a(this.context, n3);
        this.setCloseIcon(drawable2);
    }

    public void setCloseIconSize(float f5) {
        float f6 = this.closeIconSize;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.closeIconSize = f5;
            this.invalidateSelf();
            boolean bl2 = this.showsCloseIcon();
            if (bl2) {
                this.onSizeChange();
            }
        }
    }

    public void setCloseIconSizeResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setCloseIconSize(f5);
    }

    public void setCloseIconStartPadding(float f5) {
        float f6 = this.closeIconStartPadding;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.closeIconStartPadding = f5;
            this.invalidateSelf();
            boolean bl2 = this.showsCloseIcon();
            if (bl2) {
                this.onSizeChange();
            }
        }
    }

    public void setCloseIconStartPaddingResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setCloseIconStartPadding(f5);
    }

    public boolean setCloseIconState(int[] nArray) {
        int[] nArray2 = this.closeIconStateSet;
        boolean bl2 = Arrays.equals(nArray2, nArray);
        if (!bl2) {
            this.closeIconStateSet = nArray;
            bl2 = this.showsCloseIcon();
            if (bl2) {
                nArray2 = this.getState();
                return this.onStateChange(nArray2, nArray);
            }
        }
        return false;
    }

    public void setCloseIconTint(ColorStateList object) {
        ColorStateList colorStateList = this.closeIconTint;
        if (colorStateList != object) {
            this.closeIconTint = object;
            boolean bl2 = this.showsCloseIcon();
            if (bl2) {
                colorStateList = this.closeIcon;
                colorStateList.setTintList(object);
            }
            object = this.getState();
            this.onStateChange((int[])object);
        }
    }

    public void setCloseIconTintResource(int n3) {
        ColorStateList colorStateList = t70.getColorStateList(this.context, n3);
        this.setCloseIconTint(colorStateList);
    }

    public void setCloseIconVisible(int n3) {
        n3 = (int)(this.context.getResources().getBoolean(n3) ? 1 : 0);
        this.setCloseIconVisible(n3 != 0);
    }

    public void setCloseIconVisible(boolean bl2) {
        boolean bl3 = this.closeIconVisible;
        if (bl3 != bl2) {
            bl3 = this.showsCloseIcon();
            this.closeIconVisible = bl2;
            bl2 = this.showsCloseIcon();
            if (bl3 != bl2) {
                if (bl2) {
                    Drawable drawable2 = this.closeIcon;
                    this.applyChildDrawable(drawable2);
                } else {
                    Drawable drawable3 = this.closeIcon;
                    this.unapplyChildDrawable(drawable3);
                }
                this.invalidateSelf();
                this.onSizeChange();
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = this.colorFilter;
        if (colorFilter2 != colorFilter) {
            this.colorFilter = colorFilter;
            this.invalidateSelf();
        }
    }

    public void setDelegate(ChipDrawable$Delegate chipDrawable$Delegate) {
        WeakReference<ChipDrawable$Delegate> weakReference;
        this.delegate = weakReference = new WeakReference<ChipDrawable$Delegate>(chipDrawable$Delegate);
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.truncateAt = truncateAt;
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    public void setHideMotionSpecResource(int n3) {
        MotionSpec motionSpec = MotionSpec.createFromResource(this.context, n3);
        this.setHideMotionSpec(motionSpec);
    }

    public void setIconEndPadding(float f5) {
        float f6 = this.iconEndPadding;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            f6 = this.calculateChipIconWidth();
            this.iconEndPadding = f5;
            f5 = this.calculateChipIconWidth();
            this.invalidateSelf();
            float f8 = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
            if (f8 != false) {
                this.onSizeChange();
            }
        }
    }

    public void setIconEndPaddingResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setIconEndPadding(f5);
    }

    public void setIconStartPadding(float f5) {
        float f6 = this.iconStartPadding;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            f6 = this.calculateChipIconWidth();
            this.iconStartPadding = f5;
            f5 = this.calculateChipIconWidth();
            this.invalidateSelf();
            float f8 = f6 == f5 ? 0 : (f6 > f5 ? 1 : -1);
            if (f8 != false) {
                this.onSizeChange();
            }
        }
    }

    public void setIconStartPaddingResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setIconStartPadding(f5);
    }

    public void setMaxWidth(int n3) {
        this.maxWidth = n3;
    }

    public void setRippleColor(ColorStateList object) {
        ColorStateList colorStateList = this.rippleColor;
        if (colorStateList != object) {
            this.rippleColor = object;
            this.updateCompatRippleColor();
            object = this.getState();
            this.onStateChange((int[])object);
        }
    }

    public void setRippleColorResource(int n3) {
        ColorStateList colorStateList = t70.getColorStateList(this.context, n3);
        this.setRippleColor(colorStateList);
    }

    public void setShouldDrawText(boolean bl2) {
        this.shouldDrawText = bl2;
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    public void setShowMotionSpecResource(int n3) {
        MotionSpec motionSpec = MotionSpec.createFromResource(this.context, n3);
        this.setShowMotionSpec(motionSpec);
    }

    public void setText(CharSequence object) {
        CharSequence charSequence;
        boolean bl2;
        if (object == null) {
            object = "";
        }
        if (!(bl2 = TextUtils.equals((CharSequence)(charSequence = this.text), (CharSequence)object))) {
            this.text = object;
            object = this.textDrawableHelper;
            bl2 = true;
            ((TextDrawableHelper)object).setTextWidthDirty(bl2);
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setTextAppearance(TextAppearance textAppearance) {
        TextDrawableHelper textDrawableHelper = this.textDrawableHelper;
        Context context = this.context;
        textDrawableHelper.setTextAppearance(textAppearance, context);
    }

    public void setTextAppearanceResource(int n3) {
        Context context = this.context;
        TextAppearance textAppearance = new TextAppearance(context, n3);
        this.setTextAppearance(textAppearance);
    }

    public void setTextColor(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setTextColor(colorStateList);
    }

    public void setTextColor(ColorStateList colorStateList) {
        TextAppearance textAppearance = this.getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextColor(colorStateList);
            this.invalidateSelf();
        }
    }

    public void setTextEndPadding(float f5) {
        float f6 = this.textEndPadding;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.textEndPadding = f5;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setTextEndPaddingResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setTextEndPadding(f5);
    }

    public void setTextResource(int n3) {
        String string2 = this.context.getResources().getString(n3);
        this.setText(string2);
    }

    public void setTextSize(float f5) {
        TextAppearance textAppearance = this.getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextSize(f5);
            textAppearance = this.textDrawableHelper.getTextPaint();
            textAppearance.setTextSize(f5);
            this.onTextSizeChange();
        }
    }

    public void setTextStartPadding(float f5) {
        float f6 = this.textStartPadding;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.textStartPadding = f5;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setTextStartPaddingResource(int n3) {
        float f5 = this.context.getResources().getDimension(n3);
        this.setTextStartPadding(f5);
    }

    public void setTintList(ColorStateList object) {
        ColorStateList colorStateList = this.tint;
        if (colorStateList != object) {
            this.tint = object;
            object = this.getState();
            this.onStateChange((int[])object);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        PorterDuff.Mode mode2 = this.tintMode;
        if (mode2 != mode) {
            this.tintMode = mode;
            mode2 = this.tint;
            mode = DrawableUtils.updateTintFilter(this, (ColorStateList)mode2, mode);
            this.tintFilter = mode;
            this.invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean bl2) {
        boolean bl3 = this.useCompatRipple;
        if (bl3 != bl2) {
            this.useCompatRipple = bl2;
            this.updateCompatRippleColor();
            int[] nArray = this.getState();
            this.onStateChange(nArray);
        }
    }

    public boolean setVisible(boolean bl2, boolean bl3) {
        Drawable drawable2;
        boolean bl4 = super.setVisible(bl2, bl3);
        boolean bl5 = this.showsChipIcon();
        if (bl5) {
            drawable2 = this.chipIcon;
            bl5 = drawable2.setVisible(bl2, bl3);
            bl4 |= bl5;
        }
        if (bl5 = this.showsCheckedIcon()) {
            drawable2 = this.checkedIcon;
            bl5 = drawable2.setVisible(bl2, bl3);
            bl4 |= bl5;
        }
        if (bl5 = this.showsCloseIcon()) {
            drawable2 = this.closeIcon;
            bl2 = drawable2.setVisible(bl2, bl3);
            bl4 |= bl2;
        }
        if (bl4) {
            this.invalidateSelf();
        }
        return bl4;
    }

    public boolean shouldDrawText() {
        return this.shouldDrawText;
    }

    public void unscheduleDrawable(Drawable drawable2, Runnable runnable2) {
        drawable2 = this.getCallback();
        if (drawable2 != null) {
            drawable2.unscheduleDrawable((Drawable)this, runnable2);
        }
    }
}

