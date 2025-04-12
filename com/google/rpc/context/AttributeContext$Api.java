/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Api$Builder;
import com.google.rpc.context.AttributeContext$ApiOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class AttributeContext$Api
extends GeneratedMessageLite
implements AttributeContext$ApiOrBuilder {
    private static final AttributeContext$Api DEFAULT_INSTANCE;
    public static final int OPERATION_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int PROTOCOL_FIELD_NUMBER = 3;
    public static final int SERVICE_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 4;
    private String operation_;
    private String protocol_;
    private String service_;
    private String version_;

    static {
        AttributeContext$Api attributeContext$Api;
        DEFAULT_INSTANCE = attributeContext$Api = new AttributeContext$Api();
        GeneratedMessageLite.registerDefaultInstance(AttributeContext$Api.class, attributeContext$Api);
    }

    private AttributeContext$Api() {
        String string2;
        this.service_ = string2 = "";
        this.operation_ = string2;
        this.protocol_ = string2;
        this.version_ = string2;
    }

    public static /* synthetic */ AttributeContext$Api access$1400() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$1500(AttributeContext$Api attributeContext$Api, String string2) {
        attributeContext$Api.setService(string2);
    }

    public static /* synthetic */ void access$1600(AttributeContext$Api attributeContext$Api) {
        attributeContext$Api.clearService();
    }

    public static /* synthetic */ void access$1700(AttributeContext$Api attributeContext$Api, ByteString byteString) {
        attributeContext$Api.setServiceBytes(byteString);
    }

    public static /* synthetic */ void access$1800(AttributeContext$Api attributeContext$Api, String string2) {
        attributeContext$Api.setOperation(string2);
    }

    public static /* synthetic */ void access$1900(AttributeContext$Api attributeContext$Api) {
        attributeContext$Api.clearOperation();
    }

    public static /* synthetic */ void access$2000(AttributeContext$Api attributeContext$Api, ByteString byteString) {
        attributeContext$Api.setOperationBytes(byteString);
    }

    public static /* synthetic */ void access$2100(AttributeContext$Api attributeContext$Api, String string2) {
        attributeContext$Api.setProtocol(string2);
    }

    public static /* synthetic */ void access$2200(AttributeContext$Api attributeContext$Api) {
        attributeContext$Api.clearProtocol();
    }

    public static /* synthetic */ void access$2300(AttributeContext$Api attributeContext$Api, ByteString byteString) {
        attributeContext$Api.setProtocolBytes(byteString);
    }

    public static /* synthetic */ void access$2400(AttributeContext$Api attributeContext$Api, String string2) {
        attributeContext$Api.setVersion(string2);
    }

    public static /* synthetic */ void access$2500(AttributeContext$Api attributeContext$Api) {
        attributeContext$Api.clearVersion();
    }

    public static /* synthetic */ void access$2600(AttributeContext$Api attributeContext$Api, ByteString byteString) {
        attributeContext$Api.setVersionBytes(byteString);
    }

    private void clearOperation() {
        String string2;
        this.operation_ = string2 = AttributeContext$Api.getDefaultInstance().getOperation();
    }

    private void clearProtocol() {
        String string2;
        this.protocol_ = string2 = AttributeContext$Api.getDefaultInstance().getProtocol();
    }

    private void clearService() {
        String string2;
        this.service_ = string2 = AttributeContext$Api.getDefaultInstance().getService();
    }

    private void clearVersion() {
        String string2;
        this.version_ = string2 = AttributeContext$Api.getDefaultInstance().getVersion();
    }

    public static AttributeContext$Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static AttributeContext$Api$Builder newBuilder() {
        return (AttributeContext$Api$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AttributeContext$Api$Builder newBuilder(AttributeContext$Api attributeContext$Api) {
        return (AttributeContext$Api$Builder)DEFAULT_INSTANCE.createBuilder(attributeContext$Api);
    }

    public static AttributeContext$Api parseDelimitedFrom(InputStream inputStream) {
        return (AttributeContext$Api)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext$Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Api)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext$Api parseFrom(ByteString byteString) {
        return (AttributeContext$Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AttributeContext$Api parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AttributeContext$Api parseFrom(CodedInputStream codedInputStream) {
        return (AttributeContext$Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AttributeContext$Api parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AttributeContext$Api parseFrom(InputStream inputStream) {
        return (AttributeContext$Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext$Api parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext$Api parseFrom(ByteBuffer byteBuffer) {
        return (AttributeContext$Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AttributeContext$Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AttributeContext$Api parseFrom(byte[] byArray) {
        return (AttributeContext$Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AttributeContext$Api parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setOperation(String string2) {
        string2.getClass();
        this.operation_ = string2;
    }

    private void setOperationBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.operation_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setProtocol(String string2) {
        string2.getClass();
        this.protocol_ = string2;
    }

    private void setProtocolBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.protocol_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setService(String string2) {
        string2.getClass();
        this.service_ = string2;
    }

    private void setServiceBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.service_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setVersion(String string2) {
        string2.getClass();
        this.version_ = string2;
    }

    private void setVersionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.version_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = AttributeContext$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = objectArray.ordinal();
        object2 = object[object2];
        object = null;
        switch (object2) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = AttributeContext$Api.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[4];
                objectArray[0] = "service_";
                objectArray[by2] = "operation_";
                objectArray[2] = "protocol_";
                objectArray[3] = "version_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", objectArray);
            }
            case 2: {
                return new AttributeContext$Api$Builder(null);
            }
            case 1: 
        }
        return new AttributeContext$Api();
    }

    public String getOperation() {
        return this.operation_;
    }

    public ByteString getOperationBytes() {
        return ByteString.copyFromUtf8(this.operation_);
    }

    public String getProtocol() {
        return this.protocol_;
    }

    public ByteString getProtocolBytes() {
        return ByteString.copyFromUtf8(this.protocol_);
    }

    public String getService() {
        return this.service_;
    }

    public ByteString getServiceBytes() {
        return ByteString.copyFromUtf8(this.service_);
    }

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }
}

