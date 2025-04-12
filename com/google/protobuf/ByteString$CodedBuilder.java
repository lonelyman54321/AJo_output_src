/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$1;
import com.google.protobuf.ByteString$LiteralByteString;
import com.google.protobuf.CodedOutputStream;

final class ByteString$CodedBuilder {
    private final byte[] buffer;
    private final CodedOutputStream output;

    private ByteString$CodedBuilder(int n3) {
        Object object = new byte[n3];
        this.buffer = object;
        object = CodedOutputStream.newInstance(object);
        this.output = object;
    }

    public /* synthetic */ ByteString$CodedBuilder(int n3, ByteString.1 var2_2) {
        this(n3);
    }

    public ByteString build() {
        this.output.checkNoSpaceLeft();
        byte[] byArray = this.buffer;
        ByteString$LiteralByteString byteString$LiteralByteString = new ByteString$LiteralByteString(byArray);
        return byteString$LiteralByteString;
    }

    public CodedOutputStream getCodedOutput() {
        return this.output;
    }
}

