/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.decoder.Decoder;
import com.google.zxing.datamatrix.detector.Detector;
import java.util.Map;

public final class DataMatrixReader
implements Reader {
    private static final ResultPoint[] NO_POINTS = new ResultPoint[0];
    private final Decoder decoder;

    public DataMatrixReader() {
        Decoder decoder;
        this.decoder = decoder = new Decoder();
    }

    private static BitMatrix extractPureBits(BitMatrix bitMatrix) {
        int[] nArray = bitMatrix.getTopLeftOnBit();
        int[] nArray2 = bitMatrix.getBottomRightOnBit();
        if (nArray != null && nArray2 != null) {
            int n3 = DataMatrixReader.moduleSize(nArray, bitMatrix);
            int n4 = 1;
            int n7 = nArray[n4];
            int n8 = nArray2[n4];
            int n10 = nArray[0];
            int n14 = (nArray2[0] - n10 + n4) / n3;
            n8 = (n8 - n7 + n4) / n3;
            if (n14 > 0 && n8 > 0) {
                n4 = n3 / 2;
                n7 += n4;
                n10 += n4;
                BitMatrix bitMatrix2 = new BitMatrix(n14, n8);
                for (int i3 = 0; i3 < n8; ++i3) {
                    int n15 = i3 * n3 + n7;
                    for (int i8 = 0; i8 < n14; ++i8) {
                        int n16 = i8 * n3 + n10;
                        if ((n16 = (int)(bitMatrix.get(n16, n15) ? 1 : 0)) == 0) continue;
                        bitMatrix2.set(i8, i3);
                    }
                }
                return bitMatrix2;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int moduleSize(int[] nArray, BitMatrix bitMatrix) {
        boolean bl2;
        int n3;
        int n4 = bitMatrix.getWidth();
        int n7 = nArray[1];
        for (n3 = nArray[0]; n3 < n4 && (bl2 = bitMatrix.get(n3, n7)); ++n3) {
        }
        if (n3 != n4) {
            int n8 = nArray[0];
            if ((n3 -= n8) != 0) {
                return n3;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decode(BinaryBitmap binaryBitmap) {
        return this.decode(binaryBitmap, null);
    }

    public Result decode(BinaryBitmap object, Map object2) {
        Object object3;
        boolean bl2;
        if (object2 != null && (bl2 = object2.containsKey(object3 = DecodeHintType.PURE_BARCODE))) {
            object = DataMatrixReader.extractPureBits(object.getBlackMatrix());
            object = this.decoder.decode((BitMatrix)object);
            object2 = NO_POINTS;
        } else {
            object = object.getBlackMatrix();
            object2 = new Detector((BitMatrix)object);
            object = object2.detect();
            object2 = this.decoder;
            object3 = object.getBits();
            object2 = object2.decode((BitMatrix)object3);
            object = object.getPoints();
            ResultPoint[] resultPointArray = object2;
            object2 = object;
            object = resultPointArray;
        }
        Object object4 = object.getText();
        byte[] byArray = object.getRawBytes();
        BarcodeFormat barcodeFormat = BarcodeFormat.DATA_MATRIX;
        object3 = new Result((String)object4, byArray, (ResultPoint[])object2, barcodeFormat);
        object2 = object.getByteSegments();
        if (object2 != null) {
            object4 = ResultMetadataType.BYTE_SEGMENTS;
            ((Result)object3).putMetadata((ResultMetadataType)((Object)object4), object2);
        }
        if ((object = object.getECLevel()) != null) {
            object2 = ResultMetadataType.ERROR_CORRECTION_LEVEL;
            ((Result)object3).putMetadata((ResultMetadataType)((Object)object2), object);
        }
        return object3;
    }

    public void reset() {
    }
}

