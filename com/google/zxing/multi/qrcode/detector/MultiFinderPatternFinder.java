/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.multi.qrcode.detector.MultiFinderPatternFinder$ModuleSizeComparator;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

final class MultiFinderPatternFinder
extends FinderPatternFinder {
    private static final float DIFF_MODSIZE_CUTOFF = 0.5f;
    private static final float DIFF_MODSIZE_CUTOFF_PERCENT = 0.05f;
    private static final FinderPatternInfo[] EMPTY_RESULT_ARRAY = new FinderPatternInfo[0];
    private static final float MAX_MODULE_COUNT_PER_EDGE = 180.0f;
    private static final float MIN_MODULE_COUNT_PER_EDGE = 9.0f;

    public MultiFinderPatternFinder(BitMatrix bitMatrix) {
        super(bitMatrix);
    }

    public MultiFinderPatternFinder(BitMatrix bitMatrix, ResultPointCallback resultPointCallback) {
        super(bitMatrix, resultPointCallback);
    }

    private FinderPattern[][] selectMutipleBestPatterns() {
        int n3;
        int n4 = 2;
        float f5 = 2.8E-45f;
        float f6 = 0.0f;
        FinderPattern finderPattern = null;
        int n7 = 1;
        float f7 = Float.MIN_VALUE;
        Object object = this.getPossibleCenters();
        int n8 = object.size();
        if (n8 >= (n3 = 3)) {
            FinderPattern[][] finderPatternArrayArray;
            int n10;
            if (n8 == n3) {
                FinderPattern finderPattern2 = (FinderPattern)object.get(0);
                FinderPattern finderPattern3 = (FinderPattern)object.get(n7);
                object = (FinderPattern)object.get(n4);
                FinderPattern[] finderPatternArray = new FinderPattern[n3];
                finderPatternArray[0] = finderPattern2;
                finderPatternArray[n7] = finderPattern3;
                finderPatternArray[n4] = object;
                FinderPattern[][] finderPatternArray2 = new FinderPattern[n7][];
                finderPatternArray2[0] = finderPatternArray;
                return finderPatternArray2;
            }
            Serializable serializable = new MultiFinderPatternFinder$ModuleSizeComparator(null);
            Collections.sort(object, serializable);
            serializable = new ArrayList();
            for (int i3 = 0; i3 < (n10 = n8 + -2); i3 += n4) {
                FinderPattern finderPattern4 = (FinderPattern)object.get(i3);
                if (finderPattern4 != null) {
                    int n14 = i3 + 1;
                    while (true) {
                        int n15;
                        if (n14 >= (n15 = n8 + -1)) break;
                        FinderPattern finderPattern5 = (FinderPattern)object.get(n14);
                        if (finderPattern5 != null) {
                            float f8;
                            float f11 = finderPattern4.getEstimatedModuleSize();
                            float f12 = finderPattern5.getEstimatedModuleSize();
                            f11 -= f12;
                            f12 = finderPattern4.getEstimatedModuleSize();
                            float f14 = finderPattern5.getEstimatedModuleSize();
                            f12 = Math.min(f12, f14);
                            f11 /= f12;
                            f12 = finderPattern4.getEstimatedModuleSize();
                            f14 = finderPattern5.getEstimatedModuleSize();
                            f12 = Math.abs(f12 - f14);
                            f14 = 0.05f;
                            float f15 = 0.5f;
                            float f16 = f12 - f15;
                            Object object2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                            if (object2 > 0 && (f8 = f11 == f14 ? 0 : (f11 > f14 ? 1 : -1)) >= 0) {
                                break;
                            }
                            f8 = n14 + 1;
                            while (true) {
                                if (f8 >= n8) break;
                                Object object3 = (FinderPattern)object.get((int)f8);
                                if (object3 != null) {
                                    float f17;
                                    float f18 = finderPattern5.getEstimatedModuleSize();
                                    float f19 = ((FinderPattern)object3).getEstimatedModuleSize();
                                    f18 -= f19;
                                    f5 = finderPattern5.getEstimatedModuleSize();
                                    f7 = ((FinderPattern)object3).getEstimatedModuleSize();
                                    f5 = Math.min(f5, f7);
                                    f18 /= f5;
                                    f5 = finderPattern5.getEstimatedModuleSize();
                                    f7 = ((FinderPattern)object3).getEstimatedModuleSize();
                                    float f20 = (f5 = Math.abs(f5 - f7)) - f15;
                                    n4 = (int)(f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1));
                                    if (n4 > 0 && (n4 = (int)(f18 == f14 ? 0 : (f18 > f14 ? 1 : -1))) >= 0) {
                                        break;
                                    }
                                    finderPatternArrayArray = new FinderPattern[n3];
                                    finderPatternArrayArray[0] = finderPattern4;
                                    finderPatternArrayArray[1] = finderPattern5;
                                    n7 = 2;
                                    finderPatternArrayArray[n7] = object3;
                                    ResultPoint.orderBestPatterns((ResultPoint[])finderPatternArrayArray);
                                    object3 = new FinderPatternInfo((FinderPattern[])finderPatternArrayArray);
                                    FinderPattern finderPattern6 = ((FinderPatternInfo)object3).getTopLeft();
                                    finderPattern = ((FinderPatternInfo)object3).getBottomLeft();
                                    f6 = ResultPoint.distance(finderPattern6, finderPattern);
                                    finderPattern6 = ((FinderPatternInfo)object3).getTopRight();
                                    FinderPattern finderPattern7 = ((FinderPatternInfo)object3).getBottomLeft();
                                    f7 = ResultPoint.distance(finderPattern6, finderPattern7);
                                    finderPattern6 = ((FinderPatternInfo)object3).getTopLeft();
                                    object3 = ((FinderPatternInfo)object3).getTopRight();
                                    f12 = ResultPoint.distance(finderPattern6, (ResultPoint)object3);
                                    f18 = f6 + f12;
                                    float f22 = finderPattern4.getEstimatedModuleSize();
                                    float f23 = 2.0f;
                                    f22 = 180.0f;
                                    float f24 = (f17 = (f18 /= (f22 *= f23)) - f22) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                                    if (f24 <= 0) {
                                        f24 = 0x41100000;
                                        f22 = 9.0f;
                                        float f25 = f18 - f22;
                                        Object object4 = f25 == 0.0f ? 0 : (f25 < 0.0f ? -1 : 1);
                                        if (object4 >= 0) {
                                            f18 = f6 - f12;
                                            f22 = Math.min(f6, f12);
                                            f18 = Math.abs(f18 / f22);
                                            f24 = 0x3DCCCCCD;
                                            f22 = 0.1f;
                                            float f26 = f18 - f22;
                                            object4 = f26 == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1);
                                            if (object4 < 0) {
                                                f6 *= f6;
                                                double d2 = f12 * f12 + f6;
                                                double d5 = Math.sqrt(d2);
                                                f12 = (float)d5;
                                                f14 = f7 - f12;
                                                f7 = Math.min(f7, f12);
                                                float f27 = (f7 = Math.abs(f14 /= f7)) - f22;
                                                n7 = (int)(f27 == 0.0f ? 0 : (f27 > 0.0f ? 1 : -1));
                                                if (n7 < 0) {
                                                    ((ArrayList)serializable).add(finderPatternArrayArray);
                                                }
                                            }
                                        }
                                    }
                                }
                                ++f8;
                                n4 = 2;
                                f5 = 2.8E-45f;
                                f6 = 0.0f;
                                finderPattern = null;
                                n7 = 1;
                                f7 = Float.MIN_VALUE;
                                f14 = 0.05f;
                                f15 = 0.5f;
                            }
                        }
                        n4 = 1;
                        f5 = Float.MIN_VALUE;
                        n14 += n4;
                        n4 = 2;
                        f5 = 2.8E-45f;
                        f6 = 0.0f;
                        finderPattern = null;
                        n7 = 1;
                        f7 = Float.MIN_VALUE;
                    }
                }
                n4 = 1;
                f5 = Float.MIN_VALUE;
                n4 = 2;
                f5 = 2.8E-45f;
                f6 = 0.0f;
                finderPattern = null;
                n7 = 1;
                f7 = Float.MIN_VALUE;
            }
            n4 = (int)(((ArrayList)serializable).isEmpty() ? 1 : 0);
            if (n4 == 0) {
                finderPatternArrayArray = new FinderPattern[((ArrayList)serializable).size()][];
                return (FinderPattern[][])((ArrayList)serializable).toArray((T[])finderPatternArrayArray);
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public FinderPatternInfo[] findMulti(Map finderPatternArray) {
        Object object;
        int n3;
        int n4 = 0;
        int n7 = 1;
        if (finderPatternArray != null && (n3 = finderPatternArray.containsKey(object = DecodeHintType.TRY_HARDER)) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            finderPatternArray = null;
        }
        object = this.getImage();
        int n8 = ((BitMatrix)object).getHeight();
        int n10 = ((BitMatrix)object).getWidth();
        int n14 = n8 * 3 / 388;
        int n15 = 3;
        if (n14 < n15 || n3 != 0) {
            n14 = 3;
        }
        n3 = 5;
        finderPatternArray = (FinderPattern[][])new int[n3];
        for (int i3 = n14 + -1; i3 < n8; i3 += n14) {
            int n16;
            this.clearCounts((int[])finderPatternArray);
            int n17 = 0;
            for (n16 = 0; n16 < n10; ++n16) {
                Object object2 = ((BitMatrix)object).get(n16, i3);
                if (object2 != 0) {
                    object2 = n17 & 1;
                    if (object2 == n7) {
                        ++n17;
                    }
                    object2 = finderPatternArray[n17] + n7;
                    finderPatternArray[n17] = (FinderPattern[])object2;
                    continue;
                }
                object2 = n17 & 1;
                if (object2 == 0) {
                    object2 = 4;
                    if (n17 == object2) {
                        n17 = (int)(FinderPatternFinder.foundPatternCross((int[])finderPatternArray) ? 1 : 0);
                        if (n17 != 0 && (n17 = (int)(this.handlePossibleCenter((int[])finderPatternArray, i3, n16) ? 1 : 0)) != 0) {
                            this.clearCounts((int[])finderPatternArray);
                            n17 = 0;
                            continue;
                        }
                        this.shiftCounts2((int[])finderPatternArray);
                        n17 = 3;
                        continue;
                    }
                    object2 = finderPatternArray[++n17] + n7;
                    finderPatternArray[n17] = (FinderPattern[])object2;
                    continue;
                }
                object2 = finderPatternArray[n17] + n7;
                finderPatternArray[n17] = (FinderPattern[])object2;
            }
            n16 = (int)(FinderPatternFinder.foundPatternCross((int[])finderPatternArray) ? 1 : 0);
            if (n16 == 0) continue;
            this.handlePossibleCenter((int[])finderPatternArray, i3, n10);
        }
        finderPatternArray = this.selectMutipleBestPatterns();
        ArrayList<FinderPatternInfo> arrayList = new ArrayList<FinderPatternInfo>();
        int n18 = finderPatternArray.length;
        while (n4 < n18) {
            ResultPoint[] resultPointArray = finderPatternArray[n4];
            ResultPoint.orderBestPatterns(resultPointArray);
            FinderPatternInfo finderPatternInfo = new FinderPatternInfo((FinderPattern[])resultPointArray);
            arrayList.add(finderPatternInfo);
            ++n4;
        }
        n3 = (int)(arrayList.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            return EMPTY_RESULT_ARRAY;
        }
        finderPatternArray = new FinderPatternInfo[arrayList.size()];
        return (FinderPatternInfo[])arrayList.toArray((T[])finderPatternArray);
    }
}

