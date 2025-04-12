/*
 * Decompiled with CFR 0.152.
 */
package com.google.cloud.audit;

import com.google.cloud.audit.AuthenticationInfo$1;
import com.google.cloud.audit.AuthenticationInfo$Builder;
import com.google.cloud.audit.AuthenticationInfoOrBuilder;
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

public final class AuthenticationInfo
extends GeneratedMessageLite
implements AuthenticationInfoOrBuilder {
    private static final AuthenticationInfo DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int PRINCIPAL_EMAIL_FIELD_NUMBER = 1;
    private String principalEmail_ = "";

    static {
        AuthenticationInfo authenticationInfo;
        DEFAULT_INSTANCE = authenticationInfo = new AuthenticationInfo();
        GeneratedMessageLite.registerDefaultInstance(AuthenticationInfo.class, authenticationInfo);
    }

    private AuthenticationInfo() {
    }

    public static /* synthetic */ AuthenticationInfo access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(AuthenticationInfo authenticationInfo, String string2) {
        authenticationInfo.setPrincipalEmail(string2);
    }

    public static /* synthetic */ void access$200(AuthenticationInfo authenticationInfo) {
        authenticationInfo.clearPrincipalEmail();
    }

    public static /* synthetic */ void access$300(AuthenticationInfo authenticationInfo, ByteString byteString) {
        authenticationInfo.setPrincipalEmailBytes(byteString);
    }

    private void clearPrincipalEmail() {
        String string2;
        this.principalEmail_ = string2 = AuthenticationInfo.getDefaultInstance().getPrincipalEmail();
    }

    public static AuthenticationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static AuthenticationInfo$Builder newBuilder() {
        return (AuthenticationInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthenticationInfo$Builder newBuilder(AuthenticationInfo authenticationInfo) {
        return (AuthenticationInfo$Builder)DEFAULT_INSTANCE.createBuilder(authenticationInfo);
    }

    public static AuthenticationInfo parseDelimitedFrom(InputStream inputStream) {
        return (AuthenticationInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthenticationInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthenticationInfo parseFrom(ByteString byteString) {
        return (AuthenticationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AuthenticationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthenticationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuthenticationInfo parseFrom(CodedInputStream codedInputStream) {
        return (AuthenticationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuthenticationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthenticationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AuthenticationInfo parseFrom(InputStream inputStream) {
        return (AuthenticationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthenticationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthenticationInfo parseFrom(ByteBuffer byteBuffer) {
        return (AuthenticationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuthenticationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthenticationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AuthenticationInfo parseFrom(byte[] byArray) {
        return (AuthenticationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AuthenticationInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthenticationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPrincipalEmail(String string2) {
        string2.getClass();
        this.principalEmail_ = string2;
    }

    private void setPrincipalEmailBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.principalEmail_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = AuthenticationInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = AuthenticationInfo.class;
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
                object[0] = "principalEmail_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", object);
            }
            case 2: {
                return new AuthenticationInfo$Builder(null);
            }
            case 1: 
        }
        return new AuthenticationInfo();
    }

    public String getPrincipalEmail() {
        return this.principalEmail_;
    }

    public ByteString getPrincipalEmailBytes() {
        return ByteString.copyFromUtf8(this.principalEmail_);
    }
}

