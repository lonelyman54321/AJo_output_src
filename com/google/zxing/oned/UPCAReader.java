/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.FormatException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.EAN13Reader;
import com.google.zxing.oned.UPCEANReader;
import java.util.Map;

public final class UPCAReader
extends UPCEANReader {
    private final UPCEANReader ean13Reader;

    public UPCAReader() {
        EAN13Reader eAN13Reader = new EAN13Reader();
        this.ean13Reader = eAN13Reader;
    }

    private static Result maybeReturnResult(Result object) {
        char c2;
        Object object2 = ((Result)object).getText();
        Result result2 = null;
        char c3 = ((String)object2).charAt(0);
        if (c3 == (c2 = '0')) {
            c2 = '\u0001';
            object2 = ((String)object2).substring(c2);
            ResultPoint[] resultPointArray = ((Result)object).getResultPoints();
            BarcodeFormat barcodeFormat = BarcodeFormat.UPC_A;
            result2 = new Result((String)object2, null, resultPointArray, barcodeFormat);
            object2 = ((Result)object).getResultMetadata();
            if (object2 != null) {
                object = ((Result)object).getResultMetadata();
                result2.putAllMetadata((Map)object);
            }
            return result2;
        }
        throw FormatException.getFormatInstance();
    }

    public Result decode(BinaryBitmap binaryBitmap) {
        return UPCAReader.maybeReturnResult(this.ean13Reader.decode(binaryBitmap));
    }

    public Result decode(BinaryBitmap binaryBitmap, Map map2) {
        return UPCAReader.maybeReturnResult(this.ean13Reader.decode(binaryBitmap, map2));
    }

    public int decodeMiddle(BitArray bitArray, int[] nArray, StringBuilder stringBuilder) {
        return this.ean13Reader.decodeMiddle(bitArray, nArray, stringBuilder);
    }

    public Result decodeRow(int n3, BitArray bitArray, Map map2) {
        return UPCAReader.maybeReturnResult(this.ean13Reader.decodeRow(n3, bitArray, map2));
    }

    public Result decodeRow(int n3, BitArray bitArray, int[] nArray, Map map2) {
        return UPCAReader.maybeReturnResult(this.ean13Reader.decodeRow(n3, bitArray, nArray, map2));
    }

    public BarcodeFormat getBarcodeFormat() {
        return BarcodeFormat.UPC_A;
    }
}

