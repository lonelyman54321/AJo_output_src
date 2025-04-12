/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.shape;

import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.ShapePath;

public class RoundedCornerTreatment
extends CornerTreatment {
    float radius;

    public RoundedCornerTreatment() {
        this.radius = -1.0f;
    }

    public RoundedCornerTreatment(float f5) {
        this.radius = f5;
    }

    public void getCornerPath(ShapePath shapePath, float f5, float f6, float f7) {
        float f8 = f7 * f6;
        float f11 = 180.0f;
        float f12 = f11 - f5;
        shapePath.reset(0.0f, f8, f11, f12);
        float f14 = f7 * 2.0f * f6;
        shapePath.addArc(0.0f, 0.0f, f14, f14, 180.0f, f5);
    }
}

