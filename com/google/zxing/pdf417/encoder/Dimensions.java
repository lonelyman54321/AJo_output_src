/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.encoder;

public final class Dimensions {
    private final int maxCols;
    private final int maxRows;
    private final int minCols;
    private final int minRows;

    public Dimensions(int n3, int n4, int n7, int n8) {
        this.minCols = n3;
        this.maxCols = n4;
        this.minRows = n7;
        this.maxRows = n8;
    }

    public int getMaxCols() {
        return this.maxCols;
    }

    public int getMaxRows() {
        return this.maxRows;
    }

    public int getMinCols() {
        return this.minCols;
    }

    public int getMinRows() {
        return this.minRows;
    }
}

