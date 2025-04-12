/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes;
import com.google.common.primitives.Longs;

final class LittleEndianByteArray$JavaLittleEndianBytes$1
extends LittleEndianByteArray$JavaLittleEndianBytes {
    public long getLongLittleEndian(byte[] byArray, int n3) {
        int n4 = n3 + 7;
        byte by2 = byArray[n4];
        n4 = n3 + 6;
        byte by4 = byArray[n4];
        n4 = n3 + 5;
        byte by5 = byArray[n4];
        n4 = n3 + 4;
        byte by6 = byArray[n4];
        n4 = n3 + 3;
        byte by7 = byArray[n4];
        n4 = n3 + 2;
        byte by8 = byArray[n4];
        n4 = n3 + 1;
        byte by9 = byArray[n4];
        byte by10 = byArray[n3];
        return Longs.fromBytes(by2, by4, by5, by6, by7, by8, by9, by10);
    }

    public void putLongLittleEndian(byte[] byArray, int n3, long l2) {
        int n4;
        long l3 = 255L;
        for (int i3 = 0; i3 < (n4 = 8); ++i3) {
            byte by2;
            int n7 = n3 + i3;
            long l4 = l2 & l3;
            int n8 = i3 * 8;
            int n10 = (int)(l4 >>= n8);
            byArray[n7] = by2 = (byte)n10;
            l3 <<= n4;
        }
    }
}

