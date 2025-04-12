/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package com.google.android.material.shape;

import android.graphics.RectF;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import java.util.Arrays;

public final class ClampedCornerSize
implements CornerSize {
    private final float target;

    public ClampedCornerSize(float f5) {
        this.target = f5;
    }

    public static ClampedCornerSize createFromCornerSize(AbsoluteCornerSize absoluteCornerSize) {
        float f5 = absoluteCornerSize.getCornerSize();
        ClampedCornerSize clampedCornerSize = new ClampedCornerSize(f5);
        return clampedCornerSize;
    }

    private static float getMaxCornerSize(RectF rectF) {
        float f5 = rectF.width();
        float f6 = 2.0f;
        float f7 = rectF.height() / f6;
        return Math.min(f5 /= f6, f7);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ClampedCornerSize;
        if (!bl3) {
            return false;
        }
        object = (ClampedCornerSize)object;
        float f5 = this.target;
        float f6 = ((ClampedCornerSize)object).target;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object2 != false) {
            bl2 = false;
        }
        return bl2;
    }

    public float getCornerSize(RectF rectF) {
        float f5 = this.target;
        float f6 = ClampedCornerSize.getMaxCornerSize(rectF);
        return Math.min(f5, f6);
    }

    public int hashCode() {
        Float f5 = Float.valueOf(this.target);
        Object[] objectArray = new Object[]{f5};
        return Arrays.hashCode(objectArray);
    }
}

