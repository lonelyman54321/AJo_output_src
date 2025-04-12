/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.ContextRule$1;
import com.google.api.ContextRule$Builder;
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

public final class ContextRule
extends GeneratedMessageLite
implements ContextRuleOrBuilder {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    private static final ContextRule DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Internal$ProtobufList allowedRequestExtensions_;
    private Internal$ProtobufList allowedResponseExtensions_;
    private Internal$ProtobufList provided_;
    private Internal$ProtobufList requested_;
    private String selector_ = "";

    static {
        ContextRule contextRule;
        DEFAULT_INSTANCE = contextRule = new ContextRule();
        GeneratedMessageLite.registerDefaultInstance(ContextRule.class, contextRule);
    }

    private ContextRule() {
        Internal$ProtobufList internal$ProtobufList;
        this.requested_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.provided_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.allowedRequestExtensions_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.allowedResponseExtensions_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ ContextRule access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(ContextRule contextRule, String string2) {
        contextRule.setSelector(string2);
    }

    public static /* synthetic */ void access$1000(ContextRule contextRule, String string2) {
        contextRule.addProvided(string2);
    }

    public static /* synthetic */ void access$1100(ContextRule contextRule, Iterable iterable) {
        contextRule.addAllProvided(iterable);
    }

    public static /* synthetic */ void access$1200(ContextRule contextRule) {
        contextRule.clearProvided();
    }

    public static /* synthetic */ void access$1300(ContextRule contextRule, ByteString byteString) {
        contextRule.addProvidedBytes(byteString);
    }

    public static /* synthetic */ void access$1400(ContextRule contextRule, int n3, String string2) {
        contextRule.setAllowedRequestExtensions(n3, string2);
    }

    public static /* synthetic */ void access$1500(ContextRule contextRule, String string2) {
        contextRule.addAllowedRequestExtensions(string2);
    }

    public static /* synthetic */ void access$1600(ContextRule contextRule, Iterable iterable) {
        contextRule.addAllAllowedRequestExtensions(iterable);
    }

    public static /* synthetic */ void access$1700(ContextRule contextRule) {
        contextRule.clearAllowedRequestExtensions();
    }

    public static /* synthetic */ void access$1800(ContextRule contextRule, ByteString byteString) {
        contextRule.addAllowedRequestExtensionsBytes(byteString);
    }

    public static /* synthetic */ void access$1900(ContextRule contextRule, int n3, String string2) {
        contextRule.setAllowedResponseExtensions(n3, string2);
    }

    public static /* synthetic */ void access$200(ContextRule contextRule) {
        contextRule.clearSelector();
    }

    public static /* synthetic */ void access$2000(ContextRule contextRule, String string2) {
        contextRule.addAllowedResponseExtensions(string2);
    }

    public static /* synthetic */ void access$2100(ContextRule contextRule, Iterable iterable) {
        contextRule.addAllAllowedResponseExtensions(iterable);
    }

    public static /* synthetic */ void access$2200(ContextRule contextRule) {
        contextRule.clearAllowedResponseExtensions();
    }

    public static /* synthetic */ void access$2300(ContextRule contextRule, ByteString byteString) {
        contextRule.addAllowedResponseExtensionsBytes(byteString);
    }

    public static /* synthetic */ void access$300(ContextRule contextRule, ByteString byteString) {
        contextRule.setSelectorBytes(byteString);
    }

    public static /* synthetic */ void access$400(ContextRule contextRule, int n3, String string2) {
        contextRule.setRequested(n3, string2);
    }

    public static /* synthetic */ void access$500(ContextRule contextRule, String string2) {
        contextRule.addRequested(string2);
    }

    public static /* synthetic */ void access$600(ContextRule contextRule, Iterable iterable) {
        contextRule.addAllRequested(iterable);
    }

    public static /* synthetic */ void access$700(ContextRule contextRule) {
        contextRule.clearRequested();
    }

    public static /* synthetic */ void access$800(ContextRule contextRule, ByteString byteString) {
        contextRule.addRequestedBytes(byteString);
    }

    public static /* synthetic */ void access$900(ContextRule contextRule, int n3, String string2) {
        contextRule.setProvided(n3, string2);
    }

    private void addAllAllowedRequestExtensions(Iterable iterable) {
        this.ensureAllowedRequestExtensionsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.allowedRequestExtensions_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllAllowedResponseExtensions(Iterable iterable) {
        this.ensureAllowedResponseExtensionsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.allowedResponseExtensions_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllProvided(Iterable iterable) {
        this.ensureProvidedIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.provided_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllRequested(Iterable iterable) {
        this.ensureRequestedIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.requested_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllowedRequestExtensions(String string2) {
        string2.getClass();
        this.ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(string2);
    }

    private void addAllowedRequestExtensionsBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureAllowedRequestExtensionsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.allowedRequestExtensions_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void addAllowedResponseExtensions(String string2) {
        string2.getClass();
        this.ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(string2);
    }

    private void addAllowedResponseExtensionsBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureAllowedResponseExtensionsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.allowedResponseExtensions_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void addProvided(String string2) {
        string2.getClass();
        this.ensureProvidedIsMutable();
        this.provided_.add(string2);
    }

    private void addProvidedBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureProvidedIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.provided_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void addRequested(String string2) {
        string2.getClass();
        this.ensureRequestedIsMutable();
        this.requested_.add(string2);
    }

    private void addRequestedBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureRequestedIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.requested_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void clearAllowedRequestExtensions() {
        Internal$ProtobufList internal$ProtobufList;
        this.allowedRequestExtensions_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAllowedResponseExtensions() {
        Internal$ProtobufList internal$ProtobufList;
        this.allowedResponseExtensions_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearProvided() {
        Internal$ProtobufList internal$ProtobufList;
        this.provided_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequested() {
        Internal$ProtobufList internal$ProtobufList;
        this.requested_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSelector() {
        String string2;
        this.selector_ = string2 = ContextRule.getDefaultInstance().getSelector();
    }

    private void ensureAllowedRequestExtensionsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.allowedRequestExtensions_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.allowedRequestExtensions_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureAllowedResponseExtensionsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.allowedResponseExtensions_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.allowedResponseExtensions_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureProvidedIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.provided_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.provided_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureRequestedIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.requested_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.requested_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static ContextRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ContextRule$Builder newBuilder() {
        return (ContextRule$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static ContextRule$Builder newBuilder(ContextRule contextRule) {
        return (ContextRule$Builder)DEFAULT_INSTANCE.createBuilder(contextRule);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) {
        return (ContextRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ContextRule)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContextRule parseFrom(ByteString byteString) {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static ContextRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream) {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ContextRule parseFrom(InputStream inputStream) {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer) {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ContextRule parseFrom(byte[] byArray) {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static ContextRule parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAllowedRequestExtensions(int n3, String string2) {
        string2.getClass();
        this.ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.set(n3, string2);
    }

    private void setAllowedResponseExtensions(int n3, String string2) {
        string2.getClass();
        this.ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.set(n3, string2);
    }

    private void setProvided(int n3, String string2) {
        string2.getClass();
        this.ensureProvidedIsMutable();
        this.provided_.set(n3, string2);
    }

    private void setRequested(int n3, String string2) {
        string2.getClass();
        this.ensureRequestedIsMutable();
        this.requested_.set(n3, string2);
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
        object = ContextRule$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = ContextRule.class;
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
                objectArray[by2] = "requested_";
                objectArray[2] = "provided_";
                objectArray[3] = "allowedRequestExtensions_";
                objectArray[4] = "allowedResponseExtensions_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u0208\u0002\u021a\u0003\u021a\u0004\u021a\u0005\u021a", objectArray);
            }
            case 2: {
                return new ContextRule$Builder(null);
            }
            case 1: 
        }
        return new ContextRule();
    }

    public String getAllowedRequestExtensions(int n3) {
        return (String)this.allowedRequestExtensions_.get(n3);
    }

    public ByteString getAllowedRequestExtensionsBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.allowedRequestExtensions_.get(n3));
    }

    public int getAllowedRequestExtensionsCount() {
        return this.allowedRequestExtensions_.size();
    }

    public List getAllowedRequestExtensionsList() {
        return this.allowedRequestExtensions_;
    }

    public String getAllowedResponseExtensions(int n3) {
        return (String)this.allowedResponseExtensions_.get(n3);
    }

    public ByteString getAllowedResponseExtensionsBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.allowedResponseExtensions_.get(n3));
    }

    public int getAllowedResponseExtensionsCount() {
        return this.allowedResponseExtensions_.size();
    }

    public List getAllowedResponseExtensionsList() {
        return this.allowedResponseExtensions_;
    }

    public String getProvided(int n3) {
        return (String)this.provided_.get(n3);
    }

    public ByteString getProvidedBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.provided_.get(n3));
    }

    public int getProvidedCount() {
        return this.provided_.size();
    }

    public List getProvidedList() {
        return this.provided_;
    }

    public String getRequested(int n3) {
        return (String)this.requested_.get(n3);
    }

    public ByteString getRequestedBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.requested_.get(n3));
    }

    public int getRequestedCount() {
        return this.requested_.size();
    }

    public List getRequestedList() {
        return this.requested_;
    }

    public String getSelector() {
        return this.selector_;
    }

    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8(this.selector_);
    }
}

