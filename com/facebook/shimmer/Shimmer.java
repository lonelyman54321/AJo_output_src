/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 */
package com.facebook.shimmer;

import android.graphics.RectF;

public class Shimmer {
    private static final int COMPONENT_COUNT = 4;
    boolean alphaShimmer;
    long animationDuration;
    boolean autoStart;
    int baseColor;
    final RectF bounds;
    boolean clipToChildren;
    final int[] colors;
    int direction;
    float dropoff;
    int fixedHeight;
    int fixedWidth;
    float heightRatio;
    int highlightColor;
    float intensity;
    final float[] positions;
    int repeatCount;
    long repeatDelay;
    int repeatMode;
    int shape;
    float tilt;
    float widthRatio;

    public Shimmer() {
        float f5;
        int n3;
        int n4 = 4;
        float[] fArray = new float[n4];
        this.positions = fArray;
        Object object = new int[n4];
        this.colors = object;
        object = new RectF;
        this.bounds = (RectF)object;
        this.direction = 0;
        this.highlightColor = n3 = -1;
        this.baseColor = 0x4CFFFFFF;
        this.shape = 0;
        this.fixedWidth = 0;
        this.fixedHeight = 0;
        this.widthRatio = f5 = 1.0f;
        this.heightRatio = f5;
        this.intensity = 0.0f;
        this.dropoff = 0.5f;
        this.tilt = 20.0f;
        n4 = 1;
        this.clipToChildren = n4;
        this.autoStart = n4;
        this.alphaShimmer = n4;
        this.repeatCount = n3;
        this.repeatMode = n4;
        this.animationDuration = 1000L;
    }

    public int height(int n3) {
        int n4 = this.fixedHeight;
        if (n4 <= 0) {
            float f5 = this.heightRatio;
            float f6 = n3;
            n4 = Math.round(f5 *= f6);
        }
        return n4;
    }

    public void updateBounds(int n3, int n4) {
        int n7 = Math.max(n3, n4);
        double d2 = Math.toRadians(this.tilt % 90.0f);
        double d5 = 1.5707963267948966 - d2;
        double d7 = n7;
        double d9 = Math.sin(d5);
        n7 = Math.round((float)(d7 / d9 - d7) / 2.0f) * 3;
        RectF rectF = this.bounds;
        float f5 = -n7;
        float f6 = this.width(n3) + n7;
        float f7 = this.height(n4) + n7;
        rectF.set(f5, f5, f6, f7);
    }

    public void updateColors() {
        int n3 = this.shape;
        int n4 = 3;
        int n7 = 2;
        int n8 = 0;
        int n10 = 1;
        if (n3 != n10) {
            int n14;
            int[] nArray = this.colors;
            nArray[0] = n14 = this.baseColor;
            nArray[n10] = n8 = this.highlightColor;
            nArray[n7] = n8;
            nArray[n4] = n14;
        } else {
            int n15;
            int[] nArray = this.colors;
            nArray[0] = n15 = this.highlightColor;
            nArray[n10] = n15;
            nArray[n7] = n8 = this.baseColor;
            nArray[n4] = n8;
        }
    }

    public void updatePositions() {
        int n3 = this.shape;
        int n4 = 3;
        int n7 = 2;
        float f5 = 2.8E-45f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 1.0f;
        int n8 = 1;
        if (n3 != n8) {
            float[] fArray = this.positions;
            float f11 = this.intensity;
            f11 = f8 - f11;
            float f12 = this.dropoff;
            f11 -= f12;
            f12 = 2.0f;
            fArray[0] = f11 = Math.max(f11 / f12, 0.0f);
            fArray = this.positions;
            f6 = this.intensity;
            f6 = f8 - f6;
            f11 = 0.001f;
            fArray[n8] = f6 = Math.max((f6 - f11) / f12, 0.0f);
            fArray = this.positions;
            fArray[n7] = f6 = Math.min((this.intensity + f8 + f11) / f12, f8);
            fArray = this.positions;
            f5 = this.intensity + f8;
            f6 = this.dropoff;
            fArray[n4] = f5 = Math.min((f5 + f6) / f12, f8);
        } else {
            float[] fArray = this.positions;
            fArray[0] = 0.0f;
            fArray[n8] = f6 = Math.min(this.intensity, f8);
            fArray = this.positions;
            f6 = this.intensity;
            f7 = this.dropoff;
            fArray[n7] = f6 = Math.min(f6 + f7, f8);
            fArray = this.positions;
            fArray[n4] = f8;
        }
    }

    public int width(int n3) {
        int n4 = this.fixedWidth;
        if (n4 <= 0) {
            float f5 = this.widthRatio;
            float f6 = n3;
            n4 = Math.round(f5 *= f6);
        }
        return n4;
    }
}

