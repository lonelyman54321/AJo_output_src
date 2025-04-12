/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Backend$1;
import com.google.api.Backend$Builder;
import com.google.api.BackendOrBuilder;
import com.google.api.BackendRule;
import com.google.api.BackendRuleOrBuilder;
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

public final class Backend
extends GeneratedMessageLite
implements BackendOrBuilder {
    private static final Backend DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal$ProtobufList rules_;

    static {
        Backend backend;
        DEFAULT_INSTANCE = backend = new Backend();
        GeneratedMessageLite.registerDefaultInstance(Backend.class, backend);
    }

    private Backend() {
        Internal$ProtobufList internal$ProtobufList;
        this.rules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Backend access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Backend backend, int n3, BackendRule backendRule) {
        backend.setRules(n3, backendRule);
    }

    public static /* synthetic */ void access$200(Backend backend, BackendRule backendRule) {
        backend.addRules(backendRule);
    }

    public static /* synthetic */ void access$300(Backend backend, int n3, BackendRule backendRule) {
        backend.addRules(n3, backendRule);
    }

    public static /* synthetic */ void access$400(Backend backend, Iterable iterable) {
        backend.addAllRules(iterable);
    }

    public static /* synthetic */ void access$500(Backend backend) {
        backend.clearRules();
    }

    public static /* synthetic */ void access$600(Backend backend, int n3) {
        backend.removeRules(n3);
    }

    private void addAllRules(Iterable iterable) {
        this.ensureRulesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.rules_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addRules(int n3, BackendRule backendRule) {
        backendRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n3, backendRule);
    }

    private void addRules(BackendRule backendRule) {
        backendRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(backendRule);
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

    public static Backend getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Backend$Builder newBuilder() {
        return (Backend$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Backend$Builder newBuilder(Backend backend) {
        return (Backend$Builder)DEFAULT_INSTANCE.createBuilder(backend);
    }

    public static Backend parseDelimitedFrom(InputStream inputStream) {
        return (Backend)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Backend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Backend)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Backend parseFrom(ByteString byteString) {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Backend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Backend parseFrom(CodedInputStream codedInputStream) {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Backend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Backend parseFrom(InputStream inputStream) {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Backend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Backend parseFrom(ByteBuffer byteBuffer) {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Backend parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Backend parseFrom(byte[] byArray) {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Backend parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n3) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n3);
    }

    private void setRules(int n3, BackendRule backendRule) {
        backendRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n3, backendRule);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Backend$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Backend.class;
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
                object[by2] = BackendRule.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 2: {
                return new Backend$Builder(null);
            }
            case 1: 
        }
        return new Backend();
    }

    public BackendRule getRules(int n3) {
        return (BackendRule)this.rules_.get(n3);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List getRulesList() {
        return this.rules_;
    }

    public BackendRuleOrBuilder getRulesOrBuilder(int n3) {
        return (BackendRuleOrBuilder)this.rules_.get(n3);
    }

    public List getRulesOrBuilderList() {
        return this.rules_;
    }
}

