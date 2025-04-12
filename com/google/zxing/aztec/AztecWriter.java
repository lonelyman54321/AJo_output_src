/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.aztec.encoder.AztecCode;
import com.google.zxing.aztec.encoder.Encoder;
import com.google.zxing.common.BitMatrix;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public final class AztecWriter
implements Writer {
    private static BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Charset charset, int n7, int n8) {
        BarcodeFormat barcodeFormat = BarcodeFormat.AZTEC;
        if (object2 == barcodeFormat) {
            return AztecWriter.renderResult(Encoder.encode(((String)object).getBytes(charset), n7, n8), n3, n4);
        }
        object2 = String.valueOf(object2);
        object2 = "Can only encode AZTEC, but got ".concat((String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    private static BitMatrix renderResult(AztecCode object, int n3, int n4) {
        if ((object = ((AztecCode)object).getMatrix()) != null) {
            int n7 = ((BitMatrix)object).getWidth();
            int n8 = ((BitMatrix)object).getHeight();
            n3 = Math.max(n3, n7);
            n4 = Math.max(n4, n8);
            int n10 = n3 / n7;
            int n14 = n4 / n8;
            n10 = Math.min(n10, n14);
            n14 = n7 * n10;
            n14 = (n3 - n14) / 2;
            int n15 = n8 * n10;
            n15 = (n4 - n15) / 2;
            BitMatrix bitMatrix = new BitMatrix(n3, n4);
            n3 = 0;
            n4 = 0;
            while (n4 < n8) {
                int n16 = n14;
                int n17 = 0;
                while (n17 < n7) {
                    boolean bl2 = ((BitMatrix)object).get(n17, n4);
                    if (bl2) {
                        bitMatrix.setRegion(n16, n15, n10, n10);
                    }
                    ++n17;
                    n16 += n10;
                }
                ++n4;
                n15 += n10;
            }
            return bitMatrix;
        }
        object = new IllegalStateException();
        throw object;
    }

    public BitMatrix encode(String string2, BarcodeFormat barcodeFormat, int n3, int n4) {
        return this.encode(string2, barcodeFormat, n3, n4, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public BitMatrix encode(String string2, BarcodeFormat barcodeFormat, int n3, int n4, Map object) {
        int n7;
        int n8;
        Charset charset;
        block4: {
            block5: {
                Charset charset2;
                block2: {
                    int n10;
                    block3: {
                        EncodeHintType encodeHintType;
                        EncodeHintType encodeHintType2;
                        charset2 = StandardCharsets.ISO_8859_1;
                        n10 = 33;
                        int n14 = 0;
                        if (object == null) break block2;
                        EncodeHintType encodeHintType3 = EncodeHintType.CHARACTER_SET;
                        boolean bl2 = object.containsKey((Object)encodeHintType3);
                        if (bl2) {
                            charset2 = Charset.forName(object.get((Object)encodeHintType3).toString());
                        }
                        if (bl2 = object.containsKey((Object)(encodeHintType2 = EncodeHintType.ERROR_CORRECTION))) {
                            String string3 = object.get((Object)encodeHintType2).toString();
                            n10 = Integer.parseInt(string3);
                        }
                        if (!(bl2 = object.containsKey((Object)(encodeHintType = EncodeHintType.AZTEC_LAYERS)))) break block3;
                        object = object.get((Object)encodeHintType).toString();
                        n14 = Integer.parseInt((String)object);
                        charset = charset2;
                        n8 = n10;
                        n7 = n14;
                        break block4;
                    }
                    charset = charset2;
                    n8 = n10;
                    break block5;
                }
                charset = charset2;
                n8 = 33;
            }
            n7 = 0;
        }
        String string4 = string2;
        return AztecWriter.encode(string2, barcodeFormat, n3, n4, charset, n8, n7);
    }
}

