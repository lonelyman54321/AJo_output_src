/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any$1;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Any
extends GeneratedMessageLite
implements AnyOrBuilder {
    private static final Any DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private ByteString value_;

    static {
        Any any;
        DEFAULT_INSTANCE = any = new Any();
        GeneratedMessageLite.registerDefaultInstance(Any.class, any);
    }

    private Any() {
        ByteString byteString;
        this.value_ = byteString = ByteString.EMPTY;
    }

    public static /* synthetic */ Any access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Any any, String string2) {
        any.setTypeUrl(string2);
    }

    public static /* synthetic */ void access$200(Any any) {
        any.clearTypeUrl();
    }

    public static /* synthetic */ void access$300(Any any, ByteString byteString) {
        any.setTypeUrlBytes(byteString);
    }

    public static /* synthetic */ void access$400(Any any, ByteString byteString) {
        any.setValue(byteString);
    }

    public static /* synthetic */ void access$500(Any any) {
        any.clearValue();
    }

    private void clearTypeUrl() {
        String string2;
        this.typeUrl_ = string2 = Any.getDefaultInstance().getTypeUrl();
    }

    private void clearValue() {
        ByteString byteString;
        this.value_ = byteString = Any.getDefaultInstance().getValue();
    }

    public static Any getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Any$Builder newBuilder() {
        return (Any$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Any$Builder newBuilder(Any any) {
        return (Any$Builder)DEFAULT_INSTANCE.createBuilder(any);
    }

    public static Any parseDelimitedFrom(InputStream inputStream) {
        return (Any)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Any)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Any parseFrom(ByteString byteString) {
        return (Any)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Any parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Any)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Any parseFrom(CodedInputStream codedInputStream) {
        return (Any)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Any parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Any)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Any parseFrom(InputStream inputStream) {
        return (Any)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Any)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Any parseFrom(ByteBuffer byteBuffer) {
        return (Any)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Any parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Any)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Any parseFrom(byte[] byArray) {
        return (Any)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Any parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Any)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setTypeUrl(String string2) {
        string2.getClass();
        this.typeUrl_ = string2;
    }

    private void setTypeUrlBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.typeUrl_ = object = ((ByteString)object).toStringUtf8();
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
        object2 = Any$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Any.class;
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
                object = new Object[2];
                object[0] = "typeUrl_";
                object[by2] = "value_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\n", object);
            }
            case 2: {
                return new Any$Builder(null);
            }
            case 1: 
        }
        return new Any();
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public ByteString getTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.typeUrl_);
    }

    public ByteString getValue() {
        return this.value_;
    }
}

