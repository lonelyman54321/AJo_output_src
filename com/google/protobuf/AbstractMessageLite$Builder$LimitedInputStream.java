/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.InputStream;

final class AbstractMessageLite$Builder$LimitedInputStream
extends FilterInputStream {
    private int limit;

    public AbstractMessageLite$Builder$LimitedInputStream(InputStream inputStream, int n3) {
        super(inputStream);
        this.limit = n3;
    }

    public int available() {
        int n3 = super.available();
        int n4 = this.limit;
        return Math.min(n3, n4);
    }

    public int read() {
        int n3 = this.limit;
        if (n3 <= 0) {
            return -1;
        }
        n3 = super.read();
        if (n3 >= 0) {
            int n4;
            this.limit = n4 = this.limit + -1;
        }
        return n3;
    }

    public int read(byte[] byArray, int n3, int n4) {
        int n7 = this.limit;
        if (n7 <= 0) {
            return -1;
        }
        int n8 = super.read(byArray, n3, n4 = Math.min(n4, n7));
        if (n8 >= 0) {
            this.limit = n3 = this.limit - n8;
        }
        return n8;
    }

    public long skip(long l2) {
        int n3 = this.limit;
        long l3 = n3;
        l2 = Math.min(l2, l3);
        int n4 = (int)(l2 = super.skip(l2));
        if (n4 >= 0) {
            int n7;
            this.limit = n7 = this.limit - n4;
        }
        return n4;
    }
}

