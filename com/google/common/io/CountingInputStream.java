/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class CountingInputStream
extends FilterInputStream {
    private long count;
    private long mark;

    public CountingInputStream(InputStream inputStream) {
        inputStream = (InputStream)Preconditions.checkNotNull(inputStream);
        super(inputStream);
        this.mark = -1;
    }

    public long getCount() {
        return this.count;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void mark(int n3) {
        synchronized (this) {
            long l2;
            InputStream inputStream = this.in;
            inputStream.mark(n3);
            this.mark = l2 = this.count;
            return;
        }
    }

    public int read() {
        int n3;
        InputStream inputStream = this.in;
        int n4 = inputStream.read();
        if (n4 != (n3 = -1)) {
            long l2 = this.count;
            long l3 = 1L;
            this.count = l2 += l3;
        }
        return n4;
    }

    public int read(byte[] byArray, int n3, int n4) {
        InputStream inputStream = this.in;
        int n7 = inputStream.read(byArray, n3, n4);
        if (n7 != (n3 = -1)) {
            long l2 = this.count;
            long l3 = n7;
            this.count = l2 += l3;
        }
        return n7;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void reset() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object;
                try {
                    object = this.in;
                    boolean bl2 = ((InputStream)object).markSupported();
                    if (!bl2) {
                        String string2 = "Mark not supported";
                        object = new IOException(string2);
                        throw object;
                    }
                    long l2 = this.mark;
                    long l3 = -1;
                    long l4 = l2 - l3;
                    Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object2 != false) {
                        object = this.in;
                        ((InputStream)object).reset();
                        this.count = l2 = this.mark;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                String string3 = "Mark not set";
                object = new IOException(string3);
                throw object;
            }
            throw throwable2;
        }
    }

    public long skip(long l2) {
        long l3;
        l2 = this.in.skip(l2);
        this.count = l3 = this.count + l2;
        return l2;
    }
}

