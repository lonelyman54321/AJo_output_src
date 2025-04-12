/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging;

import com.google.firebase.messaging.ByteStreams$LimitedInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 0x7FFFFFF7;
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;

    private ByteStreams() {
    }

    private static byte[] combineBuffers(Queue queue, int n3) {
        int n4;
        boolean bl2 = queue.isEmpty();
        if (bl2) {
            return new byte[0];
        }
        byte[] byArray = (byte[])queue.remove();
        int n7 = byArray.length;
        if (n7 == n3) {
            return byArray;
        }
        n7 = byArray.length;
        byArray = Arrays.copyOf(byArray, n3);
        for (n7 = n3 - n7; n7 > 0; n7 -= n4) {
            byte[] byArray2 = (byte[])queue.remove();
            n4 = byArray2.length;
            n4 = Math.min(n7, n4);
            int n8 = n3 - n7;
            System.arraycopy(byArray2, 0, byArray, n8, n4);
        }
        return byArray;
    }

    public static byte[] createBuffer() {
        return new byte[8192];
    }

    public static InputStream limit(InputStream inputStream, long l2) {
        ByteStreams$LimitedInputStream byteStreams$LimitedInputStream = new ByteStreams$LimitedInputStream(inputStream, l2);
        return byteStreams$LimitedInputStream;
    }

    private static int saturatedCast(long l2) {
        long l3 = Integer.MAX_VALUE;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            return -1 >>> 1;
        }
        l3 = 0x80000000L;
        long l7 = l2 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object < 0) {
            return -1 << -1;
        }
        return (int)l2;
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        return ByteStreams.toByteArrayInternal(inputStream, arrayDeque, 0);
    }

    private static byte[] toByteArrayInternal(InputStream object, Queue queue, int n3) {
        int n4;
        int n7 = Integer.highestOneBit(n3) * 2;
        n7 = Math.max(128, n7);
        int n8 = 8192;
        n7 = Math.min(n8, n7);
        while (true) {
            n8 = -1;
            n4 = 0x7FFFFFF7;
            if (n3 >= n4) break;
            n4 -= n3;
            n4 = Math.min(n7, n4);
            byte[] byArray = new byte[n4];
            queue.add(byArray);
            int n10 = 0;
            while (n10 < n4) {
                int n14 = n4 - n10;
                if ((n14 = ((InputStream)object).read(byArray, n10, n14)) == n8) {
                    return ByteStreams.combineBuffers(queue, n3);
                }
                n10 += n14;
                n3 += n14;
            }
            long l2 = n7;
            int n15 = 4096;
            n7 = n7 < n15 ? 4 : 2;
            long l3 = n7;
            n7 = ByteStreams.saturatedCast(l2 *= l3);
        }
        int n16 = ((InputStream)object).read();
        if (n16 == n8) {
            return ByteStreams.combineBuffers(queue, n4);
        }
        object = new OutOfMemoryError("input is too large to fit in a byte array");
        throw object;
    }
}

