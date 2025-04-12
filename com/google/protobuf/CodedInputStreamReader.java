/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.BooleanArrayList;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedInputStreamReader$1;
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
import com.google.protobuf.Reader;
import com.google.protobuf.Schema;
import com.google.protobuf.WireFormat;
import com.google.protobuf.WireFormat$FieldType;
import java.util.List;
import java.util.Map;

final class CodedInputStreamReader
implements Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET;
    private int endGroupTag;
    private final CodedInputStream input;
    private int nextTag = 0;
    private int tag;

    private CodedInputStreamReader(CodedInputStream codedInputStream) {
        this.input = codedInputStream = (CodedInputStream)Internal.checkNotNull(codedInputStream, "input");
        codedInputStream.wrapper = this;
    }

    public static CodedInputStreamReader forCodedInput(CodedInputStream codedInputStream) {
        CodedInputStreamReader codedInputStreamReader = codedInputStream.wrapper;
        if (codedInputStreamReader != null) {
            return codedInputStreamReader;
        }
        codedInputStreamReader = new CodedInputStreamReader(codedInputStream);
        return codedInputStreamReader;
    }

    private void mergeGroupFieldInternal(Object object, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
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

    private void mergeMessageFieldInternal(Object object, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        CodedInputStream codedInputStream = this.input;
        int n3 = codedInputStream.readUInt32();
        CodedInputStream codedInputStream2 = this.input;
        int n4 = codedInputStream2.recursionDepth;
        int n7 = codedInputStream2.recursionLimit;
        if (n4 < n7) {
            int n8;
            n3 = codedInputStream2.pushLimit(n3);
            codedInputStream2 = this.input;
            codedInputStream2.recursionDepth = n4 = codedInputStream2.recursionDepth + 1;
            schema.mergeFrom(object, this, extensionRegistryLite);
            this.input.checkLastTagWas(0);
            object = this.input;
            ((CodedInputStream)object).recursionDepth = n8 = ((CodedInputStream)object).recursionDepth + -1;
            ((CodedInputStream)object).popLimit(n3);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    private Object readField(WireFormat$FieldType object, Class clazz, ExtensionRegistryLite extensionRegistryLite) {
        int[] nArray = CodedInputStreamReader$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
        int n3 = object.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                object = new IllegalArgumentException("unsupported field type.");
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
        this.mergeGroupFieldInternal(object, schema, extensionRegistryLite);
        schema.makeImmutable(object);
        return object;
    }

    private Object readMessage(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        Object object = schema.newInstance();
        this.mergeMessageFieldInternal(object, schema, extensionRegistryLite);
        schema.makeImmutable(object);
        return object;
    }

    private void requirePosition(int n3) {
        CodedInputStream codedInputStream = this.input;
        int n4 = codedInputStream.getTotalBytesRead();
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

    private void verifyPackedFixed32Length(int n3) {
        if ((n3 &= 3) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    private void verifyPackedFixed64Length(int n3) {
        if ((n3 &= 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    public int getFieldNumber() {
        int n3;
        int n4 = this.nextTag;
        if (n4 != 0) {
            this.tag = n4;
            n4 = 0;
            Object var2_2 = null;
            this.nextTag = 0;
        } else {
            CodedInputStream codedInputStream = this.input;
            this.tag = n4 = codedInputStream.readTag();
        }
        n4 = this.tag;
        if (n4 != 0 && n4 != (n3 = this.endGroupTag)) {
            return WireFormat.getTagFieldNumber(n4);
        }
        return -1 >>> 1;
    }

    public int getTag() {
        return this.tag;
    }

    public void mergeGroupField(Object object, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        this.requireWireType(3);
        this.mergeGroupFieldInternal(object, schema, extensionRegistryLite);
    }

    public void mergeMessageField(Object object, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        this.requireWireType(2);
        this.mergeMessageFieldInternal(object, schema, extensionRegistryLite);
    }

    public boolean readBool() {
        this.requireWireType(0);
        return this.input.readBool();
    }

    public void readBoolList(List object) {
        Object object2;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list;
                        block7: {
                            block8: {
                                n4 = object instanceof BooleanArrayList;
                                n3 = 2;
                                if (n4 == 0) break block6;
                                list = object;
                                list = (BooleanArrayList)object;
                                n7 = WireFormat.getTagWireType(this.tag);
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                object = this.input;
                                n7 = ((CodedInputStream)object).readUInt32();
                                CodedInputStream codedInputStream = this.input;
                                n3 = codedInputStream.getTotalBytesRead() + n7;
                                do {
                                    n7 = (int)(this.input.readBool() ? 1 : 0);
                                    ((BooleanArrayList)list).addBoolean(n7 != 0);
                                } while ((n7 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n3);
                                this.requirePosition(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            n7 = (int)(this.input.readBool() ? 1 : 0);
                            ((BooleanArrayList)list).addBoolean(n7 != 0);
                            object = this.input;
                            n7 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
                        this.nextTag = n7;
                        return;
                    }
                    n4 = WireFormat.getTagWireType(this.tag);
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    Object object3 = this.input;
                    n4 = ((CodedInputStream)object3).readUInt32();
                    CodedInputStream codedInputStream = this.input;
                    n3 = codedInputStream.getTotalBytesRead() + n4;
                    do {
                        object3 = this.input.readBool();
                        object.add(object3);
                    } while ((n4 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n3);
                    this.requirePosition(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            object2 = this.input.readBool();
            object.add(object2);
            object2 = this.input;
            n4 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n3 = this.tag));
        this.nextTag = n4;
    }

    public ByteString readBytes() {
        this.requireWireType(2);
        return this.input.readBytes();
    }

    public void readBytesList(List list) {
        int n3;
        int n4 = WireFormat.getTagWireType(this.tag);
        if (n4 == (n3 = 2)) {
            Object object;
            do {
                object = this.readBytes();
                list.add(object);
                object = this.input;
                n4 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                if (n4 == 0) continue;
                return;
            } while ((n4 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
            this.nextTag = n4;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public double readDouble() {
        this.requireWireType(1);
        return this.input.readDouble();
    }

    public void readDoubleList(List object) {
        Object object2;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    int n7;
                    block6: {
                        int n8;
                        List list;
                        block7: {
                            block8: {
                                n4 = object instanceof DoubleArrayList;
                                n3 = 2;
                                n7 = 1;
                                if (n4 == 0) break block6;
                                list = object;
                                list = (DoubleArrayList)object;
                                n8 = WireFormat.getTagWireType(this.tag);
                                if (n8 == n7) break block7;
                                if (n8 != n3) break block8;
                                object = this.input;
                                n8 = ((CodedInputStream)object).readUInt32();
                                this.verifyPackedFixed64Length(n8);
                                CodedInputStream codedInputStream = this.input;
                                n3 = codedInputStream.getTotalBytesRead() + n8;
                                do {
                                    double d2 = this.input.readDouble();
                                    ((DoubleArrayList)list).addDouble(d2);
                                } while ((n8 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            double d5 = this.input.readDouble();
                            ((DoubleArrayList)list).addDouble(d5);
                            object = this.input;
                            n8 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                            if (n8 == 0) continue;
                            return;
                        } while ((n8 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
                        this.nextTag = n8;
                        return;
                    }
                    n4 = WireFormat.getTagWireType(this.tag);
                    if (n4 == n7) break block10;
                    if (n4 != n3) break block11;
                    Object object3 = this.input;
                    n4 = ((CodedInputStream)object3).readUInt32();
                    this.verifyPackedFixed64Length(n4);
                    CodedInputStream codedInputStream = this.input;
                    n3 = codedInputStream.getTotalBytesRead() + n4;
                    do {
                        double d7 = this.input.readDouble();
                        object3 = d7;
                        object.add(object3);
                    } while ((n4 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            double d9 = this.input.readDouble();
            object2 = d9;
            object.add(object2);
            object2 = this.input;
            n4 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n3 = this.tag));
        this.nextTag = n4;
    }

    public int readEnum() {
        this.requireWireType(0);
        return this.input.readEnum();
    }

    public void readEnumList(List object) {
        Object object2;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list;
                        block7: {
                            block8: {
                                n4 = object instanceof IntArrayList;
                                n3 = 2;
                                if (n4 == 0) break block6;
                                list = object;
                                list = (IntArrayList)object;
                                n7 = WireFormat.getTagWireType(this.tag);
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                object = this.input;
                                n7 = ((CodedInputStream)object).readUInt32();
                                CodedInputStream codedInputStream = this.input;
                                n3 = codedInputStream.getTotalBytesRead() + n7;
                                do {
                                    n7 = this.input.readEnum();
                                    ((IntArrayList)list).addInt(n7);
                                } while ((n7 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n3);
                                this.requirePosition(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            n7 = this.input.readEnum();
                            ((IntArrayList)list).addInt(n7);
                            object = this.input;
                            n7 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
                        this.nextTag = n7;
                        return;
                    }
                    n4 = WireFormat.getTagWireType(this.tag);
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    Object object3 = this.input;
                    n4 = ((CodedInputStream)object3).readUInt32();
                    CodedInputStream codedInputStream = this.input;
                    n3 = codedInputStream.getTotalBytesRead() + n4;
                    do {
                        object3 = this.input.readEnum();
                        object.add(object3);
                    } while ((n4 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n3);
                    this.requirePosition(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            object2 = this.input.readEnum();
            object.add(object2);
            object2 = this.input;
            n4 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n3 = this.tag));
        this.nextTag = n4;
    }

    public int readFixed32() {
        this.requireWireType(5);
        return this.input.readFixed32();
    }

    public void readFixed32List(List object) {
        int n3 = object instanceof IntArrayList;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            List list = object;
            list = (IntArrayList)object;
            int n8 = WireFormat.getTagWireType(this.tag);
            if (n8 != n7) {
                if (n8 == n4) {
                    do {
                        n8 = this.input.readFixed32();
                        ((IntArrayList)list).addInt(n8);
                        object = this.input;
                        n8 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                        if (n8 == 0) continue;
                        return;
                    } while ((n8 = ((CodedInputStream)(object = this.input)).readTag()) == (n4 = this.tag));
                    this.nextTag = n8;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            object = this.input;
            n8 = ((CodedInputStream)object).readUInt32();
            this.verifyPackedFixed32Length(n8);
            CodedInputStream codedInputStream = this.input;
            n4 = codedInputStream.getTotalBytesRead();
            int n10 = n4 + n8;
            do {
                n8 = this.input.readFixed32();
                ((IntArrayList)list).addInt(n8);
            } while ((n8 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n10);
        } else {
            n3 = WireFormat.getTagWireType(this.tag);
            if (n3 != n7) {
                if (n3 == n4) {
                    Object object2;
                    do {
                        object2 = this.input.readFixed32();
                        object.add(object2);
                        object2 = this.input;
                        n3 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
                        if (n3 == 0) continue;
                        return;
                    } while ((n3 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n4 = this.tag));
                    this.nextTag = n3;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            Object object3 = this.input;
            n3 = ((CodedInputStream)object3).readUInt32();
            this.verifyPackedFixed32Length(n3);
            CodedInputStream codedInputStream = this.input;
            n4 = codedInputStream.getTotalBytesRead() + n3;
            do {
                object3 = this.input.readFixed32();
                object.add(object3);
            } while ((n3 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n4);
        }
    }

    public long readFixed64() {
        this.requireWireType(1);
        return this.input.readFixed64();
    }

    public void readFixed64List(List object) {
        Object object2;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    int n7;
                    block6: {
                        int n8;
                        List list;
                        block7: {
                            block8: {
                                n4 = object instanceof LongArrayList;
                                n3 = 2;
                                n7 = 1;
                                if (n4 == 0) break block6;
                                list = object;
                                list = (LongArrayList)object;
                                n8 = WireFormat.getTagWireType(this.tag);
                                if (n8 == n7) break block7;
                                if (n8 != n3) break block8;
                                object = this.input;
                                n8 = ((CodedInputStream)object).readUInt32();
                                this.verifyPackedFixed64Length(n8);
                                CodedInputStream codedInputStream = this.input;
                                n3 = codedInputStream.getTotalBytesRead() + n8;
                                do {
                                    long l2 = this.input.readFixed64();
                                    ((LongArrayList)list).addLong(l2);
                                } while ((n8 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            long l3 = this.input.readFixed64();
                            ((LongArrayList)list).addLong(l3);
                            object = this.input;
                            n8 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                            if (n8 == 0) continue;
                            return;
                        } while ((n8 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
                        this.nextTag = n8;
                        return;
                    }
                    n4 = WireFormat.getTagWireType(this.tag);
                    if (n4 == n7) break block10;
                    if (n4 != n3) break block11;
                    Object object3 = this.input;
                    n4 = ((CodedInputStream)object3).readUInt32();
                    this.verifyPackedFixed64Length(n4);
                    CodedInputStream codedInputStream = this.input;
                    n3 = codedInputStream.getTotalBytesRead() + n4;
                    do {
                        long l4 = this.input.readFixed64();
                        object3 = l4;
                        object.add(object3);
                    } while ((n4 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            long l7 = this.input.readFixed64();
            object2 = l7;
            object.add(object2);
            object2 = this.input;
            n4 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n3 = this.tag));
        this.nextTag = n4;
    }

    public float readFloat() {
        this.requireWireType(5);
        return this.input.readFloat();
    }

    public void readFloatList(List object) {
        int n3 = object instanceof FloatArrayList;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            List list = object;
            list = (FloatArrayList)object;
            int n8 = WireFormat.getTagWireType(this.tag);
            if (n8 != n7) {
                if (n8 == n4) {
                    do {
                        float f5 = this.input.readFloat();
                        ((FloatArrayList)list).addFloat(f5);
                        object = this.input;
                        n8 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                        if (n8 == 0) continue;
                        return;
                    } while ((n8 = ((CodedInputStream)(object = this.input)).readTag()) == (n4 = this.tag));
                    this.nextTag = n8;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            object = this.input;
            n8 = ((CodedInputStream)object).readUInt32();
            this.verifyPackedFixed32Length(n8);
            CodedInputStream codedInputStream = this.input;
            n4 = codedInputStream.getTotalBytesRead();
            int n10 = n4 + n8;
            do {
                float f6 = this.input.readFloat();
                ((FloatArrayList)list).addFloat(f6);
            } while ((n8 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n10);
        } else {
            n3 = WireFormat.getTagWireType(this.tag);
            if (n3 != n7) {
                if (n3 == n4) {
                    Object object2;
                    do {
                        float f7 = this.input.readFloat();
                        object2 = Float.valueOf(f7);
                        object.add(object2);
                        object2 = this.input;
                        n3 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
                        if (n3 == 0) continue;
                        return;
                    } while ((n3 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n4 = this.tag));
                    this.nextTag = n3;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            Object object3 = this.input;
            n3 = ((CodedInputStream)object3).readUInt32();
            this.verifyPackedFixed32Length(n3);
            CodedInputStream codedInputStream = this.input;
            n4 = codedInputStream.getTotalBytesRead() + n3;
            do {
                float f8 = this.input.readFloat();
                object3 = Float.valueOf(f8);
                object.add(object3);
            } while ((n3 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n4);
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
            block2: {
                Object object;
                n4 = this.tag;
                do {
                    object = this.readGroup(schema, extensionRegistryLite);
                    list.add(object);
                    object = this.input;
                    n3 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                    if (n3 != 0 || (n3 = this.nextTag) != 0) break block2;
                } while ((n3 = ((CodedInputStream)(object = this.input)).readTag()) == n4);
                this.nextTag = n3;
            }
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
        return this.input.readInt32();
    }

    public void readInt32List(List object) {
        Object object2;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list;
                        block7: {
                            block8: {
                                n4 = object instanceof IntArrayList;
                                n3 = 2;
                                if (n4 == 0) break block6;
                                list = object;
                                list = (IntArrayList)object;
                                n7 = WireFormat.getTagWireType(this.tag);
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                object = this.input;
                                n7 = ((CodedInputStream)object).readUInt32();
                                CodedInputStream codedInputStream = this.input;
                                n3 = codedInputStream.getTotalBytesRead() + n7;
                                do {
                                    n7 = this.input.readInt32();
                                    ((IntArrayList)list).addInt(n7);
                                } while ((n7 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n3);
                                this.requirePosition(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            n7 = this.input.readInt32();
                            ((IntArrayList)list).addInt(n7);
                            object = this.input;
                            n7 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
                        this.nextTag = n7;
                        return;
                    }
                    n4 = WireFormat.getTagWireType(this.tag);
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    Object object3 = this.input;
                    n4 = ((CodedInputStream)object3).readUInt32();
                    CodedInputStream codedInputStream = this.input;
                    n3 = codedInputStream.getTotalBytesRead() + n4;
                    do {
                        object3 = this.input.readInt32();
                        object.add(object3);
                    } while ((n4 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n3);
                    this.requirePosition(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            object2 = this.input.readInt32();
            object.add(object2);
            object2 = this.input;
            n4 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n3 = this.tag));
        this.nextTag = n4;
    }

    public long readInt64() {
        this.requireWireType(0);
        return this.input.readInt64();
    }

    public void readInt64List(List object) {
        Object object2;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list;
                        block7: {
                            block8: {
                                n4 = object instanceof LongArrayList;
                                n3 = 2;
                                if (n4 == 0) break block6;
                                list = object;
                                list = (LongArrayList)object;
                                n7 = WireFormat.getTagWireType(this.tag);
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                object = this.input;
                                n7 = ((CodedInputStream)object).readUInt32();
                                CodedInputStream codedInputStream = this.input;
                                n3 = codedInputStream.getTotalBytesRead() + n7;
                                do {
                                    long l2 = this.input.readInt64();
                                    ((LongArrayList)list).addLong(l2);
                                } while ((n7 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n3);
                                this.requirePosition(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            long l3 = this.input.readInt64();
                            ((LongArrayList)list).addLong(l3);
                            object = this.input;
                            n7 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
                        this.nextTag = n7;
                        return;
                    }
                    n4 = WireFormat.getTagWireType(this.tag);
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    Object object3 = this.input;
                    n4 = ((CodedInputStream)object3).readUInt32();
                    CodedInputStream codedInputStream = this.input;
                    n3 = codedInputStream.getTotalBytesRead() + n4;
                    do {
                        long l4 = this.input.readInt64();
                        object3 = l4;
                        object.add(object3);
                    } while ((n4 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n3);
                    this.requirePosition(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            long l7 = this.input.readInt64();
            object2 = l7;
            object.add(object2);
            object2 = this.input;
            n4 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n3 = this.tag));
        this.nextTag = n4;
    }

    /*
     * Exception decompiling
     */
    public void readMap(Map var1_1, MapEntryLite$Metadata var2_3, ExtensionRegistryLite var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [12, 11 : 139->143)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
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
            block2: {
                Object object;
                n4 = this.tag;
                do {
                    object = this.readMessage(schema, extensionRegistryLite);
                    list.add(object);
                    object = this.input;
                    n3 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                    if (n3 != 0 || (n3 = this.nextTag) != 0) break block2;
                } while ((n3 = ((CodedInputStream)(object = this.input)).readTag()) == n4);
                this.nextTag = n3;
            }
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
        return this.input.readSFixed32();
    }

    public void readSFixed32List(List object) {
        int n3 = object instanceof IntArrayList;
        int n4 = 5;
        int n7 = 2;
        if (n3 != 0) {
            List list = object;
            list = (IntArrayList)object;
            int n8 = WireFormat.getTagWireType(this.tag);
            if (n8 != n7) {
                if (n8 == n4) {
                    do {
                        n8 = this.input.readSFixed32();
                        ((IntArrayList)list).addInt(n8);
                        object = this.input;
                        n8 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                        if (n8 == 0) continue;
                        return;
                    } while ((n8 = ((CodedInputStream)(object = this.input)).readTag()) == (n4 = this.tag));
                    this.nextTag = n8;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            object = this.input;
            n8 = ((CodedInputStream)object).readUInt32();
            this.verifyPackedFixed32Length(n8);
            CodedInputStream codedInputStream = this.input;
            n4 = codedInputStream.getTotalBytesRead();
            int n10 = n4 + n8;
            do {
                n8 = this.input.readSFixed32();
                ((IntArrayList)list).addInt(n8);
            } while ((n8 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n10);
        } else {
            n3 = WireFormat.getTagWireType(this.tag);
            if (n3 != n7) {
                if (n3 == n4) {
                    Object object2;
                    do {
                        object2 = this.input.readSFixed32();
                        object.add(object2);
                        object2 = this.input;
                        n3 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
                        if (n3 == 0) continue;
                        return;
                    } while ((n3 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n4 = this.tag));
                    this.nextTag = n3;
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            Object object3 = this.input;
            n3 = ((CodedInputStream)object3).readUInt32();
            this.verifyPackedFixed32Length(n3);
            CodedInputStream codedInputStream = this.input;
            n4 = codedInputStream.getTotalBytesRead() + n3;
            do {
                object3 = this.input.readSFixed32();
                object.add(object3);
            } while ((n3 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n4);
        }
    }

    public long readSFixed64() {
        this.requireWireType(1);
        return this.input.readSFixed64();
    }

    public void readSFixed64List(List object) {
        Object object2;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    int n7;
                    block6: {
                        int n8;
                        List list;
                        block7: {
                            block8: {
                                n4 = object instanceof LongArrayList;
                                n3 = 2;
                                n7 = 1;
                                if (n4 == 0) break block6;
                                list = object;
                                list = (LongArrayList)object;
                                n8 = WireFormat.getTagWireType(this.tag);
                                if (n8 == n7) break block7;
                                if (n8 != n3) break block8;
                                object = this.input;
                                n8 = ((CodedInputStream)object).readUInt32();
                                this.verifyPackedFixed64Length(n8);
                                CodedInputStream codedInputStream = this.input;
                                n3 = codedInputStream.getTotalBytesRead() + n8;
                                do {
                                    long l2 = this.input.readSFixed64();
                                    ((LongArrayList)list).addLong(l2);
                                } while ((n8 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            long l3 = this.input.readSFixed64();
                            ((LongArrayList)list).addLong(l3);
                            object = this.input;
                            n8 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                            if (n8 == 0) continue;
                            return;
                        } while ((n8 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
                        this.nextTag = n8;
                        return;
                    }
                    n4 = WireFormat.getTagWireType(this.tag);
                    if (n4 == n7) break block10;
                    if (n4 != n3) break block11;
                    Object object3 = this.input;
                    n4 = ((CodedInputStream)object3).readUInt32();
                    this.verifyPackedFixed64Length(n4);
                    CodedInputStream codedInputStream = this.input;
                    n3 = codedInputStream.getTotalBytesRead() + n4;
                    do {
                        long l4 = this.input.readSFixed64();
                        object3 = l4;
                        object.add(object3);
                    } while ((n4 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            long l7 = this.input.readSFixed64();
            object2 = l7;
            object.add(object2);
            object2 = this.input;
            n4 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n3 = this.tag));
        this.nextTag = n4;
    }

    public int readSInt32() {
        this.requireWireType(0);
        return this.input.readSInt32();
    }

    public void readSInt32List(List object) {
        Object object2;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list;
                        block7: {
                            block8: {
                                n4 = object instanceof IntArrayList;
                                n3 = 2;
                                if (n4 == 0) break block6;
                                list = object;
                                list = (IntArrayList)object;
                                n7 = WireFormat.getTagWireType(this.tag);
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                object = this.input;
                                n7 = ((CodedInputStream)object).readUInt32();
                                CodedInputStream codedInputStream = this.input;
                                n3 = codedInputStream.getTotalBytesRead() + n7;
                                do {
                                    n7 = this.input.readSInt32();
                                    ((IntArrayList)list).addInt(n7);
                                } while ((n7 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n3);
                                this.requirePosition(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            n7 = this.input.readSInt32();
                            ((IntArrayList)list).addInt(n7);
                            object = this.input;
                            n7 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
                        this.nextTag = n7;
                        return;
                    }
                    n4 = WireFormat.getTagWireType(this.tag);
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    Object object3 = this.input;
                    n4 = ((CodedInputStream)object3).readUInt32();
                    CodedInputStream codedInputStream = this.input;
                    n3 = codedInputStream.getTotalBytesRead() + n4;
                    do {
                        object3 = this.input.readSInt32();
                        object.add(object3);
                    } while ((n4 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n3);
                    this.requirePosition(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            object2 = this.input.readSInt32();
            object.add(object2);
            object2 = this.input;
            n4 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n3 = this.tag));
        this.nextTag = n4;
    }

    public long readSInt64() {
        this.requireWireType(0);
        return this.input.readSInt64();
    }

    public void readSInt64List(List object) {
        Object object2;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list;
                        block7: {
                            block8: {
                                n4 = object instanceof LongArrayList;
                                n3 = 2;
                                if (n4 == 0) break block6;
                                list = object;
                                list = (LongArrayList)object;
                                n7 = WireFormat.getTagWireType(this.tag);
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                object = this.input;
                                n7 = ((CodedInputStream)object).readUInt32();
                                CodedInputStream codedInputStream = this.input;
                                n3 = codedInputStream.getTotalBytesRead() + n7;
                                do {
                                    long l2 = this.input.readSInt64();
                                    ((LongArrayList)list).addLong(l2);
                                } while ((n7 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n3);
                                this.requirePosition(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            long l3 = this.input.readSInt64();
                            ((LongArrayList)list).addLong(l3);
                            object = this.input;
                            n7 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
                        this.nextTag = n7;
                        return;
                    }
                    n4 = WireFormat.getTagWireType(this.tag);
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    Object object3 = this.input;
                    n4 = ((CodedInputStream)object3).readUInt32();
                    CodedInputStream codedInputStream = this.input;
                    n3 = codedInputStream.getTotalBytesRead() + n4;
                    do {
                        long l4 = this.input.readSInt64();
                        object3 = l4;
                        object.add(object3);
                    } while ((n4 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n3);
                    this.requirePosition(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            long l7 = this.input.readSInt64();
            object2 = l7;
            object.add(object2);
            object2 = this.input;
            n4 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n3 = this.tag));
        this.nextTag = n4;
    }

    public String readString() {
        this.requireWireType(2);
        return this.input.readString();
    }

    public void readStringList(List list) {
        this.readStringListInternal(list, false);
    }

    public void readStringListInternal(List object, boolean n3) {
        int n4;
        int n7 = WireFormat.getTagWireType(this.tag);
        if (n7 == (n4 = 2)) {
            Object object2;
            n7 = object instanceof LazyStringList;
            if (n7 != 0 && n3 == 0) {
                int n8;
                Object list = object;
                list = (LazyStringList)object;
                do {
                    object = this.readBytes();
                    list.add((ByteString)object);
                    object = this.input;
                    n8 = ((CodedInputStream)object).isAtEnd();
                    if (n8 == 0) continue;
                    return;
                } while ((n8 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
                this.nextTag = n8;
                return;
            }
            do {
                object2 = n3 != 0 ? this.readStringRequireUtf8() : this.readString();
                ((List)object).add(object2);
                object2 = this.input;
                n7 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
                if (n7 == 0) continue;
                return;
            } while ((n7 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n4 = this.tag));
            this.nextTag = n7;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public void readStringListRequireUtf8(List list) {
        this.readStringListInternal(list, true);
    }

    public String readStringRequireUtf8() {
        this.requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    public int readUInt32() {
        this.requireWireType(0);
        return this.input.readUInt32();
    }

    public void readUInt32List(List object) {
        Object object2;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list;
                        block7: {
                            block8: {
                                n4 = object instanceof IntArrayList;
                                n3 = 2;
                                if (n4 == 0) break block6;
                                list = object;
                                list = (IntArrayList)object;
                                n7 = WireFormat.getTagWireType(this.tag);
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                object = this.input;
                                n7 = ((CodedInputStream)object).readUInt32();
                                CodedInputStream codedInputStream = this.input;
                                n3 = codedInputStream.getTotalBytesRead() + n7;
                                do {
                                    n7 = this.input.readUInt32();
                                    ((IntArrayList)list).addInt(n7);
                                } while ((n7 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n3);
                                this.requirePosition(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            n7 = this.input.readUInt32();
                            ((IntArrayList)list).addInt(n7);
                            object = this.input;
                            n7 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
                        this.nextTag = n7;
                        return;
                    }
                    n4 = WireFormat.getTagWireType(this.tag);
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    Object object3 = this.input;
                    n4 = ((CodedInputStream)object3).readUInt32();
                    CodedInputStream codedInputStream = this.input;
                    n3 = codedInputStream.getTotalBytesRead() + n4;
                    do {
                        object3 = this.input.readUInt32();
                        object.add(object3);
                    } while ((n4 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n3);
                    this.requirePosition(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            object2 = this.input.readUInt32();
            object.add(object2);
            object2 = this.input;
            n4 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n3 = this.tag));
        this.nextTag = n4;
    }

    public long readUInt64() {
        this.requireWireType(0);
        return this.input.readUInt64();
    }

    public void readUInt64List(List object) {
        Object object2;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list;
                        block7: {
                            block8: {
                                n4 = object instanceof LongArrayList;
                                n3 = 2;
                                if (n4 == 0) break block6;
                                list = object;
                                list = (LongArrayList)object;
                                n7 = WireFormat.getTagWireType(this.tag);
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                object = this.input;
                                n7 = ((CodedInputStream)object).readUInt32();
                                CodedInputStream codedInputStream = this.input;
                                n3 = codedInputStream.getTotalBytesRead() + n7;
                                do {
                                    long l2 = this.input.readUInt64();
                                    ((LongArrayList)list).addLong(l2);
                                } while ((n7 = ((CodedInputStream)(object = this.input)).getTotalBytesRead()) < n3);
                                this.requirePosition(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        do {
                            long l3 = this.input.readUInt64();
                            ((LongArrayList)list).addLong(l3);
                            object = this.input;
                            n7 = (int)(((CodedInputStream)object).isAtEnd() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = ((CodedInputStream)(object = this.input)).readTag()) == (n3 = this.tag));
                        this.nextTag = n7;
                        return;
                    }
                    n4 = WireFormat.getTagWireType(this.tag);
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    Object object3 = this.input;
                    n4 = ((CodedInputStream)object3).readUInt32();
                    CodedInputStream codedInputStream = this.input;
                    n3 = codedInputStream.getTotalBytesRead() + n4;
                    do {
                        long l4 = this.input.readUInt64();
                        object3 = l4;
                        object.add(object3);
                    } while ((n4 = ((CodedInputStream)(object3 = this.input)).getTotalBytesRead()) < n3);
                    this.requirePosition(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            long l7 = this.input.readUInt64();
            object2 = l7;
            object.add(object2);
            object2 = this.input;
            n4 = (int)(((CodedInputStream)object2).isAtEnd() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = ((CodedInputStream)(object2 = this.input)).readTag()) == (n3 = this.tag));
        this.nextTag = n4;
    }

    public boolean shouldDiscardUnknownFields() {
        return this.input.shouldDiscardUnknownFields();
    }

    public boolean skipField() {
        int n3;
        CodedInputStream codedInputStream = this.input;
        int n4 = codedInputStream.isAtEnd();
        if (n4 == 0 && (n4 = this.tag) != (n3 = this.endGroupTag)) {
            return this.input.skipField(n4);
        }
        return false;
    }
}

