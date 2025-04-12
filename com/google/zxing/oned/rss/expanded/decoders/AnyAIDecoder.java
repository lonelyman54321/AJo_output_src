/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;

final class AnyAIDecoder
extends AbstractExpandedDecoder {
    private static final int HEADER_SIZE = 5;

    public AnyAIDecoder(BitArray bitArray) {
        super(bitArray);
    }

    public String parseInformation() {
        StringBuilder stringBuilder = new StringBuilder();
        return this.getGeneralDecoder().decodeAllCodes(stringBuilder, 5);
    }
}

