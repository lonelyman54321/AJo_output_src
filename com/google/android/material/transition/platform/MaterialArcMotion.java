/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PointF
 *  android.transition.PathMotion
 */
package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;

public final class MaterialArcMotion
extends PathMotion {
    private static PointF getControlPoint(float f5, float f6, float f7, float f8) {
        Object object = f6 == f8 ? 0 : (f6 > f8 ? 1 : -1);
        if (object > 0) {
            PointF pointF = new PointF(f7, f6);
            return pointF;
        }
        PointF pointF = new PointF(f5, f8);
        return pointF;
    }

    public Path getPath(float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(f5, f6);
        PointF pointF = MaterialArcMotion.getControlPoint(f5, f6, f7, f8);
        f6 = pointF.x;
        f5 = pointF.y;
        path.quadTo(f6, f5, f7, f8);
        return path;
    }
}

