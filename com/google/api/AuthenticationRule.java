/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.AuthRequirement;
import com.google.api.AuthRequirementOrBuilder;
import com.google.api.AuthenticationRule$1;
import com.google.api.AuthenticationRule$Builder;
import com.google.api.AuthenticationRuleOrBuilder;
import com.google.api.OAuthRequirements;
import com.google.api.OAuthRequirements$Builder;
import com.google.api.OAuthRequirementsOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class AuthenticationRule
extends GeneratedMessageLite
implements AuthenticationRuleOrBuilder {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    private static final AuthenticationRule DEFAULT_INSTANCE;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private OAuthRequirements oauth_;
    private Internal$ProtobufList requirements_;
    private String selector_ = "";

    static {
        AuthenticationRule authenticationRule;
        DEFAULT_INSTANCE = authenticationRule = new AuthenticationRule();
        GeneratedMessageLite.registerDefaultInstance(AuthenticationRule.class, authenticationRule);
    }

    private AuthenticationRule() {
        Internal$ProtobufList internal$ProtobufList;
        this.requirements_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ AuthenticationRule access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(AuthenticationRule authenticationRule, String string2) {
        authenticationRule.setSelector(string2);
    }

    public static /* synthetic */ void access$1000(AuthenticationRule authenticationRule, AuthRequirement authRequirement) {
        authenticationRule.addRequirements(authRequirement);
    }

    public static /* synthetic */ void access$1100(AuthenticationRule authenticationRule, int n3, AuthRequirement authRequirement) {
        authenticationRule.addRequirements(n3, authRequirement);
    }

    public static /* synthetic */ void access$1200(AuthenticationRule authenticationRule, Iterable iterable) {
        authenticationRule.addAllRequirements(iterable);
    }

    public static /* synthetic */ void access$1300(AuthenticationRule authenticationRule) {
        authenticationRule.clearRequirements();
    }

    public static /* synthetic */ void access$1400(AuthenticationRule authenticationRule, int n3) {
        authenticationRule.removeRequirements(n3);
    }

    public static /* synthetic */ void access$200(AuthenticationRule authenticationRule) {
        authenticationRule.clearSelector();
    }

    public static /* synthetic */ void access$300(AuthenticationRule authenticationRule, ByteString byteString) {
        authenticationRule.setSelectorBytes(byteString);
    }

    public static /* synthetic */ void access$400(AuthenticationRule authenticationRule, OAuthRequirements oAuthRequirements) {
        authenticationRule.setOauth(oAuthRequirements);
    }

    public static /* synthetic */ void access$500(AuthenticationRule authenticationRule, OAuthRequirements oAuthRequirements) {
        authenticationRule.mergeOauth(oAuthRequirements);
    }

    public static /* synthetic */ void access$600(AuthenticationRule authenticationRule) {
        authenticationRule.clearOauth();
    }

    public static /* synthetic */ void access$700(AuthenticationRule authenticationRule, boolean bl2) {
        authenticationRule.setAllowWithoutCredential(bl2);
    }

    public static /* synthetic */ void access$800(AuthenticationRule authenticationRule) {
        authenticationRule.clearAllowWithoutCredential();
    }

    public static /* synthetic */ void access$900(AuthenticationRule authenticationRule, int n3, AuthRequirement authRequirement) {
        authenticationRule.setRequirements(n3, authRequirement);
    }

    private void addAllRequirements(Iterable iterable) {
        this.ensureRequirementsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.requirements_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addRequirements(int n3, AuthRequirement authRequirement) {
        authRequirement.getClass();
        this.ensureRequirementsIsMutable();
        this.requirements_.add(n3, authRequirement);
    }

    private void addRequirements(AuthRequirement authRequirement) {
        authRequirement.getClass();
        this.ensureRequirementsIsMutable();
        this.requirements_.add(authRequirement);
    }

    private void clearAllowWithoutCredential() {
        this.allowWithoutCredential_ = false;
    }

    private void clearOauth() {
        this.oauth_ = null;
    }

    private void clearRequirements() {
        Internal$ProtobufList internal$ProtobufList;
        this.requirements_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSelector() {
        String string2;
        this.selector_ = string2 = AuthenticationRule.getDefaultInstance().getSelector();
    }

    private void ensureRequirementsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.requirements_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.requirements_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static AuthenticationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOauth(OAuthRequirements oAuthRequirements) {
        OAuthRequirements oAuthRequirements2;
        oAuthRequirements.getClass();
        OAuthRequirementsOrBuilder oAuthRequirementsOrBuilder = this.oauth_;
        if (oAuthRequirementsOrBuilder != null && oAuthRequirementsOrBuilder != (oAuthRequirements2 = OAuthRequirements.getDefaultInstance())) {
            oAuthRequirementsOrBuilder = OAuthRequirements.newBuilder(this.oauth_);
            this.oauth_ = oAuthRequirements = (OAuthRequirements)((OAuthRequirements$Builder)((GeneratedMessageLite$Builder)((Object)oAuthRequirementsOrBuilder)).mergeFrom(oAuthRequirements)).buildPartial();
        } else {
            this.oauth_ = oAuthRequirements;
        }
    }

    public static AuthenticationRule$Builder newBuilder() {
        return (AuthenticationRule$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthenticationRule$Builder newBuilder(AuthenticationRule authenticationRule) {
        return (AuthenticationRule$Builder)DEFAULT_INSTANCE.createBuilder(authenticationRule);
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream) {
        return (AuthenticationRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthenticationRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(ByteString byteString) {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AuthenticationRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(CodedInputStream codedInputStream) {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuthenticationRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream) {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer) {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(byte[] byArray) {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AuthenticationRule parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRequirements(int n3) {
        this.ensureRequirementsIsMutable();
        this.requirements_.remove(n3);
    }

    private void setAllowWithoutCredential(boolean bl2) {
        this.allowWithoutCredential_ = bl2;
    }

    private void setOauth(OAuthRequirements oAuthRequirements) {
        oAuthRequirements.getClass();
        this.oauth_ = oAuthRequirements;
    }

    private void setRequirements(int n3, AuthRequirement authRequirement) {
        authRequirement.getClass();
        this.ensureRequirementsIsMutable();
        this.requirements_.set(n3, authRequirement);
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
        object = AuthenticationRule$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = AuthenticationRule.class;
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
                objectArray = new Object[5];
                objectArray[0] = "selector_";
                objectArray[by2] = "oauth_";
                objectArray[2] = "allowWithoutCredential_";
                objectArray[3] = "requirements_";
                objectArray[4] = AuthRequirement.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001\u0208\u0002\t\u0005\u0007\u0007\u001b", objectArray);
            }
            case 2: {
                return new AuthenticationRule$Builder(null);
            }
            case 1: 
        }
        return new AuthenticationRule();
    }

    public boolean getAllowWithoutCredential() {
        return this.allowWithoutCredential_;
    }

    public OAuthRequirements getOauth() {
        OAuthRequirements oAuthRequirements = this.oauth_;
        if (oAuthRequirements == null) {
            oAuthRequirements = OAuthRequirements.getDefaultInstance();
        }
        return oAuthRequirements;
    }

    public AuthRequirement getRequirements(int n3) {
        return (AuthRequirement)this.requirements_.get(n3);
    }

    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    public List getRequirementsList() {
        return this.requirements_;
    }

    public AuthRequirementOrBuilder getRequirementsOrBuilder(int n3) {
        return (AuthRequirementOrBuilder)this.requirements_.get(n3);
    }

    public List getRequirementsOrBuilderList() {
        return this.requirements_;
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8(this.selector_);
    }

    public boolean hasOauth() {
        boolean bl2;
        OAuthRequirements oAuthRequirements = this.oauth_;
        if (oAuthRequirements != null) {
            bl2 = true;
        } else {
            bl2 = false;
            oAuthRequirements = null;
        }
        return bl2;
    }
}

