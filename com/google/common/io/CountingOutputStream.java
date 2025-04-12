/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.FilterOutputStream;
import java.io.OutputStream;

public final class CountingOutputStream
extends FilterOutputStream {
    private long count;

    public CountingOutputStream(OutputStream outputStream) {
        outputStream = (OutputStream)Preconditions.checkNotNull(outputStream);
        super(outputStream);
    }

    public void close() {
        this.out.close();
    }

    public long getCount() {
        return this.count;
    }

    public void write(int n3) {
        long l2;
        this.out.write(n3);
        this.count = l2 = this.count + 1L;
    }

    public void write(byte[] byArray, int n3, int n4) {
        this.out.write(byArray, n3, n4);
        long l2 = this.count;
        long l3 = n4;
        this.count = l2 += l3;
    }
}

