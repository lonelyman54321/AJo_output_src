/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.shape;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

public final class OffsetEdgeTreatment
extends EdgeTreatment {
    private final float offset;
    private final EdgeTreatment other;

    public OffsetEdgeTreatment(EdgeTreatment edgeTreatment, float f5) {
        this.other = edgeTreatment;
        this.offset = f5;
    }

    public boolean forceIntersection() {
        return this.other.forceIntersection();
    }

    public void getEdgePath(float f5, float f6, float f7, ShapePath shapePath) {
        EdgeTreatment edgeTreatment = this.other;
        float f8 = this.offset;
        edgeTreatment.getEdgePath(f5, f6 -= f8, f7, shapePath);
    }
}

