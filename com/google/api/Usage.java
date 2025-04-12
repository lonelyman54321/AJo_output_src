/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Usage$1;
import com.google.api.Usage$Builder;
import com.google.api.UsageOrBuilder;
import com.google.api.UsageRule;
import com.google.api.UsageRuleOrBuilder;
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

public final class Usage
extends GeneratedMessageLite
implements UsageOrBuilder {
    private static final Usage DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private String producerNotificationChannel_;
    private Internal$ProtobufList requirements_;
    private Internal$ProtobufList rules_;

    static {
        Usage usage;
        DEFAULT_INSTANCE = usage = new Usage();
        GeneratedMessageLite.registerDefaultInstance(Usage.class, usage);
    }

    private Usage() {
        Internal$ProtobufList internal$ProtobufList;
        this.requirements_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.rules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.producerNotificationChannel_ = "";
    }

    public static /* synthetic */ Usage access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Usage usage, int n3, String string2) {
        usage.setRequirements(n3, string2);
    }

    public static /* synthetic */ void access$1000(Usage usage) {
        usage.clearRules();
    }

    public static /* synthetic */ void access$1100(Usage usage, int n3) {
        usage.removeRules(n3);
    }

    public static /* synthetic */ void access$1200(Usage usage, String string2) {
        usage.setProducerNotificationChannel(string2);
    }

    public static /* synthetic */ void access$1300(Usage usage) {
        usage.clearProducerNotificationChannel();
    }

    public static /* synthetic */ void access$1400(Usage usage, ByteString byteString) {
        usage.setProducerNotificationChannelBytes(byteString);
    }

    public static /* synthetic */ void access$200(Usage usage, String string2) {
        usage.addRequirements(string2);
    }

    public static /* synthetic */ void access$300(Usage usage, Iterable iterable) {
        usage.addAllRequirements(iterable);
    }

    public static /* synthetic */ void access$400(Usage usage) {
        usage.clearRequirements();
    }

    public static /* synthetic */ void access$500(Usage usage, ByteString byteString) {
        usage.addRequirementsBytes(byteString);
    }

    public static /* synthetic */ void access$600(Usage usage, int n3, UsageRule usageRule) {
        usage.setRules(n3, usageRule);
    }

    public static /* synthetic */ void access$700(Usage usage, UsageRule usageRule) {
        usage.addRules(usageRule);
    }

    public static /* synthetic */ void access$800(Usage usage, int n3, UsageRule usageRule) {
        usage.addRules(n3, usageRule);
    }

    public static /* synthetic */ void access$900(Usage usage, Iterable iterable) {
        usage.addAllRules(iterable);
    }

    private void addAllRequirements(Iterable iterable) {
        this.ensureRequirementsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.requirements_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllRules(Iterable iterable) {
        this.ensureRulesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.rules_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addRequirements(String string2) {
        string2.getClass();
        this.ensureRequirementsIsMutable();
        this.requirements_.add(string2);
    }

    private void addRequirementsBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.ensureRequirementsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.requirements_;
        object = ((ByteString)object).toStringUtf8();
        internal$ProtobufList.add(object);
    }

    private void addRules(int n3, UsageRule usageRule) {
        usageRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n3, usageRule);
    }

    private void addRules(UsageRule usageRule) {
        usageRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(usageRule);
    }

    private void clearProducerNotificationChannel() {
        String string2;
        this.producerNotificationChannel_ = string2 = Usage.getDefaultInstance().getProducerNotificationChannel();
    }

    private void clearRequirements() {
        Internal$ProtobufList internal$ProtobufList;
        this.requirements_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRules() {
        Internal$ProtobufList internal$ProtobufList;
        this.rules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRequirementsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.requirements_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.requirements_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureRulesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.rules_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.rules_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Usage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Usage$Builder newBuilder() {
        return (Usage$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Usage$Builder newBuilder(Usage usage) {
        return (Usage$Builder)DEFAULT_INSTANCE.createBuilder(usage);
    }

    public static Usage parseDelimitedFrom(InputStream inputStream) {
        return (Usage)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Usage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Usage)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Usage parseFrom(ByteString byteString) {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Usage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Usage parseFrom(CodedInputStream codedInputStream) {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Usage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Usage parseFrom(InputStream inputStream) {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Usage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer) {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Usage parseFrom(byte[] byArray) {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Usage parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n3) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n3);
    }

    private void setProducerNotificationChannel(String string2) {
        string2.getClass();
        this.producerNotificationChannel_ = string2;
    }

    private void setProducerNotificationChannelBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.producerNotificationChannel_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setRequirements(int n3, String string2) {
        string2.getClass();
        this.ensureRequirementsIsMutable();
        this.requirements_.set(n3, string2);
    }

    private void setRules(int n3, UsageRule usageRule) {
        usageRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n3, usageRule);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Usage$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Usage.class;
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
                objectArray[0] = "requirements_";
                objectArray[by2] = "rules_";
                objectArray[2] = UsageRule.class;
                objectArray[3] = "producerNotificationChannel_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0002\u0000\u0001\u021a\u0006\u001b\u0007\u0208", objectArray);
            }
            case 2: {
                return new Usage$Builder(null);
            }
            case 1: 
        }
        return new Usage();
    }

    public String getProducerNotificationChannel() {
        return this.producerNotificationChannel_;
    }

    public ByteString getProducerNotificationChannelBytes() {
        return ByteString.copyFromUtf8(this.producerNotificationChannel_);
    }

    public String getRequirements(int n3) {
        return (String)this.requirements_.get(n3);
    }

    public ByteString getRequirementsBytes(int n3) {
        return ByteString.copyFromUtf8((String)this.requirements_.get(n3));
    }

    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    public List getRequirementsList() {
        return this.requirements_;
    }

    public UsageRule getRules(int n3) {
        return (UsageRule)this.rules_.get(n3);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List getRulesList() {
        return this.rules_;
    }

    public UsageRuleOrBuilder getRulesOrBuilder(int n3) {
        return (UsageRuleOrBuilder)this.rules_.get(n3);
    }

    public List getRulesOrBuilderList() {
        return this.rules_;
    }
}

