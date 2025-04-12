/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AllocatedBuffer;
import com.google.protobuf.BufferAllocator;
import java.nio.ByteBuffer;

class BufferAllocator$1
extends BufferAllocator {
    public AllocatedBuffer allocateDirectBuffer(int n3) {
        return AllocatedBuffer.wrap(ByteBuffer.allocateDirect(n3));
    }

    public AllocatedBuffer allocateHeapBuffer(int n3) {
        return AllocatedBuffer.wrap(new byte[n3]);
    }
}

