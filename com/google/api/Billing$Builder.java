/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Billing;
import com.google.api.Billing$1;
import com.google.api.Billing$BillingDestination;
import com.google.api.Billing$BillingDestination$Builder;
import com.google.api.BillingOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Collections;
import java.util.List;

public final class Billing$Builder
extends GeneratedMessageLite$Builder
implements BillingOrBuilder {
    private Billing$Builder() {
        Billing billing = Billing.access$1000();
        super(billing);
    }

    public /* synthetic */ Billing$Builder(Billing$1 billing$1) {
        this();
    }

    public Billing$Builder addAllConsumerDestinations(Iterable iterable) {
        this.copyOnWrite();
        Billing.access$1400((Billing)this.instance, iterable);
        return this;
    }

    public Billing$Builder addConsumerDestinations(int n3, Billing$BillingDestination$Builder billing$BillingDestinationOrBuilder) {
        this.copyOnWrite();
        Billing billing = (Billing)this.instance;
        billing$BillingDestinationOrBuilder = (Billing$BillingDestination)billing$BillingDestinationOrBuilder.build();
        Billing.access$1300(billing, n3, (Billing$BillingDestination)billing$BillingDestinationOrBuilder);
        return this;
    }

    public Billing$Builder addConsumerDestinations(int n3, Billing$BillingDestination billing$BillingDestination) {
        this.copyOnWrite();
        Billing.access$1300((Billing)this.instance, n3, billing$BillingDestination);
        return this;
    }

    public Billing$Builder addConsumerDestinations(Billing$BillingDestination$Builder billing$BillingDestinationOrBuilder) {
        this.copyOnWrite();
        Billing billing = (Billing)this.instance;
        billing$BillingDestinationOrBuilder = (Billing$BillingDestination)billing$BillingDestinationOrBuilder.build();
        Billing.access$1200(billing, (Billing$BillingDestination)billing$BillingDestinationOrBuilder);
        return this;
    }

    public Billing$Builder addConsumerDestinations(Billing$BillingDestination billing$BillingDestination) {
        this.copyOnWrite();
        Billing.access$1200((Billing)this.instance, billing$BillingDestination);
        return this;
    }

    public Billing$Builder clearConsumerDestinations() {
        this.copyOnWrite();
        Billing.access$1500((Billing)this.instance);
        return this;
    }

    public Billing$BillingDestination getConsumerDestinations(int n3) {
        return ((Billing)this.instance).getConsumerDestinations(n3);
    }

    public int getConsumerDestinationsCount() {
        return ((Billing)this.instance).getConsumerDestinationsCount();
    }

    public List getConsumerDestinationsList() {
        return Collections.unmodifiableList(((Billing)this.instance).getConsumerDestinationsList());
    }

    public Billing$Builder removeConsumerDestinations(int n3) {
        this.copyOnWrite();
        Billing.access$1600((Billing)this.instance, n3);
        return this;
    }

    public Billing$Builder setConsumerDestinations(int n3, Billing$BillingDestination$Builder billing$BillingDestinationOrBuilder) {
        this.copyOnWrite();
        Billing billing = (Billing)this.instance;
        billing$BillingDestinationOrBuilder = (Billing$BillingDestination)billing$BillingDestinationOrBuilder.build();
        Billing.access$1100(billing, n3, (Billing$BillingDestination)billing$BillingDestinationOrBuilder);
        return this;
    }

    public Billing$Builder setConsumerDestinations(int n3, Billing$BillingDestination billing$BillingDestination) {
        this.copyOnWrite();
        Billing.access$1100((Billing)this.instance, n3, billing$BillingDestination);
        return this;
    }
}

