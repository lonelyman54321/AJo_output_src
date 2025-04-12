/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package com.google.android.material.carousel;

import android.graphics.RectF;
import com.google.android.material.carousel.OnMaskChangedListener;

interface Maskable {
    public RectF getMaskRectF();

    public float getMaskXPercentage();

    public void setMaskRectF(RectF var1);

    public void setMaskXPercentage(float var1);

    public void setOnMaskChangedListener(OnMaskChangedListener var1);
}

