/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.BackendRule$1;
import com.google.api.BackendRule$AuthenticationCase;
import com.google.api.BackendRule$Builder;
import com.google.api.BackendRule$PathTranslation;
import com.google.api.BackendRuleOrBuilder;
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

public final class BackendRule
extends GeneratedMessageLite
implements BackendRuleOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    private static final BackendRule DEFAULT_INSTANCE;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile Parser PARSER;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String address_;
    private int authenticationCase_ = 0;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private String protocol_;
    private String selector_;

    static {
        BackendRule backendRule;
        DEFAULT_INSTANCE = backendRule = new BackendRule();
        GeneratedMessageLite.registerDefaultInstance(BackendRule.class, backendRule);
    }

    private BackendRule() {
        String string2;
        this.selector_ = string2 = "";
        this.address_ = string2;
        this.protocol_ = string2;
    }

    public static /* synthetic */ BackendRule access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(BackendRule backendRule) {
        backendRule.clearAuthentication();
    }

    public static /* synthetic */ void access$1000(BackendRule backendRule, double d2) {
        backendRule.setMinDeadline(d2);
    }

    public static /* synthetic */ void access$1100(BackendRule backendRule) {
        backendRule.clearMinDeadline();
    }

    public static /* synthetic */ void access$1200(BackendRule backendRule, double d2) {
        backendRule.setOperationDeadline(d2);
    }

    public static /* synthetic */ void access$1300(BackendRule backendRule) {
        backendRule.clearOperationDeadline();
    }

    public static /* synthetic */ void access$1400(BackendRule backendRule, int n3) {
        backendRule.setPathTranslationValue(n3);
    }

    public static /* synthetic */ void access$1500(BackendRule backendRule, BackendRule$PathTranslation backendRule$PathTranslation) {
        backendRule.setPathTranslation(backendRule$PathTranslation);
    }

    public static /* synthetic */ void access$1600(BackendRule backendRule) {
        backendRule.clearPathTranslation();
    }

    public static /* synthetic */ void access$1700(BackendRule backendRule, String string2) {
        backendRule.setJwtAudience(string2);
    }

    public static /* synthetic */ void access$1800(BackendRule backendRule) {
        backendRule.clearJwtAudience();
    }

    public static /* synthetic */ void access$1900(BackendRule backendRule, ByteString byteString) {
        backendRule.setJwtAudienceBytes(byteString);
    }

    public static /* synthetic */ void access$200(BackendRule backendRule, String string2) {
        backendRule.setSelector(string2);
    }

    public static /* synthetic */ void access$2000(BackendRule backendRule, boolean bl2) {
        backendRule.setDisableAuth(bl2);
    }

    public static /* synthetic */ void access$2100(BackendRule backendRule) {
        backendRule.clearDisableAuth();
    }

    public static /* synthetic */ void access$2200(BackendRule backendRule, String string2) {
        backendRule.setProtocol(string2);
    }

    public static /* synthetic */ void access$2300(BackendRule backendRule) {
        backendRule.clearProtocol();
    }

    public static /* synthetic */ void access$2400(BackendRule backendRule, ByteString byteString) {
        backendRule.setProtocolBytes(byteString);
    }

    public static /* synthetic */ void access$300(BackendRule backendRule) {
        backendRule.clearSelector();
    }

    public static /* synthetic */ void access$400(BackendRule backendRule, ByteString byteString) {
        backendRule.setSelectorBytes(byteString);
    }

    public static /* synthetic */ void access$500(BackendRule backendRule, String string2) {
        backendRule.setAddress(string2);
    }

    public static /* synthetic */ void access$600(BackendRule backendRule) {
        backendRule.clearAddress();
    }

    public static /* synthetic */ void access$700(BackendRule backendRule, ByteString byteString) {
        backendRule.setAddressBytes(byteString);
    }

    public static /* synthetic */ void access$800(BackendRule backendRule, double d2) {
        backendRule.setDeadline(d2);
    }

    public static /* synthetic */ void access$900(BackendRule backendRule) {
        backendRule.clearDeadline();
    }

    private void clearAddress() {
        String string2;
        this.address_ = string2 = BackendRule.getDefaultInstance().getAddress();
    }

    private void clearAuthentication() {
        this.authenticationCase_ = 0;
        this.authentication_ = null;
    }

    private void clearDeadline() {
        this.deadline_ = 0.0;
    }

    private void clearDisableAuth() {
        int n3 = this.authenticationCase_;
        int n4 = 8;
        if (n3 == n4) {
            this.authenticationCase_ = 0;
            n3 = 0;
            this.authentication_ = null;
        }
    }

    private void clearJwtAudience() {
        int n3 = this.authenticationCase_;
        int n4 = 7;
        if (n3 == n4) {
            this.authenticationCase_ = 0;
            n3 = 0;
            this.authentication_ = null;
        }
    }

    private void clearMinDeadline() {
        this.minDeadline_ = 0.0;
    }

    private void clearOperationDeadline() {
        this.operationDeadline_ = 0.0;
    }

    private void clearPathTranslation() {
        this.pathTranslation_ = 0;
    }

    private void clearProtocol() {
        String string2;
        this.protocol_ = string2 = BackendRule.getDefaultInstance().getProtocol();
    }

    private void clearSelector() {
        String string2;
        this.selector_ = string2 = BackendRule.getDefaultInstance().getSelector();
    }

    public static BackendRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static BackendRule$Builder newBuilder() {
        return (BackendRule$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static BackendRule$Builder newBuilder(BackendRule backendRule) {
        return (BackendRule$Builder)DEFAULT_INSTANCE.createBuilder(backendRule);
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream) {
        return (BackendRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BackendRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BackendRule parseFrom(ByteString byteString) {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static BackendRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BackendRule parseFrom(CodedInputStream codedInputStream) {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static BackendRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static BackendRule parseFrom(InputStream inputStream) {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static BackendRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer) {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BackendRule parseFrom(byte[] byArray) {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static BackendRule parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAddress(String string2) {
        string2.getClass();
        this.address_ = string2;
    }

    private void setAddressBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.address_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setDeadline(double d2) {
        this.deadline_ = d2;
    }

    private void setDisableAuth(boolean bl2) {
        this.authenticationCase_ = 8;
        Boolean bl3 = bl2;
        this.authentication_ = bl3;
    }

    private void setJwtAudience(String string2) {
        string2.getClass();
        this.authenticationCase_ = 7;
        this.authentication_ = string2;
    }

    private void setJwtAudienceBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.authentication_ = object = ((ByteString)object).toStringUtf8();
        this.authenticationCase_ = 7;
    }

    private void setMinDeadline(double d2) {
        this.minDeadline_ = d2;
    }

    private void setOperationDeadline(double d2) {
        this.operationDeadline_ = d2;
    }

    private void setPathTranslation(BackendRule$PathTranslation backendRule$PathTranslation) {
        int n3;
        this.pathTranslation_ = n3 = backendRule$PathTranslation.getNumber();
    }

    private void setPathTranslationValue(int n3) {
        this.pathTranslation_ = n3;
    }

    private void setProtocol(String string2) {
        string2.getClass();
        this.protocol_ = string2;
    }

    private void setProtocolBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.protocol_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setSelector(String string2) {
        string2.getClass();
        this.selector_ = string2;
    }

    private void setSelectorBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.selector_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = BackendRule$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = BackendRule.class;
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
                objectArray = new Object[9];
                objectArray[0] = "authentication_";
                objectArray[by2] = "authenticationCase_";
                objectArray[2] = "selector_";
                objectArray[3] = "address_";
                objectArray[4] = "deadline_";
                objectArray[5] = "minDeadline_";
                objectArray[6] = "operationDeadline_";
                objectArray[7] = "pathTranslation_";
                objectArray[8] = "protocol_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0000\u0004\u0000\u0005\u0000\u0006\f\u0007\u023b\u0000\b:\u0000\t\u0208", objectArray);
            }
            case 2: {
                return new BackendRule$Builder(null);
            }
            case 1: 
        }
        return new BackendRule();
    }

    public String getAddress() {
        return this.address_;
    }

    public ByteString getAddressBytes() {
        return ByteString.copyFromUtf8(this.address_);
    }

    public BackendRule$AuthenticationCase getAuthenticationCase() {
        return BackendRule$AuthenticationCase.forNumber(this.authenticationCase_);
    }

    public double getDeadline() {
        return this.deadline_;
    }

    public boolean getDisableAuth() {
        int n3 = this.authenticationCase_;
        int n4 = 8;
        if (n3 == n4) {
            return (Boolean)this.authentication_;
        }
        return false;
    }

    public String getJwtAudience() {
        int n3 = this.authenticationCase_;
        int n4 = 7;
        String string2 = n3 == n4 ? (String)this.authentication_ : "";
        return string2;
    }

    public ByteString getJwtAudienceBytes() {
        int n3 = this.authenticationCase_;
        int n4 = 7;
        String string2 = n3 == n4 ? (String)this.authentication_ : "";
        return ByteString.copyFromUtf8(string2);
    }

    public double getMinDeadline() {
        return this.minDeadline_;
    }

    public double getOperationDeadline() {
        return this.operationDeadline_;
    }

    public BackendRule$PathTranslation getPathTranslation() {
        int n3 = this.pathTranslation_;
        BackendRule$PathTranslation backendRule$PathTranslation = BackendRule$PathTranslation.forNumber(n3);
        if (backendRule$PathTranslation == null) {
            backendRule$PathTranslation = BackendRule$PathTranslation.UNRECOGNIZED;
        }
        return backendRule$PathTranslation;
    }

    public int getPathTranslationValue() {
        return this.pathTranslation_;
    }

    public String getProtocol() {
        return this.protocol_;
    }

    public ByteString getProtocolBytes() {
        return ByteString.copyFromUtf8(this.protocol_);
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8(this.selector_);
    }
}

