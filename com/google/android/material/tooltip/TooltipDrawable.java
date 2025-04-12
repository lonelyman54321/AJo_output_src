/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Align
 *  android.graphics.Paint$FontMetrics
 *  android.graphics.Rect
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 */
package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel$Builder;
import com.google.android.material.tooltip.TooltipDrawable$1;

public class TooltipDrawable
extends MaterialShapeDrawable
implements TextDrawableHelper$TextDrawableDelegate {
    private static final int DEFAULT_STYLE = R$style.Widget_MaterialComponents_Tooltip;
    private static final int DEFAULT_THEME_ATTR = R$attr.tooltipStyle;
    private int arrowSize;
    private final View.OnLayoutChangeListener attachedViewLayoutChangeListener;
    private final Context context;
    private final Rect displayFrame;
    private final Paint.FontMetrics fontMetrics;
    private float labelOpacity;
    private int layoutMargin;
    private int locationOnScreenX;
    private int minHeight;
    private int minWidth;
    private int padding;
    private boolean showMarker;
    private CharSequence text;
    private final TextDrawableHelper textDrawableHelper;
    private final float tooltipPivotX;
    private float tooltipPivotY;
    private float tooltipScaleX;
    private float tooltipScaleY;

    private TooltipDrawable(Context context, AttributeSet object, int n3, int n4) {
        super(context, (AttributeSet)object, n3, n4);
        float f5;
        float f6;
        float f7;
        super();
        this.fontMetrics = object;
        super(this);
        this.textDrawableHelper = object;
        TooltipDrawable$1 tooltipDrawable$1 = new TooltipDrawable$1(this);
        this.attachedViewLayoutChangeListener = tooltipDrawable$1;
        super();
        this.displayFrame = tooltipDrawable$1;
        this.tooltipScaleX = f7 = 1.0f;
        this.tooltipScaleY = f7;
        this.tooltipPivotX = f6 = 0.5f;
        this.tooltipPivotY = f6;
        this.labelOpacity = f7;
        this.context = context;
        tooltipDrawable$1 = ((TextDrawableHelper)object).getTextPaint();
        ((TextPaint)tooltipDrawable$1).density = f5 = context.getResources().getDisplayMetrics().density;
        context = ((TextDrawableHelper)object).getTextPaint();
        object = Paint.Align.CENTER;
        context.setTextAlign((Paint.Align)object);
    }

    public static /* synthetic */ void access$000(TooltipDrawable tooltipDrawable, View view) {
        tooltipDrawable.updateLocationOnScreen(view);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float calculatePointerOffset() {
        Rect rect = this.displayFrame;
        int n3 = rect.right;
        Rect rect2 = this.getBounds();
        int n4 = rect2.right;
        n3 -= n4;
        n4 = this.locationOnScreenX;
        n3 -= n4;
        n4 = this.layoutMargin;
        if ((n3 -= n4) < 0) {
            rect = this.displayFrame;
            n3 = rect.right;
            rect2 = this.getBounds();
            n4 = rect2.right;
            n3 -= n4;
            n4 = this.locationOnScreenX;
            n3 -= n4;
            n4 = this.layoutMargin;
            n3 -= n4;
            return n3;
        }
        rect = this.displayFrame;
        n3 = rect.left;
        rect2 = this.getBounds();
        n4 = rect2.left;
        n3 -= n4;
        n4 = this.locationOnScreenX;
        n3 -= n4;
        n4 = this.layoutMargin;
        if ((n3 += n4) <= 0) return 0.0f;
        rect = this.displayFrame;
        n3 = rect.left;
        rect2 = this.getBounds();
        n4 = rect2.left;
        n3 -= n4;
        n4 = this.locationOnScreenX;
        n3 -= n4;
        n4 = this.layoutMargin;
        n3 += n4;
        return n3;
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

    private float calculateTextOriginAndAlignment(Rect rect) {
        float f5 = rect.centerY();
        float f6 = this.calculateTextCenterFromBaseline();
        return f5 - f6;
    }

    public static TooltipDrawable create(Context context) {
        int n3 = DEFAULT_THEME_ATTR;
        int n4 = DEFAULT_STYLE;
        return TooltipDrawable.createFromAttributes(context, null, n3, n4);
    }

    public static TooltipDrawable createFromAttributes(Context context, AttributeSet attributeSet) {
        int n3 = DEFAULT_THEME_ATTR;
        int n4 = DEFAULT_STYLE;
        return TooltipDrawable.createFromAttributes(context, attributeSet, n3, n4);
    }

    public static TooltipDrawable createFromAttributes(Context context, AttributeSet attributeSet, int n3, int n4) {
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context, attributeSet, n3, n4);
        tooltipDrawable.loadFromAttributes(attributeSet, n3, n4);
        return tooltipDrawable;
    }

    private EdgeTreatment createMarkerEdge() {
        float f5 = -this.calculatePointerOffset();
        double d2 = this.getBounds().width();
        double d5 = this.arrowSize;
        double d7 = Math.sqrt(2.0) * d5;
        float f6 = (float)(d2 - d7) / 2.0f;
        float f7 = -f6;
        f5 = Math.min(Math.max(f5, f7), f6);
        float f8 = this.arrowSize;
        MarkerEdgeTreatment markerEdgeTreatment = new MarkerEdgeTreatment(f8);
        OffsetEdgeTreatment offsetEdgeTreatment = new OffsetEdgeTreatment(markerEdgeTreatment, f5);
        return offsetEdgeTreatment;
    }

    private void drawText(Canvas canvas) {
        CharSequence charSequence = this.text;
        if (charSequence == null) {
            return;
        }
        charSequence = this.getBounds();
        float f5 = this.calculateTextOriginAndAlignment((Rect)charSequence);
        int n3 = (int)f5;
        Object object = this.textDrawableHelper.getTextAppearance();
        if (object != null) {
            object = this.textDrawableHelper.getTextPaint();
            Object object2 = this.getState();
            ((TextPaint)object).drawableState = object2;
            object = this.textDrawableHelper;
            object2 = this.context;
            ((TextDrawableHelper)object).updateTextPaintDrawState((Context)object2);
            object = this.textDrawableHelper.getTextPaint();
            float f6 = this.labelOpacity;
            float f7 = 255.0f;
            int n4 = (int)(f6 *= f7);
            object.setAlpha(n4);
        }
        CharSequence charSequence2 = this.text;
        int n7 = charSequence2.length();
        float f8 = charSequence.centerX();
        float f11 = n3;
        TextPaint textPaint = this.textDrawableHelper.getTextPaint();
        canvas.drawText(charSequence2, 0, n7, f8, f11, (Paint)textPaint);
    }

    private float getTextWidth() {
        CharSequence charSequence = this.text;
        if (charSequence == null) {
            return 0.0f;
        }
        TextDrawableHelper textDrawableHelper = this.textDrawableHelper;
        charSequence = charSequence.toString();
        return textDrawableHelper.getTextWidth((String)charSequence);
    }

    private void loadFromAttributes(AttributeSet attributeSet, int n3, int n4) {
        EdgeTreatment edgeTreatment;
        Object object = this.context;
        Object object2 = R$styleable.Tooltip;
        int[] nArray = new int[]{};
        Object object3 = attributeSet;
        attributeSet = ThemeEnforcement.obtainStyledAttributes((Context)object, attributeSet, object2, n3, n4, nArray);
        Object object4 = this.context.getResources();
        n4 = R$dimen.mtrl_tooltip_arrowSize;
        this.arrowSize = n3 = object4.getDimensionPixelSize(n4);
        n3 = R$styleable.Tooltip_showMarker;
        n4 = 1;
        n3 = (int)(attributeSet.getBoolean(n3, n4 != 0) ? 1 : 0);
        this.showMarker = n3;
        if (n3 != 0) {
            object4 = this.getShapeAppearanceModel().toBuilder();
            edgeTreatment = this.createMarkerEdge();
            object4 = ((ShapeAppearanceModel$Builder)object4).setBottomEdge(edgeTreatment).build();
            this.setShapeAppearanceModel((ShapeAppearanceModel)object4);
        } else {
            this.arrowSize = 0;
        }
        n3 = R$styleable.Tooltip_android_text;
        object4 = attributeSet.getText(n3);
        this.setText((CharSequence)object4);
        object4 = this.context;
        n4 = R$styleable.Tooltip_android_textAppearance;
        object4 = MaterialResources.getTextAppearance((Context)object4, (TypedArray)attributeSet, n4);
        if (object4 != null) {
            n4 = R$styleable.Tooltip_android_textColor;
            if ((n4 = (int)(attributeSet.hasValue(n4) ? 1 : 0)) != 0) {
                edgeTreatment = this.context;
                int n7 = R$styleable.Tooltip_android_textColor;
                edgeTreatment = MaterialResources.getColorStateList((Context)edgeTreatment, (TypedArray)attributeSet, n7);
                ((TextAppearance)object4).setTextColor((ColorStateList)edgeTreatment);
            }
        }
        this.setTextAppearance((TextAppearance)object4);
        object4 = this.context;
        n4 = R$attr.colorOnBackground;
        object = TooltipDrawable.class;
        object3 = ((Class)object).getCanonicalName();
        n3 = MaterialColors.getColor((Context)object4, n4, (String)object3);
        edgeTreatment = this.context;
        object2 = ((Class)object).getCanonicalName();
        n4 = hZ.i(MaterialColors.getColor((Context)edgeTreatment, 0x1010031, (String)object2), 229);
        n3 = hZ.i(n3, 153);
        n3 = MaterialColors.layer(n4, n3);
        n4 = R$styleable.Tooltip_backgroundTint;
        object4 = ColorStateList.valueOf((int)attributeSet.getColor(n4, n3));
        this.setFillColor((ColorStateList)object4);
        object4 = this.context;
        n4 = R$attr.colorSurface;
        object = ((Class)object).getCanonicalName();
        object4 = ColorStateList.valueOf((int)MaterialColors.getColor((Context)object4, n4, (String)object));
        this.setStrokeColor((ColorStateList)object4);
        n3 = R$styleable.Tooltip_android_padding;
        this.padding = n3 = attributeSet.getDimensionPixelSize(n3, 0);
        n3 = R$styleable.Tooltip_android_minWidth;
        this.minWidth = n3 = attributeSet.getDimensionPixelSize(n3, 0);
        n3 = R$styleable.Tooltip_android_minHeight;
        this.minHeight = n3 = attributeSet.getDimensionPixelSize(n3, 0);
        n3 = R$styleable.Tooltip_android_layout_margin;
        this.layoutMargin = n3 = attributeSet.getDimensionPixelSize(n3, 0);
        attributeSet.recycle();
    }

    private void updateLocationOnScreen(View view) {
        int n3;
        Object object = new int[2];
        view.getLocationOnScreen(object);
        this.locationOnScreenX = n3 = object[0];
        object = this.displayFrame;
        view.getWindowVisibleDisplayFrame((Rect)object);
    }

    public void detachView(View view) {
        if (view == null) {
            return;
        }
        View.OnLayoutChangeListener onLayoutChangeListener = this.attachedViewLayoutChangeListener;
        view.removeOnLayoutChangeListener(onLayoutChangeListener);
    }

    public void draw(Canvas canvas) {
        canvas.save();
        float f5 = this.calculatePointerOffset();
        double d2 = this.arrowSize;
        double d5 = Math.sqrt(2.0) * d2;
        d2 = this.arrowSize;
        float f6 = (float)(-(d5 - d2));
        float f7 = this.tooltipScaleX;
        float f8 = this.tooltipScaleY;
        float f11 = this.getBounds().left;
        float f12 = (float)this.getBounds().width() * 0.5f + f11;
        f11 = this.getBounds().top;
        float f14 = this.getBounds().height();
        float f15 = this.tooltipPivotY;
        f14 = f14 * f15 + f11;
        canvas.scale(f7, f8, f12, f14);
        canvas.translate(f5, f6);
        super.draw(canvas);
        this.drawText(canvas);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        float f5 = this.textDrawableHelper.getTextPaint().getTextSize();
        float f6 = this.minHeight;
        return (int)Math.max(f5, f6);
    }

    public int getIntrinsicWidth() {
        float f5 = this.padding * 2;
        float f6 = this.getTextWidth();
        f5 += f6;
        f6 = this.minWidth;
        return (int)Math.max(f5, f6);
    }

    public int getLayoutMargin() {
        return this.layoutMargin;
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    public CharSequence getText() {
        return this.text;
    }

    public TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public int getTextPadding() {
        return this.padding;
    }

    public void onBoundsChange(Rect object) {
        super.onBoundsChange((Rect)object);
        boolean bl2 = this.showMarker;
        if (bl2) {
            object = this.getShapeAppearanceModel().toBuilder();
            EdgeTreatment edgeTreatment = this.createMarkerEdge();
            object = ((ShapeAppearanceModel$Builder)object).setBottomEdge(edgeTreatment).build();
            this.setShapeAppearanceModel((ShapeAppearanceModel)object);
        }
    }

    public boolean onStateChange(int[] nArray) {
        return super.onStateChange(nArray);
    }

    public void onTextSizeChange() {
        this.invalidateSelf();
    }

    public void setLayoutMargin(int n3) {
        this.layoutMargin = n3;
        this.invalidateSelf();
    }

    public void setMinHeight(int n3) {
        this.minHeight = n3;
        this.invalidateSelf();
    }

    public void setMinWidth(int n3) {
        this.minWidth = n3;
        this.invalidateSelf();
    }

    public void setRelativeToView(View view) {
        if (view == null) {
            return;
        }
        this.updateLocationOnScreen(view);
        View.OnLayoutChangeListener onLayoutChangeListener = this.attachedViewLayoutChangeListener;
        view.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    public void setRevealFraction(float f5) {
        this.tooltipPivotY = 1.2f;
        this.tooltipScaleX = f5;
        this.tooltipScaleY = f5;
        float f6 = 1.0f;
        this.labelOpacity = f5 = AnimationUtils.lerp(0.0f, f6, 0.19f, f6, f5);
        this.invalidateSelf();
    }

    public void setText(CharSequence object) {
        CharSequence charSequence = this.text;
        boolean bl2 = TextUtils.equals((CharSequence)charSequence, (CharSequence)object);
        if (!bl2) {
            this.text = object;
            object = this.textDrawableHelper;
            bl2 = true;
            ((TextDrawableHelper)object).setTextWidthDirty(bl2);
            this.invalidateSelf();
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

    public void setTextPadding(int n3) {
        this.padding = n3;
        this.invalidateSelf();
    }

    public void setTextResource(int n3) {
        String string2 = this.context.getResources().getString(n3);
        this.setText(string2);
    }
}

