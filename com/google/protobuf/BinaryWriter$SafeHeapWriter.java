/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AllocatedBuffer;
import com.google.protobuf.BinaryWriter;
import com.google.protobuf.BufferAllocator;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Protobuf;
import com.google.protobuf.Schema;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

final class BinaryWriter$SafeHeapWriter
extends BinaryWriter {
    private AllocatedBuffer allocatedBuffer;
    private byte[] buffer;
    private int limit;
    private int limitMinusOne;
    private int offset;
    private int offsetMinusOne;
    private int pos;

    public BinaryWriter$SafeHeapWriter(BufferAllocator bufferAllocator, int n3) {
        super(bufferAllocator, n3, null);
        this.nextBuffer();
    }

    private void nextBuffer() {
        AllocatedBuffer allocatedBuffer = this.newHeapBuffer();
        this.nextBuffer(allocatedBuffer);
    }

    private void nextBuffer(int n3) {
        AllocatedBuffer allocatedBuffer = this.newHeapBuffer(n3);
        this.nextBuffer(allocatedBuffer);
    }

    private void nextBuffer(AllocatedBuffer object) {
        boolean n3 = ((AllocatedBuffer)object).hasArray();
        if (n3) {
            int n4;
            int n7;
            int n8;
            this.finishCurrentBuffer();
            this.buffers.addFirst(object);
            this.allocatedBuffer = object;
            byte[] byArray = ((AllocatedBuffer)object).array();
            this.buffer = byArray;
            int n10 = ((AllocatedBuffer)object).arrayOffset();
            this.limit = n8 = ((AllocatedBuffer)object).limit() + n10;
            int n14 = ((AllocatedBuffer)object).position();
            this.offset = n7 = n10 + n14;
            this.offsetMinusOne = n4 = n7 + -1;
            this.limitMinusOne = n14 = this.limit + -1;
            this.pos = n14;
            return;
        }
        object = new RuntimeException("Allocator returned non-heap buffer");
        throw object;
    }

    private void writeVarint32FiveBytes(int n3) {
        byte by2;
        int n4;
        int n7;
        byte[] byArray = this.buffer;
        int n8 = this.pos;
        this.pos = n7 = n8 + -1;
        byArray[n8] = n4 = (int)(n3 >>> 28);
        this.pos = n4 = n8 + -2;
        byArray[n7] = by2 = (byte)(n3 >>> 21 & 0x7F | 0x80);
        this.pos = n7 = n8 + -3;
        byArray[n4] = by2 = (byte)(n3 >>> 14 & 0x7F | 0x80);
        this.pos = n4 = n8 + -4;
        byArray[n7] = by2 = (byte)(n3 >>> 7 & 0x7F | 0x80);
        this.pos = n8 += -5;
        byArray[n4] = n3 = (int)((byte)(n3 & 0x7F | 0x80));
    }

    private void writeVarint32FourBytes(int n3) {
        byte by2;
        int n4;
        int n7;
        byte[] byArray = this.buffer;
        int n8 = this.pos;
        this.pos = n7 = n8 + -1;
        byArray[n8] = n4 = (int)(n3 >>> 21);
        this.pos = n4 = n8 + -2;
        byArray[n7] = by2 = (byte)(n3 >>> 14 & 0x7F | 0x80);
        this.pos = n7 = n8 + -3;
        byArray[n4] = by2 = (byte)(n3 >>> 7 & 0x7F | 0x80);
        this.pos = n8 += -4;
        byArray[n7] = n3 = (int)((byte)(n3 & 0x7F | 0x80));
    }

    private void writeVarint32OneByte(int n3) {
        int n4;
        byte[] byArray = this.buffer;
        int n7 = this.pos;
        this.pos = n4 = n7 + -1;
        byArray[n7] = n3 = (int)((byte)n3);
    }

    private void writeVarint32ThreeBytes(int n3) {
        byte by2;
        int n4;
        int n7;
        byte[] byArray = this.buffer;
        int n8 = this.pos;
        this.pos = n7 = n8 + -1;
        byArray[n8] = n4 = (int)(n3 >>> 14);
        this.pos = n4 = n8 + -2;
        byArray[n7] = by2 = (byte)(n3 >>> 7 & 0x7F | 0x80);
        this.pos = n8 += -3;
        byArray[n4] = n3 = (int)((byte)(n3 & 0x7F | 0x80));
    }

    private void writeVarint32TwoBytes(int n3) {
        byte by2;
        int n4;
        byte[] byArray = this.buffer;
        int n7 = this.pos;
        this.pos = n4 = n7 + -1;
        byArray[n7] = by2 = (byte)(n3 >>> 7);
        this.pos = n7 += -2;
        byArray[n4] = n3 = (int)((byte)(n3 & 0x7F | 0x80));
    }

    private void writeVarint64EightBytes(long l2) {
        byte by2;
        byte by4;
        int n3;
        int n4;
        byte[] byArray = this.buffer;
        int n7 = this.pos;
        this.pos = n4 = n7 + -1;
        byArray[n7] = n3 = (int)((int)(l2 >>> 49));
        this.pos = n3 = n7 + -2;
        long l3 = l2 >>> 42;
        long l4 = 127;
        long l7 = 128L;
        byArray[n4] = by4 = (byte)((l3 &= l4) | l7);
        this.pos = n4 = n7 + -3;
        byArray[n3] = by4 = (byte)(l2 >>> 35 & l4 | l7);
        this.pos = n3 = n7 + -4;
        byArray[n4] = by4 = (byte)(l2 >>> 28 & l4 | l7);
        this.pos = n4 = n7 + -5;
        byArray[n3] = by4 = (byte)(l2 >>> 21 & l4 | l7);
        this.pos = n3 = n7 + -6;
        byArray[n4] = by4 = (byte)(l2 >>> 14 & l4 | l7);
        this.pos = n4 = n7 + -7;
        byArray[n3] = by4 = (byte)(l2 >>> 7 & l4 | l7);
        this.pos = n7 += -8;
        byArray[n4] = by2 = (byte)(l2 & l4 | l7);
    }

    private void writeVarint64FiveBytes(long l2) {
        byte by2;
        byte by4;
        int n3;
        int n4;
        byte[] byArray = this.buffer;
        int n7 = this.pos;
        this.pos = n4 = n7 + -1;
        byArray[n7] = n3 = (int)((int)(l2 >>> 28));
        this.pos = n3 = n7 + -2;
        long l3 = l2 >>> 21;
        long l4 = 127;
        long l7 = 128L;
        byArray[n4] = by4 = (byte)((l3 &= l4) | l7);
        this.pos = n4 = n7 + -3;
        byArray[n3] = by4 = (byte)(l2 >>> 14 & l4 | l7);
        this.pos = n3 = n7 + -4;
        byArray[n4] = by4 = (byte)(l2 >>> 7 & l4 | l7);
        this.pos = n7 += -5;
        byArray[n3] = by2 = (byte)(l2 & l4 | l7);
    }

    private void writeVarint64FourBytes(long l2) {
        byte by2;
        byte by4;
        int n3;
        int n4;
        byte[] byArray = this.buffer;
        int n7 = this.pos;
        this.pos = n4 = n7 + -1;
        byArray[n7] = n3 = (int)((int)(l2 >>> 21));
        this.pos = n3 = n7 + -2;
        long l3 = l2 >>> 14;
        long l4 = 127;
        long l7 = 128L;
        byArray[n4] = by4 = (byte)((l3 &= l4) | l7);
        this.pos = n4 = n7 + -3;
        byArray[n3] = by4 = (byte)(l2 >>> 7 & l4 | l7);
        this.pos = n7 += -4;
        byArray[n4] = by2 = (byte)(l2 & l4 | l7);
    }

    private void writeVarint64NineBytes(long l2) {
        byte by2;
        byte by4;
        int n3;
        int n4;
        byte[] byArray = this.buffer;
        int n7 = this.pos;
        this.pos = n4 = n7 + -1;
        byArray[n7] = n3 = (int)((int)(l2 >>> 56));
        this.pos = n3 = n7 + -2;
        long l3 = l2 >>> 49;
        long l4 = 127;
        long l7 = 128L;
        byArray[n4] = by4 = (byte)((l3 &= l4) | l7);
        this.pos = n4 = n7 + -3;
        byArray[n3] = by4 = (byte)(l2 >>> 42 & l4 | l7);
        this.pos = n3 = n7 + -4;
        byArray[n4] = by4 = (byte)(l2 >>> 35 & l4 | l7);
        this.pos = n4 = n7 + -5;
        byArray[n3] = by4 = (byte)(l2 >>> 28 & l4 | l7);
        this.pos = n3 = n7 + -6;
        byArray[n4] = by4 = (byte)(l2 >>> 21 & l4 | l7);
        this.pos = n4 = n7 + -7;
        byArray[n3] = by4 = (byte)(l2 >>> 14 & l4 | l7);
        this.pos = n3 = n7 + -8;
        byArray[n4] = by4 = (byte)(l2 >>> 7 & l4 | l7);
        this.pos = n7 += -9;
        byArray[n3] = by2 = (byte)(l2 & l4 | l7);
    }

    private void writeVarint64OneByte(long l2) {
        byte by2;
        int n3;
        byte[] byArray = this.buffer;
        int n4 = this.pos;
        this.pos = n3 = n4 + -1;
        byArray[n4] = by2 = (byte)l2;
    }

    private void writeVarint64SevenBytes(long l2) {
        byte by2;
        byte by4;
        int n3;
        int n4;
        int n7;
        byte[] byArray = this.buffer;
        int n8 = this.pos;
        this.pos = n7 = n8 + -1;
        byArray[n8] = n4 = (int)((int)(l2 >>> 42));
        this.pos = n4 = n8 + -2;
        long l3 = l2 >>> 35;
        long l4 = 127;
        long l7 = 128L;
        byArray[n7] = n3 = (int)((int)((l3 &= l4) | l7));
        this.pos = n7 = n8 + -3;
        byArray[n4] = n3 = (byte)(l2 >>> 28 & l4 | l7);
        this.pos = n4 = n8 + -4;
        byArray[n7] = n3 = (byte)(l2 >>> 21 & l4 | l7);
        this.pos = n7 = n8 + -5;
        byArray[n4] = n3 = (byte)(l2 >>> 14 & l4 | l7);
        this.pos = n4 = n8 + -6;
        n3 = 7;
        byArray[n7] = by4 = (byte)(l2 >>> n3 & l4 | l7);
        this.pos = n8 -= n3;
        byArray[n4] = by2 = (byte)(l2 & l4 | l7);
    }

    private void writeVarint64SixBytes(long l2) {
        byte by2;
        byte by4;
        int n3;
        int n4;
        byte[] byArray = this.buffer;
        int n7 = this.pos;
        this.pos = n4 = n7 + -1;
        byArray[n7] = n3 = (int)((int)(l2 >>> 35));
        this.pos = n3 = n7 + -2;
        long l3 = l2 >>> 28;
        long l4 = 127;
        long l7 = 128L;
        byArray[n4] = by4 = (byte)((l3 &= l4) | l7);
        this.pos = n4 = n7 + -3;
        byArray[n3] = by4 = (byte)(l2 >>> 21 & l4 | l7);
        this.pos = n3 = n7 + -4;
        byArray[n4] = by4 = (byte)(l2 >>> 14 & l4 | l7);
        this.pos = n4 = n7 + -5;
        byArray[n3] = by4 = (byte)(l2 >>> 7 & l4 | l7);
        this.pos = n7 += -6;
        byArray[n4] = by2 = (byte)(l2 & l4 | l7);
    }

    private void writeVarint64TenBytes(long l2) {
        byte by2;
        byte by4;
        int n3;
        int n4;
        byte[] byArray = this.buffer;
        int n7 = this.pos;
        this.pos = n4 = n7 + -1;
        byArray[n7] = n3 = (int)((int)(l2 >>> 63));
        this.pos = n3 = n7 + -2;
        long l3 = l2 >>> 56;
        long l4 = 127;
        long l7 = 128L;
        byArray[n4] = by4 = (byte)((l3 &= l4) | l7);
        this.pos = n4 = n7 + -3;
        byArray[n3] = by4 = (byte)(l2 >>> 49 & l4 | l7);
        this.pos = n3 = n7 + -4;
        byArray[n4] = by4 = (byte)(l2 >>> 42 & l4 | l7);
        this.pos = n4 = n7 + -5;
        byArray[n3] = by4 = (byte)(l2 >>> 35 & l4 | l7);
        this.pos = n3 = n7 + -6;
        byArray[n4] = by4 = (byte)(l2 >>> 28 & l4 | l7);
        this.pos = n4 = n7 + -7;
        byArray[n3] = by4 = (byte)(l2 >>> 21 & l4 | l7);
        this.pos = n3 = n7 + -8;
        byArray[n4] = by4 = (byte)(l2 >>> 14 & l4 | l7);
        this.pos = n4 = n7 + -9;
        byArray[n3] = by4 = (byte)(l2 >>> 7 & l4 | l7);
        this.pos = n7 += -10;
        byArray[n4] = by2 = (byte)(l2 & l4 | l7);
    }

    private void writeVarint64ThreeBytes(long l2) {
        byte by2;
        byte by4;
        int n3;
        int n4;
        byte[] byArray = this.buffer;
        int n7 = this.pos;
        this.pos = n4 = n7 + -1;
        byArray[n7] = n3 = (int)((int)l2 >>> 14);
        this.pos = n3 = n7 + -2;
        long l3 = l2 >>> 7;
        long l4 = 127;
        long l7 = 128L;
        byArray[n4] = by4 = (byte)((l3 &= l4) | l7);
        this.pos = n7 += -3;
        byArray[n3] = by2 = (byte)(l2 & l4 | l7);
    }

    private void writeVarint64TwoBytes(long l2) {
        byte by2;
        byte by4;
        int n3;
        byte[] byArray = this.buffer;
        int n4 = this.pos;
        this.pos = n3 = n4 + -1;
        byArray[n4] = by4 = (byte)(l2 >>> 7);
        this.pos = n4 += -2;
        byArray[n3] = by2 = (byte)((int)l2 & 0x7F | 0x80);
    }

    public int bytesWrittenToCurrentBuffer() {
        int n3 = this.limitMinusOne;
        int n4 = this.pos;
        return n3 - n4;
    }

    public void finishCurrentBuffer() {
        AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
        if (allocatedBuffer != null) {
            int n3 = this.totalDoneBytes;
            int n4 = this.bytesWrittenToCurrentBuffer();
            this.totalDoneBytes = n3 += n4;
            allocatedBuffer = this.allocatedBuffer;
            n4 = this.pos;
            int n7 = allocatedBuffer.arrayOffset();
            n4 = n4 - n7 + 1;
            allocatedBuffer.position(n4);
            this.allocatedBuffer = null;
            n3 = 0;
            allocatedBuffer = null;
            this.pos = 0;
            this.limitMinusOne = 0;
        }
    }

    public int getTotalBytesWritten() {
        int n3 = this.totalDoneBytes;
        int n4 = this.bytesWrittenToCurrentBuffer();
        return n3 + n4;
    }

    public void requireSpace(int n3) {
        int n4 = this.spaceLeft();
        if (n4 < n3) {
            this.nextBuffer(n3);
        }
    }

    public int spaceLeft() {
        int n3 = this.pos;
        int n4 = this.offsetMinusOne;
        return n3 - n4;
    }

    public void write(byte by2) {
        int n3;
        byte[] byArray = this.buffer;
        int n4 = this.pos;
        this.pos = n3 = n4 + -1;
        byArray[n4] = by2;
    }

    public void write(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.remaining();
        int n4 = this.spaceLeft();
        if (n4 < n3) {
            this.nextBuffer(n3);
        }
        n4 = this.pos - n3;
        this.pos = n4++;
        byte[] byArray = this.buffer;
        byteBuffer.get(byArray, n4, n3);
    }

    public void write(byte[] byArray, int n3, int n4) {
        int n7 = this.spaceLeft();
        if (n7 < n4) {
            this.nextBuffer(n4);
        }
        n7 = this.pos - n4;
        this.pos = n7++;
        byte[] byArray2 = this.buffer;
        System.arraycopy(byArray, n3, byArray2, n7, n4);
    }

    public void writeBool(int n3, boolean bl2) {
        this.requireSpace(6);
        byte by2 = (byte)(bl2 ? 1 : 0);
        this.write(by2);
        this.writeTag(n3, 0);
    }

    public void writeBool(boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        this.write(by2);
    }

    public void writeBytes(int n3, ByteString serializable) {
        try {
            ((ByteString)serializable).writeToReverse(this);
            this.requireSpace(10);
            int n4 = ((ByteString)serializable).size();
            this.writeVarint32(n4);
            this.writeTag(n3, 2);
            return;
        }
        catch (IOException iOException) {
            serializable = new RuntimeException(iOException);
            throw serializable;
        }
    }

    public void writeEndGroup(int n3) {
        this.writeTag(n3, 4);
    }

    public void writeFixed32(int n3) {
        byte by2;
        int n4;
        int n7;
        byte[] byArray = this.buffer;
        int n8 = this.pos;
        this.pos = n7 = n8 + -1;
        byArray[n8] = n4 = (int)(n3 >> 24 & 0xFF);
        this.pos = n4 = n8 + -2;
        byArray[n7] = by2 = (byte)(n3 >> 16 & 0xFF);
        this.pos = n7 = n8 + -3;
        byArray[n4] = by2 = (byte)(n3 >> 8 & 0xFF);
        this.pos = n8 += -4;
        byArray[n7] = n3 = (int)((byte)(n3 & 0xFF));
    }

    public void writeFixed32(int n3, int n4) {
        this.requireSpace(9);
        this.writeFixed32(n4);
        this.writeTag(n3, 5);
    }

    public void writeFixed64(int n3, long l2) {
        this.requireSpace(13);
        this.writeFixed64(l2);
        this.writeTag(n3, 1);
    }

    public void writeFixed64(long l2) {
        byte by2;
        byte by4;
        int n3;
        int n4;
        int n7;
        byte[] byArray = this.buffer;
        int n8 = this.pos;
        this.pos = n7 = n8 + -1;
        byArray[n8] = n4 = (int)((int)(l2 >> 56) & 0xFF);
        this.pos = n4 = n8 + -2;
        byArray[n7] = n3 = (int)((int)(l2 >> 48) & 0xFF);
        this.pos = n7 = n8 + -3;
        byArray[n4] = n3 = (byte)((int)(l2 >> 40) & 0xFF);
        this.pos = n4 = n8 + -4;
        byArray[n7] = n3 = (byte)((int)(l2 >> 32) & 0xFF);
        this.pos = n7 = n8 + -5;
        byArray[n4] = n3 = (byte)((int)(l2 >> 24) & 0xFF);
        this.pos = n4 = n8 + -6;
        byArray[n7] = n3 = (byte)((int)(l2 >> 16) & 0xFF);
        this.pos = n7 = n8 + -7;
        n3 = 8;
        byArray[n4] = by4 = (byte)((int)(l2 >> n3) & 0xFF);
        this.pos = n8 -= n3;
        byArray[n7] = by2 = (byte)((int)l2 & 0xFF);
    }

    public void writeGroup(int n3, Object object) {
        this.writeTag(n3, 4);
        Protobuf.getInstance().writeTo(object, this);
        this.writeTag(n3, 3);
    }

    public void writeGroup(int n3, Object object, Schema schema) {
        this.writeTag(n3, 4);
        schema.writeTo(object, this);
        this.writeTag(n3, 3);
    }

    public void writeInt32(int n3) {
        if (n3 >= 0) {
            this.writeVarint32(n3);
        } else {
            long l2 = n3;
            this.writeVarint64(l2);
        }
    }

    public void writeInt32(int n3, int n4) {
        this.requireSpace(15);
        this.writeInt32(n4);
        this.writeTag(n3, 0);
    }

    public void writeLazy(ByteBuffer byteBuffer) {
        Object object;
        int n3 = byteBuffer.remaining();
        int n4 = this.spaceLeft();
        if (n4 < n3) {
            this.totalDoneBytes = n4 = this.totalDoneBytes + n3;
            ArrayDeque arrayDeque = this.buffers;
            object = AllocatedBuffer.wrap(byteBuffer);
            arrayDeque.addFirst(object);
            this.nextBuffer();
        }
        n4 = this.pos - n3;
        this.pos = n4++;
        object = this.buffer;
        byteBuffer.get((byte[])object, n4, n3);
    }

    public void writeLazy(byte[] object, int n3, int n4) {
        int n7 = this.spaceLeft();
        if (n7 < n4) {
            this.totalDoneBytes = n7 = this.totalDoneBytes + n4;
            ArrayDeque arrayDeque = this.buffers;
            object = AllocatedBuffer.wrap(object, n3, n4);
            arrayDeque.addFirst(object);
            this.nextBuffer();
            return;
        }
        n7 = this.pos - n4;
        this.pos = n7++;
        byte[] byArray = this.buffer;
        System.arraycopy(object, n3, byArray, n7, n4);
    }

    public void writeMessage(int n3, Object object) {
        int n4 = this.getTotalBytesWritten();
        Protobuf.getInstance().writeTo(object, this);
        int n7 = this.getTotalBytesWritten() - n4;
        this.requireSpace(10);
        this.writeVarint32(n7);
        this.writeTag(n3, 2);
    }

    public void writeMessage(int n3, Object object, Schema schema) {
        int n4 = this.getTotalBytesWritten();
        schema.writeTo(object, this);
        int n7 = this.getTotalBytesWritten() - n4;
        this.requireSpace(10);
        this.writeVarint32(n7);
        this.writeTag(n3, 2);
    }

    public void writeSInt32(int n3) {
        n3 = CodedOutputStream.encodeZigZag32(n3);
        this.writeVarint32(n3);
    }

    public void writeSInt32(int n3, int n4) {
        this.requireSpace(10);
        this.writeSInt32(n4);
        this.writeTag(n3, 0);
    }

    public void writeSInt64(int n3, long l2) {
        this.requireSpace(15);
        this.writeSInt64(l2);
        this.writeTag(n3, 0);
    }

    public void writeSInt64(long l2) {
        l2 = CodedOutputStream.encodeZigZag64(l2);
        this.writeVarint64(l2);
    }

    public void writeStartGroup(int n3) {
        this.writeTag(n3, 3);
    }

    public void writeString(int n3, String string2) {
        int n4 = this.getTotalBytesWritten();
        this.writeString(string2);
        int n7 = this.getTotalBytesWritten() - n4;
        this.requireSpace(10);
        this.writeVarint32(n7);
        this.writeTag(n3, 2);
    }

    /*
     * Unable to fully structure code
     */
    public void writeString(String var1_1) {
        var2_2 = var1_1.length();
        this.requireSpace(var2_2);
        var2_2 = var1_1.length() + -1;
        this.pos = var3_3 = this.pos - var2_2;
        while (true) {
            var3_3 = 128;
            if (var2_2 < 0 || (var4_4 = (int)var1_1.charAt(var2_2)) >= var3_3) break;
            var5_5 = this.buffer;
            var6_6 = this.pos + var2_2;
            var5_5[var6_6] = var4_4 = (int)((byte)var4_4);
            var2_2 += -1;
        }
        var4_4 = -1;
        if (var2_2 == var4_4) {
            this.pos = var7_7 = this.pos + -1;
            return;
        }
        this.pos = var6_6 = this.pos + var2_2;
        while (var2_2 >= 0) {
            block6: {
                block8: {
                    block7: {
                        block5: {
                            var6_6 = var1_1.charAt(var2_2);
                            if (var6_6 >= var3_3 || (var8_8 = this.pos) <= (var9_9 = this.offsetMinusOne)) break block5;
                            var10_10 = this.buffer;
                            this.pos = var11_11 = var8_8 + -1;
                            var10_10[var8_8] = var6_6 = (int)((byte)var6_6);
                            break block6;
                        }
                        var8_8 = 2048;
                        if (var6_6 >= var8_8 || (var8_8 = this.pos) <= (var9_9 = this.offset)) break block7;
                        var10_10 = this.buffer;
                        this.pos = var11_11 = var8_8 + -1;
                        var10_10[var8_8] = var12_12 = (int)(var6_6 & 63 | var3_3);
                        this.pos = var8_8 += -2;
                        var10_10[var11_11] = var6_6 = (int)((byte)(var6_6 >>> 6 | 960));
                        break block6;
                    }
                    var8_8 = 55296;
                    if (var6_6 >= var8_8 && (var8_8 = 57343) >= var6_6 || (var8_8 = this.pos) <= (var9_9 = this.offset + 1)) break block8;
                    var10_10 = this.buffer;
                    this.pos = var11_11 = var8_8 + -1;
                    var10_10[var8_8] = var12_12 = (byte)(var6_6 & 63 | var3_3);
                    this.pos = var12_12 = var8_8 + -2;
                    var10_10[var11_11] = var13_13 = (byte)(var6_6 >>> 6 & 63 | var3_3);
                    this.pos = var8_8 += -3;
                    var10_10[var12_12] = var6_6 = (int)((byte)(var6_6 >>> 12 | 480));
                    break block6;
                }
                var8_8 = this.pos;
                var9_9 = this.offset + 2;
                if (var8_8 <= var9_9) ** GOTO lbl69
                if (var2_2 == 0) ** GOTO lbl-1000
                var8_8 = var2_2 + -1;
                var9_9 = (int)Character.isSurrogatePair((char)(var8_8 = (int)var1_1.charAt(var8_8)), (char)var6_6);
                if (var9_9 != 0) {
                    var2_2 += -1;
                    var6_6 = Character.toCodePoint((char)var8_8, (char)var6_6);
                    var14_14 = this.buffer;
                    var9_9 = this.pos;
                    this.pos = var11_11 = var9_9 + -1;
                    var14_14[var9_9] = var12_12 = (int)((byte)(var6_6 & 63 | var3_3));
                    this.pos = var12_12 = var9_9 + -2;
                    var14_14[var11_11] = var13_13 = (byte)(var6_6 >>> 6 & 63 | var3_3);
                    this.pos = var11_11 = var9_9 + -3;
                    var14_14[var12_12] = var13_13 = (byte)(var6_6 >>> 12 & 63 | var3_3);
                    this.pos = var9_9 += -4;
                    var14_14[var11_11] = var6_6 = (int)((byte)(var6_6 >>> 18 | 240));
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = var2_2 + -1;
                    var1_1 = new Utf8$UnpairedSurrogateException(var3_3, var2_2);
                    throw var1_1;
lbl69:
                    // 1 sources

                    this.requireSpace(var2_2);
                    ++var2_2;
                }
            }
            var2_2 += var4_4;
        }
    }

    public void writeTag(int n3, int n4) {
        n3 = WireFormat.makeTag(n3, n4);
        this.writeVarint32(n3);
    }

    public void writeUInt32(int n3, int n4) {
        this.requireSpace(10);
        this.writeVarint32(n4);
        this.writeTag(n3, 0);
    }

    public void writeUInt64(int n3, long l2) {
        this.requireSpace(15);
        this.writeVarint64(l2);
        this.writeTag(n3, 0);
    }

    public void writeVarint32(int n3) {
        int n4 = n3 & 0xFFFFFF80;
        if (n4 == 0) {
            this.writeVarint32OneByte(n3);
        } else {
            n4 = n3 & 0xFFFFC000;
            if (n4 == 0) {
                this.writeVarint32TwoBytes(n3);
            } else {
                n4 = 0xFFE00000 & n3;
                if (n4 == 0) {
                    this.writeVarint32ThreeBytes(n3);
                } else {
                    n4 = 0xF0000000 & n3;
                    if (n4 == 0) {
                        this.writeVarint32FourBytes(n3);
                    } else {
                        this.writeVarint32FiveBytes(n3);
                    }
                }
            }
        }
    }

    public void writeVarint64(long l2) {
        byte by2 = BinaryWriter.access$200(l2);
        switch (by2) {
            default: {
                break;
            }
            case 10: {
                this.writeVarint64TenBytes(l2);
                break;
            }
            case 9: {
                this.writeVarint64NineBytes(l2);
                break;
            }
            case 8: {
                this.writeVarint64EightBytes(l2);
                break;
            }
            case 7: {
                this.writeVarint64SevenBytes(l2);
                break;
            }
            case 6: {
                this.writeVarint64SixBytes(l2);
                break;
            }
            case 5: {
                this.writeVarint64FiveBytes(l2);
                break;
            }
            case 4: {
                this.writeVarint64FourBytes(l2);
                break;
            }
            case 3: {
                this.writeVarint64ThreeBytes(l2);
                break;
            }
            case 2: {
                this.writeVarint64TwoBytes(l2);
                break;
            }
            case 1: {
                this.writeVarint64OneByte(l2);
            }
        }
    }
}

