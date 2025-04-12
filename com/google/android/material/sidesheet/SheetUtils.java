/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.sidesheet;

final class SheetUtils {
    private SheetUtils() {
    }

    public static boolean isSwipeMostlyHorizontal(float f5, float f6) {
        float f7 = (f5 = Math.abs(f5)) - (f6 = Math.abs(f6));
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object > 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        return (boolean)object;
    }
}

