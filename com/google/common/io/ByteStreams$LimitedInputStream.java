/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class ByteStreams$LimitedInputStream
extends FilterInputStream {
    private long left;
    private long mark = -1;

    public ByteStreams$LimitedInputStream(InputStream inputStream, long l2) {
        super(inputStream);
        Preconditions.checkNotNull(inputStream);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            l4 = 1;
        } else {
            l4 = 0;
            inputStream = null;
        }
        Preconditions.checkArgument((boolean)l4, "limit must be non-negative");
        this.left = l2;
    }

    public int available() {
        long l2 = this.in.available();
        long l3 = this.left;
        return (int)Math.min(l2, l3);
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
            this.mark = l2 = this.left;
            return;
        }
    }

    public int read() {
        long l2 = this.left;
        long l3 = 0L;
        int n3 = -1;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            return n3;
        }
        InputStream inputStream = this.in;
        int n4 = inputStream.read();
        if (n4 != n3) {
            long l4 = this.left;
            long l7 = 1L;
            this.left = l4 -= l7;
        }
        return n4;
    }

    public int read(byte[] byArray, int n3, int n4) {
        long l2 = this.left;
        long l3 = 0L;
        int n7 = -1;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            return n7;
        }
        InputStream inputStream = this.in;
        l3 = n4;
        int n8 = inputStream.read(byArray, n3, n4 = (int)(l2 = Math.min(l3, l2)));
        if (n8 != n7) {
            long l4 = this.left;
            l2 = n8;
            this.left = l4 -= l2;
        }
        return n8;
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
                        this.left = l2 = this.mark;
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
        long l3 = this.left;
        l2 = Math.min(l2, l3);
        l2 = this.in.skip(l2);
        this.left = l3 = this.left - l2;
        return l2;
    }
}

