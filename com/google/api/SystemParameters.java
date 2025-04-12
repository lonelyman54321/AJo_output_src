/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.SystemParameterRule;
import com.google.api.SystemParameterRuleOrBuilder;
import com.google.api.SystemParameters$1;
import com.google.api.SystemParameters$Builder;
import com.google.api.SystemParametersOrBuilder;
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

public final class SystemParameters
extends GeneratedMessageLite
implements SystemParametersOrBuilder {
    private static final SystemParameters DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal$ProtobufList rules_;

    static {
        SystemParameters systemParameters;
        DEFAULT_INSTANCE = systemParameters = new SystemParameters();
        GeneratedMessageLite.registerDefaultInstance(SystemParameters.class, systemParameters);
    }

    private SystemParameters() {
        Internal$ProtobufList internal$ProtobufList;
        this.rules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ SystemParameters access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(SystemParameters systemParameters, int n3, SystemParameterRule systemParameterRule) {
        systemParameters.setRules(n3, systemParameterRule);
    }

    public static /* synthetic */ void access$200(SystemParameters systemParameters, SystemParameterRule systemParameterRule) {
        systemParameters.addRules(systemParameterRule);
    }

    public static /* synthetic */ void access$300(SystemParameters systemParameters, int n3, SystemParameterRule systemParameterRule) {
        systemParameters.addRules(n3, systemParameterRule);
    }

    public static /* synthetic */ void access$400(SystemParameters systemParameters, Iterable iterable) {
        systemParameters.addAllRules(iterable);
    }

    public static /* synthetic */ void access$500(SystemParameters systemParameters) {
        systemParameters.clearRules();
    }

    public static /* synthetic */ void access$600(SystemParameters systemParameters, int n3) {
        systemParameters.removeRules(n3);
    }

    private void addAllRules(Iterable iterable) {
        this.ensureRulesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.rules_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addRules(int n3, SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n3, systemParameterRule);
    }

    private void addRules(SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(systemParameterRule);
    }

    private void clearRules() {
        Internal$ProtobufList internal$ProtobufList;
        this.rules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.rules_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.rules_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static SystemParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static SystemParameters$Builder newBuilder() {
        return (SystemParameters$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemParameters$Builder newBuilder(SystemParameters systemParameters) {
        return (SystemParameters$Builder)DEFAULT_INSTANCE.createBuilder(systemParameters);
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream) {
        return (SystemParameters)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameters)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SystemParameters parseFrom(ByteString byteString) {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static SystemParameters parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SystemParameters parseFrom(CodedInputStream codedInputStream) {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static SystemParameters parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static SystemParameters parseFrom(InputStream inputStream) {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameters parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer) {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SystemParameters parseFrom(byte[] byArray) {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static SystemParameters parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n3) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n3);
    }

    private void setRules(int n3, SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n3, systemParameterRule);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = SystemParameters$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = SystemParameters.class;
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
                object[0] = "rules_";
                object[by2] = SystemParameterRule.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 2: {
                return new SystemParameters$Builder(null);
            }
            case 1: 
        }
        return new SystemParameters();
    }

    public SystemParameterRule getRules(int n3) {
        return (SystemParameterRule)this.rules_.get(n3);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List getRulesList() {
        return this.rules_;
    }

    public SystemParameterRuleOrBuilder getRulesOrBuilder(int n3) {
        return (SystemParameterRuleOrBuilder)this.rules_.get(n3);
    }

    public List getRulesOrBuilderList() {
        return this.rules_;
    }
}

