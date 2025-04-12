/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.ColorFilter
 *  android.graphics.Paint$Style
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
package com.google.android.material.shape;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

public class MaterialShapeDrawable$MaterialShapeDrawableState
extends Drawable.ConstantState {
    int alpha;
    ColorFilter colorFilter;
    float elevation;
    ElevationOverlayProvider elevationOverlayProvider;
    ColorStateList fillColor = null;
    float interpolation;
    Rect padding;
    Paint.Style paintStyle;
    float parentAbsoluteElevation;
    float scale;
    int shadowCompatMode;
    int shadowCompatOffset;
    int shadowCompatRadius;
    int shadowCompatRotation;
    ShapeAppearanceModel shapeAppearanceModel;
    ColorStateList strokeColor = null;
    ColorStateList strokeTintList = null;
    float strokeWidth;
    ColorStateList tintList = null;
    PorterDuff.Mode tintMode;
    float translationZ;
    boolean useTintColorForShadow;

    public MaterialShapeDrawable$MaterialShapeDrawableState(MaterialShapeDrawable$MaterialShapeDrawableState materialShapeDrawable$MaterialShapeDrawableState) {
        int n3;
        Object object;
        float f5;
        PorterDuff.Mode mode;
        this.tintMode = mode = PorterDuff.Mode.SRC_IN;
        this.padding = null;
        this.scale = f5 = 1.0f;
        this.interpolation = f5;
        this.alpha = 255;
        this.parentAbsoluteElevation = 0.0f;
        this.elevation = 0.0f;
        this.translationZ = 0.0f;
        this.shadowCompatMode = 0;
        this.shadowCompatRadius = 0;
        this.shadowCompatOffset = 0;
        this.shadowCompatRotation = 0;
        this.useTintColorForShadow = false;
        this.paintStyle = object = Paint.Style.FILL_AND_STROKE;
        object = materialShapeDrawable$MaterialShapeDrawableState.shapeAppearanceModel;
        this.shapeAppearanceModel = object;
        object = materialShapeDrawable$MaterialShapeDrawableState.elevationOverlayProvider;
        this.elevationOverlayProvider = object;
        this.strokeWidth = f5 = materialShapeDrawable$MaterialShapeDrawableState.strokeWidth;
        object = materialShapeDrawable$MaterialShapeDrawableState.colorFilter;
        this.colorFilter = object;
        object = materialShapeDrawable$MaterialShapeDrawableState.fillColor;
        this.fillColor = object;
        object = materialShapeDrawable$MaterialShapeDrawableState.strokeColor;
        this.strokeColor = object;
        object = materialShapeDrawable$MaterialShapeDrawableState.tintMode;
        this.tintMode = object;
        object = materialShapeDrawable$MaterialShapeDrawableState.tintList;
        this.tintList = object;
        this.alpha = n3 = materialShapeDrawable$MaterialShapeDrawableState.alpha;
        this.scale = f5 = materialShapeDrawable$MaterialShapeDrawableState.scale;
        this.shadowCompatOffset = n3 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatOffset;
        this.shadowCompatMode = n3 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatMode;
        n3 = (int)(materialShapeDrawable$MaterialShapeDrawableState.useTintColorForShadow ? 1 : 0);
        this.useTintColorForShadow = n3;
        this.interpolation = f5 = materialShapeDrawable$MaterialShapeDrawableState.interpolation;
        this.parentAbsoluteElevation = f5 = materialShapeDrawable$MaterialShapeDrawableState.parentAbsoluteElevation;
        this.elevation = f5 = materialShapeDrawable$MaterialShapeDrawableState.elevation;
        this.translationZ = f5 = materialShapeDrawable$MaterialShapeDrawableState.translationZ;
        this.shadowCompatRadius = n3 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatRadius;
        this.shadowCompatRotation = n3 = materialShapeDrawable$MaterialShapeDrawableState.shadowCompatRotation;
        object = materialShapeDrawable$MaterialShapeDrawableState.strokeTintList;
        this.strokeTintList = object;
        this.paintStyle = object = materialShapeDrawable$MaterialShapeDrawableState.paintStyle;
        object = materialShapeDrawable$MaterialShapeDrawableState.padding;
        if (object != null) {
            materialShapeDrawable$MaterialShapeDrawableState = materialShapeDrawable$MaterialShapeDrawableState.padding;
            super((Rect)materialShapeDrawable$MaterialShapeDrawableState);
            this.padding = object;
        }
    }

    public MaterialShapeDrawable$MaterialShapeDrawableState(ShapeAppearanceModel shapeAppearanceModel, ElevationOverlayProvider elevationOverlayProvider) {
        Paint.Style style2;
        float f5;
        PorterDuff.Mode mode;
        this.tintMode = mode = PorterDuff.Mode.SRC_IN;
        this.padding = null;
        this.scale = f5 = 1.0f;
        this.interpolation = f5;
        this.alpha = 255;
        this.parentAbsoluteElevation = 0.0f;
        this.elevation = 0.0f;
        this.translationZ = 0.0f;
        this.shadowCompatMode = 0;
        this.shadowCompatRadius = 0;
        this.shadowCompatOffset = 0;
        this.shadowCompatRotation = 0;
        this.useTintColorForShadow = false;
        this.paintStyle = style2 = Paint.Style.FILL_AND_STROKE;
        this.shapeAppearanceModel = shapeAppearanceModel;
        this.elevationOverlayProvider = elevationOverlayProvider;
    }

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
        MaterialShapeDrawable.access$302(materialShapeDrawable, true);
        return materialShapeDrawable;
    }
}

