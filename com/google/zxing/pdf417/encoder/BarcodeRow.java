/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.encoder;

final class BarcodeRow {
    private int currentLocation;
    private final byte[] row;

    public BarcodeRow(int n3) {
        byte[] byArray = new byte[n3];
        this.row = byArray;
        this.currentLocation = 0;
    }

    private void set(int n3, boolean bl2) {
        byte by2;
        byte[] byArray = this.row;
        byArray[n3] = by2 = (byte)(bl2 ? 1 : 0);
    }

    public void addBar(boolean bl2, int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            int n7 = this.currentLocation;
            this.currentLocation = n4 = n7 + 1;
            this.set(n7, bl2);
        }
    }

    public byte[] getScaledRow(int n3) {
        byte[] byArray = this.row;
        int n4 = byArray.length * n3;
        byte[] byArray2 = new byte[n4];
        for (int i3 = 0; i3 < n4; ++i3) {
            byte by2;
            byte[] byArray3 = this.row;
            int n7 = i3 / n3;
            byArray2[i3] = by2 = byArray3[n7];
        }
        return byArray2;
    }

    public void set(int n3, byte by2) {
        this.row[n3] = by2;
    }
}

