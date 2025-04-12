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
import com.google.protobuf.Utf8;
import com.google.protobuf.WireFormat;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

final class CodedInputStream$ArrayDecoder
extends CodedInputStream {
    private final byte[] buffer;
    private int bufferSizeAfterLimit;
    private int currentLimit = -1 >>> 1;
    private boolean enableAliasing;
    private final boolean immutable;
    private int lastTag;
    private int limit;
    private int pos;
    private int startPos;

    private CodedInputStream$ArrayDecoder(byte[] byArray, int n3, int n4, boolean bl2) {
        super(null);
        this.buffer = byArray;
        this.limit = n4 += n3;
        this.pos = n3;
        this.startPos = n3;
        this.immutable = bl2;
    }

    public /* synthetic */ CodedInputStream$ArrayDecoder(byte[] byArray, int n3, int n4, boolean bl2, CodedInputStream$1 codedInputStream$1) {
        this(byArray, n3, n4, bl2);
    }

    private void recomputeBufferSizeAfterLimit() {
        int n3 = this.limit;
        int n4 = this.bufferSizeAfterLimit;
        this.limit = n3 += n4;
        n4 = this.startPos;
        int n7 = this.currentLimit;
        if ((n4 = n3 - n4) > n7) {
            this.bufferSizeAfterLimit = n4 -= n7;
            this.limit = n3 -= n4;
        } else {
            n3 = 0;
            this.bufferSizeAfterLimit = 0;
        }
    }

    private void skipRawVarint() {
        int n3 = this.limit;
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
        int n3 = this.pos;
        int n4 = this.startPos;
        return n3 - n4;
    }

    public boolean isAtEnd() {
        int n3 = this.pos;
        int n4 = this.limit;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public void popLimit(int n3) {
        this.currentLimit = n3;
        this.recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int n3) {
        if (n3 >= 0) {
            int n4 = this.getTotalBytesRead();
            if ((n3 += n4) >= 0) {
                n4 = this.currentLimit;
                if (n3 <= n4) {
                    this.currentLimit = n3;
                    this.recomputeBufferSizeAfterLimit();
                    return n4;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.parseFailure();
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
        int n3 = this.readRawVarint32();
        if (n3 > 0) {
            int n4 = this.limit;
            int n7 = this.pos;
            if (n3 <= (n4 -= n7)) {
                Object object;
                n4 = (int)(this.immutable ? 1 : 0);
                if (n4 == 0 && (n4 = (int)(this.enableAliasing ? 1 : 0)) != 0) {
                    object = ByteBuffer.wrap(this.buffer, n7, n3).slice();
                } else {
                    object = this.buffer;
                    int n8 = n7 + n3;
                    object = ByteBuffer.wrap(Arrays.copyOfRange(object, n7, n8));
                }
                this.pos = n7 = this.pos + n3;
                return object;
            }
        }
        if (n3 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
        }
        if (n3 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public ByteString readBytes() {
        int n3 = this.readRawVarint32();
        if (n3 > 0) {
            int n4 = this.limit;
            int n7 = this.pos;
            if (n3 <= (n4 -= n7)) {
                n4 = (int)(this.immutable ? 1 : 0);
                ByteString byteString = n4 != 0 && (n4 = (int)(this.enableAliasing ? 1 : 0)) != 0 ? ByteString.wrap(this.buffer, n7, n3) : ByteString.copyFrom(this.buffer, n7, n3);
                this.pos = n7 = this.pos + n3;
                return byteString;
            }
        }
        if (n3 == 0) {
            return ByteString.EMPTY;
        }
        return ByteString.wrap(this.readRawBytes(n3));
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
        int n3 = this.pos;
        int n4 = this.limit;
        if (n3 != n4) {
            int n7;
            byte[] byArray = this.buffer;
            this.pos = n7 = n3 + 1;
            return byArray[n3];
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public byte[] readRawBytes(int n3) {
        if (n3 > 0) {
            int n4 = this.limit;
            int n7 = this.pos;
            if (n3 <= (n4 -= n7)) {
                this.pos = n3 += n7;
                return Arrays.copyOfRange(this.buffer, n7, n3);
            }
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
        int n3 = this.pos;
        int n4 = this.limit - n3;
        int n7 = 4;
        if (n4 >= n7) {
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
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public long readRawLittleEndian64() {
        int n3 = this.pos;
        int n4 = this.limit - n3;
        int n7 = 8;
        if (n4 >= n7) {
            int n8;
            byte[] byArray = this.buffer;
            this.pos = n8 = n3 + 8;
            long l2 = byArray[n3];
            long l3 = 255L;
            int n10 = n3 + 1;
            long l4 = ((long)byArray[n10] & l3) << n7;
            long l7 = (l2 &= l3) | l4;
            int n14 = n3 + 2;
            l4 = ((long)byArray[n14] & l3) << 16;
            l7 |= l4;
            n14 = n3 + 3;
            l4 = ((long)byArray[n14] & l3) << 24;
            l7 |= l4;
            n14 = n3 + 4;
            l4 = ((long)byArray[n14] & l3) << 32;
            l7 |= l4;
            n14 = n3 + 5;
            l4 = ((long)byArray[n14] & l3) << 40;
            l7 |= l4;
            n14 = n3 + 6;
            l4 = ((long)byArray[n14] & l3) << 48;
            return ((long)byArray[n3 += 7] & l3) << 56 | (l7 |= l4);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
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
                                var2_2 = this.limit;
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
                                    var2_2 = this.limit;
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
        int n3 = this.readRawVarint32();
        if (n3 > 0) {
            int n4 = this.limit;
            int n7 = this.pos;
            if (n3 <= (n4 -= n7)) {
                byte[] byArray = this.buffer;
                Charset charset = Internal.UTF_8;
                String string2 = new String(byArray, n7, n3, charset);
                this.pos = n7 = this.pos + n3;
                return string2;
            }
        }
        if (n3 == 0) {
            return "";
        }
        if (n3 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public String readStringRequireUtf8() {
        int n3 = this.readRawVarint32();
        if (n3 > 0) {
            int n4 = this.limit;
            int n7 = this.pos;
            if (n3 <= (n4 -= n7)) {
                String string2 = Utf8.decodeUtf8(this.buffer, n7, n3);
                this.pos = n7 = this.pos + n3;
                return string2;
            }
        }
        if (n3 == 0) {
            return "";
        }
        if (n3 <= 0) {
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
        this.startPos = n3 = this.pos;
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
            int n4 = this.limit;
            int n7 = this.pos;
            if (n3 <= (n4 -= n7)) {
                this.pos = n7 += n3;
                return;
            }
        }
        if (n3 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}

