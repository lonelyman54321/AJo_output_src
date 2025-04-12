/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.detector.AlignmentPattern;
import com.google.zxing.qrcode.detector.AlignmentPatternFinder;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.util.Map;

public class Detector {
    private final BitMatrix image;
    private ResultPointCallback resultPointCallback;

    public Detector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    private float calculateModuleSizeOneWay(ResultPoint resultPoint, ResultPoint resultPoint2) {
        int n3 = (int)resultPoint.getX();
        int n4 = (int)resultPoint.getY();
        int n7 = (int)resultPoint2.getX();
        float f5 = resultPoint2.getY();
        int n8 = (int)f5;
        float f6 = this.sizeOfBlackWhiteBlackRunBothWays(n3, n4, n7, n8);
        n4 = (int)resultPoint2.getX();
        float f7 = resultPoint2.getY();
        int n10 = (int)f7;
        float f8 = resultPoint.getX();
        n7 = (int)f8;
        int n14 = (int)resultPoint.getY();
        float f11 = this.sizeOfBlackWhiteBlackRunBothWays(n4, n10, n7, n14);
        n10 = (int)(Float.isNaN(f6) ? 1 : 0);
        n4 = 0x40E00000;
        float f12 = 7.0f;
        if (n10 != 0) {
            return f11 / f12;
        }
        n10 = (int)(Float.isNaN(f11) ? 1 : 0);
        if (n10 != 0) {
            return f6 / f12;
        }
        return (f6 + f11) / 14.0f;
    }

