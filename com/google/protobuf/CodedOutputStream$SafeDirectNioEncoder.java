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
import com.google.protobuf.Utf8;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class CodedOutputStream$SafeDirectNioEncoder
extends CodedOutputStream {
    private final ByteBuffer buffer;
    private final int initialPosition;
    private final ByteBuffer originalBuffer;

    public CodedOutputStream$SafeDirectNioEncoder(ByteBuffer byteBuffer) {
        super(null);
        int n3;
        this.originalBuffer = byteBuffer;
        ByteBuffer byteBuffer2 = byteBuffer.duplicate();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.buffer = byteBuffer2 = byteBuffer2.order(byteOrder);
        this.initialPosition = n3 = byteBuffer.position();
    }

    private void encode(String string2) {
        Object object;
        try {
            object = this.buffer;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new CodedOutputStream$OutOfSpaceException(indexOutOfBoundsException);
            throw object;
        }
        Utf8.encodeUtf8(string2, (ByteBuffer)object);
    }

    public void flush() {
        ByteBuffer byteBuffer = this.originalBuffer;
        int n3 = this.buffer.position();
        Java8Compatibility.position(byteBuffer, n3);
    }

    public int getTotalBytesWritten() {
        int n3 = this.buffer.position();
        int n4 = this.initialPosition;
        return n3 - n4;
    }

    public int spaceLeft() {
        return this.buffer.remaining();
    }

    public void write(byte by2) {
        Object object;
        try {
            object = this.buffer;
        }
        catch (BufferOverflowException bufferOverflowException) {
            object = new CodedOutputStream$OutOfSpaceException(bufferOverflowException);
            throw object;
        }
        ((ByteBuffer)object).put(by2);
    }

    public void write(ByteBuffer byteBuffer) {
        Object object;
        try {
            object = this.buffer;
        }
        catch (BufferOverflowException bufferOverflowException) {
            object = new CodedOutputStream$OutOfSpaceException(bufferOverflowException);
            throw object;
        }
        ((ByteBuffer)object).put(byteBuffer);
    }

    public void write(byte[] byArray, int n3, int n4) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        block5: {
            ByteBuffer byteBuffer = this.buffer;
            try {
                byteBuffer.put(byArray, n3, n4);
                return;
            }
            catch (BufferOverflowException bufferOverflowException) {
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                break block5;
            }
            CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(bufferOverflowException);
            throw codedOutputStream$OutOfSpaceException;
        }
        CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(indexOutOfBoundsException2);
        throw codedOutputStream$OutOfSpaceException;
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
        Object object;
        try {
            object = this.buffer;
        }
        catch (BufferOverflowException bufferOverflowException) {
            object = new CodedOutputStream$OutOfSpaceException(bufferOverflowException);
            throw object;
        }
        ((ByteBuffer)object).putInt(n3);
    }

    public void writeFixed64(int n3, long l2) {
        this.writeTag(n3, 1);
        this.writeFixed64NoTag(l2);
    }

    public void writeFixed64NoTag(long l2) {
        ByteBuffer byteBuffer;
        try {
            byteBuffer = this.buffer;
        }
        catch (BufferOverflowException bufferOverflowException) {
            CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(bufferOverflowException);
            throw codedOutputStream$OutOfSpaceException;
        }
        byteBuffer.putLong(l2);
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
        ByteBuffer byteBuffer;
        Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException2;
        int n3;
        block6: {
            IllegalArgumentException illegalArgumentException2;
            Object object;
            block5: {
                int n4;
                block7: {
                    ByteBuffer byteBuffer2;
                    int n7;
                    object = this.buffer;
                    n3 = ((Buffer)object).position();
                    try {
                        n4 = string2.length() * 3;
                    }
                    catch (IllegalArgumentException illegalArgumentException2) {
                        break block5;
                    }
                    catch (Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException2) {
                        break block6;
                    }
                    {
                        n4 = CodedOutputStream.computeUInt32SizeNoTag(n4);
                        n7 = string2.length();
                        n7 = CodedOutputStream.computeUInt32SizeNoTag(n7);
                        if (n7 != n4) break block7;
                        byteBuffer2 = this.buffer;
                        n4 = byteBuffer2.position() + n7;
                        byteBuffer = this.buffer;
                        Java8Compatibility.position(byteBuffer, n4);
                        this.encode(string2);
                        byteBuffer = this.buffer;
                        n7 = byteBuffer.position();
                        ByteBuffer byteBuffer3 = this.buffer;
                        Java8Compatibility.position(byteBuffer3, n3);
                        n4 = n7 - n4;
                    }
                    this.writeUInt32NoTag(n4);
                    byteBuffer2 = this.buffer;
                    Java8Compatibility.position(byteBuffer2, n7);
                    return;
                }
                n4 = Utf8.encodedLength(string2);
                this.writeUInt32NoTag(n4);
                this.encode(string2);
                return;
            }
            object = new CodedOutputStream$OutOfSpaceException(illegalArgumentException2);
            throw object;
        }
        byteBuffer = this.buffer;
        Java8Compatibility.position(byteBuffer, n3);
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeUInt32NoTag(int n3) {
        BufferOverflowException bufferOverflowException2;
        Object object;
        while (true) {
            int n4;
            if ((n4 = n3 & 0xFFFFFF80) == 0) {
                try {
                    object = this.buffer;
                }
                catch (BufferOverflowException bufferOverflowException2) {
                    break;
                }
                n3 = (byte)n3;
                ((ByteBuffer)object).put((byte)n3);
                return;
            }
            object = this.buffer;
            byte by2 = (byte)(n3 & 0x7F | 0x80);
            {
                ((ByteBuffer)object).put(by2);
                n3 >>>= 7;
                continue;
            }
            break;
        }
        object = new CodedOutputStream$OutOfSpaceException(bufferOverflowException2);
        throw object;
    }

    public void writeUInt64(int n3, long l2) {
        this.writeTag(n3, 0);
        this.writeUInt64NoTag(l2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeUInt64NoTag(long l2) {
        BufferOverflowException bufferOverflowException2;
        while (true) {
            ByteBuffer byteBuffer;
            long l3;
            long l4;
            long l7;
            long l8;
            if ((l8 = (l7 = (l4 = (long)-128 & l2) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) {
                try {
                    byteBuffer = this.buffer;
                }
                catch (BufferOverflowException bufferOverflowException2) {
                    break;
                }
                int n3 = (int)l2;
                byte by2 = (byte)n3;
                byteBuffer.put(by2);
                return;
            }
            byteBuffer = this.buffer;
            byte by4 = (byte)((int)l2 & 0x7F | 0x80);
            {
                byteBuffer.put(by4);
                int n4 = 7;
                l2 >>>= n4;
                continue;
            }
            break;
        }
        CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(bufferOverflowException2);
        throw codedOutputStream$OutOfSpaceException;
    }
}

