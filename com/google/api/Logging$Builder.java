/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Logging;
import com.google.api.Logging$1;
import com.google.api.Logging$LoggingDestination;
import com.google.api.Logging$LoggingDestination$Builder;
import com.google.api.LoggingOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Logging$Builder
extends GeneratedMessageLite$Builder
implements LoggingOrBuilder {
    private Logging$Builder() {
        Logging logging = Logging.access$1000();
        super(logging);
    }

    public /* synthetic */ Logging$Builder(Logging$1 logging$1) {
        this();
    }

    public Logging$Builder addAllConsumerDestinations(Iterable iterable) {
        this.copyOnWrite();
        Logging.access$2000((Logging)this.instance, iterable);
        return this;
    }

    public Logging$Builder addAllProducerDestinations(Iterable iterable) {
        this.copyOnWrite();
        Logging.access$1400((Logging)this.instance, iterable);
        return this;
    }

    public Logging$Builder addConsumerDestinations(int n3, Logging$LoggingDestination$Builder logging$LoggingDestinationOrBuilder) {
        this.copyOnWrite();
        Logging logging = (Logging)this.instance;
        logging$LoggingDestinationOrBuilder = (Logging$LoggingDestination)logging$LoggingDestinationOrBuilder.build();
        Logging.access$1900(logging, n3, (Logging$LoggingDestination)logging$LoggingDestinationOrBuilder);
        return this;
    }

    public Logging$Builder addConsumerDestinations(int n3, Logging$LoggingDestination logging$LoggingDestination) {
        this.copyOnWrite();
        Logging.access$1900((Logging)this.instance, n3, logging$LoggingDestination);
        return this;
    }

    public Logging$Builder addConsumerDestinations(Logging$LoggingDestination$Builder logging$LoggingDestinationOrBuilder) {
        this.copyOnWrite();
        Logging logging = (Logging)this.instance;
        logging$LoggingDestinationOrBuilder = (Logging$LoggingDestination)logging$LoggingDestinationOrBuilder.build();
        Logging.access$1800(logging, (Logging$LoggingDestination)logging$LoggingDestinationOrBuilder);
        return this;
    }

    public Logging$Builder addConsumerDestinations(Logging$LoggingDestination logging$LoggingDestination) {
        this.copyOnWrite();
        Logging.access$1800((Logging)this.instance, logging$LoggingDestination);
        return this;
    }

    public Logging$Builder addProducerDestinations(int n3, Logging$LoggingDestination$Builder logging$LoggingDestinationOrBuilder) {
        this.copyOnWrite();
        Logging logging = (Logging)this.instance;
        logging$LoggingDestinationOrBuilder = (Logging$LoggingDestination)logging$LoggingDestinationOrBuilder.build();
        Logging.access$1300(logging, n3, (Logging$LoggingDestination)logging$LoggingDestinationOrBuilder);
        return this;
    }

    public Logging$Builder addProducerDestinations(int n3, Logging$LoggingDestination logging$LoggingDestination) {
        this.copyOnWrite();
        Logging.access$1300((Logging)this.instance, n3, logging$LoggingDestination);
        return this;
    }

    public Logging$Builder addProducerDestinations(Logging$LoggingDestination$Builder logging$LoggingDestinationOrBuilder) {
        this.copyOnWrite();
        Logging logging = (Logging)this.instance;
        logging$LoggingDestinationOrBuilder = (Logging$LoggingDestination)logging$LoggingDestinationOrBuilder.build();
        Logging.access$1200(logging, (Logging$LoggingDestination)logging$LoggingDestinationOrBuilder);
        return this;
    }

    public Logging$Builder addProducerDestinations(Logging$LoggingDestination logging$LoggingDestination) {
        this.copyOnWrite();
        Logging.access$1200((Logging)this.instance, logging$LoggingDestination);
        return this;
    }

    public Logging$Builder clearConsumerDestinations() {
        this.copyOnWrite();
        Logging.access$2100((Logging)this.instance);
        return this;
    }

    public Logging$Builder clearProducerDestinations() {
        this.copyOnWrite();
        Logging.access$1500((Logging)this.instance);
        return this;
    }

    public Logging$LoggingDestination getConsumerDestinations(int n3) {
        return ((Logging)this.instance).getConsumerDestinations(n3);
    }

    public int getConsumerDestinationsCount() {
        return ((Logging)this.instance).getConsumerDestinationsCount();
    }

    public List getConsumerDestinationsList() {
        return Collections.unmodifiableList(((Logging)this.instance).getConsumerDestinationsList());
    }

    public Logging$LoggingDestination getProducerDestinations(int n3) {
        return ((Logging)this.instance).getProducerDestinations(n3);
    }

    public int getProducerDestinationsCount() {
        return ((Logging)this.instance).getProducerDestinationsCount();
    }

    public List getProducerDestinationsList() {
        return Collections.unmodifiableList(((Logging)this.instance).getProducerDestinationsList());
    }

    public Logging$Builder removeConsumerDestinations(int n3) {
        this.copyOnWrite();
        Logging.access$2200((Logging)this.instance, n3);
        return this;
    }

    public Logging$Builder removeProducerDestinations(int n3) {
        this.copyOnWrite();
        Logging.access$1600((Logging)this.instance, n3);
        return this;
    }

    public Logging$Builder setConsumerDestinations(int n3, Logging$LoggingDestination$Builder logging$LoggingDestinationOrBuilder) {
        this.copyOnWrite();
        Logging logging = (Logging)this.instance;
        logging$LoggingDestinationOrBuilder = (Logging$LoggingDestination)logging$LoggingDestinationOrBuilder.build();
        Logging.access$1700(logging, n3, (Logging$LoggingDestination)logging$LoggingDestinationOrBuilder);
        return this;
    }

    public Logging$Builder setConsumerDestinations(int n3, Logging$LoggingDestination logging$LoggingDestination) {
        this.copyOnWrite();
        Logging.access$1700((Logging)this.instance, n3, logging$LoggingDestination);
        return this;
    }

    public Logging$Builder setProducerDestinations(int n3, Logging$LoggingDestination$Builder logging$LoggingDestinationOrBuilder) {
        this.copyOnWrite();
        Logging logging = (Logging)this.instance;
        logging$LoggingDestinationOrBuilder = (Logging$LoggingDestination)logging$LoggingDestinationOrBuilder.build();
        Logging.access$1100(logging, n3, (Logging$LoggingDestination)logging$LoggingDestinationOrBuilder);
        return this;
    }

    public Logging$Builder setProducerDestinations(int n3, Logging$LoggingDestination logging$LoggingDestination) {
        this.copyOnWrite();
        Logging.access$1100((Logging)this.instance, n3, logging$LoggingDestination);
        return this;
    }
}

