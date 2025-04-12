/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AI013x0xDecoder;

final class AI01320xDecoder
extends AI013x0xDecoder {
    public AI01320xDecoder(BitArray bitArray) {
        super(bitArray);
    }

    public void addWeightCode(StringBuilder stringBuilder, int n3) {
        int n4 = 10000;
        if (n3 < n4) {
            stringBuilder.append("(3202)");
            return;
        }
        stringBuilder.append("(3203)");
    }

    public int checkWeight(int n3) {
        int n4 = 10000;
        if (n3 < n4) {
            return n3;
        }
        return n3 - n4;
    }
}

