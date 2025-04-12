/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 */
package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialDivider
extends View {
    private static final int DEF_STYLE_RES = R$style.Widget_MaterialComponents_MaterialDivider;
    private int color;
    private final MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.materialDividerStyle;
        this(context, attributeSet, n3);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet, int n3) {
        MaterialShapeDrawable materialShapeDrawable;
        int n4 = DEF_STYLE_RES;
        context = MaterialThemeOverlay.wrap(context, attributeSet, n3, n4);
        super(context, attributeSet, n3);
        context = this.getContext();
        this.dividerDrawable = materialShapeDrawable = new MaterialShapeDrawable();
        int[] nArray = R$styleable.MaterialDivider;
        int[] nArray2 = new int[]{};
        materialShapeDrawable = context;
        attributeSet = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, nArray, n3, n4, nArray2);
        n3 = R$styleable.MaterialDivider_dividerThickness;
        materialShapeDrawable = this.getResources();
        int n7 = R$dimen.material_divider_thickness;
        int n8 = materialShapeDrawable.getDimensionPixelSize(n7);
        this.thickness = n3 = attributeSet.getDimensionPixelSize(n3, n8);
        n3 = R$styleable.MaterialDivider_dividerInsetStart;
        this.insetStart = n3 = attributeSet.getDimensionPixelOffset(n3, 0);
        n3 = R$styleable.MaterialDivider_dividerInsetEnd;
        this.insetEnd = n3 = attributeSet.getDimensionPixelOffset(n3, 0);
        n3 = R$styleable.MaterialDivider_dividerColor;
        int n10 = MaterialResources.getColorStateList(context, (TypedArray)attributeSet, n3).getDefaultColor();
        this.setDividerColor(n10);
        attributeSet.recycle();
    }

    public int getDividerColor() {
        return this.color;
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onDraw(Canvas canvas) {
        int n3;
        super.onDraw(canvas);
        int n4 = this.getLayoutDirection();
        int n7 = 1;
        if (n4 != n7) {
            n7 = 0;
        }
        n4 = n7 != 0 ? this.insetEnd : this.insetStart;
        if (n7 != 0) {
            n7 = this.getWidth();
            n3 = this.insetStart;
        } else {
            n7 = this.getWidth();
            n3 = this.insetEnd;
        }
        MaterialShapeDrawable materialShapeDrawable = this.dividerDrawable;
        int n8 = this.getBottom();
        int n10 = this.getTop();
        materialShapeDrawable.setBounds(n4, 0, n7 -= n3, n8 -= n10);
        this.dividerDrawable.draw(canvas);
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        n3 = View.MeasureSpec.getMode((int)n4);
        n4 = this.getMeasuredHeight();
        int n7 = -1 << -1;
        if (n3 == n7 || n3 == 0) {
            n3 = this.thickness;
            if (n3 > 0 && n4 != n3) {
                n4 = n3;
            }
            n3 = this.getMeasuredWidth();
            this.setMeasuredDimension(n3, n4);
        }
    }

    public void setDividerColor(int n3) {
        int n4 = this.color;
        if (n4 != n3) {
            this.color = n3;
            MaterialShapeDrawable materialShapeDrawable = this.dividerDrawable;
            ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
            materialShapeDrawable.setFillColor(colorStateList);
            this.invalidate();
        }
    }

    public void setDividerColorResource(int n3) {
        n3 = t70.getColor(this.getContext(), n3);
        this.setDividerColor(n3);
    }

    public void setDividerInsetEnd(int n3) {
        this.insetEnd = n3;
    }

    public void setDividerInsetEndResource(int n3) {
        n3 = this.getContext().getResources().getDimensionPixelOffset(n3);
        this.setDividerInsetEnd(n3);
    }

    public void setDividerInsetStart(int n3) {
        this.insetStart = n3;
    }

    public void setDividerInsetStartResource(int n3) {
        n3 = this.getContext().getResources().getDimensionPixelOffset(n3);
        this.setDividerInsetStart(n3);
    }

    public void setDividerThickness(int n3) {
        int n4 = this.thickness;
        if (n4 != n3) {
            this.thickness = n3;
            this.requestLayout();
        }
    }

    public void setDividerThicknessResource(int n3) {
        n3 = this.getContext().getResources().getDimensionPixelSize(n3);
        this.setDividerThickness(n3);
    }
}

