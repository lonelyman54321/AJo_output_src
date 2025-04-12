/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.AbstractHasher;
import com.google.common.hash.AbstractNonStreamingHashFunction;
import com.google.common.hash.AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import java.io.OutputStream;
import java.nio.ByteBuffer;

final class AbstractNonStreamingHashFunction$BufferingHasher
extends AbstractHasher {
    final AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream stream;
    final /* synthetic */ AbstractNonStreamingHashFunction this$0;

    public AbstractNonStreamingHashFunction$BufferingHasher(AbstractNonStreamingHashFunction object, int n3) {
        this.this$0 = object;
        this.stream = object = new AbstractNonStreamingHashFunction$ExposedByteArrayOutputStream(n3);
    }

    public HashCode hash() {
        AbstractNonStreamingHashFunction abstractNonStreamingHashFunction = this.this$0;
        byte[] byArray = this.stream.byteArray();
        int n3 = this.stream.length();
        return abstractNonStreamingHashFunction.hashBytes(byArray, 0, n3);
    }

    public Hasher putByte(byte by2) {
        ((OutputStream)this.stream).write(by2);
        return this;
    }

    public Hasher putBytes(ByteBuffer byteBuffer) {
        this.stream.write(byteBuffer);
        return this;
    }

    public Hasher putBytes(byte[] byArray, int n3, int n4) {
        ((OutputStream)this.stream).write(byArray, n3, n4);
        return this;
    }
}

