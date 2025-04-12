/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DoubleValue$1;
import com.google.protobuf.DoubleValue$Builder;
import com.google.protobuf.DoubleValueOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DoubleValue
extends GeneratedMessageLite
implements DoubleValueOrBuilder {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    static {
        DoubleValue doubleValue;
        DEFAULT_INSTANCE = doubleValue = new DoubleValue();
        GeneratedMessageLite.registerDefaultInstance(DoubleValue.class, doubleValue);
    }

    private DoubleValue() {
    }

    public static /* synthetic */ DoubleValue access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(DoubleValue doubleValue, double d2) {
        doubleValue.setValue(d2);
    }

    public static /* synthetic */ void access$200(DoubleValue doubleValue) {
        doubleValue.clearValue();
    }

    private void clearValue() {
        this.value_ = 0.0;
    }

    public static DoubleValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DoubleValue$Builder newBuilder() {
        return (DoubleValue$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DoubleValue$Builder newBuilder(DoubleValue doubleValue) {
        return (DoubleValue$Builder)DEFAULT_INSTANCE.createBuilder(doubleValue);
    }

    public static DoubleValue of(double d2) {
        return (DoubleValue)DoubleValue.newBuilder().setValue(d2).build();
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream) {
        return (DoubleValue)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DoubleValue)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DoubleValue parseFrom(ByteString byteString) {
        return (DoubleValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DoubleValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DoubleValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DoubleValue parseFrom(CodedInputStream codedInputStream) {
        return (DoubleValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DoubleValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DoubleValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DoubleValue parseFrom(InputStream inputStream) {
        return (DoubleValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DoubleValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer) {
        return (DoubleValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DoubleValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DoubleValue parseFrom(byte[] byArray) {
        return (DoubleValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DoubleValue parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DoubleValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setValue(double d2) {
        this.value_ = d2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = DoubleValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = DoubleValue.class;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", object);
            }
            case 2: {
                return new DoubleValue$Builder(null);
            }
            case 1: 
        }
        return new DoubleValue();
    }

    public double getValue() {
        return this.value_;
    }
}

