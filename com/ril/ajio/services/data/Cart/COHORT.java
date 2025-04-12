/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

public final class COHORT
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ COHORT[] $VALUES;
    public static final /* enum */ COHORT BAD;
    public static final /* enum */ COHORT GOOD;

    private static final /* synthetic */ COHORT[] $values() {
        COHORT cOHORT = GOOD;
        cOHORT = BAD;
        COHORT[] cOHORTArray = new COHORT[]{cOHORT, cOHORT};
        return cOHORTArray;
    }

    static {
        Enum[] enumArray = new COHORT("GOOD", 0);
        GOOD = enumArray;
        enumArray = new COHORT("BAD", 1);
        BAD = enumArray;
        enumArray = COHORT.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private COHORT() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static COHORT valueOf(String string2) {
        return Enum.valueOf(COHORT.class, string2);
    }

    public static COHORT[] values() {
        return (COHORT[])$VALUES.clone();
    }
}

