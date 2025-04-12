/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.datamatrix.decoder.BitMatrixParser;
import com.google.zxing.datamatrix.decoder.DataBlock;
import com.google.zxing.datamatrix.decoder.DecodedBitStreamParser;
import com.google.zxing.datamatrix.decoder.Version;

public final class Decoder {
    private final ReedSolomonDecoder rsDecoder;

    public Decoder() {
        ReedSolomonDecoder reedSolomonDecoder;
        GenericGF genericGF = GenericGF.DATA_MATRIX_FIELD_256;
        this.rsDecoder = reedSolomonDecoder = new ReedSolomonDecoder(genericGF);
    }

    private void correctErrors(byte[] byArray, int n3) {
        int n4;
        int n7 = byArray.length;
        int[] nArray = new int[n7];
        int n8 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            int n10;
            nArray[n4] = n10 = byArray[n4] & 0xFF;
        }
        ReedSolomonDecoder reedSolomonDecoder = this.rsDecoder;
        n4 = byArray.length - n3;
        try {
            reedSolomonDecoder.decode(nArray, n4);
        }
        catch (ReedSolomonException reedSolomonException) {
            throw ChecksumException.getChecksumInstance();
        }
        while (n8 < n3) {
            byArray[n8] = n7 = (int)((byte)nArray[n8]);
            ++n8;
        }
        return;
    }

    public DecoderResult decode(BitMatrix dataBlockArray) {
        int n3;
        DataBlock dataBlock;
        int n4;
        Object object = new BitMatrixParser((BitMatrix)dataBlockArray);
        dataBlockArray = ((BitMatrixParser)object).getVersion();
        object = ((BitMatrixParser)object).readCodewords();
        dataBlockArray = DataBlock.getDataBlocks((byte[])object, (Version)dataBlockArray);
        int n7 = dataBlockArray.length;
        int n8 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            dataBlock = dataBlockArray[n4];
            n3 = dataBlock.getNumDataCodewords();
            n8 += n3;
        }
        object = new byte[n8];
        n4 = dataBlockArray.length;
        for (n8 = 0; n8 < n4; ++n8) {
            dataBlock = dataBlockArray[n8];
            byte[] byArray = dataBlock.getCodewords();
            n3 = dataBlock.getNumDataCodewords();
            this.correctErrors(byArray, n3);
            for (int i3 = 0; i3 < n3; ++i3) {
                int n10 = i3 * n4 + n8;
                byte by2 = byArray[i3];
                object[n10] = by2;
            }
        }
        return DecodedBitStreamParser.decode((byte[])object);
    }

    public DecoderResult decode(boolean[][] object) {
        object = BitMatrix.parse(object);
        return this.decode((BitMatrix)object);
    }
}

