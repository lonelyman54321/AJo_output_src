/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.subscription;

public final class SubscriptionParameters {
    public static final String AFFISE_SUBSCRIPTION_EVENT_TYPE_KEY = "affise_event_type";
    public static final SubscriptionParameters INSTANCE;

    static {
        SubscriptionParameters subscriptionParameters;
        INSTANCE = subscriptionParameters = new SubscriptionParameters();
    }

    private SubscriptionParameters() {
    }
}

