/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FloatValue$1;
import com.google.protobuf.FloatValue$Builder;
import com.google.protobuf.FloatValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class FloatValue
extends GeneratedMessageLite
implements FloatValueOrBuilder {
    private static final FloatValue DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    static {
        FloatValue floatValue;
        DEFAULT_INSTANCE = floatValue = new FloatValue();
        GeneratedMessageLite.registerDefaultInstance(FloatValue.class, floatValue);
    }

    private FloatValue() {
    }

    public static /* synthetic */ FloatValue access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(FloatValue floatValue, float f5) {
        floatValue.setValue(f5);
    }

    public static /* synthetic */ void access$200(FloatValue floatValue) {
        floatValue.clearValue();
    }

    private void clearValue() {
        this.value_ = 0.0f;
    }

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static FloatValue$Builder newBuilder() {
        return (FloatValue$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static FloatValue$Builder newBuilder(FloatValue floatValue) {
        return (FloatValue$Builder)DEFAULT_INSTANCE.createBuilder(floatValue);
    }

    public static FloatValue of(float f5) {
        return (FloatValue)FloatValue.newBuilder().setValue(f5).build();
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream) {
        return (FloatValue)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (FloatValue)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FloatValue parseFrom(ByteString byteString) {
        return (FloatValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static FloatValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (FloatValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FloatValue parseFrom(CodedInputStream codedInputStream) {
        return (FloatValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static FloatValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (FloatValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FloatValue parseFrom(InputStream inputStream) {
        return (FloatValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (FloatValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer) {
        return (FloatValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (FloatValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FloatValue parseFrom(byte[] byArray) {
        return (FloatValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static FloatValue parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (FloatValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setValue(float f5) {
        this.value_ = f5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = FloatValue$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = FloatValue.class;
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
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", object);
            }
            case 2: {
                return new FloatValue$Builder(null);
            }
            case 1: 
        }
        return new FloatValue();
    }

    public float getValue() {
        return this.value_;
    }
}

