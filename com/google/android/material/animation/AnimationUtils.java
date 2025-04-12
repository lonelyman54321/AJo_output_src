/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.LinearInterpolator
 */
package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class AnimationUtils {
    public static final TimeInterpolator DECELERATE_INTERPOLATOR;
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR;
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR;
    public static final TimeInterpolator LINEAR_INTERPOLATOR;
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR;

    static {
        Object object = new LinearInterpolator();
        LINEAR_INTERPOLATOR = object;
        object = new xi0_0();
        FAST_OUT_SLOW_IN_INTERPOLATOR = object;
        object = new WI0();
        FAST_OUT_LINEAR_IN_INTERPOLATOR = object;
        float[] fArray = du1_1.c;
        object = new AB1(fArray);
        LINEAR_OUT_SLOW_IN_INTERPOLATOR = object;
        object = new DecelerateInterpolator();
        DECELERATE_INTERPOLATOR = object;
    }

    public static float lerp(float f5, float f6, float f7) {
        return xu0_1.a(f6, f5, f7, f5);
    }

    public static float lerp(float f5, float f6, float f7, float f8, float f11) {
        Object object = f11 == f7 ? 0 : (f11 < f7 ? -1 : 1);
        if (object <= 0) {
            return f5;
        }
        object = f11 == f8 ? 0 : (f11 > f8 ? 1 : -1);
        if (object >= 0) {
            return f6;
        }
        f11 -= f7;
        return AnimationUtils.lerp(f5, f6, f11 /= (f8 -= f7));
    }

    public static int lerp(int n3, int n4, float f5) {
        float f6 = n4 - n3;
        return Math.round(f5 * f6) + n3;
    }
}

