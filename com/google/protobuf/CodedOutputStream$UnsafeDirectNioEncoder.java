/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import com.google.protobuf.Java8Compatibility;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.Utf8;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class CodedOutputStream$UnsafeDirectNioEncoder
extends CodedOutputStream {
    private final long address;
    private final ByteBuffer buffer;
    private final long initialPosition;
    private final long limit;
    private final long oneVarintLimit;
    private final ByteBuffer originalBuffer;
    private long position;

    public CodedOutputStream$UnsafeDirectNioEncoder(ByteBuffer byteBuffer) {
        super(null);
        long l2;
        long l3;
        this.originalBuffer = byteBuffer;
        ByteBuffer byteBuffer2 = byteBuffer.duplicate();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.buffer = byteBuffer2 = byteBuffer2.order(byteOrder);
        this.address = l3 = UnsafeUtil.addressOffset(byteBuffer);
        this.initialPosition = l2 = (long)byteBuffer.position() + l3;
        long l4 = byteBuffer.limit();
        this.limit = l3 += l4;
        this.oneVarintLimit = l3 -= (long)10;
        this.position = l2;
    }

    private int bufferPos(long l2) {
        long l3 = this.address;
        return (int)(l2 - l3);
    }

    public static boolean isSupported() {
        return UnsafeUtil.hasUnsafeByteBufferOperations();
    }

    private void repositionBuffer(long l2) {
        ByteBuffer byteBuffer = this.buffer;
        int n3 = this.bufferPos(l2);
        Java8Compatibility.position(byteBuffer, n3);
    }

    public void flush() {
        ByteBuffer byteBuffer = this.originalBuffer;
        long l2 = this.position;
        int n3 = this.bufferPos(l2);
        Java8Compatibility.position(byteBuffer, n3);
    }

    public int getTotalBytesWritten() {
        long l2 = this.position;
        long l3 = this.initialPosition;
        return (int)(l2 - l3);
    }

    public int spaceLeft() {
        long l2 = this.limit;
        long l3 = this.position;
        return (int)(l2 - l3);
    }

    public void write(byte by2) {
        int n3 = 1;
        long l2 = this.position;
        long l3 = this.limit;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            this.position = l3 = 1L + l2;
            UnsafeUtil.putByte(l2, by2);
            return;
        }
        Long l7 = this.position;
        Long l8 = this.limit;
        Integer n4 = n3;
        Object[] objectArray = new Object[3];
        objectArray[0] = l7;
        objectArray[n3] = l8;
        objectArray[2] = n4;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(string2);
        throw codedOutputStream$OutOfSpaceException;
    }

    public void write(ByteBuffer byteBuffer) {
        int n3;
        try {
            n3 = byteBuffer.remaining();
        }
        catch (BufferOverflowException bufferOverflowException) {
            CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(bufferOverflowException);
            throw codedOutputStream$OutOfSpaceException;
        }
        long l2 = this.position;
        this.repositionBuffer(l2);
        ByteBuffer byteBuffer2 = this.buffer;
        byteBuffer2.put(byteBuffer);
        l2 = this.position;
        long l3 = n3;
        l2 += l3;
        this.position = l2;
    }

    public void write(byte[] object, int n3, int n4) {
        int n7;
        if (object != null && n3 >= 0 && n4 >= 0 && (n7 = ((byte[])object).length - n4) >= n3) {
            long l2 = this.limit;
            long l3 = n4;
            long l4 = this.position;
            long l7 = (l2 -= l3) - l4;
            Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 >= 0) {
                long l8;
                long l12 = n3;
                UnsafeUtil.copyMemory(object, l12, l4, l3);
                this.position = l8 = this.position + l3;
                return;
            }
        }
        if (object == null) {
            object = new NullPointerException;
            object("value");
            throw object;
        }
        object = new CodedOutputStream$OutOfSpaceException;
        Object object3 = this.position;
        Long l14 = this.limit;
        Integer n8 = n4;
        Object[] objectArray = new Object[]{object3, l14, n8};
        object3 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        object((String)object3);
        throw object;
    }

    public void writeBool(int n3, boolean bl2) {
        this.writeTag(n3, 0);
        n3 = (byte)(bl2 ? 1 : 0);
        this.write((byte)n3);
    }

    public void writeByteArray(int n3, byte[] byArray) {
        int n4 = byArray.length;
        this.writeByteArray(n3, byArray, 0, n4);
    }

    public void writeByteArray(int n3, byte[] byArray, int n4, int n7) {
        this.writeTag(n3, 2);
        this.writeByteArrayNoTag(byArray, n4, n7);
    }

    public void writeByteArrayNoTag(byte[] byArray, int n3, int n4) {
        this.writeUInt32NoTag(n4);
        this.write(byArray, n3, n4);
    }

    public void writeByteBuffer(int n3, ByteBuffer byteBuffer) {
        this.writeTag(n3, 2);
        n3 = byteBuffer.capacity();
        this.writeUInt32NoTag(n3);
        this.writeRawBytes(byteBuffer);
    }

    public void writeBytes(int n3, ByteString byteString) {
        this.writeTag(n3, 2);
        this.writeBytesNoTag(byteString);
    }

    public void writeBytesNoTag(ByteString byteString) {
        int n3 = byteString.size();
        this.writeUInt32NoTag(n3);
        byteString.writeTo(this);
    }

    public void writeFixed32(int n3, int n4) {
        this.writeTag(n3, 5);
        this.writeFixed32NoTag(n4);
    }

    public void writeFixed32NoTag(int n3) {
        long l2;
        ByteBuffer byteBuffer = this.buffer;
        long l3 = this.position;
        int n4 = this.bufferPos(l3);
        byteBuffer.putInt(n4, n3);
        this.position = l2 = this.position + (long)4;
    }

    public void writeFixed64(int n3, long l2) {
        this.writeTag(n3, 1);
        this.writeFixed64NoTag(l2);
    }

    public void writeFixed64NoTag(long l2) {
        ByteBuffer byteBuffer = this.buffer;
        long l3 = this.position;
        int n3 = this.bufferPos(l3);
        byteBuffer.putLong(n3, l2);
        this.position = l2 = this.position + (long)8;
    }

    public void writeInt32(int n3, int n4) {
        this.writeTag(n3, 0);
        this.writeInt32NoTag(n4);
    }

    public void writeInt32NoTag(int n3) {
        if (n3 >= 0) {
            this.writeUInt32NoTag(n3);
        } else {
            long l2 = n3;
            this.writeUInt64NoTag(l2);
        }
    }

    public void writeLazy(ByteBuffer byteBuffer) {
        this.write(byteBuffer);
    }

    public void writeLazy(byte[] byArray, int n3, int n4) {
        this.write(byArray, n3, n4);
    }

    public void writeMessage(int n3, MessageLite messageLite) {
        this.writeTag(n3, 2);
        this.writeMessageNoTag(messageLite);
    }

    public void writeMessage(int n3, MessageLite messageLite, Schema schema) {
        this.writeTag(n3, 2);
        this.writeMessageNoTag(messageLite, schema);
    }

    public void writeMessageNoTag(MessageLite messageLite) {
        int n3 = messageLite.getSerializedSize();
        this.writeUInt32NoTag(n3);
        messageLite.writeTo(this);
    }

    public void writeMessageNoTag(MessageLite messageLite, Schema schema) {
        Object object = messageLite;
        int n3 = ((AbstractMessageLite)messageLite).getSerializedSize(schema);
        this.writeUInt32NoTag(n3);
        object = this.wrapper;
        schema.writeTo(messageLite, (Writer)object);
    }

    public void writeMessageSetExtension(int n3, MessageLite messageLite) {
        int n4 = 1;
        int n7 = 3;
        this.writeTag(n4, n7);
        this.writeUInt32(2, n3);
        this.writeMessage(n7, messageLite);
        this.writeTag(n4, 4);
    }

    public void writeRawBytes(ByteBuffer byteBuffer) {
        boolean bl2 = byteBuffer.hasArray();
        if (bl2) {
            byte[] byArray = byteBuffer.array();
            int n3 = byteBuffer.arrayOffset();
            int n4 = byteBuffer.capacity();
            this.write(byArray, n3, n4);
        } else {
            byteBuffer = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBuffer);
            this.write(byteBuffer);
        }
    }

    public void writeRawMessageSetExtension(int n3, ByteString byteString) {
        int n4 = 1;
        int n7 = 3;
        this.writeTag(n4, n7);
        this.writeUInt32(2, n3);
        this.writeBytes(n7, byteString);
        this.writeTag(n4, 4);
    }

    public void writeString(int n3, String string2) {
        this.writeTag(n3, 2);
        this.writeStringNoTag(string2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeStringNoTag(String string2) {
        Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException2;
        long l2;
        block8: {
            IllegalArgumentException illegalArgumentException2;
            block7: {
                IndexOutOfBoundsException indexOutOfBoundsException2;
                block6: {
                    int n3;
                    block9: {
                        long l3;
                        int n4;
                        l2 = this.position;
                        try {
                            n3 = string2.length() * 3;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                            break block6;
                        }
                        catch (IllegalArgumentException illegalArgumentException2) {
                            break block7;
                        }
                        catch (Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException2) {
                            break block8;
                        }
                        {
                            n3 = CodedOutputStream.computeUInt32SizeNoTag(n3);
                            n4 = string2.length();
                            n4 = CodedOutputStream.computeUInt32SizeNoTag(n4);
                            if (n4 != n3) break block9;
                            l3 = this.position;
                            n3 = this.bufferPos(l3) + n4;
                            ByteBuffer byteBuffer = this.buffer;
                            Java8Compatibility.position(byteBuffer, n3);
                            byteBuffer = this.buffer;
                            Utf8.encodeUtf8(string2, byteBuffer);
                            byteBuffer = this.buffer;
                            n4 = byteBuffer.position() - n3;
                        }
                        this.writeUInt32NoTag(n4);
                        l3 = this.position;
                        long l4 = n4;
                        this.position = l3 += l4;
                        return;
                    }
                    n3 = Utf8.encodedLength(string2);
                    this.writeUInt32NoTag(n3);
                    long l7 = this.position;
                    this.repositionBuffer(l7);
                    ByteBuffer byteBuffer = this.buffer;
                    Utf8.encodeUtf8(string2, byteBuffer);
                    l7 = this.position;
                    long l8 = n3;
                    this.position = l7 += l8;
                    return;
                }
                CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(indexOutOfBoundsException2);
                throw codedOutputStream$OutOfSpaceException;
            }
            CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(illegalArgumentException2);
            throw codedOutputStream$OutOfSpaceException;
        }
        this.position = l2;
        this.repositionBuffer(l2);
        this.inefficientWriteStringNoTag(string2, utf8$UnpairedSurrogateException2);
    }

    public void writeTag(int n3, int n4) {
        n3 = WireFormat.makeTag(n3, n4);
        this.writeUInt32NoTag(n3);
    }

    public void writeUInt32(int n3, int n4) {
        this.writeTag(n3, 0);
        this.writeUInt32NoTag(n4);
    }

    public void writeUInt32NoTag(int n3) {
        long l2;
        int n4 = 1;
        long l3 = this.position;
        long l4 = this.oneVarintLimit;
        long l7 = 1L;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object <= 0) {
            while (true) {
                long l8;
                long l12;
                if ((n4 = n3 & 0xFFFFFF80) == 0) {
                    l12 = this.position;
                    this.position = l7 += l12;
                    n3 = (byte)n3;
                    UnsafeUtil.putByte(l12, (byte)n3);
                    return;
                }
                l12 = this.position;
                this.position = l8 = l12 + l7;
                byte by2 = (byte)(n3 & 0x7F | 0x80);
                UnsafeUtil.putByte(l12, by2);
                n3 >>>= 7;
            }
        }
        while ((object = (l2 = (l3 = this.position) - (l4 = this.limit)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) < 0) {
            int n7 = n3 & 0xFFFFFF80;
            if (n7 == 0) {
                this.position = l7 += l3;
                n3 = (byte)n3;
                UnsafeUtil.putByte(l3, (byte)n3);
                return;
            }
            this.position = l4 = l3 + l7;
            n7 = (byte)(n3 & 0x7F | 0x80);
            UnsafeUtil.putByte(l3, (byte)n7);
            n3 >>>= 7;
        }
        Long l14 = this.position;
        Long l15 = this.limit;
        Integer n8 = n4;
        Object[] objectArray = new Object[3];
        objectArray[0] = l14;
        objectArray[n4] = l15;
        objectArray[2] = n8;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(string2);
        throw codedOutputStream$OutOfSpaceException;
    }

    public void writeUInt64(int n3, long l2) {
        this.writeTag(n3, 0);
        this.writeUInt64NoTag(l2);
    }

    public void writeUInt64NoTag(long l2) {
        long l3;
        int n3 = 1;
        long l4 = this.position;
        long l7 = this.oneVarintLimit;
        int n4 = 7;
        long l8 = 0L;
        long l12 = -128;
        long l14 = 1L;
        Object object = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (object <= 0) {
            while (true) {
                long l15;
                long l16;
                long l17;
                long l18;
                if ((l18 = (l17 = (l16 = l2 & l12) - l8) == 0L ? 0 : (l17 < 0L ? -1 : 1)) == false) {
                    l16 = this.position;
                    this.position = l14 += l16;
                    byte by2 = (byte)l2;
                    UnsafeUtil.putByte(l16, by2);
                    return;
                }
                l16 = this.position;
                this.position = l15 = l16 + l14;
                l18 = (byte)((int)l2 & 0x7F | 0x80);
                UnsafeUtil.putByte(l16, (byte)l18);
                l2 >>>= n4;
            }
        }
        while ((object = (l3 = (l4 = this.position) - (l7 = this.limit)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
            l7 = l2 & l12;
            long l19 = l7 - l8;
            object = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
            if (object == false) {
                this.position = l14 += l4;
                byte by4 = (byte)l2;
                UnsafeUtil.putByte(l4, by4);
                return;
            }
            this.position = l7 = l4 + l14;
            byte by5 = (byte)((int)l2 & 0x7F | 0x80);
            UnsafeUtil.putByte(l4, by5);
            l2 >>>= n4;
        }
        Object object2 = this.position;
        Long l20 = this.limit;
        Integer n7 = n3;
        Object[] objectArray = new Object[3];
        objectArray[0] = object2;
        objectArray[n3] = l20;
        objectArray[2] = n7;
        object2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException((String)object2);
        throw codedOutputStream$OutOfSpaceException;
    }
}

