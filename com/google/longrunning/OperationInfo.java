/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.OperationInfo$1;
import com.google.longrunning.OperationInfo$Builder;
import com.google.longrunning.OperationInfoOrBuilder;
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

public final class OperationInfo
extends GeneratedMessageLite
implements OperationInfoOrBuilder {
    private static final OperationInfo DEFAULT_INSTANCE;
    public static final int METADATA_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 1;
    private String metadataType_;
    private String responseType_;

    static {
        OperationInfo operationInfo;
        DEFAULT_INSTANCE = operationInfo = new OperationInfo();
        GeneratedMessageLite.registerDefaultInstance(OperationInfo.class, operationInfo);
    }

    private OperationInfo() {
        String string2;
        this.responseType_ = string2 = "";
        this.metadataType_ = string2;
    }

    public static /* synthetic */ OperationInfo access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(OperationInfo operationInfo, String string2) {
        operationInfo.setResponseType(string2);
    }

    public static /* synthetic */ void access$200(OperationInfo operationInfo) {
        operationInfo.clearResponseType();
    }

    public static /* synthetic */ void access$300(OperationInfo operationInfo, ByteString byteString) {
        operationInfo.setResponseTypeBytes(byteString);
    }

    public static /* synthetic */ void access$400(OperationInfo operationInfo, String string2) {
        operationInfo.setMetadataType(string2);
    }

    public static /* synthetic */ void access$500(OperationInfo operationInfo) {
        operationInfo.clearMetadataType();
    }

    public static /* synthetic */ void access$600(OperationInfo operationInfo, ByteString byteString) {
        operationInfo.setMetadataTypeBytes(byteString);
    }

    private void clearMetadataType() {
        String string2;
        this.metadataType_ = string2 = OperationInfo.getDefaultInstance().getMetadataType();
    }

    private void clearResponseType() {
        String string2;
        this.responseType_ = string2 = OperationInfo.getDefaultInstance().getResponseType();
    }

    public static OperationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static OperationInfo$Builder newBuilder() {
        return (OperationInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static OperationInfo$Builder newBuilder(OperationInfo operationInfo) {
        return (OperationInfo$Builder)DEFAULT_INSTANCE.createBuilder(operationInfo);
    }

    public static OperationInfo parseDelimitedFrom(InputStream inputStream) {
        return (OperationInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OperationInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationInfo parseFrom(ByteString byteString) {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static OperationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OperationInfo parseFrom(CodedInputStream codedInputStream) {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static OperationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static OperationInfo parseFrom(InputStream inputStream) {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static OperationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationInfo parseFrom(ByteBuffer byteBuffer) {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static OperationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OperationInfo parseFrom(byte[] byArray) {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static OperationInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMetadataType(String string2) {
        string2.getClass();
        this.metadataType_ = string2;
    }

    private void setMetadataTypeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.metadataType_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setResponseType(String string2) {
        string2.getClass();
        this.responseType_ = string2;
    }

    private void setResponseTypeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.responseType_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = OperationInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = OperationInfo.class;
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
                object[0] = "responseType_";
                object[by2] = "metadataType_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", object);
            }
            case 2: {
                return new OperationInfo$Builder(null);
            }
            case 1: 
        }
        return new OperationInfo();
    }

    public String getMetadataType() {
        return this.metadataType_;
    }

    public ByteString getMetadataTypeBytes() {
        return ByteString.copyFromUtf8(this.metadataType_);
    }

    public String getResponseType() {
        return this.responseType_;
    }

    public ByteString getResponseTypeBytes() {
        return ByteString.copyFromUtf8(this.responseType_);
    }
}

