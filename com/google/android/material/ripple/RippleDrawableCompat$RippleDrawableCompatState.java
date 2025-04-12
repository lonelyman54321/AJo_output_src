/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable$ConstantState
 */
package com.google.android.material.ripple;

import android.graphics.drawable.Drawable;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.shape.MaterialShapeDrawable;

final class RippleDrawableCompat$RippleDrawableCompatState
extends Drawable.ConstantState {
    MaterialShapeDrawable delegate;
    boolean shouldDrawDelegate;

    public RippleDrawableCompat$RippleDrawableCompatState(RippleDrawableCompat$RippleDrawableCompatState rippleDrawableCompat$RippleDrawableCompatState) {
        boolean bl2;
        MaterialShapeDrawable materialShapeDrawable;
        this.delegate = materialShapeDrawable = (MaterialShapeDrawable)rippleDrawableCompat$RippleDrawableCompatState.delegate.getConstantState().newDrawable();
        this.shouldDrawDelegate = bl2 = rippleDrawableCompat$RippleDrawableCompatState.shouldDrawDelegate;
    }

    public RippleDrawableCompat$RippleDrawableCompatState(MaterialShapeDrawable materialShapeDrawable) {
        this.delegate = materialShapeDrawable;
        this.shouldDrawDelegate = false;
    }

    public int getChangingConfigurations() {
        return 0;
    }

    public RippleDrawableCompat newDrawable() {
        RippleDrawableCompat$RippleDrawableCompatState rippleDrawableCompat$RippleDrawableCompatState = new RippleDrawableCompat$RippleDrawableCompatState(this);
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(rippleDrawableCompat$RippleDrawableCompatState, null);
        return rippleDrawableCompat;
    }
}

