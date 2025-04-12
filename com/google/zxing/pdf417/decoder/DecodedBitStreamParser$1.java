/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode;

class DecodedBitStreamParser$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;

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
        $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode = nArray;
        try {
            decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.ALPHA;
            n4 = decodedBitStreamParser$Mode.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;
            decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.LOWER;
            n4 = decodedBitStreamParser$Mode.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;
            decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.MIXED;
            n4 = decodedBitStreamParser$Mode.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;
            decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.PUNCT;
            n4 = decodedBitStreamParser$Mode.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;
            decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.ALPHA_SHIFT;
            n4 = decodedBitStreamParser$Mode.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode;
            decodedBitStreamParser$Mode = DecodedBitStreamParser$Mode.PUNCT_SHIFT;
            n4 = decodedBitStreamParser$Mode.ordinal();
            nArray[n4] = n3 = 6;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

