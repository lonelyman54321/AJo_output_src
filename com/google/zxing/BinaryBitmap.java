/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;

public final class BinaryBitmap {
    private final Binarizer binarizer;
    private BitMatrix matrix;

    public BinaryBitmap(Binarizer object) {
        if (object != null) {
            this.binarizer = object;
            return;
        }
        object = new IllegalArgumentException("Binarizer must be non-null.");
        throw object;
    }

    public BinaryBitmap crop(int n3, int n4, int n7, int n8) {
        Object object = this.binarizer.getLuminanceSource().crop(n3, n4, n7, n8);
        object = this.binarizer.createBinarizer((LuminanceSource)object);
        BinaryBitmap binaryBitmap = new BinaryBitmap((Binarizer)object);
        return binaryBitmap;
    }

    public BitMatrix getBlackMatrix() {
        BitMatrix bitMatrix = this.matrix;
        if (bitMatrix == null) {
            this.matrix = bitMatrix = this.binarizer.getBlackMatrix();
        }
        return this.matrix;
    }

    public BitArray getBlackRow(int n3, BitArray bitArray) {
        return this.binarizer.getBlackRow(n3, bitArray);
    }

    public int getHeight() {
        return this.binarizer.getHeight();
    }

    public int getWidth() {
        return this.binarizer.getWidth();
    }

    public boolean isCropSupported() {
        return this.binarizer.getLuminanceSource().isCropSupported();
    }

    public boolean isRotateSupported() {
        return this.binarizer.getLuminanceSource().isRotateSupported();
    }

    public BinaryBitmap rotateCounterClockwise() {
        Object object = this.binarizer.getLuminanceSource().rotateCounterClockwise();
        object = this.binarizer.createBinarizer((LuminanceSource)object);
        BinaryBitmap binaryBitmap = new BinaryBitmap((Binarizer)object);
        return binaryBitmap;
    }

    public BinaryBitmap rotateCounterClockwise45() {
        Object object = this.binarizer.getLuminanceSource().rotateCounterClockwise45();
        object = this.binarizer.createBinarizer((LuminanceSource)object);
        BinaryBitmap binaryBitmap = new BinaryBitmap((Binarizer)object);
        return binaryBitmap;
    }

    public String toString() {
        BitMatrix bitMatrix;
        try {
            bitMatrix = this.getBlackMatrix();
        }
        catch (NotFoundException notFoundException) {
            return "";
        }
        return bitMatrix.toString();
    }
}

