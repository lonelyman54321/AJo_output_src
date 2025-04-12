/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.encoders.proto;

import java.io.OutputStream;

final class LengthCountingOutputStream
extends OutputStream {
    private long length = 0L;

    public long getLength() {
        return this.length;
    }

    public void write(int n3) {
        long l2;
        this.length = l2 = this.length + 1L;
    }

    public void write(byte[] byArray) {
        long l2 = this.length;
        long l3 = byArray.length;
        this.length = l2 += l3;
    }

    public void write(byte[] object, int n3, int n4) {
        int n7;
        int n8;
        if (n3 >= 0 && n3 <= (n8 = ((byte[])object).length) && n4 >= 0 && (n3 += n4) <= (n7 = ((byte[])object).length) && n3 >= 0) {
            long l2 = this.length;
            long l3 = n4;
            this.length = l2 += l3;
            return;
        }
        object = new IndexOutOfBoundsException;
        object();
        throw object;
    }
}

