/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$LiteralByteString;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public final class ByteString$Output
extends OutputStream {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private byte[] buffer;
    private int bufferPos;
    private final ArrayList flushedBuffers;
    private int flushedBuffersTotalBytes;
    private final int initialCapacity;

    public ByteString$Output(int n3) {
        if (n3 >= 0) {
            ArrayList arrayList;
            this.initialCapacity = n3;
            this.flushedBuffers = arrayList = new ArrayList();
            byte[] byArray = new byte[n3];
            this.buffer = byArray;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Buffer size < 0");
        throw illegalArgumentException;
    }

    private void flushFullBuffer(int n3) {
        ArrayList arrayList = this.flushedBuffers;
        byte[] byArray = this.buffer;
        ByteString$LiteralByteString byteString$LiteralByteString = new ByteString$LiteralByteString(byArray);
        arrayList.add(byteString$LiteralByteString);
        int n4 = this.flushedBuffersTotalBytes;
        int n7 = this.buffer.length;
        this.flushedBuffersTotalBytes = n4 += n7;
        n7 = this.initialCapacity;
        n3 = Math.max(n3, n4 >>>= 1);
        byte[] byArray2 = new byte[Math.max(n7, n3)];
        this.buffer = byArray2;
        this.bufferPos = 0;
    }

    private void flushLastBuffer() {
        int n3 = this.bufferPos;
        Object object = this.buffer;
        int n4 = ((byte[])object).length;
        if (n3 < n4) {
            if (n3 > 0) {
                byte[] byArray = Arrays.copyOf(object, n3);
                object = this.flushedBuffers;
                ByteString$LiteralByteString byteString$LiteralByteString = new ByteString$LiteralByteString(byArray);
                object.add(byteString$LiteralByteString);
            }
        } else {
            Object object2 = this.flushedBuffers;
            object = new ByteString$LiteralByteString;
            byte[] byArray = this.buffer;
            object(byArray);
            ((ArrayList)object2).add(object);
            object2 = EMPTY_BYTE_ARRAY;
            this.buffer = (byte[])object2;
        }
        n3 = this.flushedBuffersTotalBytes;
        int n7 = this.bufferPos;
        this.flushedBuffersTotalBytes = n3 += n7;
        this.bufferPos = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void reset() {
        synchronized (this) {
            ArrayList arrayList = this.flushedBuffers;
            arrayList.clear();
            arrayList = null;
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int size() {
        synchronized (this) {
            int n3 = this.flushedBuffersTotalBytes;
            int n4 = this.bufferPos;
            return n3 += n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ByteString toByteString() {
        synchronized (this) {
            this.flushLastBuffer();
            Iterable iterable = this.flushedBuffers;
            return ByteString.copyFrom(iterable);
        }
    }

    public String toString() {
        String string2 = Integer.toHexString(System.identityHashCode(this));
        Integer n3 = this.size();
        Object[] objectArray = new Object[]{string2, n3};
        return String.format("<ByteString.Output@%s size=%d>", objectArray);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void write(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                int n4;
                int n7;
                block4: {
                    try {
                        int n8 = this.bufferPos;
                        byte[] byArray = this.buffer;
                        n7 = byArray.length;
                        if (n8 != n7) break block4;
                        n8 = 1;
                        this.flushFullBuffer(n8);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                byte[] byArray = this.buffer;
                n7 = this.bufferPos;
                this.bufferPos = n4 = n7 + 1;
                n3 = (byte)n3;
                {
                    byArray[n7] = n3;
                    return;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void write(byte[] byArray, int n3, int n4) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    int n7;
                    byte[] byArray2;
                    try {
                        byArray2 = this.buffer;
                        n7 = byArray2.length;
                        int n8 = this.bufferPos;
                        if (n4 <= (n7 -= n8)) {
                            int n10;
                            System.arraycopy(byArray, n3, byArray2, n8, n4);
                            this.bufferPos = n10 = this.bufferPos + n4;
                            break block7;
                        }
                        n7 = byArray2.length - n8;
                        System.arraycopy(byArray, n3, byArray2, n8, n7);
                        n3 += n7;
                        n4 -= n7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    this.flushFullBuffer(n4);
                    byArray2 = this.buffer;
                    n7 = 0;
                    System.arraycopy(byArray, n3, byArray2, 0, n4);
                    this.bufferPos = n4;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeTo(OutputStream outputStream) {
        int n3;
        Object[] objectArray;
        int n4;
        Object[] objectArray2;
        synchronized (this) {
            objectArray2 = this.flushedBuffers;
            n4 = 0;
            objectArray = new ByteString[]{};
            objectArray2 = objectArray2.toArray(objectArray);
            objectArray = this.buffer;
            n3 = this.bufferPos;
        }
        int n7 = objectArray2.length;
        while (true) {
            if (n4 >= n7) {
                objectArray2 = Arrays.copyOf((byte[])objectArray, n3);
                outputStream.write((byte[])objectArray2);
                return;
            }
            ByteString byteString = objectArray2[n4];
            byteString.writeTo(outputStream);
            ++n4;
        }
    }
}

