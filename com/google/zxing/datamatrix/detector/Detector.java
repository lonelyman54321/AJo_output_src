/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.datamatrix.detector.Detector$ResultPointsAndTransitions;
import com.google.zxing.datamatrix.detector.Detector$ResultPointsAndTransitionsComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Detector {
    private final BitMatrix image;
    private final WhiteRectangleDetector rectangleDetector;

    public Detector(BitMatrix bitMatrix) {
        WhiteRectangleDetector whiteRectangleDetector;
        this.image = bitMatrix;
        this.rectangleDetector = whiteRectangleDetector = new WhiteRectangleDetector(bitMatrix);
    }

    private ResultPoint correctTopRight(ResultPoint object, ResultPoint object2, ResultPoint object3, ResultPoint object4, int n3) {
        int n4 = Detector.distance((ResultPoint)object, (ResultPoint)object2);
        float f5 = n4;
        float f6 = n3;
        f5 /= f6;
        int n7 = Detector.distance((ResultPoint)object3, (ResultPoint)object4);
        float f7 = ((ResultPoint)object4).getX();
        float f8 = ((ResultPoint)object3).getX();
        f7 -= f8;
        float f11 = n7;
        f7 /= f11;
        f8 = ((ResultPoint)object4).getY();
        float f12 = ((ResultPoint)object3).getY();
        f8 = (f8 - f12) / f11;
        f12 = ((ResultPoint)object4).getX();
        f7 = f7 * f5 + f12;
        f12 = ((ResultPoint)object4).getY();
        f5 = f5 * f8 + f12;
        ResultPoint resultPoint = new ResultPoint(f7, f5);
        float f14 = (float)Detector.distance((ResultPoint)object, (ResultPoint)object3) / f6;
        n3 = Detector.distance((ResultPoint)object2, (ResultPoint)object4);
        f5 = ((ResultPoint)object4).getX();
        f7 = ((ResultPoint)object2).getX();
        f5 -= f7;
        f6 = n3;
        f5 /= f6;
        f7 = ((ResultPoint)object4).getY();
        f8 = ((ResultPoint)object2).getY();
        f7 = (f7 - f8) / f6;
        f8 = ((ResultPoint)object4).getX();
        f5 = f5 * f14 + f8;
        float f15 = ((ResultPoint)object4).getY();
        f14 = f14 * f7 + f15;
        ResultPoint resultPoint2 = new ResultPoint(f5, f14);
        int n8 = this.isValid(resultPoint);
        if (n8 == 0) {
            n8 = this.isValid(resultPoint2);
            if (n8 != 0) {
                return resultPoint2;
            }
            return null;
        }
        n8 = this.isValid(resultPoint2);
        if (n8 == 0) {
            return resultPoint;
        }
        object = this.transitionsBetween((ResultPoint)object3, resultPoint);
        n8 = ((Detector$ResultPointsAndTransitions)object).getTransitions();
        object4 = this.transitionsBetween((ResultPoint)object2, resultPoint);
        int n10 = ((Detector$ResultPointsAndTransitions)object4).getTransitions();
        n8 = Math.abs(n8 - n10);
        object3 = this.transitionsBetween((ResultPoint)object3, resultPoint2);
        int n14 = ((Detector$ResultPointsAndTransitions)object3).getTransitions();
        object2 = this.transitionsBetween((ResultPoint)object2, resultPoint2);
        int n15 = ((Detector$ResultPointsAndTransitions)object2).getTransitions();
        if (n8 <= (n15 = Math.abs(n14 -= n15))) {
            return resultPoint;
        }
        return resultPoint2;
    }

    private ResultPoint correctTopRightRectangular(ResultPoint object, ResultPoint object2, ResultPoint resultPoint, ResultPoint object3, int n3, int n4) {
        float f5 = Detector.distance((ResultPoint)object, (ResultPoint)object2);
        float f6 = n3;
        f5 /= f6;
        int n7 = Detector.distance(resultPoint, (ResultPoint)object3);
        float f7 = ((ResultPoint)object3).getX();
        float f8 = resultPoint.getX();
        f7 -= f8;
        f6 = n7;
        f7 /= f6;
        f8 = ((ResultPoint)object3).getY();
        float f11 = resultPoint.getY();
        f8 = (f8 - f11) / f6;
        f11 = ((ResultPoint)object3).getX();
        f7 = f7 * f5 + f11;
        f11 = ((ResultPoint)object3).getY();
        f5 = f5 * f8 + f11;
        ResultPoint resultPoint2 = new ResultPoint(f7, f5);
        float f12 = Detector.distance((ResultPoint)object, resultPoint);
        f5 = n4;
        f12 /= f5;
        int n8 = Detector.distance((ResultPoint)object2, (ResultPoint)object3);
        f7 = ((ResultPoint)object3).getX();
        f8 = ((ResultPoint)object2).getX();
        f7 -= f8;
        f5 = n8;
        f7 /= f5;
        f8 = ((ResultPoint)object3).getY();
        f11 = ((ResultPoint)object2).getY();
        f8 = (f8 - f11) / f5;
        f11 = ((ResultPoint)object3).getX();
        f7 = f7 * f12 + f11;
        float f14 = ((ResultPoint)object3).getY();
        f12 = f12 * f8 + f14;
        ResultPoint resultPoint3 = new ResultPoint(f7, f12);
        int n10 = this.isValid(resultPoint2);
        if (n10 == 0) {
            n10 = this.isValid(resultPoint3);
            if (n10 != 0) {
                return resultPoint3;
            }
            return null;
        }
        n10 = this.isValid(resultPoint3);
        if (n10 == 0) {
            return resultPoint2;
        }
        n10 = this.transitionsBetween(resultPoint, resultPoint2).getTransitions();
        n10 = Math.abs(n3 - n10);
        object3 = this.transitionsBetween((ResultPoint)object2, resultPoint2);
        int n14 = ((Detector$ResultPointsAndTransitions)object3).getTransitions();
        n14 = Math.abs(n4 - n14) + n10;
        object = this.transitionsBetween(resultPoint, resultPoint3);
        n10 = ((Detector$ResultPointsAndTransitions)object).getTransitions();
        n3 -= n10;
        n10 = Math.abs(n3);
        object2 = this.transitionsBetween((ResultPoint)object2, resultPoint3);
        int n15 = ((Detector$ResultPointsAndTransitions)object2).getTransitions();
        if (n14 <= (n15 = Math.abs(n4 -= n15) + n10)) {
            return resultPoint2;
        }
        return resultPoint3;
    }

    private static int distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2));
    }

    private static void increment(Map map2, ResultPoint resultPoint) {
        Integer n3 = (Integer)map2.get(resultPoint);
        int n4 = 1;
        if (n3 != null) {
            int n7 = n3;
            n4 += n7;
        }
        n3 = n4;
        map2.put(resultPoint, n3);
    }

    private boolean isValid(ResultPoint resultPoint) {
        BitMatrix bitMatrix;
        float f5;
        float f6;
        float f7;
        float f8;
        BitMatrix bitMatrix2;
        int n3;
        float f11;
        float f12;
        float f14 = resultPoint.getX();
        float f15 = f14 - 0.0f;
        Object object = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        return object >= 0 && (object = (f12 = (f14 = resultPoint.getX()) - (f11 = (float)(n3 = (bitMatrix2 = this.image).getWidth()))) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) < 0 && (object = (f8 = (f14 = resultPoint.getY()) - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) > 0 && (f7 = (f6 = (f5 = resultPoint.getY()) - (f14 = (float)(object = (Object)(bitMatrix = this.image).getHeight()))) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) < 0;
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int n3, int n4) {
        GridSampler gridSampler = GridSampler.getInstance();
        float f5 = n3;
        float f6 = 0.5f;
        float f7 = f5 - f6;
        float f8 = (float)n4 - f6;
        float f11 = resultPoint.getX();
        float f12 = resultPoint.getY();
        float f14 = resultPoint4.getX();
        float f15 = resultPoint4.getY();
        float f16 = resultPoint3.getX();
        float f17 = resultPoint3.getY();
        float f18 = resultPoint2.getX();
        float f19 = resultPoint2.getY();
        return gridSampler.sampleGrid(bitMatrix, n3, n4, 0.5f, f6, f7, 0.5f, f7, f8, 0.5f, f8, f11, f12, f14, f15, f16, f17, f18, f19);
    }

    private Detector$ResultPointsAndTransitions transitionsBetween(ResultPoint resultPoint, ResultPoint resultPoint2) {
        Detector detector = this;
        float f5 = resultPoint.getX();
        int n3 = (int)f5;
        float f6 = resultPoint.getY();
        int n4 = (int)f6;
        float f7 = resultPoint2.getX();
        int n7 = (int)f7;
        float f8 = resultPoint2.getY();
        int n8 = (int)f8;
        int n10 = Math.abs(n8 - n4);
        int n14 = Math.abs(n7 - n3);
        int n15 = 0;
        int n16 = 1;
        if ((n10 = n10 > n14 ? 1 : 0) != 0) {
            int n17 = n4;
            n4 = n3;
            n3 = n17;
            int n18 = n8;
            n8 = n7;
            n7 = n18;
        }
        n14 = Math.abs(n7 - n3);
        int n19 = Math.abs(n8 - n4);
        int n20 = -n14 / 2;
        int n21 = -1;
        int n22 = n4 < n8 ? 1 : -1;
        if (n3 >= n7) {
            n16 = -1;
        }
        BitMatrix bitMatrix = detector.image;
        int n24 = n10 != 0 ? n4 : n3;
        int n25 = n10 != 0 ? n3 : n4;
        n21 = (int)(bitMatrix.get(n24, n25) ? 1 : 0);
        while (n3 != n7) {
            int n26;
            BitMatrix bitMatrix2 = detector.image;
            n25 = n10 != 0 ? n4 : n3;
            n24 = (int)(bitMatrix2.get(n25, n26 = n10 != 0 ? n3 : n4) ? 1 : 0);
            if (n24 != n21) {
                ++n15;
                n21 = n24;
            }
            if ((n20 += n19) > 0) {
                if (n4 == n8) break;
                n4 += n22;
                n20 -= n14;
            }
            n3 += n16;
        }
        Detector$ResultPointsAndTransitions detector$ResultPointsAndTransitions = new Detector$ResultPointsAndTransitions(resultPoint, resultPoint2, n15, null);
        return detector$ResultPointsAndTransitions;
    }

    public DetectorResult detect() {
        ResultPoint resultPoint;
        Object object;
        int n3;
        Detector detector = this;
        Object object2 = this.rectangleDetector.detect();
        Object object3 = object2[0];
        int n4 = 1;
        ResultPoint[] resultPointArray = object2[n4];
        int n7 = 2;
        ResultPoint resultPoint2 = object2[n7];
        int n8 = 3;
        object2 = object2[n8];
        int n10 = 4;
        Object object4 = new ArrayList(n10);
        Object object5 = this.transitionsBetween((ResultPoint)object3, (ResultPoint)resultPointArray);
        object4.add(object5);
        object5 = this.transitionsBetween((ResultPoint)object3, resultPoint2);
        object4.add(object5);
        object5 = this.transitionsBetween((ResultPoint)resultPointArray, (ResultPoint)object2);
        object4.add(object5);
        object5 = this.transitionsBetween(resultPoint2, (ResultPoint)object2);
        object4.add(object5);
        ResultPoint resultPoint3 = null;
        object5 = new Detector$ResultPointsAndTransitionsComparator(null);
        Collections.sort(object4, object5);
        object5 = (Detector$ResultPointsAndTransitions)object4.get(0);
        object4 = (Detector$ResultPointsAndTransitions)object4.get(n4);
        Object object6 = new HashMap();
        ResultPoint resultPoint4 = ((Detector$ResultPointsAndTransitions)object5).getFrom();
        Detector.increment(object6, resultPoint4);
        object5 = ((Detector$ResultPointsAndTransitions)object5).getTo();
        Detector.increment(object6, (ResultPoint)object5);
        object5 = object4.getFrom();
        Detector.increment(object6, (ResultPoint)object5);
        object4 = object4.getTo();
        Detector.increment(object6, (ResultPoint)object4);
        object4 = ((HashMap)object6).entrySet().iterator();
        int n14 = 0;
        object5 = null;
        resultPoint4 = null;
        while ((n3 = object4.hasNext()) != 0) {
            object = object4.next();
            resultPoint = (ResultPoint)object.getKey();
            n3 = (Integer)(object = (Integer)object.getValue());
            if (n3 == n7) {
                object5 = resultPoint;
                continue;
            }
            if (resultPoint3 == null) {
                resultPoint3 = resultPoint;
                continue;
            }
            resultPoint4 = resultPoint;
        }
        if (resultPoint3 != null && object5 != null && resultPoint4 != null) {
            ResultPoint resultPoint5;
            int n15;
            object4 = new ResultPoint[n8];
            object4[0] = resultPoint3;
            object4[n4] = object5;
            object4[n7] = resultPoint4;
            ResultPoint.orderBestPatterns(object4);
            resultPoint4 = object4[0];
            ResultPoint resultPoint6 = object4[n4];
            resultPoint3 = object4[n7];
            boolean bl2 = ((HashMap)object6).containsKey(object3);
            object6 = !bl2 ? object3 : ((n15 = ((HashMap)object6).containsKey(resultPointArray)) == 0 ? resultPointArray : ((n15 = ((HashMap)object6).containsKey(resultPoint2)) == 0 ? resultPoint2 : object2));
            object2 = detector.transitionsBetween(resultPoint3, (ResultPoint)object6);
            int n16 = ((Detector$ResultPointsAndTransitions)object2).getTransitions();
            object3 = detector.transitionsBetween(resultPoint4, (ResultPoint)object6);
            n15 = ((Detector$ResultPointsAndTransitions)object3).getTransitions();
            int n17 = n16 & 1;
            if (n17 == n4) {
                n16 += n4;
            }
            n14 = n16 + 2;
            n16 = n15 & 1;
            if (n16 == n4) {
                n15 += n4;
            }
            if ((n16 = n14 * 4) < (n15 = (n3 = n15 + 2) * 7) && (n16 = n3 * 4) < (n15 = n14 * 7)) {
                n14 = Math.min(n3, n14);
                object2 = this;
                object3 = resultPoint6;
                resultPointArray = resultPoint4;
                resultPoint2 = resultPoint3;
                object4 = object6;
                object2 = this.correctTopRight(resultPoint6, resultPoint4, resultPoint3, (ResultPoint)object6, n14);
                if (object2 != null) {
                    object6 = object2;
                }
                object2 = detector.transitionsBetween(resultPoint3, (ResultPoint)object6);
                n16 = ((Detector$ResultPointsAndTransitions)object2).getTransitions();
                object3 = detector.transitionsBetween(resultPoint4, (ResultPoint)object6);
                n15 = ((Detector$ResultPointsAndTransitions)object3).getTransitions();
                n16 = Math.max(n16, n15);
                n15 = n16 + 1;
                n17 = n15 & 1;
                int n18 = n17 == n4 ? (n16 += n7) : n15;
                object = detector.image;
                resultPoint = resultPoint3;
                int n19 = n18;
                object2 = Detector.sampleGrid((BitMatrix)object, resultPoint3, resultPoint6, resultPoint4, (ResultPoint)object6, n18, n18);
                resultPoint5 = resultPoint3;
            } else {
                object2 = this;
                object3 = resultPoint6;
                resultPointArray = resultPoint4;
                resultPoint2 = resultPoint3;
                object4 = object6;
                resultPoint5 = resultPoint3;
                object2 = this.correctTopRightRectangular(resultPoint6, resultPoint4, resultPoint3, (ResultPoint)object6, n14, n3);
                if (object2 != null) {
                    object6 = object2;
                }
                object2 = detector.transitionsBetween(resultPoint5, (ResultPoint)object6);
                n16 = ((Detector$ResultPointsAndTransitions)object2).getTransitions();
                object3 = detector.transitionsBetween(resultPoint4, (ResultPoint)object6);
                n15 = ((Detector$ResultPointsAndTransitions)object3).getTransitions();
                n17 = n16 & 1;
                if (n17 == n4) {
                    n16 += n4;
                }
                int n20 = n16;
                n16 = n15 & 1;
                if (n16 == n4) {
                    n15 += n4;
                }
                int n21 = n15;
                object = detector.image;
                resultPoint = resultPoint5;
                object2 = Detector.sampleGrid((BitMatrix)object, resultPoint5, resultPoint6, resultPoint4, (ResultPoint)object6, n20, n15);
            }
            resultPointArray = new ResultPoint[n10];
            resultPointArray[0] = resultPoint5;
            resultPointArray[n4] = resultPoint6;
            resultPointArray[n7] = resultPoint4;
            resultPointArray[3] = object6;
            object3 = new DetectorResult((BitMatrix)object2, resultPointArray);
            return object3;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

