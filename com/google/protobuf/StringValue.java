/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.protobuf.StringValue$1;
import com.google.protobuf.StringValue$Builder;
import com.google.protobuf.StringValueOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class StringValue
extends GeneratedMessageLite
implements StringValueOrBuilder {
    private static final StringValue DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    static {
        StringValue stringValue;
        DEFAULT_INSTANCE = stringValue = new StringValue();
        GeneratedMessageLite.registerDefaultInstance(StringValue.class, stringValue);
    }

    private StringValue() {
    }

    public static /* synthetic */ StringValue access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(StringValue stringValue, String string2) {
        stringValue.setValue(string2);
    }

    public static /* synthetic */ void access$200(StringValue stringValue) {
        stringValue.clearValue();
    }

    public static /* synthetic */ void access$300(StringValue stringValue, ByteString byteString) {
        stringValue.setValueBytes(byteString);
    }

    private void clearValue() {
        String string2;
        this.value_ = string2 = StringValue.getDefaultInstance().getValue();
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static StringValue$Builder newBuilder() {
        return (StringValue$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static StringValue$Builder newBuilder(StringValue stringValue) {
        return (StringValue$Builder)DEFAULT_INSTANCE.createBuilder(stringValue);
    }

    public static StringValue of(String string2) {
        return (StringValue)StringValue.newBuilder().setValue(string2).build();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) {
        return (StringValue)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (StringValue)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StringValue parseFrom(ByteString byteString) {
        return (StringValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static StringValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (StringValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static StringValue parseFrom(CodedInputStream codedInputStream) {
        return (StringValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static StringValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (StringValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static StringValue parseFrom(InputStream inputStream) {
        return (StringValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (StringValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) {
        return (StringValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (StringValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static StringValue parseFrom(byte[] byArray) {
        return (StringValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static StringValue parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (StringValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setValue(String string2) {
        string2.getClass();
        this.value_ = string2;
    }

    private void setValueBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.value_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = StringValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object3 = object.ordinal();
        object3 = object2[object3];
        object2 = null;
        switch (object3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                object = PARSER;
                if (object != null) return object;
                clazz = StringValue.class;
                synchronized (clazz) {
                    try {
                        object = PARSER;
                        if (object != null) return object;
                        object2 = DEFAULT_INSTANCE;
                        PARSER = object = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                object = new Object[by2];
                object[0] = "value_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", object);
            }
            case 2: {
                return new StringValue$Builder(null);
            }
            case 1: 
        }
        return new StringValue();
    }

    public String getValue() {
        return this.value_;
    }

    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.value_);
    }
}

