/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;

public final class DefaultGridSampler
extends GridSampler {
    public BitMatrix sampleGrid(BitMatrix bitMatrix, int n3, int n4, float f5, float f6, float f7, float f8, float f11, float f12, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f22, float f23, float f24) {
        PerspectiveTransform perspectiveTransform = PerspectiveTransform.quadrilateralToQuadrilateral(f5, f6, f7, f8, f11, f12, f14, f15, f16, f17, f18, f19, f20, f22, f23, f24);
        return this.sampleGrid(bitMatrix, n3, n4, perspectiveTransform);
    }

    public BitMatrix sampleGrid(BitMatrix bitMatrix, int n3, int n4, PerspectiveTransform perspectiveTransform) {
        if (n3 > 0 && n4 > 0) {
            BitMatrix bitMatrix2 = new BitMatrix(n3, n4);
            float[] fArray = new float[n3 *= 2];
            for (int i3 = 0; i3 < n4; ++i3) {
                int n7;
                float f5 = i3;
                int n8 = 0x3F000000;
                float f6 = 0.5f;
                f5 += f6;
                float f7 = 0.0f;
                for (n7 = 0; n7 < n3; n7 += 2) {
                    float f8;
                    fArray[n7] = f8 = (float)(n7 / 2) + f6;
                    int n10 = n7 + 1;
                    fArray[n10] = f5;
                }
                perspectiveTransform.transformPoints(fArray);
                GridSampler.checkAndNudgePoints(bitMatrix, fArray);
                f5 = 0.0f;
                for (int i8 = 0; i8 < n3; i8 += 2) {
                    try {
                        f6 = fArray[i8];
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    n8 = (int)f6;
                    n7 = i8 + 1;
                    f7 = fArray[n7];
                    n7 = (int)f7;
                    n8 = (int)(bitMatrix.get(n8, n7) ? 1 : 0);
                    if (n8 == 0) continue;
                    n8 = i8 / 2;
                    bitMatrix2.set(n8, i3);
                }
            }
            return bitMatrix2;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

