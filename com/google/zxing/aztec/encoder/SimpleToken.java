/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec.encoder;

import com.google.zxing.aztec.encoder.Token;
import com.google.zxing.common.BitArray;

final class SimpleToken
extends Token {
    private final short bitCount;
    private final short value;

    public SimpleToken(Token token, int n3, int n4) {
        super(token);
        short s7;
        this.value = s7 = (short)n3;
        this.bitCount = s7 = (short)n4;
    }

    public void appendTo(BitArray bitArray, byte[] byArray) {
        short s7 = this.value;
        short s8 = this.bitCount;
        bitArray.appendBits(s7, s8);
    }

    public String toString() {
        int n3 = this.value;
        int n4 = this.bitCount;
        short s7 = 1;
        int n7 = (s7 << n4) - s7;
        n3 &= n7;
        n4 = s7 << n4;
        StringBuilder stringBuilder = new StringBuilder("<");
        n7 = this.bitCount;
        n7 = s7 << n7;
        String string2 = Integer.toBinaryString((n3 |= n4) | n7).substring(s7);
        stringBuilder.append(string2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

