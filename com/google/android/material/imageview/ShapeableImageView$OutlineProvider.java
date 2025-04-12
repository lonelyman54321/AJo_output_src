/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewOutlineProvider
 */
package com.google.android.material.imageview;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

class ShapeableImageView$OutlineProvider
extends ViewOutlineProvider {
    private final Rect rect;
    final /* synthetic */ ShapeableImageView this$0;

    public ShapeableImageView$OutlineProvider(ShapeableImageView shapeableImageView) {
        this.this$0 = shapeableImageView;
        this.rect = shapeableImageView;
    }

    public void getOutline(View object, Outline outline) {
        MaterialShapeDrawable materialShapeDrawable;
        object = ShapeableImageView.access$000(this.this$0);
        if (object == null) {
            return;
        }
        object = ShapeableImageView.access$100(this.this$0);
        if (object == null) {
            object = this.this$0;
            ShapeAppearanceModel shapeAppearanceModel = ShapeableImageView.access$000(this.this$0);
            materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
            ShapeableImageView.access$102((ShapeableImageView)object, materialShapeDrawable);
        }
        object = ShapeableImageView.access$200(this.this$0);
        materialShapeDrawable = this.rect;
        object.round((Rect)materialShapeDrawable);
        object = ShapeableImageView.access$100(this.this$0);
        materialShapeDrawable = this.rect;
        object.setBounds((Rect)materialShapeDrawable);
        ShapeableImageView.access$100(this.this$0).getOutline(outline);
    }
}

