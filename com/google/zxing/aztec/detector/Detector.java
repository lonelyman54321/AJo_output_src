/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.aztec.detector.Detector$Point;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

public final class Detector {
    private static final int[] EXPECTED_CORNER_BITS = new int[]{3808, 476, 2107, 1799};
    private boolean compact;
    private final BitMatrix image;
    private int nbCenterLayers;
    private int nbDataBlocks;
    private int nbLayers;
    private int shift;

    public Detector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    private static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float f5 = resultPoint.getX();
        float f6 = resultPoint.getY();
        float f7 = resultPoint2.getX();
        float f8 = resultPoint2.getY();
        return MathUtils.distance(f5, f6, f7, f8);
    }

    private static float distance(Detector$Point detector$Point, Detector$Point detector$Point2) {
        int n3 = detector$Point.getX();
        int n4 = detector$Point.getY();
        int n7 = detector$Point2.getX();
        int n8 = detector$Point2.getY();
        return MathUtils.distance(n3, n4, n7, n8);
    }

    private static ResultPoint[] expandSquare(ResultPoint[] resultPointArray, int n3, int n4) {
        float f5 = n4;
        float f6 = n3;
        float f7 = 2.0f;
        f5 /= (f6 *= f7);
        float f8 = resultPointArray[0].getX();
        int n7 = 2;
        float f11 = resultPointArray[n7].getX();
        f8 -= f11;
        f11 = resultPointArray[0].getY();
        float f12 = resultPointArray[n7].getY();
        f11 -= f12;
        f12 = resultPointArray[0].getX();
        float f14 = (resultPointArray[n7].getX() + f12) / f7;
        f12 = resultPointArray[0].getY();
        float f15 = (resultPointArray[n7].getY() + f12) / f7;
        float f16 = f14 + (f8 *= f5);
        float f17 = f15 + (f11 *= f5);
        ResultPoint resultPoint = new ResultPoint(f16, f17);
        ResultPoint resultPoint2 = new ResultPoint(f14 -= f8, f15 -= f11);
        int n8 = 1;
        f11 = resultPointArray[n8].getX();
        int n10 = 3;
        f15 = resultPointArray[n10].getX();
        f11 -= f15;
        f15 = resultPointArray[n8].getY();
        f17 = resultPointArray[n10].getY();
        f15 -= f17;
        f17 = resultPointArray[n8].getX();
        float f18 = (resultPointArray[n10].getX() + f17) / f7;
        f17 = resultPointArray[n8].getY();
        float f19 = (resultPointArray[n10].getY() + f17) / f7;
        f17 = f18 + (f11 *= f5);
        f5 *= f15;
        f15 = f19 + f5;
        ResultPoint resultPoint3 = new ResultPoint(f17, f15);
        ResultPoint resultPoint4 = new ResultPoint(f18 -= f11, f19 -= f5);
        resultPointArray = new ResultPoint[4];
        resultPointArray[0] = resultPoint;
        resultPointArray[n8] = resultPoint3;
        resultPointArray[n7] = resultPoint2;
        resultPointArray[n10] = resultPoint4;
        return resultPointArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void extractParameters(ResultPoint[] object) {
        int n3;
        int n4;
        long l2;
        long l3;
        int[] nArray;
        int n7;
        int n8;
        ResultPoint resultPoint;
        boolean bl2;
        ResultPoint resultPoint2;
        int n10;
        ResultPoint resultPoint3;
        int n14;
        ResultPoint resultPoint4 = object[0];
        int n15 = (int)(this.isValid(resultPoint4) ? 1 : 0);
        if (n15 != 0 && (n14 = this.isValid(resultPoint3 = object[n15 = 1])) != 0 && (n10 = this.isValid(resultPoint2 = object[n14 = 2])) != 0 && (bl2 = this.isValid(resultPoint = object[n10 = 3]))) {
            int n16 = this.nbCenterLayers * 2;
            ResultPoint resultPoint5 = object[0];
            ResultPoint resultPoint6 = object[n15];
            n8 = this.sampleLine(resultPoint5, resultPoint6, n16);
            resultPoint6 = object[n15];
            ResultPoint resultPoint7 = object[n14];
            int n17 = this.sampleLine(resultPoint6, resultPoint7, n16);
            resultPoint3 = object[n14];
            resultPoint7 = object[n10];
            n14 = this.sampleLine(resultPoint3, resultPoint7, n16);
            resultPoint2 = object[n10];
            ResultPoint resultPoint8 = object[0];
            n7 = this.sampleLine(resultPoint2, resultPoint8, n16);
            nArray = new int[]{n8, n17, n14, n7};
            this.shift = n14 = Detector.getRotation(nArray, n16);
            l3 = 0L;
        } else {
            throw NotFoundException.getNotFoundInstance();
        }
        for (n4 = 0; n4 < (n3 = 4); l3 += l2, ++n4) {
            n8 = (this.shift + n4) % n3;
            n3 = nArray[n8];
            n8 = (int)(this.compact ? 1 : 0);
            if (n8 != 0) {
                n8 = 7;
                l3 <<= n8;
                n3 = n3 >> 1 & 0x7F;
                l2 = n3;
                continue;
            }
            l3 <<= 10;
            n8 = n3 >> 2 & 0x3E0;
            n3 = n3 >> 1 & 0x1F;
            l2 = n8 += n3;
        }
        n7 = (int)(this.compact ? 1 : 0);
        n7 = Detector.getCorrectedParameterData(l3, n7 != 0);
        n4 = (int)(this.compact ? 1 : 0);
        if (n4 != 0) {
            this.nbLayers = n4 = (n7 >> 6) + n15;
            this.nbDataBlocks = n7 = (n7 & 0x3F) + n15;
            return;
        }
        this.nbLayers = n4 = (n7 >> 11) + n15;
        this.nbDataBlocks = n7 = (n7 & 0x7FF) + n15;
    }

    private ResultPoint[] getBullsEyeCorners(Detector$Point resultPointArray) {
        ResultPoint resultPoint;
        int n3;
        float f5;
        float f6;
        int n4;
        int n7;
        int n8;
        Detector detector = this;
        int n10 = 0;
        int n14 = 2;
        this.nbCenterLayers = n8 = 1;
        Object object = resultPointArray;
        Object object2 = resultPointArray;
        Object object3 = resultPointArray;
        ResultPoint[] resultPointArray2 = resultPointArray;
        int n15 = 1;
        float f7 = Float.MIN_VALUE;
        while ((n7 = detector.nbCenterLayers) < (n4 = 9)) {
            n7 = -1;
            f6 = 0.0f / 0.0f;
            Detector$Point detector$Point = detector.getFirstDifferent((Detector$Point)object, n15 != 0, n8, n7);
            Detector$Point detector$Point2 = detector.getFirstDifferent((Detector$Point)object2, n15 != 0, n8, n8);
            Detector$Point detector$Point3 = detector.getFirstDifferent((Detector$Point)object3, n15 != 0, n7, n8);
            Detector$Point detector$Point4 = detector.getFirstDifferent((Detector$Point)resultPointArray2, n15 != 0, n7, n7);
            int n16 = detector.nbCenterLayers;
            if (n16 > n14) {
                double d2;
                float f8 = Detector.distance(detector$Point4, detector$Point);
                int n17 = detector.nbCenterLayers;
                float f11 = n17;
                f8 *= f11;
                f11 = Detector.distance((Detector$Point)resultPointArray2, (Detector$Point)object);
                f5 = detector.nbCenterLayers + n14;
                double d5 = f8 /= (f11 *= f5);
                double d7 = 0.75;
                double d9 = d5 - d7;
                n3 = (int)(d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1));
                if (n3 < 0 || (n3 = (int)((d2 = d5 - (d7 = 1.25)) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1))) > 0 || (n3 = (int)(detector.isWhiteOrBlackRectangle(detector$Point, detector$Point2, detector$Point3, detector$Point4) ? 1 : 0)) == 0) break;
            }
            n15 ^= n8;
            detector.nbCenterLayers = n3 = detector.nbCenterLayers + n8;
            resultPointArray2 = detector$Point4;
            object = detector$Point;
            object2 = detector$Point2;
            object3 = detector$Point3;
        }
        n3 = detector.nbCenterLayers;
        n15 = 5;
        f7 = 7.0E-45f;
        if (n3 != n15) {
            n7 = 7;
            f6 = 9.8E-45f;
            if (n3 != n7) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (n3 == n15) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
            resultPoint = null;
        }
        detector.compact = n3;
        f7 = ((Detector$Point)object).getX();
        f6 = 0.5f;
        float f12 = (float)((Detector$Point)object).getY() - f6;
        resultPoint = new ResultPoint(f7 += f6, f12);
        f7 = (float)((Detector$Point)object2).getX() + f6;
        float f14 = (float)((Detector$Point)object2).getY() + f6;
        object = new ResultPoint(f7, f14);
        f7 = (float)((Detector$Point)object3).getX() - f6;
        float f15 = (float)((Detector$Point)object3).getY() + f6;
        object2 = new ResultPoint(f7, f15);
        f7 = (float)resultPointArray2.getX() - f6;
        float f16 = (float)resultPointArray2.getY() - f6;
        object3 = new ResultPoint(f7, f16);
        resultPointArray2 = new ResultPoint[4];
        resultPointArray2[0] = resultPoint;
        resultPointArray2[n8] = object;
        resultPointArray2[n14] = object2;
        n3 = 3;
        resultPointArray2[n3] = object3;
        n10 = detector.nbCenterLayers;
        n8 = n10 * 2 - n3;
        return Detector.expandSquare(resultPointArray2, n8, n10 *= 2);
    }

    private int getColor(Detector$Point detector$Point, Detector$Point detector$Point2) {
        float f5;
        float f6 = Detector.distance(detector$Point, detector$Point2);
        int n3 = detector$Point2.getX();
        int n4 = detector$Point.getX();
        float f7 = (float)(n3 -= n4) / f6;
        int n7 = detector$Point2.getY();
        n4 = detector$Point.getY();
        float f8 = (float)(n7 -= n4) / f6;
        n4 = detector$Point.getX();
        float f11 = n4;
        int n8 = detector$Point.getY();
        float f12 = n8;
        BitMatrix bitMatrix = this.image;
        int n10 = detector$Point.getX();
        int n14 = detector$Point.getY();
        n14 = (int)(bitMatrix.get(n10, n14) ? 1 : 0);
        double d2 = Math.ceil(f6);
        int n15 = (int)d2;
        n10 = 0;
        int n16 = 0;
        for (int i3 = 0; i3 < n15; ++i3) {
            int n17;
            BitMatrix bitMatrix2 = this.image;
            int n18 = MathUtils.round(f11 += f7);
            int n19 = bitMatrix2.get(n18, n17 = MathUtils.round(f12 += f8));
            if (n19 == n14) continue;
            ++n16;
        }
        f8 = (float)n16 / f6;
        float f14 = f8 - (f6 = 0.1f);
        n3 = (int)(f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1));
        if (n3 > 0 && (n3 = (int)((f5 = f8 - (f7 = 0.9f)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1))) < 0) {
            return 0;
        }
        n3 = 1;
        f7 = Float.MIN_VALUE;
        n7 = (int)(f8 == f6 ? 0 : (f8 < f6 ? -1 : 1));
        if (n7 <= 0) {
            n10 = 1;
        }
        if (n10 == n14) {
            return n3;
        }
        return -1;
    }

    private static int getCorrectedParameterData(long l2, boolean n3) {
        int n4;
        int n7;
        int n8 = 4;
        if (n3 != 0) {
            n3 = 7;
            n7 = 2;
        } else {
            n3 = 10;
            n7 = 4;
        }
        int n10 = n3 - n7;
        int[] nArray = new int[n3];
        n3 += -1;
        while (n3 >= 0) {
            int n14;
            nArray[n3] = n14 = (int)l2 & 0xF;
            l2 >>= n8;
            n3 += -1;
        }
        GenericGF genericGF = GenericGF.AZTEC_PARAM;
        ReedSolomonDecoder reedSolomonDecoder = new ReedSolomonDecoder(genericGF);
        try {
            reedSolomonDecoder.decode(nArray, n10);
            reedSolomonDecoder = null;
            n4 = 0;
            genericGF = null;
        }
        catch (ReedSolomonException reedSolomonException) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i3 = 0; i3 < n7; ++i3) {
            n4 <<= 4;
            n3 = nArray[i3];
            n4 += n3;
        }
        return n4;
    }

    private int getDimension() {
        int n3 = this.compact;
        int n4 = 4;
        if (n3 != 0) {
            return this.nbLayers * 4 + 11;
        }
        n3 = this.nbLayers;
        if (n3 <= n4) {
            return n3 * 4 + 15;
        }
        int n7 = n3 * 4;
        return ((n3 - n4) / 8 + 1) * 2 + n7 + 15;
    }

    private Detector$Point getFirstDifferent(Detector$Point detector$Point, boolean n3, int n4, int n7) {
        BitMatrix bitMatrix;
        BitMatrix bitMatrix2;
        int n8;
        int n10 = detector$Point.getX() + n4;
        int n14 = detector$Point.getY();
        while ((n8 = this.isValid(n10, n14 += n7)) && (n8 = (bitMatrix2 = this.image).get(n10, n14)) == n3) {
            n10 += n4;
        }
        n10 -= n4;
        n14 -= n7;
        while ((n8 = this.isValid(n10, n14)) && (n8 = (bitMatrix2 = this.image).get(n10, n14)) == n3) {
            n10 += n4;
        }
        n10 -= n4;
        while ((n4 = (int)(this.isValid(n10, n14) ? 1 : 0)) != 0 && (n4 = (int)((bitMatrix = this.image).get(n10, n14) ? 1 : 0)) == n3) {
            n14 += n7;
        }
        Detector$Point detector$Point2 = new Detector$Point(n10, n14 -= n7);
        return detector$Point2;
    }

    private Detector$Point getMatrixCenter() {
        Object object;
        int n3;
        int n4;
        int n7;
        int n8;
        int n10 = 3;
        float f5 = 4.2E-45f;
        int n14 = 2;
        int n15 = -1;
        float f6 = 0.0f / 0.0f;
        int n16 = 1;
        float f7 = Float.MIN_VALUE;
        ResultPoint[] resultPointArray = this.image;
        Object object2 = new WhiteRectangleDetector((BitMatrix)resultPointArray);
        object2 = ((WhiteRectangleDetector)object2).detect();
        resultPointArray = object2[0];
        Object object3 = object2[n16];
        Object object4 = object2[n14];
        try {
            object2 = object2[n10];
        }
        catch (NotFoundException notFoundException) {
            n8 = this.image.getWidth() / n14;
            n7 = this.image.getHeight() / n14;
            n4 = n8 + 7;
            n3 = n7 + -7;
            object3 = new Detector$Point(n4, n3);
            object3 = this.getFirstDifferent((Detector$Point)object3, false, n16, n15).toResultPoint();
            Detector$Point detector$Point = new Detector$Point(n4, n7 += 7);
            object4 = this.getFirstDifferent(detector$Point, false, n16, n16).toResultPoint();
            detector$Point = new Detector$Point(n8 += -7, n7);
            resultPointArray = this.getFirstDifferent(detector$Point, false, n15, n16).toResultPoint();
            detector$Point = new Detector$Point(n8, n3);
            object2 = this.getFirstDifferent(detector$Point, false, n15, n15).toResultPoint();
            ResultPoint resultPoint = object4;
            object4 = resultPointArray;
            resultPointArray = object3;
            object3 = resultPoint;
        }
        float f8 = resultPointArray.getX();
        float f11 = ((ResultPoint)object2).getX() + f8;
        f8 = ((ResultPoint)object3).getX() + f11;
        f11 = ((ResultPoint)object4).getX() + f8;
        n3 = 0x40800000;
        f8 = 4.0f;
        int n17 = MathUtils.round(f11 /= f8);
        float f12 = resultPointArray.getY();
        float f14 = ((ResultPoint)object2).getY() + f12;
        f12 = ((ResultPoint)object3).getY() + f14;
        f14 = (((ResultPoint)object4).getY() + f12) / f8;
        n8 = MathUtils.round(f14);
        object3 = this.image;
        n4 = 15;
        resultPointArray = new WhiteRectangleDetector((BitMatrix)object3, n4, n17, n8);
        resultPointArray = resultPointArray.detect();
        object3 = resultPointArray[0];
        object4 = resultPointArray[n16];
        Object object5 = resultPointArray[n14];
        try {
            object = resultPointArray[n10];
        }
        catch (NotFoundException notFoundException) {
            n14 = n17 + 7;
            n7 = n8 + -7;
            object = new Detector$Point(n14, n7);
            object3 = this.getFirstDifferent((Detector$Point)object, false, n16, n15).toResultPoint();
            object = new Detector$Point(n14, n8 += 7);
            object4 = this.getFirstDifferent((Detector$Point)object, false, n16, n16).toResultPoint();
            object = new Detector$Point(n17 += -7, n8);
            object5 = this.getFirstDifferent((Detector$Point)object, false, n15, n16).toResultPoint();
            object = new Detector$Point(n17, n7);
            object = this.getFirstDifferent((Detector$Point)object, false, n15, n15).toResultPoint();
        }
        f6 = ((ResultPoint)object3).getX();
        f7 = ((ResultPoint)object).getX() + f6;
        f6 = ((ResultPoint)object4).getX() + f7;
        n15 = MathUtils.round((((ResultPoint)object5).getX() + f6) / f8);
        f7 = ((ResultPoint)object3).getY();
        f5 = ((ResultPoint)object).getY() + f7;
        f7 = ((ResultPoint)object4).getY() + f5;
        n10 = MathUtils.round((((ResultPoint)object5).getY() + f7) / f8);
        object5 = new Detector$Point(n15, n10);
        return object5;
    }

    private ResultPoint[] getMatrixCornerPoints(ResultPoint[] resultPointArray) {
        int n3 = this.nbCenterLayers * 2;
        int n4 = this.getDimension();
        return Detector.expandSquare(resultPointArray, n3, n4);
    }

    private static int getRotation(int[] nArray, int n3) {
        int n4;
        int n7 = nArray.length;
        int n8 = 0;
        int n10 = 0;
        int n14 = 0;
        while (true) {
            n4 = 2;
            if (n10 >= n7) break;
            int n15 = nArray[n10];
            n4 = n3 + -2;
            n4 = n15 >> n4 << 1;
            n14 = (n14 << 3) + (n4 += (n15 &= 1));
            ++n10;
        }
        int n16 = (n14 & 1) << 11;
        n3 = n14 >> 1;
        n16 += n3;
        while (n8 < (n3 = 4)) {
            int[] nArray2 = EXPECTED_CORNER_BITS;
            n3 = Integer.bitCount(nArray2[n8] ^ n16);
            if (n3 <= n4) {
                return n8;
            }
            ++n8;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private boolean isValid(int n3, int n4) {
        BitMatrix bitMatrix;
        BitMatrix bitMatrix2;
        int n7;
        return n3 >= 0 && n3 < (n7 = (bitMatrix2 = this.image).getWidth()) && n4 > 0 && n4 < (n3 = (bitMatrix = this.image).getHeight());
    }

    private boolean isValid(ResultPoint resultPoint) {
        int n3 = MathUtils.round(resultPoint.getX());
        int n4 = MathUtils.round(resultPoint.getY());
        return this.isValid(n3, n4);
    }

    private boolean isWhiteOrBlackRectangle(Detector$Point detector$Point, Detector$Point detector$Point2, Detector$Point detector$Point3, Detector$Point detector$Point4) {
        int n3 = detector$Point.getX() + -3;
        int n4 = detector$Point.getY() + 3;
        Detector$Point detector$Point5 = new Detector$Point(n3, n4);
        n3 = detector$Point2.getX() + -3;
        int n7 = detector$Point2.getY() + -3;
        detector$Point = new Detector$Point(n3, n7);
        n3 = detector$Point3.getX() + 3;
        int n8 = detector$Point3.getY() + -3;
        detector$Point2 = new Detector$Point(n3, n8);
        n3 = detector$Point4.getX() + 3;
        int n10 = detector$Point4.getY() + 3;
        detector$Point3 = new Detector$Point(n3, n10);
        n10 = this.getColor(detector$Point3, detector$Point5);
        n3 = 0;
        if (n10 == 0) {
            return false;
        }
        int n14 = this.getColor(detector$Point5, detector$Point);
        if (n14 != n10) {
            return false;
        }
        n4 = this.getColor(detector$Point, detector$Point2);
        if (n4 != n10) {
            return false;
        }
        n4 = this.getColor(detector$Point2, detector$Point3);
        return n4 == n10;
    }

    private BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        float f5;
        GridSampler gridSampler = GridSampler.getInstance();
        int n3 = this.getDimension();
        float f6 = (float)n3 / 2.0f;
        int n4 = this.nbCenterLayers;
        float f7 = n4;
        f7 = f5 = f6 - f7;
        float f8 = n4;
        f6 += f8;
        f8 = f6;
        float f11 = resultPoint.getX();
        float f12 = resultPoint.getY();
        float f14 = resultPoint2.getX();
        float f15 = resultPoint2.getY();
        float f16 = resultPoint3.getX();
        float f17 = resultPoint3.getY();
        float f18 = resultPoint4.getX();
        float f19 = resultPoint4.getY();
        return gridSampler.sampleGrid(bitMatrix, n3, n3, f5, f5, f6, f5, f6, f6, f5, f6, f11, f12, f14, f15, f16, f17, f18, f19);
    }

    private int sampleLine(ResultPoint resultPoint, ResultPoint resultPoint2, int n3) {
        float f5 = Detector.distance(resultPoint, resultPoint2);
        float f6 = n3;
        f6 = f5 / f6;
        float f7 = resultPoint.getX();
        float f8 = resultPoint.getY();
        float f11 = resultPoint2.getX();
        float f12 = resultPoint.getX();
        f11 = (f11 - f12) * f6 / f5;
        float f14 = resultPoint2.getY();
        float f15 = resultPoint.getY();
        f14 = (f14 - f15) * f6 / f5;
        f15 = 0.0f;
        resultPoint = null;
        int n4 = 0;
        f5 = 0.0f;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7;
            BitMatrix bitMatrix = this.image;
            f12 = i3;
            float f16 = f12 * f11 + f7;
            int n8 = MathUtils.round(f16);
            int n10 = bitMatrix.get(n8, n7 = MathUtils.round(f12 = f12 * f14 + f8));
            if (n10 == 0) continue;
            n10 = n3 - i3;
            n7 = 1;
            f12 = Float.MIN_VALUE;
            n10 -= n7;
            n10 = n7 << n10;
            n4 |= n10;
        }
        return n4;
    }

    public AztecDetectorResult detect() {
        return this.detect(false);
    }

    public AztecDetectorResult detect(boolean bl2) {
        ResultPoint resultPoint;
        int n3;
        Object object;
        int n4;
        Object object2 = this.getMatrixCenter();
        ResultPoint[] resultPointArray = this.getBullsEyeCorners((Detector$Point)object2);
        if (bl2) {
            n4 = 0;
            object2 = null;
            object = resultPointArray[0];
            n3 = 2;
            resultPointArray[0] = resultPoint = resultPointArray[n3];
            resultPointArray[n3] = object;
        }
        this.extractParameters(resultPointArray);
        object = this.image;
        n4 = this.shift;
        n3 = n4 % 4;
        ResultPoint resultPoint2 = resultPointArray[n3];
        int n7 = (n4 + 1) % 4;
        resultPoint = resultPointArray[n7];
        int n8 = (n4 + 2) % 4;
        ResultPoint resultPoint3 = resultPointArray[n8];
        n4 = (n4 + 3) % 4;
        ResultPoint resultPoint4 = resultPointArray[n4];
        object2 = this;
        BitMatrix bitMatrix = this.sampleGrid((BitMatrix)object, resultPoint2, resultPoint, resultPoint3, resultPoint4);
        ResultPoint[] resultPointArray2 = this.getMatrixCornerPoints(resultPointArray);
        boolean bl3 = this.compact;
        int n10 = this.nbDataBlocks;
        int n14 = this.nbLayers;
        object2 = new AztecDetectorResult(bitMatrix, resultPointArray2, bl3, n10, n14);
        return object2;
    }
}

