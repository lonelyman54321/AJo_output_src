/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.Billing$BillingDestination;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface BillingOrBuilder
extends MessageLiteOrBuilder {
    public Billing.BillingDestination getConsumerDestinations(int var1);

    public int getConsumerDestinationsCount();

    public List getConsumerDestinationsList();
}

