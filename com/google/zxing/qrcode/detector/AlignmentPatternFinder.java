/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.detector.AlignmentPattern;
import java.util.List;

final class AlignmentPatternFinder {
    private final int[] crossCheckStateCount;
    private final int height;
    private final BitMatrix image;
    private final float moduleSize;
    private final List possibleCenters;
    private final ResultPointCallback resultPointCallback;
    private final int startX;
    private final int startY;
    private final int width;

    public AlignmentPatternFinder(BitMatrix object, int n3, int n4, int n7, int n8, float f5, ResultPointCallback resultPointCallback) {
        this.image = object;
        super(5);
        this.possibleCenters = object;
        this.startX = n3;
        this.startY = n4;
        this.width = n7;
        this.height = n8;
        this.moduleSize = f5;
        object = new int[3];
        this.crossCheckStateCount = (int[])object;
        this.resultPointCallback = resultPointCallback;
    }

    private static float centerFromEnd(int[] nArray, int n3) {
        int n4 = nArray[2];
        float f5 = n3 - n4;
        float f6 = (float)nArray[1] / 2.0f;
        return f5 - f6;
    }

    private float crossCheckVertical(int n3, int n4, int n7, int n8) {
        int n10;
        int n14;
        int n15;
        BitMatrix bitMatrix = this.image;
        int n16 = bitMatrix.getHeight();
        int[] nArray = this.crossCheckStateCount;
        nArray[0] = 0;
        int n17 = 1;
        nArray[n17] = 0;
        int n18 = 2;
        nArray[n18] = 0;
        for (n15 = n3; n15 >= 0 && (n14 = (int)(bitMatrix.get(n4, n15) ? 1 : 0)) != 0 && (n14 = nArray[n17]) <= n7; n15 += -1) {
            nArray[n17] = ++n14;
        }
        n14 = 2143289344;
        float f5 = 0.0f / 0.0f;
        if (n15 >= 0 && (n10 = nArray[n17]) <= n7) {
            while (n15 >= 0 && (n10 = (int)(bitMatrix.get(n4, n15) ? 1 : 0)) == 0 && (n10 = nArray[0]) <= n7) {
                nArray[0] = ++n10;
                n15 += -1;
            }
            n15 = nArray[0];
            if (n15 > n7) {
                return f5;
            }
            n3 += n17;
            while (n3 < n16 && (n15 = (int)(bitMatrix.get(n4, n3) ? 1 : 0)) != 0 && (n15 = nArray[n17]) <= n7) {
                nArray[n17] = ++n15;
                ++n3;
            }
            if (n3 != n16 && (n15 = nArray[n17]) <= n7) {
                while (n3 < n16 && (n15 = (int)(bitMatrix.get(n4, n3) ? 1 : 0)) == 0 && (n15 = nArray[n18]) <= n7) {
                    nArray[n18] = ++n15;
                    ++n3;
                }
                n4 = nArray[n18];
                if (n4 > n7) {
                    return f5;
                }
                n7 = nArray[0];
                int n19 = nArray[n17];
                if ((n4 = Math.abs(n7 = n7 + n19 + n4 - n8) * 5) >= (n8 *= 2)) {
                    return f5;
                }
                n4 = (int)(this.foundPatternCross(nArray) ? 1 : 0);
                if (n4 != 0) {
                    return AlignmentPatternFinder.centerFromEnd(nArray, n3);
                }
            }
        }
        return f5;
    }

    private boolean foundPatternCross(int[] nArray) {
        float f5 = this.moduleSize;
        float f6 = f5 / 2.0f;
        int n3 = 0;
        while (true) {
            int n4 = 3;
            float f7 = 4.2E-45f;
            if (n3 >= n4) break;
            f7 = nArray[n3];
            float f8 = (f7 = Math.abs(f5 - f7)) - f6;
            n4 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
            if (n4 >= 0) {
                return false;
            }
            ++n3;
        }
        return true;
    }

