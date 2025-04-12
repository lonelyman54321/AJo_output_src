/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Reader;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.UnknownFieldSetLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;

class UnknownFieldSetLiteSchema
extends UnknownFieldSchema {
    public void addFixed32(UnknownFieldSetLite unknownFieldSetLite, int n3, int n4) {
        n3 = WireFormat.makeTag(n3, 5);
        Integer n7 = n4;
        unknownFieldSetLite.storeField(n3, n7);
    }

    public void addFixed64(UnknownFieldSetLite unknownFieldSetLite, int n3, long l2) {
        n3 = WireFormat.makeTag(n3, 1);
        Long l3 = l2;
        unknownFieldSetLite.storeField(n3, l3);
    }

    public void addGroup(UnknownFieldSetLite unknownFieldSetLite, int n3, UnknownFieldSetLite unknownFieldSetLite2) {
        n3 = WireFormat.makeTag(n3, 3);
        unknownFieldSetLite.storeField(n3, unknownFieldSetLite2);
    }

    public void addLengthDelimited(UnknownFieldSetLite unknownFieldSetLite, int n3, ByteString byteString) {
        n3 = WireFormat.makeTag(n3, 2);
        unknownFieldSetLite.storeField(n3, byteString);
    }

    public void addVarint(UnknownFieldSetLite unknownFieldSetLite, int n3, long l2) {
        n3 = WireFormat.makeTag(n3, 0);
        Long l3 = l2;
        unknownFieldSetLite.storeField(n3, l3);
    }

    public UnknownFieldSetLite getBuilderFromMessage(Object object) {
        UnknownFieldSetLite unknownFieldSetLite;
        UnknownFieldSetLite unknownFieldSetLite2 = this.getFromMessage(object);
        if (unknownFieldSetLite2 == (unknownFieldSetLite = UnknownFieldSetLite.getDefaultInstance())) {
            unknownFieldSetLite2 = UnknownFieldSetLite.newInstance();
            this.setToMessage(object, unknownFieldSetLite2);
        }
        return unknownFieldSetLite2;
    }

    public UnknownFieldSetLite getFromMessage(Object object) {
        return ((GeneratedMessageLite)object).unknownFields;
    }

    public int getSerializedSize(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    public int getSerializedSizeAsMessageSet(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    public void makeImmutable(Object object) {
        this.getFromMessage(object).makeImmutable();
    }

    public UnknownFieldSetLite merge(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        UnknownFieldSetLite unknownFieldSetLite3 = UnknownFieldSetLite.getDefaultInstance();
        boolean bl2 = unknownFieldSetLite3.equals(unknownFieldSetLite2);
        if (bl2) {
            return unknownFieldSetLite;
        }
        unknownFieldSetLite3 = UnknownFieldSetLite.getDefaultInstance();
        bl2 = unknownFieldSetLite3.equals(unknownFieldSetLite);
        if (bl2) {
            return UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLite, unknownFieldSetLite2);
        }
        return unknownFieldSetLite.mergeFrom(unknownFieldSetLite2);
    }

    public UnknownFieldSetLite newBuilder() {
        return UnknownFieldSetLite.newInstance();
    }

    public void setBuilderToMessage(Object object, UnknownFieldSetLite unknownFieldSetLite) {
        this.setToMessage(object, unknownFieldSetLite);
    }

    public void setToMessage(Object object, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite)object).unknownFields = unknownFieldSetLite;
    }

    public boolean shouldDiscardUnknownFields(Reader reader) {
        return false;
    }

    public UnknownFieldSetLite toImmutable(UnknownFieldSetLite unknownFieldSetLite) {
        unknownFieldSetLite.makeImmutable();
        return unknownFieldSetLite;
    }

    public void writeAsMessageSetTo(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.writeAsMessageSetTo(writer);
    }

    public void writeTo(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.writeTo(writer);
    }
}

