/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MetricRule;
import com.google.api.MetricRuleOrBuilder;
import com.google.api.Quota$1;
import com.google.api.Quota$Builder;
import com.google.api.QuotaLimit;
import com.google.api.QuotaLimitOrBuilder;
import com.google.api.QuotaOrBuilder;
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

public final class Quota
extends GeneratedMessageLite
implements QuotaOrBuilder {
    private static final Quota DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile Parser PARSER;
    private Internal$ProtobufList limits_;
    private Internal$ProtobufList metricRules_;

    static {
        Quota quota;
        DEFAULT_INSTANCE = quota = new Quota();
        GeneratedMessageLite.registerDefaultInstance(Quota.class, quota);
    }

    private Quota() {
        Internal$ProtobufList internal$ProtobufList;
        this.limits_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
        this.metricRules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ Quota access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Quota quota, int n3, QuotaLimit quotaLimit) {
        quota.setLimits(n3, quotaLimit);
    }

    public static /* synthetic */ void access$1000(Quota quota, Iterable iterable) {
        quota.addAllMetricRules(iterable);
    }

    public static /* synthetic */ void access$1100(Quota quota) {
        quota.clearMetricRules();
    }

    public static /* synthetic */ void access$1200(Quota quota, int n3) {
        quota.removeMetricRules(n3);
    }

    public static /* synthetic */ void access$200(Quota quota, QuotaLimit quotaLimit) {
        quota.addLimits(quotaLimit);
    }

    public static /* synthetic */ void access$300(Quota quota, int n3, QuotaLimit quotaLimit) {
        quota.addLimits(n3, quotaLimit);
    }

    public static /* synthetic */ void access$400(Quota quota, Iterable iterable) {
        quota.addAllLimits(iterable);
    }

    public static /* synthetic */ void access$500(Quota quota) {
        quota.clearLimits();
    }

    public static /* synthetic */ void access$600(Quota quota, int n3) {
        quota.removeLimits(n3);
    }

    public static /* synthetic */ void access$700(Quota quota, int n3, MetricRule metricRule) {
        quota.setMetricRules(n3, metricRule);
    }

    public static /* synthetic */ void access$800(Quota quota, MetricRule metricRule) {
        quota.addMetricRules(metricRule);
    }

    public static /* synthetic */ void access$900(Quota quota, int n3, MetricRule metricRule) {
        quota.addMetricRules(n3, metricRule);
    }

    private void addAllLimits(Iterable iterable) {
        this.ensureLimitsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.limits_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAllMetricRules(Iterable iterable) {
        this.ensureMetricRulesIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.metricRules_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addLimits(int n3, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        this.ensureLimitsIsMutable();
        this.limits_.add(n3, quotaLimit);
    }

    private void addLimits(QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        this.ensureLimitsIsMutable();
        this.limits_.add(quotaLimit);
    }

    private void addMetricRules(int n3, MetricRule metricRule) {
        metricRule.getClass();
        this.ensureMetricRulesIsMutable();
        this.metricRules_.add(n3, metricRule);
    }

    private void addMetricRules(MetricRule metricRule) {
        metricRule.getClass();
        this.ensureMetricRulesIsMutable();
        this.metricRules_.add(metricRule);
    }

    private void clearLimits() {
        Internal$ProtobufList internal$ProtobufList;
        this.limits_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMetricRules() {
        Internal$ProtobufList internal$ProtobufList;
        this.metricRules_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLimitsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.limits_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.limits_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    private void ensureMetricRulesIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.metricRules_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.metricRules_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static Quota getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Quota$Builder newBuilder() {
        return (Quota$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Quota$Builder newBuilder(Quota quota) {
        return (Quota$Builder)DEFAULT_INSTANCE.createBuilder(quota);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream) {
        return (Quota)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Quota)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Quota parseFrom(ByteString byteString) {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Quota parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Quota parseFrom(CodedInputStream codedInputStream) {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Quota parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Quota parseFrom(InputStream inputStream) {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Quota parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer) {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Quota parseFrom(byte[] byArray) {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Quota parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLimits(int n3) {
        this.ensureLimitsIsMutable();
        this.limits_.remove(n3);
    }

    private void removeMetricRules(int n3) {
        this.ensureMetricRulesIsMutable();
        this.metricRules_.remove(n3);
    }

    private void setLimits(int n3, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        this.ensureLimitsIsMutable();
        this.limits_.set(n3, quotaLimit);
    }

    private void setMetricRules(int n3, MetricRule metricRule) {
        metricRule.getClass();
        this.ensureMetricRulesIsMutable();
        this.metricRules_.set(n3, metricRule);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Quota$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Quota.class;
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
                objectArray[0] = "limits_";
                objectArray[by2] = QuotaLimit.class;
                objectArray[2] = "metricRules_";
                objectArray[3] = MetricRule.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", objectArray);
            }
            case 2: {
                return new Quota$Builder(null);
            }
            case 1: 
        }
        return new Quota();
    }

    public QuotaLimit getLimits(int n3) {
        return (QuotaLimit)this.limits_.get(n3);
    }

    public int getLimitsCount() {
        return this.limits_.size();
    }

    public List getLimitsList() {
        return this.limits_;
    }

    public QuotaLimitOrBuilder getLimitsOrBuilder(int n3) {
        return (QuotaLimitOrBuilder)this.limits_.get(n3);
    }

    public List getLimitsOrBuilderList() {
        return this.limits_;
    }

    public MetricRule getMetricRules(int n3) {
        return (MetricRule)this.metricRules_.get(n3);
    }

    public int getMetricRulesCount() {
        return this.metricRules_.size();
    }

    public List getMetricRulesList() {
        return this.metricRules_;
    }

    public MetricRuleOrBuilder getMetricRulesOrBuilder(int n3) {
        return (MetricRuleOrBuilder)this.metricRules_.get(n3);
    }

    public List getMetricRulesOrBuilderList() {
        return this.metricRules_;
    }
}

