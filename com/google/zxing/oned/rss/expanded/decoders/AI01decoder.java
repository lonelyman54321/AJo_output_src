/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import com.google.zxing.oned.rss.expanded.decoders.GeneralAppIdDecoder;

abstract class AI01decoder
extends AbstractExpandedDecoder {
    static final int GTIN_SIZE = 40;

    public AI01decoder(BitArray bitArray) {
        super(bitArray);
    }

    private static void appendCheckDigit(StringBuilder stringBuilder, int n3) {
        int n4;
        int n7;
        int n8 = 0;
        int n10 = 0;
        for (n7 = 0; n7 < (n4 = 13); ++n7) {
            n4 = n7 + n3;
            n4 = stringBuilder.charAt(n4) + -48;
            int n14 = n7 & 1;
            if (n14 == 0) {
                n4 *= 3;
            }
            n10 += n4;
        }
        n3 = 10;
        n7 = 10 - (n10 %= n3);
        if (n7 != n3) {
            n8 = n7;
        }
        stringBuilder.append(n8);
    }

    public final void encodeCompressedGtin(StringBuilder stringBuilder, int n3) {
        stringBuilder.append("(01)");
        int n4 = stringBuilder.length();
        stringBuilder.append('9');
        this.encodeCompressedGtinWithoutAI(stringBuilder, n3, n4);
    }

    public final void encodeCompressedGtinWithoutAI(StringBuilder stringBuilder, int n3, int n4) {
        int n7;
        for (int i3 = 0; i3 < (n7 = 4); ++i3) {
            GeneralAppIdDecoder generalAppIdDecoder = this.getGeneralDecoder();
            int n8 = i3 * 10 + n3;
            n7 = generalAppIdDecoder.extractNumericValueFromBitArray(n8, 10);
            n8 = n7 / 100;
            char c2 = '0';
            if (n8 == 0) {
                stringBuilder.append(c2);
            }
            if ((n8 = n7 / 10) == 0) {
                stringBuilder.append(c2);
            }
            stringBuilder.append(n7);
        }
        AI01decoder.appendCheckDigit(stringBuilder, n4);
    }
}

