/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.material.shape;

import android.view.View;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;

class ShapeableDelegateV14
extends ShapeableDelegate {
    public void invalidateClippingMethod(View view) {
        boolean bl2;
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        if (shapeAppearanceModel != null && !(bl2 = (shapeAppearanceModel = this.maskBounds).isEmpty()) && (bl2 = this.shouldUseCompatClipping())) {
            view.invalidate();
        }
    }

    public boolean shouldUseCompatClipping() {
        return true;
    }
}

