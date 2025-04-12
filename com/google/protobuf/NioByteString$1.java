/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Java8Compatibility;
import com.google.protobuf.NioByteString;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

class NioByteString$1
extends InputStream {
    private final ByteBuffer buf;
    final /* synthetic */ NioByteString this$0;

    public NioByteString$1(NioByteString object) {
        this.this$0 = object;
        this.buf = object = NioByteString.access$000((NioByteString)object).slice();
    }

    public int available() {
        return this.buf.remaining();
    }

    public void mark(int n3) {
        Java8Compatibility.mark(this.buf);
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        ByteBuffer byteBuffer = this.buf;
        boolean bl2 = byteBuffer.hasRemaining();
        if (!bl2) {
            return -1;
        }
        return this.buf.get() & 0xFF;
    }

    public int read(byte[] byArray, int n3, int n4) {
        ByteBuffer byteBuffer = this.buf;
        int n7 = byteBuffer.hasRemaining();
        if (n7 == 0) {
            return -1;
        }
        n7 = this.buf.remaining();
        n4 = Math.min(n4, n7);
        this.buf.get(byArray, n3, n4);
        return n4;
    }

    public void reset() {
        ByteBuffer byteBuffer;
        try {
            byteBuffer = this.buf;
        }
        catch (InvalidMarkException invalidMarkException) {
            IOException iOException = new IOException(invalidMarkException);
            throw iOException;
        }
        Java8Compatibility.reset(byteBuffer);
    }
}

