/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.internal;

final class FadeThroughUtils {
    static final float THRESHOLD_ALPHA = 0.5f;

    private FadeThroughUtils() {
    }

    public static void calculateFadeOutAndInAlphas(float f5, float[] fArray) {
        float f6 = 0.5f;
        int n3 = 1;
        float f7 = 2.0f;
        float f8 = 1.0f;
        Object object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object <= 0) {
            fArray[0] = f8 -= (f5 *= f7);
            fArray[n3] = 0.0f;
        } else {
            fArray[0] = 0.0f;
            fArray[n3] = f5 = f5 * f7 - f8;
        }
    }
}

