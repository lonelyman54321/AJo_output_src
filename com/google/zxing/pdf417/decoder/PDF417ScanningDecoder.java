/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import com.google.zxing.pdf417.decoder.BarcodeMetadata;
import com.google.zxing.pdf417.decoder.BarcodeValue;
import com.google.zxing.pdf417.decoder.BoundingBox;
import com.google.zxing.pdf417.decoder.Codeword;
import com.google.zxing.pdf417.decoder.DecodedBitStreamParser;
import com.google.zxing.pdf417.decoder.DetectionResult;
import com.google.zxing.pdf417.decoder.DetectionResultColumn;
import com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn;
import com.google.zxing.pdf417.decoder.PDF417CodewordDecoder;
import com.google.zxing.pdf417.decoder.ec.ErrorCorrection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

public final class PDF417ScanningDecoder {
    private static final int CODEWORD_SKEW_SIZE = 2;
    private static final int MAX_EC_CODEWORDS = 512;
    private static final int MAX_ERRORS = 3;
    private static final ErrorCorrection errorCorrection;

    static {
        ErrorCorrection errorCorrection;
        PDF417ScanningDecoder.errorCorrection = errorCorrection = new ErrorCorrection();
    }

    private PDF417ScanningDecoder() {
    }

    private static BoundingBox adjustBoundingBox(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn) {
        Codeword codeword;
        int n3;
        int n4;
        int n7;
        int n8 = 0;
        BoundingBox boundingBox = null;
        if (detectionResultRowIndicatorColumn == null) {
            return null;
        }
        Object object = detectionResultRowIndicatorColumn.getRowHeights();
        if (object == null) {
            return null;
        }
        n8 = PDF417ScanningDecoder.getMax(object);
        int n10 = ((int[])object).length;
        int n14 = 0;
        int n15 = 0;
        for (n7 = 0; n7 < n10; ++n7) {
            n4 = object[n7];
            n3 = n8 - n4;
            n15 += n3;
            if (n4 > 0) break;
        }
        Codeword[] codewordArray = detectionResultRowIndicatorColumn.getCodewords();
        n7 = 0;
        while (n15 > 0 && (codeword = codewordArray[n7]) == null) {
            n15 += -1;
            ++n7;
        }
        for (n7 = ((int[])object).length + -1; n7 >= 0; n7 += -1) {
            n4 = object[n7];
            n3 = n8 - n4;
            n14 += n3;
            if (n4 > 0) break;
        }
        n8 = codewordArray.length + -1;
        while (n14 > 0 && (object = (Object)codewordArray[n8]) == null) {
            n14 += -1;
            n8 += -1;
        }
        boundingBox = detectionResultRowIndicatorColumn.getBoundingBox();
        boolean bl2 = detectionResultRowIndicatorColumn.isLeft();
        return boundingBox.addMissingRows(n15, n14, bl2);
    }

