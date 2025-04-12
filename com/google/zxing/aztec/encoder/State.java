/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec.encoder;

import com.google.zxing.aztec.encoder.HighLevelEncoder;
import com.google.zxing.aztec.encoder.Token;
import com.google.zxing.common.BitArray;
import java.util.LinkedList;

final class State {
    static final State INITIAL_STATE;
    private final int binaryShiftByteCount;
    private final int bitCount;
    private final int mode;
    private final Token token;

    static {
        State state;
        Token token = Token.EMPTY;
        INITIAL_STATE = state = new State(token, 0, 0, 0);
    }

    private State(Token token, int n3, int n4, int n7) {
        this.token = token;
        this.mode = n3;
        this.binaryShiftByteCount = n4;
        this.bitCount = n7;
    }

    public State addBinaryShiftChar(int n3) {
        int n4;
        Token token = this.token;
        int n7 = this.mode;
        int n8 = this.bitCount;
        int n10 = 4;
        if (n7 == n10 || n7 == (n10 = 2)) {
            int[] nArray = HighLevelEncoder.LATCH_TABLE[n7];
            n10 = 0;
            n7 = nArray[0];
            n4 = (char)-1 & n7;
            token = token.add(n4, n7 >>= 16);
            n8 += n7;
            n7 = 0;
            nArray = null;
        }
        n4 = (n10 = this.binaryShiftByteCount) != 0 && n10 != (n4 = 31) ? (n10 == (n4 = 62) ? 9 : 8) : 18;
        State state = new State(token, n7, ++n10, n8 += n4);
        int n14 = state.binaryShiftByteCount;
        n7 = 2078;
        if (n14 == n7) {
            state = state.endBinaryShift(++n3);
        }
        return state;
    }

    public State endBinaryShift(int n3) {
        int n4 = this.binaryShiftByteCount;
        if (n4 == 0) {
            return this;
        }
        Token token = this.token;
        Token token2 = token.addBinaryShift(n3 -= n4, n4);
        int n7 = this.mode;
        int n8 = this.bitCount;
        State state = new State(token2, n7, 0, n8);
        return state;
    }

    public int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    public int getBitCount() {
        return this.bitCount;
    }

    public int getMode() {
        return this.mode;
    }

    public Token getToken() {
        return this.token;
    }

    public boolean isBetterThanOrEqualTo(State state) {
        int n3;
        int n4 = this.bitCount;
        Object object = HighLevelEncoder.LATCH_TABLE;
        int n7 = this.mode;
        object = object[n7];
        n7 = state.mode;
        Object object2 = object[n7] >> 16;
        n4 += object2;
        object2 = state.binaryShiftByteCount;
        if (object2 > 0 && ((n7 = this.binaryShiftByteCount) == 0 || n7 > object2)) {
            n4 += 10;
        }
        return n4 <= (n3 = state.bitCount);
    }

    public State latchAndAppend(int n3, int n4) {
        int n7 = this.bitCount;
        Object object = this.token;
        int n8 = this.mode;
        if (n3 != n8) {
            int[][] nArray = HighLevelEncoder.LATCH_TABLE;
            int[] nArray2 = nArray[n8];
            n8 = nArray2[n3];
            int n10 = (char)-1 & n8;
            object = ((Token)object).add(n10, n8 >>= 16);
            n7 += n8;
        }
        n8 = n3 == (n8 = 2) ? 4 : 5;
        Token token = ((Token)object).add(n4, n8);
        object = new State(token, n3, 0, n7 += n8);
        return object;
    }

    public State shiftAndAppend(int n3, int n4) {
        Token token = this.token;
        int n7 = this.mode;
        int n8 = 2;
        int n10 = 5;
        n8 = n7 == n8 ? 4 : 5;
        n3 = HighLevelEncoder.SHIFT_TABLE[n7][n3];
        Token token2 = token.add(n3, n8).add(n4, n10);
        int n14 = this.mode;
        n7 = this.bitCount + n8 + n10;
        State state = new State(token2, n14, 0, n7);
        return state;
    }

    public BitArray toBitArray(byte[] byArray) {
        boolean bl2;
        Object object;
        Object object2 = new LinkedList();
        int n3 = byArray.length;
        for (object = this.endBinaryShift((int)n3).token; object != null; object = ((Token)object).getPrevious()) {
            ((LinkedList)object2).addFirst(object);
        }
        object = new BitArray();
        object2 = object2.iterator();
        while (bl2 = object2.hasNext()) {
            Token token = (Token)object2.next();
            token.appendTo((BitArray)object, byArray);
        }
        return object;
    }

    public String toString() {
        Object object = HighLevelEncoder.MODE_NAMES;
        int n3 = this.mode;
        object = object[n3];
        Integer n4 = this.bitCount;
        Integer n7 = this.binaryShiftByteCount;
        Object[] objectArray = new Object[]{object, n4, n7};
        return String.format("%s bits=%d bytes=%d", objectArray);
    }
}

