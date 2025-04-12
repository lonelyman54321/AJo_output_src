/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.CodedOutputStream$ArrayEncoder;
import com.google.protobuf.Java8Compatibility;
import java.nio.ByteBuffer;

final class CodedOutputStream$HeapNioEncoder
extends CodedOutputStream$ArrayEncoder {
    private final ByteBuffer byteBuffer;
    private int initialPosition;

    public CodedOutputStream$HeapNioEncoder(ByteBuffer byteBuffer) {
        int n3;
        byte[] byArray = byteBuffer.array();
        int n4 = byteBuffer.arrayOffset();
        int n7 = byteBuffer.position() + n4;
        n4 = byteBuffer.remaining();
        super(byArray, n7, n4);
        this.byteBuffer = byteBuffer;
        this.initialPosition = n3 = byteBuffer.position();
    }

    public void flush() {
        ByteBuffer byteBuffer = this.byteBuffer;
        int n3 = this.initialPosition;
        int n4 = this.getTotalBytesWritten();
        Java8Compatibility.position(byteBuffer, n3 += n4);
    }
}

