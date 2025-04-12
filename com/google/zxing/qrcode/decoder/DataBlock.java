/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.decoder.Version$ECB;
import com.google.zxing.qrcode.decoder.Version$ECBlocks;

final class DataBlock {
    private final byte[] codewords;
    private final int numDataCodewords;

    private DataBlock(int n3, byte[] byArray) {
        this.numDataCodewords = n3;
        this.codewords = byArray;
    }

    public static DataBlock[] getDataBlocks(byte[] object, Version object2, ErrorCorrectionLevel objectArray) {
        int n3 = ((byte[])object).length;
        int n4 = ((Version)object2).getTotalCodewords();
        if (n3 == n4) {
            int n7;
            int n8;
            int n10;
            byte[] byArray;
            Object object3;
            int n14;
            Object object4;
            int n15;
            object2 = ((Version)object2).getECBlocksForLevel((ErrorCorrectionLevel)objectArray);
            objectArray = ((Version$ECBlocks)object2).getECBlocks();
            n3 = objectArray.length;
            n4 = 0;
            byte[] byArray2 = null;
            int n16 = 0;
            for (n15 = 0; n15 < n3; ++n15) {
                object4 = objectArray[n15];
                n14 = ((Version$ECB)object4).getCount();
                n16 += n14;
            }
            DataBlock[] dataBlockArray = new DataBlock[n16];
            n15 = objectArray.length;
            object4 = null;
            int n17 = 0;
            for (n14 = 0; n14 < n15; ++n14) {
                object3 = objectArray[n14];
                byArray = null;
                for (n10 = 0; n10 < (n8 = ((Version$ECB)object3).getCount()); ++n10) {
                    DataBlock dataBlock;
                    n8 = ((Version$ECB)object3).getDataCodewords();
                    int n18 = ((Version$ECBlocks)object2).getECCodewordsPerBlock() + n8;
                    int n19 = n17 + 1;
                    byte[] byArray3 = new byte[n18];
                    dataBlockArray[n17] = dataBlock = new DataBlock(n8, byArray3);
                    n17 = n19;
                }
            }
            objectArray = dataBlockArray[0].codewords;
            int n20 = objectArray.length;
            n16 += -1;
            while (n16 >= 0 && (n15 = (byArray2 = dataBlockArray[n16].codewords).length) != n20) {
                n16 += -1;
            }
            ++n16;
            int n21 = ((Version$ECBlocks)object2).getECCodewordsPerBlock();
            n20 -= n21;
            object2 = null;
            n15 = 0;
            byArray2 = null;
            for (n21 = 0; n21 < n20; ++n21) {
                object4 = null;
                for (n14 = 0; n14 < n17; ++n14) {
                    object3 = dataBlockArray[n14].codewords;
                    n10 = n15 + 1;
                    n15 = object[n15];
                    object3[n21] = n15;
                    n15 = n10;
                }
            }
            for (n21 = n16; n21 < n17; ++n21) {
                object4 = dataBlockArray[n21].codewords;
                n7 = n15 + 1;
                n15 = object[n15];
                object4[n20] = n15;
                n15 = n7;
            }
            object2 = dataBlockArray[0].codewords;
            n21 = ((Object)object2).length;
            while (n20 < n21) {
                object4 = null;
                for (n14 = 0; n14 < n17; ++n14) {
                    n7 = n14 < n16 ? n20 : n20 + 1;
                    byArray = dataBlockArray[n14].codewords;
                    n8 = n15 + 1;
                    byArray[n7] = n15 = object[n15];
                    n15 = n8;
                }
                ++n20;
            }
            return dataBlockArray;
        }
        object = new IllegalArgumentException;
        object();
        throw object;
    }

    public byte[] getCodewords() {
        return this.codewords;
    }

    public int getNumDataCodewords() {
        return this.numDataCodewords;
    }
}

