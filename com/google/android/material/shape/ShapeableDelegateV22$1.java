/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.graphics.RectF
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package com.google.android.material.shape;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegateV22;

class ShapeableDelegateV22$1
extends ViewOutlineProvider {
    final /* synthetic */ ShapeableDelegateV22 this$0;

    public ShapeableDelegateV22$1(ShapeableDelegateV22 shapeableDelegateV22) {
        this.this$0 = shapeableDelegateV22;
    }

    public void getOutline(View object, Outline outline) {
        boolean bl2;
        object = this.this$0;
        ShapeAppearanceModel shapeAppearanceModel = object.shapeAppearanceModel;
        if (shapeAppearanceModel != null && !(bl2 = (object = object.maskBounds).isEmpty())) {
            object = this.this$0;
            shapeAppearanceModel = object.maskBounds;
            int n3 = (int)((RectF)shapeAppearanceModel).left;
            int n4 = (int)((RectF)shapeAppearanceModel).top;
            float f5 = ((RectF)shapeAppearanceModel).right;
            int n7 = (int)f5;
            float f6 = ((RectF)shapeAppearanceModel).bottom;
            int n8 = (int)f6;
            float f7 = ShapeableDelegateV22.access$000((ShapeableDelegateV22)object);
            outline.setRoundRect(n3, n4, n7, n8, f7);
        }
    }
}

