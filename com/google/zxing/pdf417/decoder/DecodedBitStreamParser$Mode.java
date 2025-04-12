/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder;

final class DecodedBitStreamParser$Mode
extends Enum {
    private static final /* synthetic */ DecodedBitStreamParser$Mode[] $VALUES;
    public static final /* enum */ DecodedBitStreamParser$Mode ALPHA;
    public static final /* enum */ DecodedBitStreamParser$Mode ALPHA_SHIFT;
    public static final /* enum */ DecodedBitStreamParser$Mode LOWER;
    public static final /* enum */ DecodedBitStreamParser$Mode MIXED;
    public static final /* enum */ DecodedBitStreamParser$Mode PUNCT;
    public static final /* enum */ DecodedBitStreamParser$Mode PUNCT_SHIFT;

    static {
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode2;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode3;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode4;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode5;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode6;
        ALPHA = decodedBitStreamParser$Mode6 = new DecodedBitStreamParser$Mode("ALPHA", 0);
        int n3 = 1;
        LOWER = decodedBitStreamParser$Mode5 = new DecodedBitStreamParser$Mode("LOWER", n3);
        int n4 = 2;
        MIXED = decodedBitStreamParser$Mode4 = new DecodedBitStreamParser$Mode("MIXED", n4);
        int n7 = 3;
        PUNCT = decodedBitStreamParser$Mode3 = new DecodedBitStreamParser$Mode("PUNCT", n7);
        int n8 = 4;
        ALPHA_SHIFT = decodedBitStreamParser$Mode2 = new DecodedBitStreamParser$Mode("ALPHA_SHIFT", n8);
        int n10 = 5;
        PUNCT_SHIFT = decodedBitStreamParser$Mode = new DecodedBitStreamParser$Mode("PUNCT_SHIFT", n10);
        DecodedBitStreamParser$Mode[] decodedBitStreamParser$ModeArray = new DecodedBitStreamParser$Mode[6];
        decodedBitStreamParser$ModeArray[0] = decodedBitStreamParser$Mode6;
        decodedBitStreamParser$ModeArray[n3] = decodedBitStreamParser$Mode5;
        decodedBitStreamParser$ModeArray[n4] = decodedBitStreamParser$Mode4;
        decodedBitStreamParser$ModeArray[n7] = decodedBitStreamParser$Mode3;
        decodedBitStreamParser$ModeArray[n8] = decodedBitStreamParser$Mode2;
        decodedBitStreamParser$ModeArray[n10] = decodedBitStreamParser$Mode;
        $VALUES = decodedBitStreamParser$ModeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DecodedBitStreamParser$Mode() {
        void var2_-1;
        void var1_-1;
    }

    public static DecodedBitStreamParser$Mode valueOf(String string2) {
        return Enum.valueOf(DecodedBitStreamParser$Mode.class, string2);
    }

    public static DecodedBitStreamParser$Mode[] values() {
        return (DecodedBitStreamParser$Mode[])$VALUES.clone();
    }
}

