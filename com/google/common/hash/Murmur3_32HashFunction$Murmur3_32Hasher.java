/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractHasher;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import com.google.common.hash.Murmur3_32HashFunction;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

final class Murmur3_32HashFunction$Murmur3_32Hasher
extends AbstractHasher {
    private long buffer;
    private int h1;
    private boolean isDone;
    private int length;
    private int shift;

    public Murmur3_32HashFunction$Murmur3_32Hasher(int n3) {
        this.h1 = n3;
        this.length = 0;
        this.isDone = false;
    }

    private void update(int n3, long l2) {
        int n4;
        int n7;
        long l3 = this.buffer;
        long l4 = 0xFFFFFFFFL;
        l2 &= l4;
        int n8 = this.shift;
        this.buffer = l2 = l2 << n8 | l3;
        this.shift = n7 = n3 * 8 + n8;
        this.length = n4 = this.length + n3;
        n3 = 32;
        if (n7 >= n3) {
            n7 = this.h1;
            int n10 = (int)l2;
            int n14 = Murmur3_32HashFunction.access$000(n10);
            this.h1 = n14 = Murmur3_32HashFunction.access$100(n7, n14);
            this.buffer = l2 = this.buffer >>> n3;
            this.shift = n14 = this.shift - n3;
        }
    }

    public HashCode hash() {
        int n3 = this.isDone;
        int n4 = 1;
        Preconditions.checkState(n3 ^ n4);
        this.isDone = n4;
        n3 = this.h1;
        n4 = Murmur3_32HashFunction.access$000((int)this.buffer);
        this.h1 = n3 ^= n4;
        n4 = this.length;
        return Murmur3_32HashFunction.access$600(n3, n4);
    }

    public Hasher putByte(byte by2) {
        long l2 = by2 & 0xFF;
        this.update(1, l2);
        return this;
    }

    public Hasher putBytes(ByteBuffer byteBuffer) {
        byte by2;
        byte by4;
        ByteOrder byteOrder = byteBuffer.order();
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        byteBuffer.order(byteOrder2);
        while ((by4 = byteBuffer.remaining()) >= (by2 = 4)) {
            by4 = byteBuffer.getInt();
            this.putInt(by4);
        }
        while ((by4 = (byte)(byteBuffer.hasRemaining() ? 1 : 0)) != 0) {
            by4 = byteBuffer.get();
            this.putByte(by4);
        }
        byteBuffer.order(byteOrder);
        return this;
    }

    public Hasher putBytes(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n7, n8);
        n7 = 0;
        while ((n8 = n7 + 4) <= n4) {
            long l2 = Murmur3_32HashFunction.access$200(byArray, n7 += n3);
            this.update(4, l2);
            n7 = n8;
        }
        while (n7 < n4) {
            n8 = n3 + n7;
            n8 = byArray[n8];
            this.putByte((byte)n8);
            ++n7;
        }
        return this;
    }

    public Hasher putChar(char c2) {
        long l2 = c2;
        this.update(2, l2);
        return this;
    }

    public Hasher putInt(int n3) {
        long l2 = n3;
        this.update(4, l2);
        return this;
    }

    public Hasher putLong(long l2) {
        long l3 = (int)l2;
        int n3 = 4;
        this.update(n3, l3);
        this.update(n3, l2 >>>= 32);
        return this;
    }

    public Hasher putString(CharSequence object, Charset charset) {
        Charset charset2 = Charsets.UTF_8;
        int n3 = charset2.equals(charset);
        if (n3 != 0) {
            int n4;
            int n7;
            int n8;
            int n10;
            int n14;
            n3 = object.length();
            int n15 = 0;
            while (true) {
                n14 = n15 + 4;
                n10 = 4;
                n8 = 128;
                if (n14 > n3) break;
                n7 = object.charAt(n15);
                n4 = n15 + 1;
                n4 = object.charAt(n4);
                int n16 = n15 + 2;
                n16 = object.charAt(n16);
                int n17 = n15 + 3;
                n17 = object.charAt(n17);
                if (n7 >= n8 || n4 >= n8 || n16 >= n8 || n17 >= n8) break;
                n15 = n4 << 8 | n7;
                n8 = n16 << 16;
                n15 |= n8;
                n8 = n17 << 24;
                long l2 = n15 | n8;
                this.update(n10, l2);
                n15 = n14;
            }
            while (n15 < n3) {
                long l3;
                n14 = object.charAt(n15);
                n7 = 1;
                if (n14 < n8) {
                    l3 = n14;
                    this.update(n7, l3);
                } else {
                    n4 = 2048;
                    if (n14 < n4) {
                        l3 = Murmur3_32HashFunction.access$300((char)n14);
                        n14 = 2;
                        this.update(n14, l3);
                    } else {
                        n4 = 55296;
                        if (n14 >= n4 && n14 <= (n4 = 57343)) {
                            n4 = Character.codePointAt((CharSequence)object, n15);
                            if (n4 == n14) {
                                object = object.subSequence(n15, n3).toString().getBytes(charset);
                                this.putBytes((byte[])object);
                                return this;
                            }
                            ++n15;
                            l3 = Murmur3_32HashFunction.access$500(n4);
                            this.update(n10, l3);
                        } else {
                            l3 = Murmur3_32HashFunction.access$400((char)n14);
                            n14 = 3;
                            this.update(n14, l3);
                        }
                    }
                }
                n15 += n7;
            }
            return this;
        }
        return super.putString((CharSequence)object, charset);
    }
}

