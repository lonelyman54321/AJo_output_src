/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec.decoder;

import com.google.zxing.aztec.decoder.Decoder$Table;

class Decoder$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Decoder$Table decoder$Table;
        int n7 = Decoder$Table.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table = nArray;
        try {
            decoder$Table = Decoder$Table.UPPER;
            n4 = decoder$Table.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;
            decoder$Table = Decoder$Table.LOWER;
            n4 = decoder$Table.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;
            decoder$Table = Decoder$Table.MIXED;
            n4 = decoder$Table.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;
            decoder$Table = Decoder$Table.PUNCT;
            n4 = decoder$Table.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;
            decoder$Table = Decoder$Table.DIGIT;
            n4 = decoder$Table.ordinal();
            nArray[n4] = n3 = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

