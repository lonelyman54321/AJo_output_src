/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import com.affise.attribution.modules.subscription.AffiseProductType$Companion;

public final class AffiseProductType
extends Enum {
    private static final /* synthetic */ AffiseProductType[] $VALUES;
    public static final /* enum */ AffiseProductType CONSUMABLE;
    public static final AffiseProductType$Companion Companion;
    public static final /* enum */ AffiseProductType NON_CONSUMABLE;
    public static final /* enum */ AffiseProductType NON_RENEWABLE_SUBSCRIPTION;
    public static final /* enum */ AffiseProductType RENEWABLE_SUBSCRIPTION;
    private final String value;

    private static final /* synthetic */ AffiseProductType[] $values() {
        AffiseProductType affiseProductType = CONSUMABLE;
        affiseProductType = NON_CONSUMABLE;
        affiseProductType = RENEWABLE_SUBSCRIPTION;
        affiseProductType = NON_RENEWABLE_SUBSCRIPTION;
        AffiseProductType[] affiseProductTypeArray = new AffiseProductType[]{affiseProductType, affiseProductType, affiseProductType, affiseProductType};
        return affiseProductTypeArray;
    }

    static {
        Object object;
        CONSUMABLE = object = new AffiseProductType("CONSUMABLE", 0, "consumable");
        NON_CONSUMABLE = object = new AffiseProductType("NON_CONSUMABLE", 1, "non_consumable");
        RENEWABLE_SUBSCRIPTION = object = new AffiseProductType("RENEWABLE_SUBSCRIPTION", 2, "renewable_subscription");
        NON_RENEWABLE_SUBSCRIPTION = object = new AffiseProductType("NON_RENEWABLE_SUBSCRIPTION", 3, "non_renewable_subscription");
        $VALUES = AffiseProductType.$values();
        object = new AffiseProductType$Companion(null);
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AffiseProductType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static final AffiseProductType from(String string2) {
        return Companion.from(string2);
    }

    public static AffiseProductType valueOf(String string2) {
        return Enum.valueOf(AffiseProductType.class, string2);
    }

    public static AffiseProductType[] values() {
        return (AffiseProductType[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

