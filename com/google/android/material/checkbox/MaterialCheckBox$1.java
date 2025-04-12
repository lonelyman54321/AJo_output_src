/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 */
package com.google.android.material.checkbox;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.MaterialCheckBox;

class MaterialCheckBox$1
extends Mj {
    final /* synthetic */ MaterialCheckBox this$0;

    public MaterialCheckBox$1(MaterialCheckBox materialCheckBox) {
        this.this$0 = materialCheckBox;
    }

    public void onAnimationEnd(Drawable drawable2) {
        super.onAnimationEnd(drawable2);
        ColorStateList colorStateList = this.this$0.buttonTintList;
        if (colorStateList != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    public void onAnimationStart(Drawable drawable2) {
        super.onAnimationStart(drawable2);
        Object object = this.this$0;
        ColorStateList colorStateList = ((MaterialCheckBox)object).buttonTintList;
        if (colorStateList != null) {
            object = MaterialCheckBox.access$000((MaterialCheckBox)object);
            ColorStateList colorStateList2 = this.this$0.buttonTintList;
            int n3 = colorStateList2.getDefaultColor();
            int n4 = colorStateList.getColorForState((int[])object, n3);
            drawable2.setTint(n4);
        }
    }
}

