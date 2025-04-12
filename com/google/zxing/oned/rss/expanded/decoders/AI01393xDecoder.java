/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AI01decoder;
import com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder;

final class AI01393xDecoder
extends AI01decoder {
    private static final int FIRST_THREE_DIGITS_SIZE = 10;
    private static final int HEADER_SIZE = 8;
    private static final int LAST_DIGIT_SIZE = 2;

    public AI01393xDecoder(BitArray bitArray) {
        super(bitArray);
    }

    public String parseInformation() {
        int n3;
        Object object = this.getInformation();
        int n4 = ((BitArray)object).getSize();
        if (n4 >= (n3 = 48)) {
            object = new StringBuilder();
            this.encodeCompressedGtin((StringBuilder)object, 8);
            int n7 = this.getGeneralDecoder().extractNumericValueFromBitArray(n3, 2);
            String string2 = "(393";
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(n7);
            ((StringBuilder)object).append(')');
            GeneralAppIdDecoder generalAppIdDecoder = this.getGeneralDecoder();
            int n8 = 10;
            n7 = generalAppIdDecoder.extractNumericValueFromBitArray(50, n8);
            int n10 = n7 / 100;
            if (n10 == 0) {
                ((StringBuilder)object).append((char)n3);
            }
            if ((n10 = n7 / 10) == 0) {
                ((StringBuilder)object).append((char)n3);
            }
            ((StringBuilder)object).append(n7);
            String string3 = this.getGeneralDecoder().decodeGeneralPurposeField(60, null).getNewString();
            ((StringBuilder)object).append(string3);
            return ((StringBuilder)object).toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

