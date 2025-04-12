/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$LiteralByteString;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

final class ByteString$BoundedByteString
extends ByteString$LiteralByteString {
    private static final long serialVersionUID = 1L;
    private final int bytesLength;
    private final int bytesOffset;

    public ByteString$BoundedByteString(byte[] byArray, int n3, int n4) {
        super(byArray);
        int n7 = n3 + n4;
        int n8 = byArray.length;
        ByteString.checkRange(n3, n7, n8);
        this.bytesOffset = n3;
        this.bytesLength = n4;
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        throw object;
    }

    public byte byteAt(int n3) {
        int n4 = this.size();
        ByteString.checkIndex(n3, n4);
        byte[] byArray = this.bytes;
        int n7 = this.bytesOffset + n3;
        return byArray[n7];
    }

    public void copyToInternal(byte[] byArray, int n3, int n4, int n7) {
        byte[] byArray2 = this.bytes;
        int n8 = this.getOffsetIntoBytes() + n3;
        System.arraycopy(byArray2, n8, byArray, n4, n7);
    }

    public int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    public byte internalByteAt(int n3) {
        byte[] byArray = this.bytes;
        int n4 = this.bytesOffset + n3;
        return byArray[n4];
    }

    public int size() {
        return this.bytesLength;
    }

    public Object writeReplace() {
        return ByteString.wrap(this.toByteArray());
    }
}

