/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Http$1;
import com.google.api.Http$Builder;
import com.google.api.HttpOrBuilder;
import com.google.api.HttpRule;
import com.google.api.HttpRuleOrBuilder;
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

public final class Http
extends GeneratedMessageLite
implements HttpOrBuilder {
    private static final Http DEFAULT_INSTANCE;
    public static final int FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int RULES_FIELD_NUMBER = 1;
    private boolean fullyDecodeReservedExpansion_;
    private Internal$ProtobufList rules_;

    static {
        Http http;
        DEFAULT_INSTANCE = http = new Http();
        GeneratedMessageLite.registerDefaultInstance(Http.class, http);
    }

    private Http() {
        Internal$ProtobufList internal$ProtobufList;
        this.rules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Http access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Http http, int n3, HttpRule httpRule) {
        http.setRules(n3, httpRule);
    }

    public static /* synthetic */ void access$200(Http http, HttpRule httpRule) {
        http.addRules(httpRule);
    }

    public static /* synthetic */ void access$300(Http http, int n3, HttpRule httpRule) {
        http.addRules(n3, httpRule);
    }

    public static /* synthetic */ void access$400(Http http, Iterable iterable) {
        http.addAllRules(iterable);
    }

    public static /* synthetic */ void access$500(Http http) {
        http.clearRules();
    }

    public static /* synthetic */ void access$600(Http http, int n3) {
        http.removeRules(n3);
    }

    public static /* synthetic */ void access$700(Http http, boolean bl2) {
        http.setFullyDecodeReservedExpansion(bl2);
    }

    public static /* synthetic */ void access$800(Http http) {
        http.clearFullyDecodeReservedExpansion();
    }

    private void addAllRules(Iterable iterable) {
        this.ensureRulesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.rules_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addRules(int n3, HttpRule httpRule) {
        httpRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n3, httpRule);
    }

    private void addRules(HttpRule httpRule) {
        httpRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(httpRule);
    }

    private void clearFullyDecodeReservedExpansion() {
        this.fullyDecodeReservedExpansion_ = false;
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

    public static Http getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Http$Builder newBuilder() {
        return (Http$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Http$Builder newBuilder(Http http) {
        return (Http$Builder)DEFAULT_INSTANCE.createBuilder(http);
    }

    public static Http parseDelimitedFrom(InputStream inputStream) {
        return (Http)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Http parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Http)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Http parseFrom(ByteString byteString) {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Http parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Http parseFrom(CodedInputStream codedInputStream) {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Http parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Http parseFrom(InputStream inputStream) {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Http parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Http parseFrom(ByteBuffer byteBuffer) {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Http parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Http parseFrom(byte[] byArray) {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Http parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n3) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n3);
    }

    private void setFullyDecodeReservedExpansion(boolean bl2) {
        this.fullyDecodeReservedExpansion_ = bl2;
    }

    private void setRules(int n3, HttpRule httpRule) {
        httpRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n3, httpRule);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Http$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Http.class;
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
                objectArray[0] = "rules_";
                objectArray[by2] = HttpRule.class;
                objectArray[2] = "fullyDecodeReservedExpansion_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", objectArray);
            }
            case 2: {
                return new Http$Builder(null);
            }
            case 1: 
        }
        return new Http();
    }

    public boolean getFullyDecodeReservedExpansion() {
        return this.fullyDecodeReservedExpansion_;
    }

    public HttpRule getRules(int n3) {
        return (HttpRule)this.rules_.get(n3);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List getRulesList() {
        return this.rules_;
    }

    public HttpRuleOrBuilder getRulesOrBuilder(int n3) {
        return (HttpRuleOrBuilder)this.rules_.get(n3);
    }

    public List getRulesOrBuilderList() {
        return this.rules_;
    }
}