    private AlignmentPattern handlePossibleCenter(int[] object, int n3, int n4) {
        int n7;
        int n8 = 0;
        float f5 = 0.0f;
        Object object2 = null;
        int n10 = object[0];
        int n14 = 1;
        int n15 = object[n14];
        n10 += n15;
        n15 = 2;
        int n16 = object[n15];
        n10 += n16;
        float f6 = AlignmentPatternFinder.centerFromEnd((int[])object, n4);
        n16 = (int)f6;
        float f7 = this.crossCheckVertical(n3, n16, n7 = object[n14] * 2, n10);
        n10 = (int)(Float.isNaN(f7) ? 1 : 0);
        if (n10 == 0) {
            n8 = object[0];
            n10 = object[n14];
            int n17 = object[n15];
            float f8 = (n8 += n10) + n17;
            n8 = 0x40400000;
            f5 = 3.0f;
            f8 /= f5;
            object2 = this.possibleCenters.iterator();
            while ((n10 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                AlignmentPattern alignmentPattern = (AlignmentPattern)object2.next();
                n14 = (int)(alignmentPattern.aboutEquals(f8, f7, f6) ? 1 : 0);
                if (n14 == 0) continue;
                return alignmentPattern.combineEstimate(f7, f6, f8);
            }
            object2 = new AlignmentPattern(f6, f7, f8);
            this.possibleCenters.add(object2);
            object = this.resultPointCallback;
            if (object != null) {
                object.foundPossibleResultPoint((ResultPoint)object2);
            }
        }
        return null;
    }

    public AlignmentPattern find() {
        int n3 = this.startX;
        int n4 = this.height;
        int n7 = this.width + n3;
        int n8 = this.startY;
        int n10 = n4 / 2 + n8;
        n8 = 3;
        int[] nArray = new int[n8];
        for (int i3 = 0; i3 < n4; ++i3) {
            AlignmentPattern alignmentPattern;
            Object object;
            int n14;
            int n15;
            int n16 = i3 & 1;
            int n17 = 2;
            n16 = n16 == 0 ? (i3 + 1) / n17 : -((i3 + 1) / n17);
            n16 += n10;
            nArray[0] = 0;
            int n18 = 1;
            nArray[n18] = 0;
            nArray[n17] = 0;
            for (n15 = n3; n15 < n7 && (n14 = ((BitMatrix)(object = this.image)).get(n15, n16)) == 0; ++n15) {
            }
            n14 = 0;
            object = null;
            while (n15 < n7) {
                BitMatrix bitMatrix = this.image;
                int n19 = bitMatrix.get(n15, n16);
                if (n19 != 0) {
                    if (n14 == n18) {
                        nArray[n18] = n19 = nArray[n18] + n18;
                    } else if (n14 == n17) {
                        n14 = (int)(this.foundPatternCross(nArray) ? 1 : 0);
                        if (n14 != 0 && (object = this.handlePossibleCenter(nArray, n16, n15)) != null) {
                            return object;
                        }
                        nArray[0] = n14 = nArray[n17];
                        nArray[n18] = n18;
                        nArray[n17] = 0;
                        n14 = 1;
                    } else {
                        nArray[++n14] = n19 = nArray[n14] + n18;
                    }
                } else {
                    if (n14 == n18) {
                        ++n14;
                    }
                    nArray[n14] = n19 = nArray[n14] + n18;
                }
                ++n15;
            }
            n17 = (int)(this.foundPatternCross(nArray) ? 1 : 0);
            if (n17 == 0 || (alignmentPattern = this.handlePossibleCenter(nArray, n16, n7)) == null) continue;
            return alignmentPattern;
        }
        List list = this.possibleCenters;
        n3 = (int)(list.isEmpty() ? 1 : 0);
        if (n3 == 0) {
            return (AlignmentPattern)this.possibleCenters.get(0);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

