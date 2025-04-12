/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.ripple.RippleDrawableCompat$1;
import com.google.android.material.ripple.RippleDrawableCompat$RippleDrawableCompatState;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

public class RippleDrawableCompat
extends Drawable
implements Shapeable,
Pn3 {
    private RippleDrawableCompat$RippleDrawableCompatState drawableState;

    private RippleDrawableCompat(RippleDrawableCompat$RippleDrawableCompatState rippleDrawableCompat$RippleDrawableCompatState) {
        this.drawableState = rippleDrawableCompat$RippleDrawableCompatState;
    }

    public /* synthetic */ RippleDrawableCompat(RippleDrawableCompat$RippleDrawableCompatState rippleDrawableCompat$RippleDrawableCompatState, RippleDrawableCompat$1 rippleDrawableCompat$1) {
        this(rippleDrawableCompat$RippleDrawableCompatState);
    }

    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        RippleDrawableCompat$RippleDrawableCompatState rippleDrawableCompat$RippleDrawableCompatState = new RippleDrawableCompat$RippleDrawableCompatState(materialShapeDrawable);
        this(rippleDrawableCompat$RippleDrawableCompatState);
    }

    public void draw(Canvas canvas) {
        Object object = this.drawableState;
        boolean bl2 = ((RippleDrawableCompat$RippleDrawableCompatState)((Object)object)).shouldDrawDelegate;
        if (bl2) {
            object = ((RippleDrawableCompat$RippleDrawableCompatState)((Object)object)).delegate;
            ((MaterialShapeDrawable)object).draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    public int getOpacity() {
        return this.drawableState.delegate.getOpacity();
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.drawableState.delegate.getShapeAppearanceModel();
    }

    public boolean isStateful() {
        return true;
    }

    public RippleDrawableCompat mutate() {
        RippleDrawableCompat$RippleDrawableCompatState rippleDrawableCompat$RippleDrawableCompatState;
        RippleDrawableCompat$RippleDrawableCompatState rippleDrawableCompat$RippleDrawableCompatState2 = this.drawableState;
        this.drawableState = rippleDrawableCompat$RippleDrawableCompatState = new RippleDrawableCompat$RippleDrawableCompatState(rippleDrawableCompat$RippleDrawableCompatState2);
        return this;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.drawableState.delegate.setBounds(rect);
    }

    public boolean onStateChange(int[] nArray) {
        boolean bl2 = super.onStateChange(nArray);
        Object object = this.drawableState.delegate;
        boolean bl3 = object.setState(nArray);
        boolean bl4 = true;
        if (bl3) {
            bl2 = true;
        }
        boolean bl5 = RippleUtils.shouldDrawRippleCompat(nArray);
        object = this.drawableState;
        boolean bl6 = ((RippleDrawableCompat$RippleDrawableCompatState)((Object)object)).shouldDrawDelegate;
        if (bl6 != bl5) {
            ((RippleDrawableCompat$RippleDrawableCompatState)((Object)object)).shouldDrawDelegate = bl5;
        } else {
            bl4 = bl2;
        }
        return bl4;
    }

    public void setAlpha(int n3) {
        this.drawableState.delegate.setAlpha(n3);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.drawableState.delegate.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.drawableState.delegate.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setTint(int n3) {
        this.drawableState.delegate.setTint(n3);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.drawableState.delegate.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.drawableState.delegate.setTintMode(mode);
    }
}

