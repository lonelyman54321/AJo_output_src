/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.LuminanceSource;

public final class InvertedLuminanceSource
extends LuminanceSource {
    private final LuminanceSource delegate;

    public InvertedLuminanceSource(LuminanceSource luminanceSource) {
        int n3 = luminanceSource.getWidth();
        int n4 = luminanceSource.getHeight();
        super(n3, n4);
        this.delegate = luminanceSource;
    }

    public LuminanceSource crop(int n3, int n4, int n7, int n8) {
        LuminanceSource luminanceSource = this.delegate.crop(n3, n4, n7, n8);
        InvertedLuminanceSource invertedLuminanceSource = new InvertedLuminanceSource(luminanceSource);
        return invertedLuminanceSource;
    }

    public byte[] getMatrix() {
        byte[] byArray = this.delegate.getMatrix();
        int n3 = this.getWidth();
        int n4 = this.getHeight() * n3;
        byte[] byArray2 = new byte[n4];
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = byArray[i3] & 0xFF;
            byArray2[i3] = n7 = (int)((byte)(255 - n7));
        }
        return byArray2;
    }

    public byte[] getRow(int n3, byte[] byArray) {
        byte[] byArray2 = this.delegate.getRow(n3, byArray);
        int n4 = this.getWidth();
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7 = byArray2[i3] & 0xFF;
            byArray2[i3] = n7 = (int)((byte)(255 - n7));
        }
        return byArray2;
    }

    public LuminanceSource invert() {
        return this.delegate;
    }

    public boolean isCropSupported() {
        return this.delegate.isCropSupported();
    }

    public boolean isRotateSupported() {
        return this.delegate.isRotateSupported();
    }

    public LuminanceSource rotateCounterClockwise() {
        LuminanceSource luminanceSource = this.delegate.rotateCounterClockwise();
        InvertedLuminanceSource invertedLuminanceSource = new InvertedLuminanceSource(luminanceSource);
        return invertedLuminanceSource;
    }

    public LuminanceSource rotateCounterClockwise45() {
        LuminanceSource luminanceSource = this.delegate.rotateCounterClockwise45();
        InvertedLuminanceSource invertedLuminanceSource = new InvertedLuminanceSource(luminanceSource);
        return invertedLuminanceSource;
    }
}