    private static void adjustCodewordCount(DetectionResult detectionResult, BarcodeValue[][] barcodeValueArray) {
        barcodeValueArray = barcodeValueArray[0];
        int n3 = 1;
        barcodeValueArray = barcodeValueArray[n3];
        int[] nArray = barcodeValueArray.getValue();
        int n4 = detectionResult.getBarcodeColumnCount();
        int n7 = detectionResult.getBarcodeRowCount();
        n4 *= n7;
        int n8 = PDF417ScanningDecoder.getNumberOfECCodeWords(detectionResult.getBarcodeECLevel());
        n4 -= n8;
        n8 = nArray.length;
        if (n8 == 0) {
            if (n4 > 0 && n4 <= (n8 = 928)) {
                barcodeValueArray.setValue(n4);
                return;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        n8 = nArray[0];
        if (n8 != n4) {
            barcodeValueArray.setValue(n4);
        }
    }

    private static int adjustCodewordStartColumn(BitMatrix bitMatrix, int n3, int n4, boolean n7, int n8, int n10) {
        int n14;
        int n15 = n7 != 0 ? -1 : 1;
        int n16 = n8;
        for (int i3 = 0; i3 < (n14 = 2); ++i3) {
            int n17;
            while ((n7 != 0 ? n16 >= n3 : n16 < n4) && n7 == (n17 = bitMatrix.get(n16, n10))) {
                n17 = Math.abs(n8 - n16);
                if (n17 > n14) {
                    return n8;
                }
                n16 += n15;
            }
            n15 = -n15;
            n7 ^= true;
        }
        return n16;
    }

    private static boolean checkCodewordSkew(int n3, int n4, int n7) {
        return (n4 += -2) <= n3 && n3 <= (n7 += 2);
    }

    private static int correctErrors(int[] nArray, int[] nArray2, int n3) {
        int n4;
        int n7;
        if ((nArray2 == null || (n7 = nArray2.length) <= (n4 = n3 / 2 + 3)) && n3 >= 0 && n3 <= (n7 = 512)) {
            return errorCorrection.decode(nArray, n3, nArray2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    private static BarcodeValue[][] createBarcodeMatrix(DetectionResult detectionResultColumnArray) {
        BarcodeValue[] barcodeValueArray;
        int n3 = detectionResultColumnArray.getBarcodeRowCount();
        int n4 = detectionResultColumnArray.getBarcodeColumnCount();
        int n7 = 2;
        int[] nArray = new int[n7];
        int n8 = 1;
        nArray[n8] = n4 += n7;
        n4 = 0;
        nArray[0] = n3;
        BarcodeValue[][] barcodeValueArray2 = (BarcodeValue[][])Array.newInstance(BarcodeValue.class, nArray);
        nArray = null;
        for (n7 = 0; n7 < (n8 = barcodeValueArray2.length); ++n7) {
            int n10;
            for (n8 = 0; n8 < (n10 = (barcodeValueArray = barcodeValueArray2[n7]).length); ++n8) {
                BarcodeValue object;
                barcodeValueArray[n8] = object = new BarcodeValue();
            }
        }
        detectionResultColumnArray = detectionResultColumnArray.getDetectionResultColumns();
        n7 = detectionResultColumnArray.length;
        int n10 = 0;
        barcodeValueArray = null;
        for (n8 = 0; n8 < n7; ++n8) {
            DetectionResultColumn detectionResultColumn = detectionResultColumnArray[n8];
            if (detectionResultColumn != null) {
                for (Codeword codeword : detectionResultColumn.getCodewords()) {
                    int n14;
                    int n15;
                    if (codeword == null || (n15 = codeword.getRowNumber()) < 0 || n15 >= (n14 = barcodeValueArray2.length)) continue;
                    BarcodeValue barcodeValue = barcodeValueArray2[n15][n10];
                    int n16 = codeword.getValue();
                    barcodeValue.setValue(n16);
                }
            }
            ++n10;
        }
        return barcodeValueArray2;
    }

    private static DecoderResult createDecoderResult(DetectionResult detectionResult) {
        Object object;
        Object object2;
        Object object3 = PDF417ScanningDecoder.createBarcodeMatrix(detectionResult);
        PDF417ScanningDecoder.adjustCodewordCount(detectionResult, object3);
        Object object4 = new ArrayList();
        int n3 = detectionResult.getBarcodeRowCount();
        int n4 = detectionResult.getBarcodeColumnCount();
        int[] nArray = new int[n3 *= n4];
        ArrayList<BarcodeValue[]> arrayList = new ArrayList<BarcodeValue[]>();
        ArrayList<int[]> arrayList2 = new ArrayList<int[]>();
        int n7 = 0;
        int[][] nArrayArray = null;
        for (int i3 = 0; i3 < (object2 = detectionResult.getBarcodeRowCount()); ++i3) {
            int n8;
            object2 = 0;
            object = null;
            while (object2 < (n8 = detectionResult.getBarcodeColumnCount())) {
                Object[] objectArray = object3[i3];
                int n10 = object2 + 1;
                objectArray = objectArray[n10].getValue();
                int n14 = detectionResult.getBarcodeColumnCount() * i3 + object2;
                object2 = objectArray.length;
                if (object2 == 0) {
                    object = n14;
                    ((ArrayList)object4).add(object);
                } else {
                    object2 = objectArray.length;
                    int n15 = 1;
                    if (object2 == n15) {
                        nArray[n14] = object2 = (Object)objectArray[0];
                    } else {
                        object = n14;
                        arrayList2.add((int[])object);
                        arrayList.add((BarcodeValue[])objectArray);
                    }
                }
                object2 = n10;
            }
        }
        int n16 = arrayList.size();
        nArrayArray = new int[n16][];
        while (n7 < n16) {
            nArrayArray[n7] = object = (int[])arrayList.get(n7);
            ++n7;
        }
        int n17 = detectionResult.getBarcodeECLevel();
        object3 = PDF417Common.toIntArray(object4);
        object4 = PDF417Common.toIntArray(arrayList2);
        return PDF417ScanningDecoder.createDecoderResultFromAmbiguousValues(n17, nArray, (int[])object3, (int[])object4, nArrayArray);
    }

    private static DecoderResult createDecoderResultFromAmbiguousValues(int n3, int[] nArray, int[] nArray2, int[] nArray3, int[][] nArray4) {
        int n4 = nArray3.length;
        int[] nArray5 = new int[n4];
        int n7 = 100;
        while (true) {
            int n8;
            int[] nArray6;
            int n10;
            int n14;
            int n15 = n7 + -1;
            if (n7 <= 0) break;
            n7 = 0;
            for (n14 = 0; n14 < n4; ++n14) {
                n10 = nArray3[n14];
                nArray6 = nArray4[n14];
                int n16 = nArray5[n14];
                nArray[n10] = n8 = nArray6[n16];
            }
            try {
                return PDF417ScanningDecoder.decodeCodewords(nArray, n3, nArray2);
            }
            catch (ChecksumException checksumException) {
                if (n4 != 0) {
                    for (n14 = 0; n14 < n4; ++n14) {
                        n10 = nArray5[n14];
                        nArray6 = nArray4[n14];
                        n8 = nArray6.length + -1;
                        if (n10 < n8) {
                            nArray5[n14] = ++n10;
                            break;
                        }
                        nArray5[n14] = 0;
                        n10 = n4 + -1;
                        if (n14 != n10) {
                            continue;
                        }
                        throw ChecksumException.getChecksumInstance();
                    }
                    n7 = n15;
                    continue;
                }
                throw ChecksumException.getChecksumInstance();
            }
            break;
        }
        throw ChecksumException.getChecksumInstance();
    }

    public static DecoderResult decode(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int n3, int n4) {
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        Object object;
        Object object2 = object;
        Object object3 = resultPoint;
        Object object4 = resultPoint2;
        Object object5 = resultPoint3;
        object = new BoundingBox(bitMatrix, resultPoint, resultPoint2, resultPoint3, resultPoint4);
        int n16 = 0;
        object2 = null;
        int n17 = 0;
        object3 = null;
        object4 = null;
        BoundingBox boundingBox = object;
        Object object6 = null;
        for (n15 = 0; n15 < (n14 = 2); ++n15) {
            if (resultPoint != null) {
                n10 = 1;
                object5 = bitMatrix;
                object = resultPoint;
                n8 = n3;
                object2 = PDF417ScanningDecoder.getRowIndicatorColumn(bitMatrix, boundingBox, resultPoint, n10 != 0, n3, n4);
            }
            if (resultPoint3 != null) {
                n10 = 0;
                object5 = bitMatrix;
                object = resultPoint3;
                n8 = n3;
                object3 = PDF417ScanningDecoder.getRowIndicatorColumn(bitMatrix, boundingBox, resultPoint3, false, n3, n4);
            }
            if ((object4 = PDF417ScanningDecoder.merge((DetectionResultRowIndicatorColumn)object2, (DetectionResultRowIndicatorColumn)object3)) != null) {
                if (n15 == 0 && (object5 = ((DetectionResult)object4).getBoundingBox()) != null && ((n14 = ((BoundingBox)(object5 = ((DetectionResult)object4).getBoundingBox())).getMinY()) < (n7 = boundingBox.getMinY()) || (n14 = ((BoundingBox)(object5 = ((DetectionResult)object4).getBoundingBox())).getMaxY()) > (n7 = boundingBox.getMaxY()))) {
                    boundingBox = ((DetectionResult)object4).getBoundingBox();
                    continue;
                }
                ((DetectionResult)object4).setBoundingBox(boundingBox);
                break;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        n14 = ((DetectionResult)object4).getBarcodeColumnCount();
        n7 = 1;
        ((DetectionResult)object4).setDetectionResultColumn(0, (DetectionResultColumn)object2);
        ((DetectionResult)object4).setDetectionResultColumn(n14 += n7, (DetectionResultColumn)object3);
        if (object2 != null) {
            n16 = 1;
        } else {
            n16 = 0;
            object2 = null;
        }
        n17 = n3;
        int n18 = n4;
        for (n10 = 1; n10 <= n14; ++n10) {
            n8 = n16 != 0 ? n10 : n14 - n10;
            DetectionResultColumn detectionResultColumn = ((DetectionResult)object4).getDetectionResultColumn(n8);
            if (detectionResultColumn != null) continue;
            if (n8 != 0 && n8 != n14) {
                detectionResultColumn = new DetectionResultColumn(boundingBox);
            } else {
                if (n8 == 0) {
                    n15 = 1;
                } else {
                    n15 = 0;
                    object6 = null;
                }
                detectionResultColumn = new DetectionResultRowIndicatorColumn(boundingBox, n15 != 0);
            }
            ((DetectionResult)object4).setDetectionResultColumn(n8, detectionResultColumn);
            n15 = boundingBox.getMinY();
            int n19 = -1;
            int n20 = n15;
            int n21 = -1;
            while (n20 <= (n15 = boundingBox.getMaxY())) {
                int n22;
                block17: {
                    int n24;
                    block16: {
                        block15: {
                            int n25;
                            block14: {
                                block13: {
                                    n15 = PDF417ScanningDecoder.getStartColumn((DetectionResult)object4, n8, n20, n16 != 0);
                                    if (n15 < 0 || n15 > (n22 = boundingBox.getMaxX())) break block13;
                                    n25 = n15;
                                    break block14;
                                }
                                if (n21 == n19) break block15;
                                n25 = n21;
                            }
                            n22 = boundingBox.getMinX();
                            int n26 = boundingBox.getMaxX();
                            object6 = bitMatrix;
                            n24 = n21;
                            n21 = n26;
                            int n27 = n20;
                            n20 = n16;
                            n19 = n25;
                            n26 = n27;
                            object6 = PDF417ScanningDecoder.detectCodeword(bitMatrix, n22, n21, n16 != 0, n25, n27, n17, n18);
                            n22 = n27;
                            if (object6 == null) break block16;
                            detectionResultColumn.setCodeword(n27, (Codeword)object6);
                            n21 = ((Codeword)object6).getWidth();
                            n17 = Math.min(n17, n21);
                            n15 = ((Codeword)object6).getWidth();
                            n18 = Math.max(n18, n15);
                            n21 = n25;
                            break block17;
                        }
                        n24 = n21;
                        n22 = n20;
                    }
                    n21 = n24;
                }
                n20 = n22 + 1;
                n19 = -1;
            }
        }
        return PDF417ScanningDecoder.createDecoderResult((DetectionResult)object4);
    }

    private static DecoderResult decodeCodewords(int[] object, int n3, int[] nArray) {
        int n4 = ((int[])object).length;
        if (n4 != 0) {
            n4 = n3 + 1;
            n4 = 1 << n4;
            int n7 = PDF417ScanningDecoder.correctErrors((int[])object, nArray, n4);
            PDF417ScanningDecoder.verifyCodewordCount((int[])object, n4);
            Object object2 = String.valueOf(n3);
            object = DecodedBitStreamParser.decode((int[])object, (String)object2);
            object2 = n7;
            ((DecoderResult)object).setErrorsCorrected((Integer)object2);
            object2 = nArray.length;
            ((DecoderResult)object).setErasures((Integer)object2);
            return object;
        }
        throw FormatException.getFormatInstance();
    }

    private static Codeword detectCodeword(BitMatrix object, int n3, int n4, boolean n7, int n8, int object2, int n10, int n14) {
        n8 = PDF417ScanningDecoder.adjustCodewordStartColumn((BitMatrix)object, n3, n4, n7 != 0, n8, object2);
        object = PDF417ScanningDecoder.getModuleBitCount((BitMatrix)object, n3, n4, n7 != 0, n8, object2);
        n3 = 0;
        Codeword codeword = null;
        if (object == null) {
            return null;
        }
        n4 = MathUtils.sum((int[])object);
        if (n7 != 0) {
            n7 = n8 + n4;
        } else {
            for (n7 = 0; n7 < (object2 = ((Object)object).length / 2); ++n7) {
                object2 = object[n7];
                Object object3 = ((Object)object).length + -1 - n7;
                object3 = object[object3];
                object[n7] = object3;
                object3 = ((Object)object).length + -1 - n7;
                object[object3] = object2;
            }
            n7 = n8 - n4;
            int n15 = n8;
            n8 = n7;
            n7 = n15;
        }
        n4 = (int)(PDF417ScanningDecoder.checkCodewordSkew(n4, n10, n14) ? 1 : 0);
        if (n4 == 0) {
            return null;
        }
        int n16 = PDF417CodewordDecoder.getDecodedValue((int[])object);
        n4 = PDF417Common.getCodeword(n16);
        if (n4 == (object2 = -1)) {
            return null;
        }
        n16 = PDF417ScanningDecoder.getCodewordBucketNumber(n16);
        codeword = new Codeword(n8, n7, n16, n4);
        return codeword;
    }

    private static BarcodeMetadata getBarcodeMetadata(DetectionResultRowIndicatorColumn object, DetectionResultRowIndicatorColumn object2) {
        if (object != null && (object = ((DetectionResultRowIndicatorColumn)object).getBarcodeMetadata()) != null) {
            int n3;
            int n4;
            int n7;
            if (object2 != null && (object2 = ((DetectionResultRowIndicatorColumn)object2).getBarcodeMetadata()) != null && (n7 = ((BarcodeMetadata)object).getColumnCount()) != (n4 = ((BarcodeMetadata)object2).getColumnCount()) && (n7 = ((BarcodeMetadata)object).getErrorCorrectionLevel()) != (n4 = ((BarcodeMetadata)object2).getErrorCorrectionLevel()) && (n7 = ((BarcodeMetadata)object).getRowCount()) != (n3 = ((BarcodeMetadata)object2).getRowCount())) {
                return null;
            }
            return object;
        }
        if (object2 == null) {
            return null;
        }
        return ((DetectionResultRowIndicatorColumn)object2).getBarcodeMetadata();
    }

    private static int[] getBitCountForCodeword(int n3) {
        int n4 = 8;
        int[] nArray = new int[n4];
        int n7 = 0;
        int n8 = 7;
        while (true) {
            int n10;
            if ((n10 = n3 & 1) != n7) {
                if ((n8 += -1) >= 0) {
                    n7 = n10;
                } else {
                    return nArray;
                }
            }
            nArray[n8] = n10 = nArray[n8] + 1;
            n3 >>= 1;
        }
    }

    private static int getCodewordBucketNumber(int n3) {
        return PDF417ScanningDecoder.getCodewordBucketNumber(PDF417ScanningDecoder.getBitCountForCodeword(n3));
    }

    private static int getCodewordBucketNumber(int[] nArray) {
        int n3 = nArray[0];
        int n4 = nArray[2];
        n3 -= n4;
        n4 = nArray[4];
        int n7 = nArray[6];
        return ((n3 += n4) - n7 + 9) % 9;
    }

    private static int getMax(int[] nArray) {
        int n3 = nArray.length;
        int n4 = -1;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7 = nArray[i3];
            n4 = Math.max(n4, n7);
        }
        return n4;
    }

    private static int[] getModuleBitCount(BitMatrix bitMatrix, int n3, int n4, boolean n7, int n8, int n10) {
        int n14 = 8;
        int[] nArray = new int[n14];
        int n15 = 1;
        int n16 = n7 != 0 ? 1 : -1;
        int n17 = 0;
        int n18 = n7;
        while ((n7 != 0 ? n8 < n4 : n8 >= n3) && n17 < n14) {
            int n19 = bitMatrix.get(n8, n10);
            if (n19 == n18) {
                nArray[n17] = n19 = nArray[n17] + n15;
                n8 += n16;
                continue;
            }
            ++n17;
            n18 ^= true;
        }
        if (n17 != n14) {
            int n20;
            if (n7) {
                n3 = n4;
            }
            if (n8 != n3 || n17 != (n20 = 7)) {
                return null;
            }
        }
        return nArray;
    }

    private static int getNumberOfECCodeWords(int n3) {
        return 2 << n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static DetectionResultRowIndicatorColumn getRowIndicatorColumn(BitMatrix bitMatrix, BoundingBox boundingBox, ResultPoint resultPoint, boolean bl2, int n3, int n4) {
        boolean bl3 = bl2;
        DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn = new DetectionResultRowIndicatorColumn(boundingBox, bl2);
        int n7 = 0;
        float f5 = 0.0f;
        Object object = null;
        int n8 = 0;
        while (true) {
            int n10;
            n7 = 2;
            f5 = 2.8E-45f;
            if (n8 >= n7) return detectionResultRowIndicatorColumn;
            if (n8 == 0) {
                n7 = 1;
                f5 = Float.MIN_VALUE;
                n10 = 1;
            } else {
                n7 = -1;
                f5 = 0.0f / 0.0f;
                n10 = -1;
            }
            f5 = resultPoint.getX();
            n7 = (int)f5;
            float f6 = resultPoint.getY();
            int n14 = (int)f6;
            int n15 = n7;
            for (int i3 = n14; i3 <= (n7 = boundingBox.getMaxY()) && i3 >= (n7 = boundingBox.getMinY()); i3 += n10) {
                int n16 = bitMatrix.getWidth();
                n14 = 0;
                f6 = 0.0f;
                object = bitMatrix;
                object = PDF417ScanningDecoder.detectCodeword(bitMatrix, 0, n16, bl2, n15, i3, n3, n4);
                if (object == null) continue;
                detectionResultRowIndicatorColumn.setCodeword(i3, (Codeword)object);
                n7 = bl3 ? ((Codeword)object).getStartX() : ((Codeword)object).getEndX();
                n15 = n7;
            }
            ++n8;
        }
    }

    /*
     * WARNING - void declaration
     */
    private static int getStartColumn(DetectionResult object, int n3, int n4, boolean bl2) {
        void var7_12;
        DetectionResultColumn detectionResultColumn;
        void var7_9;
        int n7 = bl2 ? 1 : -1;
        int n8 = n3 - n7;
        boolean bl3 = PDF417ScanningDecoder.isValidBarcodeColumn((DetectionResult)object, n8);
        if (bl3) {
            Codeword object2 = ((DetectionResult)object).getDetectionResultColumn(n8).getCodeword(n4);
        } else {
            bl3 = false;
            Object var7_8 = null;
        }
        if (var7_9 != null) {
            if (bl2) {
                return var7_9.getEndX();
            }
            return var7_9.getStartX();
        }
        Codeword codeword = ((DetectionResult)object).getDetectionResultColumn(n3).getCodewordNearby(n4);
        if (codeword != null) {
            if (bl2) {
                return codeword.getStartX();
            }
            return codeword.getEndX();
        }
        int n10 = PDF417ScanningDecoder.isValidBarcodeColumn((DetectionResult)object, n8);
        if (n10 != 0) {
            detectionResultColumn = ((DetectionResult)object).getDetectionResultColumn(n8);
            Codeword codeword2 = detectionResultColumn.getCodewordNearby(n4);
        }
        if (var7_12 != null) {
            if (bl2) {
                return var7_12.getEndX();
            }
            return var7_12.getStartX();
        }
        n4 = 0;
        n8 = 0;
        detectionResultColumn = null;
        while (bl3 = PDF417ScanningDecoder.isValidBarcodeColumn((DetectionResult)object, n3 -= n7)) {
            for (Codeword codeword3 : ((DetectionResult)object).getDetectionResultColumn(n3).getCodewords()) {
                if (codeword3 == null) continue;
                int n14 = bl2 ? codeword3.getEndX() : codeword3.getStartX();
                n3 = codeword3.getEndX();
                n4 = codeword3.getStartX();
                return (n3 - n4) * (n7 *= n8) + n14;
            }
            ++n8;
        }
        object = ((DetectionResult)object).getBoundingBox();
        if (bl2) {
            return ((BoundingBox)object).getMinX();
        }
        return ((BoundingBox)object).getMaxX();
    }

    private static boolean isValidBarcodeColumn(DetectionResult detectionResult, int n3) {
        if (n3 >= 0) {
            int n4 = detectionResult.getBarcodeColumnCount();
            int n7 = 1;
            if (n3 <= (n4 += n7)) {
                return n7 != 0;
            }
        }
        return false;
    }

    private static DetectionResult merge(DetectionResultRowIndicatorColumn object, DetectionResultRowIndicatorColumn object2) {
        if (object == null && object2 == null) {
            return null;
        }
        BarcodeMetadata barcodeMetadata = PDF417ScanningDecoder.getBarcodeMetadata((DetectionResultRowIndicatorColumn)object, (DetectionResultRowIndicatorColumn)object2);
        if (barcodeMetadata == null) {
            return null;
        }
        object = PDF417ScanningDecoder.adjustBoundingBox((DetectionResultRowIndicatorColumn)object);
        object2 = PDF417ScanningDecoder.adjustBoundingBox((DetectionResultRowIndicatorColumn)object2);
        object = BoundingBox.merge((BoundingBox)object, (BoundingBox)object2);
        object2 = new DetectionResult(barcodeMetadata, (BoundingBox)object);
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String toString(BarcodeValue[][] object) {
        Object var1_2 = null;
        int n3 = 1;
        Formatter formatter = new Formatter();
        int n4 = 0;
        try {
            while (true) {
                int n7;
                int n8;
                if (n4 >= (n8 = ((BarcodeValue[][])object).length)) {
                    object = formatter.toString();
                    formatter.close();
                    return object;
                }
                String string2 = "Row %2d: ";
                Object object2 = Integer.valueOf(n4);
                Object object3 = new Object[n3];
                object3[0] = object2;
                formatter.format(string2, object3);
                string2 = null;
                for (n8 = 0; n8 < (n7 = ((BarcodeValue[])(object2 = object[n4])).length); n8 += n3) {
                    object3 = ((BarcodeValue)(object2 = object2[n8])).getValue();
                    n7 = ((Object[])object3).length;
                    if (n7 == 0) {
                        object2 = "        ";
                        n7 = 0;
                        object3 = null;
                        formatter.format((String)object2, null);
                        continue;
                    }
                    object3 = "%4d(%2d)";
                    Object object4 = ((BarcodeValue)object2).getValue();
                    int n10 = object4[0];
                    object4 = n10;
                    Object[] objectArray = ((BarcodeValue)object2).getValue();
                    int n14 = objectArray[0];
                    object2 = ((BarcodeValue)object2).getConfidence(n14);
                    n14 = 2;
                    objectArray = new Object[n14];
                    objectArray[0] = (int)object4;
                    objectArray[n3] = (int)object2;
                    formatter.format((String)object3, objectArray);
                }
                string2 = "%n";
                object2 = new Object[]{};
                formatter.format(string2, (Object[])object2);
                n4 += n3;
            }
        }
        catch (Throwable throwable) {}
        try {
            throw throwable;
        }
        catch (Throwable throwable) {
            try {
                formatter.close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
            }
            throw throwable;
        }
    }

    private static void verifyCodewordCount(int[] nArray, int n3) {
        int n4 = nArray.length;
        int n7 = 4;
        if (n4 >= n7) {
            n4 = 0;
            n7 = nArray[0];
            int n8 = nArray.length;
            if (n7 <= n8) {
                if (n7 == 0) {
                    n7 = nArray.length;
                    if (n3 < n7) {
                        nArray[0] = n7 = nArray.length - n3;
                        return;
                    }
                    throw FormatException.getFormatInstance();
                }
                return;
            }
            throw FormatException.getFormatInstance();
        }
        throw FormatException.getFormatInstance();
    }
}

