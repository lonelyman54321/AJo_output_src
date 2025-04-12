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

final class CodedInputStream$UnsafeDirectNioDecoder
extends CodedInputStream {
    private final long address;
    private final ByteBuffer buffer;
    private int bufferSizeAfterLimit;
    private int currentLimit = -1 >>> 1;
    private boolean enableAliasing;
    private final boolean immutable;
    private int lastTag;
    private long limit;
    private long pos;
    private long startPos;

    private CodedInputStream$UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean bl2) {
        super(null);
        long l2;
        long l3;
        this.buffer = byteBuffer;
        this.address = l3 = UnsafeUtil.addressOffset(byteBuffer);
        this.limit = l2 = (long)byteBuffer.limit() + l3;
        l2 = byteBuffer.position();
        this.pos = l3 += l2;
        this.startPos = l3;
        this.immutable = bl2;
    }

    public /* synthetic */ CodedInputStream$UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean bl2, CodedInputStream$1 codedInputStream$1) {
        this(byteBuffer, bl2);
    }

    private int bufferPos(long l2) {
        long l3 = this.address;
        return (int)(l2 - l3);
    }

    public static boolean isSupported() {
        return UnsafeUtil.hasUnsafeByteBufferOperations();
    }

    private void recomputeBufferSizeAfterLimit() {
        long l2 = this.limit;
        long l3 = this.bufferSizeAfterLimit;
        this.limit = l2 += l3;
        l3 = this.startPos;
        int n3 = (int)(l3 = l2 - l3);
        int n4 = this.currentLimit;
        if (n3 > n4) {
            this.bufferSizeAfterLimit = n3 -= n4;
            l3 = n3;
            this.limit = l2 -= l3;
        } else {
            this.bufferSizeAfterLimit = 0;
        }
    }

    private int remaining() {
        long l2 = this.limit;
        long l3 = this.pos;
        return (int)(l2 - l3);
    }

    private void skipRawVarint() {
        int n3;
        int n4 = this.remaining();
        if (n4 >= (n3 = 10)) {
            this.skipRawVarintFastPath();
        } else {
            this.skipRawVarintSlowPath();
        }
    }

    private void skipRawVarintFastPath() {
        int n3;
        for (int i3 = 0; i3 < (n3 = 10); ++i3) {
            long l2;
            long l3 = this.pos;
            this.pos = l2 = 1L + l3;
            n3 = UnsafeUtil.getByte(l3);
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ByteBuffer slice(long l2, long l3) {
        Throwable throwable2222222;
        ByteBuffer byteBuffer;
        int n3;
        int n4;
        block4: {
            ByteBuffer byteBuffer2 = this.buffer;
            n4 = byteBuffer2.position();
            ByteBuffer byteBuffer3 = this.buffer;
            n3 = byteBuffer3.limit();
            byteBuffer = this.buffer;
            int n7 = this.bufferPos(l2);
            ((Buffer)byteBuffer).position(n7);
            n7 = this.bufferPos(l3);
            ((Buffer)byteBuffer).limit(n7);
            ByteBuffer byteBuffer4 = this.buffer;
            byteBuffer4 = byteBuffer4.slice();
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {}
                {
                    InvalidProtocolBufferException invalidProtocolBufferException = InvalidProtocolBufferException.truncatedMessage();
                    invalidProtocolBufferException.initCause(illegalArgumentException);
                    throw invalidProtocolBufferException;
                }
            }
            ((Buffer)byteBuffer).position(n4);
            ((Buffer)byteBuffer).limit(n3);
            return byteBuffer4;
        }
        ((Buffer)byteBuffer).position(n4);
        ((Buffer)byteBuffer).limit(n3);
        throw throwable2222222;
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
        long l2 = this.pos;
        long l3 = this.startPos;
        return (int)(l2 - l3);
    }

    public boolean isAtEnd() {
        long l2 = this.pos;
        long l3 = this.limit;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
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
        int n4 = this.readRawVarint32();
        if (n4 > 0 && n4 <= (n3 = this.remaining())) {
            long l2;
            n3 = (int)(this.immutable ? 1 : 0);
            if (n3 == 0 && (n3 = (int)(this.enableAliasing ? 1 : 0)) != 0) {
                long l3 = this.pos;
                long l4 = n4;
                long l7 = l3 + l4;
                ByteBuffer byteBuffer = this.slice(l3, l7);
                this.pos = l3 = this.pos + l4;
                return byteBuffer;
            }
            byte[] byArray = new byte[n4];
            long l8 = this.pos;
            long l12 = n4;
            UnsafeUtil.copyMemory(l8, byArray, 0L, l12);
            this.pos = l2 = this.pos + l12;
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
        int n4 = this.readRawVarint32();
        if (n4 > 0 && n4 <= (n3 = this.remaining())) {
            long l2;
            n3 = (int)(this.immutable ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(this.enableAliasing ? 1 : 0)) != 0) {
                long l3 = this.pos;
                long l4 = n4;
                long l7 = l3 + l4;
                ByteBuffer byteBuffer = this.slice(l3, l7);
                this.pos = l3 = this.pos + l4;
                return ByteString.wrap(byteBuffer);
            }
            byte[] byArray = new byte[n4];
            long l8 = this.pos;
            long l12 = n4;
            UnsafeUtil.copyMemory(l8, byArray, 0L, l12);
            this.pos = l2 = this.pos + l12;
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
        long l2 = this.pos;
        long l3 = this.limit;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            this.pos = l3 = 1L + l2;
            return UnsafeUtil.getByte(l2);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public byte[] readRawBytes(int n3) {
        int n4;
        if (n3 >= 0 && n3 <= (n4 = this.remaining())) {
            byte[] byArray = new byte[n3];
            long l2 = this.pos;
            long l3 = n3;
            long l4 = l2 + l3;
            this.slice(l2, l4).get(byArray);
            this.pos = l2 = this.pos + l3;
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
        long l2 = this.pos;
        long l3 = this.limit - l2;
        long l4 = 4;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object >= 0) {
            this.pos = l4 += l2;
            int n3 = UnsafeUtil.getByte(l2) & 0xFF;
            int n4 = (UnsafeUtil.getByte(1L + l2) & 0xFF) << 8;
            n3 |= n4;
            n4 = (UnsafeUtil.getByte((long)2 + l2) & 0xFF) << 16;
            return (UnsafeUtil.getByte(l2 + (long)3) & 0xFF) << 24 | (n3 |= n4);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public long readRawLittleEndian64() {
        long l2 = this.pos;
        long l3 = this.limit - l2;
        long l4 = 8;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object >= 0) {
            this.pos = l4 += l2;
            l3 = UnsafeUtil.getByte(l2);
            l4 = 255L;
            l3 &= l4;
            long l8 = ((long)UnsafeUtil.getByte(1L + l2) & l4) << 8;
            l3 |= l8;
            l8 = ((long)UnsafeUtil.getByte((long)2 + l2) & l4) << 16;
            l3 |= l8;
            l8 = ((long)UnsafeUtil.getByte((long)3 + l2) & l4) << 24;
            l3 |= l8;
            l8 = ((long)UnsafeUtil.getByte((long)4 + l2) & l4) << 32;
            l3 |= l8;
            l8 = ((long)UnsafeUtil.getByte((long)5 + l2) & l4) << 40;
            l3 |= l8;
            l8 = ((long)UnsafeUtil.getByte((long)6 + l2) & l4) << 48;
            return ((long)UnsafeUtil.getByte(l2 + (long)7) & l4) << 56 | (l3 |= l8);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int readRawVarint32() {
        block7: {
            block11: {
                block12: {
                    block8: {
                        block10: {
                            block9: {
                                var3_2 = this.limit;
                                var1_1 = this.pos;
                                cfr_temp_0 = var3_2 - var1_1;
                                var5_3 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                if (var5_3 /* !! */  == false) break block8;
                                var3_2 = 1L + var1_1;
                                var5_3 /* !! */  = UnsafeUtil.getByte(var1_1);
                                if (var5_3 /* !! */  >= 0) {
                                    this.pos = var3_2;
                                    return (int)var5_3 /* !! */ ;
                                }
                                var6_4 = this.limit - var3_2;
                                var8_5 = 9;
                                cfr_temp_1 = var6_4 - var8_5;
                                var10_6 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                if (var10_6 /* !! */  < 0) break block8;
                                var6_4 = (long)2 + var1_1;
                                var11_7 = UnsafeUtil.getByte(var3_2) << 7 ^ var5_3 /* !! */ ;
                                if (var11_7 >= 0) break block9;
                                var12_8 = var11_7 ^ -128;
                                break block7;
                            }
                            var13_9 = (long)3 + var1_1;
                            var15_10 = UnsafeUtil.getByte(var6_4) << 14;
                            if ((var11_7 ^= var15_10) >= 0) {
                                var12_8 = var11_7 ^ 16256;
lbl26:
                                // 2 sources

                                while (true) {
                                    var6_4 = var13_9;
                                    break block7;
                                    break;
                                }
                            }
                            var6_4 = (long)4 + var1_1;
                            var16_11 = UnsafeUtil.getByte(var13_9) << 21;
                            if ((var11_7 ^= var16_11) >= 0) break block10;
                            var12_8 = -2080896 ^ var11_7;
                            break block7;
                        }
                        var13_9 = (long)5 + var1_1;
                        var15_10 = UnsafeUtil.getByte(var6_4);
                        var17_12 = var15_10 << 28;
                        var11_7 ^= var17_12;
                        var17_12 = 266354560;
                        var11_7 ^= var17_12;
                        if (var15_10 >= 0) break block11;
                        var6_4 = (long)6 + var1_1;
                        var16_11 = UnsafeUtil.getByte(var13_9);
                        if (var16_11 >= 0) break block12;
                        var13_9 = (long)7 + var1_1;
                        var15_10 = UnsafeUtil.getByte(var6_4);
                        if (var15_10 >= 0) break block11;
                        var6_4 = (long)8 + var1_1;
                        var16_11 = UnsafeUtil.getByte(var13_9);
                        if (var16_11 >= 0) break block12;
                        var13_9 = var1_1 + var8_5;
                        var15_10 = UnsafeUtil.getByte(var6_4);
                        if (var15_10 >= 0) break block11;
                        var6_4 = (long)10 + var1_1;
                        var12_8 = UnsafeUtil.getByte(var13_9);
                        if (var12_8 >= 0) break block12;
                    }
                    return (int)this.readRawVarint64SlowPath();
                }
                var12_8 = var11_7;
                break block7;
            }
            var12_8 = var11_7;
            ** while (true)
        }
        this.pos = var6_4;
        return var12_8;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long readRawVarint64() {
        block14: {
            block17: {
                block18: {
                    block15: {
                        block16: {
                            var3_2 = this.limit;
                            var1_1 = this.pos;
                            cfr_temp_0 = var3_2 - var1_1;
                            var5_3 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var5_3 /* !! */  == false) break block15;
                            var3_2 = 1L + var1_1;
                            var5_3 /* !! */  = UnsafeUtil.getByte(var1_1);
                            if (var5_3 /* !! */  >= 0) {
                                this.pos = var3_2;
                                return var5_3 /* !! */ ;
                            }
                            var6_4 = this.limit - var3_2;
                            var8_5 = 9;
                            cfr_temp_1 = var6_4 - var8_5;
                            var10_6 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                            if (var10_6 /* !! */  < 0) break block15;
                            var6_4 = (long)2 + var1_1;
                            var11_7 = UnsafeUtil.getByte(var3_2) << 7 ^ var5_3 /* !! */ ;
                            if (var11_7 < 0) {
                                var12_8 = var11_7 ^ -128;
lbl20:
                                // 2 sources

                                while (true) {
                                    var1_1 = var12_8;
                                    break block14;
                                    break;
                                }
                            }
                            var13_10 = (long)3 + var1_1;
                            var15_11 = UnsafeUtil.getByte(var6_4) << 14;
                            if ((var11_7 ^= var15_11) < 0) break block16;
                            var12_9 = var11_7 ^ 16256;
                            var1_1 = var12_9;
                            var6_4 = var13_10;
                            break block14;
                        }
                        var6_4 = (long)4 + var1_1;
                        var16_12 = UnsafeUtil.getByte(var13_10) << 21;
                        if ((var11_7 ^= var16_12) < 0) {
                            var12_8 = -2080896 ^ var11_7;
                            ** continue;
                        }
                        var3_2 = var11_7;
                        var17_13 = (long)5 + var1_1;
                        var5_3 /* !! */  = UnsafeUtil.getByte(var6_4);
                        var19_14 = (long)var5_3 /* !! */  << 28;
                        cfr_temp_2 = (var3_2 ^= var19_14) - (var19_14 = 0L);
                        var21_15 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                        if (var21_15 /* !! */  >= 0) {
                            var1_1 = 266354560L;
lbl44:
                            // 2 sources

                            while (true) {
                                var1_1 ^= var3_2;
                                var6_4 = var17_13;
                                break block14;
                                break;
                            }
                        }
                        var22_16 = (long)6 + var1_1;
                        cfr_temp_3 = (var3_2 ^= (var17_13 = (long)UnsafeUtil.getByte(var17_13) << 35)) - var19_14;
                        var21_15 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                        if (var21_15 /* !! */  < 0) {
                            var1_1 = -34093383808L;
lbl53:
                            // 2 sources

                            while (true) {
                                var1_1 ^= var3_2;
                                var6_4 = var22_16;
                                break block14;
                                break;
                            }
                        }
                        var17_13 = (long)7 + var1_1;
                        cfr_temp_4 = (var3_2 ^= (var22_16 = (long)UnsafeUtil.getByte(var22_16) << 42)) - var19_14;
                        var21_15 /* !! */  = (long)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                        if (var21_15 /* !! */  >= 0) {
                            var1_1 = 4363953127296L;
                            ** continue;
                        }
                        var22_16 = (long)8 + var1_1;
                        cfr_temp_5 = (var3_2 ^= (var17_13 = (long)UnsafeUtil.getByte(var17_13) << 49)) - var19_14;
                        var21_15 /* !! */  = (long)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                        if (var21_15 /* !! */  < 0) {
                            var1_1 = -558586000294016L;
                            ** continue;
                        }
                        var24_17 = var1_1 + var8_5;
                        var26_18 = UnsafeUtil.getByte(var22_16);
                        var28_19 = 56;
                        var3_2 ^= (var26_18 <<= var28_19);
                        var26_18 = 71499008037633920L;
                        cfr_temp_6 = (var3_2 ^= var26_18) - var19_14;
                        var29_20 /* !! */  = (long)(cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1));
                        if (var29_20 /* !! */  >= 0) break block17;
                        var26_18 = 10;
                        var1_1 += var26_18;
                        var21_15 /* !! */  = UnsafeUtil.getByte(var24_17);
                        cfr_temp_7 = (var24_17 = (long)var21_15 /* !! */ ) - var19_14;
                        var29_20 /* !! */  = (long)(cfr_temp_7 == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1));
                        if (var29_20 /* !! */  >= 0) break block18;
                    }
                    return this.readRawVarint64SlowPath();
                }
                var6_4 = var1_1;
                var1_1 = var3_2;
                break block14;
            }
            var1_1 = var3_2;
            var6_4 = var24_17;
        }
        this.pos = var6_4;
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
        if (n4 > 0 && n4 <= (n3 = this.remaining())) {
            long l2;
            byte[] byArray = new byte[n4];
            long l3 = this.pos;
            long l4 = n4;
            UnsafeUtil.copyMemory(l3, byArray, 0L, l4);
            Charset charset = Internal.UTF_8;
            String string2 = new String(byArray, charset);
            this.pos = l2 = this.pos + l4;
            return string2;
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
        if (n4 > 0 && n4 <= (n3 = this.remaining())) {
            long l2 = this.pos;
            n3 = this.bufferPos(l2);
            String string2 = Utf8.decodeUtf8(this.buffer, n3, n4);
            long l3 = this.pos;
            long l4 = n4;
            this.pos = l3 += l4;
            return string2;
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
        long l2;
        this.startPos = l2 = this.pos;
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
        int n4;
        if (n3 >= 0 && n3 <= (n4 = this.remaining())) {
            long l2 = this.pos;
            long l3 = n3;
            this.pos = l2 += l3;
            return;
        }
        if (n3 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}

