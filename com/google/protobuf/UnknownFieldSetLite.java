/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import com.google.protobuf.MessageLiteToString;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import com.google.protobuf.Writer$FieldOrder;
import java.util.Arrays;

public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE;
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    static {
        UnknownFieldSetLite unknownFieldSetLite;
        int[] nArray = new int[]{};
        Object[] objectArray = new Object[]{};
        DEFAULT_INSTANCE = unknownFieldSetLite = new UnknownFieldSetLite(0, nArray, objectArray, false);
    }

    private UnknownFieldSetLite() {
        int n3 = 8;
        int[] nArray = new int[n3];
        Object[] objectArray = new Object[n3];
        this(0, nArray, objectArray, true);
    }

    private UnknownFieldSetLite(int n3, int[] nArray, Object[] objectArray, boolean bl2) {
        this.memoizedSerializedSize = -1;
        this.count = n3;
        this.tags = nArray;
        this.objects = objectArray;
        this.isMutable = bl2;
    }

    private void ensureCapacity(int n3) {
        Object[] objectArray = this.tags;
        int n4 = objectArray.length;
        if (n3 > n4) {
            n4 = this.count;
            int n7 = n4 / 2 + n4;
            if (n7 >= n3) {
                n3 = n7;
            }
            n4 = 8;
            if (n3 < n4) {
                n3 = 8;
            }
            this.tags = objectArray = Arrays.copyOf(objectArray, n3);
            objectArray = this.objects;
            int[] nArray = Arrays.copyOf(objectArray, n3);
            this.objects = nArray;
        }
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] nArray, int n3) {
        int n4 = 17;
        for (int i3 = 0; i3 < n3; ++i3) {
            n4 *= 31;
            int n7 = nArray[i3];
            n4 += n7;
        }
        return n4;
    }

    private static int hashCode(Object[] objectArray, int n3) {
        int n4 = 17;
        for (int i3 = 0; i3 < n3; ++i3) {
            n4 *= 31;
            Object object = objectArray[i3];
            int n7 = object.hashCode();
            n4 += n7;
        }
        return n4;
    }

    private UnknownFieldSetLite mergeFrom(CodedInputStream codedInputStream) {
        int n3;
        while ((n3 = codedInputStream.readTag()) != 0 && (n3 = (int)(this.mergeFieldFrom(n3, codedInputStream) ? 1 : 0)) != 0) {
        }
        return this;
    }

    public static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int n3 = unknownFieldSetLite.count;
        int n4 = unknownFieldSetLite2.count;
        int[] nArray = Arrays.copyOf(unknownFieldSetLite.tags, n3 += n4);
        Object[] objectArray = unknownFieldSetLite2.tags;
        int n7 = unknownFieldSetLite.count;
        int n8 = unknownFieldSetLite2.count;
        System.arraycopy(objectArray, 0, nArray, n7, n8);
        objectArray = Arrays.copyOf(unknownFieldSetLite.objects, n3);
        Object[] objectArray2 = unknownFieldSetLite2.objects;
        int n10 = unknownFieldSetLite.count;
        int n14 = unknownFieldSetLite2.count;
        System.arraycopy(objectArray2, 0, objectArray, n10, n14);
        unknownFieldSetLite = new UnknownFieldSetLite(n3, nArray, objectArray, true);
        return unknownFieldSetLite;
    }

    public static UnknownFieldSetLite newInstance() {
        UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
        return unknownFieldSetLite;
    }

    private static boolean objectsEquals(Object[] objectArray, Object[] objectArray2, int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = objectArray[i3];
            Object object2 = objectArray2[i3];
            boolean bl2 = object.equals(object2);
            if (bl2) continue;
            return false;
        }
        return true;
    }

    private static boolean tagsEquals(int[] nArray, int[] nArray2, int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = nArray[i3];
            int n7 = nArray2[i3];
            if (n4 == n7) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void writeField(int n3, Object object, Writer writer) {
        Writer$FieldOrder writer$FieldOrder;
        int n4 = WireFormat.getTagFieldNumber(n3);
        if ((n3 = WireFormat.getTagWireType(n3)) == 0) {
            object = (Long)object;
            long l2 = (Long)object;
            writer.writeInt64(n4, l2);
            return;
        }
        int n7 = 1;
        if (n3 == n7) {
            object = (Long)object;
            long l3 = (Long)object;
            writer.writeFixed64(n4, l3);
            return;
        }
        n7 = 2;
        if (n3 == n7) {
            object = (ByteString)object;
            writer.writeBytes(n4, (ByteString)object);
            return;
        }
        n7 = 3;
        if (n3 != n7) {
            n7 = 5;
            if (n3 == n7) {
                object = (Integer)object;
                n3 = (Integer)object;
                writer.writeFixed32(n4, n3);
                return;
            }
            object = InvalidProtocolBufferException.invalidWireType();
            RuntimeException runtimeException = new RuntimeException((Throwable)object);
            throw runtimeException;
        }
        Writer$FieldOrder writer$FieldOrder2 = writer.fieldOrder();
        if (writer$FieldOrder2 == (writer$FieldOrder = Writer$FieldOrder.ASCENDING)) {
            writer.writeStartGroup(n4);
            object = (UnknownFieldSetLite)object;
            ((UnknownFieldSetLite)object).writeTo(writer);
            writer.writeEndGroup(n4);
            return;
        }
        writer.writeEndGroup(n4);
        object = (UnknownFieldSetLite)object;
        ((UnknownFieldSetLite)object).writeTo(writer);
        writer.writeStartGroup(n4);
    }

    public void checkMutable() {
        boolean bl2 = this.isMutable;
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public boolean equals(Object objectArray) {
        Object[] objectArray2;
        boolean bl2;
        int[] nArray;
        int[] nArray2;
        boolean bl3 = true;
        if (this == objectArray) {
            return bl3;
        }
        if (objectArray == null) {
            return false;
        }
        int n3 = objectArray instanceof UnknownFieldSetLite;
        if (n3 == 0) {
            return false;
        }
        objectArray = (UnknownFieldSetLite)objectArray;
        n3 = this.count;
        int n4 = objectArray.count;
        if (n3 == n4 && (n3 = (int)(UnknownFieldSetLite.tagsEquals(nArray2 = this.tags, nArray = objectArray.tags, n3) ? 1 : 0)) != 0 && (bl2 = UnknownFieldSetLite.objectsEquals(objectArray2 = this.objects, objectArray = objectArray.objects, n4 = this.count))) {
            return bl3;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int getSerializedSize() {
        int n3 = this.memoizedSerializedSize;
        int n4 = -1;
        if (n3 != n4) {
            return n3;
        }
        n3 = 0;
        IllegalStateException illegalStateException = null;
        n4 = 0;
        InvalidProtocolBufferException$InvalidWireTypeException invalidProtocolBufferException$InvalidWireTypeException = null;
        while (true) {
            block9: {
                block8: {
                    long l2;
                    int n7;
                    Object object;
                    int n8;
                    block4: {
                        block5: {
                            block6: {
                                block7: {
                                    if (n3 >= (n8 = this.count)) {
                                        this.memoizedSerializedSize = n4;
                                        return n4;
                                    }
                                    object = this.tags;
                                    n8 = object[n3];
                                    n7 = WireFormat.getTagFieldNumber(n8);
                                    if ((n8 = WireFormat.getTagWireType(n8)) == 0) break block4;
                                    int n10 = 1;
                                    if (n8 == n10) break block5;
                                    n10 = 2;
                                    if (n8 == n10) break block6;
                                    int n14 = 3;
                                    if (n8 == n14) break block7;
                                    n10 = 5;
                                    if (n8 != n10) {
                                        invalidProtocolBufferException$InvalidWireTypeException = InvalidProtocolBufferException.invalidWireType();
                                        illegalStateException = new IllegalStateException(invalidProtocolBufferException$InvalidWireTypeException);
                                        throw illegalStateException;
                                    }
                                    object = (Integer)this.objects[n3];
                                    n8 = (Integer)object;
                                    n8 = CodedOutputStream.computeFixed32Size(n7, n8);
                                    break block8;
                                }
                                n8 = CodedOutputStream.computeTagSize(n7) * 2;
                                UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite)this.objects[n3];
                                n4 = n7 = unknownFieldSetLite.getSerializedSize() + n8 + n4;
                                break block9;
                            }
                            object = (ByteString)this.objects[n3];
                            n8 = CodedOutputStream.computeBytesSize(n7, (ByteString)object);
                            break block8;
                        }
                        object = (Long)this.objects[n3];
                        l2 = (Long)object;
                        n8 = CodedOutputStream.computeFixed64Size(n7, l2);
                        break block8;
                    }
                    object = (Long)this.objects[n3];
                    l2 = (Long)object;
                    n8 = CodedOutputStream.computeUInt64Size(n7, l2);
                }
                n4 = n8 += n4;
            }
            ++n3;
        }
    }

    public int getSerializedSizeAsMessageSet() {
        int n3;
        int n4 = this.memoizedSerializedSize;
        int n7 = -1;
        if (n4 != n7) {
            return n4;
        }
        n7 = 0;
        for (n4 = 0; n4 < (n3 = this.count); ++n4) {
            int[] nArray = this.tags;
            n3 = WireFormat.getTagFieldNumber(nArray[n4]);
            ByteString byteString = (ByteString)this.objects[n4];
            n3 = CodedOutputStream.computeRawMessageSetExtensionSize(n3, byteString);
            n7 += n3;
        }
        this.memoizedSerializedSize = n7;
        return n7;
    }

    public int hashCode() {
        int n3 = this.count;
        int n4 = (527 + n3) * 31;
        n3 = UnknownFieldSetLite.hashCode(this.tags, n3);
        n4 = (n4 + n3) * 31;
        Object[] objectArray = this.objects;
        int n7 = this.count;
        n3 = UnknownFieldSetLite.hashCode(objectArray, n7);
        return n4 + n3;
    }

    public void makeImmutable() {
        boolean bl2 = this.isMutable;
        if (bl2) {
            bl2 = false;
            this.isMutable = false;
        }
    }

    public boolean mergeFieldFrom(int n3, CodedInputStream object) {
        this.checkMutable();
        int bl2 = WireFormat.getTagFieldNumber(n3);
        int n4 = WireFormat.getTagWireType(n3);
        int n7 = 1;
        if (n4) {
            if (n4 != n7) {
                int n8 = 2;
                if (n4 != n8) {
                    int n10 = 3;
                    int n14 = 4;
                    if (n4 != n10) {
                        if (n4 != n14) {
                            int n15 = 5;
                            if (n4 == n15) {
                                object = ((CodedInputStream)object).readFixed32();
                                this.storeField(n3, object);
                                return n7;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
                    unknownFieldSetLite.mergeFrom((CodedInputStream)object);
                    int n16 = WireFormat.makeTag(bl2, n14);
                    ((CodedInputStream)object).checkLastTagWas(n16);
                    this.storeField(n3, unknownFieldSetLite);
                    return n7;
                }
                object = ((CodedInputStream)object).readBytes();
                this.storeField(n3, object);
                return n7;
            }
            object = ((CodedInputStream)object).readFixed64();
            this.storeField(n3, object);
            return n7;
        }
        object = ((CodedInputStream)object).readInt64();
        this.storeField(n3, object);
        return n7;
    }

    public UnknownFieldSetLite mergeFrom(UnknownFieldSetLite unknownFieldSetLite) {
        UnknownFieldSetLite unknownFieldSetLite2 = UnknownFieldSetLite.getDefaultInstance();
        int n3 = unknownFieldSetLite.equals(unknownFieldSetLite2);
        if (n3 != 0) {
            return this;
        }
        this.checkMutable();
        n3 = this.count;
        int n4 = unknownFieldSetLite.count;
        this.ensureCapacity(n3 += n4);
        Object[] objectArray = unknownFieldSetLite.tags;
        Object[] objectArray2 = this.tags;
        int n7 = this.count;
        int n8 = unknownFieldSetLite.count;
        System.arraycopy(objectArray, 0, objectArray2, n7, n8);
        objectArray = unknownFieldSetLite.objects;
        objectArray2 = this.objects;
        n7 = this.count;
        int n10 = unknownFieldSetLite.count;
        System.arraycopy(objectArray, 0, objectArray2, n7, n10);
        this.count = n3;
        return this;
    }

    public UnknownFieldSetLite mergeLengthDelimitedField(int n3, ByteString byteString) {
        this.checkMutable();
        if (n3 != 0) {
            n3 = WireFormat.makeTag(n3, 2);
            this.storeField(n3, byteString);
            return this;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Zero is not a valid field number.");
        throw illegalArgumentException;
    }

    public UnknownFieldSetLite mergeVarintField(int n3, int n4) {
        this.checkMutable();
        if (n3 != 0) {
            n3 = WireFormat.makeTag(n3, 0);
            Long l2 = n4;
            this.storeField(n3, l2);
            return this;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Zero is not a valid field number.");
        throw illegalArgumentException;
    }

    public final void printWithIndent(StringBuilder stringBuilder, int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = this.count); ++i3) {
            n4 = WireFormat.getTagFieldNumber(this.tags[i3]);
            String string2 = String.valueOf(n4);
            Object object = this.objects[i3];
            MessageLiteToString.printField(stringBuilder, n3, string2, object);
        }
    }

    public void storeField(int n3, Object object) {
        this.checkMutable();
        int n4 = this.count + 1;
        this.ensureCapacity(n4);
        int[] nArray = this.tags;
        int n7 = this.count;
        nArray[n7] = n3;
        this.objects[n7] = object;
        this.count = ++n7;
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.count); ++i3) {
            int[] nArray = this.tags;
            n3 = WireFormat.getTagFieldNumber(nArray[i3]);
            ByteString byteString = (ByteString)this.objects[i3];
            codedOutputStream.writeRawMessageSetExtension(n3, byteString);
        }
    }

    public void writeAsMessageSetTo(Writer writer) {
        Object object;
        Writer$FieldOrder writer$FieldOrder = writer.fieldOrder();
        if (writer$FieldOrder == (object = Writer$FieldOrder.DESCENDING)) {
            for (int i3 = this.count + -1; i3 >= 0; i3 += -1) {
                object = this.tags;
                int n3 = WireFormat.getTagFieldNumber((int)object[i3]);
                Object object2 = this.objects[i3];
                writer.writeMessageSetItem(n3, object2);
            }
        } else {
            int n4;
            writer$FieldOrder = null;
            for (int i8 = 0; i8 < (n4 = this.count); ++i8) {
                object = this.tags;
                n4 = WireFormat.getTagFieldNumber((int)object[i8]);
                Object object3 = this.objects[i8];
                writer.writeMessageSetItem(n4, object3);
            }
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.count); ++i3) {
            long l2;
            Object object = this.tags;
            n3 = object[i3];
            int n4 = WireFormat.getTagFieldNumber(n3);
            if ((n3 = WireFormat.getTagWireType(n3)) != 0) {
                int n7 = 1;
                if (n3 != n7) {
                    n7 = 2;
                    if (n3 != n7) {
                        n7 = 3;
                        if (n3 != n7) {
                            n7 = 5;
                            if (n3 == n7) {
                                object = (Integer)this.objects[i3];
                                n3 = (Integer)object;
                                codedOutputStream.writeFixed32(n4, n3);
                                continue;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        codedOutputStream.writeTag(n4, n7);
                        object = (UnknownFieldSetLite)this.objects[i3];
                        ((UnknownFieldSetLite)object).writeTo(codedOutputStream);
                        n3 = 4;
                        codedOutputStream.writeTag(n4, n3);
                        continue;
                    }
                    object = (ByteString)this.objects[i3];
                    codedOutputStream.writeBytes(n4, (ByteString)object);
                    continue;
                }
                object = (Long)this.objects[i3];
                l2 = (Long)object;
                codedOutputStream.writeFixed64(n4, l2);
                continue;
            }
            object = (Long)this.objects[i3];
            l2 = (Long)object;
            codedOutputStream.writeUInt64(n4, l2);
        }
    }

    public void writeTo(Writer writer) {
        Object object;
        int n3 = this.count;
        if (n3 == 0) {
            return;
        }
        Writer$FieldOrder writer$FieldOrder = writer.fieldOrder();
        if (writer$FieldOrder == (object = Writer$FieldOrder.ASCENDING)) {
            Object object2;
            writer$FieldOrder = null;
            for (n3 = 0; n3 < (object2 = this.count); ++n3) {
                object = this.tags;
                object2 = (Object)object[n3];
                Object object3 = this.objects[n3];
                UnknownFieldSetLite.writeField(object2, object3, writer);
            }
        } else {
            for (n3 = this.count + -1; n3 >= 0; n3 += -1) {
                object = this.tags;
                Writer$FieldOrder writer$FieldOrder2 = object[n3];
                Object object4 = this.objects[n3];
                UnknownFieldSetLite.writeField((int)writer$FieldOrder2, object4, writer);
            }
        }
    }
}

