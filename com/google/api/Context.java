/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Context$1;
import com.google.api.Context$Builder;
import com.google.api.ContextOrBuilder;
import com.google.api.ContextRule;
import com.google.api.ContextRuleOrBuilder;
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

public final class Context
extends GeneratedMessageLite
implements ContextOrBuilder {
    private static final Context DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal$ProtobufList rules_;

    static {
        Context context;
        DEFAULT_INSTANCE = context = new Context();
        GeneratedMessageLite.registerDefaultInstance(Context.class, context);
    }

    private Context() {
        Internal$ProtobufList internal$ProtobufList;
        this.rules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Context access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Context context, int n3, ContextRule contextRule) {
        context.setRules(n3, contextRule);
    }

    public static /* synthetic */ void access$200(Context context, ContextRule contextRule) {
        context.addRules(contextRule);
    }

    public static /* synthetic */ void access$300(Context context, int n3, ContextRule contextRule) {
        context.addRules(n3, contextRule);
    }

    public static /* synthetic */ void access$400(Context context, Iterable iterable) {
        context.addAllRules(iterable);
    }

    public static /* synthetic */ void access$500(Context context) {
        context.clearRules();
    }

    public static /* synthetic */ void access$600(Context context, int n3) {
        context.removeRules(n3);
    }

    private void addAllRules(Iterable iterable) {
        this.ensureRulesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.rules_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addRules(int n3, ContextRule contextRule) {
        contextRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n3, contextRule);
    }

    private void addRules(ContextRule contextRule) {
        contextRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(contextRule);
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

    public static Context getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Context$Builder newBuilder() {
        return (Context$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Context$Builder newBuilder(Context context) {
        return (Context$Builder)DEFAULT_INSTANCE.createBuilder(context);
    }

    public static Context parseDelimitedFrom(InputStream inputStream) {
        return (Context)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Context parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Context)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Context parseFrom(ByteString byteString) {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Context parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Context parseFrom(CodedInputStream codedInputStream) {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Context parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Context parseFrom(InputStream inputStream) {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Context parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Context parseFrom(ByteBuffer byteBuffer) {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Context parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Context parseFrom(byte[] byArray) {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Context parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n3) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n3);
    }

    private void setRules(int n3, ContextRule contextRule) {
        contextRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n3, contextRule);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = Context$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Context.class;
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
                object[by2] = ContextRule.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", object);
            }
            case 2: {
                return new Context$Builder(null);
            }
            case 1: 
        }
        return new Context();
    }

    public ContextRule getRules(int n3) {
        return (ContextRule)this.rules_.get(n3);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List getRulesList() {
        return this.rules_;
    }

    public ContextRuleOrBuilder getRulesOrBuilder(int n3) {
        return (ContextRuleOrBuilder)this.rules_.get(n3);
    }

    public List getRulesOrBuilderList() {
        return this.rules_;
    }
}

