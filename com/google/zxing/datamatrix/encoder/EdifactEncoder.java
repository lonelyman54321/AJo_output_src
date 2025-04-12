/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.encoder;

import com.google.zxing.datamatrix.encoder.Encoder;
import com.google.zxing.datamatrix.encoder.EncoderContext;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;

final class EdifactEncoder
implements Encoder {
    private static void encodeChar(char n3, StringBuilder stringBuilder) {
        int n4;
        int n7 = 32;
        if (n3 >= n7 && n3 <= (n7 = 63)) {
            stringBuilder.append((char)n3);
            return;
        }
        n7 = 64;
        if (n3 >= n7 && n3 <= (n4 = 94)) {
            n3 = (char)(n3 - n7);
            stringBuilder.append((char)n3);
            return;
        }
        HighLevelEncoder.illegalCharacter((char)n3);
    }

    private static String encodeToCodewords(CharSequence object, int n3) {
        int n4 = object.length() - n3;
        if (n4 != 0) {
            int n7;
            int n8;
            char c2 = object.charAt(n3);
            char c3 = '\u0000';
            StringBuilder stringBuilder = null;
            int n10 = 2;
            if (n4 >= n10) {
                n8 = n3 + 1;
                n8 = object.charAt(n8);
            } else {
                n8 = 0;
            }
            int n14 = 3;
            if (n4 >= n14) {
                n7 = n3 + 2;
                n7 = object.charAt(n7);
            } else {
                n7 = 0;
            }
            int n15 = 4;
            if (n4 >= n15) {
                c3 = object.charAt(n3 += n14);
            }
            char c5 = c2 << 18;
            n3 = n8 << 12;
            c5 += n3;
            n3 = n7 << 6;
            c5 = c5 + n3 + c3;
            n3 = (char)(c5 >> 16 & 0xFF);
            c2 = (char)(c5 >> 8 & 0xFF);
            c5 = (char)(c5 & 0xFF);
            stringBuilder = new StringBuilder(n14);
            stringBuilder.append((char)n3);
            if (n4 >= n10) {
                stringBuilder.append(c2);
            }
            if (n4 >= n14) {
                stringBuilder.append(c5);
            }
            return stringBuilder.toString();
        }
        object = new IllegalStateException("StringBuilder must not be empty");
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void handleEOD(EncoderContext var0, CharSequence var1_1) {
        block13: {
            block12: {
                block14: {
                    try {
                        var2_3 = var1_1.length();
                        if (var2_3 == 0) {
                            var0.signalEncoderChange(0);
                            return;
                        }
                        var3_4 = 2;
                        var4_5 = 1;
                        if (var2_3 != var4_5) break block12;
                    }
                    catch (Throwable var1_2) {
                        break block13;
                    }
                    {
                        var0.updateSymbolInfo();
                        var5_6 = var0.getSymbolInfo();
                        var6_7 = var5_6.getDataCapacity();
                        var7_8 = var0.getCodewordCount();
                        var6_7 -= var7_8;
                    }
                    {
                        var7_8 = var0.getRemainingCharacters();
                        if (var7_8 <= var6_7) break block14;
                        var6_7 = var0.getCodewordCount() + var4_5;
                        var0.updateSymbolInfo(var6_7);
                        var5_6 = var0.getSymbolInfo();
                        var6_7 = var5_6.getDataCapacity();
                        var8_9 = var0.getCodewordCount();
                        var6_7 -= var8_9;
                    }
                }
                if (var7_8 <= var6_7 && var6_7 <= var3_4) {
                    var0.signalEncoderChange(0);
                    return;
                }
            }
            if (var2_3 > (var6_7 = 4)) ** GOTO lbl-1000
            {
                var1_1 = EdifactEncoder.encodeToCodewords((CharSequence)var1_1, 0);
                var6_7 = var0.hasMoreCharacters() ^ var4_5;
                if (var6_7 == 0 || (var2_3 -= var4_5) > var3_4) {
                    var4_5 = 0;
                }
                if (var2_3 > var3_4) ** GOTO lbl48
            }
            {
                var3_4 = var0.getCodewordCount() + var2_3;
                var0.updateSymbolInfo(var3_4);
                var9_10 = var0.getSymbolInfo();
                var3_4 = var9_10.getDataCapacity();
                var6_7 = var0.getCodewordCount();
                var3_4 -= var6_7;
                var6_7 = 3;
                if (var3_4 < var6_7) ** GOTO lbl48
            }
            {
                var3_4 = var0.getCodewordCount();
                var4_5 = var1_1.length();
                var0.updateSymbolInfo(var3_4 += var4_5);
                var4_5 = 0;
lbl48:
                // 3 sources

                if (var4_5 == 0) ** GOTO lbl53
                var0.resetSymbolInfo();
                var10_11 = var0.pos - var2_3;
            }
            {
                block15: {
                    var0.pos = var10_11;
                    break block15;
lbl53:
                    // 1 sources

                    var0.writeCodewords((String)var1_1);
                }
                var0.signalEncoderChange(0);
                return;
            }
lbl-1000:
            // 1 sources

            {
                var11_12 = "Count must not exceed 4";
                var1_1 = new IllegalStateException(var11_12);
                throw var1_1;
            }
        }
        var0.signalEncoderChange(0);
        throw var1_2;
    }

    public void encode(EncoderContext encoderContext) {
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        while ((n3 = encoderContext.hasMoreCharacters()) != 0) {
            int n4;
            EdifactEncoder.encodeChar(encoderContext.getCurrentChar(), stringBuilder);
            encoderContext.pos = n3 = encoderContext.pos + 1;
            n3 = stringBuilder.length();
            if (n3 < (n4 = 4)) continue;
            n3 = 0;
            String string2 = EdifactEncoder.encodeToCodewords(stringBuilder, 0);
            encoderContext.writeCodewords(string2);
            stringBuilder.delete(0, n4);
            String string3 = encoderContext.getMessage();
            int n7 = encoderContext.pos;
            int n8 = this.getEncodingMode();
            n4 = HighLevelEncoder.lookAheadTest(string3, n7, n8);
            if (n4 == (n7 = this.getEncodingMode())) continue;
            encoderContext.signalEncoderChange(0);
            break;
        }
        stringBuilder.append('\u001f');
        EdifactEncoder.handleEOD(encoderContext, stringBuilder);
    }

    public int getEncodingMode() {
        return 4;
    }
}

