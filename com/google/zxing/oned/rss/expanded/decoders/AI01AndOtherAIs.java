/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AI01decoder;
import com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder;

final class AI01AndOtherAIs
extends AI01decoder {
    private static final int HEADER_SIZE = 4;

    public AI01AndOtherAIs(BitArray bitArray) {
        super(bitArray);
    }

    public String parseInformation() {
        StringBuilder stringBuilder = Ex0.a("(01)");
        int n3 = stringBuilder.length();
        GeneralAppIdDecoder generalAppIdDecoder = this.getGeneralDecoder();
        int n4 = 4;
        int n7 = generalAppIdDecoder.extractNumericValueFromBitArray(n4, n4);
        stringBuilder.append(n7);
        this.encodeCompressedGtinWithoutAI(stringBuilder, 8, n3);
        return this.getGeneralDecoder().decodeAllCodes(stringBuilder, 48);
    }
}

