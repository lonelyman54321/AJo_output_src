/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

public final class ResultMetadataType
extends Enum {
    private static final /* synthetic */ ResultMetadataType[] $VALUES;
    public static final /* enum */ ResultMetadataType BYTE_SEGMENTS;
    public static final /* enum */ ResultMetadataType ERROR_CORRECTION_LEVEL;
    public static final /* enum */ ResultMetadataType ISSUE_NUMBER;
    public static final /* enum */ ResultMetadataType ORIENTATION;
    public static final /* enum */ ResultMetadataType OTHER;
    public static final /* enum */ ResultMetadataType PDF417_EXTRA_METADATA;
    public static final /* enum */ ResultMetadataType POSSIBLE_COUNTRY;
    public static final /* enum */ ResultMetadataType STRUCTURED_APPEND_PARITY;
    public static final /* enum */ ResultMetadataType STRUCTURED_APPEND_SEQUENCE;
    public static final /* enum */ ResultMetadataType SUGGESTED_PRICE;
    public static final /* enum */ ResultMetadataType UPC_EAN_EXTENSION;

    static {
        ResultMetadataType resultMetadataType;
        ResultMetadataType resultMetadataType2;
        ResultMetadataType resultMetadataType3;
        ResultMetadataType resultMetadataType4;
        ResultMetadataType resultMetadataType5;
        ResultMetadataType resultMetadataType6;
        ResultMetadataType resultMetadataType7;
        ResultMetadataType resultMetadataType8;
        ResultMetadataType resultMetadataType9;
        ResultMetadataType resultMetadataType10;
        ResultMetadataType resultMetadataType11;
        OTHER = resultMetadataType11 = new ResultMetadataType("OTHER", 0);
        int n3 = 1;
        ORIENTATION = resultMetadataType10 = new ResultMetadataType("ORIENTATION", n3);
        int n4 = 2;
        BYTE_SEGMENTS = resultMetadataType9 = new ResultMetadataType("BYTE_SEGMENTS", n4);
        ERROR_CORRECTION_LEVEL = resultMetadataType8 = new ResultMetadataType("ERROR_CORRECTION_LEVEL", 3);
        ISSUE_NUMBER = resultMetadataType7 = new ResultMetadataType("ISSUE_NUMBER", 4);
        SUGGESTED_PRICE = resultMetadataType6 = new ResultMetadataType("SUGGESTED_PRICE", 5);
        POSSIBLE_COUNTRY = resultMetadataType5 = new ResultMetadataType("POSSIBLE_COUNTRY", 6);
        UPC_EAN_EXTENSION = resultMetadataType4 = new ResultMetadataType("UPC_EAN_EXTENSION", 7);
        PDF417_EXTRA_METADATA = resultMetadataType3 = new ResultMetadataType("PDF417_EXTRA_METADATA", 8);
        STRUCTURED_APPEND_SEQUENCE = resultMetadataType2 = new ResultMetadataType("STRUCTURED_APPEND_SEQUENCE", 9);
        int n7 = 10;
        STRUCTURED_APPEND_PARITY = resultMetadataType = new ResultMetadataType("STRUCTURED_APPEND_PARITY", n7);
        ResultMetadataType[] resultMetadataTypeArray = new ResultMetadataType[11];
        resultMetadataTypeArray[0] = resultMetadataType11;
        resultMetadataTypeArray[n3] = resultMetadataType10;
        resultMetadataTypeArray[n4] = resultMetadataType9;
        resultMetadataTypeArray[3] = resultMetadataType8;
        resultMetadataTypeArray[4] = resultMetadataType7;
        resultMetadataTypeArray[5] = resultMetadataType6;
        resultMetadataTypeArray[6] = resultMetadataType5;
        resultMetadataTypeArray[7] = resultMetadataType4;
        resultMetadataTypeArray[8] = resultMetadataType3;
        resultMetadataTypeArray[9] = resultMetadataType2;
        resultMetadataTypeArray[n7] = resultMetadataType;
        $VALUES = resultMetadataTypeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ResultMetadataType() {
        void var2_-1;
        void var1_-1;
    }

    public static ResultMetadataType valueOf(String string2) {
        return Enum.valueOf(ResultMetadataType.class, string2);
    }

    public static ResultMetadataType[] values() {
        return (ResultMetadataType[])$VALUES.clone();
    }
}

