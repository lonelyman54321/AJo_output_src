/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.BinaryReader;
import com.google.protobuf.BinaryReader$1;
import com.google.protobuf.BooleanArrayList;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DoubleArrayList;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FloatArrayList;
import com.google.protobuf.IntArrayList;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.LongArrayList;
import com.google.protobuf.MapEntryLite$Metadata;
import com.google.protobuf.Protobuf;
import com.google.protobuf.Schema;
import com.google.protobuf.Utf8;
import com.google.protobuf.WireFormat;
import com.google.protobuf.WireFormat$FieldType;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

final class BinaryReader$SafeHeapReader
extends BinaryReader {
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int endGroupTag;
    private final int initialPos;
    private int limit;
    private int pos;
    private int tag;

    public BinaryReader$SafeHeapReader(ByteBuffer byteBuffer, boolean bl2) {
        super(null);
        int n3;
        int n4;
        this.bufferIsImmutable = bl2;
        byte[] byArray = byteBuffer.array();
        this.buffer = byArray;
        int n7 = byteBuffer.arrayOffset();
        this.pos = n4 = byteBuffer.position() + n7;
        this.initialPos = n4;
        int n8 = byteBuffer.arrayOffset();
        this.limit = n3 = byteBuffer.limit() + n8;
    }

    private boolean isAtEnd() {
        int n3 = this.pos;
        int n4 = this.limit;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    private byte readByte() {
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

    private Object readField(WireFormat$FieldType object, Class clazz, ExtensionRegistryLite extensionRegistryLite) {
        int[] nArray = BinaryReader$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
        int n3 = object.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                object = new RuntimeException("unsupported field type.");
                throw object;
            }
            case 17: {
                return this.readUInt64();
            }
            case 16: {
                return this.readUInt32();
            }
            case 15: {
                return this.readStringRequireUtf8();
            }
            case 14: {
                return this.readSInt64();
            }
            case 13: {
                return this.readSInt32();
            }
            case 12: {
                return this.readSFixed64();
            }
            case 11: {
                return this.readSFixed32();
            }
            case 10: {
                return this.readMessage(clazz, extensionRegistryLite);
            }
            case 9: {
                return this.readInt64();
            }
            case 8: {
                return this.readInt32();
            }
            case 7: {
                return Float.valueOf(this.readFloat());
            }
            case 6: {
                return this.readFixed64();
            }
            case 5: {
                return this.readFixed32();
            }
            case 4: {
                return this.readEnum();
            }
            case 3: {
                return this.readDouble();
            }
            case 2: {
                return this.readBytes();
            }
            case 1: 
        }
        return this.readBool();
    }

    private Object readGroup(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        Object object = schema.newInstance();
        this.mergeGroupField(object, schema, extensionRegistryLite);
        schema.makeImmutable(object);
        return object;
    }

    private int readLittleEndian32() {
        this.requireBytes(4);
        return this.readLittleEndian32_NoCheck();
    }

    private int readLittleEndian32_NoCheck() {
        int n3;
        int n4 = this.pos;
        byte[] byArray = this.buffer;
        this.pos = n3 = n4 + 4;
        n3 = byArray[n4] & 0xFF;
        int n7 = n4 + 1;
        n7 = (byArray[n7] & 0xFF) << 8;
        n3 |= n7;
        n7 = n4 + 2;
        n7 = (byArray[n7] & 0xFF) << 16;
        return (byArray[n4 += 3] & 0xFF) << 24 | (n3 |= n7);
    }

    private long readLittleEndian64() {
        this.requireBytes(8);
        return this.readLittleEndian64_NoCheck();
    }

    private long readLittleEndian64_NoCheck() {
        int n3;
        int n4 = this.pos;
        byte[] byArray = this.buffer;
        this.pos = n3 = n4 + 8;
        long l2 = byArray[n4];
        long l3 = 255L;
        l2 &= l3;
        int n7 = n4 + 1;
        long l4 = ((long)byArray[n7] & l3) << 8;
        l2 |= l4;
        n7 = n4 + 2;
        l4 = ((long)byArray[n7] & l3) << 16;
        l2 |= l4;
        n7 = n4 + 3;
        l4 = ((long)byArray[n7] & l3) << 24;
        l2 |= l4;
        n7 = n4 + 4;
        l4 = ((long)byArray[n7] & l3) << 32;
        l2 |= l4;
        n7 = n4 + 5;
        l4 = ((long)byArray[n7] & l3) << 40;
        l2 |= l4;
        n7 = n4 + 6;
        l4 = ((long)byArray[n7] & l3) << 48;
        return ((long)byArray[n4 += 7] & l3) << 56 | (l2 |= l4);
    }

    private Object readMessage(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        Object object = schema.newInstance();
        this.mergeMessageField(object, schema, extensionRegistryLite);
        schema.makeImmutable(object);
        return object;
    }

    /*
     * Unable to fully structure code
     */
    private int readVarint32() {
        block9: {
            block8: {
                block10: {
                    var2_2 = this.limit;
                    var1_1 = this.pos;
                    if (var2_2 == var1_1) break block9;
                    var3_3 = this.buffer;
                    var4_4 = var1_1 + 1;
                    var5_5 = var3_3[var1_1];
                    if (var5_5 >= 0) {
                        this.pos = var4_4;
                        return var5_5;
                    }
                    var6_6 = 9;
                    if ((var2_2 -= var4_4) < var6_6) {
                        return (int)this.readVarint64SlowPath();
                    }
                    var2_2 = var1_1 + 2;
                    if ((var4_4 = var3_3[var4_4] << 7 ^ var5_5) >= 0) break block10;
                    var1_1 = var4_4 ^ -128;
                    break block8;
                }
                var5_5 = var1_1 + 3;
                if ((var2_2 = var3_3[var2_2] << 14 ^ var4_4) >= 0) {
                    var1_1 = var2_2 ^ 16256;
lbl21:
                    // 2 sources

                    while (true) {
                        var2_2 = var5_5;
                        break block8;
                        break;
                    }
                }
                var4_4 = var1_1 + 4;
                if ((var2_2 ^= (var5_5 = var3_3[var5_5] << 21)) < 0) {
                    var1_1 = -2080896 ^ var2_2;
lbl27:
                    // 2 sources

                    while (true) {
                        var2_2 = var4_4;
                        break block8;
                        break;
                    }
                }
                var5_5 = var1_1 + 5;
                var4_4 = var3_3[var4_4];
                var6_6 = var4_4 << 28;
                var2_2 ^= var6_6;
                var6_6 = 266354560;
                var2_2 ^= var6_6;
                if (var4_4 >= 0) ** GOTO lbl53
                var4_4 = var1_1 + 6;
                if ((var5_5 = var3_3[var5_5]) >= 0) ** GOTO lbl55
                var5_5 = var1_1 + 7;
                if ((var4_4 = var3_3[var4_4]) >= 0) ** GOTO lbl53
                var4_4 = var1_1 + 8;
                if ((var5_5 = var3_3[var5_5]) >= 0) ** GOTO lbl55
                var5_5 = var1_1 + 9;
                if ((var4_4 = var3_3[var4_4]) >= 0) ** GOTO lbl53
                var1_1 += 10;
                var7_7 = var3_3[var5_5];
                if (var7_7 >= 0) {
                    var8_8 = var2_2;
                    var2_2 = var1_1;
                    var1_1 = var8_8;
                } else {
                    throw InvalidProtocolBufferException.malformedVarint();
lbl53:
                    // 3 sources

                    var1_1 = var2_2;
                    ** continue;
lbl55:
                    // 2 sources

                    var1_1 = var2_2;
                    ** continue;
                }
            }
            this.pos = var2_2;
            return var1_1;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    private long readVarint64SlowPath() {
        int n3;
        long l2 = 0L;
        for (int i3 = 0; i3 < (n3 = 64); i3 += 7) {
            n3 = this.readByte();
            int n4 = n3 & 0x7F;
            long l3 = (long)n4 << i3;
            l2 |= l3;
            if ((n3 &= 0x80) != 0) continue;
            return l2;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    private void requireBytes(int n3) {
        if (n3 >= 0) {
            int n4 = this.limit;
            int n7 = this.pos;
            if (n3 <= (n4 -= n7)) {
                return;
            }
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    private void requirePosition(int n3) {
        int n4 = this.pos;
        if (n4 == n3) {
            return;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    private void requireWireType(int n3) {
        int n4 = WireFormat.getTagWireType(this.tag);
        if (n4 == n3) {
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    private void skipBytes(int n3) {
        int n4;
        this.requireBytes(n3);
        this.pos = n4 = this.pos + n3;
    }

    private void skipGroup() {
        int n3 = this.endGroupTag;
        int n4 = WireFormat.getTagFieldNumber(this.tag);
        int n7 = 4;
        this.endGroupTag = n4 = WireFormat.makeTag(n4, n7);
        while ((n4 = this.getFieldNumber()) != (n7 = -1 >>> 1) && (n4 = (int)(this.skipField() ? 1 : 0)) != 0) {
        }
        n4 = this.tag;
        n7 = this.endGroupTag;
        if (n4 == n7) {
            this.endGroupTag = n3;
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    private void skipVarint() {
        int n3 = this.limit;
        int n4 = this.pos;
        int n7 = 10;
        if ((n3 -= n4) >= n7) {
            byte[] byArray = this.buffer;
            for (int i3 = 0; i3 < n7; ++i3) {
                int n8 = n4 + 1;
                if ((n4 = byArray[n4]) >= 0) {
                    this.pos = n8;
                    return;
                }
                n4 = n8;
            }
        }
        this.skipVarintSlowPath();
    }

    private void skipVarintSlowPath() {
        int n3;
        for (int i3 = 0; i3 < (n3 = 10); ++i3) {
            n3 = this.readByte();
            if (n3 < 0) continue;
            return;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    private void verifyPackedFixed32Length(int n3) {
        this.requireBytes(n3);
        if ((n3 &= 3) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    private void verifyPackedFixed64Length(int n3) {
        this.requireBytes(n3);
        if ((n3 &= 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    public int getFieldNumber() {
        int n3 = this.isAtEnd();
        int n4 = -1 >>> 1;
        if (n3 != 0) {
            return n4;
        }
        this.tag = n3 = this.readVarint32();
        int n7 = this.endGroupTag;
        if (n3 == n7) {
            return n4;
        }
        return WireFormat.getTagFieldNumber(n3);
    }

    public int getTag() {
        return this.tag;
    }

    public int getTotalBytesRead() {
        int n3 = this.pos;
        int n4 = this.initialPos;
        return n3 - n4;
    }

    public void mergeGroupField(Object object, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        block5: {
            int n3;
            int n4 = this.endGroupTag;
            int n7 = WireFormat.getTagFieldNumber(this.tag);
            int n8 = 4;
            this.endGroupTag = n7 = WireFormat.makeTag(n7, n8);
            try {
                schema.mergeFrom(object, this, extensionRegistryLite);
                n3 = this.tag;
            }
            catch (Throwable throwable) {
                this.endGroupTag = n4;
                throw throwable;
            }
            int n10 = this.endGroupTag;
            if (n3 != n10) break block5;
            this.endGroupTag = n4;
            return;
        }
        object = InvalidProtocolBufferException.parseFailure();
        throw object;
    }

    public void mergeMessageField(Object object, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        block4: {
            int n3;
            int n4 = this.readVarint32();
            this.requireBytes(n4);
            int n7 = this.limit;
            this.limit = n3 = this.pos + n4;
            try {
                schema.mergeFrom(object, this, extensionRegistryLite);
                int n8 = this.pos;
                if (n8 != n3) break block4;
                this.limit = n7;
                return;
            }
            catch (Throwable throwable) {
                this.limit = n7;
                throw throwable;
            }
        }
        object = InvalidProtocolBufferException.parseFailure();
        throw object;
    }

    public boolean readBool() {
        boolean bl2 = false;
        this.requireWireType(0);
        int n3 = this.readVarint32();
        if (n3 != 0) {
            bl2 = true;
        }
        return bl2;
    }

    public void readBoolList(List list) {
        int n3;
        int n4;
        int n7;
        block17: {
            block18: {
                block16: {
                    int n8;
                    block13: {
                        int n10;
                        List list2;
                        block14: {
                            block15: {
                                n7 = list instanceof BooleanArrayList;
                                n4 = 0;
                                n3 = 1;
                                n8 = 2;
                                if (n7 == 0) break block13;
                                list2 = list;
                                list2 = (BooleanArrayList)list;
                                n10 = WireFormat.getTagWireType(this.tag);
                                if (n10 == 0) break block14;
                                if (n10 != n8) break block15;
                                n10 = this.readVarint32();
                                n8 = this.pos + n10;
                                while ((n10 = this.pos) < n8) {
                                    n10 = this.readVarint32();
                                    if (n10 != 0) {
                                        n10 = 1;
                                    } else {
                                        n10 = 0;
                                        list = null;
                                    }
                                    ((BooleanArrayList)list2).addBoolean(n10 != 0);
                                }
                                this.requirePosition(n8);
                                break block16;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            n10 = (int)(this.readBool() ? 1 : 0);
                            ((BooleanArrayList)list2).addBoolean(n10 != 0);
                            n10 = this.isAtEnd();
                            if (n10 != 0) {
                                return;
                            }
                            n10 = this.pos;
                        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
                        this.pos = n10;
                        return;
                    }
                    n7 = WireFormat.getTagWireType(this.tag);
                    if (n7 == 0) break block17;
                    if (n7 != n8) break block18;
                    n7 = this.readVarint32();
                    n8 = this.pos + n7;
                    while ((n7 = this.pos) < n8) {
                        Boolean bl2;
                        n7 = this.readVarint32();
                        if (n7 != 0) {
                            n7 = 1;
                        } else {
                            n7 = 0;
                            bl2 = null;
                        }
                        bl2 = n7 != 0;
                        list.add(bl2);
                    }
                    this.requirePosition(n8);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Boolean bl3 = this.readBool();
            list.add(bl3);
            n7 = (int)(this.isAtEnd() ? 1 : 0);
            if (n7 != 0) {
                return;
            }
            n7 = this.pos;
        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
        this.pos = n7;
    }

    public ByteString readBytes() {
        int n3;
        Object object;
        this.requireWireType(2);
        int n4 = this.readVarint32();
        if (n4 == 0) {
            return ByteString.EMPTY;
        }
        this.requireBytes(n4);
        boolean bl2 = this.bufferIsImmutable;
        if (bl2) {
            object = this.buffer;
            n3 = this.pos;
            object = ByteString.wrap(object, n3, n4);
        } else {
            object = this.buffer;
            n3 = this.pos;
            object = ByteString.copyFrom(object, n3, n4);
        }
        this.pos = n3 = this.pos + n4;
        return object;
    }

    public void readBytesList(List list) {
        int n3;
        int n4 = WireFormat.getTagWireType(this.tag);
        if (n4 == (n3 = 2)) {
            int n7;
            do {
                ByteString byteString = this.readBytes();
                list.add(byteString);
                n4 = (int)(this.isAtEnd() ? 1 : 0);
                if (n4 != 0) {
                    return;
                }
                n4 = this.pos;
            } while ((n3 = this.readVarint32()) == (n7 = this.tag));
            this.pos = n4;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public double readDouble() {
        this.requireWireType(1);
        return Double.longBitsToDouble(this.readLittleEndian64());
    }

    public void readDoubleList(List list) {
        int n3;
        int n4;
        int n7;
        block11: {
            block12: {
                block10: {
                    block7: {
                        int n8;
                        List list2;
                        block8: {
                            block9: {
                                n7 = list instanceof DoubleArrayList;
                                n4 = 2;
                                n3 = 1;
                                if (n7 == 0) break block7;
                                list2 = list;
                                list2 = (DoubleArrayList)list;
                                n8 = WireFormat.getTagWireType(this.tag);
                                if (n8 == n3) break block8;
                                if (n8 != n4) break block9;
                                n8 = this.readVarint32();
                                this.verifyPackedFixed64Length(n8);
                                n4 = this.pos + n8;
                                while ((n8 = this.pos) < n4) {
                                    long l2 = this.readLittleEndian64_NoCheck();
                                    double d2 = Double.longBitsToDouble(l2);
                                    ((DoubleArrayList)list2).addDouble(d2);
                                }
                                break block10;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            double d5 = this.readDouble();
                            ((DoubleArrayList)list2).addDouble(d5);
                            n8 = (int)(this.isAtEnd() ? 1 : 0);
                            if (n8 != 0) {
                                return;
                            }
                            n8 = this.pos;
                        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
                        this.pos = n8;
                        return;
                    }
                    n7 = WireFormat.getTagWireType(this.tag);
                    if (n7 == n3) break block11;
                    if (n7 == n4) {
                        n7 = this.readVarint32();
                        this.verifyPackedFixed64Length(n7);
                        n4 = this.pos + n7;
                        while ((n7 = this.pos) < n4) {
                            long l3 = this.readLittleEndian64_NoCheck();
                            double d7 = Double.longBitsToDouble(l3);
                            Double d9 = d7;
                            list.add(d9);
                        }
                    }
                    break block12;
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            double d12 = this.readDouble();
            Double d13 = d12;
            list.add(d13);
            n7 = (int)(this.isAtEnd() ? 1 : 0);
            if (n7 != 0) {
                return;
            }
            n7 = this.pos;
        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
        this.pos = n7;
    }

    public int readEnum() {
        this.requireWireType(0);
        return this.readVarint32();
    }

    public void readEnumList(List list) {
        int n3;
        int n4;
        int n7;
        block11: {
            block12: {
                block10: {
                    block7: {
                        int n8;
                        int n10;
                        List list2;
                        block8: {
                            block9: {
                                n7 = list instanceof IntArrayList;
                                n4 = 2;
                                if (n7 == 0) break block7;
                                list2 = list;
                                list2 = (IntArrayList)list;
                                n10 = WireFormat.getTagWireType(this.tag);
                                if (n10 == 0) break block8;
                                if (n10 != n4) break block9;
                                n10 = this.readVarint32();
                                n4 = this.pos + n10;
                                while ((n10 = this.pos) < n4) {
                                    n10 = this.readVarint32();
                                    ((IntArrayList)list2).addInt(n10);
                                }
                                break block10;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            n10 = this.readEnum();
                            ((IntArrayList)list2).addInt(n10);
                            n10 = (int)(this.isAtEnd() ? 1 : 0);
                            if (n10 != 0) {
                                return;
                            }
                            n10 = this.pos;
                        } while ((n4 = this.readVarint32()) == (n8 = this.tag));
                        this.pos = n10;
                        return;
                    }
                    n7 = WireFormat.getTagWireType(this.tag);
                    if (n7 == 0) break block11;
                    if (n7 == n4) {
                        n7 = this.readVarint32();
                        n4 = this.pos + n7;
                        while ((n7 = this.pos) < n4) {
                            n7 = this.readVarint32();
                            Integer n14 = n7;
                            list.add(n14);
                        }
                    }
                    break block12;
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Integer n15 = this.readEnum();
            list.add(n15);
            n7 = (int)(this.isAtEnd() ? 1 : 0);
            if (n7 != 0) {
                return;
            }
            n7 = this.pos;
        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
        this.pos = n7;
    }

    public int readFixed32() {
        this.requireWireType(5);
        return this.readLittleEndian32();
    }

    public void readFixed32List(List list) {
        int n3 = list instanceof IntArrayList;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            list = (IntArrayList)list;
            n3 = WireFormat.getTagWireType(this.tag);
            if (n3 != n7) {
                if (n3 == n4) {
                    do {
                        n3 = this.readFixed32();
                        ((IntArrayList)list).addInt(n3);
                        n3 = (int)(this.isAtEnd() ? 1 : 0);
                        if (n3 != 0) {
                            return;
                        }
                        n3 = this.pos;
                    } while ((n4 = this.readVarint32()) == (n7 = this.tag));
                    this.pos = n3;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            n3 = this.readVarint32();
            this.verifyPackedFixed32Length(n3);
            n4 = this.pos + n3;
            while ((n3 = this.pos) < n4) {
                n3 = this.readLittleEndian32_NoCheck();
                ((IntArrayList)list).addInt(n3);
            }
        } else {
            n3 = WireFormat.getTagWireType(this.tag);
            if (n3 != n7) {
                if (n3 == n4) {
                    do {
                        Integer n8 = this.readFixed32();
                        list.add(n8);
                        n3 = (int)(this.isAtEnd() ? 1 : 0);
                        if (n3 != 0) {
                            return;
                        }
                        n3 = this.pos;
                    } while ((n4 = this.readVarint32()) == (n7 = this.tag));
                    this.pos = n3;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            n3 = this.readVarint32();
            this.verifyPackedFixed32Length(n3);
            n4 = this.pos + n3;
            while ((n3 = this.pos) < n4) {
                n3 = this.readLittleEndian32_NoCheck();
                Integer n10 = n3;
                list.add(n10);
            }
        }
    }

    public long readFixed64() {
        this.requireWireType(1);
        return this.readLittleEndian64();
    }

    public void readFixed64List(List list) {
        int n3;
        int n4;
        int n7;
        block11: {
            block12: {
                block10: {
                    block7: {
                        int n8;
                        List list2;
                        block8: {
                            block9: {
                                n7 = list instanceof LongArrayList;
                                n4 = 2;
                                n3 = 1;
                                if (n7 == 0) break block7;
                                list2 = list;
                                list2 = (LongArrayList)list;
                                n8 = WireFormat.getTagWireType(this.tag);
                                if (n8 == n3) break block8;
                                if (n8 != n4) break block9;
                                n8 = this.readVarint32();
                                this.verifyPackedFixed64Length(n8);
                                n4 = this.pos + n8;
                                while ((n8 = this.pos) < n4) {
                                    long l2 = this.readLittleEndian64_NoCheck();
                                    ((LongArrayList)list2).addLong(l2);
                                }
                                break block10;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            long l3 = this.readFixed64();
                            ((LongArrayList)list2).addLong(l3);
                            n8 = (int)(this.isAtEnd() ? 1 : 0);
                            if (n8 != 0) {
                                return;
                            }
                            n8 = this.pos;
                        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
                        this.pos = n8;
                        return;
                    }
                    n7 = WireFormat.getTagWireType(this.tag);
                    if (n7 == n3) break block11;
                    if (n7 == n4) {
                        n7 = this.readVarint32();
                        this.verifyPackedFixed64Length(n7);
                        n4 = this.pos + n7;
                        while ((n7 = this.pos) < n4) {
                            long l4 = this.readLittleEndian64_NoCheck();
                            Long l7 = l4;
                            list.add(l7);
                        }
                    }
                    break block12;
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            long l8 = this.readFixed64();
            Long l12 = l8;
            list.add(l12);
            n7 = (int)(this.isAtEnd() ? 1 : 0);
            if (n7 != 0) {
                return;
            }
            n7 = this.pos;
        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
        this.pos = n7;
    }

    public float readFloat() {
        this.requireWireType(5);
        return Float.intBitsToFloat(this.readLittleEndian32());
    }

    public void readFloatList(List list) {
        int n3 = list instanceof FloatArrayList;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            list = (FloatArrayList)list;
            n3 = WireFormat.getTagWireType(this.tag);
            if (n3 != n7) {
                if (n3 == n4) {
                    do {
                        float f5 = this.readFloat();
                        ((FloatArrayList)list).addFloat(f5);
                        n3 = (int)(this.isAtEnd() ? 1 : 0);
                        if (n3 != 0) {
                            return;
                        }
                        n3 = this.pos;
                    } while ((n4 = this.readVarint32()) == (n7 = this.tag));
                    this.pos = n3;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            n3 = this.readVarint32();
            this.verifyPackedFixed32Length(n3);
            n4 = this.pos + n3;
            while ((n3 = this.pos) < n4) {
                n3 = this.readLittleEndian32_NoCheck();
                float f6 = Float.intBitsToFloat(n3);
                ((FloatArrayList)list).addFloat(f6);
            }
        } else {
            n3 = WireFormat.getTagWireType(this.tag);
            if (n3 != n7) {
                if (n3 == n4) {
                    do {
                        float f7 = this.readFloat();
                        Float f8 = Float.valueOf(f7);
                        list.add(f8);
                        n3 = (int)(this.isAtEnd() ? 1 : 0);
                        if (n3 != 0) {
                            return;
                        }
                        n3 = this.pos;
                    } while ((n4 = this.readVarint32()) == (n7 = this.tag));
                    this.pos = n3;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            n3 = this.readVarint32();
            this.verifyPackedFixed32Length(n3);
            n4 = this.pos + n3;
            while ((n3 = this.pos) < n4) {
                n3 = this.readLittleEndian32_NoCheck();
                float f11 = Float.intBitsToFloat(n3);
                Float f12 = Float.valueOf(f11);
                list.add(f12);
            }
        }
    }

    public Object readGroup(Class object, ExtensionRegistryLite extensionRegistryLite) {
        this.requireWireType(3);
        object = Protobuf.getInstance().schemaFor((Class)object);
        return this.readGroup((Schema)object, extensionRegistryLite);
    }

    public Object readGroupBySchemaWithCheck(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        this.requireWireType(3);
        return this.readGroup(schema, extensionRegistryLite);
    }

    public void readGroupList(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int n3;
        int n4 = WireFormat.getTagWireType(this.tag);
        if (n4 == (n3 = 3)) {
            int n7;
            n4 = this.tag;
            do {
                Object object = this.readGroup(schema, extensionRegistryLite);
                list.add(object);
                n3 = (int)(this.isAtEnd() ? 1 : 0);
                if (n3 != 0) {
                    return;
                }
                n3 = this.pos;
            } while ((n7 = this.readVarint32()) == n4);
            this.pos = n3;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public void readGroupList(List list, Class object, ExtensionRegistryLite extensionRegistryLite) {
        object = Protobuf.getInstance().schemaFor((Class)object);
        this.readGroupList(list, (Schema)object, extensionRegistryLite);
    }

    public int readInt32() {
        this.requireWireType(0);
        return this.readVarint32();
    }

    public void readInt32List(List list) {
        int n3;
        int n4;
        int n7;
        block13: {
            block14: {
                block12: {
                    block9: {
                        int n8;
                        int n10;
                        List list2;
                        block10: {
                            block11: {
                                n7 = list instanceof IntArrayList;
                                n4 = 2;
                                if (n7 == 0) break block9;
                                list2 = list;
                                list2 = (IntArrayList)list;
                                n10 = WireFormat.getTagWireType(this.tag);
                                if (n10 == 0) break block10;
                                if (n10 != n4) break block11;
                                n10 = this.readVarint32();
                                n4 = this.pos + n10;
                                while ((n10 = this.pos) < n4) {
                                    n10 = this.readVarint32();
                                    ((IntArrayList)list2).addInt(n10);
                                }
                                this.requirePosition(n4);
                                break block12;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            n10 = this.readInt32();
                            ((IntArrayList)list2).addInt(n10);
                            n10 = (int)(this.isAtEnd() ? 1 : 0);
                            if (n10 != 0) {
                                return;
                            }
                            n10 = this.pos;
                        } while ((n4 = this.readVarint32()) == (n8 = this.tag));
                        this.pos = n10;
                        return;
                    }
                    n7 = WireFormat.getTagWireType(this.tag);
                    if (n7 == 0) break block13;
                    if (n7 != n4) break block14;
                    n7 = this.readVarint32();
                    n4 = this.pos + n7;
                    while ((n7 = this.pos) < n4) {
                        n7 = this.readVarint32();
                        Integer n14 = n7;
                        list.add(n14);
                    }
                    this.requirePosition(n4);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Integer n15 = this.readInt32();
            list.add(n15);
            n7 = (int)(this.isAtEnd() ? 1 : 0);
            if (n7 != 0) {
                return;
            }
            n7 = this.pos;
        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
        this.pos = n7;
    }

    public long readInt64() {
        this.requireWireType(0);
        return this.readVarint64();
    }

    public void readInt64List(List list) {
        int n3;
        int n4;
        int n7;
        block13: {
            block14: {
                block12: {
                    block9: {
                        int n8;
                        int n10;
                        List list2;
                        block10: {
                            block11: {
                                n7 = list instanceof LongArrayList;
                                n4 = 2;
                                if (n7 == 0) break block9;
                                list2 = list;
                                list2 = (LongArrayList)list;
                                n10 = WireFormat.getTagWireType(this.tag);
                                if (n10 == 0) break block10;
                                if (n10 != n4) break block11;
                                n10 = this.readVarint32();
                                n4 = this.pos + n10;
                                while ((n10 = this.pos) < n4) {
                                    long l2 = this.readVarint64();
                                    ((LongArrayList)list2).addLong(l2);
                                }
                                this.requirePosition(n4);
                                break block12;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            long l3 = this.readInt64();
                            ((LongArrayList)list2).addLong(l3);
                            n10 = (int)(this.isAtEnd() ? 1 : 0);
                            if (n10 != 0) {
                                return;
                            }
                            n10 = this.pos;
                        } while ((n4 = this.readVarint32()) == (n8 = this.tag));
                        this.pos = n10;
                        return;
                    }
                    n7 = WireFormat.getTagWireType(this.tag);
                    if (n7 == 0) break block13;
                    if (n7 != n4) break block14;
                    n7 = this.readVarint32();
                    n4 = this.pos + n7;
                    while ((n7 = this.pos) < n4) {
                        long l4 = this.readVarint64();
                        Long l7 = l4;
                        list.add(l7);
                    }
                    this.requirePosition(n4);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            long l8 = this.readInt64();
            Long l12 = l8;
            list.add(l12);
            n7 = (int)(this.isAtEnd() ? 1 : 0);
            if (n7 != 0) {
                return;
            }
            n7 = this.pos;
        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
        this.pos = n7;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void readMap(Map object, MapEntryLite$Metadata mapEntryLite$Metadata, ExtensionRegistryLite extensionRegistryLite) {
        Throwable throwable222222;
        int n3;
        int n4 = 2;
        this.requireWireType(n4);
        int n7 = this.readVarint32();
        this.requireBytes(n7);
        int n8 = this.limit;
        this.limit = n3 = this.pos + n7;
        Object object2 = mapEntryLite$Metadata.defaultKey;
        Object object3 = mapEntryLite$Metadata.defaultValue;
        while (true) {
            Class<?> clazz;
            Object object4;
            int n10;
            int n14;
            if ((n14 = this.getFieldNumber()) == (n10 = -1 >>> 1)) {
                object.put(object2, object3);
                this.limit = n8;
                return;
            }
            n10 = 1;
            String string2 = "Unable to parse map entry.";
            if (n14 != n10) {
                if (n14 != n4) {
                    n14 = (int)(this.skipField() ? 1 : 0);
                    if (n14 != 0) continue;
                    object4 = new InvalidProtocolBufferException(string2);
                    throw object4;
                }
                object4 = mapEntryLite$Metadata.valueType;
                clazz = mapEntryLite$Metadata.defaultValue;
                clazz = clazz.getClass();
                object3 = this.readField((WireFormat$FieldType)((Object)object4), clazz, extensionRegistryLite);
                continue;
            }
            object4 = mapEntryLite$Metadata.keyType;
            n10 = 0;
            clazz = null;
            object2 = this.readField((WireFormat$FieldType)((Object)object4), null, null);
        }
        {
            catch (Throwable throwable222222) {}
        }
        this.limit = n8;
        throw throwable222222;
    }

    public Object readMessage(Class object, ExtensionRegistryLite extensionRegistryLite) {
        this.requireWireType(2);
        object = Protobuf.getInstance().schemaFor((Class)object);
        return this.readMessage((Schema)object, extensionRegistryLite);
    }

    public Object readMessageBySchemaWithCheck(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        this.requireWireType(2);
        return this.readMessage(schema, extensionRegistryLite);
    }

    public void readMessageList(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int n3;
        int n4 = WireFormat.getTagWireType(this.tag);
        if (n4 == (n3 = 2)) {
            int n7;
            n4 = this.tag;
            do {
                Object object = this.readMessage(schema, extensionRegistryLite);
                list.add(object);
                n3 = (int)(this.isAtEnd() ? 1 : 0);
                if (n3 != 0) {
                    return;
                }
                n3 = this.pos;
            } while ((n7 = this.readVarint32()) == n4);
            this.pos = n3;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public void readMessageList(List list, Class object, ExtensionRegistryLite extensionRegistryLite) {
        object = Protobuf.getInstance().schemaFor((Class)object);
        this.readMessageList(list, (Schema)object, extensionRegistryLite);
    }

    public int readSFixed32() {
        this.requireWireType(5);
        return this.readLittleEndian32();
    }

    public void readSFixed32List(List list) {
        int n3 = list instanceof IntArrayList;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            list = (IntArrayList)list;
            n3 = WireFormat.getTagWireType(this.tag);
            if (n3 != n7) {
                if (n3 == n4) {
                    do {
                        n3 = this.readSFixed32();
                        ((IntArrayList)list).addInt(n3);
                        n3 = (int)(this.isAtEnd() ? 1 : 0);
                        if (n3 != 0) {
                            return;
                        }
                        n3 = this.pos;
                    } while ((n4 = this.readVarint32()) == (n7 = this.tag));
                    this.pos = n3;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            n3 = this.readVarint32();
            this.verifyPackedFixed32Length(n3);
            n4 = this.pos + n3;
            while ((n3 = this.pos) < n4) {
                n3 = this.readLittleEndian32_NoCheck();
                ((IntArrayList)list).addInt(n3);
            }
        } else {
            n3 = WireFormat.getTagWireType(this.tag);
            if (n3 != n7) {
                if (n3 == n4) {
                    do {
                        Integer n8 = this.readSFixed32();
                        list.add(n8);
                        n3 = (int)(this.isAtEnd() ? 1 : 0);
                        if (n3 != 0) {
                            return;
                        }
                        n3 = this.pos;
                    } while ((n4 = this.readVarint32()) == (n7 = this.tag));
                    this.pos = n3;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            n3 = this.readVarint32();
            this.verifyPackedFixed32Length(n3);
            n4 = this.pos + n3;
            while ((n3 = this.pos) < n4) {
                n3 = this.readLittleEndian32_NoCheck();
                Integer n10 = n3;
                list.add(n10);
            }
        }
    }

    public long readSFixed64() {
        this.requireWireType(1);
        return this.readLittleEndian64();
    }

    public void readSFixed64List(List list) {
        int n3;
        int n4;
        int n7;
        block11: {
            block12: {
                block10: {
                    block7: {
                        int n8;
                        List list2;
                        block8: {
                            block9: {
                                n7 = list instanceof LongArrayList;
                                n4 = 2;
                                n3 = 1;
                                if (n7 == 0) break block7;
                                list2 = list;
                                list2 = (LongArrayList)list;
                                n8 = WireFormat.getTagWireType(this.tag);
                                if (n8 == n3) break block8;
                                if (n8 != n4) break block9;
                                n8 = this.readVarint32();
                                this.verifyPackedFixed64Length(n8);
                                n4 = this.pos + n8;
                                while ((n8 = this.pos) < n4) {
                                    long l2 = this.readLittleEndian64_NoCheck();
                                    ((LongArrayList)list2).addLong(l2);
                                }
                                break block10;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            long l3 = this.readSFixed64();
                            ((LongArrayList)list2).addLong(l3);
                            n8 = (int)(this.isAtEnd() ? 1 : 0);
                            if (n8 != 0) {
                                return;
                            }
                            n8 = this.pos;
                        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
                        this.pos = n8;
                        return;
                    }
                    n7 = WireFormat.getTagWireType(this.tag);
                    if (n7 == n3) break block11;
                    if (n7 == n4) {
                        n7 = this.readVarint32();
                        this.verifyPackedFixed64Length(n7);
                        n4 = this.pos + n7;
                        while ((n7 = this.pos) < n4) {
                            long l4 = this.readLittleEndian64_NoCheck();
                            Long l7 = l4;
                            list.add(l7);
                        }
                    }
                    break block12;
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            long l8 = this.readSFixed64();
            Long l12 = l8;
            list.add(l12);
            n7 = (int)(this.isAtEnd() ? 1 : 0);
            if (n7 != 0) {
                return;
            }
            n7 = this.pos;
        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
        this.pos = n7;
    }

    public int readSInt32() {
        this.requireWireType(0);
        return CodedInputStream.decodeZigZag32(this.readVarint32());
    }

    public void readSInt32List(List list) {
        int n3;
        int n4;
        int n7;
        block11: {
            block12: {
                block10: {
                    block7: {
                        int n8;
                        int n10;
                        List list2;
                        block8: {
                            block9: {
                                n7 = list instanceof IntArrayList;
                                n4 = 2;
                                if (n7 == 0) break block7;
                                list2 = list;
                                list2 = (IntArrayList)list;
                                n10 = WireFormat.getTagWireType(this.tag);
                                if (n10 == 0) break block8;
                                if (n10 != n4) break block9;
                                n10 = this.readVarint32();
                                n4 = this.pos + n10;
                                while ((n10 = this.pos) < n4) {
                                    n10 = CodedInputStream.decodeZigZag32(this.readVarint32());
                                    ((IntArrayList)list2).addInt(n10);
                                }
                                break block10;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            n10 = this.readSInt32();
                            ((IntArrayList)list2).addInt(n10);
                            n10 = (int)(this.isAtEnd() ? 1 : 0);
                            if (n10 != 0) {
                                return;
                            }
                            n10 = this.pos;
                        } while ((n4 = this.readVarint32()) == (n8 = this.tag));
                        this.pos = n10;
                        return;
                    }
                    n7 = WireFormat.getTagWireType(this.tag);
                    if (n7 == 0) break block11;
                    if (n7 == n4) {
                        n7 = this.readVarint32();
                        n4 = this.pos + n7;
                        while ((n7 = this.pos) < n4) {
                            n7 = CodedInputStream.decodeZigZag32(this.readVarint32());
                            Integer n14 = n7;
                            list.add(n14);
                        }
                    }
                    break block12;
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Integer n15 = this.readSInt32();
            list.add(n15);
            n7 = (int)(this.isAtEnd() ? 1 : 0);
            if (n7 != 0) {
                return;
            }
            n7 = this.pos;
        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
        this.pos = n7;
    }

    public long readSInt64() {
        this.requireWireType(0);
        return CodedInputStream.decodeZigZag64(this.readVarint64());
    }

    public void readSInt64List(List list) {
        int n3;
        int n4;
        int n7;
        block11: {
            block12: {
                block10: {
                    block7: {
                        int n8;
                        int n10;
                        List list2;
                        block8: {
                            block9: {
                                n7 = list instanceof LongArrayList;
                                n4 = 2;
                                if (n7 == 0) break block7;
                                list2 = list;
                                list2 = (LongArrayList)list;
                                n10 = WireFormat.getTagWireType(this.tag);
                                if (n10 == 0) break block8;
                                if (n10 != n4) break block9;
                                n10 = this.readVarint32();
                                n4 = this.pos + n10;
                                while ((n10 = this.pos) < n4) {
                                    long l2 = CodedInputStream.decodeZigZag64(this.readVarint64());
                                    ((LongArrayList)list2).addLong(l2);
                                }
                                break block10;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            long l3 = this.readSInt64();
                            ((LongArrayList)list2).addLong(l3);
                            n10 = (int)(this.isAtEnd() ? 1 : 0);
                            if (n10 != 0) {
                                return;
                            }
                            n10 = this.pos;
                        } while ((n4 = this.readVarint32()) == (n8 = this.tag));
                        this.pos = n10;
                        return;
                    }
                    n7 = WireFormat.getTagWireType(this.tag);
                    if (n7 == 0) break block11;
                    if (n7 == n4) {
                        n7 = this.readVarint32();
                        n4 = this.pos + n7;
                        while ((n7 = this.pos) < n4) {
                            long l4 = CodedInputStream.decodeZigZag64(this.readVarint64());
                            Long l7 = l4;
                            list.add(l7);
                        }
                    }
                    break block12;
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            long l8 = this.readSInt64();
            Long l12 = l8;
            list.add(l12);
            n7 = (int)(this.isAtEnd() ? 1 : 0);
            if (n7 != 0) {
                return;
            }
            n7 = this.pos;
        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
        this.pos = n7;
    }

    public String readString() {
        return this.readStringInternal(false);
    }

    public String readStringInternal(boolean bl2) {
        int n3;
        int n4;
        Object object;
        this.requireWireType(2);
        int n7 = this.readVarint32();
        if (n7 == 0) {
            return "";
        }
        this.requireBytes(n7);
        if (bl2 && !(bl2 = Utf8.isValidUtf8((byte[])(object = (Object)this.buffer), n4 = this.pos, n3 = n4 + n7))) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        byte[] byArray = this.buffer;
        n3 = this.pos;
        Charset charset = Internal.UTF_8;
        object = new String(byArray, n3, n7, charset);
        this.pos = n4 = this.pos + n7;
        return object;
    }

    public void readStringList(List list) {
        this.readStringListInternal(list, false);
    }

    public void readStringListInternal(List iterable, boolean n3) {
        int n4;
        int n7 = WireFormat.getTagWireType(this.tag);
        if (n7 == (n4 = 2)) {
            int n8;
            n7 = iterable instanceof LazyStringList;
            if (n7 != 0 && n3 == 0) {
                int n10;
                List list = iterable;
                list = (LazyStringList)iterable;
                do {
                    iterable = this.readBytes();
                    list.add((ByteString)iterable);
                    n10 = this.isAtEnd();
                    if (n10 != 0) {
                        return;
                    }
                    n10 = this.pos;
                } while ((n3 = this.readVarint32()) == (n4 = this.tag));
                this.pos = n10;
                return;
            }
            do {
                String string2 = this.readStringInternal(n3 != 0);
                iterable.add(string2);
                n7 = (int)(this.isAtEnd() ? 1 : 0);
                if (n7 != 0) {
                    return;
                }
                n7 = this.pos;
            } while ((n4 = this.readVarint32()) == (n8 = this.tag));
            this.pos = n7;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public void readStringListRequireUtf8(List list) {
        this.readStringListInternal(list, true);
    }

    public String readStringRequireUtf8() {
        return this.readStringInternal(true);
    }

    public int readUInt32() {
        this.requireWireType(0);
        return this.readVarint32();
    }

    public void readUInt32List(List list) {
        int n3;
        int n4;
        int n7;
        block11: {
            block12: {
                block10: {
                    block7: {
                        int n8;
                        int n10;
                        List list2;
                        block8: {
                            block9: {
                                n7 = list instanceof IntArrayList;
                                n4 = 2;
                                if (n7 == 0) break block7;
                                list2 = list;
                                list2 = (IntArrayList)list;
                                n10 = WireFormat.getTagWireType(this.tag);
                                if (n10 == 0) break block8;
                                if (n10 != n4) break block9;
                                n10 = this.readVarint32();
                                n4 = this.pos + n10;
                                while ((n10 = this.pos) < n4) {
                                    n10 = this.readVarint32();
                                    ((IntArrayList)list2).addInt(n10);
                                }
                                break block10;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            n10 = this.readUInt32();
                            ((IntArrayList)list2).addInt(n10);
                            n10 = (int)(this.isAtEnd() ? 1 : 0);
                            if (n10 != 0) {
                                return;
                            }
                            n10 = this.pos;
                        } while ((n4 = this.readVarint32()) == (n8 = this.tag));
                        this.pos = n10;
                        return;
                    }
                    n7 = WireFormat.getTagWireType(this.tag);
                    if (n7 == 0) break block11;
                    if (n7 == n4) {
                        n7 = this.readVarint32();
                        n4 = this.pos + n7;
                        while ((n7 = this.pos) < n4) {
                            n7 = this.readVarint32();
                            Integer n14 = n7;
                            list.add(n14);
                        }
                    }
                    break block12;
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Integer n15 = this.readUInt32();
            list.add(n15);
            n7 = (int)(this.isAtEnd() ? 1 : 0);
            if (n7 != 0) {
                return;
            }
            n7 = this.pos;
        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
        this.pos = n7;
    }

    public long readUInt64() {
        this.requireWireType(0);
        return this.readVarint64();
    }

    public void readUInt64List(List list) {
        int n3;
        int n4;
        int n7;
        block13: {
            block14: {
                block12: {
                    block9: {
                        int n8;
                        int n10;
                        List list2;
                        block10: {
                            block11: {
                                n7 = list instanceof LongArrayList;
                                n4 = 2;
                                if (n7 == 0) break block9;
                                list2 = list;
                                list2 = (LongArrayList)list;
                                n10 = WireFormat.getTagWireType(this.tag);
                                if (n10 == 0) break block10;
                                if (n10 != n4) break block11;
                                n10 = this.readVarint32();
                                n4 = this.pos + n10;
                                while ((n10 = this.pos) < n4) {
                                    long l2 = this.readVarint64();
                                    ((LongArrayList)list2).addLong(l2);
                                }
                                this.requirePosition(n4);
                                break block12;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            long l3 = this.readUInt64();
                            ((LongArrayList)list2).addLong(l3);
                            n10 = (int)(this.isAtEnd() ? 1 : 0);
                            if (n10 != 0) {
                                return;
                            }
                            n10 = this.pos;
                        } while ((n4 = this.readVarint32()) == (n8 = this.tag));
                        this.pos = n10;
                        return;
                    }
                    n7 = WireFormat.getTagWireType(this.tag);
                    if (n7 == 0) break block13;
                    if (n7 != n4) break block14;
                    n7 = this.readVarint32();
                    n4 = this.pos + n7;
                    while ((n7 = this.pos) < n4) {
                        long l4 = this.readVarint64();
                        Long l7 = l4;
                        list.add(l7);
                    }
                    this.requirePosition(n4);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            long l8 = this.readUInt64();
            Long l12 = l8;
            list.add(l12);
            n7 = (int)(this.isAtEnd() ? 1 : 0);
            if (n7 != 0) {
                return;
            }
            n7 = this.pos;
        } while ((n4 = this.readVarint32()) == (n3 = this.tag));
        this.pos = n7;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public long readVarint64() {
        var2_2 = this.limit;
        var1_1 = this.pos;
        if (var2_2 != var1_1) {
            var3_3 = this.buffer;
            var4_4 = var1_1 + 1;
            var5_5 = var3_3[var1_1];
            if (var5_5 >= 0) {
                this.pos = var4_4;
                return var5_5;
            }
            var6_6 = 9;
            if ((var2_2 -= var4_4) < var6_6) {
                return this.readVarint64SlowPath();
            }
            var2_2 = var1_1 + 2;
            if ((var4_4 = var3_3[var4_4] << 7 ^ var5_5) < 0) {
                var1_1 = var4_4 ^ -128;
                var7_7 = var1_1;
            } else {
                var5_5 = var1_1 + 3;
                if ((var2_2 = var3_3[var2_2] << 14 ^ var4_4) >= 0) {
                    var1_1 = var2_2 ^ 16256;
                    var7_7 = var1_1;
                    var2_2 = var5_5;
                } else {
                    var4_4 = var1_1 + 4;
                    if ((var2_2 ^= (var5_5 = var3_3[var5_5] << 21)) < 0) {
                        var1_1 = -2080896 ^ var2_2;
                        var9_8 = var1_1;
                        var2_2 = var4_4;
                        var7_7 = var9_8;
                    } else {
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
lbl41:
                            // 2 sources

                            while (true) {
                                var7_7 = var15_12 ^ var17_13;
                                break;
                            }
                        } else {
                            var19_14 /* !! */  = var1_1 + 6;
                            var20_15 = (long)var3_3[var2_2] << 35;
                            cfr_temp_1 = (var15_12 ^= var20_15) - var17_13;
                            if ((var2_2 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) < 0) {
                                var9_9 = -34093383808L;
lbl49:
                                // 2 sources

                                while (true) {
                                    var7_7 = var15_12 ^ var9_9;
                                    var2_2 = (int)var19_14 /* !! */ ;
                                    break;
                                }
                            } else {
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
                                if (var19_14 /* !! */  < 0) {
                                    var1_1 += 10;
                                    var25_18 = var2_2 = var3_3[var2_2];
                                    cfr_temp_5 = var25_18 - var17_13;
                                    var19_14 /* !! */  = (long)(cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1));
                                    if (var19_14 /* !! */  < 0) {
                                        throw InvalidProtocolBufferException.malformedVarint();
                                    }
                                    var2_2 = var1_1;
                                }
                                var7_7 = var15_12;
                            }
                        }
                    }
                }
            }
            this.pos = var2_2;
            return var7_7;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public boolean skipField() {
        int n3;
        int n4 = this.isAtEnd();
        if (n4 == 0 && (n4 = this.tag) != (n3 = this.endGroupTag)) {
            n4 = WireFormat.getTagWireType(n4);
            n3 = 1;
            if (n4 != 0) {
                if (n4 != n3) {
                    int n7 = 2;
                    if (n4 != n7) {
                        n7 = 3;
                        if (n4 != n7) {
                            n7 = 5;
                            if (n4 == n7) {
                                this.skipBytes(4);
                                return n3 != 0;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        this.skipGroup();
                        return n3 != 0;
                    }
                    n4 = this.readVarint32();
                    this.skipBytes(n4);
                    return n3 != 0;
                }
                this.skipBytes(8);
                return n3 != 0;
            }
            this.skipVarint();
            return n3 != 0;
        }
        return false;
    }
}

