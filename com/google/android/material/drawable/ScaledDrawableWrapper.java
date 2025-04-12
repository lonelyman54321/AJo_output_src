/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;

public class ScaledDrawableWrapper
extends wu0_0 {
    private final int height;
    private final int width;

    public ScaledDrawableWrapper(Drawable drawable2, int n3, int n4) {
        super(drawable2);
        this.width = n3;
        this.height = n4;
    }

    public int getIntrinsicHeight() {
        return this.height;
    }

    public int getIntrinsicWidth() {
        return this.width;
    }
}

