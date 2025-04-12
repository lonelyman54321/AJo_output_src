/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedInputStream$1;
import com.google.protobuf.CodedInputStream$StreamDecoder$RefillCallback;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.Parser;
import com.google.protobuf.Utf8;
import com.google.protobuf.WireFormat;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class CodedInputStream$StreamDecoder
extends CodedInputStream {
    private final byte[] buffer;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit = -1 >>> 1;
    private final InputStream input;
    private int lastTag;
    private int pos;
    private CodedInputStream$StreamDecoder$RefillCallback refillCallback = null;
    private int totalBytesRetired;

    private CodedInputStream$StreamDecoder(InputStream object, int n3) {
        super(null);
        Internal.checkNotNull(object, "input");
        this.input = object;
        object = new byte[n3];
        this.buffer = (byte[])object;
        this.bufferSize = 0;
        this.pos = 0;
        this.totalBytesRetired = 0;
    }

    public /* synthetic */ CodedInputStream$StreamDecoder(InputStream inputStream, int n3, CodedInputStream$1 codedInputStream$1) {
        this(inputStream, n3);
    }

    public static /* synthetic */ int access$500(CodedInputStream$StreamDecoder codedInputStream$StreamDecoder) {
        return codedInputStream$StreamDecoder.pos;
    }

    public static /* synthetic */ byte[] access$600(CodedInputStream$StreamDecoder codedInputStream$StreamDecoder) {
        return codedInputStream$StreamDecoder.buffer;
    }

    private static int available(InputStream inputStream) {
        try {
            return inputStream.available();
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            invalidProtocolBufferException.setThrownFromInputStream();
            throw invalidProtocolBufferException;
        }
    }

    private static int read(InputStream inputStream, byte[] byArray, int n3, int n4) {
        try {
            return inputStream.read(byArray, n3, n4);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            invalidProtocolBufferException.setThrownFromInputStream();
            throw invalidProtocolBufferException;
        }
    }

    private ByteString readBytesSlowPath(int n3) {
        int n4;
        Object object = this.readRawBytesSlowPathOneChunk(n3);
        if (object != null) {
            return ByteString.copyFrom(object);
        }
        int n7 = this.pos;
        int n8 = this.bufferSize;
        int n10 = n8 - n7;
        this.totalBytesRetired = n4 = this.totalBytesRetired + n8;
        n8 = 0;
        this.pos = 0;
        this.bufferSize = 0;
        n4 = n3 - n10;
        Object object2 = this.readRawBytesSlowPathRemainingChunks(n4);
        byte[] byArray = new byte[n3];
        byte[] byArray2 = this.buffer;
        System.arraycopy(byArray2, n7, byArray, 0, n10);
        object = object2.iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (byte[])object.next();
            int n14 = ((Object)object2).length;
            System.arraycopy(object2, 0, byArray, n10, n14);
            n4 = ((Object)object2).length;
            n10 += n4;
        }
        return ByteString.wrap(byArray);
    }

    private byte[] readRawBytesSlowPath(int n3, boolean bl2) {
        int n4;
        Object object = this.readRawBytesSlowPathOneChunk(n3);
        if (object != null) {
            if (bl2) {
                Object byArray = object.clone();
                object = byArray;
                object = (byte[])byArray;
            }
            return object;
        }
        int n7 = this.pos;
        int n8 = this.bufferSize;
        int n10 = n8 - n7;
        this.totalBytesRetired = n4 = this.totalBytesRetired + n8;
        n8 = 0;
        object = null;
        this.pos = 0;
        this.bufferSize = 0;
        n4 = n3 - n10;
        Object object2 = this.readRawBytesSlowPathRemainingChunks(n4);
        byte[] byArray = new byte[n3];
        byte[] byArray2 = this.buffer;
        System.arraycopy(byArray2, n7, byArray, 0, n10);
        Iterator iterator = object2.iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object2 = (byte[])iterator.next();
            int n14 = ((Object)object2).length;
            System.arraycopy(object2, 0, byArray, n10, n14);
            n4 = ((Object)object2).length;
            n10 += n4;
        }
        return byArray;
    }

    private byte[] readRawBytesSlowPathOneChunk(int n3) {
        if (n3 == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        if (n3 >= 0) {
            int n4 = this.totalBytesRetired;
            int n7 = this.pos;
            int n8 = n4 + n7 + n3;
            int n10 = this.sizeLimit;
            if ((n10 = n8 - n10) <= 0) {
                n10 = this.currentLimit;
                if (n8 <= n10) {
                    Object object;
                    n4 = this.bufferSize - n7;
                    n8 = 4096;
                    if ((n7 = n3 - n4) >= n8 && n7 > (n8 = CodedInputStream$StreamDecoder.available((InputStream)(object = this.input)))) {
                        return null;
                    }
                    byte[] byArray = new byte[n3];
                    object = this.buffer;
                    n10 = this.pos;
                    System.arraycopy(object, n10, byArray, 0, n4);
                    n8 = this.totalBytesRetired;
                    n10 = this.bufferSize;
                    this.totalBytesRetired = n8 += n10;
                    this.pos = 0;
                    this.bufferSize = 0;
                    while (n4 < n3) {
                        object = this.input;
                        n10 = n3 - n4;
                        n8 = CodedInputStream$StreamDecoder.read((InputStream)object, byArray, n4, n10);
                        if (n8 != (n10 = -1)) {
                            this.totalBytesRetired = n10 = this.totalBytesRetired + n8;
                            n4 += n8;
                            continue;
                        }
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    return byArray;
                }
                n10 = n10 - n4 - n7;
                this.skipRawBytes(n10);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    private List readRawBytesSlowPathRemainingChunks(int n3) {
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        while (n3 > 0) {
            int n4;
            int n7 = Math.min(n3, 4096);
            byte[] byArray = new byte[n7];
            for (int i3 = 0; i3 < n7; i3 += n4) {
                InputStream inputStream = this.input;
                int n8 = n7 - i3;
                n4 = inputStream.read(byArray, i3, n8);
                if (n4 != (n8 = -1)) {
                    this.totalBytesRetired = n8 = this.totalBytesRetired + n4;
                    continue;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            n3 -= n7;
            arrayList.add(byArray);
        }
        return arrayList;
    }

    private void recomputeBufferSizeAfterLimit() {
        int n3 = this.bufferSize;
        int n4 = this.bufferSizeAfterLimit;
        this.bufferSize = n3 += n4;
        n4 = this.totalBytesRetired + n3;
        int n7 = this.currentLimit;
        if (n4 > n7) {
            this.bufferSizeAfterLimit = n4 -= n7;
            this.bufferSize = n3 -= n4;
        } else {
            n3 = 0;
            this.bufferSizeAfterLimit = 0;
        }
    }

    private void refillBuffer(int n3) {
        int n4 = this.tryRefillBuffer(n3);
        if (n4 == 0) {
            n4 = this.sizeLimit;
            int n7 = this.totalBytesRetired;
            n4 -= n7;
            n7 = this.pos;
            if (n3 > (n4 -= n7)) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private static long skip(InputStream inputStream, long l2) {
        try {
            return inputStream.skip(l2);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            invalidProtocolBufferException.setThrownFromInputStream();
            throw invalidProtocolBufferException;
        }
    }

    private void skipRawBytesSlowPath(int n3) {
        if (n3 >= 0) {
            int n4 = this.totalBytesRetired;
            int n7 = this.pos;
            int n8 = n4 + n7 + n3;
            int n10 = this.currentLimit;
            if (n8 <= n10) {
                Object object = this.refillCallback;
                n10 = 0;
                if (object == null) {
                    this.totalBytesRetired = n4 += n7;
                    n4 = this.bufferSize - n7;
                    this.bufferSize = 0;
                    this.pos = 0;
                    for (n10 = n4; n10 < n3; n10 += n7) {
                        long l2;
                        InputStream inputStream;
                        n4 = n3 - n10;
                        try {
                            inputStream = this.input;
                        }
                        catch (Throwable throwable) {
                            this.totalBytesRetired = n4 = this.totalBytesRetired + n10;
                            this.recomputeBufferSizeAfterLimit();
                            throw throwable;
                        }
                        long l3 = n4;
                        long l4 = CodedInputStream$StreamDecoder.skip(inputStream, l3);
                        long l7 = 0L;
                        n8 = (int)(l4 == l7 ? 0 : (l4 < l7 ? -1 : 1));
                        if (n8 >= 0 && (l2 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) <= 0) {
                            if (n8 == 0) break;
                            n7 = (int)l4;
                            continue;
                        }
                        object = new StringBuilder();
                        Object object2 = this.input;
                        object2 = object2.getClass();
                        ((StringBuilder)object).append(object2);
                        object2 = "#skip returned invalid result: ";
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append(l4);
                        String string2 = "\nThe InputStream implementation is buggy.";
                        ((StringBuilder)object).append(string2);
                        string2 = ((StringBuilder)object).toString();
                        IllegalStateException illegalStateException = new IllegalStateException(string2);
                        throw illegalStateException;
                    }
                    this.totalBytesRetired = n4 = this.totalBytesRetired + n10;
                    this.recomputeBufferSizeAfterLimit();
                }
                if (n10 < n3) {
                    n4 = this.bufferSize;
                    n7 = this.pos;
                    n7 = n4 - n7;
                    this.pos = n4;
                    n4 = 1;
                    this.refillBuffer(n4);
                    while ((n8 = n3 - n7) > (n10 = this.bufferSize)) {
                        n7 += n10;
                        this.pos = n10;
                        this.refillBuffer(n4);
                    }
                    this.pos = n8;
                }
                return;
            }
            n10 = n10 - n4 - n7;
            this.skipRawBytes(n10);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    private void skipRawVarint() {
        int n3 = this.bufferSize;
        int n4 = this.pos;
        if ((n3 -= n4) >= (n4 = 10)) {
            this.skipRawVarintFastPath();
        } else {
            this.skipRawVarintSlowPath();
        }
    }

    private void skipRawVarintFastPath() {
        int n3;
        for (int i3 = 0; i3 < (n3 = 10); ++i3) {
            int n4;
            byte[] byArray = this.buffer;
            int n7 = this.pos;
            this.pos = n4 = n7 + 1;
            n3 = byArray[n7];
            if (n3 < 0) continue;
            return;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    private void skipRawVarintSlowPath() {
        int n3;
        for (int i3 = 0; i3 < (n3 = 10); ++i3) {
            n3 = this.readRawByte();
            if (n3 < 0) continue;
            return;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    private boolean tryRefillBuffer(int n3) {
        int n4 = this.pos;
        int n7 = n4 + n3;
        int n8 = this.bufferSize;
        if (n7 > n8) {
            Object object;
            n7 = this.sizeLimit;
            n8 = this.totalBytesRetired;
            if (n3 > (n7 = n7 - n8 - n4)) {
                return false;
            }
            if ((n8 = n8 + n4 + n3) > (n4 = this.currentLimit)) {
                return false;
            }
            Object object2 = this.refillCallback;
            if (object2 != null) {
                object2.onRefill();
            }
            if ((n4 = this.pos) > 0) {
                n7 = this.bufferSize;
                if (n7 > n4) {
                    object = this.buffer;
                    System.arraycopy(object, n4, object, 0, n7 -= n4);
                }
                this.totalBytesRetired = n7 = this.totalBytesRetired + n4;
                this.bufferSize = n7 = this.bufferSize - n4;
                this.pos = 0;
            }
            object2 = this.input;
            Object object3 = this.buffer;
            n8 = this.bufferSize;
            int n10 = ((byte[])object3).length - n8;
            int n14 = this.sizeLimit;
            int n15 = this.totalBytesRetired;
            n4 = CodedInputStream$StreamDecoder.read((InputStream)object2, (byte[])object3, n8, n10 = Math.min(n10, n14 = n14 - n15 - n8));
            if (n4 != 0 && n4 >= (n7 = -1) && n4 <= (n7 = ((byte[])(object3 = this.buffer)).length)) {
                if (n4 > 0) {
                    this.bufferSize = n7 = this.bufferSize + n4;
                    this.recomputeBufferSizeAfterLimit();
                    n4 = this.bufferSize;
                    n3 = n4 >= n3 ? 1 : (int)(this.tryRefillBuffer(n3) ? 1 : 0);
                    return n3 != 0;
                }
                return false;
            }
            object3 = new StringBuilder;
            ((StringBuilder)object3)();
            object = this.input.getClass();
            ((StringBuilder)object3).append(object);
            ((StringBuilder)object3).append("#read(byte[]) returned invalid result: ");
            ((StringBuilder)object3).append(n4);
            ((StringBuilder)object3).append("\nThe InputStream implementation is buggy.");
            object2 = ((StringBuilder)object3).toString();
            IllegalStateException illegalStateException = new IllegalStateException((String)object2);
            throw illegalStateException;
        }
        String string2 = Gj0.b(n3, "refillBuffer() called when ", " bytes were already available in buffer");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public void checkLastTagWas(int n3) {
        int n4 = this.lastTag;
        if (n4 == n3) {
            return;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    public void enableAliasing(boolean bl2) {
    }

    public int getBytesUntilLimit() {
        int n3 = this.currentLimit;
        int n4 = -1 >>> 1;
        if (n3 == n4) {
            return -1;
        }
        n4 = this.totalBytesRetired;
        int n7 = this.pos;
        return n3 - (n4 += n7);
    }

    public int getLastTag() {
        return this.lastTag;
    }

    public int getTotalBytesRead() {
        int n3 = this.totalBytesRetired;
        int n4 = this.pos;
        return n3 + n4;
    }

    public boolean isAtEnd() {
        int n3 = this.pos;
        int n4 = this.bufferSize;
        if (n3 != n4 || (n4 = (int)(this.tryRefillBuffer(n3 = 1) ? 1 : 0)) != 0) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public void popLimit(int n3) {
        this.currentLimit = n3;
        this.recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int n3) {
        if (n3 >= 0) {
            int n4 = this.totalBytesRetired;
            int n7 = this.pos;
            if ((n4 = n4 + n7 + n3) <= (n3 = this.currentLimit)) {
                this.currentLimit = n4;
                this.recomputeBufferSizeAfterLimit();
                return n3;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public boolean readBool() {
        long l2;
        long l3 = this.readRawVarint64();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        return bl2;
    }

    public byte[] readByteArray() {
        int n3 = this.readRawVarint32();
        int n4 = this.bufferSize;
        int n7 = this.pos;
        if (n3 <= (n4 -= n7) && n3 > 0) {
            byte[] byArray = this.buffer;
            int n8 = n7 + n3;
            byArray = Arrays.copyOfRange(byArray, n7, n8);
            this.pos = n7 = this.pos + n3;
            return byArray;
        }
        if (n3 >= 0) {
            return this.readRawBytesSlowPath(n3, false);
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public ByteBuffer readByteBuffer() {
        int n3 = this.readRawVarint32();
        int n4 = this.bufferSize;
        int n7 = this.pos;
        if (n3 <= (n4 -= n7) && n3 > 0) {
            Object object = this.buffer;
            int n8 = n7 + n3;
            object = ByteBuffer.wrap(Arrays.copyOfRange(object, n7, n8));
            this.pos = n7 = this.pos + n3;
            return object;
        }
        if (n3 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (n3 >= 0) {
            return ByteBuffer.wrap(this.readRawBytesSlowPath(n3, true));
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public ByteString readBytes() {
        int n3 = this.readRawVarint32();
        int n4 = this.bufferSize;
        int n7 = this.pos;
        if (n3 <= (n4 -= n7) && n3 > 0) {
            ByteString byteString = ByteString.copyFrom(this.buffer, n7, n3);
            this.pos = n7 = this.pos + n3;
            return byteString;
        }
        if (n3 == 0) {
            return ByteString.EMPTY;
        }
        if (n3 >= 0) {
            return this.readBytesSlowPath(n3);
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public double readDouble() {
        return Double.longBitsToDouble(this.readRawLittleEndian64());
    }

    public int readEnum() {
        return this.readRawVarint32();
    }

    public int readFixed32() {
        return this.readRawLittleEndian32();
    }

    public long readFixed64() {
        return this.readRawLittleEndian64();
    }

    public float readFloat() {
        return Float.intBitsToFloat(this.readRawLittleEndian32());
    }

    public MessageLite readGroup(int n3, Parser object, ExtensionRegistryLite extensionRegistryLite) {
        int n4;
        this.checkRecursionLimit();
        this.recursionDepth = n4 = this.recursionDepth + 1;
        object = (MessageLite)object.parsePartialFrom(this, extensionRegistryLite);
        n3 = WireFormat.makeTag(n3, 4);
        this.checkLastTagWas(n3);
        this.recursionDepth = n3 = this.recursionDepth + -1;
        return object;
    }

    public void readGroup(int n3, MessageLite$Builder messageLite$Builder, ExtensionRegistryLite extensionRegistryLite) {
        int n4;
        this.checkRecursionLimit();
        this.recursionDepth = n4 = this.recursionDepth + 1;
        messageLite$Builder.mergeFrom(this, extensionRegistryLite);
        n3 = WireFormat.makeTag(n3, 4);
        this.checkLastTagWas(n3);
        this.recursionDepth = n3 = this.recursionDepth + -1;
    }

    public int readInt32() {
        return this.readRawVarint32();
    }

    public long readInt64() {
        return this.readRawVarint64();
    }

    public MessageLite readMessage(Parser object, ExtensionRegistryLite extensionRegistryLite) {
        int n3;
        int n4;
        int n7 = this.readRawVarint32();
        this.checkRecursionLimit();
        n7 = this.pushLimit(n7);
        this.recursionDepth = n4 = this.recursionDepth + 1;
        object = (MessageLite)object.parsePartialFrom(this, extensionRegistryLite);
        extensionRegistryLite = null;
        this.checkLastTagWas(0);
        this.recursionDepth = n3 = this.recursionDepth + -1;
        n3 = this.getBytesUntilLimit();
        if (n3 == 0) {
            this.popLimit(n7);
            return object;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public void readMessage(MessageLite$Builder messageLite$Builder, ExtensionRegistryLite extensionRegistryLite) {
        int n3;
        int n4;
        int n7 = this.readRawVarint32();
        this.checkRecursionLimit();
        n7 = this.pushLimit(n7);
        this.recursionDepth = n4 = this.recursionDepth + 1;
        messageLite$Builder.mergeFrom(this, extensionRegistryLite);
        messageLite$Builder = null;
        this.checkLastTagWas(0);
        this.recursionDepth = n3 = this.recursionDepth + -1;
        n3 = this.getBytesUntilLimit();
        if (n3 == 0) {
            this.popLimit(n7);
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public byte readRawByte() {
        int n3;
        int n4 = this.pos;
        int n7 = this.bufferSize;
        if (n4 == n7) {
            n4 = 1;
            this.refillBuffer(n4);
        }
        byte[] byArray = this.buffer;
        n7 = this.pos;
        this.pos = n3 = n7 + 1;
        return byArray[n7];
    }

    public byte[] readRawBytes(int n3) {
        int n4 = this.pos;
        int n7 = this.bufferSize - n4;
        if (n3 <= n7 && n3 > 0) {
            this.pos = n3 += n4;
            return Arrays.copyOfRange(this.buffer, n4, n3);
        }
        return this.readRawBytesSlowPath(n3, false);
    }

    public int readRawLittleEndian32() {
        int n3 = this.pos;
        int n4 = this.bufferSize - n3;
        int n7 = 4;
        if (n4 < n7) {
            this.refillBuffer(n7);
            n3 = this.pos;
        }
        byte[] byArray = this.buffer;
        this.pos = n7 = n3 + 4;
        n7 = byArray[n3] & 0xFF;
        int n8 = n3 + 1;
        n8 = (byArray[n8] & 0xFF) << 8;
        n7 |= n8;
        n8 = n3 + 2;
        n8 = (byArray[n8] & 0xFF) << 16;
        return (byArray[n3 += 3] & 0xFF) << 24 | (n7 |= n8);
    }

    public long readRawLittleEndian64() {
        int n3;
        int n4 = this.pos;
        int n7 = this.bufferSize - n4;
        int n8 = 8;
        if (n7 < n8) {
            this.refillBuffer(n8);
            n4 = this.pos;
        }
        byte[] byArray = this.buffer;
        this.pos = n3 = n4 + 8;
        long l2 = byArray[n4];
        long l3 = 255L;
        int n10 = n4 + 1;
        long l4 = ((long)byArray[n10] & l3) << n8;
        long l7 = (l2 &= l3) | l4;
        int n14 = n4 + 2;
        l4 = ((long)byArray[n14] & l3) << 16;
        l7 |= l4;
        n14 = n4 + 3;
        l4 = ((long)byArray[n14] & l3) << 24;
        l7 |= l4;
        n14 = n4 + 4;
        l4 = ((long)byArray[n14] & l3) << 32;
        l7 |= l4;
        n14 = n4 + 5;
        l4 = ((long)byArray[n14] & l3) << 40;
        l7 |= l4;
        n14 = n4 + 6;
        l4 = ((long)byArray[n14] & l3) << 48;
        return ((long)byArray[n4 += 7] & l3) << 56 | (l7 |= l4);
    }

    /*
     * Unable to fully structure code
     */
    public int readRawVarint32() {
        block9: {
            block13: {
                block12: {
                    block14: {
                        block10: {
                            block11: {
                                var2_2 = this.bufferSize;
                                var1_1 = this.pos;
                                if (var2_2 == var1_1) break block10;
                                var3_3 = this.buffer;
                                var4_4 = var1_1 + 1;
                                var5_5 = var3_3[var1_1];
                                if (var5_5 >= 0) {
                                    this.pos = var4_4;
                                    return var5_5;
                                }
                                var6_6 = 9;
                                if ((var2_2 -= var4_4) < var6_6) break block10;
                                var2_2 = var1_1 + 2;
                                if ((var4_4 = var3_3[var4_4] << 7 ^ var5_5) >= 0) break block11;
                                var1_1 = var4_4 ^ -128;
                                break block9;
                            }
                            var5_5 = var1_1 + 3;
                            if ((var2_2 = var3_3[var2_2] << 14 ^ var4_4) >= 0) {
                                var1_1 = var2_2 ^ 16256;
lbl20:
                                // 2 sources

                                while (true) {
                                    var2_2 = var5_5;
                                    break block9;
                                    break;
                                }
                            }
                            var4_4 = var1_1 + 4;
                            if ((var2_2 ^= (var5_5 = var3_3[var5_5] << 21)) < 0) {
                                var1_1 = -2080896 ^ var2_2;
lbl26:
                                // 2 sources

                                while (true) {
                                    var2_2 = var4_4;
                                    break block9;
                                    break;
                                }
                            }
                            var5_5 = var1_1 + 5;
                            var4_4 = var3_3[var4_4];
                            var6_6 = var4_4 << 28;
                            var2_2 ^= var6_6;
                            var6_6 = 266354560;
                            var2_2 ^= var6_6;
                            if (var4_4 >= 0) break block12;
                            var4_4 = var1_1 + 6;
                            if ((var5_5 = var3_3[var5_5]) >= 0) break block13;
                            var5_5 = var1_1 + 7;
                            if ((var4_4 = var3_3[var4_4]) >= 0) break block12;
                            var4_4 = var1_1 + 8;
                            if ((var5_5 = var3_3[var5_5]) >= 0) break block13;
                            var5_5 = var1_1 + 9;
                            if ((var4_4 = var3_3[var4_4]) >= 0) break block12;
                            var1_1 += 10;
                            var7_7 = var3_3[var5_5];
                            if (var7_7 >= 0) break block14;
                        }
                        return (int)this.readRawVarint64SlowPath();
                    }
                    var8_8 = var2_2;
                    var2_2 = var1_1;
                    var1_1 = var8_8;
                    break block9;
                }
                var1_1 = var2_2;
                ** while (true)
            }
            var1_1 = var2_2;
            ** while (true)
        }
        this.pos = var2_2;
        return var1_1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long readRawVarint64() {
        block11: {
            block16: {
                block17: {
                    block12: {
                        block15: {
                            block14: {
                                block13: {
                                    var2_2 = this.bufferSize;
                                    var1_1 = this.pos;
                                    if (var2_2 == var1_1) break block12;
                                    var3_3 = this.buffer;
                                    var4_4 = var1_1 + 1;
                                    var5_5 = var3_3[var1_1];
                                    if (var5_5 >= 0) {
                                        this.pos = var4_4;
                                        return var5_5;
                                    }
                                    var6_6 = 9;
                                    if ((var2_2 -= var4_4) < var6_6) break block12;
                                    var2_2 = var1_1 + 2;
                                    if ((var4_4 = var3_3[var4_4] << 7 ^ var5_5) >= 0) break block13;
                                    var1_1 = var4_4 ^ -128;
                                    var7_7 = var1_1;
                                    break block11;
                                }
                                var5_5 = var1_1 + 3;
                                if ((var2_2 = var3_3[var2_2] << 14 ^ var4_4) < 0) break block14;
                                var1_1 = var2_2 ^ 16256;
                                var7_7 = var1_1;
                                var2_2 = var5_5;
                                break block11;
                            }
                            var4_4 = var1_1 + 4;
                            if ((var2_2 ^= (var5_5 = var3_3[var5_5] << 21)) >= 0) break block15;
                            var1_1 = -2080896 ^ var2_2;
                            var9_8 = var1_1;
                            var2_2 = var4_4;
                            var7_7 = var9_8;
                            break block11;
                        }
                        var11_10 = var2_2;
                        var2_2 = var1_1 + 5;
                        var13_11 = var3_3[var4_4];
                        var4_4 = 28;
                        var15_12 = var11_10 ^ (var13_11 <<= var4_4);
                        var17_13 = 0L;
                        cfr_temp_0 = var15_12 - var17_13;
                        var19_14 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var19_14 /* !! */  >= 0) {
                            var17_13 = 266354560L;
lbl43:
                            // 2 sources

                            while (true) {
                                var7_7 = var15_12 ^ var17_13;
                                break block11;
                                break;
                            }
                        }
                        var19_14 /* !! */  = var1_1 + 6;
                        var20_15 = (long)var3_3[var2_2] << 35;
                        cfr_temp_1 = (var15_12 ^= var20_15) - var17_13;
                        if ((var2_2 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) < 0) {
                            var9_9 = -34093383808L;
lbl51:
                            // 2 sources

                            while (true) {
                                var7_7 = var15_12 ^ var9_9;
                                var2_2 = (int)var19_14 /* !! */ ;
                                break block11;
                                break;
                            }
                        }
                        var2_2 = var1_1 + 7;
                        var22_16 = var3_3[var19_14 /* !! */ ];
                        var24_17 = 42;
                        cfr_temp_2 = (var15_12 ^= (var22_16 <<= var24_17)) - var17_13;
                        var19_14 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                        if (var19_14 /* !! */  >= 0) {
                            var17_13 = 4363953127296L;
                            ** continue;
                        }
                        var19_14 /* !! */  = var1_1 + 8;
                        var20_15 = (long)var3_3[var2_2] << 49;
                        cfr_temp_3 = (var15_12 ^= var20_15) - var17_13;
                        if ((var2_2 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) < 0) {
                            var9_9 = -558586000294016L;
                            ** continue;
                        }
                        var2_2 = var1_1 + 9;
                        var22_16 = var3_3[var19_14 /* !! */ ];
                        var24_17 = 56;
                        var15_12 ^= (var22_16 <<= var24_17);
                        var22_16 = 71499008037633920L;
                        cfr_temp_4 = (var15_12 ^= var22_16) - var17_13;
                        var19_14 /* !! */  = (long)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                        if (var19_14 /* !! */  >= 0) break block16;
                        var1_1 += 10;
                        var25_18 = var2_2 = var3_3[var2_2];
                        cfr_temp_5 = var25_18 - var17_13;
                        var19_14 /* !! */  = (long)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                        if (var19_14 /* !! */  >= 0) break block17;
                    }
                    return this.readRawVarint64SlowPath();
                }
                var2_2 = var1_1;
            }
            var7_7 = var15_12;
        }
        this.pos = var2_2;
        return var7_7;
    }

    public long readRawVarint64SlowPath() {
        int n3;
        long l2 = 0L;
        for (int i3 = 0; i3 < (n3 = 64); i3 += 7) {
            n3 = this.readRawByte();
            int n4 = n3 & 0x7F;
            long l3 = (long)n4 << i3;
            l2 |= l3;
            if ((n3 &= 0x80) != 0) continue;
            return l2;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public int readSFixed32() {
        return this.readRawLittleEndian32();
    }

    public long readSFixed64() {
        return this.readRawLittleEndian64();
    }

    public int readSInt32() {
        return CodedInputStream.decodeZigZag32(this.readRawVarint32());
    }

    public long readSInt64() {
        return CodedInputStream.decodeZigZag64(this.readRawVarint64());
    }

    public String readString() {
        int n3;
        int n4;
        int n7 = this.readRawVarint32();
        if (n7 > 0) {
            n4 = this.bufferSize;
            n3 = this.pos;
            if (n7 <= (n4 -= n3)) {
                byte[] byArray = this.buffer;
                Charset charset = Internal.UTF_8;
                String string2 = new String(byArray, n3, n7, charset);
                this.pos = n3 = this.pos + n7;
                return string2;
            }
        }
        if (n7 == 0) {
            return "";
        }
        if (n7 >= 0) {
            n4 = this.bufferSize;
            if (n7 <= n4) {
                this.refillBuffer(n7);
                byte[] byArray = this.buffer;
                int n8 = this.pos;
                Charset charset = Internal.UTF_8;
                String string3 = new String(byArray, n8, n7, charset);
                this.pos = n3 = this.pos + n7;
                return string3;
            }
            byte[] byArray = this.readRawBytesSlowPath(n7, false);
            Charset charset = Internal.UTF_8;
            String string4 = new String(byArray, charset);
            return string4;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public String readStringRequireUtf8() {
        block8: {
            byte[] byArray;
            int n3;
            int n4;
            block7: {
                int n7;
                block6: {
                    int n8;
                    n4 = this.readRawVarint32();
                    if (n4 > (n8 = (n7 = this.bufferSize) - (n3 = this.pos)) || n4 <= 0) break block6;
                    byArray = this.buffer;
                    this.pos = n8 = n3 + n4;
                    break block7;
                }
                if (n4 == 0) {
                    return "";
                }
                if (n4 < 0) break block8;
                n3 = 0;
                if (n4 <= n7) {
                    this.refillBuffer(n4);
                    byArray = this.buffer;
                    this.pos = n4;
                } else {
                    byArray = this.readRawBytesSlowPath(n4, false);
                }
            }
            return Utf8.decodeUtf8(byArray, n3, n4);
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public int readTag() {
        int n3 = this.isAtEnd();
        if (n3 != 0) {
            this.lastTag = 0;
            return 0;
        }
        this.lastTag = n3 = this.readRawVarint32();
        if ((n3 = WireFormat.getTagFieldNumber(n3)) != 0) {
            return this.lastTag;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public int readUInt32() {
        return this.readRawVarint32();
    }

    public long readUInt64() {
        return this.readRawVarint64();
    }

    public void readUnknownGroup(int n3, MessageLite$Builder messageLite$Builder) {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.getEmptyRegistry();
        this.readGroup(n3, messageLite$Builder, extensionRegistryLite);
    }

    public void resetSizeCounter() {
        int n3;
        this.totalBytesRetired = n3 = -this.pos;
    }

    public boolean skipField(int n3) {
        int n4 = WireFormat.getTagWireType(n3);
        int n7 = 1;
        if (n4) {
            if (n4 != n7) {
                int n8 = 2;
                if (n4 != n8) {
                    n8 = 3;
                    int n10 = 4;
                    if (n4 != n8) {
                        if (n4 != n10) {
                            n3 = 5;
                            if (n4 == n3) {
                                this.skipRawBytes(n10);
                                return n7;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    this.skipMessage();
                    n3 = WireFormat.makeTag(WireFormat.getTagFieldNumber(n3), n10);
                    this.checkLastTagWas(n3);
                    return n7;
                }
                n3 = this.readRawVarint32();
                this.skipRawBytes(n3);
                return n7;
            }
            this.skipRawBytes(8);
            return n7;
        }
        this.skipRawVarint();
        return n7;
    }

    public boolean skipField(int n3, CodedOutputStream codedOutputStream) {
        int bl2 = WireFormat.getTagWireType(n3);
        int n4 = 1;
        if (bl2) {
            if (bl2 != n4) {
                int n7 = 2;
                if (bl2 != n7) {
                    int n8 = 3;
                    int n10 = 4;
                    if (bl2 != n8) {
                        if (bl2 != n10) {
                            int n14 = 5;
                            if (bl2 == n14) {
                                int n15 = this.readRawLittleEndian32();
                                codedOutputStream.writeUInt32NoTag(n3);
                                codedOutputStream.writeFixed32NoTag(n15);
                                return n4;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    codedOutputStream.writeUInt32NoTag(n3);
                    this.skipMessage(codedOutputStream);
                    n3 = WireFormat.makeTag(WireFormat.getTagFieldNumber(n3), n10);
                    this.checkLastTagWas(n3);
                    codedOutputStream.writeUInt32NoTag(n3);
                    return n4;
                }
                ByteString byteString = this.readBytes();
                codedOutputStream.writeUInt32NoTag(n3);
                codedOutputStream.writeBytesNoTag(byteString);
                return n4;
            }
            long l2 = this.readRawLittleEndian64();
            codedOutputStream.writeUInt32NoTag(n3);
            codedOutputStream.writeFixed64NoTag(l2);
            return n4;
        }
        long l3 = this.readInt64();
        codedOutputStream.writeUInt32NoTag(n3);
        codedOutputStream.writeUInt64NoTag(l3);
        return n4;
    }

    public void skipRawBytes(int n3) {
        int n4 = this.bufferSize;
        int n7 = this.pos;
        if (n3 <= (n4 -= n7) && n3 >= 0) {
            this.pos = n7 += n3;
        } else {
            this.skipRawBytesSlowPath(n3);
        }
    }
}

