/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Monitoring$MonitoringDestination;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface MonitoringOrBuilder
extends MessageLiteOrBuilder {
    public Monitoring.MonitoringDestination getConsumerDestinations(int var1);

    public int getConsumerDestinationsCount();

    public List getConsumerDestinationsList();

    public Monitoring.MonitoringDestination getProducerDestinations(int var1);

    public int getProducerDestinationsCount();

    public List getProducerDestinationsList();
}

