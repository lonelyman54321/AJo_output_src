/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.common;

public final class DeliveryMechanism
extends Enum {
    private static final /* synthetic */ DeliveryMechanism[] $VALUES;
    public static final /* enum */ DeliveryMechanism APP_STORE;
    public static final /* enum */ DeliveryMechanism DEVELOPER;
    public static final /* enum */ DeliveryMechanism TEST_DISTRIBUTION;
    public static final /* enum */ DeliveryMechanism USER_SIDELOAD;
    private final int id;

    private static /* synthetic */ DeliveryMechanism[] $values() {
        DeliveryMechanism deliveryMechanism = DEVELOPER;
        deliveryMechanism = USER_SIDELOAD;
        deliveryMechanism = TEST_DISTRIBUTION;
        deliveryMechanism = APP_STORE;
        DeliveryMechanism[] deliveryMechanismArray = new DeliveryMechanism[]{deliveryMechanism, deliveryMechanism, deliveryMechanism, deliveryMechanism};
        return deliveryMechanismArray;
    }

    static {
        DeliveryMechanism deliveryMechanism;
        int n3 = 1;
        DEVELOPER = deliveryMechanism = new DeliveryMechanism("DEVELOPER", 0, n3);
        int n4 = 2;
        USER_SIDELOAD = deliveryMechanism = new DeliveryMechanism("USER_SIDELOAD", n3, n4);
        n3 = 3;
        TEST_DISTRIBUTION = deliveryMechanism = new DeliveryMechanism("TEST_DISTRIBUTION", n4, n3);
        APP_STORE = deliveryMechanism = new DeliveryMechanism("APP_STORE", n3, 4);
        $VALUES = DeliveryMechanism.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DeliveryMechanism() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.id = var3_2;
    }

    public static DeliveryMechanism determineFrom(String object) {
        object = object != null ? APP_STORE : DEVELOPER;
        return object;
    }

    public static DeliveryMechanism valueOf(String string2) {
        return Enum.valueOf(DeliveryMechanism.class, string2);
    }

    public static DeliveryMechanism[] values() {
        return (DeliveryMechanism[])$VALUES.clone();
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return Integer.toString(this.id);
    }
}

