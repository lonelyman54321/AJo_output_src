/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.shape;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

public final class MarkerEdgeTreatment
extends EdgeTreatment {
    private final float radius = f5 -= 0.001f;

    public MarkerEdgeTreatment(float f5) {
    }

    public boolean forceIntersection() {
        return true;
    }

    public void getEdgePath(float f5, float f6, float f7, ShapePath shapePath) {
        double d2 = this.radius;
        double d5 = 2.0;
        f5 = (float)(Math.sqrt(d5) * d2 / d5);
        d2 = Math.pow(this.radius, d5);
        double d7 = Math.pow(f5, d5);
        f7 = (float)Math.sqrt(d2 - d7);
        float f8 = f6 - f5;
        d7 = this.radius;
        double d9 = Math.sqrt(d5) * d7;
        d7 = this.radius;
        float f11 = (float)(-(d9 - d7)) + f7;
        shapePath.reset(f8, f11);
        d2 = this.radius;
        d7 = Math.sqrt(d5) * d2;
        d2 = this.radius;
        f8 = (float)(-(d7 - d2));
        shapePath.lineTo(f6, f8);
        f6 += f5;
        d2 = this.radius;
        d5 = Math.sqrt(d5) * d2;
        d2 = this.radius;
        f5 = (float)(-(d5 - d2)) + f7;
        shapePath.lineTo(f6, f5);
    }
}

