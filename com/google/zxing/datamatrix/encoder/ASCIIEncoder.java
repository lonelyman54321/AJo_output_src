/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.encoder;

import com.google.zxing.datamatrix.encoder.Encoder;
import com.google.zxing.datamatrix.encoder.EncoderContext;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;

final class ASCIIEncoder
implements Encoder {
    private static char encodeASCIIDigits(char c2, char c3) {
        boolean bl2 = HighLevelEncoder.isDigit(c2);
        if (bl2 && (bl2 = HighLevelEncoder.isDigit(c3))) {
            c2 = (char)((c2 + -48) * 10);
            return (char)(c3 + -48 + c2 + 130);
        }
        StringBuilder stringBuilder = new StringBuilder("not digits: ");
        stringBuilder.append(c2);
        stringBuilder.append(c3);
        String string2 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public void encode(EncoderContext object) {
        String string2 = ((EncoderContext)object).getMessage();
        int c2 = ((EncoderContext)object).pos;
        int n3 = HighLevelEncoder.determineConsecutiveDigitCount(string2, c2);
        int n4 = 1;
        int n7 = 2;
        if (n3 >= n7) {
            string2 = ((EncoderContext)object).getMessage();
            int n8 = ((EncoderContext)object).pos;
            n3 = string2.charAt(n8);
            String string3 = ((EncoderContext)object).getMessage();
            int n10 = ((EncoderContext)object).pos + n4;
            char c3 = string3.charAt(n10);
            n3 = ASCIIEncoder.encodeASCIIDigits((char)n3, c3);
            ((EncoderContext)object).writeCodeword((char)n3);
            ((EncoderContext)object).pos = n3 = ((EncoderContext)object).pos + n7;
            return;
        }
        n3 = ((EncoderContext)object).getCurrentChar();
        String string4 = ((EncoderContext)object).getMessage();
        int n14 = ((EncoderContext)object).pos;
        int n15 = this.getEncodingMode();
        int n16 = HighLevelEncoder.lookAheadTest(string4, n14, n15);
        if (n16 != (n14 = this.getEncodingMode())) {
            if (n16 != n4) {
                if (n16 != n7) {
                    n3 = 3;
                    if (n16 != n3) {
                        n3 = 4;
                        if (n16 != n3) {
                            n3 = 5;
                            if (n16 == n3) {
                                ((EncoderContext)object).writeCodeword('\u00e7');
                                ((EncoderContext)object).signalEncoderChange(n3);
                                return;
                            }
                            String string5 = String.valueOf(n16);
                            string2 = "Illegal mode: ".concat(string5);
                            object = new IllegalStateException(string2);
                            throw object;
                        }
                        ((EncoderContext)object).writeCodeword('\u00f0');
                        ((EncoderContext)object).signalEncoderChange(n3);
                        return;
                    }
                    ((EncoderContext)object).writeCodeword('\u00ee');
                    ((EncoderContext)object).signalEncoderChange(n3);
                    return;
                }
                ((EncoderContext)object).writeCodeword('\u00ef');
                ((EncoderContext)object).signalEncoderChange(n7);
                return;
            }
            ((EncoderContext)object).writeCodeword('\u00e6');
            ((EncoderContext)object).signalEncoderChange(n4);
            return;
        }
        n7 = (int)(HighLevelEncoder.isExtendedASCII((char)n3) ? 1 : 0);
        if (n7 != 0) {
            ((EncoderContext)object).writeCodeword('\u00eb');
            n3 = (char)(n3 + -127);
            ((EncoderContext)object).writeCodeword((char)n3);
            ((EncoderContext)object).pos = n3 = ((EncoderContext)object).pos + n4;
            return;
        }
        n3 = (char)(n3 + n4);
        ((EncoderContext)object).writeCodeword((char)n3);
        ((EncoderContext)object).pos = n3 = ((EncoderContext)object).pos + n4;
    }

    public int getEncodingMode() {
        return 0;
    }
}

