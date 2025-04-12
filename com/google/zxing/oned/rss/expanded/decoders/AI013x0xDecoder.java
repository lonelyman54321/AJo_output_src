/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder;

abstract class AI013x0xDecoder
extends AI01weightDecoder {
    private static final int HEADER_SIZE = 5;
    private static final int WEIGHT_SIZE = 15;

    public AI013x0xDecoder(BitArray bitArray) {
        super(bitArray);
    }

    public String parseInformation() {
        int n3;
        Object object = this.getInformation();
        int n4 = ((BitArray)object).getSize();
        if (n4 == (n3 = 60)) {
            object = new StringBuilder();
            this.encodeCompressedGtin((StringBuilder)object, 5);
            this.encodeCompressedWeight((StringBuilder)object, 45, 15);
            return ((StringBuilder)object).toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

