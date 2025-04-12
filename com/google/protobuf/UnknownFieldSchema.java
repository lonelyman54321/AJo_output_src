/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Reader;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;

abstract class UnknownFieldSchema {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    private final void mergeFrom(Object object, Reader reader, int n3) {
        int n4;
        int n7;
        while ((n7 = reader.getFieldNumber()) != (n4 = -1 >>> 1) && (n7 = (int)(this.mergeOneFieldFrom(object, reader, n3) ? 1 : 0)) != 0) {
        }
    }

    public abstract void addFixed32(Object var1, int var2, int var3);

    public abstract void addFixed64(Object var1, int var2, long var3);

    public abstract void addGroup(Object var1, int var2, Object var3);

    public abstract void addLengthDelimited(Object var1, int var2, ByteString var3);

    public abstract void addVarint(Object var1, int var2, long var3);

    public abstract Object getBuilderFromMessage(Object var1);

    public abstract Object getFromMessage(Object var1);

    public abstract int getSerializedSize(Object var1);

    public abstract int getSerializedSizeAsMessageSet(Object var1);

    public abstract void makeImmutable(Object var1);

    public abstract Object merge(Object var1, Object var2);

    public final boolean mergeOneFieldFrom(Object object, Reader object2, int n3) {
        int n4 = object2.getTag();
        int n7 = WireFormat.getTagFieldNumber(n4);
        n4 = WireFormat.getTagWireType(n4);
        int n8 = 1;
        if (n4 != 0) {
            if (n4 != n8) {
                int n10 = 2;
                if (n4 != n10) {
                    n10 = 3;
                    int n14 = 4;
                    if (n4 != n10) {
                        if (n4 != n14) {
                            n3 = 5;
                            if (n4 == n3) {
                                int n15 = object2.readFixed32();
                                this.addFixed32(object, n7, n15);
                                return n8 != 0;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    Object object3 = this.newBuilder();
                    n10 = WireFormat.makeTag(n7, n14);
                    n14 = recursionLimit;
                    if ((n3 += n8) < n14) {
                        this.mergeFrom(object3, (Reader)object2, n3);
                        int n16 = object2.getTag();
                        if (n10 == n16) {
                            object2 = this.toImmutable(object3);
                            this.addGroup(object, n7, object2);
                            return n8 != 0;
                        }
                        throw InvalidProtocolBufferException.invalidEndTag();
                    }
                    throw InvalidProtocolBufferException.recursionLimitExceeded();
                }
                object2 = object2.readBytes();
                this.addLengthDelimited(object, n7, (ByteString)object2);
                return n8 != 0;
            }
            long l2 = object2.readFixed64();
            this.addFixed64(object, n7, l2);
            return n8 != 0;
        }
        long l3 = object2.readInt64();
        this.addVarint(object, n7, l3);
        return n8 != 0;
    }

    public abstract Object newBuilder();

    public abstract void setBuilderToMessage(Object var1, Object var2);

    public void setRecursionLimit(int n3) {
        recursionLimit = n3;
    }

    public abstract void setToMessage(Object var1, Object var2);

    public abstract boolean shouldDiscardUnknownFields(Reader var1);

    public abstract Object toImmutable(Object var1);

    public abstract void writeAsMessageSetTo(Object var1, Writer var2);

    public abstract void writeTo(Object var1, Writer var2);
}

