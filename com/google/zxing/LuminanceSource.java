/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.InvertedLuminanceSource;

public abstract class LuminanceSource {
    private final int height;
    private final int width;

    public LuminanceSource(int n3, int n4) {
        this.width = n3;
        this.height = n4;
    }

    public LuminanceSource crop(int n3, int n4, int n7, int n8) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("This luminance source does not support cropping.");
        throw unsupportedOperationException;
    }

    public final int getHeight() {
        return this.height;
    }

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int var1, byte[] var2);

    public final int getWidth() {
        return this.width;
    }

    public LuminanceSource invert() {
        InvertedLuminanceSource invertedLuminanceSource = new InvertedLuminanceSource(this);
        return invertedLuminanceSource;
    }

    public boolean isCropSupported() {
        return false;
    }

    public boolean isRotateSupported() {
        return false;
    }

    public LuminanceSource rotateCounterClockwise() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
        throw unsupportedOperationException;
    }

    public LuminanceSource rotateCounterClockwise45() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
        throw unsupportedOperationException;
    }

    public final String toString() {
        int n3;
        int n4 = this.width;
        byte[] byArray = new byte[n4];
        int n7 = this.height;
        n4 = (n4 + 1) * n7;
        StringBuilder stringBuilder = new StringBuilder(n4);
        n4 = 0;
        for (n7 = 0; n7 < (n3 = this.height); ++n7) {
            int n8;
            byArray = this.getRow(n7, byArray);
            for (n3 = 0; n3 < (n8 = this.width); ++n3) {
                n8 = byArray[n3] & 0xFF;
                int n10 = 64;
                n8 = n8 < n10 ? 35 : (n8 < (n10 = 128) ? 43 : (n8 < (n10 = 192) ? 46 : 32));
                stringBuilder.append((char)n8);
            }
            n3 = 10;
            stringBuilder.append((char)n3);
        }
        return stringBuilder.toString();
    }
}

