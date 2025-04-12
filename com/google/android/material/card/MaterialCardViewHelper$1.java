/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 */
package com.google.android.material.card;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.card.MaterialCardViewHelper;

class MaterialCardViewHelper$1
extends InsetDrawable {
    final /* synthetic */ MaterialCardViewHelper this$0;

    public MaterialCardViewHelper$1(MaterialCardViewHelper materialCardViewHelper, Drawable drawable2, int n3, int n4, int n7, int n8) {
        this.this$0 = materialCardViewHelper;
        super(drawable2, n3, n4, n7, n8);
    }

    public int getMinimumHeight() {
        return -1;
    }

    public int getMinimumWidth() {
        return -1;
    }

    public boolean getPadding(Rect rect) {
        return false;
    }
}

