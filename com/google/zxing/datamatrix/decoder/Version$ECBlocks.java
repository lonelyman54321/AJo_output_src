/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.Version$1;
import com.google.zxing.datamatrix.decoder.Version$ECB;

final class Version$ECBlocks {
    private final Version$ECB[] ecBlocks;
    private final int ecCodewords;

    private Version$ECBlocks(int n3, Version$ECB version$ECB) {
        this.ecCodewords = n3;
        Version$ECB[] version$ECBArray = new Version$ECB[]{version$ECB};
        this.ecBlocks = version$ECBArray;
    }

    public /* synthetic */ Version$ECBlocks(int n3, Version$ECB version$ECB, Version$1 version$1) {
        this(n3, version$ECB);
    }

    private Version$ECBlocks(int n3, Version$ECB version$ECB, Version$ECB version$ECB2) {
        this.ecCodewords = n3;
        Version$ECB[] version$ECBArray = new Version$ECB[]{version$ECB, version$ECB2};
        this.ecBlocks = version$ECBArray;
    }

    public /* synthetic */ Version$ECBlocks(int n3, Version$ECB version$ECB, Version$ECB version$ECB2, Version$1 version$1) {
        this(n3, version$ECB, version$ECB2);
    }

    public Version$ECB[] getECBlocks() {
        return this.ecBlocks;
    }

    public int getECCodewords() {
        return this.ecCodewords;
    }
}

