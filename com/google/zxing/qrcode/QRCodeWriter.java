/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.QRCode;
import java.util.Map;

public final class QRCodeWriter
implements Writer {
    private static final int QUIET_ZONE_SIZE = 4;

    private static BitMatrix renderResult(QRCode object, int n3, int n4, int n7) {
        if ((object = ((QRCode)object).getMatrix()) != null) {
            int n8 = ((ByteMatrix)object).getWidth();
            int n10 = ((ByteMatrix)object).getHeight();
            byte by2 = 1;
            int n14 = n8 + (n7 <<= by2);
            n3 = Math.max(n3, n14);
            n4 = Math.max(n4, n7 += n10);
            n14 = n3 / n14;
            n7 = n4 / n7;
            n7 = Math.min(n14, n7);
            n14 = n8 * n7;
            n14 = (n3 - n14) / 2;
            int n15 = n10 * n7;
            n15 = (n4 - n15) / 2;
            BitMatrix bitMatrix = new BitMatrix(n3, n4);
            n3 = 0;
            n4 = 0;
            while (n4 < n10) {
                int n16 = n14;
                int n17 = 0;
                while (n17 < n8) {
                    byte by4 = ((ByteMatrix)object).get(n17, n4);
                    if (by4 == by2) {
                        bitMatrix.setRegion(n16, n15, n7, n7);
                    }
                    ++n17;
                    n16 += n7;
                }
                ++n4;
                n15 += n7;
            }
            return bitMatrix;
        }
        object = new IllegalStateException();
        throw object;
    }

    public BitMatrix encode(String string2, BarcodeFormat barcodeFormat, int n3, int n4) {
        return this.encode(string2, barcodeFormat, n3, n4, null);
    }

    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map map2) {
        boolean n7 = ((String)object).isEmpty();
        if (!n7) {
            Object object3 = BarcodeFormat.QR_CODE;
            if (object2 == object3) {
                if (n3 >= 0 && n4 >= 0) {
                    int n8;
                    object2 = ErrorCorrectionLevel.L;
                    int n10 = 4;
                    if (map2 != null) {
                        EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
                        boolean bl2 = map2.containsKey((Object)encodeHintType);
                        if (bl2) {
                            object2 = ErrorCorrectionLevel.valueOf(map2.get((Object)encodeHintType).toString());
                        }
                        if (bl2 = map2.containsKey((Object)(encodeHintType = EncodeHintType.MARGIN))) {
                            object3 = map2.get((Object)encodeHintType).toString();
                            n8 = Integer.parseInt((String)object3);
                        }
                    }
                    return QRCodeWriter.renderResult(Encoder.encode((String)object, (ErrorCorrectionLevel)((Object)object2), map2), n3, n4, n8);
                }
                object2 = new StringBuilder("Requested dimensions are too small: ");
                ((StringBuilder)object2).append(n3);
                ((StringBuilder)object2).append('x');
                ((StringBuilder)object2).append(n4);
                object2 = ((StringBuilder)object2).toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object2 = String.valueOf(object2);
            object2 = "Can only encode QR_CODE, but got ".concat((String)object2);
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object = new IllegalArgumentException("Found empty contents");
        throw object;
    }
}

