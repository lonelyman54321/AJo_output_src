/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class HashingInputStream
extends FilterInputStream {
    private final Hasher hasher;

    public HashingInputStream(HashFunction object, InputStream inputStream) {
        inputStream = (InputStream)Preconditions.checkNotNull(inputStream);
        super(inputStream);
        this.hasher = object = (Hasher)Preconditions.checkNotNull(object.newHasher());
    }

    public HashCode hash() {
        return this.hasher.hash();
    }

    public void mark(int n3) {
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int n3;
        InputStream inputStream = this.in;
        int n4 = inputStream.read();
        if (n4 != (n3 = -1)) {
            Hasher hasher = this.hasher;
            byte by2 = (byte)n4;
            hasher.putByte(by2);
        }
        return n4;
    }

    public int read(byte[] byArray, int n3, int n4) {
        int n7;
        Object object = this.in;
        if ((n4 = ((InputStream)object).read(byArray, n3, n4)) != (n7 = -1)) {
            object = this.hasher;
            object.putBytes(byArray, n3, n4);
        }
        return n4;
    }

    public void reset() {
        IOException iOException = new IOException("reset not supported");
        throw iOException;
    }
}