    private static int computeDimension(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, float f5) {
        int n3 = MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2) / f5);
        float f6 = ResultPoint.distance(resultPoint, resultPoint3) / f5;
        int n4 = MathUtils.round(f6) + n3;
        n3 = 2;
        int n7 = (n4 /= n3) + 7;
        int n8 = n7 & 3;
        if (n8 != 0) {
            if (n8 != n3) {
                n4 = 3;
                f6 = 4.2E-45f;
                if (n8 == n4) {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else {
                n7 = n4 + 6;
            }
        } else {
            n7 = n4 + 8;
        }
        return n7;
    }

    private static PerspectiveTransform createTransform(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int n3) {
        float f5;
        float f6;
        float f7;
        float f8 = n3;
        float f11 = 3.5f;
        float f12 = f8 - f11;
        if (resultPoint4 != null) {
            f8 = resultPoint4.getX();
            f11 = resultPoint4.getY();
            float f14 = f12 - 3.0f;
            f7 = f8;
            f6 = f11;
            f5 = f14;
        } else {
            f8 = resultPoint2.getX();
            f11 = resultPoint.getX();
            f8 -= f11;
            f11 = resultPoint3.getX() + f8;
            f8 = resultPoint2.getY();
            float f15 = resultPoint.getY();
            f8 -= f15;
            f15 = resultPoint3.getY() + f8;
            f7 = f11;
            f6 = f15;
            f5 = f12;
        }
        float f16 = resultPoint.getX();
        float f17 = resultPoint.getY();
        float f18 = resultPoint2.getX();
        float f19 = resultPoint2.getY();
        float f20 = resultPoint3.getX();
        float f22 = resultPoint3.getY();
        return PerspectiveTransform.quadrilateralToQuadrilateral(3.5f, 3.5f, f12, 3.5f, f5, f5, 3.5f, f12, f16, f17, f18, f19, f7, f6, f20, f22);
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, PerspectiveTransform perspectiveTransform, int n3) {
        return GridSampler.getInstance().sampleGrid(bitMatrix, n3, n3, perspectiveTransform);
    }

    /*
     * Enabled aggressive block sorting
     */
    private float sizeOfBlackWhiteBlackRun(int n3, int n4, int n7, int n8) {
        int n10;
        int n14;
        int n15;
        int n16;
        float f5;
        int n17;
        int n18;
        block12: {
            Detector detector;
            n18 = Math.abs(n8 - n4);
            n17 = Math.abs(n7 - n3);
            int n19 = 1;
            if (n18 > n17) {
                n18 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n18 = 0;
                f5 = 0.0f;
            }
            if (n18 != 0) {
                n16 = n3;
                n17 = n4;
                n15 = n7;
                n14 = n8;
            } else {
                n17 = n3;
                n16 = n4;
                n14 = n7;
                n15 = n8;
            }
            int n20 = Math.abs(n14 - n17);
            int n21 = Math.abs(n15 - n16);
            int n22 = -n20;
            int n24 = 2;
            n22 /= n24;
            int n25 = -1;
            int n26 = n17 < n14 ? 1 : -1;
            if (n16 < n15) {
                n25 = 1;
            }
            n14 += n26;
            int n27 = n16;
            n10 = 0;
            for (int i3 = n17; i3 != n14; i3 += n26) {
                float f6;
                int n28;
                int n29 = n18 != 0 ? n27 : i3;
                n24 = n18 != 0 ? i3 : n27;
                if (n10 == n19) {
                    detector = this;
                    n28 = n18;
                    f6 = f5;
                    n4 = n14;
                    n18 = 1;
                    f5 = Float.MIN_VALUE;
                } else {
                    detector = this;
                    n28 = n18;
                    f6 = f5;
                    n4 = n14;
                    n18 = 0;
                    f5 = 0.0f;
                }
                BitMatrix bitMatrix = detector.image;
                n29 = (int)(bitMatrix.get(n29, n24) ? 1 : 0);
                if (n18 == n29) {
                    n18 = 2;
                    f5 = 2.8E-45f;
                    if (n10 == n18) {
                        return MathUtils.distance(i3, n27, n17, n16);
                    }
                    ++n10;
                }
                if ((n22 += n21) > 0) {
                    if (n27 == n15) break block12;
                    n27 += n25;
                    n22 -= n20;
                }
                n14 = n4;
                n18 = n28;
                f5 = f6;
                n19 = 1;
                n24 = 2;
            }
            detector = this;
            n4 = n14;
        }
        n18 = 2;
        f5 = 2.8E-45f;
        if (n10 != n18) return Float.NaN;
        n14 = n4;
        return MathUtils.distance(n4, n15, n17, n16);
    }

    private float sizeOfBlackWhiteBlackRunBothWays(int n3, int n4, int n7, int n8) {
        float f5;
        float f6 = this.sizeOfBlackWhiteBlackRun(n3, n4, n7, n8);
        n7 -= n3;
        n7 = n3 - n7;
        int n10 = 0;
        float f7 = 0.0f;
        BitMatrix bitMatrix = null;
        float f8 = 1.0f;
        if (n7 < 0) {
            f5 = n3;
            float f11 = n3 - n7;
            f5 /= f11;
            n7 = 0;
            f11 = 0.0f;
            Object var12_13 = null;
        } else {
            BitMatrix bitMatrix2 = this.image;
            int n14 = bitMatrix2.getWidth();
            if (n7 >= n14) {
                bitMatrix2 = this.image;
                n14 = bitMatrix2.getWidth() + -1 - n3;
                f5 = n14;
                float f12 = n7 - n3;
                f5 /= f12;
                BitMatrix bitMatrix3 = this.image;
                n7 = bitMatrix3.getWidth() + -1;
            } else {
                n14 = 1065353216;
                f5 = 1.0f;
            }
        }
        float f14 = n4;
        float f15 = (float)(n8 - n4) * f5;
        f15 = f14 - f15;
        n8 = (int)f15;
        if (n8 < 0) {
            n8 = n4 - n8;
            f15 = n8;
            f14 /= f15;
        } else {
            bitMatrix = this.image;
            n10 = bitMatrix.getHeight();
            if (n8 >= n10) {
                bitMatrix = this.image;
                f7 = bitMatrix.getHeight() + -1 - n4;
                f15 = n8 - n4;
                f14 = f7 / f15;
                BitMatrix bitMatrix4 = this.image;
                n8 = bitMatrix4.getHeight();
                n10 = n8 + -1;
            } else {
                n10 = n8;
                f14 = 1.0f;
            }
        }
        f15 = n3;
        n7 = (int)((float)(n7 - n3) * f14 + f15);
        float f16 = this.sizeOfBlackWhiteBlackRun(n3, n4, n7, n10);
        return f6 + f16 - f8;
    }

    public final float calculateModuleSize(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f5 = this.calculateModuleSizeOneWay(resultPoint, resultPoint2);
        float f6 = this.calculateModuleSizeOneWay(resultPoint, resultPoint3);
        return (f5 + f6) / 2.0f;
    }

    public DetectorResult detect() {
        return this.detect(null);
    }

    public final DetectorResult detect(Map object) {
        Object object2;
        if (object == null) {
            object2 = null;
        } else {
            object2 = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
            object2 = (ResultPointCallback)object.get(object2);
        }
        this.resultPointCallback = object2;
        BitMatrix bitMatrix = this.image;
        FinderPatternFinder finderPatternFinder = new FinderPatternFinder(bitMatrix, (ResultPointCallback)object2);
        object = finderPatternFinder.find((Map)object);
        return this.processFinderPatternInfo((FinderPatternInfo)object);
    }

    public final AlignmentPattern findAlignmentInRegion(float f5, int n3, int n4, float f6) {
        int n7 = (int)(f6 *= f5);
        int n8 = n3 - n7;
        int n10 = Math.max(0, n8);
        BitMatrix bitMatrix = this.image;
        n8 = bitMatrix.getWidth() + -1;
        int n14 = Math.min(n8, n3 += n7) - n10;
        float f7 = n14;
        n8 = 0x40400000;
        float f8 = 3.0f * f5;
        float f11 = f7 - f8;
        n3 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1));
        if (n3 >= 0) {
            n3 = n4 - n7;
            int n15 = Math.max(0, n3);
            Object object = this.image;
            n3 = ((BitMatrix)object).getHeight() + -1;
            int n16 = Math.min(n3, n4 += n7) - n15;
            f7 = n16;
            float f12 = f7 - f8;
            if ((n3 = (int)(f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1))) >= 0) {
                BitMatrix bitMatrix2 = this.image;
                ResultPointCallback resultPointCallback = this.resultPointCallback;
                object = new AlignmentPatternFinder(bitMatrix2, n10, n15, n14, n16, f5, resultPointCallback);
                return ((AlignmentPatternFinder)object).find();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final BitMatrix getImage() {
        return this.image;
    }

    public final ResultPointCallback getResultPointCallback() {
        return this.resultPointCallback;
    }

    public final DetectorResult processFinderPatternInfo(FinderPatternInfo object) {
        FinderPattern finderPattern = ((FinderPatternInfo)object).getTopLeft();
        FinderPattern finderPattern2 = ((FinderPatternInfo)object).getTopRight();
        object = ((FinderPatternInfo)object).getBottomLeft();
        float f5 = this.calculateModuleSize(finderPattern, finderPattern2, (ResultPoint)object);
        int n3 = 1065353216;
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 >= 0) {
            Object object3;
            int n4;
            float f8;
            float f11;
            float f12;
            int n7;
            int n8;
            int n10;
            Object object4;
            block7: {
                object2 = Detector.computeDimension(finderPattern, finderPattern2, (ResultPoint)object, f5);
                object4 = Version.getProvisionalVersionForDimension((int)object2);
                n10 = ((Version)object4).getDimensionForVersion() + -7;
                object4 = ((Version)object4).getAlignmentPatternCenters();
                n8 = ((Object)object4).length;
                n7 = 4;
                if (n8 > 0) {
                    f12 = finderPattern2.getX();
                    f11 = finderPattern.getX();
                    f12 -= f11;
                    f11 = ((ResultPoint)object).getX() + f12;
                    f12 = finderPattern2.getY();
                    float f14 = finderPattern.getY();
                    f12 -= f14;
                    f14 = ((ResultPoint)object).getY() + f12;
                    f8 = n10;
                    f12 = 3.0f / f8;
                    f6 -= f12;
                    f12 = finderPattern.getX();
                    f8 = finderPattern.getX();
                    n8 = (int)((f11 - f8) * f6 + f12);
                    f8 = finderPattern.getY();
                    f11 = finderPattern.getY();
                    f14 = (f14 - f11) * f6 + f8;
                    n3 = (int)f14;
                    n10 = 4;
                    f8 = 5.6E-45f;
                    while (true) {
                        n4 = 16;
                        f11 = 2.2E-44f;
                        if (n10 > n4) break;
                        f11 = n10;
                        try {
                            object3 = this.findAlignmentInRegion(f5, n8, n3, f11);
                            break block7;
                        }
                        catch (NotFoundException notFoundException) {
                            n10 <<= 1;
                            continue;
                        }
                        break;
                    }
                }
                f5 = 0.0f;
                object3 = null;
            }
            Object object5 = Detector.createTransform(finderPattern, finderPattern2, (ResultPoint)object, object3, (int)object2);
            object5 = Detector.sampleGrid(this.image, (PerspectiveTransform)object5, (int)object2);
            object2 = 2;
            n8 = 0;
            f12 = 0.0f;
            object4 = null;
            n10 = 3;
            f8 = 4.2E-45f;
            n4 = 1;
            f11 = Float.MIN_VALUE;
            if (object3 == null) {
                object3 = new ResultPoint[n10];
                object3[0] = object;
                object3[n4] = finderPattern;
                object3[object2] = finderPattern2;
            } else {
                ResultPoint[] resultPointArray = new ResultPoint[n7];
                resultPointArray[0] = object;
                resultPointArray[n4] = finderPattern;
                resultPointArray[object2] = finderPattern2;
                resultPointArray[n10] = object3;
                object3 = resultPointArray;
            }
            object = new DetectorResult((BitMatrix)object5, (ResultPoint[])object3);
            return object;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

