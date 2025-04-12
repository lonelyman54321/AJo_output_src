/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.HashCode;
import java.io.Serializable;

final class HashCode$LongHashCode
extends HashCode
implements Serializable {
    private static final long serialVersionUID;
    final long hash;

    public HashCode$LongHashCode(long l2) {
        this.hash = l2;
    }

    public byte[] asBytes() {
        long l2 = this.hash;
        byte by2 = (byte)l2;
        int n3 = 8;
        byte by4 = (byte)(l2 >> n3);
        byte by5 = (byte)(l2 >> 16);
        byte by6 = (byte)(l2 >> 24);
        byte by7 = (byte)(l2 >> 32);
        byte by8 = (byte)(l2 >> 40);
        byte by9 = (byte)(l2 >> 48);
        byte by10 = (byte)(l2 >> 56);
        byte[] byArray = new byte[n3];
        byArray[0] = by2;
        byArray[1] = by4;
        byArray[2] = by5;
        byArray[3] = by6;
        byArray[4] = by7;
        byArray[5] = by8;
        byArray[6] = by9;
        byArray[7] = by10;
        return byArray;
    }

    public int asInt() {
        return (int)this.hash;
    }

    public long asLong() {
        return this.hash;
    }

    public int bits() {
        return 64;
    }

    public boolean equalsSameBits(HashCode hashCode) {
        long l2 = this.hash;
        long l3 = hashCode.asLong();
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            object = 1;
        } else {
            object = 0;
            hashCode = null;
        }
        return (boolean)object;
    }

    public long padToLong() {
        return this.hash;
    }

    public void writeBytesToImpl(byte[] byArray, int n3, int n4) {
        for (int i3 = 0; i3 < n4; ++i3) {
            byte by2;
            int n7 = n3 + i3;
            long l2 = this.hash;
            int n8 = i3 * 8;
            int n10 = (int)(l2 >>= n8);
            byArray[n7] = by2 = (byte)n10;
        }
    }
}

