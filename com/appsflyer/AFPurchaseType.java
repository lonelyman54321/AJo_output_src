/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

public final class AFPurchaseType
extends Enum {
    public static final /* enum */ AFPurchaseType ONE_TIME_PURCHASE;
    public static final /* enum */ AFPurchaseType SUBSCRIPTION;
    private static final /* synthetic */ AFPurchaseType[] getMonetizationNetwork;
    private final String value;

    static {
        AFPurchaseType aFPurchaseType;
        AFPurchaseType aFPurchaseType2;
        SUBSCRIPTION = aFPurchaseType2 = new AFPurchaseType("SUBSCRIPTION", 0, "subscription");
        int n3 = 1;
        ONE_TIME_PURCHASE = aFPurchaseType = new AFPurchaseType("ONE_TIME_PURCHASE", n3, "one_time_purchase");
        AFPurchaseType[] aFPurchaseTypeArray = new AFPurchaseType[2];
        aFPurchaseTypeArray[0] = aFPurchaseType2;
        aFPurchaseTypeArray[n3] = aFPurchaseType;
        getMonetizationNetwork = aFPurchaseTypeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFPurchaseType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static AFPurchaseType valueOf(String string2) {
        return Enum.valueOf(AFPurchaseType.class, string2);
    }

    public static AFPurchaseType[] values() {
        return (AFPurchaseType[])getMonetizationNetwork.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

