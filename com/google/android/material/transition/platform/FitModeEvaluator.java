/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package com.google.android.material.transition.platform;

import android.graphics.RectF;
import com.google.android.material.transition.platform.FitModeResult;

interface FitModeEvaluator {
    public void applyMask(RectF var1, float var2, FitModeResult var3);

    public FitModeResult evaluate(float var1, float var2, float var3, float var4, float var5, float var6, float var7);

    public boolean shouldMaskStartBounds(FitModeResult var1);
}

