/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.shape;

import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.ShapePath;

public class CutCornerTreatment
extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    public CutCornerTreatment(float f5) {
        this.size = f5;
    }

    public void getCornerPath(ShapePath shapePath, float f5, float f6, float f7) {
        float f8 = f7 * f6;
        float f11 = 180.0f;
        float f12 = f11 - f5;
        shapePath.reset(0.0f, f8, f11, f12);
        double d2 = Math.sin(Math.toRadians(f5));
        double d5 = f7;
        double d7 = f6;
        f8 = (float)((d2 *= d5) * d7);
        f5 = (float)(Math.sin(Math.toRadians(90.0f - f5)) * d5 * d7);
        shapePath.lineTo(f8, f5);
    }
}

