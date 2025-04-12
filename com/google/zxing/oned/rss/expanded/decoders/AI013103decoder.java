/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AI013x0xDecoder;

final class AI013103decoder
extends AI013x0xDecoder {
    public AI013103decoder(BitArray bitArray) {
        super(bitArray);
    }

    public void addWeightCode(StringBuilder stringBuilder, int n3) {
        stringBuilder.append("(3103)");
    }

    public int checkWeight(int n3) {
        return n3;
    }
}

