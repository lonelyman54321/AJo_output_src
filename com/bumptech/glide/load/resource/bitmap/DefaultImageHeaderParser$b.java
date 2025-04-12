/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class DefaultImageHeaderParser$b {
    public final ByteBuffer a;

    public DefaultImageHeaderParser$b(byte[] object, int n3) {
        object = ByteBuffer.wrap((byte[])object);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.a = object = (ByteBuffer)((ByteBuffer)object).order(byteOrder).limit(n3);
    }

    public final short a(int n3) {
        int n4;
        ByteBuffer byteBuffer = this.a;
        int n7 = byteBuffer.remaining() - n3;
        n3 = n7 >= (n4 = 2) ? (int)byteBuffer.getShort(n3) : -1;
        return (short)n3;
    }
}

