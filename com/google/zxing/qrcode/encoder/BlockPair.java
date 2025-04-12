/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.encoder;

final class BlockPair {
    private final byte[] dataBytes;
    private final byte[] errorCorrectionBytes;

    public BlockPair(byte[] byArray, byte[] byArray2) {
        this.dataBytes = byArray;
        this.errorCorrectionBytes = byArray2;
    }

    public byte[] getDataBytes() {
        return this.dataBytes;
    }

    public byte[] getErrorCorrectionBytes() {
        return this.errorCorrectionBytes;
    }
}

