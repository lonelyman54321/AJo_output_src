/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned.rss.expanded;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.expanded.ExpandedPair;
import java.util.List;

final class BitArrayBuilder {
    private BitArrayBuilder() {
    }

    public static BitArray buildBitArray(List list) {
        int n3;
        int n4;
        int n7 = list.size();
        int n8 = 1;
        int n10 = (n7 <<= n8) + -1;
        DataCharacter dataCharacter = ((ExpandedPair)on_2.d(n8, list)).getRightChar();
        if (dataCharacter == null) {
            n10 = n7 + -2;
        }
        BitArray bitArray = new BitArray(n10 *= 12);
        n10 = 0;
        dataCharacter = ((ExpandedPair)list.get(0)).getRightChar();
        int n14 = dataCharacter.getValue();
        for (n4 = 11; n4 >= 0; n4 += -1) {
            n3 = n8 << n4 & n14;
            if (n3 != 0) {
                bitArray.set(n10);
            }
            ++n10;
        }
        for (n14 = 1; n14 < (n4 = list.size()); ++n14) {
            int n15;
            Object object = (ExpandedPair)list.get(n14);
            DataCharacter dataCharacter2 = ((ExpandedPair)object).getLeftChar();
            n3 = dataCharacter2.getValue();
            for (n15 = 11; n15 >= 0; n15 += -1) {
                int n16 = n8 << n15 & n3;
                if (n16 != 0) {
                    bitArray.set(n10);
                }
                ++n10;
            }
            dataCharacter2 = ((ExpandedPair)object).getRightChar();
            if (dataCharacter2 == null) continue;
            object = ((ExpandedPair)object).getRightChar();
            n4 = ((DataCharacter)object).getValue();
            for (n3 = 11; n3 >= 0; n3 += -1) {
                n15 = n8 << n3 & n4;
                if (n15 != 0) {
                    bitArray.set(n10);
                }
                ++n10;
            }
        }
        return bitArray;
    }
}

