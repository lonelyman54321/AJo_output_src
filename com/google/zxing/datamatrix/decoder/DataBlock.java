/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.Version;
import com.google.zxing.datamatrix.decoder.Version$ECB;
import com.google.zxing.datamatrix.decoder.Version$ECBlocks;

final class DataBlock {
    private final byte[] codewords;
    private final int numDataCodewords;

    private DataBlock(int n3, byte[] byArray) {
        this.numDataCodewords = n3;
        this.codewords = byArray;
    }

    public static DataBlock[] getDataBlocks(byte[] object, Version version) {
        int n3;
        int n4;
        int n7;
        byte[] byArray;
        Object object2;
        int n8;
        Version$ECB version$ECB;
        int n10;
        Object object3 = version.getECBlocks();
        Object[] objectArray = ((Version$ECBlocks)object3).getECBlocks();
        int n14 = objectArray.length;
        int n15 = 0;
        for (n10 = 0; n10 < n14; ++n10) {
            version$ECB = objectArray[n10];
            n8 = version$ECB.getCount();
            n15 += n8;
        }
        DataBlock[] dataBlockArray = new DataBlock[n15];
        n10 = objectArray.length;
        n8 = 0;
        version$ECB = null;
        for (n15 = 0; n15 < n10; ++n15) {
            object2 = objectArray[n15];
            byArray = null;
            for (n7 = 0; n7 < (n4 = ((Version$ECB)object2).getCount()); ++n7) {
                DataBlock dataBlock;
                n4 = ((Version$ECB)object2).getDataCodewords();
                int n16 = ((Version$ECBlocks)object3).getECCodewords() + n4;
                int n17 = n8 + 1;
                byte[] byArray2 = new byte[n16];
                dataBlockArray[n8] = dataBlock = new DataBlock(n4, byArray2);
                n8 = n17;
            }
        }
        objectArray = dataBlockArray[0].codewords;
        int n18 = objectArray.length;
        int n19 = ((Version$ECBlocks)object3).getECCodewords();
        n18 -= n19;
        n19 = n18 + -1;
        n15 = 0;
        for (n10 = 0; n10 < n19; ++n10) {
            object2 = null;
            for (n3 = 0; n3 < n8; ++n3) {
                byArray = dataBlockArray[n3].codewords;
                n4 = n15 + 1;
                byArray[n10] = n15 = object[n15];
                n15 = n4;
            }
        }
        int n20 = version.getVersionNumber();
        if (n20 == (n10 = 24)) {
            n20 = 1;
        } else {
            n20 = 0;
            version = null;
        }
        n10 = n20 != 0 ? 8 : n8;
        object2 = null;
        for (n3 = 0; n3 < n10; ++n3) {
            byArray = dataBlockArray[n3].codewords;
            n4 = n15 + 1;
            byArray[n19] = n15 = object[n15];
            n15 = n4;
        }
        object3 = dataBlockArray[0].codewords;
        n19 = ((Object)object3).length;
        while (n18 < n19) {
            for (n10 = 0; n10 < n8; ++n10) {
                n3 = n20 != 0 ? (n10 + 8) % n8 : n10;
                n7 = n20 != 0 && n3 > (n7 = 7) ? n18 + -1 : n18;
                object2 = dataBlockArray[n3].codewords;
                n4 = n15 + 1;
                n15 = object[n15];
                object2[n7] = n15;
                n15 = n4;
            }
            ++n18;
        }
        int n21 = ((byte[])object).length;
        if (n15 == n21) {
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

