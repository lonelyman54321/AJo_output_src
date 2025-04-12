/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.encoder;

import com.google.zxing.datamatrix.encoder.Encoder;
import com.google.zxing.datamatrix.encoder.EncoderContext;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;

class C40Encoder
implements Encoder {
    private int backtrackOneCharacter(EncoderContext encoderContext, StringBuilder stringBuilder, StringBuilder stringBuilder2, int n3) {
        int n4;
        int n7 = stringBuilder.length();
        n3 = n7 - n3;
        stringBuilder.delete(n3, n7);
        encoderContext.pos = n4 = encoderContext.pos + -1;
        n4 = encoderContext.getCurrentChar();
        n4 = this.encodeChar((char)n4, stringBuilder2);
        encoderContext.resetSymbolInfo();
        return n4;
    }

    private static String encodeToCodewords(CharSequence charSequence, int n3) {
        int n4 = charSequence.charAt(n3);
        int n7 = 1;
        int n8 = n3 + 1;
        n8 = charSequence.charAt(n8);
        int n10 = 2;
        char c2 = charSequence.charAt(n3 += n10);
        n8 = n8 * 40 + (n4 *= 1600) + c2 + n7;
        c2 = (char)(n8 / 256);
        n3 = (char)(n8 % 256);
        char[] cArray = new char[n10];
        cArray[0] = c2;
        cArray[n7] = n3;
        String string2 = new String(cArray);
        return string2;
    }

    public static void writeNextTriplet(EncoderContext encoderContext, StringBuilder stringBuilder) {
        String string2 = C40Encoder.encodeToCodewords(stringBuilder, 0);
        encoderContext.writeCodewords(string2);
        stringBuilder.delete(0, 3);
    }

    public void encode(EncoderContext encoderContext) {
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        while ((n3 = encoderContext.hasMoreCharacters()) != 0) {
            n3 = encoderContext.getCurrentChar();
            int n4 = encoderContext.pos;
            int n7 = 1;
            encoderContext.pos = n4 += n7;
            n3 = this.encodeChar((char)n3, stringBuilder);
            n4 = stringBuilder.length();
            int n8 = 3;
            n4 = n4 / n8 << n7;
            int n10 = encoderContext.getCodewordCount() + n4;
            encoderContext.updateSymbolInfo(n10);
            SymbolInfo symbolInfo = encoderContext.getSymbolInfo();
            n4 = symbolInfo.getDataCapacity() - n10;
            n10 = (int)(encoderContext.hasMoreCharacters() ? 1 : 0);
            if (n10 == 0) {
                int n14;
                StringBuilder stringBuilder2 = new StringBuilder();
                int n15 = stringBuilder.length() % n8;
                if (n15 == (n14 = 2) && (n4 < n14 || n4 > n14)) {
                    n3 = this.backtrackOneCharacter(encoderContext, stringBuilder, stringBuilder2, n3);
                }
                while ((n15 = stringBuilder.length() % n8) == n7 && (n3 <= n8 && n4 != n7 || n3 > n8)) {
                    n3 = this.backtrackOneCharacter(encoderContext, stringBuilder, stringBuilder2, n3);
                }
                break;
            }
            n3 = stringBuilder.length() % n8;
            if (n3 != 0) continue;
            String string2 = encoderContext.getMessage();
            n4 = encoderContext.pos;
            n7 = this.getEncodingMode();
            n3 = HighLevelEncoder.lookAheadTest(string2, n4, n7);
            if (n3 == (n4 = this.getEncodingMode())) continue;
            n3 = 0;
            string2 = null;
            encoderContext.signalEncoderChange(0);
            break;
        }
        this.handleEOD(encoderContext, stringBuilder);
    }

    public int encodeChar(char c2, StringBuilder stringBuilder) {
        int n3;
        char c3 = '\u0001';
        char c5 = ' ';
        if (c2 == c5) {
            stringBuilder.append('\u0003');
            return c3;
        }
        char c6 = '0';
        if (c2 >= c6 && c2 <= (c6 = '9')) {
            c2 = (char)(c2 + -44);
            stringBuilder.append(c2);
            return c3;
        }
        c6 = 'A';
        if (c2 >= c6 && c2 <= (c6 = 'Z')) {
            c2 = (char)(c2 + -51);
            stringBuilder.append(c2);
            return c3;
        }
        c6 = '\u0002';
        if (c2 < c5) {
            stringBuilder.append('\u0000');
            stringBuilder.append(c2);
            return c6;
        }
        c5 = '!';
        if (c2 >= c5 && c2 <= (n3 = 47)) {
            stringBuilder.append(c3);
            c2 = (char)(c2 - c5);
            stringBuilder.append(c2);
            return c6;
        }
        c5 = ':';
        if (c2 >= c5 && c2 <= (c5 = '@')) {
            stringBuilder.append(c3);
            c2 = (char)(c2 + -43);
            stringBuilder.append(c2);
            return c6;
        }
        c5 = '[';
        if (c2 >= c5 && c2 <= (c5 = '_')) {
            stringBuilder.append(c3);
            c2 = (char)(c2 + -69);
            stringBuilder.append(c2);
            return c6;
        }
        c3 = '`';
        if (c2 >= c3 && c2 <= (c5 = '\u007f')) {
            stringBuilder.append(c6);
            c2 = (char)(c2 - c3);
            stringBuilder.append(c2);
            return c6;
        }
        stringBuilder.append("\u0001\u001e");
        c2 = (char)(c2 + -128);
        return this.encodeChar(c2, stringBuilder) + c6;
    }

    public int getEncodingMode() {
        return 1;
    }

    public void handleEOD(EncoderContext object, StringBuilder stringBuilder) {
        block13: {
            block11: {
                boolean bl2;
                char c2;
                int n3;
                int n4;
                int n7;
                int n8;
                block12: {
                    int bl22;
                    block10: {
                        n8 = stringBuilder.length();
                        n7 = 3;
                        n8 /= n7;
                        n4 = 1;
                        n3 = stringBuilder.length() % n7;
                        int n10 = ((EncoderContext)object).getCodewordCount() + (n8 <<= n4);
                        ((EncoderContext)object).updateSymbolInfo(n10);
                        SymbolInfo symbolInfo = ((EncoderContext)object).getSymbolInfo();
                        n8 = symbolInfo.getDataCapacity() - n10;
                        n10 = 2;
                        c2 = '\u00fe';
                        if (n3 != n10) break block10;
                        stringBuilder.append('\u0000');
                        while ((n8 = stringBuilder.length()) >= n7) {
                            C40Encoder.writeNextTriplet((EncoderContext)object, stringBuilder);
                        }
                        boolean bl3 = ((EncoderContext)object).hasMoreCharacters();
                        if (bl3) {
                            ((EncoderContext)object).writeCodeword(c2);
                        }
                        break block11;
                    }
                    if (n8 != n4 || n3 != n4) break block12;
                    while ((n8 = stringBuilder.length()) >= n7) {
                        C40Encoder.writeNextTriplet((EncoderContext)object, stringBuilder);
                    }
                    boolean n14 = ((EncoderContext)object).hasMoreCharacters();
                    if (n14) {
                        ((EncoderContext)object).writeCodeword(c2);
                    }
                    ((EncoderContext)object).pos = bl22 = ((EncoderContext)object).pos - n4;
                    break block11;
                }
                if (n3 != 0) break block13;
                while ((n4 = stringBuilder.length()) >= n7) {
                    C40Encoder.writeNextTriplet((EncoderContext)object, stringBuilder);
                }
                if (n8 > 0 || (bl2 = ((EncoderContext)object).hasMoreCharacters())) {
                    ((EncoderContext)object).writeCodeword(c2);
                }
            }
            ((EncoderContext)object).signalEncoderChange(0);
            return;
        }
        object = new IllegalStateException("Unexpected case. Please report!");
        throw object;
    }
}

