/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream$1;
import com.google.protobuf.CodedOutputStream$ArrayEncoder;
import com.google.protobuf.CodedOutputStream$ByteOutputEncoder;
import com.google.protobuf.CodedOutputStream$HeapNioEncoder;
import com.google.protobuf.CodedOutputStream$OutOfSpaceException;
import com.google.protobuf.CodedOutputStream$OutputStreamEncoder;
import com.google.protobuf.CodedOutputStream$SafeDirectNioEncoder;
import com.google.protobuf.CodedOutputStream$UnsafeDirectNioEncoder;
import com.google.protobuf.CodedOutputStreamWriter;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyFieldLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.Utf8;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import com.google.protobuf.WireFormat;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream
extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = false;
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private boolean serializationDeterministic;
    CodedOutputStreamWriter wrapper;

    static {
        HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();
    }

    private CodedOutputStream() {
    }

    public /* synthetic */ CodedOutputStream(CodedOutputStream$1 codedOutputStream$1) {
        this();
    }

    public static /* synthetic */ boolean access$100() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    public static int computeBoolSize(int n3, boolean bl2) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeBoolSizeNoTag(bl2) + n3;
    }

    public static int computeBoolSizeNoTag(boolean bl2) {
        return 1;
    }

    public static int computeByteArraySize(int n3, byte[] byArray) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeByteArraySizeNoTag(byArray) + n3;
    }

    public static int computeByteArraySizeNoTag(byte[] byArray) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(byArray.length);
    }

    public static int computeByteBufferSize(int n3, ByteBuffer byteBuffer) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeByteBufferSizeNoTag(byteBuffer) + n3;
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int n3, ByteString byteString) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeBytesSizeNoTag(byteString) + n3;
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int n3, double d2) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeDoubleSizeNoTag(d2) + n3;
    }

    public static int computeDoubleSizeNoTag(double d2) {
        return 8;
    }

    public static int computeEnumSize(int n3, int n4) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeEnumSizeNoTag(n4) + n3;
    }

    public static int computeEnumSizeNoTag(int n3) {
        return CodedOutputStream.computeInt32SizeNoTag(n3);
    }

    public static int computeFixed32Size(int n3, int n4) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeFixed32SizeNoTag(n4) + n3;
    }

    public static int computeFixed32SizeNoTag(int n3) {
        return 4;
    }

    public static int computeFixed64Size(int n3, long l2) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeFixed64SizeNoTag(l2) + n3;
    }

    public static int computeFixed64SizeNoTag(long l2) {
        return 8;
    }

    public static int computeFloatSize(int n3, float f5) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeFloatSizeNoTag(f5) + n3;
    }

    public static int computeFloatSizeNoTag(float f5) {
        return 4;
    }

    public static int computeGroupSize(int n3, MessageLite messageLite) {
        n3 = CodedOutputStream.computeTagSize(n3) * 2;
        return messageLite.getSerializedSize() + n3;
    }

    public static int computeGroupSize(int n3, MessageLite messageLite, Schema schema) {
        n3 = CodedOutputStream.computeTagSize(n3) * 2;
        return CodedOutputStream.computeGroupSizeNoTag(messageLite, schema) + n3;
    }

    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeGroupSizeNoTag(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite)messageLite).getSerializedSize(schema);
    }

    public static int computeInt32Size(int n3, int n4) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeInt32SizeNoTag(n4) + n3;
    }

    public static int computeInt32SizeNoTag(int n3) {
        if (n3 >= 0) {
            return CodedOutputStream.computeUInt32SizeNoTag(n3);
        }
        return 10;
    }

    public static int computeInt64Size(int n3, long l2) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeInt64SizeNoTag(l2) + n3;
    }

    public static int computeInt64SizeNoTag(long l2) {
        return CodedOutputStream.computeUInt64SizeNoTag(l2);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int n3, LazyFieldLite lazyFieldLite) {
        int n4 = CodedOutputStream.computeTagSize(1) * 2;
        n3 = CodedOutputStream.computeUInt32Size(2, n3) + n4;
        return CodedOutputStream.computeLazyFieldSize(3, lazyFieldLite) + n3;
    }

    public static int computeLazyFieldSize(int n3, LazyFieldLite lazyFieldLite) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeLazyFieldSizeNoTag(lazyFieldLite) + n3;
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int n3) {
        return CodedOutputStream.computeUInt32SizeNoTag(n3) + n3;
    }

    public static int computeMessageSetExtensionSize(int n3, MessageLite messageLite) {
        int n4 = CodedOutputStream.computeTagSize(1) * 2;
        n3 = CodedOutputStream.computeUInt32Size(2, n3) + n4;
        return CodedOutputStream.computeMessageSize(3, messageLite) + n3;
    }

    public static int computeMessageSize(int n3, MessageLite messageLite) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeMessageSizeNoTag(messageLite) + n3;
    }

    public static int computeMessageSize(int n3, MessageLite messageLite, Schema schema) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeMessageSizeNoTag(messageLite, schema) + n3;
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite, Schema schema) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(((AbstractMessageLite)messageLite).getSerializedSize(schema));
    }

    public static int computePreferredBufferSize(int n3) {
        int n4 = 4096;
        if (n3 > n4) {
            return n4;
        }
        return n3;
    }

    public static int computeRawMessageSetExtensionSize(int n3, ByteString byteString) {
        int n4 = CodedOutputStream.computeTagSize(1) * 2;
        n3 = CodedOutputStream.computeUInt32Size(2, n3) + n4;
        return CodedOutputStream.computeBytesSize(3, byteString) + n3;
    }

    public static int computeRawVarint32Size(int n3) {
        return CodedOutputStream.computeUInt32SizeNoTag(n3);
    }

    public static int computeRawVarint64Size(long l2) {
        return CodedOutputStream.computeUInt64SizeNoTag(l2);
    }

    public static int computeSFixed32Size(int n3, int n4) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeSFixed32SizeNoTag(n4) + n3;
    }

    public static int computeSFixed32SizeNoTag(int n3) {
        return 4;
    }

    public static int computeSFixed64Size(int n3, long l2) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeSFixed64SizeNoTag(l2) + n3;
    }

    public static int computeSFixed64SizeNoTag(long l2) {
        return 8;
    }

    public static int computeSInt32Size(int n3, int n4) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeSInt32SizeNoTag(n4) + n3;
    }

    public static int computeSInt32SizeNoTag(int n3) {
        return CodedOutputStream.computeUInt32SizeNoTag(CodedOutputStream.encodeZigZag32(n3));
    }

    public static int computeSInt64Size(int n3, long l2) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeSInt64SizeNoTag(l2) + n3;
    }

    public static int computeSInt64SizeNoTag(long l2) {
        return CodedOutputStream.computeUInt64SizeNoTag(CodedOutputStream.encodeZigZag64(l2));
    }

    public static int computeStringSize(int n3, String string2) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeStringSizeNoTag(string2) + n3;
    }

    public static int computeStringSizeNoTag(String object) {
        int n3;
        try {
            n3 = Utf8.encodedLength((CharSequence)object);
        }
        catch (Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException) {
            Charset charset = Internal.UTF_8;
            object = ((String)object).getBytes(charset);
            n3 = ((Object)object).length;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(n3);
    }

    public static int computeTagSize(int n3) {
        return CodedOutputStream.computeUInt32SizeNoTag(WireFormat.makeTag(n3, 0));
    }

    public static int computeUInt32Size(int n3, int n4) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeUInt32SizeNoTag(n4) + n3;
    }

    public static int computeUInt32SizeNoTag(int n3) {
        int n4 = n3 & 0xFFFFFF80;
        if (n4 == 0) {
            return 1;
        }
        n4 = n3 & 0xFFFFC000;
        if (n4 == 0) {
            return 2;
        }
        n4 = 0xFFE00000 & n3;
        if (n4 == 0) {
            return 3;
        }
        n4 = -268435456;
        if ((n3 &= n4) == 0) {
            return 4;
        }
        return 5;
    }

    public static int computeUInt64Size(int n3, long l2) {
        n3 = CodedOutputStream.computeTagSize(n3);
        return CodedOutputStream.computeUInt64SizeNoTag(l2) + n3;
    }

    public static int computeUInt64SizeNoTag(long l2) {
        long l3;
        long l4 = (long)-128 & l2;
        long l7 = 0L;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object == false) {
            return 1;
        }
        Object object2 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        if (object2 < 0) {
            return 10;
        }
        l4 = 0xFFFFFFF800000000L & l2;
        long l12 = l4 - l7;
        object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object != false) {
            l2 >>>= 28;
            object2 = 6;
        } else {
            object2 = 2;
        }
        long l14 = 0xFFE00000L & l2;
        long l15 = l14 == l7 ? 0 : (l14 < l7 ? -1 : 1);
        if (l15 != false) {
            object2 += 2;
            l15 = 14;
            l2 >>>= l15;
        }
        if ((l15 = (l3 = (l2 &= (l14 = -16384L)) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            ++object2;
        }
        return (int)object2;
    }

    public static int encodeZigZag32(int n3) {
        int n4 = n3 << 1;
        return n3 >> 31 ^ n4;
    }

    public static long encodeZigZag64(long l2) {
        long l3 = l2 << 1;
        return l2 >> 63 ^ l3;
    }

    public static CodedOutputStream newInstance(ByteOutput object, int n3) {
        if (n3 >= 0) {
            CodedOutputStream$ByteOutputEncoder codedOutputStream$ByteOutputEncoder = new CodedOutputStream$ByteOutputEncoder((ByteOutput)object, n3);
            return codedOutputStream$ByteOutputEncoder;
        }
        object = new IllegalArgumentException("bufferSize must be positive");
        throw object;
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return CodedOutputStream.newInstance(outputStream, 4096);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int n3) {
        CodedOutputStream$OutputStreamEncoder codedOutputStream$OutputStreamEncoder = new CodedOutputStream$OutputStreamEncoder(outputStream, n3);
        return codedOutputStream$OutputStreamEncoder;
    }

    public static CodedOutputStream newInstance(ByteBuffer object) {
        boolean bl2 = ((ByteBuffer)object).hasArray();
        if (bl2) {
            CodedOutputStream$HeapNioEncoder codedOutputStream$HeapNioEncoder = new CodedOutputStream$HeapNioEncoder((ByteBuffer)object);
            return codedOutputStream$HeapNioEncoder;
        }
        bl2 = ((ByteBuffer)object).isDirect();
        if (bl2 && !(bl2 = ((Buffer)object).isReadOnly())) {
            bl2 = CodedOutputStream$UnsafeDirectNioEncoder.isSupported();
            object = bl2 ? CodedOutputStream.newUnsafeInstance((ByteBuffer)object) : CodedOutputStream.newSafeInstance((ByteBuffer)object);
            return object;
        }
        object = new IllegalArgumentException("ByteBuffer is read-only");
        throw object;
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int n3) {
        return CodedOutputStream.newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(byte[] byArray) {
        int n3 = byArray.length;
        return CodedOutputStream.newInstance(byArray, 0, n3);
    }

    public static CodedOutputStream newInstance(byte[] byArray, int n3, int n4) {
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = new CodedOutputStream$ArrayEncoder(byArray, n3, n4);
        return codedOutputStream$ArrayEncoder;
    }

    public static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        CodedOutputStream$SafeDirectNioEncoder codedOutputStream$SafeDirectNioEncoder = new CodedOutputStream$SafeDirectNioEncoder(byteBuffer);
        return codedOutputStream$SafeDirectNioEncoder;
    }

    public static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        CodedOutputStream$UnsafeDirectNioEncoder codedOutputStream$UnsafeDirectNioEncoder = new CodedOutputStream$UnsafeDirectNioEncoder(byteBuffer);
        return codedOutputStream$UnsafeDirectNioEncoder;
    }

    public final void checkNoSpaceLeft() {
        int n3 = this.spaceLeft();
        if (n3 == 0) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Did not write as much data as expected.");
        throw illegalStateException;
    }

    public abstract void flush();

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String object, Utf8$UnpairedSurrogateException object2) {
        int n3;
        Logger logger = CodedOutputStream.logger;
        Level level = Level.WARNING;
        String string2 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!";
        logger.log(level, string2, (Throwable)object2);
        object2 = Internal.UTF_8;
        object = ((String)object).getBytes((Charset)object2);
        try {
            n3 = ((Object)object).length;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object2 = new CodedOutputStream$OutOfSpaceException(indexOutOfBoundsException);
            throw object2;
        }
        this.writeUInt32NoTag(n3);
        n3 = ((Object)object).length;
        logger = null;
        this.writeLazy((byte[])object, 0, n3);
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    public abstract void write(byte var1);

    public abstract void write(ByteBuffer var1);

    public abstract void write(byte[] var1, int var2, int var3);

    public abstract void writeBool(int var1, boolean var2);

    public final void writeBoolNoTag(boolean bl2) {
        byte by2 = (byte)(bl2 ? 1 : 0);
        this.write(by2);
    }

    public abstract void writeByteArray(int var1, byte[] var2);

    public abstract void writeByteArray(int var1, byte[] var2, int var3, int var4);

    public final void writeByteArrayNoTag(byte[] byArray) {
        int n3 = byArray.length;
        this.writeByteArrayNoTag(byArray, 0, n3);
    }

    public abstract void writeByteArrayNoTag(byte[] var1, int var2, int var3);

    public abstract void writeByteBuffer(int var1, ByteBuffer var2);

    public abstract void writeBytes(int var1, ByteString var2);

    public abstract void writeBytesNoTag(ByteString var1);

    public final void writeDouble(int n3, double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.writeFixed64(n3, l2);
    }

    public final void writeDoubleNoTag(double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        this.writeFixed64NoTag(l2);
    }

    public final void writeEnum(int n3, int n4) {
        this.writeInt32(n3, n4);
    }

    public final void writeEnumNoTag(int n3) {
        this.writeInt32NoTag(n3);
    }

    public abstract void writeFixed32(int var1, int var2);

    public abstract void writeFixed32NoTag(int var1);

    public abstract void writeFixed64(int var1, long var2);

    public abstract void writeFixed64NoTag(long var1);

    public final void writeFloat(int n3, float f5) {
        int n4 = Float.floatToRawIntBits(f5);
        this.writeFixed32(n3, n4);
    }

    public final void writeFloatNoTag(float f5) {
        int n3 = Float.floatToRawIntBits(f5);
        this.writeFixed32NoTag(n3);
    }

    public final void writeGroup(int n3, MessageLite messageLite) {
        this.writeTag(n3, 3);
        this.writeGroupNoTag(messageLite);
        this.writeTag(n3, 4);
    }

    public final void writeGroup(int n3, MessageLite messageLite, Schema schema) {
        this.writeTag(n3, 3);
        this.writeGroupNoTag(messageLite, schema);
        this.writeTag(n3, 4);
    }

    public final void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public final void writeGroupNoTag(MessageLite messageLite, Schema schema) {
        CodedOutputStreamWriter codedOutputStreamWriter = this.wrapper;
        schema.writeTo(messageLite, codedOutputStreamWriter);
    }

    public abstract void writeInt32(int var1, int var2);

    public abstract void writeInt32NoTag(int var1);

    public final void writeInt64(int n3, long l2) {
        this.writeUInt64(n3, l2);
    }

    public final void writeInt64NoTag(long l2) {
        this.writeUInt64NoTag(l2);
    }

    public abstract void writeLazy(ByteBuffer var1);

    public abstract void writeLazy(byte[] var1, int var2, int var3);

    public abstract void writeMessage(int var1, MessageLite var2);

    public abstract void writeMessage(int var1, MessageLite var2, Schema var3);

    public abstract void writeMessageNoTag(MessageLite var1);

    public abstract void writeMessageNoTag(MessageLite var1, Schema var2);

    public abstract void writeMessageSetExtension(int var1, MessageLite var2);

    public final void writeRawByte(byte by2) {
        this.write(by2);
    }

    public final void writeRawByte(int n3) {
        n3 = (byte)n3;
        this.write((byte)n3);
    }

    public final void writeRawBytes(ByteString byteString) {
        byteString.writeTo(this);
    }

    public abstract void writeRawBytes(ByteBuffer var1);

    public final void writeRawBytes(byte[] byArray) {
        int n3 = byArray.length;
        this.write(byArray, 0, n3);
    }

    public final void writeRawBytes(byte[] byArray, int n3, int n4) {
        this.write(byArray, n3, n4);
    }

    public final void writeRawLittleEndian32(int n3) {
        this.writeFixed32NoTag(n3);
    }

    public final void writeRawLittleEndian64(long l2) {
        this.writeFixed64NoTag(l2);
    }

    public abstract void writeRawMessageSetExtension(int var1, ByteString var2);

    public final void writeRawVarint32(int n3) {
        this.writeUInt32NoTag(n3);
    }

    public final void writeRawVarint64(long l2) {
        this.writeUInt64NoTag(l2);
    }

    public final void writeSFixed32(int n3, int n4) {
        this.writeFixed32(n3, n4);
    }

    public final void writeSFixed32NoTag(int n3) {
        this.writeFixed32NoTag(n3);
    }

    public final void writeSFixed64(int n3, long l2) {
        this.writeFixed64(n3, l2);
    }

    public final void writeSFixed64NoTag(long l2) {
        this.writeFixed64NoTag(l2);
    }

    public final void writeSInt32(int n3, int n4) {
        n4 = CodedOutputStream.encodeZigZag32(n4);
        this.writeUInt32(n3, n4);
    }

    public final void writeSInt32NoTag(int n3) {
        n3 = CodedOutputStream.encodeZigZag32(n3);
        this.writeUInt32NoTag(n3);
    }

    public final void writeSInt64(int n3, long l2) {
        l2 = CodedOutputStream.encodeZigZag64(l2);
        this.writeUInt64(n3, l2);
    }

    public final void writeSInt64NoTag(long l2) {
        l2 = CodedOutputStream.encodeZigZag64(l2);
        this.writeUInt64NoTag(l2);
    }

    public abstract void writeString(int var1, String var2);

    public abstract void writeStringNoTag(String var1);

    public abstract void writeTag(int var1, int var2);

    public abstract void writeUInt32(int var1, int var2);

    public abstract void writeUInt32NoTag(int var1);

    public abstract void writeUInt64(int var1, long var2);

    public abstract void writeUInt64NoTag(long var1);
}

