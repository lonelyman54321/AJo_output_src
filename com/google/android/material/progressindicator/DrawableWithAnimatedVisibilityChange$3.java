/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Property
 */
package com.google.android.material.progressindicator;

import android.util.Property;
import com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange;

class DrawableWithAnimatedVisibilityChange$3
extends Property {
    public DrawableWithAnimatedVisibilityChange$3(Class clazz, String string2) {
        super(clazz, string2);
    }

    public Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        return Float.valueOf(drawableWithAnimatedVisibilityChange.getGrowFraction());
    }

    public void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f5) {
        float f6 = f5.floatValue();
        drawableWithAnimatedVisibilityChange.setGrowFraction(f6);
    }
}

