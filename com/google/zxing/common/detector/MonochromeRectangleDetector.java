/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

public final class MonochromeRectangleDetector {
    private static final int MAX_MODULES = 32;
    private final BitMatrix image;

    public MonochromeRectangleDetector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    private int[] blackWhiteRange(int n3, int n4, int n7, int n8, boolean bl2) {
        int n10;
        BitMatrix bitMatrix;
        int n14;
        int n15 = n14 = (n7 + n8) / 2;
        while (n15 >= n7) {
            int n16;
            bitMatrix = this.image;
            if (bl2 ? (n10 = bitMatrix.get(n15, n3)) != 0 : (n10 = bitMatrix.get(n3, n15)) != 0) {
                n15 += -1;
                continue;
            }
            n10 = n15;
            while ((n10 += -1) >= n7) {
                BitMatrix bitMatrix2 = this.image;
                if (!(bl2 ? (n16 = (int)(bitMatrix2.get(n10, n3) ? 1 : 0)) != 0 : (n16 = (int)(bitMatrix2.get(n3, n10) ? 1 : 0)) != 0)) continue;
            }
            n16 = n15 - n10;
            if (n10 < n7 || n16 > n4) break;
            n15 = n10;
        }
        ++n15;
        while (n14 < n8) {
            BitMatrix bitMatrix3 = this.image;
            if (bl2 ? (n7 = (int)(bitMatrix3.get(n14, n3) ? 1 : 0)) != 0 : (n7 = (int)(bitMatrix3.get(n3, n14) ? 1 : 0)) != 0) {
                ++n14;
                continue;
            }
            n7 = n14;
            while (++n7 < n8) {
                bitMatrix = this.image;
                if (!(bl2 ? (n10 = (int)(bitMatrix.get(n7, n3) ? 1 : 0)) != 0 : (n10 = (int)(bitMatrix.get(n3, n7) ? 1 : 0)) != 0)) continue;
            }
            n10 = n7 - n14;
            if (n7 >= n8 || n10 > n4) break;
            n14 = n7;
        }
        if ((n14 += -1) > n15) {
            return new int[]{n15, n14};
        }
        return null;
    }

    private ResultPoint findCornerFromCenter(int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16, int n17) {
        Object object = n3;
        Object object2 = n10;
        float f5 = 0.0f;
        Object object3 = null;
        int n18 = n16;
        int n19 = n3;
        for (int i3 = n10; i3 < n18 && i3 >= n15 && n19 < n8 && n19 >= n7; i3 += n14, n19 += n4) {
            Object object4;
            int n20;
            Object object5;
            boolean bl2;
            if (n4 == 0) {
                bl2 = true;
                object5 = this;
                n20 = i3;
                object4 = n17;
                object5 = this.blackWhiteRange(i3, n17, n7, n8, bl2);
            } else {
                bl2 = false;
                object5 = this;
                n20 = n19;
                object4 = n17;
                object5 = this.blackWhiteRange(n19, n17, n15, n16, false);
            }
            if (object5 == null) {
                if (object3 != null) {
                    int n21 = 0;
                    object5 = null;
                    n20 = 1;
                    if (n4 == 0) {
                        i3 -= n14;
                        object2 = object3[0];
                        if (object2 < object) {
                            object4 = object3[n20];
                            if (object4 > object) {
                                if (n14 <= 0) {
                                    n21 = 1;
                                }
                                float f6 = (float)object3[n21];
                                f5 = i3;
                                ResultPoint resultPoint = new ResultPoint(f6, f5);
                                return resultPoint;
                            }
                            float f7 = object2;
                            f5 = i3;
                            ResultPoint resultPoint = new ResultPoint(f7, f5);
                            return resultPoint;
                        }
                        float f8 = (float)object3[n20];
                        f5 = i3;
                        ResultPoint resultPoint = new ResultPoint(f8, f5);
                        return resultPoint;
                    }
                    n19 -= n4;
                    object = object3[0];
                    if (object < object2) {
                        object4 = object3[n20];
                        if (object4 > object2) {
                            float f11 = n19;
                            if (n4 >= 0) {
                                n21 = 1;
                            }
                            f5 = (float)object3[n21];
                            ResultPoint resultPoint = new ResultPoint(f11, f5);
                            return resultPoint;
                        }
                        f5 = n19;
                        float f12 = object;
                        ResultPoint resultPoint = new ResultPoint(f5, f12);
                        return resultPoint;
                    }
                    float f14 = n19;
                    f5 = (float)object3[n20];
                    ResultPoint resultPoint = new ResultPoint(f14, f5);
                    return resultPoint;
                }
                throw NotFoundException.getNotFoundInstance();
            }
            object3 = object5;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public ResultPoint[] detect() {
        int n3 = this.image.getHeight();
        int n4 = this.image.getWidth();
        int n7 = n3 / 2;
        int n8 = n4 / 2;
        int n10 = n3 / 256;
        int n14 = 1;
        int n15 = Math.max(n14, n10);
        n10 = n4 / 256;
        int n16 = Math.max(n14, n10);
        int n17 = -n15;
        int n18 = n8 / 2;
        Object object = this;
        int n19 = n17;
        int n20 = n16;
        int n21 = n15;
        n15 = n3;
        n14 = n18;
        int n22 = (int)this.findCornerFromCenter(n8, 0, 0, n4, n7, n17, 0, n3, n18).getY() + -1;
        int n24 = -n16;
        int n25 = n7 / 2;
        object = this;
        n16 = n22;
        n14 = n25;
        ResultPoint resultPoint = this.findCornerFromCenter(n8, n24, 0, n4, n7, 0, n22, n3, n25);
        int n26 = (int)resultPoint.getX() + -1;
        n24 = n20;
        ResultPoint resultPoint2 = this.findCornerFromCenter(n8, n20, n26, n4, n7, 0, n22, n3, n25);
        n20 = (int)resultPoint2.getX() + 1;
        n17 = n21;
        n14 = n18;
        ResultPoint resultPoint3 = this.findCornerFromCenter(n8, 0, n26, n20, n7, n21, n22, n3, n18);
        n15 = (int)resultPoint3.getY() + 1;
        n18 = n8 / 4;
        n17 = n19;
        n14 = n18;
        object = this.findCornerFromCenter(n8, 0, n26, n20, n7, n19, n22, n15, n18);
        ResultPoint[] resultPointArray = new ResultPoint[]{object, resultPoint, resultPoint2, resultPoint3};
        return resultPointArray;
    }
}

