/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteProcessor;
import com.google.common.io.ByteStreams$1;
import com.google.common.io.ByteStreams$ByteArrayDataInputStream;
import com.google.common.io.ByteStreams$ByteArrayDataOutputStream;
import com.google.common.io.ByteStreams$LimitedInputStream;
import com.google.common.io.Java8Compatibility;
import com.google.common.math.IntMath;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 0x7FFFFFF7;
    private static final OutputStream NULL_OUTPUT_STREAM;
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    private static final int ZERO_COPY_CHUNK_SIZE = 524288;

    static {
        ByteStreams$1 byteStreams$1 = new ByteStreams$1();
        NULL_OUTPUT_STREAM = byteStreams$1;
    }

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

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] byArray = ByteStreams.createBuffer();
        long l2 = 0L;
        int n3;
        int n4;
        while ((n4 = inputStream.read(byArray)) != (n3 = -1)) {
            n3 = 0;
            outputStream.write(byArray, 0, n4);
            long l3 = n4;
            l2 += l3;
        }
        return l2;
    }

    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) {
        int n3;
        int n4;
        Preconditions.checkNotNull(readableByteChannel);
        Preconditions.checkNotNull(writableByteChannel);
        boolean bl2 = readableByteChannel instanceof FileChannel;
        long l2 = 0L;
        if (bl2) {
            long l3;
            long l4;
            long l7;
            long l8;
            ReadableByteChannel readableByteChannel2 = readableByteChannel;
            readableByteChannel2 = (FileChannel)readableByteChannel;
            long l12 = l8 = ((FileChannel)readableByteChannel2).position();
            do {
                long l14 = 524288L;
                l4 = ((FileChannel)readableByteChannel2).transferTo(l12, l14, writableByteChannel);
                ((FileChannel)readableByteChannel2).position(l12 += l4);
            } while ((l7 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) > 0 || (l7 = (l3 = l12 - (l4 = ((FileChannel)readableByteChannel2).size())) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0);
            return l12 - l8;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(ByteStreams.createBuffer());
        while ((n4 = readableByteChannel.read(byteBuffer)) != (n3 = -1)) {
            Java8Compatibility.flip(byteBuffer);
            while ((n4 = (int)(byteBuffer.hasRemaining() ? 1 : 0)) != 0) {
                n4 = writableByteChannel.write(byteBuffer);
                long l15 = n4;
                l2 += l15;
            }
            Java8Compatibility.clear(byteBuffer);
        }
        return l2;
    }

    public static byte[] createBuffer() {
        return new byte[8192];
    }

    public static long exhaust(InputStream inputStream) {
        long l2;
        int n3;
        long l3;
        long l4;
        long l7;
        byte[] byArray = ByteStreams.createBuffer();
        long l8 = 0L;
        while ((l7 = (l4 = (l3 = (long)(n3 = inputStream.read(byArray))) - (l2 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            l8 += l3;
        }
        return l8;
    }

    public static InputStream limit(InputStream inputStream, long l2) {
        ByteStreams$LimitedInputStream byteStreams$LimitedInputStream = new ByteStreams$LimitedInputStream(inputStream, l2);
        return byteStreams$LimitedInputStream;
    }

    public static ByteArrayDataInput newDataInput(ByteArrayInputStream byteArrayInputStream) {
        byteArrayInputStream = (ByteArrayInputStream)Preconditions.checkNotNull(byteArrayInputStream);
        ByteStreams$ByteArrayDataInputStream byteStreams$ByteArrayDataInputStream = new ByteStreams$ByteArrayDataInputStream(byteArrayInputStream);
        return byteStreams$ByteArrayDataInputStream;
    }

    public static ByteArrayDataInput newDataInput(byte[] byArray) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        return ByteStreams.newDataInput(byteArrayInputStream);
    }

    public static ByteArrayDataInput newDataInput(byte[] byArray, int n3) {
        int n4 = byArray.length;
        Preconditions.checkPositionIndex(n3, n4);
        int n7 = byArray.length - n3;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray, n3, n7);
        return ByteStreams.newDataInput(byteArrayInputStream);
    }

    public static ByteArrayDataOutput newDataOutput() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        return ByteStreams.newDataOutput(byteArrayOutputStream);
    }

    public static ByteArrayDataOutput newDataOutput(int n3) {
        if (n3 >= 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n3);
            return ByteStreams.newDataOutput(byteArrayOutputStream);
        }
        String string2 = hj0_0.a(n3, "Invalid size: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static ByteArrayDataOutput newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream = (ByteArrayOutputStream)Preconditions.checkNotNull(byteArrayOutputStream);
        ByteStreams$ByteArrayDataOutputStream byteStreams$ByteArrayDataOutputStream = new ByteStreams$ByteArrayDataOutputStream(byteArrayOutputStream);
        return byteStreams$ByteArrayDataOutputStream;
    }

    public static OutputStream nullOutputStream() {
        return NULL_OUTPUT_STREAM;
    }

    public static int read(InputStream object, byte[] object2, int n3, int n4) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        if (n4 >= 0) {
            int n7 = n3 + n4;
            int n8 = ((byte[])object2).length;
            Preconditions.checkPositionIndexes(n3, n7, n8);
            for (n7 = 0; n7 < n4; n7 += n8) {
                n8 = n3 + n7;
                int n10 = n4 - n7;
                if ((n8 = ((InputStream)object).read((byte[])object2, n8, n10)) == (n10 = -1)) break;
            }
            return n7;
        }
        object2 = Gj0.b(n4, "len (", ") cannot be negative");
        object = new IndexOutOfBoundsException((String)object2);
        throw object;
    }

    public static Object readBytes(InputStream inputStream, ByteProcessor byteProcessor) {
        int n3;
        int n4;
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteProcessor);
        byte[] byArray = ByteStreams.createBuffer();
        while ((n4 = inputStream.read(byArray)) != (n3 = -1)) {
            n3 = 0;
            if ((n4 = (int)(byteProcessor.processBytes(byArray, 0, n4) ? 1 : 0)) != 0) continue;
        }
        return byteProcessor.getResult();
    }

    public static void readFully(InputStream inputStream, byte[] byArray) {
        int n3 = byArray.length;
        ByteStreams.readFully(inputStream, byArray, 0, n3);
    }

    public static void readFully(InputStream object, byte[] object2, int n3, int n4) {
        int n7 = ByteStreams.read((InputStream)object, object2, n3, n4);
        if (n7 == n4) {
            return;
        }
        object2 = new EOFException;
        object = z41.a("reached end of stream after reading ", " bytes; ", " bytes expected", n7, n4);
        object2((String)object);
        throw object2;
    }

    public static void skipFully(InputStream object, long l2) {
        long l3 = ByteStreams.skipUpTo((InputStream)object, l2);
        long l4 = l3 - l2;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 >= 0) {
            return;
        }
        String string2 = jl0_0.b(D70.c(l3, "reached end of stream after skipping ", " bytes; "), l2, " bytes expected");
        object = new EOFException(string2);
        throw object;
    }

    private static long skipSafely(InputStream inputStream, long l2) {
        long l3;
        int n3 = inputStream.available();
        if (n3 == 0) {
            l3 = 0L;
        } else {
            long l4 = n3;
            l2 = Math.min(l4, l2);
            l3 = inputStream.skip(l2);
        }
        return l3;
    }

    public static long skipUpTo(InputStream inputStream, long l2) {
        long l3;
        long l4 = 0L;
        byte[] byArray = null;
        long l7 = l4;
        while ((l3 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1)) < 0) {
            long l8 = l2 - l7;
            long l12 = ByteStreams.skipSafely(inputStream, l8);
            long l14 = l12 - l4;
            Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (object == false) {
                long l15;
                l12 = 8192L;
                l8 = Math.min(l8, l12);
                int n3 = (int)l8;
                if (byArray == null) {
                    byArray = new byte[n3];
                }
                if ((object = (l15 = (l12 = (long)(l3 = (long)inputStream.read(byArray, 0, n3))) - (l8 = (long)-1)) == 0L ? 0 : (l15 < 0L ? -1 : 1)) == false) break;
            }
            l7 += l12;
        }
        return l7;
    }

    public static byte[] toByteArray(InputStream inputStream) {
        Preconditions.checkNotNull(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        return ByteStreams.toByteArrayInternal(inputStream, arrayDeque, 0);
    }

    public static byte[] toByteArray(InputStream object, long l2) {
        byte[] byArray;
        int n3;
        long l3 = 0L;
        int n4 = 1;
        Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            byArray = null;
        }
        ArrayDeque<byte[]> arrayDeque = "expectedSize (%s) must be non-negative";
        Preconditions.checkArgument(n3 != 0, (String)((Object)arrayDeque), l2);
        l3 = 0x7FFFFFF7L;
        object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 <= 0) {
            int n7;
            int n8 = (int)l2;
            byte[] byArray2 = new byte[n8];
            n3 = n8;
            while (true) {
                n7 = -1;
                if (n3 <= 0) break;
                object2 = n8 - n3;
                int n10 = ((InputStream)object).read(byArray2, (int)object2, n3);
                if (n10 == n7) {
                    return Arrays.copyOf(byArray2, (int)object2);
                }
                n3 -= n10;
            }
            n3 = ((InputStream)object).read();
            if (n3 == n7) {
                return byArray2;
            }
            arrayDeque = new ArrayDeque<byte[]>(22);
            arrayDeque.add(byArray2);
            byte by2 = (byte)n3;
            byArray = new byte[n4];
            byArray[0] = by2;
            arrayDeque.add(byArray);
            return ByteStreams.toByteArrayInternal((InputStream)object, arrayDeque, n8 += n4);
        }
        String string2 = UX.b(l2, " bytes is too large to fit in a byte array");
        object = new OutOfMemoryError(string2);
        throw object;
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
            n8 = 4096;
            n8 = n7 < n8 ? 4 : 2;
            n7 = IntMath.saturatedMultiply(n7, n8);
        }
        int n15 = ((InputStream)object).read();
        if (n15 == n8) {
            return ByteStreams.combineBuffers(queue, n4);
        }
        object = new OutOfMemoryError("input is too large to fit in a byte array");
        throw object;
    }
}

