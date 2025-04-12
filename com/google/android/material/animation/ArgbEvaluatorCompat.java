/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 */
package com.google.android.material.animation;

import android.animation.TypeEvaluator;

public class ArgbEvaluatorCompat
implements TypeEvaluator {
    private static final ArgbEvaluatorCompat instance;

    static {
        ArgbEvaluatorCompat argbEvaluatorCompat;
        instance = argbEvaluatorCompat = new ArgbEvaluatorCompat();
    }

    public static ArgbEvaluatorCompat getInstance() {
        return instance;
    }

    public Integer evaluate(float f5, Integer n3, Integer n4) {
        int n7 = n3;
        float f6 = n7 >> 24 & 0xFF;
        float f7 = 255.0f;
        f6 /= f7;
        float f8 = (float)(n7 >> 16 & 0xFF) / f7;
        float f11 = (float)(n7 >> 8 & 0xFF) / f7;
        float f12 = (float)(n7 & 0xFF) / f7;
        int n8 = n4;
        float f14 = (float)(n8 >> 24 & 0xFF) / f7;
        float f15 = (float)(n8 >> 16 & 0xFF) / f7;
        float f16 = (float)(n8 >> 8 & 0xFF) / f7;
        float f17 = (float)(n8 & 0xFF) / f7;
        double d2 = f8;
        double d5 = 2.2;
        f8 = (float)Math.pow(d2, d5);
        f11 = (float)Math.pow(f11, d5);
        f12 = (float)Math.pow(f12, d5);
        f15 = (float)Math.pow(f15, d5);
        f16 = (float)Math.pow(f16, d5);
        f17 = (float)Math.pow(f17, d5);
        f6 = xu0_1.a(f14, f6, f5, f6);
        f8 = xu0_1.a(f15, f8, f5, f8);
        f11 = xu0_1.a(f16, f11, f5, f11);
        f5 = xu0_1.a(f17, f12, f5, f12);
        f6 *= f7;
        double d7 = f8;
        double d9 = 0.45454545454545453;
        f12 = (float)Math.pow(d7, d9) * f7;
        f17 = (float)Math.pow(f11, d9) * f7;
        f5 = (float)Math.pow(f5, d9) * f7;
        int n10 = Math.round(f6) << 24;
        n7 = Math.round(f12) << 16 | n10;
        n8 = Math.round(f17) << 8;
        return Math.round(f5) | (n7 |= n8);
    }
}

