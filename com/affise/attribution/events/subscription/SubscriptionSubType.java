/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.subscription;

import com.affise.attribution.events.subscription.SubscriptionSubType$Companion;

public final class SubscriptionSubType
extends Enum {
    private static final /* synthetic */ SubscriptionSubType[] $VALUES;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_CONVERTED_OFFER;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_CONVERTED_OFFER_FROM_RETRY;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_CONVERTED_TRIAL;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_CONVERTED_TRIAL_FROM_RETRY;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_FAILED_OFFERISE;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_FAILED_OFFER_FROM_RETRY;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_FAILED_SUBSCRIPTION;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_FAILED_SUBSCRIPTION_FROM_RETRY;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_FAILED_TRIAL;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_FAILED_TRIAL_FROM_RETRY;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_INITIAL_OFFER;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_INITIAL_SUBSCRIPTION;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_INITIAL_TRIAL;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_OFFER_IN_RETRY;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_REACTIVATED_SUBSCRIPTION;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_RENEWED_SUBSCRIPTION;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_RENEWED_SUBSCRIPTION_FROM_RETRY;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_SUBSCRIPTION_IN_RETRY;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_TRIAL_IN_RETRY;
    public static final /* enum */ SubscriptionSubType AFFISE_SUB_UNSUBSCRIPTION;
    public static final SubscriptionSubType$Companion Companion;
    private final String typeName;

    private static final /* synthetic */ SubscriptionSubType[] $values() {
        SubscriptionSubType subscriptionSubType = AFFISE_SUB_INITIAL_SUBSCRIPTION;
        subscriptionSubType = AFFISE_SUB_INITIAL_TRIAL;
        subscriptionSubType = AFFISE_SUB_INITIAL_OFFER;
        subscriptionSubType = AFFISE_SUB_FAILED_TRIAL;
        subscriptionSubType = AFFISE_SUB_FAILED_OFFERISE;
        subscriptionSubType = AFFISE_SUB_FAILED_SUBSCRIPTION;
        subscriptionSubType = AFFISE_SUB_FAILED_TRIAL_FROM_RETRY;
        subscriptionSubType = AFFISE_SUB_FAILED_OFFER_FROM_RETRY;
        subscriptionSubType = AFFISE_SUB_FAILED_SUBSCRIPTION_FROM_RETRY;
        subscriptionSubType = AFFISE_SUB_TRIAL_IN_RETRY;
        subscriptionSubType = AFFISE_SUB_OFFER_IN_RETRY;
        subscriptionSubType = AFFISE_SUB_SUBSCRIPTION_IN_RETRY;
        subscriptionSubType = AFFISE_SUB_CONVERTED_TRIAL;
        subscriptionSubType = AFFISE_SUB_CONVERTED_OFFER;
        subscriptionSubType = AFFISE_SUB_REACTIVATED_SUBSCRIPTION;
        subscriptionSubType = AFFISE_SUB_RENEWED_SUBSCRIPTION;
        subscriptionSubType = AFFISE_SUB_CONVERTED_TRIAL_FROM_RETRY;
        subscriptionSubType = AFFISE_SUB_CONVERTED_OFFER_FROM_RETRY;
        subscriptionSubType = AFFISE_SUB_RENEWED_SUBSCRIPTION_FROM_RETRY;
        subscriptionSubType = AFFISE_SUB_UNSUBSCRIPTION;
        SubscriptionSubType[] subscriptionSubTypeArray = new SubscriptionSubType[]{subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType, subscriptionSubType};
        return subscriptionSubTypeArray;
    }

    static {
        Object object;
        AFFISE_SUB_INITIAL_SUBSCRIPTION = object = new SubscriptionSubType("AFFISE_SUB_INITIAL_SUBSCRIPTION", 0, "affise_sub_initial_subscription");
        AFFISE_SUB_INITIAL_TRIAL = object = new SubscriptionSubType("AFFISE_SUB_INITIAL_TRIAL", 1, "affise_sub_initial_trial");
        AFFISE_SUB_INITIAL_OFFER = object = new SubscriptionSubType("AFFISE_SUB_INITIAL_OFFER", 2, "affise_sub_initial_offer");
        AFFISE_SUB_FAILED_TRIAL = object = new SubscriptionSubType("AFFISE_SUB_FAILED_TRIAL", 3, "affise_sub_failed_trial");
        AFFISE_SUB_FAILED_OFFERISE = object = new SubscriptionSubType("AFFISE_SUB_FAILED_OFFERISE", 4, "affise_sub_failed_offer");
        AFFISE_SUB_FAILED_SUBSCRIPTION = object = new SubscriptionSubType("AFFISE_SUB_FAILED_SUBSCRIPTION", 5, "affise_sub_failed_subscription");
        AFFISE_SUB_FAILED_TRIAL_FROM_RETRY = object = new SubscriptionSubType("AFFISE_SUB_FAILED_TRIAL_FROM_RETRY", 6, "affise_sub_failed_trial_from_retry");
        AFFISE_SUB_FAILED_OFFER_FROM_RETRY = object = new SubscriptionSubType("AFFISE_SUB_FAILED_OFFER_FROM_RETRY", 7, "affise_sub_failed_offer_from_retry");
        AFFISE_SUB_FAILED_SUBSCRIPTION_FROM_RETRY = object = new SubscriptionSubType("AFFISE_SUB_FAILED_SUBSCRIPTION_FROM_RETRY", 8, "affise_sub_failed_subscription_from_retry");
        AFFISE_SUB_TRIAL_IN_RETRY = object = new SubscriptionSubType("AFFISE_SUB_TRIAL_IN_RETRY", 9, "affise_sub_trial_in_retry");
        AFFISE_SUB_OFFER_IN_RETRY = object = new SubscriptionSubType("AFFISE_SUB_OFFER_IN_RETRY", 10, "affise_sub_offer_in_retry");
        AFFISE_SUB_SUBSCRIPTION_IN_RETRY = object = new SubscriptionSubType("AFFISE_SUB_SUBSCRIPTION_IN_RETRY", 11, "affise_sub_subscription_in_retry");
        AFFISE_SUB_CONVERTED_TRIAL = object = new SubscriptionSubType("AFFISE_SUB_CONVERTED_TRIAL", 12, "affise_sub_converted_trial");
        AFFISE_SUB_CONVERTED_OFFER = object = new SubscriptionSubType("AFFISE_SUB_CONVERTED_OFFER", 13, "affise_sub_converted_offer");
        AFFISE_SUB_REACTIVATED_SUBSCRIPTION = object = new SubscriptionSubType("AFFISE_SUB_REACTIVATED_SUBSCRIPTION", 14, "affise_sub_reactivated_subscription");
        AFFISE_SUB_RENEWED_SUBSCRIPTION = object = new SubscriptionSubType("AFFISE_SUB_RENEWED_SUBSCRIPTION", 15, "affise_sub_renewed_subscription");
        AFFISE_SUB_CONVERTED_TRIAL_FROM_RETRY = object = new SubscriptionSubType("AFFISE_SUB_CONVERTED_TRIAL_FROM_RETRY", 16, "affise_sub_converted_trial_from_retry");
        AFFISE_SUB_CONVERTED_OFFER_FROM_RETRY = object = new SubscriptionSubType("AFFISE_SUB_CONVERTED_OFFER_FROM_RETRY", 17, "affise_sub_converted_offer_from_retry");
        AFFISE_SUB_RENEWED_SUBSCRIPTION_FROM_RETRY = object = new SubscriptionSubType("AFFISE_SUB_RENEWED_SUBSCRIPTION_FROM_RETRY", 18, "affise_sub_renewed_subscription_from_retry");
        AFFISE_SUB_UNSUBSCRIPTION = object = new SubscriptionSubType("AFFISE_SUB_UNSUBSCRIPTION", 19, "affise_sub_unsubscription");
        $VALUES = SubscriptionSubType.$values();
        object = new SubscriptionSubType$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SubscriptionSubType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.typeName = var3_2;
    }

    public static final SubscriptionSubType from(String string2) {
        return Companion.from(string2);
    }

    public static SubscriptionSubType valueOf(String string2) {
        return Enum.valueOf(SubscriptionSubType.class, string2);
    }

    public static SubscriptionSubType[] values() {
        return (SubscriptionSubType[])$VALUES.clone();
    }

    public final String getTypeName() {
        return this.typeName;
    }
}

