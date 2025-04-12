/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package com.google.android.material.shape;

import android.graphics.RectF;
import com.google.android.material.shape.CornerSize;
import java.util.Arrays;

public final class RelativeCornerSize
implements CornerSize {
    private final float percent;

    public RelativeCornerSize(float f5) {
        this.percent = f5;
    }

    public static RelativeCornerSize createFromCornerSize(RectF rectF, CornerSize cornerSize) {
        boolean bl2 = cornerSize instanceof RelativeCornerSize;
        if (bl2) {
            cornerSize = (RelativeCornerSize)cornerSize;
        } else {
            float f5 = cornerSize.getCornerSize(rectF);
            float f6 = RelativeCornerSize.getMaxCornerSize(rectF);
            RelativeCornerSize relativeCornerSize = new RelativeCornerSize(f5 /= f6);
            cornerSize = relativeCornerSize;
        }
        return cornerSize;
    }

    private static float getMaxCornerSize(RectF rectF) {
        float f5 = rectF.width();
        float f6 = rectF.height();
        return Math.min(f5, f6);
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RelativeCornerSize;
        if (!bl3) {
            return false;
        }
        object = (RelativeCornerSize)object;
        float f5 = this.percent;
        float f6 = ((RelativeCornerSize)object).percent;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object2 != false) {
            bl2 = false;
        }
        return bl2;
    }

    public float getCornerSize(RectF rectF) {
        float f5 = this.percent;
        float f6 = RelativeCornerSize.getMaxCornerSize(rectF);
        return f5 * f6;
    }

    public float getRelativePercent() {
        return this.percent;
    }

    public int hashCode() {
        Float f5 = Float.valueOf(this.percent);
        Object[] objectArray = new Object[]{f5};
        return Arrays.hashCode(objectArray);
    }
}

