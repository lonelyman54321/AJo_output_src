/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.multi.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.multi.MultipleBarcodeReader;
import com.google.zxing.multi.qrcode.detector.MultiDetector;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class QRCodeMultiReader
extends QRCodeReader
implements MultipleBarcodeReader {
    private static final Result[] EMPTY_RESULT_ARRAY = new Result[0];
    private static final ResultPoint[] NO_POINTS = new ResultPoint[0];

    private static List processStructuredAppend(List arrayList) {
        boolean bl2;
        ArrayList<Object> arrayList2 = arrayList.iterator();
        while (bl2 = arrayList2.hasNext()) {
            boolean bl3;
            Object object;
            int n3;
            Object object2;
            Object object3;
            int n4;
            boolean bl4;
            Object object4;
            ResultPoint[] resultPointArray;
            boolean bl5;
            Object object5;
            Object object6 = ((Result)arrayList2.next()).getResultMetadata();
            bl2 = object6.containsKey(object5 = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE);
            if (!bl2) continue;
            arrayList2 = new ArrayList<Object>();
            object6 = new ArrayList();
            arrayList = arrayList.iterator();
            while (bl5 = arrayList.hasNext()) {
                object5 = (Result)arrayList.next();
                arrayList2.add(object5);
                resultPointArray = ((Result)object5).getResultMetadata();
                bl4 = resultPointArray.containsKey(object4 = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE);
                if (!bl4) continue;
                ((ArrayList)object6).add(object5);
            }
            bl5 = false;
            arrayList = new ArrayList<ResultMetadataType>(null);
            Collections.sort(object6, arrayList);
            arrayList = new ArrayList<ResultMetadataType>();
            object5 = ((ArrayList)object6).iterator();
            bl4 = false;
            resultPointArray = null;
            int n7 = 0;
            object4 = null;
            int n8 = 0;
            while ((n4 = object5.hasNext()) != 0) {
                object3 = (Result)object5.next();
                object2 = ((Result)object3).getText();
                ((StringBuilder)((Object)arrayList)).append((String)object2);
                n3 = ((Result)object3).getRawBytes().length;
                n7 += n3;
                object2 = ((Result)object3).getResultMetadata();
                n3 = (int)(object2.containsKey(object = ResultMetadataType.BYTE_SEGMENTS) ? 1 : 0);
                if (n3 == 0) continue;
                object3 = ((Iterable)((Result)object3).getResultMetadata().get(object)).iterator();
                while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                    object2 = (byte[])object3.next();
                    n3 = ((Object)object2).length;
                    n8 += n3;
                }
            }
            object5 = new byte[n7];
            object4 = new byte[n8];
            object6 = ((ArrayList)object6).iterator();
            n4 = 0;
            object3 = null;
            n3 = 0;
            object2 = null;
            while (bl3 = object6.hasNext()) {
                ResultMetadataType resultMetadataType;
                object = (Result)object6.next();
                Object object7 = ((Result)object).getRawBytes();
                int n10 = ((Result)object).getRawBytes().length;
                System.arraycopy(object7, 0, object5, n4, n10);
                int n14 = ((Result)object).getRawBytes().length;
                n4 += n14;
                object7 = ((Result)object).getResultMetadata();
                n14 = (int)(object7.containsKey((Object)(resultMetadataType = ResultMetadataType.BYTE_SEGMENTS)) ? 1 : 0);
                if (n14 == 0) continue;
                object = ((Iterable)((Result)object).getResultMetadata().get((Object)resultMetadataType)).iterator();
                while ((n14 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object7 = (byte[])object.next();
                    n10 = ((byte[])object7).length;
                    System.arraycopy(object7, 0, object4, n3, n10);
                    n14 = ((byte[])object7).length;
                    n3 += n14;
                }
            }
            arrayList = ((StringBuilder)((Object)arrayList)).toString();
            resultPointArray = NO_POINTS;
            object3 = BarcodeFormat.QR_CODE;
            object6 = new Result((String)((Object)arrayList), (byte[])object5, resultPointArray, (BarcodeFormat)((Object)object3));
            if (n8 > 0) {
                arrayList = new ArrayList<ResultMetadataType>();
                arrayList.add((ResultMetadataType)((Object)object4));
                object5 = ResultMetadataType.BYTE_SEGMENTS;
                ((Result)object6).putMetadata((ResultMetadataType)((Object)object5), arrayList);
            }
            arrayList2.add(object6);
            return arrayList2;
        }
        return arrayList;
    }

    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) {
        return this.decodeMultiple(binaryBitmap, null);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public Result[] decodeMultiple(BinaryBitmap var1_1, Map var2_2) {
        var3_3 = new ArrayList<Object>();
        var1_1 = var1_1.getBlackMatrix();
        var4_4 = new MultiDetector((BitMatrix)var1_1);
        block25: for (ResultPoint[] var7_7 : var4_4.detectMulti((Map)var2_2)) {
            block29: {
                var8_8 = this.getDecoder();
                var9_9 = var7_7 /* !! */ .getBits();
                var8_8 = var8_8.decode((BitMatrix)var9_9, (Map)var2_2);
                var7_7 /* !! */  = var7_7 /* !! */ .getPoints();
                var9_9 = var8_8.getOther();
                var10_10 = var9_9 instanceof QRCodeDecoderMetaData;
                if (var10_10) {
                    var9_9 = var8_8.getOther();
                    var9_9 = (QRCodeDecoderMetaData)var9_9;
                    var9_9.applyMirroredCorrection(var7_7 /* !! */ );
                }
                var11_11 /* !! */  = var8_8.getText();
                var12_12 = var8_8.getRawBytes();
                var13_13 = BarcodeFormat.QR_CODE;
                var9_9 = new Result(var11_11 /* !! */ , var12_12, var7_7 /* !! */ , var13_13);
                var7_7 /* !! */  = var8_8.getByteSegments();
                if (var7_7 /* !! */  == null) ** GOTO lbl37
                var11_11 /* !! */  = ResultMetadataType.BYTE_SEGMENTS;
                var9_9.putMetadata((ResultMetadataType)var11_11 /* !! */ , var7_7 /* !! */ );
lbl37:
                // 2 sources

                if ((var7_7 /* !! */  = var8_8.getECLevel()) == null) ** GOTO lbl42
                var11_11 /* !! */  = ResultMetadataType.ERROR_CORRECTION_LEVEL;
                var9_9.putMetadata((ResultMetadataType)var11_11 /* !! */ , var7_7 /* !! */ );
lbl42:
                // 2 sources

                if (!(var14_14 = var8_8.hasStructuredAppend())) break block29;
                var7_7 /* !! */  = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
                var15_15 = var8_8.getStructuredAppendSequenceNumber();
                var11_11 /* !! */  = Integer.valueOf(var15_15);
                var9_9.putMetadata((ResultMetadataType)var7_7 /* !! */ , var11_11 /* !! */ );
                var7_7 /* !! */  = ResultMetadataType.STRUCTURED_APPEND_PARITY;
                var16_16 = var8_8.getStructuredAppendParity();
                var8_8 = var16_16;
                var9_9.putMetadata((ResultMetadataType)var7_7 /* !! */ , var8_8);
            }
            var3_3.add(var9_9);
lbl62:
            // 2 sources

        }
        var17_17 = var3_3.isEmpty();
        if (var17_17) {
            return QRCodeMultiReader.EMPTY_RESULT_ARRAY;
        }
        var1_1 = QRCodeMultiReader.processStructuredAppend(var3_3);
        var2_2 = new Result[var1_1.size()];
        return var1_1.toArray(var2_2);
        catch (ReaderException v0) {
            ** continue;
        }
    }
}

