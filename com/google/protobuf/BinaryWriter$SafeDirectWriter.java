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
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;

final class BinaryWriter$SafeDirectWriter
extends BinaryWriter {
    private ByteBuffer buffer;
    private int limitMinusOne;
    private int pos;

    public BinaryWriter$SafeDirectWriter(BufferAllocator bufferAllocator, int n3) {
        super(bufferAllocator, n3, null);
        this.nextBuffer();
    }

    private int bytesWrittenToCurrentBuffer() {
        int n3 = this.limitMinusOne;
        int n4 = this.pos;
        return n3 - n4;
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
            Object object2 = ((AllocatedBuffer)object).nioBuffer();
            boolean bl3 = ((ByteBuffer)object2).isDirect();
            if (bl3) {
                this.finishCurrentBuffer();
                this.buffers.addFirst(object);
                this.buffer = object2;
                int n3 = ((Buffer)object2).capacity();
                Java8Compatibility.limit((Buffer)object2, n3);
                Java8Compatibility.position(this.buffer, 0);
                object = this.buffer;
                object2 = ByteOrder.LITTLE_ENDIAN;
                ((ByteBuffer)object).order((ByteOrder)object2);
                this.limitMinusOne = n3 = this.buffer.limit() + -1;
                this.pos = n3;
                return;
            }
            object = new RuntimeException("Allocator returned non-direct buffer");
            throw object;
        }
        object = new RuntimeException("Allocated buffer does not have NIO buffer");
        throw object;
    }

    private int spaceLeft() {
        return this.pos + 1;
    }

    private void writeVarint32FiveBytes(int n3) {
        int n4;
        ByteBuffer byteBuffer = this.buffer;
        int n7 = this.pos;
        this.pos = n4 = n7 + -1;
        n4 = (byte)(n3 >>> 28);
        byteBuffer.put(n7, (byte)n4);
        int n8 = this.pos;
        this.pos = n7 = n8 + -4;
        ByteBuffer byteBuffer2 = this.buffer;
        n8 += -3;
        n4 = (n3 >>> 21 & 0x7F | 0x80) << 24;
        int n10 = (n3 >>> 14 & 0x7F | 0x80) << 16;
        n4 |= n10;
        n10 = (n3 >>> 7 & 0x7F | 0x80) << 8;
        n3 = n3 & 0x7F | 0x80 | (n4 |= n10);
        byteBuffer2.putInt(n8, n3);
    }

    private void writeVarint32FourBytes(int n3) {
        int n4;
        int n7 = this.pos;
        this.pos = n4 = n7 + -4;
        ByteBuffer byteBuffer = this.buffer;
        n7 += -3;
        int n8 = (0xFE00000 & n3) << 3;
        int n10 = (0x1FC000 & n3 | 0x200000) << 2;
        n8 |= n10;
        n10 = (n3 & 0x3F80 | 0x4000) << 1;
        n3 = n3 & 0x7F | 0x80 | (n8 |= n10);
        byteBuffer.putInt(n7, n3);
    }

    private void writeVarint32OneByte(int n3) {
        int n4;
        ByteBuffer byteBuffer = this.buffer;
        int n7 = this.pos;
        this.pos = n4 = n7 + -1;
        n3 = (byte)n3;
        byteBuffer.put(n7, (byte)n3);
    }

    private void writeVarint32ThreeBytes(int n3) {
        int n4;
        this.pos = n4 = this.pos + -3;
        ByteBuffer byteBuffer = this.buffer;
        int n7 = (0x1FC000 & n3) << 10;
        int n8 = (n3 & 0x3F80 | 0x4000) << 9;
        n3 = (n3 & 0x7F | 0x80) << 8 | (n7 |= n8);
        byteBuffer.putInt(n4, n3);
    }

    private void writeVarint32TwoBytes(int n3) {
        int n4;
        int n7 = this.pos;
        this.pos = n4 = n7 + -2;
        ByteBuffer byteBuffer = this.buffer;
        int n8 = (n3 & 0x3F80) << 1;
        n3 = (short)(n3 & 0x7F | 0x80 | n8);
        byteBuffer.putShort(n7 += -1, (short)n3);
    }

    private void writeVarint64EightBytes(long l2) {
        int n3;
        int n4 = this.pos;
        this.pos = n3 = n4 + -8;
        ByteBuffer byteBuffer = this.buffer;
        int n7 = 7;
        n4 -= n7;
        long l3 = (0xFE000000000000L & l2) << n7;
        long l4 = (0x1FC0000000000L & l2 | 0x2000000000000L) << 6;
        l3 |= l4;
        l4 = (0x3F800000000L & l2 | 0x40000000000L) << 5;
        l3 |= l4;
        l4 = (0x7F0000000L & l2 | 0x800000000L) << 4;
        l3 |= l4;
        l4 = (0xFE00000L & l2 | 0x10000000L) << 3;
        l3 |= l4;
        l4 = (0x1FC000L & l2 | 0x200000L) << 2;
        l3 |= l4;
        l4 = (0x3F80L & l2 | 0x4000L) << 1;
        l2 = l2 & (long)127 | 0x80L | (l3 |= l4);
        byteBuffer.putLong(n4, l2);
    }

    private void writeVarint64EightBytesWithSign(long l2) {
        int n3;
        int n4 = this.pos;
        this.pos = n3 = n4 + -8;
        ByteBuffer byteBuffer = this.buffer;
        int n7 = 7;
        n4 -= n7;
        long l3 = (0xFE000000000000L & l2 | 0x100000000000000L) << n7;
        long l4 = (0x1FC0000000000L & l2 | 0x2000000000000L) << 6;
        l3 |= l4;
        l4 = (0x3F800000000L & l2 | 0x40000000000L) << 5;
        l3 |= l4;
        l4 = (0x7F0000000L & l2 | 0x800000000L) << 4;
        l3 |= l4;
        l4 = (0xFE00000L & l2 | 0x10000000L) << 3;
        l3 |= l4;
        l4 = (0x1FC000L & l2 | 0x200000L) << 2;
        l3 |= l4;
        l4 = (0x3F80L & l2 | 0x4000L) << 1;
        l2 = l2 & (long)127 | 0x80L | (l3 |= l4);
        byteBuffer.putLong(n4, l2);
    }

    private void writeVarint64FiveBytes(long l2) {
        int n3;
        int n4 = this.pos;
        this.pos = n3 = n4 + -5;
        ByteBuffer byteBuffer = this.buffer;
        n4 += -7;
        long l3 = (0x7F0000000L & l2) << 28;
        long l4 = (0xFE00000L & l2 | 0x10000000L) << 27;
        l3 |= l4;
        l4 = (0x1FC000L & l2 | 0x200000L) << 26;
        l3 |= l4;
        l4 = (0x3F80L & l2 | 0x4000L) << 25;
        l2 = (l2 & (long)127 | 0x80L) << 24 | (l3 |= l4);
        byteBuffer.putLong(n4, l2);
    }

    private void writeVarint64FourBytes(long l2) {
        int n3 = (int)l2;
        this.writeVarint32FourBytes(n3);
    }

    private void writeVarint64NineBytes(long l2) {
        ByteBuffer byteBuffer = this.buffer;
        int n3 = this.pos;
        byte by2 = n3 + -1;
        this.pos = by2;
        by2 = (byte)(l2 >>> 56);
        byteBuffer.put(n3, by2);
        this.writeVarint64EightBytesWithSign(l2 &= 0xFFFFFFFFFFFFFFL);
    }

    private void writeVarint64OneByte(long l2) {
        int n3 = (int)l2;
        this.writeVarint32OneByte(n3);
    }

    private void writeVarint64SevenBytes(long l2) {
        int n3;
        this.pos = n3 = this.pos + -7;
        ByteBuffer byteBuffer = this.buffer;
        long l3 = (0x1FC0000000000L & l2) << 14;
        long l4 = (0x3F800000000L & l2 | 0x40000000000L) << 13;
        l3 |= l4;
        l4 = (0x7F0000000L & l2 | 0x800000000L) << 12;
        l3 |= l4;
        l4 = (0xFE00000L & l2 | 0x10000000L) << 11;
        l3 |= l4;
        l4 = (0x1FC000L & l2 | 0x200000L) << 10;
        l3 |= l4;
        l4 = (0x3F80L & l2 | 0x4000L) << 9;
        l2 = (l2 & (long)127 | 0x80L) << 8 | (l3 |= l4);
        byteBuffer.putLong(n3, l2);
    }

    private void writeVarint64SixBytes(long l2) {
        int n3;
        int n4 = this.pos;
        this.pos = n3 = n4 + -6;
        ByteBuffer byteBuffer = this.buffer;
        n4 += -7;
        long l3 = (0x3F800000000L & l2) << 21;
        long l4 = (0x7F0000000L & l2 | 0x800000000L) << 20;
        l3 |= l4;
        l4 = (0xFE00000L & l2 | 0x10000000L) << 19;
        l3 |= l4;
        l4 = (0x1FC000L & l2 | 0x200000L) << 18;
        l3 |= l4;
        l4 = (0x3F80L & l2 | 0x4000L) << 17;
        l2 = (l2 & (long)127 | 0x80L) << 16 | (l3 |= l4);
        byteBuffer.putLong(n4, l2);
    }

    private void writeVarint64TenBytes(long l2) {
        ByteBuffer byteBuffer = this.buffer;
        int n3 = this.pos;
        byte by2 = n3 + -1;
        this.pos = by2;
        by2 = (byte)(l2 >>> 63);
        byteBuffer.put(n3, by2);
        byteBuffer = this.buffer;
        n3 = this.pos;
        by2 = n3 + -1;
        this.pos = by2;
        by2 = (byte)(l2 >>> 56 & (long)127 | 0x80L);
        byteBuffer.put(n3, by2);
        this.writeVarint64EightBytesWithSign(l2 &= 0xFFFFFFFFFFFFFFL);
    }

    private void writeVarint64ThreeBytes(long l2) {
        int n3 = (int)l2;
        this.writeVarint32ThreeBytes(n3);
    }

    private void writeVarint64TwoBytes(long l2) {
        int n3 = (int)l2;
        this.writeVarint32TwoBytes(n3);
    }

    public void finishCurrentBuffer() {
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null) {
            int n3 = this.totalDoneBytes;
            int n4 = this.bytesWrittenToCurrentBuffer();
            this.totalDoneBytes = n3 += n4;
            byteBuffer = this.buffer;
            n4 = this.pos + 1;
            Java8Compatibility.position(byteBuffer, n4);
            this.buffer = null;
            n3 = 0;
            byteBuffer = null;
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

    public void write(byte by2) {
        int n3;
        ByteBuffer byteBuffer = this.buffer;
        int n4 = this.pos;
        this.pos = n3 = n4 + -1;
        byteBuffer.put(n4, by2);
    }

    public void write(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.remaining();
        int n4 = this.spaceLeft();
        if (n4 < n3) {
            this.nextBuffer(n3);
        }
        n4 = this.pos - n3;
        this.pos = n4++;
        ByteBuffer byteBuffer2 = this.buffer;
        Java8Compatibility.position(byteBuffer2, n4);
        this.buffer.put(byteBuffer);
    }

    public void write(byte[] byArray, int n3, int n4) {
        int n7 = this.spaceLeft();
        if (n7 < n4) {
            this.nextBuffer(n4);
        }
        n7 = this.pos - n4;
        this.pos = n7++;
        ByteBuffer byteBuffer = this.buffer;
        Java8Compatibility.position(byteBuffer, n7);
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
        int n4;
        int n7 = this.pos;
        this.pos = n4 = n7 + -4;
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.putInt(n7 += -3, n3);
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
        int n3;
        int n4 = this.pos;
        this.pos = n3 = n4 + -8;
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.putLong(n4 += -7, l2);
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
        n4 = this.pos - n3;
        this.pos = n4++;
        ByteBuffer byteBuffer = this.buffer;
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
        n7 = this.pos - n4;
        this.pos = n7++;
        ByteBuffer byteBuffer = this.buffer;
        Java8Compatibility.position(byteBuffer, n7);
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
        var2_2 = var1_1.length();
        var3_3 = 1;
        this.pos = var4_4 = this.pos - (var2_2 -= var3_3);
        while (true) {
            var4_4 = 128;
            if (var2_2 < 0 || (var5_5 = (int)var1_1.charAt(var2_2)) >= var4_4) break;
            var6_6 = this.buffer;
            var7_7 = this.pos + var2_2;
            var5_5 = (byte)var5_5;
            var6_6.put((int)var7_7, (byte)var5_5);
            var2_2 += -1;
        }
        var5_5 = -1;
        if (var2_2 == var5_5) {
            this.pos = var8_8 = this.pos - var3_3;
            return;
        }
        var7_7 = this.pos + var2_2;
        this.pos = var7_7;
        while (var2_2 >= 0) {
            block6: {
                block8: {
                    block7: {
                        block5: {
                            var7_7 = (byte)var1_1.charAt(var2_2);
                            if (var7_7 >= var4_4 || (var9_9 = this.pos) < 0) break block5;
                            var10_10 = this.buffer;
                            this.pos = var11_11 = var9_9 + -1;
                            var7_7 = var7_7;
                            var10_10.put((int)var9_9, var7_7);
                            break block6;
                        }
                        var9_9 = 2048;
                        if (var7_7 >= var9_9 || (var9_9 = this.pos) <= 0) break block7;
                        var10_10 = this.buffer;
                        this.pos = var11_11 = var9_9 + -1;
                        var11_11 = (byte)(var7_7 & 63 | var4_4);
                        var10_10.put((int)var9_9, (byte)var11_11);
                        var12_12 = this.buffer;
                        var13_13 = this.pos;
                        this.pos = var11_11 = var13_13 + -1;
                        var7_7 = (byte)(var7_7 >>> 6 | 960);
                        var12_12.put((int)var13_13, var7_7);
                        break block6;
                    }
                    var9_9 = 55296;
                    if (var7_7 >= var9_9 && (var9_9 = 57343) >= var7_7 || (var9_9 = this.pos) <= var3_3) break block8;
                    var10_10 = this.buffer;
                    this.pos = var11_11 = var9_9 + -1;
                    var11_11 = (byte)(var7_7 & 63 | var4_4);
                    var10_10.put((int)var9_9, (byte)var11_11);
                    var12_12 = this.buffer;
                    var13_13 = this.pos;
                    this.pos = var11_11 = var13_13 + -1;
                    var11_11 = (byte)(var7_7 >>> 6 & 63 | var4_4);
                    var12_12.put((int)var13_13, (byte)var11_11);
                    var12_12 = this.buffer;
                    var13_13 = this.pos;
                    this.pos = var11_11 = var13_13 + -1;
                    var7_7 = (byte)(var7_7 >>> 12 | 480);
                    var12_12.put((int)var13_13, var7_7);
                    break block6;
                }
                var9_9 = this.pos;
                var13_13 = 2;
                if (var9_9 <= var13_13) ** GOTO lbl105
                if (var2_2 == 0) ** GOTO lbl-1000
                var9_9 = var2_2 + -1;
                var13_13 = (byte)Character.isSurrogatePair((char)(var9_9 = (byte)var1_1.charAt(var9_9)), (char)var7_7);
                if (var13_13 != 0) {
                    var2_2 += -1;
                    var7_7 = Character.toCodePoint((char)var9_9, (char)var7_7);
                    var12_12 = this.buffer;
                    var13_13 = this.pos;
                    this.pos = var11_11 = var13_13 + -1;
                    var11_11 = (byte)(var7_7 & 63 | var4_4);
                    var12_12.put((int)var13_13, (byte)var11_11);
                    var12_12 = this.buffer;
                    var13_13 = this.pos;
                    this.pos = var11_11 = var13_13 + -1;
                    var11_11 = (byte)(var7_7 >>> 6 & 63 | var4_4);
                    var12_12.put((int)var13_13, (byte)var11_11);
                    var12_12 = this.buffer;
                    var13_13 = this.pos;
                    this.pos = var11_11 = var13_13 + -1;
                    var11_11 = (byte)(var7_7 >>> 12 & 63 | var4_4);
                    var12_12.put((int)var13_13, (byte)var11_11);
                    var12_12 = this.buffer;
                    var13_13 = this.pos;
                    this.pos = var11_11 = var13_13 + -1;
                    var7_7 = (byte)(var7_7 >>> 18 | 240);
                    var12_12.put((int)var13_13, var7_7);
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = var2_2 + -1;
                    var1_1 = new Utf8$UnpairedSurrogateException(var3_3, var2_2);
                    throw var1_1;
lbl105:
                    // 1 sources

                    this.requireSpace(var2_2);
                    ++var2_2;
                }
            }
            var2_2 += var5_5;
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

