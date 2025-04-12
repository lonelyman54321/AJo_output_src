/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.MonitoredResourceMetadata;
import com.google.api.MonitoredResourceMetadata$1;
import com.google.api.MonitoredResourceMetadataOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Struct;
import com.google.protobuf.Struct$Builder;
import java.util.Collections;
import java.util.Map;

public final class MonitoredResourceMetadata$Builder
extends GeneratedMessageLite$Builder
implements MonitoredResourceMetadataOrBuilder {
    private MonitoredResourceMetadata$Builder() {
        MonitoredResourceMetadata monitoredResourceMetadata = MonitoredResourceMetadata.access$000();
        super(monitoredResourceMetadata);
    }

    public /* synthetic */ MonitoredResourceMetadata$Builder(MonitoredResourceMetadata$1 monitoredResourceMetadata$1) {
        this();
    }

    public MonitoredResourceMetadata$Builder clearSystemLabels() {
        this.copyOnWrite();
        MonitoredResourceMetadata.access$300((MonitoredResourceMetadata)this.instance);
        return this;
    }

    public MonitoredResourceMetadata$Builder clearUserLabels() {
        this.copyOnWrite();
        MonitoredResourceMetadata.access$400((MonitoredResourceMetadata)this.instance).clear();
        return this;
    }

    public boolean containsUserLabels(String string2) {
        string2.getClass();
        return ((MonitoredResourceMetadata)this.instance).getUserLabelsMap().containsKey(string2);
    }

    public Struct getSystemLabels() {
        return ((MonitoredResourceMetadata)this.instance).getSystemLabels();
    }

    public Map getUserLabels() {
        return this.getUserLabelsMap();
    }

    public int getUserLabelsCount() {
        return ((MonitoredResourceMetadata)this.instance).getUserLabelsMap().size();
    }

    public Map getUserLabelsMap() {
        return Collections.unmodifiableMap(((MonitoredResourceMetadata)this.instance).getUserLabelsMap());
    }

    public String getUserLabelsOrDefault(String string2, String string3) {
        string2.getClass();
        Map map2 = ((MonitoredResourceMetadata)this.instance).getUserLabelsMap();
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            string3 = string2 = map2.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getUserLabelsOrThrow(String object) {
        object.getClass();
        Map map2 = ((MonitoredResourceMetadata)this.instance).getUserLabelsMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            return (String)map2.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public boolean hasSystemLabels() {
        return ((MonitoredResourceMetadata)this.instance).hasSystemLabels();
    }

    public MonitoredResourceMetadata$Builder mergeSystemLabels(Struct struct) {
        this.copyOnWrite();
        MonitoredResourceMetadata.access$200((MonitoredResourceMetadata)this.instance, struct);
        return this;
    }

    public MonitoredResourceMetadata$Builder putAllUserLabels(Map map2) {
        this.copyOnWrite();
        MonitoredResourceMetadata.access$400((MonitoredResourceMetadata)this.instance).putAll(map2);
        return this;
    }

    public MonitoredResourceMetadata$Builder putUserLabels(String string2, String string3) {
        string2.getClass();
        string3.getClass();
        this.copyOnWrite();
        MonitoredResourceMetadata.access$400((MonitoredResourceMetadata)this.instance).put(string2, string3);
        return this;
    }

    public MonitoredResourceMetadata$Builder removeUserLabels(String string2) {
        string2.getClass();
        this.copyOnWrite();
        MonitoredResourceMetadata.access$400((MonitoredResourceMetadata)this.instance).remove(string2);
        return this;
    }

    public MonitoredResourceMetadata$Builder setSystemLabels(Struct$Builder structOrBuilder) {
        this.copyOnWrite();
        MonitoredResourceMetadata monitoredResourceMetadata = (MonitoredResourceMetadata)this.instance;
        structOrBuilder = (Struct)structOrBuilder.build();
        MonitoredResourceMetadata.access$100(monitoredResourceMetadata, (Struct)structOrBuilder);
        return this;
    }

    public MonitoredResourceMetadata$Builder setSystemLabels(Struct struct) {
        this.copyOnWrite();
        MonitoredResourceMetadata.access$100((MonitoredResourceMetadata)this.instance, struct);
        return this;
    }
}

