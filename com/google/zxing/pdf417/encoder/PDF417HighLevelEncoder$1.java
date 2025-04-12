/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.encoder;

import com.google.zxing.pdf417.encoder.Compaction;

class PDF417HighLevelEncoder$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$encoder$Compaction;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Compaction compaction;
        int n7 = Compaction.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$zxing$pdf417$encoder$Compaction = nArray;
        try {
            compaction = Compaction.TEXT;
            n4 = compaction.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$pdf417$encoder$Compaction;
            compaction = Compaction.BYTE;
            n4 = compaction.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$zxing$pdf417$encoder$Compaction;
            compaction = Compaction.NUMERIC;
            n4 = compaction.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

