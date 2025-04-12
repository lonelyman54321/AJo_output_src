/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Int64Value$1;
import com.google.protobuf.Int64Value$Builder;
import com.google.protobuf.Int64ValueOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Int64Value
extends GeneratedMessageLite
implements Int64ValueOrBuilder {
    private static final Int64Value DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        Int64Value int64Value;
        DEFAULT_INSTANCE = int64Value = new Int64Value();
        GeneratedMessageLite.registerDefaultInstance(Int64Value.class, int64Value);
    }

    private Int64Value() {
    }

    public static /* synthetic */ Int64Value access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Int64Value int64Value, long l2) {
        int64Value.setValue(l2);
    }

    public static /* synthetic */ void access$200(Int64Value int64Value) {
        int64Value.clearValue();
    }

    private void clearValue() {
        this.value_ = 0L;
    }

    public static Int64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Int64Value$Builder newBuilder() {
        return (Int64Value$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Int64Value$Builder newBuilder(Int64Value int64Value) {
        return (Int64Value$Builder)DEFAULT_INSTANCE.createBuilder(int64Value);
    }

    public static Int64Value of(long l2) {
        return (Int64Value)Int64Value.newBuilder().setValue(l2).build();
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream) {
        return (Int64Value)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Int64Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Int64Value)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Int64Value parseFrom(ByteString byteString) {
        return (Int64Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Int64Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Int64Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Int64Value parseFrom(CodedInputStream codedInputStream) {
        return (Int64Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Int64Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Int64Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Int64Value parseFrom(InputStream inputStream) {
        return (Int64Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Int64Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Int64Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer) {
        return (Int64Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Int64Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Int64Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Int64Value parseFrom(byte[] byArray) {
        return (Int64Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Int64Value parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Int64Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setValue(long l2) {
        this.value_ = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Int64Value$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Int64Value.class;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", object);
            }
            case 2: {
                return new Int64Value$Builder(null);
            }
            case 1: 
        }
        return new Int64Value();
    }

    public long getValue() {
        return this.value_;
    }
}

