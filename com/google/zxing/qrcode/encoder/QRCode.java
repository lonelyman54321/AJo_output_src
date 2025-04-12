/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.encoder.ByteMatrix;

public final class QRCode {
    public static final int NUM_MASK_PATTERNS = 8;
    private ErrorCorrectionLevel ecLevel;
    private int maskPattern = -1;
    private ByteMatrix matrix;
    private Mode mode;
    private Version version;

    public static boolean isValidMaskPattern(int n3) {
        int n4;
        return n3 >= 0 && n3 < (n4 = 8);
    }

    public ErrorCorrectionLevel getECLevel() {
        return this.ecLevel;
    }

    public int getMaskPattern() {
        return this.maskPattern;
    }

    public ByteMatrix getMatrix() {
        return this.matrix;
    }

    public Mode getMode() {
        return this.mode;
    }

    public Version getVersion() {
        return this.version;
    }

    public void setECLevel(ErrorCorrectionLevel errorCorrectionLevel) {
        this.ecLevel = errorCorrectionLevel;
    }

    public void setMaskPattern(int n3) {
        this.maskPattern = n3;
    }

    public void setMatrix(ByteMatrix byteMatrix) {
        this.matrix = byteMatrix;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(200);
        stringBuilder.append("<<\n mode: ");
        Object object = this.mode;
        stringBuilder.append(object);
        stringBuilder.append("\n ecLevel: ");
        object = this.ecLevel;
        stringBuilder.append(object);
        stringBuilder.append("\n version: ");
        object = this.version;
        stringBuilder.append(object);
        stringBuilder.append("\n maskPattern: ");
        int n3 = this.maskPattern;
        stringBuilder.append(n3);
        object = this.matrix;
        if (object == null) {
            object = "\n matrix: null\n";
            stringBuilder.append((String)object);
        } else {
            stringBuilder.append("\n matrix:\n");
            object = this.matrix;
            stringBuilder.append(object);
        }
        stringBuilder.append(">>\n");
        return stringBuilder.toString();
    }
}

