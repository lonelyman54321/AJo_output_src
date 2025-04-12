/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Advice$1;
import com.google.api.Advice$Builder;
import com.google.api.AdviceOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Advice
extends GeneratedMessageLite
implements AdviceOrBuilder {
    private static final Advice DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private String description_ = "";

    static {
        Advice advice;
        DEFAULT_INSTANCE = advice = new Advice();
        GeneratedMessageLite.registerDefaultInstance(Advice.class, advice);
    }

    private Advice() {
    }

    public static /* synthetic */ Advice access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Advice advice, String string2) {
        advice.setDescription(string2);
    }

    public static /* synthetic */ void access$200(Advice advice) {
        advice.clearDescription();
    }

    public static /* synthetic */ void access$300(Advice advice, ByteString byteString) {
        advice.setDescriptionBytes(byteString);
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = Advice.getDefaultInstance().getDescription();
    }

    public static Advice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Advice$Builder newBuilder() {
        return (Advice$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Advice$Builder newBuilder(Advice advice) {
        return (Advice$Builder)DEFAULT_INSTANCE.createBuilder(advice);
    }

    public static Advice parseDelimitedFrom(InputStream inputStream) {
        return (Advice)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Advice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Advice)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Advice parseFrom(ByteString byteString) {
        return (Advice)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Advice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Advice)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Advice parseFrom(CodedInputStream codedInputStream) {
        return (Advice)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Advice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Advice)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Advice parseFrom(InputStream inputStream) {
        return (Advice)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Advice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Advice)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Advice parseFrom(ByteBuffer byteBuffer) {
        return (Advice)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Advice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Advice)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Advice parseFrom(byte[] byArray) {
        return (Advice)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Advice parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Advice)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDescription(String string2) {
        string2.getClass();
        this.description_ = string2;
    }

    private void setDescriptionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.description_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Advice$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Advice.class;
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
                object[0] = "description_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0208", object);
            }
            case 2: {
                return new Advice$Builder(null);
            }
            case 1: 
        }
        return new Advice();
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }
}

