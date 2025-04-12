/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractHasher;
import com.google.common.hash.Hasher;
import com.google.common.hash.Java8Compatibility;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class AbstractByteHasher
extends AbstractHasher {
    private final ByteBuffer scratch;

    public AbstractByteHasher() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.scratch = byteBuffer = byteBuffer.order(byteOrder);
    }

    private Hasher update(int n3) {
        try {
            Object object = this.scratch;
            object = ((ByteBuffer)object).array();
            this.update((byte[])object, 0, n3);
            return this;
        }
        finally {
            Java8Compatibility.clear(this.scratch);
        }
    }

    public Hasher putByte(byte by2) {
        this.update(by2);
        return this;
    }

    public Hasher putBytes(ByteBuffer byteBuffer) {
        this.update(byteBuffer);
        return this;
    }

    public Hasher putBytes(byte[] byArray) {
        Preconditions.checkNotNull(byArray);
        this.update(byArray);
        return this;
    }

    public Hasher putBytes(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n7, n8);
        this.update(byArray, n3, n4);
        return this;
    }

    public Hasher putChar(char c2) {
        this.scratch.putChar(c2);
        return this.update(2);
    }

    public Hasher putInt(int n3) {
        this.scratch.putInt(n3);
        return this.update(4);
    }

    public Hasher putLong(long l2) {
        this.scratch.putLong(l2);
        return this.update(8);
    }

    public Hasher putShort(short s7) {
        this.scratch.putShort(s7);
        return this.update(2);
    }

    public abstract void update(byte var1);

    public void update(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.hasArray();
        if (n3 != 0) {
            byte[] byArray = byteBuffer.array();
            int n4 = byteBuffer.arrayOffset();
            int n7 = byteBuffer.position() + n4;
            n4 = byteBuffer.remaining();
            this.update(byArray, n7, n4);
            n3 = byteBuffer.limit();
            Java8Compatibility.position(byteBuffer, n3);
        } else {
            for (n3 = byteBuffer.remaining(); n3 > 0; n3 += -1) {
                byte by2 = byteBuffer.get();
                this.update(by2);
            }
        }
    }

    public void update(byte[] byArray) {
        int n3 = byArray.length;
        this.update(byArray, 0, n3);
    }

    public void update(byte[] byArray, int n3, int n4) {
        byte by2;
        for (int i3 = n3; i3 < (by2 = n3 + n4); ++i3) {
            by2 = byArray[i3];
            this.update(by2);
        }
    }
}

