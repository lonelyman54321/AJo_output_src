/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MetricRule;
import com.google.api.MetricRule$1;
import com.google.api.MetricRuleOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.Map;

public final class MetricRule$Builder
extends GeneratedMessageLite$Builder
implements MetricRuleOrBuilder {
    private MetricRule$Builder() {
        MetricRule metricRule = MetricRule.access$000();
        super(metricRule);
    }

    public /* synthetic */ MetricRule$Builder(MetricRule$1 metricRule$1) {
        this();
    }

    public MetricRule$Builder clearMetricCosts() {
        this.copyOnWrite();
        MetricRule.access$400((MetricRule)this.instance).clear();
        return this;
    }

    public MetricRule$Builder clearSelector() {
        this.copyOnWrite();
        MetricRule.access$200((MetricRule)this.instance);
        return this;
    }

    public boolean containsMetricCosts(String string2) {
        string2.getClass();
        return ((MetricRule)this.instance).getMetricCostsMap().containsKey(string2);
    }

    public Map getMetricCosts() {
        return this.getMetricCostsMap();
    }

    public int getMetricCostsCount() {
        return ((MetricRule)this.instance).getMetricCostsMap().size();
    }

    public Map getMetricCostsMap() {
        return Collections.unmodifiableMap(((MetricRule)this.instance).getMetricCostsMap());
    }

    public long getMetricCostsOrDefault(String object, long l2) {
        object.getClass();
        Map map2 = ((MetricRule)this.instance).getMetricCostsMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            object = (Long)map2.get(object);
            l2 = (Long)object;
        }
        return l2;
    }

    public long getMetricCostsOrThrow(String object) {
        object.getClass();
        Map map2 = ((MetricRule)this.instance).getMetricCostsMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            return (Long)map2.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public String getSelector() {
        return ((MetricRule)this.instance).getSelector();
    }

    public ByteString getSelectorBytes() {
        return ((MetricRule)this.instance).getSelectorBytes();
    }

    public MetricRule$Builder putAllMetricCosts(Map map2) {
        this.copyOnWrite();
        MetricRule.access$400((MetricRule)this.instance).putAll(map2);
        return this;
    }

    public MetricRule$Builder putMetricCosts(String string2, long l2) {
        string2.getClass();
        this.copyOnWrite();
        Map map2 = MetricRule.access$400((MetricRule)this.instance);
        Long l3 = l2;
        map2.put(string2, l3);
        return this;
    }

    public MetricRule$Builder removeMetricCosts(String string2) {
        string2.getClass();
        this.copyOnWrite();
        MetricRule.access$400((MetricRule)this.instance).remove(string2);
        return this;
    }

    public MetricRule$Builder setSelector(String string2) {
        this.copyOnWrite();
        MetricRule.access$100((MetricRule)this.instance, string2);
        return this;
    }

    public MetricRule$Builder setSelectorBytes(ByteString byteString) {
        this.copyOnWrite();
        MetricRule.access$300((MetricRule)this.instance, byteString);
        return this;
    }
}

