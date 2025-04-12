/*
 * Decompiled with CFR 0.152.
 */
package com.google.cloud.audit;

import com.google.cloud.audit.AuthorizationInfo$1;
import com.google.cloud.audit.AuthorizationInfo$Builder;
import com.google.cloud.audit.AuthorizationInfoOrBuilder;
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

public final class AuthorizationInfo
extends GeneratedMessageLite
implements AuthorizationInfoOrBuilder {
    private static final AuthorizationInfo DEFAULT_INSTANCE;
    public static final int GRANTED_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private boolean granted_;
    private String permission_;
    private String resource_;

    static {
        AuthorizationInfo authorizationInfo;
        DEFAULT_INSTANCE = authorizationInfo = new AuthorizationInfo();
        GeneratedMessageLite.registerDefaultInstance(AuthorizationInfo.class, authorizationInfo);
    }

    private AuthorizationInfo() {
        String string2;
        this.resource_ = string2 = "";
        this.permission_ = string2;
    }

    public static /* synthetic */ AuthorizationInfo access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(AuthorizationInfo authorizationInfo, String string2) {
        authorizationInfo.setResource(string2);
    }

    public static /* synthetic */ void access$200(AuthorizationInfo authorizationInfo) {
        authorizationInfo.clearResource();
    }

    public static /* synthetic */ void access$300(AuthorizationInfo authorizationInfo, ByteString byteString) {
        authorizationInfo.setResourceBytes(byteString);
    }

    public static /* synthetic */ void access$400(AuthorizationInfo authorizationInfo, String string2) {
        authorizationInfo.setPermission(string2);
    }

    public static /* synthetic */ void access$500(AuthorizationInfo authorizationInfo) {
        authorizationInfo.clearPermission();
    }

    public static /* synthetic */ void access$600(AuthorizationInfo authorizationInfo, ByteString byteString) {
        authorizationInfo.setPermissionBytes(byteString);
    }

    public static /* synthetic */ void access$700(AuthorizationInfo authorizationInfo, boolean bl2) {
        authorizationInfo.setGranted(bl2);
    }

    public static /* synthetic */ void access$800(AuthorizationInfo authorizationInfo) {
        authorizationInfo.clearGranted();
    }

    private void clearGranted() {
        this.granted_ = false;
    }

    private void clearPermission() {
        String string2;
        this.permission_ = string2 = AuthorizationInfo.getDefaultInstance().getPermission();
    }

    private void clearResource() {
        String string2;
        this.resource_ = string2 = AuthorizationInfo.getDefaultInstance().getResource();
    }

    public static AuthorizationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static AuthorizationInfo$Builder newBuilder() {
        return (AuthorizationInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthorizationInfo$Builder newBuilder(AuthorizationInfo authorizationInfo) {
        return (AuthorizationInfo$Builder)DEFAULT_INSTANCE.createBuilder(authorizationInfo);
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream) {
        return (AuthorizationInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(ByteString byteString) {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AuthorizationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(CodedInputStream codedInputStream) {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuthorizationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream) {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer) {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(byte[] byArray) {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AuthorizationInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setGranted(boolean bl2) {
        this.granted_ = bl2;
    }

    private void setPermission(String string2) {
        string2.getClass();
        this.permission_ = string2;
    }

    private void setPermissionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.permission_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setResource(String string2) {
        string2.getClass();
        this.resource_ = string2;
    }

    private void setResourceBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.resource_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = AuthorizationInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = AuthorizationInfo.class;
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
                objectArray[0] = "resource_";
                objectArray[by2] = "permission_";
                objectArray[2] = "granted_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0007", objectArray);
            }
            case 2: {
                return new AuthorizationInfo$Builder(null);
            }
            case 1: 
        }
        return new AuthorizationInfo();
    }

    public boolean getGranted() {
        return this.granted_;
    }

    public String getPermission() {
        return this.permission_;
    }

    public ByteString getPermissionBytes() {
        return ByteString.copyFromUtf8(this.permission_);
    }

    public String getResource() {
        return this.resource_;
    }

    public ByteString getResourceBytes() {
        return ByteString.copyFromUtf8(this.resource_);
    }
}

