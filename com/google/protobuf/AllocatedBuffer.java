/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AllocatedBuffer$1;
import com.google.protobuf.AllocatedBuffer$2;
import com.google.protobuf.Internal;
import java.nio.ByteBuffer;

abstract class AllocatedBuffer {
    public static AllocatedBuffer wrap(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        AllocatedBuffer$1 allocatedBuffer$1 = new AllocatedBuffer$1(byteBuffer);
        return allocatedBuffer$1;
    }

    public static AllocatedBuffer wrap(byte[] byArray) {
        int n3 = byArray.length;
        return AllocatedBuffer.wrapNoCheck(byArray, 0, n3);
    }

    public static AllocatedBuffer wrap(byte[] object, int n3, int n4) {
        int n7;
        int n8;
        if (n3 >= 0 && n4 >= 0 && (n8 = n3 + n4) <= (n7 = ((byte[])object).length)) {
            return AllocatedBuffer.wrapNoCheck(object, n3, n4);
        }
        object = ((byte[])object).length;
        Integer n10 = n3;
        Integer n14 = n4;
        Object[] objectArray = new Object[]{object, n10, n14};
        object = String.format("bytes.length=%d, offset=%d, length=%d", objectArray);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException((String)object);
        throw indexOutOfBoundsException;
    }

    private static AllocatedBuffer wrapNoCheck(byte[] byArray, int n3, int n4) {
        AllocatedBuffer$2 allocatedBuffer$2 = new AllocatedBuffer$2(byArray, n3, n4);
        return allocatedBuffer$2;
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    public abstract AllocatedBuffer position(int var1);

    public abstract int remaining();
}

