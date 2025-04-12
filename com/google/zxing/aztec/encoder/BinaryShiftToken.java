/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec.encoder;

import com.google.zxing.aztec.encoder.Token;
import com.google.zxing.common.BitArray;

final class BinaryShiftToken
extends Token {
    private final short binaryShiftByteCount;
    private final short binaryShiftStart;

    public BinaryShiftToken(Token token, int n3, int n4) {
        super(token);
        short s7;
        this.binaryShiftStart = s7 = (short)n3;
        this.binaryShiftByteCount = s7 = (short)n4;
    }

    public void appendTo(BitArray bitArray, byte[] byArray) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.binaryShiftByteCount); ++i3) {
            int n4 = 62;
            int n7 = 31;
            if (i3 == 0 || i3 == n7 && n3 <= n4) {
                n3 = 5;
                bitArray.appendBits(n7, n3);
                int n8 = this.binaryShiftByteCount;
                if (n8 > n4) {
                    n3 = 16;
                    bitArray.appendBits(n8 += -31, n3);
                } else if (i3 == 0) {
                    n4 = Math.min(n8, n7);
                    bitArray.appendBits(n4, n3);
                } else {
                    bitArray.appendBits(n8 += -31, n3);
                }
            }
            n3 = this.binaryShiftStart + i3;
            n3 = byArray[n3];
            n4 = 8;
            bitArray.appendBits(n3, n4);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        int n3 = this.binaryShiftStart;
        stringBuilder.append(n3);
        stringBuilder.append("::");
        n3 = this.binaryShiftStart;
        short s7 = this.binaryShiftByteCount;
        n3 = n3 + s7 + -1;
        stringBuilder.append(n3);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

