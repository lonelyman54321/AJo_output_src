/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$CodedBuilder;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMessageLite
implements MessageLite {
    protected int memoizedHashCode = 0;

    public static void addAll(Iterable iterable, Collection collection) {
        collection = (List)collection;
        AbstractMessageLite$Builder.addAll(iterable, (List)collection);
    }

    public static void addAll(Iterable iterable, List list) {
        AbstractMessageLite$Builder.addAll(iterable, list);
    }

    public static void checkByteStringIsUtf8(ByteString serializable) {
        boolean bl2 = serializable.isValidUtf8();
        if (bl2) {
            return;
        }
        serializable = new IllegalArgumentException("Byte string is not UTF-8.");
        throw serializable;
    }

    private String getSerializingExceptionMessage(String string2) {
        StringBuilder stringBuilder = new StringBuilder("Serializing ");
        String string3 = this.getClass().getName();
        stringBuilder.append(string3);
        stringBuilder.append(" to a ");
        stringBuilder.append(string2);
        stringBuilder.append(" threw an IOException (should never happen).");
        return stringBuilder.toString();
    }

    public int getMemoizedSerializedSize() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public int getSerializedSize(Schema schema) {
        int n3;
        int n4 = this.getMemoizedSerializedSize();
        if (n4 == (n3 = -1)) {
            n4 = schema.getSerializedSize(this);
            this.setMemoizedSerializedSize(n4);
        }
        return n4;
    }

    public UninitializedMessageException newUninitializedMessageException() {
        UninitializedMessageException uninitializedMessageException = new UninitializedMessageException(this);
        return uninitializedMessageException;
    }

    public void setMemoizedSerializedSize(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public byte[] toByteArray() {
        Object object;
        int n3;
        try {
            n3 = this.getSerializedSize();
        }
        catch (IOException iOException) {
            String string2 = this.getSerializingExceptionMessage("byte array");
            object = new RuntimeException(string2, iOException);
            throw object;
        }
        byte[] byArray = new byte[n3];
        object = CodedOutputStream.newInstance(byArray);
        this.writeTo((CodedOutputStream)object);
        ((CodedOutputStream)object).checkNoSpaceLeft();
        return byArray;
    }

    public ByteString toByteString() {
        Object object;
        int n3;
        try {
            n3 = this.getSerializedSize();
        }
        catch (IOException iOException) {
            String string2 = this.getSerializingExceptionMessage("ByteString");
            object = new RuntimeException(string2, iOException);
            throw object;
        }
        ByteString$CodedBuilder byteString$CodedBuilder = ByteString.newCodedBuilder(n3);
        object = byteString$CodedBuilder.getCodedOutput();
        this.writeTo((CodedOutputStream)object);
        return byteString$CodedBuilder.build();
    }

    public void writeDelimitedTo(OutputStream object) {
        int n3 = this.getSerializedSize();
        int n4 = CodedOutputStream.computePreferredBufferSize(CodedOutputStream.computeUInt32SizeNoTag(n3) + n3);
        object = CodedOutputStream.newInstance((OutputStream)object, n4);
        ((CodedOutputStream)object).writeUInt32NoTag(n3);
        this.writeTo((CodedOutputStream)object);
        ((CodedOutputStream)object).flush();
    }

    public void writeTo(OutputStream object) {
        int n3 = CodedOutputStream.computePreferredBufferSize(this.getSerializedSize());
        object = CodedOutputStream.newInstance((OutputStream)object, n3);
        this.writeTo((CodedOutputStream)object);
        ((CodedOutputStream)object).flush();
    }
}

