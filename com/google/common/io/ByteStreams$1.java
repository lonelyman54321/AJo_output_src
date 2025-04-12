/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.OutputStream;

class ByteStreams$1
extends OutputStream {
    public String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    public void write(int n3) {
    }

    public void write(byte[] byArray) {
        Preconditions.checkNotNull(byArray);
    }

    public void write(byte[] byArray, int n3, int n4) {
        Preconditions.checkNotNull(byArray);
        int n7 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n4 += n3, n7);
    }
}

