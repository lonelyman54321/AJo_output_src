/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.ByteSource;
import java.io.InputStream;
import java.util.Iterator;

final class MultiInputStream
extends InputStream {
    private InputStream in;
    private Iterator it;

    public MultiInputStream(Iterator iterator) {
        this.it = iterator = (Iterator)Preconditions.checkNotNull(iterator);
        this.advance();
    }

    private void advance() {
        this.close();
        Object object = this.it;
        boolean bl2 = object.hasNext();
        if (bl2) {
            this.in = object = ((ByteSource)this.it.next()).openStream();
        }
    }

    public int available() {
        InputStream inputStream = this.in;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    public void close() {
        InputStream inputStream = this.in;
        if (inputStream != null) {
            try {
                inputStream.close();
            }
            finally {
                this.in = null;
            }
        }
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int n3;
        while (true) {
            InputStream inputStream = this.in;
            n3 = -1;
            if (inputStream == null) break;
            int n4 = inputStream.read();
            if (n4 != n3) {
                return n4;
            }
            this.advance();
        }
        return n3;
    }

    public int read(byte[] byArray, int n3, int n4) {
        int n7;
        Preconditions.checkNotNull(byArray);
        while (true) {
            InputStream inputStream = this.in;
            n7 = -1;
            if (inputStream == null) break;
            int n8 = inputStream.read(byArray, n3, n4);
            if (n8 != n7) {
                return n8;
            }
            this.advance();
        }
        return n7;
    }

    public long skip(long l2) {
        long l3;
        InputStream inputStream = this.in;
        long l4 = 0L;
        if (inputStream != null && (l3 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1)) > 0) {
            long l7 = inputStream.skip(l2);
            long l8 = l7 - l4;
            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object != false) {
                return l7;
            }
            object = this.read();
            if (object == (l3 = (long)-1)) {
                return l4;
            }
            inputStream = this.in;
            l4 = 1L;
            return inputStream.skip(l2 -= l4) + l4;
        }
        return l4;
    }
}

