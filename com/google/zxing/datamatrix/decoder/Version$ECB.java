/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.Version$1;

final class Version$ECB {
    private final int count;
    private final int dataCodewords;

    private Version$ECB(int n3, int n4) {
        this.count = n3;
        this.dataCodewords = n4;
    }

    public /* synthetic */ Version$ECB(int n3, int n4, Version$1 version$1) {
        this(n3, n4);
    }

    public int getCount() {
        return this.count;
    }

    public int getDataCodewords() {
        return this.dataCodewords;
    }
}

