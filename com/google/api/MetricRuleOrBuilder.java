/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

public interface MetricRuleOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsMetricCosts(String var1);

    public Map getMetricCosts();

    public int getMetricCostsCount();

    public Map getMetricCostsMap();

    public long getMetricCostsOrDefault(String var1, long var2);

    public long getMetricCostsOrThrow(String var1);

    public String getSelector();

    public ByteString getSelectorBytes();
}

