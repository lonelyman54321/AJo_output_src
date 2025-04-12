/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.widget.TextView
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$styleable;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

final class CalendarItemStyle {
    private final ColorStateList backgroundColor;
    private final Rect insets;
    private final ShapeAppearanceModel itemShape;
    private final ColorStateList strokeColor;
    private final int strokeWidth;
    private final ColorStateList textColor;

    private CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int n3, ShapeAppearanceModel shapeAppearanceModel, Rect rect) {
        B41.b(rect.left);
        B41.b(rect.top);
        B41.b(rect.right);
        B41.b(rect.bottom);
        this.insets = rect;
        this.textColor = colorStateList2;
        this.backgroundColor = colorStateList;
        this.strokeColor = colorStateList3;
        this.strokeWidth = n3;
        this.itemShape = shapeAppearanceModel;
    }

    public static CalendarItemStyle create(Context object, int n3) {
        int[] nArray;
        int n4;
        int n7 = 0;
        if (n3 != 0) {
            n4 = 1;
        } else {
            n4 = 0;
            nArray = null;
        }
        B41.a(n4 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        nArray = R$styleable.MaterialCalendarItem;
        TypedArray typedArray = object.obtainStyledAttributes(n3, nArray);
        n4 = R$styleable.MaterialCalendarItem_android_insetLeft;
        n4 = typedArray.getDimensionPixelOffset(n4, 0);
        int n8 = R$styleable.MaterialCalendarItem_android_insetTop;
        n8 = typedArray.getDimensionPixelOffset(n8, 0);
        int n10 = R$styleable.MaterialCalendarItem_android_insetRight;
        n10 = typedArray.getDimensionPixelOffset(n10, 0);
        int n14 = R$styleable.MaterialCalendarItem_android_insetBottom;
        n14 = typedArray.getDimensionPixelOffset(n14, 0);
        Rect rect = new Rect(n4, n8, n10, n14);
        n4 = R$styleable.MaterialCalendarItem_itemFillColor;
        ColorStateList colorStateList = MaterialResources.getColorStateList(object, typedArray, n4);
        n4 = R$styleable.MaterialCalendarItem_itemTextColor;
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(object, typedArray, n4);
        n4 = R$styleable.MaterialCalendarItem_itemStrokeColor;
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(object, typedArray, n4);
        n4 = R$styleable.MaterialCalendarItem_itemStrokeWidth;
        int n15 = typedArray.getDimensionPixelSize(n4, 0);
        n4 = R$styleable.MaterialCalendarItem_itemShapeAppearance;
        n4 = typedArray.getResourceId(n4, 0);
        n8 = R$styleable.MaterialCalendarItem_itemShapeAppearanceOverlay;
        n7 = typedArray.getResourceId(n8, 0);
        ShapeAppearanceModel shapeAppearanceModel = ShapeAppearanceModel.builder(object, n4, n7).build();
        typedArray.recycle();
        object = new CalendarItemStyle(colorStateList, colorStateList2, colorStateList3, n15, shapeAppearanceModel, rect);
        return object;
    }

    public int getBottomInset() {
        return this.insets.bottom;
    }

    public int getLeftInset() {
        return this.insets.left;
    }

    public int getRightInset() {
        return this.insets.right;
    }

    public int getTopInset() {
        return this.insets.top;
    }

    public void styleItem(TextView textView) {
        this.styleItem(textView, null, null);
    }

    public void styleItem(TextView textView, ColorStateList colorStateList, ColorStateList object) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        ShapeAppearanceModel shapeAppearanceModel = this.itemShape;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        shapeAppearanceModel = this.itemShape;
        materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        if (colorStateList == null) {
            colorStateList = this.backgroundColor;
        }
        materialShapeDrawable.setFillColor(colorStateList);
        int n3 = this.strokeWidth;
        float f5 = n3;
        shapeAppearanceModel = this.strokeColor;
        materialShapeDrawable.setStroke(f5, (ColorStateList)shapeAppearanceModel);
        if (object == null) {
            object = this.textColor;
        }
        textView.setTextColor(object);
        colorStateList = this.textColor.withAlpha(30);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, (Drawable)materialShapeDrawable, (Drawable)materialShapeDrawable2);
        object = this.insets;
        int n4 = object.left;
        int n7 = object.top;
        int n8 = object.right;
        int n10 = object.bottom;
        shapeAppearanceModel = colorStateList;
        colorStateList = new InsetDrawable((Drawable)rippleDrawable, n4, n7, n8, n10);
        object = ViewCompat.a;
        textView.setBackground((Drawable)colorStateList);
    }
}

