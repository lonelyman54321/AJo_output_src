/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.CodedOutputStream$AbstractBufferedEncoder;
import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import com.google.protobuf.Java8Compatibility;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import com.google.protobuf.Utf8;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.nio.ByteBuffer;

final class CodedOutputStream$ByteOutputEncoder
extends CodedOutputStream$AbstractBufferedEncoder {
    private final ByteOutput out;

    public CodedOutputStream$ByteOutputEncoder(ByteOutput object, int n3) {
        super(n3);
        if (object != null) {
            this.out = object;
            return;
        }
        object = new NullPointerException("out");
        throw object;
    }

    private void doFlush() {
        ByteOutput byteOutput = this.out;
        byte[] byArray = this.buffer;
        int n3 = this.position;
        byteOutput.write(byArray, 0, n3);
        this.position = 0;
    }

    private void flushIfNotAvailable(int n3) {
        int n4 = this.limit;
        int n7 = this.position;
        if ((n4 -= n7) < n3) {
            this.doFlush();
        }
    }

    public void flush() {
        int n3 = this.position;
        if (n3 > 0) {
            this.doFlush();
        }
    }

    public void write(byte by2) {
        int n3 = this.position;
        int n4 = this.limit;
        if (n3 == n4) {
            this.doFlush();
        }
        this.buffer(by2);
    }

    public void write(ByteBuffer byteBuffer) {
        int n3;
        this.flush();
        int n4 = byteBuffer.remaining();
        this.out.write(byteBuffer);
        this.totalBytesWritten = n3 = this.totalBytesWritten + n4;
    }

    public void write(byte[] byArray, int n3, int n4) {
        int n7;
        this.flush();
        this.out.write(byArray, n3, n4);
        this.totalBytesWritten = n7 = this.totalBytesWritten + n4;
    }

    public void writeBool(int n3, boolean bl2) {
        this.flushIfNotAvailable(11);
        this.bufferTag(n3, 0);
        n3 = (byte)(bl2 ? 1 : 0);
        this.buffer((byte)n3);
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
        this.flushIfNotAvailable(14);
        this.bufferTag(n3, 5);
        this.bufferFixed32NoTag(n4);
    }

    public void writeFixed32NoTag(int n3) {
        this.flushIfNotAvailable(4);
        this.bufferFixed32NoTag(n3);
    }

    public void writeFixed64(int n3, long l2) {
        this.flushIfNotAvailable(18);
        this.bufferTag(n3, 1);
        this.bufferFixed64NoTag(l2);
    }

    public void writeFixed64NoTag(long l2) {
        this.flushIfNotAvailable(8);
        this.bufferFixed64NoTag(l2);
    }

    public void writeInt32(int n3, int n4) {
        this.flushIfNotAvailable(20);
        this.bufferTag(n3, 0);
        this.bufferInt32NoTag(n4);
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
        int n3;
        this.flush();
        int n4 = byteBuffer.remaining();
        this.out.writeLazy(byteBuffer);
        this.totalBytesWritten = n3 = this.totalBytesWritten + n4;
    }

    public void writeLazy(byte[] byArray, int n3, int n4) {
        int n7;
        this.flush();
        this.out.writeLazy(byArray, n3, n4);
        this.totalBytesWritten = n7 = this.totalBytesWritten + n4;
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
        int n3;
        int n4;
        int n7;
        block9: {
            IndexOutOfBoundsException indexOutOfBoundsException2;
            block8: {
                int n8;
                block7: {
                    int n10;
                    byte[] byArray;
                    n7 = string2.length() * 3;
                    n8 = CodedOutputStream.computeUInt32SizeNoTag(n7);
                    n4 = n8 + n7;
                    if (n4 > (n3 = this.limit)) {
                        byte[] byArray2 = new byte[n7];
                        int n14 = Utf8.encode(string2, byArray2, 0, n7);
                        this.writeUInt32NoTag(n14);
                        this.writeLazy(byArray2, 0, n14);
                        return;
                    }
                    n7 = this.position;
                    if (n4 > (n3 -= n7)) {
                        this.doFlush();
                    }
                    n7 = this.position;
                    try {
                        n4 = string2.length();
                        n4 = CodedOutputStream.computeUInt32SizeNoTag(n4);
                        if (n4 != n8) break block7;
                        this.position = n8 = n7 + n4;
                        byArray = this.buffer;
                        n10 = this.limit - n8;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                        break block8;
                    }
                    catch (Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException2) {
                        break block9;
                    }
                    {
                        n8 = Utf8.encode(string2, byArray, n8, n10);
                        this.position = n7;
                        n3 = n8 - n7 - n4;
                    }
                    this.bufferUInt32NoTag(n3);
                    this.position = n8;
                    this.totalBytesWritten = n8 = this.totalBytesWritten + n3;
                    return;
                }
                n8 = Utf8.encodedLength(string2);
                this.bufferUInt32NoTag(n8);
                byte[] byArray = this.buffer;
                n3 = this.position;
                this.position = n4 = Utf8.encode(string2, byArray, n3, n8);
                this.totalBytesWritten = n4 = this.totalBytesWritten + n8;
                return;
            }
            CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(indexOutOfBoundsException2);
            throw codedOutputStream$OutOfSpaceException;
        }
        n4 = this.totalBytesWritten;
        n3 = this.position - n7;
        this.totalBytesWritten = n4 -= n3;
        this.position = n7;
        this.inefficientWriteStringNoTag(string2, utf8$UnpairedSurrogateException2);
    }

    public void writeTag(int n3, int n4) {
        n3 = WireFormat.makeTag(n3, n4);
        this.writeUInt32NoTag(n3);
    }

    public void writeUInt32(int n3, int n4) {
        this.flushIfNotAvailable(20);
        this.bufferTag(n3, 0);
        this.bufferUInt32NoTag(n4);
    }

    public void writeUInt32NoTag(int n3) {
        this.flushIfNotAvailable(5);
        this.bufferUInt32NoTag(n3);
    }

    public void writeUInt64(int n3, long l2) {
        this.flushIfNotAvailable(20);
        this.bufferTag(n3, 0);
        this.bufferUInt64NoTag(l2);
    }

    public void writeUInt64NoTag(long l2) {
        this.flushIfNotAvailable(10);
        this.bufferUInt64NoTag(l2);
    }
}

