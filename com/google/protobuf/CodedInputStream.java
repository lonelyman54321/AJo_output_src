/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream$1;
import com.google.protobuf.CodedInputStream$ArrayDecoder;
import com.google.protobuf.CodedInputStream$IterableDirectByteBufferDecoder;
import com.google.protobuf.CodedInputStream$StreamDecoder;
import com.google.protobuf.CodedInputStream$UnsafeDirectNioDecoder;
import com.google.protobuf.CodedInputStreamReader;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.IterableByteBufferInputStream;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    CodedInputStreamReader wrapper;

    private CodedInputStream() {
        int n3;
        this.recursionLimit = n3 = defaultRecursionLimit;
        this.sizeLimit = -1 >>> 1;
        this.shouldDiscardUnknownFields = false;
    }

    public /* synthetic */ CodedInputStream(CodedInputStream$1 codedInputStream$1) {
        this();
    }

    public static int decodeZigZag32(int n3) {
        int n4 = n3 >>> 1;
        return -(n3 & 1) ^ n4;
    }

    public static long decodeZigZag64(long l2) {
        long l3 = l2 >>> 1;
        return -(l2 & 1L) ^ l3;
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return CodedInputStream.newInstance(inputStream, 4096);
    }

    public static CodedInputStream newInstance(InputStream object, int n3) {
        if (n3 > 0) {
            if (object == null) {
                return CodedInputStream.newInstance(Internal.EMPTY_BYTE_ARRAY);
            }
            CodedInputStream$StreamDecoder codedInputStream$StreamDecoder = new CodedInputStream$StreamDecoder((InputStream)object, n3, null);
            return codedInputStream$StreamDecoder;
        }
        object = new IllegalArgumentException("bufferSize must be > 0");
        throw object;
    }

    public static CodedInputStream newInstance(Iterable iterable) {
        boolean bl2 = CodedInputStream$UnsafeDirectNioDecoder.isSupported();
        if (!bl2) {
            IterableByteBufferInputStream iterableByteBufferInputStream = new IterableByteBufferInputStream(iterable);
            return CodedInputStream.newInstance(iterableByteBufferInputStream);
        }
        return CodedInputStream.newInstance(iterable, false);
    }

    public static CodedInputStream newInstance(Iterable iterable, boolean bl2) {
        boolean bl3;
        Object object = iterable.iterator();
        int n3 = 0;
        int n4 = 0;
        while (bl3 = object.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer)object.next();
            int n7 = byteBuffer.remaining();
            n4 += n7;
            n7 = (int)(byteBuffer.hasArray() ? 1 : 0);
            if (n7 != 0) {
                n3 |= 1;
                continue;
            }
            bl3 = byteBuffer.isDirect();
            if (bl3) {
                n3 |= 2;
                continue;
            }
            n3 |= 4;
        }
        int n8 = 2;
        if (n3 == n8) {
            object = new CodedInputStream$IterableDirectByteBufferDecoder(iterable, n4, bl2, null);
            return object;
        }
        IterableByteBufferInputStream iterableByteBufferInputStream = new IterableByteBufferInputStream(iterable);
        return CodedInputStream.newInstance(iterableByteBufferInputStream);
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return CodedInputStream.newInstance(byteBuffer, false);
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean bl2) {
        boolean bl3 = byteBuffer.hasArray();
        if (bl3) {
            byte[] codedInputStream$UnsafeDirectNioDecoder = byteBuffer.array();
            int n3 = byteBuffer.arrayOffset();
            int n4 = byteBuffer.position() + n3;
            int n7 = byteBuffer.remaining();
            return CodedInputStream.newInstance(codedInputStream$UnsafeDirectNioDecoder, n4, n7, bl2);
        }
        bl3 = byteBuffer.isDirect();
        if (bl3 && (bl3 = CodedInputStream$UnsafeDirectNioDecoder.isSupported())) {
            CodedInputStream$UnsafeDirectNioDecoder byArray = new CodedInputStream$UnsafeDirectNioDecoder(byteBuffer, bl2, null);
            return byArray;
        }
        int n8 = byteBuffer.remaining();
        byte[] byArray = new byte[n8];
        byteBuffer.duplicate().get(byArray);
        return CodedInputStream.newInstance(byArray, 0, n8, true);
    }

    public static CodedInputStream newInstance(byte[] byArray) {
        int n3 = byArray.length;
        return CodedInputStream.newInstance(byArray, 0, n3);
    }

    public static CodedInputStream newInstance(byte[] byArray, int n3, int n4) {
        return CodedInputStream.newInstance(byArray, n3, n4, false);
    }

    public static CodedInputStream newInstance(byte[] byArray, int n3, int n4, boolean bl2) {
        CodedInputStream$ArrayDecoder codedInputStream$ArrayDecoder = new CodedInputStream$ArrayDecoder(byArray, n3, n4, bl2, null);
        try {
            codedInputStream$ArrayDecoder.pushLimit(n4);
            return codedInputStream$ArrayDecoder;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(invalidProtocolBufferException);
            throw illegalArgumentException;
        }
    }

    public static int readRawVarint32(int n3, InputStream inputStream) {
        int n4;
        int n7;
        int n8;
        block6: {
            n8 = n3 & 0x80;
            if (n8 == 0) {
                return n3;
            }
            n3 &= 0x7F;
            n8 = 7;
            while (true) {
                n7 = 32;
                n4 = -1;
                if (n8 >= n7) break block6;
                n7 = inputStream.read();
                if (n7 == n4) break;
                n4 = (n7 & 0x7F) << n8;
                n3 |= n4;
                if ((n7 &= 0x80) == 0) {
                    return n3;
                }
                n8 += 7;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        while (n8 < (n7 = 64)) {
            n7 = inputStream.read();
            if (n7 != n4) {
                if ((n7 &= 0x80) == 0) {
                    return n3;
                }
                n8 += 7;
                continue;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public static int readRawVarint32(InputStream inputStream) {
        int n3;
        int n4 = inputStream.read();
        if (n4 != (n3 = -1)) {
            return CodedInputStream.readRawVarint32(n4, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public abstract void checkLastTagWas(int var1);

    public void checkRecursionLimit() {
        int n3 = this.recursionDepth;
        int n4 = this.recursionLimit;
        if (n3 < n4) {
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean var1);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd();

    public abstract void popLimit(int var1);

    public abstract int pushLimit(int var1);

    public abstract boolean readBool();

    public abstract byte[] readByteArray();

    public abstract ByteBuffer readByteBuffer();

    public abstract ByteString readBytes();

    public abstract double readDouble();

    public abstract int readEnum();

    public abstract int readFixed32();

    public abstract long readFixed64();

    public abstract float readFloat();

    public abstract MessageLite readGroup(int var1, Parser var2, ExtensionRegistryLite var3);

    public abstract void readGroup(int var1, MessageLite$Builder var2, ExtensionRegistryLite var3);

    public abstract int readInt32();

    public abstract long readInt64();

    public abstract MessageLite readMessage(Parser var1, ExtensionRegistryLite var2);

    public abstract void readMessage(MessageLite$Builder var1, ExtensionRegistryLite var2);

    public abstract byte readRawByte();

    public abstract byte[] readRawBytes(int var1);

    public abstract int readRawLittleEndian32();

    public abstract long readRawLittleEndian64();

    public abstract int readRawVarint32();

    public abstract long readRawVarint64();

    public abstract long readRawVarint64SlowPath();

    public abstract int readSFixed32();

    public abstract long readSFixed64();

    public abstract int readSInt32();

    public abstract long readSInt64();

    public abstract String readString();

    public abstract String readStringRequireUtf8();

    public abstract int readTag();

    public abstract int readUInt32();

    public abstract long readUInt64();

    public abstract void readUnknownGroup(int var1, MessageLite$Builder var2);

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int n3) {
        if (n3 >= 0) {
            int n4 = this.recursionLimit;
            this.recursionLimit = n3;
            return n4;
        }
        String string2 = hj0_0.a(n3, "Recursion limit cannot be negative: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final int setSizeLimit(int n3) {
        if (n3 >= 0) {
            int n4 = this.sizeLimit;
            this.sizeLimit = n3;
            return n4;
        }
        String string2 = hj0_0.a(n3, "Size limit cannot be negative: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int var1);

    public abstract boolean skipField(int var1, CodedOutputStream var2);

    public void skipMessage() {
        int n3;
        do {
            int n4;
            if ((n3 = this.readTag()) == 0) {
                return;
            }
            this.checkRecursionLimit();
            this.recursionDepth = n4 = this.recursionDepth + 1;
            n3 = (int)(this.skipField(n3) ? 1 : 0);
            this.recursionDepth = n4 = this.recursionDepth + -1;
        } while (n3 != 0);
    }

    public void skipMessage(CodedOutputStream codedOutputStream) {
        int n3;
        do {
            int n4;
            if ((n3 = this.readTag()) == 0) {
                return;
            }
            this.checkRecursionLimit();
            this.recursionDepth = n4 = this.recursionDepth + 1;
            n3 = (int)(this.skipField(n3, codedOutputStream) ? 1 : 0);
            this.recursionDepth = n4 = this.recursionDepth + -1;
        } while (n3 != 0);
    }

    public abstract void skipRawBytes(int var1);

    public final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }
}

