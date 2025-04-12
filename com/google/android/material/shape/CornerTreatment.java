/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package com.google.android.material.shape;

import android.graphics.RectF;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapePath;

public class CornerTreatment {
    public void getCornerPath(float f5, float f6, ShapePath shapePath) {
    }

    public void getCornerPath(ShapePath shapePath, float f5, float f6, float f7) {
        this.getCornerPath(f5, f6, shapePath);
    }

    public void getCornerPath(ShapePath shapePath, float f5, float f6, RectF rectF, CornerSize cornerSize) {
        float f7 = cornerSize.getCornerSize(rectF);
        this.getCornerPath(shapePath, f5, f6, f7);
    }
}

