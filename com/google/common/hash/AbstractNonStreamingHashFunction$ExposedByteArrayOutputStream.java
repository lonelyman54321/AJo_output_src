/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

final class AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream
extends ByteArrayOutputStream {
    public AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream(int n3) {
        super(n3);
    }

    public byte[] byteArray() {
        return this.buf;
    }

    public int length() {
        return this.count;
    }

    public void write(ByteBuffer byteBuffer) {
        int n3;
        byte[] byArray;
        byte[] byArray2;
        int n4;
        int n7 = this.count;
        int n8 = byteBuffer.remaining();
        int n10 = n7 + n8;
        if (n10 > (n4 = (byArray2 = this.buf).length)) {
            this.buf = byArray = Arrays.copyOf(byArray2, n7 += n8);
        }
        byArray = this.buf;
        n10 = this.count;
        byteBuffer.get(byArray, n10, n8);
        this.count = n3 = this.count + n8;
    }
}

