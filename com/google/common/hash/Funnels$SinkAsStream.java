/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.PrimitiveSink;
import java.io.OutputStream;

class Funnels$SinkAsStream
extends OutputStream {
    final PrimitiveSink sink;

    public Funnels$SinkAsStream(PrimitiveSink primitiveSink) {
        this.sink = primitiveSink = (PrimitiveSink)Preconditions.checkNotNull(primitiveSink);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Funnels.asOutputStream(");
        PrimitiveSink primitiveSink = this.sink;
        stringBuilder.append(primitiveSink);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void write(int n3) {
        PrimitiveSink primitiveSink = this.sink;
        n3 = (byte)n3;
        primitiveSink.putByte((byte)n3);
    }

    public void write(byte[] byArray) {
        this.sink.putBytes(byArray);
    }

    public void write(byte[] byArray, int n3, int n4) {
        this.sink.putBytes(byArray, n3, n4);
    }
}

