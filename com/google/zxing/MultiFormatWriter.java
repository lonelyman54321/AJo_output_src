/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter$1;
import com.google.zxing.Writer;
import com.google.zxing.aztec.AztecWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.DataMatrixWriter;
import com.google.zxing.oned.CodaBarWriter;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.oned.Code39Writer;
import com.google.zxing.oned.Code93Writer;
import com.google.zxing.oned.EAN13Writer;
import com.google.zxing.oned.EAN8Writer;
import com.google.zxing.oned.ITFWriter;
import com.google.zxing.oned.UPCAWriter;
import com.google.zxing.oned.UPCEWriter;
import com.google.zxing.pdf417.PDF417Writer;
import com.google.zxing.qrcode.QRCodeWriter;
import java.util.Map;

public final class MultiFormatWriter
implements Writer {
    public BitMatrix encode(String string2, BarcodeFormat barcodeFormat, int n3, int n4) {
        return this.encode(string2, barcodeFormat, n3, n4, null);
    }

    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map map2) {
        Object object3 = MultiFormatWriter$1.$SwitchMap$com$google$zxing$BarcodeFormat;
        int n7 = object2.ordinal();
        int n8 = object3[n7];
        switch (n8) {
            default: {
                object2 = String.valueOf(object2);
                object2 = "No encoder available for format ".concat((String)object2);
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            case 13: {
                object3 = new AztecWriter;
                ((AztecWriter)object3)();
                break;
            }
            case 12: {
                object3 = new DataMatrixWriter;
                ((DataMatrixWriter)object3)();
                break;
            }
            case 11: {
                object3 = new CodaBarWriter;
                ((CodaBarWriter)object3)();
                break;
            }
            case 10: {
                object3 = new PDF417Writer;
                ((PDF417Writer)object3)();
                break;
            }
            case 9: {
                object3 = new ITFWriter;
                ((ITFWriter)object3)();
                break;
            }
            case 8: {
                object3 = new Code128Writer;
                ((Code128Writer)object3)();
                break;
            }
            case 7: {
                object3 = new Code93Writer;
                ((Code93Writer)object3)();
                break;
            }
            case 6: {
                object3 = new Code39Writer;
                ((Code39Writer)object3)();
                break;
            }
            case 5: {
                object3 = new QRCodeWriter;
                ((QRCodeWriter)object3)();
                break;
            }
            case 4: {
                object3 = new UPCAWriter;
                ((UPCAWriter)object3)();
                break;
            }
            case 3: {
                object3 = new EAN13Writer;
                ((EAN13Writer)object3)();
                break;
            }
            case 2: {
                object3 = new UPCEWriter;
                ((UPCEWriter)object3)();
                break;
            }
            case 1: {
                object3 = new EAN8Writer;
                ((EAN8Writer)object3)();
                break;
            }
        }
        return object3.encode((String)object, (BarcodeFormat)((Object)object2), n3, n4, map2);
    }
}

