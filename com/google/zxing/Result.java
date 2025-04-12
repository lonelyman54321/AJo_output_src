/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import java.util.EnumMap;
import java.util.Map;

public final class Result {
    private final BarcodeFormat format;
    private final int numBits;
    private final byte[] rawBytes;
    private Map resultMetadata;
    private ResultPoint[] resultPoints;
    private final String text;
    private final long timestamp;

    public Result(String string2, byte[] byArray, int n3, ResultPoint[] resultPointArray, BarcodeFormat barcodeFormat, long l2) {
        this.text = string2;
        this.rawBytes = byArray;
        this.numBits = n3;
        this.resultPoints = resultPointArray;
        this.format = barcodeFormat;
        this.resultMetadata = null;
        this.timestamp = l2;
    }

    public Result(String string2, byte[] byArray, ResultPoint[] resultPointArray, BarcodeFormat barcodeFormat) {
        long l2 = System.currentTimeMillis();
        this(string2, byArray, resultPointArray, barcodeFormat, l2);
    }

    public Result(String string2, byte[] byArray, ResultPoint[] resultPointArray, BarcodeFormat barcodeFormat, long l2) {
        int n3;
        if (byArray == null) {
            boolean bl2 = false;
            n3 = 0;
        } else {
            int n4;
            n3 = n4 = byArray.length * 8;
        }
        this(string2, byArray, n3, resultPointArray, barcodeFormat, l2);
    }

    public void addResultPoints(ResultPoint[] resultPointArray) {
        int n3;
        ResultPoint[] resultPointArray2 = this.resultPoints;
        if (resultPointArray2 == null) {
            this.resultPoints = resultPointArray;
            return;
        }
        if (resultPointArray != null && (n3 = resultPointArray.length) > 0) {
            n3 = resultPointArray2.length;
            int n4 = resultPointArray.length;
            ResultPoint[] resultPointArray3 = new ResultPoint[n3 += n4];
            n4 = resultPointArray2.length;
            System.arraycopy(resultPointArray2, 0, resultPointArray3, 0, n4);
            int n7 = resultPointArray2.length;
            n4 = resultPointArray.length;
            System.arraycopy(resultPointArray, 0, resultPointArray3, n7, n4);
            this.resultPoints = resultPointArray3;
        }
    }

    public BarcodeFormat getBarcodeFormat() {
        return this.format;
    }

    public int getNumBits() {
        return this.numBits;
    }

    public byte[] getRawBytes() {
        return this.rawBytes;
    }

    public Map getResultMetadata() {
        return this.resultMetadata;
    }

    public ResultPoint[] getResultPoints() {
        return this.resultPoints;
    }

    public String getText() {
        return this.text;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void putAllMetadata(Map map2) {
        if (map2 != null) {
            Map map3 = this.resultMetadata;
            if (map3 == null) {
                this.resultMetadata = map2;
                return;
            }
            map3.putAll(map2);
        }
    }

    public void putMetadata(ResultMetadataType resultMetadataType, Object object) {
        EnumMap enumMap = this.resultMetadata;
        if (enumMap == null) {
            Class<ResultMetadataType> clazz = ResultMetadataType.class;
            this.resultMetadata = enumMap = new EnumMap(clazz);
        }
        this.resultMetadata.put(resultMetadataType, object);
    }

    public String toString() {
        return this.text;
    }
}

