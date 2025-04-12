/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.encoder;

import com.google.zxing.pdf417.encoder.BarcodeRow;
import java.lang.reflect.Array;

public final class BarcodeMatrix {
    private int currentRow;
    private final int height;
    private final BarcodeRow[] matrix;
    private final int width;

    public BarcodeMatrix(int n3, int n4) {
        BarcodeRow[] barcodeRowArray = new BarcodeRow[n3];
        this.matrix = barcodeRowArray;
        int n7 = barcodeRowArray.length;
        for (int i3 = 0; i3 < n7; ++i3) {
            BarcodeRow barcodeRow;
            BarcodeRow[] barcodeRowArray2 = this.matrix;
            int n8 = (n4 + 4) * 17 + 1;
            barcodeRowArray2[i3] = barcodeRow = new BarcodeRow(n8);
        }
        this.width = n4 *= 17;
        this.height = n3;
        this.currentRow = -1;
    }

    public BarcodeRow getCurrentRow() {
        BarcodeRow[] barcodeRowArray = this.matrix;
        int n3 = this.currentRow;
        return barcodeRowArray[n3];
    }

    public byte[][] getMatrix() {
        int n3 = 1;
        return this.getScaledMatrix(n3, n3);
    }

    public byte[][] getScaledMatrix(int n3, int n4) {
        int n7 = this.height * n4;
        int n8 = this.width * n3;
        int[] nArray = new int[2];
        int n10 = 1;
        nArray[n10] = n8;
        nArray[0] = n7;
        byte[][] byArray = (byte[][])Array.newInstance(Byte.TYPE, nArray);
        int n14 = this.height * n4;
        for (n8 = 0; n8 < n14; ++n8) {
            int n15 = n14 - n8 - n10;
            Object[] objectArray = this.matrix;
            int n16 = n8 / n4;
            objectArray = objectArray[n16].getScaledRow(n3);
            byArray[n15] = (byte[])objectArray;
        }
        return byArray;
    }

    public void set(int n3, int n4, byte by2) {
        this.matrix[n4].set(n3, by2);
    }

    public void startRow() {
        int n3;
        this.currentRow = n3 = this.currentRow + 1;
    }
}

