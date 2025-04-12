/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.maxicode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.maxicode.decoder.BitMatrixParser;
import com.google.zxing.maxicode.decoder.DecodedBitStreamParser;
import java.util.Map;

public final class Decoder {
    private static final int ALL = 0;
    private static final int EVEN = 1;
    private static final int ODD = 2;
    private final ReedSolomonDecoder rsDecoder;

    public Decoder() {
        ReedSolomonDecoder reedSolomonDecoder;
        GenericGF genericGF = GenericGF.MAXICODE_FIELD_64;
        this.rsDecoder = reedSolomonDecoder = new ReedSolomonDecoder(genericGF);
    }

    private void correctErrors(byte[] byArray, int n3, int n4, int n7, int n8) {
        int n10 = n4 + n7;
        int n14 = n8 == 0 ? 1 : 2;
        int n15 = n10 / n14;
        int[] nArray = new int[n15];
        int n16 = 0;
        for (int i3 = 0; i3 < n10; ++i3) {
            int n17;
            int n18;
            if (n8 != 0 && (n18 = i3 % 2) != (n17 = n8 + -1)) continue;
            n18 = i3 / n14;
            n17 = i3 + n3;
            nArray[n18] = n17 = byArray[n17] & 0xFF;
        }
        ReedSolomonDecoder reedSolomonDecoder = this.rsDecoder;
        n7 /= n14;
        try {
            reedSolomonDecoder.decode(nArray, n7);
        }
        catch (ReedSolomonException reedSolomonException) {
            throw ChecksumException.getChecksumInstance();
        }
        while (n16 < n4) {
            if (n8 == 0 || (n7 = n16 % 2) == (n10 = n8 + -1)) {
                n7 = n16 + n3;
                n10 = n16 / n14;
                byArray[n7] = n10 = (int)((byte)nArray[n10]);
            }
            ++n16;
        }
        return;
    }

    public DecoderResult decode(BitMatrix bitMatrix) {
        return this.decode(bitMatrix, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public DecoderResult decode(BitMatrix object, Map object2) {
        object2 = new BitMatrixParser((BitMatrix)object);
        object = ((BitMatrixParser)object2).readCodewords();
        int n3 = 10;
        int n4 = 0;
        int n7 = 0;
        int n8 = 10;
        Object object3 = this;
        this.correctErrors((byte[])object, 0, n8, n3, 0);
        int n10 = 0;
        object2 = null;
        int n14 = object[0] & 0xF;
        int n15 = 2;
        if (n14 != n15 && n14 != (n15 = 3) && n14 != (n15 = 4)) {
            n15 = 5;
            if (n14 != n15) throw FormatException.getFormatInstance();
            n3 = 56;
            n7 = 20;
            n8 = 68;
            this.correctErrors((byte[])object, n7, n8, n3, 1);
            n4 = 2;
            this.correctErrors((byte[])object, n7, n8, n3, n4);
            n15 = 78;
            object3 = new byte[n15];
        } else {
            n3 = 40;
            n7 = 20;
            n8 = 84;
            object3 = this;
            this.correctErrors((byte[])object, n7, n8, n3, 1);
            n4 = 2;
            this.correctErrors((byte[])object, n7, n8, n3, n4);
            n15 = 94;
            object3 = new byte[n15];
        }
        int n16 = 10;
        System.arraycopy(object, 0, object3, 0, n16);
        n10 = ((Object)object3).length - n16;
        System.arraycopy(object, 20, object3, n16, n10);
        return DecodedBitStreamParser.decode((byte[])object3, n14);
    }
}

