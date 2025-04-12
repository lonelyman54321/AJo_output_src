/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.SystemParameter;
import com.google.api.SystemParameterOrBuilder;
import com.google.api.SystemParameterRule$1;
import com.google.api.SystemParameterRule$Builder;
import com.google.api.SystemParameterRuleOrBuilder;
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

public final class SystemParameterRule
extends GeneratedMessageLite
implements SystemParameterRuleOrBuilder {
    private static final SystemParameterRule DEFAULT_INSTANCE;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Internal$ProtobufList parameters_;
    private String selector_ = "";

    static {
        SystemParameterRule systemParameterRule;
        DEFAULT_INSTANCE = systemParameterRule = new SystemParameterRule();
        GeneratedMessageLite.registerDefaultInstance(SystemParameterRule.class, systemParameterRule);
    }

    private SystemParameterRule() {
        Internal$ProtobufList internal$ProtobufList;
        this.parameters_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ SystemParameterRule access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(SystemParameterRule systemParameterRule, String string2) {
        systemParameterRule.setSelector(string2);
    }

    public static /* synthetic */ void access$200(SystemParameterRule systemParameterRule) {
        systemParameterRule.clearSelector();
    }

    public static /* synthetic */ void access$300(SystemParameterRule systemParameterRule, ByteString byteString) {
        systemParameterRule.setSelectorBytes(byteString);
    }

    public static /* synthetic */ void access$400(SystemParameterRule systemParameterRule, int n3, SystemParameter systemParameter) {
        systemParameterRule.setParameters(n3, systemParameter);
    }

    public static /* synthetic */ void access$500(SystemParameterRule systemParameterRule, SystemParameter systemParameter) {
        systemParameterRule.addParameters(systemParameter);
    }

    public static /* synthetic */ void access$600(SystemParameterRule systemParameterRule, int n3, SystemParameter systemParameter) {
        systemParameterRule.addParameters(n3, systemParameter);
    }

    public static /* synthetic */ void access$700(SystemParameterRule systemParameterRule, Iterable iterable) {
        systemParameterRule.addAllParameters(iterable);
    }

    public static /* synthetic */ void access$800(SystemParameterRule systemParameterRule) {
        systemParameterRule.clearParameters();
    }

    public static /* synthetic */ void access$900(SystemParameterRule systemParameterRule, int n3) {
        systemParameterRule.removeParameters(n3);
    }

    private void addAllParameters(Iterable iterable) {
        this.ensureParametersIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.parameters_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addParameters(int n3, SystemParameter systemParameter) {
        systemParameter.getClass();
        this.ensureParametersIsMutable();
        this.parameters_.add(n3, systemParameter);
    }

    private void addParameters(SystemParameter systemParameter) {
        systemParameter.getClass();
        this.ensureParametersIsMutable();
        this.parameters_.add(systemParameter);
    }

    private void clearParameters() {
        Internal$ProtobufList internal$ProtobufList;
        this.parameters_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSelector() {
        String string2;
        this.selector_ = string2 = SystemParameterRule.getDefaultInstance().getSelector();
    }

    private void ensureParametersIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.parameters_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.parameters_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static SystemParameterRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static SystemParameterRule$Builder newBuilder() {
        return (SystemParameterRule$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static SystemParameterRule$Builder newBuilder(SystemParameterRule systemParameterRule) {
        return (SystemParameterRule$Builder)DEFAULT_INSTANCE.createBuilder(systemParameterRule);
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream) {
        return (SystemParameterRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameterRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(ByteString byteString) {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static SystemParameterRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(CodedInputStream codedInputStream) {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static SystemParameterRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream) {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer) {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(byte[] byArray) {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static SystemParameterRule parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeParameters(int n3) {
        this.ensureParametersIsMutable();
        this.parameters_.remove(n3);
    }

    private void setParameters(int n3, SystemParameter systemParameter) {
        systemParameter.getClass();
        this.ensureParametersIsMutable();
        this.parameters_.set(n3, systemParameter);
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
        object = SystemParameterRule$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = SystemParameterRule.class;
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
                objectArray[0] = "selector_";
                objectArray[by2] = "parameters_";
                objectArray[2] = SystemParameter.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", objectArray);
            }
            case 2: {
                return new SystemParameterRule$Builder(null);
            }
            case 1: 
        }
        return new SystemParameterRule();
    }

    public SystemParameter getParameters(int n3) {
        return (SystemParameter)this.parameters_.get(n3);
    }

    public int getParametersCount() {
        return this.parameters_.size();
    }

    public List getParametersList() {
        return this.parameters_;
    }

    public SystemParameterOrBuilder getParametersOrBuilder(int n3) {
        return (SystemParameterOrBuilder)this.parameters_.get(n3);
    }

    public List getParametersOrBuilderList() {
        return this.parameters_;
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8(this.selector_);
    }
}

