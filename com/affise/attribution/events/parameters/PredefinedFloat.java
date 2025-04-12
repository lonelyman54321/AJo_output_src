/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.events.parameters;

import com.affise.attribution.events.parameters.Predefined;
import com.affise.attribution.events.parameters.PredefinedFloat$Companion;

public final class PredefinedFloat
extends Enum
implements Predefined {
    private static final /* synthetic */ PredefinedFloat[] $VALUES;
    public static final PredefinedFloat$Companion Companion;
    public static final /* enum */ PredefinedFloat LAT;
    public static final /* enum */ PredefinedFloat LONG;
    public static final /* enum */ PredefinedFloat PREFERRED_PRICE_RANGE;
    public static final /* enum */ PredefinedFloat PRICE;
    public static final /* enum */ PredefinedFloat REVENUE;
    private final String value;

    private static final /* synthetic */ PredefinedFloat[] $values() {
        PredefinedFloat predefinedFloat = PREFERRED_PRICE_RANGE;
        predefinedFloat = PRICE;
        predefinedFloat = REVENUE;
        predefinedFloat = LAT;
        predefinedFloat = LONG;
        PredefinedFloat[] predefinedFloatArray = new PredefinedFloat[]{predefinedFloat, predefinedFloat, predefinedFloat, predefinedFloat, predefinedFloat};
        return predefinedFloatArray;
    }

    static {
        Object object = new PredefinedFloat("PREFERRED_PRICE_RANGE", 0, "preferred_price_range");
        PREFERRED_PRICE_RANGE = object;
        object = new PredefinedFloat("PRICE", 1, "price");
        PRICE = object;
        object = new PredefinedFloat("REVENUE", 2, "revenue");
        REVENUE = object;
        object = new PredefinedFloat("LAT", 3, "lat");
        LAT = object;
        object = new PredefinedFloat("LONG", 4, "long");
        LONG = object;
        $VALUES = PredefinedFloat.$values();
        Companion = object = new PredefinedFloat$Companion(null);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PredefinedFloat() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static final /* synthetic */ String access$getValue$p(PredefinedFloat predefinedFloat) {
        return predefinedFloat.value;
    }

    public static final PredefinedFloat from(String string2) {
        return Companion.from(string2);
    }

    public static PredefinedFloat valueOf(String string2) {
        return Enum.valueOf(PredefinedFloat.class, string2);
    }

    public static PredefinedFloat[] values() {
        return (PredefinedFloat[])$VALUES.clone();
    }

    public String value() {
        StringBuilder stringBuilder = new StringBuilder("affise_p_");
        String string2 = this.value;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

