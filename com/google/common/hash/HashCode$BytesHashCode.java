/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode;
import java.io.Serializable;

final class HashCode$BytesHashCode
extends HashCode
implements Serializable {
    private static final long serialVersionUID;
    final byte[] bytes;

    public HashCode$BytesHashCode(byte[] byArray) {
        byArray = (byte[])Preconditions.checkNotNull(byArray);
        this.bytes = byArray;
    }

    public byte[] asBytes() {
        return (byte[])this.bytes.clone();
    }

    public int asInt() {
        byte[] byArray = this.bytes;
        int n3 = byArray.length;
        int n4 = 4;
        int n7 = 1;
        n3 = n3 >= n4 ? 1 : 0;
        int n8 = byArray.length;
        Preconditions.checkState(n3 != 0, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", n8);
        byArray = this.bytes;
        n3 = byArray[0] & 0xFF;
        n4 = (byArray[n7] & 0xFF) << 8;
        n3 |= n4;
        n4 = (byArray[2] & 0xFF) << 16;
        return (byArray[3] & 0xFF) << 24 | (n3 |= n4);
    }

    public long asLong() {
        byte[] byArray = this.bytes;
        boolean bl2 = byArray.length;
        boolean bl3 = 8 != 0;
        bl2 = bl2 >= bl3;
        int n3 = byArray.length;
        Preconditions.checkState(bl2, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", n3);
        return this.padToLong();
    }

    public int bits() {
        return this.bytes.length * 8;
    }

    public boolean equalsSameBits(HashCode hashCode) {
        byte[] byArray;
        int n3;
        byte[] byArray2 = this.bytes;
        int n4 = byArray2.length;
        byte[] byArray3 = hashCode.getBytesInternal();
        int n7 = byArray3.length;
        if (n4 != n7) {
            return false;
        }
        n4 = 1;
        byArray3 = null;
        int n8 = 1;
        for (n7 = 0; n7 < (n3 = (byArray = this.bytes).length); ++n7) {
            byte by2 = byArray[n7];
            byte[] byArray4 = hashCode.getBytesInternal();
            n3 = byArray4[n7];
            if (by2 == n3) {
                by2 = 1;
            } else {
                by2 = 0;
                byArray = null;
            }
            n8 &= by2;
        }
        return n8 != 0;
    }

    public byte[] getBytesInternal() {
        return this.bytes;
    }

    public long padToLong() {
        byte[] byArray = this.bytes;
        int n3 = byArray[0] & 0xFF;
        long l2 = n3;
        int n4 = 1;
        while (true) {
            byte[] byArray2 = this.bytes;
            int n7 = byArray2.length;
            int n8 = 8;
            if (n4 >= (n7 = Math.min(n7, n8))) break;
            byArray2 = this.bytes;
            n7 = byArray2[n4];
            long l3 = n7;
            long l4 = 255L;
            l3 &= l4;
            int n10 = n4 * 8;
            l2 |= (l3 <<= n10);
            ++n4;
        }
        return l2;
    }

    public void writeBytesToImpl(byte[] byArray, int n3, int n4) {
        System.arraycopy(this.bytes, 0, byArray, n3, n4);
    }
}

