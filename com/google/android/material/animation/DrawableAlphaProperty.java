/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.util.Property
 */
package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

public class DrawableAlphaProperty
extends Property {
    public static final Property DRAWABLE_ALPHA_COMPAT;
    private final WeakHashMap alphaCache;

    static {
        DrawableAlphaProperty drawableAlphaProperty = new DrawableAlphaProperty();
        DRAWABLE_ALPHA_COMPAT = drawableAlphaProperty;
    }

    private DrawableAlphaProperty() {
        super(Integer.class, "drawableAlphaCompat");
        WeakHashMap weakHashMap;
        this.alphaCache = weakHashMap = new WeakHashMap();
    }

    public Integer get(Drawable drawable2) {
        return drawable2.getAlpha();
    }

    public void set(Drawable drawable2, Integer n3) {
        int n4 = n3;
        drawable2.setAlpha(n4);
    }
}

