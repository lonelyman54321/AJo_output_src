/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec.encoder;

import com.google.zxing.aztec.encoder.BinaryShiftToken;
import com.google.zxing.aztec.encoder.SimpleToken;
import com.google.zxing.common.BitArray;

abstract class Token {
    static final Token EMPTY;
    private final Token previous;

    static {
        SimpleToken simpleToken = new SimpleToken(null, 0, 0);
        EMPTY = simpleToken;
    }

    public Token(Token token) {
        this.previous = token;
    }

    public final Token add(int n3, int n4) {
        SimpleToken simpleToken = new SimpleToken(this, n3, n4);
        return simpleToken;
    }

    public final Token addBinaryShift(int n3, int n4) {
        BinaryShiftToken binaryShiftToken = new BinaryShiftToken(this, n3, n4);
        return binaryShiftToken;
    }

    public abstract void appendTo(BitArray var1, byte[] var2);

    public final Token getPrevious() {
        return this.previous;
    }
}

