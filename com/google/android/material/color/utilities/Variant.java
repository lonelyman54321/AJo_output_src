/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

public final class Variant
extends Enum {
    private static final /* synthetic */ Variant[] $VALUES;
    public static final /* enum */ Variant CONTENT;
    public static final /* enum */ Variant EXPRESSIVE;
    public static final /* enum */ Variant FIDELITY;
    public static final /* enum */ Variant FRUIT_SALAD;
    public static final /* enum */ Variant MONOCHROME;
    public static final /* enum */ Variant NEUTRAL;
    public static final /* enum */ Variant RAINBOW;
    public static final /* enum */ Variant TONAL_SPOT;
    public static final /* enum */ Variant VIBRANT;

    static {
        Variant variant;
        Variant variant2;
        Variant variant3;
        Variant variant4;
        Variant variant5;
        Variant variant6;
        Variant variant7;
        Variant variant8;
        Variant variant9;
        MONOCHROME = variant9 = new Variant("MONOCHROME", 0);
        int n3 = 1;
        NEUTRAL = variant8 = new Variant("NEUTRAL", n3);
        int n4 = 2;
        TONAL_SPOT = variant7 = new Variant("TONAL_SPOT", n4);
        int n7 = 3;
        VIBRANT = variant6 = new Variant("VIBRANT", n7);
        int n8 = 4;
        EXPRESSIVE = variant5 = new Variant("EXPRESSIVE", n8);
        FIDELITY = variant4 = new Variant("FIDELITY", 5);
        CONTENT = variant3 = new Variant("CONTENT", 6);
        RAINBOW = variant2 = new Variant("RAINBOW", 7);
        int n10 = 8;
        FRUIT_SALAD = variant = new Variant("FRUIT_SALAD", n10);
        Variant[] variantArray = new Variant[9];
        variantArray[0] = variant9;
        variantArray[n3] = variant8;
        variantArray[n4] = variant7;
        variantArray[n7] = variant6;
        variantArray[n8] = variant5;
        variantArray[5] = variant4;
        variantArray[6] = variant3;
        variantArray[7] = variant2;
        variantArray[n10] = variant;
        $VALUES = variantArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Variant() {
        void var2_-1;
        void var1_-1;
    }

    public static Variant valueOf(String string2) {
        return Enum.valueOf(Variant.class, string2);
    }

    public static Variant[] values() {
        return (Variant[])$VALUES.clone();
    }
}

