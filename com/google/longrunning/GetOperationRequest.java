/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.GetOperationRequest$1;
import com.google.longrunning.GetOperationRequest$Builder;
import com.google.longrunning.GetOperationRequestOrBuilder;
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

public final class GetOperationRequest
extends GeneratedMessageLite
implements GetOperationRequestOrBuilder {
    private static final GetOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String name_ = "";

    static {
        GetOperationRequest getOperationRequest;
        DEFAULT_INSTANCE = getOperationRequest = new GetOperationRequest();
        GeneratedMessageLite.registerDefaultInstance(GetOperationRequest.class, getOperationRequest);
    }

    private GetOperationRequest() {
    }

    public static /* synthetic */ GetOperationRequest access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(GetOperationRequest getOperationRequest, String string2) {
        getOperationRequest.setName(string2);
    }

    public static /* synthetic */ void access$200(GetOperationRequest getOperationRequest) {
        getOperationRequest.clearName();
    }

    public static /* synthetic */ void access$300(GetOperationRequest getOperationRequest, ByteString byteString) {
        getOperationRequest.setNameBytes(byteString);
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = GetOperationRequest.getDefaultInstance().getName();
    }

    public static GetOperationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static GetOperationRequest$Builder newBuilder() {
        return (GetOperationRequest$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static GetOperationRequest$Builder newBuilder(GetOperationRequest getOperationRequest) {
        return (GetOperationRequest$Builder)DEFAULT_INSTANCE.createBuilder(getOperationRequest);
    }

    public static GetOperationRequest parseDelimitedFrom(InputStream inputStream) {
        return (GetOperationRequest)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetOperationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (GetOperationRequest)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetOperationRequest parseFrom(ByteString byteString) {
        return (GetOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static GetOperationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (GetOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GetOperationRequest parseFrom(CodedInputStream codedInputStream) {
        return (GetOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static GetOperationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (GetOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static GetOperationRequest parseFrom(InputStream inputStream) {
        return (GetOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static GetOperationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (GetOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetOperationRequest parseFrom(ByteBuffer byteBuffer) {
        return (GetOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static GetOperationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (GetOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GetOperationRequest parseFrom(byte[] byArray) {
        return (GetOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static GetOperationRequest parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (GetOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = GetOperationRequest$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = GetOperationRequest.class;
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
                object[0] = "name_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", object);
            }
            case 2: {
                return new GetOperationRequest$Builder(null);
            }
            case 1: 
        }
        return new GetOperationRequest();
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }
}

