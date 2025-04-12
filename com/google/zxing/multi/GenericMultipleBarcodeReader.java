/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.multi;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.multi.MultipleBarcodeReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class GenericMultipleBarcodeReader
implements MultipleBarcodeReader {
    private static final int MAX_DEPTH = 4;
    private static final int MIN_DIMENSION_TO_RECUR = 100;
    private final Reader delegate;

    public GenericMultipleBarcodeReader(Reader reader) {
        this.delegate = reader;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void doDecodeMultiple(BinaryBitmap binaryBitmap, Map map2, List list, int n3, int n4, int n7) {
        int n8;
        Object object;
        Object object2;
        boolean bl2;
        Object object3;
        Result result2;
        float f5;
        int n10;
        int n14;
        int n15;
        int n16;
        Object object4;
        block16: {
            object4 = binaryBitmap;
            n16 = n3;
            n15 = n4;
            n14 = n7;
            n10 = 4;
            f5 = 5.6E-45f;
            if (n7 > n10) {
                return;
            }
            Reader reader = this.delegate;
            try {
                result2 = reader.decode(binaryBitmap, map2);
                object3 = list.iterator();
            }
            catch (ReaderException readerException) {
                return;
            }
            while (bl2 = object3.hasNext()) {
                object2 = ((Result)object3.next()).getText();
                bl2 = ((String)object2).equals(object = result2.getText());
                if (!bl2) continue;
                break block16;
            }
            object3 = GenericMultipleBarcodeReader.translateResultPoints(result2, n16, n15);
            list.add(object3);
        }
        ResultPoint[] resultPointArray = result2.getResultPoints();
        if (resultPointArray != null && (n8 = resultPointArray.length) != 0) {
            float f6;
            float f7;
            int n17;
            float f8;
            float f11;
            float f12;
            float f14;
            int n18;
            int n19 = binaryBitmap.getWidth();
            int n20 = binaryBitmap.getHeight();
            float f15 = n19;
            float f16 = n20;
            int n21 = resultPointArray.length;
            int n22 = 0;
            float f17 = 0.0f;
            float f18 = f16;
            bl2 = false;
            f16 = 0.0f;
            object2 = null;
            for (n18 = 0; n18 < n21; ++n18) {
                float f19;
                ResultPoint resultPoint = resultPointArray[n18];
                if (resultPoint == null) continue;
                float f20 = resultPoint.getX();
                f14 = resultPoint.getY();
                Object object5 = f20 == f15 ? 0 : (f20 < f15 ? -1 : 1);
                if (object5 < 0) {
                    f15 = f20;
                }
                if ((object5 = f14 == f18 ? 0 : (f14 < f18 ? -1 : 1)) < 0) {
                    f18 = f14;
                }
                if ((object5 = f20 == f17 ? 0 : (f20 > f17 ? 1 : -1)) > 0) {
                    f17 = f20;
                }
                if ((f19 = f14 == f16 ? 0 : (f14 > f16 ? 1 : -1)) <= 0) continue;
                f16 = f14;
            }
            f14 = 100.0f;
            float f22 = f15 - f14;
            n10 = (int)(f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1));
            if (n10 > 0) {
                n10 = (int)f15;
                object3 = ((BinaryBitmap)object4).crop(0, 0, n10, n20);
                int n24 = n14 + 1;
                GenericMultipleBarcodeReader genericMultipleBarcodeReader = this;
                object2 = map2;
                f12 = f16;
                object = list;
                f11 = f17;
                n22 = n3;
                f8 = f18;
                n17 = n4;
                n15 = 0;
                n18 = n24;
                this.doDecodeMultiple((BinaryBitmap)object3, map2, list, n3, n4, n24);
            } else {
                f12 = f16;
                f11 = f17;
                f8 = f18;
                n15 = 0;
            }
            n10 = (int)(f8 == f14 ? 0 : (f8 > f14 ? 1 : -1));
            if (n10 > 0) {
                n10 = (int)f8;
                object3 = ((BinaryBitmap)object4).crop(0, 0, n19, n10);
                n18 = n14 + 1;
                GenericMultipleBarcodeReader genericMultipleBarcodeReader = this;
                object2 = map2;
                object = list;
                n22 = n3;
                n17 = n4;
                this.doDecodeMultiple((BinaryBitmap)object3, map2, list, n3, n4, n18);
            }
            if ((n10 = (int)((f7 = f11 - (f5 = (float)(n19 + -100))) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) < 0) {
                n10 = (int)f11;
                n8 = n19 - n10;
                object3 = ((BinaryBitmap)object4).crop(n10, 0, n8, n20);
                n22 = n16 + n10;
                n18 = n14 + 1;
                GenericMultipleBarcodeReader genericMultipleBarcodeReader = this;
                object2 = map2;
                object = list;
                n17 = n4;
                this.doDecodeMultiple((BinaryBitmap)object3, map2, list, n22, n4, n18);
            }
            if ((n10 = (int)((f6 = f12 - (f5 = (float)(n20 + -100))) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1))) < 0) {
                n10 = (int)f12;
                object3 = ((BinaryBitmap)object4).crop(0, n10, n19, n20 -= n10);
                n22 = n4 + n10;
                n17 = n14 + 1;
                object4 = this;
                Object object6 = object3;
                object3 = map2;
                object2 = list;
                n21 = n3;
                this.doDecodeMultiple((BinaryBitmap)object6, map2, list, n3, n22, n17);
            }
        }
        return;
    }

    private static Result translateResultPoints(Result object, int n3, int n4) {
        Result result2;
        Object object2;
        Object object3;
        int n7;
        ResultPoint[] resultPointArray = ((Result)object).getResultPoints();
        if (resultPointArray == null) {
            return object;
        }
        ResultPoint[] resultPointArray2 = new ResultPoint[resultPointArray.length];
        for (int i3 = 0; i3 < (n7 = resultPointArray.length); ++i3) {
            object3 = resultPointArray[i3];
            if (object3 == null) continue;
            float f5 = ((ResultPoint)object3).getX();
            float f6 = n3;
            f5 += f6;
            float f7 = ((ResultPoint)object3).getY();
            f6 = n4;
            resultPointArray2[i3] = object2 = new ResultPoint(f5, f7 += f6);
        }
        object2 = ((Result)object).getText();
        byte[] byArray = ((Result)object).getRawBytes();
        int n8 = ((Result)object).getNumBits();
        BarcodeFormat barcodeFormat = ((Result)object).getBarcodeFormat();
        long l2 = ((Result)object).getTimestamp();
        object3 = result2;
        result2 = new Result((String)object2, byArray, n8, resultPointArray2, barcodeFormat, l2);
        object = ((Result)object).getResultMetadata();
        result2.putAllMetadata((Map)object);
        return result2;
    }

    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) {
        return this.decodeMultiple(binaryBitmap, null);
    }

    public Result[] decodeMultiple(BinaryBitmap resultArray, Map map2) {
        ArrayList arrayList = new ArrayList();
        this.doDecodeMultiple((BinaryBitmap)resultArray, map2, arrayList, 0, 0, 0);
        boolean bl2 = arrayList.isEmpty();
        if (!bl2) {
            resultArray = new Result[arrayList.size()];
            return arrayList.toArray(resultArray);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

