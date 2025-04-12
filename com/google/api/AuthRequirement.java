/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.AuthRequirement$1;
import com.google.api.AuthRequirement$Builder;
import com.google.api.AuthRequirementOrBuilder;
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

public final class AuthRequirement
extends GeneratedMessageLite
implements AuthRequirementOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 2;
    private static final AuthRequirement DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    private String audiences_;
    private String providerId_;

    static {
        AuthRequirement authRequirement;
        DEFAULT_INSTANCE = authRequirement = new AuthRequirement();
        GeneratedMessageLite.registerDefaultInstance(AuthRequirement.class, authRequirement);
    }

    private AuthRequirement() {
        String string2;
        this.providerId_ = string2 = "";
        this.audiences_ = string2;
    }

    public static /* synthetic */ AuthRequirement access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(AuthRequirement authRequirement, String string2) {
        authRequirement.setProviderId(string2);
    }

    public static /* synthetic */ void access$200(AuthRequirement authRequirement) {
        authRequirement.clearProviderId();
    }

    public static /* synthetic */ void access$300(AuthRequirement authRequirement, ByteString byteString) {
        authRequirement.setProviderIdBytes(byteString);
    }

    public static /* synthetic */ void access$400(AuthRequirement authRequirement, String string2) {
        authRequirement.setAudiences(string2);
    }

    public static /* synthetic */ void access$500(AuthRequirement authRequirement) {
        authRequirement.clearAudiences();
    }

    public static /* synthetic */ void access$600(AuthRequirement authRequirement, ByteString byteString) {
        authRequirement.setAudiencesBytes(byteString);
    }

    private void clearAudiences() {
        String string2;
        this.audiences_ = string2 = AuthRequirement.getDefaultInstance().getAudiences();
    }

    private void clearProviderId() {
        String string2;
        this.providerId_ = string2 = AuthRequirement.getDefaultInstance().getProviderId();
    }

    public static AuthRequirement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static AuthRequirement$Builder newBuilder() {
        return (AuthRequirement$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthRequirement$Builder newBuilder(AuthRequirement authRequirement) {
        return (AuthRequirement$Builder)DEFAULT_INSTANCE.createBuilder(authRequirement);
    }

    public static AuthRequirement parseDelimitedFrom(InputStream inputStream) {
        return (AuthRequirement)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthRequirement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthRequirement)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(ByteString byteString) {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AuthRequirement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(CodedInputStream codedInputStream) {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuthRequirement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(InputStream inputStream) {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AuthRequirement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(ByteBuffer byteBuffer) {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuthRequirement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(byte[] byArray) {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AuthRequirement parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAudiences(String string2) {
        string2.getClass();
        this.audiences_ = string2;
    }

    private void setAudiencesBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.audiences_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setProviderId(String string2) {
        string2.getClass();
        this.providerId_ = string2;
    }

    private void setProviderIdBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.providerId_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = AuthRequirement$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = AuthRequirement.class;
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
                object[0] = "providerId_";
                object[by2] = "audiences_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", object);
            }
            case 2: {
                return new AuthRequirement$Builder(null);
            }
            case 1: 
        }
        return new AuthRequirement();
    }

    public String getAudiences() {
        return this.audiences_;
    }

    public ByteString getAudiencesBytes() {
        return ByteString.copyFromUtf8(this.audiences_);
    }

    public String getProviderId() {
        return this.providerId_;
    }

    public ByteString getProviderIdBytes() {
        return ByteString.copyFromUtf8(this.providerId_);
    }
}

