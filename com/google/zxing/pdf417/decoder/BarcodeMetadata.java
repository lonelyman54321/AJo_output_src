/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder;

final class BarcodeMetadata {
    private final int columnCount;
    private final int errorCorrectionLevel;
    private final int rowCount;
    private final int rowCountLowerPart;
    private final int rowCountUpperPart;

    public BarcodeMetadata(int n3, int n4, int n7, int n8) {
        this.columnCount = n3;
        this.errorCorrectionLevel = n8;
        this.rowCountUpperPart = n4;
        this.rowCountLowerPart = n7;
        this.rowCount = n4 += n7;
    }

    public int getColumnCount() {
        return this.columnCount;
    }

    public int getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowCountLowerPart() {
        return this.rowCountLowerPart;
    }

    public int getRowCountUpperPart() {
        return this.rowCountUpperPart;
    }
}

