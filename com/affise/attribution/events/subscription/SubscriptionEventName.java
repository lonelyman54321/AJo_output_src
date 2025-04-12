/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.subscription;

import com.affise.attribution.events.subscription.SubscriptionEventName$Companion;

public final class SubscriptionEventName
extends Enum {
    private static final /* synthetic */ SubscriptionEventName[] $VALUES;
    public static final /* enum */ SubscriptionEventName AFFISE_SUBSCRIPTION_ACTIVATION;
    public static final /* enum */ SubscriptionEventName AFFISE_SUBSCRIPTION_CANCELLATION;
    public static final /* enum */ SubscriptionEventName AFFISE_SUBSCRIPTION_ENTERED_BILLING_RETRY;
    public static final /* enum */ SubscriptionEventName AFFISE_SUBSCRIPTION_FIRST_CONVERSION;
    public static final /* enum */ SubscriptionEventName AFFISE_SUBSCRIPTION_REACTIVATION;
    public static final /* enum */ SubscriptionEventName AFFISE_SUBSCRIPTION_RENEWAL;
    public static final /* enum */ SubscriptionEventName AFFISE_SUBSCRIPTION_RENEWAL_FROM_BILLING_RETRY;
    public static final /* enum */ SubscriptionEventName AFFISE_UNSUBSCRIPTION;
    public static final SubscriptionEventName$Companion Companion;
    private final String eventName;

    private static final /* synthetic */ SubscriptionEventName[] $values() {
        SubscriptionEventName subscriptionEventName = AFFISE_SUBSCRIPTION_ACTIVATION;
        subscriptionEventName = AFFISE_SUBSCRIPTION_CANCELLATION;
        subscriptionEventName = AFFISE_SUBSCRIPTION_ENTERED_BILLING_RETRY;
        subscriptionEventName = AFFISE_SUBSCRIPTION_FIRST_CONVERSION;
        subscriptionEventName = AFFISE_SUBSCRIPTION_REACTIVATION;
        subscriptionEventName = AFFISE_SUBSCRIPTION_RENEWAL;
        subscriptionEventName = AFFISE_SUBSCRIPTION_RENEWAL_FROM_BILLING_RETRY;
        subscriptionEventName = AFFISE_UNSUBSCRIPTION;
        SubscriptionEventName[] subscriptionEventNameArray = new SubscriptionEventName[]{subscriptionEventName, subscriptionEventName, subscriptionEventName, subscriptionEventName, subscriptionEventName, subscriptionEventName, subscriptionEventName, subscriptionEventName};
        return subscriptionEventNameArray;
    }

    static {
        Object object;
        AFFISE_SUBSCRIPTION_ACTIVATION = object = new SubscriptionEventName("AFFISE_SUBSCRIPTION_ACTIVATION", 0, "affise_subscription_activation");
        AFFISE_SUBSCRIPTION_CANCELLATION = object = new SubscriptionEventName("AFFISE_SUBSCRIPTION_CANCELLATION", 1, "affise_subscription_cancellation");
        AFFISE_SUBSCRIPTION_ENTERED_BILLING_RETRY = object = new SubscriptionEventName("AFFISE_SUBSCRIPTION_ENTERED_BILLING_RETRY", 2, "affise_subscription_entered_billing_retry");
        AFFISE_SUBSCRIPTION_FIRST_CONVERSION = object = new SubscriptionEventName("AFFISE_SUBSCRIPTION_FIRST_CONVERSION", 3, "affise_subscription_first_conversion");
        AFFISE_SUBSCRIPTION_REACTIVATION = object = new SubscriptionEventName("AFFISE_SUBSCRIPTION_REACTIVATION", 4, "affise_subscription_reactivation");
        AFFISE_SUBSCRIPTION_RENEWAL = object = new SubscriptionEventName("AFFISE_SUBSCRIPTION_RENEWAL", 5, "affise_subscription_renewal");
        AFFISE_SUBSCRIPTION_RENEWAL_FROM_BILLING_RETRY = object = new SubscriptionEventName("AFFISE_SUBSCRIPTION_RENEWAL_FROM_BILLING_RETRY", 6, "affise_subscription_renewal_from_billing_retry");
        AFFISE_UNSUBSCRIPTION = object = new SubscriptionEventName("AFFISE_UNSUBSCRIPTION", 7, "affise_unsubscription");
        $VALUES = SubscriptionEventName.$values();
        object = new SubscriptionEventName$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SubscriptionEventName() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.eventName = var3_2;
    }

    public static final SubscriptionEventName from(String string2) {
        return Companion.from(string2);
    }

    public static SubscriptionEventName valueOf(String string2) {
        return Enum.valueOf(SubscriptionEventName.class, string2);
    }

    public static SubscriptionEventName[] values() {
        return (SubscriptionEventName[])$VALUES.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }
}

