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

public final class AdjustedCornerSize
implements CornerSize {
    private final float adjustment;
    private final CornerSize other;

    public AdjustedCornerSize(float f5, CornerSize cornerSize) {
        boolean bl2;
        while (bl2 = cornerSize instanceof AdjustedCornerSize) {
            CornerSize cornerSize2 = cornerSize = ((AdjustedCornerSize)cornerSize).other;
            cornerSize2 = (AdjustedCornerSize)cornerSize;
            float f6 = ((AdjustedCornerSize)cornerSize2).adjustment;
            f5 += f6;
        }
        this.other = cornerSize;
        this.adjustment = f5;
    }

    public boolean equals(Object object) {
        float f5;
        float f6;
        float f7;
        float f8;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AdjustedCornerSize;
        if (!bl3) {
            return false;
        }
        object = (AdjustedCornerSize)object;
        CornerSize cornerSize = this.other;
        CornerSize cornerSize2 = ((AdjustedCornerSize)object).other;
        bl3 = cornerSize.equals(cornerSize2);
        if (!bl3 || (f8 = (f7 = (f6 = this.adjustment) - (f5 = ((AdjustedCornerSize)object).adjustment)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) != false) {
            bl2 = false;
        }
        return bl2;
    }

    public float getCornerSize(RectF rectF) {
        float f5 = this.other.getCornerSize(rectF);
        float f6 = this.adjustment;
        return Math.max(0.0f, f5 += f6);
    }

    public int hashCode() {
        CornerSize cornerSize = this.other;
        Float f5 = Float.valueOf(this.adjustment);
        Object[] objectArray = new Object[]{cornerSize, f5};
        return Arrays.hashCode(objectArray);
    }
}

