/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.multi.MultipleBarcodeReader;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import com.google.zxing.pdf417.decoder.PDF417ScanningDecoder;
import com.google.zxing.pdf417.detector.Detector;
import java.util.ArrayList;
import java.util.Map;

public final class PDF417Reader
implements Reader,
MultipleBarcodeReader {
    private static Result[] decode(BinaryBitmap resultArray, Map object, boolean bl2) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        resultArray = Detector.detect((BinaryBitmap)resultArray, (Map)object, bl2);
        object = resultArray.getPoints().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (ResultPoint[])object.next();
            Object object3 = resultArray.getBits();
            int n3 = 4;
            Object object4 = object2[n3];
            int n4 = 5;
            Object object5 = object2[n4];
            int n7 = 6;
            Object object6 = object2[n7];
            int n8 = 7;
            Object object7 = object2[n8];
            int n10 = PDF417Reader.getMinCodewordWidth(object2);
            int n14 = PDF417Reader.getMaxCodewordWidth(object2);
            object3 = PDF417ScanningDecoder.decode((BitMatrix)object3, (ResultPoint)object4, (ResultPoint)object5, (ResultPoint)object6, object7, n10, n14);
            object5 = ((DecoderResult)object3).getText();
            object6 = ((DecoderResult)object3).getRawBytes();
            object7 = BarcodeFormat.PDF_417;
            object4 = new Result((String)object5, (byte[])object6, (ResultPoint[])object2, (BarcodeFormat)((Object)object7));
            object2 = ResultMetadataType.ERROR_CORRECTION_LEVEL;
            object5 = ((DecoderResult)object3).getECLevel();
            ((Result)object4).putMetadata((ResultMetadataType)((Object)object2), object5);
            object2 = (PDF417ResultMetadata)((DecoderResult)object3).getOther();
            if (object2 != null) {
                object3 = ResultMetadataType.PDF417_EXTRA_METADATA;
                ((Result)object4).putMetadata((ResultMetadataType)((Object)object3), object2);
            }
            arrayList.add(object4);
        }
        resultArray = new Result[arrayList.size()];
        return arrayList.toArray(resultArray);
    }

    private static int getMaxCodewordWidth(ResultPoint[] object) {
        ResultPoint resultPoint = object[0];
        ResultPoint resultPoint2 = object[4];
        int n3 = PDF417Reader.getMaxWidth(resultPoint, resultPoint2);
        resultPoint2 = object[6];
        ResultPoint resultPoint3 = object[2];
        int n4 = PDF417Reader.getMaxWidth(resultPoint2, resultPoint3) * 17 / 18;
        n3 = Math.max(n3, n4);
        resultPoint2 = object[1];
        resultPoint3 = object[5];
        n4 = PDF417Reader.getMaxWidth(resultPoint2, resultPoint3);
        resultPoint3 = object[7];
        object = object[3];
        int n7 = PDF417Reader.getMaxWidth(resultPoint3, (ResultPoint)object) * 17 / 18;
        n7 = Math.max(n4, n7);
        return Math.max(n3, n7);
    }

    private static int getMaxWidth(ResultPoint resultPoint, ResultPoint resultPoint2) {
        if (resultPoint != null && resultPoint2 != null) {
            float f5 = resultPoint.getX();
            float f6 = resultPoint2.getX();
            return (int)Math.abs(f5 - f6);
        }
        return 0;
    }

    private static int getMinCodewordWidth(ResultPoint[] object) {
        ResultPoint resultPoint = object[0];
        ResultPoint resultPoint2 = object[4];
        int n3 = PDF417Reader.getMinWidth(resultPoint, resultPoint2);
        resultPoint2 = object[6];
        ResultPoint resultPoint3 = object[2];
        int n4 = PDF417Reader.getMinWidth(resultPoint2, resultPoint3) * 17 / 18;
        n3 = Math.min(n3, n4);
        resultPoint2 = object[1];
        resultPoint3 = object[5];
        n4 = PDF417Reader.getMinWidth(resultPoint2, resultPoint3);
        resultPoint3 = object[7];
        object = object[3];
        int n7 = PDF417Reader.getMinWidth(resultPoint3, (ResultPoint)object) * 17 / 18;
        n7 = Math.min(n4, n7);
        return Math.min(n3, n7);
    }

    private static int getMinWidth(ResultPoint resultPoint, ResultPoint resultPoint2) {
        if (resultPoint != null && resultPoint2 != null) {
            float f5 = resultPoint.getX();
            float f6 = resultPoint2.getX();
            return (int)Math.abs(f5 - f6);
        }
        return -1 >>> 1;
    }

    public Result decode(BinaryBitmap binaryBitmap) {
        return this.decode(binaryBitmap, null);
    }

    public Result decode(BinaryBitmap object, Map map2) {
        int n3;
        if ((object = PDF417Reader.decode((BinaryBitmap)object, map2, false)) != null && (n3 = ((Result[])object).length) != 0 && (object = object[0]) != null) {
            return object;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) {
        return this.decodeMultiple(binaryBitmap, null);
    }

    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map map2) {
        boolean bl2 = true;
        try {
            return PDF417Reader.decode(binaryBitmap, map2, bl2);
        }
        catch (ChecksumException | FormatException readerException) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public void reset() {
    }
}

