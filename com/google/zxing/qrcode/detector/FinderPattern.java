/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

public final class FinderPattern
extends ResultPoint {
    private final int count;
    private final float estimatedModuleSize;

    public FinderPattern(float f5, float f6, float f7) {
        this(f5, f6, f7, 1);
    }

    private FinderPattern(float f5, float f6, float f7, int n3) {
        super(f5, f6);
        this.estimatedModuleSize = f7;
        this.count = n3;
    }

    public boolean aboutEquals(float f5, float f6, float f7) {
        float f8 = this.getY();
        f6 = Math.abs(f6 - f8);
        f8 = 0.0f;
        Object object = f6 == f5 ? 0 : (f6 < f5 ? -1 : 1);
        if (object <= 0) {
            f6 = this.getX();
            float f11 = (f6 = Math.abs(f7 -= f6)) - f5;
            object = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
            if (object <= 0) {
                float f12;
                float f14;
                f6 = this.estimatedModuleSize;
                float f15 = (f5 = Math.abs(f5 - f6)) - (f6 = 1.0f);
                object = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                return object <= 0 || (f14 = (f12 = f5 - (f6 = this.estimatedModuleSize)) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) <= 0;
                {
                }
            }
        }
        return false;
    }

    public FinderPattern combineEstimate(float f5, float f6, float f7) {
        int n3 = this.count;
        int n4 = n3 + 1;
        float f8 = n3;
        float f11 = this.getX() * f8 + f6;
        f6 = n4;
        f11 /= f6;
        f8 = this.count;
        float f12 = (this.getY() * f8 + f5) / f6;
        f5 = this.count;
        f8 = this.estimatedModuleSize;
        f5 = (f5 * f8 + f7) / f6;
        FinderPattern finderPattern = new FinderPattern(f11, f12, f5, n4);
        return finderPattern;
    }

    public int getCount() {
        return this.count;
    }

    public float getEstimatedModuleSize() {
        return this.estimatedModuleSize;
    }
}

