/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.decoder;

final class DecodedBitStreamParser$Mode
extends Enum {
    private static final /* synthetic */ DecodedBitStreamParser$Mode[] $VALUES;
    public static final /* enum */ DecodedBitStreamParser$Mode ANSIX12_ENCODE;
    public static final /* enum */ DecodedBitStreamParser$Mode ASCII_ENCODE;
    public static final /* enum */ DecodedBitStreamParser$Mode BASE256_ENCODE;
    public static final /* enum */ DecodedBitStreamParser$Mode C40_ENCODE;
    public static final /* enum */ DecodedBitStreamParser$Mode EDIFACT_ENCODE;
    public static final /* enum */ DecodedBitStreamParser$Mode PAD_ENCODE;
    public static final /* enum */ DecodedBitStreamParser$Mode TEXT_ENCODE;

    static {
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode2;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode3;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode4;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode5;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode6;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode7;
        PAD_ENCODE = decodedBitStreamParser$Mode7 = new DecodedBitStreamParser$Mode("PAD_ENCODE", 0);
        int n3 = 1;
        ASCII_ENCODE = decodedBitStreamParser$Mode6 = new DecodedBitStreamParser$Mode("ASCII_ENCODE", n3);
        int n4 = 2;
        C40_ENCODE = decodedBitStreamParser$Mode5 = new DecodedBitStreamParser$Mode("C40_ENCODE", n4);
        int n7 = 3;
        TEXT_ENCODE = decodedBitStreamParser$Mode4 = new DecodedBitStreamParser$Mode("TEXT_ENCODE", n7);
        int n8 = 4;
        ANSIX12_ENCODE = decodedBitStreamParser$Mode3 = new DecodedBitStreamParser$Mode("ANSIX12_ENCODE", n8);
        int n10 = 5;
        EDIFACT_ENCODE = decodedBitStreamParser$Mode2 = new DecodedBitStreamParser$Mode("EDIFACT_ENCODE", n10);
        int n14 = 6;
        BASE256_ENCODE = decodedBitStreamParser$Mode = new DecodedBitStreamParser$Mode("BASE256_ENCODE", n14);
        DecodedBitStreamParser$Mode[] decodedBitStreamParser$ModeArray = new DecodedBitStreamParser$Mode[7];
        decodedBitStreamParser$ModeArray[0] = decodedBitStreamParser$Mode7;
        decodedBitStreamParser$ModeArray[n3] = decodedBitStreamParser$Mode6;
        decodedBitStreamParser$ModeArray[n4] = decodedBitStreamParser$Mode5;
        decodedBitStreamParser$ModeArray[n7] = decodedBitStreamParser$Mode4;
        decodedBitStreamParser$ModeArray[n8] = decodedBitStreamParser$Mode3;
        decodedBitStreamParser$ModeArray[n10] = decodedBitStreamParser$Mode2;
        decodedBitStreamParser$ModeArray[n14] = decodedBitStreamParser$Mode;
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

