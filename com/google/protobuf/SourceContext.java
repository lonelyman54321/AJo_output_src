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
import com.google.protobuf.SourceContext$1;
import com.google.protobuf.SourceContext$Builder;
import com.google.protobuf.SourceContextOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SourceContext
extends GeneratedMessageLite
implements SourceContextOrBuilder {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String fileName_ = "";

    static {
        SourceContext sourceContext;
        DEFAULT_INSTANCE = sourceContext = new SourceContext();
        GeneratedMessageLite.registerDefaultInstance(SourceContext.class, sourceContext);
    }

    private SourceContext() {
    }

    public static /* synthetic */ SourceContext access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(SourceContext sourceContext, String string2) {
        sourceContext.setFileName(string2);
    }

    public static /* synthetic */ void access$200(SourceContext sourceContext) {
        sourceContext.clearFileName();
    }

    public static /* synthetic */ void access$300(SourceContext sourceContext, ByteString byteString) {
        sourceContext.setFileNameBytes(byteString);
    }

    private void clearFileName() {
        String string2;
        this.fileName_ = string2 = SourceContext.getDefaultInstance().getFileName();
    }

    public static SourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static SourceContext$Builder newBuilder() {
        return (SourceContext$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static SourceContext$Builder newBuilder(SourceContext sourceContext) {
        return (SourceContext$Builder)DEFAULT_INSTANCE.createBuilder(sourceContext);
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream) {
        return (SourceContext)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SourceContext)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SourceContext parseFrom(ByteString byteString) {
        return (SourceContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static SourceContext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SourceContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SourceContext parseFrom(CodedInputStream codedInputStream) {
        return (SourceContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static SourceContext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SourceContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static SourceContext parseFrom(InputStream inputStream) {
        return (SourceContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SourceContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer) {
        return (SourceContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SourceContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SourceContext parseFrom(byte[] byArray) {
        return (SourceContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static SourceContext parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (SourceContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFileName(String string2) {
        string2.getClass();
        this.fileName_ = string2;
    }

    private void setFileNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.fileName_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = SourceContext$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = SourceContext.class;
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
                object[0] = "fileName_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", object);
            }
            case 2: {
                return new SourceContext$Builder(null);
            }
            case 1: 
        }
        return new SourceContext();
    }

    public String getFileName() {
        return this.fileName_;
    }

    public ByteString getFileNameBytes() {
        return ByteString.copyFromUtf8(this.fileName_);
    }
}

