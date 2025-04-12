/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.AuthProvider;
import com.google.api.AuthProviderOrBuilder;
import com.google.api.Authentication$1;
import com.google.api.Authentication$Builder;
import com.google.api.AuthenticationOrBuilder;
import com.google.api.AuthenticationRule;
import com.google.api.AuthenticationRuleOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Authentication
extends GeneratedMessageLite
implements AuthenticationOrBuilder {
    private static final Authentication DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private Internal$ProtobufList providers_;
    private Internal$ProtobufList rules_;

    static {
        Authentication authentication;
        DEFAULT_INSTANCE = authentication = new Authentication();
        GeneratedMessageLite.registerDefaultInstance(Authentication.class, authentication);
    }

    private Authentication() {
        Internal$ProtobufList internal$ProtobufList;
        this.rules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.providers_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Authentication access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Authentication authentication, int n3, AuthenticationRule authenticationRule) {
        authentication.setRules(n3, authenticationRule);
    }

    public static /* synthetic */ void access$1000(Authentication authentication, Iterable iterable) {
        authentication.addAllProviders(iterable);
    }

    public static /* synthetic */ void access$1100(Authentication authentication) {
        authentication.clearProviders();
    }

    public static /* synthetic */ void access$1200(Authentication authentication, int n3) {
        authentication.removeProviders(n3);
    }

    public static /* synthetic */ void access$200(Authentication authentication, AuthenticationRule authenticationRule) {
        authentication.addRules(authenticationRule);
    }

    public static /* synthetic */ void access$300(Authentication authentication, int n3, AuthenticationRule authenticationRule) {
        authentication.addRules(n3, authenticationRule);
    }

    public static /* synthetic */ void access$400(Authentication authentication, Iterable iterable) {
        authentication.addAllRules(iterable);
    }

    public static /* synthetic */ void access$500(Authentication authentication) {
        authentication.clearRules();
    }

    public static /* synthetic */ void access$600(Authentication authentication, int n3) {
        authentication.removeRules(n3);
    }

    public static /* synthetic */ void access$700(Authentication authentication, int n3, AuthProvider authProvider) {
        authentication.setProviders(n3, authProvider);
    }

    public static /* synthetic */ void access$800(Authentication authentication, AuthProvider authProvider) {
        authentication.addProviders(authProvider);
    }

    public static /* synthetic */ void access$900(Authentication authentication, int n3, AuthProvider authProvider) {
        authentication.addProviders(n3, authProvider);
    }

    private void addAllProviders(Iterable iterable) {
        this.ensureProvidersIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.providers_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllRules(Iterable iterable) {
        this.ensureRulesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.rules_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addProviders(int n3, AuthProvider authProvider) {
        authProvider.getClass();
        this.ensureProvidersIsMutable();
        this.providers_.add(n3, authProvider);
    }

    private void addProviders(AuthProvider authProvider) {
        authProvider.getClass();
        this.ensureProvidersIsMutable();
        this.providers_.add(authProvider);
    }

    private void addRules(int n3, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n3, authenticationRule);
    }

    private void addRules(AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(authenticationRule);
    }

    private void clearProviders() {
        Internal$ProtobufList internal$ProtobufList;
        this.providers_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRules() {
        Internal$ProtobufList internal$ProtobufList;
        this.rules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureProvidersIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.providers_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.providers_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureRulesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.rules_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.rules_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Authentication getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Authentication$Builder newBuilder() {
        return (Authentication$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Authentication$Builder newBuilder(Authentication authentication) {
        return (Authentication$Builder)DEFAULT_INSTANCE.createBuilder(authentication);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream) {
        return (Authentication)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Authentication)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Authentication parseFrom(ByteString byteString) {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Authentication parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Authentication parseFrom(CodedInputStream codedInputStream) {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Authentication parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Authentication parseFrom(InputStream inputStream) {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Authentication parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer) {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Authentication parseFrom(byte[] byArray) {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Authentication parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeProviders(int n3) {
        this.ensureProvidersIsMutable();
        this.providers_.remove(n3);
    }

    private void removeRules(int n3) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n3);
    }

    private void setProviders(int n3, AuthProvider authProvider) {
        authProvider.getClass();
        this.ensureProvidersIsMutable();
        this.providers_.set(n3, authProvider);
    }

    private void setRules(int n3, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n3, authenticationRule);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Authentication$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Authentication.class;
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
                objectArray[0] = "rules_";
                objectArray[by2] = AuthenticationRule.class;
                objectArray[2] = "providers_";
                objectArray[3] = AuthProvider.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", objectArray);
            }
            case 2: {
                return new Authentication$Builder(null);
            }
            case 1: 
        }
        return new Authentication();
    }

    public AuthProvider getProviders(int n3) {
        return (AuthProvider)this.providers_.get(n3);
    }

    public int getProvidersCount() {
        return this.providers_.size();
    }

    public List getProvidersList() {
        return this.providers_;
    }

    public AuthProviderOrBuilder getProvidersOrBuilder(int n3) {
        return (AuthProviderOrBuilder)this.providers_.get(n3);
    }

    public List getProvidersOrBuilderList() {
        return this.providers_;
    }

    public AuthenticationRule getRules(int n3) {
        return (AuthenticationRule)this.rules_.get(n3);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List getRulesList() {
        return this.rules_;
    }

    public AuthenticationRuleOrBuilder getRulesOrBuilder(int n3) {
        return (AuthenticationRuleOrBuilder)this.rules_.get(n3);
    }

    public List getRulesOrBuilderList() {
        return this.rules_;
    }
}

