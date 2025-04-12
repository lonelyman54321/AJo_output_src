/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.graphics.Path
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package com.google.android.material.shape;

import android.graphics.Outline;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.shape.ShapeableDelegateV33;

class ShapeableDelegateV33$1
extends ViewOutlineProvider {
    final /* synthetic */ ShapeableDelegateV33 this$0;

    public ShapeableDelegateV33$1(ShapeableDelegateV33 shapeableDelegateV33) {
        this.this$0 = shapeableDelegateV33;
    }

    public void getOutline(View view, Outline outline) {
        view = this.this$0.shapePath;
        boolean bl2 = view.isEmpty();
        if (!bl2) {
            view = this.this$0.shapePath;
            fg2_0.a(outline, (Path)view);
        }
    }
}

