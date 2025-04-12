/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Monitoring$1;
import com.google.api.Monitoring$MonitoringDestination;
import com.google.api.Monitoring$MonitoringDestinationOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Monitoring$MonitoringDestination$Builder
extends GeneratedMessageLite$Builder
implements Monitoring$MonitoringDestinationOrBuilder {
    private Monitoring$MonitoringDestination$Builder() {
        Monitoring$MonitoringDestination monitoring$MonitoringDestination = Monitoring$MonitoringDestination.access$000();
        super(monitoring$MonitoringDestination);
    }

    public /* synthetic */ Monitoring$MonitoringDestination$Builder(Monitoring$1 monitoring$1) {
        this();
    }

    public Monitoring$MonitoringDestination$Builder addAllMetrics(Iterable iterable) {
        this.copyOnWrite();
        Monitoring$MonitoringDestination.access$600((Monitoring$MonitoringDestination)this.instance, iterable);
        return this;
    }

    public Monitoring$MonitoringDestination$Builder addMetrics(String string2) {
        this.copyOnWrite();
        Monitoring$MonitoringDestination.access$500((Monitoring$MonitoringDestination)this.instance, string2);
        return this;
    }

    public Monitoring$MonitoringDestination$Builder addMetricsBytes(ByteString byteString) {
        this.copyOnWrite();
        Monitoring$MonitoringDestination.access$800((Monitoring$MonitoringDestination)this.instance, byteString);
        return this;
    }

    public Monitoring$MonitoringDestination$Builder clearMetrics() {
        this.copyOnWrite();
        Monitoring$MonitoringDestination.access$700((Monitoring$MonitoringDestination)this.instance);
        return this;
    }

    public Monitoring$MonitoringDestination$Builder clearMonitoredResource() {
        this.copyOnWrite();
        Monitoring$MonitoringDestination.access$200((Monitoring$MonitoringDestination)this.instance);
        return this;
    }

    public String getMetrics(int n3) {
        return ((Monitoring$MonitoringDestination)this.instance).getMetrics(n3);
    }

    public ByteString getMetricsBytes(int n3) {
        return ((Monitoring$MonitoringDestination)this.instance).getMetricsBytes(n3);
    }

    public int getMetricsCount() {
        return ((Monitoring$MonitoringDestination)this.instance).getMetricsCount();
    }

    public List getMetricsList() {
        return Collections.unmodifiableList(((Monitoring$MonitoringDestination)this.instance).getMetricsList());
    }

    public String getMonitoredResource() {
        return ((Monitoring$MonitoringDestination)this.instance).getMonitoredResource();
    }

    public ByteString getMonitoredResourceBytes() {
        return ((Monitoring$MonitoringDestination)this.instance).getMonitoredResourceBytes();
    }

    public Monitoring$MonitoringDestination$Builder setMetrics(int n3, String string2) {
        this.copyOnWrite();
        Monitoring$MonitoringDestination.access$400((Monitoring$MonitoringDestination)this.instance, n3, string2);
        return this;
    }

    public Monitoring$MonitoringDestination$Builder setMonitoredResource(String string2) {
        this.copyOnWrite();
        Monitoring$MonitoringDestination.access$100((Monitoring$MonitoringDestination)this.instance, string2);
        return this;
    }

    public Monitoring$MonitoringDestination$Builder setMonitoredResourceBytes(ByteString byteString) {
        this.copyOnWrite();
        Monitoring$MonitoringDestination.access$300((Monitoring$MonitoringDestination)this.instance, byteString);
        return this;
    }
}

