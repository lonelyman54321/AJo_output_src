/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MetricRule;
import com.google.api.QuotaLimit;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface QuotaOrBuilder
extends MessageLiteOrBuilder {
    public QuotaLimit getLimits(int var1);

    public int getLimitsCount();

    public List getLimitsList();

    public MetricRule getMetricRules(int var1);

    public int getMetricRulesCount();

    public List getMetricRulesList();
}

