/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AllocatedBuffer;
import java.nio.ByteBuffer;

class AllocatedBuffer$2
extends AllocatedBuffer {
    private int position;
    final /* synthetic */ byte[] val$bytes;
    final /* synthetic */ int val$length;
    final /* synthetic */ int val$offset;

    public AllocatedBuffer$2(byte[] byArray, int n3, int n4) {
        this.val$bytes = byArray;
        this.val$offset = n3;
        this.val$length = n4;
    }

    public byte[] array() {
        return this.val$bytes;
    }

    public int arrayOffset() {
        return this.val$offset;
    }

    public boolean hasArray() {
        return true;
    }

    public boolean hasNioBuffer() {
        return false;
    }

    public int limit() {
        return this.val$length;
    }

    public ByteBuffer nioBuffer() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public int position() {
        return this.position;
    }

    public AllocatedBuffer position(int n3) {
        int n4;
        if (n3 >= 0 && n3 <= (n4 = this.val$length)) {
            this.position = n3;
            return this;
        }
        String string2 = hj0_0.a(n3, "Invalid position: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public int remaining() {
        int n3 = this.val$length;
        int n4 = this.position;
        return n3 - n4;
    }
}

