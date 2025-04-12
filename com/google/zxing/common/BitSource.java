/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common;

public final class BitSource {
    private int bitOffset;
    private int byteOffset;
    private final byte[] bytes;

    public BitSource(byte[] byArray) {
        this.bytes = byArray;
    }

    public int available() {
        int n3 = this.bytes.length;
        int n4 = this.byteOffset;
        n3 = (n3 - n4) * 8;
        n4 = this.bitOffset;
        return n3 - n4;
    }

    public int getBitOffset() {
        return this.bitOffset;
    }

    public int getByteOffset() {
        return this.byteOffset;
    }

    public int readBits(int n3) {
        int n4;
        if (n3 > 0 && n3 <= (n4 = 32) && n3 <= (n4 = this.available())) {
            int n7;
            n4 = this.bitOffset;
            int n8 = 0;
            byte[] byArray = null;
            int n10 = 255;
            int n14 = 8;
            if (n4 > 0) {
                n7 = 8 - n4;
                int n15 = n3 < n7 ? n3 : n7;
                int n16 = 8 - n15;
                n16 = n10 >> n16 << (n7 -= n15);
                byte[] byArray2 = this.bytes;
                int n17 = this.byteOffset;
                byte by2 = byArray2[n17];
                n7 = (n16 &= by2) >> n7;
                n3 -= n15;
                this.bitOffset = n4 += n15;
                if (n4 == n14) {
                    this.bitOffset = 0;
                    this.byteOffset = ++n17;
                }
                n8 = n7;
            }
            if (n3 > 0) {
                while (n3 >= n14) {
                    n4 = n8 << 8;
                    byArray = this.bytes;
                    n7 = this.byteOffset;
                    n8 = byArray[n7] & n10 | n4;
                    this.byteOffset = ++n7;
                    n3 += -8;
                }
                if (n3 > 0) {
                    n4 = 8 - n3;
                    n10 = n10 >> n4 << n4;
                    n8 <<= n3;
                    byte[] byArray3 = this.bytes;
                    n7 = this.byteOffset;
                    n14 = byArray3[n7];
                    n4 = (n10 &= n14) >> n4;
                    n8 |= n4;
                    this.bitOffset = n4 = this.bitOffset + n3;
                }
            }
            return n8;
        }
        String string2 = String.valueOf(n3);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }
}

