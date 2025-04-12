/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.BarcodeFormat;

class MultiFormatWriter$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$zxing$BarcodeFormat;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        BarcodeFormat barcodeFormat;
        int n7 = BarcodeFormat.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$zxing$BarcodeFormat = nArray;
        try {
            barcodeFormat = BarcodeFormat.EAN_8;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$BarcodeFormat;
            barcodeFormat = BarcodeFormat.UPC_E;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$BarcodeFormat;
            barcodeFormat = BarcodeFormat.EAN_13;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$BarcodeFormat;
            barcodeFormat = BarcodeFormat.UPC_A;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$BarcodeFormat;
            barcodeFormat = BarcodeFormat.QR_CODE;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$BarcodeFormat;
            barcodeFormat = BarcodeFormat.CODE_39;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$BarcodeFormat;
            barcodeFormat = BarcodeFormat.CODE_93;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$BarcodeFormat;
            barcodeFormat = BarcodeFormat.CODE_128;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$BarcodeFormat;
            barcodeFormat = BarcodeFormat.ITF;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$BarcodeFormat;
            barcodeFormat = BarcodeFormat.PDF_417;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$BarcodeFormat;
            barcodeFormat = BarcodeFormat.CODABAR;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$BarcodeFormat;
            barcodeFormat = BarcodeFormat.DATA_MATRIX;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$BarcodeFormat;
            barcodeFormat = BarcodeFormat.AZTEC;
            n4 = barcodeFormat.ordinal();
            nArray[n4] = n3 = 13;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

