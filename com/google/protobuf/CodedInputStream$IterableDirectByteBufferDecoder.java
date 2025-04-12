/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedInputStream$1;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.Utf8;
import com.google.protobuf.WireFormat;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

final class CodedInputStream$IterableDirectByteBufferDecoder
extends CodedInputStream {
    private int bufferSizeAfterCurrentLimit;
    private long currentAddress;
    private ByteBuffer currentByteBuffer;
    private long currentByteBufferLimit;
    private long currentByteBufferPos;
    private long currentByteBufferStartPos;
    private int currentLimit;
    private boolean enableAliasing;
    private final boolean immutable;
    private final Iterable input;
    private final Iterator iterator;
    private int lastTag;
    private int startOffset;
    private int totalBufferSize;
    private int totalBytesRead;

    private CodedInputStream$IterableDirectByteBufferDecoder(Iterable object, int n3, boolean bl2) {
        super(null);
        int n4;
        this.currentLimit = n4 = -1 >>> 1;
        this.totalBufferSize = n3;
        this.input = object;
        this.iterator = object = object.iterator();
        this.immutable = bl2;
        object = null;
        this.totalBytesRead = 0;
        this.startOffset = 0;
        if (n3 == 0) {
            long l2;
            this.currentByteBuffer = object = Internal.EMPTY_BYTE_BUFFER;
            this.currentByteBufferPos = l2 = 0L;
            this.currentByteBufferStartPos = l2;
            this.currentByteBufferLimit = l2;
            this.currentAddress = l2;
        } else {
            this.tryGetNextByteBuffer();
        }
    }

    public /* synthetic */ CodedInputStream$IterableDirectByteBufferDecoder(Iterable iterable, int n3, boolean bl2, CodedInputStream$1 codedInputStream$1) {
        this(iterable, n3, bl2);
    }

    private long currentRemaining() {
        long l2 = this.currentByteBufferLimit;
        long l3 = this.currentByteBufferPos;
        return l2 - l3;
    }

    private void getNextByteBuffer() {
        Iterator iterator = this.iterator;
        boolean bl2 = iterator.hasNext();
        if (bl2) {
            this.tryGetNextByteBuffer();
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    private void readRawBytesTo(byte[] byArray, int n3, int n4) {
        int n7;
        if (n4 >= 0 && n4 <= (n7 = this.remaining())) {
            int n8;
            for (n7 = n4; n7 > 0; n7 -= n8) {
                long l2;
                long l3 = this.currentRemaining();
                long l4 = l3 - (l2 = 0L);
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object == false) {
                    this.getNextByteBuffer();
                }
                int n10 = (int)this.currentRemaining();
                n8 = Math.min(n7, n10);
                long l7 = this.currentByteBufferPos;
                int n14 = n4 - n7 + n3;
                long l8 = n14;
                long l12 = n8;
                UnsafeUtil.copyMemory(l7, byArray, l8, l12);
                this.currentByteBufferPos = l3 = this.currentByteBufferPos + l12;
            }
            return;
        }
        if (n4 <= 0) {
            if (n4 == 0) {
                return;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    private void recomputeBufferSizeAfterLimit() {
        int n3 = this.totalBufferSize;
        int n4 = this.bufferSizeAfterCurrentLimit;
        this.totalBufferSize = n3 += n4;
        n4 = this.startOffset;
        int n7 = this.currentLimit;
        if ((n4 = n3 - n4) > n7) {
            this.bufferSizeAfterCurrentLimit = n4 -= n7;
            this.totalBufferSize = n3 -= n4;
        } else {
            n3 = 0;
            this.bufferSizeAfterCurrentLimit = 0;
        }
    }

    private int remaining() {
        int n3 = this.totalBufferSize;
        int n4 = this.totalBytesRead;
        long l2 = n3 - n4;
        long l3 = this.currentByteBufferPos;
        l2 -= l3;
        l3 = this.currentByteBufferStartPos;
        return (int)(l2 + l3);
    }

    private void skipRawVarint() {
        int n3;
        for (int i3 = 0; i3 < (n3 = 10); ++i3) {
            n3 = this.readRawByte();
            if (n3 < 0) continue;
            return;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ByteBuffer slice(int n3, int n4) {
        Throwable throwable2222222;
        ByteBuffer byteBuffer;
        int n7;
        int n8;
        block4: {
            ByteBuffer byteBuffer2 = this.currentByteBuffer;
            n8 = byteBuffer2.position();
            ByteBuffer byteBuffer3 = this.currentByteBuffer;
            n7 = byteBuffer3.limit();
            byteBuffer = this.currentByteBuffer;
            ((Buffer)byteBuffer).position(n3);
            ((Buffer)byteBuffer).limit(n4);
            ByteBuffer byteBuffer4 = this.currentByteBuffer;
            byteBuffer4 = byteBuffer4.slice();
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {}
                {
                    InvalidProtocolBufferException invalidProtocolBufferException = InvalidProtocolBufferException.truncatedMessage();
                    throw invalidProtocolBufferException;
                }
            }
            ((Buffer)byteBuffer).position(n8);
            ((Buffer)byteBuffer).limit(n7);
            return byteBuffer4;
        }
        ((Buffer)byteBuffer).position(n8);
        ((Buffer)byteBuffer).limit(n7);
        throw throwable2222222;
    }

    private void tryGetNextByteBuffer() {
        long l2;
        ByteBuffer byteBuffer;
        this.currentByteBuffer = byteBuffer = (ByteBuffer)this.iterator.next();
        int n3 = this.totalBytesRead;
        long l3 = this.currentByteBufferPos;
        long l4 = this.currentByteBufferStartPos;
        int n4 = (int)(l3 - l4);
        this.totalBytesRead = n3 += n4;
        this.currentByteBufferPos = l2 = (long)byteBuffer.position();
        this.currentByteBufferStartPos = l2;
        this.currentByteBufferLimit = l2 = (long)this.currentByteBuffer.limit();
        this.currentAddress = l2 = UnsafeUtil.addressOffset(this.currentByteBuffer);
        this.currentByteBufferPos = l3 = this.currentByteBufferPos + l2;
        this.currentByteBufferStartPos = l3 = this.currentByteBufferStartPos + l2;
        this.currentByteBufferLimit = l3 = this.currentByteBufferLimit + l2;
    }

    public void checkLastTagWas(int n3) {
        int n4 = this.lastTag;
        if (n4 == n3) {
            return;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    public void enableAliasing(boolean bl2) {
        this.enableAliasing = bl2;
    }

    public int getBytesUntilLimit() {
        int n3 = this.currentLimit;
        int n4 = -1 >>> 1;
        if (n3 == n4) {
            return -1;
        }
        n4 = this.getTotalBytesRead();
        return n3 - n4;
    }

    public int getLastTag() {
        return this.lastTag;
    }

    public int getTotalBytesRead() {
        int n3 = this.totalBytesRead;
        int n4 = this.startOffset;
        long l2 = n3 - n4;
        long l3 = this.currentByteBufferPos;
        l2 += l3;
        l3 = this.currentByteBufferStartPos;
        return (int)(l2 - l3);
    }

    /*
     * WARNING - void declaration
     */
    public boolean isAtEnd() {
        void var1_4;
        int bl2 = this.totalBytesRead;
        long l2 = bl2;
        long l3 = this.currentByteBufferPos;
        l2 += l3;
        l3 = this.currentByteBufferStartPos;
        int n3 = this.totalBufferSize;
        long l4 = (l2 -= l3) - (l3 = (long)n3);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_4;
    }

    public void popLimit(int n3) {
        this.currentLimit = n3;
        this.recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int n3) {
        if (n3 >= 0) {
            int n4 = this.getTotalBytesRead();
            if ((n3 += n4) <= (n4 = this.currentLimit)) {
                this.currentLimit = n3;
                this.recomputeBufferSizeAfterLimit();
                return n4;
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
        return this.readRawBytes(n3);
    }

    public ByteBuffer readByteBuffer() {
        int n3;
        long l2;
        long l3;
        long l4;
        long l7;
        int n4 = this.readRawVarint32();
        if (n4 > 0 && (l7 = (l4 = (l3 = (long)n4) - (l2 = this.currentRemaining())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) {
            int n7 = this.immutable;
            if (n7 == 0 && (n7 = this.enableAliasing) != 0) {
                long l8;
                this.currentByteBufferPos = l8 = this.currentByteBufferPos + l3;
                long l12 = this.currentAddress;
                int n8 = (int)(l8 - l12 - l3);
                n7 = (int)(l8 - l12);
                return this.slice(n8, n7);
            }
            byte[] byArray = new byte[n4];
            UnsafeUtil.copyMemory(this.currentByteBufferPos, byArray, 0L, l3);
            this.currentByteBufferPos = l2 = this.currentByteBufferPos + l3;
            return ByteBuffer.wrap(byArray);
        }
        if (n4 > 0 && n4 <= (n3 = this.remaining())) {
            byte[] byArray = new byte[n4];
            this.readRawBytesTo(byArray, 0, n4);
            return ByteBuffer.wrap(byArray);
        }
        if (n4 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (n4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public ByteString readBytes() {
        int n3;
        long l2;
        int n4 = this.readRawVarint32();
        if (n4 > 0) {
            long l3 = n4;
            long l4 = this.currentByteBufferLimit;
            l2 = this.currentByteBufferPos;
            long l7 = l3 - (l4 -= l2);
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object <= 0) {
                int n7 = this.immutable;
                if (n7 != 0 && (n7 = this.enableAliasing) != 0) {
                    l4 = this.currentAddress;
                    n7 = (int)(l2 - l4);
                    ByteString byteString = ByteString.wrap(this.slice(n7, n4 += n7));
                    this.currentByteBufferPos = l4 = this.currentByteBufferPos + l3;
                    return byteString;
                }
                byte[] byArray = new byte[n4];
                l4 = l2;
                byte[] byArray2 = byArray;
                long l8 = 0L;
                UnsafeUtil.copyMemory(l2, byArray, l8, l3);
                this.currentByteBufferPos = l4 = this.currentByteBufferPos + l3;
                return ByteString.wrap(byArray);
            }
        }
        if (n4 > 0 && n4 <= (n3 = this.remaining())) {
            n3 = (int)(this.immutable ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(this.enableAliasing ? 1 : 0)) != 0) {
                ArrayList<ByteString> arrayList = new ArrayList<ByteString>();
                while (n4 > 0) {
                    long l12;
                    long l14 = this.currentRemaining();
                    long l15 = l14 - (l12 = 0L);
                    Object object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                    if (object == false) {
                        this.getNextByteBuffer();
                    }
                    l14 = this.currentRemaining();
                    int n8 = (int)l14;
                    int n10 = Math.min(n4, n8);
                    l2 = this.currentByteBufferPos;
                    long l16 = this.currentAddress;
                    int n14 = (int)(l2 - l16);
                    n8 = n14 + n10;
                    ByteString byteString = ByteString.wrap(this.slice(n14, n8));
                    arrayList.add(byteString);
                    n4 -= n10;
                    l2 = this.currentByteBufferPos;
                    l16 = n10;
                    this.currentByteBufferPos = l2 += l16;
                }
                return ByteString.copyFrom(arrayList);
            }
            byte[] byArray = new byte[n4];
            this.readRawBytesTo(byArray, 0, n4);
            return ByteString.wrap(byArray);
        }
        if (n4 == 0) {
            return ByteString.EMPTY;
        }
        if (n4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
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
        long l2;
        long l3 = this.currentRemaining();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            this.getNextByteBuffer();
        }
        l3 = this.currentByteBufferPos;
        this.currentByteBufferPos = l2 = 1L + l3;
        return UnsafeUtil.getByte(l3);
    }

    public byte[] readRawBytes(int n3) {
        int n4;
        long l2;
        long l3;
        long l4;
        long l7;
        if (n3 >= 0 && (l7 = (l4 = (l3 = (long)n3) - (l2 = this.currentRemaining())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) {
            byte[] byArray = new byte[n3];
            UnsafeUtil.copyMemory(this.currentByteBufferPos, byArray, 0L, l3);
            this.currentByteBufferPos = l2 = this.currentByteBufferPos + l3;
            return byArray;
        }
        if (n3 >= 0 && n3 <= (n4 = this.remaining())) {
            byte[] byArray = new byte[n3];
            this.readRawBytesTo(byArray, 0, n3);
            return byArray;
        }
        if (n3 <= 0) {
            if (n3 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public int readRawLittleEndian32() {
        long l2;
        long l3 = this.currentRemaining();
        long l4 = l3 - (l2 = (long)4);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            l3 = this.currentByteBufferPos;
            this.currentByteBufferPos = l2 += l3;
            int n3 = UnsafeUtil.getByte(l3) & 0xFF;
            int n4 = (UnsafeUtil.getByte(1L + l3) & 0xFF) << 8;
            n3 |= n4;
            n4 = (UnsafeUtil.getByte((long)2 + l3) & 0xFF) << 16;
            return (UnsafeUtil.getByte(l3 + (long)3) & 0xFF) << 24 | (n3 |= n4);
        }
        int n7 = this.readRawByte() & 0xFF;
        int n8 = (this.readRawByte() & 0xFF) << 8;
        n7 |= n8;
        n8 = (this.readRawByte() & 0xFF) << 16;
        n7 |= n8;
        n8 = (this.readRawByte() & 0xFF) << 24;
        return n7 | n8;
    }

    public long readRawLittleEndian64() {
        long l2 = this.currentRemaining();
        int n3 = 56;
        int n4 = 48;
        int n7 = 40;
        int n8 = 32;
        int n10 = 24;
        int n14 = 16;
        int n15 = 8;
        long l3 = 255L;
        long l4 = 8;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object >= 0) {
            l2 = this.currentByteBufferPos;
            this.currentByteBufferPos = l4 += l2;
            l4 = (long)UnsafeUtil.getByte(l2) & l3;
            long l8 = ((long)UnsafeUtil.getByte(1L + l2) & l3) << n15;
            long l12 = ((long)UnsafeUtil.getByte((long)2 + l2) & l3) << n14 | (l4 |= l8);
            l4 = ((long)UnsafeUtil.getByte((long)3 + l2) & l3) << n10;
            long l14 = l12 | l4;
            l4 = ((long)UnsafeUtil.getByte((long)4 + l2) & l3) << n8;
            long l15 = l14 | l4;
            l12 = ((long)UnsafeUtil.getByte((long)5 + l2) & l3) << n7;
            long l16 = l15 | l12;
            l14 = ((long)UnsafeUtil.getByte((long)6 + l2) & l3) << n4;
            long l17 = l16 | l14;
            return ((long)UnsafeUtil.getByte(l2 + (long)7) & l3) << n3 | l17;
        }
        l2 = (long)this.readRawByte() & l3;
        l4 = ((long)this.readRawByte() & l3) << n15;
        l2 |= l4;
        long l18 = ((long)this.readRawByte() & l3) << n14;
        l2 |= l18;
        long l19 = ((long)this.readRawByte() & l3) << n10;
        l2 |= l19;
        long l20 = ((long)this.readRawByte() & l3) << n8;
        l2 |= l20;
        long l21 = ((long)this.readRawByte() & l3) << n7;
        l2 |= l21;
        long l22 = ((long)this.readRawByte() & l3) << n4;
        long l23 = ((long)this.readRawByte() & l3) << n3;
        return (l2 |= l22) | l23;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int readRawVarint32() {
        block9: {
            block13: {
                block12: {
                    block14: {
                        block10: {
                            block11: {
                                var3_2 = this.currentByteBufferLimit;
                                var1_1 = this.currentByteBufferPos;
                                cfr_temp_0 = var3_2 - var1_1;
                                var5_3 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                if (var5_3 /* !! */  == false) break block10;
                                var3_2 = 1L;
                                var6_4 = var1_1 + var3_2;
                                var8_5 = UnsafeUtil.getByte(var1_1);
                                if (var8_5 >= 0) {
                                    this.currentByteBufferPos = var1_1 = this.currentByteBufferPos + var3_2;
                                    return var8_5;
                                }
                                var3_2 = this.currentByteBufferLimit;
                                var9_6 = this.currentByteBufferPos;
                                cfr_temp_1 = (var3_2 -= var9_6) - (var9_6 = (long)10);
                                var11_7 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                if (var11_7 /* !! */  < 0) break block10;
                                var3_2 = (long)2 + var1_1;
                                var5_3 /* !! */  = UnsafeUtil.getByte(var6_4) << 7 ^ var8_5;
                                if (var5_3 /* !! */  >= 0) break block11;
                                var12_8 = var5_3 /* !! */  ^ -128;
                                break block9;
                            }
                            var13_9 = (long)3 + var1_1;
                            var15_10 = UnsafeUtil.getByte(var3_2) << 14 ^ var5_3 /* !! */ ;
                            if (var15_10 >= 0) {
                                var12_8 = var15_10 ^ 16256;
lbl27:
                                // 2 sources

                                while (true) {
                                    var3_2 = var13_9;
                                    break block9;
                                    break;
                                }
                            }
                            var16_11 = (long)4 + var1_1;
                            var18_12 = UnsafeUtil.getByte(var13_9) << 21;
                            if ((var15_10 ^= var18_12) < 0) {
                                var12_8 = -2080896 ^ var15_10;
lbl34:
                                // 2 sources

                                while (true) {
                                    var3_2 = var16_11;
                                    break block9;
                                    break;
                                }
                            }
                            var13_9 = (long)5 + var1_1;
                            var19_13 = UnsafeUtil.getByte(var16_11);
                            var5_3 /* !! */  = var19_13 << 28;
                            var15_10 ^= var5_3 /* !! */ ;
                            var5_3 /* !! */  = 266354560;
                            var15_10 ^= var5_3 /* !! */ ;
                            if (var19_13 >= 0) break block12;
                            var16_11 = (long)6 + var1_1;
                            var18_12 = UnsafeUtil.getByte(var13_9);
                            if (var18_12 >= 0) break block13;
                            var13_9 = (long)7 + var1_1;
                            var19_13 = UnsafeUtil.getByte(var16_11);
                            if (var19_13 >= 0) break block12;
                            var16_11 = (long)8 + var1_1;
                            var18_12 = UnsafeUtil.getByte(var13_9);
                            if (var18_12 >= 0) break block13;
                            var13_9 = (long)9 + var1_1;
                            var19_13 = UnsafeUtil.getByte(var16_11);
                            if (var19_13 >= 0) break block12;
                            var1_1 += var9_6;
                            var19_13 = UnsafeUtil.getByte(var13_9);
                            if (var19_13 >= 0) break block14;
                        }
                        return (int)this.readRawVarint64SlowPath();
                    }
                    var12_8 = var15_10;
                    var3_2 = var1_1;
                    break block9;
                }
                var12_8 = var15_10;
                ** while (true)
            }
            var12_8 = var15_10;
            ** while (true)
        }
        this.currentByteBufferPos = var3_2;
        return var12_8;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long readRawVarint64() {
        block12: {
            block17: {
                block18: {
                    block13: {
                        block16: {
                            block15: {
                                block14: {
                                    var3_2 = this.currentByteBufferLimit;
                                    var1_1 = this.currentByteBufferPos;
                                    cfr_temp_0 = var3_2 - var1_1;
                                    var5_3 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                    if (var5_3 /* !! */  == false) break block13;
                                    var3_2 = 1L;
                                    var6_4 = var1_1 + var3_2;
                                    var8_5 = UnsafeUtil.getByte(var1_1);
                                    if (var8_5 >= 0) {
                                        this.currentByteBufferPos = var1_1 = this.currentByteBufferPos + var3_2;
                                        return var8_5;
                                    }
                                    var3_2 = this.currentByteBufferLimit;
                                    var9_6 = this.currentByteBufferPos;
                                    cfr_temp_1 = (var3_2 -= var9_6) - (var9_6 = (long)10);
                                    var11_7 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                    if (var11_7 /* !! */  < 0) break block13;
                                    var3_2 = (long)2 + var1_1;
                                    var5_3 /* !! */  = UnsafeUtil.getByte(var6_4) << 7 ^ var8_5;
                                    if (var5_3 /* !! */  >= 0) break block14;
                                    var12_8 = var5_3 /* !! */  ^ -128;
                                    var1_1 = var12_8;
                                    break block12;
                                }
                                var13_11 = (long)3 + var1_1;
                                var15_12 = UnsafeUtil.getByte(var3_2) << 14 ^ var5_3 /* !! */ ;
                                if (var15_12 < 0) break block15;
                                var12_9 = var15_12 ^ 16256;
                                var1_1 = var12_9;
                                var3_2 = var13_11;
                                break block12;
                            }
                            var16_13 = (long)4 + var1_1;
                            var18_14 = UnsafeUtil.getByte(var13_11) << 21;
                            if ((var15_12 ^= var18_14) >= 0) break block16;
                            var12_10 = -2080896 ^ var15_12;
                            var1_1 = var12_10;
                            var3_2 = var16_13;
                            break block12;
                        }
                        var13_11 = var15_12;
                        var19_15 = (long)5 + var1_1;
                        var15_12 = UnsafeUtil.getByte(var16_13);
                        var3_2 = var15_12;
                        var5_3 /* !! */  = 28;
                        var6_4 = 0L;
                        cfr_temp_2 = (var3_2 = var3_2 << var5_3 /* !! */  ^ var13_11) - var6_4;
                        var8_5 = (byte)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                        if (var8_5 >= 0) {
                            var1_1 = 266354560L;
lbl50:
                            // 2 sources

                            while (true) {
                                var1_1 ^= var3_2;
lbl52:
                                // 2 sources

                                while (true) {
                                    var3_2 = var19_15;
                                    break block12;
                                    break;
                                }
                                break;
                            }
                        }
                        var21_16 = (long)6 + var1_1;
                        cfr_temp_3 = (var3_2 ^= (var19_15 = (long)UnsafeUtil.getByte(var19_15) << 35)) - var6_4;
                        var8_5 = (byte)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                        if (var8_5 < 0) {
                            var1_1 = -34093383808L;
lbl60:
                            // 2 sources

                            while (true) {
                                var1_1 ^= var3_2;
                                var3_2 = var21_16;
                                break block12;
                                break;
                            }
                        }
                        var19_15 = (long)7 + var1_1;
                        cfr_temp_4 = (var3_2 ^= (var21_16 = (long)UnsafeUtil.getByte(var21_16) << 42)) - var6_4;
                        var8_5 = (byte)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                        if (var8_5 >= 0) {
                            var1_1 = 4363953127296L;
                            ** continue;
                        }
                        var21_16 = (long)8 + var1_1;
                        cfr_temp_5 = (var3_2 ^= (var19_15 = (long)UnsafeUtil.getByte(var19_15) << 49)) - var6_4;
                        var8_5 = (byte)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                        if (var8_5 < 0) {
                            var1_1 = -558586000294016L;
                            ** continue;
                        }
                        var19_15 = (long)9 + var1_1;
                        var21_16 = (long)UnsafeUtil.getByte(var21_16) << 56;
                        var3_2 ^= var21_16;
                        var21_16 = 71499008037633920L;
                        cfr_temp_6 = (var3_2 ^= var21_16) - var6_4;
                        var8_5 = (byte)(cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1));
                        if (var8_5 >= 0) break block17;
                        var1_1 += var9_6;
                        var8_5 = UnsafeUtil.getByte(var19_15);
                        var23_17 = var8_5;
                        cfr_temp_7 = var23_17 - var6_4;
                        var25_18 /* !! */  = (long)(cfr_temp_7 == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1));
                        if (var25_18 /* !! */  >= 0) break block18;
                    }
                    return this.readRawVarint64SlowPath();
                }
                var26_19 = var1_1;
                var1_1 = var3_2;
                var3_2 = var26_19;
                break block12;
            }
            var1_1 = var3_2;
            ** while (true)
        }
        this.currentByteBufferPos = var3_2;
        return var1_1;
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
        int n4 = this.readRawVarint32();
        if (n4 > 0) {
            long l2 = n4;
            long l3 = this.currentByteBufferLimit;
            long l4 = this.currentByteBufferPos;
            long l7 = l2 - (l3 -= l4);
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object <= 0) {
                long l8;
                byte[] byArray = new byte[n4];
                l3 = l4;
                long l12 = 0L;
                UnsafeUtil.copyMemory(l4, byArray, l12, l2);
                Charset charset = Internal.UTF_8;
                String string2 = new String(byArray, charset);
                this.currentByteBufferPos = l8 = this.currentByteBufferPos + l2;
                return string2;
            }
        }
        if (n4 > 0 && n4 <= (n3 = this.remaining())) {
            byte[] byArray = new byte[n4];
            this.readRawBytesTo(byArray, 0, n4);
            Charset charset = Internal.UTF_8;
            String string3 = new String(byArray, charset);
            return string3;
        }
        if (n4 == 0) {
            return "";
        }
        if (n4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public String readStringRequireUtf8() {
        int n3;
        int n4 = this.readRawVarint32();
        if (n4 > 0) {
            long l2 = n4;
            long l3 = this.currentByteBufferLimit;
            long l4 = this.currentByteBufferPos;
            long l7 = l2 - (l3 -= l4);
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object <= 0) {
                l3 = this.currentByteBufferStartPos;
                int n7 = (int)(l4 - l3);
                String string2 = Utf8.decodeUtf8(this.currentByteBuffer, n7, n4);
                this.currentByteBufferPos = l3 = this.currentByteBufferPos + l2;
                return string2;
            }
        }
        if (n4 >= 0 && n4 <= (n3 = this.remaining())) {
            byte[] byArray = new byte[n4];
            this.readRawBytesTo(byArray, 0, n4);
            return Utf8.decodeUtf8(byArray, 0, n4);
        }
        if (n4 == 0) {
            return "";
        }
        if (n4 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
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
        long l2 = this.totalBytesRead;
        long l3 = this.currentByteBufferPos;
        l2 += l3;
        l3 = this.currentByteBufferStartPos;
        this.startOffset = n3 = (int)(l2 - l3);
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
        if (n3 >= 0) {
            long l2 = n3;
            int n4 = this.totalBufferSize;
            int n7 = this.totalBytesRead;
            long l3 = n4 -= n7;
            long l4 = this.currentByteBufferPos;
            l3 -= l4;
            l4 = this.currentByteBufferStartPos;
            long l7 = l2 - (l3 += l4);
            Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object <= 0) {
                while (n3 > 0) {
                    l2 = this.currentRemaining();
                    long l8 = l2 - (l3 = 0L);
                    object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (object == false) {
                        this.getNextByteBuffer();
                    }
                    l2 = this.currentRemaining();
                    int n8 = (int)l2;
                    int n10 = Math.min(n3, n8);
                    n3 -= n10;
                    long l12 = this.currentByteBufferPos;
                    long l14 = n10;
                    this.currentByteBufferPos = l12 += l14;
                }
                return;
            }
        }
        if (n3 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}

