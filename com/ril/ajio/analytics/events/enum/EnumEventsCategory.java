/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics.events.enum;

public final class EnumEventsCategory
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ EnumEventsCategory[] $VALUES;
    public static final /* enum */ EnumEventsCategory PLP_INTERACTION;
    private final String value;

    private static final /* synthetic */ EnumEventsCategory[] $values() {
        EnumEventsCategory enumEventsCategory = PLP_INTERACTION;
        EnumEventsCategory[] enumEventsCategoryArray = new EnumEventsCategory[]{enumEventsCategory};
        return enumEventsCategoryArray;
    }

    static {
        Enum[] enumArray = new EnumEventsCategory("PLP_INTERACTION", 0, "plp_interaction");
        PLP_INTERACTION = enumArray;
        enumArray = EnumEventsCategory.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private EnumEventsCategory() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static EnumEventsCategory valueOf(String string2) {
        return Enum.valueOf(EnumEventsCategory.class, string2);
    }

    public static EnumEventsCategory[] values() {
        return (EnumEventsCategory[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

