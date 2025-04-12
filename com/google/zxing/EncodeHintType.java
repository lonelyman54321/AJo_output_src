/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

public final class EncodeHintType
extends Enum {
    private static final /* synthetic */ EncodeHintType[] $VALUES;
    public static final /* enum */ EncodeHintType AZTEC_LAYERS;
    public static final /* enum */ EncodeHintType CHARACTER_SET;
    public static final /* enum */ EncodeHintType DATA_MATRIX_SHAPE;
    public static final /* enum */ EncodeHintType ERROR_CORRECTION;
    public static final /* enum */ EncodeHintType GS1_FORMAT;
    public static final /* enum */ EncodeHintType MARGIN;
    public static final /* enum */ EncodeHintType MAX_SIZE;
    public static final /* enum */ EncodeHintType MIN_SIZE;
    public static final /* enum */ EncodeHintType PDF417_COMPACT;
    public static final /* enum */ EncodeHintType PDF417_COMPACTION;
    public static final /* enum */ EncodeHintType PDF417_DIMENSIONS;
    public static final /* enum */ EncodeHintType QR_VERSION;

    static {
        EncodeHintType encodeHintType;
        EncodeHintType encodeHintType2;
        EncodeHintType encodeHintType3;
        EncodeHintType encodeHintType4;
        EncodeHintType encodeHintType5;
        EncodeHintType encodeHintType6;
        EncodeHintType encodeHintType7;
        EncodeHintType encodeHintType8;
        EncodeHintType encodeHintType9;
        EncodeHintType encodeHintType10;
        EncodeHintType encodeHintType11;
        EncodeHintType encodeHintType12;
        ERROR_CORRECTION = encodeHintType12 = new EncodeHintType("ERROR_CORRECTION", 0);
        int n3 = 1;
        CHARACTER_SET = encodeHintType11 = new EncodeHintType("CHARACTER_SET", n3);
        DATA_MATRIX_SHAPE = encodeHintType10 = new EncodeHintType("DATA_MATRIX_SHAPE", 2);
        MIN_SIZE = encodeHintType9 = new EncodeHintType("MIN_SIZE", 3);
        MAX_SIZE = encodeHintType8 = new EncodeHintType("MAX_SIZE", 4);
        MARGIN = encodeHintType7 = new EncodeHintType("MARGIN", 5);
        PDF417_COMPACT = encodeHintType6 = new EncodeHintType("PDF417_COMPACT", 6);
        PDF417_COMPACTION = encodeHintType5 = new EncodeHintType("PDF417_COMPACTION", 7);
        PDF417_DIMENSIONS = encodeHintType4 = new EncodeHintType("PDF417_DIMENSIONS", 8);
        AZTEC_LAYERS = encodeHintType3 = new EncodeHintType("AZTEC_LAYERS", 9);
        QR_VERSION = encodeHintType2 = new EncodeHintType("QR_VERSION", 10);
        int n4 = 11;
        GS1_FORMAT = encodeHintType = new EncodeHintType("GS1_FORMAT", n4);
        EncodeHintType[] encodeHintTypeArray = new EncodeHintType[12];
        encodeHintTypeArray[0] = encodeHintType12;
        encodeHintTypeArray[n3] = encodeHintType11;
        encodeHintTypeArray[2] = encodeHintType10;
        encodeHintTypeArray[3] = encodeHintType9;
        encodeHintTypeArray[4] = encodeHintType8;
        encodeHintTypeArray[5] = encodeHintType7;
        encodeHintTypeArray[6] = encodeHintType6;
        encodeHintTypeArray[7] = encodeHintType5;
        encodeHintTypeArray[8] = encodeHintType4;
        encodeHintTypeArray[9] = encodeHintType3;
        encodeHintTypeArray[10] = encodeHintType2;
        encodeHintTypeArray[n4] = encodeHintType;
        $VALUES = encodeHintTypeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private EncodeHintType() {
        void var2_-1;
        void var1_-1;
    }

    public static EncodeHintType valueOf(String string2) {
        return Enum.valueOf(EncodeHintType.class, string2);
    }

    public static EncodeHintType[] values() {
        return (EncodeHintType[])$VALUES.clone();
    }
}

