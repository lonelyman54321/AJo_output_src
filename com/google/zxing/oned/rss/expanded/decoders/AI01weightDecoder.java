/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AI01decoder;

abstract class AI01weightDecoder
extends AI01decoder {
    public AI01weightDecoder(BitArray bitArray) {
        super(bitArray);
    }

    public abstract void addWeightCode(StringBuilder var1, int var2);

    public abstract int checkWeight(int var1);

    public final void encodeCompressedWeight(StringBuilder stringBuilder, int n3, int n4) {
        int n7;
        n3 = this.getGeneralDecoder().extractNumericValueFromBitArray(n3, n4);
        this.addWeightCode(stringBuilder, n3);
        n3 = this.checkWeight(n3);
        n4 = 100000;
        for (int i3 = 0; i3 < (n7 = 5); ++i3) {
            n7 = n3 / n4;
            if (n7 == 0) {
                n7 = 48;
                stringBuilder.append((char)n7);
            }
            n4 /= 10;
        }
        stringBuilder.append(n3);
    }
}

