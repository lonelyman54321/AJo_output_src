/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Logging$LoggingDestination;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface LoggingOrBuilder
extends MessageLiteOrBuilder {
    public Logging.LoggingDestination getConsumerDestinations(int var1);

    public int getConsumerDestinationsCount();

    public List getConsumerDestinationsList();

    public Logging.LoggingDestination getProducerDestinations(int var1);

    public int getProducerDestinationsCount();

    public List getProducerDestinationsList();
}

