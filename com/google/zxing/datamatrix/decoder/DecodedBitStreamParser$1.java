/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode;

class DecodedBitStreamParser$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        DecodedBitStreamParser$Mode decodedBitStreamParser$Mode;
        int n7 = DecodedBitStreamParser$Mode.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode = nArray;
        try {
            decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.C40_ENCODE;
            n4 = decodedBitStreamParser$Mode.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode;
            decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.TEXT_ENCODE;
            n4 = decodedBitStreamParser$Mode.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode;
            decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.ANSIX12_ENCODE;
            n4 = decodedBitStreamParser$Mode.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode;
            decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.EDIFACT_ENCODE;
            n4 = decodedBitStreamParser$Mode.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode;
            decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.BASE256_ENCODE;
            n4 = decodedBitStreamParser$Mode.ordinal();
            nArray[n4] = n3 = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

