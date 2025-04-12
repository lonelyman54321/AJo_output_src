/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.SystemParameter$1;
import com.google.api.SystemParameter$Builder;
import com.google.api.SystemParameterOrBuilder;
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

public final class SystemParameter
extends GeneratedMessageLite
implements SystemParameterOrBuilder {
    private static final SystemParameter DEFAULT_INSTANCE;
    public static final int HTTP_HEADER_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
    private String httpHeader_;
    private String name_;
    private String urlQueryParameter_;

    static {
        SystemParameter systemParameter;
        DEFAULT_INSTANCE = systemParameter = new SystemParameter();
        GeneratedMessageLite.registerDefaultInstance(SystemParameter.class, systemParameter);
    }

    private SystemParameter() {
        String string2;
        this.name_ = string2 = "";
        this.httpHeader_ = string2;
        this.urlQueryParameter_ = string2;
    }

    public static /* synthetic */ SystemParameter access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(SystemParameter systemParameter, String string2) {
        systemParameter.setName(string2);
    }

    public static /* synthetic */ void access$200(SystemParameter systemParameter) {
        systemParameter.clearName();
    }

    public static /* synthetic */ void access$300(SystemParameter systemParameter, ByteString byteString) {
        systemParameter.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(SystemParameter systemParameter, String string2) {
        systemParameter.setHttpHeader(string2);
    }

    public static /* synthetic */ void access$500(SystemParameter systemParameter) {
        systemParameter.clearHttpHeader();
    }

    public static /* synthetic */ void access$600(SystemParameter systemParameter, ByteString byteString) {
        systemParameter.setHttpHeaderBytes(byteString);
    }

    public static /* synthetic */ void access$700(SystemParameter systemParameter, String string2) {
        systemParameter.setUrlQueryParameter(string2);
    }

    public static /* synthetic */ void access$800(SystemParameter systemParameter) {
        systemParameter.clearUrlQueryParameter();
    }

    public static /* synthetic */ void access$900(SystemParameter systemParameter, ByteString byteString) {
        systemParameter.setUrlQueryParameterBytes(byteString);
    }

    private void clearHttpHeader() {
        String string2;
        this.httpHeader_ = string2 = SystemParameter.getDefaultInstance().getHttpHeader();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = SystemParameter.getDefaultInstance().getName();
    }

    private void clearUrlQueryParameter() {
        String string2;
        this.urlQueryParameter_ = string2 = SystemParameter.getDefaultInstance().getUrlQueryParameter();
    }

    public static SystemParameter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static SystemParameter$Builder newBuilder() {
        return (SystemParameter$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemParameter$Builder newBuilder(SystemParameter systemParameter) {
        return (SystemParameter$Builder)DEFAULT_INSTANCE.createBuilder(systemParameter);
    }

    public static SystemParameter parseDelimitedFrom(InputStream inputStream) {
        return (SystemParameter)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameter)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SystemParameter parseFrom(ByteString byteString) {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static SystemParameter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SystemParameter parseFrom(CodedInputStream codedInputStream) {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static SystemParameter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static SystemParameter parseFrom(InputStream inputStream) {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SystemParameter parseFrom(ByteBuffer byteBuffer) {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static SystemParameter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SystemParameter parseFrom(byte[] byArray) {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static SystemParameter parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHttpHeader(String string2) {
        string2.getClass();
        this.httpHeader_ = string2;
    }

    private void setHttpHeaderBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.httpHeader_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setUrlQueryParameter(String string2) {
        string2.getClass();
        this.urlQueryParameter_ = string2;
    }

    private void setUrlQueryParameterBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.urlQueryParameter_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = SystemParameter$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = SystemParameter.class;
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
                objectArray = new Object[3];
                objectArray[0] = "name_";
                objectArray[by2] = "httpHeader_";
                objectArray[2] = "urlQueryParameter_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", objectArray);
            }
            case 2: {
                return new SystemParameter$Builder(null);
            }
            case 1: 
        }
        return new SystemParameter();
    }

    public String getHttpHeader() {
        return this.httpHeader_;
    }

    public ByteString getHttpHeaderBytes() {
        return ByteString.copyFromUtf8(this.httpHeader_);
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getUrlQueryParameter() {
        return this.urlQueryParameter_;
    }

    public ByteString getUrlQueryParameterBytes() {
        return ByteString.copyFromUtf8(this.urlQueryParameter_);
    }
}

