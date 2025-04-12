/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.rpc.RequestInfo$1;
import com.google.rpc.RequestInfo$Builder;
import com.google.rpc.RequestInfoOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RequestInfo
extends GeneratedMessageLite
implements RequestInfoOrBuilder {
    private static final RequestInfo DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SERVING_DATA_FIELD_NUMBER = 2;
    private String requestId_;
    private String servingData_;

    static {
        RequestInfo requestInfo;
        DEFAULT_INSTANCE = requestInfo = new RequestInfo();
        GeneratedMessageLite.registerDefaultInstance(RequestInfo.class, requestInfo);
    }

    private RequestInfo() {
        String string2;
        this.requestId_ = string2 = "";
        this.servingData_ = string2;
    }

    public static /* synthetic */ RequestInfo access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(RequestInfo requestInfo, String string2) {
        requestInfo.setRequestId(string2);
    }

    public static /* synthetic */ void access$200(RequestInfo requestInfo) {
        requestInfo.clearRequestId();
    }

    public static /* synthetic */ void access$300(RequestInfo requestInfo, ByteString byteString) {
        requestInfo.setRequestIdBytes(byteString);
    }

    public static /* synthetic */ void access$400(RequestInfo requestInfo, String string2) {
        requestInfo.setServingData(string2);
    }

    public static /* synthetic */ void access$500(RequestInfo requestInfo) {
        requestInfo.clearServingData();
    }

    public static /* synthetic */ void access$600(RequestInfo requestInfo, ByteString byteString) {
        requestInfo.setServingDataBytes(byteString);
    }

    private void clearRequestId() {
        String string2;
        this.requestId_ = string2 = RequestInfo.getDefaultInstance().getRequestId();
    }

    private void clearServingData() {
        String string2;
        this.servingData_ = string2 = RequestInfo.getDefaultInstance().getServingData();
    }

    public static RequestInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static RequestInfo$Builder newBuilder() {
        return (RequestInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static RequestInfo$Builder newBuilder(RequestInfo requestInfo) {
        return (RequestInfo$Builder)DEFAULT_INSTANCE.createBuilder(requestInfo);
    }

    public static RequestInfo parseDelimitedFrom(InputStream inputStream) {
        return (RequestInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RequestInfo parseFrom(ByteString byteString) {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static RequestInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RequestInfo parseFrom(CodedInputStream codedInputStream) {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static RequestInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static RequestInfo parseFrom(InputStream inputStream) {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static RequestInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RequestInfo parseFrom(ByteBuffer byteBuffer) {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static RequestInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RequestInfo parseFrom(byte[] byArray) {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static RequestInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRequestId(String string2) {
        string2.getClass();
        this.requestId_ = string2;
    }

    private void setRequestIdBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.requestId_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setServingData(String string2) {
        string2.getClass();
        this.servingData_ = string2;
    }

    private void setServingDataBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.servingData_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = RequestInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = RequestInfo.class;
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
                object[0] = "requestId_";
                object[by2] = "servingData_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", object);
            }
            case 2: {
                return new RequestInfo$Builder(null);
            }
            case 1: 
        }
        return new RequestInfo();
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public String getServingData() {
        return this.servingData_;
    }

    public ByteString getServingDataBytes() {
        return ByteString.copyFromUtf8(this.servingData_);
    }
}

