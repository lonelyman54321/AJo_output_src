/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface Billing$BillingDestinationOrBuilder
extends MessageLiteOrBuilder {
    public String getMetrics(int var1);

    public ByteString getMetricsBytes(int var1);

    public int getMetricsCount();

    public List getMetricsList();

    public String getMonitoredResource();

    public ByteString getMonitoredResourceBytes();
}

