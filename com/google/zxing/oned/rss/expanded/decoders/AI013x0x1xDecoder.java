/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AI01weightDecoder;
import com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder;

final class AI013x0x1xDecoder
extends AI01weightDecoder {
    private static final int DATE_SIZE = 16;
    private static final int HEADER_SIZE = 8;
    private static final int WEIGHT_SIZE = 20;
    private final String dateCode;
    private final String firstAIdigits;

    public AI013x0x1xDecoder(BitArray bitArray, String string2, String string3) {
        super(bitArray);
        this.dateCode = string3;
        this.firstAIdigits = string2;
    }

    private void encodeCompressedDate(StringBuilder stringBuilder, int n3) {
        int n4;
        int n7;
        Object object = this.getGeneralDecoder();
        n3 = ((GeneralAppIdDecoder)object).extractNumericValueFromBitArray(n3, n7 = 16);
        if (n3 == (n4 = 38400)) {
            return;
        }
        stringBuilder.append('(');
        object = this.dateCode;
        stringBuilder.append((String)object);
        stringBuilder.append(')');
        n4 = n3 % 32;
        n7 = (n3 /= 32) % 12 + 1;
        int n8 = (n3 /= 12) / 10;
        char c2 = '0';
        if (n8 == 0) {
            stringBuilder.append(c2);
        }
        stringBuilder.append(n3);
        n3 = n7 / 10;
        if (n3 == 0) {
            stringBuilder.append(c2);
        }
        stringBuilder.append(n7);
        n3 = n4 / 10;
        if (n3 == 0) {
            stringBuilder.append(c2);
        }
        stringBuilder.append(n4);
    }

    public void addWeightCode(StringBuilder stringBuilder, int n3) {
        stringBuilder.append('(');
        String string2 = this.firstAIdigits;
        stringBuilder.append(string2);
        stringBuilder.append(n3 /= 100000);
        stringBuilder.append(')');
    }

    public int checkWeight(int n3) {
        return n3 % 100000;
    }

    public String parseInformation() {
        int n3;
        Object object = this.getInformation();
        int n4 = ((BitArray)object).getSize();
        if (n4 == (n3 = 84)) {
            object = new StringBuilder();
            this.encodeCompressedGtin((StringBuilder)object, 8);
            this.encodeCompressedWeight((StringBuilder)object, 48, 20);
            this.encodeCompressedDate((StringBuilder)object, 68);
            return ((StringBuilder)object).toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

