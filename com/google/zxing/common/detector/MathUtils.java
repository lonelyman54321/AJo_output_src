/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common.detector;

public final class MathUtils {
    private MathUtils() {
    }

    public static float distance(float f5, float f6, float f7, float f8) {
        f5 -= f7;
        f5 *= f5;
        return (float)Math.sqrt((f6 -= f8) * f6 + f5);
    }

    public static float distance(int n3, int n4, int n7, int n8) {
        n3 -= n7;
        n3 *= n3;
        return (float)Math.sqrt((n4 -= n8) * n4 + n3);
    }

    public static int round(float f5) {
        float f6 = 0.0f;
        float f7 = f5 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            object = -1090519040;
            f6 = -0.5f;
        } else {
            object = 0x3F000000;
            f6 = 0.5f;
        }
        return (int)(f5 + f6);
    }

    public static int sum(int[] nArray) {
        int n3 = nArray.length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7 = nArray[i3];
            n4 += n7;
        }
        return n4;
    }
}

