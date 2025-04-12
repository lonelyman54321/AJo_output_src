/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.HashCode;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;

final class HashCode$IntHashCode
extends HashCode
implements Serializable {
    private static final long serialVersionUID;
    final int hash;

    public HashCode$IntHashCode(int n3) {
        this.hash = n3;
    }

    public byte[] asBytes() {
        int by2 = this.hash;
        byte by4 = (byte)by2;
        byte by5 = (byte)(by2 >> 8);
        byte by6 = (byte)(by2 >> 16);
        byte by7 = (byte)(by2 >> 24);
        byte[] byArray = new byte[]{by4, by5, by6, by7};
        return byArray;
    }

    public int asInt() {
        return this.hash;
    }

    public long asLong() {
        IllegalStateException illegalStateException = new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        throw illegalStateException;
    }

    public int bits() {
        return 32;
    }

    public boolean equalsSameBits(HashCode hashCode) {
        int n3 = this.hash;
        int n4 = hashCode.asInt();
        if (n3 == n4) {
            n4 = 1;
        } else {
            n4 = 0;
            hashCode = null;
        }
        return n4 != 0;
    }

    public long padToLong() {
        return UnsignedInts.toLong(this.hash);
    }

    public void writeBytesToImpl(byte[] byArray, int n3, int n4) {
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = n3 + i3;
            int n8 = this.hash;
            int n10 = i3 * 8;
            byArray[n7] = n8 = (int)((byte)(n8 >> n10));
        }
    }
}

