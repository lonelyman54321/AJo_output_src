/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.ByteSource$ByteArrayByteSource;
import com.google.common.io.CharSource;
import java.nio.charset.Charset;

final class ByteSource$EmptyByteSource
extends ByteSource$ByteArrayByteSource {
    static final ByteSource$EmptyByteSource INSTANCE;

    static {
        ByteSource$EmptyByteSource byteSource$EmptyByteSource;
        INSTANCE = byteSource$EmptyByteSource = new ByteSource$EmptyByteSource();
    }

    public ByteSource$EmptyByteSource() {
        byte[] byArray = new byte[]{};
        super(byArray);
    }

    public CharSource asCharSource(Charset charset) {
        Preconditions.checkNotNull(charset);
        return CharSource.empty();
    }

    public byte[] read() {
        return this.bytes;
    }

    public String toString() {
        return "ByteSource.empty()";
    }
}

