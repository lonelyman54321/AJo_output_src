/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package com.google.android.material.shape;

import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.shape.ShapeableDelegateV33$1;

class ShapeableDelegateV33
extends ShapeableDelegate {
    public ShapeableDelegateV33(View view) {
        this.initMaskOutlineProvider(view);
    }

    private void initMaskOutlineProvider(View view) {
        ShapeableDelegateV33$1 shapeableDelegateV33$1 = new ShapeableDelegateV33$1(this);
        view.setOutlineProvider((ViewOutlineProvider)shapeableDelegateV33$1);
    }

    public void invalidateClippingMethod(View view) {
        boolean bl2 = this.shouldUseCompatClipping() ^ true;
        view.setClipToOutline(bl2);
        bl2 = this.shouldUseCompatClipping();
        if (bl2) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    public boolean shouldUseCompatClipping() {
        return this.forceCompatClippingEnabled;
    }
}

