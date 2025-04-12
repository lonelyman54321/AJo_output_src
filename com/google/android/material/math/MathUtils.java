/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.math;

public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    private MathUtils() {
    }

    public static float dist(float f5, float f6, float f7, float f8) {
        double d2 = f7 -= f5;
        double d5 = f8 -= f6;
        return (float)Math.hypot(d2, d5);
    }

    public static float distanceToFurthestCorner(float f5, float f6, float f7, float f8, float f11, float f12) {
        float f14 = MathUtils.dist(f5, f6, f7, f8);
        f8 = MathUtils.dist(f5, f6, f11, f8);
        f11 = MathUtils.dist(f5, f6, f11, f12);
        f5 = MathUtils.dist(f5, f6, f7, f12);
        return MathUtils.max(f14, f8, f11, f5);
    }

    public static float floorMod(float f5, int n3) {
        float f6;
        float f7 = n3;
        float f8 = f5 / f7;
        int n4 = (int)f8;
        float f11 = Math.signum(f5) * f7;
        f7 = 0.0f;
        float f12 = f11 - 0.0f;
        Object object = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object < 0 && (object = (f6 = (f7 = (float)(n4 * n3)) - f5) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
            n4 += -1;
        }
        float f14 = n4 * n3;
        return f5 - f14;
    }

    public static int floorMod(int n3, int n4) {
        int n7 = n3 / n4;
        int n8 = n3 ^ n4;
        if (n8 < 0 && (n8 = n7 * n4) != n3) {
            n7 += -1;
        }
        return n3 - (n7 *= n4);
    }

    public static boolean geq(float f5, float f6, float f7) {
        float f8 = (f5 += f7) - f6;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object >= 0) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        return (boolean)object;
    }

    public static float lerp(float f5, float f6, float f7) {
        float f8 = (1.0f - f7) * f5;
        return f7 * f6 + f8;
    }

    private static float max(float f5, float f6, float f7, float f8) {
        Object object = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (object <= 0 || (object = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1)) <= 0 || (object = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1)) <= 0) {
            Object object2 = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
            f5 = object2 > 0 && (object2 = f6 == f8 ? 0 : (f6 > f8 ? 1 : -1)) > 0 ? f6 : ((object2 = f7 == f8 ? 0 : (f7 > f8 ? 1 : -1)) > 0 ? f7 : f8);
        }
        return f5;
    }
}

