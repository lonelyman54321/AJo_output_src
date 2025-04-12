/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Billing$1;
import com.google.api.Billing$BillingDestination;
import com.google.api.Billing$BillingDestinationOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Billing$BillingDestination$Builder
extends GeneratedMessageLite$Builder
implements Billing$BillingDestinationOrBuilder {
    private Billing$BillingDestination$Builder() {
        Billing$BillingDestination billing$BillingDestination = Billing$BillingDestination.access$000();
        super(billing$BillingDestination);
    }

    public /* synthetic */ Billing$BillingDestination$Builder(Billing$1 billing$1) {
        this();
    }

    public Billing$BillingDestination$Builder addAllMetrics(Iterable iterable) {
        this.copyOnWrite();
        Billing$BillingDestination.access$600((Billing$BillingDestination)this.instance, iterable);
        return this;
    }

    public Billing$BillingDestination$Builder addMetrics(String string2) {
        this.copyOnWrite();
        Billing$BillingDestination.access$500((Billing$BillingDestination)this.instance, string2);
        return this;
    }

    public Billing$BillingDestination$Builder addMetricsBytes(ByteString byteString) {
        this.copyOnWrite();
        Billing$BillingDestination.access$800((Billing$BillingDestination)this.instance, byteString);
        return this;
    }

    public Billing$BillingDestination$Builder clearMetrics() {
        this.copyOnWrite();
        Billing$BillingDestination.access$700((Billing$BillingDestination)this.instance);
        return this;
    }

    public Billing$BillingDestination$Builder clearMonitoredResource() {
        this.copyOnWrite();
        Billing$BillingDestination.access$200((Billing$BillingDestination)this.instance);
        return this;
    }

    public String getMetrics(int n3) {
        return ((Billing$BillingDestination)this.instance).getMetrics(n3);
    }

    public ByteString getMetricsBytes(int n3) {
        return ((Billing$BillingDestination)this.instance).getMetricsBytes(n3);
    }

    public int getMetricsCount() {
        return ((Billing$BillingDestination)this.instance).getMetricsCount();
    }

    public List getMetricsList() {
        return Collections.unmodifiableList(((Billing$BillingDestination)this.instance).getMetricsList());
    }

    public String getMonitoredResource() {
        return ((Billing$BillingDestination)this.instance).getMonitoredResource();
    }

    public ByteString getMonitoredResourceBytes() {
        return ((Billing$BillingDestination)this.instance).getMonitoredResourceBytes();
    }

    public Billing$BillingDestination$Builder setMetrics(int n3, String string2) {
        this.copyOnWrite();
        Billing$BillingDestination.access$400((Billing$BillingDestination)this.instance, n3, string2);
        return this;
    }

    public Billing$BillingDestination$Builder setMonitoredResource(String string2) {
        this.copyOnWrite();
        Billing$BillingDestination.access$100((Billing$BillingDestination)this.instance, string2);
        return this;
    }

    public Billing$BillingDestination$Builder setMonitoredResourceBytes(ByteString byteString) {
        this.copyOnWrite();
        Billing$BillingDestination.access$300((Billing$BillingDestination)this.instance, byteString);
        return this;
    }
}

