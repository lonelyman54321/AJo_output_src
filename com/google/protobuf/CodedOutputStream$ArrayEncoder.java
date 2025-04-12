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
import java.nio.ByteBuffer;

class CodedOutputStream$ArrayEncoder
extends CodedOutputStream {
    private final byte[] buffer;
    private final int limit;
    private final int offset;
    private int position;

    public CodedOutputStream$ArrayEncoder(byte[] object, int n3, int n4) {
        int n7 = 0;
        IllegalArgumentException illegalArgumentException = null;
        super(null);
        if (object != null) {
            n7 = n3 | n4;
            int n8 = ((byte[])object).length;
            int n10 = n3 + n4;
            if ((n7 |= (n8 -= n10)) >= 0) {
                this.buffer = object;
                this.offset = n3;
                this.position = n3;
                this.limit = n10;
                return;
            }
            object = ((byte[])object).length;
            Integer n14 = n3;
            Integer n15 = n4;
            Object[] objectArray = new Object[]{object, n14, n15};
            object = String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", objectArray);
            illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        object = new NullPointerException;
        super("buffer");
        throw object;
    }

    public void flush() {
    }

    public final int getTotalBytesWritten() {
        int n3 = this.position;
        int n4 = this.offset;
        return n3 - n4;
    }

    public final int spaceLeft() {
        int n3 = this.limit;
        int n4 = this.position;
        return n3 - n4;
    }

    public final void write(byte by2) {
        Object object;
        int n3 = 1;
        try {
            object = this.buffer;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new CodedOutputStream$OutOfSpaceException;
            Integer n4 = this.position;
            Integer n7 = this.limit;
            Integer n8 = n3;
            Object[] objectArray = new Object[3];
            objectArray[0] = n4;
            objectArray[n3] = n7;
            objectArray[2] = n8;
            String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            object(string2, indexOutOfBoundsException);
            throw object;
        }
        int n10 = this.position;
        int n14 = n10 + 1;
        this.position = n14;
        object[n10] = by2;
    }

    public final void write(ByteBuffer byteBuffer) {
        Object object;
        int n3 = byteBuffer.remaining();
        try {
            object = this.buffer;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new CodedOutputStream$OutOfSpaceException;
            Integer n4 = this.position;
            Integer n7 = this.limit;
            Object object2 = n3;
            Object[] objectArray = new Object[]{n4, n7, object2};
            object2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            object((String)object2, indexOutOfBoundsException);
            throw object;
        }
        int n8 = this.position;
        byteBuffer.get((byte[])object, n8, n3);
        int n10 = this.position + n3;
        this.position = n10;
    }

    public final void write(byte[] byArray, int n3, int n4) {
        Object object;
        try {
            object = this.buffer;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = this.position;
            Integer n7 = this.limit;
            Object object2 = n4;
            Object[] objectArray = new Object[]{object, n7, object2};
            object2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
            CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException((String)object2, indexOutOfBoundsException);
            throw codedOutputStream$OutOfSpaceException;
        }
        int n8 = this.position;
        System.arraycopy(byArray, n3, object, n8, n4);
        int n10 = this.position + n4;
        this.position = n10;
    }

    public final void writeBool(int n3, boolean bl2) {
        this.writeTag(n3, 0);
        n3 = (byte)(bl2 ? 1 : 0);
        this.write((byte)n3);
    }

    public final void writeByteArray(int n3, byte[] byArray) {
        int n4 = byArray.length;
        this.writeByteArray(n3, byArray, 0, n4);
    }

    public final void writeByteArray(int n3, byte[] byArray, int n4, int n7) {
        this.writeTag(n3, 2);
        this.writeByteArrayNoTag(byArray, n4, n7);
    }

    public final void writeByteArrayNoTag(byte[] byArray, int n3, int n4) {
        this.writeUInt32NoTag(n4);
        this.write(byArray, n3, n4);
    }

    public final void writeByteBuffer(int n3, ByteBuffer byteBuffer) {
        this.writeTag(n3, 2);
        n3 = byteBuffer.capacity();
        this.writeUInt32NoTag(n3);
        this.writeRawBytes(byteBuffer);
    }

    public final void writeBytes(int n3, ByteString byteString) {
        this.writeTag(n3, 2);
        this.writeBytesNoTag(byteString);
    }

    public final void writeBytesNoTag(ByteString byteString) {
        int n3 = byteString.size();
        this.writeUInt32NoTag(n3);
        byteString.writeTo(this);
    }

    public final void writeFixed32(int n3, int n4) {
        this.writeTag(n3, 5);
        this.writeFixed32NoTag(n4);
    }

    public final void writeFixed32NoTag(int n3) {
        Object object;
        int n4 = 3;
        int n7 = 2;
        int n8 = 1;
        try {
            object = this.buffer;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = new CodedOutputStream$OutOfSpaceException;
            Integer n10 = this.position;
            Integer n14 = this.limit;
            Integer n15 = n8;
            Object object2 = new Object[n4];
            object2[0] = n10;
            object2[n8] = n14;
            object2[n7] = n15;
            object2 = String.format("Pos: %d, limit: %d, len: %d", object2);
            object((String)object2, indexOutOfBoundsException);
            throw object;
        }
        int n16 = this.position;
        int n17 = n16 + 1;
        this.position = n17;
        int n18 = n3 & 0xFF;
        object[n16] = n18;
        n18 = n16 + 2;
        this.position = n18;
        byte by2 = (byte)(n3 >> 8 & 0xFF);
        object[n17] = by2;
        n17 = n16 + 3;
        this.position = n17;
        by2 = (byte)(n3 >> 16 & 0xFF);
        object[n18] = by2;
        n16 += 4;
        this.position = n16;
        n3 = (byte)(n3 >> 24 & 0xFF);
        object[n17] = n3;
    }

    public final void writeFixed64(int n3, long l2) {
        this.writeTag(n3, 1);
        this.writeFixed64NoTag(l2);
    }

    public final void writeFixed64NoTag(long l2) {
        Object object;
        int n3 = 3;
        int n4 = 2;
        int n7 = 1;
        try {
            object = this.buffer;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = this.position;
            Integer n8 = this.limit;
            Integer n10 = n7;
            Object object2 = new Object[n3];
            object2[0] = object;
            object2[n7] = n8;
            object2[n4] = n10;
            object2 = String.format("Pos: %d, limit: %d, len: %d", object2);
            CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException((String)object2, indexOutOfBoundsException);
            throw codedOutputStream$OutOfSpaceException;
        }
        int n14 = this.position;
        int n15 = n14 + 1;
        this.position = n15;
        int n16 = (int)l2 & 0xFF;
        object[n14] = n16;
        n16 = n14 + 2;
        this.position = n16;
        int n17 = 8;
        long l3 = l2 >> n17;
        int n18 = (int)l3;
        byte by2 = (byte)(n18 & 0xFF);
        object[n15] = by2;
        n15 = n14 + 3;
        this.position = n15;
        l3 = l2 >> 16;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n16] = by2;
        n16 = n14 + 4;
        this.position = n16;
        l3 = l2 >> 24;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n15] = by2;
        n15 = n14 + 5;
        this.position = n15;
        l3 = l2 >> 32;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n16] = by2;
        n16 = n14 + 6;
        this.position = n16;
        l3 = l2 >> 40;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n15] = by2;
        n15 = n14 + 7;
        this.position = n15;
        l3 = l2 >> 48;
        n18 = (int)l3;
        by2 = (byte)(n18 & 0xFF);
        object[n16] = by2;
        n14 += n17;
        this.position = n14;
        n14 = 56;
        int n19 = (int)(l2 >>= n14);
        byte by4 = (byte)(n19 & 0xFF);
        object[n15] = by4;
    }

    public final void writeInt32(int n3, int n4) {
        this.writeTag(n3, 0);
        this.writeInt32NoTag(n4);
    }

    public final void writeInt32NoTag(int n3) {
        if (n3 >= 0) {
            this.writeUInt32NoTag(n3);
        } else {
            long l2 = n3;
            this.writeUInt64NoTag(l2);
        }
    }

    public final void writeLazy(ByteBuffer byteBuffer) {
        this.write(byteBuffer);
    }

    public final void writeLazy(byte[] byArray, int n3, int n4) {
        this.write(byArray, n3, n4);
    }

    public final void writeMessage(int n3, MessageLite messageLite) {
        this.writeTag(n3, 2);
        this.writeMessageNoTag(messageLite);
    }

    public final void writeMessage(int n3, MessageLite messageLite, Schema schema) {
        this.writeTag(n3, 2);
        Object object = messageLite;
        n3 = ((AbstractMessageLite)messageLite).getSerializedSize(schema);
        this.writeUInt32NoTag(n3);
        object = this.wrapper;
        schema.writeTo(messageLite, (Writer)object);
    }

    public final void writeMessageNoTag(MessageLite messageLite) {
        int n3 = messageLite.getSerializedSize();
        this.writeUInt32NoTag(n3);
        messageLite.writeTo(this);
    }

    public final void writeMessageNoTag(MessageLite messageLite, Schema schema) {
        Object object = messageLite;
        int n3 = ((AbstractMessageLite)messageLite).getSerializedSize(schema);
        this.writeUInt32NoTag(n3);
        object = this.wrapper;
        schema.writeTo(messageLite, (Writer)object);
    }

    public final void writeMessageSetExtension(int n3, MessageLite messageLite) {
        int n4 = 1;
        int n7 = 3;
        this.writeTag(n4, n7);
        this.writeUInt32(2, n3);
        this.writeMessage(n7, messageLite);
        this.writeTag(n4, 4);
    }

    public final void writeRawBytes(ByteBuffer byteBuffer) {
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

    public final void writeRawMessageSetExtension(int n3, ByteString byteString) {
        int n4 = 1;
        int n7 = 3;
        this.writeTag(n4, n7);
        this.writeUInt32(2, n3);
        this.writeBytes(n7, byteString);
        this.writeTag(n4, 4);
    }

    public final void writeString(int n3, String string2) {
        this.writeTag(n3, 2);
        this.writeStringNoTag(string2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void writeStringNoTag(String string2) {
        Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException2;
        int n3;
        block6: {
            IndexOutOfBoundsException indexOutOfBoundsException2;
            block5: {
                int n4;
                int n7;
                block7: {
                    int n8;
                    n3 = this.position;
                    try {
                        n7 = string2.length() * 3;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                        break block5;
                    }
                    catch (Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException2) {
                        break block6;
                    }
                    {
                        n7 = CodedOutputStream.computeUInt32SizeNoTag(n7);
                        n4 = string2.length();
                        n4 = CodedOutputStream.computeUInt32SizeNoTag(n4);
                        if (n4 != n7) break block7;
                        this.position = n7 = n3 + n4;
                        byte[] byArray = this.buffer;
                        int n10 = this.spaceLeft();
                        n7 = Utf8.encode(string2, byArray, n7, n10);
                        this.position = n3;
                        n8 = n7 - n3 - n4;
                    }
                    this.writeUInt32NoTag(n8);
                    this.position = n7;
                    return;
                }
                n7 = Utf8.encodedLength(string2);
                this.writeUInt32NoTag(n7);
                byte[] byArray = this.buffer;
                n4 = this.position;
                int n14 = this.spaceLeft();
                this.position = n7 = Utf8.encode(string2, byArray, n4, n14);
                return;
            }
            CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(indexOutOfBoundsException2);
            throw codedOutputStream$OutOfSpaceException;
        }
        this.position = n3;
        this.inefficientWriteStringNoTag(string2, utf8$UnpairedSurrogateException2);
    }

    public final void writeTag(int n3, int n4) {
        n3 = WireFormat.makeTag(n3, n4);
        this.writeUInt32NoTag(n3);
    }

    public final void writeUInt32(int n3, int n4) {
        this.writeTag(n3, 0);
        this.writeUInt32NoTag(n4);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void writeUInt32NoTag(int n3) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        Object object;
        int n4 = 1;
        while (true) {
            int n7;
            int n8;
            int n10;
            if ((n10 = n3 & 0xFFFFFF80) == 0) {
                try {
                    object = this.buffer;
                    n8 = this.position;
                    this.position = n7 = n8 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                    break;
                }
                n3 = (byte)n3;
                object[n8] = n3;
                return;
            }
            object = this.buffer;
            n8 = this.position;
            this.position = n7 = n8 + 1;
            n7 = (byte)(n3 & 0x7F | 0x80);
            {
                object[n8] = n7;
                n3 >>>= 7;
                continue;
            }
            break;
        }
        object = new CodedOutputStream$OutOfSpaceException;
        Integer n14 = this.position;
        Integer n15 = this.limit;
        Integer n16 = n4;
        Object[] objectArray = new Object[3];
        objectArray[0] = n14;
        objectArray[n4] = n15;
        objectArray[2] = n16;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        object(string2, indexOutOfBoundsException2);
        throw object;
    }

    public final void writeUInt64(int n3, long l2) {
        this.writeTag(n3, 0);
        this.writeUInt64NoTag(l2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void writeUInt64NoTag(long l2) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        Object object;
        int n3;
        int n4 = 1;
        int n7 = CodedOutputStream.access$100();
        int n8 = 7;
        long l3 = 0L;
        long l4 = -128;
        if (n7 != 0 && (n7 = this.spaceLeft()) >= (n3 = 10)) {
            while (true) {
                int n10;
                byte[] byArray;
                long l7;
                long l8;
                if ((n7 = (int)((l8 = (l7 = l2 & l4) - l3) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0) {
                    byArray = this.buffer;
                    n8 = this.position;
                    this.position = n4 += n8;
                    long l12 = n8;
                    byte by2 = (byte)l2;
                    UnsafeUtil.putByte(byArray, l12, by2);
                    return;
                }
                byArray = this.buffer;
                n3 = this.position;
                this.position = n10 = n3 + 1;
                l7 = n3;
                byte by4 = (byte)((int)l2 & 0x7F | 0x80);
                UnsafeUtil.putByte(byArray, l7, by4);
                l2 >>>= n8;
            }
        }
        while (true) {
            int n14;
            long l14;
            long l15;
            if ((n7 = (int)((l15 = (l14 = l2 & l4) - l3) == 0L ? 0 : (l15 < 0L ? -1 : 1))) == 0) {
                try {
                    int n15;
                    object = this.buffer;
                    n8 = this.position;
                    this.position = n15 = n8 + 1;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                    break;
                }
                int n16 = (int)l2;
                byte by5 = (byte)n16;
                object[n8] = by5;
                return;
            }
            object = this.buffer;
            n3 = this.position;
            this.position = n14 = n3 + 1;
            n14 = (byte)((int)l2 & 0x7F | 0x80);
            {
                object[n3] = n14;
                l2 >>>= n8;
                continue;
            }
            break;
        }
        object = this.position;
        Integer n17 = this.limit;
        Integer n18 = n4;
        Object[] objectArray = new Object[3];
        objectArray[0] = object;
        objectArray[n4] = n17;
        objectArray[2] = n18;
        String string2 = String.format("Pos: %d, limit: %d, len: %d", objectArray);
        CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException = new CodedOutputStream$OutOfSpaceException(string2, indexOutOfBoundsException2);
        throw codedOutputStream$OutOfSpaceException;
    }
}

