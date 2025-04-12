/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.BitMatrixParser;
import com.google.zxing.qrcode.decoder.DataBlock;
import com.google.zxing.qrcode.decoder.DecodedBitStreamParser;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData;
import com.google.zxing.qrcode.decoder.Version;
import java.util.Map;

public final class Decoder {
    private final ReedSolomonDecoder rsDecoder;

    public Decoder() {
        ReedSolomonDecoder reedSolomonDecoder;
        GenericGF genericGF = GenericGF.QR_CODE_FIELD_256;
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

    private DecoderResult decode(BitMatrixParser dataBlockArray, Map map2) {
        int n3;
        DataBlock dataBlock;
        int n4;
        Version version = dataBlockArray.readVersion();
        ErrorCorrectionLevel errorCorrectionLevel = dataBlockArray.readFormatInformation().getErrorCorrectionLevel();
        dataBlockArray = DataBlock.getDataBlocks(dataBlockArray.readCodewords(), version, errorCorrectionLevel);
        int n7 = dataBlockArray.length;
        int n8 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            dataBlock = dataBlockArray[n4];
            n3 = dataBlock.getNumDataCodewords();
            n8 += n3;
        }
        byte[] byArray = new byte[n8];
        n4 = dataBlockArray.length;
        n3 = 0;
        dataBlock = null;
        for (n8 = 0; n8 < n4; ++n8) {
            DataBlock dataBlock2 = dataBlockArray[n8];
            byte[] byArray2 = dataBlock2.getCodewords();
            int n10 = dataBlock2.getNumDataCodewords();
            this.correctErrors(byArray2, n10);
            for (int i3 = 0; i3 < n10; ++i3) {
                byte by2;
                int n14 = n3 + 1;
                byArray[n3] = by2 = byArray2[i3];
                n3 = n14;
            }
        }
        return DecodedBitStreamParser.decode(byArray, version, errorCorrectionLevel, map2);
    }

    public DecoderResult decode(BitMatrix bitMatrix) {
        return this.decode(bitMatrix, null);
    }

    public DecoderResult decode(BitMatrix object, Map object2) {
        Object var4_5;
        Object object3 = new BitMatrixParser((BitMatrix)object);
        object = null;
        try {
            return this.decode((BitMatrixParser)object3, (Map)object2);
        }
        catch (ChecksumException checksumException) {
        }
        catch (FormatException formatException) {
            var4_5 = null;
            object = formatException;
        }
        ((BitMatrixParser)object3).remask();
        boolean bl2 = true;
        ((BitMatrixParser)object3).setMirror(bl2);
        ((BitMatrixParser)object3).readVersion();
        ((BitMatrixParser)object3).readFormatInformation();
        ((BitMatrixParser)object3).mirror();
        object2 = this.decode((BitMatrixParser)object3, (Map)object2);
        object3 = new QRCodeDecoderMetaData(bl2);
        try {
            ((DecoderResult)object2).setOther(object3);
            return object2;
        }
        catch (ChecksumException | FormatException readerException) {
            if (object != null) {
                throw object;
            }
            throw var4_5;
        }
    }

    public DecoderResult decode(boolean[][] blArray) {
        return this.decode(blArray, null);
    }

    public DecoderResult decode(boolean[][] object, Map map2) {
        object = BitMatrix.parse(object);
        return this.decode((BitMatrix)object, map2);
    }
}

