/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
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
import java.io.OutputStream;
import java.nio.ByteBuffer;

final class CodedOutputStream$OutputStreamEncoder
extends CodedOutputStream$AbstractBufferedEncoder {
    private final OutputStream out;

    public CodedOutputStream$OutputStreamEncoder(OutputStream object, int n3) {
        super(n3);
        if (object != null) {
            this.out = object;
            return;
        }
        object = new NullPointerException("out");
        throw object;
    }

    private void doFlush() {
        OutputStream outputStream = this.out;
        byte[] byArray = this.buffer;
        int n3 = this.position;
        outputStream.write(byArray, 0, n3);
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
        int n3 = this.limit;
        int n4 = this.position;
        int n7 = n3 - n4;
        int n8 = byteBuffer.remaining();
        if (n7 >= n8) {
            int n10;
            byte[] byArray = this.buffer;
            byteBuffer.get(byArray, n4, n8);
            this.position = n10 = this.position + n8;
            this.totalBytesWritten = n10 = this.totalBytesWritten + n8;
        } else {
            int n14;
            Object object;
            byte[] byArray = this.buffer;
            byteBuffer.get(byArray, n4, n3 -= n4);
            n8 -= n3;
            this.position = n4 = this.limit;
            this.totalBytesWritten = n4 = this.totalBytesWritten + n3;
            this.doFlush();
            while (true) {
                n3 = this.limit;
                n4 = 0;
                if (n8 <= n3) break;
                byArray = this.buffer;
                byteBuffer.get(byArray, 0, n3);
                object = this.out;
                byArray = this.buffer;
                int n15 = this.limit;
                ((OutputStream)object).write(byArray, 0, n15);
                n3 = this.limit;
                n8 -= n3;
                this.totalBytesWritten = n4 = this.totalBytesWritten + n3;
            }
            object = this.buffer;
            byteBuffer.get((byte[])object, 0, n8);
            this.position = n8;
            this.totalBytesWritten = n14 = this.totalBytesWritten + n8;
        }
    }

    public void write(byte[] byArray, int n3, int n4) {
        int n7 = this.limit;
        int n8 = this.position;
        int n10 = n7 - n8;
        if (n10 >= n4) {
            int n14;
            byte[] byArray2 = this.buffer;
            System.arraycopy(byArray, n3, byArray2, n8, n4);
            this.position = n14 = this.position + n4;
            this.totalBytesWritten = n14 = this.totalBytesWritten + n4;
        } else {
            int n15;
            byte[] byArray3 = this.buffer;
            System.arraycopy(byArray, n3, byArray3, n8, n7 -= n8);
            n3 += n7;
            n4 -= n7;
            this.position = n8 = this.limit;
            this.totalBytesWritten = n8 = this.totalBytesWritten + n7;
            this.doFlush();
            n7 = this.limit;
            if (n4 <= n7) {
                byte[] byArray4 = this.buffer;
                n8 = 0;
                System.arraycopy(byArray, n3, byArray4, 0, n4);
                this.position = n4;
            } else {
                OutputStream outputStream = this.out;
                outputStream.write(byArray, n3, n4);
            }
            this.totalBytesWritten = n15 = this.totalBytesWritten + n4;
        }
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeStringNoTag(String var1_1) {
        block12: {
            block14: {
                block13: {
                    try {
                        var2_2 = var1_1.length() * 3;
                    }
                    catch (Utf8$UnpairedSurrogateException var7_8) {
                        break block12;
                    }
                    var3_3 = CodedOutputStream.computeUInt32SizeNoTag(var2_2);
                    var4_4 = var3_3 + var2_2;
                    var5_5 = this.limit;
                    if (var4_4 > var5_5) {
                        var6_6 = new byte[var2_2];
                        var4_4 = 0;
                        var2_2 = Utf8.encode(var1_1, var6_6, 0, var2_2);
                        this.writeUInt32NoTag(var2_2);
                        this.writeLazy(var6_6, 0, var2_2);
                        return;
                    }
                    var2_2 = this.position;
                    if (var4_4 <= (var5_5 -= var2_2)) ** GOTO lbl19
                    {
                        this.doFlush();
lbl19:
                        // 2 sources

                        var2_2 = var1_1.length();
                        var2_2 = CodedOutputStream.computeUInt32SizeNoTag(var2_2);
                        var4_4 = this.position;
                        if (var2_2 != var3_3) break block13;
                        var3_3 = var4_4 + var2_2;
                    }
                    try {
                        this.position = var3_3;
                        var8_13 = this.buffer;
                        var9_14 = this.limit - var3_3;
                    }
                    catch (ArrayIndexOutOfBoundsException var7_9) {
                        ** GOTO lbl-1000
                    }
                    catch (Utf8$UnpairedSurrogateException var7_10) {
                        ** GOTO lbl50
                    }
                    {
                        var3_3 = Utf8.encode(var1_1, var8_13, var3_3, var9_14);
                        this.position = var4_4;
                        var5_5 = var3_3 - var4_4 - var2_2;
                    }
                    this.bufferUInt32NoTag(var5_5);
                    this.position = var3_3;
                    break block14;
                }
                var5_5 = Utf8.encodedLength(var1_1);
                this.bufferUInt32NoTag(var5_5);
                var7_11 = this.buffer;
                var3_3 = this.position;
                this.position = var2_2 = Utf8.encode(var1_1, var7_11, var3_3, var5_5);
            }
            this.totalBytesWritten = var2_2 = this.totalBytesWritten + var5_5;
            return;
lbl-1000:
            // 1 sources

            {
                var6_7 = new CodedOutputStream$OutOfSpaceException(var7_9);
                throw var6_7;
lbl50:
                // 1 sources

                var3_3 = this.totalBytesWritten;
                var5_5 = this.position - var4_4;
            }
            {
                this.totalBytesWritten = var3_3 -= var5_5;
                this.position = var4_4;
                throw var7_10;
            }
        }
        this.inefficientWriteStringNoTag(var1_1, var7_8);
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

