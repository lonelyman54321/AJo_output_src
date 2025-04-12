/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder;

final class Codeword {
    private static final int BARCODE_ROW_UNKNOWN = 255;
    private final int bucket;
    private final int endX;
    private int rowNumber = -1;
    private final int startX;
    private final int value;

    public Codeword(int n3, int n4, int n7, int n8) {
        this.startX = n3;
        this.endX = n4;
        this.bucket = n7;
        this.value = n8;
    }

    public int getBucket() {
        return this.bucket;
    }

    public int getEndX() {
        return this.endX;
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    public int getStartX() {
        return this.startX;
    }

    public int getValue() {
        return this.value;
    }

    public int getWidth() {
        int n3 = this.endX;
        int n4 = this.startX;
        return n3 - n4;
    }

    public boolean hasValidRowNumber() {
        int n3 = this.rowNumber;
        return this.isValidRowNumber(n3);
    }

    public boolean isValidRowNumber(int n3) {
        int n4 = -1;
        return n3 != n4 && (n4 = this.bucket) == (n3 = n3 % 3 * 3);
    }

    public void setRowNumber(int n3) {
        this.rowNumber = n3;
    }

    public void setRowNumberAsRowIndicatorColumn() {
        int n3;
        int n4 = this.value / 30 * 3;
        this.rowNumber = n3 = this.bucket / 3 + n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.rowNumber;
        stringBuilder.append(n3);
        stringBuilder.append("|");
        n3 = this.value;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

