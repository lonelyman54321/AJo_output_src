/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AllocatedBuffer;
import com.google.protobuf.Java8Compatibility;
import java.nio.ByteBuffer;

class AllocatedBuffer$1
extends AllocatedBuffer {
    final /* synthetic */ ByteBuffer val$buffer;

    public AllocatedBuffer$1(ByteBuffer byteBuffer) {
        this.val$buffer = byteBuffer;
    }

    public byte[] array() {
        return this.val$buffer.array();
    }

    public int arrayOffset() {
        return this.val$buffer.arrayOffset();
    }

    public boolean hasArray() {
        return this.val$buffer.hasArray();
    }

    public boolean hasNioBuffer() {
        return true;
    }

    public int limit() {
        return this.val$buffer.limit();
    }

    public ByteBuffer nioBuffer() {
        return this.val$buffer;
    }

    public int position() {
        return this.val$buffer.position();
    }

    public AllocatedBuffer position(int n3) {
        Java8Compatibility.position(this.val$buffer, n3);
        return this;
    }

    public int remaining() {
        return this.val$buffer.remaining();
    }
}

