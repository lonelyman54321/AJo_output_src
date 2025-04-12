/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AI01decoder;

final class AI01392xDecoder
extends AI01decoder {
    private static final int HEADER_SIZE = 8;
    private static final int LAST_DIGIT_SIZE = 2;

    public AI01392xDecoder(BitArray bitArray) {
        super(bitArray);
    }

    public String parseInformation() {
        int n3;
        Object object = this.getInformation();
        int n4 = ((BitArray)object).getSize();
        if (n4 >= (n3 = 48)) {
            object = new StringBuilder();
            this.encodeCompressedGtin((StringBuilder)object, 8);
            n3 = this.getGeneralDecoder().extractNumericValueFromBitArray(n3, 2);
            ((StringBuilder)object).append("(392");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(')');
            String string2 = this.getGeneralDecoder().decodeGeneralPurposeField(50, null).getNewString();
            ((StringBuilder)object).append(string2);
            return ((StringBuilder)object).toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

