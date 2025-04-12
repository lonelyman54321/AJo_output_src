/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

public final class BarcodeFormat
extends Enum {
    private static final /* synthetic */ BarcodeFormat[] $VALUES;
    public static final /* enum */ BarcodeFormat AZTEC;
    public static final /* enum */ BarcodeFormat CODABAR;
    public static final /* enum */ BarcodeFormat CODE_128;
    public static final /* enum */ BarcodeFormat CODE_39;
    public static final /* enum */ BarcodeFormat CODE_93;
    public static final /* enum */ BarcodeFormat DATA_MATRIX;
    public static final /* enum */ BarcodeFormat EAN_13;
    public static final /* enum */ BarcodeFormat EAN_8;
    public static final /* enum */ BarcodeFormat ITF;
    public static final /* enum */ BarcodeFormat MAXICODE;
    public static final /* enum */ BarcodeFormat PDF_417;
    public static final /* enum */ BarcodeFormat QR_CODE;
    public static final /* enum */ BarcodeFormat RSS_14;
    public static final /* enum */ BarcodeFormat RSS_EXPANDED;
    public static final /* enum */ BarcodeFormat UPC_A;
    public static final /* enum */ BarcodeFormat UPC_E;
    public static final /* enum */ BarcodeFormat UPC_EAN_EXTENSION;

    static {
        BarcodeFormat barcodeFormat;
        BarcodeFormat barcodeFormat2;
        BarcodeFormat barcodeFormat3;
        BarcodeFormat barcodeFormat4;
        BarcodeFormat barcodeFormat5;
        BarcodeFormat barcodeFormat6;
        BarcodeFormat barcodeFormat7;
        BarcodeFormat barcodeFormat8;
        BarcodeFormat barcodeFormat9;
        BarcodeFormat barcodeFormat10;
        BarcodeFormat barcodeFormat11;
        BarcodeFormat barcodeFormat12;
        BarcodeFormat barcodeFormat13;
        BarcodeFormat barcodeFormat14;
        BarcodeFormat barcodeFormat15;
        AZTEC = barcodeFormat15 = new BarcodeFormat("AZTEC", 0);
        CODABAR = barcodeFormat14 = new BarcodeFormat("CODABAR", 1);
        CODE_39 = barcodeFormat13 = new BarcodeFormat("CODE_39", 2);
        CODE_93 = barcodeFormat12 = new BarcodeFormat("CODE_93", 3);
        CODE_128 = barcodeFormat11 = new BarcodeFormat("CODE_128", 4);
        DATA_MATRIX = barcodeFormat10 = new BarcodeFormat("DATA_MATRIX", 5);
        EAN_8 = barcodeFormat9 = new BarcodeFormat("EAN_8", 6);
        EAN_13 = barcodeFormat8 = new BarcodeFormat("EAN_13", 7);
        ITF = barcodeFormat7 = new BarcodeFormat("ITF", 8);
        MAXICODE = barcodeFormat6 = new BarcodeFormat("MAXICODE", 9);
        PDF_417 = barcodeFormat5 = new BarcodeFormat("PDF_417", 10);
        QR_CODE = barcodeFormat4 = new BarcodeFormat("QR_CODE", 11);
        RSS_14 = barcodeFormat3 = new BarcodeFormat("RSS_14", 12);
        RSS_EXPANDED = barcodeFormat2 = new BarcodeFormat("RSS_EXPANDED", 13);
        BarcodeFormat barcodeFormat16 = barcodeFormat2;
        BarcodeFormat[] barcodeFormatArray = new BarcodeFormat("UPC_A", 14);
        UPC_A = barcodeFormatArray;
        BarcodeFormat[] barcodeFormatArray2 = barcodeFormatArray;
        UPC_E = barcodeFormat = new BarcodeFormat("UPC_E", 15);
        int n3 = 16;
        UPC_EAN_EXTENSION = barcodeFormat2 = new BarcodeFormat("UPC_EAN_EXTENSION", n3);
        barcodeFormatArray = new BarcodeFormat[17];
        barcodeFormatArray[0] = barcodeFormat15;
        barcodeFormatArray[1] = barcodeFormat14;
        barcodeFormatArray[2] = barcodeFormat13;
        barcodeFormatArray[3] = barcodeFormat12;
        barcodeFormatArray[4] = barcodeFormat11;
        barcodeFormatArray[5] = barcodeFormat10;
        barcodeFormatArray[6] = barcodeFormat9;
        barcodeFormatArray[7] = barcodeFormat8;
        barcodeFormatArray[8] = barcodeFormat7;
        barcodeFormatArray[9] = barcodeFormat6;
        barcodeFormatArray[10] = barcodeFormat5;
        barcodeFormatArray[11] = barcodeFormat4;
        barcodeFormatArray[12] = barcodeFormat3;
        barcodeFormatArray[13] = barcodeFormat16;
        barcodeFormatArray[14] = barcodeFormatArray2;
        barcodeFormatArray[15] = barcodeFormat;
        barcodeFormatArray[n3] = barcodeFormat2;
        $VALUES = barcodeFormatArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BarcodeFormat() {
        void var2_-1;
        void var1_-1;
    }

    public static BarcodeFormat valueOf(String string2) {
        return Enum.valueOf(BarcodeFormat.class, string2);
    }

    public static BarcodeFormat[] values() {
        return (BarcodeFormat[])$VALUES.clone();
    }
}

