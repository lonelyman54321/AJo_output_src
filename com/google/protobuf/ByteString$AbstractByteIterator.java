/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString$ByteIterator;

abstract class ByteString$AbstractByteIterator
implements ByteString$ByteIterator {
    public final Byte next() {
        return this.nextByte();
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

