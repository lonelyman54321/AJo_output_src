/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.encoder;

import com.google.zxing.datamatrix.encoder.Encoder;
import com.google.zxing.datamatrix.encoder.EncoderContext;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;

final class Base256Encoder
implements Encoder {
    private static char randomize255State(char c2, int n3) {
        n3 *= 149;
        int n4 = 255;
        if ((n3 = n3 % n4 + 1 + c2) <= n4) {
            return (char)n3;
        }
        return (char)(n3 + -256);
    }

    public void encode(EncoderContext object) {
        int n3;
        String string2;
        CharSequence charSequence;
        block7: {
            int n4;
            int n7;
            char c2;
            int c5;
            block5: {
                block6: {
                    block4: {
                        String string3;
                        int c22;
                        charSequence = new StringBuilder();
                        c5 = 0;
                        string2 = null;
                        ((StringBuilder)charSequence).append('\u0000');
                        do {
                            c22 = ((EncoderContext)object).hasMoreCharacters();
                            n4 = 1;
                            if (c22 == 0) break block4;
                            c22 = ((EncoderContext)object).getCurrentChar();
                            ((StringBuilder)charSequence).append((char)c22);
                            ((EncoderContext)object).pos = c22 = ((EncoderContext)object).pos + n4;
                            string3 = ((EncoderContext)object).getMessage();
                            c2 = ((EncoderContext)object).pos;
                        } while ((c22 = HighLevelEncoder.lookAheadTest(string3, c2, n7 = this.getEncodingMode())) == (c2 = this.getEncodingMode()));
                        ((EncoderContext)object).signalEncoderChange(0);
                    }
                    n3 = ((StringBuilder)charSequence).length() - n4;
                    c2 = ((EncoderContext)object).getCodewordCount() + n3 + n4;
                    ((EncoderContext)object).updateSymbolInfo(c2);
                    SymbolInfo symbolInfo = ((EncoderContext)object).getSymbolInfo();
                    n7 = symbolInfo.getDataCapacity() - c2;
                    c2 = n7 > 0 ? (char)'\u0001' : '\u0000';
                    n7 = (int)(((EncoderContext)object).hasMoreCharacters() ? 1 : 0);
                    if (n7 == 0 && c2 == '\u0000') break block5;
                    c2 = '\u00f9';
                    if (n3 > c2) break block6;
                    char c3 = (char)n3;
                    ((StringBuilder)charSequence).setCharAt(0, c3);
                    break block5;
                }
                n7 = 1555;
                if (n3 > n7) break block7;
                n7 = n3 / 250 + c2;
                c2 = (char)n7;
                ((StringBuilder)charSequence).setCharAt(0, c2);
                char c6 = (char)(n3 % 250);
                ((StringBuilder)charSequence).insert(n4, c6);
            }
            int n8 = ((StringBuilder)charSequence).length();
            while (c5 < n8) {
                c2 = ((StringBuilder)charSequence).charAt(c5);
                n7 = ((EncoderContext)object).getCodewordCount() + n4;
                c2 = Base256Encoder.randomize255State(c2, n7);
                ((EncoderContext)object).writeCodeword(c2);
                ++c5;
            }
            return;
        }
        string2 = String.valueOf(n3);
        charSequence = "Message length not in valid ranges: ".concat(string2);
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public int getEncodingMode() {
        return 5;
    }
}

