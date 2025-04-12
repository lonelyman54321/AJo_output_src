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
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

final class BinaryWriter$UnsafeHeapWriter
extends BinaryWriter {
    private AllocatedBuffer allocatedBuffer;
    private byte[] buffer;
    private long limit;
    private long limitMinusOne;
    private long offset;
    private long offsetMinusOne;
    private long pos;

    public BinaryWriter$UnsafeHeapWriter(BufferAllocator bufferAllocator, int n3) {
        super(bufferAllocator, n3, null);
        this.nextBuffer();
    }

    private int arrayPos() {
        return (int)this.pos;
    }

    public static boolean isSupported() {
        return UnsafeUtil.hasUnsafeArrayOperations();
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
        boolean bl2 = ((AllocatedBuffer)object).hasArray();
        if (bl2) {
            long l2;
            this.finishCurrentBuffer();
            this.buffers.addFirst(object);
            this.allocatedBuffer = object;
            byte[] byArray = ((AllocatedBuffer)object).array();
            this.buffer = byArray;
            long l3 = ((AllocatedBuffer)object).arrayOffset();
            this.limit = l2 = (long)((AllocatedBuffer)object).limit() + l3;
            l2 = ((AllocatedBuffer)object).position();
            this.offset = l3 += l2;
            l2 = 1L;
            this.offsetMinusOne = l3 -= l2;
            this.limitMinusOne = l3 = this.limit - l2;
            this.pos = l3;
            return;
        }
        object = new RuntimeException("Allocator returned non-heap buffer");
        throw object;
    }

    private void writeVarint32FiveBytes(int n3) {
        long l2;
        byte[] byArray = this.buffer;
        long l3 = this.pos;
        long l4 = 1L;
        this.pos = l2 = l3 - l4;
        byte by2 = (byte)(n3 >>> 28);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >>> 21 & 0x7F | 0x80);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >>> 14 & 0x7F | 0x80);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >>> 7 & 0x7F | 0x80);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l4 = l3 - l4;
        n3 = (byte)(n3 & 0x7F | 0x80);
        UnsafeUtil.putByte(byArray, l3, (byte)n3);
    }

    private void writeVarint32FourBytes(int n3) {
        long l2;
        byte[] byArray = this.buffer;
        long l3 = this.pos;
        long l4 = 1L;
        this.pos = l2 = l3 - l4;
        byte by2 = (byte)(n3 >>> 21);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >>> 14 & 0x7F | 0x80);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >>> 7 & 0x7F | 0x80);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l4 = l3 - l4;
        n3 = (byte)(n3 & 0x7F | 0x80);
        UnsafeUtil.putByte(byArray, l3, (byte)n3);
    }

    private void writeVarint32OneByte(int n3) {
        long l2;
        byte[] byArray = this.buffer;
        long l3 = this.pos;
        this.pos = l2 = l3 - 1L;
        n3 = (byte)n3;
        UnsafeUtil.putByte(byArray, l3, (byte)n3);
    }

    private void writeVarint32ThreeBytes(int n3) {
        long l2;
        byte[] byArray = this.buffer;
        long l3 = this.pos;
        long l4 = 1L;
        this.pos = l2 = l3 - l4;
        byte by2 = (byte)(n3 >>> 14);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >>> 7 & 0x7F | 0x80);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l4 = l3 - l4;
        n3 = (byte)(n3 & 0x7F | 0x80);
        UnsafeUtil.putByte(byArray, l3, (byte)n3);
    }

    private void writeVarint32TwoBytes(int n3) {
        long l2;
        byte[] byArray = this.buffer;
        long l3 = this.pos;
        long l4 = 1L;
        this.pos = l2 = l3 - l4;
        byte by2 = (byte)(n3 >>> 7);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l4 = l3 - l4;
        n3 = (byte)(n3 & 0x7F | 0x80);
        UnsafeUtil.putByte(byArray, l3, (byte)n3);
    }

    private void writeVarint64EightBytes(long l2) {
        long l3;
        byte[] byArray = this.buffer;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 49);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 42;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 35 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 28 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 21 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 14 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by4);
    }

    private void writeVarint64FiveBytes(long l2) {
        long l3;
        byte[] byArray = this.buffer;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 28);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 21;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 14 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by4);
    }

    private void writeVarint64FourBytes(long l2) {
        long l3;
        byte[] byArray = this.buffer;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 21);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 14;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by4);
    }

    private void writeVarint64NineBytes(long l2) {
        long l3;
        byte[] byArray = this.buffer;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 56);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 49;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 42 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 35 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 28 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 21 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 14 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by4);
    }

    private void writeVarint64OneByte(long l2) {
        long l3;
        byte[] byArray = this.buffer;
        long l4 = this.pos;
        this.pos = l3 = l4 - 1L;
        byte by2 = (byte)l2;
        UnsafeUtil.putByte(byArray, l4, by2);
    }

    private void writeVarint64SevenBytes(long l2) {
        long l3;
        byte[] byArray = this.buffer;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 42);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 35;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 28 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 21 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 14 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by4);
    }

    private void writeVarint64SixBytes(long l2) {
        long l3;
        byte[] byArray = this.buffer;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 35);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 28;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 21 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 14 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by4);
    }

    private void writeVarint64TenBytes(long l2) {
        long l3;
        byte[] byArray = this.buffer;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 63);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 56;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 49 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 42 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 35 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 28 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 21 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 14 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)(l2 >>> 7 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by4);
    }

    private void writeVarint64ThreeBytes(long l2) {
        long l3;
        byte[] byArray = this.buffer;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)((int)l2 >>> 14);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        l3 = l2 >>> 7;
        long l8 = 127;
        long l12 = 128L;
        by2 = (byte)((l3 &= l8) | l12);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)(l2 & l8 | l12);
        UnsafeUtil.putByte(byArray, l4, by4);
    }

    private void writeVarint64TwoBytes(long l2) {
        long l3;
        byte[] byArray = this.buffer;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)(l2 >>> 7);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)((int)l2 & 0x7F | 0x80);
        UnsafeUtil.putByte(byArray, l4, by4);
    }

    public int bytesWrittenToCurrentBuffer() {
        long l2 = this.limitMinusOne;
        long l3 = this.pos;
        return (int)(l2 - l3);
    }

    public void finishCurrentBuffer() {
        AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
        if (allocatedBuffer != null) {
            long l2;
            int n3 = this.totalDoneBytes;
            int n4 = this.bytesWrittenToCurrentBuffer();
            this.totalDoneBytes = n3 += n4;
            allocatedBuffer = this.allocatedBuffer;
            n4 = this.arrayPos();
            AllocatedBuffer allocatedBuffer2 = this.allocatedBuffer;
            int n7 = allocatedBuffer2.arrayOffset();
            n4 = n4 - n7 + 1;
            allocatedBuffer.position(n4);
            n3 = 0;
            allocatedBuffer = null;
            this.allocatedBuffer = null;
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

    public int spaceLeft() {
        long l2 = this.pos;
        long l3 = this.offsetMinusOne;
        return (int)(l2 - l3);
    }

    public void write(byte by2) {
        long l2;
        byte[] byArray = this.buffer;
        long l3 = this.pos;
        this.pos = l2 = l3 - 1L;
        UnsafeUtil.putByte(byArray, l3, by2);
    }

    public void write(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.remaining();
        this.requireSpace(n3);
        long l2 = this.pos;
        long l3 = n3;
        this.pos = l2 -= l3;
        byte[] byArray = this.buffer;
        int n4 = this.arrayPos() + 1;
        byteBuffer.get(byArray, n4, n3);
    }

    public void write(byte[] object, int n3, int n4) {
        int n7;
        int n8;
        int n10 = 1;
        if (n3 >= 0 && (n8 = n3 + n4) <= (n7 = ((byte[])object).length)) {
            this.requireSpace(n4);
            long l2 = this.pos;
            long l3 = n4;
            this.pos = l2 -= l3;
            byte[] byArray = this.buffer;
            n7 = this.arrayPos() + n10;
            System.arraycopy(object, n3, byArray, n7, n4);
            return;
        }
        object = ((byte[])object).length;
        Integer n14 = n3;
        Integer n15 = n4;
        Object[] objectArray = new Object[3];
        objectArray[0] = object;
        objectArray[n10] = n14;
        objectArray[2] = n15;
        object = String.format("value.length=%d, offset=%d, length=%d", objectArray);
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException((String)object);
        throw arrayIndexOutOfBoundsException;
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
        byte[] byArray = this.buffer;
        long l3 = this.pos;
        long l4 = 1L;
        this.pos = l2 = l3 - l4;
        byte by2 = (byte)(n3 >> 24 & 0xFF);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >> 16 & 0xFF);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l2 = l3 - l4;
        by2 = (byte)(n3 >> 8 & 0xFF);
        UnsafeUtil.putByte(byArray, l3, by2);
        byArray = this.buffer;
        l3 = this.pos;
        this.pos = l4 = l3 - l4;
        n3 = (byte)(n3 & 0xFF);
        UnsafeUtil.putByte(byArray, l3, (byte)n3);
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
        byte[] byArray = this.buffer;
        long l4 = this.pos;
        long l7 = 1L;
        this.pos = l3 = l4 - l7;
        byte by2 = (byte)((int)(l2 >> 56) & 0xFF);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)((int)(l2 >> 48) & 0xFF);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)((int)(l2 >> 40) & 0xFF);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)((int)(l2 >> 32) & 0xFF);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)((int)(l2 >> 24) & 0xFF);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)((int)(l2 >> 16) & 0xFF);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l3 = l4 - l7;
        by2 = (byte)((int)(l2 >> 8) & 0xFF);
        UnsafeUtil.putByte(byArray, l4, by2);
        byArray = this.buffer;
        l4 = this.pos;
        this.pos = l7 = l4 - l7;
        byte by4 = (byte)((int)l2 & 0xFF);
        UnsafeUtil.putByte(byArray, l4, by4);
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
            object = this.buffers;
            AllocatedBuffer allocatedBuffer = AllocatedBuffer.wrap(byteBuffer);
            ((ArrayDeque)object).addFirst(allocatedBuffer);
            this.nextBuffer();
        }
        long l2 = this.pos;
        long l3 = n3;
        this.pos = l2 -= l3;
        object = this.buffer;
        int n7 = this.arrayPos() + 1;
        byteBuffer.get((byte[])object, n7, n3);
    }

    public void writeLazy(byte[] object, int n3, int n4) {
        int n7;
        int n8;
        int n10 = 1;
        if (n3 >= 0 && (n8 = n3 + n4) <= (n7 = ((byte[])object).length)) {
            n8 = this.spaceLeft();
            if (n8 < n4) {
                this.totalDoneBytes = n10 = this.totalDoneBytes + n4;
                ArrayDeque arrayDeque = this.buffers;
                object = AllocatedBuffer.wrap(object, n3, n4);
                arrayDeque.addFirst(object);
                this.nextBuffer();
                return;
            }
            long l2 = this.pos;
            long l3 = n4;
            this.pos = l2 -= l3;
            byte[] byArray = this.buffer;
            n7 = this.arrayPos() + n10;
            System.arraycopy(object, n3, byArray, n7, n4);
            return;
        }
        object = ((byte[])object).length;
        Integer n14 = n3;
        Integer n15 = n4;
        Object[] objectArray = new Object[3];
        objectArray[0] = object;
        objectArray[n10] = n14;
        objectArray[2] = n15;
        object = String.format("value.length=%d, offset=%d, length=%d", objectArray);
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException((String)object);
        throw arrayIndexOutOfBoundsException;
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
            var7_6 = this.buffer;
            var8_7 = this.pos;
            this.pos = var4_4 = var8_7 - var4_4;
            var10_8 = (byte)var6_5;
            UnsafeUtil.putByte(var7_6, var8_7, var10_8);
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
                            var11_9 = var1_1.charAt(var2_2);
                            if (var11_9 >= var3_3 || (var16_12 /* !! */  = (cfr_temp_0 = (var12_10 = this.pos) - (var14_11 = this.offsetMinusOne)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) <= 0) break block5;
                            var17_13 = this.buffer;
                            this.pos = var18_14 = var12_10 - var4_4;
                            var11_9 = var11_9;
                            UnsafeUtil.putByte(var17_13, var12_10, var11_9);
                            break block6;
                        }
                        var20_15 = 2048;
                        if (var11_9 >= var20_15 || (var16_12 /* !! */  = (cfr_temp_1 = (var12_10 = this.pos) - (var14_11 = this.offset)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) <= 0) break block7;
                        var17_13 = this.buffer;
                        this.pos = var18_14 = var12_10 - var4_4;
                        var21_16 = (byte)(var11_9 & 63 | var3_3);
                        UnsafeUtil.putByte(var17_13, var12_10, var21_16);
                        var22_17 = this.buffer;
                        var23_18 = this.pos;
                        this.pos = var18_14 = var23_18 - var4_4;
                        var11_9 = (byte)(var11_9 >>> 6 | 960);
                        UnsafeUtil.putByte(var22_17, var23_18, var11_9);
                        break block6;
                    }
                    var20_15 = 55296;
                    if (var11_9 >= var20_15 && (var20_15 = 57343) >= var11_9 || (var16_12 /* !! */  = (cfr_temp_2 = (var12_10 = this.pos) - (var14_11 = this.offset + var4_4)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) <= 0) break block8;
                    var17_13 = this.buffer;
                    this.pos = var18_14 = var12_10 - var4_4;
                    var21_16 = (byte)(var11_9 & 63 | var3_3);
                    UnsafeUtil.putByte(var17_13, var12_10, var21_16);
                    var22_17 = this.buffer;
                    var23_18 = this.pos;
                    this.pos = var18_14 = var23_18 - var4_4;
                    var21_16 = (byte)(var11_9 >>> 6 & 63 | var3_3);
                    UnsafeUtil.putByte(var22_17, var23_18, var21_16);
                    var22_17 = this.buffer;
                    var23_18 = this.pos;
                    this.pos = var18_14 = var23_18 - var4_4;
                    var11_9 = (byte)(var11_9 >>> 12 | 480);
                    UnsafeUtil.putByte(var22_17, var23_18, var11_9);
                    break block6;
                }
                var12_10 = this.pos;
                var14_11 = this.offset;
                var25_19 = 2;
                cfr_temp_3 = var12_10 - (var14_11 += var25_19);
                var16_12 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                if (var16_12 /* !! */  <= 0) ** GOTO lbl94
                if (var2_2 == 0) ** GOTO lbl-1000
                var20_15 = var2_2 + -1;
                var27_20 = Character.isSurrogatePair((char)(var20_15 = (byte)var1_1.charAt(var20_15)), (char)var11_9);
                if (var27_20) {
                    var2_2 += -1;
                    var11_9 = Character.toCodePoint((char)var20_15, (char)var11_9);
                    var22_17 = this.buffer;
                    var23_18 = this.pos;
                    this.pos = var18_14 = var23_18 - var4_4;
                    var21_16 = (byte)(var11_9 & 63 | var3_3);
                    UnsafeUtil.putByte(var22_17, var23_18, var21_16);
                    var22_17 = this.buffer;
                    var23_18 = this.pos;
                    this.pos = var18_14 = var23_18 - var4_4;
                    var21_16 = (byte)(var11_9 >>> 6 & 63 | var3_3);
                    UnsafeUtil.putByte(var22_17, var23_18, var21_16);
                    var22_17 = this.buffer;
                    var23_18 = this.pos;
                    this.pos = var18_14 = var23_18 - var4_4;
                    var21_16 = (byte)(var11_9 >>> 12 & 63 | var3_3);
                    UnsafeUtil.putByte(var22_17, var23_18, var21_16);
                    var22_17 = this.buffer;
                    var23_18 = this.pos;
                    this.pos = var18_14 = var23_18 - var4_4;
                    var11_9 = (byte)(var11_9 >>> 18 | 240);
                    UnsafeUtil.putByte(var22_17, var23_18, var11_9);
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = var2_2 + -1;
                    var1_1 = new Utf8$UnpairedSurrogateException(var3_3, var2_2);
                    throw var1_1;
lbl94:
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

