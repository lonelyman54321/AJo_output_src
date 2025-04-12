/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.io.BaseEncoding;
import com.google.common.io.ByteProcessor;
import com.google.common.io.ByteSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

class ByteSource$ByteArrayByteSource
extends ByteSource {
    final byte[] bytes;
    final int length;
    final int offset;

    public ByteSource$ByteArrayByteSource(byte[] byArray) {
        int n3 = byArray.length;
        this(byArray, 0, n3);
    }

    public ByteSource$ByteArrayByteSource(byte[] byArray, int n3, int n4) {
        this.bytes = byArray;
        this.offset = n3;
        this.length = n4;
    }

    public long copyTo(OutputStream outputStream) {
        byte[] byArray = this.bytes;
        int n3 = this.offset;
        int n4 = this.length;
        outputStream.write(byArray, n3, n4);
        return this.length;
    }

    public HashCode hash(HashFunction hashFunction) {
        byte[] byArray = this.bytes;
        int n3 = this.offset;
        int n4 = this.length;
        return hashFunction.hashBytes(byArray, n3, n4);
    }

    public boolean isEmpty() {
        int n3 = this.length;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public InputStream openBufferedStream() {
        return this.openStream();
    }

    public InputStream openStream() {
        byte[] byArray = this.bytes;
        int n3 = this.offset;
        int n4 = this.length;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray, n3, n4);
        return byteArrayInputStream;
    }

    public Object read(ByteProcessor byteProcessor) {
        byte[] byArray = this.bytes;
        int n3 = this.offset;
        int n4 = this.length;
        byteProcessor.processBytes(byArray, n3, n4);
        return byteProcessor.getResult();
    }

    public byte[] read() {
        byte[] byArray = this.bytes;
        int n3 = this.offset;
        int n4 = this.length + n3;
        return Arrays.copyOfRange(byArray, n3, n4);
    }

    public long size() {
        return this.length;
    }

    public Optional sizeIfKnown() {
        return Optional.of(this.length);
    }

    public ByteSource slice(long l2, long l3) {
        int n3 = 0;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        object = object >= 0 ? (Object)1 : (Object)0;
        String string2 = "offset (%s) may not be negative";
        Preconditions.checkArgument((boolean)object, string2, l2);
        object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object >= 0) {
            n3 = 1;
        }
        Preconditions.checkArgument(n3 != 0, "length (%s) may not be negative", l3);
        long l8 = this.length;
        l2 = Math.min(l2, l8);
        l8 = (long)this.length - l2;
        l3 = Math.min(l3, l8);
        n3 = this.offset;
        int n4 = (int)l2;
        byte[] byArray = this.bytes;
        int n7 = (int)l3;
        ByteSource$ByteArrayByteSource byteSource$ByteArrayByteSource = new ByteSource$ByteArrayByteSource(byArray, n3 += n4, n7);
        return byteSource$ByteArrayByteSource;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ByteSource.wrap(");
        Object object = BaseEncoding.base16();
        byte[] byArray = this.bytes;
        int n3 = this.offset;
        int n4 = this.length;
        object = Ascii.truncate(((BaseEncoding)object).encode(byArray, n3, n4), 30, "...");
        stringBuilder.append((String)object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

