/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue$1;
import com.google.protobuf.BytesValue$Builder;
import com.google.protobuf.BytesValueOrBuilder;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BytesValue
extends GeneratedMessageLite
implements BytesValueOrBuilder {
    private static final BytesValue DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private ByteString value_;

    static {
        BytesValue bytesValue;
        DEFAULT_INSTANCE = bytesValue = new BytesValue();
        GeneratedMessageLite.registerDefaultInstance(BytesValue.class, bytesValue);
    }

    private BytesValue() {
        ByteString byteString;
        this.value_ = byteString = ByteString.EMPTY;
    }

    public static /* synthetic */ BytesValue access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(BytesValue bytesValue, ByteString byteString) {
        bytesValue.setValue(byteString);
    }

    public static /* synthetic */ void access$200(BytesValue bytesValue) {
        bytesValue.clearValue();
    }

    private void clearValue() {
        ByteString byteString;
        this.value_ = byteString = BytesValue.getDefaultInstance().getValue();
    }

    public static BytesValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static BytesValue$Builder newBuilder() {
        return (BytesValue$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static BytesValue$Builder newBuilder(BytesValue bytesValue) {
        return (BytesValue$Builder)DEFAULT_INSTANCE.createBuilder(bytesValue);
    }

    public static BytesValue of(ByteString byteString) {
        return (BytesValue)BytesValue.newBuilder().setValue(byteString).build();
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) {
        return (BytesValue)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BytesValue)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BytesValue parseFrom(ByteString byteString) {
        return (BytesValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static BytesValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (BytesValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BytesValue parseFrom(CodedInputStream codedInputStream) {
        return (BytesValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static BytesValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BytesValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static BytesValue parseFrom(InputStream inputStream) {
        return (BytesValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BytesValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) {
        return (BytesValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (BytesValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BytesValue parseFrom(byte[] byArray) {
        return (BytesValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static BytesValue parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (BytesValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setValue(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = BytesValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = BytesValue.class;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", object);
            }
            case 2: {
                return new BytesValue$Builder(null);
            }
            case 1: 
        }
        return new BytesValue();
    }

    public ByteString getValue() {
        return this.value_;
    }
}

