/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

public final class AlignmentPattern
extends ResultPoint {
    private final float estimatedModuleSize;

    public AlignmentPattern(float f5, float f6, float f7) {
        super(f5, f6);
        this.estimatedModuleSize = f7;
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

    public AlignmentPattern combineEstimate(float f5, float f6, float f7) {
        float f8 = this.getX() + f6;
        f6 = 2.0f;
        float f11 = (this.getY() + f5) / f6;
        f5 = (this.estimatedModuleSize + f7) / f6;
        AlignmentPattern alignmentPattern = new AlignmentPattern(f8 /= f6, f11, f5);
        return alignmentPattern;
    }
}

