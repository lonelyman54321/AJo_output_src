/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.maxicode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.maxicode.decoder.Decoder;
import java.util.Map;

public final class MaxiCodeReader
implements Reader {
    private static final int MATRIX_HEIGHT = 33;
    private static final int MATRIX_WIDTH = 30;
    private static final ResultPoint[] NO_POINTS = new ResultPoint[0];
    private final Decoder decoder;

    public MaxiCodeReader() {
        Decoder decoder;
        this.decoder = decoder = new Decoder();
    }

    private static BitMatrix extractPureBits(BitMatrix bitMatrix) {
        int[] nArray = bitMatrix.getEnclosingRectangle();
        if (nArray != null) {
            int n3 = nArray[0];
            int n4 = nArray[1];
            int n7 = 2;
            int n8 = nArray[n7];
            int n10 = 3;
            int n14 = nArray[n10];
            int n15 = 30;
            int n16 = 33;
            BitMatrix bitMatrix2 = new BitMatrix(n15, n16);
            for (int i3 = 0; i3 < n16; ++i3) {
                int n17 = i3 * n14;
                int n18 = (n14 / 2 + n17) / n16 + n4;
                for (n17 = 0; n17 < n15; ++n17) {
                    int n19 = n17 * n8;
                    int n20 = n8 / 2 + n19;
                    n19 = ((i3 & 1) * n8 / n7 + n20) / n15 + n3;
                    if ((n19 = (int)(bitMatrix.get(n19, n18) ? 1 : 0)) == 0) continue;
                    bitMatrix2.set(n17, i3);
                }
            }
            return bitMatrix2;
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
            object = MaxiCodeReader.extractPureBits(((BinaryBitmap)object).getBlackMatrix());
            object = this.decoder.decode((BitMatrix)object, (Map)object2);
            object3 = ((DecoderResult)object).getText();
            byte[] byArray = ((DecoderResult)object).getRawBytes();
            ResultPoint[] resultPointArray = NO_POINTS;
            BarcodeFormat barcodeFormat = BarcodeFormat.MAXICODE;
            object2 = new Result((String)object3, byArray, resultPointArray, barcodeFormat);
            if ((object = ((DecoderResult)object).getECLevel()) != null) {
                object3 = ResultMetadataType.ERROR_CORRECTION_LEVEL;
                ((Result)object2).putMetadata((ResultMetadataType)((Object)object3), object);
            }
            return object2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public void reset() {
    }
}

