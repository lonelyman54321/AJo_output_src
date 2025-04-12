/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

public interface QuotaLimitOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsValues(String var1);

    public long getDefaultLimit();

    public String getDescription();

    public ByteString getDescriptionBytes();

    public String getDisplayName();

    public ByteString getDisplayNameBytes();

    public String getDuration();

    public ByteString getDurationBytes();

    public long getFreeTier();

    public long getMaxLimit();

    public String getMetric();

    public ByteString getMetricBytes();

    public String getName();

    public ByteString getNameBytes();

    public String getUnit();

    public ByteString getUnitBytes();

    public Map getValues();

    public int getValuesCount();

    public Map getValuesMap();

    public long getValuesOrDefault(String var1, long var2);

    public long getValuesOrThrow(String var1);
}

