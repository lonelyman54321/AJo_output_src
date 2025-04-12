/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.hash.AbstractNonStreamingHashFunction$BufferingHasher;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

abstract class AbstractNonStreamingHashFunction
extends AbstractHashFunction {
    public HashCode hashBytes(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.remaining();
        return this.newHasher(n3).putBytes(byteBuffer).hash();
    }

    public abstract HashCode hashBytes(byte[] var1, int var2, int var3);

    public HashCode hashInt(int n3) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byte[] byArray = byteBuffer.order(byteOrder).putInt(n3).array();
        return this.hashBytes(byArray);
    }

    public HashCode hashLong(long l2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byte[] byArray = byteBuffer.order(byteOrder).putLong(l2).array();
        return this.hashBytes(byArray);
    }

    public HashCode hashString(CharSequence object, Charset charset) {
        object = object.toString().getBytes(charset);
        return this.hashBytes((byte[])object);
    }

    public HashCode hashUnencodedChars(CharSequence object) {
        int n3 = object.length();
        int n4 = n3 * 2;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBuffer = byteBuffer.order(byteOrder);
        byteOrder = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            char c2 = object.charAt(i3);
            byteBuffer.putChar(c2);
        }
        object = byteBuffer.array();
        return this.hashBytes((byte[])object);
    }

    public Hasher newHasher() {
        return this.newHasher(32);
    }

    public Hasher newHasher(int n3) {
        AbstractNonStreamingHashFunction$BufferingHasher abstractNonStreamingHashFunction$BufferingHasher;
        boolean bl2;
        if (n3 >= 0) {
            bl2 = true;
        } else {
            bl2 = false;
            abstractNonStreamingHashFunction$BufferingHasher = null;
        }
        Preconditions.checkArgument(bl2);
        abstractNonStreamingHashFunction$BufferingHasher = new AbstractNonStreamingHashFunction$BufferingHasher(this, n3);
        return abstractNonStreamingHashFunction$BufferingHasher;
    }
}

