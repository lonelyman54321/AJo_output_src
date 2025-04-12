/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MetricRule;
import com.google.api.MetricRule$Builder;
import com.google.api.Quota;
import com.google.api.Quota$1;
import com.google.api.QuotaLimit;
import com.google.api.QuotaLimit$Builder;
import com.google.api.QuotaOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Quota$Builder
extends GeneratedMessageLite$Builder
implements QuotaOrBuilder {
    private Quota$Builder() {
        Quota quota = Quota.access$000();
        super(quota);
    }

    public /* synthetic */ Quota$Builder(Quota$1 quota$1) {
        this();
    }

    public Quota$Builder addAllLimits(Iterable iterable) {
        this.copyOnWrite();
        Quota.access$400((Quota)this.instance, iterable);
        return this;
    }

    public Quota$Builder addAllMetricRules(Iterable iterable) {
        this.copyOnWrite();
        Quota.access$1000((Quota)this.instance, iterable);
        return this;
    }

    public Quota$Builder addLimits(int n3, QuotaLimit$Builder quotaLimitOrBuilder) {
        this.copyOnWrite();
        Quota quota = (Quota)this.instance;
        quotaLimitOrBuilder = (QuotaLimit)quotaLimitOrBuilder.build();
        Quota.access$300(quota, n3, (QuotaLimit)quotaLimitOrBuilder);
        return this;
    }

    public Quota$Builder addLimits(int n3, QuotaLimit quotaLimit) {
        this.copyOnWrite();
        Quota.access$300((Quota)this.instance, n3, quotaLimit);
        return this;
    }

    public Quota$Builder addLimits(QuotaLimit$Builder quotaLimitOrBuilder) {
        this.copyOnWrite();
        Quota quota = (Quota)this.instance;
        quotaLimitOrBuilder = (QuotaLimit)quotaLimitOrBuilder.build();
        Quota.access$200(quota, (QuotaLimit)quotaLimitOrBuilder);
        return this;
    }

    public Quota$Builder addLimits(QuotaLimit quotaLimit) {
        this.copyOnWrite();
        Quota.access$200((Quota)this.instance, quotaLimit);
        return this;
    }

    public Quota$Builder addMetricRules(int n3, MetricRule$Builder metricRuleOrBuilder) {
        this.copyOnWrite();
        Quota quota = (Quota)this.instance;
        metricRuleOrBuilder = (MetricRule)metricRuleOrBuilder.build();
        Quota.access$900(quota, n3, (MetricRule)metricRuleOrBuilder);
        return this;
    }

    public Quota$Builder addMetricRules(int n3, MetricRule metricRule) {
        this.copyOnWrite();
        Quota.access$900((Quota)this.instance, n3, metricRule);
        return this;
    }

    public Quota$Builder addMetricRules(MetricRule$Builder metricRuleOrBuilder) {
        this.copyOnWrite();
        Quota quota = (Quota)this.instance;
        metricRuleOrBuilder = (MetricRule)metricRuleOrBuilder.build();
        Quota.access$800(quota, (MetricRule)metricRuleOrBuilder);
        return this;
    }

    public Quota$Builder addMetricRules(MetricRule metricRule) {
        this.copyOnWrite();
        Quota.access$800((Quota)this.instance, metricRule);
        return this;
    }

    public Quota$Builder clearLimits() {
        this.copyOnWrite();
        Quota.access$500((Quota)this.instance);
        return this;
    }

    public Quota$Builder clearMetricRules() {
        this.copyOnWrite();
        Quota.access$1100((Quota)this.instance);
        return this;
    }

    public QuotaLimit getLimits(int n3) {
        return ((Quota)this.instance).getLimits(n3);
    }

    public int getLimitsCount() {
        return ((Quota)this.instance).getLimitsCount();
    }

    public List getLimitsList() {
        return Collections.unmodifiableList(((Quota)this.instance).getLimitsList());
    }

    public MetricRule getMetricRules(int n3) {
        return ((Quota)this.instance).getMetricRules(n3);
    }

    public int getMetricRulesCount() {
        return ((Quota)this.instance).getMetricRulesCount();
    }

    public List getMetricRulesList() {
        return Collections.unmodifiableList(((Quota)this.instance).getMetricRulesList());
    }

    public Quota$Builder removeLimits(int n3) {
        this.copyOnWrite();
        Quota.access$600((Quota)this.instance, n3);
        return this;
    }

    public Quota$Builder removeMetricRules(int n3) {
        this.copyOnWrite();
        Quota.access$1200((Quota)this.instance, n3);
        return this;
    }

    public Quota$Builder setLimits(int n3, QuotaLimit$Builder quotaLimitOrBuilder) {
        this.copyOnWrite();
        Quota quota = (Quota)this.instance;
        quotaLimitOrBuilder = (QuotaLimit)quotaLimitOrBuilder.build();
        Quota.access$100(quota, n3, (QuotaLimit)quotaLimitOrBuilder);
        return this;
    }

    public Quota$Builder setLimits(int n3, QuotaLimit quotaLimit) {
        this.copyOnWrite();
        Quota.access$100((Quota)this.instance, n3, quotaLimit);
        return this;
    }

    public Quota$Builder setMetricRules(int n3, MetricRule$Builder metricRuleOrBuilder) {
        this.copyOnWrite();
        Quota quota = (Quota)this.instance;
        metricRuleOrBuilder = (MetricRule)metricRuleOrBuilder.build();
        Quota.access$700(quota, n3, (MetricRule)metricRuleOrBuilder);
        return this;
    }

    public Quota$Builder setMetricRules(int n3, MetricRule metricRule) {
        this.copyOnWrite();
        Quota.access$700((Quota)this.instance, n3, metricRule);
        return this;
    }
}

