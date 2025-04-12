/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AllocatedBuffer;
import com.google.protobuf.BinaryWriter;
import com.google.protobuf.BufferAllocator;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Java8Compatibility;
import com.google.protobuf.Protobuf;
import com.google.protobuf.Schema;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

final class BinaryWriter$UnsafeDirectWriter
extends BinaryWriter {
    private ByteBuffer buffer;
    private long bufferOffset;
    private long limitMinusOne;
    private long pos;

    public BinaryWriter$UnsafeDirectWriter(BufferAllocator bufferAllocator, int n3) {
        super(bufferAllocator, n3, null);
        this.nextBuffer();
    }

    public static /* synthetic */ boolean access$000() {
        return BinaryWriter$UnsafeDirectWriter.isSupported();
    }

    private int bufferPos() {
        long l2 = this.pos;
        long l3 = this.bufferOffset;
        return (int)(l2 - l3);
    }

    private int bytesWrittenToCurrentBuffer() {
        long l2 = this.limitMinusOne;
        long l3 = this.pos;
        return (int)(l2 - l3);
    }

    private static boolean isSupported() {
        return UnsafeUtil.hasUnsafeByteBufferOperations();
    }

    private void nextBuffer() {
        AllocatedBuffer allocatedBuffer = this.newDirectBuffer();
        this.nextBuffer(allocatedBuffer);
    }

    private void nextBuffer(int n3) {
        AllocatedBuffer allocatedBuffer = this.newDirectBuffer(n3);
        this.nextBuffer(allocatedBuffer);
    }

    private void nextBuffer(AllocatedBuffer object) {
        boolean bl2 = ((AllocatedBuffer)object).hasNioBuffer();
        if (bl2) {
            ByteBuffer byteBuffer = ((AllocatedBuffer)object).nioBuffer();
            boolean bl3 = byteBuffer.isDirect();
            if (bl3) {
                long l2;
                this.finishCurrentBuffer();
                this.buffers.addFirst(object);
                this.buffer = byteBuffer;
                int n3 = byteBuffer.capacity();
                Java8Compatibility.limit(byteBuffer, n3);
                Java8Compatibility.position(this.buffer, 0);
                this.bufferOffset = l2 = UnsafeUtil.addressOffset(this.buffer);
                long l3 = this.buffer.limit() + -1;
                this.limitMinusOne = l2 += l3;
                this.pos = l2;
                return;
            }
            object = new RuntimeException("Allocator returned non-direct buffer");
            throw object;
        }
        object = new RuntimeException("Allocated buffer does not have NIO buffer");
        throw object;
    }

    private int spaceLeft() {
        return this.bufferPos() + 1;
    }

    private void writeVarint32FiveBytes(int n3) {
        long l2;
        long l3 = this.pos;
        long l4 = 1L;
        this.pos = l2 = l3 - l4;
        byte by2 = (byte)(n3 >>> 28);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >>> 21 & 0x7F | 0x80);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >>> 14 & 0x7F | 0x80);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >>> 7 & 0x7F | 0x80);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l4 = l3 - l4;
        n3 = (byte)(n3 & 0x7F | 0x80);
        UnsafeUtil.putByte(l3, (byte)n3);
    }

    private void writeVarint32FourBytes(int n3) {
        long l2;
        long l3 = this.pos;
        long l4 = 1L;
        this.pos = l2 = l3 - l4;
        byte by2 = (byte)(n3 >>> 21);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >>> 14 & 0x7F | 0x80);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >>> 7 & 0x7F | 0x80);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l4 = l3 - l4;
        n3 = (byte)(n3 & 0x7F | 0x80);
        UnsafeUtil.putByte(l3, (byte)n3);
    }

    private void writeVarint32OneByte(int n3) {
        long l2;
        long l3 = this.pos;
        this.pos = l2 = l3 - 1L;
        n3 = (byte)n3;
        UnsafeUtil.putByte(l3, (byte)n3);
    }

    private void writeVarint32ThreeBytes(int n3) {
        long l2;
        long l3 = this.pos;
        long l4 = 1L;
        this.pos = l2 = l3 - l4;
        byte by2 = (byte)(n3 >>> 14);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >>> 7 & 0x7F | 0x80);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l4 = l3 - l4;
        n3 = (byte)(n3 & 0x7F | 0x80);
        UnsafeUtil.putByte(l3, (byte)n3);
    }

    private void writeVarint32TwoBytes(int n3) {
        long l2;
        long l3 = this.pos;
        long l4 = 1L;
        this.pos = l2 = l3 - l4;
        byte by2 = (byte)(n3 >>> 7);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l4 = l3 - l4;
        n3 = (byte)(n3 & 0x7F | 0x80);
        UnsafeUtil.putByte(l3, (byte)n3);
    }

    private void writeVarint64EightBytes(long l2) {
        long l3;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 49);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 42;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 35 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 28 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 21 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 14 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(l4, by4);
    }

    private void writeVarint64FiveBytes(long l2) {
        long l3;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 28);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 21;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 14 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(l4, by4);
    }

    private void writeVarint64FourBytes(long l2) {
        long l3;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 21);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 14;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(l4, by4);
    }

    private void writeVarint64NineBytes(long l2) {
        long l3;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 56);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 49;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 42 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 35 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 28 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 21 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 14 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(l4, by4);
    }

    private void writeVarint64OneByte(long l2) {
        long l3;
        long l4 = this.pos;
        this.pos = l3 = l4 - 1L;
        byte by2 = (byte)l2;
        UnsafeUtil.putByte(l4, by2);
    }

    private void writeVarint64SevenBytes(long l2) {
        long l3;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 42);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 35;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 28 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 21 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 14 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(l4, by4);
    }

    private void writeVarint64SixBytes(long l2) {
        long l3;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 35);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 28;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 21 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 14 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(l4, by4);
    }

    private void writeVarint64TenBytes(long l2) {
        long l3;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 63);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 56;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 49 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 42 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 35 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 28 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 21 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 14 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(l4, by4);
    }

    private void writeVarint64ThreeBytes(long l2) {
        long l3;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)((int)l2 >>> 14);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 7;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(l4, by4);
    }

    private void writeVarint64TwoBytes(long l2) {
        long l3;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 7);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)((int)l2 & 0x7F | 0x80);
        UnsafeUtil.putByte(l4, by4);
    }

    public void finishCurrentBuffer() {
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null) {
            long l2;
            int n3 = this.totalDoneBytes;
            int n4 = this.bytesWrittenToCurrentBuffer();
            this.totalDoneBytes = n3 += n4;
            byteBuffer = this.buffer;
            n4 = this.bufferPos() + 1;
            Java8Compatibility.position(byteBuffer, n4);
            n3 = 0;
            byteBuffer = null;
            this.buffer = null;
            this.pos = l2 = 0L;
            this.limitMinusOne = l2;
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

    public void write(byte by2) {
        long l2;
        long l3 = this.pos;
        this.pos = l2 = l3 - 1L;
        UnsafeUtil.putByte(l3, by2);
    }

    public void write(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.remaining();
        int n4 = this.spaceLeft();
        if (n4 < n3) {
            this.nextBuffer(n3);
        }
        long l2 = this.pos;
        long l3 = n3;
        this.pos = l2 -= l3;
        ByteBuffer byteBuffer2 = this.buffer;
        n4 = this.bufferPos() + 1;
        Java8Compatibility.position(byteBuffer2, n4);
        this.buffer.put(byteBuffer);
    }

    public void write(byte[] byArray, int n3, int n4) {
        int n7 = this.spaceLeft();
        if (n7 < n4) {
            this.nextBuffer(n4);
        }
        long l2 = this.pos;
        long l3 = n4;
        this.pos = l2 -= l3;
        ByteBuffer byteBuffer = this.buffer;
        int n8 = this.bufferPos() + 1;
        Java8Compatibility.position(byteBuffer, n8);
        this.buffer.put(byArray, n3, n4);
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
        long l2;
        long l3 = this.pos;
        long l4 = 1L;
        this.pos = l2 = l3 - l4;
        byte by2 = (byte)(n3 >> 24 & 0xFF);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >> 16 & 0xFF);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >> 8 & 0xFF);
        UnsafeUtil.putByte(l3, by2);
        l3 = this.pos;
        this.pos = l4 = l3 - l4;
        n3 = (byte)(n3 & 0xFF);
        UnsafeUtil.putByte(l3, (byte)n3);
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
        long l3;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)((int)(l2 >> 56) & 0xFF);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)((int)(l2 >> 48) & 0xFF);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)((int)(l2 >> 40) & 0xFF);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)((int)(l2 >> 32) & 0xFF);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)((int)(l2 >> 24) & 0xFF);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)((int)(l2 >> 16) & 0xFF);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)((int)(l2 >> 8) & 0xFF);
        UnsafeUtil.putByte(l4, by2);
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)((int)l2 & 0xFF);
        UnsafeUtil.putByte(l4, by4);
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

    public void writeLazy(ByteBuffer object) {
        int n3 = ((Buffer)object).remaining();
        int n4 = this.spaceLeft();
        if (n4 < n3) {
            this.totalDoneBytes = n4 = this.totalDoneBytes + n3;
            ArrayDeque arrayDeque = this.buffers;
            object = AllocatedBuffer.wrap((ByteBuffer)object);
            arrayDeque.addFirst(object);
            this.nextBuffer();
            return;
        }
        long l2 = this.pos;
        long l3 = n3;
        this.pos = l2 -= l3;
        ByteBuffer byteBuffer = this.buffer;
        n4 = this.bufferPos() + 1;
        Java8Compatibility.position(byteBuffer, n4);
        this.buffer.put((ByteBuffer)object);
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
        long l2 = this.pos;
        long l3 = n4;
        this.pos = l2 -= l3;
        ByteBuffer byteBuffer = this.buffer;
        int n8 = this.bufferPos() + 1;
        Java8Compatibility.position(byteBuffer, n8);
        this.buffer.put((byte[])object, n3, n4);
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
     * Could not resolve type clashes
     */
    public void writeString(String var1_1) {
        var2_2 = var1_1.length();
        this.requireSpace(var2_2);
        var2_2 = var1_1.length() + -1;
        while (true) {
            var3_3 = 128;
            var4_4 = 1L;
            if (var2_2 < 0 || (var6_5 = (int)var1_1.charAt(var2_2)) >= var3_3) break;
            var7_6 = this.pos;
            this.pos = var9_7 = var7_6 - var4_4;
            var3_3 = (byte)var6_5;
            UnsafeUtil.putByte(var7_6, (byte)var3_3);
            var2_2 += -1;
        }
        var6_5 = -1;
        if (var2_2 == var6_5) {
            return;
        }
        while (var2_2 >= 0) {
            block6: {
                block8: {
                    block7: {
                        block5: {
                            var11_8 = var1_1.charAt(var2_2);
                            if (var11_8 >= var3_3 || (var16_11 /* !! */  = (cfr_temp_0 = (var12_9 = this.pos) - (var14_10 = this.bufferOffset)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) < 0) break block5;
                            this.pos = var14_10 = var12_9 - var4_4;
                            var11_8 = var11_8;
                            UnsafeUtil.putByte(var12_9, var11_8);
                            break block6;
                        }
                        var17_12 = 2048;
                        if (var11_8 >= var17_12 || (var16_11 /* !! */  = (cfr_temp_1 = (var12_9 = this.pos) - (var14_10 = this.bufferOffset)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) <= 0) break block7;
                        this.pos = var14_10 = var12_9 - var4_4;
                        var18_13 = (byte)(var11_8 & 63 | var3_3);
                        UnsafeUtil.putByte(var12_9, var18_13);
                        var12_9 = this.pos;
                        this.pos = var14_10 = var12_9 - var4_4;
                        var11_8 = (byte)(var11_8 >>> 6 | 960);
                        UnsafeUtil.putByte(var12_9, var11_8);
                        break block6;
                    }
                    var17_12 = 55296;
                    if (var11_8 >= var17_12 && (var17_12 = 57343) >= var11_8 || (var16_11 /* !! */  = (cfr_temp_2 = (var12_9 = this.pos) - (var14_10 = this.bufferOffset + var4_4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) <= 0) break block8;
                    this.pos = var14_10 = var12_9 - var4_4;
                    var18_13 = (byte)(var11_8 & 63 | var3_3);
                    UnsafeUtil.putByte(var12_9, var18_13);
                    var12_9 = this.pos;
                    this.pos = var14_10 = var12_9 - var4_4;
                    var18_13 = (byte)(var11_8 >>> 6 & 63 | var3_3);
                    UnsafeUtil.putByte(var12_9, var18_13);
                    var12_9 = this.pos;
                    this.pos = var14_10 = var12_9 - var4_4;
                    var11_8 = (byte)(var11_8 >>> 12 | 480);
                    UnsafeUtil.putByte(var12_9, var11_8);
                    break block6;
                }
                var12_9 = this.pos;
                var14_10 = this.bufferOffset;
                var19_14 = 2;
                cfr_temp_3 = var12_9 - (var14_10 += var19_14);
                var16_11 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                if (var16_11 /* !! */  <= 0) ** GOTO lbl83
                if (var2_2 == 0) ** GOTO lbl-1000
                var17_12 = var2_2 + -1;
                var21_15 = Character.isSurrogatePair((char)(var17_12 = (byte)var1_1.charAt(var17_12)), (char)var11_8);
                if (var21_15) {
                    var2_2 += -1;
                    var11_8 = Character.toCodePoint((char)var17_12, (char)var11_8);
                    var12_9 = this.pos;
                    this.pos = var14_10 = var12_9 - var4_4;
                    var18_13 = (byte)(var11_8 & 63 | var3_3);
                    UnsafeUtil.putByte(var12_9, var18_13);
                    var12_9 = this.pos;
                    this.pos = var14_10 = var12_9 - var4_4;
                    var18_13 = (byte)(var11_8 >>> 6 & 63 | var3_3);
                    UnsafeUtil.putByte(var12_9, var18_13);
                    var12_9 = this.pos;
                    this.pos = var14_10 = var12_9 - var4_4;
                    var18_13 = (byte)(var11_8 >>> 12 & 63 | var3_3);
                    UnsafeUtil.putByte(var12_9, var18_13);
                    var12_9 = this.pos;
                    this.pos = var14_10 = var12_9 - var4_4;
                    var11_8 = (byte)(var11_8 >>> 18 | 240);
                    UnsafeUtil.putByte(var12_9, var11_8);
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = var2_2 + -1;
                    var1_1 = new Utf8$UnpairedSurrogateException(var3_3, var2_2);
                    throw var1_1;
lbl83:
                    // 1 sources

                    this.requireSpace(var2_2);
                    ++var2_2;
                }
            }
            var2_2 += var6_5;
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

