/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.shape;

import com.google.android.material.shape.ShapePath;

public class EdgeTreatment {
    public boolean forceIntersection() {
        return false;
    }

    public void getEdgePath(float f5, float f6, float f7, ShapePath shapePath) {
        shapePath.lineTo(f5, 0.0f);
    }

    public void getEdgePath(float f5, float f6, ShapePath shapePath) {
        float f7 = f5 / 2.0f;
        this.getEdgePath(f5, f7, f6, shapePath);
    }
}

