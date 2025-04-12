/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MonitoredResource;
import com.google.api.MonitoredResource$1;
import com.google.api.MonitoredResourceOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.Map;

public final class MonitoredResource$Builder
extends GeneratedMessageLite$Builder
implements MonitoredResourceOrBuilder {
    private MonitoredResource$Builder() {
        MonitoredResource monitoredResource = MonitoredResource.access$000();
        super(monitoredResource);
    }

    public /* synthetic */ MonitoredResource$Builder(MonitoredResource$1 monitoredResource$1) {
        this();
    }

    public MonitoredResource$Builder clearLabels() {
        this.copyOnWrite();
        MonitoredResource.access$400((MonitoredResource)this.instance).clear();
        return this;
    }

    public MonitoredResource$Builder clearType() {
        this.copyOnWrite();
        MonitoredResource.access$200((MonitoredResource)this.instance);
        return this;
    }

    public boolean containsLabels(String string2) {
        string2.getClass();
        return ((MonitoredResource)this.instance).getLabelsMap().containsKey(string2);
    }

    public Map getLabels() {
        return this.getLabelsMap();
    }

    public int getLabelsCount() {
        return ((MonitoredResource)this.instance).getLabelsMap().size();
    }

    public Map getLabelsMap() {
        return Collections.unmodifiableMap(((MonitoredResource)this.instance).getLabelsMap());
    }

    public String getLabelsOrDefault(String string2, String string3) {
        string2.getClass();
        Map map2 = ((MonitoredResource)this.instance).getLabelsMap();
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            string3 = string2 = map2.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getLabelsOrThrow(String object) {
        object.getClass();
        Map map2 = ((MonitoredResource)this.instance).getLabelsMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            return (String)map2.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public String getType() {
        return ((MonitoredResource)this.instance).getType();
    }

    public ByteString getTypeBytes() {
        return ((MonitoredResource)this.instance).getTypeBytes();
    }

    public MonitoredResource$Builder putAllLabels(Map map2) {
        this.copyOnWrite();
        MonitoredResource.access$400((MonitoredResource)this.instance).putAll(map2);
        return this;
    }

    public MonitoredResource$Builder putLabels(String string2, String string3) {
        string2.getClass();
        string3.getClass();
        this.copyOnWrite();
        MonitoredResource.access$400((MonitoredResource)this.instance).put(string2, string3);
        return this;
    }

    public MonitoredResource$Builder removeLabels(String string2) {
        string2.getClass();
        this.copyOnWrite();
        MonitoredResource.access$400((MonitoredResource)this.instance).remove(string2);
        return this;
    }

    public MonitoredResource$Builder setType(String string2) {
        this.copyOnWrite();
        MonitoredResource.access$100((MonitoredResource)this.instance, string2);
        return this;
    }

    public MonitoredResource$Builder setTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        MonitoredResource.access$300((MonitoredResource)this.instance, byteString);
        return this;
    }
}

