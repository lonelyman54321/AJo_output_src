/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.QuotaLimit;
import com.google.api.QuotaLimit$1;
import com.google.api.QuotaLimitOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.Map;

public final class QuotaLimit$Builder
extends GeneratedMessageLite$Builder
implements QuotaLimitOrBuilder {
    private QuotaLimit$Builder() {
        QuotaLimit quotaLimit = QuotaLimit.access$000();
        super(quotaLimit);
    }

    public /* synthetic */ QuotaLimit$Builder(QuotaLimit$1 quotaLimit$1) {
        this();
    }

    public QuotaLimit$Builder clearDefaultLimit() {
        this.copyOnWrite();
        QuotaLimit.access$800((QuotaLimit)this.instance);
        return this;
    }

    public QuotaLimit$Builder clearDescription() {
        this.copyOnWrite();
        QuotaLimit.access$500((QuotaLimit)this.instance);
        return this;
    }

    public QuotaLimit$Builder clearDisplayName() {
        this.copyOnWrite();
        QuotaLimit.access$2400((QuotaLimit)this.instance);
        return this;
    }

    public QuotaLimit$Builder clearDuration() {
        this.copyOnWrite();
        QuotaLimit.access$1400((QuotaLimit)this.instance);
        return this;
    }

    public QuotaLimit$Builder clearFreeTier() {
        this.copyOnWrite();
        QuotaLimit.access$1200((QuotaLimit)this.instance);
        return this;
    }

    public QuotaLimit$Builder clearMaxLimit() {
        this.copyOnWrite();
        QuotaLimit.access$1000((QuotaLimit)this.instance);
        return this;
    }

    public QuotaLimit$Builder clearMetric() {
        this.copyOnWrite();
        QuotaLimit.access$1700((QuotaLimit)this.instance);
        return this;
    }

    public QuotaLimit$Builder clearName() {
        this.copyOnWrite();
        QuotaLimit.access$200((QuotaLimit)this.instance);
        return this;
    }

    public QuotaLimit$Builder clearUnit() {
        this.copyOnWrite();
        QuotaLimit.access$2000((QuotaLimit)this.instance);
        return this;
    }

    public QuotaLimit$Builder clearValues() {
        this.copyOnWrite();
        QuotaLimit.access$2200((QuotaLimit)this.instance).clear();
        return this;
    }

    public boolean containsValues(String string2) {
        string2.getClass();
        return ((QuotaLimit)this.instance).getValuesMap().containsKey(string2);
    }

    public long getDefaultLimit() {
        return ((QuotaLimit)this.instance).getDefaultLimit();
    }

    public String getDescription() {
        return ((QuotaLimit)this.instance).getDescription();
    }

    public ByteString getDescriptionBytes() {
        return ((QuotaLimit)this.instance).getDescriptionBytes();
    }

    public String getDisplayName() {
        return ((QuotaLimit)this.instance).getDisplayName();
    }

    public ByteString getDisplayNameBytes() {
        return ((QuotaLimit)this.instance).getDisplayNameBytes();
    }

    public String getDuration() {
        return ((QuotaLimit)this.instance).getDuration();
    }

    public ByteString getDurationBytes() {
        return ((QuotaLimit)this.instance).getDurationBytes();
    }

    public long getFreeTier() {
        return ((QuotaLimit)this.instance).getFreeTier();
    }

    public long getMaxLimit() {
        return ((QuotaLimit)this.instance).getMaxLimit();
    }

    public String getMetric() {
        return ((QuotaLimit)this.instance).getMetric();
    }

    public ByteString getMetricBytes() {
        return ((QuotaLimit)this.instance).getMetricBytes();
    }

    public String getName() {
        return ((QuotaLimit)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((QuotaLimit)this.instance).getNameBytes();
    }

    public String getUnit() {
        return ((QuotaLimit)this.instance).getUnit();
    }

    public ByteString getUnitBytes() {
        return ((QuotaLimit)this.instance).getUnitBytes();
    }

    public Map getValues() {
        return this.getValuesMap();
    }

    public int getValuesCount() {
        return ((QuotaLimit)this.instance).getValuesMap().size();
    }

    public Map getValuesMap() {
        return Collections.unmodifiableMap(((QuotaLimit)this.instance).getValuesMap());
    }

    public long getValuesOrDefault(String object, long l2) {
        object.getClass();
        Map map2 = ((QuotaLimit)this.instance).getValuesMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            object = (Long)map2.get(object);
            l2 = (Long)object;
        }
        return l2;
    }

    public long getValuesOrThrow(String object) {
        object.getClass();
        Map map2 = ((QuotaLimit)this.instance).getValuesMap();
        boolean bl2 = map2.containsKey(object);
        if (bl2) {
            return (Long)map2.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public QuotaLimit$Builder putAllValues(Map map2) {
        this.copyOnWrite();
        QuotaLimit.access$2200((QuotaLimit)this.instance).putAll(map2);
        return this;
    }

    public QuotaLimit$Builder putValues(String string2, long l2) {
        string2.getClass();
        this.copyOnWrite();
        Map map2 = QuotaLimit.access$2200((QuotaLimit)this.instance);
        Long l3 = l2;
        map2.put(string2, l3);
        return this;
    }

    public QuotaLimit$Builder removeValues(String string2) {
        string2.getClass();
        this.copyOnWrite();
        QuotaLimit.access$2200((QuotaLimit)this.instance).remove(string2);
        return this;
    }

    public QuotaLimit$Builder setDefaultLimit(long l2) {
        this.copyOnWrite();
        QuotaLimit.access$700((QuotaLimit)this.instance, l2);
        return this;
    }

    public QuotaLimit$Builder setDescription(String string2) {
        this.copyOnWrite();
        QuotaLimit.access$400((QuotaLimit)this.instance, string2);
        return this;
    }

    public QuotaLimit$Builder setDescriptionBytes(ByteString byteString) {
        this.copyOnWrite();
        QuotaLimit.access$600((QuotaLimit)this.instance, byteString);
        return this;
    }

    public QuotaLimit$Builder setDisplayName(String string2) {
        this.copyOnWrite();
        QuotaLimit.access$2300((QuotaLimit)this.instance, string2);
        return this;
    }

    public QuotaLimit$Builder setDisplayNameBytes(ByteString byteString) {
        this.copyOnWrite();
        QuotaLimit.access$2500((QuotaLimit)this.instance, byteString);
        return this;
    }

    public QuotaLimit$Builder setDuration(String string2) {
        this.copyOnWrite();
        QuotaLimit.access$1300((QuotaLimit)this.instance, string2);
        return this;
    }

    public QuotaLimit$Builder setDurationBytes(ByteString byteString) {
        this.copyOnWrite();
        QuotaLimit.access$1500((QuotaLimit)this.instance, byteString);
        return this;
    }

    public QuotaLimit$Builder setFreeTier(long l2) {
        this.copyOnWrite();
        QuotaLimit.access$1100((QuotaLimit)this.instance, l2);
        return this;
    }

    public QuotaLimit$Builder setMaxLimit(long l2) {
        this.copyOnWrite();
        QuotaLimit.access$900((QuotaLimit)this.instance, l2);
        return this;
    }

    public QuotaLimit$Builder setMetric(String string2) {
        this.copyOnWrite();
        QuotaLimit.access$1600((QuotaLimit)this.instance, string2);
        return this;
    }

    public QuotaLimit$Builder setMetricBytes(ByteString byteString) {
        this.copyOnWrite();
        QuotaLimit.access$1800((QuotaLimit)this.instance, byteString);
        return this;
    }

    public QuotaLimit$Builder setName(String string2) {
        this.copyOnWrite();
        QuotaLimit.access$100((QuotaLimit)this.instance, string2);
        return this;
    }

    public QuotaLimit$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        QuotaLimit.access$300((QuotaLimit)this.instance, byteString);
        return this;
    }

    public QuotaLimit$Builder setUnit(String string2) {
        this.copyOnWrite();
        QuotaLimit.access$1900((QuotaLimit)this.instance, string2);
        return this;
    }

    public QuotaLimit$Builder setUnitBytes(ByteString byteString) {
        this.copyOnWrite();
        QuotaLimit.access$2100((QuotaLimit)this.instance, byteString);
        return this;
    }
}

