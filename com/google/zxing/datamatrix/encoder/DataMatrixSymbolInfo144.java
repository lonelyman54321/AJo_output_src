/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.encoder;

import com.google.zxing.datamatrix.encoder.SymbolInfo;

final class DataMatrixSymbolInfo144
extends SymbolInfo {
    public DataMatrixSymbolInfo144() {
        super(false, 1558, 620, 22, 22, 36, -1, 62);
    }

    public int getDataLengthForInterleavedBlock(int n3) {
        int n4 = 8;
        if (n3 <= n4) {
            return 156;
        }
        return 155;
    }

    public int getInterleavedBlockCount() {
        return 10;
    }
}

