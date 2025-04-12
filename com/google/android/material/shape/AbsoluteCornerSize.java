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

public final class AbsoluteCornerSize
implements CornerSize {
    private final float size;

    public AbsoluteCornerSize(float f5) {
        this.size = f5;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AbsoluteCornerSize;
        if (!bl3) {
            return false;
        }
        object = (AbsoluteCornerSize)object;
        float f5 = this.size;
        float f6 = ((AbsoluteCornerSize)object).size;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object2 != false) {
            bl2 = false;
        }
        return bl2;
    }

    public float getCornerSize() {
        return this.size;
    }

    public float getCornerSize(RectF rectF) {
        return this.size;
    }

    public int hashCode() {
        Float f5 = Float.valueOf(this.size);
        Object[] objectArray = new Object[]{f5};
        return Arrays.hashCode(objectArray);
    }
}

