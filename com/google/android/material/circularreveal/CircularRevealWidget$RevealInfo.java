/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.circularreveal;

import com.google.android.material.circularreveal.CircularRevealWidget$1;

public class CircularRevealWidget$RevealInfo {
    public static final float INVALID_RADIUS = Float.MAX_VALUE;
    public float centerX;
    public float centerY;
    public float radius;

    private CircularRevealWidget$RevealInfo() {
    }

    public CircularRevealWidget$RevealInfo(float f5, float f6, float f7) {
        this.centerX = f5;
        this.centerY = f6;
        this.radius = f7;
    }

    public /* synthetic */ CircularRevealWidget$RevealInfo(CircularRevealWidget$1 circularRevealWidget$1) {
        this();
    }

    public CircularRevealWidget$RevealInfo(CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo) {
        float f5 = circularRevealWidget$RevealInfo.centerX;
        float f6 = circularRevealWidget$RevealInfo.centerY;
        float f7 = circularRevealWidget$RevealInfo.radius;
        this(f5, f6, f7);
    }

    public boolean isInvalid() {
        float f5 = this.radius;
        float f6 = Float.MAX_VALUE;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            object = true;
            f5 = Float.MIN_VALUE;
        } else {
            object = false;
            f5 = 0.0f;
        }
        return (boolean)object;
    }

    public void set(float f5, float f6, float f7) {
        this.centerX = f5;
        this.centerY = f6;
        this.radius = f7;
    }

    public void set(CircularRevealWidget$RevealInfo circularRevealWidget$RevealInfo) {
        float f5 = circularRevealWidget$RevealInfo.centerX;
        float f6 = circularRevealWidget$RevealInfo.centerY;
        float f7 = circularRevealWidget$RevealInfo.radius;
        this.set(f5, f6, f7);
    }
}

