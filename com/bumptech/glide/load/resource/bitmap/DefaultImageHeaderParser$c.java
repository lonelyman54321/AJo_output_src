/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.io.InputStream;

public final class DefaultImageHeaderParser$c
implements DefaultImageHeaderParser$Reader {
    public final InputStream a;

    public DefaultImageHeaderParser$c(InputStream inputStream) {
        this.a = inputStream;
    }

    public final int a() {
        int n3 = this.c() << 8;
        short s7 = this.c();
        return n3 | s7;
    }

    public final int b(int n3, byte[] byArray) {
        int n4;
        int n7 = 0;
        int n8 = 0;
        InputStream inputStream = null;
        while (true) {
            int n10;
            n4 = -1;
            if (n7 >= n3 || (n8 = (inputStream = this.a).read(byArray, n7, n10 = n3 - n7)) == n4) break;
            n7 += n8;
        }
        if (n7 == 0 && n8 == n4) {
            DefaultImageHeaderParser$Reader$EndOfFileException defaultImageHeaderParser$Reader$EndOfFileException = new DefaultImageHeaderParser$Reader$EndOfFileException();
            throw defaultImageHeaderParser$Reader$EndOfFileException;
        }
        return n7;
    }

    public final short c() {
        int n3;
        Object object = this.a;
        int n4 = ((InputStream)object).read();
        if (n4 != (n3 = -1)) {
            return (short)n4;
        }
        object = new DefaultImageHeaderParser$Reader$EndOfFileException();
        throw object;
    }

    public final long skip(long l2) {
        long l3;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return l4;
        }
        long l8 = l2;
        while ((l3 = l8 == l4 ? 0 : (l8 < l4 ? -1 : 1)) > 0) {
            int n3;
            InputStream inputStream = this.a;
            long l12 = inputStream.skip(l8);
            long l14 = l12 - l4;
            Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (object2 > 0) {
                l8 -= l12;
                continue;
            }
            l3 = inputStream.read();
            if (l3 == (n3 = -1)) break;
            long l15 = 1L;
            l8 -= l15;
        }
        return l2 - l8;
    }
}

