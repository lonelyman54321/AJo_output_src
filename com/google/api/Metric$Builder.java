/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Metric;
import com.google.api.Metric$1;
import com.google.api.MetricOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.Map;

public final class Metric$Builder
extends GeneratedMessageLite$Builder
implements MetricOrBuilder {
    private Metric$Builder() {
        Metric metric = Metric.access$000();
        super(metric);
    }

    public /* synthetic */ Metric$Builder(Metric$1 metric$1) {
        this();
    }

    public Metric$Builder clearLabels() {
        this.copyOnWrite();
        Metric.access$400((Metric)this.instance).clear();
        return this;
    }

    public Metric$Builder clearType() {
        this.copyOnWrite();
        Metric.access$200((Metric)this.instance);
        return this;
    }

    public boolean containsLabels(String string2) {
        string2.getClass();
        return ((Metric)this.instance).getLabelsMap().containsKey(string2);
    }

    public Map getLabels() {
        return this.getLabelsMap();
    }

    public int getLabelsCount() {
        return ((Metric)this.instance).getLabelsMap().size();
    }

    public Map getLabelsMap() {
        return Collections.unmodifiableMap(((Metric)this.instance).getLabelsMap());
    }

    public String getLabelsOrDefault(String string2, String string3) {
        string2.getClass();
        Map map2 = ((Metric)this.instance).getLabelsMap();
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            string3 = string2 = map2.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getLabelsOrThrow(String object) {
        object.getClass();
        Map map2 = ((Metric)this.instance).getLabelsMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            return (String)map2.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public String getType() {
        return ((Metric)this.instance).getType();
    }

    public ByteString getTypeBytes() {
        return ((Metric)this.instance).getTypeBytes();
    }

    public Metric$Builder putAllLabels(Map map2) {
        this.copyOnWrite();
        Metric.access$400((Metric)this.instance).putAll(map2);
        return this;
    }

    public Metric$Builder putLabels(String string2, String string3) {
        string2.getClass();
        string3.getClass();
        this.copyOnWrite();
        Metric.access$400((Metric)this.instance).put(string2, string3);
        return this;
    }

    public Metric$Builder removeLabels(String string2) {
        string2.getClass();
        this.copyOnWrite();
        Metric.access$400((Metric)this.instance).remove(string2);
        return this;
    }

    public Metric$Builder setType(String string2) {
        this.copyOnWrite();
        Metric.access$100((Metric)this.instance, string2);
        return this;
    }

    public Metric$Builder setTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        Metric.access$300((Metric)this.instance, byteString);
        return this;
    }
}

