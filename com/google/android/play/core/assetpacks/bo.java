/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import java.io.InputStream;

final class bo
extends InputStream {
    private final InputStream a;
    private long b;

    public bo(InputStream inputStream, long l2) {
        this.a = inputStream;
        this.b = l2;
    }

    public final void close() {
        super.close();
        this.a.close();
        this.b = 0L;
    }

    public final int read() {
        long l2 = this.b;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object <= 0) {
            return -1;
        }
        this.b = l2 += (long)-1;
        return this.a.read();
    }

    public final int read(byte[] byArray, int n3, int n4) {
        long l2 = this.b;
        long l3 = 0L;
        int n7 = -1;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object <= 0) {
            return n7;
        }
        InputStream inputStream = this.a;
        l3 = n4;
        int n8 = inputStream.read(byArray, n3, n4 = (int)(l2 = Math.min(l3, l2)));
        if (n8 != n7) {
            long l4 = this.b;
            l2 = n8;
            this.b = l4 -= l2;
        }
        return n8;
    }
}

