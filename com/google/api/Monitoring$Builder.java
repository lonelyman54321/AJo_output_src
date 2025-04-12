/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Monitoring;
import com.google.api.Monitoring$1;
import com.google.api.Monitoring$MonitoringDestination;
import com.google.api.Monitoring$MonitoringDestination$Builder;
import com.google.api.MonitoringOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Monitoring$Builder
extends GeneratedMessageLite$Builder
implements MonitoringOrBuilder {
    private Monitoring$Builder() {
        Monitoring monitoring = Monitoring.access$1000();
        super(monitoring);
    }

    public /* synthetic */ Monitoring$Builder(Monitoring$1 monitoring$1) {
        this();
    }

    public Monitoring$Builder addAllConsumerDestinations(Iterable iterable) {
        this.copyOnWrite();
        Monitoring.access$2000((Monitoring)this.instance, iterable);
        return this;
    }

    public Monitoring$Builder addAllProducerDestinations(Iterable iterable) {
        this.copyOnWrite();
        Monitoring.access$1400((Monitoring)this.instance, iterable);
        return this;
    }

    public Monitoring$Builder addConsumerDestinations(int n3, Monitoring$MonitoringDestination$Builder monitoring$MonitoringDestinationOrBuilder) {
        this.copyOnWrite();
        Monitoring monitoring = (Monitoring)this.instance;
        monitoring$MonitoringDestinationOrBuilder = (Monitoring$MonitoringDestination)monitoring$MonitoringDestinationOrBuilder.build();
        Monitoring.access$1900(monitoring, n3, (Monitoring$MonitoringDestination)monitoring$MonitoringDestinationOrBuilder);
        return this;
    }

    public Monitoring$Builder addConsumerDestinations(int n3, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        this.copyOnWrite();
        Monitoring.access$1900((Monitoring)this.instance, n3, monitoring$MonitoringDestination);
        return this;
    }

    public Monitoring$Builder addConsumerDestinations(Monitoring$MonitoringDestination$Builder monitoring$MonitoringDestinationOrBuilder) {
        this.copyOnWrite();
        Monitoring monitoring = (Monitoring)this.instance;
        monitoring$MonitoringDestinationOrBuilder = (Monitoring$MonitoringDestination)monitoring$MonitoringDestinationOrBuilder.build();
        Monitoring.access$1800(monitoring, (Monitoring$MonitoringDestination)monitoring$MonitoringDestinationOrBuilder);
        return this;
    }

    public Monitoring$Builder addConsumerDestinations(Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        this.copyOnWrite();
        Monitoring.access$1800((Monitoring)this.instance, monitoring$MonitoringDestination);
        return this;
    }

    public Monitoring$Builder addProducerDestinations(int n3, Monitoring$MonitoringDestination$Builder monitoring$MonitoringDestinationOrBuilder) {
        this.copyOnWrite();
        Monitoring monitoring = (Monitoring)this.instance;
        monitoring$MonitoringDestinationOrBuilder = (Monitoring$MonitoringDestination)monitoring$MonitoringDestinationOrBuilder.build();
        Monitoring.access$1300(monitoring, n3, (Monitoring$MonitoringDestination)monitoring$MonitoringDestinationOrBuilder);
        return this;
    }

    public Monitoring$Builder addProducerDestinations(int n3, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        this.copyOnWrite();
        Monitoring.access$1300((Monitoring)this.instance, n3, monitoring$MonitoringDestination);
        return this;
    }

    public Monitoring$Builder addProducerDestinations(Monitoring$MonitoringDestination$Builder monitoring$MonitoringDestinationOrBuilder) {
        this.copyOnWrite();
        Monitoring monitoring = (Monitoring)this.instance;
        monitoring$MonitoringDestinationOrBuilder = (Monitoring$MonitoringDestination)monitoring$MonitoringDestinationOrBuilder.build();
        Monitoring.access$1200(monitoring, (Monitoring$MonitoringDestination)monitoring$MonitoringDestinationOrBuilder);
        return this;
    }

    public Monitoring$Builder addProducerDestinations(Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        this.copyOnWrite();
        Monitoring.access$1200((Monitoring)this.instance, monitoring$MonitoringDestination);
        return this;
    }

    public Monitoring$Builder clearConsumerDestinations() {
        this.copyOnWrite();
        Monitoring.access$2100((Monitoring)this.instance);
        return this;
    }

    public Monitoring$Builder clearProducerDestinations() {
        this.copyOnWrite();
        Monitoring.access$1500((Monitoring)this.instance);
        return this;
    }

    public Monitoring$MonitoringDestination getConsumerDestinations(int n3) {
        return ((Monitoring)this.instance).getConsumerDestinations(n3);
    }

    public int getConsumerDestinationsCount() {
        return ((Monitoring)this.instance).getConsumerDestinationsCount();
    }

    public List getConsumerDestinationsList() {
        return Collections.unmodifiableList(((Monitoring)this.instance).getConsumerDestinationsList());
    }

    public Monitoring$MonitoringDestination getProducerDestinations(int n3) {
        return ((Monitoring)this.instance).getProducerDestinations(n3);
    }

    public int getProducerDestinationsCount() {
        return ((Monitoring)this.instance).getProducerDestinationsCount();
    }

    public List getProducerDestinationsList() {
        return Collections.unmodifiableList(((Monitoring)this.instance).getProducerDestinationsList());
    }

    public Monitoring$Builder removeConsumerDestinations(int n3) {
        this.copyOnWrite();
        Monitoring.access$2200((Monitoring)this.instance, n3);
        return this;
    }

    public Monitoring$Builder removeProducerDestinations(int n3) {
        this.copyOnWrite();
        Monitoring.access$1600((Monitoring)this.instance, n3);
        return this;
    }

    public Monitoring$Builder setConsumerDestinations(int n3, Monitoring$MonitoringDestination$Builder monitoring$MonitoringDestinationOrBuilder) {
        this.copyOnWrite();
        Monitoring monitoring = (Monitoring)this.instance;
        monitoring$MonitoringDestinationOrBuilder = (Monitoring$MonitoringDestination)monitoring$MonitoringDestinationOrBuilder.build();
        Monitoring.access$1700(monitoring, n3, (Monitoring$MonitoringDestination)monitoring$MonitoringDestinationOrBuilder);
        return this;
    }

    public Monitoring$Builder setConsumerDestinations(int n3, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        this.copyOnWrite();
        Monitoring.access$1700((Monitoring)this.instance, n3, monitoring$MonitoringDestination);
        return this;
    }

    public Monitoring$Builder setProducerDestinations(int n3, Monitoring$MonitoringDestination$Builder monitoring$MonitoringDestinationOrBuilder) {
        this.copyOnWrite();
        Monitoring monitoring = (Monitoring)this.instance;
        monitoring$MonitoringDestinationOrBuilder = (Monitoring$MonitoringDestination)monitoring$MonitoringDestinationOrBuilder.build();
        Monitoring.access$1100(monitoring, n3, (Monitoring$MonitoringDestination)monitoring$MonitoringDestinationOrBuilder);
        return this;
    }

    public Monitoring$Builder setProducerDestinations(int n3, Monitoring$MonitoringDestination monitoring$MonitoringDestination) {
        this.copyOnWrite();
        Monitoring.access$1100((Monitoring)this.instance, n3, monitoring$MonitoringDestination);
        return this;
    }
}

