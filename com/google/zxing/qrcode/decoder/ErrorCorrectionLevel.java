/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

public final class ErrorCorrectionLevel
extends Enum {
    private static final /* synthetic */ ErrorCorrectionLevel[] $VALUES;
    private static final ErrorCorrectionLevel[] FOR_BITS;
    public static final /* enum */ ErrorCorrectionLevel H;
    public static final /* enum */ ErrorCorrectionLevel L;
    public static final /* enum */ ErrorCorrectionLevel M;
    public static final /* enum */ ErrorCorrectionLevel Q;
    private final int bits;

    static {
        ErrorCorrectionLevel errorCorrectionLevel;
        ErrorCorrectionLevel errorCorrectionLevel2;
        ErrorCorrectionLevel errorCorrectionLevel3;
        ErrorCorrectionLevel errorCorrectionLevel4;
        int n3 = 1;
        L = errorCorrectionLevel4 = new ErrorCorrectionLevel("L", 0, n3);
        M = errorCorrectionLevel3 = new ErrorCorrectionLevel("M", n3, 0);
        int n4 = 2;
        int n7 = 3;
        Q = errorCorrectionLevel2 = new ErrorCorrectionLevel("Q", n4, n7);
        H = errorCorrectionLevel = new ErrorCorrectionLevel("H", n7, n4);
        int n8 = 4;
        ErrorCorrectionLevel[] errorCorrectionLevelArray = new ErrorCorrectionLevel[n8];
        errorCorrectionLevelArray[0] = errorCorrectionLevel4;
        errorCorrectionLevelArray[n3] = errorCorrectionLevel3;
        errorCorrectionLevelArray[n4] = errorCorrectionLevel2;
        errorCorrectionLevelArray[n7] = errorCorrectionLevel;
        $VALUES = errorCorrectionLevelArray;
        ErrorCorrectionLevel[] errorCorrectionLevelArray2 = new ErrorCorrectionLevel[n8];
        errorCorrectionLevelArray2[0] = errorCorrectionLevel3;
        errorCorrectionLevelArray2[n3] = errorCorrectionLevel4;
        errorCorrectionLevelArray2[n4] = errorCorrectionLevel;
        errorCorrectionLevelArray2[n7] = errorCorrectionLevel2;
        FOR_BITS = errorCorrectionLevelArray2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ErrorCorrectionLevel() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.bits = var3_2;
    }

    public static ErrorCorrectionLevel forBits(int n3) {
        ErrorCorrectionLevel[] errorCorrectionLevelArray;
        int n4;
        if (n3 >= 0 && n3 < (n4 = (errorCorrectionLevelArray = FOR_BITS).length)) {
            return errorCorrectionLevelArray[n3];
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public static ErrorCorrectionLevel valueOf(String string2) {
        return Enum.valueOf(ErrorCorrectionLevel.class, string2);
    }

    public static ErrorCorrectionLevel[] values() {
        return (ErrorCorrectionLevel[])$VALUES.clone();
    }

    public int getBits() {
        return this.bits;
    }
}

