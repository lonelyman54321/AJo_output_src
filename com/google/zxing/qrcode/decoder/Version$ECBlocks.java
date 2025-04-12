/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.Version$ECB;

public final class Version$ECBlocks {
    private final Version$ECB[] ecBlocks;
    private final int ecCodewordsPerBlock;

    public Version$ECBlocks(int n3, Version$ECB ... version$ECBArray) {
        this.ecCodewordsPerBlock = n3;
        this.ecBlocks = version$ECBArray;
    }

    public Version$ECB[] getECBlocks() {
        return this.ecBlocks;
    }

    public int getECCodewordsPerBlock() {
        return this.ecCodewordsPerBlock;
    }

    public int getNumBlocks() {
        Version$ECB[] version$ECBArray = this.ecBlocks;
        int n3 = version$ECBArray.length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            Version$ECB version$ECB = version$ECBArray[i3];
            int n7 = version$ECB.getCount();
            n4 += n7;
        }
        return n4;
    }

    public int getTotalECCodewords() {
        int n3 = this.ecCodewordsPerBlock;
        return this.getNumBlocks() * n3;
    }
}

