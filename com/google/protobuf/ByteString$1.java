/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$AbstractByteIterator;
import java.util.NoSuchElementException;

class ByteString$1
extends ByteString$AbstractByteIterator {
    private final int limit;
    private int position = 0;
    final /* synthetic */ ByteString this$0;

    public ByteString$1(ByteString byteString) {
        int n3;
        this.this$0 = byteString;
        this.limit = n3 = byteString.size();
    }

    public boolean hasNext() {
        int n3 = this.position;
        int n4 = this.limit;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public byte nextByte() {
        int n3 = this.position;
        int n4 = this.limit;
        if (n3 < n4) {
            this.position = n4 = n3 + 1;
            return this.this$0.internalByteAt(n3);
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

