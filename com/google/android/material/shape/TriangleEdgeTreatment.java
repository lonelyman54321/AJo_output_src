/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.shape;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

public class TriangleEdgeTreatment
extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f5, boolean bl2) {
        this.size = f5;
        this.inside = bl2;
    }

    public void getEdgePath(float f5, float f6, float f7, ShapePath shapePath) {
        boolean bl2 = this.inside;
        if (bl2) {
            float f8 = this.size * f7;
            f8 = f6 - f8;
            shapePath.lineTo(f8, 0.0f);
            f8 = this.size;
            float f11 = f8 * f7;
            f8 = f8 * f7 + f6;
            shapePath.lineTo(f6, f11, f8, 0.0f);
            shapePath.lineTo(f5, 0.0f);
        } else {
            float f12 = this.size;
            float f14 = f12 * f7;
            f14 = f6 - f14;
            f12 = -f12 * f7;
            shapePath.lineTo(f14, 0.0f, f6, f12);
            f12 = this.size * f7 + f6;
            shapePath.lineTo(f12, 0.0f, f5, 0.0f);
        }
    }
}

