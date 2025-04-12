/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.CustomHttpPattern$1;
import com.google.api.CustomHttpPattern$Builder;
import com.google.api.CustomHttpPatternOrBuilder;
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

public final class CustomHttpPattern
extends GeneratedMessageLite
implements CustomHttpPatternOrBuilder {
    private static final CustomHttpPattern DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int PATH_FIELD_NUMBER = 2;
    private String kind_;
    private String path_;

    static {
        CustomHttpPattern customHttpPattern;
        DEFAULT_INSTANCE = customHttpPattern = new CustomHttpPattern();
        GeneratedMessageLite.registerDefaultInstance(CustomHttpPattern.class, customHttpPattern);
    }

    private CustomHttpPattern() {
        String string2;
        this.kind_ = string2 = "";
        this.path_ = string2;
    }

    public static /* synthetic */ CustomHttpPattern access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(CustomHttpPattern customHttpPattern, String string2) {
        customHttpPattern.setKind(string2);
    }

    public static /* synthetic */ void access$200(CustomHttpPattern customHttpPattern) {
        customHttpPattern.clearKind();
    }

    public static /* synthetic */ void access$300(CustomHttpPattern customHttpPattern, ByteString byteString) {
        customHttpPattern.setKindBytes(byteString);
    }

    public static /* synthetic */ void access$400(CustomHttpPattern customHttpPattern, String string2) {
        customHttpPattern.setPath(string2);
    }

    public static /* synthetic */ void access$500(CustomHttpPattern customHttpPattern) {
        customHttpPattern.clearPath();
    }

    public static /* synthetic */ void access$600(CustomHttpPattern customHttpPattern, ByteString byteString) {
        customHttpPattern.setPathBytes(byteString);
    }

    private void clearKind() {
        String string2;
        this.kind_ = string2 = CustomHttpPattern.getDefaultInstance().getKind();
    }

    private void clearPath() {
        String string2;
        this.path_ = string2 = CustomHttpPattern.getDefaultInstance().getPath();
    }

    public static CustomHttpPattern getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static CustomHttpPattern$Builder newBuilder() {
        return (CustomHttpPattern$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static CustomHttpPattern$Builder newBuilder(CustomHttpPattern customHttpPattern) {
        return (CustomHttpPattern$Builder)DEFAULT_INSTANCE.createBuilder(customHttpPattern);
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream) {
        return (CustomHttpPattern)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CustomHttpPattern)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(ByteString byteString) {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static CustomHttpPattern parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(CodedInputStream codedInputStream) {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static CustomHttpPattern parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream) {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(ByteBuffer byteBuffer) {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static CustomHttpPattern parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(byte[] byArray) {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static CustomHttpPattern parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setKind(String string2) {
        string2.getClass();
        this.kind_ = string2;
    }

    private void setKindBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.kind_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setPath(String string2) {
        string2.getClass();
        this.path_ = string2;
    }

    private void setPathBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.path_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = CustomHttpPattern$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = CustomHttpPattern.class;
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
                object[0] = "kind_";
                object[by2] = "path_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", object);
            }
            case 2: {
                return new CustomHttpPattern$Builder(null);
            }
            case 1: 
        }
        return new CustomHttpPattern();
    }

    public String getKind() {
        return this.kind_;
    }

    public ByteString getKindBytes() {
        return ByteString.copyFromUtf8(this.kind_);
    }

    public String getPath() {
        return this.path_;
    }

    public ByteString getPathBytes() {
        return ByteString.copyFromUtf8(this.path_);
    }
}

