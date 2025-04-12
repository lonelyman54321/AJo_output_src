/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;
import java.util.Map;

public final class UPCAWriter
implements Writer {
    private final EAN13Writer subWriter;

    public UPCAWriter() {
        EAN13Writer eAN13Writer;
        this.subWriter = eAN13Writer = new EAN13Writer();
    }

    public BitMatrix encode(String string2, BarcodeFormat barcodeFormat, int n3, int n4) {
        return this.encode(string2, barcodeFormat, n3, n4, null);
    }

    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map map2) {
        BarcodeFormat barcodeFormat = BarcodeFormat.UPC_A;
        if (object2 == barcodeFormat) {
            EAN13Writer eAN13Writer = this.subWriter;
            object = String.valueOf(object);
            String string2 = "0".concat((String)object);
            BarcodeFormat barcodeFormat2 = BarcodeFormat.EAN_13;
            return eAN13Writer.encode(string2, barcodeFormat2, n3, n4, map2);
        }
        object2 = String.valueOf(object2);
        object2 = "Can only encode UPC-A, but got ".concat((String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

