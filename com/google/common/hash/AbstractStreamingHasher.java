/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractHasher;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import com.google.common.hash.Java8Compatibility;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class AbstractStreamingHasher
extends AbstractHasher {
    private final ByteBuffer buffer;
    private final int bufferSize;
    private final int chunkSize;

    public AbstractStreamingHasher(int n3) {
        this(n3, n3);
    }

    /*
     * WARNING - void declaration
     */
    public AbstractStreamingHasher(int n3, int n4) {
        void var3_6;
        ByteBuffer byteBuffer;
        int bl2 = n4 % n3;
        if (bl2 == 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            byteBuffer = null;
        }
        Preconditions.checkArgument((boolean)var3_6);
        byteBuffer = ByteBuffer.allocate(n4 + 7);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.buffer = byteBuffer = byteBuffer.order(byteOrder);
        this.bufferSize = n4;
        this.chunkSize = n3;
    }

    private void munch() {
        int n3;
        int n4;
        ByteBuffer byteBuffer = this.buffer;
        Java8Compatibility.flip(byteBuffer);
        while ((n4 = (byteBuffer = this.buffer).remaining()) >= (n3 = this.chunkSize)) {
            byteBuffer = this.buffer;
            this.process(byteBuffer);
        }
        this.buffer.compact();
    }

    private void munchIfFull() {
        int n3;
        ByteBuffer byteBuffer = this.buffer;
        int n4 = byteBuffer.remaining();
        if (n4 < (n3 = 8)) {
            this.munch();
        }
    }

    private Hasher putBytesInternal(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int n3;
        int n4 = byteBuffer.remaining();
        if (n4 <= (n3 = (byteBuffer2 = this.buffer).remaining())) {
            this.buffer.put(byteBuffer);
            this.munchIfFull();
            return this;
        }
        n4 = this.bufferSize;
        n3 = this.buffer.position();
        n4 -= n3;
        byteBuffer2 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            ByteBuffer byteBuffer3 = this.buffer;
            byte by2 = byteBuffer.get();
            byteBuffer3.put(by2);
        }
        this.munch();
        while ((n4 = byteBuffer.remaining()) >= (n3 = this.chunkSize)) {
            this.process(byteBuffer);
        }
        this.buffer.put(byteBuffer);
        return this;
    }

    public final HashCode hash() {
        this.munch();
        Java8Compatibility.flip(this.buffer);
        ByteBuffer byteBuffer = this.buffer;
        int n3 = byteBuffer.remaining();
        if (n3 > 0) {
            byteBuffer = this.buffer;
            this.processRemaining(byteBuffer);
            byteBuffer = this.buffer;
            int n4 = byteBuffer.limit();
            Java8Compatibility.position(byteBuffer, n4);
        }
        return this.makeHash();
    }

    public abstract HashCode makeHash();

    public abstract void process(ByteBuffer var1);

    public void processRemaining(ByteBuffer byteBuffer) {
        int n3;
        int n4 = byteBuffer.limit();
        Java8Compatibility.position(byteBuffer, n4);
        n4 = this.chunkSize + 7;
        Java8Compatibility.limit(byteBuffer, n4);
        while ((n4 = byteBuffer.position()) < (n3 = this.chunkSize)) {
            long l2 = 0L;
            byteBuffer.putLong(l2);
        }
        Java8Compatibility.limit(byteBuffer, n3);
        Java8Compatibility.flip(byteBuffer);
        this.process(byteBuffer);
    }

    public final Hasher putByte(byte by2) {
        this.buffer.put(by2);
        this.munchIfFull();
        return this;
    }

    public final Hasher putBytes(ByteBuffer byteBuffer) {
        ByteOrder byteOrder = byteBuffer.order();
        try {
            Object object = ByteOrder.LITTLE_ENDIAN;
            byteBuffer.order((ByteOrder)object);
            object = this.putBytesInternal(byteBuffer);
            return object;
        }
        finally {
            byteBuffer.order(byteOrder);
        }
    }

    public final Hasher putBytes(byte[] object, int n3, int n4) {
        object = ByteBuffer.wrap((byte[])object, n3, n4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        object = ((ByteBuffer)object).order(byteOrder);
        return this.putBytesInternal((ByteBuffer)object);
    }

    public final Hasher putChar(char c2) {
        this.buffer.putChar(c2);
        this.munchIfFull();
        return this;
    }

    public final Hasher putInt(int n3) {
        this.buffer.putInt(n3);
        this.munchIfFull();
        return this;
    }

    public final Hasher putLong(long l2) {
        this.buffer.putLong(l2);
        this.munchIfFull();
        return this;
    }

    public final Hasher putShort(short s7) {
        this.buffer.putShort(s7);
        this.munchIfFull();
        return this;
    }
}

