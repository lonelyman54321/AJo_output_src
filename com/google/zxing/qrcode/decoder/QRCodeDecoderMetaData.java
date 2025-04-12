/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.ResultPoint;

public final class QRCodeDecoderMetaData {
    private final boolean mirrored;

    public QRCodeDecoderMetaData(boolean bl2) {
        this.mirrored = bl2;
    }

    public void applyMirroredCorrection(ResultPoint[] resultPointArray) {
        int n3;
        int n4 = this.mirrored;
        if (n4 != 0 && resultPointArray != null && (n4 = resultPointArray.length) >= (n3 = 3)) {
            ResultPoint resultPoint;
            n4 = 0;
            ResultPoint resultPoint2 = resultPointArray[0];
            int n7 = 2;
            resultPointArray[0] = resultPoint = resultPointArray[n7];
            resultPointArray[n7] = resultPoint2;
        }
    }

    public boolean isMirrored() {
        return this.mirrored;
    }
}

