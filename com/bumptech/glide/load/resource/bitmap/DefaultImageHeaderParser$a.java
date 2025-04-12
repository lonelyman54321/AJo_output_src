/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class DefaultImageHeaderParser$a
implements DefaultImageHeaderParser$Reader {
    public final ByteBuffer a;

    public DefaultImageHeaderParser$a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byteBuffer.order(byteOrder);
    }

    public final int a() {
        int n3 = this.c() << 8;
        short s7 = this.c();
        return n3 | s7;
    }

    public final int b(int n3, byte[] byArray) {
        ByteBuffer byteBuffer = this.a;
        int n4 = byteBuffer.remaining();
        if ((n3 = Math.min(n3, n4)) == 0) {
            return -1;
        }
        byteBuffer.get(byArray, 0, n3);
        return n3;
    }

    public final short c() {
        int n3;
        Object object = this.a;
        int n4 = ((Buffer)object).remaining();
        if (n4 >= (n3 = 1)) {
            return (short)(((ByteBuffer)object).get() & 0xFF);
        }
        object = new DefaultImageHeaderParser$Reader$EndOfFileException();
        throw object;
    }

    public final long skip(long l2) {
        ByteBuffer byteBuffer = this.a;
        int n3 = (int)Math.min((long)byteBuffer.remaining(), l2);
        int n4 = byteBuffer.position() + n3;
        byteBuffer.position(n4);
        return n3;
    }
}

