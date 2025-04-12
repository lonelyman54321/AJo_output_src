/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.LuminanceSource;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

public abstract class Binarizer {
    private final LuminanceSource source;

    public Binarizer(LuminanceSource luminanceSource) {
        this.source = luminanceSource;
    }

    public abstract Binarizer createBinarizer(LuminanceSource var1);

    public abstract BitMatrix getBlackMatrix();

    public abstract BitArray getBlackRow(int var1, BitArray var2);

    public final int getHeight() {
        return this.source.getHeight();
    }

    public final LuminanceSource getLuminanceSource() {
        return this.source;
    }

    public final int getWidth() {
        return this.source.getWidth();
    }
}

