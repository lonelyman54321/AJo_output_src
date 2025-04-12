/*
 * Decompiled with CFR 0.152.
 */
package com.google.cloud.audit;

import com.google.cloud.audit.RequestMetadata$1;
import com.google.cloud.audit.RequestMetadata$Builder;
import com.google.cloud.audit.RequestMetadataOrBuilder;
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

public final class RequestMetadata
extends GeneratedMessageLite
implements RequestMetadataOrBuilder {
    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    private static final RequestMetadata DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    private String callerIp_;
    private String callerSuppliedUserAgent_;

    static {
        RequestMetadata requestMetadata;
        DEFAULT_INSTANCE = requestMetadata = new RequestMetadata();
        GeneratedMessageLite.registerDefaultInstance(RequestMetadata.class, requestMetadata);
    }

    private RequestMetadata() {
        String string2;
        this.callerIp_ = string2 = "";
        this.callerSuppliedUserAgent_ = string2;
    }

    public static /* synthetic */ RequestMetadata access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(RequestMetadata requestMetadata, String string2) {
        requestMetadata.setCallerIp(string2);
    }

    public static /* synthetic */ void access$200(RequestMetadata requestMetadata) {
        requestMetadata.clearCallerIp();
    }

    public static /* synthetic */ void access$300(RequestMetadata requestMetadata, ByteString byteString) {
        requestMetadata.setCallerIpBytes(byteString);
    }

    public static /* synthetic */ void access$400(RequestMetadata requestMetadata, String string2) {
        requestMetadata.setCallerSuppliedUserAgent(string2);
    }

    public static /* synthetic */ void access$500(RequestMetadata requestMetadata) {
        requestMetadata.clearCallerSuppliedUserAgent();
    }

    public static /* synthetic */ void access$600(RequestMetadata requestMetadata, ByteString byteString) {
        requestMetadata.setCallerSuppliedUserAgentBytes(byteString);
    }

    private void clearCallerIp() {
        String string2;
        this.callerIp_ = string2 = RequestMetadata.getDefaultInstance().getCallerIp();
    }

    private void clearCallerSuppliedUserAgent() {
        String string2;
        this.callerSuppliedUserAgent_ = string2 = RequestMetadata.getDefaultInstance().getCallerSuppliedUserAgent();
    }

    public static RequestMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static RequestMetadata$Builder newBuilder() {
        return (RequestMetadata$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static RequestMetadata$Builder newBuilder(RequestMetadata requestMetadata) {
        return (RequestMetadata$Builder)DEFAULT_INSTANCE.createBuilder(requestMetadata);
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream) {
        return (RequestMetadata)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestMetadata)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(ByteString byteString) {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static RequestMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(CodedInputStream codedInputStream) {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static RequestMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(InputStream inputStream) {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static RequestMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer) {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(byte[] byArray) {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static RequestMetadata parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCallerIp(String string2) {
        string2.getClass();
        this.callerIp_ = string2;
    }

    private void setCallerIpBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.callerIp_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setCallerSuppliedUserAgent(String string2) {
        string2.getClass();
        this.callerSuppliedUserAgent_ = string2;
    }

    private void setCallerSuppliedUserAgentBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.callerSuppliedUserAgent_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = RequestMetadata$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = RequestMetadata.class;
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
                object[0] = "callerIp_";
                object[by2] = "callerSuppliedUserAgent_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", object);
            }
            case 2: {
                return new RequestMetadata$Builder(null);
            }
            case 1: 
        }
        return new RequestMetadata();
    }

    public String getCallerIp() {
        return this.callerIp_;
    }

    public ByteString getCallerIpBytes() {
        return ByteString.copyFromUtf8(this.callerIp_);
    }

    public String getCallerSuppliedUserAgent() {
        return this.callerSuppliedUserAgent_;
    }

    public ByteString getCallerSuppliedUserAgentBytes() {
        return ByteString.copyFromUtf8(this.callerSuppliedUserAgent_);
    }
}

