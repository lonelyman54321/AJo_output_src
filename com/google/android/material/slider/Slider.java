/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 */
package com.google.android.material.slider;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import com.google.android.material.slider.BaseSlider;

public class Slider
extends BaseSlider {
    public Slider(Context context) {
        this(context, null);
    }

    public Slider(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.sliderStyle;
        this(context, attributeSet, n3);
    }

    public Slider(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int[] nArray = new int[]{16842788};
        context = context.obtainStyledAttributes(attributeSet, nArray);
        float f5 = 0.0f;
        attributeSet = null;
        n3 = (int)(context.hasValue(0) ? 1 : 0);
        if (n3 != 0) {
            n3 = 0;
            nArray = null;
            f5 = context.getFloat(0, 0.0f);
            this.setValue(f5);
        }
        context.recycle();
    }

    public float getValue() {
        return ((Float)this.getValues().get(0)).floatValue();
    }

    public boolean pickActiveThumb() {
        int n3 = this.getActiveThumbIndex();
        int n4 = -1;
        boolean bl2 = true;
        if (n3 != n4) {
            return bl2;
        }
        this.setActiveThumbIndex(0);
        return bl2;
    }

    public void setCustomThumbDrawable(int n3) {
        super.setCustomThumbDrawable(n3);
    }

    public void setCustomThumbDrawable(Drawable drawable2) {
        super.setCustomThumbDrawable(drawable2);
    }

    public void setValue(float f5) {
        Float f6 = Float.valueOf(f5);
        Float[] floatArray = new Float[]{f6};
        this.setValues(floatArray);
    }
}

