/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.encoder;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import com.google.zxing.datamatrix.encoder.EncoderContext;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;

final class X12Encoder
extends C40Encoder {
    public void encode(EncoderContext encoderContext) {
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        while ((n3 = encoderContext.hasMoreCharacters()) != 0) {
            int n4;
            n3 = encoderContext.getCurrentChar();
            encoderContext.pos = n4 = encoderContext.pos + 1;
            this.encodeChar((char)n3, stringBuilder);
            n3 = stringBuilder.length() % 3;
            if (n3 != 0) continue;
            C40Encoder.writeNextTriplet(encoderContext, stringBuilder);
            String string2 = encoderContext.getMessage();
            n4 = encoderContext.pos;
            int n7 = this.getEncodingMode();
            n3 = HighLevelEncoder.lookAheadTest(string2, n4, n7);
            if (n3 == (n4 = this.getEncodingMode())) continue;
            n3 = 0;
            string2 = null;
            encoderContext.signalEncoderChange(0);
            break;
        }
        this.handleEOD(encoderContext, stringBuilder);
    }

    public int encodeChar(char n3, StringBuilder stringBuilder) {
        int n4 = 13;
        char c2 = '\u0001';
        if (n3 != n4) {
            n4 = 32;
            if (n3 != n4) {
                n4 = 42;
                if (n3 != n4) {
                    n4 = 62;
                    if (n3 != n4) {
                        n4 = 48;
                        if (n3 >= n4 && n3 <= (n4 = 57)) {
                            n3 = (char)(n3 + -44);
                            stringBuilder.append((char)n3);
                        } else {
                            n4 = 65;
                            if (n3 >= n4 && n3 <= (n4 = 90)) {
                                n3 = (char)(n3 + -51);
                                stringBuilder.append((char)n3);
                            } else {
                                HighLevelEncoder.illegalCharacter((char)n3);
                            }
                        }
                    } else {
                        n3 = 2;
                        stringBuilder.append((char)n3);
                    }
                } else {
                    stringBuilder.append(c2);
                }
            } else {
                n3 = 3;
                stringBuilder.append((char)n3);
            }
        } else {
            n3 = 0;
            stringBuilder.append('\u0000');
        }
        return c2;
    }

    public int getEncodingMode() {
        return 3;
    }

    public void handleEOD(EncoderContext encoderContext, StringBuilder stringBuilder) {
        encoderContext.updateSymbolInfo();
        SymbolInfo symbolInfo = encoderContext.getSymbolInfo();
        int n3 = symbolInfo.getDataCapacity();
        int n4 = encoderContext.getCodewordCount();
        n3 -= n4;
        int n7 = stringBuilder.length();
        encoderContext.pos = n4 = encoderContext.pos - n7;
        n7 = encoderContext.getRemainingCharacters();
        n4 = 1;
        if (n7 > n4 || n3 > n4 || (n7 = encoderContext.getRemainingCharacters()) != n3) {
            n7 = 254;
            encoderContext.writeCodeword((char)n7);
        }
        if ((n7 = encoderContext.getNewEncoding()) < 0) {
            n7 = 0;
            stringBuilder = null;
            encoderContext.signalEncoderChange(0);
        }
    }
}

