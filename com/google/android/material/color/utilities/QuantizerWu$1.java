/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.QuantizerWu$Direction;

class QuantizerWu$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        QuantizerWu$Direction quantizerWu$Direction;
        int n7 = QuantizerWu$Direction.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = nArray;
        try {
            quantizerWu$Direction = QuantizerWu$Direction.RED;
            n4 = quantizerWu$Direction.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;
            quantizerWu$Direction = QuantizerWu$Direction.GREEN;
            n4 = quantizerWu$Direction.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;
            quantizerWu$Direction = QuantizerWu$Direction.BLUE;
            n4 = quantizerWu$Direction.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

